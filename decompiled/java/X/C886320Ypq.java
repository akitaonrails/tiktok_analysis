package X;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ypq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.unread.DMInboxUnreadHelper$onNoticeReady$1", f = "DMInboxUnreadHelper.kt", l = {}, m = "invokeSuspend")
public final class C886320Ypq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C886320Ypq(InterfaceC1364105Vn<? super C886320Ypq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C886320Ypq(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMInboxUnreadHelper@1ef5.onNoticeReady$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C886310Ypp c886310Ypp = C886310Ypp.LIZ;
        final C886330Ypr c886330YprLJI = C886310Ypp.LJI();
        if (c886330YprLJI == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DMInboxUnreadHelper@1ef5.onNoticeReady$1");
            return unit;
        }
        Runnable runnable = new Runnable() { // from class: X.0Yps
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DMInboxUnreadHelper@1ef5.onNoticeReady$1$updateRunnable$1");
                try {
                    if (!C886310Ypp.LIZJ) {
                        C886310Ypp.LJFF(C886310Ypp.LIZ, c886330YprLJI, false, true, 2);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DMInboxUnreadHelper@1ef5.onNoticeReady$1$updateRunnable$1");
            }
        };
        if ((C287760BPq.LIZ() & 4) != 0) {
            C786410Ut5.LJL((Handler) C886310Ypp.LIZIZ.getValue(), runnable);
        } else {
            C786410Ut5.LJJZZIII((Handler) C886310Ypp.LIZIZ.getValue(), runnable);
        }
        C886310Ypp.LIZLLL = null;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DMInboxUnreadHelper@1ef5.onNoticeReady$1");
        return unit2;
    }
}
