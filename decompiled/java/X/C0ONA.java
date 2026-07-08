package X;

import Y.ARunnableS104S0100000_4;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: renamed from: X.0ONA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ONA extends AbstractC1261240ivS {
    public final InterfaceC1260110itd LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public AddYoursTopic LLJJIJI;

    @Override // X.InterfaceC1259900itI
    public final void M0() {
    }

    @Override // X.AbstractC1261240ivS
    public final void a6() {
    }

    public final View b6() {
        return (View) this.LLJILJILJ.getValue();
    }

    public final TuxTextView c6() {
        return (TuxTextView) this.LLJILJIL.getValue();
    }

    public final void d6(AddYoursTopic addYoursTopic) {
        long jLongValue;
        int i = C2187451AjH.LIZ;
        addYoursTopic.toString();
        this.LLJJIJI = addYoursTopic;
        if (!C0BXQ.LIZ()) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFollowingCount() <= 0) {
                C339190DRl.LIZIZ((View) this.LLJI.getValue());
            } else {
                C339190DRl.LIZLLL((View) this.LLJI.getValue());
            }
        }
        String quantityString = null;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || !Intrinsics.LJFF(addYoursTopic.getEoyCampaign(), Boolean.TRUE)) {
            C339190DRl.LIZIZ(b6());
        } else {
            C339190DRl.LIZLLL(b6());
            C339190DRl.LIZLLL((View) this.LLJJI.getValue());
            C786410Ut5.I7(new AbS691S0100000_9(this, 42, 42), b6());
            C439940HMy c439940HMy = C439940HMy.LIZ;
            ImageView imageView = (ImageView) this.LLJILLL.getValue();
            c439940HMy.getClass();
            C439940HMy.LIZ(imageView, "eoy/halo_left.png", null);
            C439940HMy.LIZ((ImageView) this.LLJJ.getValue(), "eoy/halo_right.png", null);
            C439940HMy.LIZ((ImageView) this.LLJJI.getValue(), "eoy/camera.png", new AwS553S0100000_9(this, 1704));
            HandlerHook.viewPost(b6(), new ARunnableS104S0100000_4(this, 82));
        }
        ((TextView) this.LLIZLLLIL.getValue()).setText(addYoursTopic.getText());
        Long videoCount = addYoursTopic.getVideoCount();
        if (videoCount != null) {
            jLongValue = videoCount.longValue();
        } else {
            jLongValue = 0;
        }
        String strLIZIZ = C1843500y4a.LIZIZ(jLongValue);
        C339190DRl.LIZLLL((View) this.LLJ.getValue());
        TextView textView = (TextView) this.LLJ.getValue();
        Resources resources = this.itemView.getContext().getResources();
        if (resources != null) {
            quantityString = resources.getQuantityString(2131755080, (int) jLongValue, strLIZIZ);
        }
        textView.setText(quantityString);
    }

    public C0ONA(View view, AddYoursTopic addYoursTopic, InterfaceC1260110itd interfaceC1260110itd) {
        Integer numValueOf;
        super(view);
        this.LLIZ = interfaceC1260110itd;
        this.LLIZLLLIL = C1935107i1.LIZ(new AwS553S0100000_9(view, 1713));
        this.LLJ = C1935107i1.LIZ(new AwS553S0100000_9(view, 1714));
        C01GW c01gwLIZ = C1935107i1.LIZ(new AwS553S0100000_9(view, 1712));
        this.LLJI = c01gwLIZ;
        C01GW c01gwLIZ2 = C1935107i1.LIZ(new AwS553S0100000_9(view, 1711));
        this.LLJIJIL = c01gwLIZ2;
        this.LLJILJIL = C1935107i1.LIZ(new AwS553S0100000_9(view, 1710));
        this.LLJILJILJ = C1935107i1.LIZ(new AwS553S0100000_9(view, 1705));
        this.LLJILLL = C1935107i1.LIZ(new AwS553S0100000_9(view, 1707));
        this.LLJJ = C1935107i1.LIZ(new AwS553S0100000_9(view, 1708));
        this.LLJJI = C1935107i1.LIZ(new AwS553S0100000_9(view, 1706));
        this.LLJJIII = C1935107i1.LIZ(new AwS553S0100000_9(view, 1709));
        if (C0BXQ.LIZ()) {
            C339190DRl.LIZIZ((View) c01gwLIZ2.getValue());
            C339190DRl.LIZIZ(c6());
            C339190DRl.LIZIZ((View) c01gwLIZ.getValue());
        } else {
            boolean zLIZIZ = C960203pA.LIZIZ(this.itemView.getContext());
            C786410Ut5.I7(new AbS691S0100000_9(this, 43, 42), c6());
            if (((Boolean) C0B9P.LIZ.getValue()).booleanValue()) {
                c6().setTuxFont(62);
                c6().setText(this.itemView.getContext().getResources().getString(2131825080));
            } else {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_plus_fill;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                if (zLIZIZ) {
                    numValueOf = Integer.valueOf(R.attr.a1q);
                } else {
                    numValueOf = Integer.valueOf(R.attr.a04);
                }
                c419910GdJ.LJ = numValueOf;
                C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, this.itemView.getContext());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("+ ");
                sbLIZ.append(this.itemView.getContext().getResources().getString(2131825080));
                SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.p2(spannableString, c419890GdHLIZIZ, 0, 1, 33);
                c6().setText(spannableString);
            }
            if (zLIZIZ) {
                c6().setTextColorRes(R.attr.a1q);
            }
        }
        d6(addYoursTopic);
    }

    @Override // X.AbstractC1261240ivS
    public final void X5(Aweme aweme, int i, boolean z, Bundle bundle) {
        this.LL = aweme;
        if (bundle != null) {
            bundle.getString("detail_aweme_from");
        }
        AddYoursTopic addYoursTopic = this.LLJJIJI;
        if (addYoursTopic != null) {
            d6(addYoursTopic);
        }
    }
}
