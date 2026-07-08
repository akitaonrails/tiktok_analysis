package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11c2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19536411c2 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        if (str == null) {
            str = String.valueOf(System.nanoTime());
        }
        InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin_vc_extract_");
        sbLIZ.append(str);
        return pathAdapter.LJIIL(creativeInfo, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C19529711ax LIZ(Context context, List list, VideoPublishEditModel videoPublishEditModel) {
        String strLIZ;
        String strLIZIZ;
        int i;
        C19529711ax c19529711ax = new C19529711ax(context);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C19536311c1 c19536311c1 = (C19536311c1) it2.next();
            String strLIZ2 = C349090DmN.LIZ(c19536311c1);
            if (strLIZ2 != null && (strLIZ = c19536311c1.LIZ()) != null && (strLIZIZ = c19536311c1.LIZIZ()) != null) {
                if (c19536311c1.LIZ == null) {
                    i = 1;
                } else {
                    i = 2;
                }
                String strLJII = C1664460tPo.LJII(c19536311c1.LIZJ);
                String strLIZIZ2 = LIZIZ(videoPublishEditModel, strLIZIZ);
                String strLIZJ = LIZJ(videoPublishEditModel, strLIZIZ, strLJII);
                C19529911az c19529911az = new C19529911az(strLIZ2);
                c19529911az.LJJIFFI(strLIZJ, "set_vc_file_path");
                c19529911az.LJJIFFI(strLIZIZ2, "extract_file_path");
                c19529911az.LJJIFFI(strLIZ, "original_file_path");
                c19529911az.LJJIFFI(strLJII, "speaker_id");
                c19529911az.LJJIFFI(c19536311c1.LIZJ.getName(), "speaker_name");
                c19529911az.LJJIFFI(Integer.valueOf(i), "audio_type");
                c19529911az.LJJIFFI(c19536311c1, "voice_change_model");
                c19529911az.LJJIFFI(C1430210nJz.LIZ(videoPublishEditModel), "request_common_data");
                c19529711ax.LJII(c19529911az);
            }
        }
        return c19529711ax;
    }

    public static String LIZJ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        if (str == null) {
            str = String.valueOf(System.nanoTime());
        }
        if (str2.length() == 0) {
            return null;
        }
        InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin_vc_extract_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return pathAdapter.LJIIL(creativeInfo, C2188811AlT.LIZIZ(sbLIZ));
    }
}
