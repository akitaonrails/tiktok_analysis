package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.net.URLEncoder;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.011M, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011M extends C09AY implements Function1<Pair<? extends String, ? extends String>, CharSequence> {
    public C011M() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Pair<? extends String, ? extends String> pair) {
        String strEncode;
        Pair<? extends String, ? extends String> pair2 = pair;
        String first = pair2.getFirst();
        String second = pair2.getSecond();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(first);
        sbLIZ.append('=');
        Gson gson = C1822270xWL.LIZ;
        try {
            strEncode = URLEncoder.encode(second, "UTF-8");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strEncode = "";
        }
        sbLIZ.append(strEncode);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
