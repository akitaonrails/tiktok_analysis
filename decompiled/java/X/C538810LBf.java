package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;

/* JADX INFO: renamed from: X.0LBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538810LBf {
    public final EnumC545550LaT LIZ;
    public final AwemeDraft LIZIZ;
    public final List<String> LIZJ;
    public String LIZLLL;
    public String LJ;

    public C538810LBf() {
        this(null, null, null, 31);
    }

    public C538810LBf(EnumC545550LaT enumC545550LaT, AwemeDraft awemeDraft, List list, int i) {
        enumC545550LaT = (i & 1) != 0 ? EnumC545550LaT.PROCESSING : enumC545550LaT;
        awemeDraft = (i & 2) != 0 ? null : awemeDraft;
        list = (i & 4) != 0 ? C13BV.INSTANCE : list;
        this.LIZ = enumC545550LaT;
        this.LIZIZ = awemeDraft;
        this.LIZJ = list;
        this.LIZLLL = null;
        this.LJ = null;
    }
}
