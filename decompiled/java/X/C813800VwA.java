package X;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.awemepushapi.IPushApi;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0VwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.outapppush.serviceimpl.IMOutAppPushServiceImpl$clearOutAppPushOfSession$1", f = "IMOutAppPushServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C813800VwA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0W5Z LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C813800VwA(Context context, String str, int i, C0W5Z c0w5z, String str2, InterfaceC1364105Vn<? super C813800VwA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = c0w5z;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C813800VwA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMOutAppPushServiceImpl@4ee.clearOutAppPushOfSession$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            NotificationManager notificationManager = (NotificationManager) C446980Hfs.LIZIZ(this.LL, NotificationManager.class);
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            if (activeNotifications != null) {
                String str = this.LLILLJJLI;
                C0W5Z c0w5z = this.LLILZ;
                String str2 = this.LLILZIL;
                int i = this.LLILLL;
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (Intrinsics.LJFF(str, statusBarNotification.getNotification().extras.getString("conversation_id", ""))) {
                        String group = statusBarNotification.getNotification().getGroup();
                        if (group == null) {
                            group = "";
                        }
                        if (group.length() > 0) {
                            linkedHashSet.add(group);
                        }
                        linkedHashSet2.add(C2286608xc.LJ(statusBarNotification.getId()));
                        notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                        C814580VxQ.LIZ((C814580VxQ) c0w5z.LIZ.getValue(), str2, i);
                    }
                }
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "im_push_clear_summary_if_empty", true, false) && (!linkedHashSet.isEmpty())) {
                ((IPushApi) ServiceManager.get().getService(IPushApi.class)).cancelGroupIfEmpty(this.LL, linkedHashSet, linkedHashSet2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMOutAppPushServiceImpl.clearOutAppPushOfSession() error: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMOutAppPushServiceImpl@4ee.clearOutAppPushOfSession$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
