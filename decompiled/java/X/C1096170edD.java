package X;

import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.model.message.CommercialCustomMessage;
import com.bytedance.android.livesdk.programmedlive.pin.PLCusPinMsgViewModel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0edD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.programmedlive.pin.PLCusPinMsgViewModel$onMessage$1$2", f = "PLCusPinMsgViewModel.kt", l = {143}, m = "invokeSuspend")
public final class C1096170edD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMessage LLILLJJLI;
    public final /* synthetic */ PLCusPinMsgViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096170edD(IMessage iMessage, PLCusPinMsgViewModel pLCusPinMsgViewModel, InterfaceC1364105Vn<? super C1096170edD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMessage;
        this.LLILLL = pLCusPinMsgViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1096170edD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PLCusPinMsgViewModel@1420.onMessage$1$2");
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
            long j = ((CommercialCustomMessage) this.LLILLJJLI).duration;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PLCusPinMsgViewModel@1420.onMessage$1$2");
                return objLJFF;
            }
        }
        PLCusPinMsgViewModel pLCusPinMsgViewModel = this.LLILLL;
        C1090140eTU c1090140eTU = pLCusPinMsgViewModel.LLILLJJLI;
        if (c1090140eTU != null) {
            c1090140eTU.LJFF = true;
            Iterator<Observer<C1109600eys<? extends InterfaceC1111870f2X>>> it2 = pLCusPinMsgViewModel.LLILZIL.iterator();
            while (it2.hasNext()) {
                pLCusPinMsgViewModel.vQ2(c1090140eTU, it2.next());
            }
            pLCusPinMsgViewModel.LLILLJJLI = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PLCusPinMsgViewModel@1420.onMessage$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
