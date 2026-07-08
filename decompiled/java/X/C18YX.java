package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18YX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18YX implements C0DV5<C18YX> {
    public Function0<Unit> LL;
    public Function0<Unit> LLILLJJLI;
    public boolean LLILLL = true;

    @Override // X.C0DV5
    public C18YX build() {
        return this;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final Function0<Unit> getOnClickAICreate() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getOnClickBack() {
        return this.LL;
    }

    public final boolean isCastButtonVisible() {
        return this.LLILLL;
    }

    public final C18YX onClickAICreate(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
        return this;
    }

    public final C18YX onClickBack(Function0<Unit> function0) {
        this.LL = function0;
        return this;
    }

    public final C18YX setCastButtonVisible(boolean z) {
        this.LLILLL = z;
        return this;
    }

    public final void setOnClickAICreate(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setOnClickBack(Function0<Unit> function0) {
        this.LL = function0;
    }

    /* JADX INFO: renamed from: setCastButtonVisible, reason: collision with other method in class */
    public final void m100setCastButtonVisible(boolean z) {
        this.LLILLL = z;
    }
}
