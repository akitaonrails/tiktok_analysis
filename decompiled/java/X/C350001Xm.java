package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.StoryStatusResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.repo.SocPubStatusRepository$requestSocPubStatus$1$1", f = "SocPubStatusRepository.kt", l = {78}, m = "invokeSuspend")
public final class C350001Xm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC2329309At<StoryStatusResponse> LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C350001Xm(InterfaceC2329309At<StoryStatusResponse> interfaceC2329309At, List<String> list, boolean z, List<String> list2, InterfaceC1364105Vn<? super C350001Xm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC2329309At;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C350001Xm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        Object objLIZIZ = obj;
        C1C7U.LIZ("SocPubStatusRepository@596a.requestSocPubStatus$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                List<String> list = this.LLILLL;
                boolean z2 = this.LLILZ;
                List<String> list2 = this.LLILZIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zLIZ = C298480Bmw.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
                sbLIZ2.append(']');
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                this.LL = 1;
                objLIZIZ = C1604750rrV.LIZIZ(strLIZIZ, z, zLIZ, strLIZIZ2, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("SocPubStatusRepository@596a.requestSocPubStatus$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = (StoryStatusResponse) objLIZIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (this.LLILLJJLI.isDisposed()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocPubStatusRepository@596a.requestSocPubStatus$1$1");
            return unit;
        }
        if (c098200Yq != null) {
            this.LLILLJJLI.onSuccess((StoryStatusResponse) c098200Yq);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SocPubStatusRepository@596a.requestSocPubStatus$1$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SocPubStatusRepository@596a.requestSocPubStatus$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
