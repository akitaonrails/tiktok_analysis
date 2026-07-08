package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment;
import com.zhiliaoapp.musically.R;
import irm.AkS76S0100000_4;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Dha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C346120Dha extends C09AY implements InterfaceC1685430txd<C03H5, AbstractC1623806Xk<? extends C626160OhC>, List<? extends InterfaceC339430DSj>, Pair<? extends Integer, ? extends Integer>, Boolean, Boolean, Unit> {
    public final /* synthetic */ SchoolUsersListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346120Dha(SchoolUsersListFragment schoolUsersListFragment) {
        super(6);
        this.LL = schoolUsersListFragment;
    }

    @Override // X.InterfaceC1685430txd
    public /* bridge */ /* synthetic */ Unit invoke(C03H5 c03h5, AbstractC1623806Xk<? extends C626160OhC> abstractC1623806Xk, List<? extends InterfaceC339430DSj> list, Pair<? extends Integer, ? extends Integer> pair, Boolean bool, Boolean bool2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        AbstractC1623806Xk<? extends C626160OhC> abstractC1623806Xk2 = abstractC1623806Xk;
        List<? extends InterfaceC339430DSj> list2 = list;
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        if (((abstractC1623806Xk2 instanceof C1623606Xi) || (abstractC1623806Xk2 instanceof C491001vg)) && (list2 == null || list2.isEmpty())) {
            LinearLayout linearLayout = this.LL.LLILZLL;
            if (linearLayout != null) {
                C786410Ut5.LJLLLLLL(0, linearLayout);
            }
            if (abstractC1623806Xk2 instanceof C491001vg) {
                if (((C491001vg) abstractC1623806Xk2).LIZ instanceof C094W) {
                    SchoolUsersListFragment schoolUsersListFragment = this.LL;
                    ImageView imageView = schoolUsersListFragment.LLIZ;
                    if (imageView != null) {
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                            marginLayoutParams4.topMargin = schoolUsersListFragment.SR();
                        }
                        C0HTI c0hti = new C0HTI();
                        c0hti.LIZ = R.drawable.nl;
                        imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
                    }
                    C197039127h c197039127h = schoolUsersListFragment.LLJI;
                    if (c197039127h != null) {
                        C786410Ut5.LJLLLLLL(0, c197039127h);
                        c197039127h.setText(2131846928);
                        c197039127h.setClickable(true);
                        C786410Ut5.I7(new AkS76S0100000_4(schoolUsersListFragment, 9), c197039127h);
                    }
                    TuxTextView tuxTextView = schoolUsersListFragment.LLIZLLLIL;
                    if (tuxTextView != null) {
                        tuxTextView.setText(2131846852);
                    }
                    TuxTextView tuxTextView2 = schoolUsersListFragment.LLJ;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(2131828601);
                    }
                } else {
                    SchoolUsersListFragment schoolUsersListFragment2 = this.LL;
                    ImageView imageView2 = schoolUsersListFragment2.LLIZ;
                    if (imageView2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            marginLayoutParams3.topMargin = schoolUsersListFragment2.SR();
                        }
                        C0HTI c0hti2 = new C0HTI();
                        c0hti2.LIZ = R.drawable.n_;
                        imageView2.setImageDrawable(c0hti2.LIZ(imageView2.getContext()));
                    }
                    C197039127h c197039127h2 = schoolUsersListFragment2.LLJI;
                    if (c197039127h2 != null) {
                        C786410Ut5.LJLLLLLL(0, c197039127h2);
                        c197039127h2.setText(2131846928);
                        c197039127h2.setClickable(true);
                        C786410Ut5.I7(new AkS76S0100000_4(schoolUsersListFragment2, 7), c197039127h2);
                    }
                    TuxTextView tuxTextView3 = schoolUsersListFragment2.LLIZLLLIL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(2131846930);
                    }
                    TuxTextView tuxTextView4 = schoolUsersListFragment2.LLJ;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(2131846929);
                    }
                }
            } else if (pair2 == null && !zBooleanValue && !zBooleanValue2) {
                SchoolUsersListFragment schoolUsersListFragment3 = this.LL;
                ImageView imageView3 = schoolUsersListFragment3.LLIZ;
                if (imageView3 != null) {
                    ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        marginLayoutParams2.topMargin = ((Number) schoolUsersListFragment3.LLJJIJI.getValue()).intValue();
                    }
                    C0HTI c0hti3 = new C0HTI();
                    c0hti3.LIZ = R.drawable.n3;
                    imageView3.setImageDrawable(c0hti3.LIZ(imageView3.getContext()));
                }
                C197039127h c197039127h3 = schoolUsersListFragment3.LLJI;
                if (c197039127h3 != null) {
                    C786410Ut5.LJLLLLLL(8, c197039127h3);
                }
                TuxTextView tuxTextView5 = schoolUsersListFragment3.LLIZLLLIL;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(2131846940);
                }
                TuxTextView tuxTextView6 = schoolUsersListFragment3.LLJ;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(2131846939);
                }
            } else {
                SchoolUsersListFragment schoolUsersListFragment4 = this.LL;
                ImageView imageView4 = schoolUsersListFragment4.LLIZ;
                if (imageView4 != null) {
                    ViewGroup.LayoutParams layoutParams4 = imageView4.getLayoutParams();
                    if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                        marginLayoutParams.topMargin = schoolUsersListFragment4.SR();
                    }
                    C0HTI c0hti4 = new C0HTI();
                    c0hti4.LIZ = R.drawable.n_;
                    imageView4.setImageDrawable(c0hti4.LIZ(imageView4.getContext()));
                }
                C197039127h c197039127h4 = schoolUsersListFragment4.LLJI;
                if (c197039127h4 != null) {
                    C786410Ut5.LJLLLLLL(0, c197039127h4);
                    c197039127h4.setText(2131846943);
                    c197039127h4.setClickable(true);
                    C786410Ut5.I7(new AkS76S0100000_4(schoolUsersListFragment4, 8), c197039127h4);
                }
                TuxTextView tuxTextView7 = schoolUsersListFragment4.LLIZLLLIL;
                if (tuxTextView7 != null) {
                    tuxTextView7.setText(2131846945);
                }
                TuxTextView tuxTextView8 = schoolUsersListFragment4.LLJ;
                if (tuxTextView8 != null) {
                    tuxTextView8.setText(2131846944);
                }
            }
            this.LL.getClass();
            SchoolUsersListFragment.bS(abstractC1623806Xk2, list2, pair2, zBooleanValue);
        } else {
            LinearLayout linearLayout2 = this.LL.LLILZLL;
            if (linearLayout2 != null) {
                C786410Ut5.LJLLLLLL(8, linearLayout2);
            }
        }
        return Unit.LIZ;
    }
}
