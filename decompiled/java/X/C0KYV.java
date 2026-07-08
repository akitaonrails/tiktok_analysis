package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KYV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KYV extends C0KYX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C0KYW c0kyw = (C0KYW) xBaseParamModel;
        C1106200etO c1106200etO = new C1106200etO();
        String coverUrl = c0kyw.getCoverUrl();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0kyw.getInnerUrl());
        sbLIZ.append("&use_native_pgc_sub_privilege_page=1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String outerUrl = c0kyw.getOuterUrl();
        String title = c0kyw.getTitle();
        String titleStarlingKey = c0kyw.getTitleStarlingKey();
        List<String> titleStarlingKeyArgs = c0kyw.getTitleStarlingKeyArgs();
        String desc = c0kyw.getDesc();
        String senderPreviewText = c0kyw.getSenderPreviewText();
        String senderPreviewTextStarlingKey = c0kyw.getSenderPreviewTextStarlingKey();
        C518420KUu.LIZ(c1106200etO, coverUrl, strLIZIZ, outerUrl, title, desc, senderPreviewText, c0kyw.getReceiverPreviewText(), c0kyw.getQuotePreviewText(), titleStarlingKey, titleStarlingKeyArgs, senderPreviewTextStarlingKey, c0kyw.getReceiverPreviewTextStarlingKey(), c0kyw.getQuotePreviewTextStarlingKey(), c0kyw.getOuterTitle(), c0kyw.getOuterDescription(), 175104);
        IHostShare iHostShare = (IHostShare) C1161920gLG.LIZJ(IHostShare.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        iHostShare.shareSubscribeLink(activityLIZLLL, new C1106210etP(c1106200etO), new InterfaceC1372610lp5() { // from class: X.0KYT
            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onDismiss() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onShow(int i) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
                this.LIZ.getClass();
                C0KYU c0kyu = (C0KYU) C1909107dp.LIZJ(C0KYU.class, null);
                c0kyu.setShareSuccess(Boolean.FALSE);
                completionBlock.onSuccess(c0kyu, "");
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str, String str2, Bundle bundle) {
                InterfaceC634840OvC interfaceC634840OvC2;
                Context context;
                String string = null;
                if (Intrinsics.LJFF("chat_merge", str) && Intrinsics.LJFF("link", str2) && (interfaceC634840OvC2 = this.LIZ.IBridgeSdkContext) != null && (context = interfaceC634840OvC2.getContext()) != null) {
                    C497340Jeu.LIZ(context, C497740JfY.LJIJI(2131844199), null, true, 6);
                }
                this.LIZ.getClass();
                C0KYU c0kyu = (C0KYU) C1909107dp.LIZJ(C0KYU.class, null);
                c0kyu.setShareSuccess(Boolean.TRUE);
                c0kyu.setSharePlatform(str);
                if (bundle != null) {
                    string = bundle.getString("shareIdList", "");
                }
                c0kyu.setToUserId(string);
                completionBlock.onSuccess(c0kyu, "");
            }
        });
    }
}
