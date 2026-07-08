package Y;

import X.AbstractC1585810rMx;
import X.AbstractC331470Cz3;
import X.C0DJ1;
import X.C0DLI;
import X.C0DW8;
import X.C0I7D;
import X.C0PEM;
import X.C1749260vca;
import X.C19EG;
import X.C2252321DDq;
import X.C23250099c;
import X.C319520Cfm;
import X.C319530Cfn;
import X.C331520Cz8;
import X.C724240Sb0;
import X.C786410Ut5;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.aiuikit.impl.imagepreview.ImagePreviewFragment;
import com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentContentAssem;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.ReviewBottomSheetFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.ReviewListViewModel;
import com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtInteractionVM;
import com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtLikePanelFragment;
import com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SearchSchoolMembersAssem;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public class AsS31S0100000_4 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
            case 3:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$4(this, recyclerView, i);
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
            case 4:
            case 5:
            case 6:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS31S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS31S0100000_4 asS31S0100000_4, RecyclerView recyclerView, int i) {
        if (((C0DW8) asS31S0100000_4.l0).getScrollState() == 0) {
            View viewFindViewByPosition = ((C0DW8) asS31S0100000_4.l0).getLayoutManager().findViewByPosition(((LinearLayoutManager) ((C0DW8) asS31S0100000_4.l0).getLayoutManager()).findFirstVisibleItemPosition());
            if (viewFindViewByPosition != null) {
                float y = viewFindViewByPosition.getY();
                if (y == 0.0f) {
                    return;
                }
                if (Math.abs(y) < ((C0DW8) asS31S0100000_4.l0).getMItemHeight() / 2) {
                    C0DW8 c0dw8 = (C0DW8) asS31S0100000_4.l0;
                    c0dw8.getClass();
                    c0dw8.smoothScrollBy(0, C0DW8.LIZJ(y));
                } else {
                    ((C0DW8) asS31S0100000_4.l0).smoothScrollBy(0, C0DW8.LIZJ(r1.getMItemHeight() + y));
                }
            }
        }
    }

    public static final void LJJIIJ$1(AsS31S0100000_4 asS31S0100000_4, RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager;
        View viewLJFF;
        if (i != 0 || (layoutManager = recyclerView.getLayoutManager()) == null || (viewLJFF = ((ImagePreviewFragment) asS31S0100000_4.l0).LLJJ.LJFF(layoutManager)) == null) {
            return;
        }
        ((ImagePreviewFragment) asS31S0100000_4.l0).onPageSelected(layoutManager.getPosition(viewLJFF));
    }

    public static final void LJJIIJ$2(AsS31S0100000_4 asS31S0100000_4, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((SelectSchoolPageAssem) asS31S0100000_4.l0).LJLZ();
        }
    }

    public static final void LJJIIJ$3(AsS31S0100000_4 asS31S0100000_4, RecyclerView recyclerView, int i) {
        C1749260vca c1749260vca;
        C0I7D editTextView;
        InputMethodManager inputMethodManager;
        if ((i != 1 && i != 2) || (c1749260vca = ((SearchSchoolMembersAssem) asS31S0100000_4.l0).LLJJIJIL) == null || (editTextView = c1749260vca.getEditTextView()) == null) {
            return;
        }
        editTextView.clearFocus();
        Object objH2 = C786410Ut5.H2(editTextView.getContext(), "input_method");
        if (!(objH2 instanceof InputMethodManager) || (inputMethodManager = (InputMethodManager) objH2) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(editTextView.getWindowToken(), 0);
    }

    public static final void LJJIIJ$4(AsS31S0100000_4 asS31S0100000_4, RecyclerView recyclerView, int i) {
        AddYoursInviteFriendsAssem addYoursInviteFriendsAssem = (AddYoursInviteFriendsAssem) asS31S0100000_4.l0;
        C0I7D editTextView = addYoursInviteFriendsAssem.Jo().getEditTextView();
        editTextView.clearFocus();
        C19EG c19egLIZ = C724240Sb0.LIZ(addYoursInviteFriendsAssem);
        if (c19egLIZ != null) {
            C0DLI.LIZ(c19egLIZ, editTextView);
        }
    }

    public static final void LJJIIZI$0(AsS31S0100000_4 asS31S0100000_4, RecyclerView recyclerView, int i, int i2) {
        int i3;
        C0DW8 c0dw8 = (C0DW8) asS31S0100000_4.l0;
        int i4 = c0dw8.LLILLJJLI / 2;
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) c0dw8.getLayoutManager()).findFirstVisibleItemPosition();
        if (c0dw8.getChildAt(0) != null) {
            if (Math.abs(c0dw8.getChildAt(0).getY()) <= c0dw8.LL / 2) {
                i3 = iFindFirstVisibleItemPosition + i4;
            } else {
                i3 = iFindFirstVisibleItemPosition + i4 + 1;
            }
            if (i3 != c0dw8.LLILZ) {
                c0dw8.LLILZ = i3;
                int i5 = i4 + i3 + 1;
                for (int i6 = (i3 - i4) - 1; i6 < i5; i6++) {
                    View childAt = c0dw8.getChildAt(i6 - iFindFirstVisibleItemPosition);
                    if (childAt != null) {
                        TextView textView = (TextView) childAt.findViewById(R.id.zt2);
                        TextView textView2 = (TextView) childAt.findViewById(R.id.zt3);
                        if (i3 == i6) {
                            textView.setTextColor(-16777216);
                            textView2.setTextColor(-16777216);
                            C786410Ut5.T4(childAt, 1.0f);
                            C786410Ut5.LJLLLLLL(0, childAt.findViewById(R.id.ybc));
                            C786410Ut5.LJLLLLLL(0, childAt.findViewById(R.id.cel));
                        } else {
                            textView.setTextColor(-7829368);
                            textView2.setTextColor(-7829368);
                            C786410Ut5.T4(childAt, (float) Math.pow(0.699999988079071d, Math.abs(i6 - i3)));
                            C786410Ut5.LJLLLLLL(8, childAt.findViewById(R.id.ybc));
                            C786410Ut5.LJLLLLLL(8, childAt.findViewById(R.id.cel));
                        }
                    }
                }
            }
        }
    }

    public static final void LJJIIZI$1(AsS31S0100000_4 asS31S0100000_4, RecyclerView recyclerView, int i, int i2) {
        View view;
        if (i2 > 0 && !((CommerceAgentContentAssem) asS31S0100000_4.l0).LLJZ && i2 > C0DJ1.LIZ(10) && (view = ((CommerceAgentContentAssem) asS31S0100000_4.l0).LLJJJIL) != null && view.getVisibility() == 8) {
            View view2 = ((CommerceAgentContentAssem) asS31S0100000_4.l0).LLJJJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            ((CommerceAgentContentAssem) asS31S0100000_4.l0).LLJZ = true;
        }
    }

    public static final void LJJIIZI$2(AsS31S0100000_4 asS31S0100000_4, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        Object value;
        if (i2 <= 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            if (linearLayoutManager.getItemCount() - linearLayoutManager.findLastVisibleItemPosition() <= 5) {
                SocialThoughtInteractionVM socialThoughtInteractionVM = (SocialThoughtInteractionVM) ((SocialThoughtLikePanelFragment) asS31S0100000_4.l0).LLIZ.getValue();
                C319530Cfn c319530Cfn = (C319530Cfn) socialThoughtInteractionVM.LL.getValue();
                String str = c319530Cfn.LIZ;
                if (str != null && !c319530Cfn.LJ && c319530Cfn.LIZLLL) {
                    C2252321DDq c2252321DDq = socialThoughtInteractionVM.LL;
                    do {
                        value = c2252321DDq.getValue();
                    } while (!c2252321DDq.compareAndSet(value, C319530Cfn.LIZ((C319530Cfn) value, null, null, false, true, null, 47)));
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(socialThoughtInteractionVM), C0PEM.LIZJ, null, new C319520Cfm(str, c319530Cfn.LIZJ, socialThoughtInteractionVM, null), 2);
                }
            }
        }
    }

    public static final void LJJIIZI$3(AsS31S0100000_4 asS31S0100000_4, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        if (i2 > 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                if (linearLayoutManager.getChildCount() + linearLayoutManager.findFirstVisibleItemPosition() >= linearLayoutManager.getItemCount() - 5) {
                    ReviewListViewModel reviewListViewModel = (ReviewListViewModel) ((ReviewBottomSheetFragment) asS31S0100000_4.l0).LLILLJJLI.getValue();
                    AbstractC331470Cz3 abstractC331470Cz3 = (AbstractC331470Cz3) reviewListViewModel.LLILLJJLI.getValue();
                    if (abstractC331470Cz3 instanceof C331520Cz8) {
                        C331520Cz8 c331520Cz8 = (C331520Cz8) abstractC331470Cz3;
                        if (c331520Cz8.LIZIZ && !c331520Cz8.LIZJ) {
                            C2252321DDq c2252321DDq = reviewListViewModel.LLILLJJLI;
                            while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C331520Cz8(c331520Cz8.LIZ, c331520Cz8.LIZIZ, true))) {
                            }
                            reviewListViewModel.vQ2();
                        }
                    }
                }
            }
        }
    }
}
