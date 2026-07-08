package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nF8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427200nF8 extends AbstractC21342018fa {
    public final List<C1427080nEw> LIZ;
    public final List<C1427080nEw> LIZIZ;

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return this.LIZ.size();
    }

    public C1427200nF8(List<C1427080nEw> list, List<C1427080nEw> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        EffectModel effectModel;
        EffectModel effectModel2;
        Integer numValueOf;
        C1427080nEw c1427080nEw = (C1427080nEw) C13LP.LJJJLZIJ(i, this.LIZ);
        Integer numValueOf2 = null;
        if (c1427080nEw != null) {
            effectModel = c1427080nEw.LIZ;
        } else {
            effectModel = null;
        }
        C1427080nEw c1427080nEw2 = (C1427080nEw) C13LP.LJJJLZIJ(i2, this.LIZIZ);
        if (c1427080nEw2 != null) {
            effectModel2 = c1427080nEw2.LIZ;
        } else {
            effectModel2 = null;
        }
        if (Intrinsics.LJFF(effectModel, effectModel2)) {
            C1427080nEw c1427080nEw3 = (C1427080nEw) C13LP.LJJJLZIJ(i, this.LIZ);
            if (c1427080nEw3 != null) {
                numValueOf = Integer.valueOf(c1427080nEw3.LIZIZ);
            } else {
                numValueOf = null;
            }
            C1427080nEw c1427080nEw4 = (C1427080nEw) C13LP.LJJJLZIJ(i2, this.LIZIZ);
            if (c1427080nEw4 != null) {
                numValueOf2 = Integer.valueOf(c1427080nEw4.LIZIZ);
            }
            if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        String str;
        EffectModel effectModel;
        EffectModel effectModel2;
        C1427080nEw c1427080nEw = (C1427080nEw) C13LP.LJJJLZIJ(i, this.LIZ);
        String str2 = null;
        if (c1427080nEw != null && (effectModel2 = c1427080nEw.LIZ) != null) {
            str = effectModel2.resId;
        } else {
            str = null;
        }
        C1427080nEw c1427080nEw2 = (C1427080nEw) C13LP.LJJJLZIJ(i2, this.LIZIZ);
        if (c1427080nEw2 != null && (effectModel = c1427080nEw2.LIZ) != null) {
            str2 = effectModel.resId;
        }
        return Intrinsics.LJFF(str, str2);
    }
}
