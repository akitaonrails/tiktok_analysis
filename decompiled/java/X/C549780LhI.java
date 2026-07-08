package X;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LhI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549780LhI implements C0DV5<C549780LhI> {
    public List<String> LLILZLL;
    public int LLIZ;
    public boolean LL = true;
    public boolean LLILLJJLI = true;
    public boolean LLILLL = true;
    public C0MXX LLILZ = new C0MXX();
    public List<String> LLILZIL = C13BV.INSTANCE;
    public Pair<Long, String> LLIZLLLIL = new Pair<>(-1L, null);

    @Override // X.C0DV5
    public C549780LhI build() {
        return this;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final C0MXX getAvatarHollowChainConfig() {
        return this.LLILZ;
    }

    public final boolean getShowAvatarAnimation() {
        return this.LLILLJJLI;
    }

    public final boolean getShowRedDot() {
        return this.LL;
    }

    public final boolean getShowTextRotation() {
        return this.LLILLL;
    }

    public final int getStartProgress() {
        return this.LLIZ;
    }

    public final Pair<Long, String> getStartRemainTime() {
        return this.LLIZLLLIL;
    }

    public final List<String> getTextRotationActions() {
        return this.LLILZLL;
    }

    public final List<String> getUsernames() {
        return this.LLILZIL;
    }

    public final C549780LhI avatarConfig(C0MXX c0mxx) {
        this.LLILZ = c0mxx;
        return this;
    }

    public final void setAvatarHollowChainConfig(C0MXX c0mxx) {
        this.LLILZ = c0mxx;
    }

    public final void setShowAvatarAnimation(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setShowRedDot(boolean z) {
        this.LL = z;
    }

    public final void setShowTextRotation(boolean z) {
        this.LLILLL = z;
    }

    public final void setStartProgress(int i) {
        this.LLIZ = i;
    }

    public final void setStartRemainTime(Pair<Long, String> pair) {
        this.LLIZLLLIL = pair;
    }

    public final void setTextRotationActions(List<String> list) {
        this.LLILZLL = list;
    }

    public final void setUsernames(List<String> list) {
        this.LLILZIL = list;
    }

    public final C549780LhI showAvatarAnimation(boolean z) {
        this.LLILLJJLI = z;
        return this;
    }

    public final C549780LhI showRedDot(boolean z) {
        this.LL = z;
        return this;
    }

    public final C549780LhI showTextRotation(boolean z) {
        this.LLILLL = z;
        return this;
    }

    public final C549780LhI startProgress(int i) {
        this.LLIZ = i;
        return this;
    }

    public final C549780LhI startRemainTime(Pair<Long, String> pair) {
        this.LLIZLLLIL = pair;
        return this;
    }

    public final C549780LhI textRotationActions(List<String> list) {
        this.LLILZLL = list;
        return this;
    }

    public final C549780LhI usernames(List<String> list) {
        this.LLILZIL = list;
        return this;
    }
}
