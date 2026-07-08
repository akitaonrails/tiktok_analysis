package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352180DrM implements InterfaceC349330Dml {
    public final VideoPublishEditModel LIZ;
    public final List<String> LIZIZ = new ArrayList();

    public final String LIZIZ() {
        InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".wav");
        String strLJ = pathAdapter.LJ(videoPublishEditModel, C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LIZIZ).add(strLJ);
        return strLJ;
    }

    public C352180DrM(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    @Override // X.InterfaceC349330Dml
    public final String LIZ(String str) {
        String strLJ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJ(this.LIZ, "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJ);
        sbLIZ.append("editorPro_record_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".wav");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ((ArrayList) this.LIZIZ).add(strLIZIZ);
        return strLIZIZ;
    }
}
