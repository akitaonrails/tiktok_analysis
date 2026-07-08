package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.06OT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06OT {
    public static long LIZ;

    public static void LIZ(C1599406Oa c1599406Oa) {
        Object obj;
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("template_id", c1599406Oa.LIZ.getTrackingName());
        c830490Whz.put("position", c1599406Oa.LIZ.getUiPosition().getTrackingName());
        c830490Whz.put("duration", String.valueOf(System.currentTimeMillis() - c1599406Oa.LIZIZ));
        String str = "1";
        if (c1599406Oa.LIZJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_continue", obj);
        if (!c1599406Oa.LIZLLL) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_queue_empty", str);
        c830490Whz.put("typing_reco_refresh_cnt", String.valueOf(LIZ));
        C20684815ws.LJIILLIIL("ttsocial_chat_notice_show_tech", c830490Whz);
        LIZ = 0L;
    }
}
