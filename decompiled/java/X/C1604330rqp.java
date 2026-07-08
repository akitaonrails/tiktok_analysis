package X;

import X.C1604330rqp;
import X.C1C7U;
import X.InterfaceC1604170rqZ;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar$Companion$mHandler$1;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0rqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1604330rqp extends RelativeLayout {
    public static final ArrayList<InterfaceC1604170rqZ> LLJILJIL = new ArrayList<>();
    public static final VideoDownloadStatusBar$Companion$mHandler$1 LLJILJILJ;
    public static int LLJILLL;
    public RelativeLayout LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public InterfaceC1604170rqZ LLJ;
    public boolean LLJI;
    public int LLJIJIL;

    public final void LJFF() {
        C1376270luz.LJIILL = true;
        LJ();
        LIZJ();
        this.LLJI = false;
        this.LLJIJIL = 0;
        LLJILLL = 0;
        C786410Ut5.LLLLLLZZ(getDownloadSuccessImageView(), 8);
        C786410Ut5.LLLLZLL(getDownloadSuccessTextView(), 8);
        C786410Ut5.LLLLZLL(getDownloadFailedTextView(), 8);
        C786410Ut5.LLLLZLL(getDownloadVideoRetryView(), 8);
        LJI(0, C1308910kAL.LIZJ(C1865950yen.LIZ() ? R.attr.il : C1865950yen.LIZIZ() ? R.attr.im : R.attr.e4, getContext()), EnumC1985007q4.TYPE_FEED);
        C786410Ut5.LLLLZLL(getDownloadProgressView(), 0);
        C786410Ut5.LLLLZLL(getDownloadVideoCancelView(), 0);
        C786410Ut5.LLLLZLL(getDownloadingStatusTextView(), 0);
        getDownloadProgressViewRoot().requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar$Companion$mHandler$1] */
    static {
        final Looper mainLooper = Looper.getMainLooper();
        LLJILJILJ = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar$Companion$mHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("VideoDownloadStatusBar$Companion@1b08.mHandler$1");
                Iterator<InterfaceC1604170rqZ> it2 = C1604330rqp.LLJILJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LLJJJJ();
                }
                C1C7U.LIZIZ("VideoDownloadStatusBar$Companion@1b08.mHandler$1");
            }
        };
    }

    public static boolean LIZLLL() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        return i18nManagerServiceApiLIZ.LJJI(C844470XAv.LIZ(), "ar");
    }

    public static void LJ() {
        VideoDownloadStatusBar$Companion$mHandler$1 videoDownloadStatusBar$Companion$mHandler$1 = LLJILJILJ;
        if (videoDownloadStatusBar$Companion$mHandler$1.hasMessages(1)) {
            videoDownloadStatusBar$Companion$mHandler$1.removeMessages(1);
        }
        if (videoDownloadStatusBar$Companion$mHandler$1.hasMessages(2)) {
            videoDownloadStatusBar$Companion$mHandler$1.removeMessages(2);
        }
    }

    public final TuxTextView getDownloadFailedTextView() {
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxTextView getDownloadProgressView() {
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final RelativeLayout getDownloadProgressViewRoot() {
        RelativeLayout relativeLayout = this.LL;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        return null;
    }

    public final TuxIconView getDownloadSuccessImageView() {
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final TuxTextView getDownloadSuccessTextView() {
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxTextView getDownloadVideoCancelView() {
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxTextView getDownloadVideoRetryView() {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final TuxTextView getDownloadingStatusTextView() {
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final void LIZJ() {
        if (LIZLLL()) {
            getDownloadProgressView().setText("%0");
        } else {
            getDownloadProgressView().setText("0%");
        }
    }

    public final boolean getIsDownloadingPhoto() {
        return this.LLJI;
    }

    public final int getSuccessDownloadMediaNumber() {
        return this.LLJIJIL;
    }

    public final InterfaceC1604170rqZ getVideoDownloadClickListener() {
        return this.LLJ;
    }

    private final void setPhotoDownloadFailTextSpan(C0SU5 c0su5) {
        Aweme aweme;
        String string;
        String string2;
        INowsTabService iNowsTabServiceLIZIZ = C591970NJr.LIZIZ();
        Aweme aweme2 = null;
        if (c0su5 != null) {
            aweme = C0SU5.LIZLLL;
        } else {
            aweme = null;
        }
        if (iNowsTabServiceLIZIZ.LIZIZ(aweme)) {
            string = getContext().getString(2131838419);
        } else if (C294850Bh5.LIZ()) {
            string = "";
        } else {
            string = getContext().getString(2131858251);
        }
        INowsTabService iNowsTabServiceLIZIZ2 = C591970NJr.LIZIZ();
        if (c0su5 != null) {
            aweme2 = C0SU5.LIZLLL;
        }
        if (iNowsTabServiceLIZIZ2.LIZIZ(aweme2)) {
            string2 = getContext().getString(2131838418) + ' ';
        } else if (C294850Bh5.LIZ()) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) getContext().getResources().getQuantityText(2131755078, 2));
            sb.append(' ');
            string2 = sb.toString();
        } else {
            string2 = getContext().getString(2131858255) + ' ';
        }
        SpannableString spannableString = new SpannableString(string + ' ' + string2);
        C786410Ut5.p2(spannableString, new C1620640sH8(this, 0), a0.LJJJ(spannableString, string2, 0, false, 6), a0.LJJJ(spannableString, string2, 0, false, 6) + string2.length() + (-1), 17);
        getDownloadFailedTextView().setMovementMethod(LinkMovementMethod.getInstance());
        getDownloadFailedTextView().setText(spannableString);
    }

    private final void setVideoDownloadFailTextSpan(C0SU5 c0su5) {
        Aweme aweme;
        String string;
        String str;
        INowsTabService iNowsTabServiceLIZIZ = C591970NJr.LIZIZ();
        Aweme aweme2 = null;
        if (c0su5 != null) {
            aweme = C0SU5.LIZLLL;
        } else {
            aweme = null;
        }
        if (iNowsTabServiceLIZIZ.LIZIZ(aweme)) {
            string = getContext().getString(2131838419);
        } else if (C294850Bh5.LIZ()) {
            string = "";
        } else {
            string = getContext().getString(2131834556);
        }
        INowsTabService iNowsTabServiceLIZIZ2 = C591970NJr.LIZIZ();
        if (c0su5 != null) {
            aweme2 = C0SU5.LIZLLL;
        }
        if (iNowsTabServiceLIZIZ2.LIZIZ(aweme2)) {
            str = getContext().getString(2131838418) + ' ';
        } else if (C294850Bh5.LIZ()) {
            str = getContext().getString(2131825050) + ' ';
        } else {
            str = getContext().getString(2131834555) + ' ';
        }
        SpannableString spannableString = new SpannableString(string + str);
        C786410Ut5.p2(spannableString, new C1620640sH8(this, 1), a0.LJJJ(spannableString, str, 0, false, 6), a0.LJJJ(spannableString, str, 0, false, 6) + str.length() + (-1), 17);
        getDownloadFailedTextView().setMovementMethod(LinkMovementMethod.getInstance());
        getDownloadFailedTextView().setText(spannableString);
    }

    public final void LJIIIIZZ(int i) {
        int i2;
        C1376270luz.LIZ.getClass();
        if (C1376270luz.LJ) {
            return;
        }
        C786410Ut5.LLLLLLZZ(getDownloadSuccessImageView(), 8);
        C786410Ut5.LLLLZLL(getDownloadSuccessTextView(), 8);
        C786410Ut5.LLLLZLL(getDownloadFailedTextView(), 8);
        C786410Ut5.LLLLZLL(getDownloadingStatusTextView(), 0);
        if (C1865950yen.LIZ()) {
            i2 = R.attr.il;
        } else if (C1865950yen.LIZIZ()) {
            i2 = R.attr.im;
        } else {
            i2 = R.attr.e4;
        }
        LJI(0, C1308910kAL.LIZJ(i2, getContext()), EnumC1985007q4.TYPE_FEED);
        C786410Ut5.LLLLZLL(getDownloadProgressView(), 0);
        C786410Ut5.LLLLZLL(getDownloadVideoCancelView(), 0);
        if (LIZLLL()) {
            TuxTextView downloadProgressView = getDownloadProgressView();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('%');
            sbLIZ.append(i);
            downloadProgressView.setText(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            TuxTextView downloadProgressView2 = getDownloadProgressView();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append('%');
            downloadProgressView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
        }
        LLJILLL = i;
    }

    public final void setDownloadFailedTextView(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setDownloadProgressView(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setDownloadProgressViewRoot(RelativeLayout relativeLayout) {
        this.LL = relativeLayout;
    }

    public final void setDownloadSuccessImageView(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setDownloadSuccessTextView(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setDownloadVideoCancelView(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setDownloadVideoRetryView(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setDownloadingStatusTextView(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setVideoDownloadClickListener(InterfaceC1604170rqZ interfaceC1604170rqZ) {
        this.LLJ = interfaceC1604170rqZ;
    }

    public C1604330rqp(Context context, AttributeSet attributeSet) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(context, attributeSet);
        C20742916Ex.LIZ(getContext(), R.layout.b8r, this, true, -1);
        setDownloadProgressViewRoot((RelativeLayout) findViewById(R.id.trf));
        C786410Ut5.S7(getDownloadProgressViewRoot(), new View.OnClickListener() { // from class: X.0rqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        setDownloadSuccessImageView((TuxIconView) findViewById(R.id.g4q));
        setDownloadSuccessTextView((TuxTextView) findViewById(R.id.g4r));
        setDownloadVideoRetryView((TuxTextView) findViewById(R.id.g4j));
        setDownloadProgressView((TuxTextView) findViewById(R.id.g4f));
        setDownloadingStatusTextView((TuxTextView) findViewById(R.id.g4v));
        if (C294850Bh5.LIZ()) {
            getDownloadingStatusTextView().setText(getContext().getResources().getText(2131825054));
        }
        setDownloadFailedTextView((TuxTextView) findViewById(R.id.g44));
        setDownloadVideoCancelView((TuxTextView) findViewById(R.id.g42));
        setVideoDownloadFailTextSpan(null);
        C786410Ut5.h9(getDownloadVideoCancelView(), new ACListenerS158S0100000_24(this, 18));
        LIZJ();
        if (C303940Bvk.LIZ()) {
            for (View view : C1697810uHb.LJIIJJI(getDownloadSuccessImageView(), getDownloadSuccessTextView(), getDownloadProgressView(), getDownloadingStatusTextView(), getDownloadFailedTextView(), getDownloadVideoCancelView())) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, iLIZIZ, marginLayoutParams.rightMargin, iLIZIZ);
                }
            }
        }
        C2271391DvN.LIZ(getDownloadProgressViewRoot(), (C1A5L) C2271381DvM.LLLLZI.getValue());
    }

    public void LJI(int i, Integer num, EnumC1985007q4 enumC1985007q4) {
        if (this.LL != null) {
            C786410Ut5.LLIIL(getDownloadProgressViewRoot(), i);
            if (enumC1985007q4 != EnumC1985007q4.TYPE_PROFILE_PAGE && num != null) {
                num.intValue();
                getDownloadProgressViewRoot().setBackgroundColor(num.intValue());
            }
        }
    }

    public static void LIZ(C1604330rqp c1604330rqp, boolean z, C0SU5 c0su5, int i) {
        int i2;
        if ((i & 2) != 0) {
            c0su5 = null;
        }
        int i3 = i & 8;
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadProgressView(), 8);
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadingStatusTextView(), 8);
        C786410Ut5.LLLLLLZZ(c1604330rqp.getDownloadSuccessImageView(), 8);
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadSuccessTextView(), 8);
        if (C1865950yen.LIZ()) {
            i2 = R.attr.il;
        } else if (C1865950yen.LIZIZ()) {
            i2 = R.attr.im;
        } else {
            i2 = R.attr.e4;
        }
        c1604330rqp.LJI(0, C1308910kAL.LIZJ(i2, c1604330rqp.getContext()), EnumC1985007q4.TYPE_FEED);
        c1604330rqp.getDownloadFailedTextView().setWidth(C12ES.LJIIJ(c1604330rqp.getContext()) - ((int) C12ES.LIZJ(77.0f, c1604330rqp.getContext())));
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadFailedTextView(), 0);
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadVideoCancelView(), 0);
        c1604330rqp.getDownloadFailedTextView().requestLayout();
        c1604330rqp.getDownloadProgressViewRoot().requestLayout();
        if (z) {
            c1604330rqp.setPhotoDownloadFailTextSpan(c0su5);
        } else {
            c1604330rqp.setVideoDownloadFailTextSpan(c0su5);
        }
        c1604330rqp.LIZJ();
        VideoDownloadStatusBar$Companion$mHandler$1 videoDownloadStatusBar$Companion$mHandler$1 = LLJILJILJ;
        if (!videoDownloadStatusBar$Companion$mHandler$1.hasMessages(2)) {
            C786410Ut5.LJLJJI(2, 20000L, videoDownloadStatusBar$Companion$mHandler$1);
        }
        c1604330rqp.LLJI = z;
        c1604330rqp.LLJIJIL = 0;
    }

    public static void LIZIZ(C1604330rqp c1604330rqp, boolean z, int i, C0SU5 c0su5, int i2) {
        EnumC1985007q4 enumC1985007q4;
        Aweme aweme = null;
        if ((i2 & 4) != 0) {
            c0su5 = null;
        }
        if ((i2 & 8) != 0) {
            enumC1985007q4 = EnumC1985007q4.DEFAULT;
        } else {
            enumC1985007q4 = null;
        }
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadProgressView(), 8);
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadingStatusTextView(), 8);
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadVideoCancelView(), 8);
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadFailedTextView(), 8);
        if (enumC1985007q4 != EnumC1985007q4.TYPE_PROFILE_PAGE) {
            c1604330rqp.LJI(0, Integer.valueOf(C960203pA.LIZ(R.attr.a0d, c1604330rqp.getContext())), EnumC1985007q4.TYPE_FEED);
            c1604330rqp.getDownloadProgressViewRoot().setBackgroundColor(C960203pA.LIZ(R.attr.a0d, c1604330rqp.getContext()));
        }
        C786410Ut5.LLLLLLZZ(c1604330rqp.getDownloadSuccessImageView(), 0);
        C786410Ut5.LLLLZLL(c1604330rqp.getDownloadSuccessTextView(), 0);
        if (C294850Bh5.LIZ()) {
            c1604330rqp.getDownloadSuccessTextView().setText(c1604330rqp.getContext().getString(2131825053));
        } else if (z) {
            c1604330rqp.getDownloadSuccessTextView().setText(c1604330rqp.getContext().getResources().getQuantityText(2131756062, i));
        } else {
            c1604330rqp.getDownloadSuccessTextView().setText(c1604330rqp.getContext().getResources().getString(2131834561));
        }
        INowsTabService iNowsTabServiceLIZIZ = C591970NJr.LIZIZ();
        if (c0su5 != null) {
            aweme = C0SU5.LIZLLL;
        }
        if (iNowsTabServiceLIZIZ.LIZIZ(aweme)) {
            if (C294850Bh5.LIZ()) {
                c1604330rqp.getDownloadSuccessTextView().setText(c1604330rqp.getContext().getString(2131825053));
            } else {
                c1604330rqp.getDownloadSuccessTextView().setText(c1604330rqp.getContext().getString(2131838420));
            }
        }
        c1604330rqp.getDownloadProgressViewRoot().requestLayout();
        c1604330rqp.LIZJ();
        VideoDownloadStatusBar$Companion$mHandler$1 videoDownloadStatusBar$Companion$mHandler$1 = LLJILJILJ;
        if (!videoDownloadStatusBar$Companion$mHandler$1.hasMessages(1)) {
            C786410Ut5.LJLJJI(1, 3000L, videoDownloadStatusBar$Companion$mHandler$1);
        }
        c1604330rqp.LLJI = z;
        c1604330rqp.LLJIJIL = i;
    }
}
