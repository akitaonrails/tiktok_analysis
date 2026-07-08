package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0PuK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659780PuK implements InterfaceC659800PuM {
    public final /* synthetic */ List<InterfaceC659800PuM> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C659780PuK(List<? extends InterfaceC659800PuM> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC659800PuM
    public final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme, InterfaceC660500PvU interfaceC660500PvU, C660780Pvw c660780Pvw) {
        Iterator<InterfaceC659800PuM> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC665370Q7z, aweme, interfaceC660500PvU, c660780Pvw);
        }
    }
}
