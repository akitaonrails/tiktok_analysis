package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import g3a.a;
import java.util.List;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0oAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462730oAR extends a implements InterfaceC1408530ml1 {
    public final VideoPublishEditModel LLIZLLLIL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null) {
            LJIIJ();
            return;
        }
        C128L c128lLIZIZ = C0CHQ.LIZ().LIZIZ();
        List<Integer> listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(this.LLIZLLLIL.videoWidth()), Integer.valueOf(this.LLIZLLLIL.videoHeight()));
        EditVideoSegment editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(this.LLIZLLLIL.getPreviewInfo().getVideoList());
        c128lLIZIZ.LIZ(listLJIIJJI, editVideoSegment != null ? editVideoSegment.getVideoPath() : null, currentUser, new C1466950oHF(this, 3), new AwS601S0100000_22(this, 533));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }

    public C1462730oAR(VideoPublishEditModel videoPublishEditModel) {
        this.LLIZLLLIL = videoPublishEditModel;
        LJ(AFwS261S0000000_22.get$arr$(225));
    }
}
