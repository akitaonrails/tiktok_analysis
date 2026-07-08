package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;

/* JADX INFO: renamed from: X.0Lna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553680Lna {
    public final int LIZ;
    public final AwemeDraft LIZIZ;
    public EnumC545550LaT LIZJ;
    public float LIZLLL;
    public List<String> LJ;
    public final long LJFF;

    public C553680Lna() {
        this(0, null, 0L, 127);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C553680Lna(int i, AwemeDraft awemeDraft, long j, int i2) {
        EnumC545550LaT enumC545550LaT;
        long j2 = j;
        AwemeDraft awemeDraft2 = awemeDraft;
        int i3 = (i2 & 1) != 0 ? 0 : i;
        awemeDraft2 = (i2 & 2) != 0 ? null : awemeDraft2;
        if ((i2 & 4) != 0) {
            enumC545550LaT = EnumC545550LaT.NONE;
        } else {
            enumC545550LaT = null;
        }
        this(i3, awemeDraft2, enumC545550LaT, 0.0f, (i2 & 16) != 0 ? Source.EDIT_AI_LIVE_PHOTO : null, null, (i2 & 64) != 0 ? 0L : j2);
    }

    public C553680Lna(int i, AwemeDraft awemeDraft, EnumC545550LaT enumC545550LaT, float f, Source source, List<String> list, long j) {
        this.LIZ = i;
        this.LIZIZ = awemeDraft;
        this.LIZJ = enumC545550LaT;
        this.LIZLLL = f;
        this.LJ = list;
        this.LJFF = j;
    }
}
