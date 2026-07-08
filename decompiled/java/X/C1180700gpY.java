package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180700gpY {
    public final Context LIZ;
    public final View LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final ImageView LJ;
    public final C417240GXq LJFF;

    public C1180700gpY(Context context) {
        this.LIZ = context;
        C1180740gpc.LIZ.getClass();
        C1180740gpc.LIZ().LIZLLL();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dyx, new FrameLayout(context), false);
        this.LIZIZ = viewTd;
        this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        this.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        this.LJ = (ImageView) viewTd.findViewById(R.id.qyo);
        this.LJFF = (C417240GXq) viewTd.findViewById(R.id.qyq);
    }

    public static C443530HaJ LIZIZ(Context context, Bitmap bitmap) {
        int i;
        Resources resources = context.getResources();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= height) {
            i = height;
        } else {
            i = width;
        }
        C443530HaJ c443530HaJ = new C443530HaJ(resources, Bitmap.createBitmap(bitmap, (width - i) / 2, (height - i) / 2, i, i));
        c443530HaJ.LIZIZ();
        return c443530HaJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(PoiData poiData, Function1<? super View, Unit> function1) {
        int intrinsicWidth;
        Bitmap bitmapCreateBitmap;
        AbstractC443520HaI abstractC443520HaI;
        C603820NmG<String, SoftReference<AbstractC443520HaI>> c603820NmG = C1180720gpa.LIZ;
        SoftReference<AbstractC443520HaI> softReferenceLIZJ = c603820NmG.LIZJ("default");
        if (softReferenceLIZJ != null && (abstractC443520HaI = softReferenceLIZJ.get()) != null) {
            LIZJ(poiData, abstractC443520HaI, function1);
            return;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_map_thumbtack_fill;
        c419910GdJ.LIZLLL = -1;
        int i = this.LIZLLL;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LIZ);
        C384050F3z c384050F3z = new C384050F3z();
        int i2 = this.LIZJ;
        c384050F3z.LJII = i2;
        c384050F3z.LJI = i2;
        c384050F3z.LIZ = Integer.valueOf(ColorProtector.parseColor("#00C39B"));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LIZ));
        if (layerDrawableLJIILIIL instanceof BitmapDrawable) {
            bitmapCreateBitmap = ((BitmapDrawable) layerDrawableLJIILIIL).getBitmap();
        } else {
            int intrinsicHeight = 1;
            if (layerDrawableLJIILIIL.getIntrinsicWidth() > 0) {
                intrinsicWidth = layerDrawableLJIILIIL.getIntrinsicWidth();
            } else {
                intrinsicWidth = 1;
            }
            if (layerDrawableLJIILIIL.getIntrinsicHeight() > 0) {
                intrinsicHeight = layerDrawableLJIILIIL.getIntrinsicHeight();
            }
            bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            layerDrawableLJIILIIL.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            layerDrawableLJIILIIL.draw(canvas);
        }
        C443530HaJ c443530HaJLIZIZ = LIZIZ(this.LIZ, bitmapCreateBitmap);
        c603820NmG.LIZLLL("default", new SoftReference<>(c443530HaJLIZIZ));
        LIZJ(poiData, c443530HaJLIZIZ, function1);
    }

    public final void LIZJ(PoiData poiData, AbstractC443520HaI abstractC443520HaI, Function1<? super View, Unit> function1) {
        this.LJ.setImageDrawable(abstractC443520HaI);
        this.LJFF.setText(poiData.name);
        function1.invoke(this.LIZIZ);
    }
}
