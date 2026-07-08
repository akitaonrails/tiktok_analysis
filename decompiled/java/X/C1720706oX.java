package X;

import android.content.Context;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06oX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1720706oX {
    public static final /* synthetic */ C1720706oX LIZ = new C1720706oX();
    public static final C01GW<IAwemeOpenHelper> LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(507));

    public static IAwemeOpenHelper LIZ() {
        return LIZIZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(C1720706oX c1720706oX, Context context, View view, C0Z92 c0z92, Aweme aweme, EnumC899970ZSh enumC899970ZSh, String str, C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str2, boolean z, String str3, String str4, C0ZU4 c0zu4, List list, int i) {
        String nickName;
        Aweme awemeLIZ = aweme;
        View view2 = view;
        List list2 = list;
        C0ZU4 c0zu42 = c0zu4;
        String str5 = null;
        if ((i & 2) != 0) {
            view2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            str5 = str4;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c0zu42 = C0ZU4.CHAT;
        }
        if ((i & 8192) != 0) {
            list2 = C13BV.INSTANCE;
        }
        c1720706oX.getClass();
        IAwemeOpenHelper iAwemeOpenHelperLIZ = LIZ();
        if (iAwemeOpenHelperLIZ != 0) {
            if (awemeLIZ == null) {
                awemeLIZ = C327340CsO.LIZ(str);
            }
            int legacyTagType = enumC899970ZSh.getLegacyTagType();
            String singleChatFromUserId = sessionInfo.getSingleChatFromUserId();
            String str6 = "";
            if (singleChatFromUserId == null) {
                singleChatFromUserId = "";
            }
            IMUser singleChatFromUser = sessionInfo.getSingleChatFromUser();
            if (singleChatFromUser != null && (nickName = singleChatFromUser.getNickName()) != null) {
                str6 = nickName;
            }
            iAwemeOpenHelperLIZ.LJ(context, c0z92, awemeLIZ, legacyTagType, list2, str, c869590Y9l, sessionInfo, str2, z, str3, singleChatFromUserId, str6, view2, str5, c0zu42);
        }
    }
}
