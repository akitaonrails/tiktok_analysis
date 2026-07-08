package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05GQ implements C05GJ {
    public final List<String> LIZ = Collections.singletonList("load_message");
    public final C05GR LIZIZ = new C05GR(8);

    @Override // X.C05GJ
    public final void LIZIZ() {
    }

    @Override // X.C05GJ
    public final String getId() {
        return "chat_voice_preload";
    }

    @Override // X.C05GJ
    public final C05GR LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C05GJ
    public final List<String> LIZJ() {
        return this.LIZ;
    }

    public static C047900Fh LJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getMsgType() != 1813) {
            return null;
        }
        return new C047900Fh(c869590Y9l.getUuid(), C2097908Jt.LIZJ(new Pair("MESSAGE", c869590Y9l)));
    }

    @Override // X.C05GJ
    public final Object LIZLLL(Object obj) {
        C047900Fh c047900FhLJ;
        C047900Fh c047900FhLJ2;
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (Iterable) obj) {
                if ((obj2 instanceof C869590Y9l) && (c047900FhLJ2 = LJ((C869590Y9l) obj2)) != null) {
                    arrayList.add(c047900FhLJ2);
                    if (arrayList.size() >= this.LIZIZ.LIZ) {
                        return arrayList;
                    }
                }
            }
        } else if ((obj instanceof C869590Y9l) && (c047900FhLJ = LJ((C869590Y9l) obj)) != null) {
            Boolean.valueOf(arrayList.add(c047900FhLJ));
        }
        return arrayList;
    }
}
