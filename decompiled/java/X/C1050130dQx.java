package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.anchor.service.CommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0dQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050130dQx extends ConstraintLayout {
    public final Aweme LL;
    public final AnchorCommonStruct LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final InterfaceC1050170dR1 LLILZIL;

    public final void e0() {
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLILZIL.if0("commerce_anchor", "comment_anchor");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C622680Oba.LIZJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C622680Oba.LIZLLL(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentAnchorShowEvent(C1050160dR0 c1050160dR0) {
        if (!Intrinsics.LJFF(c1050160dR0.LIZ, AwemeExtKt.getAuthorUid(this.LL)) || !Intrinsics.LJFF(c1050160dR0.LIZIZ, this.LLILLL)) {
            return;
        }
        this.LLILZIL.o42("commerce_anchor", "comment_anchor");
    }

    public C1050130dQx(Context context, Aweme aweme, AnchorCommonStruct anchorCommonStruct, String str, AwS260S0300000_16 awS260S0300000_16) {
        List<String> urlList;
        String str2;
        super(context);
        this.LL = aweme;
        this.LLILLJJLI = anchorCommonStruct;
        this.LLILLL = str;
        this.LLILZ = awS260S0300000_16;
        this.LLILZIL = CommerceAnchorService.LJIILL().LJII(new InterfaceC1044450dHn() { // from class: X.0dQy
            @Override // X.InterfaceC1044450dHn
            public final InterfaceC1392640mLO LJII() {
                return null;
            }

            @Override // X.InterfaceC1044450dHn
            public final Integer LJIIIIZZ() {
                return 0;
            }

            @Override // X.InterfaceC1044450dHn
            public final String getRefer() {
                return "commerce_anchor";
            }

            @Override // X.InterfaceC1044450dHn
            public final AnchorCommonStruct LIZJ() {
                return this.LIZ.LLILLJJLI;
            }

            @Override // X.InterfaceC1044450dHn
            public final Aweme getAweme() {
                return this.LIZ.LL;
            }

            @Override // X.InterfaceC1044450dHn
            public final Context getContext() {
                return this.LIZ.getContext();
            }

            @Override // X.InterfaceC1044450dHn
            public final String getEnterFrom() {
                return this.LIZ.LLILLL;
            }
        });
        if (!C0CNZ.LIZIZ() || C20673215v0.LJFF(context, context, R.layout.agr, this, true) == null) {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.agr, this, true);
        }
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.azx);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.wlq);
        C1047010dLv c1047010dLv = C1047010dLv.LIZ;
        String extra = anchorCommonStruct.getExtra();
        c1047010dLv.getClass();
        C1047010dLv.LIZJ(extra);
        if (tuxTextView != null) {
            tuxTextView.setText(anchorCommonStruct.getKeyword());
        }
        if (tuxTextView2 != null) {
            tuxTextView2.setText(anchorCommonStruct.getDescription());
        }
        UrlModel icon = anchorCommonStruct.getIcon();
        if (icon != null && (urlList = icon.getUrlList()) != null && (str2 = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_anchor_recommend;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ.LJJIIZI(tuxIconDrawableLIZ);
            c1331670kl3LJIIIZ.LJIL(tuxIconDrawableLIZ);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        if (smartImageView != null) {
            C786410Ut5.Q8(smartImageView, new ACListenerS151S0100000_16(this, 81));
        }
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS151S0100000_16(this, 82));
        }
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS151S0100000_16(this, 83));
        }
    }
}
