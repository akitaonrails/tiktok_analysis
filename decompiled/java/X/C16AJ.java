package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.google.android.gms.common.ConnectionResult;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.16AJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16AJ extends C16AK {
    public DataChannel LLILLL;
    public final C01GW<C16AI> LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        DataChannel dataChannel;
        IMessageManager iMessageManager;
        if (!this.LLILZ.isInitialized() || (dataChannel = this.LLILLL) == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.removeMessageListener((OnIMMessageListener) this.LLILZ.getValue());
    }

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final Class<? extends C16AM> provideResultModel() {
        return C16AM.class;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object objLIZ;
        C19EG c19eg;
        DataChannel dataChannelProvideDataChannel;
        View view;
        Context context;
        C16AL c16al = (C16AL) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (view = interfaceC634840OvC.getView()) == null || (context = view.getContext()) == null || (objLIZ = C715020S2y.LIZ(context)) == null) {
            objLIZ = C2211501Bgy.LLILZIL;
        }
        if (objLIZ instanceof C19EG) {
            c19eg = (C19EG) objLIZ;
        } else {
            c19eg = null;
        }
        C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(c19eg);
        if (c0ip3LIZIZ != null) {
            dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LLILLL = dataChannelProvideDataChannel;
        if (dataChannelProvideDataChannel == null) {
            C2382909Vj.LIZ(completionBlock, -1, "dataChannel is null", null, 4);
            return;
        }
        IMessageManager iMessageManager = (IMessageManager) dataChannelProvideDataChannel.gg0(C776250Uch.class);
        if (iMessageManager == null) {
            C2382909Vj.LIZ(completionBlock, -1, "messageManager is null", null, 4);
            return;
        }
        Iterator<C001A> it2 = C001A.getMessageTypes(c16al.getMessageTypes()).iterator();
        while (it2.hasNext()) {
            iMessageManager.addMessageListener(it2.next().getIntType(), (OnIMMessageListener) this.LLILZ.getValue());
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C16AM.class, null), "");
    }
}
