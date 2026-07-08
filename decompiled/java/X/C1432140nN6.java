package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0nN6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432140nN6 extends C060P {
    public static final /* synthetic */ int LLILLL = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC497601wk interfaceC497601wkLIZ;
        C060Q c060q = (C060Q) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != 0) {
            if (activityLIZLLL instanceof LifecycleOwner) {
                interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityLIZLLL);
            } else {
                C1DFH c1dfh = C0PEM.LIZ;
                interfaceC497601wkLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII());
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wkLIZ, C2107308Nj.LIZ.LLIILII(), null, new C1432550nNl(c060q, this, completionBlock, activityLIZLLL, interfaceC497601wkLIZ, null), 2);
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1001, "unable to get act", null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZJ(com.ss.android.ugc.aweme.publish.model.UploadImageConfig r11, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, boolean r13, X.InterfaceC1364105Vn r14) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1432140nN6.LIZJ(com.ss.android.ugc.aweme.publish.model.UploadImageConfig, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, X.05Vn):java.lang.Object");
    }
}
