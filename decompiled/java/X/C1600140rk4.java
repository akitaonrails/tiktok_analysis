package X;

import com.ss.android.ugc.aweme.item.StoryCacheData;
import com.ss.android.ugc.aweme.item.StoryCacheExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.InboxSkylightStoryDataCenter$startRemainingPagedRead$1", f = "SkylightStoryDataCenter.kt", l = {774, 796, 803, 806, 803, 806}, m = "invokeSuspend")
public final class C1600140rk4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ StoryCacheData.PowerItemCache LLILZIL;
    public final /* synthetic */ InterfaceC1455405mq<InterfaceC1891350zJl> LLILZLL;
    public final /* synthetic */ C1600200rkA LLIZ;
    public final /* synthetic */ StoryCacheExtra LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600140rk4(StoryCacheData.PowerItemCache powerItemCache, InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq, C1600200rkA c1600200rkA, StoryCacheExtra storyCacheExtra, int i, InterfaceC1364105Vn<? super C1600140rk4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = powerItemCache;
        this.LLILZLL = interfaceC1455405mq;
        this.LLIZ = c1600200rkA;
        this.LLIZLLLIL = storyCacheExtra;
        this.LLJ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1600140rk4 c1600140rk4 = new C1600140rk4(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1600140rk4.LLILZ = obj;
        return c1600140rk4;
    }

    /* JADX WARN: Path cross not found for [B:44:0x00cf, B:47:0x00d6], limit reached: 126 */
    /* JADX WARN: Path cross not found for [B:47:0x00d6, B:44:0x00cf], limit reached: 126 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x021d, TryCatch #8 {all -> 0x021d, blocks: (B:16:0x0055, B:18:0x005f, B:20:0x0069, B:22:0x006d, B:71:0x0183, B:29:0x0079, B:36:0x00a1, B:38:0x00a7, B:39:0x00c4, B:42:0x00cb, B:44:0x00cf, B:68:0x0161, B:51:0x00dd, B:55:0x00f1, B:59:0x011e, B:63:0x0139, B:35:0x0096, B:72:0x01a6, B:91:0x0219), top: B:126:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[Catch: all -> 0x021d, TryCatch #8 {all -> 0x021d, blocks: (B:16:0x0055, B:18:0x005f, B:20:0x0069, B:22:0x006d, B:71:0x0183, B:29:0x0079, B:36:0x00a1, B:38:0x00a7, B:39:0x00c4, B:42:0x00cb, B:44:0x00cf, B:68:0x0161, B:51:0x00dd, B:55:0x00f1, B:59:0x011e, B:63:0x0139, B:35:0x0096, B:72:0x01a6, B:91:0x0219), top: B:126:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf A[Catch: all -> 0x021d, TryCatch #8 {all -> 0x021d, blocks: (B:16:0x0055, B:18:0x005f, B:20:0x0069, B:22:0x006d, B:71:0x0183, B:29:0x0079, B:36:0x00a1, B:38:0x00a7, B:39:0x00c4, B:42:0x00cb, B:44:0x00cf, B:68:0x0161, B:51:0x00dd, B:55:0x00f1, B:59:0x011e, B:63:0x0139, B:35:0x0096, B:72:0x01a6, B:91:0x0219), top: B:126:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd A[Catch: all -> 0x021d, TryCatch #8 {all -> 0x021d, blocks: (B:16:0x0055, B:18:0x005f, B:20:0x0069, B:22:0x006d, B:71:0x0183, B:29:0x0079, B:36:0x00a1, B:38:0x00a7, B:39:0x00c4, B:42:0x00cb, B:44:0x00cf, B:68:0x0161, B:51:0x00dd, B:55:0x00f1, B:59:0x011e, B:63:0x0139, B:35:0x0096, B:72:0x01a6, B:91:0x0219), top: B:126:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0232  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600140rk4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
