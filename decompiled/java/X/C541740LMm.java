package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadListTaskOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0LMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541740LMm extends C0LSD<C09JG, CreationDownloadListTaskOutput> {
    public long LJIIJJI;
    public List<AIGCServerTaskOutput> LJIILIIL;
    public final String LJIIJ = C0LMI.DOWNLOAD.getType();
    public String LJIIL = "";
    public final C541820LMu LJIILJJIL = new C541820LMu();

    @Override // X.C0LTN
    public final String LJJ() {
        return C0LM5.AI_CREATION_DOWNLOAD_LIST.getTypeName();
    }

    @Override // X.C0LSD
    public final C0LUV LJJJJLL() {
        C541780LMq c541780LMq;
        ArrayList arrayList;
        String str;
        Integer numValueOf;
        Integer numValueOf2;
        Integer num;
        Integer numValueOf3;
        Integer num2;
        Integer num3;
        List listLLIIII;
        C541820LMu c541820LMu = this.LJIILJJIL;
        String str2 = null;
        if (c541820LMu.LJII) {
            int i = c541820LMu.LIZJ;
            int i2 = c541820LMu.LIZLLL;
            Integer numValueOf4 = Integer.valueOf(c541820LMu.LIZIZ);
            if (numValueOf4.intValue() <= 0) {
                numValueOf4 = null;
            }
            int i3 = c541820LMu.LJ;
            Integer num4 = c541820LMu.LIZ;
            Integer num5 = c541820LMu.LJFF;
            int i4 = c541820LMu.LIZLLL;
            if (i4 <= 0) {
                num5 = null;
            }
            String str3 = c541820LMu.LJI;
            if (i4 <= 0) {
                str3 = null;
            }
            c541780LMq = new C541780LMq(i, i2, numValueOf4, i3, num4, num5, str3);
        } else {
            c541780LMq = null;
        }
        Long lValueOf = Long.valueOf(this.LJIIJJI / ((long) 1024));
        String str4 = this.LJIIL;
        String strLJJLIL = a0.LJJLIL(str4, e3.d, str4);
        List<AIGCServerTaskOutput> list = this.LJIILIIL;
        if (list == null || (listLLIIII = C13LP.LLIIII(list)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AIGCServerTaskOutput) it2.next()).originalUrl);
            }
        }
        if (c541780LMq != null) {
            str = c541780LMq.LIZ;
            numValueOf = Integer.valueOf(c541780LMq.LIZIZ);
            numValueOf2 = Integer.valueOf(c541780LMq.LIZJ);
            num = c541780LMq.LIZLLL;
            numValueOf3 = Integer.valueOf(c541780LMq.LJ);
            num2 = c541780LMq.LJFF;
            num3 = c541780LMq.LJI;
            str2 = c541780LMq.LJII;
        } else {
            str = null;
            numValueOf = null;
            numValueOf2 = null;
            num = null;
            numValueOf3 = null;
            num2 = null;
            num3 = null;
        }
        return new C00FO(lValueOf, strLJJLIL, arrayList, str, numValueOf, numValueOf2, num, numValueOf3, num2, num3, str2);
    }

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x01bd, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Path cross not found for [B:134:0x030a, B:93:0x01af], limit reached: 222 */
    /* JADX WARN: Path cross not found for [B:59:0x0136, B:61:0x013c], limit reached: 222 */
    /* JADX WARN: Path cross not found for [B:61:0x013c, B:59:0x0136], limit reached: 222 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x033f A[PHI: r10
      0x033f: PHI (r10v8 int) = (r10v6 int), (r10v9 int) binds: [B:153:0x0366, B:147:0x033d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0363 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x037a A[PHI: r10
      0x037a: PHI (r10v15 int) = (r10v13 int), (r10v16 int) binds: [B:167:0x03a1, B:161:0x0378] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x039e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0464 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r54, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadListTaskOutput> r55) {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541740LMm.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c A[PHI: r6
      0x005c: PHI (r6v6 java.lang.String) = (r6v3 java.lang.String), (r6v8 java.lang.String) binds: [B:31:0x005a, B:29:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskInput r43, X.InterfaceC1364105Vn<? super kotlin.Unit> r44) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541740LMm.LJJJLIIL(com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:28|208|29|214|30|(2:32|193)|199|54|(0)|64|73|(0)|76|(0)(0)|79|(0)|102|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:23|(1:216)|24|(12:218|26|(18:28|208|29|214|30|(2:32|193)|199|54|(0)|64|73|(0)|76|(0)(0)|79|(0)|102|(0)(0))|72|73|(0)|76|(0)(0)|79|(0)|102|(0)(0))|212|37|204|38|201|39|(2:41|194)|197|63|64|73|(0)|76|(0)(0)|79|(0)|102|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:56|(1:210)|57|206|58) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010c, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0143, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0146, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0149, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c6, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:102:0x026d, B:81:0x021c], limit reached: 209 */
    /* JADX WARN: Path cross not found for [B:124:0x02a5, B:110:0x028b], limit reached: 209 */
    /* JADX WARN: Path cross not found for [B:127:0x02af, B:162:0x0379], limit reached: 209 */
    /* JADX WARN: Path cross not found for [B:130:0x02b5, B:143:0x02e8], limit reached: 209 */
    /* JADX WARN: Path cross not found for [B:135:0x02c3, B:143:0x02e8], limit reached: 209 */
    /* JADX WARN: Path cross not found for [B:143:0x02e8, B:130:0x02b5], limit reached: 209 */
    /* JADX WARN: Path cross not found for [B:162:0x0379, B:127:0x02af], limit reached: 209 */
    /* JADX WARN: Path cross not found for [B:218:0x00c9, B:212:0x0112], limit reached: 209 */
    /* JADX WARN: Path cross not found for [B:81:0x021c, B:102:0x026d], limit reached: 209 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0196 A[Catch: all -> 0x01d2, TRY_LEAVE, TryCatch #1 {all -> 0x01d2, blocks: (B:54:0x0192, B:56:0x0196), top: B:199:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022e  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.00cf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x034e -> B:13:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0371 -> B:13:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x03ca -> B:13:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLZIJ(java.lang.String r39, java.lang.String r40, java.lang.String r41, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r42, X.InterfaceC1364105Vn<? super X.C0LMR> r43) {
        /*
            Method dump skipped, instruction units count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541740LMm.LJJJLZIJ(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLL(int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r17, X.InterfaceC1364105Vn<? super X.C0LMR> r18) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541740LMm.LJJJLL(int, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
