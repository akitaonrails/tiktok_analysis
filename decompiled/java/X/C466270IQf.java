package X;

import Y.AAListenerS318S0100000_7;
import Y.ATListenerS441S0100000_7;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.chatroom.slide.v1.LiveAnimationDegradeSettings;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466270IQf extends ConstraintLayout {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public C1295960jpS LL;

    public final void e0() {
        if (LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
            return;
        }
        animate().alpha(0.0f).setDuration(200L).setListener(new AAListenerS318S0100000_7(this, 2)).start();
    }

    public static void i0(ViewGroup viewGroup) {
        String str;
        if (viewGroup != null && viewGroup.getContext() != null) {
            C466270IQf c466270IQf = new C466270IQf(viewGroup.getContext(), (Object) null);
            viewGroup.addView(c466270IQf, -1, -1);
            if (!LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
                c466270IQf.LL.addAnimatorListener(new AAListenerS318S0100000_7(c466270IQf, 1));
                c466270IQf.LL.playAnimation();
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c466270IQf);
            c466270IQf.setAlpha(0.0f);
            c466270IQf.animate().alpha(1.0f).setDuration(300L).start();
            HashMap map = new HashMap();
            map.put("request_page", C466640IRq.LIZJ().LIZLLL());
            C465540INk c465540INk = C465540INk.LIZ;
            if (C466230IQb.LIZJ().LLJJIJI == 0) {
                str = "medium";
            } else {
                str = "low";
            }
            map.put("strength", str);
            map.put("type", C465540INk.LIZIZ);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("draw_guide_show");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        }
    }

    public final void h0(String str) {
        ViewGroup.inflate(getContext(), R.layout.h2v, this);
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.vk8);
        this.LL = c1295960jpS;
        C786410Ut5.LLD(0, c1295960jpS);
        if (!LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            if (iHostResource.SF()) {
                this.LL.setAnimation(iHostResource.hl());
            } else if (TextUtils.isEmpty(str)) {
                C1143680frq.LJIIJJI(this.LL, C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), "mt_slide_up_lottie.zip");
            } else {
                C1143680frq.LJIIJJI(this.LL, "tiktok_live_watch_resource_normal_1", str);
            }
        }
        setBackgroundColor(ColorProtector.parseColor("#80000000"));
        setOnTouchListener(new ATListenerS441S0100000_7(this, 2));
    }

    public void setAnimView(int i) {
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null && i > 0) {
            c1295960jpS.setRepeatCount(i);
        }
    }

    public C466270IQf(Context context, int i) {
        super(context, null, 0);
        h0("mt_land_slide_up_lottie.zip");
    }

    public C466270IQf(Context context, Object obj) {
        super(context, null, 0);
        h0(null);
    }
}
