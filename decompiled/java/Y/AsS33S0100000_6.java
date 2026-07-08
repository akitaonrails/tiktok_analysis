package Y;

import X.AbstractC1585810rMx;
import X.C0HGU;
import X.C0IC2;
import X.C1349530lDr;
import X.C13LZ;
import X.C20684815ws;
import X.C2344009Gk;
import X.C438070HFt;
import X.C438120HFy;
import X.C446830Hfd;
import X.C452140HoC;
import X.C453470HqL;
import X.C531650Kt9;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.IMVoiceTranscriptViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListAssem;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public class AsS33S0100000_6 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 2:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 5:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 6:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIJ$6(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
            case 6:
            case 7:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsS33S0100000_6(Object obj, AssemVMLazy<InterfaceC0148002o, IMVoiceTranscriptViewModel> assemVMLazy) {
        this.$t = assemVMLazy;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i) {
        String aid;
        Aweme aweme;
        String authorUid;
        Aweme aweme2;
        if (i != 0 && i == 2) {
            C1349530lDr c1349530lDr = (C1349530lDr) asS33S0100000_6.l0;
            c1349530lDr.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            String strEnterFrom = CommentContextSourceKt.enterFrom(c1349530lDr.LJJIJIL());
            String str = "";
            if (strEnterFrom == null) {
                strEnterFrom = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
            CommentContextSource commentContextSourceLJJIJIL = c1349530lDr.LJJIJIL();
            if (commentContextSourceLJJIJIL == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSourceLJJIJIL)) == null || (aid = aweme2.getAid()) == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            CommentContextSource commentContextSourceLJJIJIL2 = c1349530lDr.LJJIJIL();
            if (commentContextSourceLJJIJIL2 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceLJJIJIL2)) != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
                str = authorUid;
            }
            c2344009Gk.LJIIIIZZ("author_id", str);
            C20684815ws.LJIILLIIL("vertical_scroll_gift_panel", c2344009Gk.LIZ);
        }
    }

    public static final void LJJIIJ$1(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i) {
        SchoolGroupsListAssem schoolGroupsListAssem = (SchoolGroupsListAssem) asS33S0100000_6.l0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        schoolGroupsListAssem.LLJJIJI = z;
    }

    public static final void LJJIIJ$2(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i) {
        ((C0HGU) asS33S0100000_6.l0).LIZJ();
        if (i == 0) {
            C0HGU c0hgu = (C0HGU) asS33S0100000_6.l0;
            if (c0hgu.LIZLLL > 0.0f && !c0hgu.LJ) {
                c0hgu.LIZIZ();
            }
        }
    }

    public static final void LJJIIJ$3(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i) {
        if (i == 0) {
            C446830Hfd c446830Hfd = (C446830Hfd) asS33S0100000_6.l0;
            if (c446830Hfd.LJ) {
                c446830Hfd.LJFF();
            }
        }
    }

    public static final void LJJIIJ$4(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i) {
        if (i == 0) {
            C446830Hfd c446830Hfd = (C446830Hfd) asS33S0100000_6.l0;
            if (c446830Hfd.LJ) {
                c446830Hfd.LJ();
            }
        }
    }

    public static final void LJJIIJ$5(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i) {
        SchoolUsersListAssem schoolUsersListAssem = (SchoolUsersListAssem) asS33S0100000_6.l0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        schoolUsersListAssem.LLJJIII = z;
    }

    public static final void LJJIIJ$6(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((C453470HqL) asS33S0100000_6.l0).setHasScrolled(true);
        }
    }

    public static final void LJJIIZI$0(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i, int i2) {
        AssemVMLazy assemVMLazy = (AssemVMLazy) asS33S0100000_6.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0IC2.LLILLJJLI;
        ((IMVoiceTranscriptViewModel) assemVMLazy.getValue()).wQ2();
    }

    public static final void LJJIIZI$1(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i, int i2) {
        C438120HFy c438120HFy = (C438120HFy) asS33S0100000_6.l0;
        C531650Kt9 it2 = C13LZ.LJIILJJIL(0, c438120HFy.getChildCount()).iterator();
        while (it2.LLILLL) {
            View childAt = c438120HFy.getChildAt(it2.nextInt());
            float fPow = (((float) (Math.pow(2.718281828459045d, (-Math.pow(((double) ((childAt.getLeft() + childAt.getRight()) / 2)) - ((double) ((c438120HFy.getLeft() + c438120HFy.getRight()) / 2)), 2.0d)) / (((double) 2) * Math.pow(150.0d, 2.0d))) * ((double) 1.0f))) * 0.45f) + 0.55f;
            C786410Ut5.Ob(childAt, fPow);
            C786410Ut5.pc(childAt, fPow);
        }
    }

    public static final void LJJIIZI$2(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i, int i2) {
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq = ((SchoolGroupsListAssem) asS33S0100000_6.l0).LLJJI;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Integer.valueOf(iComputeVerticalScrollOffset), Integer.valueOf(i2), Boolean.valueOf(((SchoolGroupsListAssem) asS33S0100000_6.l0).LLJJIJI));
        }
    }

    public static final void LJJIIZI$3(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i, int i2) {
        ((C0HGU) asS33S0100000_6.l0).LIZJ();
    }

    public static final void LJJIIZI$4(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i, int i2) {
        ((C438070HFt) asS33S0100000_6.l0).LLJILJIL += i;
    }

    public static final void LJJIIZI$5(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i, int i2) {
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq = ((SchoolUsersListAssem) asS33S0100000_6.l0).LLJJ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Integer.valueOf(iComputeVerticalScrollOffset), Integer.valueOf(i2), Boolean.valueOf(((SchoolUsersListAssem) asS33S0100000_6.l0).LLJJIII));
        }
    }

    public static final void LJJIIZI$6(AsS33S0100000_6 asS33S0100000_6, RecyclerView recyclerView, int i, int i2) {
        ((C452140HoC) asS33S0100000_6.l0).LIZ();
    }
}
