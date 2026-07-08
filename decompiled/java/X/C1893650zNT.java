package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zNT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893650zNT extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ HashMap<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1893650zNT(String str, Aweme aweme, List<String> list, HashMap<String, String> map) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = list;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        return Boolean.valueOf((C2178808gE.LIZ().LJ(40) != null ? C1893630zNR.LL : C1900180zY0.LL).LIZ(this.LL, this.LLILLJJLI.getAid(), this.LLILZ, this.LLILLL));
    }
}
