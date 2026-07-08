package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715460S4q extends C09AY implements Function2<TranslationStatusAssem, C0S5P, Unit> {
    public C715460S4q() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(TranslationStatusAssem translationStatusAssem, C0S5P c0s5p) {
        TranslationStatusAssem translationStatusAssem2 = translationStatusAssem;
        C0S5P c0s5p2 = c0s5p;
        if (!(c0s5p2 instanceof C0S5K) && !Intrinsics.LJFF(c0s5p2, C709290Rrz.LIZIZ)) {
            if (c0s5p2 instanceof C0S5L) {
                C0S5L c0s5l = (C0S5L) c0s5p2;
                C0S5M c0s5m = c0s5l.LJ;
                if (c0s5m != null && c0s5m.LIZIZ) {
                    translationStatusAssem2.Jp(c0s5l);
                } else {
                    IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) translationStatusAssem2.LLLILZ.getValue();
                    if (iVideoCellAbility != null) {
                        iVideoCellAbility.Es(false);
                    }
                }
            }
        } else {
            IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) translationStatusAssem2.LLLILZ.getValue();
            if (iVideoCellAbility2 != null) {
                iVideoCellAbility2.Es(false);
            }
        }
        return Unit.LIZ;
    }
}
