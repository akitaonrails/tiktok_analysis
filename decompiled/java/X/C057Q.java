package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.exp.FrequencyDestroySettingsData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.057Q, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.frequencycontrol.impl.FrequencyControlManager$1", f = "FrequencyControlServiceImpl.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C057Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C057Q(InterfaceC1364105Vn<? super C057Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C057Q(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FrequencyControlManager@a39f.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("FrequencyControlManager@a39f.<init>$1");
                return objLJFF;
            }
        }
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check scopes that needs to be destroyed: ");
        C01GW c01gw = C057R.LIZIZ;
        sbLIZ.append(((FrequencyDestroySettingsData) c01gw.getValue()).businessScopeList);
        C2188811AlT.LIZIZ(sbLIZ);
        for (EnumC1502105uN enumC1502105uN : ((FrequencyDestroySettingsData) c01gw.getValue()).businessScopeList) {
            Iterator<T> it2 = C12883052j.LIZ(new C12918053s("", EnumC12928054c.DID, enumC1502105uN, EnumC12929054d.APP)).getAllKey().iterator();
            while (it2.hasNext()) {
                KevaImpl.getRepo((String) it2.next(), 0).clear();
            }
            Iterator<T> it3 = C12883052j.LIZ(new C12918053s(curUserId, EnumC12928054c.UID, enumC1502105uN, EnumC12929054d.APP)).getAllKey().iterator();
            while (it3.hasNext()) {
                KevaImpl.getRepo((String) it3.next(), 0).clear();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FrequencyControlManager@a39f.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C057Q(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
