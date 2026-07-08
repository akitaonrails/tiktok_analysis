package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.RemoteException;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kKS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ActionModeCallbackC1315180kKS extends AndroidView implements ActionMode.Callback {
    public static WeakReference<ActionModeCallbackC1315180kKS> sWeakSelectingAndroidText;
    public ActionMode mActionMode;
    public RunnableC1315190kKT mCheckForLongPress;
    public int mDefaultHandlePlatformLength;
    public boolean mEnableCustomContextMenu;
    public boolean mEnableCustomTextSelection;
    public boolean mEnableTextSelection;
    public final PointF mEndHandlerPos;
    public int mHandleSize;
    public boolean mHasImage;
    public Paint mHighlightPaint;
    public Path mHighlightPath;
    public boolean mIsAdjustEndPos;
    public boolean mIsAdjustStartPos;
    public boolean mIsBindSelectionChange;
    public boolean mIsForward;
    public boolean mIsInSelection;
    public boolean mIsJustify;
    public boolean mIsShowEndHandle;
    public boolean mIsShowStartHandle;
    public int mLastSelectEnd;
    public int mLastSelectStart;
    public boolean mNeedDrawStroke;
    public CharSequence mOriginText;
    public int mOverflow;
    public Picture mOverflowPicture;
    public boolean mOverflowPictureDirty;
    public int mSelectEnd;
    public final PointF mSelectEndPos;
    public int mSelectStart;
    public final PointF mSelectStartPos;
    public Drawable mSelectionLeftCursor;
    public Drawable mSelectionRightCursor;
    public boolean mShouldResponseMove;
    public int mSign;
    public final PointF mStartHandlerPos;
    public Layout mTextLayout;
    public int mTextSelectionColor;
    public int mTextSelectionHandleColor;
    public final ArrayList<RectF> mTextServiceSelectionBoxes;
    public int mTextServiceSelectionEnd;
    public int mTextServiceSelectionStart;
    public int mTextServiceTextLength;
    public PointF mTextTranslateOffset;
    public C1316780kN2 mTextUpdateBundle;
    public InterfaceC1312730kGV mTextraPage;

    private void resetSelectionState() {
        this.mLastSelectEnd = -1;
        this.mLastSelectStart = -1;
        this.mSelectEnd = -1;
        this.mSelectStart = -1;
        this.mShouldResponseMove = false;
        this.mIsAdjustEndPos = false;
        this.mIsAdjustStartPos = false;
        this.mIsInSelection = false;
        this.mIsShowEndHandle = true;
        this.mIsShowStartHandle = true;
        this.mSelectStartPos.set(-1.0f, -1.0f);
        this.mSelectEndPos.set(-1.0f, -1.0f);
        invalidateTextServiceSelectionBoxes();
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
    }

    public void setTextGradient(ReadableArray readableArray) {
    }

    private void clearOtherSelection() {
        ActionModeCallbackC1315180kKS actionModeCallbackC1315180kKS;
        if (this.mEnableCustomTextSelection) {
            return;
        }
        WeakReference<ActionModeCallbackC1315180kKS> weakReference = sWeakSelectingAndroidText;
        if (weakReference != null && (actionModeCallbackC1315180kKS = weakReference.get()) != null && actionModeCallbackC1315180kKS != this) {
            actionModeCallbackC1315180kKS.clearSelection();
            actionModeCallbackC1315180kKS.invalidate();
        }
        sWeakSelectingAndroidText = new WeakReference<>(this);
    }

    private void dispatchDetachImageSpan() {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1315450kKt abstractC1315450kKt : (AbstractC1315450kKt[]) spanned.getSpans(0, spanned.length(), AbstractC1315450kKt.class)) {
                abstractC1315450kKt.LJFF();
                abstractC1315450kKt.LJIIIZ(null);
            }
        }
    }

    private void drawOverflowPicture() {
        if (!this.mOverflowPictureDirty || this.mTextLayout == null) {
            return;
        }
        Picture picture = this.mOverflowPicture;
        if (picture == null) {
            this.mOverflowPicture = new Picture();
        } else {
            picture.endRecording();
        }
        Canvas canvasBeginRecording = this.mOverflowPicture.beginRecording(this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        canvasBeginRecording.save();
        if (getClipBounds() != null) {
            canvasBeginRecording.clipRect(getClipBounds());
        }
        drawTextOnCanvas(canvasBeginRecording);
        if (this.mNeedDrawStroke) {
            C1316710kMv.LJI(canvasBeginRecording, this.mTextLayout);
        }
        canvasBeginRecording.restore();
        this.mOverflowPicture.endRecording();
        this.mOverflowPictureDirty = false;
    }

    private boolean hasTextSelectionContent() {
        if (this.mTextLayout == null) {
            return this.mTextraPage != null && this.mTextServiceTextLength > 0;
        }
        return true;
    }

    private void hideToolbar() {
        ActionMode actionMode;
        if (this.mEnableCustomContextMenu || (actionMode = this.mActionMode) == null) {
            return;
        }
        actionMode.finish();
        this.mActionMode = null;
    }

    private void invalidateTextServiceSelectionBoxes() {
        this.mTextServiceSelectionBoxes.clear();
        this.mTextServiceSelectionStart = -1;
        this.mTextServiceSelectionEnd = -1;
    }

    private void onSelectionChange() {
        if (this.mIsBindSelectionChange && (getContext() instanceof s)) {
            C1289960jfm c1289960jfm = new C1289960jfm(this.mSign, "selectionchange");
            c1289960jfm.LIZIZ(Integer.valueOf(this.mSelectStart), "start");
            c1289960jfm.LIZIZ(Integer.valueOf(this.mSelectEnd), "end");
            c1289960jfm.LIZIZ(this.mIsForward ? "forward" : "backward", "direction");
            ((s) getContext()).LLIZ.LIZIZ(c1289960jfm);
        }
    }

    private void performCopy() throws Throwable {
        int i;
        if (this.mTextraPage != null) {
            String selectedText = getSelectedText();
            if (!selectedText.isEmpty()) {
                copyToClipboard(selectedText);
            }
        } else {
            int i2 = this.mSelectStart;
            if (i2 >= 0 && (i = this.mSelectEnd) > i2 && i <= this.mTextLayout.getText().length()) {
                copyToClipboard(this.mTextLayout.getText().subSequence(this.mSelectStart, this.mSelectEnd));
            }
        }
        clearSelection();
    }

    private void performSelectAll() {
        if (this.mTextraPage == null) {
            updateSelectionRange(0, this.mTextLayout.getText().length());
            updateSelectStartEnd();
            return;
        }
        int i = this.mTextServiceTextLength;
        if (i <= 0) {
            return;
        }
        updateSelectionRange(0, i);
        updateSelectStartEnd();
    }

    private void removeCheckLongPressCallback() {
        RunnableC1315190kKT runnableC1315190kKT = this.mCheckForLongPress;
        if (runnableC1315190kKT == null) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(this, runnableC1315190kKT);
        this.mCheckForLongPress = null;
    }

    private void showToolbar() {
        if (this.mEnableCustomContextMenu || !hasTextSelectionContent()) {
            return;
        }
        startActionMode(this, 1);
    }

    private void updateSelectStartEnd() {
        int iMin = Math.min(this.mSelectStart, this.mSelectEnd);
        this.mSelectEnd = Math.max(this.mSelectStart, this.mSelectEnd);
        this.mSelectStart = iMin;
        onSelectionChange();
        if (this.mTextraPage != null) {
            updateSelectionHandlePositionFromBoxes(this.mSelectStart, this.mSelectEnd);
        } else {
            this.mSelectStartPos.set(getBottomPositionForOffset(this.mSelectStart, true));
            this.mSelectEndPos.set(getBottomPositionForOffset(this.mSelectEnd, false));
        }
    }

    private void updateSelectionStyle() {
        Drawable drawable = this.mSelectionLeftCursor;
        int i = this.mHandleSize;
        drawable.setBounds(0, 0, i, i);
        Drawable drawable2 = this.mSelectionRightCursor;
        int i2 = this.mHandleSize;
        drawable2.setBounds(0, 0, i2, i2);
        this.mSelectionLeftCursor.setTint(this.mTextSelectionHandleColor);
        this.mSelectionRightCursor.setTint(this.mTextSelectionHandleColor);
        this.mHighlightPaint.setColor(this.mTextSelectionColor);
    }

    public ArrayList<Float>[] getHandlesInfo() {
        if (!this.mIsInSelection) {
            return new ArrayList[0];
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        arrayList.add(Float.valueOf(this.mStartHandlerPos.x));
        arrayList.add(Float.valueOf(this.mStartHandlerPos.y));
        arrayList.add(Float.valueOf(50.0f));
        ArrayList<Float> arrayList2 = new ArrayList<>();
        arrayList2.add(Float.valueOf(this.mEndHandlerPos.x));
        arrayList2.add(Float.valueOf(this.mEndHandlerPos.y));
        arrayList2.add(Float.valueOf(50.0f));
        return new ArrayList[]{arrayList, arrayList2};
    }

    public String getSelectedText() {
        int i;
        int i2;
        int i3;
        int i4;
        InterfaceC1312730kGV interfaceC1312730kGV = this.mTextraPage;
        if (interfaceC1312730kGV != null && (i3 = this.mSelectStart) >= 0 && (i4 = this.mSelectEnd) > i3) {
            return interfaceC1312730kGV.va(i3, i4);
        }
        Layout layout = this.mTextLayout;
        return (layout == null || (i = this.mSelectStart) < 0 || (i2 = this.mSelectEnd) <= 0 || i2 <= i || i2 > layout.getText().length()) ? "" : this.mTextLayout.getText().subSequence(this.mSelectStart, this.mSelectEnd).toString();
    }

    public CharSequence getText() {
        Layout layout = this.mTextLayout;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    public boolean hasTextraPage() {
        return this.mTextraPage != null;
    }

    public void release() {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            AbstractC1315450kKt.LJIIIIZZ((Spanned) getText(), null);
        }
    }

    private void clearSelection() {
        removeCheckLongPressCallback();
        this.mIsAdjustStartPos = false;
        this.mIsAdjustEndPos = false;
        this.mSelectStartPos.set(-1.0f, -1.0f);
        this.mSelectEndPos.set(-1.0f, -1.0f);
        this.mSelectStart = -1;
        this.mSelectEnd = -1;
        this.mLastSelectStart = -1;
        this.mLastSelectEnd = -1;
        invalidateTextServiceSelectionBoxes();
        if (this.mIsInSelection) {
            onSelectionChange();
        }
        this.mIsInSelection = false;
        updateSelectionRange(this.mSelectStart, this.mSelectEnd);
        hideToolbar();
        this.mShouldResponseMove = false;
        this.mIsShowEndHandle = true;
        this.mIsShowStartHandle = true;
        Path path = this.mHighlightPath;
        if (path != null) {
            path.reset();
        }
    }

    private float getTextDrawOffsetX() {
        float paddingLeft = getPaddingLeft();
        PointF pointF = this.mTextTranslateOffset;
        return paddingLeft + (pointF != null ? pointF.x : 0.0f);
    }

    private float getTextDrawOffsetY() {
        float paddingTop = getPaddingTop();
        PointF pointF = this.mTextTranslateOffset;
        return paddingTop + (pointF != null ? pointF.y : 0.0f);
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            AbstractC1315450kKt.LJIIIIZZ((Spanned) getText(), this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dispatchDetachImageSpan();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1315450kKt abstractC1315450kKt : (AbstractC1315450kKt[]) spanned.getSpans(0, spanned.length(), AbstractC1315450kKt.class)) {
                abstractC1315450kKt.LJI();
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1315450kKt abstractC1315450kKt : (AbstractC1315450kKt[]) spanned.getSpans(0, spanned.length(), AbstractC1315450kKt.class)) {
                abstractC1315450kKt.LJII();
            }
        }
    }

    public CharSequence getOriginText() {
        return this.mOriginText;
    }

    public Layout getTextLayout() {
        return this.mTextLayout;
    }

    public ActionModeCallbackC1315180kKS(Context context) {
        super(context);
        this.mIsForward = true;
        this.mSelectStart = -1;
        this.mSelectEnd = -1;
        this.mLastSelectStart = -1;
        this.mLastSelectEnd = -1;
        this.mSelectStartPos = new PointF(-1.0f, -1.0f);
        this.mSelectEndPos = new PointF(-1.0f, -1.0f);
        this.mStartHandlerPos = new PointF(-1.0f, -1.0f);
        this.mEndHandlerPos = new PointF(-1.0f, -1.0f);
        this.mIsInSelection = false;
        this.mIsAdjustStartPos = false;
        this.mIsAdjustEndPos = false;
        this.mCheckForLongPress = null;
        this.mShouldResponseMove = false;
        this.mIsShowStartHandle = true;
        this.mIsShowEndHandle = true;
        this.mTextServiceSelectionBoxes = new ArrayList<>();
        this.mTextServiceSelectionStart = -1;
        this.mTextServiceSelectionEnd = -1;
        this.mOverflowPicture = new Picture();
        this.mOverflow = 0;
        this.mOverflowPictureDirty = true;
        setFocusable(true);
        setWillNotDraw(false);
        this.mTextSelectionColor = 1714664933;
        this.mTextSelectionHandleColor = -16614661;
        int iRound = Math.round(((s) context).LLJJJ.density * 15.0f);
        this.mDefaultHandlePlatformLength = iRound;
        this.mHandleSize = iRound;
    }

    private void copyToClipboard(CharSequence charSequence) throws Throwable {
        ClipData clipDataNewPlainText = ClipData.newPlainText("Lynx-clipboard", charSequence);
        InterfaceC1289280jeg interfaceC1289280jeg = (InterfaceC1289280jeg) C1285920jZG.LIZJ().LIZ(InterfaceC1289280jeg.class);
        if (interfaceC1289280jeg != null) {
            try {
                interfaceC1289280jeg.LIZ(clipDataNewPlainText);
                return;
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("A RemoteException was encountered while calling systemInvokeService. ");
                sbLIZ.append(e.getMessage());
                LynxLog.e("AndroidText", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        INVOKEVIRTUAL_com_lynx_tasm_behavior_ui_text_AndroidText_com_ss_android_ugc_aweme_lancet_ClipboardLancet_setPrimaryClip((ClipboardManager) getContext().getSystemService(ClipboardManager.class), clipDataNewPlainText);
    }

    private void drawHighlight(Canvas canvas) {
        if (this.mIsInSelection && this.mHighlightPath != null && this.mHighlightPaint != null) {
            int iMin = Math.min(this.mSelectStart, this.mSelectEnd);
            int iMax = Math.max(this.mSelectStart, this.mSelectEnd);
            if (this.mTextraPage != null) {
                ArrayList<RectF> textServiceSelectionBoxes = getTextServiceSelectionBoxes(iMin, iMax);
                for (int i = 0; i < textServiceSelectionBoxes.size(); i++) {
                    canvas.drawRect((RectF) ListProtector.get(textServiceSelectionBoxes, i), this.mHighlightPaint);
                }
                return;
            }
            if (this.mTextLayout != null) {
                this.mHighlightPath.reset();
                this.mTextLayout.getSelectionPath(iMin, iMax, this.mHighlightPath);
                if (!this.mHighlightPath.isEmpty()) {
                    canvas.drawPath(this.mHighlightPath, this.mHighlightPaint);
                }
            }
        }
    }

    private void drawHighlightWithTextOffset(Canvas canvas) {
        canvas.save();
        canvas.translate(getTextDrawOffsetX(), getTextDrawOffsetY());
        drawHighlight(canvas);
        canvas.restore();
    }

    private void drawSelectEndCursor(Canvas canvas) {
        canvas.save();
        canvas.translate(this.mEndHandlerPos.x - (this.mSelectionRightCursor.getBounds().width() / 2.0f), this.mEndHandlerPos.y - (this.mSelectionRightCursor.getBounds().height() / 2.0f));
        this.mSelectionRightCursor.draw(canvas);
        canvas.restore();
    }

    private void drawSelectHandle(Canvas canvas) {
        if (this.mIsShowStartHandle) {
            drawSelectStartCursor(canvas);
        }
        if (this.mIsShowEndHandle) {
            drawSelectEndCursor(canvas);
        }
    }

    private void drawSelectStartCursor(Canvas canvas) {
        canvas.save();
        canvas.translate(this.mStartHandlerPos.x - (this.mSelectionLeftCursor.getBounds().width() / 2.0f), this.mStartHandlerPos.y - (this.mSelectionLeftCursor.getBounds().height() / 2.0f));
        this.mSelectionLeftCursor.draw(canvas);
        canvas.restore();
    }

    private void drawText(Canvas canvas) {
        drawHighlight(canvas);
        drawTextOnCanvas(canvas);
        if (this.mNeedDrawStroke) {
            C1316710kMv.LJI(canvas, this.mTextLayout);
        }
        C1316710kMv.LJ(canvas, this.mTextLayout);
    }

    private void drawTextOnCanvas(Canvas canvas) {
        if (this.mIsJustify && Build.VERSION.SDK_INT < 26) {
            C1316710kMv.LJFF(canvas, this.mTextLayout, (getWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.mTextLayout.draw(canvas);
        }
    }

    private void drawTextServiceSelectHandle(Canvas canvas) {
        if (this.mIsInSelection && this.mSelectionLeftCursor != null && this.mSelectionRightCursor != null) {
            canvas.save();
            canvas.translate(getTextDrawOffsetX(), getTextDrawOffsetY());
            drawSelectHandle(canvas);
            canvas.restore();
        }
    }

    private PointF getCenterPositionForOffset(int i) {
        if (i >= 0 && i <= this.mTextLayout.getText().length()) {
            int lineForOffset = this.mTextLayout.getLineForOffset(i);
            return new PointF(this.mTextLayout.getPrimaryHorizontal(i), (this.mTextLayout.getLineTop(lineForOffset) + this.mTextLayout.getLineBottom(lineForOffset)) / 2.0f);
        }
        return new PointF(0.0f, 0.0f);
    }

    private int getLineAtCoordinate(float f) {
        return this.mTextLayout.getLineForVertical((int) Math.min(getHeight() - 1, Math.max(0.0f, f)));
    }

    private void initSelectionCursor(Context context) {
        this.mSelectionLeftCursor = context.getResources().getDrawable(R.drawable.clg);
        this.mSelectionRightCursor = context.getResources().getDrawable(R.drawable.clh);
        Paint paint = new Paint();
        this.mHighlightPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mHighlightPath = new Path();
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Path path;
        super.dispatchDraw(canvas);
        if (this.mTextraPage != null) {
            drawTextServiceSelectHandle(canvas);
            return;
        }
        if (super.getRenderer() == null && this.mIsInSelection && (path = this.mHighlightPath) != null && !path.isEmpty()) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.mTextTranslateOffset.x, getPaddingTop() + this.mTextTranslateOffset.y);
            drawSelectHandle(canvas);
            canvas.restore();
        }
    }

    public Layout generateTextLayout(C1316780kN2 c1316780kN2) {
        return c1316780kN2.LIZJ;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (!C1289620jfE.LIZIZ()) {
            return;
        }
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1315450kKt abstractC1315450kKt : (AbstractC1315450kKt[]) spanned.getSpans(0, spanned.length(), AbstractC1315450kKt.class)) {
                if (abstractC1315450kKt.LIZJ() == drawable) {
                    invalidate();
                    this.mOverflowPictureDirty = true;
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
    public void onDraw(Canvas canvas) {
        if (super.getRenderer() != null) {
            super.getRenderer().LJ(canvas);
            if (this.mTextraPage != null) {
                drawHighlightWithTextOffset(canvas);
                return;
            }
            return;
        }
        if (this.mTextraPage != null) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.save();
            if (this.mOverflow == 0) {
                canvas.clipRect(paddingLeft, paddingTop, getWidth() - paddingRight, getHeight() - paddingBottom);
            }
            canvas.translate(paddingLeft, paddingTop);
            drawHighlight(canvas);
            this.mTextraPage.xa(canvas, this);
            canvas.restore();
            return;
        }
        if (this.mTextLayout != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.mTextTranslateOffset.x, getPaddingTop() + this.mTextTranslateOffset.y);
            if (this.mOverflow != 0) {
                drawHighlight(canvas);
                drawOverflowPicture();
                canvas.drawPicture(this.mOverflowPicture);
            } else {
                drawText(canvas);
            }
            canvas.restore();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (hasTextSelectionContent() && this.mEnableTextSelection && !this.mEnableCustomTextSelection) {
            float x = motionEvent.getX() - getPaddingLeft();
            float y = motionEvent.getY() - getPaddingTop();
            if (motionEvent.getAction() == 0) {
                performBeginSelection(x, y);
            } else if (motionEvent.getAction() == 2) {
                performMovingSelection(x, y);
            } else if (motionEvent.getAction() == 1 || this.mShouldResponseMove) {
                performEndSelection(x, y);
            } else {
                removeCheckLongPressCallback();
            }
            invalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCustomContextMenu(boolean z) {
        this.mEnableCustomContextMenu = z;
    }

    public void setCustomTextSelection(boolean z) {
        this.mEnableCustomTextSelection = z;
    }

    public void setEnableTextSelection(boolean z) {
        this.mEnableTextSelection = z;
    }

    public void setOverflow(int i) {
        this.mOverflow = i;
    }

    public void setTextBundle(C1316780kN2 c1316780kN2) {
        dispatchDetachImageSpan();
        this.mTextraPage = null;
        this.mTextServiceTextLength = 0;
        this.mTextUpdateBundle = c1316780kN2;
        this.mTextLayout = generateTextLayout(c1316780kN2);
        this.mTextTranslateOffset = c1316780kN2.LJ;
        boolean z = c1316780kN2.LIZ;
        this.mHasImage = z;
        this.mNeedDrawStroke = c1316780kN2.LJFF;
        this.mIsJustify = c1316780kN2.LIZIZ;
        this.mOriginText = c1316780kN2.LJI;
        if (z && (getText() instanceof Spanned)) {
            AbstractC1315450kKt.LJIIIIZZ((Spanned) getText(), this);
        }
        if (this.mIsInSelection) {
            clearSelection();
        } else {
            resetSelectionState();
        }
        setContentDescription(this.mTextLayout.getText());
        invalidate();
        this.mOverflowPictureDirty = true;
    }

    public void setTextGradient(String str) {
        LynxLog.e("text-gradient", "setTextGradient(String) is deprecated, call this function has no effect");
    }

    public void updateSelectionBackgroundColor(int i) {
        if (i == 0) {
            i = 1714664933;
        }
        this.mTextSelectionColor = i;
    }

    public void updateSelectionHandleColor(int i) {
        if (i == 0) {
            i = -16614661;
        }
        this.mTextSelectionHandleColor = i;
    }

    public void updateSelectionHandleSize(int i) {
        if (i <= 0) {
            i = this.mDefaultHandlePlatformLength;
        }
        this.mHandleSize = i;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mHasImage && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (AbstractC1315450kKt abstractC1315450kKt : (AbstractC1315450kKt[]) spanned.getSpans(0, spanned.length(), AbstractC1315450kKt.class)) {
                if (abstractC1315450kKt.LIZJ() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void setTextBundle(InterfaceC1312730kGV interfaceC1312730kGV) {
        int iUa;
        dispatchDetachImageSpan();
        this.mTextraPage = interfaceC1312730kGV;
        if (interfaceC1312730kGV != null) {
            iUa = interfaceC1312730kGV.ua();
        } else {
            iUa = 0;
        }
        this.mTextServiceTextLength = iUa;
        this.mTextUpdateBundle = null;
        this.mTextLayout = null;
        this.mTextTranslateOffset = new PointF();
        this.mHasImage = false;
        this.mNeedDrawStroke = false;
        this.mIsJustify = false;
        this.mOriginText = null;
        if (this.mIsInSelection) {
            clearSelection();
        } else {
            resetSelectionState();
        }
        setContentDescription(null);
        invalidate();
        this.mOverflowPictureDirty = true;
    }

    public static void INVOKEVIRTUAL_com_lynx_tasm_behavior_ui_text_AndroidText_com_ss_android_ugc_aweme_lancet_ClipboardLancet_setPrimaryClip(ClipboardManager clipboardManager, ClipData clipData) throws Throwable {
        try {
            C2204961BRm.LJJIJIIJI(clipboardManager, clipData, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoeza0QCklptOP1BkAika5MEvQXyh", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().log("ClipboardLancet", e.getLocalizedMessage());
        }
    }

    private void adjustEndPosition(float f, float f2) {
        this.mIsAdjustEndPos = true;
        int offsetForPosition = getOffsetForPosition(f, f2);
        if (offsetForPosition < 0) {
            return;
        }
        if (offsetForPosition == this.mSelectStart) {
            if ((this.mTextraPage == null && offsetForPosition == this.mTextLayout.getText().length()) || (f < this.mSelectStartPos.x && offsetForPosition > 0)) {
                offsetForPosition--;
            } else {
                offsetForPosition++;
            }
        }
        updateSelectionRange(this.mSelectStart, offsetForPosition);
    }

    private void adjustStartPosition(float f, float f2) {
        this.mIsAdjustStartPos = true;
        int offsetForPosition = getOffsetForPosition(f, f2);
        if (offsetForPosition < 0) {
            return;
        }
        if (this.mSelectEnd == offsetForPosition) {
            if ((this.mTextraPage == null && offsetForPosition == this.mTextLayout.getText().length()) || (f < this.mSelectEndPos.x && offsetForPosition > 0)) {
                offsetForPosition--;
            } else {
                offsetForPosition++;
            }
        }
        updateSelectionRange(offsetForPosition, this.mSelectEnd);
    }

    private PointF getBottomPositionForOffset(int i, boolean z) {
        float primaryHorizontal = this.mTextLayout.getPrimaryHorizontal(i);
        int lineForOffset = this.mTextLayout.getLineForOffset(i);
        float lineBottom = this.mTextLayout.getLineBottom(lineForOffset);
        if (i == this.mTextLayout.getLineStart(lineForOffset) && lineForOffset > 0 && !z) {
            primaryHorizontal = this.mTextLayout.getWidth();
            lineBottom = this.mTextLayout.getLineBottom(lineForOffset - 1);
        }
        return new PointF(primaryHorizontal, lineBottom);
    }

    private int getOffsetAtCoordinate(int i, float f) {
        int iU3 = C786410Ut5.U3(this.mTextLayout, i, Math.min(getWidth() - 1, Math.max(0.0f, f)));
        float secondaryHorizontal = this.mTextLayout.getSecondaryHorizontal(iU3);
        if (f > ((double) secondaryHorizontal) + (((double) (this.mTextLayout.getLineRight(i) - secondaryHorizontal)) / 2.0d)) {
            return this.mTextLayout.getLineEnd(i);
        }
        return iU3;
    }

    private ArrayList<RectF> getTextServiceSelectionBoxes(int i, int i2) {
        if (i <= i2 && i >= 0 && this.mTextraPage != null) {
            if (this.mTextServiceSelectionStart == i && this.mTextServiceSelectionEnd == i2) {
                return this.mTextServiceSelectionBoxes;
            }
            this.mTextServiceSelectionBoxes.clear();
            this.mTextServiceSelectionStart = i;
            this.mTextServiceSelectionEnd = i2;
            float[] fArrWa = this.mTextraPage.wa(i, i2);
            if (fArrWa != null && fArrWa.length % 4 == 0) {
                for (int i3 = 0; i3 < fArrWa.length; i3 += 4) {
                    ArrayList<RectF> arrayList = this.mTextServiceSelectionBoxes;
                    float f = fArrWa[i3];
                    float f2 = fArrWa[i3 + 1];
                    arrayList.add(new RectF(f, f2, fArrWa[i3 + 2] + f, fArrWa[i3 + 3] + f2));
                }
                return this.mTextServiceSelectionBoxes;
            }
            return this.mTextServiceSelectionBoxes;
        }
        invalidateTextServiceSelectionBoxes();
        return this.mTextServiceSelectionBoxes;
    }

    private void performBeginSelection(float f, float f2) {
        hideToolbar();
        if (this.mIsInSelection) {
            this.mShouldResponseMove = true;
            if (distanceBetweenPoints(this.mStartHandlerPos, f, f2) < 50.0d) {
                adjustStartPosition(f, f2);
                requestDisallowInterceptTouchEvent(true);
            } else if (distanceBetweenPoints(this.mEndHandlerPos, f, f2) < 50.0d) {
                adjustEndPosition(f, f2);
                requestDisallowInterceptTouchEvent(true);
            } else {
                this.mShouldResponseMove = false;
            }
        }
        if (!this.mIsAdjustEndPos && !this.mIsAdjustStartPos) {
            removeCheckLongPressCallback();
            this.mCheckForLongPress = new RunnableC1315190kKT(this, f, f2);
            HandlerHook.viewPostDelay(this, this.mCheckForLongPress, ViewConfiguration.getLongPressTimeout());
        }
    }

    private void performEndSelection(float f, float f2) {
        requestDisallowInterceptTouchEvent(false);
        if (!this.mIsInSelection) {
            removeCheckLongPressCallback();
            return;
        }
        boolean z = this.mIsAdjustEndPos;
        if (!z && !this.mIsAdjustStartPos) {
            clearSelection();
            return;
        }
        if (this.mIsAdjustStartPos) {
            adjustStartPosition(f, f2);
            updateSelectStartEnd();
        } else if (z) {
            adjustEndPosition(f, f2);
            updateSelectStartEnd();
        }
        showToolbar();
        this.mIsAdjustStartPos = false;
        this.mIsAdjustEndPos = false;
    }

    private void performMovingSelection(float f, float f2) {
        RunnableC1315190kKT runnableC1315190kKT = this.mCheckForLongPress;
        if (runnableC1315190kKT != null && (Math.abs(f - runnableC1315190kKT.LL) > 1.0f || Math.abs(f2 - this.mCheckForLongPress.LLILLJJLI) > 1.0f)) {
            removeCheckLongPressCallback();
        }
        if (this.mIsAdjustStartPos) {
            adjustStartPosition(f, f2);
        } else {
            if (!this.mIsAdjustEndPos) {
                return;
            }
            adjustEndPosition(f, f2);
        }
    }

    private void updateSelectionHandlePositionFromBoxes(int i, int i2) {
        ArrayList<RectF> textBoundingBoxes;
        if (this.mTextraPage != null) {
            textBoundingBoxes = getTextServiceSelectionBoxes(i, i2);
        } else {
            textBoundingBoxes = getTextBoundingBoxes(i, i2);
        }
        if (textBoundingBoxes.isEmpty()) {
            return;
        }
        RectF rectF = (RectF) ListProtector.get(textBoundingBoxes, 0);
        RectF rectF2 = (RectF) ListProtector.get(textBoundingBoxes, textBoundingBoxes.size() - 1);
        this.mSelectStartPos.set(rectF.left, rectF.bottom);
        this.mSelectEndPos.set(rectF2.right, rectF2.bottom);
        this.mStartHandlerPos.set(this.mSelectStartPos.x - (this.mSelectionLeftCursor.getBounds().width() / 2.0f), this.mSelectStartPos.y + (this.mSelectionLeftCursor.getBounds().height() / 2.0f));
        this.mEndHandlerPos.set(this.mSelectEndPos.x + (this.mSelectionRightCursor.getBounds().width() / 2.0f), this.mSelectEndPos.y + (this.mSelectionRightCursor.getBounds().height() / 2.0f));
    }

    private void updateSelectionRange(int i, int i2) {
        boolean z;
        int i3;
        if (this.mSelectionLeftCursor == null) {
            initSelectionCursor(getContext());
        }
        updateSelectionStyle();
        int i4 = this.mLastSelectStart;
        if (i4 != -1 ? i4 < i || this.mLastSelectEnd < i2 : i2 > i) {
            z = true;
        } else {
            z = false;
        }
        this.mIsForward = z;
        this.mLastSelectStart = this.mSelectStart;
        this.mLastSelectEnd = this.mSelectEnd;
        this.mSelectStart = i;
        this.mSelectEnd = i2;
        if (this.mTextraPage != null) {
            if (i >= 0 && i2 >= 0) {
                updateSelectionHandlePositionFromBoxes(Math.min(i, i2), Math.max(this.mSelectStart, this.mSelectEnd));
                clearOtherSelection();
                return;
            }
            return;
        }
        if (i >= 0 && i <= this.mTextLayout.getText().length() && (i3 = this.mSelectEnd) >= 0 && i3 <= this.mTextLayout.getText().length()) {
            if (this.mTextLayout.getText() instanceof Spannable) {
                Selection.setSelection((Spannable) this.mTextLayout.getText(), Math.min(this.mSelectStart, this.mSelectEnd), Math.max(this.mSelectStart, this.mSelectEnd));
            }
            this.mSelectStartPos.set(getBottomPositionForOffset(Math.min(this.mSelectStart, this.mSelectEnd), true));
            this.mSelectEndPos.set(getBottomPositionForOffset(Math.max(this.mSelectStart, this.mSelectEnd), false));
            this.mStartHandlerPos.set(this.mSelectStartPos.x - (this.mSelectionLeftCursor.getBounds().width() / 2.0f), this.mSelectStartPos.y + (this.mSelectionLeftCursor.getBounds().height() / 2.0f));
            this.mEndHandlerPos.set(this.mSelectEndPos.x + (this.mSelectionRightCursor.getBounds().width() / 2.0f), this.mSelectEndPos.y + (this.mSelectionRightCursor.getBounds().height() / 2.0f));
            clearOtherSelection();
            return;
        }
        if (!(this.mTextLayout.getText() instanceof Spannable)) {
            return;
        }
        Selection.removeSelection((Spannable) this.mTextLayout.getText());
    }

    public int getOffsetForPosition(float f, float f2) {
        InterfaceC1312730kGV interfaceC1312730kGV = this.mTextraPage;
        if (interfaceC1312730kGV != null) {
            return interfaceC1312730kGV.za(f, f2);
        }
        if (this.mTextLayout == null) {
            return -1;
        }
        return getOffsetAtCoordinate(getLineAtCoordinate(f2), f);
    }

    public ArrayList<RectF> getTextBoundingBoxes(int i, int i2) {
        ArrayList<RectF> arrayList = new ArrayList<>();
        if (i <= i2 && i >= 0) {
            if (this.mTextraPage != null) {
                return new ArrayList<>(getTextServiceSelectionBoxes(i, i2));
            }
            Layout layout = this.mTextLayout;
            if (layout != null && layout.getText().length() >= i2) {
                if (i == i2) {
                    int lineForOffset = this.mTextLayout.getLineForOffset(i);
                    arrayList.add(new RectF(0.0f, 0.0f, 0.0f, this.mTextLayout.getLineBottom(lineForOffset) - this.mTextLayout.getLineTop(lineForOffset)));
                    return arrayList;
                }
                int lineForOffset2 = this.mTextLayout.getLineForOffset(i);
                int lineForOffset3 = this.mTextLayout.getLineForOffset(i2);
                for (int i3 = lineForOffset2; i3 <= lineForOffset3; i3++) {
                    Rect rect = new Rect();
                    this.mTextLayout.getLineBounds(i3, rect);
                    if (i3 == lineForOffset2 || i3 == lineForOffset3) {
                        rect.left = (int) Math.max(rect.left, this.mTextLayout.getSecondaryHorizontal(i));
                        rect.right = (int) Math.min(rect.right, this.mTextLayout.getSecondaryHorizontal(i2));
                    }
                    float f = rect.left;
                    PointF pointF = this.mTextTranslateOffset;
                    float f2 = pointF.x;
                    rect.left = (int) (f - f2);
                    rect.right = (int) (rect.right - f2);
                    float f3 = rect.top;
                    float f4 = pointF.y;
                    rect.top = (int) (f3 - f4);
                    rect.bottom = (int) (rect.bottom - f4);
                    arrayList.add(new RectF(rect));
                }
            }
        }
        return arrayList;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) throws Throwable {
        if (menuItem.getItemId() == 65534) {
            performCopy();
        } else if (menuItem.getItemId() == 65533) {
            performSelectAll();
        }
        invalidate();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, 65534, 0, 2131829536);
        menu.add(0, 65533, 1, 2131847260);
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        this.mActionMode = actionMode;
        return false;
    }

    public void setBindSelectionChange(boolean z, int i) {
        this.mIsBindSelectionChange = z;
        this.mSign = i;
    }

    private double distanceBetweenPoints(PointF pointF, float f, float f2) {
        return Math.sqrt(Math.pow(pointF.x - f, 2.0d) + Math.pow(pointF.y - f2, 2.0d));
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (super.getRenderer() != null) {
            if (super.getRenderer().LJII != null) {
                super.getRenderer().LJII.measure();
            }
            super.getRenderer().LJFF();
        }
    }

    private ArrayList<RectF> setTextServiceTextSelection(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        invalidate();
        if (f >= 0.0f && f2 >= 0.0f && f3 >= 0.0f && f4 >= 0.0f) {
            int offsetForPosition = getOffsetForPosition(f, f2);
            int offsetForPosition2 = getOffsetForPosition(f3, f4);
            if (offsetForPosition >= 0 && offsetForPosition2 >= 0) {
                if (offsetForPosition == offsetForPosition2) {
                    offsetForPosition2++;
                    if (getTextBoundingBoxes(offsetForPosition, offsetForPosition2).isEmpty() && offsetForPosition > 0) {
                        offsetForPosition--;
                        offsetForPosition2--;
                    }
                }
                ArrayList<RectF> textBoundingBoxes = getTextBoundingBoxes(Math.min(offsetForPosition, offsetForPosition2), Math.max(offsetForPosition, offsetForPosition2));
                if (textBoundingBoxes.isEmpty()) {
                    clearSelection();
                    return textBoundingBoxes;
                }
                this.mIsShowStartHandle = z;
                this.mIsShowEndHandle = z2;
                this.mIsInSelection = true;
                updateSelectionRange(offsetForPosition, offsetForPosition2);
                updateSelectStartEnd();
                return textBoundingBoxes;
            }
            clearSelection();
            return new ArrayList<>();
        }
        clearSelection();
        return new ArrayList<>();
    }

    public ArrayList<RectF> setTextSelection(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        if (this.mTextraPage != null) {
            return setTextServiceTextSelection(f, f2, f3, f4, z, z2);
        }
        invalidate();
        if (f >= 0.0f && f2 >= 0.0f && f3 >= 0.0f && f4 >= 0.0f) {
            int offsetForPosition = getOffsetForPosition(f, f2);
            int offsetForPosition2 = getOffsetForPosition(f3, f4);
            if (offsetForPosition >= 0 && offsetForPosition2 >= 0) {
                if (offsetForPosition == offsetForPosition2) {
                    PointF centerPositionForOffset = getCenterPositionForOffset(offsetForPosition);
                    if (offsetForPosition == this.mTextLayout.getText().length() || (offsetForPosition > 0 && f < centerPositionForOffset.x)) {
                        offsetForPosition--;
                    } else {
                        offsetForPosition2++;
                    }
                }
                this.mIsShowStartHandle = z;
                this.mIsShowEndHandle = z2;
                this.mIsInSelection = true;
                updateSelectionRange(offsetForPosition, offsetForPosition2);
                updateSelectStartEnd();
                return getTextBoundingBoxes(this.mSelectStart, this.mSelectEnd);
            }
            clearSelection();
            return new ArrayList<>();
        }
        clearSelection();
        return new ArrayList<>();
    }
}
