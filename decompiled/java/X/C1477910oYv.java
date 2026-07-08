package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: renamed from: X.0oYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477910oYv implements InterfaceC1477240oXq {
    public final InterfaceC1482870ogv LIZIZ;

    @Override // X.InterfaceC1477240oXq
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
        return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
    }

    @Override // X.InterfaceC1477240oXq
    public final String getName() {
        return "VideoCacheProxyUrlHook";
    }

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    public C1477910oYv(InterfaceC1482870ogv interfaceC1482870ogv) {
        this.LIZIZ = interfaceC1482870ogv;
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZ(C1477250oXr c1477250oXr) {
        SimVideoUrlModel simVideoUrlModel;
        C1478000oZ4 c1478000oZ4 = c1477250oXr.LIZJ;
        C1476750oX3 c1476750oX3 = c1478000oZ4.LIZ;
        if (c1476750oX3 == null) {
            simVideoUrlModel = null;
        } else {
            simVideoUrlModel = new SimVideoUrlModel();
            if (c1476750oX3.getUrlKey() != null) {
                simVideoUrlModel.setSourceId(c1476750oX3.getUrlKey());
            }
            if (c1476750oX3.getFileHash() != null) {
                simVideoUrlModel.setFileHash(c1476750oX3.getFileHash());
            }
            simVideoUrlModel.setHeight(c1476750oX3.getHeight());
            simVideoUrlModel.setWidth(c1476750oX3.getWidth());
            simVideoUrlModel.setSize(c1476750oX3.getSize());
            if (c1476750oX3.getUri() != null) {
                simVideoUrlModel.setUri(c1476750oX3.getUri());
            }
            if (c1476750oX3.getUrlKey() != null) {
                simVideoUrlModel.setUrlKey(c1476750oX3.getUrlKey());
            }
            if (c1476750oX3.getUrlList() != null) {
                simVideoUrlModel.setUrlList(c1476750oX3.getUrlList());
            }
            if (c1476750oX3.getaK() != null) {
                simVideoUrlModel.setaK(c1476750oX3.getaK());
            }
        }
        String[] strArr = c1478000oZ4.LIZJ;
        int iLJJLIIIJJI = 0;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strArr[i]);
                sbLIZ.append(LJ(strArr[i], simVideoUrlModel.getSourceId()));
                strArr[i] = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        String strLJJIII = this.LIZIZ.LJJIII(simVideoUrlModel, c1478000oZ4.LIZIZ, strArr);
        if (C582130MsN.LIZ().getConfig().getAppConfig().isDebug()) {
            InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
            if (interfaceC1482870ogvLIZ != null) {
                iLJJLIIIJJI = interfaceC1482870ogvLIZ.LJJLIIIJJI(simVideoUrlModel);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VideoCacheProxyUrlHook: hitCacheSize:");
            sbLIZ2.append(iLJJLIIIJJI);
            sbLIZ2.append(" ,proxyUrl:");
            sbLIZ2.append(strLJJIII);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return new C1477210oXn(strLJJIII, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[LOOP:0: B:13:0x001f->B:15:0x0022, LOOP_END] */
    @Override // X.InterfaceC1477240oXq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1477210oXn LIZLLL(X.C1477250oXr r9) {
        /*
            r8 = this;
            X.0oXt r7 = r9.LIZIZ
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r4 = r7.LIZ
            java.lang.String[] r6 = r7.LIZJ
            r3 = 0
            if (r4 == 0) goto L41
            boolean r0 = r4.isUseMdlAndVideoCache()
            if (r0 != 0) goto L1c
            if (r6 == 0) goto L41
            int r0 = r6.length
            if (r0 <= 0) goto L1e
            X.0oXn r1 = new X.0oXn
            r0 = r6[r3]
            r1.<init>(r0, r8)
            return r1
        L1c:
            if (r6 == 0) goto L41
        L1e:
            r5 = 0
        L1f:
            int r0 = r6.length
            if (r5 >= r0) goto L41
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            r0 = r6[r5]
            r2.append(r0)
            r1 = r6[r5]
            java.lang.String r0 = r4.getSourceId()
            java.lang.String r0 = LJ(r1, r0)
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            r6[r5] = r0
            int r5 = r5 + 1
            goto L1f
        L41:
            X.0ogv r1 = r8.LIZIZ
            java.lang.String r0 = r7.LIZIZ
            java.lang.String r2 = r1.LJJIII(r4, r0, r6)
            X.0ojb r0 = X.C582130MsN.LIZ()
            com.ss.android.ugc.aweme.simkit.ISimKitConfig r0 = r0.getConfig()
            com.ss.android.ugc.playerkit.simapicommon.IAppConfig r0 = r0.getAppConfig()
            boolean r0 = r0.isDebug()
            if (r0 == 0) goto L7c
            X.0ogv r0 = X.C1478160oZK.LIZ()
            if (r0 == 0) goto L65
            int r3 = r0.LJJLIIIJJI(r4)
        L65:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "VideoCacheProxyUrlHook: hitCacheSize:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " ,proxyUrl:"
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
        L7c:
            X.0oXn r0 = new X.0oXn
            r0.<init>(r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1477910oYv.LIZLLL(X.0oXr):X.0oXn");
    }

    public static String LJ(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("?")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("&source_id=");
                sbLIZ.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("?&source_id=");
            sbLIZ2.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return "";
    }
}
