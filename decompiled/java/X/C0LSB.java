package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LSB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LSB extends C09JG {
    public final Source LIZ;
    public final CreativeInfo LIZIZ;
    public final String LIZJ;
    public final NLEEditor LIZLLL;
    public final INLEMediaSession LJ;
    public final String LJFF;
    public final int LJI;
    public final NLETrackSlot LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LSB)) {
            return false;
        }
        C0LSB c0lsb = (C0LSB) obj;
        return this.LIZ == c0lsb.LIZ && Intrinsics.LJFF(this.LIZIZ, c0lsb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lsb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lsb.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lsb.LJ) && Intrinsics.LJFF(this.LJFF, c0lsb.LJFF) && this.LJI == c0lsb.LJI && Intrinsics.LJFF(this.LJII, c0lsb.LJII);
    }

    public final int hashCode() {
        Source source = this.LIZ;
        int iHashCode = (((((((((((((source == null ? 0 : source.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI) * 31;
        NLETrackSlot nLETrackSlot = this.LJII;
        return iHashCode + (nLETrackSlot != null ? nLETrackSlot.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshFrameTaskInput(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slotId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nleEditor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", nleSession=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", effectResourceId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", seekCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", freezeSlot=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LSB(Source source, CreativeInfo creativeInfo, String str, NLEEditor nLEEditor, INLEMediaSession iNLEMediaSession, String str2, int i, NLETrackSlot nLETrackSlot) {
        this.LIZ = source;
        this.LIZIZ = creativeInfo;
        this.LIZJ = str;
        this.LIZLLL = nLEEditor;
        this.LJ = iNLEMediaSession;
        this.LJFF = str2;
        this.LJI = i;
        this.LJII = nLETrackSlot;
    }
}
