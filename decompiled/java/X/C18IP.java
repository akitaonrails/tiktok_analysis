package X;

import android.app.Application;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import com.bytedance.android.btm.api.util.LazyNullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.18IP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18IP {
    public static final C18IP LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static InterfaceC21260718Ib LIZJ;
    public static final LazyNullable LIZLLL;
    public static final LazyNonNull LJ;
    public static final LazyNullable LJFF;
    public static final LazyNullable LJI;
    public static final LazyNullable LJII;
    public static final LazyNullable LJIIIIZZ;
    public static final LazyNullable LJIIIZ;
    public static final LazyNullable LJIIJ;
    public static final LazyNullable LJIIJJI;
    public static final LazyNullable LJIIL;
    public static final LazyNullable LJIILIIL;
    public static final LazyNonNull LJIILJJIL;
    public static final LazyNonNull LJIILL;
    public static final LazyNonNull LJIILLIIL;
    public static final LazyNonNull LJIIZILJ;
    public static final LazyNonNull LJIJ;
    public static final LazyNonNull LJIJI;
    public static final LazyNonNull LJIJJ;
    public static final LazyNonNull LJIJJLI;
    public static final LazyNonNull LJIL;
    public static final LazyNonNull LJJ;
    public static final CopyOnWriteArraySet<C18GZ> LJJI;
    public static final CopyOnWriteArraySet<C18EW> LJJIFFI;
    public static final LazyNonNull LJJII;
    public static final LazyNonNull LJJIII;
    public static final LazyNullable LJJIIJ;
    public static final LazyNonNull LJJIIJZLJL;
    public static final LazyNonNull LJJIIZ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C18IP.class, "app", "getApp()Landroid/app/Application;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(C18IP.class, "debug", "getDebug()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR3 = new C2217371BqR(C18IP.class, "appLogDepend", "getAppLogDepend()Lcom/bytedance/android/btm/api/depend/IAppLogDepend;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR4 = new C2217371BqR(C18IP.class, "settingDepend", "getSettingDepend()Lcom/bytedance/android/btm/api/depend/ISettingDepend;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR5 = new C2217371BqR(C18IP.class, "libraConfigDepend", "getLibraConfigDepend()Lcom/bytedance/android/btm/api/depend/ILibraConfigDepend;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR6 = new C2217371BqR(C18IP.class, "schemaSettingDepend", "getSchemaSettingDepend()Lcom/bytedance/android/btm/api/depend/ISettingDepend;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR7 = new C2217371BqR(C18IP.class, "logDepend", "getLogDepend()Lcom/bytedance/android/btm/api/depend/ILogDepend;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR8 = new C2217371BqR(C18IP.class, "aLogDepend", "getALogDepend()Lcom/bytedance/android/btm/api/depend/IALogDepend;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR9 = new C2217371BqR(C18IP.class, "monitorDepend", "getMonitorDepend()Lcom/bytedance/android/btm/api/depend/IMonitorDepend;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR10 = new C2217371BqR(C18IP.class, "executorDepend", "getExecutorDepend()Lcom/bytedance/android/btm/api/depend/IExecutorDepend;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR11 = new C2217371BqR(C18IP.class, "appLaunchDepend", "getAppLaunchDepend()Lcom/bytedance/android/btm/api/depend/IAppLaunchDepend;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR12 = new C2217371BqR(C18IP.class, "appIds", "getAppIds()[Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR13 = new C2217371BqR(C18IP.class, "defaultA", "getDefaultA()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR14 = new C2217371BqR(C18IP.class, "hasLancet", "getHasLancet()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR15 = new C2217371BqR(C18IP.class, "enableDebugCrash", "getEnableDebugCrash()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR16 = new C2217371BqR(C18IP.class, "enableBtmPageAnnotation", "getEnableBtmPageAnnotation()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR17 = new C2217371BqR(C18IP.class, "deviceId", "getDeviceId()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR18 = new C2217371BqR(C18IP.class, "versionName", "getVersionName()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR19 = new C2217371BqR(C18IP.class, "appId", "getAppId()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR20 = new C2217371BqR(C18IP.class, "updateVersionCode", "getUpdateVersionCode()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR21 = new C2217371BqR(C18IP.class, "coldStartBPage", "getColdStartBPage()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS = new C2217381BqS(C18IP.class, "hybridContainerSet", "getHybridContainerSet()Ljava/util/concurrent/CopyOnWriteArraySet;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C18IP.class, "unknownWhiteSet", "getUnknownWhiteSet()Ljava/util/concurrent/CopyOnWriteArraySet;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR22 = new C2217371BqR(C18IP.class, "uploadALog", "getUploadALog()Lkotlin/jvm/functions/Function3;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR23 = new C2217371BqR(C18IP.class, "shareNodeCD", "getShareNodeCD()Ljava/util/Map;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR24 = new C2217371BqR(C18IP.class, "defaultVirtualNodeUrl", "getDefaultVirtualNodeUrl()Ljava/util/List;", 0);
        c09r3.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3, c2217371BqR4, c2217371BqR5, c2217371BqR6, c2217371BqR7, c2217371BqR8, c2217371BqR9, c2217371BqR10, c2217371BqR11, c2217371BqR12, c2217371BqR13, c2217371BqR14, c2217371BqR15, c2217371BqR16, c2217371BqR17, c2217371BqR18, c2217371BqR19, c2217371BqR20, c2217371BqR21, c2217381BqS, c2217381BqS2, c2217371BqR22, c2217371BqR23, c2217371BqR24};
        LIZ = new C18IP();
        LazyKt lazyKt = LazyKt.INSTANCE;
        LIZLLL = lazyKt.lazyNullable(new C21262218Iq());
        LJ = lazyKt.lazyNonNull(new C21260918Id());
        LJFF = lazyKt.lazyNullable(new C21262318Ir());
        LJI = lazyKt.lazyNullable(new C21263118Iz());
        LJII = lazyKt.lazyNullable(new C21262518It());
        LJIIIIZZ = lazyKt.lazyNullable(new C21262718Iv());
        LJIIIZ = lazyKt.lazyNullable(new C18J1());
        LJIIJ = lazyKt.lazyNullable(new C21262118Ip());
        LJIIJJI = lazyKt.lazyNullable(new C21262618Iu());
        LJIIL = lazyKt.lazyNullable(new C21262418Is());
        LJIILIIL = lazyKt.lazyNullable(new C21263018Iy());
        LJIILJJIL = lazyKt.lazyNonNull(new C21261318Ih());
        LJIILL = lazyKt.lazyNonNull(new C21261518Ij());
        LJIILLIIL = lazyKt.lazyNonNull(new C21261218Ig());
        LJIIZILJ = lazyKt.lazyNonNull(new C21261118If());
        LJIJ = lazyKt.lazyNonNull(new C21261018Ie());
        LJIJI = lazyKt.lazyNonNull(new C21261718Il());
        LJIJJ = lazyKt.lazyNonNull(new C21261618Ik());
        LJIJJLI = lazyKt.lazyNonNull(new C21260818Ic());
        LJIL = lazyKt.lazyNonNull(new C21261818Im());
        LJJ = lazyKt.lazyNonNull(new C21261418Ii());
        LJJI = new CopyOnWriteArraySet<>();
        LJJIFFI = new CopyOnWriteArraySet<>();
        LJJII = lazyKt.lazyNonNull(new C18IZ());
        LJJIII = lazyKt.lazyNonNull(new C21260618Ia());
        LJJIIJ = lazyKt.lazyNullable(new C18IW());
        LJJIIJZLJL = lazyKt.lazyNonNull(new C18IX());
        LJJIIZ = lazyKt.lazyNonNull(new C18IY());
    }

    public final C18IH LIZ() {
        return (C18IH) LJIIJ.getValue(this, LIZIZ[7]);
    }

    public final Application LIZIZ() {
        return (Application) LIZLLL.getValue(this, LIZIZ[0]);
    }

    public final C18DK LIZJ() {
        return (C18DK) LJFF.getValue(this, LIZIZ[2]);
    }

    public final boolean LIZLLL() {
        return ((Boolean) LJ.getValue(this, LIZIZ[1])).booleanValue();
    }

    public final String LJ() {
        return (String) LJIILL.getValue(this, LIZIZ[12]);
    }

    public final InterfaceC21257118Gr LJFF() {
        return (InterfaceC21257118Gr) LJIIL.getValue(this, LIZIZ[9]);
    }

    public final C18A9 LJI() {
        return (C18A9) LJIIJJI.getValue(this, LIZIZ[8]);
    }

    public static void LJII(C18IV c18iv) {
        c18iv.getClass();
        LJIIJ(new C18EW(new WeakReference(c18iv.LIZ), c18iv.LIZIZ, c18iv.LIZJ, c18iv.LIZLLL, c18iv.LJ, c18iv.LJFF, c18iv.LJI));
    }

    public static void LJIIJ(C18EW c18ew) {
        if (c18ew.LIZIZ.length() == 0) {
            return;
        }
        LJJIFFI.add(c18ew);
        C18CK.LIZLLL("NA_registerPageInstance", new C18J0(c18ew));
        BtmSDK.INSTANCE.getService().onRegisterPage(c18ew);
    }

    public final void LJIIIIZZ(C1206720hVW c1206720hVW) {
        ((CopyOnWriteArraySet) LJJII.getValue(this, LIZIZ[21])).add(c1206720hVW);
        BtmSDK.INSTANCE.getService().onRegisterHybridContainer(c1206720hVW);
    }

    public static void LJIIIZ(Class cls, String str, boolean z, boolean z2) {
        if (str.length() == 0) {
            return;
        }
        C18GZ c18gz = new C18GZ(cls, "", str, z, z2);
        LJJI.add(c18gz);
        BtmSDK.INSTANCE.getService().onRegisterPage(c18gz);
    }
}
