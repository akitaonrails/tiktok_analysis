package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioBaseModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl$startGeneration$2", f = "MixStudioStatusRepoImpl.kt", l = {235, 245}, m = "invokeSuspend")
public final class C441320HSg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLJJLI;
    public final /* synthetic */ InterfaceC440090HNn LLILLL;
    public final /* synthetic */ C441470HSv LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ List<MixStudioBaseModel> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441320HSg(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, InterfaceC440090HNn interfaceC440090HNn, C441470HSv c441470HSv, Integer num, List<MixStudioBaseModel> list, String str, InterfaceC1364105Vn<? super C441320HSg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioStatusRepoImpl;
        this.LLILLL = interfaceC440090HNn;
        this.LLILZ = c441470HSv;
        this.LLILZIL = num;
        this.LLILZLL = list;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441320HSg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0 A[Catch: NumberFormatException -> 0x0138, 0HSw -> 0x0148, TRY_ENTER, TryCatch #3 {0HSw -> 0x0148, NumberFormatException -> 0x0138, blocks: (B:44:0x00cd, B:45:0x00d0, B:48:0x00e0, B:51:0x00e5, B:53:0x00ec, B:56:0x00f3, B:57:0x010d, B:59:0x0113, B:64:0x011d, B:66:0x0121, B:69:0x0128, B:70:0x0132, B:16:0x003a, B:18:0x0041, B:19:0x0049, B:21:0x004f, B:22:0x0057, B:24:0x0065, B:25:0x0069, B:32:0x007c, B:36:0x0096, B:40:0x00a5, B:28:0x0070), top: B:90:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C441320HSg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
