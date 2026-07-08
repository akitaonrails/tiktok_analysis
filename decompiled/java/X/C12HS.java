package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12HS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HS implements C12H6 {
    @Override // X.C12H6
    public final boolean LIZIZ(BeautyCategoryExtra beautyCategoryExtra) {
        return BeautyContext.INSTANCE.isCorrectRegion(beautyCategoryExtra);
    }

    @Override // X.C12H6
    public final boolean LIZ(BeautyFilterConfig beautyFilterConfig, BeautyCategoryExtra beautyCategoryExtra) {
        int iLJIIIIZZ = C12HP.LJIIIIZZ(beautyCategoryExtra.abGroup);
        int i = beautyFilterConfig.abGroup;
        if (iLJIIIIZZ != i && i != -1) {
            return false;
        }
        return true;
    }

    @Override // X.C12H6
    public final boolean LIZJ(BeautyFilterConfig beautyFilterConfig, List<BeautyCategory> list) {
        BeautyCategory next;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Iterator<BeautyCategory> it2 = list.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!Intrinsics.LJFF(next.getBeautyCategoryExtra().panelType, EnumC19731112Ht.ALL.getFlag()));
        if (next != null) {
            z = true;
        } else {
            z = false;
        }
        Iterator<BeautyCategory> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            BeautyCategory next2 = it3.next();
            if (Intrinsics.LJFF(next2.getBeautyCategoryExtra().panelType, EnumC19731112Ht.MALE.getFlag())) {
                if (next2 != null) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        Iterator<BeautyCategory> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            BeautyCategory next3 = it4.next();
            if (Intrinsics.LJFF(next3.getBeautyCategoryExtra().panelType, EnumC19731112Ht.FEMALE.getFlag())) {
                if (next3 != null) {
                    z3 = true;
                }
            }
        }
        z3 = false;
        Iterator<BeautyCategory> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            BeautyCategory next4 = it5.next();
            if (LIZ(beautyFilterConfig, next4.getBeautyCategoryExtra())) {
                if (next4 != null) {
                    z4 = true;
                }
            }
        }
        z4 = false;
        Iterator<BeautyCategory> it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            BeautyCategory next5 = it6.next();
            if (LIZIZ(next5.getBeautyCategoryExtra())) {
                if (next5 != null) {
                    z5 = true;
                }
            }
        }
        z5 = false;
        if (z || (z2 && z3)) {
            z6 = true;
        } else {
            z6 = false;
        }
        C19570511hX.LIZIZ("LJT isPanelValid: validGender:" + z6 + " all:" + z + " m:" + z2 + " f:" + z3 + " group:" + z4 + " region:" + z5);
        if ((!list.isEmpty()) && z6 && z4 && z5) {
            return true;
        }
        return false;
    }
}
