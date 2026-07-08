package X;

import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui.MediaCardHierarchyData;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui.MediaCoverAssem;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;

/* JADX INFO: renamed from: X.0OQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OQ4 implements InterfaceC620290OUp {
    public final /* synthetic */ MediaCoverAssem LIZ;

    @Override // X.InterfaceC620290OUp
    public final void LIZIZ(DmMessageConfig dmMessageConfig, float f, boolean z) {
    }

    @Override // X.InterfaceC620290OUp
    public final void LIZJ() {
    }

    @Override // X.InterfaceC620290OUp
    public final void LIZLLL() {
        C618930OPj c618930OPj = C618930OPj.LIZ;
        MediaCardHierarchyData mediaCardHierarchyDataJo = this.LIZ.Jo();
        DmMessageConfig dmMessageConfig = mediaCardHierarchyDataJo != null ? mediaCardHierarchyDataJo.getDmMessageConfig() : null;
        c618930OPj.getClass();
        C618930OPj.LIZ(dmMessageConfig);
    }

    public C0OQ4(MediaCoverAssem mediaCoverAssem) {
        this.LIZ = mediaCoverAssem;
    }

    @Override // X.InterfaceC620290OUp
    public final void LIZ(float f, boolean z) {
        DmMessageConfig dmMessageConfig;
        C618930OPj c618930OPj = C618930OPj.LIZ;
        MediaCardHierarchyData mediaCardHierarchyDataJo = this.LIZ.Jo();
        if (mediaCardHierarchyDataJo != null) {
            dmMessageConfig = mediaCardHierarchyDataJo.getDmMessageConfig();
        } else {
            dmMessageConfig = null;
        }
        c618930OPj.getClass();
        C618930OPj.LIZIZ(dmMessageConfig, f, z);
    }

    @Override // X.InterfaceC620290OUp
    public final void LJ(String str, C0OR6 c0or6) {
        int i;
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LIZ);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            if (c0or6 == C0OR6.ERROR_CODE_NO_COPYRIGHT) {
                i = 2131857163;
            } else {
                i = 2131829440;
            }
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
        LIZ(0.0f, false);
    }
}
