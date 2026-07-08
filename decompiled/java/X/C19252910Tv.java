package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tablet.api.ITabletService;

/* JADX INFO: renamed from: X.10Tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19252910Tv implements ITabletService {
    public static final C19252910Tv LIZIZ = new C19252910Tv();
    public final /* synthetic */ ITabletService LIZ = (ITabletService) ServiceManager.get().getService(ITabletService.class);

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final InterfaceC487320J9e LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final void LIZIZ(Activity activity) {
        this.LIZ.LIZIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final InterfaceC590550NEf LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final InterfaceC1616630sAf LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final void LJ(int i) {
        this.LIZ.LJ(i);
    }

    @Override // com.ss.android.ugc.aweme.tablet.api.ITabletService
    public final boolean o4() {
        return this.LIZ.o4();
    }
}
