package X;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.18fF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21339918fF<K_1, K_2, V> {
    public final int LIZ;
    public final Map<K_1, Map<K_2, LinkedList<C21339918fF<K_1, K_2, V>.a>>> LIZIZ = new HashMap();
    public final C21340018fG<C21339918fF<K_1, K_2, V>.a> LIZJ;
    public final C21340018fG<C21339918fF<K_1, K_2, V>.a> LIZLLL;
    public int LJ;

    public C21339918fF(int i) {
        this.LIZ = i;
        a aVar = new a(null, null, null);
        aVar.LIZLLL = null;
        C21340018fG c21340018fG = (C21340018fG<C21339918fF<K_1, K_2, V>.a>) new C21340018fG(aVar);
        this.LIZJ = c21340018fG;
        a aVar2 = new a(null, null, null);
        aVar2.LIZLLL = null;
        C21340018fG c21340018fG2 = (C21340018fG<C21339918fF<K_1, K_2, V>.a>) new C21340018fG(aVar2);
        this.LIZLLL = c21340018fG2;
        c21340018fG.LIZJ = c21340018fG2;
        c21340018fG2.LIZIZ = c21340018fG;
    }

    /* JADX INFO: renamed from: X.18fF$a */
    public final class a {
        public final K_1 LIZ;
        public final K_2 LIZIZ;
        public final V LIZJ;
        public C21340018fG<C21339918fF<K_1, K_2, V>.a> LIZLLL;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Object obj2, Object obj3) {
            this.LIZ = obj;
            this.LIZIZ = obj2;
            this.LIZJ = obj3;
        }
    }
}
