package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import kotlin.jvm.internal.AwS373S0200000_7;

/* JADX INFO: renamed from: X.0KL4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KL4 implements InterfaceC514320KFa {
    public C0KLE<?> LIZ;
    public C0KMY LIZIZ;
    public C0KMZ LIZJ;

    @Override // X.InterfaceC514320KFa
    public final C0KL4 LIZ() {
        C0KL3 c0kl3 = new C0KL3();
        C0KMY c0kmy = new C0KMY();
        this.LIZ = c0kl3;
        this.LIZIZ = c0kmy;
        return this;
    }

    @Override // X.InterfaceC514320KFa
    public final C0KL4 LIZIZ() {
        this.LIZJ = new C0KMZ();
        return this;
    }

    public C0KL4() {
        final C516040KLq c516040KLq = new C516040KLq();
        Npth.registerCrashCallback(new ICrashCallback() { // from class: X.0KLG
            @Override // com.bytedance.crash.ICrashCallback
            public final void onCrash(CrashType crashType, String str, Thread thread) {
                c516040KLq.invoke(crashType.name(), str, thread);
            }
        }, CrashType.ALL);
    }

    @Override // X.InterfaceC514320KFa
    public final void LIZJ(C0KFM c0kfm) {
        C0KMY c0kmy = this.LIZIZ;
        if (c0kmy != null) {
            c0kmy.LIZ = c0kfm;
            if (c0kmy.LJ(true)) {
                c0kmy.LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC514320KFa
    public final void LIZLLL(C0KFM c0kfm) {
        C0KMY c0kmy = this.LIZIZ;
        if (c0kmy != null) {
            c0kmy.LIZ = c0kfm;
            if (c0kmy.LJ(false)) {
                c0kmy.LIZJ();
            }
        }
    }

    public final void LJ(InterfaceC511950K5x interfaceC511950K5x) {
        C0KLE<?> c0kle = this.LIZ;
        if (c0kle != null) {
            c0kle.LIZIZ(interfaceC511950K5x);
        }
    }

    public static final Object LJFF(InterfaceC1364105Vn interfaceC1364105Vn, AwS373S0200000_7 awS373S0200000_7) {
        return C0KL8.LIZ.LIZIZ(interfaceC1364105Vn, awS373S0200000_7);
    }

    public final void LJI(C0KLA c0kla, C0KFP c0kfp) {
        C0KMZ c0kmz = this.LIZJ;
        if (c0kmz != null) {
            SubscriptionSceneContext subscriptionSceneContextLIZ = C0K4B.LIZ();
            String string = null;
            if (subscriptionSceneContextLIZ != null) {
                Long lValueOf = Long.valueOf(subscriptionSceneContextLIZ.roomId);
                if (lValueOf.longValue() > 0) {
                    string = lValueOf.toString();
                }
            }
            String str = "";
            if (string == null) {
                string = "";
            }
            c0kmz.LIZIZ = string;
            C19EG c19egLIZIZ = C0K51.LIZIZ(c0kla.LJIIIZ);
            String str2 = c0kla.LJIIL.get("show_entrance");
            if (str2 != null) {
                str = str2;
            }
            c0kmz.LIZ = str;
            if (c19egLIZIZ == null) {
                c0kfp.onFail(-1, "activity is null in resubscribe");
                return;
            }
            C0KLV c0klv = new C0KLV(c0kfp, c19egLIZIZ, c0kla, c0kmz, null);
            C23250099c.LIZJ(LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ), C23271099x.INSTANCE, C099V.DEFAULT, c0klv);
        }
    }
}
