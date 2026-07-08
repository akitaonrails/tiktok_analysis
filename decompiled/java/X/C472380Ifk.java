package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveEventBigViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.EventStruct;

/* JADX INFO: renamed from: X.0Ifk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.feed.adapter.viewholder.LiveEventBigViewHolder$onRegisterButtonClick$1$1", f = "LiveEventBigViewHolder.kt", l = {94, 98, 100}, m = "invokeSuspend")
public final class C472380Ifk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EventStruct LLILLJJLI;
    public final /* synthetic */ LiveEventBigViewHolder LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472380Ifk(EventStruct eventStruct, LiveEventBigViewHolder liveEventBigViewHolder, InterfaceC1364105Vn<? super C472380Ifk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = eventStruct;
        this.LLILLL = liveEventBigViewHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472380Ifk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        String str;
        User user;
        long id2;
        String str2;
        User user2;
        boolean zBooleanValue;
        Object objZC2 = obj;
        C1C7U.LIZ("LiveEventBigViewHolder@7333.onRegisterButtonClick$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(objZC2);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("LiveEventBigViewHolder@7333.onRegisterButtonClick$1$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objZC2);
                zBooleanValue = ((Boolean) objZC2).booleanValue();
            } else {
                C155000ia.LIZIZ(objZC2);
                zBooleanValue = ((Boolean) objZC2).booleanValue();
            }
        } else {
            C155000ia.LIZIZ(objZC2);
            ILiveEventService iLiveEventService = (ILiveEventService) C1161920gLG.LIZJ(ILiveEventService.class);
            if (this.LLILLJJLI.hasSubscribed) {
                LiveEventBigViewHolder liveEventBigViewHolder = this.LLILLL;
                liveEventBigViewHolder.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_event_register_cancel");
                c474500IjALIZ.LJJII("toplive_live_cover", "enter_from");
                c474500IjALIZ.LJJII("live_cover", "register_position");
                EventStruct eventStruct = liveEventBigViewHolder.LLIZ;
                if (eventStruct != null && (user2 = eventStruct.owner) != null) {
                    id2 = user2.getId();
                } else {
                    id2 = 0;
                }
                c474500IjALIZ.LJJII(Long.valueOf(id2), "anchor_id");
                EventStruct eventStruct2 = liveEventBigViewHolder.LLIZ;
                if (eventStruct2 != null) {
                    str2 = eventStruct2.id;
                } else {
                    str2 = null;
                }
                c474500IjALIZ.LJJII(str2, "live_event_id");
                c474500IjALIZ.LIZ();
                String str3 = this.LLILLJJLI.id;
                this.LL = 1;
                objZC2 = iLiveEventService.NH2(str3, this);
                if (objZC2 == objLJFF) {
                    C1C7U.LIZIZ("LiveEventBigViewHolder@7333.onRegisterButtonClick$1$1");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) objZC2).booleanValue();
            } else {
                LiveEventBigViewHolder liveEventBigViewHolder2 = this.LLILLL;
                liveEventBigViewHolder2.getClass();
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_event_register");
                c474500IjALIZ2.LJJII("toplive_live_cover", "enter_from");
                c474500IjALIZ2.LJJII("live_cover", "register_position");
                EventStruct eventStruct3 = liveEventBigViewHolder2.LLIZ;
                if (eventStruct3 != null && (user = eventStruct3.owner) != null) {
                    id = user.getId();
                } else {
                    id = 0;
                }
                c474500IjALIZ2.LJJII(Long.valueOf(id), "anchor_id");
                EventStruct eventStruct4 = liveEventBigViewHolder2.LLIZ;
                if (eventStruct4 != null) {
                    str = eventStruct4.id;
                } else {
                    str = null;
                }
                c474500IjALIZ2.LJJII(str, "live_event_id");
                c474500IjALIZ2.LIZ();
                this.LLILLL.N5("register");
                String str4 = this.LLILLJJLI.id;
                this.LL = 2;
                objZC2 = iLiveEventService.ZC2(str4, this);
                if (objZC2 == objLJFF) {
                    C1C7U.LIZIZ("LiveEventBigViewHolder@7333.onRegisterButtonClick$1$1");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) objZC2).booleanValue();
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C472390Ifl c472390Ifl = new C472390Ifl(this.LLILLL, zBooleanValue, this.LLILLJJLI, null);
        this.LL = 3;
        if (C23250099c.LJI(this, abstractC2238408pq, c472390Ifl) == objLJFF) {
            C1C7U.LIZIZ("LiveEventBigViewHolder@7333.onRegisterButtonClick$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventBigViewHolder@7333.onRegisterButtonClick$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
