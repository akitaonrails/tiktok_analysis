package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptConfig;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings.MessageRequestPromptData;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ytq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888800Ytq {
    public static final MessageRequestPromptConfig LIZ = new MessageRequestPromptConfig(Boolean.FALSE, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(546));

    public static MessageRequestPromptConfig LIZLLL() {
        return (MessageRequestPromptConfig) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        MessageRequestPromptData messageRequestPromptData;
        Boolean bool = LIZLLL().isEnable;
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.LJFF(bool, bool2) && (messageRequestPromptData = LIZLLL().chatInlineMsgPromptData) != null && Intrinsics.LJFF(messageRequestPromptData.isEnable, bool2);
    }

    public static boolean LIZIZ() {
        MessageRequestPromptData messageRequestPromptData;
        Boolean bool = LIZLLL().isEnable;
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.LJFF(bool, bool2) && (messageRequestPromptData = LIZLLL().inboxBannerPromptData) != null && Intrinsics.LJFF(messageRequestPromptData.isEnable, bool2);
    }

    public static boolean LIZJ() {
        MessageRequestPromptData messageRequestPromptData;
        Boolean bool = LIZLLL().isEnable;
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.LJFF(bool, bool2) && (messageRequestPromptData = LIZLLL().messageRequestBannerPromptData) != null && Intrinsics.LJFF(messageRequestPromptData.isEnable, bool2);
    }
}
