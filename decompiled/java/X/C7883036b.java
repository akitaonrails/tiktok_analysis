package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.036b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7883036b {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        ArrayList arrayList = new ArrayList();
        if (C7884036c.LIZ()) {
            arrayList.add("\"detail_page_need_standardize_text\": 1");
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "detail_page_need_friend_tag", true) == 1) {
            arrayList.add("\"detail_page_need_friend_tag\": 1");
        }
        String strValueOf = String.valueOf(((Number) C7882036a.LIZ.getValue()).intValue());
        arrayList.add("\"tt_story_distribution_relation_in_music_detail\": 1");
        arrayList.add("\"tt_story_distribution_relation_in_effect_detail\": 1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\"tt_story_distribution_in_detail_page_count\": ");
        sbLIZ.append(strValueOf);
        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('{');
        sbLIZ2.append(C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62));
        sbLIZ2.append('}');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
