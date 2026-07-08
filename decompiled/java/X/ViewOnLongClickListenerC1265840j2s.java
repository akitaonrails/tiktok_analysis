package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListCell;
import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewOnLongClickListenerC1265840j2s implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1265840j2s viewOnLongClickListenerC1265840j2s, View view) {
        ViewGroup viewGroup;
        C737190Svt c737190Svt = C737190Svt.LIZ;
        Aweme aweme = ((C050A) viewOnLongClickListenerC1265840j2s.l0).LL;
        c737190Svt.getClass();
        boolean zLIZJ = C737190Svt.LIZJ(aweme);
        if (zLIZJ) {
            View viewFindViewById = ((RepostListCell) viewOnLongClickListenerC1265840j2s.l1).itemView.findViewById(R.id.eqx);
            if (viewFindViewById instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewFindViewById;
            } else {
                viewGroup = null;
            }
            RepostListViewModel repostListViewModelP5 = ((RepostListCell) viewOnLongClickListenerC1265840j2s.l1).P5();
            Aweme aweme2 = ((C050A) viewOnLongClickListenerC1265840j2s.l0).LL;
            repostListViewModelP5.getClass();
            repostListViewModelP5.setState(new AwS385S0200000_19(viewGroup, aweme2, 108));
        }
        return zLIZJ;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1265840j2s viewOnLongClickListenerC1265840j2s, View view) {
        Fragment fragmentLIZ;
        Lifecycle lifecycle;
        String strLJJJLIIL;
        AbsRecUserCell absRecUserCell = (AbsRecUserCell) viewOnLongClickListenerC1265840j2s.l0;
        InterfaceC494301wD interfaceC494301wD = null;
        try {
            if (!Intrinsics.LJFF(absRecUserCell.itemView.getTag(R.id.usercard_unbind_tag), Boolean.TRUE)) {
                LifecycleOwner lifecycleOwner = absRecUserCell.getLifecycleOwner();
                if ((((lifecycleOwner instanceof Fragment) && (fragmentLIZ = (Fragment) lifecycleOwner) != null) || (fragmentLIZ = C946803n0.LIZ(absRecUserCell.itemView)) != null) && (fragmentLIZ.isDetached() || !fragmentLIZ.isAdded())) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZIZ("Ability", "attach fragment illegal!", null);
                } else {
                    LifecycleOwner lifecycleOwner2 = absRecUserCell.getLifecycleOwner();
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                            C1264320j0Q.LIZ.getClass();
                            C1264320j0Q.LIZIZ("Ability", "get ability illegal!", null);
                        } else {
                            InterfaceC1263010iyJ interfaceC1263010iyJI5 = absRecUserCell.I5();
                            if (interfaceC1263010iyJI5 != null) {
                                strLJJJLIIL = interfaceC1263010iyJI5.LJJJLIIL();
                            } else {
                                strLJJJLIIL = null;
                            }
                            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJ(absRecUserCell.itemView, null), IUserCardListAbility.class, strLJJJLIIL);
                            if (interfaceC494301wDLIZ == null) {
                                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLJJJLIIL);
                                sbLIZ.append("'s ");
                                sbLIZ.append(C13LE.LIZ(IUserCardListAbility.class).LJI());
                                sbLIZ.append(" not found, parent: ");
                                sbLIZ.append(absRecUserCell.itemView.getParent());
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c1264320j0Q.getClass();
                                C1264320j0Q.LIZIZ("Ability", strLIZIZ, null);
                            }
                            interfaceC494301wD = interfaceC494301wDLIZ;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1264320j0Q.LIZ.getClass();
            C1264320j0Q.LIZIZ("Ability", "get ability error!", th);
        }
        IUserCardListAbility iUserCardListAbility = (IUserCardListAbility) interfaceC494301wD;
        if (iUserCardListAbility != null) {
            iUserCardListAbility.v52(new AwS385S0200000_19((C1261860iwS) viewOnLongClickListenerC1265840j2s.l1, (C1261860iwS) viewOnLongClickListenerC1265840j2s.l0, (AbsRecUserCell<C1261650iw7>) 128));
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1265840j2s viewOnLongClickListenerC1265840j2s, View view) {
        C1259780it6 c1259780it6 = (C1259780it6) viewOnLongClickListenerC1265840j2s.l0;
        InterfaceC1260110itd interfaceC1260110itd = (InterfaceC1260110itd) viewOnLongClickListenerC1265840j2s.l1;
        Aweme aweme = c1259780it6.LL;
        if (aweme != null && interfaceC1260110itd != null) {
            interfaceC1260110itd.Xt(view, aweme, c1259780it6.LLIZLLLIL, c1259780it6.LLJZ);
        }
        return c1259780it6.i6().booleanValue();
    }

    public ViewOnLongClickListenerC1265840j2s(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
