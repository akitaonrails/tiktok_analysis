package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855910yOb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Message message, Function1 function1) {
        String strLIZLLL;
        if (message.ext.imageTemplateInfo.length() > 0) {
            return;
        }
        String str = message.replyUuid;
        if (str.length() == 0) {
            return;
        }
        Message message2 = (Message) function1.invoke(str);
        if (message.ext.imageTemplateInfo.length() <= 0 && message2 != null && (strLIZLLL = C1855920yOc.LIZLLL(message2)) != null && strLIZLLL.length() > 0) {
            message.ext.imageTemplateInfo = strLIZLLL;
        }
    }

    public static String LIZIZ(String str, Message message) {
        String str2;
        Integer num = message.ext.activeTemplateType;
        if (num != null) {
            if (num.intValue() == 1) {
                str2 = "image_generation";
            } else if (num.intValue() == 2) {
                str2 = "video_generation";
            }
            if (str2.length() > 0) {
                return str2;
            }
        }
        if (Intrinsics.LJFF(str, "image_to_video")) {
            return "video_generation";
        }
        return null;
    }

    public static String LIZJ(String str, Message message) {
        String str2 = message.ext.modeSource;
        if (str2.length() <= 0 && 0 == 0) {
            if (Intrinsics.LJFF(str, "image_to_video")) {
                return "image_to_video_button";
            }
            if (message.ext.imageTemplateId.length() <= 0 && C1855920yOc.LIZLLL(message).length() <= 0) {
                return null;
            }
            return "AI_create";
        }
        return str2;
    }
}
