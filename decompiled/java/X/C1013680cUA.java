package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainfragment.toolbar.search.TabletSearchBarIconGenerator$onAwemeChange$2", f = "TabletSearchBarIconGenerator.kt", l = {}, m = "invokeSuspend")
public final class C1013680cUA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1611080s1i LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ TextView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1013680cUA(C1611080s1i c1611080s1i, Aweme aweme, TextView textView, String str, TextView textView2, InterfaceC1364105Vn<? super C1013680cUA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1611080s1i;
        this.LLILLJJLI = aweme;
        this.LLILLL = textView;
        this.LLILZ = str;
        this.LLILZIL = textView2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1013680cUA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[ADDED_TO_REGION, Catch: all -> 0x008f, REMOVE, TRY_LEAVE, TryCatch #0 {all -> 0x008f, blocks: (B:4:0x0016, B:6:0x001c, B:8:0x0022, B:9:0x0026, B:11:0x002c, B:13:0x0035, B:14:0x0039, B:16:0x0041, B:20:0x004a, B:22:0x0051, B:24:0x0057, B:26:0x005f, B:28:0x0065, B:29:0x0079), top: B:43:0x0016 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1013680cUA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
