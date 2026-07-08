package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.cache.IVideoCacheConfig;
import com.ss.android.ugc.playerkit.exp.model.CustomCacheDirConfigExp;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475150oUT {
    public static boolean LIZLLL() {
        IVideoCacheConfig iVideoCacheConfig;
        synchronized (C1475580oVA.class) {
            if (C1475580oVA.LIZ == null) {
                IVideoCacheConfig iVideoCacheConfig2 = (IVideoCacheConfig) InjectedConfigManager.getConfig(IVideoCacheConfig.class);
                C1475580oVA.LIZ = iVideoCacheConfig2;
                if (iVideoCacheConfig2 == null) {
                    C1475580oVA.LIZ = new IVideoCacheConfig() { // from class: X.0oV7
                        @Override // com.ss.android.ugc.playerkit.cache.IVideoCacheConfig
                        public final /* synthetic */ void LIZ() {
                        }
                    };
                }
            }
            if (C1475580oVA.LIZ == null) {
                if (C1475000oUE.LIZIZ().isDebug()) {
                    throw new RuntimeException("IVideoCacheConfig getInstance NULL.");
                }
                C1475000oUE.LJIIIIZZ().ensureNotReachHere(new Exception(), "IVideoCacheConfig getInstance NULL.");
            }
            iVideoCacheConfig = C1475580oVA.LIZ;
        }
        iVideoCacheConfig.LIZ();
        return false;
    }

    public static boolean LIZ(EnumC1479760obu enumC1479760obu) {
        if (!C1480850odf.LIZJ.isEnableBytevc1()) {
            return false;
        }
        if (!EnumC1479760obu.TT.equals(enumC1479760obu) && !EnumC1479760obu.TT_HARDWARE.equals(enumC1479760obu)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(SimUrlModel simUrlModel) {
        List<String> urlList;
        if (simUrlModel == null || (urlList = simUrlModel.getUrlList()) == null || urlList.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : urlList) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        simUrlModel.setUrlList(arrayList);
        if (urlList.isEmpty() || TextUtils.isEmpty(simUrlModel.getUri())) {
            return false;
        }
        return true;
    }

    public static C0NKA LIZJ(String str) {
        Map<String, String> config;
        if (!TextUtils.isEmpty(str) && (config = ((CustomCacheDirConfigExp) C1474810oTv.LLIZLLLIL.getValue()).getConfig()) != null && config.containsKey(str)) {
            String str2 = config.get(str);
            if (!TextUtils.isEmpty(str2)) {
                for (C0NKA c0nka : C0NKA.values()) {
                    if (str2.equals(c0nka.getCacheDir())) {
                        return c0nka;
                    }
                }
            }
        }
        return null;
    }

    public static int LJ(C1294210jmd[] c1294210jmdArr, int i, int i2) {
        int time;
        int frame;
        if (c1294210jmdArr == null || c1294210jmdArr.length < 1 || i < 1 || i2 < 1) {
            return -1;
        }
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        if (i == 1) {
            if (c1294210jmdArr.length < 1) {
                return -1;
            }
            int i5 = -1;
            while (true) {
                if (i3 < c1294210jmdArr.length) {
                    C1294210jmd c1294210jmd = c1294210jmdArr[i3];
                    if (c1294210jmd != null && (frame = c1294210jmd.getFrame()) != 0) {
                        int i6 = frame - i2;
                        if (i6 == 0) {
                            break;
                        }
                        if (i6 > 0 && i6 < i4) {
                            i5 = i3;
                            i4 = i6;
                        }
                    }
                    i3++;
                } else {
                    i3 = i5;
                    break;
                }
            }
            if (i3 == -1 || i3 >= c1294210jmdArr.length) {
                return -1;
            }
            return c1294210jmdArr[i3].getOffset();
        }
        if (i != 2 || c1294210jmdArr.length < 1) {
            return -1;
        }
        int i7 = -1;
        while (true) {
            if (i3 < c1294210jmdArr.length) {
                C1294210jmd c1294210jmd2 = c1294210jmdArr[i3];
                if (c1294210jmd2 != null && (time = c1294210jmd2.getTime()) != 0) {
                    int i8 = time - i2;
                    if (i8 == 0) {
                        break;
                    }
                    if (i8 > 0 && i8 < i4) {
                        i7 = i3;
                        i4 = i8;
                    }
                }
                i3++;
            } else {
                i3 = i7;
                break;
            }
        }
        if (i3 == -1 || i3 >= c1294210jmdArr.length) {
            return -1;
        }
        return c1294210jmdArr[i3].getOffset();
    }
}
