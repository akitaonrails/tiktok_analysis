package X;

import Y.AfS171S0100000_2;
import Y.AfS38S1200000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.util.Size;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS369S0200000_3;

/* JADX INFO: renamed from: X.090j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23023090j {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC23026090m interfaceC23026090m, SmartImageView smartImageView, final Size size, final MediaModel mediaModel) {
        C19482711Kf c19482711KfLJIJJLI;
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C01GW c01gw = C23025090l.LIZ;
        final CancellationSignal cancellationSignal = null;
        AwS369S0200000_3 awS369S0200000_3 = new AwS369S0200000_3((Function0) null, (Function0<Unit>) interfaceC23026090m, (InterfaceC23026090m) 27);
        final Context context = smartImageView.getContext();
        String strLJFF = mediaModel.LJFF();
        smartImageView.setTag(strLJFF);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            cancellationSignal = new CancellationSignal();
            c19482711KfLJIJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.090g
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<Bitmap> c09aj) {
                    C1C7U.LIZ("LocalImageThumbnailUtils@a178.load$observable$1");
                    try {
                        Bitmap bitmapLoadThumbnail = context.getContentResolver().loadThumbnail(C2471909mP.LJIILIIL(mediaModel.LJFF()), size, cancellationSignal);
                        if (!c09aj.isDisposed()) {
                            c09aj.onNext(bitmapLoadThumbnail);
                            c09aj.onComplete();
                        }
                    } catch (OperationCanceledException e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (!c09aj.isDisposed()) {
                            c09aj.onComplete();
                        }
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (!c09aj.isDisposed()) {
                            c09aj.onError(e2);
                        }
                    }
                    C1C7U.LIZIZ("LocalImageThumbnailUtils@a178.load$observable$1");
                }
            });
        } else {
            c19482711KfLJIJJLI = C11NZ.LJIJJLI(new C2502209rI(context, mediaModel, 3));
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = c19482711KfLJIJJLI.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS38S1200000_2(smartImageView, strLJFF, awS369S0200000_3, 3), new AfS171S0100000_2(awS369S0200000_3, 75));
        if (i >= 29) {
            final C11JF c11jf = (C11JF) interfaceC420801kMLJJLL;
            interfaceC420801kMLJJLL = new InterfaceC420801kM(c11jf, cancellationSignal) { // from class: X.090k
                public final InterfaceC420801kM LL;
                public final CancellationSignal LLILLJJLI;

                @Override // X.InterfaceC420801kM
                public final void dispose() {
                    CancellationSignal cancellationSignal2 = this.LLILLJJLI;
                    if (cancellationSignal2 != null && !cancellationSignal2.isCanceled()) {
                        this.LLILLJJLI.cancel();
                    }
                    if (this.LL.isDisposed()) {
                        return;
                    }
                    this.LL.dispose();
                }

                @Override // X.InterfaceC420801kM
                public final boolean isDisposed() {
                    if (!this.LL.isDisposed()) {
                        return false;
                    }
                    CancellationSignal cancellationSignal2 = this.LLILLJJLI;
                    return cancellationSignal2 == null || cancellationSignal2.isCanceled();
                }

                {
                    this.LL = c11jf;
                    this.LLILLJJLI = cancellationSignal;
                }
            };
        }
        interfaceC23026090m.LLJILJILJ(interfaceC420801kMLJJLL);
    }
}
