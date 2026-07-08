package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Q3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.component.celebration.CelebrationPosterComponent$createPoster$1$resJob$1", f = "CelebrationPosterComponent.kt", l = {97}, m = "invokeSuspend")
public final class C05Q3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<Effect> LLILLL;
    public final /* synthetic */ C0MPL LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Q3(C259800zU<Effect> c259800zU, C0MPL c0mpl, Context context, InterfaceC1364105Vn<? super C05Q3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = c0mpl;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05Q3(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<Effect> c259800zU;
        T t;
        C1C7U.LIZ("CelebrationPosterComponent@e211.createPoster$1$resJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
                t = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = this.LLILLL;
            C0MPL c0mpl = this.LLILZ;
            Context context = this.LLILZIL;
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            Object objO2 = c0mpl.o2(context, this);
            t = objO2;
            if (objO2 == objLJFF) {
                C1C7U.LIZIZ("CelebrationPosterComponent@e211.createPoster$1$resJob$1");
                return objLJFF;
            }
        }
        c259800zU.element = t;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CelebrationPosterComponent@e211.createPoster$1$resJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
