package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.widget.BulletinLottieImageWidget$showStaticImage$1$2", f = "BulletinLottieImageWidget.kt", l = {}, m = "invokeSuspend")
public final class C2480109nj extends C09AX implements InterfaceC1631620sYq<Boolean, String, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2481009ns LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480109nj(C2481009ns c2481009ns, InterfaceC1364105Vn<? super C2480109nj> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c2481009ns;
    }

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return invoke(bool.booleanValue(), str, interfaceC1364105Vn);
    }

    public final Object invoke(boolean z, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2480109nj c2480109nj = new C2480109nj(this.LLILLL, interfaceC1364105Vn);
        c2480109nj.LL = z;
        c2480109nj.LLILLJJLI = str;
        return c2480109nj.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinLottieImageWidget@f8b2.showStaticImage$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        String str = (String) this.LLILLJJLI;
        C2481009ns c2481009ns = this.LLILLL;
        if (!C0OS8.LJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c2481009ns.LIZIZ);
            sbLIZ.append("-BulletinLottieImageWidget: showStaticImage, onLoadImageResult, imageSuccess:");
            sbLIZ.append(z);
            sbLIZ.append(", imagePath:xxx");
            C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (z) {
            ImageView imageView = this.LLILLL.LJ;
            if (imageView != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(48)));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(48)));
                InterfaceC497601wk interfaceC497601wk = this.LLILLL.LIZ;
                if (C0OS8.LJ()) {
                    boolean zLIZLLL = C426750GoL.LIZLLL(imageView.getContext());
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1468505ox(str, iLIZIZ, iLIZIZ2, zLIZLLL, imageView, null), 2);
                } else {
                    try {
                        if (new C0VSJ(str).exists() && iLIZIZ > 0 && iLIZIZ2 > 0) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(str, options);
                            options.inSampleSize = C624550Oeb.LIZ(options, iLIZIZ, iLIZIZ2);
                            options.inJustDecodeBounds = false;
                            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                            if (bitmapDecodeFile != null) {
                                if (C426750GoL.LIZLLL(imageView.getContext())) {
                                    Matrix matrix = new Matrix();
                                    matrix.postScale(-1.0f, 1.0f);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                                    if (!Intrinsics.LJFF(bitmapCreateBitmap, bitmapDecodeFile)) {
                                        bitmapDecodeFile.recycle();
                                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                                    }
                                    bitmapDecodeFile = bitmapCreateBitmap;
                                }
                                imageView.setImageBitmap(bitmapDecodeFile);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("quick create page loadFileImage error, imagePath: ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", width: ");
                        sbLIZ2.append(iLIZIZ);
                        sbLIZ2.append(", height: ");
                        sbLIZ2.append(iLIZIZ2);
                        sbLIZ2.append(". ");
                        sbLIZ2.append(e.getMessage());
                        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            ImageView imageView2 = this.LLILLL.LJ;
            if (imageView2 != null) {
                C786410Ut5.LJZI(0, imageView2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinLottieImageWidget@f8b2.showStaticImage$1$2");
        return unit;
    }
}
