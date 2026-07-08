package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTextConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTextStruct;

/* JADX INFO: renamed from: X.0P0P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P0P {
    public final C0ONX LIZ = new C0ONX();

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LIZ().getString(2131828092));
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static NoticeTextStruct LIZ(String str) {
        return new NoticeTextStruct(new NoticeTextConfig("[[text_link_1]][[text_link_2]]", null, null, null, null), C1697810uHb.LJIIJJI(new NoticeTextConfig(LIZIZ(), "tux://color?token=UITextPrimaryDisplay&from=awemenotice-bulletin_board_activity_event", null, "tux://color?token=UITextPrimaryDisplay&from=awemenotice-bulletin_board_activity_event", null), new NoticeTextConfig(str, null, null, null, null)));
    }
}
