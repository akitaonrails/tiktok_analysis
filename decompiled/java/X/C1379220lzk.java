package X;

import Y.ACallableS69S1100000_21;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.AwemeACLStruct;

/* JADX INFO: renamed from: X.0lzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379220lzk {
    public static String LIZ = "share_panel";
    public static String LIZIZ = "";

    public static final void LIZJ(Aweme aweme, String str) {
        if (aweme == null || C1376270luz.LIZIZ()) {
            return;
        }
        C15O7.LIZJ(new ACallableS69S1100000_21(aweme, str, 0));
    }

    public static final void LIZ(Aweme aweme, String str, boolean z) {
        AwemeACLStruct.ACLCommonStruct aCLCommonStructLIZ = AwemeACLStruct.LIZ();
        aCLCommonStructLIZ.setCode(0);
        aCLCommonStructLIZ.setShowType(2);
        aCLCommonStructLIZ.setToastMsg("");
        aCLCommonStructLIZ.setExtra("");
        if (z) {
            return;
        }
        AwemeACLStruct.LIZ().setShowType(0);
        AwemeACLStruct.LIZ().setCode(1);
        LIZ = "long_press_download";
        LIZJ(aweme, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C1371600lnS r6, java.lang.String r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r1 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            r5 = 0
            r1.setCode(r5)
            r3 = 2
            r1.setShowType(r3)
            java.lang.String r0 = ""
            r1.setToastMsg(r0)
            r1.setExtra(r0)
            java.lang.String r0 = "share_panel"
            X.C1379220lzk.LIZ = r0
            java.util.List<X.0llN> r0 = r6.LJFF
            java.util.Iterator r6 = r0.iterator()
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r4 = r6.next()
            X.0llN r4 = (X.InterfaceC1370310llN) r4
            java.lang.String r1 = r4.key()
            java.lang.String r0 = "download"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 1
            if (r0 != 0) goto L52
            java.lang.String r1 = r4.key()
            java.lang.String r0 = "save"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L52
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            r0.setShowType(r5)
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            r0.setCode(r2)
            goto L1e
        L52:
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            r0.setCode(r5)
            boolean r0 = r4.enable()
            if (r0 != 0) goto L60
            r3 = 1
        L60:
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            r0.setShowType(r3)
        L67:
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r0 = com.ss.android.ugc.aweme.share.AwemeACLStruct.LIZ()
            int r0 = r0.getShowType()
            if (r0 != 0) goto L74
            LIZJ(r8, r7)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1379220lzk.LIZIZ(X.0lnS, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
