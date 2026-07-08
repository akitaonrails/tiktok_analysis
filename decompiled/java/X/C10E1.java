package X;

import android.content.Context;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.10E1, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public interface C10E1 {
    void LIZ(boolean z);

    void LIZIZ(Context context, User user);

    boolean LIZJ();

    void LIZLLL(Context context);

    C11NZ LJ(int i, String str);

    void LJFF(Context context);

    void LJI(Context context);

    void LJII(boolean z);

    void LJIIIIZZ(Context context, User user);

    boolean LJIIIZ();

    void LJIIJ(Context context);

    C11NZ<C1641660sp2<NotificationLiveStatus>> LJIIJJI(String str);

    boolean LJIIL();

    boolean LJIILIIL();

    void LJIILJJIL(String str);

    void LJIILL(C10ET c10et);

    void LJIILLIIL(boolean z);

    boolean getPushLiveState();

    void hideNotificationTipDialog(Context context);
}
