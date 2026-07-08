package X;

import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ILT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget$doInitLiveEventLayout$5$1$1", f = "LiveEndCardWidget.kt", l = {}, m = "invokeSuspend")
public final class C0ILT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ LiveEndCardWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ILT(boolean z, LiveEndCardWidget liveEndCardWidget, InterfaceC1364105Vn<? super C0ILT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = liveEndCardWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ILT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C468800IZy c468800IZy;
        LiveEventModule liveEventModule;
        C1C7U.LIZ("LiveEndCardWidget@8614.doInitLiveEventLayout$5$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            LiveEndCardWidget liveEndCardWidget = this.LLILLJJLI;
            C468800IZy c468800IZy2 = liveEndCardWidget.LLJLLIL;
            if (c468800IZy2 != null && (liveEventModule = c468800IZy2.LLILLJJLI) != null) {
                z = liveEventModule.subscribed;
            } else {
                z = false;
            }
            liveEndCardWidget.E1(z);
            if (z && (c468800IZy = this.LLILLJJLI.LLJLLIL) != null) {
                c468800IZy.LJIIJ();
            }
        } else {
            C766270U4b.LIZLLL(2131851053);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEndCardWidget@8614.doInitLiveEventLayout$5$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
