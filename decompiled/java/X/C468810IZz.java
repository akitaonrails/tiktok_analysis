package X;

import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;

/* JADX INFO: renamed from: X.0IZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndEventHelper", f = "LiveEndEventHelper.kt", l = {169, 176}, m = "handleEventRegister")
public final class C468810IZz extends AbstractC23140094w {
    public LiveEventModule LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C468800IZy LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468810IZz(C468800IZy c468800IZy, InterfaceC1364105Vn<? super C468810IZz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c468800IZy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEndEventHelper@a19d.handleEventRegister$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(this);
        C1C7U.LIZIZ("LiveEndEventHelper@a19d.handleEventRegister$1");
        return objLIZLLL;
    }
}
