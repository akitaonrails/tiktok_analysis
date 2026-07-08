package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.fcm.FcmPushAdapter;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0VpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809580VpM {
    public static void LIZ(final Context context) {
        final FirebaseMessaging firebaseMessaging;
        AbstractC835450Wpz<String> abstractC835450WpzLIZJ;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(C818880WAk.LIZIZ());
        }
        InterfaceC811000Vre interfaceC811000Vre = firebaseMessaging.LIZIZ;
        if (interfaceC811000Vre != null) {
            abstractC835450WpzLIZJ = interfaceC811000Vre.LIZJ();
        } else {
            final C835520Wq6 c835520Wq6 = new C835520Wq6();
            firebaseMessaging.LJII.execute(new Runnable() { // from class: X.0VpS
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging firebaseMessaging2 = firebaseMessaging;
                    C835520Wq6 c835520Wq62 = c835520Wq6;
                    firebaseMessaging2.getClass();
                    C1C7U.LIZ("FirebaseMessaging@b71a.getToken$1L");
                    try {
                        c835520Wq62.LIZIZ(firebaseMessaging2.LIZ());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c835520Wq62.LIZ(e);
                    }
                    C1C7U.LIZIZ("FirebaseMessaging@b71a.getToken$1L");
                }
            });
            abstractC835450WpzLIZJ = c835520Wq6.LIZ;
        }
        abstractC835450WpzLIZJ.LIZIZ(new InterfaceC834580Woa<String>() { // from class: X.0VpL
            @Override // X.InterfaceC834580Woa
            public final void LIZ(AbstractC835450Wpz<String> abstractC835450Wpz) {
                C809030VoT c809030VoT = C809030VoT.LJIIJ;
                c809030VoT.LJ("registerPush_fcm_androidx");
                c809030VoT.LIZLLL("registerPush_fcm_androidx");
                c809030VoT.LIZIZ("sdk_register_push");
                if (abstractC835450Wpz != null && abstractC835450Wpz.LJIILJJIL() && abstractC835450Wpz.LJIIJ() != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FcmPushUtil.sendToken() -> getToken().onComplete(");
                    sbLIZ.append(abstractC835450Wpz.LJIIJ());
                    sbLIZ.append(")");
                    C2188811AlT.LIZIZ(sbLIZ);
                    C809580VpM.LIZIZ(context, abstractC835450Wpz.LJIIJ());
                    return;
                }
                C809030VoT.LJIIJJI().LJIIIIZZ(FcmPushAdapter.getFcmPush(), 102, CardStruct.IStatusCode.DEFAULT, "token is empty");
            }
        });
    }

    public static void LIZIZ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcmPushUtil.sendToken(");
        sbLIZ.append(str);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        if (!TextUtils.isEmpty(str)) {
            C809030VoT.LJIIZILJ().LIZJ(context, FcmPushAdapter.getFcmPush(), str);
        } else {
            C809030VoT.LJIIJJI().LJIIIIZZ(FcmPushAdapter.getFcmPush(), 102, CardStruct.IStatusCode.DEFAULT, "token is empty");
        }
    }
}
