package X;

import android.view.View;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MXX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXX implements C0DV5<C0MXX> {
    public Function0<Unit> LLILZLL;
    public Function0<? extends View> LLIZLLLIL;
    public C0MXZ LL = new C0MXZ() { // from class: X.0MXa
    };
    public int LLILLJJLI = 2;
    public int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    public int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    public int LLILZIL = 72;
    public boolean LLIZ = true;
    public int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
    public List<? extends Object> LLJIJIL = C13BV.INSTANCE;
    public Pair<Integer, Integer> LLJILJIL = new Pair<>(Integer.valueOf(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 0);

    @Override // X.C0DV5
    public C0MXX build() {
        return this;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final int getAvatarSizeDp$tools_ai_uikit_release() {
        return this.LLILZIL;
    }

    public final List<Object> getAvatars$tools_ai_uikit_release() {
        return this.LLJIJIL;
    }

    public final C0MXZ getExtraViewType$tools_ai_uikit_release() {
        return this.LL;
    }

    public final Function0<View> getHollowContentBuilder$tools_ai_uikit_release() {
        return this.LLIZLLLIL;
    }

    public final int getHollowContentSizePx$tools_ai_uikit_release() {
        return this.LLJ;
    }

    public final int getHollowIconSizePx$tools_ai_uikit_release() {
        return this.LLJI;
    }

    public final Pair<Integer, Integer> getHollowOffsetPx$tools_ai_uikit_release() {
        return this.LLJILJIL;
    }

    public final Function0<Unit> getOnClick$tools_ai_uikit_release() {
        return this.LLILZLL;
    }

    public final int getOutlineWidthPx$tools_ai_uikit_release() {
        return this.LLILZ;
    }

    public final int getOverlapSizePx$tools_ai_uikit_release() {
        return this.LLILLL;
    }

    public final boolean getShowHollowContent$tools_ai_uikit_release() {
        return this.LLIZ;
    }

    public final int getShowLimit$tools_ai_uikit_release() {
        return this.LLILLJJLI;
    }

    public final C0MXX avatarSizeDp(int i) {
        this.LLILZIL = i;
        return this;
    }

    public final C0MXX avatars(List<? extends Object> list) {
        this.LLJIJIL = list;
        return this;
    }

    public final C0MXX extraViewType(C0MXZ c0mxz) {
        this.LL = c0mxz;
        return this;
    }

    public final C0MXX hollowContentBuilder(Function0<? extends View> function0) {
        this.LLIZLLLIL = function0;
        return this;
    }

    public final C0MXX hollowContentSizePx(int i) {
        this.LLJ = i;
        return this;
    }

    public final C0MXX hollowIconSizePx(int i) {
        this.LLJI = i;
        return this;
    }

    public final C0MXX onClick(Function0<Unit> function0) {
        this.LLILZLL = function0;
        return this;
    }

    public final C0MXX outlineWidthPx(int i) {
        this.LLILZ = i;
        return this;
    }

    public final C0MXX overlapSizePx(int i) {
        this.LLILLL = i;
        return this;
    }

    public final void setAvatarSizeDp$tools_ai_uikit_release(int i) {
        this.LLILZIL = i;
    }

    public final void setAvatars$tools_ai_uikit_release(List<? extends Object> list) {
        this.LLJIJIL = list;
    }

    public final void setExtraViewType$tools_ai_uikit_release(C0MXZ c0mxz) {
        this.LL = c0mxz;
    }

    public final void setHollowContentBuilder$tools_ai_uikit_release(Function0<? extends View> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setHollowContentSizePx$tools_ai_uikit_release(int i) {
        this.LLJ = i;
    }

    public final void setHollowIconSizePx$tools_ai_uikit_release(int i) {
        this.LLJI = i;
    }

    public final void setHollowOffsetPx$tools_ai_uikit_release(Pair<Integer, Integer> pair) {
        this.LLJILJIL = pair;
    }

    public final void setOnClick$tools_ai_uikit_release(Function0<Unit> function0) {
        this.LLILZLL = function0;
    }

    public final void setOutlineWidthPx$tools_ai_uikit_release(int i) {
        this.LLILZ = i;
    }

    public final void setOverlapSizePx$tools_ai_uikit_release(int i) {
        this.LLILLL = i;
    }

    public final void setShowHollowContent$tools_ai_uikit_release(boolean z) {
        this.LLIZ = z;
    }

    public final void setShowLimit$tools_ai_uikit_release(int i) {
        this.LLILLJJLI = i;
    }

    public final C0MXX showHollowContent(boolean z) {
        this.LLIZ = z;
        return this;
    }

    public final C0MXX showLimit(int i) {
        this.LLILLJJLI = i;
        return this;
    }

    public final C0MXX hollowOffsetPx(int i, int i2) {
        this.LLJILJIL = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        return this;
    }
}
