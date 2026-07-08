package X;

import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664570Q4x {
    public static final C01GW<C664570Q4x> LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(22));
    public final C0V2A LIZ;
    public final C644620PQe LIZIZ;
    public boolean LIZJ;
    public ScheduledFuture<?> LIZLLL;
    public final HashMap<String, String> LJ = new HashMap<>();

    public final void LIZ() {
        if (this.LIZJ) {
            this.LIZJ = false;
            C314640CVa.LIZLLL("search");
            C0V2A c0v2a = this.LIZ;
            if (c0v2a != null) {
                c0v2a.LJI();
            }
            ScheduledFuture<?> scheduledFuture = this.LIZLLL;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
    }

    public C664570Q4x() {
        C0V2A c0v2a = new C0V2A("search", false);
        this.LIZ = c0v2a;
        this.LIZIZ = new C644620PQe(this);
        c0v2a.LIZJ(new InterfaceC791210V1z() { // from class: X.0PQf
            @Override // X.InterfaceC791210V1z
            public final void LIZLLL(JSONObject jSONObject) {
                C644620PQe c644620PQe = this.LL.LIZIZ;
                if (c644620PQe != null) {
                    c644620PQe.LIZLLL(jSONObject);
                }
            }
        });
    }
}
