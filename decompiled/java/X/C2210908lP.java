package X;

import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08lP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageAIGCAnimationComponent$initialize$1", f = "Text2ImageAIGCAnimationComponent.kt", l = {111}, m = "invokeSuspend")
public final class C2210908lP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1300910jxR LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2210908lP(C1300910jxR c1300910jxR, View view, InterfaceC1364105Vn<? super C2210908lP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1300910jxR;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2210908lP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("Text2ImageAIGCAnimationComponent@edeb.initialize$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C2157608co c2157608co = new C2157608co(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c2157608co);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Text2ImageAIGCAnimationComponent@edeb.initialize$1");
                return objLJFF;
            }
        }
        File file = (File) obj;
        if (file == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("Text2ImageAIGCAnimationComponent@edeb.initialize$1");
            return unit;
        }
        this.LLILLJJLI.LLIZ = (SmartImageView) this.LLILLL.findViewById(R.id.ass);
        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(file);
        c1331670kl3LJII.LJJ(this.LLILLJJLI.LLIZ);
        C786410Ut5.h3(c1331670kl3LJII);
        C337180DJs.LIZ(this.LLILLJJLI.LLIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageAIGCAnimationComponent@edeb.initialize$1");
        return unit2;
    }
}
