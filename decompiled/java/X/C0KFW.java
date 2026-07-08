package X;

import X.C0KFV;
import X.C1909107dp;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetAction;
import com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetCallback;
import com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetDescription;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0KFW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KFW extends C0KJU {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.OpenSubActionSheetMethod$handle$1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        ?? arrayList;
        ?? arrayList2;
        C0KFX c0kfx = (C0KFX) xBaseParamModel;
        try {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, true);
            String title = c0kfx.getTitle();
            if (title == null) {
                title = "";
            }
            List<C0KFZ> descriptions = c0kfx.getDescriptions();
            if (descriptions != null) {
                arrayList = new ArrayList();
                for (C0KFZ c0kfz : descriptions) {
                    String type = c0kfz.getType();
                    String value = c0kfz.getValue();
                    if (value == null) {
                        value = "";
                    }
                    arrayList.add(new SubActionSheetDescription(type, value));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            List<C0KFY> actions = c0kfx.getActions();
            if (actions != null) {
                arrayList2 = new ArrayList();
                for (C0KFY c0kfy : actions) {
                    String variant = c0kfy.getVariant();
                    int iIntValue = c0kfy.getIndex().intValue();
                    String text = c0kfy.getText();
                    if (text == null) {
                        text = "";
                    }
                    arrayList2.add(new SubActionSheetAction(variant, iIntValue, text));
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            C494790Jan.LIZLLL(fragmentManagerLJIL, title, arrayList, arrayList2, new SubActionSheetCallback() { // from class: com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.OpenSubActionSheetMethod$handle$1
                @Override // com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetCallback
                public final void LIZIZ() {
                    this.LL.getClass();
                    C0KFV c0kfv = (C0KFV) C1909107dp.LIZJ(C0KFV.class, null);
                    c0kfv.setClickedButtonId(-1);
                    completionBlock.onSuccess(c0kfv, "");
                }

                @Override // com.bytedance.android.livesdk.comp.api.subscription.model.actionsheet.SubActionSheetCallback
                public final void LIZ(SubActionSheetAction subActionSheetAction) {
                    this.LL.getClass();
                    C0KFV c0kfv = (C0KFV) C1909107dp.LIZJ(C0KFV.class, null);
                    c0kfv.setClickedButtonId(Integer.valueOf(subActionSheetAction.index));
                    completionBlock.onSuccess(c0kfv, "");
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int iLIZIZ = C512300K7g.LIZIZ(e);
            String message = e.getMessage();
            if (message == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown error: ");
                sbLIZ.append(e.getClass().getCanonicalName());
                message = C2188811AlT.LIZIZ(sbLIZ);
            }
            C2382909Vj.LIZ(completionBlock, iLIZIZ, message, null, 4);
        }
    }
}
