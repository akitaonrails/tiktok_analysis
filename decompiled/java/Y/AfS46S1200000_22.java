package Y;

import X.C094D;
import X.C098200Yq;
import X.C09JN;
import X.C1416470mxp;
import X.C1431920nMk;
import X.C189200o6;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C2252408s6;
import X.C443120HZe;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.tools.infosticker.repository.internal.repository.SetStickerRelationData;
import com.ss.android.ugc.tools.infosticker.repository.internal.repository.SetStickerRelationResp;
import com.ss.android.ugc.tools.infosticker.repository.internal.repository.StickerCollectTokenResp;

/* JADX INFO: loaded from: classes23.dex */
public class AfS46S1200000_22 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS46S1200000_22 afS46S1200000_22, Object obj) {
        SetStickerRelationData setStickerRelationData;
        C1C7U.LIZ("InfoStickerRepositoryExt@4b12.createCollectRelation$2$1");
        SetStickerRelationResp setStickerRelationResp = (SetStickerRelationResp) obj;
        int i = setStickerRelationResp.statusCode;
        if (i != 0 || ((setStickerRelationData = setStickerRelationResp.data) != null && !setStickerRelationData.isSuccess)) {
            C1431920nMk.LJ(1, setStickerRelationResp.message, "bind", afS46S1200000_22.s0, Integer.valueOf(i));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("custom_sticker_upload : fail to bind sticker collection with users, code = ");
            sbLIZ.append(setStickerRelationResp.statusCode);
            sbLIZ.append(", message = ");
            sbLIZ.append(setStickerRelationResp.message);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS46S1200000_22.l2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("status code is illegal, code = ");
            sbLIZ2.append(setStickerRelationResp.statusCode);
            sbLIZ2.append(", status message = ");
            sbLIZ2.append(setStickerRelationResp.message);
            C098200Yq c098200Yq = new C098200Yq(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2)));
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
            C189200o6.m2constructorimpl(c189200o6M1boximpl);
            interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
        }
        InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) afS46S1200000_22.l2;
        C189200o6.m2constructorimpl(setStickerRelationResp);
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(setStickerRelationResp);
        C189200o6.m2constructorimpl(c189200o6M1boximpl2);
        interfaceC1364105Vn2.resumeWith(c189200o6M1boximpl2);
        C1431920nMk.LJ(0, "", "bind", afS46S1200000_22.s0, -1);
        C201955140j.LJIIL("custom_sticker_upload : success to bind sticker collection with users");
        C1C7U.LIZIZ("InfoStickerRepositoryExt@4b12.createCollectRelation$2$1");
    }

    public static final void accept$1(AfS46S1200000_22 afS46S1200000_22, Object obj) {
        C1C7U.LIZ("InfoStickerRepositoryExt@4b12.createCollectRelation$2$2");
        Throwable th = (Throwable) obj;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS46S1200000_22.l1;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C189200o6.m2constructorimpl(c189200o6M1boximpl);
        interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
        C1431920nMk.LJ(1, th.getMessage(), "bind", afS46S1200000_22.s0, Integer.valueOf(C2252408s6.LIZIZ(th)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("custom_sticker_upload : fail to bind sticker collection with users, code = ");
        sbLIZ.append(C2252408s6.LIZIZ(th));
        sbLIZ.append(", message = ");
        sbLIZ.append(th.getMessage());
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("InfoStickerRepositoryExt@4b12.createCollectRelation$2$2");
    }

    public static final void accept$2(AfS46S1200000_22 afS46S1200000_22, Object obj) {
        C1C7U.LIZ("InfoStickerRepositoryExt@4b12.getCustomStickerUploadToken$2$1");
        StickerCollectTokenResp stickerCollectTokenResp = (StickerCollectTokenResp) obj;
        int i = stickerCollectTokenResp.statusCode;
        if (i != 0) {
            C1431920nMk.LJ(1, stickerCollectTokenResp.statusMassage, "token", afS46S1200000_22.s0, Integer.valueOf(i));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("custom_sticker_upload : fail to get token sticker collection with users, code = ");
            sbLIZ.append(stickerCollectTokenResp.statusCode);
            sbLIZ.append(", message = ");
            sbLIZ.append(stickerCollectTokenResp.statusMassage);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS46S1200000_22.l2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("status code is illegal, code = ");
            sbLIZ2.append(stickerCollectTokenResp.statusCode);
            sbLIZ2.append(", status message = ");
            sbLIZ2.append(stickerCollectTokenResp.statusMassage);
            C098200Yq c098200Yq = new C098200Yq(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2)));
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
            C189200o6.m2constructorimpl(c189200o6M1boximpl);
            interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
        }
        UploadImageConfig uploadImageConfig = stickerCollectTokenResp.imgConfig;
        if (uploadImageConfig != null) {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) afS46S1200000_22.l2;
            C189200o6.m2constructorimpl(uploadImageConfig);
            C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(uploadImageConfig);
            C189200o6.m2constructorimpl(c189200o6M1boximpl2);
            interfaceC1364105Vn2.resumeWith(c189200o6M1boximpl2);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn3 = (InterfaceC1364105Vn) afS46S1200000_22.l2;
            C098200Yq c098200Yq2 = new C098200Yq(new IllegalArgumentException("uploadImageConfig is null"));
            C189200o6.m2constructorimpl(c098200Yq2);
            C189200o6 c189200o6M1boximpl3 = C189200o6.m1boximpl(c098200Yq2);
            C189200o6.m2constructorimpl(c189200o6M1boximpl3);
            interfaceC1364105Vn3.resumeWith(c189200o6M1boximpl3);
        }
        C1431920nMk.LJ(0, "", "token", afS46S1200000_22.s0, -1);
        C1C7U.LIZIZ("InfoStickerRepositoryExt@4b12.getCustomStickerUploadToken$2$1");
    }

    public static final void accept$3(AfS46S1200000_22 afS46S1200000_22, Object obj) {
        C1C7U.LIZ("InfoStickerRepositoryExt@4b12.getCustomStickerUploadToken$2$2");
        Throwable th = (Throwable) obj;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS46S1200000_22.l1;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C189200o6.m2constructorimpl(c189200o6M1boximpl);
        interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
        C1431920nMk.LJ(1, th.getMessage(), "token", afS46S1200000_22.s0, Integer.valueOf(C2252408s6.LIZIZ(th)));
        C1C7U.LIZIZ("InfoStickerRepositoryExt@4b12.getCustomStickerUploadToken$2$2");
    }

    public static final void accept$4(AfS46S1200000_22 afS46S1200000_22, Object obj) {
        C1C7U.LIZ("EffectAssetDownloader@f641.downloadMusic$1$3");
        C1416470mxp c1416470mxp = (C1416470mxp) afS46S1200000_22.l1;
        C094D c094d = (C094D) afS46S1200000_22.l2;
        String str = afS46S1200000_22.s0;
        c1416470mxp.getClass();
        C1416470mxp.LJ(c094d, (String) obj, str);
        C1C7U.LIZIZ("EffectAssetDownloader@f641.downloadMusic$1$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS46S1200000_22(X.C1431920nMk r2, java.lang.String r3, X.C23260099m r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                case 1: goto L5;
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r4
            r0.l2 = r2
            r0.s0 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            r0.l2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS46S1200000_22.<init>(X.0nMk, java.lang.String, X.099m, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS46S1200000_22(C1416470mxp c1416470mxp, C1416470mxp c1416470mxp2, C094D<? super C443120HZe<Integer, ? extends AVMusic, Boolean>> c094d, String str) {
        this.$t = str;
        this.l1 = c1416470mxp;
        this.l2 = c1416470mxp2;
        this.s0 = c094d;
    }
}
