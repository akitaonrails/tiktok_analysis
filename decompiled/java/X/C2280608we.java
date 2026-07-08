package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextFontExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08we, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2280608we extends C11UL {
    public final EffectTextFontExtra LL;

    public final int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11UK) {
            return Intrinsics.LJFF(((C11UL) obj).effect.getResourceId(), this.effect.getResourceId());
        }
        return false;
    }

    public C2280608we(Effect effect, EffectTextFontExtra effectTextFontExtra) {
        super(effect);
        this.LL = effectTextFontExtra;
    }
}
