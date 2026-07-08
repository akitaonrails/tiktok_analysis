package X;

/* JADX INFO: renamed from: X.0vmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755530vmh extends AbstractC1752670vi5 {
    @Override // X.AbstractC1752670vi5
    public final String LIZ() {
        return "ec_page_quit";
    }

    public C1755530vmh(String str) {
        super(str);
    }

    public final void LIZJ(long j) {
        this.LIZ.put("duration", Long.valueOf(j));
    }

    public final void LIZLLL(EnumC1755520vmg enumC1755520vmg) {
        this.LIZ.put("quit_type", Integer.valueOf(enumC1755520vmg.getValue()));
    }
}
