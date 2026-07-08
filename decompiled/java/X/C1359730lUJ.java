package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.CarrierType;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0lUJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359730lUJ {
    public static void LIZIZ(Context context) {
        if (RepostInputFragment.LLLIILIL == -1) {
            RepostInputFragment.LLLIILIL = System.currentTimeMillis();
        }
        if (C1358180lRo.LIZ()) {
            C21146717pB.LIZJ(context, R.layout.i6j);
        }
    }

    public static RepostInputFragment LIZ(Aweme aweme, boolean z, String str, String str2, String str3, String str4, EnumC1359800lUQ enumC1359800lUQ, InterfaceC1359760lUM interfaceC1359760lUM, CarrierType carrierType, String str5, String str6, String str7, String str8, Map map, int i) {
        String str9 = RepostInputFragment._pnsPageId;
        Map map2 = null;
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = "";
        }
        if ((i & 256) != 0) {
            interfaceC1359760lUM = null;
        }
        if ((i & 512) != 0) {
            carrierType = null;
        }
        if ((i & 1024) != 0) {
            str5 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str7 = null;
        }
        if ((i & 8192) != 0) {
            str8 = null;
        }
        if ((i & 16384) == 0) {
            map2 = map;
        }
        RepostInputFragment repostInputFragment = new RepostInputFragment();
        repostInputFragment.LLJJ = aweme;
        repostInputFragment.LLJJIII = str;
        repostInputFragment.LLJJIJI = str2;
        repostInputFragment.LLJJIJIL = z;
        repostInputFragment.LLJJJ = str3;
        repostInputFragment.LLJJJJ = str4;
        repostInputFragment.LLJJJJJIL = false;
        repostInputFragment.LLJJJJLIIL = interfaceC1359760lUM;
        repostInputFragment.LLJJL = enumC1359800lUQ;
        repostInputFragment.LLJLL = carrierType;
        repostInputFragment.LLJLLIL = str5;
        repostInputFragment.LLJLLL = str6;
        repostInputFragment.LLJZ = str7;
        repostInputFragment.LLJZIJLIL = str8;
        if (map2 != null) {
            String str10 = (String) map2.get("enter_method");
            if (str10 != null) {
                repostInputFragment.LLJJIJI = str10;
            }
            String str11 = (String) map2.get("publish_repost_text_enter_method");
            if (str11 != null) {
                repostInputFragment.LLL = str11;
            }
        }
        return repostInputFragment;
    }
}
