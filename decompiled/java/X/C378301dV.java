package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.performance.preload.PostModeABPreloadHelper$preloadForPhotoModeLaunch$1", f = "PostModeABPreloadHelper.kt", l = {184}, m = "invokeSuspend")
public final class C378301dV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C378301dV(InterfaceC1364105Vn<? super C378301dV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C378301dV c378301dV = new C378301dV(interfaceC1364105Vn);
        c378301dV.LLILLJJLI = obj;
        return c378301dV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("PostModeABPreloadHelper@e2f4.preloadForPhotoModeLaunch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            int size = ((List) C505101xx.LIZLLL.getValue()).size();
            int i2 = (size / 10) + 1;
            int i3 = size / i2;
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZ, null, new C378401dW(i4, i3, size, null), 2));
            }
            it2 = arrayList.iterator();
        }
        while (it2.hasNext()) {
            C09AE c09ae = (C09AE) it2.next();
            this.LLILLJJLI = it2;
            this.LL = 1;
            if (c09ae.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("PostModeABPreloadHelper@e2f4.preloadForPhotoModeLaunch$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostModeABPreloadHelper@e2f4.preloadForPhotoModeLaunch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
