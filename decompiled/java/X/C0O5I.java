package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0O5I, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O5I implements InterfaceC346201Wa<C612150Nzh> {
    public final /* synthetic */ InterfaceC346201Wa LL;
    public final /* synthetic */ Function0 LLILLJJLI = null;
    public final /* synthetic */ C0O5K LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super C612150Nzh> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = this.LL.collect(new C0O5G(interfaceC346701Wf, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public C0O5I(InterfaceC346201Wa interfaceC346201Wa, C0O5K c0o5k, Aweme aweme, String str, int i, String str2, boolean z, long j) {
        this.LL = interfaceC346201Wa;
        this.LLILLL = c0o5k;
        this.LLILZ = aweme;
        this.LLILZIL = str;
        this.LLILZLL = i;
        this.LLIZ = str2;
        this.LLIZLLLIL = z;
        this.LLJ = j;
    }
}
