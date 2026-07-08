package Y;

import X.AbstractC336200DFy;
import X.C1246150iX7;
import X.C1389890mGx;
import X.C1834580xqC;
import X.C197039127h;
import X.C259800zU;
import X.C332800D2w;
import X.C332830D2z;
import X.C344080DeI;
import X.C344090DeJ;
import X.EnumC344070DeH;
import X.EnumC346100DhY;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS370S0200000_4;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes5.dex */
public class ACListenerS22S0500000_4 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS22S0500000_4 aCListenerS22S0500000_4, View view) {
        ((AbstractC336200DFy) aCListenerS22S0500000_4.l0).LJ(((C332830D2z) aCListenerS22S0500000_4.l1).type, ((C332800D2w) aCListenerS22S0500000_4.l2).value);
        int width = ((View) ((C259800zU) aCListenerS22S0500000_4.l3).element).getWidth();
        if (width > 0) {
            ((HorizontalScrollView) ((C259800zU) aCListenerS22S0500000_4.l3).element).smoothScrollTo((((TextView) aCListenerS22S0500000_4.l4).getLeft() - (width / 2)) + (((TextView) aCListenerS22S0500000_4.l4).getWidth() / 2), 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS22S0500000_4 aCListenerS22S0500000_4, View view) {
        int iIntValue;
        int iIntValue2;
        T t = ((C259800zU) aCListenerS22S0500000_4.l0).element;
        if (t == 0 && ((C259800zU) aCListenerS22S0500000_4.l1).element == 0) {
            C1389890mGx c1389890mGx = new C1389890mGx((C197039127h) aCListenerS22S0500000_4.l2);
            c1389890mGx.LJIIJ("Error with saving filter");
            c1389890mGx.LJIIJJI();
            return;
        }
        Integer num = (Integer) t;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            C1246150iX7.LIZ.getClass();
            iIntValue = C1246150iX7.LIZ().graduationYearMin;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((C259800zU) aCListenerS22S0500000_4.l1).element;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            C1246150iX7.LIZ.getClass();
            iIntValue2 = C1246150iX7.LIZ().graduationYearMax;
        }
        Pair<Integer, Integer> pair = new Pair<>(numValueOf, Integer.valueOf(iIntValue2));
        ContainerAbility containerAbilityRR = ((SchoolUsersListFragment) aCListenerS22S0500000_4.l3).RR();
        if (containerAbilityRR != null) {
            containerAbilityRR.BS1(EnumC346100DhY.CLICK_GRADUATION_YEAR, pair, false, null);
        }
        SchoolUsersListViewModel schoolUsersListViewModelAS = ((SchoolUsersListFragment) aCListenerS22S0500000_4.l3).aS();
        schoolUsersListViewModelAS.withState(new AwS370S0200000_4((Pair) pair, (Pair<Integer, Integer>) schoolUsersListViewModelAS, (SchoolUsersListViewModel) 86));
        ((TuxSheet) aCListenerS22S0500000_4.l4).dismiss();
    }

    public static final void onClick$2(ACListenerS22S0500000_4 aCListenerS22S0500000_4, View view) {
        Long fragmentId;
        long j;
        if (((C344090DeJ) aCListenerS22S0500000_4.l0).getStatus() != EnumC344070DeH.LOADING && (fragmentId = ((C344090DeJ) aCListenerS22S0500000_4.l0).getFragmentId()) != null) {
            C344090DeJ c344090DeJ = (C344090DeJ) aCListenerS22S0500000_4.l0;
            Map map = (Map) aCListenerS22S0500000_4.l1;
            MusicSong musicSong = (MusicSong) aCListenerS22S0500000_4.l2;
            LiveHighlightViewModel liveHighlightViewModel = (LiveHighlightViewModel) aCListenerS22S0500000_4.l3;
            C1834580xqC c1834580xqC = (C1834580xqC) aCListenerS22S0500000_4.l4;
            fragmentId.longValue();
            if (c344090DeJ.getStatus() != EnumC344070DeH.SELECTED) {
                C344080DeI c344080DeI = C344080DeI.LIZ;
                String strValueOf = String.valueOf(musicSong.id);
                c344080DeI.getClass();
                C344080DeI.LIZ("music", strValueOf, "use", map);
                j = musicSong.id;
            } else {
                C344080DeI c344080DeI2 = C344080DeI.LIZ;
                String strValueOf2 = String.valueOf(musicSong.id);
                c344080DeI2.getClass();
                C344080DeI.LIZ("music", strValueOf2, "cancel", map);
                j = -1;
            }
            liveHighlightViewModel.CQ2(c1834580xqC, j, c344090DeJ.getContext(), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS22S0500000_4(Object obj, C344090DeJ c344090DeJ, Map<String, String> map, MusicSong musicSong, LiveHighlightViewModel liveHighlightViewModel, C1834580xqC c1834580xqC) {
        this.$t = c1834580xqC;
        this.l0 = obj;
        this.l1 = c344090DeJ;
        this.l2 = map;
        this.l3 = musicSong;
        this.l4 = liveHighlightViewModel;
    }
}
