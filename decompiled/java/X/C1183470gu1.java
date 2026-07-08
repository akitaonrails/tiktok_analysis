package X;

import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashApiRequest$request$1$1", f = "PoiOrderSubmitSlashApiRequest.kt", l = {190}, m = "invokeSuspend")
public final class C1183470gu1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public long LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ SlashRequestParam LLILZ;
    public final /* synthetic */ C1186990gzh LLILZIL;
    public final /* synthetic */ C09AJ<SlashApiResponse> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1183470gu1(SlashRequestParam slashRequestParam, C1186990gzh c1186990gzh, C09AJ<SlashApiResponse> c09aj, InterfaceC1364105Vn<? super C1183470gu1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = slashRequestParam;
        this.LLILZIL = c1186990gzh;
        this.LLILZLL = c09aj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1183470gu1(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:50:0x00ee, B:52:0x00f7, B:53:0x00f9, B:55:0x00ff, B:57:0x0103, B:60:0x010d, B:64:0x0114, B:59:0x0107), top: B:82:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:50:0x00ee, B:52:0x00f7, B:53:0x00f9, B:55:0x00ff, B:57:0x0103, B:60:0x010d, B:64:0x0114, B:59:0x0107), top: B:82:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1183470gu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
