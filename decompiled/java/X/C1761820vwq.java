package X;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0vwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761820vwq extends AbstractC1761830vwr {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        View view;
        InterfaceC1761850vwt interfaceC1761850vwt = (InterfaceC1761850vwt) xBaseParamModel;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1761840vws interfaceC1761840vws : interfaceC1761850vwt.getGalleryList()) {
            int iIntValue = ((Integer) interfaceC1761840vws.getType()).intValue();
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    C1761780vwm c1761780vwm = C1761780vwm.LIZ;
                    String videoID = interfaceC1761840vws.getVideoID();
                    String videoMainURL = interfaceC1761840vws.getVideoMainURL();
                    String videoBackupURL = interfaceC1761840vws.getVideoBackupURL();
                    String coverImageURL = interfaceC1761840vws.getCoverImageURL();
                    Double d = (Double) interfaceC1761840vws.getVideoDuration();
                    Integer num = (Integer) interfaceC1761840vws.getVideoWidth();
                    Integer num2 = (Integer) interfaceC1761840vws.getVideoHeight();
                    c1761780vwm.getClass();
                    C1762710vyH c1762710vyH = new C1762710vyH(EnumC1761790vwn.VIDEO, null);
                    c1762710vyH.LIZJ = videoID;
                    c1762710vyH.LIZLLL = videoMainURL;
                    c1762710vyH.LJ = videoBackupURL;
                    c1762710vyH.LJFF = coverImageURL;
                    c1762710vyH.LJI = d;
                    c1762710vyH.LJII = num;
                    c1762710vyH.LJIIIIZZ = num2;
                    arrayList.add(c1762710vyH);
                }
            } else {
                arrayList.add(C1761780vwm.LIZIZ(C1761780vwm.LIZ, interfaceC1761840vws.getImageURL(), null, null, 14));
            }
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        DialogC1761330vw3 dialogC1761330vw3 = new DialogC1761330vw3(context, false);
        dialogC1761330vw3.LJJZZI(arrayList);
        dialogC1761330vw3.LJJZZIII(((Integer) interfaceC1761850vwt.getIndex()).intValue(), null);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1761860vwu.class, null), "");
    }
}
