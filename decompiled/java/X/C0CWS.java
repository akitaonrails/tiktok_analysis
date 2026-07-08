package X;

import android.view.View;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem$onViewCreated$1", f = "StoryToolBarIconAssem.kt", l = {}, m = "invokeSuspend")
public final class C0CWS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryToolBarIconAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWS(StoryToolBarIconAssem storyToolBarIconAssem, View view, InterfaceC1364105Vn<? super C0CWS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyToolBarIconAssem;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CWS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryToolBarIconAssem@f5cd.onViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Zo(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryToolBarIconAssem@f5cd.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
