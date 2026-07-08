package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sIE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621320sIE extends AbstractC23051091l {
    public static final C1621320sIE LIZ = new C1621320sIE();

    @Override // X.AbstractC23051091l
    public final boolean LIZ(Effect effect, String str) {
        if (effect.getTags() != null && effect.getTags().contains("forbid_for_all_duet")) {
            return true;
        }
        return false;
    }
}
