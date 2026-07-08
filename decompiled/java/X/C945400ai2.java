package X;

import Y.ACListenerS118S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ai2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945400ai2 extends AbstractC960470b6L<C945420ai4> {
    public final Function2<C945420ai4, Boolean, Unit> LL;
    public final ViewGroup LLILLJJLI;
    public final ImageView LLILLL;
    public final View LLILZ;
    public final C1126540fQC LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;

    public final void L5(C945420ai4 c945420ai4) {
        ImageModel avatarThumb;
        String strLJII;
        C1570050qxX.LIZ(new ACListenerS118S0200000_15(this, c945420ai4, 31), this.itemView);
        N5(c945420ai4.LIZIZ);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        User user = c945420ai4.LIZ.LIZ.mUser;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(avatarThumb);
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
        int width = this.LLILLL.getWidth();
        int height = this.LLILLL.getHeight();
        c1324610kZfLJIIIZ.LJ = width;
        c1324610kZfLJIIIZ.LJFF = height;
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJJI(this.LLILLL);
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null && (strLJII = multiGuestDataHolder.LJII()) != null) {
            C1324610kZf url = C1819620xS4.LIZ().setUrl(strLJII);
            if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                url.LJIIJJI = C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, this.itemView.getContext(), Integer.valueOf(this.LLILZIL.getWidth()), Integer.valueOf(this.LLILZIL.getHeight()));
            } else {
                url.LJIIIZ = R.drawable.emi;
            }
            url.LJIIL = new C987120bnK(5);
            url.LJJI(this.LLILZIL);
        } else if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
            C1126540fQC c1126540fQC = this.LLILZIL;
            if (c1126540fQC != null) {
                c1126540fQC.setImageDrawable(C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, this.itemView.getContext(), Integer.valueOf(this.LLILZIL.getWidth()), Integer.valueOf(this.LLILZIL.getHeight())));
            }
        } else {
            C1126540fQC c1126540fQC2 = this.LLILZIL;
            if (c1126540fQC2 != null) {
                c1126540fQC2.setActualImageResource(R.drawable.emi);
            }
        }
        this.LLILZLL.setText(C0KVU.LIZ(c945420ai4.LIZ.LIZ.mUser));
        this.LLIZ.setText(C1850730yGF.LJFF(c945420ai4.LIZ.LIZIZ).toUpperCase(Locale.ROOT));
    }

    public final void N5(int i) {
        boolean z;
        View view = this.LLILZ;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        C500260Jjc.LJLJLJ(view, z);
        C786410Ut5.R4(1.0f, this.LLILLJJLI);
        this.LLILLJJLI.setClickable(true);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LLILLJJLI.setSelected(true);
                    return;
                }
                return;
            }
            this.LLILLJJLI.setSelected(false);
            return;
        }
        this.LLILLJJLI.setSelected(false);
        this.LLILLJJLI.setClickable(false);
        C786410Ut5.R4(0.34f, this.LLILLJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C945400ai2(View view, Function2<? super C945420ai4, ? super Boolean, Unit> function2) {
        super(view);
        this.LL = function2;
        this.LLILLJJLI = (ViewGroup) view.findViewById(R.id.tsc);
        this.LLILLL = (ImageView) view.findViewById(R.id.l9h);
        this.LLILZ = view.findViewById(R.id.lul);
        this.LLILZIL = (C1126540fQC) view.findViewById(R.id.pn_);
        this.LLILZLL = (TextView) view.findViewById(R.id.p94);
        this.LLIZ = (TextView) view.findViewById(R.id.pn8);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C945420ai4) obj);
    }
}
