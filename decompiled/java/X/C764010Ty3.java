package X;

import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ty3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment$startKaraoke$1", f = "KaraokeLibraryFragment.kt", l = {}, m = "invokeSuspend")
public final class C764010Ty3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeLibraryFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C764010Ty3(KaraokeLibraryFragment karaokeLibraryFragment, InterfaceC1364105Vn<? super C764010Ty3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeLibraryFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C764010Ty3(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeLibraryFragment@f126.startKaraoke$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C500260Jjc.LJIIZILJ(this.LL.LLILZ)) {
            KaraokeViewModel karaokeViewModel = this.LL.LLILLL;
            if (karaokeViewModel != null) {
                karaokeViewModel.cR2(C338901Tf.LIZ);
            }
        } else {
            KaraokeViewModel karaokeViewModel2 = this.LL.LLILLL;
            if (karaokeViewModel2 != null) {
                karaokeViewModel2.cR2(C764040Ty6.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeLibraryFragment@f126.startKaraoke$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
