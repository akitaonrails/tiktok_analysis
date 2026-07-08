package X;

import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.ss.android.ugc.aweme.hangout.component.distribute.viewmodel.MultiTopLiveDistributeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import njp.a;

/* JADX INFO: renamed from: X.0IoE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.distribute.viewmodel.MultiTopLiveDistributeVM$fetchSkylightList$1", f = "MultiTopLiveDistributeVM.kt", l = {}, m = "invokeSuspend")
public final class C477640IoE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MultiTopLiveDistributeVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477640IoE(MultiTopLiveDistributeVM multiTopLiveDistributeVM, InterfaceC1364105Vn<? super C477640IoE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = multiTopLiveDistributeVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C477640IoE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveDistributeVM@dee1.fetchSkylightList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MultiTopLiveDistributeVM multiTopLiveDistributeVM = this.LL;
        multiTopLiveDistributeVM.getClass();
        if (!HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            C20441214yg.LIZIZ("MultiTopLiveDistributeVM", "fetchGoLiveItem: HangoutRoomFeedEnableSetting not enabled");
        } else {
            InterfaceC476860Imy interfaceC476860Imy = (InterfaceC476860Imy) multiTopLiveDistributeVM.LL.getValue();
            if (interfaceC476860Imy != null && interfaceC476860Imy.hasLivePermission()) {
                C20441214yg.LIZIZ("MultiTopLiveDistributeVM", "fetchGoLiveItem: hasLivePermission=true");
                multiTopLiveDistributeVM.setState(AFwS237S0000000_7.get$arr$(245));
            } else {
                C20441214yg.LIZIZ("MultiTopLiveDistributeVM", "fetchGoLiveItem: refreshing permission");
                InterfaceC476860Imy interfaceC476860Imy2 = (InterfaceC476860Imy) multiTopLiveDistributeVM.LL.getValue();
                if (interfaceC476860Imy2 != null) {
                    interfaceC476860Imy2.LJFF(multiTopLiveDistributeVM.LLILLJJLI);
                }
                InterfaceC476860Imy interfaceC476860Imy3 = (InterfaceC476860Imy) multiTopLiveDistributeVM.LL.getValue();
                if (interfaceC476860Imy3 != null) {
                    interfaceC476860Imy3.LJIJJ();
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveDistributeVM@dee1.fetchSkylightList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
