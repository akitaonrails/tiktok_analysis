package X;

import android.app.Activity;
import com.google.android.play.core.appupdate.b;
import com.google.android.play.core.install.InstallState;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10Xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19262110Xj implements InterfaceC2425409eu {
    public static final C19262110Xj LIZ = new C19262110Xj();

    @Override // X.InterfaceC2425409eu
    public final void LIZ(Object obj) {
        Activity activity;
        if (((InstallState) obj).LIZJ() == 11) {
            C813020Vuu c813020VuuLJIIL = C813020Vuu.LJIIL();
            C844470XAv.LIZ.getClass();
            c813020VuuLJIIL.LJI(C844470XAv.LIZ(), "KEY_DOWNLOADED_FOR_UPDATE", true);
            C813020Vuu.LJIIL().LJI(C844470XAv.LIZ(), "KEY_UPDATE_IN_PROGRESS", false);
            C19261910Xh c19261910Xh = C19261910Xh.LIZ;
            C19261910Xh.LIZJ("app_update_download_finish");
            if (C2214201BlK.LJIIJJI) {
                b bVar = C19261910Xh.LIZIZ;
                if (bVar != null) {
                    bVar.LJ();
                    return;
                }
                return;
            }
            if (C19261910Xh.LIZLLL) {
                return;
            }
            C19261910Xh.LIZLLL = true;
            WeakReference<Activity> weakReference = C19261910Xh.LJ;
            if (weakReference == null || (activity = weakReference.get()) == null) {
                return;
            }
            if (activity.isFinishing()) {
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF == null) {
                    return;
                }
                c19261910Xh.getClass();
                C1397510mTF c1397510mTFLIZIZ = C19261910Xh.LIZIZ(activityLJFF);
                if (c1397510mTFLIZIZ.LJIIIZ()) {
                    return;
                }
                c1397510mTFLIZIZ.LIZLLL();
                return;
            }
            C1397510mTF c1397510mTFLIZIZ2 = C19261910Xh.LIZIZ(activity);
            if (c1397510mTFLIZIZ2.LJIIIZ()) {
                return;
            }
            c1397510mTFLIZIZ2.LIZLLL();
        }
    }
}
