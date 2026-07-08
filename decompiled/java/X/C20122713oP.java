package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20122713oP extends AbstractC20122413oM {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        EnumC1154830g9p enumC1154830g9p;
        Context context;
        Intent intentLIZ;
        Number permission = ((InterfaceC20122913oR) xBaseParamModel).getPermission();
        if (Intrinsics.LJFF(permission, 1)) {
            enumC1154830g9p = EnumC1154830g9p.CAMERA;
        } else if (Intrinsics.LJFF(permission, 2)) {
            enumC1154830g9p = EnumC1154830g9p.PHOTOALBUM;
        } else {
            enumC1154830g9p = EnumC1154830g9p.UNKNOWN;
        }
        if (enumC1154830g9p == EnumC1154830g9p.UNKNOWN) {
            C2382909Vj.LIZ(completionBlock, -3, "Illegal permission", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            InterfaceC20123113oT interfaceC20123113oT = C20123013oS.LIZ.get(Build.MANUFACTURER.toLowerCase(Locale.ROOT));
            if (interfaceC20123113oT == null || (intentLIZ = interfaceC20123113oT.LIZ(context)) == null) {
                intentLIZ = new InterfaceC20123113oT() { // from class: X.13oQ
                    @Override // X.InterfaceC20123113oT
                    public final Intent LIZ(Context context2) {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.addFlags(268435456);
                        intent.setData(Uri.fromParts("package", context2.getPackageName(), null));
                        return intent;
                    }
                }.LIZ(context);
            }
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentLIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLIZ, context);
            C2204961BRm.LJJJJJL(context, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYfVY5KkLgb010Lku2xgQccp3UV+ospeUpRQZAI864q3519z1/KtiSyETVTUbPA==", null));
            completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC20122513oN.class)), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
