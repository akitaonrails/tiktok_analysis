package X;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HU4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent$showAddToStoryGuide$1", f = "IMDetailPageComponent.kt", l = {639}, m = "invokeSuspend")
public final class C0HU4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMDetailPageComponent LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HU4(IMDetailPageComponent iMDetailPageComponent, int i, InterfaceC1364105Vn<? super C0HU4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMDetailPageComponent;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HU4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMDetailPageComponent@9866.showAddToStoryGuide$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("IMDetailPageComponent@9866.showAddToStoryGuide$1");
                return objLJFF;
            }
        }
        IMDetailPageComponent iMDetailPageComponent = this.LLILLJJLI;
        ImageView imageView = iMDetailPageComponent.LLLLIILLL;
        if (imageView != null) {
            int i2 = this.LLILLL;
            Context context = iMDetailPageComponent.getContext();
            if (context != null) {
                C450720Hlu c450720Hlu = new C450720Hlu(context);
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = imageView;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c450720Hlu.LLILZ = context.getText(2131824840);
                c450720Hlu.LJI(C960203pA.LIZ(R.attr.a0d, context));
                c450720Hlu.LIZIZ().show();
                ((Keva) iMDetailPageComponent.LLLLL.getValue()).storeInt("show_count", i2 + 1);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMDetailPageComponent@9866.showAddToStoryGuide$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
