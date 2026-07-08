package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0jis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291880jis implements InterfaceC1291910jiv {
    public List<InterfaceC1291890jit> LIZ;
    public final Bitmap.Config LIZIZ;
    public C1328960kgg LIZJ;

    @Override // X.InterfaceC1291910jiv
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        for (InterfaceC1291890jit interfaceC1291890jit : this.LIZ) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(interfaceC1291890jit.getName());
        }
        if (this.LIZJ != null) {
            sb.append(",");
            this.LIZJ.getClass();
            sb.append("SRPostProcessor");
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }

    @Override // X.InterfaceC1291910jiv
    public final InterfaceC1324680kZm getPostprocessorCacheKey() {
        LinkedList linkedList = new LinkedList();
        Iterator<InterfaceC1291890jit> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            linkedList.push(new C592490NLr(it2.next().getPostprocessorCacheKey()));
        }
        C1328960kgg c1328960kgg = this.LIZJ;
        if (c1328960kgg != null) {
            linkedList.push(c1328960kgg.getPostprocessorCacheKey());
        }
        return new C1296510jqL(linkedList);
    }

    public C1291880jis(Bitmap.Config config) {
        this.LIZIZ = config;
    }

    @Override // X.InterfaceC1291910jiv
    public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) throws Throwable {
        C1323050kX9<Bitmap> c1323050kX9Process;
        C1323050kX9<Bitmap> c1323050kX9 = null;
        try {
            C1323050kX9<Bitmap> c1323050kX9LJFF = null;
            C1323050kX9 c1323050kX9LJFF2 = null;
            for (InterfaceC1291890jit interfaceC1291890jit : this.LIZ) {
                try {
                    Bitmap.Config config = this.LIZIZ;
                    if (config == null) {
                        config = bitmap.getConfig();
                    }
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (config == null) {
                        config = AbstractC1291220jho.FALLBACK_BITMAP_CONFIGURATION;
                    }
                    c1323050kX9LJFF = abstractC1301670jyf.LJFF(width, height, config);
                    if (c1323050kX9LJFF.get().getConfig() == bitmap.getConfig()) {
                        Bitmaps.copyBitmap(c1323050kX9LJFF.get(), bitmap);
                    } else {
                        new Canvas(c1323050kX9LJFF.get()).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
                    if (c1323050kX9LJFF2 != null) {
                    }
                    interfaceC1291890jit.LIZ(c1323050kX9LJFF.get());
                    C1323050kX9.LJII(c1323050kX9LJFF2);
                    c1323050kX9LJFF2 = C1323050kX9.LJFF(c1323050kX9LJFF);
                } catch (Throwable th) {
                    th = th;
                    c1323050kX9 = c1323050kX9LJFF;
                    TryCatchGuardChecker.doCheck(th);
                    C1323050kX9.LJII(c1323050kX9);
                    throw th;
                }
            }
            C1328960kgg c1328960kgg = this.LIZJ;
            if (c1328960kgg != null) {
                if (c1323050kX9LJFF2 != null) {
                    bitmap = (Bitmap) c1323050kX9LJFF2.get();
                }
                c1323050kX9Process = c1328960kgg.process(bitmap, abstractC1301670jyf);
            } else {
                c1323050kX9Process = c1323050kX9LJFF;
            }
            C1323050kX9<Bitmap> c1323050kX9LJFF3 = C1323050kX9.LJFF(c1323050kX9Process);
            C1323050kX9.LJII(c1323050kX9Process);
            return c1323050kX9LJFF3;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
