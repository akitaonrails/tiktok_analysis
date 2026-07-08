package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Lgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549500Lgq implements C0DV5<C549500Lgq> {
    public C550000Lhe<String> LL;
    public C550000Lhe<String> LLILLJJLI;
    public Function0<Unit> LLILLL;
    public C550000Lhe<Boolean> LLILZ;

    @Override // X.C0DV5
    public C549500Lgq build() {
        return this;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final C550000Lhe<String> getBackgroundText$tools_ai_uikit_df_release() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getClickXonPreview$tools_ai_uikit_df_release() {
        return this.LLILLL;
    }

    public final C550000Lhe<String> getInitVideoUri$tools_ai_uikit_df_release() {
        return this.LL;
    }

    public final C550000Lhe<Boolean> getVideoNeedToken$tools_ai_uikit_df_release() {
        return this.LLILZ;
    }

    public final C549500Lgq backgroundText(C550000Lhe<String> c550000Lhe) {
        this.LLILLJJLI = c550000Lhe;
        return this;
    }

    public final void setBackgroundText$tools_ai_uikit_df_release(C550000Lhe<String> c550000Lhe) {
        this.LLILLJJLI = c550000Lhe;
    }

    public final void setClickXonPreview$tools_ai_uikit_df_release(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public final void setInitVideoUri$tools_ai_uikit_df_release(C550000Lhe<String> c550000Lhe) {
        this.LL = c550000Lhe;
    }

    public final C549500Lgq setOnClickXOnPreviewListener(Function0<Unit> function0) {
        this.LLILLL = function0;
        return this;
    }

    public final void setVideoNeedToken$tools_ai_uikit_df_release(C550000Lhe<Boolean> c550000Lhe) {
        this.LLILZ = c550000Lhe;
    }

    public final C549500Lgq initVideoUri(C550000Lhe<String> c550000Lhe, C550000Lhe<Boolean> c550000Lhe2) {
        this.LL = c550000Lhe;
        this.LLILZ = c550000Lhe2;
        return this;
    }
}
