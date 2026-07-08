package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208281Bbm {
    public static int LJFF;
    public static long LJI;
    public static long LJII;
    public static int LJIIIIZZ;
    public static final C2208281Bbm LIZ = new C2208281Bbm();
    public static final Map<String, C2208291Bbn> LIZIZ = new LinkedHashMap();
    public static final Map<String, C2208301Bbo> LIZJ = new LinkedHashMap();
    public static final Map<String, C2208371Bbv> LIZLLL = new LinkedHashMap();
    public static final Map<String, Boolean> LJ = new LinkedHashMap();
    public static long LJIIIZ = -1;
    public static String LJIIJ = "";

    public static void LJIIJ(C2208301Bbo c2208301Bbo) {
        String str;
        long j;
        long j2;
        long j3;
        boolean z;
        int i;
        String str2;
        Long lLJIILIIL;
        if (c2208301Bbo != null && c2208301Bbo.LIZJ <= c2208301Bbo.LIZLLL && !c2208301Bbo.LJIILLIIL) {
            if (c2208301Bbo.LJIIIZ && c2208301Bbo.LJIIJJI == 1 && c2208301Bbo.LJIIJ == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("monitor.toJson: ");
            sbLIZ.append(c2208301Bbo.LIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            C20684815ws.LJIJ("comment_photo_loaded", c2208301Bbo.LIZ());
            long j4 = c2208301Bbo.LJ;
            long jLongValue = 0;
            if (j4 <= 0) {
                j4 = c2208301Bbo.LIZLLL;
            }
            C2208201Bbe c2208201Bbe = C2208201Bbe.LIZ;
            boolean z2 = c2208301Bbo.LJIIIIZZ;
            boolean z3 = c2208301Bbo.LJIIIZ;
            long j5 = c2208301Bbo.LIZJ;
            long j6 = c2208301Bbo.LJFF;
            int i2 = c2208301Bbo.LJIIJJI;
            Boolean bool = c2208301Bbo.LJIIJ;
            String str3 = c2208301Bbo.LJIIL;
            String str4 = c2208301Bbo.LJIILIIL;
            c2208201Bbe.getClass();
            if (z2) {
                if (z3) {
                    str = "inner_feed_slide";
                } else {
                    str = "list_cell";
                }
                if (j4 > j5) {
                    j = j4 - j5;
                } else {
                    j = 0;
                }
                if (z3 && j6 > j4 && j4 > 0) {
                    j2 = j6 - j4;
                } else {
                    j2 = 0;
                }
                if (j6 > j5) {
                    j3 = j6 - j5;
                } else {
                    j3 = j;
                }
                boolean z4 = true;
                if (i2 == 1) {
                    z4 = false;
                }
                if (z3 && Intrinsics.LJFF(bool, Boolean.FALSE)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z4 && !z) {
                    i = 1;
                    str2 = "none";
                } else {
                    i = -1;
                    if (z4) {
                        str2 = "still";
                    } else {
                        str2 = "motion";
                    }
                }
                String str5 = "";
                if (i == 1 || str4 == null) {
                    str4 = "";
                }
                if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                }
                if (i != 1) {
                    str5 = "CommentImageMonitorUtil";
                }
                C2208201Bbe.LJIILJJIL(new C2208251Bbj("consume_load", str, i, str2, str4, jLongValue, str5, j3, j, j2, 0L, 0L));
            }
            c2208301Bbo.LJIILLIIL = true;
        }
    }

    public static void LJIIZILJ(CommentImageModel commentImageModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRequestAuth: ");
        sbLIZ.append(commentImageModel);
        C2188811AlT.LIZIZ(sbLIZ);
        if (commentImageModel == null) {
            LJI = System.currentTimeMillis();
        } else {
            LJIIIIZZ(commentImageModel, null).LIZIZ = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2208291Bbn LJIIIIZZ(com.ss.android.ugc.aweme.comment.model.CommentImageModel r3, java.lang.String r4) {
        /*
            if (r4 == 0) goto L51
            X.1Bbm r0 = X.C2208281Bbm.LIZ
            r0.getClass()
            java.util.Map<java.lang.String, X.1Bbn> r0 = X.C2208281Bbm.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r4)
            X.1Bbn r2 = (X.C2208291Bbn) r2
            if (r2 == 0) goto L51
        L13:
            java.util.Map<java.lang.String, X.1Bbn> r0 = X.C2208281Bbm.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.getKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 != 0) goto L1f
            X.1Bbm r0 = X.C2208281Bbm.LIZ
            java.lang.Object r1 = r1.getKey()
            r0.getClass()
            java.util.Map<java.lang.String, X.1Bbn> r0 = X.C2208281Bbm.LIZIZ
            r0.remove(r1)
            r0.put(r4, r2)
            goto L1f
        L51:
            java.util.Map<java.lang.String, X.1Bbn> r0 = X.C2208281Bbm.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L5d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getValue()
            X.1Bbn r0 = (X.C2208291Bbn) r0
            com.ss.android.ugc.aweme.comment.model.CommentImageModel r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L5d
            java.lang.Object r2 = r1.getValue()
            X.1Bbn r2 = (X.C2208291Bbn) r2
            if (r2 == 0) goto L82
            if (r4 == 0) goto L8e
            goto L13
        L82:
            X.1Bbn r2 = new X.1Bbn
            r2.<init>(r3)
            if (r4 == 0) goto L8f
            java.util.Map<java.lang.String, X.1Bbn> r0 = X.C2208281Bbm.LIZIZ
            r0.put(r4, r2)
        L8e:
            return r2
        L8f:
            java.util.Map<java.lang.String, X.1Bbn> r1 = X.C2208281Bbm.LIZIZ
            int r0 = X.C2208281Bbm.LJFF
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.put(r0, r2)
            int r0 = X.C2208281Bbm.LJFF
            int r0 = r0 + 1
            X.C2208281Bbm.LJFF = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2208281Bbm.LJIIIIZZ(com.ss.android.ugc.aweme.comment.model.CommentImageModel, java.lang.String):X.1Bbn");
    }

    public static void LJIIIZ(int i, String str) {
        C2208301Bbo c2208301Bbo;
        if (i == -1 || (c2208301Bbo = (C2208301Bbo) ((LinkedHashMap) LIZJ).get(str)) == null) {
            return;
        }
        c2208301Bbo.LJIILL = i;
        LJIIJ(c2208301Bbo);
    }

    public static void LJIILL(String str, String str2) {
        Map<String, C2208371Bbv> map = LIZLLL;
        Object obj = ((LinkedHashMap) map).get(str);
        Map<String, Boolean> map2 = LJ;
        boolean zBooleanValue = false;
        if (map2.containsKey(str) && Intrinsics.LJFF(str2, "inner")) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            Boolean bool = (Boolean) ((LinkedHashMap) map2).get(str);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            c1350920lG6.getClass();
            C1350920lG6.LJLLLL(0L, str2, zBooleanValue);
            map2.remove(str);
            return;
        }
        if (obj == null) {
            C2208371Bbv c2208371Bbv = new C2208371Bbv(System.currentTimeMillis());
            c2208371Bbv.LIZIZ = false;
            map.put(str, c2208371Bbv);
        }
    }

    public static void LJIILLIIL(CommentImageModel commentImageModel, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPostComment fakeId ");
        sbLIZ.append(str);
        sbLIZ.append(" imageModel: ");
        sbLIZ.append(commentImageModel);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIIIZZ(commentImageModel, str).LJJIJ = System.currentTimeMillis();
    }

    public static void LJ(String str, String str2, boolean z) {
        Map<String, C2208371Bbv> map = LIZLLL;
        C2208371Bbv c2208371Bbv = (C2208371Bbv) ((LinkedHashMap) map).get(str);
        if (c2208371Bbv != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c2208371Bbv.LIZ;
            if (!c2208371Bbv.LIZIZ) {
                C1350920lG6.LIZ.getClass();
                C1350920lG6.LJLLLL(jCurrentTimeMillis, str2, z);
                c2208371Bbv.LIZIZ = true;
            }
            map.remove(str);
            return;
        }
        if (!Intrinsics.LJFF(str2, "inner")) {
            return;
        }
        LJ.put(str, Boolean.valueOf(z));
    }

    public static void LJIIL(CommentImageModel commentImageModel, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCompressImage: ");
        sbLIZ.append(commentImageModel);
        C2188811AlT.LIZIZ(sbLIZ);
        C2208291Bbn c2208291BbnLJIIIIZZ = LJIIIIZZ(commentImageModel, null);
        c2208291BbnLJIIIIZZ.LJII = z;
        c2208291BbnLJIIIIZZ.LJJI = str;
        c2208291BbnLJIIIIZZ.LJIIIZ = System.currentTimeMillis();
    }

    public static void LIZIZ(CommentImageModel commentImageModel, int i, Long l, String str) {
        long jLongValue;
        C2208291Bbn c2208291BbnLJIIIIZZ = LJIIIIZZ(commentImageModel, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endCompressLivePhoto ");
        sbLIZ.append(commentImageModel);
        C2188811AlT.LIZIZ(sbLIZ);
        c2208291BbnLJIIIIZZ.LJIIL = System.currentTimeMillis();
        c2208291BbnLJIIIIZZ.LJIILJJIL = i;
        if (i == -1) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            c2208291BbnLJIIIIZZ.LJIILL = jLongValue;
            if (str == null) {
                str = "";
            }
            c2208291BbnLJIIIIZZ.LJIILLIIL = str;
        }
    }

    public static void LJFF(int i, Long l, String str, String str2) {
        long jLongValue;
        Map<String, C2208291Bbn> map = LIZIZ;
        C2208291Bbn c2208291Bbn = (C2208291Bbn) ((LinkedHashMap) map).get(str);
        if (c2208291Bbn != null) {
            c2208291Bbn.LJJIJIIJI = System.currentTimeMillis();
            c2208291Bbn.LJJIJIIJIL = i;
        }
        int i2 = -1;
        if (i == -1 && c2208291Bbn != null) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            c2208291Bbn.LJJIJIL = jLongValue;
            if (str2 == null) {
                str2 = "";
            }
            c2208291Bbn.LJJIJL = str2;
        }
        if (c2208291Bbn != null) {
            if (c2208291Bbn.LJIILIIL != -1 && c2208291Bbn.LIZLLL != -1 && c2208291Bbn.LJJIII != -1 && c2208291Bbn.LJJIJIIJIL != -1) {
                i2 = 1;
            }
            c2208291Bbn.LJJIJLIJ = i2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endPostComment fakeId: ");
        sbLIZ.append(str);
        sbLIZ.append(" status: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c2208291Bbn != null && c2208291Bbn.LJIIIZ <= c2208291Bbn.LJIIJJI && c2208291Bbn.LIZIZ <= c2208291Bbn.LIZJ && c2208291Bbn.LJJIFFI <= c2208291Bbn.LJJII && c2208291Bbn.LJJIJ <= c2208291Bbn.LJJIJIIJI) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("monitor.toJson: ");
            sbLIZ2.append(c2208291Bbn.LIZ());
            C2188811AlT.LIZIZ(sbLIZ2);
            C20684815ws.LJIJ("comment_photo_duration", c2208291Bbn.LIZ());
        }
        map.remove(str);
    }

    public static void LIZJ(int i, int i2, String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endImageLoad ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C2208301Bbo c2208301Bbo = (C2208301Bbo) ((LinkedHashMap) LIZJ).get(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c2208301Bbo != null) {
            c2208301Bbo.LJ = jCurrentTimeMillis;
            c2208301Bbo.LIZLLL = jCurrentTimeMillis;
            c2208301Bbo.LJIIJJI = i;
        }
        if (i2 != -1 && c2208301Bbo != null) {
            c2208301Bbo.LJIILL = i2;
        }
        if (i == 0 && c2208301Bbo != null) {
            if (str2 == null) {
                str2 = "-1";
            }
            c2208301Bbo.LJIIL = str2;
            if (str3 == null) {
                str3 = "";
            }
            c2208301Bbo.LJIILIIL = str3;
            c2208301Bbo.LJIIJ = Boolean.FALSE;
        }
        LJIIJ(c2208301Bbo);
    }

    public static void LJIILIIL(String str, String str2, UrlModel urlModel, boolean z, boolean z2, boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startImageLoad ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, C2208301Bbo> map = LIZJ;
        C2208301Bbo c2208301Bbo = (C2208301Bbo) ((LinkedHashMap) map).get(str);
        if (c2208301Bbo == null) {
            c2208301Bbo = new C2208301Bbo(str2);
            c2208301Bbo.LJIILLIIL = false;
            map.put(str, c2208301Bbo);
        }
        c2208301Bbo.LIZJ = System.currentTimeMillis();
        c2208301Bbo.LJI = urlModel.getWidth();
        c2208301Bbo.LJII = urlModel.getHeight();
        c2208301Bbo.LJIIIIZZ = z;
        c2208301Bbo.LJIIIZ = z2;
        c2208301Bbo.LJIIJ = null;
        c2208301Bbo.LJIILJJIL = z3 ? 1 : 0;
    }

    public static void LJI(C2208281Bbm c2208281Bbm, CommentImageModel commentImageModel, int i, Long l, String str, String str2, int i2) {
        if ((i2 & 1) != 0) {
            commentImageModel = null;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        c2208281Bbm.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endRequestAuth: ");
        sbLIZ.append(commentImageModel);
        sbLIZ.append(" status: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        long jLongValue = -1;
        if (commentImageModel == null) {
            LJII = System.currentTimeMillis();
            LJIIIIZZ = i;
            if (i == -1) {
                if (l != null) {
                    jLongValue = l.longValue();
                }
                LJIIIZ = jLongValue;
                if (str == null) {
                    str = "";
                }
                LJIIJ = str;
                return;
            }
            return;
        }
        C2208291Bbn c2208291BbnLJIIIIZZ = LJIIIIZZ(commentImageModel, null);
        c2208291BbnLJIIIIZZ.LIZJ = System.currentTimeMillis();
        c2208291BbnLJIIIIZZ.LIZLLL = i;
        if (i != -1) {
            return;
        }
        if (l != null) {
            jLongValue = l.longValue();
        }
        c2208291BbnLJIIIIZZ.LJ = jLongValue;
        if (str == null) {
            str = "";
        }
        c2208291BbnLJIIIIZZ.LJFF = str;
        if (str2 == null) {
            str2 = "";
        }
        c2208291BbnLJIIIIZZ.LJI = str2;
    }

    public static void LJII(C2208281Bbm c2208281Bbm, CommentImageModel commentImageModel, int i, Long l, String str, boolean z, int i2) {
        long jLongValue;
        if ((i2 & 4) != 0) {
            l = null;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            z = true;
        }
        c2208281Bbm.getClass();
        C2208291Bbn c2208291BbnLJIIIIZZ = LJIIIIZZ(commentImageModel, null);
        if (z) {
            c2208291BbnLJIIIIZZ.LJJII = System.currentTimeMillis();
        }
        c2208291BbnLJIIIIZZ.LJJIII = i;
        if (i == -1) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            c2208291BbnLJIIIIZZ.LJJIIJ = jLongValue;
            if (str == null) {
                str = "";
            }
            c2208291BbnLJIIIIZZ.LJJIIJZLJL = str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endUploadImage: ");
        sbLIZ.append(commentImageModel);
        sbLIZ.append(" status: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIJJI(C2208281Bbm c2208281Bbm, CommentImageModel commentImageModel, int i, C2208311Bbp c2208311Bbp, Long l, String str, int i2) throws JSONException {
        long j;
        int i3;
        int i4;
        long j2;
        long j3;
        int i5;
        if ((i2 & 4) != 0) {
            c2208311Bbp = null;
        }
        if ((i2 & 8) != 0) {
            l = null;
        }
        if ((i2 & 16) != 0) {
            str = null;
        }
        c2208281Bbm.getClass();
        C2208291Bbn c2208291BbnLJIIIIZZ = LJIIIIZZ(commentImageModel, null);
        long jCurrentTimeMillis = c2208291BbnLJIIIIZZ.LJIIL;
        long jLongValue = 0;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j4 = c2208291BbnLJIIIIZZ.LJIIJ;
        if (j4 > 0) {
            j = jCurrentTimeMillis - j4;
        } else {
            j = 0;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        jSONObject.put("duration", j);
        int i6 = 0;
        if (c2208311Bbp != null) {
            i3 = c2208311Bbp.LIZIZ;
        } else {
            i3 = 0;
        }
        jSONObject.put("width", i3);
        if (c2208311Bbp != null) {
            i4 = c2208311Bbp.LIZJ;
        } else {
            i4 = 0;
        }
        jSONObject.put("height", i4);
        if (c2208311Bbp != null) {
            j2 = c2208311Bbp.LIZLLL;
        } else {
            j2 = 0;
        }
        jSONObject.put("bitrate", j2);
        if (c2208311Bbp != null) {
            j3 = c2208311Bbp.LJFF;
        } else {
            j3 = 0;
        }
        jSONObject.put("size", j3);
        if (c2208311Bbp != null && c2208311Bbp.LJI) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        jSONObject.put("is_audio_removed", i5);
        if (c2208311Bbp != null && c2208311Bbp.LJII) {
            i6 = 1;
        }
        jSONObject.put("is_compressed", i6);
        jSONObject.put("compression_profile", ((Number) C0BJZ.LIZ.getValue()).intValue());
        if (l != null) {
            jLongValue = l.longValue();
        }
        jSONObject.put("error_code", jLongValue);
        if (str == null) {
            str = "";
        }
        jSONObject.put("error_msg", str);
        C20684815ws.LJIJ("comment_live_photo_process", jSONObject);
    }

    public static void LIZ(C2208281Bbm c2208281Bbm, CommentImageModel commentImageModel, int i, int i2, int i3, long j, Long l, String str, int i4) {
        long jLongValue;
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        if ((i4 & 16) != 0) {
            j = 0;
        }
        if ((i4 & 32) != 0) {
            l = null;
        }
        if ((i4 & 64) != 0) {
            str = null;
        }
        c2208281Bbm.getClass();
        C2208291Bbn c2208291BbnLJIIIIZZ = LJIIIIZZ(commentImageModel, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endCompressImage ");
        sbLIZ.append(commentImageModel);
        C2188811AlT.LIZIZ(sbLIZ);
        c2208291BbnLJIIIIZZ.LJIIJJI = System.currentTimeMillis();
        c2208291BbnLJIIIIZZ.LJIIZILJ = i2;
        c2208291BbnLJIIIIZZ.LJIJ = i3;
        c2208291BbnLJIIIIZZ.LJIJI = j;
        c2208291BbnLJIIIIZZ.LJIJJ = String.valueOf(commentImageModel.getFormat());
        c2208291BbnLJIIIIZZ.LJIILIIL = i;
        if (i == -1) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            c2208291BbnLJIIIIZZ.LJIILL = jLongValue;
            if (str == null) {
                str = "";
            }
            c2208291BbnLJIIIIZZ.LJIILLIIL = str;
        }
    }
}
