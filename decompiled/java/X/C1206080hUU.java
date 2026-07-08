package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.GroupCheckMsg;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.GroupForLive$updateUserGroupPermissionFromError$1", f = "GroupForLive.kt", l = {}, m = "invokeSuspend")
public final class C1206080hUU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YMW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206080hUU(C0YMW c0ymw, InterfaceC1364105Vn<? super C1206080hUU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ymw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1206080hUU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        List<Long> invalidMembers;
        C1C7U.LIZ("GroupForLive@72ad.updateUserGroupPermissionFromError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YMW c0ymw = this.LL;
        if (c0ymw != null) {
            String checkMsg = c0ymw.getCheckMsg();
            Object obj2 = null;
            if (checkMsg != null) {
                try {
                    c098200Yq = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, checkMsg);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj2 = c098200Yq;
                }
                GroupCheckMsg groupCheckMsg = (GroupCheckMsg) obj2;
                if (groupCheckMsg != null) {
                    C1206100hUW.LIZJ.getClass();
                    if (C13LP.LJJJJ(groupCheckMsg.getCheckEnum(), C1697810uHb.LJIIJJI(Integer.valueOf(EnumC992540bw4.IM_USER_GROUP_PERMISSION_CHECK_REGION.getValue()), Integer.valueOf(EnumC992540bw4.IM_USER_GROUP_PERMISSION_CHECK_AGE.getValue()), Integer.valueOf(EnumC992540bw4.IM_USER_GROUP_PERMISSION_CHECK_PUNISH.getValue()), Integer.valueOf(EnumC992540bw4.IM_USER_GROUP_PERMISSION_CHECK_AB.getValue()))) && (invalidMembers = groupCheckMsg.getInvalidMembers()) != null) {
                        Iterator<Long> it2 = invalidMembers.iterator();
                        while (it2.hasNext()) {
                            long jLongValue = it2.next().longValue();
                            IMContactApi.LIZ.getClass();
                            C069P.LIZ().LJ().LJJI(String.valueOf(jLongValue), C0ZVN.IM_FEATURE_STATUS_DISALLOWED);
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GroupForLive@72ad.updateUserGroupPermissionFromError$1");
                    return unit;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupForLive@72ad.updateUserGroupPermissionFromError$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
