package X;

import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1088560eQw<T> extends AbstractC1088350eQb<T> implements InterfaceC1088570eQx<Pair<? extends InterfaceC1100800ekg, ? extends C1101180elI>> {
    public final C1088580eQy LLILLL;

    @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void LJ() {
        C1088580eQy c1088580eQy = this.LLILLL;
        if (((ArrayList) c1088580eQy.LIZIZ).contains(this)) {
            return;
        }
        ((ArrayList) c1088580eQy.LIZIZ).add(this);
        Pair<? extends InterfaceC1100800ekg, C1101180elI> pair = c1088580eQy.LIZJ;
        if (pair != null) {
            LIZJ(pair);
        }
    }

    @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public final void release() {
        C1088580eQy c1088580eQy = this.LLILLL;
        if (((ArrayList) c1088580eQy.LIZIZ).contains(this)) {
            ((ArrayList) c1088580eQy.LIZIZ).remove(this);
        }
    }

    public AbstractC1088560eQw(C1088580eQy c1088580eQy, AbstractC1084540eKS abstractC1084540eKS) {
        super(abstractC1084540eKS);
        this.LLILLL = c1088580eQy;
    }
}
