package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ybz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.ui.actions.PinActionNew$doAction$1$intercepted$1", f = "ActionSheetItemsNew.kt", l = {298}, m = "invokeSuspend")
public final class C877730Ybz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C877750Yc1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877730Ybz(C877750Yc1 c877750Yc1, InterfaceC1364105Vn<? super C877730Ybz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c877750Yc1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877730Ybz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PinActionNew@57db.doAction$1$intercepted$1");
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
            IMChatListApi.LJJIII.getClass();
            IMChatListApi iMChatListApiLIZ = C890330YwJ.LIZ();
            C877750Yc1 c877750Yc1 = this.LLILLJJLI;
            C0Y8T c0y8t = c877750Yc1.LLILZ;
            Activity activity = c877750Yc1.LL;
            this.LL = 1;
            obj = iMChatListApiLIZ.LJIJ(c0y8t, activity, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PinActionNew@57db.doAction$1$intercepted$1");
                return objLJFF;
            }
        }
        C877750Yc1 c877750Yc12 = this.LLILLJJLI;
        if (((Boolean) obj).booleanValue()) {
            AbstractC880120Yfq.LJFF(c877750Yc12, "pin_fail_by_limit", null, null, 6);
        }
        C1C7U.LIZIZ("PinActionNew@57db.doAction$1$intercepted$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
