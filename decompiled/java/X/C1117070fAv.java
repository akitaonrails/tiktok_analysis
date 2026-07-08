package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0fAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117070fAv extends AbstractC1117090fAx {
    public static boolean LLILLL;

    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int i;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        InterfaceC2262081DgM currentUser = interfaceC500940JkiUser.getCurrentUser();
        InterfaceC1117080fAw interfaceC1117080fAw = (InterfaceC1117080fAw) C1909107dp.LIZJ(InterfaceC1117080fAw.class, null);
        interfaceC1117080fAw.setLogin(Boolean.valueOf(interfaceC500940JkiUser.isLogin()));
        if (interfaceC500940JkiUser.isLogin()) {
            interfaceC1117080fAw.setUserId(String.valueOf(currentUser.getId()));
            interfaceC1117080fAw.setSecUserId(currentUser.getSecUid());
        } else {
            interfaceC1117080fAw.setUserId("");
            interfaceC1117080fAw.setSecUserId("");
        }
        if (LLILLL) {
            i = 1;
        } else {
            i = 0;
        }
        interfaceC1117080fAw.setSilent(i);
        interfaceC1117080fAw.setCode(1);
        completionBlock.onSuccess(interfaceC1117080fAw, "");
    }
}
