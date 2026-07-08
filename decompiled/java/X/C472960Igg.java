package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Igg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget$showIndicator$2$1", f = "LiveGoalsWidget.kt", l = {}, m = "invokeSuspend")
public final class C472960Igg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveGoalsWidget LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472960Igg(LiveGoalsWidget liveGoalsWidget, View view, InterfaceC1364105Vn<? super C472960Igg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveGoalsWidget;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472960Igg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Resources resources;
        C1C7U.LIZ("LiveGoalsWidget@b41.showIndicator$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveGoalsWidget liveGoalsWidget = this.LL;
        View view = this.LLILLJJLI;
        if (view == null) {
            liveGoalsWidget.getClass();
        } else {
            Context context = liveGoalsWidget.context;
            if (context != null && (resources = context.getResources()) != null) {
                view.setBackgroundColor(resources.getColor(R.color.a1d));
            }
            ViewGroup viewGroup = liveGoalsWidget.LL;
            if (viewGroup != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            ViewGroup viewGroup2 = liveGoalsWidget.LL;
            if (viewGroup2 != null) {
                viewGroup2.addView(view, -1, -1);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveGoalsWidget@b41.showIndicator$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
