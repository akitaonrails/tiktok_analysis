package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388440FKw {
    public final TextStickerModel LIZ;
    public final C390420FSm LIZIZ;
    public final C0FHM LIZJ;
    public final C0FSC LIZLLL;

    public C388440FKw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C388440FKw)) {
            return false;
        }
        C388440FKw c388440FKw = (C388440FKw) obj;
        return Intrinsics.LJFF(this.LIZ, c388440FKw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c388440FKw.LIZIZ) && this.LIZJ == c388440FKw.LIZJ && Intrinsics.LJFF(this.LIZLLL, c388440FKw.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C0FSC c0fsc = this.LIZLLL;
        return iHashCode + (c0fsc == null ? 0 : c0fsc.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPTextEditPanelStatesOld(textStickerModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stickerObjectContainer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", editPanelUIState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stickerEditListener=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C388440FKw(int i) {
        this(new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null), new C390420FSm(), C0FHM.GONE, null);
    }

    public static C388440FKw LIZ(C388440FKw c388440FKw, C0FHM c0fhm) {
        TextStickerModel textStickerModel = c388440FKw.LIZ;
        C390420FSm c390420FSm = c388440FKw.LIZIZ;
        C0FSC c0fsc = c388440FKw.LIZLLL;
        c388440FKw.getClass();
        return new C388440FKw(textStickerModel, c390420FSm, c0fhm, c0fsc);
    }

    public C388440FKw(TextStickerModel textStickerModel, C390420FSm c390420FSm, C0FHM c0fhm, C0FSC c0fsc) {
        this.LIZ = textStickerModel;
        this.LIZIZ = c390420FSm;
        this.LIZJ = c0fhm;
        this.LIZLLL = c0fsc;
    }
}
