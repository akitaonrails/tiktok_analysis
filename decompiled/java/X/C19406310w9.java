package X;

import Y.ACListenerS131S0200000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvider;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.10w9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19406310w9 extends AbstractC19417810y0 {
    public TextView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TextView LLJLIL;
    public TextView LLJLILLLLZIIL;
    public TextView LLJLL;
    public TextView LLJLLIL;
    public View LLJLLL;
    public C11FU LLJZ;
    public TextView LLJZIJLIL;
    public C19404910vv LLL;

    @Override // X.AbstractC19417810y0
    public int getAttrsResId() {
        return R.layout.aeq;
    }

    @Override // X.AbstractC19417810y0
    public int getLayoutResId() {
        return R.layout.aew;
    }

    @Override // X.AbstractC19417810y0
    public final void LIZIZ() {
        ((ArrayList) this.LLJJIJIIJIL).add(ChallengeDetailProvider.LIZLLL().LIZ());
    }

    @Override // X.AbstractC19417810y0
    public final void LIZJ() {
        this.LLJJLIIIJLLLLLLLZ = (TextView) findViewById(R.id.bkt);
        ViewStub viewStub = (ViewStub) findViewById(R.id.b_k);
        viewStub.setLayoutResource(getAttrsResId());
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        this.LLJL = viewLJLLLL;
        if (viewLJLLLL == null) {
            viewLJLLLL = null;
        }
        this.LLJLIL = (TextView) viewLJLLLL.findViewById(R.id.b_l);
        View view = this.LLJL;
        if (view == null) {
            view = null;
        }
        this.LLJLILLLLZIIL = (TextView) view.findViewById(R.id.b_o);
        View view2 = this.LLJL;
        if (view2 == null) {
            view2 = null;
        }
        this.LLJLL = (TextView) view2.findViewById(R.id.b_p);
        View view3 = this.LLJL;
        this.LLJLLIL = (TextView) (view3 != null ? view3 : null).findViewById(R.id.b_m);
        ViewStub viewStub2 = (ViewStub) findViewById(R.id.d78);
        viewStub2.setLayoutResource(getButtonResId());
        View viewLJLLLL2 = C786410Ut5.LJLLLL(viewStub2);
        this.LLL = new C19404910vv(viewLJLLLL2.findViewById(R.id.e6f), (C11FU) viewLJLLLL2.findViewById(R.id.lcg), (TextView) viewLJLLLL2.findViewById(R.id.zec), getDetailParam());
        View viewFindViewById = viewLJLLLL2.findViewById(R.id.yhl);
        this.LLJLLL = viewFindViewById;
        if (viewFindViewById != null) {
            this.LLJZ = (C11FU) viewLJLLLL2.findViewById(R.id.lyg);
            this.LLJZIJLIL = (TextView) viewLJLLLL2.findViewById(R.id.tv_transform);
        }
        super.LIZJ();
    }

    @Override // X.AbstractC19417810y0
    public int getButtonResId() {
        int i = C993410bxT.LIZ[getMHeaderParam().LIZJ.ordinal()];
        if (i == 1) {
            return R.layout.aes;
        }
        if (i == 2) {
            return R.layout.aet;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC19417810y0
    public final void LIZ(ChallengeDetail challengeDetail) {
        if (challengeDetail.challenge == null) {
            return;
        }
        super.LIZ(challengeDetail);
        boolean z = false;
        TextView textView = null;
        if (C19406510wB.LIZ(getMChallenge().getProfileTagUrl())) {
            TextView textView2 = this.LLJJLIIIJLLLLLLLZ;
            if (textView2 == null) {
                textView2 = null;
            }
            C786410Ut5.LLIL(textView2, 0);
            TextView textView3 = this.LLJJLIIIJLLLLLLLZ;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(getMChallenge().getProfileTagUrl());
        } else {
            TextView textView4 = this.LLJJLIIIJLLLLLLLZ;
            if (textView4 == null) {
                textView4 = null;
            }
            C786410Ut5.LLIL(textView4, 8);
        }
        List<String> attrs = getMChallenge().getAttrs();
        if (attrs != null && !attrs.isEmpty()) {
            TextView textView5 = this.LLJLIL;
            if (textView5 == null) {
                textView5 = null;
            }
            LJI(textView5, 0);
            TextView textView6 = this.LLJLILLLLZIIL;
            if (textView6 == null) {
                textView6 = null;
            }
            LJI(textView6, 1);
            TextView textView7 = this.LLJLL;
            if (textView7 == null) {
                textView7 = null;
            }
            LJI(textView7, 2);
            TextView textView8 = this.LLJLLIL;
            if (textView8 == null) {
                textView8 = null;
            }
            LJI(textView8, 3);
            View view = this.LLJL;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(0, view);
        } else {
            View view2 = this.LLJL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(4, view2);
        }
        C19404910vv c19404910vv = this.LLL;
        if (c19404910vv == null) {
            c19404910vv = null;
        }
        Challenge mChallenge = getMChallenge();
        C19406610wC mHeaderParam = getMHeaderParam();
        c19404910vv.LLILZLL = mChallenge;
        c19404910vv.LLIZ = mHeaderParam;
        if (mChallenge.getCollectStatus() == 1) {
            z = true;
        }
        c19404910vv.LLIZLLLIL = z;
        c19404910vv.LIZIZ();
        c19404910vv.LIZJ();
        if (this.LLJLLL != null && C19406410wA.LIZ(getMChallengeDetail())) {
            ChallengeTransform transfrom = getMChallenge().getTransfrom();
            UrlModel urlModel = transfrom.iconUrlModel;
            if (urlModel == null) {
                C11FU c11fu = this.LLJZ;
                if (c11fu == null) {
                    c11fu = null;
                }
                int visibility = c11fu.getVisibility();
                c11fu.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c11fu);
            } else {
                C11FU c11fu2 = this.LLJZ;
                if (c11fu2 == null) {
                    c11fu2 = null;
                }
                C1324840ka2.LJFF(c11fu2, urlModel);
            }
            TextView textView9 = this.LLJZIJLIL;
            if (textView9 != null) {
                textView = textView9;
            }
            textView.setText(transfrom.text);
            C786410Ut5.I7(new ACListenerS131S0200000_29(this, transfrom, 22), this.LLJLLL);
            LJFF("challenge_transform_button_show");
        }
    }

    public final void LJFF(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("challenge_id", getMChallenge().getCid());
        c2344009Gk.LIZJ(getMChallenge().getContentType(), "content_type");
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public C19406310w9(Context context, C19406610wC c19406610wC) {
        super(context, c19406610wC, null);
    }

    public final void LJI(TextView textView, int i) {
        List<String> attrs = getMChallenge().getAttrs();
        int size = attrs.size() - (4 - i);
        if (size >= 0) {
            C786410Ut5.LLIL(textView, 0);
            textView.setText((CharSequence) ListProtector.get(attrs, size));
        } else {
            C786410Ut5.LLIL(textView, 4);
        }
    }
}
