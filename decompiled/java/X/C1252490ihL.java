package X;

import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ihL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252490ihL extends AbstractC666100QAu<Pair<Integer, Aweme>> {
    public final C0S4J LL = new C0S4J("DetailModel");

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final void handleData(Pair<Integer, Aweme> pair) {
        Pair<Integer, Aweme> pair2 = pair;
        super.handleData(pair2);
        if (pair2 != null) {
            C0S4J c0s4j = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[handleData] ");
            sbLIZ.append(pair2.getFirst());
            c0s4j.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), pair2.getSecond());
        }
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        final String str;
        final int iIntValue;
        Object obj;
        Object obj2;
        Object obj3;
        if (!super.sendRequest(objArr)) {
            return false;
        }
        final String str2 = (String) objArr[0];
        final String str3 = "";
        if (objArr.length <= 1 || (obj3 = objArr[1]) == null) {
            str = "";
        } else {
            str = (String) obj3;
        }
        if (objArr.length > 2 && (obj2 = objArr[2]) != null) {
            iIntValue = ((Integer) obj2).intValue();
        } else {
            iIntValue = 0;
        }
        if (objArr.length > 3 && (obj = objArr[3]) != null) {
            str3 = (String) obj;
        }
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[sendRequest] ");
        sbLIZ.append(str);
        sbLIZ.append(",");
        sbLIZ.append(str2);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1BVK.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.0ihM
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("DetailModel@2fa7.sendRequest$1");
                Pair pairLIZIZ = DetailApi.LIZIZ(iIntValue, str2, str, str3);
                C1C7U.LIZIZ("DetailModel@2fa7.sendRequest$1");
                return pairLIZIZ;
            }
        }, 0);
        return true;
    }
}
