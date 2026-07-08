package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ty0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$updateTuningParam$1", f = "KaraokeViewModel.kt", l = {580, 583}, m = "invokeSuspend")
public final class C763980Ty0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763980Ty0(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C763980Ty0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763980Ty0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        C20337914i1<String> c20337914i1;
        C1C7U.LIZ("KaraokeViewModel@e9e0.updateTuningParam$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("KaraokeViewModel@e9e0.updateTuningParam$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0U2Y c0u2y = this.LLILLJJLI.LL;
            this.LL = 1;
            obj = c0u2y.LJIIJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.updateTuningParam$1");
                return objLJFF;
            }
        }
        KaraokeViewModel karaokeViewModel = this.LLILLJJLI;
        Iterator it2 = ((List) obj).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                String resourceId = ((LiveEffect) next).getResourceId();
                C765590U1l c765590U1l = karaokeViewModel.LLJLLIL;
                int iLJIIJJI = karaokeViewModel.LL.LJIIJJI();
                c765590U1l.getClass();
                if (C763810Txj.LIZ(Integer.valueOf(iLJIIJJI))) {
                    c20337914i1 = InterfaceC766480U4w.LJJLIIIIJ;
                } else {
                    c20337914i1 = InterfaceC766480U4w.LJJLIIIJL;
                }
                if (Intrinsics.LJFF(resourceId, c20337914i1.LIZIZ())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveEffect liveEffect = (LiveEffect) next;
        if (liveEffect != null) {
            KaraokeViewModel karaokeViewModel2 = this.LLILLJJLI;
            this.LL = 2;
            if (karaokeViewModel2.xQ2(liveEffect) == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.updateTuningParam$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.updateTuningParam$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
