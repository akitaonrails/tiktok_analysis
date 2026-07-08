package X;

import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dMR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1047330dMR implements InterfaceC1028200cra {
    public final WeakReference<InterfaceC1541990qEH> LIZ;
    public final WeakReference<C1075770e6J> LIZIZ;

    @Override // X.InterfaceC1028200cra
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1028200cra
    public final Uri LIZJ() {
        C1537480q70 hybridContext;
        InterfaceC1531560pxS interfaceC1531560pxS;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZ.get();
        if (interfaceC1541990qEH == null || (hybridContext = interfaceC1541990qEH.getHybridContext()) == null || (interfaceC1531560pxS = hybridContext.hybridParams) == null) {
            return null;
        }
        return interfaceC1531560pxS.LIZ();
    }

    @Override // X.InterfaceC1028200cra
    public EnumC1054630dYD LJ() {
        C1537480q70 hybridContext;
        InterfaceC1531560pxS interfaceC1531560pxS;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZ.get();
        return ((interfaceC1541990qEH == null || (hybridContext = interfaceC1541990qEH.getHybridContext()) == null || (interfaceC1531560pxS = hybridContext.hybridParams) == null) ? null : interfaceC1531560pxS.getType()) == EnumC1067640dtC.LYNX ? EnumC1054630dYD.LYNX : EnumC1054630dYD.WEB;
    }

    @Override // X.InterfaceC1028200cra
    public final C1047290dMN getSessionInfo() {
        String str;
        C1537480q70 hybridContext;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZ.get();
        if (interfaceC1541990qEH == null || (hybridContext = interfaceC1541990qEH.getHybridContext()) == null || (str = hybridContext.containerId) == null) {
            str = "";
        }
        return new C1047290dMN(str);
    }

    public AbstractC1047330dMR(WeakReference<InterfaceC1541990qEH> weakReference) {
        Object objLJFF;
        C1537480q70 hybridContext;
        this.LIZ = weakReference;
        InterfaceC1541990qEH interfaceC1541990qEH = weakReference.get();
        if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
            objLJFF = hybridContext.LJFF(C1075770e6J.class);
        } else {
            objLJFF = null;
        }
        this.LIZIZ = new WeakReference<>(objLJFF);
    }

    @Override // X.InterfaceC1028200cra
    public final <T extends AbstractC1041890dDf> T LIZIZ(Class<T> cls) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Use Spark Method instead");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1028200cra
    public void onEvent(InterfaceC1047320dMQ interfaceC1047320dMQ) {
        C1075770e6J c1075770e6J = this.LIZIZ.get();
        if (c1075770e6J != null) {
            c1075770e6J.sendEvent(interfaceC1047320dMQ.getName(), (JSONObject) interfaceC1047320dMQ.getParams());
        }
    }

    @Override // X.InterfaceC1028200cra
    public final void LIZ(String str, List<String> list, List<? extends JSONObject> list2) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        C1537480q70 hybridContext;
        C1075770e6J c1075770e6J;
        if (Intrinsics.LJFF(str, EnumC1047340dMS.Closed.getActionType()) && (interfaceC1541990qEH = this.LIZ.get()) != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null && (c1075770e6J = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class)) != null) {
            c1075770e6J.LJIIIZ(list, list2);
        }
    }
}
