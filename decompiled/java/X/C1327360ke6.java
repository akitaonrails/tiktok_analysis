package X;

import android.content.ContentResolver;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0ke6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327360ke6 implements InterfaceC1327290kdz<C1328480kfu> {
    public final Executor LIZ;
    public final InterfaceC1327440keE LIZIZ;
    public final ContentResolver LIZJ;

    @Override // X.InterfaceC1327290kdz
    public final boolean LIZ(C1324630kZh c1324630kZh) {
        return C1327270kdx.LIZ(512, 512, c1324630kZh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ke0, java.lang.Runnable] */
    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        final InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
        final String id = interfaceC1327930kf1.getId();
        final C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
        final ?? r1 = new AbstractC1327520keM<C1328480kfu>(interfaceC1328020kfA, interfaceC1325690kbPLIZ, id) { // from class: X.0ke0
            /* JADX WARN: Removed duplicated region for block: B:76:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // X.AbstractRunnableC2124508Tz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZJ() throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 317
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1327300ke0.LIZJ():java.lang.Object");
            }

            @Override // X.AbstractRunnableC2124508Tz
            public final void LIZIZ(Object obj) {
                C1328480kfu.LIZIZ((C1328480kfu) obj);
            }

            @Override // X.AbstractC1327520keM
            public final Map LJIIIIZZ(C1328480kfu c1328480kfu) {
                boolean z;
                if (c1328480kfu != null) {
                    z = true;
                } else {
                    z = false;
                }
                return C19871212ow.of("createdThumbnail", Boolean.toString(z));
            }
        };
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0ke8
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                r1.LIZ();
            }
        });
        this.LIZ.execute(r1);
    }

    public C1327360ke6(Executor executor, InterfaceC1327440keE interfaceC1327440keE, ContentResolver contentResolver) {
        this.LIZ = executor;
        this.LIZIZ = interfaceC1327440keE;
        this.LIZJ = contentResolver;
    }
}
