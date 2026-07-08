package X;

import android.app.Application;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.088w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20696088w extends AnonymousClass0894 {
    public List<AnonymousClass0894> LIZ;

    public abstract List<AnonymousClass0894> LJFF();

    @Override // X.AnonymousClass0894
    public final void LIZLLL() {
        Iterator<AnonymousClass0894> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
    }

    @Override // X.AnonymousClass0894
    public final void LIZJ(Application application) {
        List<AnonymousClass0894> listLJFF = LJFF();
        this.LIZ = listLJFF;
        Iterator<AnonymousClass0894> it2 = listLJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(application);
        }
    }
}
