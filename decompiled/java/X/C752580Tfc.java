package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.chatroom.model.ContentDisclosureSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet$updateContentDisclosureSettings$1", f = "LiveCommercialContentToggleFragmentSheet.kt", l = {473, 475}, m = "invokeSuspend")
public final class C752580Tfc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveCommercialContentToggleFragmentSheet LLILLJJLI;
    public final /* synthetic */ ContentDisclosureSettings LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752580Tfc(LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet, ContentDisclosureSettings contentDisclosureSettings, InterfaceC1364105Vn<? super C752580Tfc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveCommercialContentToggleFragmentSheet;
        this.LLILLL = contentDisclosureSettings;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752580Tfc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveCommercialContentToggleFragmentSheet@5f51.updateContentDisclosureSettings$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.LLLIIL) {
                IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
                ContentDisclosureSettings contentDisclosureSettings = this.LLILLL;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILLJJLI);
                this.LL = 1;
                if (iRoomFunctionService.TW(contentDisclosureSettings, dataChannelLJ, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveCommercialContentToggleFragmentSheet@5f51.updateContentDisclosureSettings$1");
                    return objLJFF;
                }
            } else {
                IRoomFunctionService iRoomFunctionService2 = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
                ContentDisclosureSettings contentDisclosureSettings2 = this.LLILLL;
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this.LLILLJJLI);
                this.LL = 2;
                if (iRoomFunctionService2.TW(contentDisclosureSettings2, dataChannelLJ2, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveCommercialContentToggleFragmentSheet@5f51.updateContentDisclosureSettings$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCommercialContentToggleFragmentSheet@5f51.updateContentDisclosureSettings$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
