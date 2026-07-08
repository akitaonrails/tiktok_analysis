package X;

import android.util.SparseArray;
import com.bytedance.im.core.proto.ReferenceInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YP1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YP1 implements C0YHT {
    public final ByteString LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final List<C0YC6> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Map<String, String> LJI;
    public final Map<String, String> LJII;
    public final SparseArray<Object> LJIIIIZZ;
    public final ReferenceInfo LJIIIZ;
    public final ByteString LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YP1)) {
            return false;
        }
        C0YP1 c0yp1 = (C0YP1) obj;
        return Intrinsics.LJFF(this.LIZ, c0yp1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yp1.LIZIZ) && this.LIZJ == c0yp1.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0yp1.LIZLLL) && Intrinsics.LJFF(this.LJ, c0yp1.LJ) && Intrinsics.LJFF(this.LJFF, c0yp1.LJFF) && Intrinsics.LJFF(this.LJI, c0yp1.LJI) && Intrinsics.LJFF(this.LJII, c0yp1.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0yp1.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0yp1.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0yp1.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0yp1.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0yp1.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        Map<String, String> map = this.LJI;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.LJII;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        SparseArray<Object> sparseArray = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (sparseArray == null ? 0 : sparseArray.hashCode())) * 31;
        ReferenceInfo referenceInfo = this.LJIIIZ;
        int iHashCode5 = (iHashCode4 + (referenceInfo == null ? 0 : referenceInfo.hashCode())) * 31;
        ByteString byteString = this.LJIIJ;
        int iHashCode6 = (iHashCode5 + (byteString == null ? 0 : byteString.hashCode())) * 31;
        String str = this.LJIIJJI;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIIL;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CreateMediaMsg(contentPb=" + this.LIZ + ", conversationId=" + this.LIZIZ + ", messageType=" + this.LIZJ + ", attachmentList=" + this.LIZLLL + ", scene=" + this.LJ + ", source=" + this.LJFF + ", ext=" + this.LJI + ", localExt=" + this.LJII + ", localCache=" + this.LJIIIIZZ + ", referenceInfo=" + this.LJIIIZ + ", persistentExt=" + this.LJIIJ + ", msgUuid=" + this.LJIIJJI + ", contentString=" + this.LJIIL + ')';
    }

    @Override // X.C0YHT
    public final String LIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0YP1(ByteString byteString, String str, int i, List list, String str2, Map map, Map map2, SparseArray sparseArray, ReferenceInfo referenceInfo, ByteString byteString2, int i2) {
        String str3;
        ByteString byteString3 = byteString2;
        ReferenceInfo referenceInfo2 = referenceInfo;
        SparseArray sparseArray2 = sparseArray;
        Map map3 = map2;
        Map map4 = map;
        if ((i2 & 32) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this(byteString, str, i, list, str2, str3, (i2 & 64) != 0 ? null : map4, (i2 & 128) != 0 ? null : map3, (i2 & 256) != 0 ? null : sparseArray2, (i2 & 512) != 0 ? null : referenceInfo2, (i2 & 1024) != 0 ? null : byteString3, null, null);
    }

    public C0YP1(ByteString byteString, String str, int i, List<C0YC6> list, String str2, String str3, Map<String, String> map, Map<String, String> map2, SparseArray<Object> sparseArray, ReferenceInfo referenceInfo, ByteString byteString2, String str4, String str5) {
        this.LIZ = byteString;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = list;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = map;
        this.LJII = map2;
        this.LJIIIIZZ = sparseArray;
        this.LJIIIZ = referenceInfo;
        this.LJIIJ = byteString2;
        this.LJIIJJI = str4;
        this.LJIIL = str5;
    }
}
