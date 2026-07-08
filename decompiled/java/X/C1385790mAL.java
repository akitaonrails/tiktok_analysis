package X;

import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mAL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385790mAL {
    public static List LIZ(List list) throws AbstractC1385830mAP {
        final String str;
        final String str2;
        final String str3;
        final Map mapLJ;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            Object obj = map.get("type");
            if ((obj instanceof String) && (str = (String) obj) != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (Intrinsics.LJFF(lowerCase, "case")) {
                    arrayList.add(new InterfaceC1381650m3f() { // from class: X.0mAF
                        @Override // X.InterfaceC1381650m3f
                        public final String LIZ(String str4) {
                            return str4.toLowerCase(Locale.getDefault());
                        }
                    });
                } else if (Intrinsics.LJFF(lowerCase, "psp")) {
                    Object obj2 = map.get("scene_key");
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    } else {
                        str2 = null;
                    }
                    Object obj3 = map.get("strategy_key");
                    if (obj3 instanceof String) {
                        str3 = (String) obj3;
                    } else {
                        str3 = null;
                    }
                    if (str2 != null && str3 != null) {
                        Object obj4 = map.get("extra_params");
                        if (!(obj4 instanceof Map) || (mapLJ = (Map) obj4) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        arrayList.add(new InterfaceC1381650m3f(str2, str3, mapLJ) { // from class: X.0mAE
                            public final String LIZ;
                            public final String LIZIZ;
                            public final Map<String, Object> LIZJ;

                            public final boolean equals(Object obj5) {
                                if (this == obj5) {
                                    return true;
                                }
                                if (!(obj5 instanceof C1385720mAE)) {
                                    return false;
                                }
                                C1385720mAE c1385720mAE = (C1385720mAE) obj5;
                                return Intrinsics.LJFF(this.LIZ, c1385720mAE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1385720mAE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1385720mAE.LIZJ);
                            }

                            public final int hashCode() {
                                return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("PSPPreprocessor(sceneKey=");
                                sbLIZ.append(this.LIZ);
                                sbLIZ.append(", strategyKey=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(", extraParams=");
                                sbLIZ.append(this.LIZJ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            @Override // X.InterfaceC1381650m3f
                            public final String LIZ(String str4) {
                                InterfaceC830890Wid interfaceC830890WidLIZ;
                                String str5;
                                Pair[] pairArr = new Pair[2];
                                ArrayList arrayList2 = new ArrayList(str4.length());
                                for (int i = 0; i < str4.length(); i++) {
                                    arrayList2.add(String.valueOf(str4.charAt(i)));
                                }
                                pairArr[0] = new Pair("input", arrayList2);
                                pairArr[1] = new Pair("extra_params", this.LIZJ);
                                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                                C23094093c.LIZ.getClass();
                                mapLJIIJ.putAll(C23094093c.LIZIZ);
                                if (!C23094093c.LIZ(mapLJIIJ) || (interfaceC830890WidLIZ = C1386050mAl.LIZJ.LIZ().LIZ(this.LIZ)) == null) {
                                    return str4;
                                }
                                InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890WidLIZ, this.LIZIZ, new TTMParamData((Map<String, Object>) mapLJIIJ));
                                Object objLIZJ = null;
                                if (interfaceC805220ViKRunScene != null) {
                                    objLIZJ = interfaceC805220ViKRunScene.LIZJ();
                                }
                                if ((objLIZJ instanceof String) && (str5 = (String) objLIZJ) != null) {
                                    return str5;
                                }
                                return str4;
                            }

                            {
                                this.LIZ = str2;
                                this.LIZIZ = str3;
                                this.LIZJ = mapLJ;
                            }
                        });
                    } else {
                        throw C1385890mAV.INSTANCE;
                    }
                } else {
                    throw new AbstractC1385830mAP(str) { // from class: X.0mAO
                        public final String LL;
                        public final String LLILLJJLI;

                        @Override // java.lang.Throwable
                        public String getMessage() {
                            return this.LLILLJJLI;
                        }

                        public final String getType() {
                            return this.LL;
                        }

                        {
                            this.LL = str;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unknown preprocessor type: ");
                            sbLIZ.append(str);
                            this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    };
                }
            } else {
                throw C1385900mAW.INSTANCE;
            }
        }
        return arrayList;
    }
}
