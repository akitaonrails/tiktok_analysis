package X;

import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.poi.detail.lynx.shelfinfo.TtlsPoiShelfDebugInfoSettings;
import com.ss.android.ugc.aweme.slash.data.Node;
import com.ss.android.ugc.aweme.slash.data.PageInfo;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186350gyf extends AbstractC1181640gr4 implements InterfaceC1181380gqe, InterfaceC1181500gqq {
    public boolean LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;

    @Override // X.InterfaceC1181500gqq
    public final void LIZ() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onAttach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDetach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onHiddenChanged(boolean z) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onPause() {
        this.LLILLJJLI = true;
    }

    @Override // X.InterfaceC1181500gqq
    public final void onResume() {
        this.LLILLJJLI = false;
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStart() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStop() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    public final Map<String, Object> LJJIFFI() {
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null) {
            return interfaceC1181010gq3.BO1();
        }
        return null;
    }

    public final boolean LJJIIJ() {
        return this.LLJIJIL == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0152 A[Catch: all -> 0x01a4, TRY_ENTER, TryCatch #1 {all -> 0x01a4, blocks: (B:43:0x008e, B:45:0x0094, B:49:0x009e, B:51:0x00a4, B:55:0x00ae, B:57:0x00b4, B:78:0x00ec, B:82:0x0101, B:85:0x0108, B:88:0x0110, B:91:0x011d, B:94:0x0123, B:97:0x0129, B:100:0x012f, B:108:0x015b, B:114:0x0175, B:111:0x016c, B:104:0x0152, B:75:0x00e0, B:77:0x00e8, B:72:0x00d4, B:74:0x00dc, B:69:0x00ca, B:71:0x00d0, B:37:0x007e, B:39:0x0084), top: B:121:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016c A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:43:0x008e, B:45:0x0094, B:49:0x009e, B:51:0x00a4, B:55:0x00ae, B:57:0x00b4, B:78:0x00ec, B:82:0x0101, B:85:0x0108, B:88:0x0110, B:91:0x011d, B:94:0x0123, B:97:0x0129, B:100:0x012f, B:108:0x015b, B:114:0x0175, B:111:0x016c, B:104:0x0152, B:75:0x00e0, B:77:0x00e8, B:72:0x00d4, B:74:0x00dc, B:69:0x00ca, B:71:0x00d0, B:37:0x007e, B:39:0x0084), top: B:121:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3 A[PHI: r3
      0x00c3: PHI (r3v11 java.lang.String) = (r3v2 java.lang.String), (r3v12 java.lang.String) binds: [B:73:0x00da, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7 A[PHI: r1 r3
      0x00c7: PHI (r1v10 java.lang.String) = (r1v6 java.lang.String), (r1v11 java.lang.String) binds: [B:76:0x00e6, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r3v10 java.lang.String) = (r3v3 java.lang.String), (r3v11 java.lang.String) binds: [B:76:0x00e6, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:43:0x008e, B:45:0x0094, B:49:0x009e, B:51:0x00a4, B:55:0x00ae, B:57:0x00b4, B:78:0x00ec, B:82:0x0101, B:85:0x0108, B:88:0x0110, B:91:0x011d, B:94:0x0123, B:97:0x0129, B:100:0x012f, B:108:0x015b, B:114:0x0175, B:111:0x016c, B:104:0x0152, B:75:0x00e0, B:77:0x00e8, B:72:0x00d4, B:74:0x00dc, B:69:0x00ca, B:71:0x00d0, B:37:0x007e, B:39:0x0084), top: B:121:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    @Override // X.InterfaceC1181500gqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1186350gyf.onCreate():void");
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
        String str2;
        String str3;
        Fragment fragmentS8;
        C1181930grX c1181930grXPu2;
        this.LLJIJIL++;
        if (!this.LLIZLLLIL && !this.LLJI) {
            C1186360gyg c1186360gyg = C1186360gyg.LIZ;
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
            if (interfaceC1181010gq3 != null && (c1181930grXPu2 = interfaceC1181010gq3.Pu2()) != null) {
                str2 = c1181930grXPu2.LIZJ;
            } else {
                str2 = null;
            }
            Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LLILZ);
            Integer numValueOf = Integer.valueOf(this.LLILLJJLI ? 1 : 0);
            if (LJJIIJ()) {
                str3 = "first";
            } else {
                str3 = "act";
            }
            Map<String, Object> mapLJJIFFI = LJJIFFI();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
            String str4 = this.LLJ;
            if (str4 == null) {
                str4 = "get log_id failed";
            }
            boolean z = this.LLIZLLLIL;
            int i = this.LLJILJIL;
            InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
            if (interfaceC1181010gq32 != null && (fragmentS8 = interfaceC1181010gq32.S8()) != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentS8, null);
            }
            c1186360gyg.getClass();
            C1186360gyg.LIZ(str2, null, lValueOf, 0L, numValueOf, str3, mapLJJIFFI, jCurrentTimeMillis, str4, "success", z, i, interfaceC665370Q7zLJFF);
        }
        this.LLILZLL = false;
        this.LLIZ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a0 A[Catch: all -> 0x01cb, TryCatch #0 {all -> 0x01cb, blocks: (B:31:0x0092, B:33:0x0098, B:37:0x00a2, B:39:0x00a8, B:43:0x00b2, B:45:0x00b8, B:66:0x00f0, B:70:0x0106, B:73:0x010e, B:75:0x011e, B:78:0x0126, B:81:0x013e, B:84:0x014c, B:87:0x0153, B:90:0x015a, B:93:0x0161, B:101:0x018e, B:107:0x01aa, B:104:0x01a0, B:97:0x0184, B:63:0x00e4, B:65:0x00ec, B:60:0x00d8, B:62:0x00e0, B:57:0x00ce, B:59:0x00d4, B:25:0x0080, B:27:0x0088), top: B:117:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7 A[PHI: r3
      0x00c7: PHI (r3v10 java.lang.String) = (r3v2 java.lang.String), (r3v11 java.lang.String) binds: [B:61:0x00de, B:51:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb A[PHI: r1 r3
      0x00cb: PHI (r1v7 java.lang.String) = (r1v3 java.lang.String), (r1v8 java.lang.String) binds: [B:64:0x00ea, B:54:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r3v9 java.lang.String) = (r3v3 java.lang.String), (r3v10 java.lang.String) binds: [B:64:0x00ea, B:54:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec A[Catch: all -> 0x01cb, TryCatch #0 {all -> 0x01cb, blocks: (B:31:0x0092, B:33:0x0098, B:37:0x00a2, B:39:0x00a8, B:43:0x00b2, B:45:0x00b8, B:66:0x00f0, B:70:0x0106, B:73:0x010e, B:75:0x011e, B:78:0x0126, B:81:0x013e, B:84:0x014c, B:87:0x0153, B:90:0x015a, B:93:0x0161, B:101:0x018e, B:107:0x01aa, B:104:0x01a0, B:97:0x0184, B:63:0x00e4, B:65:0x00ec, B:60:0x00d8, B:62:0x00e0, B:57:0x00ce, B:59:0x00d4, B:25:0x0080, B:27:0x0088), top: B:117:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0184 A[Catch: all -> 0x01cb, TRY_ENTER, TryCatch #0 {all -> 0x01cb, blocks: (B:31:0x0092, B:33:0x0098, B:37:0x00a2, B:39:0x00a8, B:43:0x00b2, B:45:0x00b8, B:66:0x00f0, B:70:0x0106, B:73:0x010e, B:75:0x011e, B:78:0x0126, B:81:0x013e, B:84:0x014c, B:87:0x0153, B:90:0x015a, B:93:0x0161, B:101:0x018e, B:107:0x01aa, B:104:0x01a0, B:97:0x0184, B:63:0x00e4, B:65:0x00ec, B:60:0x00d8, B:62:0x00e0, B:57:0x00ce, B:59:0x00d4, B:25:0x0080, B:27:0x0088), top: B:117:0x0080 }] */
    @Override // X.InterfaceC1181380gqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ag(com.ss.android.ugc.aweme.slash.data.SlashRequestParam r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1186350gyf.Ag(com.ss.android.ugc.aweme.slash.data.SlashRequestParam, java.lang.String):void");
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
        String str2;
        String imprId;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        Fragment fragmentS8;
        SlashPage slashPage;
        PageInfo pageInfo;
        LogPbBean logPbBean;
        C1181930grX c1181930grXPu2;
        SlashPage slashPage2;
        Map<String, Node> nodes;
        Set<String> setKeySet;
        String str3;
        String str4;
        String imprId2;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF2;
        Fragment fragmentS82;
        LogPbBean logPbBean2;
        C1181930grX c1181930grXPu22;
        LogPbBean logPbBean3;
        String imprId3;
        if (this.LLILZLL) {
            boolean z = true;
            int i = this.LLJILJIL + 1;
            this.LLJILJIL = i;
            if (i == 1) {
                this.LLILZIL = SystemClock.elapsedRealtime();
            }
            String str5 = "first";
            if (slashApiResponse != null && (slashPage2 = slashApiResponse.page) != null && (nodes = slashPage2.getNodes()) != null && (setKeySet = nodes.keySet()) != null) {
                for (String str6 : setKeySet) {
                    PageInfo pageInfo2 = slashApiResponse.page.getPageInfo();
                    if (pageInfo2 != null && (logPbBean3 = pageInfo2.logPb) != null && (imprId3 = logPbBean3.getImprId()) != null) {
                        this.LLJ = imprId3;
                    }
                    if (this.LLIZ && a0.LJJIIZI(str6, "product_shelf_lynx", false)) {
                        this.LLIZLLLIL = z;
                        TtlsPoiShelfDebugInfoSettings.INSTANCE.getEnable();
                        C1186360gyg c1186360gyg = C1186360gyg.LIZ;
                        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
                        if (interfaceC1181010gq3 != null && (c1181930grXPu22 = interfaceC1181010gq3.Pu2()) != null) {
                            str3 = c1181930grXPu22.LIZJ;
                        } else {
                            str3 = null;
                        }
                        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LLILZ);
                        Long lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - this.LLILZIL);
                        Integer numValueOf = Integer.valueOf(this.LLILLJJLI ? 1 : 0);
                        if (LJJIIJ()) {
                            str4 = "first";
                        } else {
                            str4 = "act";
                        }
                        Map<String, Object> mapLJJIFFI = LJJIFFI();
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
                        PageInfo pageInfo3 = slashApiResponse.page.getPageInfo();
                        if (pageInfo3 != null && (logPbBean2 = pageInfo3.logPb) != null) {
                            imprId2 = logPbBean2.getImprId();
                        } else {
                            imprId2 = null;
                        }
                        boolean z2 = this.LLIZLLLIL;
                        int i2 = this.LLJILJIL;
                        InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
                        if (interfaceC1181010gq32 != null && (fragmentS82 = interfaceC1181010gq32.S8()) != null) {
                            interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentS82, null);
                        } else {
                            interfaceC665370Q7zLJFF2 = null;
                        }
                        c1186360gyg.getClass();
                        C1186360gyg.LIZ(str3, str6, lValueOf, lValueOf2, numValueOf, str4, mapLJJIFFI, jCurrentTimeMillis, imprId2, "success", z2, i2, interfaceC665370Q7zLJFF2);
                        this.LLIZ = false;
                    }
                    z = true;
                }
            }
            if (!this.LLIZLLLIL) {
                C1186360gyg c1186360gyg2 = C1186360gyg.LIZ;
                InterfaceC1181010gq3 interfaceC1181010gq33 = this.LL;
                if (interfaceC1181010gq33 != null && (c1181930grXPu2 = interfaceC1181010gq33.Pu2()) != null) {
                    str2 = c1181930grXPu2.LIZJ;
                } else {
                    str2 = null;
                }
                Long lValueOf3 = Long.valueOf(SystemClock.elapsedRealtime() - this.LLILZ);
                Integer numValueOf2 = Integer.valueOf(this.LLILLJJLI ? 1 : 0);
                if (!LJJIIJ()) {
                    str5 = "act";
                }
                Map<String, Object> mapLJJIFFI2 = LJJIFFI();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLILLL;
                if (slashApiResponse != null && (slashPage = slashApiResponse.page) != null && (pageInfo = slashPage.getPageInfo()) != null && (logPbBean = pageInfo.logPb) != null) {
                    imprId = logPbBean.getImprId();
                } else {
                    imprId = null;
                }
                boolean z3 = this.LLIZLLLIL;
                int i3 = this.LLJILJIL;
                InterfaceC1181010gq3 interfaceC1181010gq34 = this.LL;
                if (interfaceC1181010gq34 != null && (fragmentS8 = interfaceC1181010gq34.S8()) != null) {
                    interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentS8, null);
                } else {
                    interfaceC665370Q7zLJFF = null;
                }
                c1186360gyg2.getClass();
                C1186360gyg.LIZ(str2, null, lValueOf3, 0L, numValueOf2, str5, mapLJJIFFI2, jCurrentTimeMillis2, imprId, "loading", z3, i3, interfaceC665370Q7zLJFF);
            }
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
        String str2;
        String str3;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        Fragment fragmentS8;
        C1181930grX c1181930grXPu2;
        this.LLJIJIL++;
        if (!this.LLIZLLLIL) {
            this.LLJI = true;
            C1186360gyg c1186360gyg = C1186360gyg.LIZ;
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
            if (interfaceC1181010gq3 != null && (c1181930grXPu2 = interfaceC1181010gq3.Pu2()) != null) {
                str2 = c1181930grXPu2.LIZJ;
            } else {
                str2 = null;
            }
            Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LLILZ);
            Integer numValueOf = Integer.valueOf(this.LLILLJJLI ? 1 : 0);
            if (LJJIIJ()) {
                str3 = "first";
            } else {
                str3 = "act";
            }
            Map<String, Object> mapLJJIFFI = LJJIFFI();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
            String str4 = this.LLJ;
            if (str4 == null) {
                str4 = "get log_id failed";
            }
            boolean z = this.LLIZLLLIL;
            int i = this.LLJILJIL;
            InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
            if (interfaceC1181010gq32 != null && (fragmentS8 = interfaceC1181010gq32.S8()) != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentS8, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            c1186360gyg.getClass();
            C1186360gyg.LIZ(str2, null, lValueOf, 0L, numValueOf, str3, mapLJJIFFI, jCurrentTimeMillis, str4, "error", z, i, interfaceC665370Q7zLJFF);
        }
        this.LLILZLL = false;
        this.LLIZ = false;
    }
}
