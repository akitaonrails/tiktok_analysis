package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;

/* JADX INFO: renamed from: X.0LRS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0LRS<IN extends C09JG, OUT extends AbsTaskOutput> implements InterfaceC543000LRi<IN, OUT> {
    public final C0LTN<IN, OUT> LIZ;
    public final C0LM6 LIZIZ;
    public C0LM6 LIZJ = C0LM6.STEP_DEFAULT;

    public abstract IN LIZJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput);

    public abstract C0LSZ LJ(C0LSZ c0lsz, PublicTaskInput publicTaskInput, OUT out);

    public C0LM6 LIZIZ() {
        return this.LIZIZ;
    }

    public C0LTN<IN, OUT> LIZLLL() {
        return this.LIZ;
    }

    public C0LSZ LIZ(C0LSZ c0lsz) {
        return new C0LSZ((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (Source) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, 0L, (String) null, 0L, (TaskLogExtra) null, (QuotaResult) null, 0, (String) null, 268435455);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LRS(C0LTN<? super IN, ? extends OUT> c0ltn, C0LM6 c0lm6) {
        this.LIZ = c0ltn;
        this.LIZIZ = c0lm6;
    }
}
