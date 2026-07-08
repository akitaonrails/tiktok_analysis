package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.im.sdk.notification.PushQuickActionReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0VxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.notification.PushQuickActionReceiver$onReceive$1", f = "PushQuickActionReceiver.kt", l = {46}, m = "invokeSuspend")
public final class C814540VxM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PushQuickActionReceiver LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C814540VxM(PushQuickActionReceiver pushQuickActionReceiver, Intent intent, InterfaceC1364105Vn<? super C814540VxM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pushQuickActionReceiver;
        this.LLILLL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C814540VxM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushQuickActionReceiver@bef3.onReceive$1");
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
            C19266210Yy.LIZIZ.LIZIZ();
            PushQuickActionReceiver pushQuickActionReceiver = this.LLILLJJLI;
            Intent intent = this.LLILLL;
            this.LL = 1;
            if (pushQuickActionReceiver.LIZ(intent, this) == objLJFF) {
                C1C7U.LIZIZ("PushQuickActionReceiver@bef3.onReceive$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushQuickActionReceiver@bef3.onReceive$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
