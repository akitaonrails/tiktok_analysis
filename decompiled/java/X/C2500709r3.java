package X;

import Y.ARunnableS12S0400000_3;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pns.crypto2.CryptoInitializer;
import java.util.Collections;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import org.json.JSONException;

/* JADX INFO: renamed from: X.09r3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2500709r3 implements C092O {
    public final int $t;
    public Object l0;

    @Override // X.C092O
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public C2500709r3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(C2500709r3 c2500709r3, Object obj) {
        ((Function1) c2500709r3.l0).invoke(Collections.singletonList(obj));
    }

    public static final void accept$1(C2500709r3 c2500709r3, Object obj) throws JSONException {
        C092R c092r = (C092R) obj;
        if (c092r.LIZ == 0 && Intrinsics.LJFF(c092r.LIZIZ, "success")) {
            CryptoInitializer cryptoInitializer = (CryptoInitializer) c2500709r3.l0;
            C08GR.LIZ.getClass();
            String strLIZIZ = C08GR.LIZIZ(false);
            C092O c092o = new C092O() { // from class: X.09gw
                @Override // X.C092O
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                }
            };
            cryptoInitializer.getClass();
            cryptoInitializer.LJII(1, System.currentTimeMillis(), c092o, strLIZIZ, false);
        }
    }

    public static final void accept$2(final C2500709r3 c2500709r3, Object obj) {
        final Bitmap bitmap = (Bitmap) obj;
        C092O<Bitmap> c092o = new C092O<Bitmap>() { // from class: X.09mo
            @Override // X.C092O
            public final void accept(Bitmap bitmap2) {
                Bitmap bitmap3 = bitmap2;
                Bitmap bitmap4 = bitmap;
                InterfaceC2474709mr interfaceC2474709mr = (InterfaceC2474709mr) this.LIZIZ.l0;
                if (bitmap4 != null && bitmap3 != null) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    int width2 = bitmap4.getWidth();
                    int height2 = bitmap4.getHeight();
                    if (width <= 0 || height <= 0 || width2 <= 0 || height2 <= 0) {
                        String strK4 = C786410Ut5.k4(Locale.US, "ResizeBitmapSizeError width:%d height:%d photoWidth:%d photoHeight:%d", new Object[]{Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(width2), Integer.valueOf(height2)});
                        C1AF0.LIZJ(strK4);
                        C201955140j.LJIIL(strK4);
                        if (width <= 0 || height <= 0) {
                            return;
                        }
                    }
                    C2474509mp.LIZ.execute(new ARunnableS12S0400000_3(bitmap4, bitmap3, new RuntimeException("ResizeBitmapException"), interfaceC2474709mr, 0));
                }
            }
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("res://");
        sbLIZ.append(o.LIZ.getPackageName());
        sbLIZ.append("/");
        sbLIZ.append(2130972880);
        C1324750kZt.LJIJ(C2474609mq.LIZ(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ))), 0, 0, c092o);
    }
}
