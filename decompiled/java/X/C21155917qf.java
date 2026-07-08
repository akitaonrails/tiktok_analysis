package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.mixmall.event.data.TTKECMMKGlobalContextModule;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS169S0101000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.17qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21155917qf extends AbstractC21154817qU implements InterfaceC1768080w6w {
    public C1772770wEV LLJILJILJ;
    public C2252611DEt LLJILLL;

    @Override // X.InterfaceC1768080w6w
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJ(int i) {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJI() {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJIIIIZZ(int i, boolean z) {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJIIJ(boolean z) {
    }

    @Override // X.AbstractC21154817qU
    public final void LJIILL() {
        C2252611DEt c2252611DEt = this.LLJILLL;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        this.LLJILLL = null;
    }

    @Override // X.AbstractC21154817qU
    public final void LJIILLIIL() {
        C1772770wEV c1772770wEV = this.LLJILJILJ;
        if (c1772770wEV != null) {
            c1772770wEV.release();
        }
        this.LLJILJILJ = null;
    }

    @Override // X.InterfaceC1768080w6w
    public final void LIZ(boolean z) {
        if (!this.LLILZLL && this.LLJILLL != null && z) {
            new AwS576S0100000_32(this, 716);
            C324990Cob.LIZIZ(this.LLJILLL);
            this.LLJILLL = null;
        }
    }

    @Override // X.AbstractC21154817qU
    public final void LJIILJJIL(ConstraintLayout constraintLayout) {
        this.LL.LIZLLL.M4(this);
        C786410Ut5.LJJLI(this.LLJILJIL, constraintLayout);
    }

    public C21155917qf(C1771760wCs c1771760wCs, C21156817qo c21156817qo, C21156217qi c21156217qi, View view) {
        super(c1771760wCs, c21156817qo, c21156217qi, view);
        c1771760wCs.LIZLLL.L4(this);
    }

    @Override // X.AbstractC21154817qU
    public final void LJIIZILJ(ConstraintLayout constraintLayout, int i, final AwS681S0100000_32 awS681S0100000_32, final AwS576S0100000_32 awS576S0100000_32, final AwS169S0101000_32 awS169S0101000_32) {
        int iLIZIZ;
        View view = this.LLJILJIL;
        int childCount = constraintLayout.getChildCount();
        if (i <= childCount) {
            childCount = i;
        }
        int i2 = this.LLILLL.LJFF;
        int iLIZIZ2 = -2;
        if (i2 < 0) {
            iLIZIZ = -1;
        } else if (i2 == 0) {
            iLIZIZ = -2;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        }
        int i3 = this.LLILLL.LJI;
        if (i3 < 0) {
            iLIZIZ2 = -1;
        } else if (i3 != 0) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        }
        C19ME c19me = new C19ME(iLIZIZ, iLIZIZ2);
        c19me.bottomToBottom = 0;
        int i4 = C21153917qL.LIZ[this.LLILLL.LJIIIIZZ.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                c19me.startToStart = 0;
                c19me.endToEnd = 0;
            } else {
                c19me.endToEnd = 0;
            }
        } else {
            c19me.startToStart = 0;
        }
        constraintLayout.addView(view, childCount, c19me);
        C1772770wEV c1772770wEVLIZ = C0WOY.LIZ(C0WOW.SPARK_LITE);
        Context context = this.LLILZ.getContext();
        View view2 = this.LLILZ;
        C21156217qi c21156217qi = this.LLILLL;
        String str = c21156217qi.LIZ;
        String str2 = c21156217qi.LIZIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ecGlobalContext", new C1311220kE4(TTKECMMKGlobalContextModule.class, Collections.singletonList(this.LL.LIZIZ))));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(InterfaceC606320NqI.class, new C1544630qIX(this.LL.LIZ)), new Pair(InterfaceC599750Nfh.class, new C1544630qIX(this.LL.LIZIZ)), new Pair(InterfaceC21155017qW.class, new C1544630qIX(this)));
        C1771760wCs c1771760wCs = this.LL;
        View viewLJI = c1772770wEVLIZ.LJI(context, new C1772800wEY(str, str2, mapLJIIIIZZ, mapLJIIJ, null, null, false, c1771760wCs.LIZIZ, C2097908Jt.LIZJ(new Pair("shop_mix_mall_global_data", c1771760wCs.LIZJ)), null, false, null, "bubble_view", null, 48356), null, new AbstractC1772940wEm() { // from class: X.17qE
            @Override // X.AbstractC1772940wEm
            public final void LIZJ() {
                new AwS576S0100000_32(this, 717);
                awS681S0100000_32.invoke(Boolean.TRUE, null, null);
            }

            @Override // X.AbstractC1772940wEm
            public final void LJ(Map<String, Object> map) {
                new AwS576S0100000_32(this, 718);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C21157917qz(this, awS576S0100000_32, awS169S0101000_32, awS681S0100000_32, null), 3);
            }

            @Override // X.AbstractC1772940wEm
            public final void LIZ(Integer num, String str3) {
                Map<String, Object> mapLJIIJ2;
                new AwS147S1200000_32(this, num, str3, 15);
                InterfaceC1631620sYq<Boolean, Pair<Integer, String>, Map<String, Object>, Unit> interfaceC1631620sYq = awS681S0100000_32;
                Boolean bool = Boolean.FALSE;
                Pair<Integer, String> pair = new Pair<>(num, "lynx error");
                if (str3 != null) {
                    mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("lynx_error_info", str3));
                } else {
                    mapLJIIJ2 = null;
                }
                interfaceC1631620sYq.invoke(bool, pair, mapLJIIJ2);
                C21155917qf c21155917qf = this;
                C21156817qo.LIZIZ(c21155917qf.LLILLJJLI, c21155917qf, 0, false, false, C21155317qZ.LIZ, null, 65);
            }
        }, null, view2);
        if (viewLJI != null) {
            C1771930wD9 c1771930wD9 = this.LLJILJIL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJIIIZ))));
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJIIJ)));
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJIIJJI))));
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJIIL)));
            c1771930wD9.addView(viewLJI, layoutParams);
        }
        this.LLJILJILJ = c1772770wEVLIZ;
    }
}
