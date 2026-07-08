package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.story.userpanel.ui.StoryUserListPanelHeaderAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS81S1000000_31;
import njp.a;

/* JADX INFO: renamed from: X.06Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.ui.StoryUserListPanelHeaderAssem$debounceSearchInput$1", f = "StoryUserListPanelHeaderAssem.kt", l = {49}, m = "invokeSuspend")
public final class C06Y6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryUserListPanelHeaderAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Y6(StoryUserListPanelHeaderAssem storyUserListPanelHeaderAssem, String str, InterfaceC1364105Vn<? super C06Y6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyUserListPanelHeaderAssem;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06Y6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryUserListPanelHeaderAssem@666b.debounceSearchInput$1");
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
            if (AnonymousClass0958.LIZIZ(250L, this) == objLJFF) {
                C1C7U.LIZIZ("StoryUserListPanelHeaderAssem@666b.debounceSearchInput$1");
                return objLJFF;
            }
        }
        ((AssemViewModel) this.LLILLJJLI.LLIZLLLIL.getValue()).setState(new AwS81S1000000_31(this.LLILLL, 12));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryUserListPanelHeaderAssem@666b.debounceSearchInput$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
