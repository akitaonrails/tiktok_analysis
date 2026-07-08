package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623490sLj extends AbstractC23051091l {
    public static final C1623490sLj LIZ = new C1623490sLj();

    @Override // X.AbstractC23051091l
    public final boolean LIZ(Effect effect, String str) {
        if (!effect.isBusiness() && !C1624200sMs.LJIILIIL(effect)) {
            C1446130njf.LIZ.getClass();
            if (!C1446130njf.LIZIZ(effect, "prop_block_story", false)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
