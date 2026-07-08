package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Eu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379370Eu7 {
    public static List LIZJ() {
        return (List) C299360BoM.LIZIZ.getValue();
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        return C286470BKr.LIZ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJ(java.util.List r6) {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r6, r0)
            r2.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        Lf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "keep_ratio"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            java.lang.String r5 = "Original"
            if (r0 == 0) goto L26
            r3 = r5
        L26:
            X.0wU1 r1 = new X.0wU1
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r3)
            java.lang.String r4 = r0.toString()
            int r0 = r4.hashCode()
            switch(r0) {
                case 48936: goto L43;
                case 50861: goto L54;
                case 51821: goto L65;
                case 1513508: goto L76;
                case 1755398: goto L87;
                case 1443687921: goto L98;
                default: goto L37;
            }
        L37:
            r5 = 0
        L38:
            r4 = 56
            java.lang.String r0 = ""
            r1.<init>(r0, r3, r5, r4)
            r2.add(r1)
            goto Lf
        L43:
            java.lang.String r0 = "1:1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L37
            X.04k4 r5 = new X.04k4
            r0 = 2130772164(0x7f0100c4, float:1.7147439E38)
            r5.<init>(r0)
            goto L38
        L54:
            java.lang.String r0 = "3:4"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L37
            X.04k4 r5 = new X.04k4
            r0 = 2130772165(0x7f0100c5, float:1.714744E38)
            r5.<init>(r0)
            goto L38
        L65:
            java.lang.String r0 = "4:3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L37
            X.04k4 r5 = new X.04k4
            r0 = 2130772166(0x7f0100c6, float:1.7147443E38)
            r5.<init>(r0)
            goto L38
        L76:
            java.lang.String r0 = "16:9"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L37
            X.04k4 r5 = new X.04k4
            r0 = 2130772163(0x7f0100c3, float:1.7147437E38)
            r5.<init>(r0)
            goto L38
        L87:
            java.lang.String r0 = "9:16"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L37
            X.04k4 r5 = new X.04k4
            r0 = 2130772167(0x7f0100c7, float:1.7147445E38)
            r5.<init>(r0)
            goto L38
        L98:
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L37
            X.04k4 r5 = new X.04k4
            r0 = 2130772169(0x7f0100c9, float:1.7147449E38)
            r5.<init>(r0)
            goto L38
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C379370Eu7.LJ(java.util.List):java.util.List");
    }

    public static List LIZLLL(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return (List) C1846307Kz.LIZIZ.getValue();
            }
            return (List) C1846207Ky.LIZIZ.getValue();
        }
        if (z) {
            return (List) C07L1.LIZIZ.getValue();
        }
        return (List) C07L0.LIZIZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LJFF(Context context, List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1782390wU1(context.getString(2131841124, String.valueOf(((Number) it2.next()).intValue())), null, 0 == true ? 1 : 0, 62));
        }
        return arrayList;
    }

    public static int LIZ(int i, boolean z, boolean z2) {
        if (i >= 0) {
            double d = ((double) i) / 1000.0d;
            Iterator it2 = LIZLLL(z, z2).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (Math.abs(((Number) it2.next()).doubleValue() - d) >= 0.01d) {
                    i2++;
                } else {
                    return i2;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LJI(Context context, boolean z, boolean z2) {
        List listLIZLLL = LIZLLL(z, z2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
        Iterator it2 = listLIZLLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1782390wU1(context.getString(2131841124, String.valueOf((int) ((Number) it2.next()).doubleValue())), null, 0 == true ? 1 : 0, 62));
        }
        return arrayList;
    }
}
