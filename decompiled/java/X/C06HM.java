package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06HM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$startFallbackReplaceJob$1$1", f = "StreakPetWidget.kt", l = {}, m = "invokeSuspend")
public final class C06HM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06HD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HM(C06HD c06hd, InterfaceC1364105Vn<? super C06HM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06hd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        StreakPetData streakPetData;
        C1C7U.LIZ("StreakPetWidget@92f0.startFallbackReplaceJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06HD c06hd = this.LL;
        c06hd.getClass();
        C1590806Ks.LIZ("SPWidget replaceWithFallbackView");
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c06hd.LLJJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.LJJJZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, c06hd.LL);
        }
        C384150F4j c384150F4j = new C384150F4j(c06hd.LLILLJJLI);
        int i = C06HD.LLJLIL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        c06hd.LLJJIJIL = c384150F4j;
        c384150F4j.setStreakPetWidgetCallback(c06hd.LLILZ);
        c06hd.LL.addView(c384150F4j, layoutParams);
        EnumC1579606Gk enumC1579606Gk = c06hd.LLIZ;
        if (enumC1579606Gk != null && (streakPetData = c06hd.LLIZLLLIL) != null) {
            c06hd.LJIIJ(enumC1579606Gk, streakPetData);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidget@92f0.startFallbackReplaceJob$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
