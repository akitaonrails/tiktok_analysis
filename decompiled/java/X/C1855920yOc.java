package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0yOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855920yOc {
    public static final List<String> LIZ(Message message) {
        boolean z;
        try {
            if (message.ext.hashTags.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return C13BV.INSTANCE;
            }
            JSONArray jSONArray = new JSONArray(message.ext.hashTags);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public static final String LIZIZ(Message message) {
        return LIZJ(Integer.valueOf(message.ext.activeActionBar));
    }

    public static final String LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "deep_thinking";
            }
            if (num.intValue() == 2) {
                return "homework";
            }
            if (num.intValue() == 3) {
                return "ai_image";
            }
            if (num.intValue() == 4) {
                return "create_image";
            }
            if (num.intValue() == 5) {
                return "edit_image";
            }
        }
        if (num != null) {
            if (num.intValue() == 6 || num.intValue() == 6001) {
                return "image_to_video";
            }
            return "default";
        }
        return "default";
    }

    public static final String LIZLLL(Message message) {
        String str = message.ext.imageTemplateInfo;
        if (str.length() == 0) {
            return message.ext.legacyTemplateInfo;
        }
        return str;
    }

    public static final BatchUpdateMessage LJ(Message message, List<Integer> list) {
        Message messageLIZLLL = message;
        String str = messageLIZLLL.msgId;
        if (!list.isEmpty()) {
            messageLIZLLL = Message.LIZLLL(messageLIZLLL, null, 0, false, 0, false, null, false, -1, 2097151);
        }
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().intValue() == 0) {
                messageLIZLLL.LJIIJJI(AFwS269S0000000_27.get$arr$(404));
            }
        }
        return new BatchUpdateMessage(str, list, messageLIZLLL, null, 8, null);
    }
}
