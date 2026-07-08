package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0IdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470870IdJ implements InterfaceC470690Id1 {
    public final Map<String, C470880IdK> LIZ = new ConcurrentHashMap();
    public final C11PQ<Boolean> LIZIZ = C11PQ.LJLLLLLL(Boolean.FALSE);
    public final List<InterfaceC467840IWg> LIZJ = new LinkedList();
    public final C089I LIZLLL = new C089I();
    public boolean LJ;

    @Override // X.InterfaceC470690Id1
    public final void LIZIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LIZIZ.onNext(Boolean.TRUE);
    }

    @Override // X.InterfaceC470690Id1
    public final void LIZJ(InterfaceC470890IdL interfaceC470890IdL) {
        if (interfaceC470890IdL != null) {
            C470880IdK c470880IdK = (C470880IdK) ((ConcurrentHashMap) this.LIZ).get("live");
            if (c470880IdK == null) {
                c470880IdK = new C470880IdK(interfaceC470890IdL);
                ((ConcurrentHashMap) this.LIZ).put("live", c470880IdK);
            }
            if (c470880IdK.LIZ != interfaceC470890IdL) {
                c470880IdK.LIZ = interfaceC470890IdL;
            }
            c470880IdK.LIZIZ++;
        }
    }

    @Override // X.InterfaceC470690Id1
    public final void LIZLLL(InterfaceC470840IdG interfaceC470840IdG) {
        this.LIZLLL.add(interfaceC470840IdG);
    }

    @Override // X.InterfaceC470690Id1
    public final void LJ(InterfaceC467840IWg interfaceC467840IWg) {
        ((LinkedList) this.LIZJ).remove(interfaceC467840IWg);
    }

    @Override // X.InterfaceC470690Id1
    public final boolean LJFF(InterfaceC470890IdL interfaceC470890IdL) {
        if (interfaceC470890IdL != null) {
            C470880IdK c470880IdK = (C470880IdK) ((ConcurrentHashMap) this.LIZ).get("live");
            if (c470880IdK != null) {
                int i = c470880IdK.LIZIZ - 1;
                c470880IdK.LIZIZ = i;
                if (i <= 0) {
                    ((ConcurrentHashMap) this.LIZ).remove("live");
                }
                if (c470880IdK.LIZIZ != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC470690Id1
    public final void LJI(C470860IdI c470860IdI) {
        this.LIZLLL.remove(c470860IdI);
    }

    @Override // X.InterfaceC470690Id1
    public final void LJII(InterfaceC467840IWg interfaceC467840IWg) {
        ((LinkedList) this.LIZJ).add(interfaceC467840IWg);
    }

    @Override // X.InterfaceC470690Id1
    public final void LIZ(String str, List<FeedItem> list, FeedExtra feedExtra, boolean z) {
        if (C0IKQ.LIZIZ(this.LIZJ)) {
            Iterator<InterfaceC467840IWg> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(str, list, feedExtra, z);
            }
        }
    }
}
