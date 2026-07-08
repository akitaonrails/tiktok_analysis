package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.chatlist.impl.core.refactor.prbocessor.IMUnreadMsgPortraitObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Ynn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885050Ynn implements InterfaceC878540YdI {
    public final String LIZ = C461720I8s.LIZIZ();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(349));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1300));

    @Override // X.InterfaceC878540YdI
    public final void LIZIZ(InterfaceC879010Ye3 interfaceC879010Ye3, String str) {
    }

    @Override // X.InterfaceC878540YdI
    public final void LIZ(InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends InterfaceC1491305sd> list, List<? extends InterfaceC1491305sd> list2, String str) {
        if (list.isEmpty()) {
            return;
        }
        for (InterfaceC1491305sd interfaceC1491305sd : list) {
            if (interfaceC1491305sd instanceof AnonymousClass0617) {
                Object value = this.LIZIZ.getValue();
                String conversationId = ((AnonymousClass0617) interfaceC1491305sd).getConversationId();
                Keva keva = (Keva) this.LIZJ.getValue();
                value.getClass();
                keva.erase(conversationId);
                IMUnreadMsgPortraitObserver.LIZ(keva);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC878540YdI
    public final void LIZJ(InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends C879540Yeu<?>> list, List<? extends C879540Yeu<?>> list2, String str) {
        if (list.isEmpty()) {
            return;
        }
        Iterator<? extends C879540Yeu<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            T t = it2.next().LIZJ;
            if (t instanceof C0Y8T) {
                Object value = this.LIZIZ.getValue();
                Keva keva = (Keva) this.LIZJ.getValue();
                value.getClass();
                IMUnreadMsgPortraitObserver.LIZIZ((C0Y8T) t, keva);
            }
        }
    }

    @Override // X.InterfaceC878540YdI
    public final void LIZLLL(InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends C879540Yeu<?>> list, List<? extends C879540Yeu<?>> list2, C878550YdJ c878550YdJ, boolean z, boolean z2, String str) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends C879540Yeu<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            T t = it2.next().LIZJ;
            if ((t instanceof C0Y8T) && t != 0) {
                arrayList.add(t);
            }
        }
        int size = 100;
        if (arrayList.size() < 100) {
            size = arrayList.size();
        }
        for (C0Y8T c0y8t : arrayList.subList(0, size)) {
            Object value = this.LIZIZ.getValue();
            Keva keva = (Keva) this.LIZJ.getValue();
            value.getClass();
            IMUnreadMsgPortraitObserver.LIZIZ(c0y8t, keva);
        }
    }
}
