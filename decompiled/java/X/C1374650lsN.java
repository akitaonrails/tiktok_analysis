package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.share.QuickShareOutInfo;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374650lsN {
    public static final Map<String, Integer> LIZ;
    public static final Map<String, Integer> LIZIZ;

    static {
        Integer numValueOf = Integer.valueOf(R.raw.icon_messenger);
        Integer numValueOf2 = Integer.valueOf(R.raw.icon_snapchat);
        Integer numValueOf3 = Integer.valueOf(R.raw.icon_whatsapp);
        Integer numValueOf4 = Integer.valueOf(R.raw.icon_messages);
        LIZ = C2097608Jq.LJIIIIZZ(new Pair("facebook", Integer.valueOf(R.raw.icon_facebook_circle)), new Pair("instagram", Integer.valueOf(R.raw.icon_instagram)), new Pair("instagram_story", Integer.valueOf(R.raw.icon_instagram_story)), new Pair("kakaotalk", Integer.valueOf(R.raw.icon_kakaotalk)), new Pair("line", Integer.valueOf(R.raw.icon_line)), new Pair("messenger", numValueOf), new Pair("snapchat", numValueOf2), new Pair("snapchat_chats", numValueOf2), new Pair("whatsapp", numValueOf3), new Pair("whatsapp_status", numValueOf3), new Pair("zalo", Integer.valueOf(R.raw.icon_zalo)), new Pair("messenger", numValueOf), new Pair("viber", Integer.valueOf(R.raw.icon_icon_viber)), new Pair("vk", Integer.valueOf(R.raw.icon_vk)), new Pair("discord", Integer.valueOf(R.raw.icon_discord)), new Pair("twitter", Integer.valueOf(R.raw.icon_twitter)), new Pair("sms", numValueOf4), new Pair("kakao_story", Integer.valueOf(R.raw.icon_kakao_story)), new Pair("copy", Integer.valueOf(R.raw.icon_link_fill)), new Pair("telegram", Integer.valueOf(R.raw.icon_telegram)), new Pair("instagram_dm", Integer.valueOf(R.raw.icon_instagram_messenger)), new Pair("google_messages", numValueOf4));
        LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("instagram_dm", Integer.valueOf(R.raw.icon_color_instagram_messenger_circle)), new Pair("snapchat_chats", Integer.valueOf(R.raw.icon_color_snapchat_circle)));
    }

    public static boolean LIZ(Aweme aweme) {
        ShareInfo shareInfo;
        QuickShareOutInfo quickShareOutInfo;
        if (QuickExternalShareVM.LLILZIL == null || (shareInfo = aweme.getShareInfo()) == null || (quickShareOutInfo = shareInfo.getQuickShareOutInfo()) == null || !Intrinsics.LJFF(quickShareOutInfo.reachThreshold, Boolean.TRUE) || C621180OYa.LIZ.LJIJJLI(aweme)) {
            return false;
        }
        return true;
    }

    public static Drawable LIZIZ(C19EG c19eg, InterfaceC1369790lkX interfaceC1369790lkX) {
        Integer num;
        Drawable drawableLJJII = interfaceC1369790lkX.LJJII(c19eg, false);
        if (!(drawableLJJII instanceof TuxIconDrawable)) {
            String strKey = interfaceC1369790lkX.key();
            Map<String, Integer> map = LIZIZ;
            if (map.keySet().contains(strKey) && (num = map.get(strKey)) != null) {
                int iIntValue = num.intValue();
                if (c19eg != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = iIntValue;
                    return c419910GdJ.LIZ(c19eg);
                }
                return null;
            }
            return null;
        }
        return drawableLJJII;
    }
}
