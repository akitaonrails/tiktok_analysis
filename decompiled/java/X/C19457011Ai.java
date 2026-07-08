package X;

import android.media.MediaPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.slowmo.SlowMotionSoundTrackView$setJob$1$1$1", f = "SlowMotionSoundTrackView.kt", l = {}, m = "invokeSuspend")
public final class C19457011Ai extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19457211Ak LL;
    public final /* synthetic */ MediaPlayer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19457011Ai(C19457211Ak c19457211Ak, MediaPlayer mediaPlayer, InterfaceC1364105Vn<? super C19457011Ai> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19457211Ak;
        this.LLILLJJLI = mediaPlayer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19457011Ai(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlowMotionSoundTrackView@2193.setJob$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setProgress(this.LLILLJJLI.getCurrentPosition());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlowMotionSoundTrackView@2193.setJob$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
