package X;

import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.minis.api.revisitedu.IMinisRevisitMissionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS142S1200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0wzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802060wzk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1802050wzj LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C0F4A LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<String, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802060wzk(C1802050wzj c1802050wzj, int i, C0F4A c0f4a, String str, C1802090wzn c1802090wzn, AwS571S0100000_27 awS571S0100000_27) {
        super(0);
        this.LL = c1802050wzj;
        this.LLILLJJLI = i;
        this.LLILLL = c0f4a;
        this.LLILZ = str;
        this.LLILZIL = c1802090wzn;
        this.LLILZLL = awS571S0100000_27;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C1802050wzj c1802050wzj = this.LL;
        final int i = this.LLILLJJLI;
        final C0F4A c0f4a = this.LLILLL;
        final String str = this.LLILZ;
        Function1<String, Unit> function1 = this.LLILZIL;
        final Function0<Unit> function0 = this.LLILZLL;
        if (c1802050wzj.LIZIZ(i)) {
            AwS142S1200000_27 awS142S1200000_27 = new AwS142S1200000_27(c1802050wzj, (C1802050wzj) function1, (Function1<? super String, Unit>) str, (String) 0);
            AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c1802050wzj, 1169);
            c0f4a.LLIZLLLIL = awS142S1200000_27;
            c0f4a.LLJ = awS571S0100000_27;
            HandlerHook.viewPost(c0f4a, new Runnable() { // from class: X.0wzi
                public final void LIZ() {
                    C1799850wwB c1799850wwBLIZIZ;
                    C07ZA c07za;
                    EnumC1799930wwJ enumC1799930wwJ;
                    if (c0f4a.getParent() != null && c1802050wzj.LIZIZ(i)) {
                        IMinisRevisitMissionService iMinisRevisitMissionService = c1802050wzj.LIZIZ;
                        if (iMinisRevisitMissionService != null && (c1799850wwBLIZIZ = iMinisRevisitMissionService.LIZIZ(str)) != null && (c07za = c1799850wwBLIZIZ.LIZ) != null && (enumC1799930wwJ = c07za.LIZ) != null) {
                            C1800010wwR c1800010wwR = C1800010wwR.LIZ;
                            String str2 = str;
                            c1800010wwR.getClass();
                            if (C1800010wwR.LIZ(enumC1799930wwJ, str2)) {
                                C0F4A c0f4a2 = c0f4a;
                                ViewGroup viewGroup = c1802050wzj.LIZ;
                                c0f4a2.LLJJIJI = false;
                                c0f4a2.LLJJIJIIJIL = false;
                                c0f4a2.LLJJIJIL = false;
                                c0f4a2.animate().cancel();
                                c0f4a2.LIZJ();
                                int width = (viewGroup.getWidth() - C0F4B.LIZ(16.0f, c0f4a2.getContext())) - C0F4B.LIZ(60.0f, c0f4a2.getContext());
                                if (width < 0) {
                                    width = 0;
                                }
                                c0f4a2.LLJJI = width;
                                c0f4a2.LLJJIII = c0f4a2.LIZLLL((viewGroup.getHeight() * 0.25f) - (C0F4B.LIZ(60.0f, c0f4a2.getContext()) / 2.0f), viewGroup);
                                c0f4a2.LIZIZ();
                                C786410Ut5.W1(c0f4a2, 0);
                                C1802050wzj c1802050wzj2 = c1802050wzj;
                                if (!c1802050wzj2.LJI) {
                                    c1802050wzj2.LJI = true;
                                    C2196701AyC c2196701AyC = C2196701AyC.LIZ;
                                    c2196701AyC.getClass();
                                    C2196701AyC.LJJIII(c2196701AyC, "tm_win_reward_floating_widget_show", null, null, false, 14);
                                    C1800010wwR.LIZJ(enumC1799930wwJ, str);
                                }
                                function0.invoke();
                                return;
                            }
                        }
                        c1802050wzj.LIZ();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MinisRevisitFloatingBallController@5785.showLoadedFloatingBall$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MinisRevisitFloatingBallController@5785.showLoadedFloatingBall$3");
                }
            });
        }
        return Unit.LIZ;
    }
}
