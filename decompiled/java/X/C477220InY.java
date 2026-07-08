package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.TopliveNoticeUnreadCountData;

/* JADX INFO: renamed from: X.0InY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.repo.LiveNotificationDataManager$requestNotificationState$1$1", f = "LiveNotificationDataManager.kt", l = {}, m = "invokeSuspend")
public final class C477220InY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC477230InZ LL;
    public final /* synthetic */ TopliveNoticeUnreadCountData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477220InY(InterfaceC477230InZ interfaceC477230InZ, TopliveNoticeUnreadCountData topliveNoticeUnreadCountData, InterfaceC1364105Vn<? super C477220InY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC477230InZ;
        this.LLILLJJLI = topliveNoticeUnreadCountData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C477220InY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveNotificationDataManager@748d.requestNotificationState$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveNotificationDataManager@748d.requestNotificationState$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
