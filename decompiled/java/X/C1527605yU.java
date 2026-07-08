package X;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05yU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1527605yU {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(h hVar, h hVar2) {
        k kVarLJJIIJZLJL;
        if (hVar.size() != hVar2.size()) {
            return false;
        }
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            k kVarLJJIIJZLJL2 = null;
            if (i < hVar.size()) {
                kVarLJJIIJZLJL = hVar.LJJIIJZLJL(i);
            } else {
                kVarLJJIIJZLJL = null;
            }
            if (i < hVar2.size()) {
                kVarLJJIIJZLJL2 = hVar2.LJJIIJZLJL(i);
            }
            if (kVarLJJIIJZLJL == null || (kVarLJJIIJZLJL instanceof m) || kVarLJJIIJZLJL2 == null || (kVarLJJIIJZLJL2 instanceof m)) {
                return false;
            }
            if (!Intrinsics.LJFF(kVarLJJIIJZLJL, kVarLJJIIJZLJL2)) {
                if ((kVarLJJIIJZLJL instanceof n) && (kVarLJJIIJZLJL2 instanceof n)) {
                    if (!LIZIZ(kVarLJJIIJZLJL.LJIILIIL(), kVarLJJIIJZLJL2.LJIILIIL())) {
                        return false;
                    }
                } else if ((kVarLJJIIJZLJL instanceof h) && (kVarLJJIIJZLJL2 instanceof h)) {
                    if (!LIZ(kVarLJJIIJZLJL.LJIIL(), kVarLJJIIJZLJL2.LJIIL())) {
                        return false;
                    }
                } else if (!(kVarLJJIIJZLJL instanceof q) || !(kVarLJJIIJZLJL2 instanceof q) || !Intrinsics.LJFF(kVarLJJIIJZLJL, kVarLJJIIJZLJL2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LIZIZ(n nVar, n nVar2) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(nVar.LJJIJIL());
        linkedHashSet.addAll(nVar2.LJJIJIL());
        for (String str : linkedHashSet) {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            k kVarLJJIIZ2 = nVar2.LJJIIZ(str);
            if (kVarLJJIIZ != null && !(kVarLJJIIZ instanceof m) && kVarLJJIIZ2 != null && !(kVarLJJIIZ2 instanceof m)) {
                if (!Intrinsics.LJFF(kVarLJJIIZ, kVarLJJIIZ2)) {
                    if ((kVarLJJIIZ instanceof n) && (kVarLJJIIZ2 instanceof n)) {
                        return LIZIZ(kVarLJJIIZ.LJIILIIL(), kVarLJJIIZ2.LJIILIIL());
                    }
                    if ((kVarLJJIIZ instanceof h) && (kVarLJJIIZ2 instanceof h)) {
                        return LIZ(kVarLJJIIZ.LJIIL(), kVarLJJIIZ2.LJIIL());
                    }
                    if ((kVarLJJIIZ instanceof q) && (kVarLJJIIZ2 instanceof q)) {
                        return Intrinsics.LJFF(kVarLJJIIZ, kVarLJJIIZ2);
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
