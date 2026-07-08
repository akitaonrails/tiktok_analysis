package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.11iM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19575611iM extends HashMap<String, HashMap<String, String>> {
    public final /* synthetic */ C19574811iE LL;

    public C19575611iM(C19574811iE c19574811iE) {
        this.LL = c19574811iE;
        if (c19574811iE.LJIILIIL == "friends_effect") {
            put("friends_effect", new HashMap<String, String>(this) { // from class: X.11iQ
                {
                    put("from_user_id", this.LL.LJJJJI);
                }
            });
        }
        put("prop_page", new HashMap<String, String>(this) { // from class: X.11iS
            {
                put("prop_page_shoot_previous_page", this.LL.LJIJJ);
            }
        });
    }
}
