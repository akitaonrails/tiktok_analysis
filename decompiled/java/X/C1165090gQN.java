package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gQN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM$preload$2", f = "MixBottomBarVM.kt", l = {102, 107, 129}, m = "invokeSuspend")
public final class C1165090gQN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ MixBottomBarVM LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C722990SXp LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165090gQN(String str, Aweme aweme, int i, MixBottomBarVM mixBottomBarVM, String str2, C722990SXp c722990SXp, InterfaceC1364105Vn<? super C1165090gQN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = aweme;
        this.LLILZLL = i;
        this.LLIZ = mixBottomBarVM;
        this.LLIZLLLIL = str2;
        this.LLJ = c722990SXp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165090gQN(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6 A[Catch: Exception -> 0x019c, TRY_ENTER, TryCatch #0 {Exception -> 0x019c, blocks: (B:20:0x00c4, B:21:0x00c7, B:24:0x00d6, B:25:0x0163, B:26:0x019b, B:16:0x00a6, B:17:0x00a9, B:13:0x0037), top: B:39:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0163 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:20:0x00c4, B:21:0x00c7, B:24:0x00d6, B:25:0x0163, B:26:0x019b, B:16:0x00a6, B:17:0x00a9, B:13:0x0037), top: B:39:0x0014 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1165090gQN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
