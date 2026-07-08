package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yVP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1860130yVP extends C0H7K implements InterfaceC1860060yVI, InterfaceC431030GvF {
    public final C21422518sZ LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public C1860140yVQ LLJJJ;
    public String LLJJJIL;
    public Map<String, Object> LLJJJJ;
    public Layout LLJJJJJIL;

    public C1860130yVP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // X.C0H7K, X.C1860100yVM, X.InterfaceC1860050yVH
    public final TextView LJIJI() {
        return this;
    }

    @Override // X.C0H7K, X.C1860100yVM
    public final C1860100yVM LJJJI() {
        return this;
    }

    @Override // X.C0H7K
    public final C0H7K LJJJJ() {
        return this;
    }

    public Layout LJJJJIZL(int i) {
        return null;
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return false;
    }

    @Override // X.InterfaceC431030GvF
    public final Layout LJIIIIZZ() {
        Layout layout = this.LLJJJJJIL;
        return layout == null ? getLayout() : layout;
    }

    public void LJJJJI() {
        SpannableStringBuilder spannableStringBuilder;
        getClass();
        C1860140yVQ c1860140yVQ = this.LLJJJ;
        if (c1860140yVQ != null && (spannableStringBuilder = c1860140yVQ.LIZ) != null) {
            spannableStringBuilder.clear();
        }
        C1860140yVQ c1860140yVQ2 = this.LLJJJ;
        if (c1860140yVQ2 != null) {
            c1860140yVQ2.LJIIIZ(this);
        }
        C1860140yVQ c1860140yVQ3 = this.LLJJJ;
        if (c1860140yVQ3 != null) {
            SpannableStringBuilder spannableStringBuilder2 = c1860140yVQ3.LIZ;
            for (InterfaceC431020GvE interfaceC431020GvE : (InterfaceC431020GvE[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), InterfaceC431020GvE.class)) {
                interfaceC431020GvE.LJFF(null);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.LLJJIJIIJIL) {
            return false;
        }
        return super.performClick();
    }

    @Override // X.C1860100yVM, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        List list;
        super.onAttachedToWindow();
        C1860140yVQ c1860140yVQ = this.LLJJJ;
        if (c1860140yVQ == null || (list = (List) c1860140yVQ.LJIIIIZZ.getValue()) == null || !(!list.isEmpty())) {
            return;
        }
        LJJJJJ(this.LLJJJ, null);
    }

    @Override // X.InterfaceC1860060yVI
    public InterfaceC342000Daw getMarkdownContent() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1860060yVI
    public int getMarkdownWidth() {
        return this.LLJJIJIL;
    }

    public final C1860140yVQ getMarkwonContent() {
        return this.LLJJJ;
    }

    public String getOnBoardingType() {
        return this.LLJJJIL;
    }

    public final String getOnboardingType() {
        return this.LLJJJIL;
    }

    public Map<String, Object> getPayload() {
        return this.LLJJJJ;
    }

    @Override // X.C0H7K, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJJJJJIL != null) {
            Drawable background = getBackground();
            if (background != null) {
                background.draw(canvas);
            }
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            int iSave = canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            try {
                Layout layout = this.LLJJJJJIL;
                if (layout != null) {
                    layout.draw(canvas, null, null, 0);
                }
                canvas.restoreToCount(iSave);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        super.onDraw(canvas);
    }

    @Override // X.C1857630yRN, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LLJJIJIIJIL = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMarkdownWidth(int i) {
        this.LLJJIJIL = i;
    }

    public void setPayload(Map<String, Object> map) {
        this.LLJJJJ = map;
    }

    public final void LJJJJJ(InterfaceC342000Daw interfaceC342000Daw, String str) {
        C1860140yVQ c1860140yVQ;
        SpannableStringBuilder spannableStringBuilder;
        C21432418uA c21432418uALIZ;
        int iMax;
        int iMin;
        if (interfaceC342000Daw != null && !(interfaceC342000Daw instanceof C1860140yVQ)) {
            InterfaceC1860190yVV interfaceC1860190yVVLIZ = C1860290yVf.LIZ();
            if (interfaceC1860190yVVLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unsupport markdown: ");
                sbLIZ.append(interfaceC342000Daw);
                interfaceC1860190yVVLIZ.e("mark_down", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            if (interfaceC342000Daw instanceof C1860140yVQ) {
                c1860140yVQ = (C1860140yVQ) interfaceC342000Daw;
            }
            this.LLJJJ = c1860140yVQ;
            this.LLJJJIL = str;
            if (c1860140yVQ == null && (spannableStringBuilder = c1860140yVQ.LIZ) != null) {
                getPaint();
                if (getMarkdownWidth() > 0) {
                    getMarkdownWidth();
                    getPaddingStart();
                    getPaddingEnd();
                }
                this.LLJJIJI = true;
                C2248251Cz9 textSelector = getTextSelector();
                if (textSelector != null && (iMin = Math.min(textSelector.LJIIL, spannableStringBuilder.length())) > (iMax = Math.max(textSelector.LJIIJJI, 0))) {
                    C786410Ut5.q2(spannableStringBuilder, textSelector.LJIILJJIL, iMax, iMin, 17);
                }
                InterfaceC1860180yVU interfaceC1860180yVU = c1860140yVQ.LJ;
                if (interfaceC1860180yVU != null && (c21432418uALIZ = interfaceC1860180yVU.LIZ()) != null) {
                    c21432418uALIZ.LIZLLL(this, spannableStringBuilder);
                }
                this.LLJJIJI = false;
                return;
            }
        }
        c1860140yVQ = null;
        this.LLJJJ = c1860140yVQ;
        this.LLJJJIL = str;
        if (c1860140yVQ == null) {
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        C1860140yVQ c1860140yVQ;
        getPaint();
        if (getMarkdownWidth() > 0) {
            getMarkdownWidth();
            getPaddingStart();
            getPaddingEnd();
        }
        Layout layoutLJJJJIZL = LJJJJIZL(i);
        this.LLJJJJJIL = layoutLJJJJIZL;
        if (layoutLJJJJIZL != null) {
            super.onMeasure(i, i2);
            setMeasuredDimension(layoutLJJJJIZL.getWidth(), layoutLJJJJIZL.getHeight());
        } else if (getMarkdownWidth() > 0 && (c1860140yVQ = this.LLJJJ) != null && c1860140yVQ.LIZJ) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMarkdownWidth(), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, 0);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1860140yVQ c1860140yVQ;
        InterfaceC1860180yVU interfaceC1860180yVU;
        C21432418uA c21432418uALIZ;
        Spanned spannableString;
        if (!this.LLJJIJI && (c1860140yVQ = this.LLJJJ) != null && (interfaceC1860180yVU = c1860140yVQ.LJ) != null && (c21432418uALIZ = interfaceC1860180yVU.LIZ()) != null) {
            this.LLJJIJI = true;
            if (!(charSequence instanceof Spanned) || (spannableString = (Spanned) charSequence) == null) {
                spannableString = new SpannableString(charSequence);
            }
            c21432418uALIZ.LIZLLL(this, spannableString);
            this.LLJJIJI = false;
            return;
        }
        super.setText(charSequence, bufferType);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.18sZ] */
    public C1860130yVP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJIII = new Object() { // from class: X.18sZ
            public static final Map<Class<? extends AbstractC21430218to>, String> LIZ;

            static {
                Map<Class<? extends AbstractC21430218to>, String> mapLJ;
                Map<Class<? extends AbstractC21430218to>, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair(C21444918wB.class, "thematic"), new Pair(C21439318vH.class, "heading"), new Pair(C21440218vQ.class, "code_block"), new Pair(C21440318vR.class, "code_block"), new Pair(C21440118vP.class, "html"), new Pair(C21437218uw.class, "html"), new Pair(C21440518vT.class, "link_ref_def"), new Pair(C21439218vG.class, "paragraph"), new Pair(C21428718tZ.class, "table"), new Pair(C21428218tU.class, "table_cell"), new Pair(C21428418tW.class, "table_body"), new Pair(C21428618tY.class, "table_row"), new Pair(C21428518tX.class, "table_header"), new Pair(C21445018wC.class, "block_quote"), new Pair(C21437618v0.class, "list"), new Pair(C21437718v1.class, "list"), new Pair(C21445118wD.class, "list_item"), new Pair(C21437518uz.class, "inline_code"), new Pair(C21438118v5.class, "emphasis"), new Pair(C21438718vB.class, "strong"), new Pair(C21436418uo.class, "link"), new Pair(C21436318un.class, "image"), new Pair(C21437418uy.class, "text"));
                InterfaceC21173117tR interfaceC21173117tR = (InterfaceC21173117tR) C21173017tQ.LIZ.getValue();
                if (interfaceC21173117tR == null || (mapLJ = interfaceC21173117tR.LIZ()) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                mapLJIIJ.putAll(mapLJ);
                LIZ = mapLJIIJ;
            }
        };
    }

    public /* synthetic */ C1860130yVP(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
