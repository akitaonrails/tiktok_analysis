package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.localservice.inflater.LSAsyncInflater;

/* JADX INFO: renamed from: X.0gqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181430gqj {
    public static InterfaceC1181450gql LIZ() {
        C01GW c01gw = C0AME.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            return C1181440gqk.LIZ;
        }
        if (((Number) c01gw.getValue()).intValue() == 2) {
            return LSAsyncInflater.LIZ;
        }
        C1205490hTX c1205490hTX = C1205490hTX.LIZ;
        C1EMR c1emr = C1EMR.IMPLEMENTATION_IS_NOT_FOUND;
        c1205490hTX.LJ(c1emr, new Exception(c1emr.message()));
        return null;
    }

    public static View LIZIZ(Context context, int i, ViewGroup viewGroup, boolean z) {
        View viewLIZ;
        InterfaceC1181450gql interfaceC1181450gqlLIZ = C1181440gqk.LIZ;
        if (!C1181440gqk.LIZIZ.contains(Integer.valueOf(i))) {
            interfaceC1181450gqlLIZ = LSAsyncInflater.LIZ;
            if (!LSAsyncInflater.LIZLLL.contains(Integer.valueOf(i))) {
                interfaceC1181450gqlLIZ = LIZ();
            }
        }
        if (interfaceC1181450gqlLIZ == null || (viewLIZ = interfaceC1181450gqlLIZ.LIZ(context, i, viewGroup, z)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, z);
        }
        return viewLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.content.Context r9, java.lang.Integer r10, java.lang.String r11, int r12, int r13, java.lang.Integer r14, androidx.fragment.app.Fragment r15, int r16) {
        /*
            r7 = r13
            r6 = r12
            r5 = r11
            r4 = r10
            r0 = r16 & 2
            r8 = 0
            if (r0 == 0) goto La
            r4 = r8
        La:
            r0 = r16 & 4
            if (r0 == 0) goto Lf
            r5 = r8
        Lf:
            r0 = r16 & 8
            r1 = 1
            if (r0 == 0) goto L15
            r6 = 1
        L15:
            r0 = r16 & 16
            if (r0 == 0) goto L1a
            r7 = 1
        L1a:
            r0 = r16 & 32
            if (r0 == 0) goto L23
            r0 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L23:
            r0 = r16 & 64
            if (r0 != 0) goto L28
            r8 = r15
        L28:
            if (r14 == 0) goto L67
            int r0 = r14.intValue()
            if (r0 != r1) goto L4b
            X.0gqk r2 = X.C1181440gqk.LIZ
            if (r4 == 0) goto L44
            r4.intValue()
            int r0 = r4.intValue()
            java.util.Set<java.lang.Integer> r1 = X.C1181440gqk.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
        L44:
            if (r2 == 0) goto L4a
            r3 = r9
            r2.LIZIZ(r3, r4, r5, r6, r7, r8)
        L4a:
            return
        L4b:
            int r1 = r14.intValue()
            r0 = 2
            if (r1 != r0) goto L67
            com.ss.android.ugc.aweme.localservice.inflater.LSAsyncInflater r2 = com.ss.android.ugc.aweme.localservice.inflater.LSAsyncInflater.LIZ
            if (r4 == 0) goto L44
            r4.intValue()
            int r0 = r4.intValue()
            java.util.Set<java.lang.Integer> r1 = com.ss.android.ugc.aweme.localservice.inflater.LSAsyncInflater.LIZLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            goto L44
        L67:
            X.0gql r2 = LIZ()
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1181430gqj.LIZJ(android.content.Context, java.lang.Integer, java.lang.String, int, int, java.lang.Integer, androidx.fragment.app.Fragment, int):void");
    }
}
