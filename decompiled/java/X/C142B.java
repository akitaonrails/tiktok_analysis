package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.142B, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C142B extends AbstractC1801680wz8 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        boolean z;
        final Activity activityLIZLLL;
        String str;
        InterfaceC1801690wz9 interfaceC1801690wz9 = (InterfaceC1801690wz9) xBaseParamModel;
        C2372209Rg.LIZ.getClass();
        C2372209Rg.LIZIZ = completionBlock;
        String sourceType = interfaceC1801690wz9.getSourceType();
        if (sourceType.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, "Invalid params: sourceType is empty", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && interfaceC634840OvC.getContext() != null) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null && (activityLIZLLL = interfaceC634840OvC2.LIZLLL()) != null) {
                if (Intrinsics.LJFF(sourceType, "album")) {
                    AnonymousClass1429 anonymousClass1429 = new AnonymousClass1429(activityLIZLLL, completionBlock);
                    C142C.LIZ(activityLIZLLL, anonymousClass1429);
                    anonymousClass1429.LLILLL = C2372209Rg.LIZ(activityLIZLLL);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 33) {
                        if (i >= 34) {
                            str = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
                        } else {
                            str = "android.permission.READ_MEDIA_IMAGES";
                        }
                        if (C838410Wul.LIZ(activityLIZLLL, str) == 0) {
                            C2431009fo.LJ(activityLIZLLL);
                            return;
                        } else {
                            anonymousClass1429.LIZ(activityLIZLLL, new AwS574S0100000_30(activityLIZLLL, 342));
                            return;
                        }
                    }
                    if (C838410Wul.LIZ(activityLIZLLL, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                        C2431009fo.LIZLLL(activityLIZLLL);
                        return;
                    } else {
                        anonymousClass1429.LIZ(activityLIZLLL, new AwS574S0100000_30(activityLIZLLL, 343));
                        return;
                    }
                }
                final C1801710wzB c1801710wzB = new C1801710wzB(interfaceC1801690wz9, completionBlock);
                if (C838410Wul.LIZ(activityLIZLLL, "android.permission.CAMERA") == 0) {
                    c1801710wzB.LIZ(activityLIZLLL);
                    return;
                } else {
                    C19771812Xk.LIZIZ(activityLIZLLL, TokenCert.Companion.with("bpea-studio_blue_verification_permissions"), new String[]{"android.permission.CAMERA"}, new InterfaceC19772112Xn() { // from class: X.0wzC
                        @Override // X.InterfaceC19772112Xn
                        public final void LIZ(int[] iArr, String[] strArr) throws Throwable {
                            if (strArr.length != 0) {
                                for (int i2 : iArr) {
                                    if (i2 == 0) {
                                    }
                                }
                                c1801710wzB.LIZ(activityLIZLLL);
                                return;
                            }
                            if (strArr.length != 0 && iArr[0] == -1) {
                                C2382909Vj.LIZ(c1801710wzB.LIZIZ, 0, "No camera permissions", null, 4);
                            }
                        }
                    });
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "Activity not provided", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
