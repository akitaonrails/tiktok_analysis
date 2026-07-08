package X;

import android.webkit.MimeTypeMap;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ttnet.TTNetInit;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Locale;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0n2Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419410n2Z {
    public static final C1419410n2Z LIZ = new C1419410n2Z();
    public static final String LIZIZ = C1419410n2Z.class.getSimpleName();
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final InterfaceC1432570nNn LJ;

    static {
        C1499850p8J c1499850p8JCreateBuilder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(380));
        LIZLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(381));
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        LJ = (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(strLIZIZ)) == null) ? null : (InterfaceC1432570nNn) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC1432570nNn.class);
    }

    public static n LIZIZ(Throwable th) {
        String localizedMessage;
        n nVar = new n();
        nVar.LJJIIJ("exception_msg", th.getMessage());
        Throwable cause = th.getCause();
        if (cause == null || (localizedMessage = cause.getLocalizedMessage()) == null) {
            localizedMessage = "";
        }
        nVar.LJJIIJ("exception_cause_msg", localizedMessage);
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC346701Wf<? super X.C096H> r29, X.C23186096q r30, X.InterfaceC1419480n2g r31, X.InterfaceC1364105Vn<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419410n2Z.LJ(X.01Wf, X.096q, X.0n2g, X.05Vn):java.lang.Object");
    }

    public static C0X7A LIZ(String str, String str2, String str3, String str4, String str5) {
        int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
        C0X7B c0x7b = new C0X7B();
        c0x7b.LJ(C0X7A.LJFF);
        c0x7b.LIZ("rec_config", str2);
        c0x7b.LIZ("shoot_way", str3);
        c0x7b.LIZ("asset_rec_feed_features", str4);
        c0x7b.LIZ("effective_connection_type", String.valueOf(effectiveConnectionType));
        if (str5 != null && !a0.LJJJIL(str5)) {
            c0x7b.LIZ("extra", str5);
        }
        if (str.length() > 0) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists()) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase(Locale.getDefault()));
                if (mimeTypeFromExtension == null || mimeTypeFromExtension.length() <= 0) {
                    mimeTypeFromExtension = "application/zip";
                }
                c0x7b.LIZIZ("zipBinary", c0vsj.getName(), new C0XML(C0X0P.LIZJ(mimeTypeFromExtension), c0vsj));
            }
        }
        return c0x7b.LIZLLL();
    }

    public static void LIZJ(String str, NLEModel nLEModel, String str2, C23186096q c23186096q, String str3, NLEError nLEError) {
        Integer numValueOf = null;
        if ((nLEModel == null || nLEModel.getMainTrack() == null) && c23186096q != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZIZ);
            sbLIZ.append(" AUTO_CUT_NO_TRACK_CRASH: tag=");
            sbLIZ.append(str);
            sbLIZ.append(", isTemplateModel=");
            sbLIZ.append(a0.LJJIIZI(str2, "_templateModel", false));
            sbLIZ.append(", nleError=");
            if (nLEError != null) {
                numValueOf = Integer.valueOf(nLEError.swigValue());
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", extraParams=");
            sbLIZ.append(c23186096q.LJIILJJIL);
            sbLIZ.append(',');
            sbLIZ.append(str3);
            sbLIZ.append(",templateJSON=");
            sbLIZ.append(str2);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0170 A[Catch: Exception -> 0x017b, TryCatch #1 {Exception -> 0x017b, blocks: (B:99:0x0166, B:101:0x0170, B:102:0x0174), top: B:149:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0201 A[PHI: r1
      0x0201: PHI (r1v23 java.lang.String) = (r1v21 java.lang.String), (r1v27 java.lang.String) binds: [B:139:0x0222, B:131:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf A[PHI: r20
      0x00bf: PHI (r20v1 boolean) = (r20v0 boolean), (r20v3 boolean), (r20v3 boolean), (r20v3 boolean) binds: [B:44:0x00bb, B:12:0x0021, B:14:0x002b, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145 A[Catch: all -> 0x015a, TryCatch #4 {all -> 0x015a, blocks: (B:92:0x013d, B:94:0x0145, B:95:0x0154), top: B:155:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C23152095i LIZLLL(java.lang.String r26, java.lang.String r27, com.google.gson.n r28, X.C23186096q r29, X.InterfaceC1419480n2g r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419410n2Z.LIZLLL(java.lang.String, java.lang.String, com.google.gson.n, X.096q, X.0n2g, java.lang.String):X.095i");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d5 A[Catch: all -> 0x0312, TryCatch #2 {all -> 0x0312, blocks: (B:78:0x02cf, B:80:0x02d5, B:83:0x02db, B:89:0x02e7), top: B:181:0x02cf }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e7 A[Catch: all -> 0x0312, TRY_LEAVE, TryCatch #2 {all -> 0x0312, blocks: (B:78:0x02cf, B:80:0x02d5, B:83:0x02db, B:89:0x02e7), top: B:181:0x02cf }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0306  */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v8, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC346701Wf r70, X.C23187096r r71, long r72, java.lang.String r74, java.lang.String r75, int r76, boolean r77, boolean r78, java.lang.Long r79, X.InterfaceC1419480n2g r80, X.C1419390n2X r81, X.InterfaceC1364105Vn r82) {
        /*
            Method dump skipped, instruction units count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1419410n2Z.LJFF(X.01Wf, X.096r, long, java.lang.String, java.lang.String, int, boolean, boolean, java.lang.Long, X.0n2g, X.0n2X, X.05Vn):java.lang.Object");
    }
}
