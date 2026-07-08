package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0KUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518420KUu {
    public static final boolean LIZJ(DataChannel dataChannel) {
        Room room;
        User owner;
        SubscribeInfo subscribeInfo;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
            return subscribeInfo.isAnchorQualified();
        }
        return false;
    }

    public static final boolean LIZLLL(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void LIZIZ(C474500IjA c474500IjA, DataChannel dataChannel) {
        c474500IjA.LJJIIZI(C494680Jac.LJJIFFI(LIZJ(dataChannel), LIZLLL(dataChannel), false));
    }

    public static void LIZ(C1106200etO c1106200etO, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, String str13, String str14, int i) {
        String str15 = str6;
        String str16 = str5;
        String str17 = str4;
        String str18 = str9;
        String str19 = str8;
        String str20 = str7;
        String str21 = str11;
        String str22 = str10;
        List list2 = list;
        String str23 = str14;
        String str24 = str13;
        String str25 = str12;
        if ((i & 8) != 0) {
            str17 = null;
        }
        if ((i & 16) != 0) {
            str16 = null;
        }
        if ((i & 32) != 0) {
            str15 = null;
        }
        if ((i & 64) != 0) {
            str20 = null;
        }
        if ((i & 128) != 0) {
            str19 = null;
        }
        if ((i & 256) != 0) {
            str18 = null;
        }
        if ((i & 512) != 0) {
            list2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str22 = null;
        }
        if ((i & 16384) != 0) {
            str21 = null;
        }
        if ((65536 & i) != 0) {
            str25 = null;
        }
        if ((262144 & i) != 0) {
            str24 = null;
        }
        if ((i & 524288) != 0) {
            str23 = null;
        }
        c1106200etO.LJIIIZ = str3;
        c1106200etO.LJIIJ = str17;
        c1106200etO.LJIIJJI = str16;
        c1106200etO.LIZJ = UserService.getInstance().user().getCurrentUserId();
        c1106200etO.LJJJJ = str2;
        c1106200etO.LJIIL = str;
        c1106200etO.LIZIZ("third_party_title", str24);
        c1106200etO.LIZIZ("third_party_desc", str23);
        c1106200etO.LIZIZ("sender_preview_text", str15);
        c1106200etO.LIZIZ("receiver_preview_text", str20);
        c1106200etO.LIZIZ("quote_preview_text", str19);
        c1106200etO.LIZIZ("title_key", str18);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list2);
            c1106200etO.LIZJ("title_key_args", arrayList);
        }
        c1106200etO.LIZIZ("desc_key", null);
        c1106200etO.LIZIZ("sender_preview_text_key", str22);
        c1106200etO.LIZIZ("receiver_preview_text_key", str21);
        c1106200etO.LIZIZ("quote_preview_text_key", str25);
    }
}
