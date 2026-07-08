package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.logic.SoundEffectTabModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19553411em {
    public final ArrayList<SoundEffectTabModel> LIZ;
    public final C375830EoP<Integer> LIZIZ;
    public final C19553611eo LIZJ;

    public C19553411em() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19553411em)) {
            return false;
        }
        C19553411em c19553411em = (C19553411em) obj;
        return Intrinsics.LJFF(this.LIZ, c19553411em.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19553411em.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c19553411em.LIZJ);
    }

    public final int hashCode() {
        ArrayList<SoundEffectTabModel> arrayList = this.LIZ;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        C375830EoP<Integer> c375830EoP = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C19553611eo c19553611eo = this.LIZJ;
        return iHashCode2 + (c19553611eo != null ? c19553611eo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundEffectStates(tabList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showTipEvent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectedEffectItem=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19553411em(ArrayList<SoundEffectTabModel> arrayList, C375830EoP<Integer> c375830EoP, C19553611eo c19553611eo) {
        this.LIZ = arrayList;
        this.LIZIZ = c375830EoP;
        this.LIZJ = c19553611eo;
    }

    public static C19553411em LIZ(C19553411em c19553411em, ArrayList arrayList, C375830EoP c375830EoP, C19553611eo c19553611eo, int i) {
        if ((i & 1) != 0) {
            arrayList = c19553411em.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP = c19553411em.LIZIZ;
        }
        if ((i & 4) != 0) {
            c19553611eo = c19553411em.LIZJ;
        }
        c19553411em.getClass();
        return new C19553411em(arrayList, c375830EoP, c19553611eo);
    }
}
