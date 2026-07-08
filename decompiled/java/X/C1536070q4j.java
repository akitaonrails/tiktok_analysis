package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.FutureTask;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536070q4j implements InterfaceC1541240qD4 {
    public static final C1536170q4t LJ = new Object() { // from class: X.0q4t
    };
    public final AbstractC1536120q4o LIZ;
    public final Map<String, FutureTask<byte[]>> LIZIZ;
    public final String LIZJ;
    public int LIZLLL;

    public C1536070q4j() {
        throw null;
    }

    @Override // X.InterfaceC1541240qD4, X.InterfaceC1541260qD6
    public final boolean LIZ(C1540930qCZ c1540930qCZ) {
        return true;
    }

    @Override // X.InterfaceC1541260qD6
    public final boolean LIZJ(C1540930qCZ c1540930qCZ) {
        return true;
    }

    public final boolean LIZIZ() {
        ArrayList arrayList;
        if (this.LIZ instanceof C1536050q4h) {
            File[] fileArrListFiles = new C0VSJ(AbstractC1536120q4o.LIZIZ.LIZIZ(), ((C1536050q4h) this.LIZ).LJFF).listFiles();
            if (fileArrListFiles != null) {
                arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (!a0.LJJIIZI(file.getName(), "_tmp", false)) {
                        arrayList.add(file);
                    }
                }
            } else {
                arrayList = null;
            }
            if (isSuccess()) {
                if (arrayList != null && arrayList.size() > 1) {
                    return true;
                }
            } else if (arrayList != null && !arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1541240qD4
    public final boolean isSuccess() {
        Map<String, FutureTask<byte[]>> map;
        return (this.LIZJ != null || (map = this.LIZIZ) == null || map.isEmpty()) ? false : true;
    }

    public C1536070q4j(AbstractC1536120q4o abstractC1536120q4o, Map map, String str) {
        this.LIZ = abstractC1536120q4o;
        this.LIZIZ = map;
        this.LIZJ = str;
    }
}
