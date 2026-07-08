package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177550gkT {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final InterfaceC1176890gjP LIZJ;
    public final View LIZLLL;
    public final C417240GXq LJ;

    public final void LIZ(String str, Function1<? super Bitmap, Unit> function1) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.LIZ) {
            if (str == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(this.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C603820NmG<String, SoftReference<Bitmap>> c603820NmG = C1177540gkS.LIZ;
            SoftReference<Bitmap> softReferenceLIZJ = c603820NmG.LIZJ(strLIZIZ);
            if (softReferenceLIZJ != null && (bitmap2 = softReferenceLIZJ.get()) != null) {
                function1.invoke(bitmap2);
                return;
            }
            C417240GXq c417240GXq = this.LJ;
            if (c417240GXq != null) {
                c417240GXq.setText(str);
            }
            Bitmap bitmapLIZ = this.LIZJ.LIZ(this.LIZLLL);
            c603820NmG.LIZLLL(strLIZIZ, new SoftReference<>(bitmapLIZ));
            function1.invoke(bitmapLIZ);
            return;
        }
        C603820NmG<String, SoftReference<Bitmap>> c603820NmG2 = C1177540gkS.LIZ;
        SoftReference<Bitmap> softReferenceLIZJ2 = c603820NmG2.LIZJ("poi_revisit_bitmap_default_key");
        if (softReferenceLIZJ2 != null && (bitmap = softReferenceLIZJ2.get()) != null) {
            function1.invoke(bitmap);
            return;
        }
        Bitmap bitmapLIZ2 = this.LIZJ.LIZ(this.LIZLLL);
        c603820NmG2.LIZLLL("poi_revisit_bitmap_default_key", new SoftReference<>(bitmapLIZ2));
        function1.invoke(bitmapLIZ2);
    }

    public C1177550gkT(Context context, boolean z, boolean z2) {
        int i;
        C417240GXq c417240GXq;
        this.LIZ = z;
        this.LIZIZ = z2;
        C1180740gpc.LIZ.getClass();
        this.LIZJ = C1180740gpc.LIZ().LIZLLL();
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        if (z) {
            if (z2) {
                i = R.layout.e8d;
            } else {
                i = R.layout.e8h;
            }
        } else {
            i = R.layout.e8i;
        }
        View viewTd = C786410Ut5.Td(layoutInflaterNe, i, new FrameLayout(context), false);
        this.LIZLLL = viewTd;
        viewTd.findViewById(R.id.rcb);
        if (z) {
            c417240GXq = (C417240GXq) viewTd.findViewById(R.id.rcd);
        } else {
            c417240GXq = null;
        }
        this.LJ = c417240GXq;
    }
}
