package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.1AIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177111AIj<T> implements InterfaceC300801Eo {
    public final /* synthetic */ UrlModel LL;
    public final /* synthetic */ C2177071AIf LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    public C2177111AIj(UrlModel urlModel, C2177071AIf c2177071AIf, long j) {
        this.LL = urlModel;
        this.LLILLJJLI = c2177071AIf;
        this.LLILLL = j;
    }

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Bitmap> interfaceC2329309At) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(this.LL));
        c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
        C10LT c10lt = C10LT.LABEL;
        final C2177071AIf c2177071AIf = this.LLILLJJLI;
        final UrlModel urlModel = this.LL;
        final long j = this.LLILLL;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        InterfaceC1331910klR interfaceC1331910klR = new InterfaceC1331910klR() { // from class: X.1AIi
            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(c2177071AIf.hashCode());
                sbLIZ.append("](");
                sbLIZ.append(urlModel.hashCode());
                sbLIZ.append(") fetch cancel time: ");
                sbLIZ.append(jCurrentTimeMillis - j);
                C2188811AlT.LIZIZ(sbLIZ);
                C2177071AIf c2177071AIf2 = c2177071AIf;
                if (c2177071AIf2.LJIIL) {
                    c11kt.onSuccess(c2177071AIf2.LJIIIIZZ());
                } else {
                    c11kt.onError(new C2177181AIq(c2177071AIf));
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('[');
                    sbLIZ.append(c2177071AIf.hashCode());
                    sbLIZ.append("](");
                    sbLIZ.append(urlModel.hashCode());
                    sbLIZ.append(") fetch ok time: ");
                    sbLIZ.append(jCurrentTimeMillis - j);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c11kt.onSuccess(bitmap);
                    return;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(c2177071AIf.hashCode());
                sbLIZ2.append("](");
                sbLIZ2.append(urlModel.hashCode());
                sbLIZ2.append(") fetch null time: ");
                sbLIZ2.append(jCurrentTimeMillis2 - j);
                C2188811AlT.LIZIZ(sbLIZ2);
                C2177071AIf c2177071AIf2 = c2177071AIf;
                if (c2177071AIf2.LJIIL) {
                    c11kt.onSuccess(c2177071AIf2.LJIIIIZZ());
                } else {
                    c11kt.onError(new C2177181AIq(c2177071AIf));
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(c2177071AIf.hashCode());
                sbLIZ.append("](");
                sbLIZ.append(urlModel.hashCode());
                sbLIZ.append(") fetch failed time: ");
                sbLIZ.append(jCurrentTimeMillis - j);
                C2188811AlT.LIZIZ(sbLIZ);
                C2177071AIf c2177071AIf2 = c2177071AIf;
                if (c2177071AIf2.LJIIL) {
                    c11kt.onSuccess(c2177071AIf2.LJIIIIZZ());
                } else {
                    c11kt.onError(new C2177181AIq(c2177071AIf));
                }
            }
        };
        InterfaceC2177221AIu.LJJIJIL.getClass();
        c1331670kl3LJIIIIZZ.LIZLLL(C2177211AIt.LIZ(null, c10lt));
        C1AJ3 c1aj3J52 = C2277891EDz.LIZIZ.LJIIJ().J52("", null, c10lt, interfaceC1331910klR);
        if (c1aj3J52 == null) {
            c1331670kl3LJIIIIZZ.LJJII(interfaceC1331910klR);
        } else {
            c1aj3J52.LIZJ(c1331670kl3LJIIIIZZ);
        }
    }
}
