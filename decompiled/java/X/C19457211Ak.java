package X;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.recorder.sticker.slowmo.SlowMotionSoundTrackView$observer$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.11Ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19457211Ak extends C15RW {
    public final Context LLJJJJJIL;
    public MediaPlayer LLJJJJLIIL;
    public boolean LLJJL;
    public AnonymousClass0956 LLJJLIIIJLLLLLLLZ;
    public C19457311Al LLJL;
    public LifecycleOwner LLJLIL;
    public int LLJLILLLLZIIL;
    public final SlowMotionSoundTrackView$observer$1 LLJLL;

    public final void LJIIIZ() {
        Lifecycle lifecycle;
        LJIIJ(AFwS273S0000000_29.get$arr$(248));
        this.LLJJL = true;
        AnonymousClass0956 anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJL = null;
        LifecycleOwner lifecycleOwner = this.LLJLIL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.LLJLL);
        }
        this.LLJLIL = null;
    }

    public C19457211Ak(Context context) {
        super(context, null);
        this.LLJJJJJIL = context;
        this.LLJLL = new SlowMotionSoundTrackView$observer$1(this);
    }

    private final void setUpView(C19457311Al c19457311Al) {
        long j = c19457311Al.LIZIZ;
        LIZ((int) (j + c19457311Al.LIZ), (int) (c19457311Al.LIZLLL + j));
        LIZIZ(c19457311Al.LJ, o.LJI.getMusicDuration(c19457311Al.LJFF));
        setTotalTime(c19457311Al.LIZJ);
        setPastPosition((int) (Math.max(0L, c19457311Al.LIZ) + c19457311Al.LIZIZ));
        setStopPosition((int) c19457311Al.LJI);
    }

    public final void LJIIJ(Function1<? super MediaPlayer, Unit> function1) {
        MediaPlayer mediaPlayer = this.LLJJJJLIIL;
        if (mediaPlayer != null) {
            try {
                function1.invoke(mediaPlayer);
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPause: IllegalStateException ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public final void LJIIJJI(C19457311Al c19457311Al, LifecycleOwner lifecycleOwner, boolean z) {
        Lifecycle lifecycle;
        if (!z) {
            LJIIIZ();
            return;
        }
        if (!Intrinsics.LJFF(lifecycleOwner, this.LLJLIL)) {
            LifecycleOwner lifecycleOwner2 = this.LLJLIL;
            if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                lifecycle.removeObserver(this.LLJLL);
            }
            Lifecycle lifecycle2 = lifecycleOwner.getLifecycle();
            if (lifecycle2 != null) {
                lifecycle2.addObserver(this.LLJLL);
            }
            this.LLJLIL = lifecycleOwner;
        }
        if (Intrinsics.LJFF(c19457311Al, this.LLJL)) {
            return;
        }
        LJIIJ(AFwS273S0000000_29.get$arr$(249));
        this.LLJL = c19457311Al;
        this.LLJJJJLIIL = MediaPlayer.create(this.LLJJJJJIL, UriProtector.parse(c19457311Al.LJFF));
        LJIIJ(new AwS608S0100000_29(c19457311Al, 443));
        this.LLJLILLLLZIIL = (int) (c19457311Al.LIZIZ + c19457311Al.LIZLLL);
        setUpView(c19457311Al);
        setOnProgressChangeListener(new InterfaceC19457511An() { // from class: X.11Am
            @Override // X.InterfaceC19457511An
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC19457511An
            public final void LIZIZ(int i, int i2) {
                this.LIZ.LJIIJ(new AwS41S0001000_29(i, 28));
                this.LIZ.LJIIJ(AFwS273S0000000_29.get$arr$(250));
            }
        });
        LJIIJ(AFwS273S0000000_29.get$arr$(251));
    }
}
