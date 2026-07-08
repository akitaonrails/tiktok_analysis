package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0PWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646220PWi implements InterfaceC652950PjJ {
    public final InterfaceC648270Pbl LL;

    @Override // X.InterfaceC652950PjJ
    public final void LJLJJI() {
    }

    public C646220PWi(InterfaceC648270Pbl interfaceC648270Pbl) {
        this.LL = interfaceC648270Pbl;
    }

    @Override // X.InterfaceC652950PjJ
    public final void LLLFF(Aweme aweme) {
        String simpleName;
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayVideo: ");
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        String aid = null;
        if (interfaceC648270Pbl != null) {
            simpleName = interfaceC648270Pbl.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append('@');
        InterfaceC648270Pbl interfaceC648270Pbl2 = this.LL;
        if (interfaceC648270Pbl2 != null) {
            numValueOf = Integer.valueOf(interfaceC648270Pbl2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", aid: ");
        if (aweme != null) {
            aid = aweme.getAid();
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LL != null) {
            C646200PWg.LIZIZ = new WeakReference<>(this.LL);
            C646200PWg.LJ(this.LL);
        }
    }
}
