package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13VU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13VU implements C13VG {
    public final C0M5Z LIZ;
    public final C0M5Z LIZIZ;
    public boolean LIZJ;
    public final boolean LIZLLL;
    public final List<File> LJ;

    public final void LIZIZ(Function0<Boolean> function0) {
        for (File file : this.LJ) {
            if (function0 != null && function0.invoke().booleanValue()) {
                break;
            }
            file.delete();
            C0CHQ.LIZ().LJJIIJZLJL().getMonitor().LIZIZ(file);
        }
        ((ArrayList) this.LJ).clear();
    }

    public C13VU(Set<String> set, Set<String> set2) {
        C0M5Z c0m5z = new C0M5Z(AFwS274S0000000_30.get$arr$(324));
        c0m5z.addAll(set);
        this.LIZ = c0m5z;
        C0M5Z c0m5z2 = new C0M5Z(AFwS274S0000000_30.get$arr$(323));
        c0m5z2.addAll(set2);
        this.LIZIZ = c0m5z2;
        this.LIZLLL = true;
        this.LJ = new ArrayList();
    }

    @Override // X.C13VG
    public final void LIZ(File file, boolean z) {
        if (this.LIZLLL && z && file.isDirectory()) {
            return;
        }
        if (!this.LIZJ && file.isDirectory()) {
            return;
        }
        if (file.isFile()) {
            Iterator<T> it2 = this.LIZ.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (i >= 0) {
                        if (u.LJJIIJZLJL(file.getPath(), (String) next, false)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    int i2 = 0;
                    for (Object obj : this.LIZIZ) {
                        if (i2 >= 0) {
                            if (!a0.LJJIIZI(file.getPath(), (String) obj, false)) {
                                i2++;
                            }
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    ListProtector.add(this.LJ, 0, file);
                    return;
                }
            }
        }
        if (file.isDirectory()) {
            int i3 = 0;
            for (Object obj2 : this.LIZ) {
                if (i3 >= 0) {
                    if (!u.LJJIIJZLJL((String) obj2, file.getPath(), false)) {
                        i3++;
                    } else {
                        return;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            int i4 = 0;
            for (Object obj3 : this.LIZ) {
                if (i4 >= 0) {
                    if (!u.LJJIIJZLJL(file.getPath(), (String) obj3, false)) {
                        i4++;
                    } else {
                        return;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            int i5 = 0;
            for (Object obj4 : this.LIZIZ) {
                if (i5 >= 0) {
                    if (!a0.LJJIIZI(file.getPath(), (String) obj4, false)) {
                        i5++;
                    } else {
                        return;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            ListProtector.add(this.LJ, 0, file);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C13VU(Set set, int i) {
        C08CX c08cx;
        set = (i & 1) != 0 ? C08CX.INSTANCE : set;
        if ((i & 2) != 0) {
            c08cx = C08CX.INSTANCE;
        } else {
            c08cx = null;
        }
        this((Set<String>) set, c08cx);
    }
}
