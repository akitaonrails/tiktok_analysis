package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;

/* JADX INFO: renamed from: X.0skB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638650skB {
    public static final Object LIZ(InterfaceC1635390sev interfaceC1635390sev, InterfaceC1364105Vn<? super C1738190vKj<String>> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        interfaceC1635390sev.LJJJIL(CastLongProtector.parseLong(EffectPlatform.LJJJJJ()), new C13MA<GetCustomizedEffectIDData>() { // from class: X.0skA
            @Override // X.C13MA
            public final void onSuccess(GetCustomizedEffectIDData getCustomizedEffectIDData) {
                C1738190vKj c1738190vKj = new C1738190vKj(true, getCustomizedEffectIDData.getEffect_id(), 0, null, System.currentTimeMillis() - jCurrentTimeMillis, null, 44);
                InterfaceC1364105Vn<C1738190vKj<String>> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(c1738190vKj);
                interfaceC1364105Vn2.resumeWith(c1738190vKj);
            }

            @Override // X.C13MA
            public final /* bridge */ /* synthetic */ void preProcess(GetCustomizedEffectIDData getCustomizedEffectIDData) {
            }

            @Override // X.C13MA
            public final void onFail(GetCustomizedEffectIDData getCustomizedEffectIDData, C1662010tLr c1662010tLr) {
                C201955140j.LJI("JEFF", c1662010tLr.LIZLLL);
                C1738190vKj c1738190vKj = new C1738190vKj(false, null, c1662010tLr.LIZ, c1662010tLr.LIZIZ, System.currentTimeMillis() - jCurrentTimeMillis, null, 34);
                InterfaceC1364105Vn<C1738190vKj<String>> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(c1738190vKj);
                interfaceC1364105Vn2.resumeWith(c1738190vKj);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
