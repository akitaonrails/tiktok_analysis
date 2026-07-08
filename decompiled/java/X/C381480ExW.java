package X;

import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0ExW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381480ExW {
    public final NLETrackSlot LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final NLEEditor LJ;
    public final INLEPlayer LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CombineEffectInput(cacheDir='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', magicResourceId='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', magicEffectId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", nleEditor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", nlePlayer=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", combineEffectSlot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C381480ExW(NLETrackSlot nLETrackSlot, String str, String str2, String str3, NLEEditor nLEEditor, INLEPlayer iNLEPlayer, boolean z, boolean z2, boolean z3, int i) {
        z = (i & 64) != 0 ? false : z;
        z2 = (i & 128) != 0 ? false : z2;
        z3 = (i & 256) != 0 ? true : z3;
        this.LIZ = nLETrackSlot;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = nLEEditor;
        this.LJFF = iNLEPlayer;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
    }
}
