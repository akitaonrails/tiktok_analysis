package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0fNX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124890fNX {
    public static C1124890fNX LJIIIIZZ;
    public String LIZ = "";
    public long LIZIZ;
    public String LIZJ;
    public Map<String, String> LIZLLL;
    public I18nUpdateManager LJ;
    public final C1124900fNY LJFF;
    public I18nDbManager LJI;
    public final C1124920fNa LJII;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0fNY] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0fNa] */
    public C1124890fNX() {
        this.LIZLLL = C325510CpR.LIZ() ? new ConcurrentHashMap<>() : new HashMap<>();
        this.LJFF = new InterfaceC1124980fNg() { // from class: X.0fNY
            @Override // X.InterfaceC1124980fNg
            public final void LIZ(String str, long j, String str2, List<String> list, Map<String, String> map, String str3, int i) {
                int size;
                boolean zEquals;
                Map<String, String> map2;
                Map<String, String> map3;
                this.LIZ.getClass();
                if (map != null && !map.isEmpty()) {
                    size = map.size();
                } else {
                    size = 0;
                }
                C1124990fNh.LIZ(2, size, str3.equals("incr"));
                if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.LIZ.LIZ)) {
                    boolean zLIZ = C325510CpR.LIZ();
                    if (zLIZ) {
                        zEquals = str2.equals(this.LIZ.LIZJ);
                    } else if (j == this.LIZ.LIZIZ) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdated: isApiOptEnable = ");
                    sbLIZ.append(zLIZ);
                    sbLIZ.append(" isLocalVersionLatest = ");
                    sbLIZ.append(zEquals);
                    C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
                    if (zEquals) {
                        C1124890fNX c1124890fNX = this.LIZ;
                        if (c1124890fNX.LJI != null && (map3 = c1124890fNX.LIZLLL) != null && map3.isEmpty()) {
                            this.LIZ.LJI.queryTranslations();
                        }
                        C20441214yg.LIZIZ("i18n_translation", "version from api is lower than or equals with version in memory");
                        return;
                    }
                    if ((map == null || map.isEmpty()) && (list == null || list.isEmpty())) {
                        C1124890fNX c1124890fNX2 = this.LIZ;
                        if (c1124890fNX2.LJI != null && (map2 = c1124890fNX2.LIZLLL) != null && map2.isEmpty()) {
                            this.LIZ.LJI.queryTranslations();
                        }
                        C20441214yg.LIZIZ("i18n_translation", "result invalid, no need process");
                        return;
                    }
                    C1124890fNX c1124890fNX3 = this.LIZ;
                    c1124890fNX3.LIZIZ = j;
                    c1124890fNX3.LIZJ = str2;
                    if (str3.equals("incr")) {
                        Map<String, String> map4 = this.LIZ.LIZLLL;
                        if (map4 != null && map != null) {
                            map4.putAll(map);
                            Iterator<String> it2 = list.iterator();
                            while (it2.hasNext()) {
                                this.LIZ.LIZLLL.remove(it2.next());
                            }
                        }
                    } else if (map != null) {
                        if (zLIZ) {
                            this.LIZ.LIZLLL = new ConcurrentHashMap(map);
                        } else {
                            this.LIZ.LIZLLL = map;
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("on api result, update translationMap in memory, version is ");
                    sbLIZ2.append(this.LIZ.LIZIZ);
                    sbLIZ2.append(" versionCtrCode is ");
                    sbLIZ2.append(this.LIZ.LIZJ);
                    C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ2));
                    I18nDbManager i18nDbManager = this.LIZ.LJI;
                    if (i18nDbManager != null) {
                        i18nDbManager.updateTranslations(j, str2, list, map, str3);
                        return;
                    }
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    C20441214yg.LJ("i18n_translation", "locale is not matched on api result, locale in result is empty");
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("locale is not matched on api result, locale in result is ");
                sbLIZ3.append(str);
                C20441214yg.LJ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ3));
            }
        };
        this.LJII = new InterfaceC1125030fNl() { // from class: X.0fNa
            @Override // X.InterfaceC1125030fNl
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1125030fNl
            public final void LIZLLL(Exception exc) {
                C20441214yg.LJ("i18n_translation", exc.toString());
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
            
                if (r8.LIZIZ.equals(r6.LIZ.LIZJ) != false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
            
                X.C20441214yg.LIZIZ("i18n_translation", "version in db is lower than or equals with version in memory");
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
            
                if (r4 == r6.LIZ.LIZIZ) goto L12;
             */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
            @Override // X.InterfaceC1125030fNl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r7, X.C1124970fNf r8) {
                /*
                    r6 = this;
                    boolean r0 = android.text.TextUtils.isEmpty(r7)
                    java.lang.String r3 = "i18n_translation"
                    if (r0 != 0) goto L9f
                    X.0fNX r0 = r6.LIZ
                    java.lang.String r0 = r0.LIZ
                    boolean r0 = android.text.TextUtils.equals(r0, r7)
                    if (r0 == 0) goto L9f
                    boolean r0 = X.C325510CpR.LIZ()
                    if (r0 == 0) goto L32
                    java.lang.String r0 = r8.LIZIZ
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L43
                    java.lang.String r1 = r8.LIZIZ
                    X.0fNX r0 = r6.LIZ
                    java.lang.String r0 = r0.LIZJ
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L43
                L2c:
                    java.lang.String r0 = "version in db is lower than or equals with version in memory"
                    X.C20441214yg.LIZIZ(r3, r0)
                    return
                L32:
                    long r4 = r8.LIZ
                    r1 = 0
                    int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r0 == 0) goto L43
                    X.0fNX r0 = r6.LIZ
                    long r1 = r0.LIZIZ
                    int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r0 != 0) goto L43
                    goto L2c
                L43:
                    java.util.Map<java.lang.String, java.lang.String> r0 = r8.LIZJ
                    if (r0 == 0) goto L8c
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L8c
                    X.0fNX r2 = r6.LIZ
                    long r0 = r8.LIZ
                    r2.LIZIZ = r0
                    java.lang.String r0 = r8.LIZIZ
                    r2.LIZJ = r0
                    java.util.Map<java.lang.String, java.lang.String> r0 = r8.LIZJ
                    r2.LIZLLL = r0
                    java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "on db query result, update translationMap in memory, version is "
                    r2.append(r0)
                    X.0fNX r0 = r6.LIZ
                    long r0 = r0.LIZIZ
                    r2.append(r0)
                    java.lang.String r0 = " versionCtrCode is "
                    r2.append(r0)
                    X.0fNX r0 = r6.LIZ
                    java.lang.String r0 = r0.LIZJ
                    r2.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
                    X.C20441214yg.LIZIZ(r3, r0)
                    X.0fNX r0 = r6.LIZ
                    com.bytedance.android.livesdk.i18n.I18nUpdateManager r3 = r0.LJ
                    if (r3 == 0) goto L8b
                    long r1 = r0.LIZIZ
                    java.lang.String r0 = r0.LIZJ
                    r3.LIZJ(r1, r0)
                L8b:
                    return
                L8c:
                    X.0fNX r0 = r6.LIZ
                    com.bytedance.android.livesdk.i18n.I18nUpdateManager r4 = r0.LJ
                    if (r4 == 0) goto L99
                    long r1 = r0.LIZIZ
                    java.lang.String r0 = r0.LIZJ
                    r4.LIZJ(r1, r0)
                L99:
                    java.lang.String r0 = "translations from db is empty, update from server"
                    X.C20441214yg.LIZIZ(r3, r0)
                    return
                L9f:
                    boolean r0 = android.text.TextUtils.isEmpty(r7)
                    if (r0 == 0) goto Lb8
                    java.lang.String r0 = "on db query result, but locale from db is empty"
                    X.C20441214yg.LJ(r3, r0)
                Laa:
                    X.0fNX r0 = r6.LIZ
                    com.bytedance.android.livesdk.i18n.I18nUpdateManager r3 = r0.LJ
                    if (r3 == 0) goto Lb7
                    long r1 = r0.LIZIZ
                    java.lang.String r0 = r0.LIZJ
                    r3.LIZJ(r1, r0)
                Lb7:
                    return
                Lb8:
                    java.lang.String r0 = "on db query result, but locale is not matched"
                    X.C20441214yg.LIZIZ(r3, r0)
                    goto Laa
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1124920fNa.LIZ(java.lang.String, X.0fNf):void");
            }

            @Override // X.InterfaceC1125030fNl
            public final void LIZJ(String str, Exception exc) {
                C20441214yg.LJ("i18n_translation", exc.toString());
                if (TextUtils.isEmpty(str) || !TextUtils.equals(this.LIZ.LIZ, str)) {
                    if (TextUtils.isEmpty(str)) {
                        C20441214yg.LJ("i18n_translation", "on db query result, but locale from db is empty");
                    } else {
                        C20441214yg.LIZIZ("i18n_translation", "on db query result, but locale is not matched");
                    }
                }
                C1124890fNX c1124890fNX = this.LIZ;
                I18nUpdateManager i18nUpdateManager = c1124890fNX.LJ;
                if (i18nUpdateManager != null) {
                    i18nUpdateManager.LIZJ(c1124890fNX.LIZIZ, c1124890fNX.LIZJ);
                }
            }
        };
    }
}
