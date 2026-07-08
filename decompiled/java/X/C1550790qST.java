package X;

import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Arrays;
import kotlin.jvm.internal.AwS389S0200000_23;

/* JADX INFO: renamed from: X.0qST, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550790qST extends AbstractC1552240qUo<UpdatePackage, UpdatePackage> {
    public C1550930qSh LJI;

    public C1550790qST() {
        C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    @Override // X.AbstractC1552240qUo
    public final void LIZIZ(Object... objArr) {
        C1550930qSh c1550930qSh;
        Arrays.copyOf(objArr, objArr.length);
        Object obj = objArr[0];
        if (obj instanceof C1550930qSh) {
            c1550930qSh = (C1550930qSh) obj;
        } else {
            c1550930qSh = null;
        }
        this.LJI = c1550930qSh;
    }

    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<UpdatePackage> interfaceC1552320qUw, UpdatePackage updatePackage) {
        UpdatePackage updatePackage2 = updatePackage;
        C1550930qSh c1550930qSh = this.LJI;
        if (c1550930qSh != null) {
            C1550730qSN c1550730qSN = C1550730qSN.LIZ;
            String accessKey = updatePackage2.getAccessKey();
            String channel = updatePackage2.getChannel();
            c1550730qSN.getClass();
            C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(accessKey, channel);
            if (c1550720qSMLIZIZ != null) {
                if (c1550720qSMLIZIZ.LIZIZ && updatePackage2.getUpdateWithPatch()) {
                    if (updatePackage2.getIsZstd() || updatePackage2.isSingleFile()) {
                        long j = CastLongProtector.parseLong(c1550720qSMLIZIZ.LIZLLL);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[Parallel Line] current channel[");
                        sbLIZ.append(updatePackage2.getChannel());
                        sbLIZ.append("], version:[");
                        sbLIZ.append(c1550720qSMLIZIZ.LIZLLL);
                        sbLIZ.append("] is compressed, parallel decompress it, ");
                        sbLIZ.append(updatePackage2);
                        sbLIZ.append('.');
                        C1553130qWF.LIZ("gecko-debug-tag-PreDownloadCompress", C2188811AlT.LIZIZ(sbLIZ));
                        updatePackage2.setReCompressed(true);
                        C1551980qUO c1551980qUO = C1551980qUO.LIZ;
                        UpdatePackage updatePackage3 = new UpdatePackage(c1550720qSMLIZIZ, j, updatePackage2.getAccessKey(), updatePackage2.getChannel());
                        updatePackage3.setDecompressFrom(3);
                        AwS389S0200000_23 awS389S0200000_23 = new AwS389S0200000_23(updatePackage2, c1550930qSh, 4);
                        c1551980qUO.getClass();
                        C1551980qUO.LIZ(updatePackage3, awS389S0200000_23);
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ak:");
                    sbLIZ2.append(updatePackage2.getAccessKey());
                    sbLIZ2.append(" channel:");
                    sbLIZ2.append(updatePackage2.getChannel());
                    sbLIZ2.append(" is not compressed");
                    C1553130qWF.LIZ("gecko-debug-tag-PreDownloadCompress", C2188811AlT.LIZIZ(sbLIZ2));
                    c1550930qSh.LIZJ(null);
                }
            } else {
                c1550930qSh.LIZJ(null);
            }
            return interfaceC1552320qUw.proceed(updatePackage2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("decompressStateManager is null, skip check for ak:");
        sbLIZ3.append(updatePackage2.getAccessKey());
        sbLIZ3.append(" channel:");
        sbLIZ3.append(updatePackage2.getChannel());
        C1553130qWF.LIZ("gecko-debug-tag-PreDownloadCompress", C2188811AlT.LIZIZ(sbLIZ3));
        return interfaceC1552320qUw.proceed(updatePackage2);
    }
}
