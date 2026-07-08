package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.tns.TnsSignalReport$start$1", f = "TnsSignalReport.kt", l = {60, BaseNotice.CREATOR, 65}, m = "invokeSuspend")
public final class C773290UVb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC769940UIe LL;
    public InterfaceC497601wk LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C773300UVc LLILZLL;
    public final /* synthetic */ InterfaceC769940UIe LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773290UVb(C773300UVc c773300UVc, InterfaceC769940UIe interfaceC769940UIe, InterfaceC1364105Vn<? super C773290UVb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c773300UVc;
        this.LLIZ = interfaceC769940UIe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C773290UVb c773290UVb = new C773290UVb(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c773290UVb.LLILZIL = obj;
        return c773290UVb;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[Catch: all -> 0x011c, TryCatch #0 {all -> 0x011c, blocks: (B:13:0x004d, B:14:0x0050, B:16:0x005c, B:17:0x0093, B:19:0x009b, B:21:0x00cb, B:23:0x00cf, B:26:0x00e4, B:29:0x00f7, B:38:0x0116), top: B:43:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[Catch: all -> 0x011c, TryCatch #0 {all -> 0x011c, blocks: (B:13:0x004d, B:14:0x0050, B:16:0x005c, B:17:0x0093, B:19:0x009b, B:21:0x00cb, B:23:0x00cf, B:26:0x00e4, B:29:0x00f7, B:38:0x0116), top: B:43:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116 A[Catch: all -> 0x011c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x011c, blocks: (B:13:0x004d, B:14:0x0050, B:16:0x005c, B:17:0x0093, B:19:0x009b, B:21:0x00cb, B:23:0x00cf, B:26:0x00e4, B:29:0x00f7, B:38:0x0116), top: B:43:0x004d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e1 -> B:14:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00f4 -> B:14:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0107 -> B:14:0x0050). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773290UVb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
