package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainfragment.toolbar.search.SearchBarIconGenerator$getSearchKeyword$2", f = "SearchBarIconGenerator.kt", l = {}, m = "invokeSuspend")
public final class C1355750lNt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C1586240rNe LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1355750lNt(TextView textView, C1586240rNe c1586240rNe, Aweme aweme, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = c1586240rNe;
        this.LLILLL = textView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        Aweme aweme = this.LL;
        return new C1355750lNt(this.LLILLL, this.LLILLJJLI, aweme, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b A[Catch: all -> 0x017a, TryCatch #0 {all -> 0x017a, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x0018, B:9:0x001e, B:10:0x0022, B:12:0x0028, B:14:0x0031, B:15:0x0035, B:17:0x003d, B:18:0x003f, B:20:0x0045, B:21:0x0049, B:29:0x005c, B:32:0x0064, B:40:0x0073, B:42:0x007b, B:44:0x0089, B:47:0x0091, B:49:0x0096, B:51:0x009c, B:53:0x00a4, B:54:0x00ae, B:56:0x00b4, B:58:0x00bc, B:60:0x00c8, B:62:0x00da, B:64:0x00e2, B:66:0x00e8, B:67:0x00ec, B:69:0x00f2, B:70:0x010f, B:72:0x0117, B:74:0x011f, B:76:0x0125, B:78:0x0131, B:79:0x0135, B:84:0x0144, B:86:0x014a, B:87:0x014e, B:89:0x0154, B:90:0x016c, B:83:0x013d, B:92:0x0170), top: B:98:0x000b }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1355750lNt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
