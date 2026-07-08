package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Vn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C808140Vn2<K, V> {
    public final InterfaceC808120Vn0<K, V> LIZ;
    public final C808170Vn5 LIZIZ;
    public final InterfaceC808000Vmo LIZJ;
    public final InterfaceC497601wk LIZLLL;
    public final ConcurrentHashMap<K, V> LJ;
    public final ConcurrentLinkedQueue<Pair<K, V>> LJFF;
    public final C01GW LJI;
    public volatile AnonymousClass0956 LJII;
    public final C1DEV LJIIIIZZ;
    public volatile boolean LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:37:0x00bd, B:39:0x00c6), top: B:51:0x00bd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808140Vn2.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:17|(2:85|18)|81|50|60|(3:77|62|(2:64|76))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        new kotlin.jvm.internal.AwS557S0100000_13(r13, 149);
        r2.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009e -> B:35:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a0 -> B:35:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x011b -> B:35:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x012f -> B:35:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<X.C808220VnA<K, V>> r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808140Vn2.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(K k, V v) {
        if (this.LJIIIZ) {
            return;
        }
        this.LJFF.add(new Pair<>(k, v));
        Runnable aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 188);
        ARunnableS82S0200000_13 aRunnableS82S0200000_13 = new ARunnableS82S0200000_13(aRunnableS113S0100000_13, this, 58);
        if (!((Boolean) this.LJI.getValue()).booleanValue()) {
            aRunnableS113S0100000_13 = aRunnableS82S0200000_13;
        }
        InterfaceC808000Vmo interfaceC808000Vmo = this.LIZJ;
        if (interfaceC808000Vmo != null) {
            interfaceC808000Vmo.execute(aRunnableS113S0100000_13);
        } else {
            aRunnableS113S0100000_13.run();
        }
    }

    public C808140Vn2(C808190Vn7 c808190Vn7, C808170Vn5 c808170Vn5, InterfaceC808000Vmo interfaceC808000Vmo) {
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        this.LIZ = c808190Vn7;
        this.LIZIZ = c808170Vn5;
        this.LIZJ = interfaceC808000Vmo;
        this.LIZLLL = c054gLIZ;
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = new ConcurrentLinkedQueue<>();
        this.LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3204));
        this.LJIIIIZZ = C2191201ApK.LIZ();
    }
}
