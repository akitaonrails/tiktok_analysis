package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinViewExtsKt$loadFileImage$1$bitmap$1", f = "BulletinViewExts.kt", l = {}, m = "invokeSuspend")
public final class C2473909mj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2473909mj(String str, int i, int i2, boolean z, InterfaceC1364105Vn<? super C2473909mj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2473909mj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinViewExtsKt@7a10.loadFileImage$1$bitmap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        boolean z = this.LLILZ;
        Bitmap bitmap = null;
        try {
            if (new C0VSJ(str).exists() && i > 0 && i2 > 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                options.inSampleSize = C624550Oeb.LIZ(options, i, i2);
                options.inJustDecodeBounds = false;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                if (bitmapDecodeFile != null) {
                    if (z) {
                        Matrix matrix = new Matrix();
                        matrix.postScale(-1.0f, 1.0f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                        if (!Intrinsics.LJFF(bitmapCreateBitmap, bitmapDecodeFile)) {
                            bitmapDecodeFile.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                        }
                        bitmap = bitmapCreateBitmap;
                    } else {
                        bitmap = bitmapDecodeFile;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decodeBitmapFromFile error, imagePath: ");
            sbLIZ.append(str);
            sbLIZ.append(", width: ");
            sbLIZ.append(i);
            sbLIZ.append(", height: ");
            sbLIZ.append(i2);
            sbLIZ.append(". ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("BulletinViewExtsKt@7a10.loadFileImage$1$bitmap$1");
        return bitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
