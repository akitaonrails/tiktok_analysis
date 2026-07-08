package X;

/* JADX INFO: renamed from: X.0zm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908860zm0 extends AbstractC1386140mAu<C1908860zm0> {
    public EnumC994390bz3 LJJLIIIJ;
    public Integer LJJLIIIJILLIZJL;
    public EnumC1908850zlz LJJLIIIJJI;

    public C1908860zm0() {
        super("message_button_after_follow");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        LJ("enter_from", this.LIZLLL);
        LJ("position", String.valueOf(this.LJJLIIIJJI));
        LJ("social_info_site_id", String.valueOf(this.LJJLIIIJILLIZJL));
        EnumC994390bz3 enumC994390bz3 = this.LJJLIIIJ;
        LJ("action_type", enumC994390bz3 != null ? enumC994390bz3.getType() : null);
    }
}
