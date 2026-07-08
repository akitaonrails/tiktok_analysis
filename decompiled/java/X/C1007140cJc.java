package X;

import android.graphics.Bitmap;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.amberalert.v2.manager.AmberAlertColorManager$loadDynamicBackground$onLightenImageLoadCompleted$1", f = "AmberAlertColorManager.kt", l = {49}, m = "invokeSuspend")
public final class C1007140cJc extends C09AX implements Function2<Bitmap, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C166F LLILLL;
    public final /* synthetic */ C339301Tj LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1007140cJc(C166F c166f, C339301Tj c339301Tj, Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C1007140cJc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c166f;
        this.LLILZ = c339301Tj;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1007140cJc c1007140cJc = new C1007140cJc(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1007140cJc.LLILLJJLI = obj;
        return c1007140cJc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int color;
        C1C7U.LIZ("AmberAlertColorManager@e8ab.loadDynamicBackground$onLightenImageLoadCompleted$1");
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
            Bitmap bitmap = (Bitmap) this.LLILLJJLI;
            C166N c166n = new C166N(bitmap);
            c166n.LIZJ = 16;
            ((ArrayList) c166n.LJFF).clear();
            C166F c166f = this.LLILLL;
            if (!((ArrayList) c166n.LIZIZ).contains(c166f)) {
                ((ArrayList) c166n.LIZIZ).add(c166f);
            }
            C166O c166oLIZ = c166n.LIZ();
            this.LLILZ.getClass();
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
            c204674156yLIZ.LJFF(80.0f);
            c204674156yLIZ.LJI(0.0f);
            Integer numLIZIZ = c204674156yLIZ.LIZIZ();
            if (numLIZIZ != null) {
                color = numLIZIZ.intValue();
            } else {
                color = ColorProtector.parseColor("#FF261B13");
                C166P c166p = c166oLIZ.LJ;
                if (c166p != null) {
                    color = c166p.LIZLLL;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C339101Th c339101Th = new C339101Th(color, null, this.LLILZIL);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c339101Th) == objLJFF) {
                C1C7U.LIZIZ("AmberAlertColorManager@e8ab.loadDynamicBackground$onLightenImageLoadCompleted$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmberAlertColorManager@e8ab.loadDynamicBackground$onLightenImageLoadCompleted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Bitmap bitmap, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(bitmap, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
