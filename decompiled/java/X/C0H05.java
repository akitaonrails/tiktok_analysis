package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.ImageUrlModel;

/* JADX INFO: renamed from: X.0H05, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H05 {
    public static final Object LIZIZ(Context context, ImageUrlModel imageUrlModel, AbstractC23140094w abstractC23140094w) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loaded bitmap is null: ");
        sbLIZ.append(imageUrlModel);
        return LIZ(c1331670kl3LJIIIIZZ, context, C2188811AlT.LIZIZ(sbLIZ), abstractC23140094w);
    }

    public static final Object LIZJ(Context context, String str, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loaded bitmap is null: ");
        sbLIZ.append(str);
        return LIZ(c1331670kl3LJIIIZ, context, C2188811AlT.LIZIZ(sbLIZ), interfaceC1364105Vn);
    }

    public static final Object LIZ(C1331670kl3 c1331670kl3, Context context, final String str, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        c1331670kl3.LJJIJL(context);
        c1331670kl3.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3.LJJII(new AbstractC468201s0() { // from class: X.0H03
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn2 = c23260099m;
                    C098200Yq c098200Yq = new C098200Yq(new C0H04(str));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn2.resumeWith(c098200Yq);
                    return;
                }
                InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn3 = c23260099m;
                C189200o6.m2constructorimpl(bitmap);
                interfaceC1364105Vn3.resumeWith(bitmap);
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                String message;
                InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn2 = c23260099m;
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                C098200Yq c098200Yq = new C098200Yq(new C0H04(message));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn2.resumeWith(c098200Yq);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
