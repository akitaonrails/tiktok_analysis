package X;

import com.ss.android.ugc.aweme.unifiedauth.service.PopupInfoServiceImpl;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Di5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346430Di5 implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public static final void run$0(C346430Di5 c346430Di5) {
        Function0 function0 = (Function0) c346430Di5.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void run$1(C346430Di5 c346430Di5) {
        ((PopupInfoServiceImpl) c346430Di5.l0).LIZIZ.decrementAndGet();
    }

    public static final void run$2(C346430Di5 c346430Di5) {
        ((C05XL) c346430Di5.l0).LJJJJJ(new NoSuchElementException("Observable completed without emitting"));
    }

    public static final void run$3(C346430Di5 c346430Di5) {
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) c346430Di5.l0).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$4(C346430Di5 c346430Di5) {
        C259800zU c259800zU = (C259800zU) c346430Di5.l0;
        CountDownLatch countDownLatch = (CountDownLatch) c259800zU.element;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        c259800zU.element = null;
    }

    public static final void run$5(C346430Di5 c346430Di5) {
        ((C05XL) c346430Di5.l0).LJJJJJ(new NoSuchElementException("Observable completed without emitting"));
    }

    public C346430Di5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
