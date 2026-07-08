package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0LhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549800LhK implements C0DV5<C549800LhK> {
    public boolean LL = true;
    public String LLILLJJLI;
    public String LLILLL;
    public Drawable LLILZ;
    public String LLILZIL;

    @Override // X.C0DV5
    public C549800LhK build() {
        return this;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final String getBackgroundImageUrl() {
        return this.LLILLL;
    }

    public final String getLottieResFilePath() {
        return this.LLILLJJLI;
    }

    public final Drawable getPlaceHolderDrawable() {
        return this.LLILZ;
    }

    public final boolean getShowOverlayLottie() {
        return this.LL;
    }

    public final String getVideoUrl() {
        return this.LLILZIL;
    }

    public final C549800LhK backgroundImageUrl(String str) {
        this.LLILLL = str;
        return this;
    }

    public final C549800LhK lottieResFilePath(String str) {
        this.LLILLJJLI = str;
        return this;
    }

    public final C549800LhK placeHolderDrawable(Drawable drawable) {
        this.LLILZ = drawable;
        return this;
    }

    public final void setBackgroundImageUrl(String str) {
        this.LLILLL = str;
    }

    public final void setLottieResFilePath(String str) {
        this.LLILLJJLI = str;
    }

    public final void setPlaceHolderDrawable(Drawable drawable) {
        this.LLILZ = drawable;
    }

    public final void setShowOverlayLottie(boolean z) {
        this.LL = z;
    }

    public final void setVideoUrl(String str) {
        this.LLILZIL = str;
    }

    public final C549800LhK showOverlayLottie(boolean z) {
        this.LL = z;
        return this;
    }

    public final C549800LhK videoUrl(String str) {
        this.LLILZIL = str;
        return this;
    }
}
