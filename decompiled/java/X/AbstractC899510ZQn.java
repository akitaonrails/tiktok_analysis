package X;

import X.C03H5;
import java.util.List;

/* JADX INFO: renamed from: X.0ZQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC899510ZQn<RECEIVER extends C03H5, T> {
    public final InterfaceC461030I6b<RECEIVER, T> LIZ;
    public final InterfaceC2187608he LIZIZ;

    public abstract C461020I6a<T> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i);

    public void LIZIZ(List<? extends C869590Y9l> list) {
    }

    public /* synthetic */ AbstractC899510ZQn(InterfaceC461030I6b interfaceC461030I6b) {
        this(interfaceC461030I6b, new InterfaceC2187608he() { // from class: X.1EEc
            public static final C2277931EEd LIZIZ = C2277931EEd.LIZ;
            public static final String LIZJ = "dummy_none";

            @Override // X.InterfaceC2187608he
            public final String LIZ() {
                return LIZJ;
            }

            @Override // X.InterfaceC2187608he
            public final InterfaceC2187908hh LJJJ() {
                return LIZIZ;
            }
        });
    }

    public AbstractC899510ZQn(InterfaceC461030I6b<RECEIVER, T> interfaceC461030I6b, InterfaceC2187608he interfaceC2187608he) {
        this.LIZ = interfaceC461030I6b;
        this.LIZIZ = interfaceC2187608he;
    }
}
