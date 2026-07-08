package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IProfileMusicTabService;

/* JADX INFO: renamed from: X.0O8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614640O8w implements InterfaceC736910SvR<InterfaceC1165220gQa> {
    public final C614630O8v LL = new InterfaceC1165220gQa() { // from class: X.0O8v
        @Override // X.InterfaceC1165220gQa
        public final InterfaceC346201Wa LLLIIII(String str) {
            return ((IProfileMusicTabService) ServiceManager.get().getService(IProfileMusicTabService.class)).LJIIL(C613940O6e.LIZ().LIZIZ(new C614660O8y(str)), "/tiktok/v1/music/aweme/list/", null);
        }

        @Override // X.InterfaceC1165220gQa
        public final InterfaceC346201Wa LLLIILIL(String str, String str2) {
            return ((IProfileMusicTabService) ServiceManager.get().getService(IProfileMusicTabService.class)).LJIIL(C613940O6e.LIZ().LIZ(new C614600O8s(str, str2)), "/tiktok/music/pinned_aweme/update/v1/", null);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
