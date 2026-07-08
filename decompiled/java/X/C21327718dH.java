package X;

import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.facebook.yoga.m;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18dH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21327718dH extends AbstractC21332918e7 {
    public final C21326718d7 LLIZLLLIL;
    public final String LLJ;
    public final Context LLJI;
    public final C21339618fC LLJIJIL;
    public TextView LLJILJIL;
    public final int LLJILJILJ;
    public AbstractC21333318eB<?> LLJILLL;
    public m LLJJ;
    public InterfaceC21327918dJ LLJJI;
    public InterfaceC21328018dK LLJJIII;

    public final void LJFF() {
        if (this.LLJILJIL != null) {
            return;
        }
        TextView textView = new TextView(this.LLJI);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.LLJILJILJ, -2);
        textView.setPadding(10, 0, 10, 0);
        C786410Ut5.g6(textView, layoutParams);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ColorProtector.parseColor("#FF98B3"));
        textView.setTag("MYNA_DEBUG_TAG_VIEW");
        textView.setText("Myna");
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setLongClickable(true);
        C786410Ut5.S4(0.4f, textView);
        textView.setImportantForAccessibility(2);
        C786410Ut5.LLIL(textView, 8);
        this.LLJILJIL = textView;
        addView(textView);
    }

    public final void LJI() {
        m mVar = this.LLJJ;
        if (mVar != null) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (Intrinsics.LJFF(getChildAt(i).getData(), mVar.getData())) {
                    removeChildAt(i);
                    return;
                }
            }
        }
    }

    public final C21326718d7 getRenderContext() {
        return this.LLIZLLLIL;
    }

    public final String getUrl() {
        return this.LLJ;
    }

    @Override // X.AbstractC21332918e7, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC21328018dK interfaceC21328018dK = this.LLJJIII;
        if (interfaceC21328018dK != null) {
            interfaceC21328018dK.onStart();
        }
        super.dispatchDraw(canvas);
        InterfaceC21328018dK interfaceC21328018dK2 = this.LLJJIII;
        if (interfaceC21328018dK2 != null) {
            interfaceC21328018dK2.onEnd();
        }
        setDispatchDrawListener$myna_render_release(null);
    }

    @Override // X.AbstractC21332918e7, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC21333318eB<?> abstractC21333318eB = this.LLJILLL;
        if (abstractC21333318eB != null) {
            C21325918cz c21325918cz = abstractC21333318eB.LL;
            if (!c21325918cz.LIZ.LJJIJIIJI && c21325918cz.LJJIIJ > 0) {
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                abstractC21333318eB.LJIJI(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setBackgroundColor(String str) {
        TextView textView = this.LLJILJIL;
        if (textView != null) {
            textView.setBackgroundColor(ColorProtector.parseColor(str));
        }
    }

    public final void setCreateLayoutListener$myna_render_release(InterfaceC21327918dJ interfaceC21327918dJ) {
        this.LLJJI = interfaceC21327918dJ;
    }

    public final void setDispatchDrawListener$myna_render_release(InterfaceC21328018dK interfaceC21328018dK) {
        this.LLJJIII = interfaceC21328018dK;
    }

    public final void setRootViewManager$myna_render_release(AbstractC21333318eB<?> abstractC21333318eB) {
        boolean z;
        if (this.LLJILLL == null) {
            z = true;
        } else {
            z = false;
        }
        C1325860kbg.LIZLLL(z, null, AFwS223S0000000_32.get$arr$(225), C2097608Jq.LJ());
        LJI();
        this.LLJILLL = abstractC21333318eB;
        addChildAt(abstractC21333318eB.LLILZLL, 0);
        addView(abstractC21333318eB.getView(), 0);
    }

    @Override // X.AbstractC21332918e7, android.view.View
    public final void onMeasure(int i, int i2) {
        InterfaceC21327918dJ interfaceC21327918dJ = this.LLJJI;
        if (interfaceC21327918dJ != null) {
            interfaceC21327918dJ.onStart();
        }
        super.onMeasure(i, i2);
        InterfaceC21327918dJ interfaceC21327918dJ2 = this.LLJJI;
        if (interfaceC21327918dJ2 != null) {
            interfaceC21327918dJ2.LIZ(false);
        }
        TextView textView = this.LLJILJIL;
        if (textView != null) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.LLJILJILJ, 1073741824));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21327718dH(C21326718d7 c21326718d7, String str, int i) {
        super(c21326718d7.LIZ, null, 0);
        str = (i & 8) != 0 ? "" : str;
        this.LLIZLLLIL = c21326718d7;
        this.LLJ = str;
        this.LLJI = c21326718d7.LIZ;
        C21339618fC c21339618fCLJ = C21333518eD.LJ(this, false);
        c21339618fCLJ.setFlexDirection(C14QL.COLUMN);
        c21339618fCLJ.setAlignItems(C14QJ.STRETCH);
        c21339618fCLJ.setMeasureFunction(null);
        this.LLJIJIL = c21339618fCLJ;
        this.LLJILJILJ = 40;
        setId(2022101921);
        this.LL = c21339618fCLJ;
        setImportantForAccessibility(2);
        C1168270gVV c1168270gVV = C1168270gVV.LIZ;
        String str2 = c21326718d7.LIZIZ;
        c1168270gVV.getClass();
        if (C1168270gVV.LIZ(str2)) {
            C742060T8y.LIZ(new ARunnableS128S0100000_28(this, 109));
        }
        if (C1168270gVV.LJI()) {
            setClipChildren(false);
        }
    }

    @Override // X.AbstractC21332918e7, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EnumC21334518eN enumC21334518eN;
        InterfaceC21327918dJ interfaceC21327918dJ = this.LLJJI;
        if (interfaceC21327918dJ != null) {
            interfaceC21327918dJ.onStart();
        }
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC21327918dJ interfaceC21327918dJ2 = this.LLJJI;
        if (interfaceC21327918dJ2 != null) {
            interfaceC21327918dJ2.LIZ(true);
        }
        setCreateLayoutListener$myna_render_release(null);
        AbstractC21333318eB<?> abstractC21333318eB = this.LLJILLL;
        if (abstractC21333318eB != null && isAttachedToWindow() && (i3 - i == 0 || i4 - i2 == 0)) {
            boolean zLJJJJLI = abstractC21333318eB.LJJJJLI();
            C21325918cz c21325918cz = abstractC21333318eB.LL;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (!zLJJJJLI && c21325918cz.LJIJ != 0 && layoutParams.height != 0 && layoutParams.width != 0) {
                C21334418eM height = abstractC21333318eB.LLILZLL.getHeight();
                C21334418eM width = abstractC21333318eB.LLILZLL.getWidth();
                EnumC21334518eN enumC21334518eN2 = height.LIZIZ;
                EnumC21334518eN enumC21334518eN3 = EnumC21334518eN.POINT;
                if (((enumC21334518eN2 != enumC21334518eN3 && enumC21334518eN2 != EnumC21334518eN.PERCENT) || height.LIZ != 0.0f) && (((enumC21334518eN = width.LIZIZ) != enumC21334518eN3 && enumC21334518eN != EnumC21334518eN.PERCENT) || width.LIZ != 0.0f)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("layout size is zero,l:");
                    sbLIZ.append(i);
                    sbLIZ.append(",t:");
                    sbLIZ.append(i2);
                    sbLIZ.append(",r:");
                    sbLIZ.append(i3);
                    sbLIZ.append(",b:");
                    sbLIZ.append(i4);
                    sbLIZ.append(",bindCount:");
                    sbLIZ.append(c21325918cz.LJIJ);
                    sbLIZ.append('}');
                    new C1338670kwL(EnumC1325870kbh.LAYOUT_INVALID, 3002, C2188811AlT.LIZIZ(sbLIZ), null, 24).LIZJ(C2097908Jt.LIZJ(new Pair("template_url", this.LLJ)));
                }
            }
        }
        TextView textView = this.LLJILJIL;
        if (textView != null) {
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        }
    }
}
