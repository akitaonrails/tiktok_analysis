package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0l66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1344720l66<T> extends AbstractC666100QAu<T> {
    public final C1344230l5J LL = new C1344230l5J();
    public final C0O8X LLILLJJLI = new C0O8X();

    public abstract void LJIIJ(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    public final void handleData(T t) {
        C1344230l5J c1344230l5J = this.LL;
        c1344230l5J.LIZ.put("Duration", String.valueOf(System.currentTimeMillis() - c1344230l5J.LIZIZ));
        this.LLILLJJLI.LIZ();
        super.handleData(t);
        if (t instanceof BaseResponse) {
            BaseResponse baseResponse = (BaseResponse) t;
            this.LL.LIZ(baseResponse);
            this.LLILLJJLI.LIZLLL(baseResponse);
        }
        LJIIJ(t);
    }

    @Override // X.AbstractC666100QAu
    public boolean sendRequest(Object... objArr) {
        C1344230l5J c1344230l5J = this.LL;
        c1344230l5J.LIZ.clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1344230l5J.LIZIZ = jCurrentTimeMillis;
        c1344230l5J.LIZ.put("TimeStamp", String.valueOf(jCurrentTimeMillis));
        this.LLILLJJLI.LJ();
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        return true;
    }
}
