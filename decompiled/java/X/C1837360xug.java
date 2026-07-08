package X;

/* JADX INFO: renamed from: X.0xug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837360xug extends AbstractC1837350xuf {
    public final EnumC1837330xud LLILZIL;

    @Override // X.AbstractC1837200xuQ
    public int getErrorCode() {
        return -999;
    }

    public C1837360xug() {
        this(C497740JfY.LJIJI(2131851936));
    }

    @Override // X.AbstractC1837210xuR
    public EnumC1837330xud getStage() {
        return this.LLILZIL;
    }

    public C1837360xug(String str) {
        super("unknown purchase error", str, null);
        this.LLILZIL = EnumC1837330xud.UNKNOWN;
    }
}
