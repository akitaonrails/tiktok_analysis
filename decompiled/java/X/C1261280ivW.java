package X;

/* JADX INFO: renamed from: X.0ivW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261280ivW extends AbstractC1386140mAu<C1261280ivW> {
    public EnumC1261300ivY LJJLIIIJ;
    public Integer LJJLIIIJILLIZJL;

    public C1261280ivW() {
        super("message_button_more_options");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        EnumC1261300ivY enumC1261300ivY = this.LJJLIIIJ;
        String type = enumC1261300ivY != null ? enumC1261300ivY.getType() : null;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("action_type", type, c2082308Dt);
        LJFF("social_info_site_id", String.valueOf(this.LJJLIIIJILLIZJL), c2082308Dt);
    }
}
