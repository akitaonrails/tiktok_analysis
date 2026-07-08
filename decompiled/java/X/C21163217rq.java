package X;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.service.AiChatRoomLauncher$ensureLaunchDataReady$1", f = "AiChatRoomLauncher.kt", l = {256}, m = "invokeSuspend")
public final class C21163217rq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21163217rq(Function1<? super String, Unit> function1, Context context, InterfaceC1364105Vn<? super C21163217rq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21163217rq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatRoomLauncher@585f.ensureLaunchDataReady$1");
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
            C21163117rp c21163117rp = C21163117rp.LIZ;
            this.LL = 1;
            obj = c21163117rp.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AiChatRoomLauncher@585f.ensureLaunchDataReady$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILLJJLI.invoke(C21163117rp.LIZIZ().getConversationId());
        } else {
            C21290818Tq.LIZIZ("AiChatRoomLauncher", "ensureLaunchDataReady Error!", null);
            Activity activityLIZ = C0FNT.LIZ(this.LLILLL);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131849939);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatRoomLauncher@585f.ensureLaunchDataReady$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
