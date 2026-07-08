package X;

import Y.ACallableS430S0100000_25;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS163S0101000_25;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629630sVd implements IEffectDownloadProgressListener, InterfaceC1629540sVU {
    public final Effect LIZ;
    public final IEffectDownloadProgressListener LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile int LJ;
    public volatile int LJFF;
    public long LJI;

    @Override // X.InterfaceC1629540sVU
    public final void onFailed() {
        this.LIZLLL = true;
        C1624360sN8.LIZ.put(this.LIZ.getEffectId(), null);
        LIZLLL();
    }

    public final void LIZLLL() {
        if (this.LIZJ && this.LIZLLL) {
            LIZJ(new AwS569S0100000_25(this, 1109));
        }
    }

    public final void LJ() {
        LIZJ(new AwS163S0101000_25(this, (this.LIZJ || this.LIZLLL) ? !this.LIZLLL ? (this.LJFF + 100) / 2 : !this.LIZJ ? (this.LJ + 100) / 2 : 100 : (this.LJFF + this.LJ) / 2, 10));
    }

    public static void LIZJ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C15O7.LIZIZ(new ACallableS430S0100000_25(function0, 5), C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC1629540sVU
    public final void onProgress(int i) {
        this.LJFF = i;
        LJ();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        LIZJ(new AwS426S0200000_25(this, effect, 182));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZJ = true;
        LIZLLL();
    }

    public C1629630sVd(Effect effect, C1629490sVP c1629490sVP) {
        this.LIZ = effect;
        this.LIZIZ = c1629490sVP;
    }

    @Override // X.InterfaceC1629540sVU
    public final void LIZ(InterfaceC1629560sVW interfaceC1629560sVW, String str) {
        this.LIZLLL = true;
        String effectId = this.LIZ.getEffectId();
        if (interfaceC1629560sVW != null) {
            interfaceC1629560sVW.setMusicPriority(-1);
        }
        C1624360sN8.LIZ.put(effectId, interfaceC1629560sVW);
        C1624360sN8.LIZIZ.put(effectId, str);
        if (str != null) {
            ((Keva) C1629700sVk.LIZ.getValue()).storeString(interfaceC1629560sVW.getMusicId(), str);
        }
        LIZLLL();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        LIZJ(new AwS269S0300000_25(this, effect, exceptionResult, 27));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        this.LJI = j;
        this.LJ = i;
        LJ();
    }
}
