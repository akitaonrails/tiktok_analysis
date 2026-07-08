package X;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.DialogBuilder;
import com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend;
import com.bytedance.sdk.xbridge.runtime.depend.PageTitleBar;
import com.bytedance.sdk.xbridge.runtime.depend.ToastBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ypZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872630ypZ extends AbstractC1872540ypQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Boolean boolShowToast;
        IHostStyleUIDepend iHostStyleUIDepend;
        InterfaceC1872640ypa interfaceC1872640ypa = (InterfaceC1872640ypa) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "context not provided in host", null, 4);
            return;
        }
        String message = interfaceC1872640ypa.getMessage();
        if (message.length() == 0) {
            C2382909Vj.LIZ(completionBlock, -3, "Key in the params is empty", null, 4);
            return;
        }
        String type = interfaceC1872640ypa.getType();
        if (type == null) {
            type = "";
        }
        Number duration = interfaceC1872640ypa.getDuration();
        if (duration == null) {
            duration = Integer.valueOf(LivePreCreateNextRoomPlayer.ENABLE);
        }
        String icon = interfaceC1872640ypa.getIcon();
        String customIcon = interfaceC1872640ypa.getCustomIcon();
        if (customIcon == null || customIcon.length() == 0) {
            customIcon = null;
        }
        Number delay = interfaceC1872640ypa.getDelay();
        if (delay == null) {
            delay = 0;
        }
        if (icon == null) {
            icon = type;
        }
        ToastBuilder toastBuilder = new ToastBuilder(context, message, icon, customIcon, duration, delay);
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostStyleUIDepend = c1874950ytJ.LIZIZ) != null) {
            boolShowToast = iHostStyleUIDepend.showToast(toastBuilder, this.IBridgeSdkContext);
        } else {
            boolShowToast = null;
        }
        if (!Intrinsics.LJFF(boolShowToast, Boolean.TRUE)) {
            new IHostStyleUIDepend() { // from class: X.0ypb
                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                public final Boolean hideLoading(C1872620ypY c1872620ypY, InterfaceC634840OvC interfaceC634840OvC2) {
                    return null;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                public final void setPageNaviStyle(InterfaceC634840OvC interfaceC634840OvC2, Activity activity, PageTitleBar pageTitleBar) {
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                public final Boolean showDialog(DialogBuilder dialogBuilder) {
                    return null;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                public final Boolean showLoading(C1872770ypn c1872770ypn, InterfaceC634840OvC interfaceC634840OvC2) {
                    return null;
                }

                @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend
                public final Boolean showToast(ToastBuilder toastBuilder2, InterfaceC634840OvC interfaceC634840OvC2) {
                    C786410Ut5.re(Toast.makeText(toastBuilder2.context, toastBuilder2.message, 0));
                    return Boolean.TRUE;
                }
            }.showToast(toastBuilder, this.IBridgeSdkContext);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1872550ypR.class, null), "");
    }
}
