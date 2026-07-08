package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789420wfM extends C09AY implements Function1<C1789430wfN, Map<String, ? extends String>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AbstractC1789120wes<List<C1789670wfl>, C1788880weU<EnumC1787180wbk>> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1789460wfQ LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ C1789400wfK LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789420wfM(String str, AbstractC1789120wes<List<C1789670wfl>, C1788880weU<EnumC1787180wbk>> abstractC1789120wes, long j, C1789460wfQ c1789460wfQ, Map<String, String> map, C1789400wfK c1789400wfK) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = abstractC1789120wes;
        this.LLILLL = j;
        this.LLILZ = c1789460wfQ;
        this.LLILZIL = map;
        this.LLILZLL = c1789400wfK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends String> invoke(C1789430wfN c1789430wfN) {
        C1789430wfN c1789430wfN2 = c1789430wfN;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(c1789430wfN2.LJ, "301");
        pairArr[1] = new Pair(c1789430wfN2.LJFF, this.LL);
        String str = c1789430wfN2.LJI;
        String message = ((C1788880weU) ((C1789110wer) this.LLILLJJLI).LIZ).LIZIZ.getMessage();
        if (message == null) {
            message = "";
        }
        pairArr[2] = new Pair(str, message);
        pairArr[3] = new Pair(c1789430wfN2.LJII, String.valueOf(((EnumC1787180wbk) ((C1788880weU) ((C1789110wer) this.LLILLJJLI).LIZ).LIZ).getCode()));
        pairArr[4] = new Pair(c1789430wfN2.LIZLLL, String.valueOf(this.LLILLL));
        pairArr[5] = new Pair(c1789430wfN2.LJIIIIZZ, this.LLILZ.LJFF.toString());
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), this.LLILZIL), this.LLILZLL.LIZLLL.getCommonEventInfo());
    }
}
