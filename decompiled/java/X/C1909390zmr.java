package X;

import android.app.Activity;
import android.app.Dialog;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("praise_guide_dialog")
public final class C1909390zmr extends AbstractC20660015ss<Dialog> {
    public static final C14MJ LLILLJJLI;
    public final AbstractC1909290zmh LL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 510;
    }

    static {
        new UgCommonServiceImpl();
        LLILLJJLI = C14MJ.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        Activity activity = this.LL.LIZ;
        if (activity instanceof LifecycleOwner) {
            return new C688120Qyw(activity, (LifecycleOwner) activity, null);
        }
        return null;
    }

    public C1909390zmr(AbstractC1909290zmh abstractC1909290zmh) {
        this.LL = abstractC1909290zmh;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        String image;
        String str;
        String str2;
        this.LL.LJFF();
        ImageView imageView = new ImageView(this.LL.LIZ);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        InterfaceC1875070ytV interfaceC1875070ytV = this.LL.LIZJ;
        if (interfaceC1875070ytV == null || (image = interfaceC1875070ytV.getImage()) == null) {
            image = "";
        }
        if (image.length() == 0) {
            C14MJ c14mj = LLILLJJLI;
            C14MJ.LJIIIZ(imageView, "043bab693d6e18590a1f8e3be293433f");
        } else {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(image);
            c1331670kl3LJIIIZ.LJJI(imageView);
            c1331670kl3LJIIIZ.LJJII(new C1864890yd5(imageView, 0));
        }
        C1397580mTM c1397580mTM = new C1397580mTM(c688120Qyw.LIZ);
        C340180DVg.LIZ(c1397580mTM, imageView, 0, 6);
        C1909380zmq c1909380zmq = this.LL.LJ;
        String str3 = null;
        if (c1909380zmq != null) {
            str = c1909380zmq.LIZ;
        } else {
            str = null;
        }
        c1397580mTM.LJI(str);
        C1909380zmq c1909380zmq2 = this.LL.LJ;
        if (c1909380zmq2 != null) {
            str2 = c1909380zmq2.LIZIZ;
        } else {
            str2 = null;
        }
        c1397580mTM.LIZIZ(str2);
        C1909380zmq c1909380zmq3 = this.LL.LJ;
        if (c1909380zmq3 != null) {
            str3 = c1909380zmq3.LIZJ;
        }
        C1397720mTa.LIZ(c1397580mTM, str3, new AwS607S0100000_28(this, 344));
        C985403tE.LIZ(c1397580mTM, new AwS607S0100000_28(this, 347));
        c1397580mTM.LJII = false;
        return new C1397510mTF(c1397580mTM).LJ();
    }
}
