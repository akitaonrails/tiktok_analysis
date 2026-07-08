package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.common.model.AwemeDetailList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.StickerAction$execute$3$1", f = "StickerAction.kt", l = {}, m = "invokeSuspend")
public final class C1377790lxR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDetailList LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ C1377760lxO LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ DialogC1389620mGW LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377790lxR(AwemeDetailList awemeDetailList, C238400w2 c238400w2, C1377760lxO c1377760lxO, Activity activity, long j, DialogC1389620mGW dialogC1389620mGW, Context context, InterfaceC1364105Vn<? super C1377790lxR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDetailList;
        this.LLILLJJLI = c238400w2;
        this.LLILLL = c1377760lxO;
        this.LLILZ = activity;
        this.LLILZIL = j;
        this.LLILZLL = dialogC1389620mGW;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1377790lxR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1377790lxR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
