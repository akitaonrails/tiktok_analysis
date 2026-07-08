package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.18g0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21344618g0 {
    public final ArrayList<InterfaceC21345718gB> LIZ = new ArrayList<>();
    public final ArrayList<InterfaceC21345518g9> LIZIZ = new ArrayList<>();

    public final synchronized void LIZ(C21344918g3 c21344918g3, InterfaceC21345518g9 interfaceC21345518g9) {
        this.LIZ.add(c21344918g3);
        this.LIZIZ.add(interfaceC21345518g9);
    }

    public final synchronized void LIZIZ(C21344918g3 c21344918g3, C21346618gK c21346618gK) {
        int iIndexOf = this.LIZ.indexOf(c21344918g3);
        if (iIndexOf >= 0 && c21346618gK == ListProtector.get(this.LIZIZ, iIndexOf)) {
            ListProtector.remove(this.LIZ, iIndexOf);
            ListProtector.remove(this.LIZIZ, iIndexOf);
        }
    }
}
