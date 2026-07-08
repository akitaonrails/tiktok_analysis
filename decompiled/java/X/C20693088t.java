package X;

import android.app.Application;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.088t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20693088t {
    public static volatile C20693088t LIZJ;
    public final Application LIZ;
    public final HashMap<String, AnonymousClass0894> LIZIZ;

    public C20693088t() {
        throw null;
    }

    public final void LIZ(AnonymousClass0893 anonymousClass0893) {
        for (AnonymousClass0894 anonymousClass0894 : this.LIZIZ.values()) {
            if (anonymousClass0894 instanceof AbstractC20696088w) {
                for (AnonymousClass0894 anonymousClass08942 : ((AbstractC20696088w) anonymousClass0894).LIZ) {
                    if (anonymousClass08942.LJ() == anonymousClass0893) {
                        anonymousClass08942.LIZLLL();
                    }
                }
            } else if (anonymousClass0894.LJ() == anonymousClass0893) {
                anonymousClass0894.LIZLLL();
            }
        }
    }

    public C20693088t(Application application, HashMap map, AnonymousClass0899 anonymousClass0899, AnonymousClass0891 anonymousClass0891) {
        this.LIZ = application;
        this.LIZIZ = map;
        EnumC20699088z.INSTANCE.init(application, anonymousClass0899, anonymousClass0891);
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((AnonymousClass0894) it2.next()).LIZJ(this.LIZ);
        }
    }
}
