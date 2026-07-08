package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.11iN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19575711iN extends HashMap<String, HashMap<String, String>> {
    public final /* synthetic */ C19574811iE LL;

    public C19575711iN(C19574811iE c19574811iE) {
        this.LL = c19574811iE;
        if (c19574811iE.LJIILIIL == "friends_effect") {
            put("friends_effect", new HashMap<String, String>(this) { // from class: X.11iP
                {
                    put("from_user_id", this.LL.LJJJJI);
                }
            });
        }
        put("prop_page", new HashMap<String, String>(this) { // from class: X.11iR
            {
                put("prop_page_shoot_previous_page", this.LL.LJIJJ);
            }
        });
    }
}
