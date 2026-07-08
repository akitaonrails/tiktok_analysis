package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03nI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C948603nI extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Pair<String, Object>[] LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C948603nI(int i, String str, String str2, String str3, boolean z, Pair[] pairArr) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = pairArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZIZ("error_code", Integer.valueOf(this.LL));
        c957403oi2.LIZIZ("is_success", Boolean.valueOf(this.LLILLJJLI));
        c957403oi2.LIZIZ("path", this.LLILLL);
        c957403oi2.LIZIZ("error_msg", this.LLILZ);
        c957403oi2.LIZIZ("log_id", this.LLILZIL);
        for (Pair<String, Object> pair : this.LLILZLL) {
            c957403oi2.LIZIZ(pair.getFirst(), pair.getSecond());
        }
        return Unit.LIZ;
    }
}
