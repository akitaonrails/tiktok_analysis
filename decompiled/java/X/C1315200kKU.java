package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.xelement.markdown.Markdown;
import com.bytedance.xelement.markdown.MarkdownDocument;
import com.bytedance.xelement.markdown.MarkdownShadowNode;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0kKU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315200kKU extends AndroidView implements InterfaceC1315370kKl {
    public static final int LLLIIIIL = Color.argb(20, 27, 125, 240);
    public static final int LLLIIIL = Color.argb(255, 27, 125, 240);
    public C1315260kKa LL;
    public WeakReference<LynxBaseUI> LLILLJJLI;
    public final HashSet<String> LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final Path LLILZLL;
    public final Paint LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final int LLJIJIL;
    public Drawable LLJILJIL;
    public Drawable LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final PointF LLJJIJI;
    public final PointF LLJJIJIIJIL;
    public final PointF LLJJIJIL;
    public final PointF LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public RunnableC1315230kKX LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public ReadableArray LLJL;
    public ReadableArray LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public float LLJLLIL;
    public float LLJLLL;
    public long LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;
    public boolean LLLF;
    public ChoreographerFrameCallbackC1339260kxI LLLFF;
    public RectF LLLFFI;
    public boolean LLLFZ;
    public C1315310kKf LLLI;
    public final HashMap<Integer, C1315210kKV> LLLII;
    public final HashMap<Integer, C1315250kKZ> LLLIIII;

    public void setAnimationFrameRate(int i) {
    }

    public final void LIZIZ() {
        if (this.LLLFF != null) {
            C786410Ut5.v2().removeFrameCallback(this.LLLFF);
            this.LLLFF = null;
        }
        C1315310kKf c1315310kKf = this.LLLI;
        if (c1315310kKf != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1315310kKf, null);
            c1315310kKf.removeAllViews();
            this.LLLII.clear();
            this.LLLIIII.clear();
            C1315310kKf c1315310kKf2 = this.LLLI;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c1315310kKf2);
            removeView(c1315310kKf2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0kKf, android.view.View] */
    public final void LIZJ() {
        if (this.LLLFF == null) {
            this.LLLFF = new ChoreographerFrameCallbackC1339260kxI(this, 1);
            C786410Ut5.v2().postFrameCallback(this.LLLFF);
        }
        C1315310kKf c1315310kKf = this.LLLI;
        if (c1315310kKf != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c1315310kKf);
            removeView(c1315310kKf);
            addView(this.LLLI, 0);
        } else {
            final Context context = getContext();
            ?? r1 = new ViewGroup(context) { // from class: X.0kKf
                {
                    setWillNotDraw(true);
                    setClipChildren(true);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    setClipBounds(new Rect(i, i2, i3, i4));
                }
            };
            this.LLLI = r1;
            addView(r1);
        }
    }

    public final void LIZLLL() {
        Iterator<C1315210kKV> it2 = this.LLLII.values().iterator();
        while (it2.hasNext()) {
            it2.next().invalidate();
        }
        Iterator<C1315250kKZ> it3 = this.LLLIIII.values().iterator();
        while (it3.hasNext()) {
            it3.next().invalidate();
        }
    }

    public final void LJII() {
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa != null) {
            c1315260kKa.LIZ.clearTextMarkAttachment();
            this.LL.LIZ.addTextMarkAttachment(this.LLJLIL);
            this.LL.LIZ.addTextMarkAttachment(this.LLJL);
            invalidate();
        }
    }

    public final void LJIIIIZZ() {
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa == null || c1315260kKa.LIZ == null) {
            return;
        }
        RectF viewRectInScreen = getViewRectInScreen();
        float f = viewRectInScreen.top;
        RectF rectF = this.LLLFFI;
        float f2 = f - rectF.top;
        float f3 = viewRectInScreen.bottom - rectF.bottom;
        if (f2 >= 5.0f || f3 >= 5.0f || f2 <= -5.0f || f3 <= -5.0f || this.LLLFZ) {
            if (this.LLLFZ) {
                this.LLLFZ = false;
                C1315310kKf c1315310kKf = this.LLLI;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1315310kKf, null);
                c1315310kKf.removeAllViews();
                this.LLLII.clear();
                this.LLLIIII.clear();
            }
            this.LLLFFI = viewRectInScreen;
            MarkdownDocument markdownDocument = this.LL.LIZ;
            float f4 = viewRectInScreen.top - 5.0f;
            float f5 = this.LLJLL;
            int[] showedRegion = markdownDocument.getShowedRegion(f4 + f5, viewRectInScreen.bottom + 5.0f + f5);
            int regionCount = this.LL.LIZ.getRegionCount();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateRegionView: rect=");
            sbLIZ.append(viewRectInScreen);
            sbLIZ.append(", regionRange=[");
            sbLIZ.append(showedRegion[0]);
            sbLIZ.append(", ");
            sbLIZ.append(showedRegion[1]);
            sbLIZ.append("], regionCount=");
            sbLIZ.append(regionCount);
            LynxLog.d("MarkdownView", C2188811AlT.LIZIZ(sbLIZ));
            for (int i = 0; i < regionCount; i++) {
                C1315210kKV c1315210kKV = this.LLLII.get(Integer.valueOf(i));
                if (i < showedRegion[0] || i > showedRegion[1]) {
                    if (c1315210kKV != null) {
                        C1315310kKf c1315310kKf2 = this.LLLI;
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1315310kKf2, c1315210kKV);
                        c1315310kKf2.removeView(c1315210kKV);
                        this.LLLII.remove(Integer.valueOf(i));
                    }
                } else if (c1315210kKV == null) {
                    float[] regionRect = this.LL.LIZ.getRegionRect(i);
                    C1315210kKV c1315210kKV2 = new C1315210kKV(getContext(), this.LL, this, i);
                    c1315210kKV2.setLeft((int) (regionRect[0] + this.LLJLILLLLZIIL));
                    c1315210kKV2.setTop((int) (regionRect[1] + this.LLJLL));
                    c1315210kKV2.setRight((int) (regionRect[2] + this.LLJLILLLLZIIL));
                    c1315210kKV2.setBottom((int) (regionRect[3] + this.LLJLL));
                    this.LLLII.put(Integer.valueOf(i), c1315210kKV2);
                    addView(c1315210kKV2);
                    c1315210kKV2.invalidate();
                }
            }
            MarkdownDocument markdownDocument2 = this.LL.LIZ;
            float f6 = viewRectInScreen.top - 5.0f;
            float f7 = this.LLJLL;
            int[] showedExtraContent = markdownDocument2.getShowedExtraContent(f6 + f7, viewRectInScreen.bottom + 5.0f + f7);
            int extraContentCount = this.LL.LIZ.getExtraContentCount();
            for (int i2 = 0; i2 < extraContentCount; i2++) {
                C1315250kKZ c1315250kKZ = this.LLLIIII.get(Integer.valueOf(i2));
                if (i2 < showedExtraContent[0] || i2 > showedExtraContent[1]) {
                    if (c1315250kKZ != null) {
                        C1315310kKf c1315310kKf3 = this.LLLI;
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1315310kKf3, c1315250kKZ);
                        c1315310kKf3.removeView(c1315250kKZ);
                        this.LLLIIII.remove(Integer.valueOf(i2));
                    }
                } else if (c1315250kKZ == null) {
                    float[] extraContentRect = this.LL.LIZ.getExtraContentRect(i2);
                    C1315250kKZ c1315250kKZ2 = new C1315250kKZ(getContext(), this.LL, i2);
                    c1315250kKZ2.setLeft((int) (extraContentRect[0] + this.LLJLILLLLZIIL));
                    c1315250kKZ2.setTop((int) (extraContentRect[1] + this.LLJLL));
                    c1315250kKZ2.setRight((int) (extraContentRect[2] + this.LLJLILLLLZIIL));
                    c1315250kKZ2.setBottom((int) (extraContentRect[3] + this.LLJLL));
                    this.LLLIIII.put(Integer.valueOf(i2), c1315250kKZ2);
                    addView(c1315250kKZ2);
                    c1315250kKZ2.invalidate();
                }
            }
        }
    }

    public ArrayList<Float>[] getHandlesInfo() {
        if (!this.LLJJJIL) {
            return new ArrayList[0];
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        arrayList.add(Float.valueOf(this.LLJJIJIL.x));
        arrayList.add(Float.valueOf(this.LLJJIJIL.y));
        arrayList.add(Float.valueOf(50.0f));
        ArrayList<Float> arrayList2 = new ArrayList<>();
        arrayList2.add(Float.valueOf(this.LLJJJ.x));
        arrayList2.add(Float.valueOf(this.LLJJJ.y));
        arrayList2.add(Float.valueOf(50.0f));
        return new ArrayList[]{arrayList, arrayList2};
    }

    public String getSelectedText() {
        int i;
        int i2 = this.LLJILLL;
        return (i2 < 0 || (i = this.LLJJ) <= 0 || i <= i2) ? "" : this.LL.LIZ.getContentByCharRange(i2, i);
    }

    public final void onSelectionChange() {
        MarkdownShadowNode markdownShadowNode;
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa == null || (markdownShadowNode = c1315260kKa.LJ.get()) == null || !markdownShadowNode.LJJIIJZLJL("selectionchange")) {
            return;
        }
        MarkdownShadowNode markdownShadowNode2 = this.LL.LJ.get();
        int i = this.LLJILLL;
        int i2 = this.LLJJ;
        boolean z = this.LLILZ;
        C1289960jfm c1289960jfm = new C1289960jfm(markdownShadowNode2.LIZIZ, "selectionchange");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "start");
        c1289960jfm.LIZIZ(Integer.valueOf(i2), "end");
        c1289960jfm.LIZIZ(z ? "forward" : "backward", "direction");
        C1289620jfE.LIZJ(new ARunnableS89S0200000_20(markdownShadowNode2, c1289960jfm, 102));
    }

    public final void removeCheckLongPressCallback() {
        RunnableC1315230kKX runnableC1315230kKX = this.LLJJL;
        if (runnableC1315230kKX == null) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(this, runnableC1315230kKX);
        this.LLJJL = null;
    }

    public final void updateSelectStartEnd() {
        int i = this.LLJJI;
        boolean z = false;
        if (i != -1 ? i < this.LLJILLL || this.LLJJIII < this.LLJJ : this.LLJJ > this.LLJILLL) {
            z = true;
        }
        this.LLILZ = z;
        int iMin = Math.min(this.LLJILLL, this.LLJJ);
        int iMax = Math.max(this.LLJILLL, this.LLJJ);
        this.LLJJ = iMax;
        this.LLJILLL = iMin;
        this.LLJJI = iMin;
        this.LLJJIII = iMax;
        onSelectionChange();
    }

    public final void clearSelection() {
        removeCheckLongPressCallback();
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
        this.LLJJJJ = false;
        this.LLJJIJI.set(-1.0f, -1.0f);
        this.LLJJIJIIJIL.set(-1.0f, -1.0f);
        this.LLJILLL = -1;
        this.LLJJ = -1;
        this.LLJJI = -1;
        this.LLJJIII = -1;
        this.LLILZLL.reset();
        if (this.LLJJJIL) {
            invalidate();
            onSelectionChange();
        }
        this.LLJJJIL = false;
    }

    public RectF getViewRectInScreen() {
        View rootView = getRootView();
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        PointF pointFLIZ = C1292480jjq.LIZ(new PointF(0.0f, 0.0f), rootView, this);
        PointF pointFLIZ2 = C1292480jjq.LIZ(new PointF(width, height), rootView, this);
        return new RectF(Math.max(0.0f, Math.min(pointFLIZ.x, pointFLIZ2.x)), Math.max(0.0f, Math.min(pointFLIZ.y, pointFLIZ2.y)), Math.min(getWidth(), Math.max(pointFLIZ.x, pointFLIZ2.x)), Math.min(getHeight(), Math.max(pointFLIZ.y, pointFLIZ2.y)));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (this.LLLF) {
            LIZLLL();
        }
    }

    public C1315200kKU(Context context) {
        super(context);
        this.LLILZ = true;
        this.LLILZLL = new Path();
        this.LLIZ = new Paint();
        this.LLJILLL = -1;
        this.LLJJ = -1;
        this.LLJJI = -1;
        this.LLJJIII = -1;
        this.LLJJIJI = new PointF(-1.0f, -1.0f);
        this.LLJJIJIIJIL = new PointF(-1.0f, -1.0f);
        this.LLJJIJIL = new PointF(-1.0f, -1.0f);
        this.LLJJJ = new PointF(-1.0f, -1.0f);
        this.LLJJJIL = false;
        this.LLJJJJ = false;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = 0;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = 0.0f;
        this.LLJLL = 0.0f;
        this.LLL = 0;
        this.LLLF = false;
        this.LLLFF = null;
        this.LLLFFI = new RectF();
        this.LLLFZ = false;
        this.LLLII = new HashMap<>();
        this.LLLIIII = new HashMap<>();
        Markdown.ensureInitialized();
        setWillNotDraw(false);
        this.LLILLL = new HashSet<>();
        this.LLIZLLLIL = LLLIIIIL;
        this.LLJ = LLLIIIL;
        int iRound = Math.round(((s) context).LLJJJ.density * 15.0f);
        this.LLJIJIL = iRound;
        this.LLJI = iRound;
    }

    public final void LJI(int i) {
        String[] visibleInlineViews;
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa == null) {
            return;
        }
        int[] typewriterChangedRegions = c1315260kKa.LIZ.getTypewriterChangedRegions(this.LLL, i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAnimationStep: from=");
        sbLIZ.append(this.LLL);
        sbLIZ.append(", to=");
        sbLIZ.append(i);
        sbLIZ.append(", changedRange=[");
        sbLIZ.append(typewriterChangedRegions[0]);
        sbLIZ.append(", ");
        sbLIZ.append(typewriterChangedRegions[1]);
        sbLIZ.append(e3.f);
        LynxLog.d("MarkdownView", C2188811AlT.LIZIZ(sbLIZ));
        for (int i2 = typewriterChangedRegions[0]; i2 <= typewriterChangedRegions[1]; i2++) {
            C1315210kKV c1315210kKV = this.LLLII.get(Integer.valueOf(i2));
            if (c1315210kKV != null) {
                c1315210kKV.invalidate();
            }
        }
        this.LLL = i;
        this.LLJJLIIIJLLLLLLLZ = i;
        C1315260kKa c1315260kKa2 = this.LL;
        if (c1315260kKa2.LIZIZ == 0) {
            visibleInlineViews = c1315260kKa2.LIZ.getVisibleInlineViews(Integer.MAX_VALUE, true);
        } else {
            visibleInlineViews = c1315260kKa2.LIZ.getVisibleInlineViews(i, c1315260kKa2.LJII);
        }
        HashSet hashSet = new HashSet(Arrays.asList(visibleInlineViews));
        for (LynxBaseUI lynxBaseUI : this.LLILLJJLI.get().getChildren()) {
            if (lynxBaseUI instanceof LynxUI) {
                LynxUI lynxUI = (LynxUI) lynxBaseUI;
                if (hashSet.contains(lynxBaseUI.getIdSelector())) {
                    lynxUI.setVisibilityForView(0);
                } else {
                    lynxUI.setVisibilityForView(4);
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.LLILZLL.isEmpty()) {
            int iSave = canvas.save();
            canvas.translate(this.LLJLILLLLZIIL, this.LLJLL);
            canvas.drawPath(this.LLILZLL, this.LLIZ);
            canvas.save();
            canvas.translate(this.LLJJIJIL.x - (this.LLJILJIL.getBounds().width() / 2.0f), this.LLJJIJIL.y - (this.LLJILJIL.getBounds().height() / 2.0f));
            this.LLJILJIL.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(this.LLJJJ.x - (this.LLJILJILJ.getBounds().width() / 2.0f), this.LLJJJ.y - (this.LLJILJILJ.getBounds().height() / 2.0f));
            this.LLJILJILJ.draw(canvas);
            canvas.restore();
            canvas.restoreToCount(iSave);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LLLF && this.LL != null) {
            Markdown.ensureInitialized();
            TraceEvent.LIZIZ("x-markdown.View.draw");
            int iSave = canvas.save();
            canvas.translate(this.LLJLILLLLZIIL, this.LLJLL);
            C1315260kKa c1315260kKa = this.LL;
            canvas.clipRect(0.0f, 0.0f, c1315260kKa.LJFF, c1315260kKa.LJI);
            C1315220kKW c1315220kKW = new C1315220kKW(canvas, this.LL.LIZ.getResourceManager(), this);
            this.LLILLL.clear();
            C1315260kKa c1315260kKa2 = this.LL;
            int i = c1315260kKa2.LIZIZ;
            if (i != 1 && i != 2) {
                c1315260kKa2.LIZ.draw(c1315220kKW);
            } else {
                c1315260kKa2.LIZ.drawWithCursor(c1315220kKW, c1315260kKa2.LIZJ, !c1315260kKa2.LJII);
            }
            LynxBaseUI lynxBaseUI = this.LLILLJJLI.get();
            if (lynxBaseUI != null) {
                for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
                    if (lynxBaseUI2 instanceof LynxUI) {
                        LynxUI lynxUI = (LynxUI) lynxBaseUI2;
                        if (lynxBaseUI2.getIdSelector() != null && this.LLILLL.contains(lynxBaseUI2.getIdSelector())) {
                            if (!lynxUI.getVisibility()) {
                                C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(lynxUI, 162));
                            }
                        } else if (lynxUI.getVisibility()) {
                            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(lynxUI, 161));
                        }
                    }
                }
            }
            canvas.restoreToCount(iSave);
            MarkdownShadowNode markdownShadowNode = this.LL.LJ.get();
            if (markdownShadowNode != null) {
                markdownShadowNode.LJJIJIIJI(new ARunnableS120S0100000_20(markdownShadowNode, 157));
            }
            TraceEvent.LJII("x-markdown.View.draw");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cc  */
    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315200kKU.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEffect(ReadableArray readableArray) {
        this.LLJL = readableArray;
        LJII();
    }

    public void setEnableTextSelection(boolean z) {
        this.LLILZIL = z;
    }

    public void setTextMarkAttachments(ReadableArray readableArray) {
        this.LLJLIL = readableArray;
        LJII();
    }

    public void setVSyncAnimation(boolean z) {
        this.LLLF = z;
        C1289620jfE.LIZLLL(new ARunnableS39S0110000_20(this, z, 9));
    }

    @Override // X.InterfaceC1315370kKl
    public final void LIZ(C1315320kKg c1315320kKg, Rect rect) {
        this.LLILLL.add(c1315320kKg.LJ);
    }

    public final void adjustEndPosition(float f, float f2) {
        this.LLJJJJLIIL = true;
        int offsetForPosition = getOffsetForPosition(f, f2);
        int i = this.LLJILLL;
        if (offsetForPosition == i) {
            if (offsetForPosition == this.LLJJLIIIJLLLLLLLZ || (f < this.LLJJIJI.x && offsetForPosition > 0)) {
                offsetForPosition--;
            } else {
                offsetForPosition++;
            }
        }
        updateSelectionRange(i, offsetForPosition);
    }

    public final void adjustStartPosition(float f, float f2) {
        this.LLJJJJJIL = true;
        int offsetForPosition = getOffsetForPosition(f, f2);
        int i = this.LLJJ;
        if (i == offsetForPosition) {
            if (offsetForPosition == this.LLJJLIIIJLLLLLLLZ || (f < this.LLJJIJIIJIL.x && offsetForPosition > 0)) {
                offsetForPosition--;
            } else {
                offsetForPosition++;
            }
        }
        updateSelectionRange(offsetForPosition, i);
    }

    public final int getOffsetForPosition(float f, float f2) {
        MarkdownDocument markdownDocument;
        int[] charRangeByPoint;
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa == null || (markdownDocument = c1315260kKa.LIZ) == null || (charRangeByPoint = markdownDocument.getCharRangeByPoint(f, f2, 0)) == null || charRangeByPoint.length < 1) {
            return -1;
        }
        return Math.min(charRangeByPoint[0], this.LLJJLIIIJLLLLLLLZ);
    }

    public final void performEndSelection(float f, float f2) {
        requestDisallowInterceptTouchEvent(false);
        if (!this.LLJJJIL) {
            removeCheckLongPressCallback();
            return;
        }
        boolean z = this.LLJJJJLIIL;
        if (!z && !this.LLJJJJJIL && this.LLJZIJLIL) {
            clearSelection();
            return;
        }
        if (this.LLJJJJJIL) {
            adjustStartPosition(f, f2);
            updateSelectStartEnd();
        } else if (z) {
            adjustEndPosition(f, f2);
            updateSelectStartEnd();
        }
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
    }

    public final void updateSelectionRange(int i, int i2) {
        if (this.LLJILJIL == null) {
            Context context = getContext();
            this.LLJILJIL = context.getResources().getDrawable(R.drawable.clg);
            this.LLJILJILJ = context.getResources().getDrawable(R.drawable.clh);
            this.LLIZ.setStyle(Paint.Style.FILL);
        }
        Drawable drawable = this.LLJILJIL;
        int i3 = this.LLJI;
        drawable.setBounds(0, 0, i3, i3);
        Drawable drawable2 = this.LLJILJILJ;
        int i4 = this.LLJI;
        drawable2.setBounds(0, 0, i4, i4);
        this.LLJILJIL.setTint(this.LLJ);
        this.LLJILJILJ.setTint(this.LLJ);
        this.LLIZ.setColor(this.LLIZLLLIL);
        this.LLJILLL = i;
        this.LLJJ = i2;
        if (i >= 0 && i2 >= 0) {
            ArrayList<RectF> selectionRectByCharPos = this.LL.LIZ.getSelectionRectByCharPos(Math.min(i, i2), Math.max(this.LLJILLL, this.LLJJ));
            if (selectionRectByCharPos.size() > 0) {
                this.LLILZLL.reset();
                RectF rectF = null;
                RectF rectF2 = null;
                for (int i5 = 0; i5 < selectionRectByCharPos.size(); i5++) {
                    if (i5 == 0) {
                        rectF = (RectF) ListProtector.get(selectionRectByCharPos, i5);
                    }
                    if (i5 == selectionRectByCharPos.size() - 1) {
                        rectF2 = (RectF) ListProtector.get(selectionRectByCharPos, i5);
                    }
                    this.LLILZLL.addRect((RectF) ListProtector.get(selectionRectByCharPos, i5), Path.Direction.CW);
                }
                this.LLILZLL.close();
                invalidate();
                this.LLJJIJI.set(rectF.left, rectF.bottom);
                this.LLJJIJIIJIL.set(rectF2.right, rectF2.bottom);
                this.LLJJIJIL.set(this.LLJJIJI.x - (this.LLJILJIL.getBounds().width() / 2.0f), this.LLJJIJI.y + (this.LLJILJIL.getBounds().height() / 2.0f));
                this.LLJJJ.set(this.LLJJIJIIJIL.x + (this.LLJILJILJ.getBounds().width() / 2.0f), this.LLJJIJIIJIL.y + (this.LLJILJILJ.getBounds().height() / 2.0f));
            }
        }
    }

    public final ArrayList<RectF> LJ(float f, float f2, float f3, float f4, int i) {
        int offsetForPosition;
        int offsetForPosition2;
        if (f >= 0.0f && f2 >= 0.0f && f3 >= 0.0f && f4 >= 0.0f && this.LL != null) {
            if (Float.compare(f, f3) == 0 && Float.compare(f2, f4) == 0) {
                int[] charRangeByPoint = this.LL.LIZ.getCharRangeByPoint(f, f2, i);
                charRangeByPoint[0] = Math.min(charRangeByPoint[0], this.LLJJLIIIJLLLLLLLZ);
                offsetForPosition2 = Math.min(charRangeByPoint[1], this.LLJJLIIIJLLLLLLLZ);
                charRangeByPoint[1] = offsetForPosition2;
                offsetForPosition = charRangeByPoint[0];
            } else {
                offsetForPosition = getOffsetForPosition(f, f2);
                offsetForPosition2 = getOffsetForPosition(f3, f4);
            }
            if (offsetForPosition >= 0 && offsetForPosition2 >= 0) {
                if (offsetForPosition == offsetForPosition2) {
                    if (offsetForPosition == this.LLJJLIIIJLLLLLLLZ || (offsetForPosition > 0 && f < f3)) {
                        offsetForPosition--;
                    } else {
                        offsetForPosition2++;
                    }
                }
                this.LLJJJIL = true;
                updateSelectionRange(offsetForPosition, offsetForPosition2);
                updateSelectStartEnd();
                int i2 = this.LLJILLL;
                int i3 = this.LLJJ;
                if (i2 <= i3 && i2 >= 0) {
                    return this.LL.LIZ.getSelectionRectByCharPos(i2, i3);
                }
                return new ArrayList<>();
            }
            clearSelection();
            return new ArrayList<>();
        }
        clearSelection();
        return new ArrayList<>();
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLLF && z) {
            layout(0, 0, i3 - i, i4 - i2);
        }
    }
}
