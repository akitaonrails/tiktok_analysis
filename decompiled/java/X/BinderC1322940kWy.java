package X;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class BinderC1322940kWy extends AbstractBinderC559990Lxl {
    public final Map<C420160Gdi<ImageView>, C1322930kWx> LLILLJJLI = new LinkedHashMap();

    @Override // X.InterfaceC559830LxV
    public final boolean LIZ(Context context, Uri uri, C417420GYi c417420GYi, int i, int i2) {
        if (!C1322200kVm.LIZLLL) {
            C1322200kVm.LIZIZ(context, null);
        }
        c417420GYi.setImageBitmap(null);
        Iterator it2 = ((LinkedHashMap) this.LLILLJJLI).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object obj = ((C420160Gdi) entry.getKey()).LIZ.get();
            if (obj == null || Intrinsics.LJFF(obj, c417420GYi)) {
                C1322930kWx c1322930kWx = (C1322930kWx) entry.getValue();
                C1323050kX9<AbstractC1327750kej> c1323050kX9 = c1322930kWx.LJFF;
                if (c1323050kX9 != null) {
                    C1323050kX9.LJII(c1323050kX9);
                }
                c1322930kWx.LJFF = null;
                c1322930kWx.LIZJ.clear();
                c1322930kWx.LIZLLL.close();
                it2.remove();
            }
        }
        C1322930kWx c1322930kWx2 = new C1322930kWx(uri, c417420GYi);
        this.LLILLJJLI.put(new C420160Gdi<>(c417420GYi), c1322930kWx2);
        c1322930kWx2.LIZLLL.LIZJ(c1322930kWx2.LJ, C822700WPc.LL);
        return true;
    }
}
