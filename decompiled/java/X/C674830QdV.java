package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS95S1000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674830QdV {
    public static C15O7 LIZ(C674830QdV c674830QdV, String str, String str2, long j, String str3, String str4, int i, int i2, String str5, String str6, String str7, String str8, int i3, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i4, Integer num, TypedByteArray typedByteArray, String str19, String str20, String str21, String str22, String str23, List list, Long l, String str24, Integer num2, String str25, Long l2, Object obj, Integer num3, String str26, Function1 function1, int i5) {
        EcSearchMixApi.RealApi realApi;
        C08S1 c08s1LIZ;
        C08S1 c08s1LIZ2;
        C08S1 c08s1LIZ3;
        C08S1 c08s1LIZ4;
        C08S1 c08s1LIZ5;
        C08S1 c08s1LIZ6;
        C08S1 c08s1LIZ7;
        C08S1 c08s1LIZ8;
        C08S1 c08s1LIZ9;
        C08S1 c08s1LIZ10;
        C08S1 c08s1LIZ11;
        C08S1 c08s1LIZ12;
        C08S1 c08s1LIZ13;
        C08S1 c08s1LIZ14;
        C08S1 c08s1LIZ15;
        C08S1 c08s1LIZ16;
        C08S1 c08s1LIZ17;
        Integer num4 = num3;
        Object obj2 = obj;
        String str27 = str26;
        Integer num5 = num2;
        C08S1 c08s1LIZ18 = null;
        if ((i5 & 1) != 0) {
            str24 = null;
        }
        if ((i5 & 2) != 0) {
            num5 = null;
        }
        if ((i5 & 4) != 0) {
            str25 = null;
        }
        if ((i5 & 16) != 0) {
            obj2 = null;
        }
        if ((i5 & 32) != 0) {
            num4 = null;
        }
        if ((i5 & 128) != 0) {
            str27 = null;
        }
        if (function1 == null || (realApi = (EcSearchMixApi.RealApi) function1.invoke(EcSearchMixApi.RealApi.class)) == null) {
            EcSearchApi ecSearchApi = EcSearchApi.LIZ;
            realApi = (EcSearchMixApi.RealApi) ((InterfaceC2661011f) C452501pT.LIZIZ(new AwS95S1000000_10(str, 12)).getValue()).create(EcSearchMixApi.RealApi.class);
        }
        C23092093a.LIZ.getClass();
        int iLIZ = C23092093a.LIZ();
        C0CBW c0cbw = C0CBW.LIZ;
        boolean zLIZIZ = C0CBW.LIZIZ();
        C1850107Ml.LIZ.getClass();
        boolean zLIZ = C1850107Ml.LIZ();
        String strLIZ = C310750CGb.LIZ();
        if (realApi == null) {
            return null;
        }
        C08S1 c08s1LIZ19 = C08S2.LIZ(str2);
        C08S1 c08s1LIZ20 = C08S2.LIZ(str3);
        if (str19 != null) {
            c08s1LIZ = C08S2.LIZ(str19);
        } else {
            c08s1LIZ = null;
        }
        if (str20 != null) {
            c08s1LIZ2 = C08S2.LIZ(str20);
        } else {
            c08s1LIZ2 = null;
        }
        if (str21 != null) {
            c08s1LIZ3 = C08S2.LIZ(str21);
        } else {
            c08s1LIZ3 = null;
        }
        if (str4 != null) {
            c08s1LIZ4 = C08S2.LIZ(str4);
        } else {
            c08s1LIZ4 = null;
        }
        C08S1 c08s1LIZ21 = C08S2.LIZ(str7);
        C08S1 c08s1LIZ22 = C08S2.LIZ(str8);
        C08S1 c08s1LIZ23 = C08S2.LIZ(str5);
        if (str6 != null) {
            c08s1LIZ5 = C08S2.LIZ(str6);
        } else {
            c08s1LIZ5 = null;
        }
        if (str9 != null) {
            c08s1LIZ6 = C08S2.LIZ(str9);
        } else {
            c08s1LIZ6 = null;
        }
        if (str10 != null) {
            c08s1LIZ7 = C08S2.LIZ(str10);
        } else {
            c08s1LIZ7 = null;
        }
        if (str11 != null) {
            c08s1LIZ8 = C08S2.LIZ(str11);
        } else {
            c08s1LIZ8 = null;
        }
        if (str12 != null) {
            c08s1LIZ9 = C08S2.LIZ(str12);
        } else {
            c08s1LIZ9 = null;
        }
        if (str15 != null) {
            c08s1LIZ10 = C08S2.LIZ(str15);
        } else {
            c08s1LIZ10 = null;
        }
        if (str24 != null) {
            c08s1LIZ11 = C08S2.LIZ(str24);
        } else {
            c08s1LIZ11 = null;
        }
        if (str25 != null) {
            c08s1LIZ12 = C08S2.LIZ(str25);
        } else {
            c08s1LIZ12 = null;
        }
        if (str18 != null) {
            c08s1LIZ13 = C08S2.LIZ(str18);
        } else {
            c08s1LIZ13 = null;
        }
        if (str13 != null) {
            c08s1LIZ14 = C08S2.LIZ(str13);
        } else {
            c08s1LIZ14 = null;
        }
        if (str16 != null) {
            c08s1LIZ15 = C08S2.LIZ(str16);
        } else {
            c08s1LIZ15 = null;
        }
        if (str22 != null) {
            c08s1LIZ16 = C08S2.LIZ(str22);
        } else {
            c08s1LIZ16 = null;
        }
        if (str17 != null) {
            c08s1LIZ17 = C08S2.LIZ(str17);
        } else {
            c08s1LIZ17 = null;
        }
        if (strLIZ != null) {
            c08s1LIZ18 = C08S2.LIZ(strLIZ);
        }
        return realApi.searchPhotoMixListByChunkPost(str14, str27, typedByteArray, c08s1LIZ, c08s1LIZ2, c08s1LIZ3, c08s1LIZ19, Long.valueOf(j), c08s1LIZ20, c08s1LIZ4, Integer.valueOf(i), Integer.valueOf(i2), c08s1LIZ23, c08s1LIZ5, c08s1LIZ21, c08s1LIZ22, Integer.valueOf(i3), c08s1LIZ6, c08s1LIZ7, c08s1LIZ8, c08s1LIZ9, c08s1LIZ10, c08s1LIZ11, num5, c08s1LIZ12, list, l2, c08s1LIZ13, c08s1LIZ14, c08s1LIZ15, c08s1LIZ16, C08S2.LIZ(str23), Integer.valueOf(iLIZ), Integer.valueOf(zLIZIZ ? 1 : 0), Integer.valueOf(zLIZ ? 1 : 0), i4, l, c08s1LIZ17, num, c08s1LIZ18, num4, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    public static C15O7 LIZIZ(C674830QdV c674830QdV, final C674800QdS c674800QdS, String str, String str2, String str3, long j, String str4, String str5, int i, int i2, String str6, String str7, String str8, String str9, int i3, int i4, int i5, int i6, LinkedHashMap linkedHashMap, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Map map, List list, Long l, String str28, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str29, String str30, Integer num7, String str31, String str32, String str33, String str34, Map map2, int i7, Integer num8, String str35, Integer num9, String str36, int i8) {
        boolean z;
        ConcurrentHashMap<String, C674990Qdl> concurrentHashMap;
        C674990Qdl c674990Qdl;
        String str37 = str36;
        Integer num10 = num9;
        String str38 = str35;
        Integer num11 = num8;
        String str39 = str34;
        String str40 = str33;
        String str41 = str32;
        String str42 = str31;
        String str43 = str30;
        String str44 = str29;
        Integer num12 = num6;
        Integer num13 = num5;
        Integer num14 = num2;
        Map mapLJ = map2;
        Integer num15 = num4;
        Map mapLJ2 = map;
        Integer num16 = num;
        Integer num17 = num3;
        Integer num18 = num7;
        List list2 = list;
        if ((i8 & 32) != 0) {
            list2 = null;
        }
        if ((i8 & 256) != 0) {
            num16 = null;
        }
        if ((i8 & 512) != 0) {
            num14 = null;
        }
        if ((i8 & 1024) != 0) {
            num17 = null;
        }
        if ((i8 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num15 = null;
        }
        if ((i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num13 = null;
        }
        if ((i8 & 8192) != 0) {
            num12 = null;
        }
        if ((i8 & 16384) != 0) {
            str44 = null;
        }
        if ((32768 & i8) != 0) {
            str43 = null;
        }
        if ((65536 & i8) != 0) {
            num18 = null;
        }
        if ((131072 & i8) != 0) {
            str42 = null;
        }
        if ((524288 & i8) != 0) {
            str41 = null;
        }
        if ((1048576 & i8) != 0) {
            str40 = null;
        }
        if ((2097152 & i8) != 0) {
            str39 = null;
        }
        if ((4194304 & i8) != 0) {
            mapLJ = null;
        }
        if ((16777216 & i8) != 0) {
            num11 = null;
        }
        if ((33554432 & i8) != 0) {
            str38 = null;
        }
        if ((67108864 & i8) != 0) {
            num10 = null;
        }
        if ((134217728 & i8) != 0) {
            str37 = null;
        }
        if ((i8 & 268435456) != 0) {
            z = true;
        } else {
            z = false;
        }
        System.currentTimeMillis();
        Thread threadU3 = C786410Ut5.u3();
        threadU3.getName();
        threadU3.getId();
        EcSearchApi ecSearchApi = EcSearchApi.LIZ;
        EcSearchMixApi.RealApi realApi = (EcSearchMixApi.RealApi) ((InterfaceC2661011f) C452501pT.LIZIZ(new AwS95S1000000_10(str2, 12)).getValue()).create(EcSearchMixApi.RealApi.class);
        C23092093a.LIZ.getClass();
        int iLIZ = C23092093a.LIZ();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C259800zU c259800zU = new C259800zU();
        if (z && (c674990Qdl = (concurrentHashMap = C674810QdT.LIZIZ).get("/aweme/v1/search/stream/bff/ecom/")) != null) {
            C674790QdR.LIZ.getClass();
            if (System.currentTimeMillis() - c674990Qdl.LIZJ > C1208504o7.LIZ) {
                concurrentHashMap.remove("/aweme/v1/search/stream/bff/ecom/");
            } else {
                final String str45 = str37;
                c259800zU.element = C675070Qdt.LIZ("/aweme/v1/search/stream/bff/ecom/", new InterfaceC675210Qe7() { // from class: X.0QdZ
                    @Override // X.InterfaceC675210Qe7
                    public final void LIZ(String str46, boolean z2, boolean z3) {
                        if (!z3) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            String str47 = str45;
                            if (str47 == null) {
                                str47 = str46;
                            }
                            C674800QdS c674800QdS2 = c674800QdS;
                            long j2 = jCurrentTimeMillis;
                            try {
                                C674990Qdl c674990QdlLIZJ = C674810QdT.LIZJ("/aweme/v1/search/stream/bff/ecom/");
                                if (c674990QdlLIZJ != null) {
                                    Intrinsics.LJFF(c674990QdlLIZJ.LIZ, str47);
                                    Map mapLIZIZ = C674810QdT.LIZIZ(c674990QdlLIZJ.LIZIZ, c674800QdS2);
                                    long j3 = jCurrentTimeMillis2 - c674990QdlLIZJ.LIZJ;
                                    long j4 = jCurrentTimeMillis2 - j2;
                                    long j5 = j3 - j4;
                                    if (z2) {
                                        C674800QdS c674800QdS3 = c674990QdlLIZJ.LIZIZ;
                                        C674810QdT.LJI("/aweme/v1/search/stream/bff/ecom/", mapLIZIZ, j3, j4, j5, c674800QdS3.rootEnterFromType, c674800QdS3.enterFrom, c674800QdS3.searchSource, "goods_search");
                                    } else {
                                        C674800QdS c674800QdS4 = c674990QdlLIZJ.LIZIZ;
                                        C674810QdT.LJII("/aweme/v1/search/stream/bff/ecom/", mapLIZIZ, j3, j4, j5, c674800QdS4.rootEnterFromType, c674800QdS4.enterFrom, c674800QdS4.searchSource, "goods_search");
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            String str48 = c259800zU.element;
                            if (str48 != null) {
                                C675070Qdt.LIZ.remove(str48);
                            }
                        }
                    }
                });
            }
        }
        if (realApi != 0) {
            if (!C04WU.LIZ() || mapLJ2 == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            return realApi.searchDynamicShopMixListByChunkPost(str, str3, j, str4, str5, i, i2, str6, str7, str8, str9, i3, i4, i5, i6, linkedHashMap, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, mapLJ2, list2, l, str28, num16, num14, num17, num15, num13, num12, str44, str43, num18, str42, null, str41, str40, str39, mapLJ, Integer.valueOf(iLIZ), i7, num11, str38, num10, str37, null);
        }
        return null;
    }
}
