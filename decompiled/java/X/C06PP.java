package X;

import Y.ALAdapterS0S0200000_2;
import android.view.View;
import com.ss.android.ugc.gamora.recorder.control.h;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06PP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.control.FullHorizontalCarrouselRecordDockBarScene$loadUploadTextAnimation$1", f = "FullHorizontalCarrouselRecordDockBarScene.kt", l = {}, m = "invokeSuspend")
public final class C06PP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ h LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06PP(h hVar, InterfaceC1364105Vn<? super C06PP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = hVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06PP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float x;
        C1C7U.LIZ("FullHorizontalCarrouselRecordDockBarScene@605b.loadUploadTextAnimation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLIILIL = true;
        final View viewLLLLLILLIL = this.LL.LLLLLILLIL();
        final float fLLLLLLJ = this.LL.LLLLLLJ();
        final AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(this.LL, 883);
        C786410Ut5.LJLLLLLL(0, viewLLLLLILLIL);
        C786410Ut5.T4(viewLLLLLILLIL, 0.0f);
        if (viewLLLLLILLIL.isLaidOut() && !viewLLLLLILLIL.isLayoutRequested()) {
            if (C426750GoL.LIZLLL(viewLLLLLILLIL.getContext())) {
                x = viewLLLLLILLIL.getX() - (fLLLLLLJ + viewLLLLLILLIL.getContext().getResources().getDimension(R.dimen.wm));
            } else {
                x = viewLLLLLILLIL.getX() + fLLLLLLJ + viewLLLLLILLIL.getContext().getResources().getDimension(R.dimen.wl);
            }
            viewLLLLLILLIL.animate().x(x).setDuration(200L);
            viewLLLLLILLIL.animate().alpha(1.0f).setDuration(200L).setListener(new ALAdapterS0S0200000_2(viewLLLLLILLIL, awS546S0100000_2, 0));
        } else {
            viewLLLLLILLIL.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.06PQ
                public final /* synthetic */ long LLILLL = 200;
                public final /* synthetic */ long LLILZ = 200;

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    float x2;
                    view.removeOnLayoutChangeListener(this);
                    if (C426750GoL.LIZLLL(viewLLLLLILLIL.getContext())) {
                        x2 = viewLLLLLILLIL.getX() - (fLLLLLLJ + viewLLLLLILLIL.getContext().getResources().getDimension(R.dimen.wm));
                    } else {
                        x2 = viewLLLLLILLIL.getX() + fLLLLLLJ + viewLLLLLILLIL.getContext().getResources().getDimension(R.dimen.wl);
                    }
                    viewLLLLLILLIL.animate().x(x2).setDuration(this.LLILLL);
                    viewLLLLLILLIL.animate().alpha(1.0f).setDuration(this.LLILZ).setListener(new ALAdapterS0S0200000_2(viewLLLLLILLIL, awS546S0100000_2, 0));
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullHorizontalCarrouselRecordDockBarScene@605b.loadUploadTextAnimation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
