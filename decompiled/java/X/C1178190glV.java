package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0glV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178190glV {
    public final Context LIZ;
    public final InterfaceC1176890gjP LIZIZ;
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final ImageView LJ;
    public final ImageView LJFF;
    public final C426770GoN LJI;
    public final C417240GXq LJII;
    public final ImageView LJIIIIZZ;
    public C1178220glY LJIIIZ;
    public final Drawable[] LJIIJ;

    public C1178190glV(Context context) {
        this.LIZ = context;
        C1180740gpc.LIZ.getClass();
        this.LIZIZ = C1180740gpc.LIZ().LIZLLL();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e6j, new FrameLayout(context), false);
        this.LIZJ = viewTd;
        this.LIZLLL = (ImageView) viewTd.findViewById(R.id.r8f);
        this.LJ = (ImageView) viewTd.findViewById(R.id.r8e);
        this.LJFF = (ImageView) viewTd.findViewById(R.id.r9d);
        this.LJI = (C426770GoN) viewTd.findViewById(R.id.r8t);
        this.LJII = (C417240GXq) viewTd.findViewById(R.id.r9c);
        this.LJIIIIZZ = (ImageView) viewTd.findViewById(R.id.r9b);
        this.LJIIIZ = new C1178220glY();
        this.LJIIJ = new Drawable[6];
    }

    public static Pair LIZIZ(C1178200glW c1178200glW) {
        int i = 0;
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(C1178210glX.LIZIZ), Integer.valueOf(C1178130glP.LIZ), Integer.valueOf(C1178210glX.LIZ));
        if (!c1178200glW.LJI) {
            if (c1178200glW.LJFF) {
                i = 1;
            } else {
                i = 2;
            }
        }
        return new Pair(Integer.valueOf((i * 2) + (c1178200glW.LIZJ ? 1 : 0)), Integer.valueOf(((Number) ListProtector.get(listLJIIJJI, i)).intValue()));
    }

    public final Drawable LIZ(int i, String str) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
        c419910GdJ.LIZLLL = -1;
        int i2 = i / 2;
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i2;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LIZ);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = i;
        c384050F3z.LJI = i;
        c384050F3z.LIZ = Integer.valueOf(ColorProtector.parseColor(str));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x022b A[Catch: Exception -> 0x0283, TryCatch #0 {Exception -> 0x0283, blocks: (B:26:0x01f2, B:28:0x01f6, B:30:0x021f, B:32:0x0224, B:38:0x0234, B:39:0x023c, B:36:0x022b, B:40:0x0258, B:44:0x026d), top: B:56:0x01f2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1178220glY LIZJ(X.C1178200glW r18, int r19) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1178190glV.LIZJ(X.0glW, int):X.0glY");
    }
}
