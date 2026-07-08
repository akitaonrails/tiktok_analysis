package X;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.service.IMInboxBatchActionServiceImpl$batchDeleteChat$1", f = "IMInboxBatchActionServiceImpl.kt", l = {351}, m = "invokeSuspend")
public final class C877350YbN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C878950Ydx LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877350YbN(C878950Ydx c878950Ydx, Activity activity, String str, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C877350YbN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c878950Ydx;
        this.LLILLL = activity;
        this.LLILZ = str;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877350YbN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMInboxBatchActionServiceImpl@e929.batchDeleteChat$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C877320YbK c877320YbK = C877320YbK.LIZ;
            C878950Ydx c878950Ydx = this.LLILLJJLI;
            c877320YbK.getClass();
            List listLJIIIZ = C877320YbK.LJIIIZ(c878950Ydx);
            if (listLJIIIZ == null) {
                listLJIIIZ = C13BV.INSTANCE;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C877360YbO c877360YbO = new C877360YbO(this.LLILLL, this.LLILZ, listLJIIIZ, this.LLILLJJLI, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c877360YbO) == objLJFF) {
                C1C7U.LIZIZ("IMInboxBatchActionServiceImpl@e929.batchDeleteChat$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxBatchActionServiceImpl@e929.batchDeleteChat$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
