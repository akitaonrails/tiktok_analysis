package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerProductInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1646606ca extends FrameLayout implements C06OA {
    public final /* synthetic */ C06ME LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public ECBannerContent LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    private final TuxIconView getCloseBtn() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final ConstraintLayout getContainer() {
        return (ConstraintLayout) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getCostTv() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getCountTv() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final TuxTextView getCtaTv() {
        return (TuxTextView) this.LLJ.getValue();
    }

    private final TuxTextView getNameTv() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    private final SmartImageView getThumbNailIv() {
        return (SmartImageView) this.LLILZIL.getValue();
    }

    private final TuxTextView getTitleTv() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public C1646606ca(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C06ME();
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1158));
        this.LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1164));
        this.LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1157));
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1163));
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1162));
        this.LLIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1160));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1159));
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1161));
    }

    public final void LIZ(ECBannerContent eCBannerContent, String str, String str2) {
        final ECBannerContent eCBannerContent2;
        Long l;
        String str3;
        String str4;
        String str5;
        this.LLJI = eCBannerContent;
        this.LLJILJILJ = str;
        this.LLJILLL = str2;
        if (getVisibility() == 8) {
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            if (!this.LLJIJIL && (eCBannerContent2 = this.LLJI) != null && (l = eCBannerContent2.orderId) != null) {
                final long jLongValue = l.longValue();
                Keva keva = (Keva) C1646406cY.LIZ.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("inactivity_count");
                sbLIZ.append(jLongValue);
                int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("inactivity_count");
                sbLIZ2.append(jLongValue);
                keva.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i + 1);
                String str6 = this.LLJILJILJ;
                String str7 = this.LLJILLL;
                C0I0B.LJFF.LIZIZ();
                C830490Whz c830490Whz = new C830490Whz();
                c830490Whz.put("enter_from", "chat");
                c830490Whz.put("conversation_id", str6);
                c830490Whz.put("to_user_id", str7);
                C20684815ws.LJIILLIIL("show_ec_redirect_card", c830490Whz);
                C786410Ut5.LJLLJ(getContext(), R.layout.cgs, this);
                View viewFindViewById = findViewById(R.id.gez);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C0I73.LIZ);
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
                viewFindViewById.setBackground(c384050F3z.LIZ(getContext()));
                this.LLJIJIL = true;
                getTitleTv().setText(eCBannerContent2.header);
                TuxTextView nameTv = getNameTv();
                ECBannerProductInfo eCBannerProductInfo = eCBannerContent2.productInfo;
                String str8 = null;
                if (eCBannerProductInfo != null) {
                    str3 = eCBannerProductInfo.name;
                } else {
                    str3 = null;
                }
                nameTv.setText(str3);
                TuxTextView countTv = getCountTv();
                ECBannerProductInfo eCBannerProductInfo2 = eCBannerContent2.productInfo;
                if (eCBannerProductInfo2 != null) {
                    str4 = eCBannerProductInfo2.amount;
                } else {
                    str4 = null;
                }
                countTv.setText(str4);
                TuxTextView costTv = getCostTv();
                ECBannerProductInfo eCBannerProductInfo3 = eCBannerContent2.productInfo;
                if (eCBannerProductInfo3 != null) {
                    str8 = eCBannerProductInfo3.price;
                }
                costTv.setText(str8);
                getCtaTv().setText(eCBannerContent2.btnText);
                ECBannerProductInfo eCBannerProductInfo4 = eCBannerContent2.productInfo;
                if (eCBannerProductInfo4 != null && (str5 = eCBannerProductInfo4.thumbnail) != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str5);
                    c1331670kl3LJIIIZ.LJJ(getThumbNailIv());
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                    c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
                    c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = C418440Gaw.LIZIZ(6);
                    c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                }
                C786410Ut5.a9(getCloseBtn(), new ACListenerS137S0100000_2(this, 86));
                C786410Ut5.Y7(getContainer(), new View.OnClickListener() { // from class: X.06cZ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1646606ca c1646606ca = this.LL;
                        if (!c1646606ca.LLJILJIL) {
                            c1646606ca.LLJILJIL = true;
                            long j = jLongValue;
                            Keva keva2 = (Keva) C1646406cY.LIZ.getValue();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("inactivity_count");
                            sbLIZ3.append(j);
                            int i2 = keva2.getInt(C2188811AlT.LIZIZ(sbLIZ3), 0);
                            if (i2 > 0) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("inactivity_count");
                                sbLIZ4.append(j);
                                keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ4), i2 - 1);
                            }
                        }
                        SmartRouter.buildRoute(this.LL.getContext(), eCBannerContent2.jumpLink).open();
                        C1646606ca c1646606ca2 = this.LL;
                        String str9 = c1646606ca2.LLJILJILJ;
                        String str10 = c1646606ca2.LLJILLL;
                        C0I0B.LJFF.LIZIZ();
                        C830490Whz c830490Whz2 = new C830490Whz();
                        c830490Whz2.put("enter_from", "chat");
                        c830490Whz2.put("conversation_id", str9);
                        c830490Whz2.put("to_user_id", str10);
                        C20684815ws.LJIILLIIL("click_ec_redirect_card", c830490Whz2);
                    }
                });
            }
        }
    }
}
