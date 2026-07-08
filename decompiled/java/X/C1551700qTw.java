package X;

import android.util.Pair;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.UpdatePackage;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKGeckoRequest;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.adapter.TTKResponseKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551700qTw extends AbstractC1552240qUo<Pair<InterfaceC1550870qSb, UpdatePackage>, Pair<InterfaceC1550870qSb, UpdatePackage>> {
    @Override // X.AbstractC1552240qUo
    public final Object LIZJ(InterfaceC1552320qUw<Pair<InterfaceC1550870qSb, UpdatePackage>> interfaceC1552320qUw, Pair<InterfaceC1550870qSb, UpdatePackage> pair) {
        boolean z;
        boolean z2;
        String str;
        AbstractC1553590qWz resourceValidator;
        C1551710qTx c1551710qTx;
        Object pipelineData;
        TTKResponse tTKResponseShouldInterceptTTKRequest;
        List<String> boeGeckoChannelBlockList;
        Pair<InterfaceC1550870qSb, UpdatePackage> pair2 = pair;
        UpdatePackage updatePackage = (UpdatePackage) pair2.second;
        if (updatePackage.getDecompressFrom() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (updatePackage.getDecompressFrom() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            str = "[Update Line]";
        } else if (z2) {
            str = "[Compress Line]";
        } else {
            str = "[Parallel Line]";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" start validate:");
        C1553130qWF.LIZ("gecko-debug-tag-Validate", C2188811AlT.LIZIZ(sbLIZ), updatePackage.getChannel());
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
        if (geckoGlobalConfig != null) {
            resourceValidator = geckoGlobalConfig.getResourceValidator();
        } else {
            resourceValidator = null;
        }
        File parentFile = ((InterfaceC1550870qSb) pair2.first).LIZIZ().getParentFile();
        if (updatePackage.isSingleFile()) {
            parentFile = parentFile.getParentFile();
        }
        C0VSJ c0vsj = new C0VSJ(parentFile, "res");
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            parentFile = c0vsj;
        }
        if (resourceValidator != null) {
            String areaInfo = updatePackage.getAreaInfo();
            if (areaInfo != null && !Intrinsics.LJFF(areaInfo, "")) {
                if (Intrinsics.LJFF(areaInfo, "US-TTP")) {
                    String channel = updatePackage.getChannel();
                    LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
                    if (localTestApi != null && (boeGeckoChannelBlockList = localTestApi.getBoeGeckoChannelBlockList()) != null && boeGeckoChannelBlockList.contains(channel)) {
                        c1551710qTx = new C1551710qTx(-1, "hitDebugBlockChannel", false);
                    } else {
                        TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
                        if (tTKOrbu.enableInterceptor() && (tTKResponseShouldInterceptTTKRequest = tTKOrbu.shouldInterceptTTKRequest(new TTKGeckoRequest(parentFile.getAbsolutePath()))) != null && TTKResponseKt.isBlock(tTKResponseShouldInterceptTTKRequest)) {
                            c1551710qTx = new C1551710qTx(Integer.valueOf(tTKResponseShouldInterceptTTKRequest.getStatusCode()), tTKResponseShouldInterceptTTKRequest.getDescription(), false);
                        } else {
                            c1551710qTx = new C1551710qTx();
                        }
                    }
                } else {
                    c1551710qTx = new C1551710qTx();
                }
            } else {
                c1551710qTx = new C1551710qTx(0, "area is empty", true);
            }
            if (c1551710qTx.LIZ) {
                if (c1551710qTx.LIZJ != null || c1551710qTx.LIZIZ != null) {
                    if (interfaceC1552320qUw != null) {
                        pipelineData = interfaceC1552320qUw.getPipelineData("req_type");
                    } else {
                        pipelineData = null;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(" error code:");
                    sbLIZ2.append(c1551710qTx.LIZJ);
                    sbLIZ2.append(", error message:");
                    sbLIZ2.append(c1551710qTx.LIZIZ);
                    C1551780qU4.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2), 3, String.valueOf(pipelineData), updatePackage.getAccessKey(), 34, updatePackage.getChannel());
                }
            } else {
                C0X9F.LJFF(parentFile);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(" Resource validate failed: error code:");
                sbLIZ3.append(c1551710qTx.LIZJ);
                sbLIZ3.append(", error message:");
                sbLIZ3.append(c1551710qTx.LIZIZ);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append(" pass validate:");
        C1553130qWF.LIZ("gecko-debug-tag-Validate", C2188811AlT.LIZIZ(sbLIZ4), updatePackage.getChannel());
        if (interfaceC1552320qUw == null) {
            return null;
        }
        return interfaceC1552320qUw.proceed(pair2);
    }
}
