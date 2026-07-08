package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18YW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18YW implements C0DV5<C18YW> {
    public boolean LL;
    public boolean LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;

    @Override // X.C0DV5
    public C18YW build() {
        return this;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final boolean getEnableCreatePost() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getOnClickCreatePost() {
        return this.LLILZ;
    }

    public final Function0<Unit> getOnClickDeleteCameo() {
        return this.LLILLL;
    }

    public final boolean isCreatorMode() {
        return this.LL;
    }

    public final C18YW enableCreatePost(boolean z) {
        this.LLILLJJLI = z;
        return this;
    }

    public final C18YW isCreatorMode(boolean z) {
        this.LL = z;
        return this;
    }

    public final C18YW onClickCreatePost(Function0<Unit> function0) {
        this.LLILZ = function0;
        return this;
    }

    public final C18YW onClickDeleteCameo(Function0<Unit> function0) {
        this.LLILLL = function0;
        return this;
    }

    public final void setCreatorMode(boolean z) {
        this.LL = z;
    }

    public final void setEnableCreatePost(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setOnClickCreatePost(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setOnClickDeleteCameo(Function0<Unit> function0) {
        this.LLILLL = function0;
    }
}
