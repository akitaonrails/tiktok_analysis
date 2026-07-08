package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0E28, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E28 {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, ArrayList<String> arrayList, String str, ArrayList<Integer> arrayList2, boolean z, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (String str3 : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                sb.append(str3);
                if (i2 != arrayList.size() - 1) {
                    sb.append(",");
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : arrayList2) {
            int i4 = i + 1;
            if (i >= 0) {
                sb2.append(String.valueOf(num.intValue()));
                if (i != arrayList2.size() - 1) {
                    sb2.append(",");
                }
                i = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("music_id", videoPublishEditModel.getMusicId());
        c0labLJFF.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0labLJFF.LIZ(1, "is_editor_pro");
        c0labLJFF.LJ("transition_list", sb.toString());
        c0labLJFF.LJ("class_id", str2);
        c0labLJFF.LJ("apply_method", str);
        c0labLJFF.LJ("apply_content_position", sb2.toString());
        c0labLJFF.LIZ(z ? 1 : 0, "is_split");
        C20684815ws.LJIILLIIL("transition_preview", c0labLJFF.LIZ);
    }
}
