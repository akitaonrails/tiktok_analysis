package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MYT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MYT implements InterfaceC561510M0n {
    public final AwemeDraft LL;
    public final InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> LLILLJJLI;

    @Override // X.InterfaceC561510M0n
    public final void LIZ() {
        AVMusic aVMusic = this.LL.LJ;
        boolean z = false;
        if (aVMusic != null && C1458570o3j.LIZ(aVMusic)) {
            z = true;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("draft_music_process, Local Music not exist, path: ");
            sbLIZ.append(this.LL.LJII);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq = this.LLILLJJLI;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(Boolean.TRUE, Boolean.FALSE, null);
                return;
            }
            return;
        }
        AwemeDraft awemeDraft = this.LL;
        AVMusic aVMusic2 = awemeDraft.LJ;
        awemeDraft.LJII = aVMusic2 != null ? C1458570o3j.LIZIZ(aVMusic2) : null;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("draft_music_process, Local Music exist, path: ");
        sbLIZ2.append(this.LL.LJII);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq2 = this.LLILLJJLI;
        if (interfaceC1631620sYq2 != null) {
            Boolean bool = Boolean.TRUE;
            interfaceC1631620sYq2.invoke(bool, bool, null);
        }
    }

    public C0MYT(AwemeDraft awemeDraft, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq) {
        this.LL = awemeDraft;
        this.LLILLJJLI = interfaceC1631620sYq;
    }
}
