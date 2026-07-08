package X;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.0JSR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JSR {
    public static void LIZ(int i, int i2, int i3, ImageView imageView, ImageModel imageModel, InterfaceC1142670fqD interfaceC1142670fqD) {
        if (C1819620xS4.LIZLLL(imageModel) && imageView != null && C0JSS.LIZIZ(imageView.getContext())) {
            C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(imageView.getContext());
            c1322000kVSLJFF.LJFF = imageModel;
            c1322000kVSLJFF.LJ();
            c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_CROP);
            c1322000kVSLJFF.LJIIJJI = false;
            if (i > 0 && i2 > 0) {
                c1322000kVSLJFF.LJI = new C1324630kZh(i, i2);
            }
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C0JSQ(i3, imageView, c1322000kVSLJFF, interfaceC1142670fqD, imageModel, null), 2);
        }
    }
}
