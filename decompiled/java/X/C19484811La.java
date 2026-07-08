package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11La, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19484811La extends AtomicReference<InterfaceC420801kM> implements InterfaceC420801kM {
    public static final long serialVersionUID = -754898800686245608L;

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    public C19484811La() {
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    public C19484811La(InterfaceC420801kM interfaceC420801kM) {
        lazySet(interfaceC420801kM);
    }

    public boolean replace(InterfaceC420801kM interfaceC420801kM) {
        return C11JE.replace(this, interfaceC420801kM);
    }

    public boolean update(InterfaceC420801kM interfaceC420801kM) {
        return C11JE.set(this, interfaceC420801kM);
    }
}
