package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20503915Kz extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ C20592915i3 LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20503915Kz(C20592915i3 c20592915i3, Activity activity, String str, String str2, boolean z, String str3) {
        super(1);
        this.LL = c20592915i3;
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = z;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        C20592915i3 c20592915i3 = this.LL;
        Activity activity = this.LLILLJJLI;
        c20592915i3.getClass();
        if (C20592915i3.LIZ(activity)) {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (interfaceC20673515v3K42 = iLiveOuterService.k4()) != null) {
                interfaceC20673515v3K42.LJIIIZ(this.LLILLL);
            }
            C1075710e6D.LIZ(this.LLILZ, "go_live", "live_take_popup_in_room", this.LLILZIL);
        } else {
            ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null) {
                interfaceC20673515v3K4.handleSchema(this.LLILLJJLI, this.LLILZLL, new Bundle());
            }
            C1075710e6D.LIZ(this.LLILZ, "go_live", "live_take_popup_out_room", this.LLILZIL);
        }
        return Unit.LIZ;
    }
}
