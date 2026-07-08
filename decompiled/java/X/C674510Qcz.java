package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Qcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674510Qcz {
    public final String LIZ;
    public boolean LIZIZ;
    public String LIZJ;

    public final Map<String, Object> LIZ() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("ai_session_id", this.LIZ);
        pairArr[1] = new Pair("is_return_visit", this.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
        String str = this.LIZJ;
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("return_from_session_id", str);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public C674510Qcz(String str) {
        this.LIZ = str;
    }
}
