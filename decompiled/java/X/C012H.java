package X;

import android.os.Looper;
import com.bytedance.android.livesdk.gift.model.GiftRecommendInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.012H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012H {
    public static C012H LJIIIIZZ;
    public static C012H LJIIIZ;
    public C012K LIZIZ;
    public boolean LIZJ;
    public RunnableC514501zT LIZLLL;
    public C012F LJ;
    public C012C LJFF;
    public Map<Long, C012D> LJI;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final C012L LJII = new C012L();

    public static String LIZJ(GiftRecommendInfo giftRecommendInfo) {
        String string;
        Text text = giftRecommendInfo.text;
        if (text != null && (string = C1133830fbx.LJIILIIL(text, text.defaultPattern).toString()) != null && !a0.LJJJIL(string)) {
            return string;
        }
        C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
        String str = giftRecommendInfo.starlingKey;
        c1124870fNVLIZJ.getClass();
        String strLIZIZ = C1124870fNV.LIZIZ(str);
        if (strLIZIZ == null) {
            return "";
        }
        return strLIZIZ;
    }

    public static final boolean LIZIZ(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, Set<Long> set, int i) {
        AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) C13LP.LJJJLZIJ(i, linkedList);
        if (abstractC1126600fQI == null) {
            return false;
        }
        if (abstractC1126600fQI.LJIJJ == null && !set.contains(Long.valueOf(abstractC1126600fQI.LJFF()))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x032a, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032e, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        r15 = r29.iterator();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010b, code lost:
    
        if (r15.hasNext() == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010d, code lost:
    
        r0 = r15.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0113, code lost:
    
        if (r0 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
    
        if (r0.LJI() != r1) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011d, code lost:
    
        if (r10 == (-1)) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.LinkedList<X.AbstractC1126600fQI<? extends X.AnonymousClass0054>> r28, java.util.LinkedList<X.AbstractC1126600fQI<? extends X.AnonymousClass0054>> r29, java.util.List<java.lang.Long> r30, java.util.List<java.lang.Long> r31, java.util.List<java.lang.Long> r32, java.util.List<java.lang.Long> r33, int r34, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.Long>, ? super java.util.List<java.lang.Integer>, kotlin.Unit> r35) {
        /*
            Method dump skipped, instruction units count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012H.LIZ(java.util.LinkedList, java.util.LinkedList, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.functions.Function2):void");
    }
}
