package X;

import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.UgcPoiTicketDetail;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hME, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200960hME implements AnonymousClass1652 {
    public final Fragment LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public TuxIconView LJ;
    public TuxTextView LJFF;
    public TuxIconView LJI;
    public VideoItemParams LJII;
    public final AwS562S0100000_18 LJIIIIZZ = new AwS562S0100000_18(this, 2730);
    public View LJIIIZ;

    @Override // X.AnonymousClass1652
    public final void LIZ() {
        this.LIZIZ = true;
        this.LIZLLL = false;
        C1200970hMF c1200970hMF = InterfaceC1201000hMI.LIZ;
        VideoItemParams videoItemParams = this.LJII;
        Aweme aweme = videoItemParams != null ? videoItemParams.getAweme() : null;
        VideoItemParams videoItemParams2 = this.LJII;
        String str = videoItemParams2 != null ? videoItemParams2.mEventType : null;
        c1200970hMF.getClass();
        if (C1200970hMF.LIZ(aweme, str)) {
            this.LJIIIIZZ.invoke();
            return;
        }
        View view = this.LJIIIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AnonymousClass1652
    public final void LIZJ() {
        this.LIZIZ = false;
    }

    @Override // X.AnonymousClass1652
    public final void LJJIIJ() {
    }

    public C1200960hME(Fragment fragment) {
        this.LIZ = fragment;
    }

    @Override // X.AnonymousClass1652
    public final void LIZIZ(View view, VideoItemParams videoItemParams) {
        Aweme aweme;
        String str;
        Context context;
        VideoItemParams videoItemParams2;
        Aweme aweme2;
        UgcPoiTicketDetail ugcPoiTicketDetail;
        Integer num;
        UgcPoiTicketDetail ugcPoiTicketDetail2;
        Aweme aweme3;
        Aweme aweme4;
        this.LJIIIZ = view;
        TuxIconView tuxIconView = this.LJ;
        UgcPoiTicketDetail ugcPoiTicketDetail3 = null;
        if (tuxIconView == null) {
            if (view != null) {
                tuxIconView = (TuxIconView) view.findViewById(R.id.ral);
            } else {
                tuxIconView = null;
            }
        }
        this.LJ = tuxIconView;
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView == null) {
            View view2 = this.LJIIIZ;
            if (view2 != null) {
                tuxTextView = (TuxTextView) view2.findViewById(R.id.ran);
            } else {
                tuxTextView = null;
            }
        }
        this.LJFF = tuxTextView;
        TuxIconView tuxIconView2 = this.LJI;
        if (tuxIconView2 == null) {
            View view3 = this.LJIIIZ;
            if (view3 != null) {
                tuxIconView2 = (TuxIconView) view3.findViewById(R.id.raj);
            } else {
                tuxIconView2 = null;
            }
        }
        this.LJI = tuxIconView2;
        this.LJII = videoItemParams;
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 198), view);
        C1200970hMF c1200970hMF = InterfaceC1201000hMI.LIZ;
        VideoItemParams videoItemParams3 = this.LJII;
        if (videoItemParams3 != null) {
            aweme = videoItemParams3.getAweme();
        } else {
            aweme = null;
        }
        VideoItemParams videoItemParams4 = this.LJII;
        if (videoItemParams4 != null) {
            str = videoItemParams4.mEventType;
        } else {
            str = null;
        }
        c1200970hMF.getClass();
        if (C1200970hMF.LIZ(aweme, str)) {
            this.LIZJ = true;
            this.LJIIIIZZ.invoke();
            View view4 = this.LJIIIZ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
            View view5 = this.LJIIIZ;
            if (view5 != null && (context = view5.getContext()) != null && (videoItemParams2 = this.LJII) != null && (aweme2 = videoItemParams2.getAweme()) != null && (ugcPoiTicketDetail = aweme2.getUgcPoiTicketDetail()) != null && (num = ugcPoiTicketDetail.resultStatus) != null) {
                num.intValue();
                TuxIconView tuxIconView3 = this.LJI;
                if (tuxIconView3 != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                    tuxIconView3.setTuxIcon(c419910GdJ);
                }
                VideoItemParams videoItemParams5 = this.LJII;
                if (videoItemParams5 != null && (aweme4 = videoItemParams5.getAweme()) != null) {
                    ugcPoiTicketDetail2 = aweme4.getUgcPoiTicketDetail();
                } else {
                    ugcPoiTicketDetail2 = null;
                }
                if (C1199400hJi.LIZJ(ugcPoiTicketDetail2)) {
                    TuxIconView tuxIconView4 = this.LJ;
                    if (tuxIconView4 != null) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_clock_fill;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                        tuxIconView4.setTuxIcon(c419910GdJ2);
                    }
                    TuxTextView tuxTextView2 = this.LJFF;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(context.getString(2131844768));
                        return;
                    }
                    return;
                }
                VideoItemParams videoItemParams6 = this.LJII;
                if (videoItemParams6 != null && (aweme3 = videoItemParams6.getAweme()) != null) {
                    ugcPoiTicketDetail3 = aweme3.getUgcPoiTicketDetail();
                }
                if (!C1199400hJi.LIZ(ugcPoiTicketDetail3)) {
                    return;
                }
                TuxIconView tuxIconView5 = this.LJ;
                if (tuxIconView5 != null) {
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZ = R.raw.icon_exclamation_mark_triangle_fill;
                    c419910GdJ3.LJ = Integer.valueOf(R.attr.ee);
                    tuxIconView5.setTuxIcon(c419910GdJ3);
                }
                TuxTextView tuxTextView3 = this.LJFF;
                if (tuxTextView3 == null) {
                    return;
                }
                tuxTextView3.setText(context.getString(2131844769));
                return;
            }
            return;
        }
        View view6 = this.LJIIIZ;
        if (view6 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view6);
    }
}
