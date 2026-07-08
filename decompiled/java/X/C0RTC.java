package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RTC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0RTC<T extends ReusedAssem<? extends C03H5>> implements C0RTL, C0RTK {
    public C13IQ<? extends T> LLILLL;
    public T LLILZ;
    public C0RTJ LLILZLL;
    public InterfaceC1587906Jp LLIZ;
    public Map<String, Object> LLIZLLLIL;
    public final /* synthetic */ C0RTE LL = new C0RTE();
    public final /* synthetic */ C0RTD LLILLJJLI = new C0RTD();
    public C694070RKj LLILZIL = C694070RKj.LIZ;

    @Override // X.C0RTL
    public final AbstractC738410Sxr LIZ() {
        return null;
    }

    @Override // X.C0RTK
    public final void Zf(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        this.LL.Zf(map);
    }

    @Override // X.C0RTK
    public final Map<AbstractC1155604fa<?>, C0RTG<?>> ff() {
        return this.LL.LL;
    }

    public C0RTC() {
        new ArrayList();
        this.LLIZLLLIL = new LinkedHashMap();
    }

    public final C13IQ LIZLLL() {
        ReusedAssem reusedAssemLIZJ = LIZJ();
        if (reusedAssemLIZJ != null) {
            return C13LE.LIZ(reusedAssemLIZJ.getClass());
        }
        C13IQ<? extends T> c13iq = this.LLILLL;
        if (c13iq == null) {
            throw new IllegalArgumentException("Can not find assemble class type. Have you forget to set it?");
        }
        return c13iq;
    }

    public T LIZJ() {
        return this.LLILZ;
    }

    @Override // X.C0RTL
    public final List<T> LIZIZ(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        List<T> list = (List) new C694190RKv(this).invoke();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            LJ(it2.next());
        }
        return list;
    }

    public void LJ(ReusedAssem reusedAssem) {
        reusedAssem.LLILZIL.putAll(this.LLIZLLLIL);
        reusedAssem.active = Intrinsics.LJFF(this.LLILZIL, C694070RKj.LIZ);
        reusedAssem.vmMapping.putAll(this.LLILLJJLI.LIZ);
        reusedAssem.LLJ = this.LLILZIL;
    }

    public final void LJFF(Object obj, String str) {
        this.LLIZLLLIL.put(str, obj);
    }
}
