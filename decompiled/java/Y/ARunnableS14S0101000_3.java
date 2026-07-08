package Y;

import X.AbstractC1387200mCc;
import X.C08AD;
import X.C08H2;
import X.C08IV;
import X.C0VSJ;
import X.C1271460jBw;
import X.C1362650lZ1;
import X.C1906580ziK;
import X.C1C7U;
import X.C20673215v0;
import X.C20684815ws;
import X.C2090408Gw;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C2455309jj;
import X.C2481709nz;
import X.C631370Opb;
import X.C786410Ut5;
import X.InterfaceC1603190roz;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.duetbutton.VideoDuetButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.lifecycle.LifecycleActiveReceiver;
import com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS14S0101000_3 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Field declaredField;
        Resources resources = (Resources) this.l0;
        int i = this.i1;
        try {
            try {
                Field declaredField2 = resources.getClass().getDeclaredField("mResourcesImpl");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(resources);
                if (obj == null || (declaredField = obj.getClass().getDeclaredField("mCachedXmlBlocks")) == null) {
                    return;
                }
                declaredField.setAccessible(true);
                synchronized (declaredField.get(obj)) {
                    try {
                        Field declaredField3 = obj.getClass().getDeclaredField("mCachedXmlBlockFiles");
                        if (declaredField3 == null) {
                            return;
                        }
                        declaredField3.setAccessible(true);
                        String[] strArr = (String[]) declaredField3.get(obj);
                        if (strArr.length == 4) {
                            String[] strArr2 = new String[i];
                            Field declaredField4 = obj.getClass().getDeclaredField("mCachedXmlBlockCookies");
                            declaredField4.setAccessible(true);
                            int[] iArr = new int[i];
                            int[] iArr2 = (int[]) declaredField4.get(obj);
                            Object[] objArr = (Object[]) Array.newInstance(declaredField.getType().getComponentType(), i);
                            Object[] objArr2 = (Object[]) declaredField.get(obj);
                            int i2 = 0;
                            do {
                                strArr2[i2] = strArr[i2];
                                iArr[i2] = iArr2[i2];
                                objArr[i2] = objArr2[i2];
                                i2++;
                            } while (i2 < 4);
                            declaredField3.set(obj, strArr2);
                            declaredField4.set(obj, iArr);
                            declaredField.set(obj, objArr);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Exception th) {
            }
        } catch (IllegalAccessException | NoSuchFieldException th2) {
        }
    }

    public final void LIZ$1() {
        if (this.i1 == 0 || TextUtils.isEmpty(((C1271460jBw) this.l0).LIZIZ)) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(((C1271460jBw) this.l0).LIZIZ);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            for (int i = 1; i <= ((C1271460jBw) this.l0).LIZJ; i++) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(((C1271460jBw) this.l0).LIZIZ);
                    sbLIZ.append("/");
                    sbLIZ.append(i);
                    sbLIZ.append(".png");
                    C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                    if (c0vsj2.exists() && c0vsj2.isFile()) {
                        c0vsj2.delete();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final void LIZ$2() {
        C786410Ut5.LJLLLLLL(this.i1, ((VideoDuetButtonAssem) this.l0).LJJIJL());
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ((VideoDuetButtonAssem) this.l0)).getAweme();
        String str = ((VideoItemParams) C631370Opb.LIZ((VideoDuetButtonAssem) this.l0)).mEventType;
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJIIZILJ(aweme, str, "original_page", "description", true);
    }

    public static final void run$0(ARunnableS14S0101000_3 aRunnableS14S0101000_3) {
        String str;
        Object obj;
        C08AD c08ad = (C08AD) aRunnableS14S0101000_3.l0;
        int i = aRunnableS14S0101000_3.i1;
        c08ad.getClass();
        C1C7U.LIZ("ActivityCallback@52b2.postMobActivityRelaunchEvent$1L");
        HashMap map = new HashMap();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (obj = abstractC1387200mCcLIZIZ.LIZ) != null) {
            if (obj instanceof InterfaceC1603190roz) {
                str = "homepage";
            } else {
                str = "others";
            }
        } else {
            str = "null";
        }
        map.put("enter_from", str);
        map.put("event_type", String.valueOf(i));
        C20684815ws.LJIILLIIL("activity_relaunch", map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activity relaunch ");
        sbLIZ.append(str);
        sbLIZ.append(",");
        sbLIZ.append(i);
        C2344809Gs.LIZLLL(4, "ActivityCallback", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("ActivityCallback@52b2.postMobActivityRelaunchEvent$1L");
    }

    public static final void run$1(ARunnableS14S0101000_3 aRunnableS14S0101000_3) {
        int i = aRunnableS14S0101000_3.i1;
        Runnable runnable = (Runnable) aRunnableS14S0101000_3.l0;
        C1C7U.LIZ("LyraxContextWrapper@131e.runOnWorker$1L");
        try {
            TimeUnit.MILLISECONDS.sleep(i);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
        }
        runnable.run();
        C1C7U.LIZIZ("LyraxContextWrapper@131e.runOnWorker$1L");
    }

    public static final void run$2(ARunnableS14S0101000_3 aRunnableS14S0101000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LiveKitaKt@7a1e.init$1");
        try {
            C2090408Gw.LIZ = false;
            C08H2.LIZ(aRunnableS14S0101000_3.i1, (Activity) aRunnableS14S0101000_3.l0, true, false);
            C2090408Gw.LIZ(aRunnableS14S0101000_3.i1);
            DoFrameController.LIZ(new C08IV() { // from class: X.08IX
                @Override // X.C08IV
                public final void LIZ() {
                    C2090208Gu.LIZ();
                }
            });
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("LiveKitaKt@7a1e.init$1");
    }

    public static final void run$3(ARunnableS14S0101000_3 aRunnableS14S0101000_3) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.optXmlCache$1");
        try {
            aRunnableS14S0101000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.optXmlCache$1");
    }

    public static final void run$4(ARunnableS14S0101000_3 aRunnableS14S0101000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SharePanelImHeadLayout@26b5.onImLayoutHeightOffset$1");
        try {
            ((C1362650lZ1) aRunnableS14S0101000_3.l0).k3(aRunnableS14S0101000_3.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharePanelImHeadLayout@26b5.onImLayoutHeightOffset$1");
    }

    public static final void run$5(ARunnableS14S0101000_3 aRunnableS14S0101000_3) {
        int i;
        int i2 = aRunnableS14S0101000_3.i1;
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) aRunnableS14S0101000_3.l0;
        C1C7U.LIZ("LifecycleActiveReceiver@55d2.com_ss_android_ugc_aweme_lifecycle_LifecycleActiveReceiver__onReceive$___twin___$1L");
        try {
            if (i2 != LifecycleActiveReceiver.LIZJ) {
                try {
                    pendingResult.finish();
                } catch (Throwable th) {
                }
                C1C7U.LIZIZ("LifecycleActiveReceiver@55d2.com_ss_android_ugc_aweme_lifecycle_LifecycleActiveReceiver__onReceive$___twin___$1L");
                return;
            } else {
                long jElapsedRealtime = LifecycleActiveReceiver.LIZIZ - SystemClock.elapsedRealtime();
                if (jElapsedRealtime > 0) {
                    if (jElapsedRealtime > LifecycleActiveReceiver.LIZ) {
                        i = LifecycleActiveReceiver.LIZ;
                    } else {
                        i = (int) jElapsedRealtime;
                    }
                    LifecycleActiveReceiver.LIZJ(i, i2, C2455309jj.LIZLLL());
                }
            }
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
            } catch (Throwable th3) {
                try {
                    pendingResult.finish();
                    throw th3;
                } finally {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
        }
        try {
            pendingResult.finish();
        } catch (Throwable th32) {
        }
        C1C7U.LIZIZ("LifecycleActiveReceiver@55d2.com_ss_android_ugc_aweme_lifecycle_LifecycleActiveReceiver__onReceive$___twin___$1L");
    }

    public static final void run$6(ARunnableS14S0101000_3 aRunnableS14S0101000_3) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCatcher$PngShotter@34e4.stop$1");
        try {
            aRunnableS14S0101000_3.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCatcher$PngShotter@34e4.stop$1");
    }

    public static final void run$7(ARunnableS14S0101000_3 aRunnableS14S0101000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsV3LayoutInflater@5982.preloadWithCheckCache$1");
        try {
            if (!C20673215v0.LIZ(aRunnableS14S0101000_3.i1, (Context) aRunnableS14S0101000_3.l0)) {
                Context c2481709nz = (Context) aRunnableS14S0101000_3.l0;
                int i = aRunnableS14S0101000_3.i1;
                if (c2481709nz != null && (i == R.layout.b9t || i == R.layout.b_6)) {
                    c2481709nz = new C2481709nz(c2481709nz);
                }
                C20673215v0.LJI(aRunnableS14S0101000_3.i1, c2481709nz);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsV3LayoutInflater@5982.preloadWithCheckCache$1");
    }

    public static final void run$8(ARunnableS14S0101000_3 aRunnableS14S0101000_3) {
        boolean zLIZ;
        C1C7U.LIZ("VideoDuetButtonAssem@6060.setContainerVisibility$1");
        try {
            aRunnableS14S0101000_3.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoDuetButtonAssem@6060.setContainerVisibility$1");
    }

    public ARunnableS14S0101000_3(LiveBroadcastSceneWrapperActivity liveBroadcastSceneWrapperActivity, int i) {
        this.$t = i;
        this.i1 = 100;
        this.l0 = liveBroadcastSceneWrapperActivity;
    }

    public ARunnableS14S0101000_3(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
