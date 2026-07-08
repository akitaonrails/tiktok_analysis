package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.io.File;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Dto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353700Dto implements InterfaceC353240Dt4 {
    public static final /* synthetic */ int LJ = 0;
    public final VideoPublishEditModel LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(381));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(380));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1378));

    @Override // X.InterfaceC353240Dt4
    public final File LIZIZ() {
        return (File) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC353240Dt4
    public final File LIZJ() {
        CreativeInfo creativeInfo;
        EditModelProvider.Companion.getClass();
        VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
        return (editModel == null || (creativeInfo = editModel.getCreativeInfo()) == null) ? C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.REVERSE, "output", true) : C353710Dtp.LIZ(creativeInfo);
    }

    @Override // X.InterfaceC353240Dt4
    public final InterfaceC352930DsZ LJ() {
        return (InterfaceC352930DsZ) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC353240Dt4
    public final File LJFF() {
        return (File) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC353240Dt4
    public final void LIZ() {
        LJ().LIZIZ();
    }

    @Override // X.InterfaceC353240Dt4
    public final File LIZLLL() {
        return C353710Dtp.LIZIZ();
    }

    public C353700Dto(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }
}
