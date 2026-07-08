package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447070Hg1 {
    public static final String LIZ(long j) {
        long j2 = 1024;
        long j3 = 1024 * j2;
        long j4 = j2 * j3;
        long j5 = ((long) LSPassThroughRecordSizeConfig.DEFAULT) * j3;
        double d = j3;
        double d2 = j;
        if (d2 < 0.1d * d) {
            return "0.1MB";
        }
        if (j >= j4) {
            return C786410Ut5.j4("%.1fGB", Arrays.copyOf(new Object[]{Double.valueOf(d2 / j4)}, 1));
        }
        if (j >= j5) {
            return "1.0GB";
        }
        return C786410Ut5.j4("%.1fMB", Arrays.copyOf(new Object[]{Double.valueOf(d2 / d)}, 1));
    }

    public static final Bitmap LIZIZ(View view) {
        if (view == null) {
            return null;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static final Bitmap LIZJ(Bitmap bitmap) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, -((bitmap.getWidth() - iMin) / 2), -((bitmap.getHeight() - iMin) / 2), paint);
        return bitmapCreateBitmap;
    }

    public static final void LIZLLL(final List<? extends UrlModel> list, final Function1<? super List<Bitmap>, Unit> function1) {
        C1325540kbA c1325540kbALJIIL = C1328130kfL.LJIILIIL().LJIIL();
        if (list.isEmpty()) {
            function1.invoke(C13BV.INSTANCE);
            return;
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(null);
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final int i2 = 0;
        for (UrlModel urlModel : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                UrlModel urlModel2 = urlModel;
                if (urlModel2 == null) {
                    ListProtector.set(arrayList, i2, null);
                    atomicInteger.incrementAndGet();
                } else {
                    final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = c1325540kbALJIIL.LJI((C1325710kbR) C13LQ.LJIL(C1324750kZt.LJIILLIIL(urlModel2, new C1324630kZh(200, 200), EnumC1331380kka.MEDIUM, Bitmap.Config.RGB_565)), null);
                    ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0Hg2
                        @Override // X.C0HWE
                        public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                            ListProtector.set(arrayList, i2, null);
                            if (interfaceC1320200kSY != null) {
                                interfaceC1320200kSY.close();
                            }
                            if (atomicInteger.incrementAndGet() == list.size()) {
                                function1.invoke(arrayList);
                            }
                        }

                        @Override // X.AbstractC447090Hg3
                        public final void LJI(Bitmap bitmap) {
                            if (interfaceC1320200kSYLJI.LIZ() && bitmap != null) {
                                ListProtector.set(arrayList, i2, Bitmap.createBitmap(bitmap));
                            } else {
                                ListProtector.set(arrayList, i2, null);
                            }
                            interfaceC1320200kSYLJI.close();
                            if (atomicInteger.incrementAndGet() == list.size()) {
                                function1.invoke(arrayList);
                            }
                        }
                    }, C822700WPc.LL);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
