package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08iy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.GetAwemeOperator$Companion$getAwemeInfoAsync$1", f = "GetAwemeOperator.kt", l = {}, m = "invokeSuspend")
public final class C2195808iy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Aweme>>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2195808iy(String str, InterfaceC1364105Vn<? super C2195808iy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2195808iy(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Aweme aweme;
        C1C7U.LIZ("GetAwemeOperator$Companion@2433.getAwemeInfoAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("aid is empty!");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append(']');
        String imprId = null;
        BatchDetailList batchDetailListLIZ = C23053091n.LIZ(0, C2188811AlT.LIZIZ(sbLIZ), null, null, null);
        List<Aweme> list = batchDetailListLIZ.items;
        if (list != null && (aweme = (Aweme) C13LP.LJJJJZI(list)) != null) {
            LogPbBean logPbBean = batchDetailListLIZ.logPbBean;
            if (logPbBean != null) {
                imprId = logPbBean.getImprId();
            }
            aweme.setRequestId(imprId);
            C189200o6.m2constructorimpl(aweme);
            obj2 = aweme;
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(obj2);
            C1C7U.LIZIZ("GetAwemeOperator$Companion@2433.getAwemeInfoAsync$1");
            return c189200o6M1boximpl;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("response can't find target aweme(");
        sbLIZ2.append(str);
        sbLIZ2.append(")! logId: ");
        sbLIZ2.append(batchDetailListLIZ.requestId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Aweme>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
