package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0foq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141820foq extends AbstractC1141470foH<List<? extends C1141870fov>> {
    public final List<ImageModel> LIZ;
    public List<C1141870fov> LIZIZ = new ArrayList();

    @Override // X.InterfaceC1141210fnr
    public final void LIZIZ(Function1<? super List<? extends List<? extends C1141870fov>>, Unit> function1, Function1<? super C1141050fnb, Unit> function12) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1141820foq(List<? extends ImageModel> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC1141210fnr
    public final void LIZ(final Function1<? super List<? extends C1141870fov>, Unit> function1, final Function1<? super C1141050fnb, Unit> function12) {
        this.LIZIZ = new ArrayList();
        if (this.LIZ.isEmpty()) {
            function1.invoke(this.LIZIZ);
            return;
        }
        List<ImageModel> list = this.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (ImageModel imageModel : list) {
            int i2 = i + 1;
            if (i >= 0) {
                final ImageModel imageModel2 = imageModel;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mask");
                sbLIZ.append(i2);
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                arrayList.add(C11NZ.LJJJJI(new Callable() { // from class: X.0for
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("ImageMaskerResourceFetcher@79d.downloadBitmapAsync$1");
                        final C1141860fou c1141860fou = new C1141860fou(0);
                        c1141860fou.LIZIZ = strLIZIZ;
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        if (imageModel2 != null) {
                            ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(imageModel2, new InterfaceC177000m8() { // from class: X.0fot
                                @Override // X.InterfaceC177000m8
                                public final void LIZ(Bitmap bitmap) {
                                    Bitmap.Config config;
                                    if (bitmap != null && (config = bitmap.getConfig()) != null && !bitmap.isRecycled()) {
                                        c1141860fou.LIZ = bitmap.copy(config, true);
                                    }
                                    countDownLatch.countDown();
                                }
                            });
                            try {
                                C189200o6.m2constructorimpl(Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                        C1C7U.LIZIZ("ImageMaskerResourceFetcher@79d.downloadBitmapAsync$1");
                        return c1141860fou;
                    }
                }).LJL(C11S5.LIZ()));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C11NZ.LJJJLIIL(C13LP.LLIIII(arrayList)).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<C1141860fou>() { // from class: X.0fos
            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                function1.invoke(this.LL.LIZIZ);
                this.LL.getClass();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                this.LL.getClass();
                C20441214yg.LJII(th);
                function12.invoke(new C1141050fnb(-22, "download mask failed", th));
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(C1141860fou c1141860fou) {
                C1141860fou c1141860fou2 = c1141860fou;
                List<C1141870fov> list2 = this.LL.LIZIZ;
                C1141870fov c1141870fov = new C1141870fov();
                c1141870fov.LIZ = c1141860fou2.LIZIZ;
                c1141870fov.LIZJ = c1141860fou2.LIZ;
                c1141870fov.LIZIZ = 1;
                list2.add(c1141870fov);
            }
        });
    }
}
