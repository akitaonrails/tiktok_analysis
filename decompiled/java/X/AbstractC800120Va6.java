package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Va6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC800120Va6 implements InterfaceC800100Va4 {
    @Override // X.InterfaceC800100Va4
    public final InterfaceC800080Va2 LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        return interfaceC800080Va2;
    }

    @Override // X.InterfaceC800100Va4
    public final void LIZJ(InterfaceC800080Va2 interfaceC800080Va2) {
    }

    @Override // X.InterfaceC800100Va4
    public void LJFF() {
    }

    @Override // X.InterfaceC800100Va4
    public final void LJI() {
    }

    public AbstractC800120Va6() {
        new ThreadLocal<List<InterfaceC800130Va7>>() { // from class: X.0Va3
            @Override // java.lang.ThreadLocal
            public final List<InterfaceC800130Va7> initialValue() {
                return new ArrayList();
            }
        };
    }
}
