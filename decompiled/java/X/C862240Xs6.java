package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xs6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.utils.ScopedMusicPlayer$initializeListeners$1$1", f = "ScopedMusicPlayer.kt", l = {75}, m = "invokeSuspend")
public final class C862240Xs6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ScopedMusicPlayer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862240Xs6(ScopedMusicPlayer scopedMusicPlayer, InterfaceC1364105Vn<? super C862240Xs6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = scopedMusicPlayer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862240Xs6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1839100xxU c1839100xxU;
        MusicModel musicModel;
        C1C7U.LIZ("ScopedMusicPlayer@6289.initializeListeners$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("ScopedMusicPlayer@6289.initializeListeners$1$1");
                return objLJFF;
            }
        }
        Object value = this.LLILLJJLI.LLILLL.getValue();
        if ((value instanceof C1839100xxU) && (c1839100xxU = (C1839100xxU) value) != null) {
            ScopedMusicPlayer scopedMusicPlayer = this.LLILLJJLI;
            if (scopedMusicPlayer.LLIZ && (musicModel = c1839100xxU.LIZ) != null) {
                scopedMusicPlayer.LIZIZ(musicModel);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScopedMusicPlayer@6289.initializeListeners$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
