package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674400tfq {
    public final List<StoryHighlightAwemePreview> LIZ;
    public final StoryHighlightAwemePreview LIZIZ;
    public final Bitmap LIZJ;

    public C1674400tfq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674400tfq)) {
            return false;
        }
        C1674400tfq c1674400tfq = (C1674400tfq) obj;
        return Intrinsics.LJFF(this.LIZ, c1674400tfq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1674400tfq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1674400tfq.LIZJ);
    }

    public C1674400tfq(int i) {
        this(C13BV.INSTANCE, null, null);
    }

    public C1674400tfq(List<StoryHighlightAwemePreview> list, StoryHighlightAwemePreview storyHighlightAwemePreview, Bitmap bitmap) {
        this.LIZ = list;
        this.LIZIZ = storyHighlightAwemePreview;
        this.LIZJ = bitmap;
    }
}
