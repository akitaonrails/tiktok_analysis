package X;

import Y.ARunnableS81S0200000_12;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.BillboardOverlayShowEvent;
import com.bytedance.android.livesdk.broadcast.BillboardOverlayToastType;
import com.bytedance.android.livesdk.broadcast.setting.LiveBillboardLimitSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769050UEt extends C768770UDr {
    public final DataChannel LIZJ;
    public final View LIZLLL;
    public final InterfaceC768780UDs LJ;
    public ARunnableS81S0200000_12 LJFF;
    public boolean LJI;
    public final C0U78 LJII;

    public final void LIZJ() {
        float f;
        String strJ3;
        Integer numValueOf;
        Integer numValueOf2;
        C0U78 c0u78 = this.LJII;
        if (LiveBillboardLimitSetting.INSTANCE.enable()) {
            InterfaceC768780UDs interfaceC768780UDs = this.LIZIZ;
            int iIntValue = (interfaceC768780UDs == null || (numValueOf2 = Integer.valueOf(interfaceC768780UDs.LJ())) == null) ? 720 : numValueOf2.intValue();
            InterfaceC768780UDs interfaceC768780UDs2 = this.LIZIZ;
            int iIntValue2 = (interfaceC768780UDs2 == null || (numValueOf = Integer.valueOf(interfaceC768780UDs2.LIZJ())) == null) ? 1280 : numValueOf.intValue();
            int iLJFF = C14KS.LJFF();
            int iLIZJ = C14KS.LIZJ(C176600m4.LIZ());
            if (iIntValue == 0 || iIntValue2 == 0 || iLJFF == 0 || iLIZJ == 0) {
                return;
            }
            float f2 = (iIntValue * 1.0f) / iIntValue2;
            float f3 = iLJFF;
            float f4 = iLIZJ;
            float fMin = 12.0f;
            if ((1.0f * f3) / f4 < f2) {
                f = 57.0f;
            } else {
                fMin = 12.0f + Math.min((f3 - (f2 * f4)) / 2, 40.0f);
                f = 0.0f;
            }
            C500260Jjc.LJIL();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("top", Float.valueOf(C497740JfY.LIZIZ(160.0f)));
            jSONObject2.put("left", Float.valueOf(C497740JfY.LIZIZ(fMin)));
            jSONObject2.put("right", Float.valueOf(C497740JfY.LIZIZ(fMin)));
            jSONObject2.put("bottom", Float.valueOf(C497740JfY.LIZIZ(306.0f - f)));
            jSONObject.put("safe_area", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", iLJFF);
            jSONObject3.put("height", Float.valueOf(f4 - C497740JfY.LIZIZ(f)));
            jSONObject.put("canvas", jSONObject3);
            strJ3 = C786410Ut5.J3(jSONObject);
        } else {
            strJ3 = LIZ(160.0f, 160.0f, 306.0f);
        }
        if (strJ3 != null) {
            c0u78.setRenderCacheString("billboard_effect", strJ3);
        }
    }

    public static C769070UEv LIZLLL(n nVar) {
        Object c098200Yq;
        int iLJIIJJI = -1;
        if (nVar == null) {
            return new C769070UEv(-1, 14);
        }
        if (nVar.LJJIJIIJIL("toast")) {
            try {
                iLJIIJJI = nVar.LJJIIZ("toast").LJIIJJI();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String strLJIJI = C497740JfY.LJIJI(2131841482);
        String strLJIJI2 = C497740JfY.LJIJI(2131841482);
        boolean z = false;
        if (LiveBillboardLimitSetting.INSTANCE.enable()) {
            try {
                if (nVar.LJJIJIIJIL("key") && Intrinsics.LJFF(nVar.LJJIIZ("key").LJIL(), "Top_Atmosphere")) {
                    c098200Yq = C497740JfY.LJIJI(2131836708);
                } else {
                    z = true;
                    c098200Yq = C497740JfY.LJIJI(2131836709);
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            strLJIJI = (String) c098200Yq;
            strLJIJI2 = C497740JfY.LJIJI(2131836709);
        }
        return new C769070UEv(Integer.valueOf(iLJIIJJI), strLJIJI, strLJIJI2, Boolean.valueOf(z));
    }

    public final void LIZIZ(String str) {
        n nVar;
        if (str != null) {
            try {
                nVar = (n) C19748512Ol.LIZIZ.LJII(str, n.class);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                nVar = null;
            }
        } else {
            nVar = null;
        }
        if (nVar != null && nVar.LJJIJIIJIL("mask")) {
            try {
                if (nVar.LJJIIZ("mask").LJIIJJI() == 1) {
                    if (this.LJI) {
                        this.LIZJ.zW(BillboardOverlayToastType.class, LIZLLL(nVar));
                        return;
                    }
                    ARunnableS81S0200000_12 aRunnableS81S0200000_12 = new ARunnableS81S0200000_12(nVar, this, 168);
                    this.LJFF = aRunnableS81S0200000_12;
                    C786410Ut5.LJLIIL(ViewConfiguration.getTapTimeout(), C783270Uo1.LIZJ(), aRunnableS81S0200000_12);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ARunnableS81S0200000_12 aRunnableS81S0200000_122 = this.LJFF;
        if (aRunnableS81S0200000_122 != null) {
            C783270Uo1.LJFF(aRunnableS81S0200000_122);
            this.LJFF = null;
        }
        this.LJI = false;
        this.LIZJ.LC0(BillboardOverlayShowEvent.class, Boolean.FALSE);
        this.LIZJ.zW(BillboardOverlayToastType.class, LIZLLL(null));
    }

    public C769050UEt(DataChannel dataChannel, View view, InterfaceC768780UDs interfaceC768780UDs) {
        super(view, interfaceC768780UDs);
        this.LIZJ = dataChannel;
        this.LIZLLL = view;
        this.LJ = interfaceC768780UDs;
        this.LJII = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).composerManagerB();
    }
}
