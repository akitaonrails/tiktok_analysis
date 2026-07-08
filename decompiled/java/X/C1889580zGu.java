package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2ViewModel;
import com.ss.android.ugc.aweme.inbox.v2.container.InboxPageWidgetContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.v2.container.InboxPageWidgetContainer$onWidgetStatusChange$1", f = "InboxPageWidgetContainer.kt", l = {}, m = "invokeSuspend")
public final class C1889580zGu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InboxPageWidgetContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889580zGu(InboxPageWidgetContainer inboxPageWidgetContainer, InterfaceC1364105Vn<? super C1889580zGu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inboxPageWidgetContainer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1889580zGu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxPageWidgetContainer@c98.onWidgetStatusChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMChatListApi.LJJIII.getClass();
        C0Z31 c0z31LJIIZILJ = C890330YwJ.LIZ().LJIIZILJ();
        if (c0z31LJIIZILJ != null) {
            c0z31LJIIZILJ.LJIIIZ(this.LL.ko().toString());
        }
        InboxPageWidgetContainer inboxPageWidgetContainer = this.LL;
        AbstractC1889640zH0 abstractC1889640zH0Bp = inboxPageWidgetContainer.bp(inboxPageWidgetContainer.ko());
        if (abstractC1889640zH0Bp != null) {
            InboxPageWidgetContainer inboxPageWidgetContainer2 = this.LL;
            C0Z31 c0z31LJIIZILJ2 = C890330YwJ.LIZ().LJIIZILJ();
            if (c0z31LJIIZILJ2 != null) {
                c0z31LJIIZILJ2.LIZ(9);
            }
            InboxFragmentV2ViewModel inboxFragmentV2ViewModelCp = inboxPageWidgetContainer2.cp();
            if (inboxFragmentV2ViewModelCp != null) {
                inboxFragmentV2ViewModelCp.vQ2(abstractC1889640zH0Bp);
            }
            inboxPageWidgetContainer2.ep();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxPageWidgetContainer@c98.onWidgetStatusChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
