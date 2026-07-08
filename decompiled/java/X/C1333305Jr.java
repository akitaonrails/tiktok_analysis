package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.HashMap;

/* JADX INFO: renamed from: X.05Jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1333305Jr<COMPONENT, PARAM> {
    public final InterfaceC497601wk LIZ;
    public final PARAM LIZIZ;
    public final HashMap<C13IQ<?>, AbstractC1333605Ju<? extends COMPONENT, PARAM>> LIZJ = new HashMap<>();
    public final C1333805Jw<COMPONENT, PARAM> LIZLLL;
    public final C1333205Jq LJ;
    public AnonymousClass0956 LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C1333305Jr(LifecycleCoroutineScope lifecycleCoroutineScope, AbstractC738140SxQ abstractC738140SxQ, C2189821An6 c2189821An6) {
        this.LIZ = lifecycleCoroutineScope;
        this.LIZIZ = c2189821An6;
        this.LIZLLL = new C1333805Jw<>(abstractC738140SxQ, abstractC738140SxQ, c2189821An6);
        C1333205Jq c1333205Jq = new C1333205Jq();
        this.LJ = c1333205Jq;
        c1333205Jq.LIZJ.add(new C1333105Jp(this));
    }
}
