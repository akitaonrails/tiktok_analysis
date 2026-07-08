package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Txc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment$onSearchBoxFocusChanged$1", f = "KaraokePageFragment.kt", l = {}, m = "invokeSuspend")
public final class C763740Txc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokePageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763740Txc(KaraokePageFragment karaokePageFragment, InterfaceC1364105Vn<? super C763740Txc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokePageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763740Txc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokePageFragment@98bb.onSearchBoxFocusChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokePageFragment karaokePageFragment = this.LL;
        if (!((Fragment) karaokePageFragment.LLIZ.getValue()).isAdded()) {
            karaokePageFragment.LLJILLL = true;
            C19EH c19ehLJIIJ = karaokePageFragment.getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIILL((Fragment) karaokePageFragment.LLIZLLLIL.getValue());
            c19ehLJIIJ.LIZJ(R.id.eux, (Fragment) karaokePageFragment.LLIZ.getValue(), "KaraokeSearchSongListFragment");
            c19ehLJIIJ.LJIIL();
            View view = karaokePageFragment.LLILZ;
            View view2 = null;
            if (view == null) {
                view = null;
            }
            C500260Jjc.LJIILIIL(view);
            View view3 = karaokePageFragment.LLILZIL;
            if (view3 == null) {
                view3 = null;
            }
            C500260Jjc.LJIILIIL(view3);
            View view4 = karaokePageFragment.LLILLJJLI;
            if (view4 != null) {
                view2 = view4;
            }
            C786410Ut5.T4(view2, 1.0f);
            karaokePageFragment.OR();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokePageFragment@98bb.onSearchBoxFocusChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
