package X;

import X.C164B;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0lX8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1361480lX8<T extends C164B> extends AbstractC1361510lXB<Aweme, T> {
    public final ConcurrentHashMap<String, T> LIZ = new ConcurrentHashMap<>();

    public InterfaceC1361520lXC LJI() {
        return new C1361450lX5(this.LIZ);
    }

    @Override // X.AbstractC1361510lXB
    public /* bridge */ /* synthetic */ InterfaceC1361520lXC LIZJ(Aweme aweme) {
        return LJI();
    }

    @Override // X.AbstractC1361510lXB
    public final String LJ(Aweme aweme) {
        String aid = aweme.getAid();
        if (aid == null) {
            return "";
        }
        return aid;
    }
}
