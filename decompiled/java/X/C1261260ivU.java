package X;

/* JADX INFO: renamed from: X.0ivU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261260ivU extends AbstractC1386140mAu<C1261260ivU> {
    public EnumC1261310ivZ LJJLIIIJ;
    public Integer LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public Integer LJJLIIIJJIZ;
    public String LJJLIIIJL;

    public C1261260ivU() {
        super("follow_recommend_more_options");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        EnumC1261310ivZ enumC1261310ivZ = this.LJJLIIIJ;
        String type = enumC1261310ivZ != null ? enumC1261310ivZ.getType() : null;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("action_type", type, c2082308Dt);
        Integer num = this.LJJLIIIJILLIZJL;
        LJFF("social_info_site_id", num != null ? num.toString() : null, c2082308Dt);
        String str = this.LJJLIIIJJI;
        if (str == null) {
            str = "";
        }
        LJ("enter_method", str);
        Integer num2 = this.LJJLIIIJJIZ;
        LIZLLL(num2 != null ? num2.intValue() : 0, "cover_count");
        String str2 = this.LIZLLL;
        if (str2 == null) {
            str2 = "";
        }
        LJ("enter_from", str2);
        String str3 = this.LJJLIIIJL;
        LJ("position", str3 != null ? str3 : "");
    }
}
