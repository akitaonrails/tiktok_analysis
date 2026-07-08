package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.music.model.Music;
import defpackage.e0;

/* JADX INFO: renamed from: X.0QoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681510QoH extends e0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        e0.b bVar = (e0.b) xBaseParamModel;
        try {
            C1227904rF.LIZ.getClass();
            String strLJIILL = C1227904rF.LIZLLL().LJIILL(bVar.getMusic());
            if (!TextUtils.isEmpty(strLJIILL)) {
                try {
                    Music music = (Music) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), strLJIILL, new TypeToken<Music>() { // from class: X.0QoI
                    }.getType());
                    if (music != null) {
                        C1440005kM.LIZ(new C681170Qnj(music));
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(e0.c.class, containerID), "");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            String message = e2.getMessage();
            if (message == null) {
                message = "shoot music fail";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
