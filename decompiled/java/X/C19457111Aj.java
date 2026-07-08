package X;

import android.media.MediaPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.slowmo.SlowMotionSoundTrackView$setJob$1", f = "SlowMotionSoundTrackView.kt", l = {132}, m = "invokeSuspend")
public final class C19457111Aj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19457211Ak LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19457111Aj(C19457211Ak c19457211Ak, InterfaceC1364105Vn<? super C19457111Aj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19457211Ak;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19457111Aj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlowMotionSoundTrackView@2193.setJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                try {
                    C155000ia.LIZIZ(obj);
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
        }
        while (true) {
            C19457211Ak c19457211Ak = this.LLILLJJLI;
            if (!c19457211Ak.LLJJL) {
                try {
                    MediaPlayer mediaPlayer = c19457211Ak.LLJJJJLIIL;
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        if (mediaPlayer.getCurrentPosition() < c19457211Ak.LLJLILLLLZIIL) {
                            C1DFH c1dfh = C0PEM.LIZ;
                            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                            C19457011Ai c19457011Ai = new C19457011Ai(c19457211Ak, mediaPlayer, null);
                            this.LL = 1;
                            if (C23250099c.LJI(this, abstractC2238408pq, c19457011Ai) == objLJFF) {
                                C1C7U.LIZIZ("SlowMotionSoundTrackView@2193.setJob$1");
                                return objLJFF;
                            }
                        } else {
                            mediaPlayer.stop();
                        }
                    }
                } catch (IllegalStateException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SlowMotionSoundTrackView@2193.setJob$1");
                return unit;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
