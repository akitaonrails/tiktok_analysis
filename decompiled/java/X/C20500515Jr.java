package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.15Jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20500515Jr implements InterfaceC1652580t6e {
    public InterfaceC20500415Jq LIZ;

    @Override // X.InterfaceC1652580t6e
    public final void onDestroy() {
        InterfaceC20500415Jq interfaceC20500415Jq = this.LIZ;
        if (interfaceC20500415Jq != null) {
            interfaceC20500415Jq.onDestroy();
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC1652580t6e
    public final void pause() {
        InterfaceC20500415Jq interfaceC20500415Jq = this.LIZ;
        if (interfaceC20500415Jq != null) {
            interfaceC20500415Jq.pause();
        }
    }

    @Override // X.InterfaceC1652580t6e
    public final void stop() {
        InterfaceC20500415Jq interfaceC20500415Jq = this.LIZ;
        if (interfaceC20500415Jq != null) {
            interfaceC20500415Jq.stop();
        }
    }

    public final void LIZIZ(C1652490t6V c1652490t6V) {
        InterfaceC20500415Jq interfaceC20500415Jq;
        this.LIZ = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJLI(new C20500615Js(c1652490t6V));
        if (C1662170tM7.LIZ().isEnable && (interfaceC20500415Jq = this.LIZ) != null) {
            interfaceC20500415Jq.Vf(C1662170tM7.LIZ());
        }
    }

    @Override // X.InterfaceC1652580t6e
    public final void LIZ(MusicModel musicModel, boolean z) {
        InterfaceC20500415Jq interfaceC20500415Jq = this.LIZ;
        if (interfaceC20500415Jq != null) {
            interfaceC20500415Jq.Uf(11, musicModel, z, false);
        }
    }
}
