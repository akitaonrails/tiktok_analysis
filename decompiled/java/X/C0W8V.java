package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.chatlist.api.model.DMNavArg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0W8V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.router.DMNavHelper$startNav$1$1", f = "DMNavHelper.kt", l = {}, m = "invokeSuspend")
public final class C0W8V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0Y8T LL;
    public final /* synthetic */ C912950Zrh LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ DMNavArg LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W8V(C0Y8T c0y8t, C912950Zrh c912950Zrh, Activity activity, DMNavArg dMNavArg, InterfaceC1364105Vn<? super C0W8V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y8t;
        this.LLILLJJLI = c912950Zrh;
        this.LLILLL = activity;
        this.LLILZ = dMNavArg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0W8V(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMNavHelper@3a31.startNav$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Y8T c0y8t = this.LL;
        if (c0y8t != null) {
            this.LLILLJJLI.LIZ.invoke(C912950Zrh.LIZ(this.LLILLL, this.LLILZ, (int) c0y8t.getUnreadCount()));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMNavHelper@3a31.startNav$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
