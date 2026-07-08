package X;

import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.play.core.appupdate.a;
import com.google.android.play.core.appupdate.b;
import com.google.android.play.core.appupdate.c;
import com.google.android.play.core.appupdate.d;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.10Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19261910Xh {
    public static final C19261910Xh LIZ = new C19261910Xh();
    public static b LIZIZ;
    public static C19262110Xj LIZJ;
    public static boolean LIZLLL;
    public static WeakReference<Activity> LJ;

    public static final void LIZ(final Activity activity) {
        C835510Wq5 c835510Wq5LIZIZ;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("in_app_updates_switch", true)) {
            return;
        }
        LJ = new WeakReference<>(activity);
        if (LIZIZ == null) {
            LIZIZ = c.LIZ(C786410Ut5.L3(activity));
        }
        C19262110Xj c19262110Xj = C19262110Xj.LIZ;
        b bVar = LIZIZ;
        if (bVar != null) {
            bVar.LIZ();
        }
        LIZJ = c19262110Xj;
        b bVar2 = LIZIZ;
        if (bVar2 != null && (c835510Wq5LIZIZ = bVar2.LIZIZ()) != null) {
            c835510Wq5LIZIZ.LJFF(new InterfaceC835710WqP() { // from class: X.10Xi
                @Override // X.InterfaceC835710WqP
                public final void onSuccess(Object obj) {
                    b bVar3;
                    a aVar = (a) obj;
                    int i = aVar.LIZIZ;
                    if (i == 2) {
                        if (aVar.LIZ(d.LIZJ()) != null) {
                            C19261910Xh.LIZJ("app_update_toast_show");
                            C813020Vuu c813020VuuLJIIL = C813020Vuu.LJIIL();
                            C844470XAv.LIZ.getClass();
                            c813020VuuLJIIL.LJI(C844470XAv.LIZ(), "KEY_UPDATE_IN_PROGRESS", true);
                            try {
                                b bVar4 = C19261910Xh.LIZIZ;
                                if (bVar4 != null) {
                                    bVar4.LIZJ(aVar, activity);
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return;
                            }
                        }
                        return;
                    }
                    if (i == 3) {
                        C813020Vuu c813020VuuLJIIL2 = C813020Vuu.LJIIL();
                        C844470XAv.LIZ.getClass();
                        if (c813020VuuLJIIL2.LIZIZ(C844470XAv.LIZ(), "KEY_DOWNLOADED_FOR_UPDATE", false)) {
                            if (activity.isFinishing()) {
                                C19261910Xh c19261910Xh = C19261910Xh.LIZ;
                                c19261910Xh.getClass();
                                Activity activityLJFF = C2214201BlK.LJFF();
                                if (activityLJFF != null) {
                                    c19261910Xh.getClass();
                                    C1397510mTF c1397510mTFLIZIZ = C19261910Xh.LIZIZ(activityLJFF);
                                    if (!c1397510mTFLIZIZ.LJIIIZ()) {
                                        c1397510mTFLIZIZ.LIZLLL();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            C19261910Xh c19261910Xh2 = C19261910Xh.LIZ;
                            Activity activity2 = activity;
                            c19261910Xh2.getClass();
                            C1397510mTF c1397510mTFLIZIZ2 = C19261910Xh.LIZIZ(activity2);
                            if (!c1397510mTFLIZIZ2.LJIIIZ()) {
                                c1397510mTFLIZIZ2.LIZLLL();
                                return;
                            }
                            return;
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(activity);
                        c1389890mGx.LJIIIZ(R.string.dn8);
                        c1389890mGx.LJIIJJI();
                        try {
                            b bVar5 = C19261910Xh.LIZIZ;
                            if (bVar5 != null) {
                                bVar5.LIZJ(aVar, activity);
                                return;
                            }
                            return;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return;
                        }
                    }
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                    c1389890mGx2.LJIIIZ(2131836432);
                    c1389890mGx2.LJIIJJI();
                    C19262110Xj c19262110Xj2 = C19261910Xh.LIZJ;
                    if (c19262110Xj2 != null && (bVar3 = C19261910Xh.LIZIZ) != null) {
                        bVar3.LIZLLL(c19262110Xj2);
                    }
                }
            });
        }
    }

    public static C1397510mTF LIZIZ(Activity activity) {
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJFF(R.string.kr_);
        c1397580mTM.LIZIZ(activity.getString(2131836182));
        C985403tE.LIZ(c1397580mTM, AFwS271S0000000_28.get$arr$(263));
        c1397580mTM.LJII = false;
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        c1397510mTF.LIZLLL();
        return c1397510mTF;
    }

    public static final void LIZJ(String str) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("in_app_updates_switch", true)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "flexible");
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        }
    }
}
