package X;

import Y.ARunnableS75S0200000_6;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0HBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437000HBq implements InterfaceC1331950klV {
    public static String LIZ(C1331510kkn c1331510kkn) {
        String string;
        C03IT c03it = c1331510kkn.LJJJI;
        if (c03it != null && !c03it.LIZ()) {
            return (String) ListProtector.get(c1331510kkn.LJJJI.LIZ, 0);
        }
        Uri uri = c1331510kkn.LIZ;
        if (uri != null && (string = uri.toString()) != null) {
            return string;
        }
        return "";
    }

    @Override // X.InterfaceC1331950klV
    public final boolean display(C1331510kkn c1331510kkn) {
        ImageView imageView;
        String strLIZ = LIZ(c1331510kkn);
        if (!u.LJJIIJZLJL(strLIZ, "tux://", false)) {
            return false;
        }
        Object obj = c1331510kkn.LJJIJ;
        if (obj != null && (obj instanceof SmartImageView)) {
            imageView = (ImageView) obj;
        } else {
            imageView = c1331510kkn.LJJIJIIJI;
            if (imageView == null) {
                imageView = null;
            }
        }
        Uri uri = UriProtector.parse(strLIZ);
        InterfaceC427850Gq7 interfaceC427850Gq7 = c1331510kkn.LJJIJIIJIL;
        if (interfaceC427850Gq7 != null) {
            interfaceC427850Gq7.Bh(uri, imageView);
        }
        if (imageView != null) {
            C01GW c01gw = C2248361CzK.LIZ;
            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(imageView.getContext(), strLIZ);
            if (c698190Ra5LJFF != null) {
                HandlerHook.viewPost(imageView, new ARunnableS75S0200000_6(imageView, c698190Ra5LJFF, 85));
                InterfaceC427850Gq7 interfaceC427850Gq72 = c1331510kkn.LJJIJIIJIL;
                if (interfaceC427850Gq72 != null) {
                    interfaceC427850Gq72.Ad(uri, imageView, null, null);
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1331950klV
    public final boolean download(C1331510kkn c1331510kkn) {
        if (!u.LJJIIJZLJL(LIZ(c1331510kkn), "tux://", false)) {
            return false;
        }
        InterfaceC605070NoH interfaceC605070NoH = c1331510kkn.LJJIJIL;
        if (interfaceC605070NoH != null) {
            interfaceC605070NoH.LIZ(null);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1331950klV
    public final boolean loadBitmap(C1331510kkn c1331510kkn) {
        String strLIZ = LIZ(c1331510kkn);
        if (!u.LJJIIJZLJL(strLIZ, "tux://", false)) {
            return false;
        }
        if (c1331510kkn.LIZ() != null && c1331510kkn.LJJIJL != null) {
            C01GW c01gw = C2248361CzK.LIZ;
            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(c1331510kkn.LIZ(), strLIZ);
            if (c698190Ra5LJFF != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c698190Ra5LJFF.LIZ;
                Integer num = c698190Ra5LJFF.LIZIZ;
                if (num != null) {
                    c419910GdJ.LIZLLL = num;
                }
                c1331510kkn.LJJIJL.LIZ(C376710Epp.LIZ(c419910GdJ.LIZ(c1331510kkn.LIZ()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), Bitmap.Config.ARGB_8888));
                return true;
            }
            return true;
        }
        return true;
    }
}
