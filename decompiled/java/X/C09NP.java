package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.09NP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09NP {
    public static final String LIZ(Bitmap bitmap) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(bitmap.hashCode());
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".jpg");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #10 {all -> 0x009e, blocks: (B:13:0x0053, B:40:0x0095, B:42:0x009a, B:29:0x006e, B:30:0x0082, B:24:0x0066, B:25:0x0069), top: B:84:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.content.Context r11, android.graphics.Bitmap r12, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super android.net.Uri, kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09NP.LIZIZ(android.content.Context, android.graphics.Bitmap, kotlin.jvm.functions.Function2):void");
    }

    public static final String LIZLLL(Context context, Bitmap bitmap, String str) throws Throwable {
        try {
            File fileW2 = C786410Ut5.w2(context);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tako_");
            sbLIZ.append(str);
            C0VSJ c0vsj = new C0VSJ(fileW2, C2188811AlT.LIZIZ(sbLIZ));
            C0VSV c0vsv = new C0VSV(c0vsj);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, c0vsv);
                C2107108Nh.LIZ(c0vsv, null);
                return c0vsj.getAbsolutePath();
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(c0vsv, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(2:4|(1:6)(1:11))(0)|7|(1:(3:10|141|56)(2:12|13))(2:14|(3:(1:17)|18|19)(2:20|(3:(1:23)|24|25)(9:26|(1:28)|29|145|30|125|31|32|(3:(1:115)|116|117)(12:(3:143|53|(1:55))|62|(1:64)|65|120|66|(8:68|(6:136|70|118|71|72|73)|(1:95)|132|96|(1:100)|101|102)|121|107|(1:111)|112|113))))|57|62|(0)|65|120|66|(0)|121|107|(0)|112|113|(3:(0)|(1:129)|(1:131))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cc, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0 = (android.net.Uri) r6.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d3, code lost:
    
        if (r0 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d5, code lost:
    
        X.C2286608xc.LJ(r5.delete(r0, null, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e8, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e9, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r1));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a A[Catch: Exception -> 0x01cb, TryCatch #1 {Exception -> 0x01cb, blocks: (B:66:0x013b, B:68:0x014a, B:73:0x015f, B:95:0x0187, B:100:0x01bf, B:101:0x01c8, B:98:0x01b2, B:92:0x0181, B:93:0x0184, B:96:0x01a5, B:70:0x0150, B:72:0x0159, B:82:0x0170, B:83:0x0173), top: B:120:0x013b, inners: #8, #10 }] */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, android.net.Uri] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(android.content.Context r18, android.graphics.Bitmap r19, boolean r20, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super android.net.Uri, kotlin.Unit> r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09NP.LIZJ(android.content.Context, android.graphics.Bitmap, boolean, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
