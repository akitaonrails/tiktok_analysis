package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopupTrigger;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.trigger.SeaPdpTriggerMgr$configTriggers$1$1", f = "SeaPdpTriggerMgr.kt", l = {}, m = "invokeSuspend")
public final class C592160NKk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<PopupTrigger> LLILLJJLI;
    public final /* synthetic */ C04A9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592160NKk(List<PopupTrigger> list, C04A9 c04a9, InterfaceC1364105Vn<? super C592160NKk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c04a9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592160NKk c592160NKk = new C592160NKk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c592160NKk.LL = obj;
        return c592160NKk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC592180NKm abstractC592180NKm;
        C1C7U.LIZ("SeaPdpTriggerMgr@9230.configTriggers$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        List<PopupTrigger> list = this.LLILLJJLI;
        ArrayList<AbstractC592180NKm> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (PopupTrigger popupTrigger : list) {
            C592240NKs c592240NKs = C0NLF.Companion;
            Integer num = popupTrigger.target;
            c592240NKs.getClass();
            int i = C592170NKl.LIZ[C592240NKs.LIZ(num).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    abstractC592180NKm = new AbstractC592180NKm() { // from class: X.0NKq
                        {
                            C0NLF c0nlf = C0NLF.INVALID;
                            C0NL6 c0nl6 = C0NL6.INVALID;
                        }

                        @Override // X.AbstractC592180NKm
                        public final Unit LIZ(C04AA c04aa, SeaPdpViewModel seaPdpViewModel) {
                            C1019103yf.LIZ(EnumC1014603xw.ERR10000, null, null);
                            return Unit.LIZ;
                        }
                    };
                } else {
                    abstractC592180NKm = new AbstractC592180NKm() { // from class: X.0NKn
                        {
                            C0NLF c0nlf = C0NLF.PRE_SCENE_AUTO_CLAIMED_POPUP;
                            C0NL6 c0nl6 = C0NL6.PRE_SCENE_AUTO_CLAIMED_POPUP_SCENE;
                        }

                        @Override // X.AbstractC592180NKm
                        public final Unit LIZ(C04AA c04aa, SeaPdpViewModel seaPdpViewModel) {
                            c04aa.LIZIZ(seaPdpViewModel, this.LIZIZ, null);
                            return Unit.LIZ;
                        }
                    };
                }
            } else {
                abstractC592180NKm = new AbstractC592180NKm() { // from class: X.0NKp
                    {
                        C0NLF c0nlf = C0NLF.PROMOTION_TRIGGER_POPUP;
                        C0NL6 c0nl6 = C0NL6.PROMOTION_TRIGGER_POPUP_SCENE;
                    }

                    @Override // X.AbstractC592180NKm
                    public final Unit LIZ(final C04AA c04aa, final SeaPdpViewModel seaPdpViewModel) {
                        IEcUgPitayaService iEcUgPitayaService = (IEcUgPitayaService) PluggableExtentionKt.pluggableSpi$default(IEcUgPitayaService.class, false, false, false, 14, null);
                        if (iEcUgPitayaService != null) {
                            iEcUgPitayaService.LJIIIIZZ("real_time_surprise_voucher_action", new InterfaceC13038058i() { // from class: X.0NKo
                                @Override // X.InterfaceC13038058i
                                public final void N0(String str, long j, JSONObject jSONObject) {
                                    c04aa.LIZIZ(seaPdpViewModel, this.LIZIZ, jSONObject);
                                }
                            }, seaPdpViewModel.LLLZZIL);
                        }
                        return Unit.LIZ;
                    }
                };
            }
            arrayList.add(abstractC592180NKm);
        }
        C04A9 c04a9 = this.LLILLL;
        for (AbstractC592180NKm abstractC592180NKm2 : arrayList) {
            C0NLF c0nlf = abstractC592180NKm2.LIZ;
            if (c0nlf == null) {
                c0nlf = C0NLF.INVALID;
            }
            C04AA c04aaLIZ = c04a9.LIZ(c0nlf);
            if (c04aaLIZ != null) {
                C23250099c.LIZIZ(interfaceC497601wk, null, null, new C592150NKj(abstractC592180NKm2, c04aaLIZ, c04a9, null), 3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpTriggerMgr@9230.configTriggers$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
