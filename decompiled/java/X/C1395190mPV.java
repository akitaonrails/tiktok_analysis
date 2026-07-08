package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.PreloadVideoUtil;
import java.util.List;

/* JADX INFO: renamed from: X.0mPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395190mPV extends AbstractC1395200mPW {
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00f3: INVOKE 
      (r5 I:com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock)
      (r3 I:int)
      (r0 I:java.lang.String)
      (r12 I:com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel)
      (r4 I:int)
     STATIC call: X.09Vj.LIZ(com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, int, java.lang.String, com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel, int):void A[MD:(com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, int, java.lang.String, com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel, int):void (m)] (LINE:50331891), block:B:43:0x00dc */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        CompletionBlock completionBlockLIZ;
        boolean z;
        InterfaceC1395230mPZ interfaceC1395230mPZ;
        String url;
        InterfaceC1395230mPZ interfaceC1395230mPZ2;
        InterfaceC1395210mPX interfaceC1395210mPX = (InterfaceC1395210mPX) xBaseParamModel;
        try {
            List<InterfaceC1395230mPZ> videoUrls = interfaceC1395210mPX.getVideoUrls();
            if (videoUrls.isEmpty()) {
                C2382909Vj.LIZ(completionBlock, 0, "videoUrls is empty", null, 4);
                return;
            }
            String preloadId = interfaceC1395210mPX.getPreloadId();
            if (preloadId != null && preloadId.length() == 0) {
                C2382909Vj.LIZ(completionBlock, 0, "preloadId is empty", null, 4);
                return;
            }
            C1395180mPU c1395180mPULIZLLL = C1395170mPT.LIZLLL(videoUrls);
            if (c1395180mPULIZLLL.LIZ == 1 && (interfaceC1395230mPZ2 = c1395180mPULIZLLL.LIZIZ) != null && !TextUtils.isEmpty(interfaceC1395230mPZ2.getUrl())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                InterfaceC1395230mPZ interfaceC1395230mPZ3 = c1395180mPULIZLLL.LIZIZ;
                if (interfaceC1395230mPZ3 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(interfaceC1395210mPX.getPreloadId());
                    sbLIZ.append(interfaceC1395230mPZ3.getResolution());
                    String strLIZJ = C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    PreloadVideoUtil preloadVideoUtil = PreloadVideoUtil.LIZ;
                    String url2 = interfaceC1395230mPZ3.getUrl();
                    long j = c1395180mPULIZLLL.LIZJ;
                    preloadVideoUtil.getClass();
                    C1475600oVC c1475600oVC = new C1475600oVC(j, strLIZJ, null, new String[]{url2});
                    c1475600oVC.LJIIJ = new C1395270mPd(strLIZJ);
                    C805420Vie.LIZ.LJIIZILJ(c1475600oVC);
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1395220mPY.class, null);
                    InterfaceC1395220mPY interfaceC1395220mPY = (InterfaceC1395220mPY) xBaseModelLIZJ;
                    interfaceC1395220mPY.setPreloadKey(strLIZJ);
                    interfaceC1395220mPY.setPreloadUrl(interfaceC1395230mPZ3.getUrl());
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    return;
                }
                return;
            }
            if (c1395180mPULIZLLL.LIZ == -2 && (interfaceC1395230mPZ = c1395180mPULIZLLL.LIZIZ) != null && !TextUtils.isEmpty(interfaceC1395230mPZ.getUrl())) {
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1395220mPY.class, null);
                InterfaceC1395220mPY interfaceC1395220mPY2 = (InterfaceC1395220mPY) xBaseModelLIZJ2;
                InterfaceC1395230mPZ interfaceC1395230mPZ4 = c1395180mPULIZLLL.LIZIZ;
                if (interfaceC1395230mPZ4 != null && (url = interfaceC1395230mPZ4.getUrl()) != null) {
                    interfaceC1395220mPY2.setPreloadKey(url);
                    interfaceC1395220mPY2.setPreloadKey(C08HM.LIZJ(url));
                }
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "no selected video url", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unknown error = ");
            sbLIZ2.append(e.getLocalizedMessage());
            C2382909Vj.LIZ(completionBlockLIZ, 0, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
        }
    }
}
