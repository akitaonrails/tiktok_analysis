package X;

import Y.ARunnableS4S1000000_7;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.gecko.GeckoStorageOptSetting;
import com.bytedance.android.livesdk.livesetting.gecko.TTLiveGeckoBaseUrlSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0fs0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143780fs0 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(249));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(248));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(255));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(408));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(250));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(251));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(252));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(253));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(254));
    public static ARunnableS4S1000000_7 LJIIIZ;

    public static final boolean LIZ(String str) {
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        if (iHostResource == null) {
            return false;
        }
        return iHostResource.u61(str);
    }

    public static final String LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("tiktok_live_live_cohost_sound_tip.mp3")) {
            return "";
        }
        if (TextUtils.isEmpty("")) {
            return LJIIIZ(str, "tiktok_live_live_cohost_sound_tip.mp3");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(File.separator);
        sbLIZ.append("tiktok_live_live_cohost_sound_tip.mp3");
        return LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIILIIL(String str) {
        TTLiveGeckoBaseUrlSetting tTLiveGeckoBaseUrlSetting = TTLiveGeckoBaseUrlSetting.INSTANCE;
        if (tTLiveGeckoBaseUrlSetting.isEnable() && !GeckoStorageOptSetting.INSTANCE.isOpt(str)) {
            ARunnableS4S1000000_7 aRunnableS4S1000000_7 = LJIIIZ;
            if (aRunnableS4S1000000_7 != null) {
                C473410IhP.LJ(aRunnableS4S1000000_7);
            }
            LJIIIZ = new ARunnableS4S1000000_7(str, 1);
            C473410IhP.LIZJ(LJIIIZ, tTLiveGeckoBaseUrlSetting.getDelayDownTime());
        }
    }

    public static final String LIZIZ(String str, String str2) {
        String strLIZIZ;
        String strLJJLIL;
        String[] list;
        AssetManager assets;
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            return "";
        }
        try {
            String str3 = File.separator;
            boolean z = false;
            if (a0.LJJIIZI(str2, str3, false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str3);
                sbLIZ.append(a0.LJJZ(str2, str3, str2));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLJJLIL = a0.LJJLIL(str2, str3, str2);
            } else {
                strLIZIZ = str;
                strLJJLIL = str2;
            }
            Context contextLJII = C497740JfY.LJII();
            if (contextLJII != null && (assets = contextLJII.getAssets()) != null) {
                list = assets.list(strLIZIZ);
            } else {
                list = null;
            }
            if (list != null) {
                if (list.length == 0) {
                    z = true;
                }
                if (!z) {
                    C089E c089e = new C089E(list);
                    while (c089e.hasNext()) {
                        if (Intrinsics.LJFF(strLJJLIL, (String) c089e.next())) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str);
                            sbLIZ2.append('/');
                            sbLIZ2.append(str2);
                            return C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getAssetPath,e:");
            sbLIZ3.append(e);
            C20441214yg.LJ("Gecko_Resource_Util", C2188811AlT.LIZIZ(sbLIZ3));
        }
        return "";
    }

    public static final String LIZJ(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String strLIZIZ = LIZIZ(str, str2);
        if (TextUtils.isEmpty(strLIZIZ) || TextUtils.isEmpty(strLIZIZ)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asset:///");
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final InputStream LIZLLL(String str, String str2) {
        try {
            AssetManager assets = C497740JfY.LJII().getAssets();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('/');
            sbLIZ.append(str2);
            return assets.open(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("Gecko_Resource_Util", e);
            return null;
        }
    }

    public static final String LJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('/');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final List<String> LJFF(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            if (iHostResource == null) {
                return C13BV.INSTANCE;
            }
            List<String> listMN = iHostResource.mN(str, str2);
            C2222681Bz0.LIZLLL(str, str2, listMN);
            return listMN;
        }
        return C13BV.INSTANCE;
    }

    public static final List<String> LJI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            if (iHostResource == null) {
                return C13BV.INSTANCE;
            }
            List<String> listHT0 = iHostResource.hT0(str, str2);
            C2222681Bz0.LIZLLL(str, str2, listHT0);
            return listHT0;
        }
        return C13BV.INSTANCE;
    }

    public static final File LJII(String str, String str2) {
        IHostResource iHostResource;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) == null) {
            return null;
        }
        File fileHX = iHostResource.HX(str, str2);
        if (fileHX != null && fileHX.exists()) {
            int i = C2222681Bz0.LIZ;
            String absolutePath = fileHX.getAbsolutePath();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C2222681Bz0.LIZJ(2, str, str2, absolutePath);
            }
            C2222681Bz0.LJ(1, str, str2);
            return fileHX;
        }
        int i2 = C2222681Bz0.LIZ;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C2222681Bz0.LIZJ(2, str, str2, "");
        }
        C2222681Bz0.LJ(4, str, str2);
        LJIILIIL(str);
        return null;
    }

    public static final String LJIIIZ(String str, String str2) {
        File fileLJII;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (fileLJII = LJII(str, str2)) == null || !fileLJII.exists()) {
            return "";
        }
        String absolutePath = fileLJII.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        sbLIZ.append(absolutePath);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJIIJ(String str, String str2) {
        List<String> listLJIIJJI = LJIIJJI(str, str2);
        if (!listLJIIJJI.isEmpty()) {
            return (String) ListProtector.get(listLJIIJJI, 0);
        }
        return "";
    }

    public static final List<String> LJIIJJI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(str2) && u.LJJIIJZLJL(str2, "http", false)) {
                return Collections.singletonList(str2);
            }
            C01GW c01gw = LIZ;
            C098J c098j = (C098J) c01gw.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            List<String> list = (List) c098j.get(C2188811AlT.LIZIZ(sbLIZ));
            if (list != null && (!list.isEmpty())) {
                return list;
            }
            String strLIZJ = LIZJ(str, str2);
            if (TextUtils.isEmpty(strLIZJ)) {
                strLIZJ = LJIIIZ(str, str2);
            }
            if (!TextUtils.isEmpty(strLIZJ)) {
                List<String> listSingletonList = Collections.singletonList(strLIZJ);
                C098J c098j2 = (C098J) c01gw.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('_');
                sbLIZ2.append(str2);
                c098j2.put(C2188811AlT.LIZIZ(sbLIZ2), listSingletonList);
                return listSingletonList;
            }
            List<String> listLJFF = LJFF(str, str2);
            C098J c098j3 = (C098J) c01gw.getValue();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append('_');
            sbLIZ3.append(str2);
            c098j3.put(C2188811AlT.LIZIZ(sbLIZ3), listLJFF);
            LJIILIIL(str);
            return listLJFF;
        }
        return C13BV.INSTANCE;
    }

    public static final String LJIIL(String str, String str2) {
        File fileLJII = LJII(str, str2);
        if (fileLJII != null && fileLJII.exists()) {
            return fileLJII.getAbsolutePath();
        }
        return "";
    }
}
