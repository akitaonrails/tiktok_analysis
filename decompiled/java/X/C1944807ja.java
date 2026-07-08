package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1944807ja implements InterfaceC1944907jb<String> {
    public final String LIZ;
    public final /* synthetic */ C2027907wz LIZIZ;

    @Override // X.InterfaceC1944907jb
    public final Iterable<InterfaceC1944907jb<String>> LIZ() {
        String str = this.LIZ;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJJJJZ("/", a0.LJJJLL("/", a0.LJJLIL(str, "://", str))), new String[]{"/"}, 0, 6);
        C2027907wz c2027907wz = this.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1944807ja(c2027907wz, (String) it2.next()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1944907jb
    public final /* bridge */ /* synthetic */ String getContent() {
        return this.LIZ;
    }

    public final String toString() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1944907jb
    public final C1944807ja LIZIZ(InterfaceC1944907jb interfaceC1944907jb) {
        C2027907wz c2027907wz = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('/');
        sbLIZ.append((String) interfaceC1944907jb.getContent());
        return new C1944807ja(c2027907wz, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C1944807ja LIZJ(InterfaceC1944907jb interfaceC1944907jb) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) interfaceC1944907jb.getContent());
        sbLIZ.append('/');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int iLJJJ = a0.LJJJ(this.LIZ, strLIZIZ, 0, false, 6);
        if (iLJJJ == -1) {
            return null;
        }
        return new C1944807ja(this.LIZIZ, this.LIZ.substring(iLJJJ + strLIZIZ.length(), this.LIZ.length()));
    }

    public C1944807ja(C2027907wz c2027907wz, String str) {
        this.LIZIZ = c2027907wz;
        this.LIZ = str;
    }
}
