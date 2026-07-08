package X;

import Y.ACListenerS163S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.detail.DetailViewModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19404910vv implements InterfaceC616440OFu, Observer<Boolean> {
    public final View LL;
    public final C11FU LLILLJJLI;
    public final TextView LLILLL;
    public final ChallengeDetailParam LLILZ;
    public final C616430OFt LLILZIL;
    public Challenge LLILZLL;
    public C19406610wC LLIZ;
    public boolean LLIZLLLIL;

    public final void LIZ() {
        C616430OFt c616430OFt = this.LLILZIL;
        Object[] objArr = new Object[3];
        objArr[0] = 3;
        Challenge challenge = this.LLILZLL;
        if (challenge == null) {
            challenge = null;
        }
        objArr[1] = challenge.getCid();
        objArr[2] = Integer.valueOf(!this.LLIZLLLIL ? 1 : 0);
        c616430OFt.LIZJ(objArr);
        this.LLIZLLLIL = !this.LLIZLLLIL;
        this.LLILLJJLI.LIZLLL();
    }

    public final void LIZIZ() {
        TuxIconDrawable tuxIconDrawableLIZ;
        C11FU c11fu = this.LLILLJJLI;
        if (this.LLIZLLLIL) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_bookmark_fill;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1h, this.LL.getContext());
            tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LL.getContext());
        } else {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_bookmark;
            c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.a1h, this.LL.getContext());
            tuxIconDrawableLIZ = c419910GdJ2.LIZ(this.LL.getContext());
        }
        c11fu.setImageDrawable(tuxIconDrawableLIZ);
    }

    public final void LIZJ() {
        C1458960o4M.LIZJ(this.LLIZLLLIL);
        TextView textView = this.LLILLL;
        if (textView != null) {
            textView.setText(this.LLIZLLLIL ? R.string.cpj : R.string.cpa);
        }
    }

    @Override // X.InterfaceC616440OFu
    public final void ZX() {
        Challenge challenge = this.LLILZLL;
        if (challenge == null) {
            challenge = null;
        }
        challenge.setCollectStatus(this.LLIZLLLIL ? 1 : 0);
        Challenge challenge2 = this.LLILZLL;
        C1440005kM.LIZ(new C1206750hVZ(challenge2 != null ? challenge2 : null));
    }

    @Override // X.InterfaceC616440OFu
    public final void Me1(String str) {
        if (str == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
        bool.booleanValue();
    }

    @Override // X.InterfaceC616440OFu
    public final void p30(Exception exc) {
        C2344809Gs.LJI(exc);
        this.LLIZLLLIL = !this.LLIZLLLIL;
        LIZIZ();
        LIZJ();
    }

    public C19404910vv(View view, C11FU c11fu, TextView textView, ChallengeDetailParam challengeDetailParam) {
        Activity activityLIZ;
        TuxTextView tuxTextView;
        this.LL = view;
        this.LLILLJJLI = c11fu;
        this.LLILLL = textView;
        this.LLILZ = challengeDetailParam;
        C616430OFt c616430OFt = new C616430OFt();
        this.LLILZIL = c616430OFt;
        if (textView != null) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_7332386882_challenge_collect_button_autosize", true, true)) {
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                    tuxTextView.setMinTextSize(10.0f);
                }
            } else {
                textView.setMaxLines(Integer.MAX_VALUE);
                textView.setEllipsize(null);
            }
        }
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 182), view);
        c11fu.setOnStateChangeListener(new C11FV() { // from class: X.10vw
            @Override // X.C11FV
            public final void LIZ() {
            }

            @Override // X.C11FV
            public final void onStateChange(int i) {
                if (i == 1) {
                    this.LIZ.LIZIZ();
                    this.LIZ.LIZJ();
                }
            }
        });
        c616430OFt.LLILLJJLI = this;
        Context context = view.getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        NextLiveData<Boolean> nextLiveData = ((DetailViewModel) ViewModelProviders.of((C19EG) activityLIZ).get(DetailViewModel.class)).LL;
        Context context2 = view.getContext();
        nextLiveData.observe((C19FO) (context2 != null ? C1388190mED.LIZ(context2) : null), this);
    }
}
