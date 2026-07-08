package X;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil$runPitayaTask$1$onResult$1", f = "RepostLazyLoadUtil.kt", l = {}, m = "invokeSuspend")
public final class C1004790cFp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ PTYError LLILLJJLI;
    public final /* synthetic */ PTYTaskData LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ RepostLazyLoadUtil<T, ITEM> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004790cFp(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, String str, RepostLazyLoadUtil<T, ITEM> repostLazyLoadUtil, InterfaceC1364105Vn<? super C1004790cFp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = pTYError;
        this.LLILLL = pTYTaskData;
        this.LLILZ = str;
        this.LLILZIL = repostLazyLoadUtil;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1004790cFp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3 A[Catch: JSONException -> 0x00c3, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00c3, blocks: (B:16:0x0057, B:18:0x005b, B:20:0x0061, B:21:0x0067, B:23:0x006b, B:25:0x0071, B:27:0x007d, B:30:0x0085, B:31:0x00a1, B:33:0x00a7, B:35:0x00ad, B:36:0x00b3), top: B:42:0x0057 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1004790cFp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
