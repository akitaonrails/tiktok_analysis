package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0dPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049380dPk implements InterfaceC1049630dQ9, InterfaceC1010530cP5<InterfaceC1049390dPl> {
    public final InterfaceC1049390dPl LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;

    @Override // X.InterfaceC1049630dQ9
    public final Map<String, Object> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("query_times", Integer.valueOf(this.LLILLJJLI)), new Pair("query_times_since_last_ad", Integer.valueOf(this.LLILLL)));
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1049630dQ9
    public final int LIZLLL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1049390dPl Mh() {
        return this.LL;
    }

    public C1049380dPk(C1049370dPj c1049370dPj) {
        this.LL = c1049370dPj;
    }

    @Override // X.InterfaceC1049630dQ9
    public final void LIZJ(int i) {
        this.LLILZ = i;
    }

    @Override // X.InterfaceC1049630dQ9
    public final void LIZIZ(boolean z, boolean z2) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCommentRequestSucceeded: scene is ");
        sbLIZ.append(this.LL.getScene());
        sbLIZ.append(", isAdContent: ");
        sbLIZ.append(z);
        sbLIZ.append(", containAds: ");
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            return;
        }
        this.LLILLJJLI++;
        if (z2) {
            i = 0;
        } else {
            i = this.LLILLL + 1;
        }
        this.LLILLL = i;
    }
}
