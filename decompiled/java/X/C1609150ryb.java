package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ryb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609150ryb {
    public final AvatarComponentView LIZ;
    public final C427660Gpo LIZIZ;
    public final Context LIZJ;
    public final Set<EnumC1608710rxt> LIZLLL;
    public final C01GW LJ;
    public final HashMap<Integer, View> LJFF;
    public final C01GW LJI;
    public final HashMap<EnumC1608710rxt, View> LJII;

    public final void LIZIZ(C1609000ryM c1609000ryM) {
        AbstractC1609160ryc abstractC1609160ryc;
        int i = c1609000ryM.LIZLLL;
        InterfaceC1609020ryO interfaceC1609020ryOLIZ = c1609000ryM.LIZJ.LIZ().LIZ();
        if (interfaceC1609020ryOLIZ instanceof C1609250ryl) {
            abstractC1609160ryc = C1609200ryg.LIZJ;
        } else if (!(interfaceC1609020ryOLIZ instanceof C1608120rww) && !(interfaceC1609020ryOLIZ instanceof C1609240ryk)) {
            if (!(interfaceC1609020ryOLIZ instanceof C1609230ryj)) {
                return;
            } else {
                abstractC1609160ryc = (AbstractC1609160ryc) this.LJ.getValue();
            }
        } else {
            abstractC1609160ryc = C1609180rye.LIZJ;
        }
        if (abstractC1609160ryc != null) {
            abstractC1609160ryc.LIZLLL(this.LJFF.get(Integer.valueOf(i)), this.LIZ, c1609000ryM);
        }
    }

    public final void LIZJ(ConcurrentHashMap<EnumC1608710rxt, List<C1609000ryM>> concurrentHashMap) {
        Object c098200Yq;
        try {
            Iterator<Map.Entry<EnumC1608710rxt, List<C1609000ryM>>> it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Iterator it3 = new ArrayList(it2.next().getValue()).iterator();
                while (it3.hasNext()) {
                    LIZIZ((C1609000ryM) it3.next());
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("avatarNodeUIExecutor, updateNodesSize: error = ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C1609150ryb(AvatarComponentView avatarComponentView, C427660Gpo c427660Gpo, Context context) {
        this.LIZ = avatarComponentView;
        this.LIZIZ = c427660Gpo;
        this.LIZJ = context;
        C1608690rxr.LIZ.getClass();
        this.LIZLLL = (Set) C1608690rxr.LJ.getValue();
        this.LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(26));
        this.LJFF = new HashMap<>();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(25));
        this.LJI = c01gwLIZIZ;
        this.LJII = new HashMap<>();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        c427660Gpo.setTag(1610612738, EnumC1608710rxt.AVATAR);
        avatarComponentView.addView(c427660Gpo, 0, layoutParams);
        C1584506Ih.LIZIZ(c427660Gpo);
        SocialAvatarAccess socialAvatarAccess = (SocialAvatarAccess) c01gwLIZIZ.getValue();
        if (socialAvatarAccess != null && socialAvatarAccess.LIZ()) {
            if (!avatarComponentView.LLILZLL) {
                C1609350ryv c1609350ryv = new Object() { // from class: X.0ryv
                };
                Context context2 = avatarComponentView.getContext();
                AttributeSet attributeSet = avatarComponentView.LL;
                int i = avatarComponentView.LLILLJJLI;
                c1609350ryv.getClass();
                ConstraintLayout constraintLayout = new ConstraintLayout(context2);
                constraintLayout.setId(R.id.vnx);
                C427870Gq9 c427870Gq9 = new C427870Gq9(context2, attributeSet, i);
                c427870Gq9.setId(R.id.vng);
                C19ME c19me = new C19ME(-2, -2);
                c19me.topToTop = 0;
                c19me.bottomToBottom = 0;
                c19me.startToStart = 0;
                c19me.endToEnd = 0;
                constraintLayout.addView(c427870Gq9, c19me);
                C419460Gca c419460Gca = new C419460Gca(context2, attributeSet, i);
                c419460Gca.setId(R.id.vnq);
                C19ME c19me2 = new C19ME(-2, -2);
                c19me2.bottomToBottom = R.id.vng;
                c19me2.startToStart = R.id.vng;
                c19me2.endToEnd = R.id.vng;
                constraintLayout.addView(c419460Gca, c19me2);
                C419460Gca c419460Gca2 = new C419460Gca(context2, attributeSet, i);
                c419460Gca2.setId(R.id.vnf);
                C19ME c19me3 = new C19ME(-2, -2);
                c19me3.bottomToBottom = R.id.vng;
                c19me3.startToStart = R.id.vng;
                c19me3.endToEnd = R.id.vng;
                constraintLayout.addView(c419460Gca2, c19me3);
                TuxIconView tuxIconView = new TuxIconView(context2, attributeSet, i);
                tuxIconView.setId(R.id.vne);
                C19ME c19me4 = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                c19me4.topToTop = 0;
                c19me4.bottomToBottom = 0;
                c19me4.startToStart = 0;
                c19me4.endToEnd = 0;
                tuxIconView.setIconRes(R.raw.icon_spinner_normal);
                tuxIconView.setTintColor(R.attr.a02);
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                constraintLayout.addView(tuxIconView, c19me4);
                avatarComponentView.LLIZ = constraintLayout;
                avatarComponentView.LLILZLL = true;
            }
            avatarComponentView.addView(avatarComponentView.getSocialAvatar(), 1, layoutParams2);
            ViewGroup socialAvatar = avatarComponentView.getSocialAvatar();
            if (socialAvatar != null) {
                socialAvatar.setTag(1610612738, EnumC1608710rxt.SOCIAL_AVATAR);
            }
        }
        c427660Gpo.setId(-429227255);
    }

    public final void LIZ(EnumC1608710rxt enumC1608710rxt, C1609000ryM c1609000ryM, boolean z) {
        AbstractC1609160ryc abstractC1609160ryc;
        View viewLIZIZ;
        InterfaceC1609020ryO interfaceC1609020ryO;
        InterfaceC1609020ryO interfaceC1609020ryO2;
        Pair pair;
        View view;
        C1609250ryl c1609250ryl;
        Function1<C1606310ru1, Unit> function1;
        C1609250ryl c1609250ryl2;
        View viewInvoke;
        boolean z2;
        C1606970rv5 c1606970rv5;
        C1606970rv5 c1606970rv52;
        View view2;
        boolean z3;
        Set<? extends InterfaceC1608860ry8<?>> set;
        int i = c1609000ryM.LIZLLL;
        InterfaceC1609020ryO interfaceC1609020ryOLIZ = c1609000ryM.LIZJ.LIZ().LIZ();
        if ((interfaceC1609020ryOLIZ instanceof C1608120rww) || (interfaceC1609020ryOLIZ instanceof C1609240ryk)) {
            abstractC1609160ryc = C1609180rye.LIZJ;
        } else if (interfaceC1609020ryOLIZ instanceof C1609250ryl) {
            abstractC1609160ryc = C1609200ryg.LIZJ;
        } else if (interfaceC1609020ryOLIZ instanceof C1609230ryj) {
            abstractC1609160ryc = (AbstractC1609160ryc) this.LJ.getValue();
        } else {
            abstractC1609160ryc = null;
        }
        if (!z && this.LJFF.get(Integer.valueOf(i)) != null) {
            View view3 = this.LJFF.get(Integer.valueOf(i));
            if (view3 != null) {
                if (view3.getVisibility() != 0) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                if (abstractC1609160ryc != null) {
                    Context context = view3.getContext();
                    AvatarComponentView avatarComponentView = this.LIZ;
                    if (avatarComponentView.getConfig().LIZ.LJ && (set = this.LIZ.getConfig().LIZIZ.LIZ) != null && !set.isEmpty() && c1609000ryM.LJFF) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    abstractC1609160ryc.LIZ(view3, context, avatarComponentView, c1609000ryM, z3);
                }
                c1609000ryM.LJFF = false;
            }
        } else {
            HashMap<Integer, View> map = this.LJFF;
            Integer numValueOf = Integer.valueOf(i);
            if (abstractC1609160ryc != null) {
                Context context2 = this.LIZJ;
                AvatarComponentView avatarComponentView2 = this.LIZ;
                AbstractC1606980rv6 abstractC1606980rv6LIZ = c1609000ryM.LIZJ.LIZ();
                if ((abstractC1606980rv6LIZ instanceof C1606970rv5) && (c1606970rv52 = (C1606970rv5) abstractC1606980rv6LIZ) != null) {
                    interfaceC1609020ryO = c1606970rv52.LIZIZ;
                } else {
                    interfaceC1609020ryO = null;
                }
                C1608740rxw c1608740rxwLIZ = C1609280ryo.LIZ(avatarComponentView2);
                AbstractC1606980rv6 abstractC1606980rv6LIZ2 = c1609000ryM.LIZJ.LIZ();
                if ((abstractC1606980rv6LIZ2 instanceof C1606970rv5) && (c1606970rv5 = (C1606970rv5) abstractC1606980rv6LIZ2) != null) {
                    interfaceC1609020ryO2 = c1606970rv5.LIZIZ;
                } else {
                    interfaceC1609020ryO2 = null;
                }
                if ((interfaceC1609020ryO2 instanceof C1609250ryl) && (c1609250ryl2 = (C1609250ryl) interfaceC1609020ryO2) != null && (viewInvoke = c1609250ryl2.LIZLLL.invoke(context2)) != null) {
                    if (c1609250ryl2.LIZJ != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                        if (!c1609250ryl2.LJII) {
                            pair = new Pair(viewInvoke, viewInvoke);
                        }
                        view = (View) pair.getSecond();
                    }
                    C1609170ryd c1609170ryd = new C1609170ryd(context2);
                    c1609170ryd.setClipChildren(false);
                    if (z2) {
                        c1609170ryd.setTag(1610612736, "click_view_");
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    AbstractC1609160ryc.LJFF(layoutParams, c1608740rxwLIZ, c1609250ryl2.LIZIZ);
                    layoutParams.gravity = 17;
                    c1609170ryd.addView(viewInvoke, layoutParams);
                    pair = new Pair(viewInvoke, c1609170ryd);
                    view = (View) pair.getSecond();
                } else {
                    pair = null;
                    view = null;
                }
                viewLIZIZ = abstractC1609160ryc.LIZIZ(context2, view, interfaceC1609020ryO);
                EnumC1607270rvZ enumC1607270rvZ = c1609000ryM.LIZ;
                EnumC1608710rxt nodeType = c1609000ryM.LIZJ.getNodeType();
                viewLIZIZ.setId(c1609000ryM.LIZLLL);
                if (c1609000ryM.LJ.length() > 0) {
                    viewLIZIZ.setContentDescription(c1609000ryM.LJ);
                }
                viewLIZIZ.setTag(1610612737, enumC1607270rvZ);
                viewLIZIZ.setTag(1610612738, nodeType);
                int iLJJJZ = C13LP.LJJJZ(c1609000ryM.LIZJ.getNodeType(), abstractC1609160ryc.LIZIZ);
                Iterator it2 = new C1077420e8y(avatarComponentView2, 3).iterator();
                int childCount = 0;
                while (true) {
                    C1077410e8x c1077410e8x = (C1077410e8x) it2;
                    if (c1077410e8x.hasNext()) {
                        Object next = c1077410e8x.next();
                        if (childCount >= 0) {
                            if (C13LP.LJJJZ(((View) next).getTag(1610612738), abstractC1609160ryc.LIZIZ) > iLJJJZ) {
                                break;
                            } else {
                                childCount++;
                            }
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else {
                        childCount = avatarComponentView2.getChildCount();
                        break;
                    }
                }
                avatarComponentView2.addView(viewLIZIZ, childCount, abstractC1609160ryc.LIZJ(interfaceC1609020ryO, avatarComponentView2, c1608740rxwLIZ, viewLIZIZ));
                if (pair != null && (interfaceC1609020ryO instanceof C1609250ryl) && (c1609250ryl = (C1609250ryl) interfaceC1609020ryO) != null && (function1 = c1609250ryl.LJ) != null) {
                    function1.invoke(new C1606310ru1(avatarComponentView2, (View) pair.getFirst(), viewLIZIZ, context2));
                }
                abstractC1609160ryc.LIZ(viewLIZIZ, context2, avatarComponentView2, c1609000ryM, false);
                if (z && viewLIZIZ.getVisibility() != 8) {
                    C786410Ut5.LJLLLLLL(8, viewLIZIZ);
                }
            } else {
                viewLIZIZ = null;
            }
            map.put(numValueOf, viewLIZIZ);
            if (!z) {
            }
            this.LJII.put(enumC1608710rxt, this.LJFF.get(Integer.valueOf(i)));
        }
        if (this.LJII.get(enumC1608710rxt) != null && this.LJFF.get(Integer.valueOf(i)) != null && !Intrinsics.LJFF(this.LJII.get(enumC1608710rxt), this.LJFF.get(Integer.valueOf(i))) && (view2 = this.LJII.get(enumC1608710rxt)) != null && view2.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        this.LJII.put(enumC1608710rxt, this.LJFF.get(Integer.valueOf(i)));
    }
}
