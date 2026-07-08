package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import myl.c;

/* JADX INFO: renamed from: X.0t4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651510t4v implements InterfaceC577590Ml3 {
    public final Map<InterfaceC1651320t4c<?>, Object> LIZ = new LinkedHashMap();
    public final /* synthetic */ c LIZIZ;

    public C1651510t4v(c cVar) {
        this.LIZIZ = cVar;
    }

    @Override // X.InterfaceC577590Ml3
    public final void LIZ(EnumC1651770t5L enumC1651770t5L, Function1 function1) {
        Object obj = ((LinkedHashMap) this.LIZ).get(enumC1651770t5L);
        if (obj != null) {
            this.LIZ.put(enumC1651770t5L, function1.invoke(obj));
            return;
        }
        C1651520t4w c1651520t4w = (C1651520t4w) ((LinkedHashMap) this.LIZIZ.LIZJ).get(enumC1651770t5L);
        if (c1651520t4w == null) {
            return;
        }
        this.LIZ.put(enumC1651770t5L, function1.invoke(c1651520t4w.LIZJ));
    }
}
