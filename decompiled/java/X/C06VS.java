package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.StoryImmersiveTopAreaComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06VS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.StoryImmersiveTopAreaComponent$doAdaption$1", f = "StoryImmersiveTopAreaComponent.kt", l = {}, m = "invokeSuspend")
public final class C06VS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryImmersiveTopAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06VS(StoryImmersiveTopAreaComponent storyImmersiveTopAreaComponent, InterfaceC1364105Vn<? super C06VS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyImmersiveTopAreaComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06VS(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLIZJ;
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1C7U.LIZ("StoryImmersiveTopAreaComponent@471a.doAdaption$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LL.LLJLL.getValue();
        int i = 0;
        if (iScreenComponentAbility != null && iScreenComponentAbility.xa0()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(20)));
        } else {
            Context context = this.LL.getContext();
            if (context != null) {
                iLIZJ = C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = 0;
            }
            iLIZIZ = iLIZJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(12)));
        }
        ViewGroup.LayoutParams layoutParams = this.LL.LJJIJL().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.topMargin;
        }
        if (i == iLIZIZ) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryImmersiveTopAreaComponent@471a.doAdaption$1");
            return unit;
        }
        View viewLJJIJL = this.LL.LJJIJL();
        ViewGroup.LayoutParams layoutParams2 = viewLJJIJL.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = iLIZIZ;
            C786410Ut5.W5(viewLJJIJL, marginLayoutParams2);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StoryImmersiveTopAreaComponent@471a.doAdaption$1");
            return unit2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
