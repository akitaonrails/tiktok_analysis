package X;

import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0HGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438350HGv {
    public static final boolean LIZ(List<StoryNoteTextExtra> list) {
        if ((!list.isEmpty()) && !list.isEmpty()) {
            Iterator<StoryNoteTextExtra> it2 = list.iterator();
            while (it2.hasNext()) {
                Integer num = it2.next().type;
                if (num != null && num.intValue() == 1) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final void LIZIZ(String str, String str2, String str3, String str4) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("group_id", str3);
        c0lab.LJ("to_user_id", str4);
        c0lab.LJ("is_note", "1");
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }
}
