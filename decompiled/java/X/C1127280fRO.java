package X;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS135S0110000_17;

/* JADX INFO: renamed from: X.0fRO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127280fRO<T> implements InterfaceC1478005qU {
    public final /* synthetic */ Uri LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ Function1<Boolean, Unit> LIZJ;

    public C1127280fRO(long j, Uri uri, Function1 function1) {
        this.LIZ = uri;
        this.LIZIZ = j;
        this.LIZJ = function1;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<AbstractC1125980fPI> c09aj) {
        C1C7U.LIZ("RxImageLoaderUtils@8e39.isDownloadedRx$1");
        C11RO c11roLIZ = C11S5.LIZ();
        final Uri uri = this.LIZ;
        final long j = this.LIZIZ;
        final Function1<Boolean, Unit> function1 = this.LIZJ;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        c11roLIZ.LIZIZ(new Runnable() { // from class: X.0fRN
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RxImageLoaderUtils@8e39.isDownloadedRx$1$1");
                try {
                    boolean zLJI = C1324570kZb.LJI(uri);
                    c19482611Ke.onNext(new C1125970fPH(zLJI, j));
                    c19482611Ke.onComplete();
                    C500260Jjc.LJJLIIIJJIZ(new AwS135S0110000_17((Function1) function1, (Function1<? super Boolean, Unit>) zLJI, true));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RxImageLoaderUtils@8e39.isDownloadedRx$1$1");
            }
        });
        C1C7U.LIZIZ("RxImageLoaderUtils@8e39.isDownloadedRx$1");
    }
}
