package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0H63, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem$showVideoRain$1$3$1$1$1$1$onPlayStart$1", f = "EasterEggForShareAssem.kt", l = {485, 490}, m = "invokeSuspend")
public final class C0H63 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EasterEggForShareAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H63(EasterEggForShareAssem easterEggForShareAssem, String str, InterfaceC1364105Vn<? super C0H63> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = easterEggForShareAssem;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H63(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        InterfaceC1541990qEH kitView;
        View viewLJJIJL;
        FrameLayout frameLayout;
        C1C7U.LIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3$1$1$1$1$onPlayStart$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    viewLJJIJL = this.LLILLJJLI.LJJIJL();
                    if ((viewLJJIJL instanceof FrameLayout) && (frameLayout = (FrameLayout) viewLJJIJL) != null) {
                        C786410Ut5.LJJJZ(this.LLILLJJLI.LLJJIJI, frameLayout);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3$1$1$1$1$onPlayStart$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            View viewLJJIJL2 = this.LLILLJJLI.LJJIJL();
            if ((viewLJJIJL2 instanceof FrameLayout) && (viewGroup = (ViewGroup) viewLJJIJL2) != null) {
                viewGroup.addView(this.LLILLJJLI.LLJJIJI, 0);
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3$1$1$1$1$onPlayStart$1");
                return objLJFF;
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLJJLI.LLJJIJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.LIZ("share_effect_start_fall", new JSONObject().put("trigger_id", this.LLILLL));
        }
        long jIntValue = ((Number) C0AL6.LIZ.getValue()).intValue();
        this.LL = 2;
        if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3$1$1$1$1$onPlayStart$1");
            return objLJFF;
        }
        viewLJJIJL = this.LLILLJJLI.LJJIJL();
        if (viewLJJIJL instanceof FrameLayout) {
            C786410Ut5.LJJJZ(this.LLILLJJLI.LLJJIJI, frameLayout);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3$1$1$1$1$onPlayStart$1");
        return unit2;
    }
}
