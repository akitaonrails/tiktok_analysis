package X;

import android.util.Pair;
import java.io.Closeable;

/* JADX INFO: renamed from: X.0kec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1327680kec extends AbstractC1328850kgV<Pair<InterfaceC1324680kZm, String>, C1328480kfu> {
    public final InterfaceC1325590kbF LIZJ;

    @Override // X.AbstractC1328850kgV
    public final Closeable LIZJ(Closeable closeable) {
        return C1328480kfu.LIZ((C1328480kfu) closeable);
    }

    @Override // X.AbstractC1328850kgV
    public final C1330000kiM LJI(Closeable closeable) throws Throwable {
        C1328480kfu c1328480kfu = (C1328480kfu) closeable;
        if (c1328480kfu != null) {
            c1328480kfu.LJIJJLI();
            return c1328480kfu.LLILLL;
        }
        return null;
    }

    @Override // X.AbstractC1328850kgV
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public Pair<InterfaceC1324680kZm, String> LJII(InterfaceC1327930kf1 interfaceC1327930kf1) {
        String strValueOf;
        C592490NLr c592490NLrLIZ = this.LIZJ.LIZ(interfaceC1327930kf1.LJFF(), interfaceC1327930kf1.LIZJ());
        if (!interfaceC1327930kf1.LJFF().LJJI) {
            strValueOf = interfaceC1327930kf1.getId();
        } else {
            strValueOf = String.valueOf(interfaceC1327930kf1.LIZIZ().getValue());
        }
        return Pair.create(c592490NLrLIZ, strValueOf);
    }

    public C1327680kec(InterfaceC1325590kbF interfaceC1325590kbF, InterfaceC1327390ke9 interfaceC1327390ke9) {
        super(interfaceC1327390ke9);
        this.LIZJ = interfaceC1325590kbF;
    }
}
