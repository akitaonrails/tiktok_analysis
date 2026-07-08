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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0X6A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6A {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(String str) {
        Boolean boolValueOf;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        try {
            Uri uri = UriProtector.parse(str);
            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ttnet_cache")) != null) {
                boolValueOf = Boolean.valueOf(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.equals("1"));
            } else {
                boolValueOf = null;
            }
            return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0X6S] */
    public static C0X68 LIZ(C0X52 c0x52, InputStream inputStream, Map map) {
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
                    final ?? r1 = new InputStream(i2) { // from class: X.0X6S
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
                    inputStream2 = new SequenceInputStream(inputStream2, r1) { // from class: X.0X6Q
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
        return new C0X68(strLIZIZ, string, inputStream2, i, str, linkedHashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x073d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034f  */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0X68 LIZJ(android.webkit.WebView r38, final boolean r39, final java.lang.String r40, android.net.Uri r41, java.util.Map r42, java.lang.String r43, final X.C0X70 r44, boolean r45, X.C0X61 r46) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X6A.LIZJ(android.webkit.WebView, boolean, java.lang.String, android.net.Uri, java.util.Map, java.lang.String, X.0X70, boolean, X.0X61):X.0X68");
    }
}
