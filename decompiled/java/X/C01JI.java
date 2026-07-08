package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01JI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.linkroom.share.MultiGuestShareFilterManager$requestFilter$1", f = "MultiGuestShareFilterManager.kt", l = {81}, m = "invokeSuspend")
public final class C01JI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ List<Long> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01JI(long j, List<Long> list, InterfaceC1364105Vn<? super C01JI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = j;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01JI c01ji = new C01JI(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c01ji.LLILLL = obj;
        return c01ji;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:13:0x004d, B:14:0x0050, B:16:0x005e, B:18:0x0062, B:19:0x0071, B:21:0x0077, B:22:0x0089, B:25:0x0091, B:27:0x00a5, B:28:0x00a7, B:24:0x008f, B:9:0x0022), top: B:34:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:13:0x004d, B:14:0x0050, B:16:0x005e, B:18:0x0062, B:19:0x0071, B:21:0x0077, B:22:0x0089, B:25:0x0091, B:27:0x00a5, B:28:0x00a7, B:24:0x008f, B:9:0x0022), top: B:34:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01JI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
