package X;

import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19C2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19C2 implements InterfaceC214923199d {
    public final int LIZ;
    public final InterfaceC19394510uF LIZIZ;
    public final Activity LIZJ;
    public final Scene LIZLLL;
    public final InterfaceC21498919Br LJ;
    public final InterfaceC21498219Bk LJFF;
    public final boolean LJI;
    public C19C4 LJII;
    public final BPEAHandler LJIIIIZZ;
    public boolean LJIIIZ;
    public Bundle LJIIJ;

    @Override // X.InterfaceC214923199d
    public final void LIZJ() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", "onViewDestroyed Start");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneSafeLifecycleDispatcher");
        sbLIZ.append(": ");
        sbLIZ.append("onViewDestroyed Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        LJFF(new AwS576S0100000_32(this, 220));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onViewDestroyed End ");
        sbLIZ2.append(this.LJII);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SceneSafeLifecycleDispatcher");
        sbLIZ3.append(": ");
        sbLIZ3.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC214923199d
    public final void LJ() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", "onStarted Start");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneSafeLifecycleDispatcher");
        sbLIZ.append(": ");
        sbLIZ.append("onStarted Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        LJFF(new C19C5(this));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onStarted End ");
        sbLIZ2.append(this.LJII);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SceneSafeLifecycleDispatcher");
        sbLIZ3.append(": ");
        sbLIZ3.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC214923199d
    public final void onPaused() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", "onPaused Start");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneSafeLifecycleDispatcher");
        sbLIZ.append(": ");
        sbLIZ.append("onPaused Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        LJFF(new AwS576S0100000_32(this, 218));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onPaused End ");
        sbLIZ2.append(this.LJII);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SceneSafeLifecycleDispatcher");
        sbLIZ3.append(": ");
        sbLIZ3.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC214923199d
    public final void onResumed() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", "onResumed Start");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneSafeLifecycleDispatcher");
        sbLIZ.append(": ");
        sbLIZ.append("onResumed Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        LJFF(new C19C6(this));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onResumed End ");
        sbLIZ2.append(this.LJII);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SceneSafeLifecycleDispatcher");
        sbLIZ3.append(": ");
        sbLIZ3.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC214923199d
    public final void onStopped() {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", "onStopped Start");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneSafeLifecycleDispatcher");
        sbLIZ.append(": ");
        sbLIZ.append("onStopped Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        LJFF(new AwS576S0100000_32(this, 219));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onStopped End ");
        sbLIZ2.append(this.LJII);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SceneSafeLifecycleDispatcher");
        sbLIZ3.append(": ");
        sbLIZ3.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static boolean LJI() {
        return C12WP.LIZIZ() || C665300Q7s.LIZ();
    }

    @Override // X.InterfaceC214923199d
    public final void LIZ() {
        if (C07RK.LIZ()) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", "onActivityCreated Start");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SceneSafeLifecycleDispatcher");
            sbLIZ.append(": ");
            sbLIZ.append("onActivityCreated Start");
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
            LJFF(new C19C7(this));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onActivityCreated End ");
            sbLIZ2.append(this.LJII);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("SceneSafeLifecycleDispatcher");
            sbLIZ3.append(": ");
            sbLIZ3.append(strLIZIZ);
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", "onActivityCreated Start");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("SceneSafeLifecycleDispatcher");
        sbLIZ4.append(": ");
        sbLIZ4.append("onActivityCreated Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ4));
        LJFF(new AwS576S0100000_32(this, 224));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("onActivityCreated End ");
        sbLIZ5.append(this.LJII);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ2);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("SceneSafeLifecycleDispatcher");
        sbLIZ6.append(": ");
        sbLIZ6.append(strLIZIZ2);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ6));
    }

    @Override // X.InterfaceC214923199d
    public final void LIZIZ() {
        if (C07RK.LIZ()) {
            try {
                new C19C3(this).invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.LJJZZIII(this.LJIIIIZZ, new ARunnableS126S0100000_26(th, 48));
            throw th;
        }
    }

    @Override // X.InterfaceC214923199d
    public final void onSaveInstanceState(Bundle bundle) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", "onSaveInstanceState Start");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneSafeLifecycleDispatcher");
        sbLIZ.append(": ");
        sbLIZ.append("onSaveInstanceState Start");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        LJFF(new AwS433S0200000_32(this, bundle, 15));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onSaveInstanceState End ");
        sbLIZ2.append(this.LJII);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SceneSafeLifecycleDispatcher");
        sbLIZ3.append(": ");
        sbLIZ3.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC214923199d
    public final void LIZLLL(Activity activity, Bundle bundle) {
        Bundle bundle2;
        String string = null;
        if (bundle != null) {
            bundle2 = bundle.getBundle("bd-scene-nav:scene_argument");
        } else {
            bundle2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate Start supportRestore: ");
        boolean z = true;
        sbLIZ.append(true);
        sbLIZ.append(", savedInstance: ");
        if (bundle == null) {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", argument: ");
        sbLIZ.append(bundle2);
        sbLIZ.append(", rootScene: ");
        if (bundle2 != null) {
            string = bundle2.getString("extra_rootScene");
        }
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SceneSafeLifecycleDispatcher");
        sbLIZ2.append(": ");
        sbLIZ2.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        LJFF(new C19C1(this, bundle, activity));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onCreate End ");
        sbLIZ3.append(this.LJII);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SceneSafeLifecycleDispatcher", strLIZIZ2);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("SceneSafeLifecycleDispatcher");
        sbLIZ4.append(": ");
        sbLIZ4.append(strLIZIZ2);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ4));
    }

    public C19C2(int i, InterfaceC19394510uF interfaceC19394510uF, C19EG c19eg, Scene scene, InterfaceC21498919Br interfaceC21498919Br, InterfaceC21498219Bk interfaceC21498219Bk, boolean z) {
        this.LIZ = i;
        this.LIZIZ = interfaceC19394510uF;
        this.LIZJ = c19eg;
        this.LIZLLL = scene;
        this.LJ = interfaceC21498919Br;
        this.LJFF = interfaceC21498219Bk;
        this.LJI = z;
        this.LJII = C19C4.LL;
        this.LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19C2(int i, InterfaceC19394510uF interfaceC19394510uF, C19EG c19eg, Scene scene, InterfaceC21498919Br interfaceC21498919Br, C1701300uNE c1701300uNE, int i2) {
        boolean z;
        c1701300uNE = (i2 & 64) != 0 ? null : c1701300uNE;
        if ((i2 & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(i, interfaceC19394510uF, c19eg, scene, interfaceC21498919Br, c1701300uNE, z);
    }
}
