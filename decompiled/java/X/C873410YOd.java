package X;

import android.util.SparseArray;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873410YOd {
    public final InterfaceC1265604xK LIZ;
    public final int LIZIZ;
    public final C0I25 LIZJ;
    public final List<C0YC6> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Map<String, String> LJI;
    public final Map<String, String> LJII;
    public final ByteString LJIIIIZZ;
    public final SparseArray<Object> LJIIIZ;
    public final ReferenceInfo LJIIJ;
    public final List<AbstractC873650YPb> LJIIJJI;
    public final C0Y3I LJIIL;

    public C873410YOd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873410YOd)) {
            return false;
        }
        C873410YOd c873410YOd = (C873410YOd) obj;
        return Intrinsics.LJFF(this.LIZ, c873410YOd.LIZ) && this.LIZIZ == c873410YOd.LIZIZ && Intrinsics.LJFF(this.LIZJ, c873410YOd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c873410YOd.LIZLLL) && Intrinsics.LJFF(this.LJ, c873410YOd.LJ) && Intrinsics.LJFF(this.LJFF, c873410YOd.LJFF) && Intrinsics.LJFF(this.LJI, c873410YOd.LJI) && Intrinsics.LJFF(this.LJII, c873410YOd.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c873410YOd.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c873410YOd.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c873410YOd.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c873410YOd.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c873410YOd.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        Map<String, String> map = this.LJI;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.LJII;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        ByteString byteString = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (byteString == null ? 0 : byteString.hashCode())) * 31;
        SparseArray<Object> sparseArray = this.LJIIIZ;
        int iHashCode5 = (iHashCode4 + (sparseArray == null ? 0 : sparseArray.hashCode())) * 31;
        ReferenceInfo referenceInfo = this.LJIIJ;
        int iHashCode6 = (iHashCode5 + (referenceInfo == null ? 0 : referenceInfo.hashCode())) * 31;
        List<AbstractC873650YPb> list = this.LJIIJJI;
        return ((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31) + this.LJIIL.hashCode();
    }

    public final String toString() {
        return "MediaMessageParams(target=" + this.LIZ + ", msgType=" + this.LIZIZ + ", content=" + this.LIZJ + ", attachmentList=" + this.LIZLLL + ", scene=" + this.LJ + ", source=" + this.LJFF + ", ext=" + this.LJI + ", localExt=" + this.LJII + ", persistentExt=" + this.LJIIIIZZ + ", localCache=" + this.LJIIIZ + ", refMsgInfo=" + this.LJIIJ + ", extraStepsBeforeSending=" + this.LJIIJJI + ", tracer=" + this.LJIIL + ')';
    }

    public C873410YOd(C1265504xJ c1265504xJ, int i, C460190I2v c460190I2v, List list, String str, Map map, Map map2, ByteString byteString, SparseArray sparseArray, ReferenceInfo referenceInfo, List list2, C0Y3I c0y3i, int i2) {
        C0Y3I c0y3i2 = c0y3i;
        str = (i2 & 16) != 0 ? "" : str;
        String str2 = (i2 & 32) == 0 ? null : "";
        map = (i2 & 64) != 0 ? null : map;
        map2 = (i2 & 128) != 0 ? null : map2;
        byteString = (i2 & 256) != 0 ? null : byteString;
        sparseArray = (i2 & 512) != 0 ? null : sparseArray;
        referenceInfo = (i2 & 1024) != 0 ? null : referenceInfo;
        List list3 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? list2 : null;
        c0y3i2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new C0Y3I("media-send") : c0y3i2;
        this.LIZ = c1265504xJ;
        this.LIZIZ = i;
        this.LIZJ = c460190I2v;
        this.LIZLLL = list;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = map;
        this.LJII = map2;
        this.LJIIIIZZ = byteString;
        this.LJIIIZ = sparseArray;
        this.LJIIJ = referenceInfo;
        this.LJIIJJI = list3;
        this.LJIIL = c0y3i2;
    }
}
