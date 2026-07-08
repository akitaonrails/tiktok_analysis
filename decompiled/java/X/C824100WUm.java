package X;

import android.graphics.Bitmap;
import android.util.Base64;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: X.0WUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824100WUm extends AbstractC824060WUi {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        try {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC824070WUj.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
            InterfaceC824070WUj interfaceC824070WUj = (InterfaceC824070WUj) xBaseModelLIZJ;
            MyMomentsMainElementsAssem.LLLLLLLZIL.getClass();
            Bitmap bitmap = MyMomentsMainElementsAssem.LLLLLLZZ;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                interfaceC824070WUj.setMapData(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
            }
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "success");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("err: ");
            sbLIZ.append(th.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
