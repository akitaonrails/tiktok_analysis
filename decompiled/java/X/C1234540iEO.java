package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$collectSharerState$1$1", f = "SharedVideoDeepLinkHelper.kt", l = {}, m = "invokeSuspend")
public final class C1234540iEO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SharedVideoDeepLinkHelper LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ User LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1233510iCj LLILZIL;
    public final /* synthetic */ AnonymousClass0957<C189200o6<Aweme>> LLILZLL;
    public final /* synthetic */ Long LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1234540iEO(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper, boolean z, User user, String str, C1233510iCj c1233510iCj, AnonymousClass0957<? extends C189200o6<? extends Aweme>> anonymousClass0957, Long l, boolean z2, boolean z3, InterfaceC1364105Vn<? super C1234540iEO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sharedVideoDeepLinkHelper;
        this.LLILLJJLI = z;
        this.LLILLL = user;
        this.LLILZ = str;
        this.LLILZIL = c1233510iCj;
        this.LLILZLL = anonymousClass0957;
        this.LLIZ = l;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234540iEO(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1234540iEO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
