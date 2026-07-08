package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;

/* JADX INFO: renamed from: X.0LCH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LCH {
    public final EnumC545550LaT LIZ;
    public final AwemeDraft LIZIZ;
    public final List<String> LIZJ;

    public C0LCH() {
        this(null, null, 31);
    }

    public C0LCH(EnumC545550LaT enumC545550LaT, AwemeDraft awemeDraft, int i) {
        enumC545550LaT = (i & 1) != 0 ? EnumC545550LaT.PROCESSING : enumC545550LaT;
        awemeDraft = (i & 2) != 0 ? null : awemeDraft;
        C13BV c13bv = (i & 4) != 0 ? C13BV.INSTANCE : null;
        this.LIZ = enumC545550LaT;
        this.LIZIZ = awemeDraft;
        this.LIZJ = c13bv;
    }
}
