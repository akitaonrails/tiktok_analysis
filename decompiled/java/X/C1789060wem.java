package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789060wem extends C09AY implements Function1<C1789070wen, Map<String, ? extends String>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1786910wbJ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789060wem(String str, C1786910wbJ c1786910wbJ, boolean z, long j, Map<String, String> map) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c1786910wbJ;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends String> invoke(C1789070wen c1789070wen) {
        String str;
        String errorMessage;
        C1789070wen c1789070wen2 = c1789070wen;
        Pair[] pairArr = new Pair[6];
        int errorCode = 0;
        pairArr[0] = new Pair(c1789070wen2.LIZIZ, this.LL);
        String str2 = c1789070wen2.LJ;
        if (this.LLILLJJLI == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "200";
        }
        pairArr[1] = new Pair(str2, str);
        String str3 = c1789070wen2.LJFF;
        C1786910wbJ c1786910wbJ = this.LLILLJJLI;
        if (c1786910wbJ != null) {
            errorCode = c1786910wbJ.getErrorCode();
        }
        pairArr[2] = new Pair(str3, String.valueOf(errorCode));
        String str4 = c1789070wen2.LJI;
        C1786910wbJ c1786910wbJ2 = this.LLILLJJLI;
        if (c1786910wbJ2 == null || (errorMessage = c1786910wbJ2.getErrorMessage()) == null) {
            errorMessage = "";
        }
        pairArr[3] = new Pair(str4, errorMessage);
        pairArr[4] = new Pair(c1789070wen2.LIZJ, String.valueOf(this.LLILLL));
        pairArr[5] = new Pair(c1789070wen2.LIZLLL, String.valueOf(this.LLILZ));
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), this.LLILZIL);
    }
}
