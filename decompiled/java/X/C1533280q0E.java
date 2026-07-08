package X;

import android.app.Application;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateBundle;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.tiktok.forestx.config.ForestXEnvData;
import com.tiktok.forestx.config.ForestXEnvType;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q0E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533280q0E {
    public static List LIZ() {
        List<String> listLJJJJLL;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL("ecom_prefix");
        listLJIILJJIL.add("tt/webview/js_manage");
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null || (listLJJJJLL = iSparkHostApi.LJJJJLL()) == null) {
            listLJJJJLL = C13BV.INSTANCE;
        }
        for (String str : listLJJJJLL) {
            str.toString();
            if (str.length() > 0) {
                listLJIILJJIL.add(str);
            }
        }
        return listLJIILJJIL;
    }

    public static Map LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(C2213981Bky.LIZIZ.getAppId());
            C1300610jwx[] c1300610jwxArr = {C1300610jwx.LIZJ, C1300610jwx.LIZLLL, C1300610jwx.LJ, C1300610jwx.LJFF, C1300610jwx.LJI, C1300610jwx.LJII, C1300610jwx.LJIIIIZZ, C1300610jwx.LJIIIZ, C1300610jwx.LJIIJ};
            Bundle bundle = new Bundle();
            if (c09gaLIZIZ != null) {
                c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
            }
            for (int i = 0; i < 9; i++) {
                String str = c1300610jwxArr[i].LIZ;
                linkedHashMap.put(str, Float.valueOf(bundle.getFloat(str)));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }

    public static String LIZIZ() {
        return HybridKitConfigTask.LL;
    }

    public static String LIZJ() {
        return HybridKitConfigTask.LLILLJJLI;
    }

    public static long LIZLLL() {
        return HybridKitConfigTask.LLJ;
    }

    public static void LJI(String str) {
        HybridKitConfigTask.LL = str;
    }

    public static void LJII(String str) {
        HybridKitConfigTask.LLILLJJLI = str;
    }

    public static void LJIIIIZZ(Iterable iterable) {
        boolean z;
        String str;
        C1535830q4L c1535830q4LLJJLIIIJL;
        if (HybridKitConfigTask.LL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        GeckoXNetImpl geckoXNetImplLLILIL = null;
        if (z) {
            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi == null || (c1535830q4LLJJLIIIJL = iSparkHostApi.LJJLIIIJL()) == null || (str = c1535830q4LLJJLIIIJL.LIZIZ) == null) {
                str = "";
            }
            HybridKitConfigTask.LL = str;
        }
        String str2 = "ContainerForest";
        String str3 = HybridKitConfigTask.LLILLJJLI;
        C1533330q0J c1533330q0J = new C1533330q0J(HybridKitConfigTask.LL, "offlineX", true);
        List list = null;
        ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi2 != null) {
            geckoXNetImplLLILIL = iSparkHostApi2.LLILIL(C2213981Bky.LIZIZ.getApplicationContext());
        }
        c1533330q0J.LIZLLL = geckoXNetImplLLILIL;
        C1533300q0G c1533300q0G = new C1533300q0G(str2, str3, c1533330q0J, list, 24);
        C1532680pzG.LIZ.getClass();
        C1502310pCH c1502310pCH = C1532680pzG.LJIJJLI;
        c1502310pCH.LIZJ(iterable);
        c1502310pCH.LIZ();
        C1532680pzG.LJJ = new C1532950pzh(c1533300q0G);
    }

    public static void LJ(String str, C1535740q4C c1535740q4C, String str2) {
        boolean z;
        ForestXEnvData forestXEnvData;
        C1533290q0F c1533290q0F;
        String str3;
        long jLongValue;
        String strLIZ;
        C1540150qBJ c1540150qBJLJJIIJ;
        String str4;
        Long lLJIILIIL;
        if (c1535740q4C != null && c1535740q4C.LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && str != null) {
            forestXEnvData = new ForestXEnvData(ForestXEnvType.BOE, str);
        } else if (c1535740q4C != null && c1535740q4C.LIZJ != null && (c1533290q0F = c1535740q4C.LIZJ) != null && (str3 = c1533290q0F.LIZ) != null) {
            forestXEnvData = new ForestXEnvData(ForestXEnvType.PPE, str3);
        } else {
            forestXEnvData = null;
        }
        C1532680pzG c1532680pzG = C1532680pzG.LIZ;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && (c1540150qBJLJJIIJ = iSparkHostApi.LJJIIJ()) != null && (str4 = c1540150qBJLJJIIJ.LIZ) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str4)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        String strLIZJ = c2213981Bky.LIZJ();
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi2 == null || iSparkHostApi2.LLIL() == null || (strLIZ = C2222691Bz1.LIZ()) == null) {
            strLIZ = "";
        }
        InterfaceC1502280pCE interfaceC1502280pCE = C1522700pjA.LIZ;
        Application application = (Application) c2213981Bky.getApplicationContext();
        c1532680pzG.getClass();
        C1532680pzG.LIZIZ = jLongValue;
        C1532680pzG.LIZJ = strLIZJ;
        C1532680pzG.LIZLLL = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
        C1532680pzG.LJ = strLIZ;
        C1532680pzG.LJFF = forestXEnvData;
        if (interfaceC1502280pCE == null) {
            interfaceC1502280pCE = C1532680pzG.LJJIFFI;
        }
        C1532680pzG.LJJIFFI = interfaceC1502280pCE;
        C1532680pzG.LJII = str2;
        InterfaceC1532860pzY.LIZ.getClass();
        C1532910pzd.LIZIZ = application;
        C1532960pzi.LIZIZ(new Runnable() { // from class: X.0pwr
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ForestGlobalConfigX@25a3.init$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ForestGlobalConfigX@25a3.init$1$1");
            }

            public static void LIZ() {
                Object c098200Yq;
                try {
                    c098200Yq = C1529330ptr.LIZ().listFiles();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                File[] fileArr = (File[]) c098200Yq;
                if (fileArr != null) {
                    C1532960pzi.LJ(new AwS567S0100000_23(fileArr, 118));
                }
            }
        });
        AbstractC1532320pyg<?, ?>[] abstractC1532320pygArr = {new AbstractC1532320pyg<byte[], TemplateBundle>() { // from class: X.0q09
            @Override // X.InterfaceC1532520pz0
            public final boolean LIZ() {
                return false;
            }

            @Override // X.AbstractC1532320pyg
            public final int LJI() {
                return 4;
            }

            @Override // X.InterfaceC1532520pz0
            public final String getName() {
                return "Bytes2TemplateBundle";
            }

            @Override // X.AbstractC1532320pyg, X.InterfaceC1532520pz0
            public final boolean LJFF() {
                EnumC1529850puh enumC1529850puhLIZ;
                InterfaceC1531740pxk interfaceC1531740pxk = C1531760pxm.LIZ;
                if (interfaceC1531740pxk == null || (enumC1529850puhLIZ = interfaceC1531740pxk.LIZ()) == null) {
                    enumC1529850puhLIZ = EnumC1529850puh.LEISURE;
                }
                return enumC1529850puhLIZ == EnumC1529850puh.LEISURE && !C1531760pxm.LIZ();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1532320pyg
            public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
                Object obj;
                C1533240q0A c1533240q0A;
                String str5;
                String str6;
                String str7;
                String str8;
                String str9;
                String str10;
                try {
                    byte[] bArr = (byte[]) abstractC1532350pyj.LIZ;
                    C1537660q7I c1537660q7I = new C1537660q7I();
                    C1529350ptt c1529350ptt = c1532710pzJ.LJJIIJ;
                    if (c1529350ptt != null) {
                        str5 = c1529350ptt.LIZIZ;
                        str6 = c1529350ptt.LIZJ;
                    } else {
                        str5 = null;
                        str6 = null;
                    }
                    c1537660q7I.LIZ = C1533270q0D.LIZ(str5, str6, c1532710pzJ.LJJIII.LIZ);
                    TemplateBundle templateBundleLIZIZ = TemplateBundle.LIZIZ(bArr, c1537660q7I.LIZ());
                    String str11 = templateBundleLIZIZ.LLILZ;
                    if (str11 != null && (!a0.LJJJIL(str11))) {
                        c1532470pyv.LIZIZ(0, str11);
                        if (!templateBundleLIZIZ.LJFF()) {
                            C1532920pze c1532920pze = C1532920pze.LIZJ;
                            Pair[] pairArr = new Pair[7];
                            pairArr[0] = new Pair("res_src", c1532710pzJ.LJJIII.LIZ);
                            C1529350ptt c1529350ptt2 = c1532710pzJ.LJJIIJ;
                            if (c1529350ptt2 != null) {
                                str7 = c1529350ptt2.LIZIZ;
                            } else {
                                str7 = null;
                            }
                            String str12 = "";
                            if (str7 == null) {
                                str7 = "";
                            }
                            pairArr[1] = new Pair("channel", str7);
                            C1529350ptt c1529350ptt3 = c1532710pzJ.LJJIIJ;
                            if (c1529350ptt3 == null || (str8 = c1529350ptt3.LIZ) == null) {
                                str8 = "";
                            }
                            pairArr[2] = new Pair("access_key", str8);
                            C1529350ptt c1529350ptt4 = c1532710pzJ.LJJIIJ;
                            if (c1529350ptt4 == null || (str9 = c1529350ptt4.LIZJ) == null) {
                                str9 = "";
                            }
                            pairArr[3] = new Pair("bundle", str9);
                            String str13 = c1532170pyR.LIZIZ;
                            if (str13 == null) {
                                str13 = "";
                            }
                            pairArr[4] = new Pair("from", str13);
                            C1541080qCo<C1532310pyf> c1541080qCo = c1532710pzJ.LJJIIZI;
                            if (c1541080qCo != null && (str10 = c1541080qCo.LIZ.LIZIZ) != null) {
                                str12 = str10;
                            }
                            pairArr[5] = new Pair("source", str12);
                            pairArr[6] = new Pair(Scene.SCENE_SERVICE, c1532710pzJ.LJIJ.toString());
                            C1532760pzO.LIZIZ(c1532920pze, "Bytes2TemplateBundle", "process", str11, null, C2097608Jq.LJIIIIZZ(pairArr), 16);
                        }
                    }
                    boolean zLJFF = templateBundleLIZIZ.LJFF();
                    TemplateBundle templateBundle = templateBundleLIZIZ;
                    if (!zLJFF) {
                        templateBundle = null;
                    }
                    C189200o6.m2constructorimpl(templateBundle);
                    obj = templateBundle;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                Object obj2 = obj;
                if (zM7isFailureimpl) {
                    obj2 = null;
                }
                TemplateBundle templateBundle2 = (TemplateBundle) obj2;
                if (templateBundle2 != null) {
                    c1533240q0A = new C1533240q0A(templateBundle2);
                } else {
                    c1533240q0A = null;
                }
                function1.invoke(new C1532340pyi(c1533240q0A, null));
            }
        }, new AbstractC1532320pyg<ByteBuffer, TemplateBundle>() { // from class: X.0q08
            @Override // X.InterfaceC1532520pz0
            public final boolean LIZ() {
                return false;
            }

            @Override // X.AbstractC1532320pyg
            public final int LJI() {
                return 3;
            }

            @Override // X.InterfaceC1532520pz0
            public final String getName() {
                return "Buffer2TemplateBundle";
            }

            @Override // X.AbstractC1532320pyg, X.InterfaceC1532520pz0
            public final boolean LJFF() {
                EnumC1529850puh enumC1529850puhLIZ;
                InterfaceC1531740pxk interfaceC1531740pxk = C1531760pxm.LIZ;
                if (interfaceC1531740pxk == null || (enumC1529850puhLIZ = interfaceC1531740pxk.LIZ()) == null) {
                    enumC1529850puhLIZ = EnumC1529850puh.LEISURE;
                }
                return enumC1529850puhLIZ == EnumC1529850puh.LEISURE && !C1531760pxm.LIZ();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1532320pyg
            public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
                Object obj;
                C1533240q0A c1533240q0A;
                String str5;
                String str6;
                String str7;
                String str8;
                String str9;
                String str10;
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) abstractC1532350pyj.LIZ;
                    C1537660q7I c1537660q7I = new C1537660q7I();
                    C1529350ptt c1529350ptt = c1532710pzJ.LJJIIJ;
                    if (c1529350ptt != null) {
                        str5 = c1529350ptt.LIZIZ;
                        str6 = c1529350ptt.LIZJ;
                    } else {
                        str5 = null;
                        str6 = null;
                    }
                    c1537660q7I.LIZ = C1533270q0D.LIZ(str5, str6, c1532710pzJ.LJJIII.LIZ);
                    TemplateBundle templateBundleLIZ = TemplateBundle.LIZ(byteBuffer, c1537660q7I.LIZ());
                    String str11 = templateBundleLIZ.LLILZ;
                    if (str11 != null && (!a0.LJJJIL(str11))) {
                        c1532470pyv.LIZIZ(0, str11);
                        if (!templateBundleLIZ.LJFF()) {
                            C1532920pze c1532920pze = C1532920pze.LIZJ;
                            Pair[] pairArr = new Pair[7];
                            pairArr[0] = new Pair("res_src", c1532710pzJ.LJJIII.LIZ);
                            C1529350ptt c1529350ptt2 = c1532710pzJ.LJJIIJ;
                            if (c1529350ptt2 != null) {
                                str7 = c1529350ptt2.LIZIZ;
                            } else {
                                str7 = null;
                            }
                            String str12 = "";
                            if (str7 == null) {
                                str7 = "";
                            }
                            pairArr[1] = new Pair("channel", str7);
                            C1529350ptt c1529350ptt3 = c1532710pzJ.LJJIIJ;
                            if (c1529350ptt3 == null || (str8 = c1529350ptt3.LIZ) == null) {
                                str8 = "";
                            }
                            pairArr[2] = new Pair("access_key", str8);
                            C1529350ptt c1529350ptt4 = c1532710pzJ.LJJIIJ;
                            if (c1529350ptt4 == null || (str9 = c1529350ptt4.LIZJ) == null) {
                                str9 = "";
                            }
                            pairArr[3] = new Pair("bundle", str9);
                            String str13 = c1532170pyR.LIZIZ;
                            if (str13 == null) {
                                str13 = "";
                            }
                            pairArr[4] = new Pair("from", str13);
                            C1541080qCo<C1532310pyf> c1541080qCo = c1532710pzJ.LJJIIZI;
                            if (c1541080qCo != null && (str10 = c1541080qCo.LIZ.LIZIZ) != null) {
                                str12 = str10;
                            }
                            pairArr[5] = new Pair("source", str12);
                            pairArr[6] = new Pair(Scene.SCENE_SERVICE, c1532710pzJ.LJIJ.toString());
                            C1532760pzO.LIZIZ(c1532920pze, "Buffer2TemplateBundle", "process", str11, null, C2097608Jq.LJIIIIZZ(pairArr), 16);
                        }
                    }
                    boolean zLJFF = templateBundleLIZ.LJFF();
                    TemplateBundle templateBundle = templateBundleLIZ;
                    if (!zLJFF) {
                        templateBundle = null;
                    }
                    C189200o6.m2constructorimpl(templateBundle);
                    obj = templateBundle;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                Object obj2 = obj;
                if (zM7isFailureimpl) {
                    obj2 = null;
                }
                TemplateBundle templateBundle2 = (TemplateBundle) obj2;
                if (templateBundle2 != null) {
                    c1533240q0A = new C1533240q0A(templateBundle2);
                } else {
                    c1533240q0A = null;
                }
                function1.invoke(new C1532340pyi(c1533240q0A, null));
            }
        }};
        synchronized (c1532680pzG) {
            int i = 0;
            do {
                try {
                    AbstractC1532320pyg<?, ?> abstractC1532320pyg = abstractC1532320pygArr[i];
                    C1532680pzG.LJJIII.add((Class<? extends AbstractC1532320pyg<?, ?>>) abstractC1532320pyg.getClass());
                    C1532680pzG.LJJII.add(abstractC1532320pyg);
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } while (i < 2);
        }
        C1532680pzG.LJJIIJZLJL = false;
        C1532960pzi.LJ(AFwS200S0000000_13.get$arr$(204));
    }
}
