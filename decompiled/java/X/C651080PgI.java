package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.List;

/* JADX INFO: renamed from: X.0PgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651080PgI {
    public final Context LIZ;
    public final InterfaceC651110PgL LIZIZ;
    public final InterfaceC651090PgJ LIZJ;
    public C0PXG LIZLLL;

    public final void LIZ() {
        Bundle bundle;
        C0Q2Q<?> c0q2qLIZIZ = this.LIZIZ.LIZIZ();
        final InterfaceC651110PgL interfaceC651110PgL = this.LIZIZ;
        final C0PXG c0pxg = this.LIZLLL;
        List<InterfaceC651090PgJ> listLJIIJJI = C1697810uHb.LJIIJJI(this.LIZJ, new InterfaceC651090PgJ(interfaceC651110PgL, c0pxg) { // from class: X.0PXH
            public final InterfaceC651110PgL LIZ;
            public final C0PXG LIZIZ;

            @Override // X.InterfaceC651090PgJ
            public final void LIZIZ(C0Q2Q<?> c0q2q) {
            }

            @Override // X.InterfaceC651090PgJ
            public final void LIZ(C0PXF c0pxf) {
                boolean z;
                String value;
                String value2;
                String value3;
                if (c0pxf.LIZ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str = "";
                if (z) {
                    C0PXG c0pxg2 = this.LIZIZ;
                    if (c0pxg2 == null || (value3 = c0pxg2.getValue()) == null) {
                        value3 = "";
                    }
                    C1AF0.LIZJ(value3.concat(" search_from param is empty"));
                }
                if (c0pxf.LIZIZ.length() == 0) {
                    C0PXG c0pxg3 = this.LIZIZ;
                    if (c0pxg3 == null || (value2 = c0pxg3.getValue()) == null) {
                        value2 = "";
                    }
                    C1AF0.LIZJ(value2.concat(" enter_from param is empty"));
                }
                if (c0pxf.LIZJ.length() == 0) {
                    C0PXG c0pxg4 = this.LIZIZ;
                    if (c0pxg4 != null && (value = c0pxg4.getValue()) != null) {
                        str = value;
                    }
                    C1AF0.LIZJ(str.concat(" enter_method param is empty"));
                }
            }

            @Override // X.InterfaceC651090PgJ
            public final void LIZJ(Bundle bundle2) {
                String value;
                if (this.LIZ instanceof C664130Q3f) {
                    String string = bundle2.getString("keyword");
                    if (string == null || string.length() == 0) {
                        C0PXG c0pxg2 = this.LIZIZ;
                        if (c0pxg2 == null || (value = c0pxg2.getValue()) == null) {
                            value = "";
                        }
                        C1AF0.LIZJ(value.concat(" search key word is empty"));
                    }
                }
            }

            {
                this.LIZ = interfaceC651110PgL;
                this.LIZIZ = c0pxg;
            }
        });
        C651100PgK c651100PgK = new C651100PgK(listLJIIJJI, c0q2qLIZIZ);
        Bundle bundle2 = new Bundle();
        C0PXF c0pxf = new C0PXF();
        for (InterfaceC651090PgJ interfaceC651090PgJ : listLJIIJJI) {
            interfaceC651090PgJ.LIZJ(bundle2);
            interfaceC651090PgJ.LIZ(c0pxf);
            interfaceC651090PgJ.LIZIZ(c651100PgK.LIZIZ);
        }
        C786410Ut5.LJJJI("search_from", c0pxf.LIZ, bundle2);
        C786410Ut5.LJJJI("enter_from", c0pxf.LIZIZ, bundle2);
        C786410Ut5.LJJJI("enter_method", c0pxf.LIZJ, bundle2);
        C651120PgM c651120PgM = new C651120PgM();
        C786410Ut5.LJJIIJZLJL(c651120PgM.LIZ, this.LIZIZ.LIZ());
        C786410Ut5.LJJIIJZLJL(c651120PgM.LIZ, bundle2);
        Bundle bundle3 = c651120PgM.LIZ;
        if (bundle3.containsKey("animation_bundle")) {
            bundle = bundle3.getBundle("animation_bundle");
            bundle3.remove("animation_bundle");
        } else {
            bundle = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, "//search");
        smartRouteBuildRoute.withParam(bundle3);
        if (bundle != null) {
            smartRouteBuildRoute.withBundleAnimation(bundle);
        }
        smartRouteBuildRoute.open();
    }

    public C651080PgI(Context context, InterfaceC651110PgL interfaceC651110PgL, InterfaceC651090PgJ interfaceC651090PgJ) {
        this.LIZ = context;
        this.LIZIZ = interfaceC651110PgL;
        this.LIZJ = interfaceC651090PgJ;
    }
}
