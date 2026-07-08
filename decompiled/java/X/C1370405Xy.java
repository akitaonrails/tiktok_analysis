package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.redpoint.InboxUnreadCountMonitorV2$tryInitCheckTask$1", f = "InboxUnreadCountMonitorV2.kt", l = {59}, m = "invokeSuspend")
public final class C1370405Xy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370405Xy(String str, boolean z, InterfaceC1364105Vn<? super C1370405Xy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1370405Xy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxUnreadCountMonitorV2@f32b.tryInitCheckTask$1");
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
            AnonymousClass0956 anonymousClass0956 = C0ZAH.LIZIZ;
            if (anonymousClass0956 != null) {
                this.LL = 1;
                if (C23118094a.LIZLLL(anonymousClass0956, this) == objLJFF) {
                    C1C7U.LIZIZ("InboxUnreadCountMonitorV2@f32b.tryInitCheckTask$1");
                    return objLJFF;
                }
            }
        }
        C0ZAH c0zah = C0ZAH.LIZ;
        String str = this.LLILLJJLI;
        boolean z = this.LLILLL;
        c0zah.getClass();
        C0ZAH.LIZIZ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0ZB3(str, z, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxUnreadCountMonitorV2@f32b.tryInitCheckTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
