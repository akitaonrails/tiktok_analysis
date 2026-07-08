package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS101S0400000_2;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: renamed from: X.06ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1684206ie {
    public static final C1684206ie LIZ = new C1684206ie();

    public static String LIZIZ(C869590Y9l c869590Y9l) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId());
        if (c0y8tLIZ != null && c0y8tLIZ.isRisky()) {
            return "filtered_message_request";
        }
        return "chat";
    }

    public static C1247510iZJ LIZJ(Activity activity, C869590Y9l c869590Y9l, SessionInfo sessionInfo) {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(R.string.s65);
        c1247510iZJ.LIZJ = 1;
        c1247510iZJ.LIZ(new AwS211S0300000_2(activity, c869590Y9l, sessionInfo, 15));
        return c1247510iZJ;
    }

    public static C1247510iZJ LIZ(Activity activity, C869590Y9l c869590Y9l, SessionInfo sessionInfo, IMUser iMUser) {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(R.string.eh0);
        c1247510iZJ.LIZJ = 1;
        c1247510iZJ.LIZ(new AwS101S0400000_2(activity, c869590Y9l, sessionInfo, iMUser, 11));
        return c1247510iZJ;
    }

    public static void LIZLLL(C1684206ie c1684206ie, Context context, C869590Y9l c869590Y9l, SessionInfo sessionInfo, boolean z) {
        FragmentManager supportFragmentManager;
        Activity activityLIZ;
        boolean z2;
        C1247510iZJ[] c1247510iZJArr;
        int i;
        PrivacySettingsFeature imPrivacySettings = C1336205Ku.LIZ(false).getImPrivacySettings();
        c1684206ie.getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(c869590Y9l.getSender()), c869590Y9l.getSecSender(), "im_local_db");
            if (iMUserLJIIL != null) {
                if (z || (C1693106k5.LIZ() == 0 && C0Z5J.LIZJ(c869590Y9l))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c1247510iZJArr = new C1247510iZJ[3];
                    c1247510iZJArr[0] = LIZJ(activityLIZ, c869590Y9l, sessionInfo);
                    c1247510iZJArr[1] = LIZ(activityLIZ, c869590Y9l, sessionInfo, iMUserLJIIL);
                    C1247510iZJ c1247510iZJ = new C1247510iZJ();
                    if (!imPrivacySettings.LJIIZILJ()) {
                        i = 2131831704;
                    } else {
                        i = 2131831703;
                    }
                    c1247510iZJ.LIZIZ(i);
                    c1247510iZJ.LIZ(new AwS368S0200000_2(context, c869590Y9l, 101));
                    c1247510iZJArr[2] = c1247510iZJ;
                } else {
                    c1247510iZJArr = new C1247510iZJ[]{LIZJ(activityLIZ, c869590Y9l, sessionInfo), LIZ(activityLIZ, c869590Y9l, sessionInfo, iMUserLJIIL)};
                }
                C1390850mIV c1390850mIV = new C1390850mIV();
                c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
                c1390850mIV.LIZJ().show(supportFragmentManager, "DMMediaNudeFilterHelper#showMenuSheet");
            }
        }
    }
}
