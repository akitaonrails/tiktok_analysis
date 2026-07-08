package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738910vLt implements InterfaceC111300bX {
    public static final /* synthetic */ int LLJI = 0;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    public final Map<String, String> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("page_name", this.LL), new Pair("enter_from", this.LLILLJJLI), new Pair("previous_page", this.LLILLL), new Pair("EVENT_ORIGIN_FEATURE", this.LLILZLL));
    }

    public C1738910vLt(String str, String str2, long j, String str3, String str4, String str5, int i) {
        String str6;
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 4) != 0 ? "" : str2;
        j = (i & 8) != 0 ? 0L : j;
        if ((i & 32) != 0) {
            str6 = "TEMAI";
        } else {
            str6 = null;
        }
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        str5 = (i & 256) != 0 ? null : str5;
        this.LL = "shop_message";
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = j;
        this.LLILZIL = false;
        this.LLILZLL = str6;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
    }
}
