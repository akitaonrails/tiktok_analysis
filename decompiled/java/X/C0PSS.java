package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel.FeedbackHelper;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0PSS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PSS {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(Fragment fragment, C19EG c19eg) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        String str;
        int i;
        C0PCY<C0PRC> c0pcyPh1;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Context context = fragment.getContext();
        String str2 = null;
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            interfaceC214902198i = null;
            break;
        }
        Fragment parentFragment = fragment;
        while (!(parentFragment instanceof InterfaceC214902198i)) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == 0) {
                interfaceC214902198i = null;
                break;
            }
        }
        interfaceC214902198i = (InterfaceC214902198i) parentFragment;
        sAFHelper.getClass();
        ISearchContextAbility iSearchContextAbilityLJJIZ = SAFHelper.LJJIZ(c19eg, interfaceC214902198i);
        if (iSearchContextAbilityLJJIZ != null && (c0pcyPh1 = iSearchContextAbilityLJJIZ.Ph1()) != null && c0pcyPh1.LIZJ() != null) {
            C650950Pg5.Companion.getClass();
            C646000PVm.LJIIIZ(fragment, c19eg);
        }
        if (c19eg != null) {
            C650950Pg5.Companion.getClass();
            C0PRW c0prwLJIIJJI = C646000PVm.LJIIJJI(fragment, c19eg);
            C650460PfI<C0PST> c650460PfI = new C650460PfI<C0PST>() { // from class: X.0PST
            };
            if (c0prwLJIIJJI != null) {
                str = c0prwLJIIJJI.searchId;
            } else {
                str = null;
            }
            c650460PfI.LJIIZILJ("search_id", str);
            int iIntValue = -1;
            if (c0prwLJIIJJI != null) {
                i = c0prwLJIIJJI.tabIndex;
            } else {
                i = -1;
            }
            c650460PfI.LJIIZILJ("search_type", C644560PPy.LJIILIIL(i));
            if (c0prwLJIIJJI != null) {
                str2 = c0prwLJIIJJI.searchKeyword;
            }
            c650460PfI.LJIIZILJ("search_keyword", str2);
            c650460PfI.LJIJJ(C644560PPy.LJIIIIZZ(fragment, c19eg));
            c650460PfI.LJ("button_type", "close");
            FeedbackHelper.LIZ.getClass();
            Integer num = FeedbackHelper.LIZIZ;
            if (num != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue != 0 && iIntValue != 1) {
                if (iIntValue == 2) {
                    c650460PfI.LIZLLL(0, "is_from_survey_card");
                    c650460PfI.LIZLLL(1, "is_from_feedback_card");
                }
            } else {
                c650460PfI.LIZLLL(iIntValue, "is_from_survey_card");
                c650460PfI.LIZLLL(0, "is_from_feedback_card");
            }
            c650460PfI.LJIILJJIL();
        }
    }
}
