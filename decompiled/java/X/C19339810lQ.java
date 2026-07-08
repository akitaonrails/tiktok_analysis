package X;

import Y.ACListenerS131S0200000_29;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailModel;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.10lQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19339810lQ implements InterfaceC1401590mZp {
    public final Context LIZIZ;
    public TextView LIZJ;
    public RemoteImageView LIZLLL;
    public TextView LJ;
    public View LJFF;
    public FrameLayout LJI;
    public SmartImageView LJII;
    public TuxTextView LJIIIIZZ;

    @Override // X.InterfaceC1401590mZp
    public final C1401640mZu LIZIZ() {
        Context context = this.LIZIZ;
        return new C1401640mZu(context, C786410Ut5.ne(context), 2131830701);
    }

    public C19339810lQ(Context context) {
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC1401590mZp
    public final void LIZ(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.jit);
        if (viewGroup != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZIZ), R.layout.dol, viewGroup, true);
            this.LJIIIIZZ = (TuxTextView) viewTd.findViewById(R.id.frf);
            this.LJII = (SmartImageView) viewTd.findViewById(R.id.a5l);
            this.LJI = (FrameLayout) viewTd.findViewById(R.id.a5k);
            this.LIZJ = (TextView) viewTd.findViewById(R.id.om8);
            this.LIZLLL = (RemoteImageView) viewTd.findViewById(R.id.om3);
            this.LJ = (TextView) viewTd.findViewById(R.id.oyr);
            this.LJFF = viewTd.findViewById(R.id.xh6);
        }
    }

    @Override // X.InterfaceC1401590mZp
    public final void LIZJ(MvDetailModel mvDetailModel) {
        FestivalEntity festivalEntityLIZ;
        List<String> list;
        String mvId;
        View view;
        long jLongValue;
        MvModel mvModel = mvDetailModel.mvInfo;
        if (mvModel != null) {
            TextView textView = this.LIZJ;
            if (textView != null) {
                textView.setText(mvModel.getName());
            }
            TextView textView2 = this.LJ;
            if (textView2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                Long userCount = mvModel.getUserCount();
                if (userCount != null) {
                    jLongValue = userCount.longValue();
                } else {
                    jLongValue = 0;
                }
                sbLIZ.append(C1843500y4a.LIZIZ(jLongValue));
                sbLIZ.append(' ');
                textView2.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            C1324840ka2.LJFF(this.LIZLLL, mvModel.getIconUrl());
        }
        Integer num = mvDetailModel.LIZ;
        if (num != null && num.intValue() == 2 && (view = this.LJFF) != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (C828040We2.LIZIZ() && (festivalEntityLIZ = C828040We2.LIZ()) != null && festivalEntityLIZ.mBannerDetail != null && (list = festivalEntityLIZ.mvIds) != null) {
            MvModel mvModel2 = mvDetailModel.mvInfo;
            if (mvModel2 != null) {
                mvId = mvModel2.getMvId();
            } else {
                mvId = null;
            }
            if (list.contains(mvId)) {
                if (!TextUtils.isEmpty(festivalEntityLIZ.detailPageInfo)) {
                    TuxTextView tuxTextView = this.LJIIIIZZ;
                    if (tuxTextView != null) {
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                    }
                    TuxTextView tuxTextView2 = this.LJIIIIZZ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(festivalEntityLIZ.detailPageInfo);
                    }
                    FrameLayout frameLayout = this.LJI;
                    if (frameLayout != null) {
                        C786410Ut5.LJZ(0, frameLayout);
                    }
                } else {
                    TuxTextView tuxTextView3 = this.LJIIIIZZ;
                    if (tuxTextView3 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView3, 8);
                    }
                }
                FrameLayout frameLayout2 = this.LJI;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(0, frameLayout2);
                }
                SmartImageView smartImageView = this.LJII;
                if (smartImageView != null) {
                    C786410Ut5.LLFF(0, smartImageView);
                }
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(festivalEntityLIZ.mBannerDetail.bannerResource);
                c1331670kl3LJIIIZ.LIZLLL("MovieDetailFragment");
                Context context = this.LIZIZ;
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C654910PmT.LIZ(2.0f, context);
                c1331750klB.LIZIZ = C654910PmT.LIZ(0.0f, context);
                c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
                c1331670kl3LJIIIZ.LJJ(this.LJII);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                FrameLayout frameLayout3 = this.LJI;
                if (frameLayout3 != null) {
                    C786410Ut5.O7(frameLayout3, new ACListenerS131S0200000_29(this, festivalEntityLIZ, 64));
                }
            }
        }
    }
}
