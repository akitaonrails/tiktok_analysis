package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.music.dsp.dm.audio.LifecycleAwareMusicPlayer;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.08jX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2199308jX {
    public static final C2199208jW LIZ = new InterfaceC620290OUp() { // from class: X.08jW
        @Override // X.InterfaceC620290OUp
        public final void LIZJ() {
            WeakReference<LifecycleAwareMusicPlayer> weakReference = C2199308jX.LIZIZ;
            if (weakReference != null) {
                weakReference.clear();
            }
            C2199308jX.LIZJ = null;
        }

        @Override // X.InterfaceC620290OUp
        public final void LIZLLL() {
            C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C2199008jU(null), 3);
            C618930OPj c618930OPj = C618930OPj.LIZ;
            DmMessageConfig dmMessageConfig = C2199308jX.LIZJ;
            c618930OPj.getClass();
            C618930OPj.LIZ(dmMessageConfig);
        }

        @Override // X.InterfaceC620290OUp
        public final void LIZ(float f, boolean z) {
            C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C2199108jV(null), 3);
            C618930OPj c618930OPj = C618930OPj.LIZ;
            DmMessageConfig dmMessageConfig = C2199308jX.LIZJ;
            c618930OPj.getClass();
            C618930OPj.LIZIZ(dmMessageConfig, f, z);
        }

        @Override // X.InterfaceC620290OUp
        public final void LJ(String str, C0OR6 c0or6) {
            int i;
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(topActivity);
                if (c0or6 == C0OR6.ERROR_CODE_NO_COPYRIGHT) {
                    i = 2131857163;
                } else {
                    i = 2131829440;
                }
                c1389890mGx.LJIIIZ(i);
                c1389890mGx.LJIIJJI();
            }
            LIZ(0.0f, false);
        }

        @Override // X.InterfaceC620290OUp
        public final void LIZIZ(DmMessageConfig dmMessageConfig, float f, boolean z) {
            C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C2198908jT(dmMessageConfig, null), 3);
            C618930OPj.LIZ.getClass();
            C618930OPj.LIZIZ(dmMessageConfig, f, z);
        }
    };
    public static WeakReference<LifecycleAwareMusicPlayer> LIZIZ;
    public static DmMessageConfig LIZJ;
}
