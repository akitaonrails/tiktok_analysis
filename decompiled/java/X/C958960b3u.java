package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0b3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958960b3u implements InterfaceC962060b8u {
    public final /* synthetic */ C958940b3s LIZ;

    @Override // X.InterfaceC962060b8u
    public final long LIZ() {
        C940490aa7 c940490aa7 = this.LIZ.LLILZLL;
        if (c940490aa7 != null) {
            return c940490aa7.LIZ;
        }
        return 0L;
    }

    @Override // X.InterfaceC962060b8u
    public final long LIZIZ() {
        Long l;
        C940490aa7 c940490aa7 = this.LIZ.LLILZLL;
        if (c940490aa7 == null || (l = c940490aa7.LIZIZ) == null) {
            return 0L;
        }
        return l.longValue();
    }

    @Override // X.InterfaceC962060b8u
    public final C958950b3t LIZLLL() {
        C958940b3s c958940b3s = this.LIZ;
        ConcurrentHashMap<String, C958950b3t> concurrentHashMap = c958940b3s.LLJJJJJIL;
        String str = c958940b3s.LLJJI;
        if (str == null) {
            str = "";
        }
        return concurrentHashMap.get(str);
    }

    @Override // X.InterfaceC962060b8u
    public final long LJFF() {
        return this.LIZ.LLJJIII == EnumC467700IVs.CROSS_ROOM_ARCH.getType() ? this.LIZ.LLJJIJI : this.LIZ.LLJJ;
    }

    @Override // X.InterfaceC962060b8u
    public final List<C958950b3t> LJI() {
        return Collections.list(this.LIZ.LLJJJJJIL.elements());
    }

    @Override // X.InterfaceC962060b8u
    public final DataChannel getDataChannel() {
        LiveWidget liveWidget;
        C940490aa7 c940490aa7 = this.LIZ.LLILZLL;
        if (c940490aa7 == null || (liveWidget = c940490aa7.LJI) == null) {
            return null;
        }
        return liveWidget.dataChannel;
    }

    @Override // X.InterfaceC962060b8u
    public final C958950b3t LIZJ() {
        C958950b3t next;
        Iterator<C958950b3t> it2 = LJI().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            C958950b3t c958950b3t = next;
            C958950b3t c958950b3tLIZLLL = LIZLLL();
            if (c958950b3tLIZLLL == null || c958950b3t.LIZIZ != c958950b3tLIZLLL.LIZIZ) {
                break;
            }
        }
        return next;
    }

    public C958960b3u(C958940b3s c958940b3s) {
        this.LIZ = c958940b3s;
    }

    @Override // X.InterfaceC962060b8u
    public final C958950b3t LJ(String str) {
        return this.LIZ.LLJJJJJIL.get(str);
    }
}
