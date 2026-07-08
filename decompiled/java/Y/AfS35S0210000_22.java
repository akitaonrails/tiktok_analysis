package Y;

import X.C098200Yq;
import X.C09JN;
import X.C1431920nMk;
import X.C189200o6;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C2252408s6;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerPanelCollectData;

/* JADX INFO: loaded from: classes23.dex */
public class AfS35S0210000_22 implements C09JN {
    public final int $t;
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

    public static final void accept$0(AfS35S0210000_22 afS35S0210000_22, Object obj) {
        C1C7U.LIZ("InfoStickerRepositoryExt@4b12.getCollectList$2$1");
        InfoStickerPanelCollectData infoStickerPanelCollectData = (InfoStickerPanelCollectData) obj;
        int i = infoStickerPanelCollectData.statusCode;
        if (i != 0) {
            C1431920nMk c1431920nMk = (C1431920nMk) afS35S0210000_22.l0;
            boolean z = afS35S0210000_22.z2;
            Boolean bool = Boolean.FALSE;
            String str = infoStickerPanelCollectData.message;
            c1431920nMk.getClass();
            C1431920nMk.LIZLLL(1, i, bool, str, z);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("custom_sticker_upload : fail to get collect sticker list, code = ");
            sbLIZ.append(infoStickerPanelCollectData.statusCode);
            sbLIZ.append(", message = ");
            sbLIZ.append(infoStickerPanelCollectData.message);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS35S0210000_22.l1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("status code is illegal, code = ");
            sbLIZ2.append(infoStickerPanelCollectData.statusCode);
            sbLIZ2.append(", status message = ");
            sbLIZ2.append(infoStickerPanelCollectData.message);
            C098200Yq c098200Yq = new C098200Yq(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2)));
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
            C189200o6.m2constructorimpl(c189200o6M1boximpl);
            interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
        }
        InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) afS35S0210000_22.l1;
        C189200o6.m2constructorimpl(infoStickerPanelCollectData);
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(infoStickerPanelCollectData);
        C189200o6.m2constructorimpl(c189200o6M1boximpl2);
        interfaceC1364105Vn2.resumeWith(c189200o6M1boximpl2);
        C1431920nMk c1431920nMk2 = (C1431920nMk) afS35S0210000_22.l0;
        boolean z2 = afS35S0210000_22.z2;
        Boolean boolValueOf = Boolean.valueOf(infoStickerPanelCollectData.hasMore);
        c1431920nMk2.getClass();
        C1431920nMk.LIZLLL(0, -1, boolValueOf, "", z2);
        C201955140j.LJIIL("custom_sticker_upload : success to get collect sticker list");
        C1C7U.LIZIZ("InfoStickerRepositoryExt@4b12.getCollectList$2$1");
    }

    public static final void accept$1(AfS35S0210000_22 afS35S0210000_22, Object obj) {
        C1C7U.LIZ("InfoStickerRepositoryExt@4b12.getCollectList$2$2");
        Throwable th = (Throwable) obj;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS35S0210000_22.l0;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C189200o6.m2constructorimpl(c189200o6M1boximpl);
        interfaceC1364105Vn.resumeWith(c189200o6M1boximpl);
        C1431920nMk c1431920nMk = (C1431920nMk) afS35S0210000_22.l1;
        boolean z = afS35S0210000_22.z2;
        Boolean bool = Boolean.FALSE;
        String message = th.getMessage();
        int iLIZIZ = C2252408s6.LIZIZ(th);
        c1431920nMk.getClass();
        C1431920nMk.LIZLLL(1, iLIZIZ, bool, message, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("custom_sticker_upload : fail to get collect sticker list, code = ");
        sbLIZ.append(C2252408s6.LIZIZ(th));
        sbLIZ.append(", message = ");
        sbLIZ.append(th.getMessage());
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("InfoStickerRepositoryExt@4b12.getCollectList$2$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS35S0210000_22(X.C1431920nMk r2, X.C23260099m r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.z2 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.z2 = r4
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS35S0210000_22.<init>(X.0nMk, X.099m, boolean, int):void");
    }
}
