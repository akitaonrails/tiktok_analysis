package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveEventBigViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.EventStruct;

/* JADX INFO: renamed from: X.0Ifl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.feed.adapter.viewholder.LiveEventBigViewHolder$onRegisterButtonClick$1$1$1", f = "LiveEventBigViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C472390Ifl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveEventBigViewHolder LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ EventStruct LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472390Ifl(LiveEventBigViewHolder liveEventBigViewHolder, boolean z, EventStruct eventStruct, InterfaceC1364105Vn<? super C472390Ifl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveEventBigViewHolder;
        this.LLILLJJLI = z;
        this.LLILLL = eventStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472390Ifl(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        String str;
        User user;
        C1C7U.LIZ("LiveEventBigViewHolder@7333.onRegisterButtonClick$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJILJIL.LJIIL();
        if (this.LLILLJJLI) {
            if (!this.LLILLL.hasSubscribed) {
                LiveEventBigViewHolder liveEventBigViewHolder = this.LL;
                liveEventBigViewHolder.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_register_success");
                c474500IjALIZ.LJJII("toplive_live_cover", "enter_from");
                c474500IjALIZ.LJJII("live_cover", "register_position");
                EventStruct eventStruct = liveEventBigViewHolder.LLIZ;
                if (eventStruct != null && (user = eventStruct.owner) != null) {
                    id = user.getId();
                } else {
                    id = 0;
                }
                c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
                EventStruct eventStruct2 = liveEventBigViewHolder.LLIZ;
                if (eventStruct2 != null) {
                    str = eventStruct2.id;
                } else {
                    str = null;
                }
                c474500IjALIZ.LJJII(str, "live_event_id");
                c474500IjALIZ.LIZ();
            }
            EventStruct eventStruct3 = this.LLILLL;
            boolean z = !eventStruct3.hasSubscribed;
            eventStruct3.hasSubscribed = z;
            this.LL.R5(z);
        } else if (!this.LLILLL.hasSubscribed) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LL.itemView);
            c1389890mGx.LJIIIZ(2131851053);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventBigViewHolder@7333.onRegisterButtonClick$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
