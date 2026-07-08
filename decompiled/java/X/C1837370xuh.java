package X;

/* JADX INFO: renamed from: X.0xuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837370xuh extends AbstractC1837220xuS {
    public final int LLILZIL;

    public C1837370xuh() {
        this("An unknown payment error occurred", null);
    }

    @Override // X.AbstractC1837200xuQ
    public int getErrorCode() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1837210xuR
    public EnumC1837330xud getStage() {
        return EnumC1837330xud.UNKNOWN;
    }

    public C1837370xuh(String str, String str2) {
        super(str, str2, null);
        this.LLILZIL = -999;
    }
}
