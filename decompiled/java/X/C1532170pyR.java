package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532170pyR {
    public final C1532300pye LIZ;
    public String LIZIZ;
    public boolean LIZJ = true;
    public Integer LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public Pair<String, Long> LJIIJ;
    public EnumC1532440pys LJIIJJI;
    public LinkedList<Pair<?, AbstractC1532320pyg<?, ?>>> LJIIL;
    public HashSet<AbstractC1532320pyg<?, ?>> LJIILIIL;
    public InterfaceC1529320ptq LJIILJJIL;
    public LinkedHashMap<String, Function0<JSONObject>> LJIILL;
    public C1541080qCo<C1532310pyf> LJIILLIIL;

    public final String LIZ() {
        C1532340pyi c1532340pyi;
        InterfaceC1532190pyT interfaceC1532190pyT;
        String str = this.LJI;
        if (str != null) {
            return str;
        }
        C1532300pye c1532300pye = this.LIZ;
        if (c1532300pye == null || (c1532340pyi = c1532300pye.LJIIZILJ) == null || (interfaceC1532190pyT = c1532340pyi.LIZIZ) == null) {
            return null;
        }
        return interfaceC1532190pyT.getFilepath();
    }

    public C1532170pyR(C1532300pye c1532300pye) {
        this.LIZ = c1532300pye;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <Input, Output> void LIZIZ(AbstractC1532320pyg<Input, Output> abstractC1532320pyg) {
        C1532300pye c1532300pye;
        if (this.LJIIL == null && (c1532300pye = this.LIZ) != null) {
            HashMap<Class<?>, C1532180pyS> map = c1532300pye.LJIIJ;
            Class<Output> cls = abstractC1532320pyg.LIZIZ;
            if (map.get(cls) == null) {
                map.put((Class<?>) cls, new C1532180pyS());
            }
            HashMap<Class<?>, C1532180pyS> map2 = c1532300pye.LJIIJ;
            Class<Input> cls2 = abstractC1532320pyg.LIZ;
            C1532180pyS c1532180pyS = map2.get(cls2);
            if (c1532180pyS == null) {
                c1532180pyS = new C1532180pyS();
                map2.put((Class<?>) cls2, c1532180pyS);
            }
            C1532180pyS c1532180pyS2 = c1532180pyS;
            HashMap<Class<?>, AbstractC1532320pyg<?, ?>> map3 = c1532180pyS2.LJFF;
            if (map3 == null) {
                map3 = new HashMap<>();
            }
            c1532180pyS2.LJFF = map3;
            map3.put(abstractC1532320pyg.LIZIZ, abstractC1532320pyg);
        }
    }
}
