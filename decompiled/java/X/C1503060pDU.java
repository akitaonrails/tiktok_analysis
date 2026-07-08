package X;

import Y.ARunnableS1S2500000_23;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.HybridPermissionCert;
import com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend;
import com.bytedance.sdk.xbridge.runtime.depend.OnPermissionsGrantCallback;
import com.bytedance.sdk.xbridge.runtime.depend.OnPermissionsGrantResult;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pDU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503060pDU extends AbstractC1503170pDf {
    public final String LLILLL = "jpg";
    public final String LLILZ = "png";
    public final String LLILZIL = "nonsupportType";
    public final String LLILZLL = "image/jpeg";
    public final String LLIZ = "image/png";

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public final void LIZJ(Context context, InterfaceC1503160pDe interfaceC1503160pDe, CompletionBlock<InterfaceC1503140pDc> completionBlock) {
        String absolutePath;
        String str;
        String dataURL = interfaceC1503160pDe.getDataURL();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        if (a0.LJJIIZI(dataURL, ",", false)) {
            ?? r0 = ListProtector.get(a0.LJJLIIIJILLIZJL(dataURL, new String[]{","}, 0, 6), 1);
            c259800zU.element = r0;
            if (((CharSequence) r0).length() == 0) {
                C2382909Vj.LIZ(completionBlock, -3, null, null, 6);
                return;
            }
            String extension = interfaceC1503160pDe.getExtension();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(interfaceC1503160pDe.getFilename());
            sbLIZ.append('.');
            sbLIZ.append(extension);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            File fileX2 = C786410Ut5.x2(context);
            if (fileX2 == null) {
                fileX2 = C786410Ut5.w2(context);
            }
            if (fileX2 != null && (absolutePath = fileX2.getAbsolutePath()) != null) {
                C0VSJ c0vsj = new C0VSJ(absolutePath, strLIZIZ);
                String absolutePath2 = c0vsj.getAbsolutePath();
                if (c0vsj.exists() && !Intrinsics.LJFF(interfaceC1503160pDe.getEnableOverwrite(), 1)) {
                    if (Intrinsics.LJFF(interfaceC1503160pDe.getEnableOverwrite(), 2)) {
                        XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1503140pDc.class));
                        ((InterfaceC1503140pDc) xBaseModelLIZLLL).setFilePath(absolutePath2);
                        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZLLL, "");
                        return;
                    }
                    C2382909Vj.LIZ(completionBlock, 0, "file path already exist", null, 4);
                    return;
                }
                if (Intrinsics.LJFF(extension, this.LLILLL)) {
                    str = this.LLILZLL;
                } else if (Intrinsics.LJFF(extension, this.LLILZ)) {
                    str = this.LLIZ;
                } else {
                    str = this.LLILZIL;
                }
                if (Intrinsics.LJFF(str, this.LLILZIL)) {
                    C2382909Vj.LIZ(completionBlock, -3, null, null, 6);
                    return;
                } else {
                    C2126108Up.LIZ.execute(new ARunnableS1S2500000_23(this, c259800zU, interfaceC1503160pDe, str, absolutePath2, context, completionBlock, 0));
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "cacheDir is null", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, -3, null, null, 6);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final Context context;
        boolean z;
        String str;
        IHostPermissionDepend iHostPermissionDepend;
        C1874950ytJ c1874950ytJ;
        IHostPermissionDepend iHostPermissionDepend2;
        IHostPermissionDepend iHostPermissionDepend3;
        final InterfaceC1503160pDe interfaceC1503160pDe = (InterfaceC1503160pDe) xBaseParamModel;
        final InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            final Activity activityLIZ = C0XS4.LIZ(context);
            if (activityLIZ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "context can not convert to activity", null, 4);
                return;
            }
            if (interfaceC1503160pDe.getDataURL().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C2382909Vj.LIZ(completionBlock, -3, "The dataURL key is required.", null, 4);
                return;
            }
            if (interfaceC1503160pDe.getExtension().length() == 0) {
                C2382909Vj.LIZ(completionBlock, -3, "The extension key is required.", null, 4);
                return;
            }
            if (interfaceC1503160pDe.getFilename().length() == 0) {
                C2382909Vj.LIZ(completionBlock, -3, "The filename key is required.", null, 4);
                return;
            }
            if (!u.LJJIIJZLJL(interfaceC1503160pDe.getDataURL(), "data:", false)) {
                C2382909Vj.LIZ(completionBlock, -3, "dataURL invalid", null, 4);
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                str = "android.permission.READ_MEDIA_IMAGES";
            } else {
                str = "android.permission.READ_EXTERNAL_STORAGE";
            }
            C1874950ytJ c1874950ytJ2 = C1874950ytJ.LJIIL;
            if (c1874950ytJ2 != null && (iHostPermissionDepend3 = c1874950ytJ2.LIZ) != null && iHostPermissionDepend3.hasPermission(activityLIZ, str)) {
                LIZJ(context, interfaceC1503160pDe, completionBlock);
                return;
            }
            String str2 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
            if (i >= 34 && (c1874950ytJ = C1874950ytJ.LJIIL) != null && (iHostPermissionDepend2 = c1874950ytJ.LIZ) != null && iHostPermissionDepend2.hasPermission(activityLIZ, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                LIZJ(context, interfaceC1503160pDe, completionBlock);
                return;
            }
            C1874950ytJ c1874950ytJ3 = C1874950ytJ.LJIIL;
            if (c1874950ytJ3 == null || (iHostPermissionDepend = c1874950ytJ3.LIZ) == null) {
                return;
            }
            OnPermissionsGrantCallback onPermissionsGrantCallback = new OnPermissionsGrantCallback() { // from class: X.0pDT
                @Override // com.bytedance.sdk.xbridge.runtime.depend.OnPermissionsGrantCallback
                public final void onResult(OnPermissionsGrantResult[] onPermissionsGrantResultArr) {
                    IHostPermissionDepend iHostPermissionDepend4;
                    if (onPermissionsGrantResultArr.length != 0 && onPermissionsGrantResultArr[0].getResult() == 0) {
                        this.LIZ.LIZJ(context, interfaceC1503160pDe, completionBlock);
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 34 && onPermissionsGrantResultArr.length == 2) {
                        this.LIZ.getClass();
                        C1874950ytJ c1874950ytJ4 = C1874950ytJ.LJIIL;
                        if (c1874950ytJ4 != null && (iHostPermissionDepend4 = c1874950ytJ4.LIZ) != null && iHostPermissionDepend4.hasPermission(activityLIZ, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                            this.LIZ.LIZJ(context, interfaceC1503160pDe, completionBlock);
                            return;
                        }
                    }
                    C2382909Vj.LIZ(completionBlock, 0, "request permission denied", null, 4);
                }
            };
            String[] strArr = new String[2];
            strArr[0] = str;
            if (i < 34) {
                str2 = null;
            }
            strArr[1] = str2;
            iHostPermissionDepend.requestPermissions(activityLIZ, onPermissionsGrantCallback, (String[]) ((ArrayList) C13LQ.LJIJI(strArr)).toArray(new String[0]), new HybridPermissionCert("bpea-xsave_data_url_method_read_storage"));
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
