package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0M3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562370M3v extends C1619110sEf implements InterfaceC19330810jy {
    public InterfaceC539120LCk LL;
    public InnerPushMessage LLILLJJLI;
    public final ConcurrentHashMap<Long, C562360M3u> LLILLL = new ConcurrentHashMap<>();

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return new int[]{2515};
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        this.LL = c20663515tR;
        this.LLILLJJLI = innerPushMessage;
        Long lLIZ = C562410M3z.LIZ(innerPushMessage);
        if (lLIZ == null) {
            return null;
        }
        C562360M3u c562360M3u = this.LLILLL.get(Long.valueOf(lLIZ.longValue()));
        if (c562360M3u == null) {
            return null;
        }
        return new C20663815tU(0, c562360M3u);
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        InterfaceC1631620sYq<? super Boolean, ? super String, ? super Boolean, Unit> interfaceC1631620sYq;
        Long lLIZ = C562410M3z.LIZ(innerPushMessage);
        if (lLIZ != null) {
            C562360M3u c562360M3u = this.LLILLL.get(Long.valueOf(lLIZ.longValue()));
            if (c562360M3u != null && (interfaceC1631620sYq = c562360M3u.LLJIJIL) != null) {
                interfaceC1631620sYq.invoke(Boolean.valueOf(c562360M3u.LLJI), str, Boolean.valueOf(z));
            }
            if (lLIZ != null) {
                this.LLILLL.remove(Long.valueOf(lLIZ.longValue()));
            }
        }
    }
}
