package X;

import X.AnonymousClass1453;
import X.C01GW;
import X.C377010EqJ;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.1453, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1453 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(456));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(229));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(230));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(228));

    static {
        boolean zLIZLLL = AnonymousClass1455.LIZ.LIZLLL("PitayaHandler", null, null);
        if (!zLIZLLL) {
            HostSetupWatcher.INSTANCE.registerHostSetupListener(new HostSetupListener() { // from class: com.bytedance.android.starship.base.pitaya.PitayaHandler$init$1$1
                @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                public void onHostSetup(boolean z) {
                    if (z) {
                        C01GW c01gw = AnonymousClass1453.LIZ;
                        new C377010EqJ(Boolean.TRUE);
                        C01GW c01gw2 = AnonymousClass1453.LIZ;
                    }
                }
            });
        }
        new C377010EqJ(Boolean.valueOf(zLIZLLL));
    }
}
