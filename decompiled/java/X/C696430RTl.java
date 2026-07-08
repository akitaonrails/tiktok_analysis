package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0RTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.et.ExploreMobUtils$logValidPin$job$1", f = "ExploreMobUtils.kt", l = {937}, m = "invokeSuspend")
public final class C696430RTl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ Integer LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696430RTl(Long l, String str, String str2, String str3, Boolean bool, String str4, Integer num, Integer num2, Integer num3, InterfaceC1364105Vn<? super C696430RTl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = bool;
        this.LLIZ = str4;
        this.LLIZLLLIL = num;
        this.LLJ = num2;
        this.LLJI = num3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C696430RTl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("ExploreMobUtils@18af.logValidPin$job$1");
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
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("ExploreMobUtils@18af.logValidPin$job$1");
                return objLJFF;
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
        c2344009Gk.LIZLLL(this.LLILLJJLI.longValue(), "explore_topic_id");
        C15TA c15ta = C15TA.LIZ;
        String string = this.LLILLJJLI.toString();
        String str = this.LLILLL;
        c15ta.getClass();
        c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(string, str));
        c2344009Gk.LJIIIIZZ("post_num", this.LLILZ);
        c2344009Gk.LJIIIIZZ("pin_from", this.LLILZIL);
        c2344009Gk.LIZJ(Intrinsics.LJFF(this.LLILZLL, true) ? 1 : 0, "is_first_screen");
        String str2 = this.LLIZ;
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(str2));
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c2344009Gk.LIZJ(iIntValue + 1, "topic_position");
        c2344009Gk.LJ(this.LLJ, "total_subtab_num");
        c2344009Gk.LJ(this.LLJI, "subtab_position");
        C20684815ws.LJIILLIIL("ttexp_topic_valid_pin", c2344009Gk.LIZ);
        C15TA.LJIIJ.remove(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreMobUtils@18af.logValidPin$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
