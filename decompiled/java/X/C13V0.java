package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.13V0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13V0 implements IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C15LD LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC1635410sex interfaceC1635410sex) {
        InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
        if (interfaceC1635410sex2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.LIZ);
            interfaceC1635410sex2.LJFF(arrayList, false, null, new IFetchEffectListListener() { // from class: X.15LC
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C15LD c15ld = this.LIZ.LIZIZ.LJFF.LJFF;
                    if (c15ld != null) {
                        c15ld.LIZ(new C1661050tKJ());
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<Effect> list) {
                    List<Effect> list2 = list;
                    if (list2 != null && list2.size() > 0 && ListProtector.get(list2, 0) != null) {
                        C13V0 c13v0 = this.LIZ;
                        C15LD c15ld = c13v0.LIZIZ;
                        C1661090tKN c1661090tKN = c15ld.LJFF.LJI(c15ld.LIZ, c13v0.LIZ).LIZ.LJII;
                        if (c1661090tKN != null) {
                            c1661090tKN.LJIILIIL = this.LIZ.LIZ;
                            c1661090tKN.LJIILJJIL = (Effect) ListProtector.get(list2, 0);
                        }
                        C13V0 c13v02 = this.LIZ;
                        c13v02.LIZIZ.LIZIZ((Effect) ListProtector.get(list2, 0), c13v02.LIZ);
                    }
                }
            });
        }
    }

    public C13V0(C15LD c15ld, String str) {
        this.LIZIZ = c15ld;
        this.LIZ = str;
    }
}
