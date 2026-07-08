package Y;

import X.AbstractC1387200mCc;
import X.C09JN;
import X.C1072730e1P;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397660mTU;
import X.C1906580ziK;
import X.C1C7U;
import X.C2008507tr;
import android.app.Activity;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public class AfS3S0211000_16 implements C09JN {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS3S0211000_16 afS3S0211000_16, Object obj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C1397660mTU c1397660mTU;
        C1397510mTF c1397510mTFLIZ;
        C1C7U.LIZ("SocialRecFriendsDialogHelper@6ca4.invokeUploadApi$2");
        C1072730e1P c1072730e1P = (C1072730e1P) afS3S0211000_16.l0;
        int i = afS3S0211000_16.i3;
        c1072730e1P.getClass();
        new C2008507tr(((C1072730e1P) afS3S0211000_16.l0).LIZIZ.invoke(), (String) ((C1072730e1P) afS3S0211000_16.l0).LJI.getValue(), C1072730e1P.LIZIZ(i).getStr(), false, false).LIZLLL(null);
        if (afS3S0211000_16.z2 && (c1397660mTU = (C1397660mTU) afS3S0211000_16.l1) != null && (c1397510mTFLIZ = c1397660mTU.LIZ()) != null) {
            c1397510mTFLIZ.LIZIZ(null);
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131832569);
            c1389890mGx.LJIIJJI();
        }
        ((C1072730e1P) afS3S0211000_16.l0).getClass();
        C1072730e1P.LJ();
        C1C7U.LIZIZ("SocialRecFriendsDialogHelper@6ca4.invokeUploadApi$2");
    }

    public static final void accept$1(AfS3S0211000_16 afS3S0211000_16, Object obj) {
        C1397660mTU c1397660mTU;
        C1397510mTF c1397510mTFLIZ;
        C1C7U.LIZ("SocialRecFriendsDialogHelper@6ca4.invokeUploadApi$1");
        if (afS3S0211000_16.z2 && (c1397660mTU = (C1397660mTU) afS3S0211000_16.l0) != null && (c1397510mTFLIZ = c1397660mTU.LIZ()) != null) {
            c1397510mTFLIZ.LIZIZ(null);
        }
        C1072730e1P c1072730e1P = (C1072730e1P) afS3S0211000_16.l1;
        int i = afS3S0211000_16.i3;
        c1072730e1P.getClass();
        new C2008507tr(((C1072730e1P) afS3S0211000_16.l1).LIZIZ.invoke(), (String) ((C1072730e1P) afS3S0211000_16.l1).LJI.getValue(), C1072730e1P.LIZIZ(i).getStr(), true, false).LIZLLL(null);
        C1072730e1P c1072730e1P2 = (C1072730e1P) afS3S0211000_16.l1;
        c1072730e1P2.LJFF(c1072730e1P2.LIZ.requireActivity(), ((C1072730e1P) afS3S0211000_16.l1).LIZIZ.invoke(), (String) ((C1072730e1P) afS3S0211000_16.l1).LJI.getValue(), Collections.singletonList(Integer.valueOf(afS3S0211000_16.i3)));
        C1C7U.LIZIZ("SocialRecFriendsDialogHelper@6ca4.invokeUploadApi$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS3S0211000_16(int r3, X.C1397660mTU r4, X.C1072730e1P r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            if (r6 == 0) goto L12
            r1 = r2
            r0 = 0
            r1.z2 = r0
            r1.l0 = r4
            r1.l1 = r5
            r1.i3 = r3
        Le:
            r1.<init>()
            return
        L12:
            r1 = r2
            r1.l0 = r5
            r1.i3 = r3
            r0 = 0
            r1.z2 = r0
            r1.l1 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0211000_16.<init>(int, X.0mTU, X.0e1P, int):void");
    }
}
