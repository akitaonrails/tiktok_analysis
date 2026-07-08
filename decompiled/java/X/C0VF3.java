package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VF3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VF3 {
    public static final Random LIZ = new Random();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C07NT());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C07NS());

    public static void LIZ(final String str, final double d, final long j, final JSONObject jSONObject, HashMap map, final long j2, final long j3) {
        final C736480Suk c736480Suk = new C736480Suk();
        if (map.size() > 0) {
            for (String str2 : map.keySet()) {
                c736480Suk.LIZ(str2, (String) map.get(str2));
            }
        }
        C0V19 c0v19LIZJ = C0V19.LIZJ();
        C786410Ut5.LJJZZIII(c0v19LIZJ.LIZLLL(), new Runnable() { // from class: X.0VV2
            public final void LIZ() {
                Iterator<String> itKeys;
                char c;
                String strJ4;
                int i;
                C736480Suk c736480Suk2 = c736480Suk;
                String str3 = str;
                long j4 = j;
                double d2 = d;
                JSONObject jSONObject2 = jSONObject;
                long j5 = j2;
                long j6 = j3;
                c736480Suk2.LIZ("ui_scene", str3);
                c736480Suk2.LIZ("duration", String.valueOf(j4));
                C1602860roS.LIZ.getClass();
                c736480Suk2.LIZ("is_first_launch_app", String.valueOf(C1602860roS.LJI()));
                String strValueOf = d2 > 60.0d ? "60" : String.valueOf(((double) ((int) (((double) 100) * d2))) / 100.0d);
                c736480Suk2.LIZ("ui_fps", strValueOf);
                if (jSONObject2 != null && (itKeys = jSONObject2.keys()) != null) {
                    float f = C0VXC.LIZ;
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        int i10 = CastIntegerProtector.parseInt(next);
                        int iOptInt = jSONObject2.optInt(next);
                        i9 += iOptInt;
                        if (iOptInt > 0) {
                            if (i4 < i10) {
                                i4 = i10;
                            }
                            if (i10 >= 3) {
                                i6 += (int) (iOptInt * i10 * f);
                            }
                            if (i10 >= ((Number) C1DS1.LJFF.getValue()).intValue()) {
                                i7 += (int) (iOptInt * i10 * f);
                            }
                            if (i10 != 0) {
                                if (i10 < 3) {
                                    i8 += iOptInt;
                                } else if (i10 < 7) {
                                    i5 += iOptInt;
                                } else if (i10 < 14) {
                                    i2 += iOptInt;
                                } else {
                                    i3 += iOptInt;
                                }
                            }
                            jSONObject2 = jSONObject2;
                        }
                    }
                    c736480Suk2.LIZ("block_duration", String.valueOf(i6));
                    c736480Suk2.LIZ("drop_max", String.valueOf(i4));
                    float f2 = 0 + i5 + i2 + i3;
                    c736480Suk2.LIZ("drop_x_count", String.valueOf(f2));
                    c736480Suk2.LIZ("level_1", String.valueOf(i8));
                    c736480Suk2.LIZ("level_2", String.valueOf(i5));
                    c736480Suk2.LIZ("level_3", String.valueOf(i2));
                    c736480Suk2.LIZ("level_4", String.valueOf(i3));
                    if (C798700VUu.LIZIZ(str3)) {
                        c736480Suk2.LIZ("dropXDetail", C798750VUz.LIZ(str3).LJ(f2).toString());
                    }
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "key_offline_admission", true, false) && (Intrinsics.LJFF(str3, "system_launch") || Intrinsics.LJFF(str3, "homepage_hot"))) {
                        C20182313y1 c20182313y1LIZJ = C20182613y4.LIZLLL().LIZJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str3);
                        sbLIZ.append("_fps");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        long j7 = (long) CastFloatProtector.parseFloat(strValueOf);
                        c = 0;
                        c20182313y1LIZJ.LJ(j7, j5, j6, strLIZIZ);
                        C20182313y1 c20182313y1LIZJ2 = C20182613y4.LIZLLL().LIZJ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str3);
                        sbLIZ2.append("_dropXCount");
                        c20182313y1LIZJ2.LJ((long) f2, j5, j6, C2188811AlT.LIZIZ(sbLIZ2));
                        C20182313y1 c20182313y1LIZJ3 = C20182613y4.LIZLLL().LIZJ();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str3);
                        sbLIZ3.append("_dropXCount[1,2]");
                        c20182313y1LIZJ3.LJ(i8, j5, j6, C2188811AlT.LIZIZ(sbLIZ3));
                        C20182313y1 c20182313y1LIZJ4 = C20182613y4.LIZLLL().LIZJ();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(str3);
                        sbLIZ4.append("_dropXCount[3,6]");
                        c20182313y1LIZJ4.LJ(i5, j5, j6, C2188811AlT.LIZIZ(sbLIZ4));
                        C20182313y1 c20182313y1LIZJ5 = C20182613y4.LIZLLL().LIZJ();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(str3);
                        sbLIZ5.append("_dropXCount[7,13]");
                        c20182313y1LIZJ5.LJ(i2, j5, j6, C2188811AlT.LIZIZ(sbLIZ5));
                        C20182313y1 c20182313y1LIZJ6 = C20182613y4.LIZLLL().LIZJ();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(str3);
                        sbLIZ6.append("_dropXCount[14,∞)");
                        c20182313y1LIZJ6.LJ(i3, j5, j6, C2188811AlT.LIZIZ(sbLIZ6));
                        C20182313y1 c20182313y1LIZJ7 = C20182613y4.LIZLLL().LIZJ();
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(str3);
                        sbLIZ7.append("_dropXCount_blockDuration");
                        c20182313y1LIZJ7.LJ(i6, j5, j6, C2188811AlT.LIZIZ(sbLIZ7));
                        C20182613y4.LIZLLL().LIZJ().LJII();
                    } else {
                        c = 0;
                    }
                    AbstractC804690VhT abstractC804690VhTLIZ = C804740VhY.LIZ(str3);
                    String strJ42 = "-1";
                    String str4 = "unknow";
                    if (abstractC804690VhTLIZ instanceof C804750VhZ) {
                        strJ4 = "-1";
                    } else {
                        C804730VhX[] c804730VhXArr = abstractC804690VhTLIZ.LIZ;
                        C804730VhX c804730VhX = null;
                        if (c804730VhXArr != null) {
                            int length = c804730VhXArr.length;
                            int i11 = abstractC804690VhTLIZ.LIZJ;
                            if (i11 < length) {
                                c804730VhX = c804730VhXArr[i11];
                            }
                        }
                        if (c804730VhX != null) {
                            str4 = c804730VhX.LIZ;
                            i = 1;
                            Object[] objArr = new Object[1];
                            objArr[c] = Float.valueOf(c804730VhX.LJI);
                            strJ4 = C786410Ut5.j4("%.3f", Arrays.copyOf(objArr, 1));
                        } else {
                            i = 1;
                            strJ4 = "-1";
                        }
                        C804730VhX c804730VhX2 = abstractC804690VhTLIZ.LIZIZ;
                        if (c804730VhX2 != null) {
                            Object[] objArr2 = new Object[i];
                            objArr2[c] = Float.valueOf(c804730VhX2.LJI);
                            strJ42 = C786410Ut5.j4("%.3f", Arrays.copyOf(objArr2, i));
                        }
                    }
                    if (((Boolean) C0BAM.LIZ.getValue()).booleanValue()) {
                        c736480Suk2.LIZ("do_frame_count", String.valueOf(i9));
                    }
                    c736480Suk2.LIZ("cpu_type", str4);
                    c736480Suk2.LIZ("cpu_use", strJ4);
                    c736480Suk2.LIZ("total_cpu_use", strJ42);
                    if (j4 > 0) {
                        c736480Suk2.LIZ("big_block_radio", String.valueOf(i7 / j4));
                    }
                }
                JSONObject jSONObjectLIZIZ = c736480Suk.LIZIZ();
                try {
                    jSONObjectLIZIZ.put("is_cold_start_first_launch", C1514430pVp.LIZLLL().booleanValue() ? 1 : 0);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C20684815ws.LJIJ("ui_sample_report", jSONObjectLIZIZ);
                String str5 = str;
                IMChatListApi.LJJIII.getClass();
                C890330YwJ.LIZ().LJIILIIL().LJIIJJI(str5, jSONObjectLIZIZ);
                String str6 = str;
                Iterator<C0VV5> it2 = C0VV4.LIZ.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().LIZ(str6, new JSONObject(C786410Ut5.J3(jSONObjectLIZIZ)));
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FpsTracerUtil@349b.reportFpsDropFrame$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FpsTracerUtil@349b.reportFpsDropFrame$1");
            }
        });
    }
}
