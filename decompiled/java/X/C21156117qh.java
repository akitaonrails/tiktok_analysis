package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.event.data.TTKECMMKGlobalContextModule;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS169S0101000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21156117qh extends AbstractC21154817qU implements InterfaceC1768080w6w {
    public final FrameLayout LLJILJILJ;
    public C1772770wEV LLJILLL;
    public C2252611DEt LLJJ;
    public final C1214110hhR LLJJI;

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
        C2252611DEt c2252611DEt = this.LLJJ;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        this.LLJJ = null;
    }

    @Override // X.AbstractC21154817qU
    public final void LJIILLIIL() {
        C1772770wEV c1772770wEV = this.LLJILLL;
        if (c1772770wEV != null) {
            c1772770wEV.release();
        }
        this.LLJILLL = null;
    }

    @Override // X.AbstractC21154817qU
    /* JADX INFO: renamed from: LJIIL */
    public final /* bridge */ /* synthetic */ C1771930wD9 Y4() {
        return this.LLJJI;
    }

    @Override // X.AbstractC21154817qU, X.InterfaceC21155017qW
    public final /* bridge */ /* synthetic */ View Y4() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1768080w6w
    public final void LIZ(boolean z) {
        if (this.LLILZLL) {
            return;
        }
        if (this.LLJJ != null) {
            if (z) {
                new AwS576S0100000_32(this, 727);
                C324990Cob.LIZIZ(this.LLJJ);
                this.LLJJ = null;
                return;
            }
            return;
        }
        if (this.LLILLJJLI.LJFF == null) {
            return;
        }
        C21155417qa.LJI(this, z, 0, null);
    }

    @Override // X.AbstractC21154817qU
    public final void LJIILJJIL(ConstraintLayout constraintLayout) {
        C1905750zgz.LIZIZ.LIZJ(EnumC1584360rKc.SHOP_CART);
        this.LL.LIZLLL.M4(this);
        C786410Ut5.LJJJZ(this.LLJJI, this.LLJILJILJ);
    }

    public C21156117qh(C1771760wCs c1771760wCs, C21156817qo c21156817qo, C21156217qi c21156217qi, View view, FrameLayout frameLayout) {
        super(c1771760wCs, c21156817qo, c21156217qi, view);
        this.LLJILJILJ = frameLayout;
        C1214110hhR c1214110hhR = new C1214110hhR(view.getContext());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1214110hhR);
        c1214110hhR.setAlpha(0.0f);
        this.LLJJI = c1214110hhR;
        c1771760wCs.LIZLLL.L4(this);
    }

    @Override // X.AbstractC21154817qU
    public final void LJIIZILJ(ConstraintLayout constraintLayout, int i, final AwS681S0100000_32 awS681S0100000_32, final AwS576S0100000_32 awS576S0100000_32, final AwS169S0101000_32 awS169S0101000_32) {
        int iLIZIZ;
        long jLongValue;
        FrameLayout frameLayout = this.LLJILJILJ;
        C1214110hhR c1214110hhR = this.LLJJI;
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
        frameLayout.addView(c1214110hhR, new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ2));
        C1772770wEV c1772770wEVLIZ = C0WOY.LIZ(C0WOW.SPARK_LITE);
        Context context = this.LLILZ.getContext();
        View view = this.LLILZ;
        C21156217qi c21156217qi = this.LLILLL;
        String str = c21156217qi.LIZ;
        String str2 = c21156217qi.LIZIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ecGlobalContext", new C1311220kE4(TTKECMMKGlobalContextModule.class, Collections.singletonList(this.LL.LIZIZ))));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(InterfaceC606320NqI.class, new C1544630qIX(this.LL.LIZ)), new Pair(InterfaceC599750Nfh.class, new C1544630qIX(this.LL.LIZIZ)), new Pair(InterfaceC21155017qW.class, new C1544630qIX(this)));
        C1771760wCs c1771760wCs = this.LL;
        String strOptString = null;
        View viewLJI = c1772770wEVLIZ.LJI(context, new C1772800wEY(str, str2, mapLJIIIIZZ, mapLJIIJ, null, null, false, c1771760wCs.LIZIZ, C2097908Jt.LIZJ(new Pair("shop_mix_mall_global_data", c1771760wCs.LIZJ)), null, false, null, "bubble_view", null, 48356), null, new AbstractC1772940wEm() { // from class: X.17qG
            @Override // X.AbstractC1772940wEm
            public final void LIZJ() {
                new AwS576S0100000_32(this, 728);
                awS681S0100000_32.invoke(Boolean.TRUE, null, null);
            }

            @Override // X.AbstractC1772940wEm
            public final void LJ(Map<String, Object> map) {
                float f;
                int iLIZIZ3;
                new AwS576S0100000_32(this, 729);
                C21156117qh c21156117qh = this;
                c21156117qh.getClass();
                int[] iArr = new int[2];
                C20516615Pw.LIZ(c21156117qh.LLILZ, iArr, Boolean.valueOf(c21156117qh.LLJ), Integer.valueOf(c21156117qh.LLJI));
                int[] iArr2 = new int[2];
                C20516615Pw.LIZ(c21156117qh.LLJJI, iArr2, Boolean.valueOf(c21156117qh.LLJ), Integer.valueOf(c21156117qh.LLJI));
                float f2 = iArr[0] - iArr2[0];
                float f3 = iArr[1] - iArr2[1];
                int measuredWidth = c21156117qh.LLILZ.getMeasuredWidth();
                int measuredWidth2 = c21156117qh.LLJJI.getMeasuredWidth();
                int i4 = C21153817qK.LIZ[c21156117qh.LLILLL.LJIIIIZZ.ordinal()];
                if (i4 != 1) {
                    int i5 = measuredWidth - measuredWidth2;
                    if (i4 != 2) {
                        f = i5 / 2.0f;
                    } else {
                        f = i5;
                    }
                } else {
                    f = 0.0f;
                }
                View viewFindViewById = c21156117qh.LLILZ.findViewById(R.id.v8l);
                if (viewFindViewById != null) {
                    iLIZIZ3 = viewFindViewById.getMeasuredHeight();
                } else {
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
                C20516615Pw.LIZLLL(c21156117qh.LLJJI, f2 + f);
                C1214110hhR c1214110hhR2 = c21156117qh.LLJJI;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1214110hhR2);
                c1214110hhR2.setTranslationY(f3 + ((c21156117qh.LLILZ.getMeasuredHeight() + iLIZIZ3) / 2.0f));
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C21157817qy(this, awS576S0100000_32, awS169S0101000_32, awS681S0100000_32, null), 3);
            }

            @Override // X.AbstractC1772940wEm
            public final void LIZ(Integer num, String str3) {
                Map<String, Object> mapLJIIJ2;
                new AwS147S1200000_32(this, num, str3, 17);
                InterfaceC1631620sYq<Boolean, Pair<Integer, String>, Map<String, Object>, Unit> interfaceC1631620sYq = awS681S0100000_32;
                Boolean bool = Boolean.FALSE;
                Pair<Integer, String> pair = new Pair<>(num, "lynx error");
                if (str3 != null) {
                    mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("lynx_error_info", str3));
                } else {
                    mapLJIIJ2 = null;
                }
                interfaceC1631620sYq.invoke(bool, pair, mapLJIIJ2);
                C21156117qh c21156117qh = this;
                C21156817qo.LIZIZ(c21156117qh.LLILLJJLI, c21156117qh, 0, false, false, C21155317qZ.LIZ, null, 65);
            }
        }, null, view);
        if (viewLJI != null) {
            C1214110hhR c1214110hhR2 = this.LLJJI;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJIIIZ))));
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJIIJ)));
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJIIJJI))));
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLL.LJIIL)));
            c1214110hhR2.addView(viewLJI, layoutParams);
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(this.LLILLL.LIZIZ).optJSONObject("resource");
                if (jSONObjectOptJSONObject != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("da_params");
                    Long lValueOf = null;
                    if (jSONObjectOptJSONObject2 != null) {
                        strOptString = jSONObjectOptJSONObject2.optString("bubble_text_type");
                    }
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("config");
                    if (jSONObjectOptJSONObject3 != null && (lValueOf = Long.valueOf(jSONObjectOptJSONObject3.optLong("duration", 0L))) != null) {
                        lValueOf = Long.valueOf(lValueOf.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    }
                    C1905750zgz c1905750zgz = C1905750zgz.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("shop_");
                    sbLIZ.append(strOptString);
                    sbLIZ.append("_cart");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.SHOP_CART;
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    } else {
                        jLongValue = 3000;
                    }
                    c1905750zgz.LJIIIIZZ(new C1906460zi8(strLIZIZ, enumC1584360rKc, true, jLongValue, EnumC1619300sEy.JUMP_NEW_PAGE, null));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                new C5182020e(e, 478);
            }
            this.LLJJI.setLynxViewClickListener(new View.OnClickListener() { // from class: X.0sEs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C1905750zgz.LIZIZ.LJI(EnumC1584360rKc.SHOP_CART, EnumC1905820zh6.CLICK_TOOLTIPS);
                }
            });
        }
        this.LLJILLL = c1772770wEVLIZ;
    }
}
