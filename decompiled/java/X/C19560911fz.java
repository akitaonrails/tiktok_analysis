package X;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19560911fz extends C09AY implements Function0<C11NZ<Pair<? extends Integer, ? extends Bitmap>>> {
    public final /* synthetic */ C19560811fy LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19560911fz(C19560811fy c19560811fy, int i, int i2, int i3) {
        super(0);
        this.LL = c19560811fy;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11NZ<Pair<? extends Integer, ? extends Bitmap>> invoke() {
        final C19560811fy c19560811fy = this.LL;
        final int i = this.LLILLJJLI;
        final int i2 = this.LLILLL;
        final int i3 = this.LLILZ;
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.11g1
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Pair<Integer, Bitmap>> c09aj) {
                C1C7U.LIZ("VideoCoverDataSource@8878.sourceObservable$2$1");
                final AtomicInteger atomicInteger = new AtomicInteger();
                InterfaceC1447630nm5 interfaceC1447630nm5 = c19560811fy.LIZ;
                int i4 = i;
                int i5 = i2;
                final int i6 = i3;
                final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                interfaceC1447630nm5.LIZIZ(i4, i5, new InterfaceC1699590uKT() { // from class: X.11g2
                    @Override // X.InterfaceC1699590uKT
                    public final void LIZ(int i7, int i8, Bitmap bitmap) {
                        c19482611Ke.onNext(new Pair<>(Integer.valueOf(i7), bitmap));
                        if (atomicInteger.incrementAndGet() == i6) {
                            c19482611Ke.onComplete();
                        }
                    }
                });
                C1C7U.LIZIZ("VideoCoverDataSource@8878.sourceObservable$2$1");
            }
        });
    }
}
