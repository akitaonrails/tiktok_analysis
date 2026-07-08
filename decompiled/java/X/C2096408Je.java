package X;

import android.util.SparseArray;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2096408Je {
    public static final HashMap<String, float[]> LIZ;
    public static final SparseArray<float[]> LIZIZ;
    public static final Pattern LIZJ;
    public static final C01GW LIZLLL;

    static {
        HashMap<String, float[]> map = new HashMap<>();
        LIZ = map;
        SparseArray<float[]> sparseArray = new SparseArray<>();
        LIZIZ = sparseArray;
        LIZJ = PatternProtector.compile("\\d+$");
        LIZLLL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(0));
        map.put("mali-g72", new float[]{850.0f, 850.0f, 27.2f});
        map.put("mali-g71", new float[]{850.0f, 850.0f, 27.2f});
        map.put("mali-t880", new float[]{850.0f, 850.0f, 13.6f});
        map.put("mali-t860", new float[]{650.0f, 650.0f, 10.4f});
        map.put("mali-t760", new float[]{650.0f, 650.0f, 10.4f});
        map.put("mali-g51", new float[]{650.0f, 650.0f, 3.9f});
        map.put("mali-t830", new float[]{650.0f, 650.0f, 2.6f});
        map.put("mali-t820", new float[]{650.0f, 650.0f, 2.6f});
        map.put("mali-t720", new float[]{650.0f, 650.0f, 5.2f});
        map.put("mali-t470", new float[]{250.0f, 650.0f, 0.65f});
        map.put("mali-t450", new float[]{270.0f, 650.0f, 5.2f});
        map.put("mali-t400", new float[]{210.0f, 500.0f, 2.0f});
        map.put("mali-400 mp", new float[]{210.0f, 500.0f, 2.0f});
        map.put("mali-450 mp", new float[]{210.0f, 500.0f, 2.6f});
        sparseArray.put(200, new float[]{200.0f, 245.0f, 8.0f});
        sparseArray.put(203, new float[]{245.0f, 294.0f, 16.0f});
        sparseArray.put(205, new float[]{225.0f, 245.0f, 16.0f});
        sparseArray.put(220, new float[]{266.0f, 266.0f, 32.0f});
        sparseArray.put(225, new float[]{400.0f, 400.0f, 32.0f});
        sparseArray.put(302, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(304, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(305, new float[]{400.0f, 450.0f, 24.0f});
        sparseArray.put(306, new float[]{400.0f, 400.0f, 24.0f});
        sparseArray.put(308, new float[]{500.0f, 500.0f, 24.0f});
        sparseArray.put(320, new float[]{450.0f, 450.0f, 96.0f});
        sparseArray.put(330, new float[]{578.0f, 578.0f, 128.0f});
        sparseArray.put(405, new float[]{550.0f, 550.0f, 48.0f});
        sparseArray.put(418, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(420, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(430, new float[]{500.0f, 650.0f, 192.0f});
        sparseArray.put(505, new float[]{450.0f, 450.0f, 48.0f});
        sparseArray.put(506, new float[]{650.0f, 650.0f, 96.0f});
        sparseArray.put(508, new float[]{850.0f, 850.0f, 96.0f});
        sparseArray.put(510, new float[]{600.0f, 600.0f, 128.0f});
        sparseArray.put(512, new float[]{600.0f, 850.0f, 128.0f});
        sparseArray.put(530, new float[]{650.0f, 650.0f, 256.0f});
        sparseArray.put(540, new float[]{710.0f, 710.0f, 256.0f});
    }

    public static int LIZ(String str) {
        Matcher matcher = LIZJ.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(0);
            if (strGroup.length() > 0) {
                return CastIntegerProtector.parseInt(strGroup);
            }
            return -1;
        }
        return -1;
    }

    public static double LIZIZ(String str) {
        float[] fArr;
        if (str.length() > 0) {
            Locale locale = Locale.ROOT;
            if (u.LJJIIJZLJL(str.toLowerCase(locale), "mali", false)) {
                fArr = LIZ.get(str);
            } else if (a0.LJJIIZI(str.toLowerCase(locale), "adreno", false)) {
                fArr = LIZIZ.get(LIZ(str));
            } else {
                return -1.0d;
            }
            if (fArr != null) {
                return fArr[2];
            }
            return -1.0d;
        }
        return -1.0d;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:71:0x00f8
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static int LIZJ(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2096408Je.LIZJ(java.lang.String, java.lang.String):int");
    }
}
