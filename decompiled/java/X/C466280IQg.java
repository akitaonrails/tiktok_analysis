package X;

import Y.ATListenerS441S0100000_7;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466280IQg extends ConstraintLayout {
    public final InterfaceC465570INn LL;
    public final C1295960jpS LLILLJJLI;

    public final InterfaceC465570INn getCallback() {
        return this.LL;
    }

    public final void setRepeatCount(int i) {
        C1295960jpS c1295960jpS;
        if (i > 0 && (c1295960jpS = this.LLILLJJLI) != null) {
            c1295960jpS.setRepeatCount(i);
        }
    }

    public C466280IQg(Context context, InterfaceC465570INn interfaceC465570INn) {
        super(context, null, 0);
        this.LL = interfaceC465570INn;
        ViewGroup.inflate(context, R.layout.h2v, this);
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.vk8);
        this.LLILLJJLI = c1295960jpS;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(0, c1295960jpS);
        }
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        if (iHostResource.SF()) {
            if (c1295960jpS != null) {
                c1295960jpS.setAnimation(iHostResource.hl());
            }
        } else {
            if ("mt_land_slide_up_lottie.zip".length() == 0) {
                C1143680frq.LJIIJJI(c1295960jpS, C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), "mt_slide_up_lottie.zip");
            } else {
                C1143680frq.LJIIJJI(c1295960jpS, "tiktok_live_watch_resource_normal_1", "mt_land_slide_up_lottie.zip");
            }
        }
        setBackgroundColor(C497740JfY.LIZLLL(R.attr.eos, getContext()));
        setOnTouchListener(new ATListenerS441S0100000_7(this, 0));
    }
}
