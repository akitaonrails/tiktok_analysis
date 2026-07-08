package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Z8W, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8W extends C09AY implements Function1<List<InterfaceC884440Ymo>, List<? extends InterfaceC884440Ymo>> {
    public C0Z8W() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends InterfaceC884440Ymo> invoke(List<InterfaceC884440Ymo> list) {
        IMUserBizInfo imUserBizInfo;
        IMUser imUser;
        IMUserBizInfo imUserBizInfo2;
        IMUserBizInfo imUserBizInfo3;
        IMUser imUser2;
        IMUserBizInfo imUserBizInfo4;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC884440Ymo interfaceC884440Ymo : list) {
            if (interfaceC884440Ymo instanceof C0Z8N) {
                C1ED8.LIZ.getClass();
                if (!((Boolean) C1ED8.LJII.getValue()).booleanValue()) {
                    ((C0Z8N) interfaceC884440Ymo).setAvatar(null);
                }
                C0Z8N c0z8n = (C0Z8N) interfaceC884440Ymo;
                if (!(c0z8n.getAvatar() instanceof Serializable)) {
                    c0z8n.setAvatar(null);
                }
                if (!(c0z8n.getContent() instanceof Serializable)) {
                    c0z8n.setContent("");
                }
                IMUser imUser3 = c0z8n.getExtra().getImUser();
                if (imUser3 != null && (imUserBizInfo3 = imUser3.getImUserBizInfo()) != null && imUserBizInfo3.getCameraInfo() != null && (imUser2 = c0z8n.getExtra().getImUser()) != null && (imUserBizInfo4 = imUser2.getImUserBizInfo()) != null) {
                    imUserBizInfo4.setCameraInfo(null);
                }
                IMUser imUser4 = c0z8n.getExtra().getImUser();
                if (imUser4 != null && (imUserBizInfo = imUser4.getImUserBizInfo()) != null && imUserBizInfo.getChatBotInfo() != null && (imUser = c0z8n.getExtra().getImUser()) != null && (imUserBizInfo2 = imUser.getImUserBizInfo()) != null) {
                    imUserBizInfo2.setChatBotInfo(null);
                }
            } else if (interfaceC884440Ymo instanceof C0Z8O) {
                C1ED8.LIZ.getClass();
                if (!((Boolean) C1ED8.LJII.getValue()).booleanValue()) {
                    ((C0Z8O) interfaceC884440Ymo).setAvatar(null);
                }
                C0Z8O c0z8o = (C0Z8O) interfaceC884440Ymo;
                if (!(c0z8o.getAvatar() instanceof Serializable)) {
                    c0z8o.setAvatar(null);
                }
                if (!(c0z8o.getContent() instanceof Serializable)) {
                    c0z8o.setContent("");
                }
            }
            if (interfaceC884440Ymo != null) {
                arrayList.add(interfaceC884440Ymo);
            }
        }
        C1ED8.LIZ.getClass();
        return C13LP.LL(arrayList, C1ED8.LIZ().voListSize);
    }
}
