package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0ZDS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDS {
    public static final C0ZDS LIZ = new C0ZDS();

    public static C830490Whz LIZ(String str, TextContent textContent) {
        boolean z;
        boolean z2;
        int size;
        int memberCount;
        C830490Whz c830490Whz = new C830490Whz();
        List<RichTextInfo> richTextInfos = textContent.getRichTextInfos();
        if (richTextInfos != null && !richTextInfos.isEmpty()) {
            Iterator<RichTextInfo> it2 = richTextInfos.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                RichTextInfo next = it2.next();
                if (next.type == C0I1M.MENTION_ALL.getValue()) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
            Iterator<RichTextInfo> it3 = richTextInfos.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                RichTextInfo next2 = it3.next();
                if (next2.type == C0I1M.MENTION_SINGLE.getValue()) {
                    if (next2 != null) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z) {
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
                if (c0y8tLIZ != null) {
                    memberCount = c0y8tLIZ.getMemberCount();
                } else {
                    memberCount = 0;
                }
                size = Math.max(memberCount - 1, 0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<RichTextInfo> it4 = richTextInfos.iterator();
                while (it4.hasNext()) {
                    String str2 = it4.next().mentionedUid;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                size = C13LP.LLIIJI(arrayList).size();
            }
            StringBuilder sb = new StringBuilder(e3.e);
            if (z2) {
                sb.append("user");
            }
            if (z) {
                if (z2) {
                    sb.append(", ");
                }
                sb.append("all");
            }
            sb.append(e3.f);
            c830490Whz.put("mention_cnt", String.valueOf(size));
            c830490Whz.put("mention_type", sb.toString());
        }
        return c830490Whz;
    }

    public static void LIZIZ(C0ZDS c0zds, String str, Integer num, String str2, int i, Map map) {
        C0I0B.LJFF.LIZIZ();
        c0zds.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.putAll(map);
        if (!Intrinsics.LJFF(str2, CardStruct.IStatusCode.DEFAULT)) {
            c830490Whz.put("to_user_id", str2);
            c830490Whz.put("relation_tag", String.valueOf(i));
            c830490Whz.put("mention_type", "user");
        } else {
            c830490Whz.put("mention_type", "all");
        }
        if (num != null) {
            c830490Whz.put("rank_num", num.toString());
        }
        c830490Whz.put("action", str);
        C20684815ws.LJIILLIIL("dm_mention_user_click", c830490Whz);
    }
}
