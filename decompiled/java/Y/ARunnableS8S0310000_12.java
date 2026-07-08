package Y;

import X.C0PEM;
import X.C0SY5;
import X.C0UVQ;
import X.C0UVR;
import X.C0UVS;
import X.C18S8;
import X.C18S9;
import X.C1C7U;
import X.C20432714xJ;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC785640Urq;
import X.InterfaceC20433214xO;
import X.InterfaceC497601wk;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.common.jato.fastnative.FastNative;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS8S0310000_12 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        IHostPlugin iHostPlugin = (IHostPlugin) this.l0;
        C0UVQ c0uvq = new C0UVQ(((EnumC785640Urq) this.l1).getPackageName());
        EnumC785640Urq enumC785640Urq = (EnumC785640Urq) this.l1;
        if (enumC785640Urq.getDependPlugins().length != 0) {
            String[] dependPlugins = enumC785640Urq.getDependPlugins();
            ArrayList arrayList = new ArrayList(dependPlugins.length);
            for (String str : dependPlugins) {
                arrayList.add(str);
            }
            c0uvq.LIZLLL = arrayList;
        }
        c0uvq.LIZIZ = this.z3;
        final EnumC785640Urq enumC785640Urq2 = (EnumC785640Urq) this.l1;
        final WeakReference weakReference = (WeakReference) this.l2;
        c0uvq.LIZJ = new C0UVS() { // from class: X.0UVO
            @Override // X.C0UVS
            public final void onFailed() {
                C786410Ut5.LJJZZIII(LiveAppBundleUtils.mainHandler, new ARunnableS112S0100000_12(weakReference, 143));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" onPluginLoadFailed is called ,from requestBuilder ");
                sbLIZ.append(enumC785640Urq2);
                C20441214yg.LJIIIZ("FindCrashLog#LiveAppBundleUtils", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.C0UVS
            public final void onSuccess() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" onPluginLoadSuccess is called ,from requestBuilder ");
                sbLIZ.append(enumC785640Urq2);
                C20441214yg.LJIIIZ("FindCrashLog#LiveAppBundleUtils", C2188811AlT.LIZIZ(sbLIZ));
                LiveAppBundleUtils liveAppBundleUtils = LiveAppBundleUtils.INSTANCE;
                liveAppBundleUtils.splitInstall();
                C786410Ut5.LJJZZIII(LiveAppBundleUtils.mainHandler, new ARunnableS81S0200000_12(enumC785640Urq2, weakReference, 41));
                liveAppBundleUtils.logInstalledIfNeed(enumC785640Urq2);
            }

            @Override // X.C0UVS
            public final void LIZ(final int i, final String str2, final boolean z) {
                Handler handler = LiveAppBundleUtils.mainHandler;
                final WeakReference<C0UVS> weakReference2 = weakReference;
                C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0UVP
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveAppBundleUtils@da67.startInstallPlugin$1$2$onPluginInstallError$1");
                        try {
                            C0UVS c0uvs = weakReference2.get();
                            if (c0uvs != null) {
                                c0uvs.LIZ(i, str2, z);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveAppBundleUtils@da67.startInstallPlugin$1$2$onPluginInstallError$1");
                    }
                });
            }
        };
        iHostPlugin.install(new C0UVR(c0uvq));
    }

    public static final void run$0(ARunnableS8S0310000_12 aRunnableS8S0310000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveAppBundleUtils@da67.startInstallPlugin$1");
        try {
            aRunnableS8S0310000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveAppBundleUtils@da67.startInstallPlugin$1");
    }

    public static final void run$1(ARunnableS8S0310000_12 aRunnableS8S0310000_12) {
        boolean zLIZ;
        C1C7U.LIZ("VoiceBoxScene@a375.updateTipBgHeight$1");
        try {
            if (((View) aRunnableS8S0310000_12.l0).getParent() != null) {
                ((C18S8) aRunnableS8S0310000_12.l1).LLLLLLJ((C18S9) aRunnableS8S0310000_12.l2, aRunnableS8S0310000_12.z3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VoiceBoxScene@a375.updateTipBgHeight$1");
    }

    public static final void run$2(ARunnableS8S0310000_12 aRunnableS8S0310000_12) {
        boolean zLIZ;
        InterfaceC497601wk interfaceC497601wkLIZ;
        C1C7U.LIZ("CredentialManagerService@16d5.getPasskeyForAuthorize$1");
        try {
            LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ((Activity) aRunnableS8S0310000_12.l0);
            if (lifecycleOwnerLIZIZ == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) == null) {
                interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
            }
            C23250099c.LIZLLL(interfaceC497601wkLIZ, C0PEM.LIZJ, null, new C20432714xJ((Activity) aRunnableS8S0310000_12.l0, (List) aRunnableS8S0310000_12.l1, aRunnableS8S0310000_12.z3, (InterfaceC20433214xO) aRunnableS8S0310000_12.l2, null), 2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CredentialManagerService@16d5.getPasskeyForAuthorize$1");
    }

    public static final void run$3(ARunnableS8S0310000_12 aRunnableS8S0310000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FastNative@1b79.nativeModifyFastNativeAsync$1");
        try {
            FastNative.LIZ(aRunnableS8S0310000_12.z3, (String[]) aRunnableS8S0310000_12.l0, (String[]) aRunnableS8S0310000_12.l1, (String[]) aRunnableS8S0310000_12.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FastNative@1b79.nativeModifyFastNativeAsync$1");
    }

    public ARunnableS8S0310000_12(String[] strArr, String[] strArr2, String[] strArr3, int i) {
        this.$t = i;
        this.l0 = strArr;
        this.l1 = strArr2;
        this.l2 = strArr3;
        this.z3 = false;
    }

    public ARunnableS8S0310000_12(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z3 = z;
        this.l2 = obj3;
    }
}
