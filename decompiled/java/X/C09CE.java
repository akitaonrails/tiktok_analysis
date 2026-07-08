package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.GsonTypeAdapterOpt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09CE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09CE extends C09AY implements Function0<GsonTypeAdapterOpt> {
    public C09CE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final GsonTypeAdapterOpt invoke() {
        try {
            C844470XAv.LIZ.getClass();
            String strLIZLLL = C08Q0.LIZLLL(C844470XAv.LIZ(), "gson_opt_reflect_opt3", "");
            return C703302op.LIZ(strLIZLLL) ? (GsonTypeAdapterOpt) new Gson().LJII(strLIZLLL, GsonTypeAdapterOpt.class) : C09CD.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C09CD.LIZ;
        }
    }
}
