package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0X0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0Z extends C0X1W<C0XLY> {
    public final C0X0W LJ;
    public final C0XLY LJFF;

    @Override // X.C841660X0a
    public final InterfaceC841670X0b<C0XLY> LIZJ() {
        return new C841660X0a<C0XLY>() { // from class: X.0X0Y
            @Override // X.InterfaceC841670X0b
            public final Object LIZ() {
                this.LIZIZ.LJ.request().url().getClass();
                C0X0W c0x0w = this.LIZIZ.LJ;
                Request request = c0x0w.request();
                String strValueOf = String.valueOf(System.currentTimeMillis());
                C0XLQ c0xlqUrl = request.url();
                C0X33 c0x33NewBuilder = request.newBuilder();
                c0x33NewBuilder.LJIIIIZZ(c0xlqUrl);
                C0X0X c0x0x = (C0X0X) request.body();
                if (c0x0x != null && c0x0x.LJI() > 0) {
                    C837630WtV c837630WtV = new C837630WtV();
                    for (int i = 0; i < c0x0x.LJI(); i++) {
                        if (TextUtils.equals(c0x0x.LJFF(i), "_rticket")) {
                            c837630WtV.LIZIZ(c0x0x.LJFF(i), strValueOf);
                        } else {
                            c837630WtV.LIZIZ(c0x0x.LJFF(i), (String) ListProtector.get(c0x0x.LIZIZ, i));
                        }
                    }
                    c0x33NewBuilder.LIZLLL(request.method(), c837630WtV.LIZJ());
                }
                return c0x0w.LIZ(c0x33NewBuilder.LIZIZ());
            }

            @Override // X.InterfaceC841670X0b
            public final Object LIZIZ() {
                return this.LIZIZ.LJFF;
            }
        };
    }

    public C0X0Z(C1495400p18 c1495400p18, C0XLY c0xly) {
        this.LJ = c1495400p18;
        this.LJFF = c0xly;
    }
}
