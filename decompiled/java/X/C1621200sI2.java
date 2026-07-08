package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sI2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621200sI2 extends AbstractC23051091l {
    public static final C1621200sI2 LIZ = new C1621200sI2();

    @Override // X.AbstractC23051091l
    public final boolean LIZ(Effect effect, String str) {
        if (!C1624570sNT.LJJIIZ(effect) && (effect == null || effect.getTags() == null || !effect.getTags().contains("audio_effect"))) {
            return false;
        }
        return true;
    }
}
