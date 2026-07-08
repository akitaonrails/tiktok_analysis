package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nimblecard.tako.model.CardData;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0X9E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X9E extends C09AY implements Function2<Boolean, C1533790q13, Unit> {
    public final /* synthetic */ List<Integer> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X9E(long j, String str, List list, Map map) {
        super(2);
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, C1533790q13 c1533790q13) throws Throwable {
        BufferedReader bufferedReader;
        C1533790q13 c1533790q132 = c1533790q13;
        if (bool.booleanValue()) {
            String strLIZLLL = c1533790q132.LIZLLL();
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            Pair pair = null;
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                C0VSJ c0vsj = new C0VSJ(strLIZLLL);
                Reader inputStreamReader = new InputStreamReader(new C0VSP(c0vsj), Charsets.UTF_8);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                try {
                    String strLIZJ = C08KC.LIZJ(bufferedReader);
                    C2107108Nh.LIZ(bufferedReader, null);
                    long length = c0vsj.length();
                    c1227904rF.getClass();
                    pair = new Pair(C1227904rF.LIZIZ(strLIZJ, CardData.class), Long.valueOf(length));
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedReader, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("from: ");
            sbLIZ.append(c1533790q132.LJ);
            sbLIZ.append(" successFetcher");
            sbLIZ.append(c1533790q132.LJIIJ);
            C2188811AlT.LIZIZ(sbLIZ);
            C14N5.LIZ(this.LL, this.LLILLJJLI, pair, this.LLILLL, this.LLILZ, "");
        } else {
            C14N5.LIZ(this.LL, this.LLILLJJLI, null, this.LLILLL, this.LLILZ, c1533790q132.LIZLLL.toString());
        }
        return Unit.LIZ;
    }
}
