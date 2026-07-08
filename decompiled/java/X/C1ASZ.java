package X;

import android.app.Notification;
import android.media.MediaMetadataRetriever;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.helper.AlertTonePlayer;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ASZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ASZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AlertTonePlayer LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Notification LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ASZ(AlertTonePlayer alertTonePlayer, int i, Notification notification, String str) {
        super(0);
        this.LL = alertTonePlayer;
        this.LLILLJJLI = i;
        this.LLILLL = notification;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws IOException {
        String strLIZJ;
        Long lLJIILIIL;
        AlertTonePlayer alertTonePlayer = this.LL;
        AlertTonePlayer.ForegroundObserverForSilenceSound foregroundObserverForSilenceSound = alertTonePlayer.LIZLLL;
        if (foregroundObserverForSilenceSound == null) {
            foregroundObserverForSilenceSound = new AlertTonePlayer.ForegroundObserverForSilenceSound(alertTonePlayer, this.LLILLJJLI, this.LLILLL, alertTonePlayer.LIZ);
            this.LL.LIZLLL = foregroundObserverForSilenceSound;
        }
        foregroundObserverForSilenceSound.LL = this.LLILLJJLI;
        foregroundObserverForSilenceSound.LLILLJJLI = this.LLILLL;
        AlertTonePlayer alertTonePlayer2 = this.LL;
        String str = this.LLILZ;
        alertTonePlayer2.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(alertTonePlayer2.LIZ.LIZLLL(str));
                strLIZJ = C20144413ru.LIZJ(mediaMetadataRetriever);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            long jLongValue = (strLIZJ == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZJ)) == null) ? 3000L : lLJIILIIL.longValue();
            mediaMetadataRetriever.release();
            foregroundObserverForSilenceSound.LLILLL = System.currentTimeMillis() + jLongValue;
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.Companion;
            companion.get().getLifecycle().removeObserver(foregroundObserverForSilenceSound);
            companion.get().getLifecycle().addObserver(foregroundObserverForSilenceSound);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mediaMetadataRetriever.release();
            throw th;
        }
    }
}
