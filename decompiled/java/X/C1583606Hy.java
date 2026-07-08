package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager$getIMUserFromDB$1", f = "IMContactManager.kt", l = {244, 246}, m = "invokeSuspend")
public final class C1583606Hy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1583606Hy(Long l, String str, InterfaceC1364105Vn<? super C1583606Hy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1583606Hy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("IMContactManager@fb8a.getIMUserFromDB$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String string = this.LLILLJJLI.toString();
                C1BG1 c1bg1 = C1BG1.LIZ;
                List listSingletonList = Collections.singletonList(string);
                c1bg1.getClass();
                if (C1BG1.LJIIL(listSingletonList).isEmpty()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMContactManager@fb8a.getIMUserFromDB$1");
                    return unit;
                }
                NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
                if (noticeFeatureLIZ != null && noticeFeatureLIZ.LJLJLJ()) {
                    z = true;
                } else {
                    z = false;
                }
                C1594206Ma c1594206Ma = new C1594206Ma(string, this.LLILLL, z, null);
                if (C1BG1.LIZ(this.LLILLL)) {
                    C913070Zrt c913070Zrt = ChatRoomAdaptiveRequestManager.LIZ;
                    C1317105Dl c1317105Dl = new C1317105Dl(c1594206Ma, null);
                    this.LL = 1;
                    if (c913070Zrt.LJLLI(this, c1317105Dl) == objLJFF) {
                        C1C7U.LIZIZ("IMContactManager@fb8a.getIMUserFromDB$1");
                        return objLJFF;
                    }
                } else {
                    this.LL = 2;
                    if (c1594206Ma.invoke(this) == objLJFF) {
                        C1C7U.LIZIZ("IMContactManager@fb8a.getIMUserFromDB$1");
                        return objLJFF;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1BG1 c1bg12 = C1BG1.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getIMUserFromDB: error=");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            c1bg12.getClass();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMContactManager@fb8a.getIMUserFromDB$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
