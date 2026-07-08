package X;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Q2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.component.celebration.CelebrationPosterComponent$createPoster$1$viewJob$1", f = "CelebrationPosterComponent.kt", l = {102}, m = "invokeSuspend")
public final class C05Q2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0MPL LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ C259800zU<Bitmap> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Q2(C0MPL c0mpl, View view, C259800zU<Bitmap> c259800zU, InterfaceC1364105Vn<? super C05Q2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0mpl;
        this.LLILZ = view;
        this.LLILZIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Q2(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<Bitmap> c259800zU;
        Object obj2;
        C1C7U.LIZ("CelebrationPosterComponent@e211.createPoster$1$viewJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj2 = c098200Yq;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLL.c3(this.LLILZ);
            c259800zU = this.LLILZIL;
            C0MPL c0mpl = this.LLILLL;
            View view = this.LLILZ;
            try {
                this.LL = c259800zU;
                this.LLILLJJLI = 1;
                obj = c0mpl.W1(view, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CelebrationPosterComponent@e211.createPoster$1$viewJob$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
                obj2 = c098200Yq2;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        C189200o6.m2constructorimpl(bitmap);
        obj2 = bitmap;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
        if (thM5exceptionOrNullimpl != null) {
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindAvatarToView, e = ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj2);
        T t = obj2;
        if (zM7isFailureimpl) {
            t = 0;
        }
        c259800zU.element = t;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CelebrationPosterComponent@e211.createPoster$1$viewJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
