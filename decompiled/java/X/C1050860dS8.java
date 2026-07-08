package X;

import Y.ACListenerS119S0200000_16;
import Y.AObserverS220S0100000_16;
import Y.AfS152S0200000_16;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BACouponApi;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.model.CouponRedeemedStateVM;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050860dS8 extends FrameLayout {
    public final CouponInfo LL;
    public final Aweme LLILLJJLI;
    public final User LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public RadiusLayout LLILZLL;
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public View LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C197039127h LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    public final void LIZIZ() {
        String string;
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(getContext());
        dialogC1389620mGW.LJJLJ(2131835638);
        dialogC1389620mGW.LJJLIIJ(true);
        C786410Ut5.J4(dialogC1389620mGW);
        BACouponApi.LIZ.getClass();
        BACouponApi bACouponApiLIZ = C1050790dS1.LIZ();
        Long couponId = this.LL.getCouponId();
        if (couponId == null || (string = couponId.toString()) == null) {
            string = "";
        }
        String receivedId = this.LL.getReceivedId();
        bACouponApiLIZ.LIZ(string, receivedId != null ? receivedId : "").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS152S0200000_16(dialogC1389620mGW, this, 10), new AfS152S0200000_16(dialogC1389620mGW, this, 11));
    }

    public final View getBoundarySpaceFromXml() {
        View view = this.LLJILJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.ci5);
        this.LLJILJIL = viewFindViewById;
        return viewFindViewById;
    }

    public final C197039127h getCouponButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f2i);
            this.LLJILLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxTextView getCouponCodeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f2j);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final RadiusLayout getCouponContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f2k);
            this.LLILZLL = (RadiusLayout) callbackFindViewById;
        }
        return (RadiusLayout) callbackFindViewById;
    }

    public final TuxTextView getCouponDecFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f2r);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getCouponIdFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f34);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getCouponPeriodOfValidityFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f3b);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getCouponTermsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f3l);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getCouponTiktokLogoFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f3n);
            this.LLIZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final CouponRedeemedStateVM getCouponVM() {
        return (CouponRedeemedStateVM) this.LLJJ.getValue();
    }

    public final Pair<Boolean, String> getHaveLink() {
        return (Pair) this.LLJJI.getValue();
    }

    public final TuxTextView getSubtitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wlq);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.title);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final void setBottom(boolean z) {
        String nickname;
        String strLJI = C20642515q3.LJI(2131829598);
        User user = this.LLILLL;
        if (user == null || (nickname = user.getNickname()) == null) {
            nickname = "";
        }
        int i = 0;
        getCouponTermsFromXml().setText(u.LJJIFFI(strLJI, "{username}", nickname, false));
        C197039127h couponButtonFromXml = getCouponButtonFromXml();
        if (z) {
            i = 8;
        }
        C786410Ut5.LLLLLLJ(couponButtonFromXml, i);
        if (getHaveLink().getFirst().booleanValue()) {
            couponButtonFromXml.setText(C20642515q3.LJI(2131829599));
            C786410Ut5.U8(couponButtonFromXml, new ACListenerS119S0200000_16(this, couponButtonFromXml, 39));
        } else {
            couponButtonFromXml.setText(C20642515q3.LJI(2131858016));
            C786410Ut5.U8(couponButtonFromXml, new ACListenerS119S0200000_16(this, couponButtonFromXml, 40));
        }
    }

    private final void setCouponUI(boolean z) {
        Drawable drawableLJ;
        RadiusLayout couponContainerFromXml = getCouponContainerFromXml();
        Context context = getContext();
        int i = R.attr.a07;
        if (z) {
            drawableLJ = C1308910kAL.LJ(R.attr.c7, context);
        } else {
            drawableLJ = C1308910kAL.LJ(R.attr.a07, context);
        }
        couponContainerFromXml.setBackground(drawableLJ);
        Matrix matrix = new Matrix();
        matrix.postRotate(35.0f);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132));
        c419910GdJ.LIZ = R.raw.icon_tiktok_logo;
        if (z) {
            i = R.attr.br;
        }
        c419910GdJ.LJ = Integer.valueOf(i);
        Bitmap bitmapLIZIZ = C376710Epp.LIZIZ(c419910GdJ.LIZ(getContext()));
        getCouponTiktokLogoFromXml().setImageBitmap(Bitmap.createBitmap(bitmapLIZIZ, 0, 0, bitmapLIZIZ.getWidth(), bitmapLIZIZ.getHeight(), matrix, true));
        TuxTextView couponCodeFromXml = getCouponCodeFromXml();
        String couponCode = this.LL.getCouponCode();
        if (couponCode == null) {
            couponCode = "";
        }
        couponCodeFromXml.setText(couponCode);
        String receivedId = this.LL.getReceivedId();
        if (receivedId != null && receivedId.length() != 0 && !getHaveLink().getFirst().booleanValue()) {
            TuxTextView couponIdFromXml = getCouponIdFromXml();
            C786410Ut5.LLLLZLL(couponIdFromXml, 0);
            couponIdFromXml.setText(u.LJJIFFI(C20642515q3.LJI(2131858009), "{number}", receivedId, false));
        } else {
            C786410Ut5.LLLLZLL(getCouponIdFromXml(), 8);
        }
        Long expireTime = this.LL.getExpireTime();
        if (expireTime != null && C08A4.LIZIZ(Long.valueOf(expireTime.longValue()))) {
            long jLongValue = expireTime.longValue();
            TuxTextView couponPeriodOfValidityFromXml = getCouponPeriodOfValidityFromXml();
            C786410Ut5.LLLLZLL(couponPeriodOfValidityFromXml, couponPeriodOfValidityFromXml.getVisibility());
            String strLJI = C20642515q3.LJI(2131829594);
            BDDateFormat bDDateFormat = new BDDateFormat("LLL");
            BDDateFormat bDDateFormat2 = new BDDateFormat("LT");
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            if (TextUtils.equals(bDDateFormat2.LIZIZ(jLongValue * j, Locale.getDefault()), "00:00")) {
                jLongValue--;
            }
            couponPeriodOfValidityFromXml.setText(u.LJJIFFI(strLJI, "{{date}}", bDDateFormat.LIZIZ(jLongValue * j, Locale.getDefault()), false));
        } else {
            C786410Ut5.LLLLZLL(getCouponPeriodOfValidityFromXml(), 8);
        }
        String description = this.LL.getDescription();
        if (description != null && description.length() > 0) {
            TuxTextView couponDecFromXml = getCouponDecFromXml();
            C786410Ut5.LLLLZLL(couponDecFromXml, 0);
            couponDecFromXml.setText(description);
        } else {
            C786410Ut5.LLLLZLL(getCouponDecFromXml(), 8);
        }
        if (getCouponPeriodOfValidityFromXml().getVisibility() == 8 && getCouponDecFromXml().getVisibility() == 8) {
            C786410Ut5.LJLLLLLL(8, getBoundarySpaceFromXml());
        }
    }

    private final void setTitle(boolean z) {
        String strLJI;
        String strLJI2;
        TuxTextView titleFromXml = getTitleFromXml();
        int i = 0;
        if (z) {
            strLJI = C20642515q3.LJI(2131858020);
        } else if (getHaveLink().getFirst().booleanValue()) {
            if (C08A4.LIZ(this.LL.getDiscountRate())) {
                strLJI = u.LJJIFFI(C20642515q3.LJI(2131858024), "{number}", String.valueOf(this.LL.getDiscountRate()), false);
            } else {
                strLJI = C20642515q3.LJI(2131858025);
            }
        } else if (C08A4.LIZ(this.LL.getDiscountRate())) {
            strLJI = u.LJJIFFI(C20642515q3.LJI(2131858022), "{number}", String.valueOf(this.LL.getDiscountRate()), false);
        } else {
            strLJI = C20642515q3.LJI(2131858023);
        }
        titleFromXml.setText(strLJI);
        TuxTextView subtitleFromXml = getSubtitleFromXml();
        if (getHaveLink().getFirst().booleanValue() || z) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(subtitleFromXml, i);
        if (getHaveLink().getFirst().booleanValue()) {
            strLJI2 = "";
        } else {
            strLJI2 = C20642515q3.LJI(2131858021);
        }
        subtitleFromXml.setText(strLJI2);
    }

    public final void LIZ(boolean z) {
        setTitle(z);
        setCouponUI(z);
        setBottom(z);
    }

    public final void setBoundarySpaceFromXml(View view) {
        this.LLJILJIL = view;
    }

    public final void setCouponButtonFromXml(C197039127h c197039127h) {
        this.LLJILLL = c197039127h;
    }

    public final void setCouponCodeFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setCouponContainerFromXml(RadiusLayout radiusLayout) {
        this.LLILZLL = radiusLayout;
    }

    public final void setCouponDecFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setCouponIdFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setCouponPeriodOfValidityFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setCouponTermsFromXml(TuxTextView tuxTextView) {
        this.LLJILJILJ = tuxTextView;
    }

    public final void setCouponTiktokLogoFromXml(TuxIconView tuxIconView) {
        this.LLIZ = tuxIconView;
    }

    public final void setSubtitleFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public C1050860dS8(Context context, CouponInfo couponInfo, Aweme aweme, User user) {
        CouponRedeemedStateVM couponVM;
        LiveData liveData;
        super(context, null, 0);
        this.LL = couponInfo;
        this.LLILLJJLI = aweme;
        this.LLILLL = user;
        this.LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(context, 1004));
        this.LLJJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1031));
        C786410Ut5.Sd(R.layout.bfx, C786410Ut5.ne(context), this);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (couponVM = getCouponVM()) != null && (liveData = (LiveData) couponVM.LL.getValue()) != null) {
            liveData.observe(c19egLIZIZ, new AObserverS220S0100000_16(this, 46));
        }
        LIZ(couponInfo.getRedeemed());
    }
}
