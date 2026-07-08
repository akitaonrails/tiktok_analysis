package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.bulletin.music.LifecycleMusicPlayer;
import com.ss.android.ugc.aweme.music.model.Music;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.15Ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20501815Ke implements InterfaceC20501915Kf {
    @Override // X.InterfaceC20501915Kf
    public final void LJ() {
        WeakReference<LifecycleMusicPlayer> weakReference = C20501715Kd.LIZIZ;
        if (weakReference != null) {
            weakReference.clear();
        }
        C20501715Kd.LIZJ = null;
        Iterator<InterfaceC20501915Kf> it2 = C20501715Kd.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ();
        }
    }

    @Override // X.InterfaceC20501915Kf
    public final void LIZIZ(Music music) throws JSONException {
        C1877320yx8 c1877320yx8 = C20501715Kd.LIZJ;
        if (c1877320yx8 != null) {
            C20501715Kd.LIZ(c1877320yx8.LIZIZ, 1);
        }
        Iterator<InterfaceC20501915Kf> it2 = C20501715Kd.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(music);
        }
    }

    @Override // X.InterfaceC20501915Kf
    public final void LJFF(Music music) throws JSONException {
        C1877320yx8 c1877320yx8 = C20501715Kd.LIZJ;
        if (c1877320yx8 != null) {
            C20501715Kd.LIZ(c1877320yx8.LIZIZ, 2);
            C2344009Gk c2344009Gk = new C2344009Gk();
            Map<String, Object> map = c1877320yx8.LIZJ;
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    c2344009Gk.LJFF(entry.getKey(), entry.getValue().toString());
                }
            }
            C20684815ws.LJIILLIIL("play_music", c2344009Gk.LIZ);
        }
        Iterator<InterfaceC20501915Kf> it2 = C20501715Kd.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(music);
        }
    }

    @Override // X.InterfaceC20501915Kf
    public final void LIZ(Music music, C0OR7 c0or7) throws JSONException {
        Activity activityLIZIZ;
        Activity activityLIZ;
        int i;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            if (c0or7 == C0OR7.ERROR_CODE_NO_COPYRIGHT) {
                i = 2131857163;
            } else {
                i = 2131829440;
            }
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
        Iterator<InterfaceC20501915Kf> it2 = C20501715Kd.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(music, c0or7);
        }
        LIZJ(music, 0.0f, false);
    }

    @Override // X.InterfaceC20501915Kf
    public final void LIZJ(Music music, float f, boolean z) throws JSONException {
        C1877320yx8 c1877320yx8 = C20501715Kd.LIZJ;
        if (c1877320yx8 != null) {
            C20501715Kd.LIZ(c1877320yx8.LIZIZ, 0);
        }
        Iterator<InterfaceC20501915Kf> it2 = C20501715Kd.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(music, f, z);
        }
    }

    @Override // X.InterfaceC20501915Kf
    public final void LIZLLL(Music music, String str, float f, boolean z) {
        C20501715Kd.LIZ(str, 0);
        Iterator<InterfaceC20501915Kf> it2 = C20501715Kd.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(music, str, f, z);
        }
    }
}
