package X;

import android.util.SparseArray;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YP2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YP2 {
    public final InterfaceC1265604xK LIZ;
    public final int LIZIZ;
    public final C0I25 LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, String> LJFF;
    public final Map<String, String> LJI;
    public final ByteString LJII;
    public final ByteString LJIIIIZZ;
    public final SparseArray<Object> LJIIIZ;
    public final List<C0YC6> LJIIJ;
    public final ReferenceInfo LJIIJJI;
    public final List<InterfaceC1265204xG> LJIIL;
    public final List<Long> LJIILIIL;

    public C0YP2() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YP2)) {
            return false;
        }
        C0YP2 c0yp2 = (C0YP2) obj;
        return Intrinsics.LJFF(this.LIZ, c0yp2.LIZ) && this.LIZIZ == c0yp2.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0yp2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0yp2.LIZLLL) && Intrinsics.LJFF(this.LJ, c0yp2.LJ) && Intrinsics.LJFF(this.LJFF, c0yp2.LJFF) && Intrinsics.LJFF(this.LJI, c0yp2.LJI) && Intrinsics.LJFF(this.LJII, c0yp2.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0yp2.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0yp2.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0yp2.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0yp2.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0yp2.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c0yp2.LJIILIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Map<String, String> map = this.LJFF;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        ByteString byteString = this.LJII;
        int iHashCode4 = (iHashCode3 + (byteString == null ? 0 : byteString.hashCode())) * 31;
        ByteString byteString2 = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (byteString2 == null ? 0 : byteString2.hashCode())) * 31;
        SparseArray<Object> sparseArray = this.LJIIIZ;
        int iHashCode6 = (iHashCode5 + (sparseArray == null ? 0 : sparseArray.hashCode())) * 31;
        List<C0YC6> list = this.LJIIJ;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        ReferenceInfo referenceInfo = this.LJIIJJI;
        int iHashCode8 = (iHashCode7 + (referenceInfo == null ? 0 : referenceInfo.hashCode())) * 31;
        List<InterfaceC1265204xG> list2 = this.LJIIL;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Long> list3 = this.LJIILIIL;
        return iHashCode9 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "SendMessageParams(target=" + this.LIZ + ", msgType=" + this.LIZIZ + ", content=" + this.LIZJ + ", scene=" + this.LIZLLL + ", source=" + this.LJ + ", ext=" + this.LJFF + ", localExt=" + this.LJI + ", persistentExt=" + this.LJII + ", transientExt=" + this.LJIIIIZZ + ", localCache=" + this.LJIIIZ + ", preUploadedAttachments=" + this.LJIIJ + ", refMsgInfo=" + this.LJIIJJI + ", mentionedUsers=" + this.LJIIL + ", visibleUids=" + this.LJIILIIL + ')';
    }

    public C0YP2(InterfaceC1265604xK interfaceC1265604xK, int i, C0I25 c0i25, String str, String str2, Map map, Map map2, ByteString byteString, ByteString byteString2, SparseArray sparseArray, List list, ReferenceInfo referenceInfo, int i2) {
        str = (i2 & 8) != 0 ? "" : str;
        str2 = (i2 & 16) != 0 ? "" : str2;
        map = (i2 & 32) != 0 ? null : map;
        map2 = (i2 & 64) != 0 ? null : map2;
        byteString = (i2 & 128) != 0 ? null : byteString;
        byteString2 = (i2 & 256) != 0 ? null : byteString2;
        sparseArray = (i2 & 512) != 0 ? null : sparseArray;
        list = (i2 & 1024) != 0 ? null : list;
        referenceInfo = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : referenceInfo;
        this.LIZ = interfaceC1265604xK;
        this.LIZIZ = i;
        this.LIZJ = c0i25;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = map;
        this.LJI = map2;
        this.LJII = byteString;
        this.LJIIIIZZ = byteString2;
        this.LJIIIZ = sparseArray;
        this.LJIIJ = list;
        this.LJIIJJI = referenceInfo;
        this.LJIIL = null;
        this.LJIILIIL = null;
    }
}
