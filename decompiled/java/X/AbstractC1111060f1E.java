package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import mr0.r0;

/* JADX INFO: renamed from: X.0f1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1111060f1E<MODEL extends r0<? extends AbstractC1136060ffY>> extends AbstractC1110760f0k<MODEL> {
    public final AbstractC1113530f5D LLILZ;

    public abstract void P5(C1109770ez9 c1109770ez9, MODEL model, List<Object> list);

    public AbstractC1111060f1E(View view, AbstractC1113530f5D abstractC1113530f5D) {
        super(view);
        this.LLILZ = abstractC1113530f5D;
    }

    @Override // X.AbstractC1111020f1A
    public final /* bridge */ /* synthetic */ void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
    }

    @Override // X.AbstractC1111020f1A
    public final void N5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q, List list) {
        AbstractC1110800f0o<?> abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q;
        AbstractC1113530f5D abstractC1113530f5D = this.LLILZ;
        if (abstractC1113530f5D != null) {
            abstractC1113530f5D.LJII(abstractC1110800f0o, list);
        }
        super.N5(c1109770ez9, abstractC1110800f0o, list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof C1113480f58) {
                return;
            }
        }
        P5(c1109770ez9, abstractC1110800f0o, list);
    }
}
