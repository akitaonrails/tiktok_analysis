package X;

import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532310pyf implements InterfaceC1541240qD4 {
    public final C1532710pzJ LIZ;
    public final C1532300pye LIZIZ;
    public final C1532480pyw LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final C1532410pyp<? extends Object> LJI;
    public InterfaceC1532190pyT LJII;
    public final List<String> LJIIIIZZ;
    public final C1532170pyR LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;
    public final Integer LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;

    @Override // X.InterfaceC1541240qD4, X.InterfaceC1541260qD6
    public final boolean LIZ(C1540930qCZ c1540930qCZ) {
        return true;
    }

    @Override // X.InterfaceC1541260qD6
    public final boolean LIZJ(C1540930qCZ c1540930qCZ) {
        return true;
    }

    public final void LIZIZ() {
        Integer resourceSize;
        if (this.LIZIZ == null) {
            return;
        }
        C1522590piz c1522590piz = C1522590piz.LIZ;
        C1532410pyp<? extends Object> c1532410pyp = this.LJI;
        if (c1532410pyp == null || (resourceSize = c1532410pyp.LIZ.LIZJ()) == null) {
            InterfaceC1532190pyT interfaceC1532190pyT = this.LJII;
            resourceSize = interfaceC1532190pyT != null ? interfaceC1532190pyT.getResourceSize() : null;
        }
        String str = this.LJIIJJI;
        C1541080qCo<C1532310pyf> c1541080qCo = this.LIZ.LJJIIZI;
        C08AB c08ab = c1541080qCo != null ? c1541080qCo.LJIIL : null;
        String strLJ = LJ();
        Integer num = this.LJIIL;
        C1532170pyR c1532170pyR = this.LIZIZ.LJII;
        boolean z = c1532170pyR.LJIIIIZZ;
        boolean z2 = c1532170pyR.LJII;
        boolean z3 = c1532170pyR.LJIIIZ;
        Pair<String, Long> pair = c1532170pyR.LJIIJ;
        Map<String, String> mapLJI = LJI();
        C1532710pzJ c1532710pzJ = this.LIZ;
        boolean zIsSuccess = isSuccess();
        C1532410pyp<? extends Object> c1532410pyp2 = this.LJI;
        Class<? extends Object> cls = c1532410pyp2 != null ? c1532410pyp2.LIZJ : null;
        List<String> list = this.LJIIIIZZ;
        InterfaceC1532190pyT interfaceC1532190pyT2 = this.LJII;
        EnumC1532440pys enumC1532440pys = this.LIZIZ.LJII.LJIIJJI;
        String string = enumC1532440pys != null ? enumC1532440pys.toString() : null;
        LinkedHashMap<String, Function0<JSONObject>> linkedHashMap = this.LIZIZ.LJII.LJIILL;
        c1522590piz.getClass();
        C1532960pzi.LJ(new C1532160pyQ(c1532710pzJ, interfaceC1532190pyT2, c08ab, cls, resourceSize, num, str, strLJ, string, linkedHashMap, list, mapLJI, pair, z2, z, z3, zIsSuccess));
    }

    public final String LIZLLL() {
        if (this.LJIILJJIL == null) {
            List<String> list = C1531200pws.LIZ;
            Pair pairLIZJ = C1531200pws.LIZJ(LJI());
            if (pairLIZJ != null) {
                this.LJIILIIL = (String) pairLIZJ.getFirst();
                this.LJIILJJIL = (String) pairLIZJ.getSecond();
                this.LJIIIZ.LJ = LJ();
                this.LJIIIZ.LJFF = this.LJIILJJIL;
            }
            if (this.LJIILJJIL == null) {
                this.LJIILJJIL = "";
            }
        }
        return this.LJIILJJIL;
    }

    public final String LJ() {
        String str;
        if (this.LJIILIIL == null) {
            List<String> list = C1531200pws.LIZ;
            Pair pairLIZJ = C1531200pws.LIZJ(LJI());
            if (pairLIZJ != null) {
                this.LJIILIIL = (String) pairLIZJ.getFirst();
                this.LJIILJJIL = (String) pairLIZJ.getSecond();
                C1532170pyR c1532170pyR = this.LJIIIZ;
                c1532170pyR.LJ = this.LJIILIIL;
                c1532170pyR.LJFF = LIZLLL();
                return this.LJIILIIL;
            }
            C1532710pzJ c1532710pzJ = this.LIZ;
            C1529350ptt c1529350ptt = c1532710pzJ.LJJIIJ;
            if (c1529350ptt == null || (str = c1529350ptt.LIZJ) == null) {
                str = c1532710pzJ.LJJIII.LIZIZ;
            }
            String strLJJLJ = a0.LJJLJ('/', str, str);
            String strLJJLJ2 = a0.LJJLJ('.', strLJJLJ, strLJJLJ);
            if (strLJJLJ2 == strLJJLJ) {
                strLJJLJ2 = "";
            }
            C1529710puT.LIZ.getClass();
            String strLJ = C1529710puT.LJ(strLJJLJ2);
            this.LJIILIIL = strLJ != null ? strLJ : "";
        }
        return this.LJIILIIL;
    }

    public final String LJFF() {
        String filepath;
        InterfaceC1532190pyT interfaceC1532190pyT = this.LJII;
        return (interfaceC1532190pyT == null || (filepath = interfaceC1532190pyT.getFilepath()) == null) ? this.LJIIIZ.LIZ() : filepath;
    }

    public final Map<String, String> LJI() {
        InterfaceC1532190pyT interfaceC1532190pyT = this.LJII;
        if (interfaceC1532190pyT != null) {
            return interfaceC1532190pyT.getHttpResponseHeaders();
        }
        return null;
    }

    public final Long LJIIIZ() {
        InterfaceC1532190pyT interfaceC1532190pyT = this.LJII;
        if (interfaceC1532190pyT != null) {
            return interfaceC1532190pyT.getVersion();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] LJIIJ() {
        AbstractC1532350pyj abstractC1532350pyjLJIIL = LJIIL(byte[].class);
        if (abstractC1532350pyjLJIIL != null) {
            return (byte[]) abstractC1532350pyjLJIIL.LIZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final File LJIIJJI() {
        AbstractC1532350pyj abstractC1532350pyjLJIIL = LJIIL(File.class);
        if (abstractC1532350pyjLJIIL != null) {
            return (File) abstractC1532350pyjLJIIL.LIZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse LJIILIIL() {
        InputStream inputStream;
        AbstractC1532350pyj abstractC1532350pyjLJIIL = LJIIL(InputStream.class);
        if (abstractC1532350pyjLJIIL == null || (inputStream = (InputStream) abstractC1532350pyjLJIIL.LIZ) == null) {
            return null;
        }
        C1529710puT c1529710puT = C1529710puT.LIZ;
        String strLJ = LJ();
        String strLIZLLL = LIZLLL();
        String str = this.LIZ.LJJIII.LIZ;
        Map<String, String> mapLJI = LJI();
        c1529710puT.getClass();
        return C1529710puT.LIZLLL(strLJ, strLIZLLL, inputStream, str, mapLJI);
    }

    @Override // X.InterfaceC1541240qD4
    public final boolean isSuccess() {
        return this.LJI != null;
    }

    public final AbstractC1532350pyj<?> LJII() {
        C1532410pyp<? extends Object> c1532410pyp;
        if (!isSuccess() || (c1532410pyp = this.LJI) == null) {
            return null;
        }
        AtomicBoolean atomicBoolean = c1532410pyp.LIZIZ;
        return (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) ? c1532410pyp.LIZ.LIZIZ(this.LIZ) : c1532410pyp.LIZ;
    }

    public final <T> AbstractC1532350pyj<T> LJIIIIZZ(Class<T> cls) {
        Class<? extends Object> cls2;
        AbstractC1532350pyj<T> abstractC1532350pyj;
        C1532340pyi c1532340pyiLJIIIZ;
        C1532410pyp<? extends Object> c1532410pyp = this.LJI;
        if (c1532410pyp != null) {
            cls2 = c1532410pyp.LIZJ;
        } else {
            cls2 = null;
        }
        if (Intrinsics.LJFF(cls, cls2)) {
            AbstractC1532350pyj<T> abstractC1532350pyj2 = (AbstractC1532350pyj<T>) LJII();
            if ((abstractC1532350pyj2 instanceof AbstractC1532350pyj) && abstractC1532350pyj2 != null) {
                return abstractC1532350pyj2;
            }
        }
        C1532300pye c1532300pye = this.LIZIZ;
        if (c1532300pye != null && (c1532340pyiLJIIIZ = c1532300pye.LJIIIZ(this.LIZ, cls, null)) != null) {
            abstractC1532350pyj = (AbstractC1532350pyj<T>) c1532340pyiLJIIIZ.LIZ;
        } else {
            abstractC1532350pyj = null;
        }
        if (abstractC1532350pyj instanceof AbstractC1532350pyj) {
            return abstractC1532350pyj;
        }
        return null;
    }

    public final <T> AbstractC1532350pyj<T> LJIIL(Class<T> cls) {
        Class<? extends Object> cls2;
        C1532410pyp<? extends Object> c1532410pyp = this.LJI;
        if (c1532410pyp != null) {
            cls2 = c1532410pyp.LIZJ;
        } else {
            cls2 = null;
        }
        if (Intrinsics.LJFF(cls, cls2)) {
            AbstractC1532350pyj<T> abstractC1532350pyj = (AbstractC1532350pyj<T>) LJII();
            if ((abstractC1532350pyj instanceof AbstractC1532350pyj) && abstractC1532350pyj != null) {
                return abstractC1532350pyj;
            }
        }
        C1541080qCo<C1532310pyf> c1541080qCo = this.LIZ.LJJIIZI;
        if (c1541080qCo == null) {
            return null;
        }
        C259800zU c259800zU = new C259800zU();
        C1532300pye c1532300pye = this.LIZIZ;
        if (c1532300pye != null) {
            C1532300pye c1532300pye2 = new C1532300pye(false, this.LIZ, cls, true, c1541080qCo);
            c1532300pye2.LIZIZ = new C1532380pym(this, c259800zU, cls);
            c1532300pye.LJ(c1532300pye2);
        }
        return (AbstractC1532350pyj) c259800zU.element;
    }

    public C1532310pyf(C1532710pzJ c1532710pzJ, C1532300pye c1532300pye, EnumC1541200qD0 enumC1541200qD0, C1532340pyi c1532340pyi) {
        boolean z;
        String str;
        C1532410pyp<? extends Object> c1532410pyp;
        InterfaceC1532190pyT interfaceC1532190pyT;
        LinkedList<String> linkedList;
        AbstractC1532350pyj<?> abstractC1532350pyj;
        this.LIZ = c1532710pzJ;
        this.LIZIZ = c1532300pye;
        this.LIZJ = c1532710pzJ.LJJIJIIJI;
        if (enumC1541200qD0 == EnumC1541200qD0.CACHE) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
        this.LJ = enumC1541200qD0 == EnumC1541200qD0.REQUEST;
        C1541080qCo<C1532310pyf> c1541080qCo = c1532710pzJ.LJJIIZI;
        if (c1541080qCo != null) {
            str = c1541080qCo.LIZ.LJI;
        } else {
            str = null;
        }
        this.LJFF = str;
        if (c1532340pyi != null && (abstractC1532350pyj = c1532340pyi.LIZ) != null) {
            c1532410pyp = new C1532410pyp<>(!c1532710pzJ.LJJI, abstractC1532350pyj);
        } else {
            c1532410pyp = null;
        }
        this.LJI = c1532410pyp;
        if (c1532340pyi != null) {
            interfaceC1532190pyT = c1532340pyi.LIZIZ;
        } else {
            interfaceC1532190pyT = null;
        }
        this.LJII = interfaceC1532190pyT;
        if (c1532300pye != null) {
            linkedList = c1532300pye.LJIILJJIL;
        } else {
            linkedList = null;
        }
        this.LJIIIIZZ = linkedList;
        C1532170pyR c1532170pyR = (c1532300pye == null || (c1532170pyR = c1532300pye.LJII) == null) ? new C1532170pyR(null) : c1532170pyR;
        this.LJIIIZ = c1532170pyR;
        this.LJIIJ = c1532170pyR.LIZJ;
        String str2 = c1532170pyR.LIZIZ;
        this.LJIIJJI = str2 == null ? "" : str2;
        this.LJIIL = c1532170pyR.LIZLLL;
        this.LJIILIIL = c1532170pyR.LJ;
        this.LJIILJJIL = c1532170pyR.LJFF;
    }
}
