package X;

import Y.AfS181S0100000_12;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.AbsMultiGuestEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769740UHk {
    public static final C01GW<String> LJI = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(39));
    public final /* synthetic */ C1103530ep5 LIZ;
    public final AbsMultiGuestEffectViewModel LIZIZ;
    public final C01GW LIZJ;
    public final C769730UHj LIZLLL;
    public final C769750UHl LJ;
    public final C769770UHn LJFF;

    public C769740UHk() {
        this(null);
    }

    public final InterfaceC769780UHo LIZ() {
        return (InterfaceC769780UHo) this.LIZJ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0UHj] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0UHl] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0UHn] */
    public C769740UHk(AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel) {
        this.LIZ = new C1103530ep5();
        this.LIZIZ = absMultiGuestEffectViewModel;
        this.LIZJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(40));
        this.LIZLLL = new C0UEW() { // from class: X.0UHj
            @Override // X.C0UEW
            public final boolean LIZ(LiveEffect liveEffect) {
                if (Intrinsics.LJFF(liveEffect.LLJI(), "")) {
                    return true;
                }
                try {
                    return this.LIZ.LIZ().LIZ(liveEffect);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }

            @Override // X.C0UEW
            public final void LIZIZ(LiveEffect liveEffect) {
                LiveData liveData;
                if (this.LIZ.LIZ().LIZ(liveEffect)) {
                    AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = this.LIZ.LIZIZ;
                    if (absMultiGuestEffectViewModel2 != null && (liveData = (LiveData) absMultiGuestEffectViewModel2.LLILZLL.getValue()) != null) {
                        liveData.setValue(liveEffect);
                        return;
                    }
                    return;
                }
                InterfaceC769780UHo interfaceC769780UHoLIZ = this.LIZ.LIZ();
                C01GW<String> c01gw = C769740UHk.LJI;
                interfaceC769780UHoLIZ.LIZIZ(C769790UHp.LIZ(), liveEffect, (C1CCC) C2032107xf.LIZ(this.LIZ.LJFF));
            }

            @Override // X.C0UEW
            public final void LIZJ(LiveEffect liveEffect) {
                String strLLJI;
                String resourceId;
                InterfaceC769650UHb interfaceC769650UHb;
                LiveData liveData;
                AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2;
                InterfaceC769000UEo interfaceC769000UEoVQ2;
                InterfaceC769000UEo interfaceC769000UEoVQ22;
                AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel3 = this.LIZ.LIZIZ;
                if (absMultiGuestEffectViewModel3 != null && (interfaceC769000UEoVQ22 = absMultiGuestEffectViewModel3.vQ2()) != null) {
                    C01GW<String> c01gw = C769740UHk.LJI;
                    interfaceC769000UEoVQ22.lr(C769790UHp.LIZ());
                }
                Long lValueOf = null;
                if (liveEffect != null) {
                    strLLJI = liveEffect.LLJI();
                } else {
                    strLLJI = null;
                }
                String str = "";
                if (!Intrinsics.LJFF(strLLJI, "") && (absMultiGuestEffectViewModel2 = this.LIZ.LIZIZ) != null && (interfaceC769000UEoVQ2 = absMultiGuestEffectViewModel2.vQ2()) != null) {
                    C01GW<String> c01gw2 = C769740UHk.LJI;
                    interfaceC769000UEoVQ2.kr(liveEffect, C769790UHp.LIZ());
                }
                C769740UHk c769740UHk = this.LIZ;
                if (liveEffect != null) {
                    liveEffect.LLJI();
                }
                c769740UHk.getClass();
                this.LIZ.getClass();
                AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel4 = this.LIZ.LIZIZ;
                if (absMultiGuestEffectViewModel4 != null && (liveData = (LiveData) absMultiGuestEffectViewModel4.LLJ.getValue()) != null) {
                    liveData.setValue(liveEffect);
                }
                AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel5 = this.LIZ.LIZIZ;
                if (absMultiGuestEffectViewModel5 != null && (interfaceC769650UHb = absMultiGuestEffectViewModel5.LLJILJILJ) != null) {
                    interfaceC769650UHb.LIZJ(liveEffect);
                }
                C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                if (liveEffect != null) {
                    lValueOf = Long.valueOf(liveEffect.getEffectId());
                }
                String strValueOf = String.valueOf(lValueOf);
                c1276840jKc.getClass();
                C1276840jKc.LJIIL(strValueOf);
                if (liveEffect != null && (resourceId = liveEffect.getResourceId()) != null) {
                    str = resourceId;
                }
                C1276840jKc.LJIILL(str);
                if (liveEffect != null) {
                    C1276840jKc.LJIIJ(liveEffect, false);
                }
            }
        };
        this.LJ = new C1CCD() { // from class: X.0UHl
            @Override // X.C1CCD
            public final void NP() {
                LiveData liveData;
                AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = this.LL.LIZIZ;
                if (absMultiGuestEffectViewModel2 == null || (liveData = (LiveData) absMultiGuestEffectViewModel2.LLJILJIL.getValue()) == null) {
                    return;
                }
                liveData.setValue(Boolean.TRUE);
            }

            @Override // X.C1CCD
            public final void uv(EffectChannelResponse effectChannelResponse) {
                if (effectChannelResponse != null) {
                    C769740UHk c769740UHk = this.LL;
                    c769740UHk.getClass();
                    ((C11NJ) c769740UHk.LIZ.LIZ.getValue()).LIZ(C11NZ.LJJJJIZL(effectChannelResponse.getAllCategoryEffects()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0UFG
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj) {
                            return ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).convertStickerBean((Effect) obj);
                        }
                    }).LJLJLLL().LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS181S0100000_12(c769740UHk, 174), new C09JN() { // from class: X.00JY
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            String message;
                            C1C7U.LIZ("MultiGuestPropsStickerHandler@980a.convertStickerBeanList$3");
                            Throwable th = (Throwable) obj;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("convertStickerBeanList failed:");
                            if (th != null) {
                                message = th.getMessage();
                            } else {
                                message = null;
                            }
                            sbLIZ.append(message);
                            C20441214yg.LJ("MultiGuestPropsStickerHandler", C2188811AlT.LIZIZ(sbLIZ));
                            C1C7U.LIZIZ("MultiGuestPropsStickerHandler@980a.convertStickerBeanList$3");
                        }
                    }));
                }
            }
        };
        this.LJFF = new C1CCC() { // from class: X.0UHn
            @Override // X.C1CCC
            public final void LIZ() {
            }

            @Override // X.C1CCC
            public final void LIZIZ(LiveEffect liveEffect) {
                LiveData liveData;
                AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = this.LIZ.LIZIZ;
                if (absMultiGuestEffectViewModel2 != null && (liveData = (LiveData) absMultiGuestEffectViewModel2.LLIZLLLIL.getValue()) != null) {
                    liveData.setValue(liveEffect);
                }
            }

            @Override // X.C1CCC
            public final void LIZJ(LiveEffect liveEffect, String str) {
                LiveData liveData;
                AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = this.LIZ.LIZIZ;
                if (absMultiGuestEffectViewModel2 != null && (liveData = (LiveData) absMultiGuestEffectViewModel2.LLIZ.getValue()) != null) {
                    liveData.setValue(liveEffect);
                }
            }

            @Override // X.C1CCC
            public final void LIZLLL(LiveEffect liveEffect, String str) {
                LiveData liveData;
                AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = this.LIZ.LIZIZ;
                if (absMultiGuestEffectViewModel2 != null && (liveData = (LiveData) absMultiGuestEffectViewModel2.LLILZLL.getValue()) != null) {
                    liveData.setValue(liveEffect);
                }
            }
        };
    }
}
