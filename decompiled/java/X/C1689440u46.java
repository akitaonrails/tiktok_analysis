package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u46, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689440u46 {
    public static boolean LIZ(String str, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((AbstractC1689250u3n) next).LIZJ(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC1689250u3n abstractC1689250u3n = (AbstractC1689250u3n) next;
        if (abstractC1689250u3n != null) {
            if (abstractC1689250u3n instanceof C1689420u44) {
                return ((C1689420u44) abstractC1689250u3n).LJII;
            }
            if (abstractC1689250u3n instanceof C1689430u45) {
                return ((C1689430u45) abstractC1689250u3n).LJIIIIZZ;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r6.equals("in_app_im_msg_vibration") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r6.equals("in_app_im_msg_sound") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        return LIZ("in_app_im_push", r7);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.String r6, java.util.List r7) {
        /*
            int r0 = r6.hashCode()
            r3 = 0
            java.lang.String r5 = "im_push"
            r4 = 1
            switch(r0) {
                case -1156561027: goto Ld;
                case -1143771983: goto L16;
                case -845862226: goto L1f;
                case -392359421: goto L28;
                case 1910370645: goto L5f;
                default: goto Lb;
            }
        Lb:
            r3 = 1
        Lc:
            return r3
        Ld:
            java.lang.String r0 = "im_push_preview_v2"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L31
            goto Lb
        L16:
            java.lang.String r0 = "in_app_im_msg_vibration"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L75
            goto Lb
        L1f:
            java.lang.String r0 = "in_app_im_msg_sound"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L75
            goto Lb
        L28:
            java.lang.String r0 = "im_alert_tones"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L31
            goto Lb
        L31:
            boolean r0 = LIZ(r5, r7)
            if (r0 == 0) goto Lc
            java.util.Iterator r2 = r7.iterator()
        L3b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0u3n r0 = (X.AbstractC1689250u3n) r0
            java.lang.String r0 = r0.LIZJ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L3b
        L52:
            X.0u3n r1 = (X.AbstractC1689250u3n) r1
            if (r1 == 0) goto Lc
            boolean r0 = r1.LIZIZ()
            if (r0 != r4) goto Lc
            goto Lb
        L5d:
            r1 = 0
            goto L52
        L5f:
            boolean r0 = r6.equals(r5)
            if (r0 == 0) goto Lb
            X.1Bky r0 = X.C2213981Bky.LIZIZ
            android.content.Context r1 = r0.getApplicationContext()
            X.0Vyw r0 = new X.0Vyw
            r0.<init>(r1)
            boolean r3 = X.C20303114cP.LJ(r0, r3)
            return r3
        L75:
            java.lang.String r0 = "in_app_im_push"
            boolean r3 = LIZ(r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689440u46.LIZIZ(java.lang.String, java.util.List):boolean");
    }
}
