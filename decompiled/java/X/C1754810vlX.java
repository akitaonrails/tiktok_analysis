package X;

/* JADX INFO: renamed from: X.0vlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754810vlX extends AbstractC1752670vi5 {
    @Override // X.AbstractC1752670vi5
    public final String LIZ() {
        return "ec_page_scroll_state_change";
    }

    public C1754810vlX(String str) {
        super(str);
    }

    public final void LIZJ(EnumC1754800vlW enumC1754800vlW, Boolean bool) {
        this.LIZ.put("state", Integer.valueOf(enumC1754800vlW.getValue()));
        if (bool != null) {
            bool.booleanValue();
            this.LIZ.put("is_down", bool);
        }
    }
}
