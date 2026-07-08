package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment$saveItems$1", f = "SubscriptionSpotlightFragment.kt", l = {663, 678}, m = "invokeSuspend")
public final class C495130JbL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C495170JbP LLILLL;
    public C495170JbP LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ SubscriptionSpotlightFragment LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495130JbL(SubscriptionSpotlightFragment subscriptionSpotlightFragment, Function0<Unit> function0, InterfaceC1364105Vn<? super C495130JbL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = subscriptionSpotlightFragment;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495130JbL(this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: CancellationException -> 0x01d6, TryCatch #0 {CancellationException -> 0x01d6, blocks: (B:43:0x00de, B:44:0x00e1, B:46:0x00e8, B:48:0x00ec, B:49:0x00f2, B:51:0x00f8, B:52:0x0106, B:54:0x010c, B:56:0x0119, B:57:0x011d, B:59:0x0123, B:61:0x0129, B:70:0x013b, B:72:0x013f, B:73:0x0150, B:74:0x0158, B:76:0x015e, B:78:0x016b, B:79:0x016f, B:81:0x0175, B:83:0x0179, B:86:0x0197, B:21:0x0082, B:22:0x0085, B:23:0x008b, B:26:0x0098, B:28:0x00a0, B:32:0x00ab, B:33:0x00ad, B:35:0x00b1, B:36:0x00b3, B:12:0x004c, B:14:0x0052, B:16:0x005c, B:39:0x00bc, B:11:0x0037), top: B:92:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[Catch: CancellationException -> 0x01d6, TryCatch #0 {CancellationException -> 0x01d6, blocks: (B:43:0x00de, B:44:0x00e1, B:46:0x00e8, B:48:0x00ec, B:49:0x00f2, B:51:0x00f8, B:52:0x0106, B:54:0x010c, B:56:0x0119, B:57:0x011d, B:59:0x0123, B:61:0x0129, B:70:0x013b, B:72:0x013f, B:73:0x0150, B:74:0x0158, B:76:0x015e, B:78:0x016b, B:79:0x016f, B:81:0x0175, B:83:0x0179, B:86:0x0197, B:21:0x0082, B:22:0x0085, B:23:0x008b, B:26:0x0098, B:28:0x00a0, B:32:0x00ab, B:33:0x00ad, B:35:0x00b1, B:36:0x00b3, B:12:0x004c, B:14:0x0052, B:16:0x005c, B:39:0x00bc, B:11:0x0037), top: B:92:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[Catch: CancellationException -> 0x01d6, TryCatch #0 {CancellationException -> 0x01d6, blocks: (B:43:0x00de, B:44:0x00e1, B:46:0x00e8, B:48:0x00ec, B:49:0x00f2, B:51:0x00f8, B:52:0x0106, B:54:0x010c, B:56:0x0119, B:57:0x011d, B:59:0x0123, B:61:0x0129, B:70:0x013b, B:72:0x013f, B:73:0x0150, B:74:0x0158, B:76:0x015e, B:78:0x016b, B:79:0x016f, B:81:0x0175, B:83:0x0179, B:86:0x0197, B:21:0x0082, B:22:0x0085, B:23:0x008b, B:26:0x0098, B:28:0x00a0, B:32:0x00ab, B:33:0x00ad, B:35:0x00b1, B:36:0x00b3, B:12:0x004c, B:14:0x0052, B:16:0x005c, B:39:0x00bc, B:11:0x0037), top: B:92:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[Catch: CancellationException -> 0x01d6, TryCatch #0 {CancellationException -> 0x01d6, blocks: (B:43:0x00de, B:44:0x00e1, B:46:0x00e8, B:48:0x00ec, B:49:0x00f2, B:51:0x00f8, B:52:0x0106, B:54:0x010c, B:56:0x0119, B:57:0x011d, B:59:0x0123, B:61:0x0129, B:70:0x013b, B:72:0x013f, B:73:0x0150, B:74:0x0158, B:76:0x015e, B:78:0x016b, B:79:0x016f, B:81:0x0175, B:83:0x0179, B:86:0x0197, B:21:0x0082, B:22:0x0085, B:23:0x008b, B:26:0x0098, B:28:0x00a0, B:32:0x00ab, B:33:0x00ad, B:35:0x00b1, B:36:0x00b3, B:12:0x004c, B:14:0x0052, B:16:0x005c, B:39:0x00bc, B:11:0x0037), top: B:92:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc A[Catch: CancellationException -> 0x01d6, TRY_ENTER, TryCatch #0 {CancellationException -> 0x01d6, blocks: (B:43:0x00de, B:44:0x00e1, B:46:0x00e8, B:48:0x00ec, B:49:0x00f2, B:51:0x00f8, B:52:0x0106, B:54:0x010c, B:56:0x0119, B:57:0x011d, B:59:0x0123, B:61:0x0129, B:70:0x013b, B:72:0x013f, B:73:0x0150, B:74:0x0158, B:76:0x015e, B:78:0x016b, B:79:0x016f, B:81:0x0175, B:83:0x0179, B:86:0x0197, B:21:0x0082, B:22:0x0085, B:23:0x008b, B:26:0x0098, B:28:0x00a0, B:32:0x00ab, B:33:0x00ad, B:35:0x00b1, B:36:0x00b3, B:12:0x004c, B:14:0x0052, B:16:0x005c, B:39:0x00bc, B:11:0x0037), top: B:92:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8 A[Catch: CancellationException -> 0x01d6, TryCatch #0 {CancellationException -> 0x01d6, blocks: (B:43:0x00de, B:44:0x00e1, B:46:0x00e8, B:48:0x00ec, B:49:0x00f2, B:51:0x00f8, B:52:0x0106, B:54:0x010c, B:56:0x0119, B:57:0x011d, B:59:0x0123, B:61:0x0129, B:70:0x013b, B:72:0x013f, B:73:0x0150, B:74:0x0158, B:76:0x015e, B:78:0x016b, B:79:0x016f, B:81:0x0175, B:83:0x0179, B:86:0x0197, B:21:0x0082, B:22:0x0085, B:23:0x008b, B:26:0x0098, B:28:0x00a0, B:32:0x00ab, B:33:0x00ad, B:35:0x00b1, B:36:0x00b3, B:12:0x004c, B:14:0x0052, B:16:0x005c, B:39:0x00bc, B:11:0x0037), top: B:92:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:22:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007f -> B:23:0x008b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C495130JbL.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
