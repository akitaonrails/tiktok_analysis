package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.08TE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08TE {
    public static final C2458409kE LIZJ = new C2458409kE("SplitInstallInfoProvider");
    public final Context LIZ;
    public final String LIZIZ;

    public final PackageInfo LJFF() {
        try {
            return C786410Ut5.Y3(this.LIZ.getPackageManager(), this.LIZIZ, 128);
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ.LIZIZ("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public final Set LIZIZ() {
        PackageInfo packageInfoLJFF = LJFF();
        return (packageInfoLJFF == null || packageInfoLJFF.applicationInfo == null) ? new HashSet() : LJ(packageInfoLJFF);
    }

    public final Set LIZJ() {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoLJFF = LJFF();
        HashSet hashSet = null;
        if (packageInfoLJFF != null && (applicationInfo = packageInfoLJFF.applicationInfo) != null) {
            C1961407mG c1961407mGLIZ = LIZ(applicationInfo.metaData);
            if (c1961407mGLIZ == null) {
                return null;
            }
            hashSet = new HashSet();
            Set setLJI = LJI(packageInfoLJFF);
            ((HashSet) setLJI).add("");
            Set setLJ = LJ(packageInfoLJFF);
            ((HashSet) setLJ).add("");
            for (Map.Entry entry : ((HashMap) c1961407mGLIZ.LIZ(setLJ)).entrySet()) {
                if (setLJI.containsAll((Collection) entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
        }
        return hashSet;
    }

    public C08TE(Context context) {
        this.LIZ = context;
        this.LIZIZ = context.getPackageName();
    }

    public static boolean LIZLLL(String str) {
        if (!str.startsWith("config.") && !str.contains(".config.")) {
            return false;
        }
        return true;
    }

    public static final Set LJ(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : (HashSet) LJI(packageInfo)) {
            if (!LIZLLL(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final Set LJI(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.tiktok.dynamic.apk.fused.modules");
            if ((string != null || (string = bundle.getString("com.android.dynamic.apk.fused.modules")) != null) && !string.isEmpty()) {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            } else {
                LIZJ.LIZ("App has no fused modules.", new Object[0]);
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            LIZJ.LIZ("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            LIZJ.LIZ("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        C08TD c08td = (C08TD) C08TA.LIZ.get();
        if (c08td != null) {
            hashSet.addAll(c08td.zza());
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.07mH] */
    public final C1961407mG LIZ(Bundle bundle) {
        C1961407mG c1961407mGLIZIZ = null;
        if (bundle == null) {
            LIZJ.LJ("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            LIZJ.LJ("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            XmlResourceParser xml = this.LIZ.getResources().getXml(i);
            ?? r6 = new Object() { // from class: X.07mH
                public final Map LIZ = new HashMap();

                public final C1961407mG LIZIZ() {
                    HashMap map = new HashMap();
                    for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
                        map.put(entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
                    }
                    return new C1961407mG(Collections.unmodifiableMap(map));
                }

                public final void LIZ(String str, String str2, String str3) {
                    if (!((HashMap) this.LIZ).containsKey(str2)) {
                        ((HashMap) this.LIZ).put(str2, new HashMap());
                    }
                    ((Map) ((HashMap) this.LIZ).get(str2)).put(str, str3);
                }
            };
            while (xml.next() != 1) {
                try {
                    if (xml.getEventType() == 2) {
                        if (!xml.getName().equals("splits")) {
                            C08TF.LIZIZ(xml);
                        } else {
                            while (xml.next() != 3) {
                                if (xml.getEventType() == 2) {
                                    if (xml.getName().equals("module")) {
                                        String strLIZ = C08TF.LIZ("name", xml);
                                        if (strLIZ == null) {
                                            C08TF.LIZIZ(xml);
                                        } else {
                                            while (xml.next() != 3) {
                                                if (xml.getEventType() == 2) {
                                                    if (!xml.getName().equals("language")) {
                                                        C08TF.LIZIZ(xml);
                                                    } else {
                                                        while (xml.next() != 3) {
                                                            if (xml.getEventType() == 2) {
                                                                if (xml.getName().equals("entry")) {
                                                                    String strLIZ2 = C08TF.LIZ("key", xml);
                                                                    String strLIZ3 = C08TF.LIZ("split", xml);
                                                                    C08TF.LIZIZ(xml);
                                                                    if (strLIZ2 != null && strLIZ3 != null) {
                                                                        r6.LIZ(strLIZ, strLIZ2, strLIZ3);
                                                                    }
                                                                } else {
                                                                    C08TF.LIZIZ(xml);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        C08TF.LIZIZ(xml);
                                    }
                                }
                            }
                        }
                    }
                } catch (IOException | IllegalStateException | XmlPullParserException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c1961407mGLIZIZ = r6.LIZIZ();
            if (c1961407mGLIZIZ == null) {
                LIZJ.LJ("Can't parse languages metadata.", new Object[0]);
            }
            return c1961407mGLIZIZ;
        } catch (Resources.NotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LIZJ.LJ("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }
}
