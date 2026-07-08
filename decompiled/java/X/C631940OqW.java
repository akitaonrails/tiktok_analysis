package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631940OqW implements Serializable {
    public static final int $stable = 8;
    public final List<Aweme> awemes;
    public boolean isFirstSimilarMusic;
    public final boolean isHighlighted;
    public final boolean isHighlightedSimilarMusic;
    public boolean isLastSimilarMusic;
    public boolean isSelected;
    public boolean isSimilarMusic;
    public final boolean isSpotlighted;
    public final EnumC631610Opz pinStatus;
    public final Integer similarMusicIndex;
    public int similarMusicSize;
    public final Integer sourceMusicIndex;
    public boolean unFoldStatus;

    public C631940OqW() {
        this(EnumC631610Opz.DISABLE_PINNED, false, false, 0, false, false, false, false, false, null, null, false, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C631940OqW)) {
            return false;
        }
        C631940OqW c631940OqW = (C631940OqW) obj;
        return this.pinStatus == c631940OqW.pinStatus && this.isHighlighted == c631940OqW.isHighlighted && this.isSimilarMusic == c631940OqW.isSimilarMusic && this.similarMusicSize == c631940OqW.similarMusicSize && this.unFoldStatus == c631940OqW.unFoldStatus && this.isFirstSimilarMusic == c631940OqW.isFirstSimilarMusic && this.isLastSimilarMusic == c631940OqW.isLastSimilarMusic && this.isSelected == c631940OqW.isSelected && this.isHighlightedSimilarMusic == c631940OqW.isHighlightedSimilarMusic && Intrinsics.LJFF(this.similarMusicIndex, c631940OqW.similarMusicIndex) && Intrinsics.LJFF(this.sourceMusicIndex, c631940OqW.sourceMusicIndex) && this.isSpotlighted == c631940OqW.isSpotlighted && Intrinsics.LJFF(this.awemes, c631940OqW.awemes);
    }

    public final boolean isFirstSimilarMusic() {
        return this.isFirstSimilarMusic;
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public final boolean isHighlightedSimilarMusic() {
        return this.isHighlightedSimilarMusic;
    }

    public final boolean isLastSimilarMusic() {
        return this.isLastSimilarMusic;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isSimilarMusic() {
        return this.isSimilarMusic;
    }

    public final boolean isSpotlighted() {
        return this.isSpotlighted;
    }

    public final void setFirstSimilarMusic(boolean z) {
        this.isFirstSimilarMusic = z;
    }

    public final void setLastSimilarMusic(boolean z) {
        this.isLastSimilarMusic = z;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setSimilarMusic(boolean z) {
        this.isSimilarMusic = z;
    }

    public final void setSimilarMusicSize(int i) {
        this.similarMusicSize = i;
    }

    public final void setUnFoldStatus(boolean z) {
        this.unFoldStatus = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C631940OqW(EnumC631610Opz enumC631610Opz, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Integer num, Integer num2, boolean z8, List<? extends Aweme> list) {
        this.pinStatus = enumC631610Opz;
        this.isHighlighted = z;
        this.isSimilarMusic = z2;
        this.similarMusicSize = i;
        this.unFoldStatus = z3;
        this.isFirstSimilarMusic = z4;
        this.isLastSimilarMusic = z5;
        this.isSelected = z6;
        this.isHighlightedSimilarMusic = z7;
        this.similarMusicIndex = num;
        this.sourceMusicIndex = num2;
        this.isSpotlighted = z8;
        this.awemes = list;
    }
}
