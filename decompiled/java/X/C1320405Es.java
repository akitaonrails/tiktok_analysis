package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.df.GroupNotifyContainerFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Es, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.df.GroupNotifyContainerFragment$onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1$1$1", f = "GroupChatNotifySheetLauncher.kt", l = {}, m = "invokeSuspend")
public final class C1320405Es extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ GroupNotifyContainerFragment LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ GroupNotifyContainerFragment LLILZ;
    public final /* synthetic */ Bundle LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1320405Es(Object obj, InterfaceC1364105Vn interfaceC1364105Vn, GroupNotifyContainerFragment groupNotifyContainerFragment, View view, GroupNotifyContainerFragment groupNotifyContainerFragment2, Bundle bundle) {
        super(2, interfaceC1364105Vn);
        this.LL = obj;
        this.LLILLJJLI = groupNotifyContainerFragment;
        this.LLILLL = view;
        this.LLILZ = groupNotifyContainerFragment2;
        this.LLILZIL = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1320405Es(this.LL, interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C1C7U.LIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        Unit unit = null;
        if (obj2 != null) {
            InterfaceC1320505Et interfaceC1320505Et = (InterfaceC1320505Et) obj2;
            C1749280vcc c1749280vcc = this.LLILLJJLI.LLIZ;
            if (c1749280vcc != null) {
                View view = this.LLILLL;
                if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
                    C786410Ut5.LJJJLZIJ(c1749280vcc, viewGroup2);
                }
            }
            View view2 = this.LLILLL;
            if ((view2 instanceof FrameLayout) && (viewGroup = (ViewGroup) view2) != null) {
                viewGroup.addView(interfaceC1320505Et.LIZ(C786410Ut5.ne(view2.getContext()), viewGroup));
            }
            interfaceC1320505Et.LIZJ(this.LLILZ);
            C786410Ut5.W5(this.LLILLL, new FrameLayout.LayoutParams(-1, -2));
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("GroupNotifyContainerFragment@e135.onViewCreated$$inlined$onDFDownloaded$im_group_chat_api_release$1$1$1");
        return unit;
    }
}
