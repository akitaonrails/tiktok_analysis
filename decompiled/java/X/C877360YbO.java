package X;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.service.IMInboxBatchActionServiceImpl$batchDeleteChat$1$1", f = "IMInboxBatchActionServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C877360YbO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<C0Y8T> LLILLL;
    public final /* synthetic */ C878950Ydx LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877360YbO(Activity activity, String str, List<C0Y8T> list, C878950Ydx c878950Ydx, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C877360YbO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = c878950Ydx;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877360YbO(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMInboxBatchActionServiceImpl@e929.batchDeleteChat$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C877320YbK.LIZ.LJFF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, "delete_all", this.LLILZIL, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxBatchActionServiceImpl@e929.batchDeleteChat$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
