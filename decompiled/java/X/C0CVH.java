package X;

import android.os.SystemClock;
import com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2;
import com.google.gson.k;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionViewModelV2$2$1$1$1", f = "CaptionViewModelV2.kt", l = {}, m = "invokeSuspend")
public final class C0CVH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CaptionViewModelV2 LL;
    public final /* synthetic */ k LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CVH(CaptionViewModelV2 captionViewModelV2, k kVar, InterfaceC1364105Vn<? super C0CVH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = captionViewModelV2;
        this.LLILLJJLI = kVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionViewModelV2@24b6.<init>$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C327620Csq c327620Csq = this.LL.LLILZ;
        long jLJIIZILJ = this.LLILLJJLI.LJIIZILJ();
        C0CVI c0cviLJII = c327620Csq.LJII();
        c0cviLJII.LIZIZ = jLJIIZILJ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c0cviLJII.LIZLLL = jElapsedRealtime;
        if (c0cviLJII.LIZ == 0 || c0cviLJII.LIZJ == 0) {
            c0cviLJII.LIZ = c0cviLJII.LIZIZ;
            c0cviLJII.LIZJ = jElapsedRealtime;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC315550CYn abstractC315550CYn : (ArrayList) c0cviLJII.LJ) {
            long j = c0cviLJII.LIZIZ;
            if (abstractC315550CYn.LIZLLL == 0) {
                abstractC315550CYn.LIZLLL = j;
            }
            if (j - abstractC315550CYn.LIZLLL > abstractC315550CYn.LIZJ) {
                abstractC315550CYn.LIZ();
                if (abstractC315550CYn instanceof C0DT7) {
                    arrayList.add(abstractC315550CYn);
                }
            }
        }
        ((ArrayList) c0cviLJII.LJ).removeAll(arrayList);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionViewModelV2@24b6.<init>$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
