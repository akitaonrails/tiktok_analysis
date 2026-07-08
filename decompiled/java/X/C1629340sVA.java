package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sVA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629340sVA {
    public final Effect LIZ;
    public final boolean LIZIZ;
    public final C1625440sOs LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerDownloadRequest(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAuto=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", request=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1629340sVA(Effect effect, boolean z, C1625440sOs c1625440sOs) {
        this.LIZ = effect;
        this.LIZIZ = z;
        this.LIZJ = c1625440sOs;
    }

    public /* synthetic */ C1629340sVA(Effect effect, boolean z, C1625440sOs c1625440sOs, int i) {
        this(effect, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : c1625440sOs);
    }
}
