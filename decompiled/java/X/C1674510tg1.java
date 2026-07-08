package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674510tg1 {
    public final List<StoryHighlightAwemePreview> LIZ;
    public final List<StoryHighlightAwemePreview> LIZIZ;
    public final String LIZJ;
    public final StoryHighlightAwemePreview LIZLLL;
    public final StoryHighlightCollection.CoverType LJ;
    public final UrlModel LJFF;
    public final Bitmap LJI;
    public final Bitmap LJII;
    public final EnumC1674300tfg LJIIIIZZ;
    public final EnumC1674300tfg LJIIIZ;

    public C1674510tg1() {
        this(null, null, null, null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674510tg1)) {
            return false;
        }
        C1674510tg1 c1674510tg1 = (C1674510tg1) obj;
        return Intrinsics.LJFF(this.LIZ, c1674510tg1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1674510tg1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1674510tg1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1674510tg1.LIZLLL) && this.LJ == c1674510tg1.LJ && Intrinsics.LJFF(this.LJFF, c1674510tg1.LJFF) && Intrinsics.LJFF(this.LJI, c1674510tg1.LJI) && Intrinsics.LJFF(this.LJII, c1674510tg1.LJII) && this.LJIIIIZZ == c1674510tg1.LJIIIIZZ && this.LJIIIZ == c1674510tg1.LJIIIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1674510tg1(List list, String str, StoryHighlightAwemePreview storyHighlightAwemePreview, StoryHighlightCollection.CoverType coverType, UrlModel urlModel, Bitmap bitmap, int i) {
        C13BV c13bv;
        EnumC1674300tfg enumC1674300tfg;
        Bitmap bitmap2 = bitmap;
        UrlModel urlModel2 = urlModel;
        StoryHighlightCollection.CoverType coverType2 = coverType;
        List list2 = list;
        String str2 = str;
        StoryHighlightAwemePreview storyHighlightAwemePreview2 = storyHighlightAwemePreview;
        if ((i & 1) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        list2 = (i & 2) != 0 ? C13BV.INSTANCE : list2;
        str2 = (i & 4) != 0 ? null : str2;
        storyHighlightAwemePreview2 = (i & 8) != 0 ? null : storyHighlightAwemePreview2;
        coverType2 = (i & 16) != 0 ? StoryHighlightCollection.CoverType.UNKNOWN : coverType2;
        urlModel2 = (i & 32) != 0 ? null : urlModel2;
        bitmap2 = (i & 64) != 0 ? null : bitmap2;
        if ((i & 256) != 0) {
            enumC1674300tfg = EnumC1674300tfg.INITIAL;
        } else {
            enumC1674300tfg = null;
        }
        this(c13bv, list2, str2, storyHighlightAwemePreview2, coverType2, urlModel2, bitmap2, null, enumC1674300tfg, (i & 512) != 0 ? EnumC1674300tfg.INITIAL : null);
    }

    public C1674510tg1(List<StoryHighlightAwemePreview> list, List<StoryHighlightAwemePreview> list2, String str, StoryHighlightAwemePreview storyHighlightAwemePreview, StoryHighlightCollection.CoverType coverType, UrlModel urlModel, Bitmap bitmap, Bitmap bitmap2, EnumC1674300tfg enumC1674300tfg, EnumC1674300tfg enumC1674300tfg2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = str;
        this.LIZLLL = storyHighlightAwemePreview;
        this.LJ = coverType;
        this.LJFF = urlModel;
        this.LJI = bitmap;
        this.LJII = bitmap2;
        this.LJIIIIZZ = enumC1674300tfg;
        this.LJIIIZ = enumC1674300tfg2;
    }

    public static C1674510tg1 LIZ(C1674510tg1 c1674510tg1, List list, List list2, String str, StoryHighlightAwemePreview storyHighlightAwemePreview, StoryHighlightCollection.CoverType coverType, UrlModel urlModel, Bitmap bitmap, Bitmap bitmap2, EnumC1674300tfg enumC1674300tfg, EnumC1674300tfg enumC1674300tfg2, int i) {
        EnumC1674300tfg enumC1674300tfg3 = enumC1674300tfg2;
        EnumC1674300tfg enumC1674300tfg4 = enumC1674300tfg;
        Bitmap bitmap3 = bitmap2;
        Bitmap bitmap4 = bitmap;
        UrlModel urlModel2 = urlModel;
        StoryHighlightCollection.CoverType coverType2 = coverType;
        StoryHighlightAwemePreview storyHighlightAwemePreview2 = storyHighlightAwemePreview;
        String str2 = str;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            list4 = c1674510tg1.LIZ;
        }
        if ((i & 2) != 0) {
            list3 = c1674510tg1.LIZIZ;
        }
        if ((i & 4) != 0) {
            str2 = c1674510tg1.LIZJ;
        }
        if ((i & 8) != 0) {
            storyHighlightAwemePreview2 = c1674510tg1.LIZLLL;
        }
        if ((i & 16) != 0) {
            coverType2 = c1674510tg1.LJ;
        }
        if ((i & 32) != 0) {
            urlModel2 = c1674510tg1.LJFF;
        }
        if ((i & 64) != 0) {
            bitmap4 = c1674510tg1.LJI;
        }
        if ((i & 128) != 0) {
            bitmap3 = c1674510tg1.LJII;
        }
        if ((i & 256) != 0) {
            enumC1674300tfg4 = c1674510tg1.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            enumC1674300tfg3 = c1674510tg1.LJIIIZ;
        }
        c1674510tg1.getClass();
        return new C1674510tg1(list4, list3, str2, storyHighlightAwemePreview2, coverType2, urlModel2, bitmap4, bitmap3, enumC1674300tfg4, enumC1674300tfg3);
    }
}
