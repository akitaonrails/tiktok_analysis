package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505800pHu extends AbstractC1505760pHq {
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
        Context context;
        boolean zCommit;
        int i;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        boolean zCommit2;
        int i2;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorClear;
        InterfaceC1505790pHt interfaceC1505790pHt = (InterfaceC1505790pHt) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        if (Intrinsics.LJFF(interfaceC1505790pHt.getType(), "all")) {
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "js_kv_methods_20191113");
            if (sharedPreferencesLIZJ != null && (editorEdit2 = sharedPreferencesLIZJ.edit()) != null && (editorClear = editorEdit2.clear()) != null) {
                zCommit2 = editorClear.commit();
            } else {
                zCommit2 = false;
            }
            InterfaceC1505770pHr interfaceC1505770pHr = (InterfaceC1505770pHr) C1909107dp.LIZJ(InterfaceC1505770pHr.class, null);
            if (zCommit2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            interfaceC1505770pHr.setCode(i2);
            completionBlock.onSuccess(interfaceC1505770pHr, "");
            return;
        }
        String key = interfaceC1505790pHt.getKey();
        if (key == null) {
            C2382909Vj.LIZ(completionBlock, 0, "key is null", null, 4);
            return;
        }
        SharedPreferences sharedPreferencesLIZJ2 = C810670Vr7.LIZJ(context, 0, "js_kv_methods_20191113");
        if (sharedPreferencesLIZJ2 != null && (editorEdit = sharedPreferencesLIZJ2.edit()) != null && (editorRemove = editorEdit.remove(key)) != null) {
            zCommit = editorRemove.commit();
        } else {
            zCommit = false;
        }
        InterfaceC1505770pHr interfaceC1505770pHr2 = (InterfaceC1505770pHr) C1909107dp.LIZJ(InterfaceC1505770pHr.class, null);
        if (zCommit) {
            i = 1;
        } else {
            i = 0;
        }
        interfaceC1505770pHr2.setCode(i);
        completionBlock.onSuccess(interfaceC1505770pHr2, "");
    }
}
