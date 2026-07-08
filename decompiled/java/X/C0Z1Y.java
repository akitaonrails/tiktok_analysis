package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import com.tiktok.clientai.android.bitmap.ColorSeq;
import com.tiktok.clientai.android.bitmap.NormalizationType;
import com.tiktok.clientai.android.bitmap.OutputFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Z1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@InterfaceC1294060jmO
public final class C0Z1Y implements InterfaceC892650Z0d {
    public final TarsConfig.Processor LIZ;
    public final String LIZIZ = "vit_image_processor";
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1391));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1397));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1389));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1387));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1388));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1386));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1398));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1400));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1399));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1393));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1392));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1394));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1395));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1396));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1390));

    @Override // X.InterfaceC892650Z0d
    public final void LIZIZ(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3) {
    }

    public C0Z1Y(TarsConfig.Processor processor) {
        this.LIZ = processor;
    }

    public static C443120HZe LIZLLL(String str) {
        float fFloatValue;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        if (listLJJLIIIJILLIZJL == null) {
            return null;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        for (Object obj : listLJJLIIIJILLIZJL) {
            int i2 = i + 1;
            if (i >= 0) {
                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(u.LJJIFFI(a0.LJLIIIL((String) obj).toString(), "f", "", false));
                if (fLJIIIIZZ != null) {
                    fFloatValue = fLJIIIIZZ.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            f3 = fFloatValue;
                        }
                    } else {
                        f2 = fFloatValue;
                    }
                } else {
                    f = fFloatValue;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new C443120HZe(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
    }

    @Override // X.InterfaceC892650Z0d
    public final Unit LIZ(C0Z09 c0z09) {
        c0z09.onSuccess(null);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r12v10, types: [float[]] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [float[]] */
    /* JADX WARN: Type inference failed for: r12v8 */
    @Override // X.InterfaceC892650Z0d
    public final void LIZJ(Map<String, Object> map) throws C892820Z0u {
        ?? first;
        Pair pair;
        List<String> listLJJLIIIJILLIZJL;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get("img");
        if ((obj instanceof Bitmap) && (first = (Bitmap) obj) != 0) {
            if (((Boolean) this.LJII.getValue()).booleanValue()) {
                int width = first.getWidth();
                int height = first.getHeight();
                int iIntValue = ((Number) this.LJFF.getValue()).intValue();
                int iIntValue2 = ((Number) this.LJI.getValue()).intValue();
                C531650Kt9 it2 = C13LZ.LJIIIZ(width, 0).iterator();
                while (it2.LLILLL) {
                    int iNextInt = it2.nextInt();
                    if (iNextInt % iIntValue2 == 0 && iNextInt <= iIntValue) {
                        C531650Kt9 it3 = C13LZ.LJIIIZ(height, 0).iterator();
                        while (it3.LLILLL) {
                            int iNextInt2 = it3.nextInt();
                            if (iNextInt2 % iIntValue2 == 0 && iNextInt2 <= iIntValue) {
                                pair = new Pair(Integer.valueOf(iNextInt), Integer.valueOf(iNextInt2));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            pair = new Pair(Integer.valueOf(((Number) this.LJIIIZ.getValue()).intValue()), Integer.valueOf(((Number) this.LJIIJ.getValue()).intValue()));
            if (((Boolean) this.LJIIIIZZ.getValue()).booleanValue()) {
                linkedHashMap.put("reshape_width", pair.getFirst());
                linkedHashMap.put("reshape_height", pair.getSecond());
            }
            String str = this.LIZ.config.get("process");
            float fFloatValue = 0.0f;
            if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"|"}, 0, 6)) != null) {
                for (String str2 : listLJJLIIIJILLIZJL) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != 3026845) {
                        if (iHashCode != 236609293) {
                            if (iHashCode == 1097148750 && str2.equals("reshape")) {
                                if ((first instanceof Bitmap) && (bitmap = (Bitmap) first) != null) {
                                    long jUptimeMillis = SystemClock.uptimeMillis();
                                    Pair pairLIZJ = C892900Z1c.LIZJ(bitmap, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), ((Number) this.LIZLLL.getValue()).intValue(), ((Boolean) this.LJ.getValue()).booleanValue(), ((Boolean) this.LIZJ.getValue()).booleanValue());
                                    first = pairLIZJ.getFirst();
                                    fFloatValue = ((Number) pairLIZJ.getSecond()).floatValue();
                                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Tars-");
                                    sbLIZ.append(this.LIZIZ);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("reshape cost time ");
                                    sbLIZ2.append(jUptimeMillis2);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("processor ");
                                    sbLIZ3.append(this.LIZIZ);
                                    sbLIZ3.append(" , step data error in reshape ");
                                    throw new C892820Z0u(C2188811AlT.LIZIZ(sbLIZ3), "runtime");
                                }
                            }
                        } else if (!str2.equals("normalize")) {
                            continue;
                        } else if ((first instanceof Bitmap) && (bitmap2 = (Bitmap) first) != null) {
                            Object value = this.LJIILJJIL.getValue();
                            NormalizationType normalizationType = NormalizationType.SIMPLE;
                            if (!Intrinsics.LJFF(value, normalizationType.getValue())) {
                                normalizationType = NormalizationType.IMAGENET;
                                if (!Intrinsics.LJFF(value, normalizationType.getValue())) {
                                    normalizationType = NormalizationType.NONE;
                                }
                            }
                            Object value2 = this.LJIILL.getValue();
                            OutputFormat outputFormat = OutputFormat.HWC;
                            if (!Intrinsics.LJFF(value2, outputFormat.getValue())) {
                                outputFormat = OutputFormat.CHW;
                            }
                            Object value3 = this.LJIILLIIL.getValue();
                            ColorSeq colorSeq = ColorSeq.RGB;
                            if (!Intrinsics.LJFF(value3, colorSeq.getValue())) {
                                colorSeq = ColorSeq.BGR;
                            }
                            first = C892900Z1c.LIZIZ(bitmap2, normalizationType, ((Number) this.LJIIJJI.getValue()).floatValue(), (C443120HZe) this.LJIIL.getValue(), (C443120HZe) this.LJIILIIL.getValue(), outputFormat, colorSeq);
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("processor ");
                            sbLIZ4.append(this.LIZIZ);
                            sbLIZ4.append(" , step data error ");
                            throw new C892820Z0u(C2188811AlT.LIZIZ(sbLIZ4), "runtime");
                        }
                    } else if (!str2.equals("blob")) {
                        continue;
                    } else if ((first instanceof Bitmap) && (bitmap3 = (Bitmap) first) != null) {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        first = C892900Z1c.LIZ(((Number) this.LJIIIZ.getValue()).intValue(), ((Number) this.LJIIJ.getValue()).intValue(), bitmap3);
                        long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis3;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Tars-");
                        sbLIZ5.append(this.LIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("blob cost time ");
                        sbLIZ6.append(jUptimeMillis4);
                        C2188811AlT.LIZIZ(sbLIZ6);
                    } else {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("processor ");
                        sbLIZ7.append(this.LIZIZ);
                        sbLIZ7.append(" , step data error ");
                        throw new C892820Z0u(C2188811AlT.LIZIZ(sbLIZ7), "runtime");
                    }
                }
                if (first == 0) {
                    return;
                }
            }
            linkedHashMap.put("image_array", first);
            linkedHashMap.put("scale_ratio", Float.valueOf(fFloatValue));
            return;
        }
        throw new C892820Z0u("img is null in ViTImageProcessor", "runtime");
    }
}
