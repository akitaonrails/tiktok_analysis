package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789410wfL extends C09AY implements Function1<C1789430wfN, Map<String, ? extends String>> {
    public final /* synthetic */ AbstractC1789120wes<List<C1789670wfl>, C1788880weU<EnumC1787180wbk>> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1789460wfQ LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ C1789400wfK LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789410wfL(AbstractC1789120wes<List<C1789670wfl>, C1788880weU<EnumC1787180wbk>> abstractC1789120wes, long j, C1789460wfQ c1789460wfQ, Map<String, String> map, C1789400wfK c1789400wfK) {
        super(1);
        this.LL = abstractC1789120wes;
        this.LLILLJJLI = j;
        this.LLILLL = c1789460wfQ;
        this.LLILZ = map;
        this.LLILZIL = c1789400wfK;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends String> invoke(C1789430wfN c1789430wfN) {
        String str;
        Integer numValueOf;
        EnumC1789630wfh enumC1789630wfh;
        C1789430wfN c1789430wfN2 = c1789430wfN;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair(c1789430wfN2.LJ, CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair(c1789430wfN2.LJFF, CardStruct.IStatusCode.DEFAULT);
        String str2 = c1789430wfN2.LJI;
        C1789670wfl c1789670wfl = (C1789670wfl) C13LP.LJJJLL((List) ((C1789100weq) this.LL).LIZ);
        List<C0KQE> list = null;
        if (c1789670wfl == null || (str = c1789670wfl.LJFF) == null) {
            str = "";
        }
        pairArr[2] = new Pair(str2, str);
        String str3 = c1789430wfN2.LIZIZ;
        C1789670wfl c1789670wfl2 = (C1789670wfl) C13LP.LJJJLL((List) ((C1789100weq) this.LL).LIZ);
        if (c1789670wfl2 != null && (enumC1789630wfh = c1789670wfl2.LIZ) != null) {
            numValueOf = Integer.valueOf(enumC1789630wfh.getCode());
        } else {
            numValueOf = null;
        }
        pairArr[3] = new Pair(str3, String.valueOf(numValueOf));
        String str4 = c1789430wfN2.LIZJ;
        C1789670wfl c1789670wfl3 = (C1789670wfl) C13LP.LJJJLL((List) ((C1789100weq) this.LL).LIZ);
        if (c1789670wfl3 != null) {
            list = c1789670wfl3.LIZJ;
        }
        pairArr[4] = new Pair(str4, String.valueOf(list));
        pairArr[5] = new Pair(c1789430wfN2.LIZLLL, String.valueOf(this.LLILLJJLI));
        pairArr[6] = new Pair(c1789430wfN2.LJIIIIZZ, this.LLILLL.LJFF.toString());
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), this.LLILZ), this.LLILZIL.LIZLLL.getCommonEventInfo());
    }
}
