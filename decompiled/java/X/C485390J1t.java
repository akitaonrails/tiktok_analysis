package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.streaks.util.StoryStreakHelper$loadAndCompileFireAnim$compileSuccess$1", f = "StoryStreakHelper.kt", l = {}, m = "invokeSuspend")
public final class C485390J1t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1685430txd<Context, String, StoryStreakEnterEditParam, String, String, Integer, Unit> LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ StoryStreakEnterEditParam LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C485390J1t(InterfaceC1685430txd<? super Context, ? super String, ? super StoryStreakEnterEditParam, ? super String, ? super String, ? super Integer, Unit> interfaceC1685430txd, Context context, String str, StoryStreakEnterEditParam storyStreakEnterEditParam, String str2, String str3, InterfaceC1364105Vn<? super C485390J1t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1685430txd;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = storyStreakEnterEditParam;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C485390J1t(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryStreakHelper@ab47.loadAndCompileFireAnim$compileSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, C2286608xc.LJ(0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryStreakHelper@ab47.loadAndCompileFireAnim$compileSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
