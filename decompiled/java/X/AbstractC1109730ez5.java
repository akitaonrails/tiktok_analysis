package X;

import cu0.a;
import cu0.b;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0ez5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1109730ez5 extends C1117360fBO {
    public C1109770ez9 LLILLL;
    public final ArrayList<Class<? extends C1109600eys<? extends InterfaceC1111870f2X>>> LLILZ = new ArrayList<>();

    public final <TEXT_MODEL extends a, PINNED_MODEL extends b<TEXT_MODEL>, VH extends AbstractC1109720ez4<TEXT_MODEL, PINNED_MODEL>> void LLLIIIIL(Class<PINNED_MODEL> cls, AbstractC1109740ez6<TEXT_MODEL, PINNED_MODEL, VH> abstractC1109740ez6) {
        this.LLILLJJLI.LIZJ(cls);
        if (!this.LLILZ.contains(cls)) {
            this.LLILZ.add(cls);
        }
        C1109770ez9 c1109770ez9 = this.LLILLL;
        if (c1109770ez9 != null) {
            abstractC1109740ez6.LIZIZ = c1109770ez9;
        }
        LLLI(cls, abstractC1109740ez6);
    }
}
