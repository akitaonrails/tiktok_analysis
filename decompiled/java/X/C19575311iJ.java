package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11iJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19575311iJ implements IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Effect LIZIZ;
    public final /* synthetic */ C19574711iD LIZJ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC1635410sex interfaceC1635410sex) {
        InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
        if (interfaceC1635410sex2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.LIZ);
            interfaceC1635410sex2.LJFF(arrayList, false, this.LIZJ.LIZ.LJII(), new IFetchEffectListListener() { // from class: X.11iK
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C19575311iJ c19575311iJ = this.LIZ;
                    C19574711iD c19574711iD = c19575311iJ.LIZJ.LIZ.LJJL;
                    if (c19574711iD != null) {
                        c19574711iD.onFail(c19575311iJ.LIZIZ, exceptionResult);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<Effect> list) {
                    List<Effect> list2 = list;
                    if (list2 != null && list2.size() > 0 && ListProtector.get(list2, 0) != null) {
                        C1661090tKN c1661090tKN = this.LIZ.LIZJ.LIZ.LJIIJJI().LIZ.LJII;
                        if (c1661090tKN != null) {
                            c1661090tKN.LJIILIIL = this.LIZ.LIZ;
                            c1661090tKN.LJIILJJIL = (Effect) ListProtector.get(list2, 0);
                        }
                        C19575311iJ c19575311iJ = this.LIZ;
                        c19575311iJ.LIZJ.LIZ((Effect) ListProtector.get(list2, 0), c19575311iJ.LIZ);
                    }
                }
            });
        }
    }

    public C19575311iJ(C19574711iD c19574711iD, String str, Effect effect) {
        this.LIZJ = c19574711iD;
        this.LIZ = str;
        this.LIZIZ = effect;
    }
}
