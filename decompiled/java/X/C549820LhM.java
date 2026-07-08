package X;

/* JADX INFO: renamed from: X.0LhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549820LhM implements C0DV5<C549820LhM> {
    public CharSequence LL;
    public boolean LLILLJJLI = true;
    public C555350LqH LLILLL;

    @Override // X.C0DV5
    public C549820LhM build() {
        return this;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final C555350LqH getRetentionDialogTextConfig() {
        return this.LLILLL;
    }

    public final boolean getShouldShowRetentionDialog() {
        return this.LLILLJJLI;
    }

    public final CharSequence getTitleContent() {
        return this.LL;
    }

    public final C549820LhM retentionDialogTextConfig(C555350LqH c555350LqH) {
        this.LLILLL = c555350LqH;
        return this;
    }

    public final void setRetentionDialogTextConfig(C555350LqH c555350LqH) {
        this.LLILLL = c555350LqH;
    }

    public final void setShouldShowRetentionDialog(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setTitleContent(CharSequence charSequence) {
        this.LL = charSequence;
    }

    public final C549820LhM shouldShowRetentionDialog(boolean z) {
        this.LLILLJJLI = z;
        return this;
    }

    public final C549820LhM titleContent(CharSequence charSequence) {
        this.LL = charSequence;
        return this;
    }
}
