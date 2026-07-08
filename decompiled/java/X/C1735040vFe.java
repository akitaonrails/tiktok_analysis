package X;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.common.model.AnchorIcon;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0vFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735040vFe {
    public static final C1735040vFe LIZ = new C1735040vFe();
    public static AnonymousClass0956 LIZIZ;
    public static volatile boolean LIZJ;

    public static AnchorIcon LIZIZ(Aweme aweme) {
        Object c098200Yq;
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        String strLJIIIIZZ;
        Type type;
        try {
            String anchorsExtras = aweme.getAnchorsExtras();
            if (anchorsExtras != null && (mapLJIIJ = C1741890vQh.LJIIJ(anchorsExtras)) != null && (obj = mapLJIIJ.get("anchor_icon")) != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj)) != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(AnchorIcon.class));
                    } else {
                        type = new TypeToken<AnchorIcon>() { // from class: X.0Neg
                        }.getType();
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(strLJIIIIZZ, type);
                    if (!(objLJIIIIZZ instanceof AnchorIcon)) {
                        objLJIIIIZZ = null;
                    }
                    c098200Yq = (AnchorIcon) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (c098200Yq == null) {
                    c098200Yq = new AnchorIcon(null, null);
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                c098200Yq = new AnchorIcon(null, null);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        AnchorIcon anchorIcon = new AnchorIcon(null, null);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = anchorIcon;
        }
        return (AnchorIcon) c098200Yq;
    }

    public static void LIZ(Aweme aweme, ImageView imageView) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        C21272618Mq.LIZ.getClass();
        c419910GdJ.LIZ = C21272618Mq.LJIILL(C21272618Mq.LJIILLIIL(aweme));
        imageView.setImageDrawable(c419910GdJ.LIZ(imageView.getContext()));
    }

    public static void LIZJ(final Aweme aweme, final ImageView imageView) {
        if (aweme == null) {
            LIZ(aweme, imageView);
            return;
        }
        AnchorIcon anchorIconLIZIZ = LIZIZ(aweme);
        if (anchorIconLIZIZ != null) {
            List<String> list = anchorIconLIZIZ.iconUrls;
            if (list != null && !list.isEmpty()) {
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                C03IT c03it = new C03IT(anchorIconLIZIZ.iconUrls);
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03it);
                c1331670kl3LIZLLL.LJJI(imageView);
                C419910GdJ c419910GdJ = new C419910GdJ();
                C21272618Mq.LIZ.getClass();
                c419910GdJ.LIZ = C21272618Mq.LJIILL(C21272618Mq.LJIILLIIL(aweme));
                c1331670kl3LIZLLL.LJJIIZI(c419910GdJ.LIZ(imageView.getContext()));
                c1331670kl3LIZLLL.LJIIJ(new AbstractC1340570kzP() { // from class: X.0vFf
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                        C1735040vFe c1735040vFe = C1735040vFe.LIZ;
                        Aweme aweme2 = aweme;
                        ImageView imageView2 = imageView;
                        c1735040vFe.getClass();
                        C1735040vFe.LIZ(aweme2, imageView2);
                    }
                });
                return;
            }
            LIZ.getClass();
            LIZ(aweme, imageView);
        }
    }
}
