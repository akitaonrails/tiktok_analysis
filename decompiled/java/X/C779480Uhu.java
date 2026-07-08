package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.publicscreen.api.GameBackgroundColorChannel;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Uhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779480Uhu extends C776950Udp implements InterfaceC779500Uhw {
    public final Context LLILLL;
    public final InterfaceC779250UhX LLILZ;
    public C16F5 LLILZIL;
    public ConstraintLayout LLILZLL;
    public C16F5 LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final ImageView LLJIJIL;
    public final C417430GYj LLJILJIL;
    public final C11NJ LLJILJILJ;
    public int LLJILLL;
    public DataChannel LLJJ;

    public final ConstraintLayout getSmallViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vm8);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C16F5 getTvCountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zfl);
            this.LLILZIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C16F5 getTvCountNewMessageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zfv);
            this.LLIZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final Context getActivity() {
        return this.LLILLL;
    }

    public final int getIconWidth() {
        return this.LLIZLLLIL;
    }

    public final int getLeftPadding() {
        return this.LLJI;
    }

    public final int getSmallHeight() {
        return this.LLJ;
    }

    public final void LIZ(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C439101nJ.LIZ(15));
        gradientDrawable.setColor(i);
        getSmallViewFromXml().setBackground(gradientDrawable);
        Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.dy7);
        if (drawableLJIIJ != null) {
            drawableLJIIJ.setTint(i);
        }
    }

    public final void setDataChannel(DataChannel dataChannel) {
        Integer num;
        this.LLJJ = dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(NewMessageNumChannel.class, this, new AwS591S0100000_12(this, 1099));
        }
        DataChannel dataChannel2 = this.LLJJ;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(NetworkStatus.class, this, new AwS591S0100000_12(this, 1098));
        }
        DataChannel dataChannel3 = this.LLJJ;
        if (dataChannel3 != null && (num = (Integer) dataChannel3.gg0(GameBackgroundColorChannel.class)) != null) {
            LIZ(num.intValue());
        }
        DataChannel dataChannel4 = this.LLJJ;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(GameBackgroundColorChannel.class, this, new AwS591S0100000_12(this, 1096));
        }
    }

    public final void setIconWidth(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setLeftPadding(int i) {
        this.LLJI = i;
    }

    public final void setSmallHeight(int i) {
        this.LLJ = i;
    }

    public final void setSmallViewFromXml(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    public final void setTvCountFromXml(C16F5 c16f5) {
        this.LLILZIL = c16f5;
    }

    public final void setTvCountNewMessageFromXml(C16F5 c16f5) {
        this.LLIZ = c16f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C779480Uhu(android.content.Context r7, X.InterfaceC779250UhX r8) {
        /*
            r6 = this;
            r6.<init>(r7)
            r6.LLILLL = r7
            r6.LLILZ = r8
            r0 = 24
            r6.LLIZLLLIL = r0
            r0 = 30
            r6.LLJ = r0
            r0 = 3
            r6.LLJI = r0
            X.11NJ r5 = new X.11NJ
            r5.<init>()
            r6.LLJILJILJ = r5
            android.view.LayoutInflater r1 = X.C786410Ut5.ne(r7)
            X.0fFP r0 = X.C011Z.LIZ
            int r0 = r0.LJIIIZ()
            android.view.LayoutInflater r1 = X.C1834150xpV.LIZLLL(r1, r0)
            r0 = 2131569835(0x7f0d2cab, float:1.8765308E38)
            X.C786410Ut5.Sd(r0, r1, r6)
            r0 = 2131377996(0x7f0a3f4c, float:1.8376212E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.LLJIJIL = r0
            r0 = 2131377822(0x7f0a3e9e, float:1.837586E38)
            android.view.View r3 = r6.findViewById(r0)
            r0 = 2131374961(0x7f0a3371, float:1.8370056E38)
            android.view.View r4 = r6.findViewById(r0)
            X.0GYj r4 = (X.C417430GYj) r4
            r6.LLJILJIL = r4
            X.16F5 r1 = r6.getTvCountFromXml()
            java.lang.String r0 = "0"
            r1.setText(r0)
            X.0Uhv r0 = X.InterfaceC779500Uhw.LJLLI
            r0.getClass()
            X.11PQ<java.lang.Integer> r1 = X.C779490Uhv.LIZIZ
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r2 = r1.LJJJLZIJ(r0)
            Y.AfS181S0100000_12 r1 = new Y.AfS181S0100000_12
            r0 = 280(0x118, float:3.92E-43)
            r1.<init>(r6, r0)
            Y.AfS132S0000000_7 r0 = X.C0J1R.LIZ
            X.01kM r0 = r2.LJJLL(r1, r0)
            r5.LIZ(r0)
            if (r3 == 0) goto L77
            X.C439101nJ.LJI(r3)
        L77:
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            r1 = 0
            if (r0 == 0) goto L88
            X.0Jki r0 = r0.user()
            if (r0 == 0) goto L88
            X.1DgM r1 = r0.getCurrentUser()
        L88:
            com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting r0 = com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto Lab
            if (r1 == 0) goto Lb2
            com.bytedance.android.live.base.model.ImageModel r0 = r1.getAvatarThumb()
        L96:
            if (r0 == 0) goto Lb2
            X.C0JSS.LJII(r4, r0)
        L9b:
            boolean r0 = X.C497740JfY.LJJ()
            if (r0 == 0) goto Laa
            android.widget.ImageView r1 = r6.LLJIJIL
            if (r1 == 0) goto Laa
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.C786410Ut5.Qb(r1, r0)
        Laa:
            return
        Lab:
            if (r1 == 0) goto Lb2
            com.bytedance.android.live.base.model.ImageModel r0 = r1.getAvatarLarge()
            goto L96
        Lb2:
            if (r4 == 0) goto Lb7
            X.C439101nJ.LJI(r4)
        Lb7:
            if (r3 == 0) goto L9b
            r0 = 0
            X.C12ES.LJIILL(r0, r3)
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C779480Uhu.<init>(android.content.Context, X.0UhX):void");
    }
}
