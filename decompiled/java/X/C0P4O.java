package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0P4O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4O implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
        }
    }

    public C0P4O(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(C0P4O c0p4o, DialogInterface dialogInterface) {
        String str;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SNUnsubscribeSheetHelper", "dismiss sheet cancel");
        GroupUnsubscribeSetting groupUnsubscribeSetting = (GroupUnsubscribeSetting) c0p4o.l0;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", "notification_page");
        pairArr[1] = new Pair("account_type", groupUnsubscribeSetting.accountType);
        pairArr[2] = new Pair("action_type", "other");
        C1246360iXS c1246360iXS = C1902890zcN.LIZ;
        if (c1246360iXS != null) {
            str = c1246360iXS.LIZJ;
        } else {
            str = null;
        }
        pairArr[3] = new Pair("cell_type", str);
        C20684815ws.LJFF().execute(new RunnableC514801zW(C2097608Jq.LJIIJ(pairArr), 62));
    }

    public static final void onCancel$1(C0P4O c0p4o, DialogInterface dialogInterface) {
        C626710Oi5.LIZ(C626710Oi5.LIZ, (String) ((LinkedHashMap) ((TopicReviewPanel) c0p4o.l0).UR().LLILLL).get("enter_method"), (String) ((LinkedHashMap) ((TopicReviewPanel) c0p4o.l0).UR().LLILLL).get("previous_page"), C626730Oi7.LIZ(((TopicReviewPanel) c0p4o.l0).UR().LLILLJJLI), ((TopicReviewPanel) c0p4o.l0).UR().LL, (String) ((LinkedHashMap) ((TopicReviewPanel) c0p4o.l0).UR().LLILLL).get("topic_title"), null, "cancel", 321);
    }
}
