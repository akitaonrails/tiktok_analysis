package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAssem$drawPrecisePoint$1$bitmap$1", f = "PositionSelectionMapAssem.kt", l = {}, m = "invokeSuspend")
public final class C2479309nb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ PositionSelectionMapAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2479309nb(PositionSelectionMapAssem positionSelectionMapAssem, InterfaceC1364105Vn<? super C2479309nb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = positionSelectionMapAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2479309nb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapCreateBitmap;
        int iIntValue;
        Integer numLIZJ;
        C1C7U.LIZ("PositionSelectionMapAssem@24e9.drawPrecisePoint$1$bitmap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PositionSelectionMapAssem positionSelectionMapAssem = this.LL;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(16)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(16)));
        positionSelectionMapAssem.getClass();
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(iLIZIZ, iLIZIZ2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-1);
            float f = iLIZIZ / 2.0f;
            float f2 = iLIZIZ2 / 2.0f;
            canvas.drawCircle(f, f2, f, paint);
            C19EG c19egLIZ = C724240Sb0.LIZ(positionSelectionMapAssem);
            if (c19egLIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1o, c19egLIZ)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16776961;
            }
            paint.setColor(iIntValue);
            canvas.drawCircle(f, f2, f - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), paint);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            bitmapCreateBitmap = null;
        }
        C1C7U.LIZIZ("PositionSelectionMapAssem@24e9.drawPrecisePoint$1$bitmap$1");
        return bitmapCreateBitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
