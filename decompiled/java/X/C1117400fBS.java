package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0fBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1117400fBS implements InterfaceC1117390fBR {
    public final List<Class<?>> LIZ = new ArrayList();
    public final List<C0J8P<?, ?>> LIZIZ = new ArrayList();
    public final List<InterfaceC1112620f3k<?>> LIZJ = new ArrayList();

    @Override // X.InterfaceC1117390fBR
    public C0J8P<?, ?> LIZ(int i) {
        return (C0J8P) ListProtector.get(this.LIZIZ, i);
    }

    @Override // X.InterfaceC1117390fBR
    public final boolean LIZJ(Class<?> cls) {
        boolean z = false;
        while (true) {
            int iIndexOf = ((ArrayList) this.LIZ).indexOf(cls);
            if (iIndexOf != -1) {
                ListProtector.remove(this.LIZ, iIndexOf);
                ListProtector.remove(this.LIZIZ, iIndexOf);
                ListProtector.remove(this.LIZJ, iIndexOf);
                z = true;
            } else {
                return z;
            }
        }
    }

    @Override // X.InterfaceC1117390fBR
    public final int LIZLLL(Class<?> cls) {
        int iIndexOf = ((ArrayList) this.LIZ).indexOf(cls);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            if (((Class) ListProtector.get(this.LIZ, i)).isAssignableFrom(cls)) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC1117390fBR
    public final InterfaceC1112620f3k<?> LJ(int i) {
        return (InterfaceC1112620f3k) ListProtector.get(this.LIZJ, i);
    }

    @Override // X.InterfaceC1117390fBR
    public final <T> void LIZIZ(Class<? extends T> cls, C0J8P<T, ?> c0j8p, InterfaceC1112620f3k<T> interfaceC1112620f3k) {
        ((ArrayList) this.LIZ).add(cls);
        ((ArrayList) this.LIZIZ).add(c0j8p);
        ((ArrayList) this.LIZJ).add(interfaceC1112620f3k);
    }
}
