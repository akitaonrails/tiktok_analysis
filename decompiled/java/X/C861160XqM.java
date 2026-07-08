package X;

import android.graphics.Rect;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.social.creation.edit.component.toolbar.StoryEditToolbarComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.component.toolbar.StoryEditToolbarComponent$deferTooltipUntilExpanded$1", f = "StoryEditToolbarComponent.kt", l = {329}, m = "invokeSuspend")
public final class C861160XqM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryEditToolbarComponent LLILLJJLI;
    public final /* synthetic */ Rect LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861160XqM(StoryEditToolbarComponent storyEditToolbarComponent, Rect rect, Function0<Unit> function0, InterfaceC1364105Vn<? super C861160XqM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyEditToolbarComponent;
        this.LLILLL = rect;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861160XqM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryEditToolbarComponent@d7fe.deferTooltipUntilExpanded$1");
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
            StoryEditToolbarComponent storyEditToolbarComponent = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C861170XqN c861170XqN = new C861170XqN(storyEditToolbarComponent, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(storyEditToolbarComponent, state, c861170XqN, this) == objLJFF) {
                C1C7U.LIZIZ("StoryEditToolbarComponent@d7fe.deferTooltipUntilExpanded$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryEditToolbarComponent@d7fe.deferTooltipUntilExpanded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
