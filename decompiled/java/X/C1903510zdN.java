package X;

import Y.ACListenerS162S0100000_28;
import Y.ARunnableS114S0100000_14;
import Y.ATListenerS460S0100000_28;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.api.helper.IInboxLongPressMenuPopoverHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS149S0201000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1903510zdN extends AbstractC1903430zdF<InboxEntrancePod> implements C0Z37<InboxEntrancePod>, C0Z9B, InterfaceC1508640pMU {
    public static final /* synthetic */ int LLLF = 0;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public AnimatorSet LLJJL;
    public AnimatorSet LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public long LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public long LLJLLL;
    public RunnableC1903500zdM LLJZ;
    public final C01GW LLJZIJLIL;
    public final ATListenerS460S0100000_28 LLL;

    static {
        new Object() { // from class: X.0zdZ
        };
    }

    @Override // X.C0Z9B
    public final void C1(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
    }

    @Override // X.C0Z9B
    public final List<Animator> D5(boolean z) {
        return null;
    }

    @Override // X.C0Z9B
    public final void LJLL(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
    }

    @Override // X.C0Z9B
    public final void LLLLZI(float f) {
    }

    @Override // X.InterfaceC1508640pMU
    public String T() {
        return "EntranceNormalVH";
    }

    @Override // X.C0Z9B
    public final C0HZQ b() {
        return null;
    }

    public void e6() {
    }

    @Override // X.C0Z9B
    public final List<View> LLLLJI() {
        return (List) this.LLJJJJJIL.getValue();
    }

    @Override // X.C0Z9B
    public final List<View> M() {
        return (List) this.LLJJJJLIIL.getValue();
    }

    public final TuxTextView V5() {
        return (TuxTextView) this.LLJILLL.getValue();
    }

    public final SmartAvatarImageView W5() {
        return (SmartAvatarImageView) this.LLJI.getValue();
    }

    public final View X5() {
        return (View) this.LLJ.getValue();
    }

    public final TuxTextView a6() {
        return (TuxTextView) this.LLJJI.getValue();
    }

    public final TuxTextView b6() {
        return (TuxTextView) this.LLJIJIL.getValue();
    }

    public final boolean c6() {
        T t = this.LLILLL;
        return t != 0 && ((InboxEntrancePod) t).entranceCell.isTako();
    }

    @Override // X.C0Z9B
    public final C0Z9D g3() {
        return (C0Z9D) this.LLJJJJ.getValue();
    }

    @Override // X.AbstractC1903430zdF, X.C0Z32
    public final void onAttach() {
        super.onAttach();
        if (((InboxEntrancePod) this.LLILLL).entranceCell.isActivity() && !this.LLILLL.isDefaultPod) {
            C1904490zex.LJFF.LJIIJ("activity", EnumC1889770zHD.SUCCESS);
        }
        if (C890320YwI.LIZIZ.LIZJ(true) || !((InboxEntrancePod) this.LLILLL).entranceCell.isFollower() || this.LLILLL.isDefaultPod) {
            return;
        }
        C1904490zex.LJFF.LJIIJ("follower", EnumC1889770zHD.SUCCESS);
    }

    @Override // X.AbstractC1903430zdF
    public final void reportShowEvent() {
        MultiViewModel multiViewModelN5 = N5();
        if (multiViewModelN5 != null) {
            InboxEntrancePod inboxEntrancePod = (InboxEntrancePod) this.LLILLL;
            int layoutPosition = getLayoutPosition() - 1;
            if (inboxEntrancePod.entranceCell.isActivity() || inboxEntrancePod.entranceCell.isFollower()) {
                MultiViewModel.RQ2("show", inboxEntrancePod);
            }
            multiViewModelN5.SQ2("show", "show", inboxEntrancePod, Integer.valueOf(layoutPosition));
        }
    }

    @Override // X.C0Z9B
    public final AnimatorSet l0() {
        return this.LLJJL;
    }

    @Override // X.C0Z9B
    public final AnimatorSet v3() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C1903510zdN(final View view) {
        super(view);
        this.LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 938));
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 934));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 924));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 940));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 928));
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 929));
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 935));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 939));
        this.LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(view, 927));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 933));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 936));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 931));
        this.LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 925));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 937));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 930));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 926));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 932));
        this.LLJL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(681));
        this.LLJLIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(680));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(682));
        this.LLL = new ATListenerS460S0100000_28(this, 5);
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 161), X5());
        X5().setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0zcd
            /* JADX WARN: Type inference failed for: r0v32, types: [X.0zcb] */
            /* JADX WARN: Type inference failed for: r0v36, types: [X.0zce] */
            /* JADX WARN: Type inference failed for: r1v11, types: [X.0zca] */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C19EG c19eg;
                Object c1903160zco;
                if (((InboxEntrancePod) this.LL.LLILLL).LLILLL) {
                    return true;
                }
                InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), InboxAbilityCenter$IInboxFragmentAbility.class, null);
                if (inboxAbilityCenter$IInboxFragmentAbility != null && inboxAbilityCenter$IInboxFragmentAbility.aA2()) {
                    return false;
                }
                C1903510zdN c1903510zdN = this.LL;
                Long lValueOf = Long.valueOf(c1903510zdN.LLJLLL);
                long jLongValue = 0;
                if (lValueOf.longValue() > 0) {
                    jLongValue = lValueOf.longValue();
                }
                c1903510zdN.f6(jLongValue, "long_press");
                final MultiViewModel multiViewModelN5 = this.LL.N5();
                if (multiViewModelN5 == null) {
                    return true;
                }
                final View view3 = view;
                C1903510zdN c1903510zdN2 = this.LL;
                C1902740zc8 c1902740zc8 = C1902740zc8.LIZ;
                Fragment fragmentLIZ = C946803n0.LIZ(view3);
                c1903510zdN2.getLayoutPosition();
                InboxEntrancePod inboxEntrancePod = (InboxEntrancePod) c1903510zdN2.LLILLL;
                c1902740zc8.getClass();
                boolean zLIZIZ = C866950Xzh.LIZIZ(inboxEntrancePod.entranceCell.functionList);
                InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
                if (inboxEntranceCell.canHide || inboxEntranceCell.canPin || zLIZIZ) {
                    C20684815ws.LJFF().execute(new ARunnableS114S0100000_14(inboxEntrancePod, 52));
                    ArrayList arrayList = new ArrayList();
                    List<InboxEntranceFunction> list = inboxEntrancePod.entranceCell.functionList;
                    if (list != null) {
                        for (InboxEntranceFunction inboxEntranceFunction : list) {
                            int i = inboxEntranceFunction.functionType;
                            if (i == C0ORP.MUTE.getType()) {
                                C1902740zc8.LIZ.getClass();
                                c1903160zco = new AbstractC1903250zcx(inboxEntrancePod, new InterfaceC1903260zcy() { // from class: X.0zcb
                                    @Override // X.InterfaceC1903260zcy
                                    public final void LIZ() {
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final InterfaceC1903320zd4 LIZJ() {
                                        C1902740zc8 c1902740zc82 = C1902740zc8.LIZ;
                                        final MultiViewModel multiViewModel = multiViewModelN5;
                                        c1902740zc82.getClass();
                                        return new InterfaceC1903320zd4() { // from class: X.0zci
                                            @Override // X.InterfaceC1903320zd4
                                            public final void LIZIZ() {
                                            }

                                            @Override // X.InterfaceC1903320zd4
                                            public final void LIZ(InboxEntrancePod inboxEntrancePod2) {
                                                String str;
                                                MultiViewModel multiViewModel2 = multiViewModel;
                                                if (inboxEntrancePod2.isMute()) {
                                                    str = "unmute";
                                                } else {
                                                    str = "mute";
                                                }
                                                multiViewModel2.SQ2("click", str, inboxEntrancePod2, null);
                                            }
                                        };
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final void LJ(int i2) {
                                        C1902740zc8 c1902740zc82 = C1902740zc8.LIZ;
                                        View view4 = view3;
                                        c1902740zc82.getClass();
                                        C1902740zc8.LIZ(i2, view4);
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final void LIZLLL(int i2, InboxEntrancePod inboxEntrancePod2) {
                                        int i3;
                                        if (i2 == 5) {
                                            i3 = 1;
                                        } else {
                                            i3 = 0;
                                        }
                                        MultiViewModel multiViewModel = multiViewModelN5;
                                        C1902740zc8.LIZ.getClass();
                                        InboxEntranceCell inboxEntranceCellLIZLLL = C1902740zc8.LIZLLL(i3, inboxEntrancePod2);
                                        CopyOnWriteArrayList<InboxEntrancePod> copyOnWriteArrayList = multiViewModel.LLJL;
                                        InboxEntranceCell inboxEntranceCell2 = inboxEntrancePod2.entranceCell;
                                        InboxEntrancePod inboxEntrancePodBQ2 = multiViewModel.BQ2(inboxEntranceCell2.cellId, inboxEntranceCell2.entranceKey);
                                        if (inboxEntrancePodBQ2 != null) {
                                            copyOnWriteArrayList.remove(inboxEntrancePodBQ2);
                                        }
                                        multiViewModel.OQ2(inboxEntrancePod2.entranceCell, inboxEntranceCellLIZLLL, true);
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final void LIZIZ(InboxEntranceCell inboxEntranceCell2, int i2, Function0<Unit> function0, Function0<Unit> function02) {
                                        C1902740zc8.LIZ.getClass();
                                        C1902740zc8.LIZIZ(inboxEntranceCell2, i2, function0, function02);
                                    }
                                }, inboxEntranceFunction) { // from class: X.0zcn
                                    public final int LIZJ;
                                    public final int LIZLLL;
                                    public final int LJ;

                                    @Override // X.AbstractC1903250zcx
                                    public final void LIZJ() {
                                        this.LIZIZ.LIZIZ(this.LIZ.entranceCell, this.LIZJ, new AwS572S0100000_28(this, 906), new AwS572S0100000_28(this, 907));
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final void LIZ() {
                                        super.LIZ();
                                        this.LIZIZ.LJ(this.LIZJ);
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final void LIZIZ() {
                                        super.LIZIZ();
                                        this.LIZIZ.LIZLLL(this.LIZJ, this.LIZ);
                                        C1904220zeW c1904220zeW = C1904220zeW.LL;
                                        InboxEntranceCell inboxEntranceCell2 = this.LIZ.entranceCell;
                                        int i2 = inboxEntranceCell2.group;
                                        int i3 = this.LIZJ == 5 ? 1 : 0;
                                        int i4 = inboxEntranceCell2.filterType;
                                        c1904220zeW.getClass();
                                        C1904220zeW.LJJIIJ(i2, i3, i4);
                                        InboxEntranceCell inboxEntranceCell3 = this.LIZ.entranceCell;
                                        C1904220zeW.LJJIII(new EntranceKey(inboxEntranceCell3.cellId, inboxEntranceCell3.entranceKey), this.LIZJ != 5 ? 0 : 1);
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final int LIZLLL() {
                                        return this.LJ;
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final int LJ() {
                                        return this.LIZLLL;
                                    }

                                    {
                                        int i2;
                                        int i3;
                                        int i4;
                                        boolean z = true;
                                        if (inboxEntranceFunction.actionStatus == 1) {
                                            i2 = 6;
                                        } else {
                                            z = false;
                                            i2 = 5;
                                        }
                                        this.LIZJ = i2;
                                        if (z) {
                                            i3 = 2131831580;
                                        } else {
                                            i3 = 2131831578;
                                        }
                                        this.LIZLLL = i3;
                                        if (z) {
                                            i4 = R.raw.icon_bell;
                                        } else {
                                            i4 = R.raw.icon_bell_slash;
                                        }
                                        this.LJ = i4;
                                    }
                                };
                            } else if (i == C0ORP.PIN.getType()) {
                                C1902740zc8.LIZ.getClass();
                                c1903160zco = new AbstractC1903250zcx(inboxEntrancePod, new InterfaceC1903260zcy() { // from class: X.0zce
                                    @Override // X.InterfaceC1903260zcy
                                    public final void LIZ() {
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final InterfaceC1903320zd4 LIZJ() {
                                        C1902740zc8 c1902740zc82 = C1902740zc8.LIZ;
                                        final MultiViewModel multiViewModel = multiViewModelN5;
                                        c1902740zc82.getClass();
                                        return new InterfaceC1903320zd4() { // from class: X.0zcf
                                            @Override // X.InterfaceC1903320zd4
                                            public final void LIZIZ() {
                                            }

                                            @Override // X.InterfaceC1903320zd4
                                            public final void LIZ(InboxEntrancePod inboxEntrancePod2) {
                                                boolean zBooleanValue;
                                                String str;
                                                Boolean pinStatus = inboxEntrancePod2.entranceCell.getPinStatus();
                                                if (pinStatus != null) {
                                                    zBooleanValue = pinStatus.booleanValue();
                                                } else {
                                                    zBooleanValue = false;
                                                }
                                                MultiViewModel multiViewModel2 = multiViewModel;
                                                if (zBooleanValue) {
                                                    str = "unpin";
                                                } else {
                                                    str = "pin";
                                                }
                                                multiViewModel2.SQ2("click", str, inboxEntrancePod2, null);
                                            }
                                        };
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final void LJ(int i2) {
                                        C1902740zc8 c1902740zc82 = C1902740zc8.LIZ;
                                        View view4 = view3;
                                        c1902740zc82.getClass();
                                        C1902740zc8.LIZ(i2, view4);
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final void LIZLLL(int i2, InboxEntrancePod inboxEntrancePod2) {
                                        if (i2 != 1) {
                                            if (i2 == 2) {
                                                multiViewModelN5.XQ2(0, inboxEntrancePod2);
                                                return;
                                            }
                                            return;
                                        }
                                        multiViewModelN5.XQ2(50, inboxEntrancePod2);
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final void LIZIZ(InboxEntranceCell inboxEntranceCell2, int i2, Function0<Unit> function0, Function0<Unit> function02) {
                                        C1902740zc8.LIZ.getClass();
                                        C1902740zc8.LIZIZ(inboxEntranceCell2, i2, function0, function02);
                                    }
                                }, inboxEntranceFunction) { // from class: X.0zcq
                                    public final int LIZJ;
                                    public final int LIZLLL;
                                    public final int LJ;

                                    @Override // X.AbstractC1903250zcx
                                    public final void LIZJ() {
                                        this.LIZIZ.LIZIZ(this.LIZ.entranceCell, this.LIZJ, new AwS572S0100000_28(this, 908), new AwS572S0100000_28(this, 909));
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final void LIZ() {
                                        super.LIZ();
                                        this.LIZIZ.LJ(this.LIZJ);
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final void LIZIZ() {
                                        super.LIZIZ();
                                        this.LIZIZ.LIZLLL(this.LIZJ, this.LIZ);
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final int LIZLLL() {
                                        return this.LJ;
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final int LJ() {
                                        return this.LIZLLL;
                                    }

                                    {
                                        boolean z;
                                        int i2;
                                        int i3;
                                        int i4 = 1;
                                        if (inboxEntranceFunction.actionStatus == 1) {
                                            z = true;
                                            i4 = 2;
                                        } else {
                                            z = false;
                                        }
                                        this.LIZJ = i4;
                                        if (z) {
                                            i2 = 2131836100;
                                        } else {
                                            i2 = 2131836094;
                                        }
                                        this.LIZLLL = i2;
                                        if (z) {
                                            i3 = R.raw.icon_pin_slash;
                                        } else {
                                            i3 = R.raw.icon_pin;
                                        }
                                        this.LJ = i3;
                                    }
                                };
                            } else if (i == C0ORP.DELETE.getType()) {
                                C1902740zc8.LIZ.getClass();
                                c1903160zco = new C1903160zco(inboxEntrancePod, new InterfaceC1903260zcy() { // from class: X.0zca
                                    @Override // X.InterfaceC1903260zcy
                                    public final void LIZ() {
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final InterfaceC1903320zd4 LIZJ() {
                                        C1902740zc8 c1902740zc82 = C1902740zc8.LIZ;
                                        final MultiViewModel multiViewModel = multiViewModelN5;
                                        c1902740zc82.getClass();
                                        return new InterfaceC1903320zd4() { // from class: X.0zch
                                            @Override // X.InterfaceC1903320zd4
                                            public final void LIZIZ() {
                                            }

                                            @Override // X.InterfaceC1903320zd4
                                            public final void LIZ(InboxEntrancePod inboxEntrancePod2) {
                                                multiViewModel.SQ2("click", "delete", inboxEntrancePod2, null);
                                            }
                                        };
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final void LJ(int i2) {
                                        C1902740zc8 c1902740zc82 = C1902740zc8.LIZ;
                                        View view4 = view3;
                                        c1902740zc82.getClass();
                                        C1902740zc8.LIZ(i2, view4);
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final void LIZLLL(int i2, InboxEntrancePod inboxEntrancePod2) {
                                        InboxEntranceCell inboxEntranceCell2 = inboxEntrancePod2.entranceCell;
                                        int i3 = inboxEntranceCell2.filterType;
                                        if (i3 != Integer.MIN_VALUE) {
                                            C1903780zdo.LIZLLL(i3);
                                        } else {
                                            int i4 = inboxEntranceCell2.group;
                                            if (i4 != 0) {
                                                C1903780zdo.LIZJ(i4);
                                            }
                                        }
                                        InboxEntranceCell inboxEntranceCell3 = inboxEntrancePod2.entranceCell;
                                        C1903780zdo.LIZIZ(new EntranceKey(inboxEntranceCell3.cellId, inboxEntranceCell3.entranceKey));
                                        multiViewModelN5.QQ2(inboxEntrancePod2);
                                    }

                                    @Override // X.InterfaceC1903260zcy
                                    public final void LIZIZ(InboxEntranceCell inboxEntranceCell2, int i2, Function0<Unit> function0, Function0<Unit> function02) {
                                        C1902740zc8.LIZ.getClass();
                                        C1902740zc8.LIZIZ(inboxEntranceCell2, i2, function0, function02);
                                    }
                                }, view3.getContext(), multiViewModelN5);
                            } else if (i == C0ORP.ARCHIVE.getType() && C0CYK.LIZJ.LJIIIIZZ()) {
                                C1902740zc8.LIZ.getClass();
                                c1903160zco = new AbstractC1903250zcx(inboxEntrancePod, new C1903040zcc(view3, multiViewModelN5), inboxEntranceFunction) { // from class: X.0zcp
                                    public final int LIZJ;
                                    public final int LIZLLL;

                                    @Override // X.AbstractC1903250zcx
                                    public final int LIZLLL() {
                                        return R.raw.icon_archive_box;
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final void LIZJ() {
                                        this.LIZIZ.LIZIZ(this.LIZ.entranceCell, this.LIZJ, new AwS572S0100000_28(this, 901), new AwS572S0100000_28(this, 902));
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final void LIZ() {
                                        super.LIZ();
                                        this.LIZIZ.LJ(this.LIZJ);
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final void LIZIZ() {
                                        super.LIZIZ();
                                        this.LIZIZ.LIZLLL(this.LIZJ, this.LIZ);
                                    }

                                    @Override // X.AbstractC1903250zcx
                                    public final int LJ() {
                                        return this.LIZLLL;
                                    }

                                    {
                                        int i2;
                                        int i3;
                                        boolean z = true;
                                        if (inboxEntranceFunction.actionStatus == 1) {
                                            i2 = 8;
                                        } else {
                                            z = false;
                                            i2 = 7;
                                        }
                                        this.LIZJ = i2;
                                        if (z) {
                                            i3 = 2131830289;
                                        } else {
                                            i3 = 2131830288;
                                        }
                                        this.LIZLLL = i3;
                                    }
                                };
                            }
                            arrayList.add(c1903160zco);
                        }
                    }
                    List<AbstractC1903250zcx> listLJLJJLL = C13LP.LJLJJLL(arrayList);
                    Context context = view3.getContext();
                    if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null) {
                        IInboxLongPressMenuPopoverHelper.LIZ.getClass();
                        IInboxLongPressMenuPopoverHelper iInboxLongPressMenuPopoverHelperLIZ = C887700Ys4.LIZ();
                        if (iInboxLongPressMenuPopoverHelperLIZ != null) {
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLJJLL, 10));
                            for (AbstractC1903250zcx abstractC1903250zcx : listLJLJJLL) {
                                Context context2 = view3.getContext();
                                abstractC1903250zcx.getClass();
                                arrayList2.add(new C443090HZb(context2.getString(abstractC1903250zcx.LJ()), new AwS572S0100000_28(abstractC1903250zcx, 903), abstractC1903250zcx.LIZLLL(), null, 0, null, abstractC1903250zcx.LJFF(), false, false, null, 952));
                            }
                            iInboxLongPressMenuPopoverHelperLIZ.LIZ(c19eg, Collections.singletonList(arrayList2), view3);
                        }
                        if (!C0BV3.LIZ()) {
                            return true;
                        }
                        C895230ZAb.LIZ(fragmentLIZ);
                        return true;
                    }
                }
                return false;
            }
        });
        C1387040mCM.LIZ(X5(), AFwS315S0000000_28.get$arr$(43));
    }

    @Override // X.C0Z9B, X.InterfaceC892580Yzw
    public final void LJLJI(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        C0Z9A.LIZJ(this, interfaceC887660Ys0);
    }

    @Override // X.C0Z9B
    public final void LLIIII(AnimatorSet animatorSet) {
        this.LLJJL = animatorSet;
    }

    @Override // X.C0Z9B
    public final void LLILII(AnimatorSet animatorSet) {
        this.LLJJLIIIJLLLLLLLZ = animatorSet;
    }

    @Override // X.AbstractC1903430zdF
    public final void P5(C1906880zio c1906880zio) {
        boolean z;
        Activity activityL5;
        Integer numLIZJ;
        if (c1906880zio.LIZ != -1) {
            z = true;
        } else {
            z = false;
        }
        C1906880zio c1906880zio2 = null;
        if (z) {
            SmartAvatarImageView smartAvatarImageViewW5 = W5();
            ViewGroup.LayoutParams layoutParams = W5().getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LIZ)));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LIZ)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(smartAvatarImageViewW5);
            smartAvatarImageViewW5.setLayoutParams(layoutParams);
        }
        if (c1906880zio.LIZLLL != -1) {
            b6().setTuxFont(c1906880zio.LIZLLL);
        }
        if (c1906880zio.LJ != -1) {
            b6().LJJJJI(c1906880zio.LJ);
        }
        if (c1906880zio.LJFF != -1) {
            V5().setTuxFont(c1906880zio.LJFF);
        }
        if (c1906880zio.LJIIIIZZ != -1 && (activityL5 = L5()) != null && (numLIZJ = C1308910kAL.LIZJ(c1906880zio.LJIIIIZZ, activityL5)) != null) {
            V5().setTextColor(numLIZJ.intValue());
        }
        if (c1906880zio.LJIIIZ != -1 && (((View) this.LLJILJILJ.getValue()).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) this.LLJILJILJ.getValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.LLJILJILJ.getValue()).getLayoutParams();
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio.LJIIIZ)));
            C786410Ut5.i6(linearLayoutCompat, marginLayoutParams);
        }
        if (c1906880zio.LJIIJJI != -1) {
            c1906880zio2 = c1906880zio;
        }
        if ((((View) this.LLJJIJIIJIL.getValue()).getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && c1906880zio2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.LLJJIJIIJIL.getValue();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ((View) this.LLJJIJIIJIL.getValue()).getLayoutParams();
            marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1906880zio2.LJIIJJI))));
            C786410Ut5.m6(constraintLayout, marginLayoutParams2);
        }
        if (c1906880zio.LJIIJ != -1) {
            a6().setTuxFont(c1906880zio.LJIIJ);
        }
    }

    @Override // X.AbstractC1903430zdF
    public final void S5(int i) {
        MultiViewModel multiViewModelN5;
        if (this.LLILLL != 0) {
            if (C890310YwH.LIZIZ.LIZJ(true)) {
                AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 941);
                if (i != 1 && (multiViewModelN5 = N5()) != null) {
                    multiViewModelN5.VQ2((InboxEntrancePod) this.LLILLL, new AwS149S0201000_28(i, this, awS572S0100000_28, 16));
                    return;
                }
                return;
            }
            AwS572S0100000_28 awS572S0100000_282 = new AwS572S0100000_28(this, 942);
            MultiViewModel multiViewModelN52 = N5();
            if (multiViewModelN52 == null) {
                return;
            }
            multiViewModelN52.UQ2(this.LLILLL, new AwS572S0100000_28(awS572S0100000_282, 943));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T5(com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod r5) {
        /*
            r4 = this;
            android.app.Activity r0 = r4.L5()
            if (r0 == 0) goto Laf
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto Laf
        Ld:
            r2 = 0
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r0 = r5.entranceCell
            com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo r1 = r0.uiInfo
            if (r1 == 0) goto La2
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.avatarImageUrlDark
            if (r0 == 0) goto La2
            if (r1 == 0) goto Lac
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.avatarImageUrlDark
        L1e:
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C438710HIf.LIZ(r0)
            X.0kl3 r3 = X.C1331660kl2.LJIIIIZZ(r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r0 = r5.entranceCell
            boolean r0 = r0.isActivity()
            if (r0 == 0) goto L96
            X.0ygC r0 = X.C1866820ygC.LIZ
            r0.getClass()
            X.01GW r0 = X.C1866820ygC.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L92
            r0 = 2130773051(0x7f01043b, float:1.7149238E38)
        L44:
            X.0GdJ r1 = new X.0GdJ
            r1.<init>()
            r1.LIZ = r0
            android.view.View r0 = r4.itemView
            android.content.Context r0 = r0.getContext()
            com.bytedance.tux.drawable.TuxIconDrawable r0 = r1.LIZ(r0)
            if (r0 == 0) goto L5a
            r3.LJIL(r0)
        L5a:
            X.0zid r0 = X.EnumC1906770zid.INBOX
            java.lang.String r0 = r0.getAvatarSceneTag()
            r3.LIZLLL(r0)
            X.0zoc r0 = X.C1910480zoc.LIZ
            r0.getClass()
            X.C1910480zoc.LIZIZ(r3)
            X.C1890820zIu.LIZ(r3)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView r0 = r4.W5()
            r3.LJJ(r0)
            java.lang.String r0 = "EntranceNormalVH"
            X.C1600630rkr.LIZIZ(r3, r2, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r0 = r5.entranceCell
            int r1 = r0.cellId
            r0 = 8
            if (r1 != r0) goto Lb2
            com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView r1 = r4.W5()
            X.01GW r0 = r4.LLJLIL
            java.lang.Object r0 = r0.getValue()
            X.0kl9 r0 = (X.C1331730kl9) r0
            r1.setCircleOptions(r0)
            return
        L92:
            r0 = 2130773050(0x7f01043a, float:1.7149236E38)
            goto L44
        L96:
            com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r0 = r5.entranceCell
            boolean r0 = r0.isFollower()
            if (r0 == 0) goto L5a
            r0 = 2130773489(0x7f0105f1, float:1.7150126E38)
            goto L44
        La2:
            com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r0 = r5.entranceCell
            com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo r0 = r0.uiInfo
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.avatarImageUrl
            goto L1e
        Lac:
            r0 = r2
            goto L1e
        Laf:
            r0 = 0
            goto Ld
        Lb2:
            com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView r1 = r4.W5()
            X.01GW r0 = r4.LLJL
            java.lang.Object r0 = r0.getValue()
            X.0kl9 r0 = (X.C1331730kl9) r0
            r1.setCircleOptions(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1903510zdN.T5(com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod):void");
    }

    public final TuxIconView U5(int i) {
        Activity activityL5 = L5();
        if (activityL5 != null) {
            TuxIconView tuxIconView = new TuxIconView(activityL5, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.M6(tuxIconView, layoutParams);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZIZ = iLIZIZ;
            c419910GdJ.LIZJ = iLIZIZ;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            tuxIconView.setTuxIcon(c419910GdJ);
            return tuxIconView;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    @Override // X.AbstractC1903430zdF
    /* JADX INFO: renamed from: d6, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R5(com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod r22) {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1903510zdN.R5(com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod):void");
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5(i, interfaceC1891350zJl);
    }

    public final void f6(long j, String str) {
        if (c6() && !this.LLJLL && this.LLJLLL == j && this.LLJLILLLLZIIL > 0) {
            this.LLJLL = true;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLILLLLZIIL;
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            ((ITakoMob) this.LLJZIJLIL.getValue()).mobTikbotEntranceMisTouch(C14TF.LIZIZ.LJJIIZ(), "message_cell", str, jCurrentTimeMillis);
        }
    }
}
