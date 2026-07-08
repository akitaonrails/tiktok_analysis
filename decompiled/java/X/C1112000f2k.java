package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.message.IMessageService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0f2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112000f2k {
    public boolean LIZ;
    public boolean LIZJ;
    public Room LJFF;
    public InterfaceC1112820f44 LJI;
    public LifecycleOwner LJII;
    public IMessageManager LJIIIIZZ;
    public String LIZIZ = "";
    public String LIZLLL = "";
    public boolean LJ = true;

    public final String LIZ() {
        return this.LIZLLL.length() > 0 ? this.LIZLLL : this.LIZIZ;
    }

    public final boolean LIZIZ() {
        return this.LIZJ && this.LJ;
    }

    public static List LIZJ(List list) {
        AbstractC1136060ffY abstractC1136060ffY;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage = (ProtoMessageFetchResult.BaseProtoMessage) it2.next();
            try {
                Class<? extends AbstractC1136060ffY> messageClass = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).getMessageClass(baseProtoMessage.method);
                if (messageClass != null) {
                    C1515210pX5.LIZLLL().getClass();
                    C0IMD c0imdLJI = C1515210pX5.LJI(messageClass);
                    if (c0imdLJI != null) {
                        C1516680pZS c1516680pZS = new C1516680pZS();
                        c1516680pZS.LJIIL(new C1506330pIl(baseProtoMessage.payload));
                        abstractC1136060ffY = (AbstractC1136060ffY) c0imdLJI.LIZJ(c1516680pZS);
                    } else {
                        abstractC1136060ffY = null;
                    }
                    if (abstractC1136060ffY != null) {
                        abstractC1136060ffY.generalMessageType = baseProtoMessage.msgType;
                        abstractC1136060ffY.isHistoryMessage = true;
                        abstractC1136060ffY.historyMessageFromApi = true;
                        abstractC1136060ffY.receiveTime = C158B.LIZ();
                        arrayList.add(abstractC1136060ffY);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return arrayList;
    }
}
