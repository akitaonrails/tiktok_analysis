package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X6I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6I {
    public static final C0X6I LIZ = new C0X6I();

    public static String LIZIZ(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri.toString();
        }
        try {
            return uri.buildUpon().clearQuery().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return uri.toString();
        }
    }

    public static boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(String str) {
        if (!UriProtector.parse(str).isRelative() && !u.LJJIIJZLJL(str, e3.d, false) && !u.LJJIIJZLJL(str, "/", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0X6T] */
    public static C0X6K LIZ(C0X52 c0x52, InputStream inputStream, Map map) {
        String strLIZIZ;
        String string;
        String str;
        Charset charsetLIZ;
        final InputStream inputStream2 = inputStream;
        List<C080U> list = c0x52.LIZ.LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (C080U c080u : list) {
                if (linkedHashMap.get(c080u.LIZ) == null) {
                    linkedHashMap.put(c080u.LIZ, c080u.LIZIZ);
                } else {
                    String str2 = c080u.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) linkedHashMap.get(c080u.LIZ));
                    sbLIZ.append(" ,");
                    sbLIZ.append(c080u.LIZIZ);
                    linkedHashMap.put(str2, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        String str3 = (String) linkedHashMap.get("Content-Type");
        if (str3 == null && (str3 = (String) linkedHashMap.get("content-type")) == null) {
            str3 = "text/html; charset=UTF-8";
        }
        C0X0P c0x0pLIZJ = C0X0P.LIZJ(str3);
        if (c0x0pLIZJ == null) {
            strLIZIZ = "text/html";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0x0pLIZJ.LIZIZ);
            sbLIZ2.append('/');
            sbLIZ2.append(c0x0pLIZJ.LIZJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (c0x0pLIZJ == null || (charsetLIZ = c0x0pLIZJ.LIZ(null)) == null || (string = charsetLIZ.toString()) == null) {
            string = "utf-8";
        }
        C2175508fh c2175508fh = c0x52.LIZ;
        int i = c2175508fh.LIZIZ;
        if (TextUtils.isEmpty(c2175508fh.LIZJ)) {
            str = "OK";
        } else {
            str = c0x52.LIZ.LIZJ;
        }
        String str4 = (String) map.get("range");
        if (str4 != null || (str4 = (String) map.get("Range")) != null) {
            try {
                final int i2 = CastIntegerProtector.parseInt((String) a0.LJJLIIIJILLIZJL(a0.LJLIIIL(str4).toString().substring(6), new String[]{"-"}, 0, 6).get(0));
                if (i2 != 0 && inputStream2 != null) {
                    final ?? r1 = new InputStream(i2) { // from class: X.0X6T
                        public int LL;
                        public int LLILLJJLI;
                        public final int LLILLL;

                        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                        }

                        @Override // java.io.InputStream
                        public final boolean markSupported() {
                            return true;
                        }

                        @Override // java.io.InputStream
                        public final int available() {
                            return this.LLILLL - this.LL;
                        }

                        @Override // java.io.InputStream
                        public final int read() {
                            int i3 = this.LL;
                            if (i3 >= this.LLILLL) {
                                return -1;
                            }
                            this.LL = i3 + 1;
                            return 0;
                        }

                        @Override // java.io.InputStream
                        public final void reset() {
                            this.LL = this.LLILLJJLI;
                        }

                        {
                            this.LLILLL = i2;
                        }

                        @Override // java.io.InputStream
                        public final void mark(int i3) {
                            this.LLILLJJLI = this.LL;
                        }

                        @Override // java.io.InputStream
                        public final int read(byte[] bArr) {
                            int length;
                            if (bArr != null) {
                                length = bArr.length;
                            } else {
                                length = 0;
                            }
                            return read(bArr, 0, length);
                        }

                        @Override // java.io.InputStream
                        public final long skip(long j) {
                            int i3 = this.LLILLL;
                            int i4 = this.LL;
                            long j2 = i3 - i4;
                            if (j < j2) {
                                if (j < 0) {
                                    j = 0;
                                }
                                j2 = j;
                            }
                            this.LL = i4 + ((int) j2);
                            return j2;
                        }

                        @Override // java.io.InputStream
                        public final int read(byte[] bArr, int i3, int i4) {
                            if (bArr != null) {
                                if (i3 >= 0 && i4 >= 0 && i4 <= bArr.length - i3) {
                                    int i5 = this.LL;
                                    int i6 = this.LLILLL;
                                    if (i5 >= i6) {
                                        return -1;
                                    }
                                    int i7 = i6 - i5;
                                    if (i4 > i7) {
                                        i4 = i7;
                                    }
                                    if (i4 <= 0) {
                                        return 0;
                                    }
                                    Arrays.fill(bArr, i3, i3 + i4, (byte) 0);
                                    this.LL += i4;
                                    return i4;
                                }
                                throw new IndexOutOfBoundsException();
                            }
                            throw null;
                        }
                    };
                    inputStream2 = new SequenceInputStream(inputStream2, r1) { // from class: X.0X6R
                        @Override // java.io.SequenceInputStream, java.io.InputStream
                        public final int available() {
                            return 0;
                        }
                    };
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new C0X6K(strLIZIZ, string, i, str, linkedHashMap, inputStream2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0311, code lost:
    
        if (r6.equals("PATCH") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0319, code lost:
    
        if (r6.equals("POST") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x032f, code lost:
    
        if (r6.equals("PUT") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0333, code lost:
    
        r2 = (com.ss.android.ugc.tiktok.security.IClientSecurityService) com.ss.android.ugc.aweme.framework.services.ServiceManager.get().getService(com.ss.android.ugc.tiktok.security.IClientSecurityService.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x033f, code lost:
    
        if (r2 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x034b, code lost:
    
        if (r2.LJIIIIZZ(new X.C822530WOl(1, r6, r9, r35)) != true) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x034d, code lost:
    
        r11.LJIJI = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0351, code lost:
    
        if (r36 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0353, code lost:
    
        if (r38 != r10) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0355, code lost:
    
        r22 = X.C0X6H.DATA_STR_NULL_ERROR;
        r3.LIZ((android.webkit.WebView) r26.get(), r22, "dataStr == null");
        r2 = null;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0374, code lost:
    
        if (kotlin.text.a0.LJJIIZI(r23, "multipart/form-data", false) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x037a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r6, "POST") == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x037c, code lost:
    
        r18 = new java.util.LinkedHashMap();
        r7 = new X.C0X76[0];
        r17 = new org.json.JSONArray(r36);
        r16 = X.C13LZ.LJIILJJIL(0, r17.length()).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x039a, code lost:
    
        if (r16.LLILLL == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x039c, code lost:
    
        r8 = r16.nextInt();
        r10 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getJSONObject(r17, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03b8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r10.optString("type"), "[object Blob]") == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03ba, code lost:
    
        r15 = r10.optString("value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03c2, code lost:
    
        r14 = android.util.Base64.decode(r15.substring(kotlin.text.a0.LJJJ(r15, "base64,", 0, false, 6) + 7), 0);
        X.C189200o6.m2constructorimpl(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03d9, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r14 = new X.C098200Yq(r0);
        X.C189200o6.m2constructorimpl(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042f, code lost:
    
        r18.put(r10.optString("name"), X.AbstractC842530X3j.LIZJ(null, r10.optString("value")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0443, code lost:
    
        r2 = null;
        r1 = new java.util.ArrayList();
        r12 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0451, code lost:
    
        if (r12.hasNext() == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0453, code lost:
    
        r10 = r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x046a, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.LJFF(((X.C080U) r10).LIZ.toLowerCase(java.util.Locale.ROOT), "content-type")) == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x046c, code lost:
    
        r1.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0470, code lost:
    
        r13 = r13.uploadFiles(r9, r1, r18, r11, (X.C0X76[]) java.util.Arrays.copyOf(r7, r7.length));
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0484, code lost:
    
        r2 = null;
        r22 = X.C0X6H.FORM_DATA_METHOD_ERROR;
        r7 = (android.webkit.WebView) r26.get();
        r0 = X.C2188811AlT.LIZ();
        r0.append("ttnetRequest unexpect method: ");
        r0.append(r6);
        r3.LIZ(r7, r22, X.C2188811AlT.LIZIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04a2, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04a7, code lost:
    
        if (r23.length() != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04a9, code lost:
    
        r1 = new org.json.JSONObject(r36);
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04b2, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r14);
        r1 = new X.C098200Yq(r14);
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0788 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0731 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x056d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0300  */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131, types: [T] */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v142, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v145, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v163, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v240 */
    /* JADX WARN: Type inference failed for: r0v241 */
    /* JADX WARN: Type inference failed for: r0v242 */
    /* JADX WARN: Type inference failed for: r0v243 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13, types: [X.0X9S] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v73, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r34v0, types: [T, android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18, types: [T, X.0X6J] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r9v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0X6K LJ(final android.webkit.WebView r31, final boolean r32, final java.lang.String r33, final android.net.Uri r34, java.util.Map r35, java.lang.String r36, boolean r37, X.C0X5T r38) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X6I.LJ(android.webkit.WebView, boolean, java.lang.String, android.net.Uri, java.util.Map, java.lang.String, boolean, X.0X5T):X.0X6K");
    }
}
