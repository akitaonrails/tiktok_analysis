package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.13VF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13VF {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final List<C13VG> LIZIZ = new ArrayList();

    public final void LIZ(C13VG c13vg) {
        if (!((ArrayList) this.LIZIZ).contains(c13vg)) {
            ((ArrayList) this.LIZIZ).add(c13vg);
        }
    }

    public final void LIZIZ(File file) {
        File[] fileArrListFiles;
        if (!this.LIZ.get() && file != null && file.exists()) {
            this.LIZ.set(true);
            Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((C13VG) it2.next()).LIZ(file, true);
            }
            if (!file.isDirectory()) {
                this.LIZ.set(false);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (!linkedList.isEmpty() && this.LIZ.get()) {
                File file2 = (File) linkedList.remove();
                if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length != 0) {
                    for (File file3 : fileArrListFiles) {
                        if (file3 != null && file3.exists()) {
                            Iterator it3 = ((ArrayList) this.LIZIZ).iterator();
                            while (it3.hasNext()) {
                                ((C13VG) it3.next()).LIZ(file3, false);
                            }
                            if (file3.isDirectory()) {
                                linkedList.add(file3);
                            }
                        }
                    }
                }
            }
            this.LIZ.set(false);
        }
    }
}
