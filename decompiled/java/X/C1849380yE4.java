package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yE4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849380yE4 {
    public final Object LIZ;
    public final Function2<JSONObject, Integer, C2220181Buy> LIZIZ;
    public final Function2<JSONObject, Integer, C2220181Buy> LIZJ;
    public final Function2<JSONObject, Integer, C2220181Buy> LIZLLL;
    public final Function2<JSONObject, Integer, C2220181Buy> LJ;
    public final Function2<JSONObject, Integer, C2220181Buy> LJFF;
    public final Function2<JSONObject, Integer, C2220181Buy> LJI;
    public final Function2<JSONObject, Integer, C2220181Buy> LJII;
    public final Function2<JSONObject, Integer, C2220181Buy> LJIIIIZZ;
    public final Function2<JSONObject, Integer, C2220181Buy> LJIIIZ;
    public final Function2<JSONObject, Integer, C2220181Buy> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1849380yE4)) {
            return false;
        }
        C1849380yE4 c1849380yE4 = (C1849380yE4) obj;
        return Intrinsics.LJFF(this.LIZ, c1849380yE4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1849380yE4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1849380yE4.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1849380yE4.LIZLLL) && Intrinsics.LJFF(this.LJ, c1849380yE4.LJ) && Intrinsics.LJFF(this.LJFF, c1849380yE4.LJFF) && Intrinsics.LJFF(this.LJI, c1849380yE4.LJI) && Intrinsics.LJFF(this.LJII, c1849380yE4.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1849380yE4.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1849380yE4.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1849380yE4.LJIIJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "StorageApiHandlers(owner=" + this.LIZ + ", setStorage=" + this.LIZIZ + ", getStorage=" + this.LIZJ + ", setStorageSync=" + this.LIZLLL + ", getStorageSync=" + this.LJ + ", removeStorage=" + this.LJFF + ", removeStorageSync=" + this.LJI + ", clearStorage=" + this.LJII + ", clearStorageSync=" + this.LJIIIIZZ + ", getStorageInfo=" + this.LJIIIZ + ", getStorageInfoSync=" + this.LJIIJ + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1849380yE4(Object obj, Function2<? super JSONObject, ? super Integer, C2220181Buy> function2, Function2<? super JSONObject, ? super Integer, C2220181Buy> function22, Function2<? super JSONObject, ? super Integer, C2220181Buy> function23, Function2<? super JSONObject, ? super Integer, C2220181Buy> function24, Function2<? super JSONObject, ? super Integer, C2220181Buy> function25, Function2<? super JSONObject, ? super Integer, C2220181Buy> function26, Function2<? super JSONObject, ? super Integer, C2220181Buy> function27, Function2<? super JSONObject, ? super Integer, C2220181Buy> function28, Function2<? super JSONObject, ? super Integer, C2220181Buy> function29, Function2<? super JSONObject, ? super Integer, C2220181Buy> function210) {
        this.LIZ = obj;
        this.LIZIZ = function2;
        this.LIZJ = function22;
        this.LIZLLL = function23;
        this.LJ = function24;
        this.LJFF = function25;
        this.LJI = function26;
        this.LJII = function27;
        this.LJIIIIZZ = function28;
        this.LJIIIZ = function29;
        this.LJIIJ = function210;
    }
}
