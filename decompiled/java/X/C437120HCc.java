package X;

import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437120HCc extends AbstractC21434518uV {
    public final TextView LIZ;
    public final Integer LIZIZ;

    @Override // X.AbstractC21434218uS
    public final Collection<String> LIZJ() {
        return C1697810uHb.LJIILJJIL("entity");
    }

    public C437120HCc(TextView textView, Integer num) {
        this.LIZ = textView;
        this.LIZIZ = num;
    }

    @Override // X.AbstractC21434518uV
    public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
        boolean z;
        List<InterfaceC21436718ur> listLIZ = interfaceC21435018ua.LIZJ().LIZ();
        if ((listLIZ instanceof Collection) && listLIZ.isEmpty()) {
            z = false;
        } else {
            Iterator<InterfaceC21436718ur> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().name(), "mark")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return new C416520GUw(this.LIZ, interfaceC21435018ua.LIZIZ(), this.LIZIZ, z);
    }
}
