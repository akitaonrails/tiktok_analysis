package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066U, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.view.panel.StreakStatusPanel$initView$1", f = "StreakStatusPanel.kt", l = {79}, m = "invokeSuspend")
public final class C066U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C066V LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ TuxSheet LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C066U(C066V c066v, View view, Context context, TuxSheet tuxSheet, InterfaceC1364105Vn<? super C066U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c066v;
        this.LLILLL = view;
        this.LLILZ = context;
        this.LLILZIL = tuxSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C066U(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakStatusPanel@541a.initView$1");
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
            C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
            String str = this.LLILLJJLI.LIZ;
            c1575806Ey.getClass();
            StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
            if (streakDataLJIIIIZZ == null) {
                C1590906Kt.LIZ("StreakStatusPanel: streak data is null");
            }
            C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(this.LLILLJJLI.LIZ);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1579206Gg c1579206Gg = new C1579206Gg(this.LLILLL, this.LLILLJJLI, this.LLILZ, c0y8tLJIL, streakDataLJIIIIZZ, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1579206Gg) == objLJFF) {
                C1C7U.LIZIZ("StreakStatusPanel@541a.initView$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakStatusPanel@541a.initView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
