package X;

import android.text.TextUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Q0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.UrlShorter$fetchShortenUrl$1$1$job$1", f = "UrlShorter.kt", l = {}, m = "invokeSuspend")
public final class C05Q0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Q0(C259800zU<String> c259800zU, String str, String str2, C259800zU<String> c259800zU2, boolean z, int i, InterfaceC1364105Vn<? super C05Q0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c259800zU2;
        this.LLILZIL = z;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Q0(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        T tLIZLLL;
        C1C7U.LIZ("UrlShorter@e6cd.fetchShortenUrl$1$1$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<String> c259800zU = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ.element;
        int i = this.LLILZLL;
        if (TextUtils.isEmpty(str3)) {
            tLIZLLL = 0;
        } else {
            tLIZLLL = C621180OYa.LIZIZ.LJIJI(i, str, str2, str3).LIZLLL();
        }
        c259800zU.element = tLIZLLL;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UrlShorter@e6cd.fetchShortenUrl$1$1$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
