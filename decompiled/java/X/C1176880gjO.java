package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176880gjO {
    public final Context LIZ;
    public final InterfaceC1176890gjP LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final C417240GXq LJ;

    public C1176880gjO(Context context) {
        this.LIZ = context;
        C1180740gpc.LIZ.getClass();
        this.LIZIZ = C1180740gpc.LIZ().LIZLLL();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e0n, new FrameLayout(context), false);
        this.LIZJ = viewTd;
        this.LIZLLL = (ImageView) viewTd.findViewById(R.id.r4r);
        this.LJ = (C417240GXq) viewTd.findViewById(R.id.r4s);
    }

    public final void LIZ(AbstractC443520HaI abstractC443520HaI, PoiLandmark poiLandmark, Function1<? super Bitmap, Unit> function1) {
        this.LIZLLL.setImageDrawable(abstractC443520HaI);
        if (C960203pA.LIZIZ(this.LIZ)) {
            C417240GXq c417240GXq = this.LJ;
            c417240GXq.LLJJJJLIIL = false;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f514t5, c417240GXq.getContext());
            if (numLIZJ != null) {
                c417240GXq.setTextColor(numLIZJ.intValue());
            }
        } else {
            C417240GXq c417240GXq2 = this.LJ;
            c417240GXq2.LLJJJJLIIL = true;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.f514t5, c417240GXq2.getContext());
            if (numLIZJ2 != null) {
                c417240GXq2.setTextColor(numLIZJ2.intValue());
            }
        }
        this.LJ.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        this.LJ.setText(poiLandmark.getName());
        function1.invoke(this.LIZIZ.LIZ(this.LIZJ));
    }
}
