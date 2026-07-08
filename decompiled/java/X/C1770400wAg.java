package X;

import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideAfterWatchWord;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartFeedVideoGuideVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartFeedVideoGuideVM$fetchData$1", f = "EcSearchNoCartFeedVideoGuideVM.kt", l = {87}, m = "invokeSuspend")
public final class C1770400wAg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EcSearchNoCartFeedVideoGuideVM LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ C1770380wAe LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ List<EcSearchFeedVideoGuideAfterWatchWord> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ float LLJIJIL;
    public final /* synthetic */ Map<String, Object> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770400wAg(EcSearchNoCartFeedVideoGuideVM ecSearchNoCartFeedVideoGuideVM, Aweme aweme, C1770380wAe c1770380wAe, String str, String str2, List<EcSearchFeedVideoGuideAfterWatchWord> list, int i, int i2, float f, Map<String, Object> map, InterfaceC1364105Vn<? super C1770400wAg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = ecSearchNoCartFeedVideoGuideVM;
        this.LLILZ = aweme;
        this.LLILZIL = c1770380wAe;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = list;
        this.LLJ = i;
        this.LLJI = i2;
        this.LLJIJIL = f;
        this.LLJILJIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1770400wAg c1770400wAg = new C1770400wAg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c1770400wAg.LLILLJJLI = obj;
        return c1770400wAg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127 A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #0 {all -> 0x0155, blocks: (B:19:0x0082, B:20:0x0085, B:22:0x008d, B:25:0x0097, B:27:0x009b, B:29:0x00ad, B:33:0x00de, B:34:0x00e2, B:36:0x00e8, B:38:0x00f3, B:41:0x0119, B:42:0x0127, B:9:0x0023, B:11:0x0055, B:15:0x005d, B:14:0x005b), top: B:51:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1770400wAg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
