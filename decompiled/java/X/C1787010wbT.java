package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787010wbT extends C09AY implements Function1<C1787000wbS, Map<String, ? extends String>> {
    public final /* synthetic */ C1787030wbV LL;
    public final /* synthetic */ C1787830wcn LLILLJJLI;
    public final /* synthetic */ Exception LLILLL;
    public final /* synthetic */ EnumC1787180wbk LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787010wbT(C1787030wbV c1787030wbV, C1787830wcn c1787830wcn, Exception exc, EnumC1787180wbk enumC1787180wbk, String str, String str2, String str3) {
        super(1);
        this.LL = c1787030wbV;
        this.LLILLJJLI = c1787830wcn;
        this.LLILLL = exc;
        this.LLILZ = enumC1787180wbk;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends String> invoke(C1787000wbS c1787000wbS) {
        C1787000wbS c1787000wbS2 = c1787000wbS;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair(c1787000wbS2.LIZIZ, String.valueOf(this.LL.LIZIZ.currentTimeMillis()));
        pairArr[1] = new Pair(c1787000wbS2.LJIIIIZZ, String.valueOf(this.LL.LIZIZ.currentTimeMillis() - this.LLILLJJLI.LJII.LIZ));
        String str = c1787000wbS2.LJFF;
        String message = this.LLILLL.getMessage();
        if (message == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error but no message ");
            sbLIZ.append(this.LLILLL.getClass().getName());
            message = C2188811AlT.LIZIZ(sbLIZ);
        }
        pairArr[2] = new Pair(str, message);
        pairArr[3] = new Pair(c1787000wbS2.LJI, String.valueOf(this.LLILZ.getCode()));
        pairArr[4] = new Pair(c1787000wbS2.LJII, this.LLILZ.getMessage());
        pairArr[5] = new Pair(c1787000wbS2.LIZJ, this.LLILZIL);
        pairArr[6] = new Pair(c1787000wbS2.LIZLLL, this.LLILZLL);
        pairArr[7] = new Pair(c1787000wbS2.LJ, this.LLIZ);
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), this.LLILLJJLI.LIZIZ()), this.LL.LIZ.getCommonEventInfo());
    }
}
