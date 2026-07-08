package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.09nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2481209nu {
    public final String LIZ;
    public final Context LIZIZ;
    public float LIZJ = 1040.0f;
    public final Map<Integer, View> LIZLLL = new LinkedHashMap();

    public final int LIZ(int i) {
        return (int) (i * (this.LIZJ / 1040.0f));
    }

    public final String LIZIZ(CreativeInfo creativeInfo) throws Exception {
        CreativeInfo creativeInfo2 = creativeInfo;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.LIZ);
        if (bitmapDecodeFile == null) {
            return null;
        }
        int width = bitmapDecodeFile.getWidth();
        if (BitmapFactory.decodeFile(this.LIZ) != null) {
            this.LIZJ = r1.getHeight();
            View viewSd = C786410Ut5.Sd(R.layout.oo, ((LayoutInflater) C786410Ut5.H2(this.LIZIZ, "layout_inflater")).cloneInContext(new ContextThemeWrapper(this.LIZIZ, R.style.xm)), null);
            if (C444960Hcc.LIZIZ()) {
                viewSd.setLayoutDirection(1);
            }
            C786410Ut5.W5(viewSd, new ViewGroup.LayoutParams(width, LIZ(51)));
            ImageView imageView = (ImageView) viewSd.findViewById(R.id.npr);
            ImageView imageView2 = (ImageView) viewSd.findViewById(R.id.npt);
            TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.nps);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C426750GoL.LJIIIZ(imageView, Integer.valueOf(LIZ(0)), 0, 0, 0, false, 16);
            layoutParams.width = LIZ(115);
            layoutParams.height = LIZ(28);
            C786410Ut5.c6(imageView, layoutParams);
            ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
            C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(LIZ(8)), 0, 0, 0, false, 16);
            layoutParams2.width = LIZ(51);
            layoutParams2.height = LIZ(51);
            C786410Ut5.M6(tuxIconView, layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
            C426750GoL.LJIIIZ(imageView2, Integer.valueOf(LIZ(3)), 0, 0, 0, false, 16);
            layoutParams3.width = LIZ(64);
            layoutParams3.height = LIZ(28);
            C786410Ut5.c6(imageView2, layoutParams3);
            viewSd.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(LIZ(51), 1073741824));
            viewSd.layout(0, 0, width, LIZ(51));
            this.LIZLLL.put(Integer.valueOf(width), viewSd);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, bitmapDecodeFile.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, (Paint) null);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(0);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(viewSd.getWidth(), viewSd.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            C842150X1x.LIZIZ(canvas2, viewSd);
            canvas2.drawBitmap(bitmapCreateBitmap2, new Matrix(), paint);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, (bitmapDecodeFile.getHeight() - LIZ(51)) - LIZ(30), (Paint) null);
            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            if (creativeInfo2 == null) {
                creativeInfo2 = new CreativeInfo(null, 0, null, 7, null);
            }
            EnumC20228014Cw enumC20228014Cw = EnumC20228014Cw.AIME;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
            Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(simpleDateFormat.format(time));
            sbLIZ.append("watermark.png");
            String strLIZIZ = C2298208zU.LIZIZ(pathService, creativeInfo2, enumC20228014Cw, C2188811AlT.LIZIZ(sbLIZ), 8);
            C2354709Kn.LJFF(strLIZIZ, true);
            C0VSV c0vsv = new C0VSV(strLIZIZ);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
            c0vsv.flush();
            c0vsv.close();
            return strLIZIZ;
        }
        throw new Exception("no picture");
    }

    public C2481209nu(String str, Context context) {
        this.LIZ = str;
        this.LIZIZ = context;
    }
}
