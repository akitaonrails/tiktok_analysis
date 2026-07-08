package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.10gQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19308810gQ {
    public final Keva LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;

    public C19308810gQ() {
        Keva repo = Keva.getRepo("money_growth");
        this.LIZ = repo;
        this.LIZLLL = "";
        LIZ(repo.getInt("deepLinkDialogShown", 0));
        boolean z = repo.getBoolean("has_showed_pop", false);
        this.LIZJ = z;
        repo.storeBoolean("has_showed_pop", z);
        String string = repo.getString("activity_id_for_deeplink", "");
        if (string != null) {
            this.LIZLLL = string;
            repo.storeString("activity_id_for_deeplink", string);
        }
    }

    public final void LIZ(int i) {
        this.LIZIZ = i;
        this.LIZ.storeInt("deepLinkDialogShown", i);
        if (i == 2) {
            this.LIZ.storeString("activity_id_for_deeplink", "");
        }
    }
}
