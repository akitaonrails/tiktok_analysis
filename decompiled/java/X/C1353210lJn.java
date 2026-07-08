package X;

import Y.ACListenerS155S0100000_21;
import Y.ARunnableS90S0200000_21;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.service.CommentLikeAndHateServiceImpl;
import com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.experiment.CommentOptCellConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.text.a0;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: renamed from: X.0lJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353210lJn extends LinearLayout {
    public static final C01GW<Typeface> LLJLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(485));
    public C424620Gku LL;
    public TuxTextView LLILLJJLI;
    public C1355730lNr LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public TextView LLILZLL;
    public C1355730lNr LLIZ;
    public ImageView LLIZLLLIL;
    public View LLJ;
    public TextView LLJI;
    public TuxIconView LLJIJIL;
    public TextView LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public LinearLayout LLJJ;
    public TuxTextView LLJJI;
    public C1353320lJy LLJJIII;
    public boolean LLJJIJI;
    public final TuxTextView LLJJIJIIJIL;
    public final C1353310lJx LLJJIJIL;
    public int LLJJJ;
    public String LLJJJIL;
    public CommentStruct LLJJJJ;
    public Aweme LLJJJJJIL;
    public Keva LLJJJJLIIL;
    public WeakReference<InterfaceC1066540drQ> LLJJL;
    public InterfaceC1021920chS LLJJLIIIJLLLLLLLZ;
    public final AwS565S0100000_21 LLJL;

    public final void LJ() {
        Aweme aweme;
        InterfaceC1066540drQ interfaceC1066540drQ;
        if (this.LLJJJJ == null || (aweme = this.LLJJJJJIL) == null || AwemeExtKt.getAdCommentStruct(aweme) != null) {
            return;
        }
        C1029850cuF c1029850cuF = C1029850cuF.LIZ;
        c1029850cuF.getClass();
        IAdCommentDepend iAdCommentDepend = C1029850cuF.LIZIZ;
        if (iAdCommentDepend != null) {
            c1029850cuF.getClass();
            iAdCommentDepend.LJIIZILJ(getContext(), this.LLJJJJJIL);
        }
        WeakReference<InterfaceC1066540drQ> weakReference = this.LLJJL;
        if (weakReference != null && (interfaceC1066540drQ = weakReference.get()) != null) {
            interfaceC1066540drQ.LIZ();
        }
        c1029850cuF.getClass();
        if (iAdCommentDepend != null) {
            c1029850cuF.getClass();
            iAdCommentDepend.LJIL(this.LLJJJJJIL, this.LLJJJIL, "click_comment_link", true);
        }
    }

    public final String getDiggSpKey() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("COMMENT_DIGG");
        sbLIZ.append(this.LLJJJJ.getAwemeId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C1022030chd.LJIJJ(getContext())) {
            return;
        }
        if (this.LLJJJJJIL != null && !(!AwemeExtKt.isAdTraffic(r0))) {
            if (this.LLJJJJ.getCommentStyle() == 1) {
                C1353300lJw c1353300lJw = C1353300lJw.LIZ;
                AwemeRawAd awemeRawAd = this.LLJJJJJIL.getAwemeRawAd();
                c1353300lJw.getClass();
                C1001140c9w c1001140c9w = new C1001140c9w();
                c1001140c9w.LIZ = awemeRawAd;
                JSONObject jSONObjectLIZ = c1001140c9w.LIZ();
                if (awemeRawAd != null) {
                    C994130byd.LIZ("comment_first_ad", "othershow", jSONObjectLIZ, awemeRawAd);
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("comment_first_ad", "othershow", this.LLJJJJJIL.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(this.LLJJJJJIL), "anchor_id");
                c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(this.LLJJJJJIL), "room_id");
                c1022820ciuLIZLLL.LJIIIIZZ();
            } else if (this.LLJJJJ.getCommentStyle() == 0) {
                C1353300lJw c1353300lJw2 = C1353300lJw.LIZ;
                AwemeRawAd awemeRawAd2 = this.LLJJJJJIL.getAwemeRawAd();
                c1353300lJw2.getClass();
                C1001140c9w c1001140c9w2 = new C1001140c9w();
                c1001140c9w2.LIZ = awemeRawAd2;
                JSONObject jSONObjectLIZ2 = c1001140c9w2.LIZ();
                if (awemeRawAd2 != null) {
                    C994130byd.LIZ("comment_first_ad", "comment_first_show", jSONObjectLIZ2, awemeRawAd2);
                }
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("comment_first_ad", "comment_first_show", this.LLJJJJJIL.getAwemeRawAd());
                c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LIZLLL(this.LLJJJJJIL), "anchor_id");
                c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LJ(this.LLJJJJJIL), "room_id");
                c1022820ciuLIZLLL2.LJIIIIZZ();
            }
        }
        C1029850cuF.LIZ.getClass();
        IAdCommentDepend iAdCommentDepend = C1029850cuF.LIZIZ;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.LJIL(this.LLJJJJJIL, this.LLJJJIL, "show_comment_link", false);
        }
    }

    public final InterfaceC1021920chS getAdOpenCallBack() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final Aweme getAweme() {
        return this.LLJJJJJIL;
    }

    public final C1353320lJy getCommentLikeAndHateView() {
        return this.LLJJIII;
    }

    public final TuxTextView getCommentTimeViewNew() {
        return this.LLJJI;
    }

    public final LinearLayout getContentll() {
        return this.LLJJ;
    }

    public final CommentStruct getData() {
        return this.LLJJJJ;
    }

    public final String getEventType() {
        return this.LLJJJIL;
    }

    public final Keva getKeva() {
        return this.LLJJJJLIIL;
    }

    public final C424620Gku getMAvatarView() {
        return this.LL;
    }

    public final View getMCommentContainer() {
        return this.LLILZ;
    }

    public final TextView getMCommentSplitView() {
        return this.LLJILJIL;
    }

    public final TextView getMCommentStyleView() {
        return this.LLJILJILJ;
    }

    public final TextView getMCommentTimeView() {
        return this.LLJI;
    }

    public final C1355730lNr getMContentView() {
        return this.LLILLL;
    }

    public final TuxIconView getMDiggView() {
        return this.LLJIJIL;
    }

    public final ImageView getMMenuItem() {
        return this.LLIZLLLIL;
    }

    public final TextView getMReplyCommentStyleView() {
        return this.LLJILLL;
    }

    public final View getMReplyContainer() {
        return this.LLILZIL;
    }

    public final C1355730lNr getMReplyContentView() {
        return this.LLIZ;
    }

    public final View getMReplyDivider() {
        return this.LLJ;
    }

    public final TextView getMReplyTitleView() {
        return this.LLILZLL;
    }

    public final TuxTextView getMTitleView() {
        return this.LLILLJJLI;
    }

    public final WeakReference<InterfaceC1066540drQ> getOnInternalEventListenerWeakReference() {
        return this.LLJJL;
    }

    public final int getSize() {
        return this.LLJJJ;
    }

    public final boolean getUsingRefactorStyle() {
        return this.LLJJIJI;
    }

    public C1353210lJn(Context context) {
        CommentOptCellConfig commentOptCellConfig;
        super(context, null, 0);
        this.LLJJJIL = "";
        this.LLJJJJLIIL = Keva.getRepo("ad_comment");
        this.LLJJLIIIJLLLLLLLZ = new InterfaceC1021920chS() { // from class: X.0lJv
            @Override // X.InterfaceC1021920chS
            public final void LIZ() {
            }
        };
        this.LLJL = new AwS565S0100000_21(this, 1335);
        C786410Ut5.Sd(R.layout.cuc, C786410Ut5.ne(context), this);
        this.LLJJI = (TuxTextView) findViewById(R.id.ee9);
        if (C1339960kyQ.LIZ() && (commentOptCellConfig = (CommentOptCellConfig) C1339960kyQ.LIZIZ.getValue()) != null && commentOptCellConfig.commentOptLikeButton > 0) {
            C1353310lJx c1353310lJx = new C1353310lJx();
            this.LLJJIJIL = c1353310lJx;
            c1353310lJx.LIZJ = (TuxIconView) findViewById(R.id.lmk);
            c1353310lJx.LIZLLL = (TuxIconView) findViewById(R.id.lf1);
            c1353310lJx.LJ = (ConstraintLayout) findViewById(R.id.mo2);
            c1353310lJx.LJFF = (TuxTextView) findViewById(R.id.ztt);
            c1353310lJx.LJI = (TuxIconView) findViewById(R.id.lje);
            c1353310lJx.LJII = (TuxIconView) findViewById(R.id.lyu);
            c1353310lJx.LJIIIIZZ = (RelativeLayout) findViewById(R.id.jhj);
            TuxIconView tuxIconView = c1353310lJx.LIZJ;
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 0.0f);
            }
            TuxIconView tuxIconView2 = c1353310lJx.LIZLLL;
            if (tuxIconView2 != null) {
                C786410Ut5.x5(tuxIconView2, 1.0f);
            }
            TuxIconView tuxIconView3 = c1353310lJx.LJI;
            if (tuxIconView3 != null) {
                C786410Ut5.x5(tuxIconView3, 0.0f);
            }
            TuxIconView tuxIconView4 = c1353310lJx.LJII;
            if (tuxIconView4 != null) {
                C786410Ut5.x5(tuxIconView4, 1.0f);
            }
            ConstraintLayout constraintLayout = c1353310lJx.LJ;
            if (constraintLayout != null) {
                q0.LJJI(constraintLayout, true);
                q0.LJIJ(constraintLayout, new C786390Ut3(8));
            }
            RelativeLayout relativeLayout = c1353310lJx.LJIIIIZZ;
            if (relativeLayout != null) {
                q0.LJJI(relativeLayout, true);
                q0.LJIJ(relativeLayout, new C786390Ut3(9));
            }
            if (c1353310lJx.LIZIZ) {
                c1353310lJx.LIZJ();
            }
        } else {
            this.LLJJIII = (C1353320lJy) findViewById(R.id.ftv);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        this.LLJJJ = C341940Daq.LIZ(32.0d);
        this.LL = (C424620Gku) findViewById(R.id.bh2);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.title);
        this.LLILLL = (C1355730lNr) findViewById(R.id.eu1);
        this.LLILZ = findViewById(R.id.ea2);
        this.LLILZIL = findViewById(R.id.t7h);
        this.LLILZLL = (TextView) findViewById(R.id.t7s);
        this.LLIZ = (C1355730lNr) findViewById(R.id.t7i);
        this.LLIZLLLIL = (ImageView) findViewById(R.id.hgc);
        this.LLJ = findViewById(R.id.t7j);
        this.LLJI = (TextView) findViewById(R.id.ee7);
        this.LLJIJIL = (TuxIconView) findViewById(R.id.lev);
        this.LLJILJIL = (TextView) findViewById(R.id.edi);
        this.LLJILJILJ = (TextView) findViewById(R.id.edp);
        this.LLJILLL = (TextView) findViewById(R.id.t7f);
        this.LLJJ = (LinearLayout) findViewById(R.id.evt);
        this.LLJJIJIIJIL = (TuxTextView) findViewById(R.id.xy6);
        C1355730lNr c1355730lNr = this.LLILLL;
        if (c1355730lNr != null) {
            c1355730lNr.setTextSize(2, 15.0f);
        }
        if (C1022030chd.LJIJJ(context)) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            C786410Ut5.LJLLLLLL(8, this.LLILZ);
        }
        if (C293960Bfe.LIZ()) {
            setMediumFont(this.LLILLL);
        }
        TextView textView = this.LLJILJILJ;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0d, textView.getContext());
        if (numLIZJ != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
        if (C293960Bfe.LIZ()) {
            setMediumFont(this.LLJILJILJ);
        } else {
            TextView textView2 = this.LLJILJILJ;
            if (textView2 instanceof TuxTextView) {
                setBoldFont((TuxTextView) textView2);
            }
        }
        View viewFindViewById = findViewById(R.id.ma1);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 172), viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.bh2);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 173), viewFindViewById2);
        }
        View viewFindViewById3 = findViewById(R.id.title);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 165), viewFindViewById3);
        }
        View viewFindViewById4 = findViewById(R.id.ec3);
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 166), viewFindViewById4);
        }
        View viewFindViewById5 = findViewById(R.id.evt);
        if (viewFindViewById5 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 167), viewFindViewById5);
        }
        View viewFindViewById6 = findViewById(R.id.eu1);
        if (viewFindViewById6 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 168), viewFindViewById6);
        }
        View viewFindViewById7 = findViewById(R.id.ea2);
        if (viewFindViewById7 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 169), viewFindViewById7);
        }
        View viewFindViewById8 = findViewById(R.id.edp);
        if (viewFindViewById8 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 170), viewFindViewById8);
        }
        View viewFindViewById9 = findViewById(R.id.edi);
        if (viewFindViewById9 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 171), viewFindViewById9);
        }
        setOrientation(1);
        C1345110l6j.LIZ(this.LLILLL);
        C1345110l6j.LIZ(this.LLIZ);
        ICommentLikeAndHateService iCommentLikeAndHateServiceLJII = CommentLikeAndHateServiceImpl.LJII();
        if (iCommentLikeAndHateServiceLJII != null) {
            iCommentLikeAndHateServiceLJII.LIZIZ(this.LLILZ);
            iCommentLikeAndHateServiceLJII.LIZJ(this.LL);
            iCommentLikeAndHateServiceLJII.LJ(this.LLILLJJLI);
        }
    }

    private final void setBoldFont(TuxTextView tuxTextView) {
        tuxTextView.setTuxFont(62);
    }

    private final void setMediumFont(TextView textView) {
        C01GW<Typeface> c01gw = LLJLIL;
        if (c01gw.getValue() != null) {
            textView.setTypeface(c01gw.getValue());
        }
    }

    public final void LIZ(int i) {
        float fMeasureText;
        int iMeasureText;
        TextPaint paint;
        if (getContext() == null || i <= 0) {
            return;
        }
        C362440EIw c362440EIw = new C362440EIw();
        double d = i;
        c362440EIw.element = 0.65d * d;
        if (C1339960kyQ.LIZ()) {
            c362440EIw.element = d * 0.8d;
            CommentStruct commentStruct = this.LLJJJJ;
            if (commentStruct != null) {
                TuxTextView tuxTextView = this.LLJJIJIIJIL;
                if (tuxTextView != null && (paint = tuxTextView.getPaint()) != null) {
                    iMeasureText = (int) paint.measureText(C2215101Bmm.LJ(commentStruct.getCommentTime() * 1000));
                    if (iMeasureText != 0) {
                        iMeasureText += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    }
                } else {
                    iMeasureText = 0;
                }
                c362440EIw.element -= (double) iMeasureText;
            }
        }
        CommentStruct commentStruct2 = this.LLJJJJ;
        if (commentStruct2 != null && commentStruct2.showCreatorTag() && getResources() != null) {
            try {
                String string = a0.LJLIIIL(C786410Ut5.j4(getResources().getString(2131829168), Arrays.copyOf(new Object[]{""}, 1))).toString();
                TextPaint paint2 = this.LLJILJIL.getPaint();
                float fMeasureText2 = 0.0f;
                if (paint2 != null) {
                    fMeasureText = paint2.measureText(string);
                } else {
                    fMeasureText = 0.0f;
                }
                c362440EIw.element -= (double) (fMeasureText + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                String string2 = getResources().getString(2131826820);
                TextPaint paint3 = this.LLJILJILJ.getPaint();
                if (paint3 != null) {
                    fMeasureText2 = paint3.measureText(string2);
                }
                c362440EIw.element -= (double) (fMeasureText2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (this.LLILLJJLI.getMaxWidth() != ((int) c362440EIw.element)) {
            HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS90S0200000_21(c362440EIw, this, 52));
        }
    }

    public final void LIZIZ(String str) {
        AwemeRawAd awemeRawAd = this.LLJJJJJIL.getAwemeRawAd();
        if (awemeRawAd == null) {
            return;
        }
        String openUrl = awemeRawAd.getOpenUrl();
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("comment_first_ad", "click", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ(str, "refer");
        c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(this.LLJJJJJIL), "anchor_id");
        c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(this.LLJJJJJIL), "room_id");
        c1022820ciuLIZLLL.LJII();
        C1029850cuF.LIZ.getClass();
        IAdCommentDepend iAdCommentDepend = C1029850cuF.LIZIZ;
        if (iAdCommentDepend != null) {
            iAdCommentDepend.LJII(awemeRawAd);
            if (iAdCommentDepend.isChattingMessageUri(openUrl)) {
                C1353300lJw.LIZ.getClass();
                C1001140c9w c1001140c9w = new C1001140c9w();
                c1001140c9w.LIZ = awemeRawAd;
                c1001140c9w.LIZJ = false;
                C994130byd.LIZ("comment_first_ad", "click_message", c1001140c9w.LIZ(), awemeRawAd);
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("comment_first_ad", "click_message", awemeRawAd);
                c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LIZLLL(this.LLJJJJJIL), "anchor_id");
                c1022820ciuLIZLLL2.LIZIZ(C1019100ccu.LJ(this.LLJJJJJIL), "room_id");
                c1022820ciuLIZLLL2.LJIIIIZZ();
                return;
            }
        }
        C1353300lJw.LIZ.getClass();
        C1001140c9w c1001140c9w2 = new C1001140c9w();
        c1001140c9w2.LIZ = awemeRawAd;
        C994130byd.LIZ("comment_first_ad", "click_title", c1001140c9w2.LIZ(), awemeRawAd);
        C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("comment_first_ad", "click_title", this.LLJJJJJIL.getAwemeRawAd());
        c1022820ciuLIZLLL3.LIZIZ(C1019100ccu.LIZLLL(this.LLJJJJJIL), "anchor_id");
        c1022820ciuLIZLLL3.LIZIZ(C1019100ccu.LJ(this.LLJJJJJIL), "room_id");
        c1022820ciuLIZLLL3.LJIIIIZZ();
    }

    public final void LIZJ(int i) {
        Aweme aweme;
        if (this.LLJJJJ != null && (aweme = this.LLJJJJJIL) != null && AwemeExtKt.isAdTraffic(aweme)) {
            C1029850cuF c1029850cuF = C1029850cuF.LIZ;
            c1029850cuF.getClass();
            IAdCommentDepend iAdCommentDepend = C1029850cuF.LIZIZ;
            if (iAdCommentDepend != null) {
                c1029850cuF.getClass();
                iAdCommentDepend.LIZ(getContext(), this.LLJJJJJIL, i, this.LLJJLIIIJLLLLLLLZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8 A[PHI: r6
      0x00a8: PHI (r6v3 int) = (r6v0 int), (r6v5 int) binds: [B:40:0x00a6, B:38:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196 A[PHI: r6
      0x0196: PHI (r6v1 int) = (r6v0 int), (r6v3 int), (r6v3 int) binds: [B:40:0x00a6, B:41:0x00a8, B:42:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353210lJn.LIZLLL(android.view.View):void");
    }

    public final void setAdOpenCallBack(InterfaceC1021920chS interfaceC1021920chS) {
        this.LLJJLIIIJLLLLLLLZ = interfaceC1021920chS;
    }

    public final void setAweme(Aweme aweme) {
        this.LLJJJJJIL = aweme;
    }

    public final void setCommentLikeAndHateView(C1353320lJy c1353320lJy) {
        this.LLJJIII = c1353320lJy;
    }

    public final void setCommentStyle(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setCommentTimeViewNew(TuxTextView tuxTextView) {
        this.LLJJI = tuxTextView;
    }

    public final void setContentll(LinearLayout linearLayout) {
        this.LLJJ = linearLayout;
    }

    public final void setData(CommentStruct commentStruct) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        CommentOptCellConfig commentOptCellConfig;
        CommentOptCellConfig commentOptCellConfig2;
        boolean z2;
        boolean z3;
        Aweme aweme;
        Aweme aweme2;
        List<TextExtraStruct> listLIZLLL;
        if (C1022030chd.LJIJJ(getContext())) {
            return;
        }
        this.LLJJJJ = commentStruct;
        C1022030chd c1022030chd = C1022030chd.LIZ;
        String aid = commentStruct.getAid();
        c1022030chd.getClass();
        IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
        Aweme awemeEr = iAwemeService.Er(aid);
        Aweme awemeLLILZ = iAwemeService.LLILZ(aid);
        Aweme awemeAr = iAwemeService.Ar(aid);
        if (awemeEr == null) {
            if (awemeLLILZ == null) {
                awemeEr = awemeAr;
            } else {
                awemeEr = awemeLLILZ;
            }
        }
        this.LLJJJJJIL = awemeEr;
        if (this.LL.getHierarchy().LIZJ != null) {
            this.LL.getHierarchy().LIZJ.LJFF(C341940Daq.LIZ(0.5d));
            this.LL.getHierarchy().LIZJ.LJFF = C475630Ikz.LIZIZ(R.attr.ng, getContext());
        }
        if (this.LLJJJJ.getAvatarSize() > 0) {
            ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
            layoutParams.width = this.LLJJJJ.getAvatarSize();
            layoutParams.height = this.LLJJJJ.getAvatarSize();
            C424620Gku c424620Gku = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424620Gku);
            c424620Gku.setLayoutParams(layoutParams);
            this.LLJJJ = this.LLJJJJ.getAvatarSize();
        }
        User user = this.LLJJJJ.getUser();
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb != null && avatarThumb.getUrlList() != null && avatarThumb.getUrlList().size() != 0) {
                C424620Gku c424620Gku2 = this.LL;
                int i = this.LLJJJ;
                C1324840ka2.LJ(c424620Gku2, avatarThumb, i, i, null, c424620Gku2.getControllerListener(), true, null, false);
            } else {
                C1324840ka2.LIZ(this.LL, 2130971789);
            }
        }
        String commentInfo = this.LLJJJJ.getCommentInfo();
        if (this.LLJJJJJIL != null && !TextUtils.isEmpty(commentInfo)) {
            C1029850cuF.LIZ.getClass();
            IAdCommentDepend iAdCommentDepend = C1029850cuF.LIZIZ;
            if (iAdCommentDepend != null) {
                Aweme aweme3 = this.LLJJJJJIL;
                if (aweme3 != null && AwemeExtKt.isAdTraffic(aweme3)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Aweme aweme4 = this.LLJJJJJIL;
                if (aweme4 != null && AwemeExtKt.getAdCommentStruct(aweme4) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 & z3) {
                    CommentStruct commentStruct2 = this.LLJJJJ;
                    if (commentStruct2 != null && (aweme2 = this.LLJJJJJIL) != null) {
                        C1353260lJs c1353260lJs = C1353240lJq.LIZ;
                        Context context = getContext();
                        AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                        AwS565S0100000_21 awS565S0100000_21 = this.LLJL;
                        c1353260lJs.getClass();
                        if (commentStruct2.getCommentStyle() == 1) {
                            listLIZLLL = iAdCommentDepend.LJIJI(context, commentStruct2, awemeRawAd, awS565S0100000_21);
                        } else {
                            listLIZLLL = iAdCommentDepend.LIZLLL(context, commentStruct2);
                        }
                        this.LLILLL.setText(iAdCommentDepend.LJIILIIL(commentStruct2));
                        this.LLILLL.LJJJJIZL(listLIZLLL, new C0SQF() { // from class: X.0lJp
                            @Override // X.C0SQF
                            public final boolean LIZ(TextExtraStruct textExtraStruct) {
                                return false;
                            }
                        }, null);
                    }
                    this.LLILLL.setMovementMethod(LinkMovementMethod.getInstance());
                    C421740GgG.LIZ(this.LLJJ);
                } else {
                    CommentStruct commentStruct3 = this.LLJJJJ;
                    if (commentStruct3 != null && (aweme = this.LLJJJJJIL) != null) {
                        List<TextExtraStruct> listLJIILL = iAdCommentDepend.LJIILL(getContext(), commentStruct3, aweme);
                        this.LLILLL.setText(iAdCommentDepend.LJIILIIL(commentStruct3));
                        if (listLJIILL != null) {
                            this.LLILLL.LJJJJIZL(listLJIILL, new C0SQF() { // from class: X.0lJp
                                @Override // X.C0SQF
                                public final boolean LIZ(TextExtraStruct textExtraStruct) {
                                    return false;
                                }
                            }, null);
                            this.LLILLL.setMovementMethod(LinkMovementMethod.getInstance());
                        }
                    }
                }
            }
        }
        CommentStruct commentStruct4 = this.LLJJJJ;
        if (commentStruct4 != null) {
            if (C1339960kyQ.LIZ() && (commentOptCellConfig2 = (CommentOptCellConfig) C1339960kyQ.LIZIZ.getValue()) != null && commentOptCellConfig2.commentOptLikeButton > 0) {
                C1353310lJx c1353310lJx = this.LLJJIJIL;
                if (c1353310lJx != null) {
                    Aweme aweme5 = this.LLJJJJJIL;
                    c1353310lJx.LIZ = commentStruct4;
                    if (aweme5 != null) {
                        aweme5.getAid();
                    }
                    if (!c1353310lJx.LIZIZ) {
                        c1353310lJx.LIZJ();
                    }
                    int i2 = c1353310lJx.LJIJJLI.getInt(c1353310lJx.LIZIZ(), -1);
                    if (i2 != -1) {
                        commentStruct4.setUserDigged(i2);
                    }
                    int i3 = c1353310lJx.LJIJJLI.getInt(c1353310lJx.LIZ(), -1);
                    if (i3 != -1) {
                        commentStruct4.setUserBuried(i3);
                    }
                    c1353310lJx.LJIIIIZZ(Boolean.valueOf(commentStruct4.isUserDigged()), 0);
                    c1353310lJx.LJII(Boolean.valueOf(commentStruct4.isUserBuried()));
                }
            } else {
                C1353320lJy c1353320lJy = this.LLJJIII;
                if (c1353320lJy != null) {
                    c1353320lJy.LIZ(commentStruct4, this.LLJJJJJIL);
                }
            }
        }
        CommentStruct commentStruct5 = this.LLJJJJ;
        if (commentStruct5 != null && commentStruct5.showCreatorTag()) {
            z = true;
        } else {
            z = false;
        }
        String commentNickName = "";
        if (z) {
            C786410Ut5.LLIL(this.LLJILJIL, 0);
            this.LLJILJIL.setText(a0.LJLIIIL(C786410Ut5.j4(getResources().getString(2131829168), Arrays.copyOf(new Object[]{""}, 1))).toString());
            C786410Ut5.LLIL(this.LLJILJILJ, 0);
            this.LLJILJILJ.setText(getResources().getText(2131826820));
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (!TextUtils.isEmpty(this.LLJJJJ.getCommentNickName())) {
            commentNickName = this.LLJJJJ.getCommentNickName();
        }
        tuxTextView.setText(commentNickName);
        this.LLILLJJLI.setTuxFont(62);
        this.LLILLL.setPadding(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        int iLIZ = C295050BhP.LIZ();
        if (Build.VERSION.SDK_INT >= 26 && iLIZ > 0) {
            this.LLILLL.setTypeface(C1697580uHE.LIZIZ(0.0f, iLIZ, 0.0f, 0.0f, null, 0.0f, 0, null, 253));
            this.LLIZ.setTypeface(C1697580uHE.LIZIZ(0.0f, iLIZ, 0.0f, 0.0f, null, 0.0f, 0, null, 253));
        }
        TuxTextView tuxTextView2 = this.LLJJI;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        C786410Ut5.LLIL(this.LLJI, 8);
        TuxTextView tuxTextView3 = this.LLJJIJIIJIL;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        CommentStruct commentStruct6 = this.LLJJJJ;
        if (commentStruct6 != null) {
            long commentTime = commentStruct6.getCommentTime();
            if (C1339960kyQ.LIZ()) {
                TuxTextView tuxTextView4 = this.LLJJIJIIJIL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(C2215101Bmm.LJ(commentTime * 1000));
                    C786410Ut5.LLLLZLL(tuxTextView4, 0);
                }
            } else {
                TuxTextView tuxTextView5 = this.LLJJI;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(C1356610lPH.LIZJ(commentTime * 1000, getContext()));
                    C786410Ut5.LLLLZLL(tuxTextView5, 0);
                }
            }
        }
        if (C1339960kyQ.LIZ() && (commentOptCellConfig = (CommentOptCellConfig) C1339960kyQ.LIZIZ.getValue()) != null && commentOptCellConfig.commentOptLikeButton > 0) {
            C1353310lJx c1353310lJx2 = this.LLJJIJIL;
            if (c1353310lJx2 != null) {
                ConstraintLayout constraintLayout = c1353310lJx2.LJ;
                if (constraintLayout != null) {
                    C786410Ut5.LL(0, constraintLayout);
                }
                RelativeLayout relativeLayout = c1353310lJx2.LJIIIIZZ;
                if (relativeLayout != null) {
                    C786410Ut5.LLIIL(relativeLayout, 0);
                }
            }
        } else {
            C19252910Tv.LIZIZ.LIZLLL().LJIIZILJ().LIZ();
        }
        if (C1339960kyQ.LIZ()) {
            LIZ(getWidth());
        }
        if (C296020Biy.LIZ() && this.LLJJIJI) {
            View view = this.LLILZ;
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            TuxTextView tuxTextView6 = this.LLJJI;
            if (tuxTextView6 != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView6.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    C786410Ut5.R6(tuxTextView6, marginLayoutParams);
                }
            }
        }
    }

    public final void setEventType(String str) {
        this.LLJJJIL = str;
    }

    public final void setKeva(Keva keva) {
        this.LLJJJJLIIL = keva;
    }

    public final void setMAvatarView(C424620Gku c424620Gku) {
        this.LL = c424620Gku;
    }

    public final void setMCommentContainer(View view) {
        this.LLILZ = view;
    }

    public final void setMCommentSplitView(TextView textView) {
        this.LLJILJIL = textView;
    }

    public final void setMCommentStyleView(TextView textView) {
        this.LLJILJILJ = textView;
    }

    public final void setMCommentTimeView(TextView textView) {
        this.LLJI = textView;
    }

    public final void setMContentView(C1355730lNr c1355730lNr) {
        this.LLILLL = c1355730lNr;
    }

    public final void setMDiggView(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setMMenuItem(ImageView imageView) {
        this.LLIZLLLIL = imageView;
    }

    public final void setMReplyCommentStyleView(TextView textView) {
        this.LLJILLL = textView;
    }

    public final void setMReplyContainer(View view) {
        this.LLILZIL = view;
    }

    public final void setMReplyContentView(C1355730lNr c1355730lNr) {
        this.LLIZ = c1355730lNr;
    }

    public final void setMReplyDivider(View view) {
        this.LLJ = view;
    }

    public final void setMReplyTitleView(TextView textView) {
        this.LLILZLL = textView;
    }

    public final void setMTitleView(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setOnInternalEventListener(InterfaceC1066540drQ interfaceC1066540drQ) {
        this.LLJJL = new WeakReference<>(interfaceC1066540drQ);
    }

    public final void setOnInternalEventListenerWeakReference(WeakReference<InterfaceC1066540drQ> weakReference) {
        this.LLJJL = weakReference;
    }

    public final void setSize(int i) {
        this.LLJJJ = i;
    }

    public final void setUsingRefactorStyle(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJJJJ != null) {
            try {
                LIZ(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
