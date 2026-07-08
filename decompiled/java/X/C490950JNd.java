package X;

import android.widget.SeekBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayBaseLayout$onStopTrackingTouch$1", f = "PlayerOverlayBaseLayout.kt", l = {75}, m = "invokeSuspend")
public final class C490950JNd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public float LL;
    public int LLILLJJLI;
    public final /* synthetic */ SeekBar LLILLL;
    public final /* synthetic */ AbstractC490940JNc LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C490950JNd(SeekBar seekBar, AbstractC490940JNc abstractC490940JNc, InterfaceC1364105Vn<? super C490950JNd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = seekBar;
        this.LLILZ = abstractC490940JNc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C490950JNd(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float progress;
        C1C7U.LIZ("PlayerOverlayBaseLayout@52ac.onStopTrackingTouch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                progress = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLL != null) {
                progress = r0.getProgress() / 100.0f;
            } else {
                progress = 0.0f;
            }
            C05YC<Float> c05yc = this.LLILZ.getPlayerChannel().LJIIJJI;
            Float fLIZLLL = C2286608xc.LIZLLL(progress);
            this.LL = progress;
            this.LLILLJJLI = 1;
            if (c05yc.emit(fLIZLLL, this) == objLJFF) {
                C1C7U.LIZIZ("PlayerOverlayBaseLayout@52ac.onStopTrackingTouch$1");
                return objLJFF;
            }
        }
        this.LLILZ.getPlayerChannel().LJII.setValue(false);
        this.LLILZ.getPlayerChannel().LIZJ.setValue(C2286608xc.LIZLLL(progress));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayBaseLayout@52ac.onStopTrackingTouch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
