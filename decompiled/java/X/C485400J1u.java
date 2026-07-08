package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.streaks.util.StoryStreakHelper$loadResourcesAndCompile$2", f = "StoryStreakHelper.kt", l = {}, m = "invokeSuspend")
public final class C485400J1u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1685430txd<Context, String, StoryStreakEnterEditParam, String, String, Integer, Unit> LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ StoryStreakEnterEditParam LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C485400J1u(Context context, StoryStreakEnterEditParam storyStreakEnterEditParam, String str, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1685430txd interfaceC1685430txd) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1685430txd;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = storyStreakEnterEditParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        InterfaceC1685430txd<Context, String, StoryStreakEnterEditParam, String, String, Integer, Unit> interfaceC1685430txd = this.LL;
        return new C485400J1u(this.LLILLJJLI, this.LLILZ, this.LLILLL, interfaceC1364105Vn, interfaceC1685430txd);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryStreakHelper@ab47.loadResourcesAndCompile$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI, this.LLILLL, this.LLILZ, null, null, C2286608xc.LJ(6));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryStreakHelper@ab47.loadResourcesAndCompile$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
