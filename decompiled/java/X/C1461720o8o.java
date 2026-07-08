package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0o8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461720o8o implements InterfaceC1461180o7w {
    public final VideoPublishEditModel LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC1461180o7w
    public final C0XPV LIZIZ() {
        return C1430210nJz.LIZ(this.LIZ);
    }

    @Override // X.InterfaceC1461180o7w
    public final String LIZJ() {
        InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        CreativeInfo creativeInfo = this.LIZ.getCreativeInfo();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin_vc_extract_");
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        return pathAdapter.LJIIL(creativeInfo, C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1461720o8o(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    @Override // X.InterfaceC1461180o7w
    public final String LIZ(String str) {
        InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        CreativeInfo creativeInfo = this.LIZ.getCreativeInfo();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin_vc_");
        sbLIZ.append(str);
        return pathAdapter.LJIIL(creativeInfo, C2188811AlT.LIZIZ(sbLIZ));
    }
}
