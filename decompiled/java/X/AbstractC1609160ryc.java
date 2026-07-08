package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.tablet.api.ITabletService;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0ryc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1609160ryc<VIEW extends View> implements InterfaceC1609320rys {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(27));
    public final Set<EnumC1608710rxt> LIZIZ;

    public abstract VIEW LIZIZ(Context context, View view, InterfaceC1609020ryO interfaceC1609020ryO);

    public AbstractC1609160ryc() {
        C1608690rxr.LIZ.getClass();
        this.LIZIZ = (Set) C1608690rxr.LIZLLL.getValue();
    }

    public static void LJ(View view, AvatarComponentView avatarComponentView, C1609000ryM c1609000ryM) {
        C1606970rv5 c1606970rv5;
        InterfaceC1609020ryO interfaceC1609020ryO;
        InterfaceC1609010ryN interfaceC1609010ryN;
        if (view == null) {
            return;
        }
        AbstractC1606980rv6 abstractC1606980rv6LIZ = null;
        if (c1609000ryM != null && (interfaceC1609010ryN = c1609000ryM.LIZJ) != null) {
            abstractC1606980rv6LIZ = interfaceC1609010ryN.LIZ();
        }
        if ((abstractC1606980rv6LIZ instanceof C1606970rv5) && (c1606970rv5 = (C1606970rv5) abstractC1606980rv6LIZ) != null && (interfaceC1609020ryO = c1606970rv5.LIZIZ) != null) {
            C786410Ut5.W5(view, C1609200ryg.LIZJ.LIZJ(interfaceC1609020ryO, avatarComponentView, C1609280ryo.LIZ(avatarComponentView), view));
        }
    }

    public static void LJFF(FrameLayout.LayoutParams layoutParams, C1608740rxw c1608740rxw, C1608470rxV c1608470rxV) {
        Integer numValueOf;
        int iIntValue;
        if (c1608470rxV == null) {
            return;
        }
        Function1<C1608740rxw, Float> function1 = c1608470rxV.LIZ;
        Integer numValueOf2 = null;
        if (function1 != null) {
            numValueOf = Integer.valueOf((int) function1.invoke(c1608740rxw).floatValue());
        } else {
            numValueOf = null;
        }
        Function1<C1608740rxw, Float> function12 = c1608470rxV.LIZIZ;
        if (function12 != null) {
            numValueOf2 = Integer.valueOf((int) function12.invoke(c1608740rxw).floatValue());
        }
        int iIntValue2 = -2;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -2;
        }
        layoutParams.width = iIntValue;
        if (numValueOf2 != null) {
            iIntValue2 = numValueOf2.intValue();
        }
        layoutParams.height = iIntValue2;
    }

    public static void LJI(RelativeLayout.LayoutParams layoutParams, C1608740rxw c1608740rxw, C1608470rxV c1608470rxV) {
        Integer numValueOf;
        int iIntValue;
        if (c1608470rxV == null) {
            return;
        }
        Function1<C1608740rxw, Float> function1 = c1608470rxV.LIZ;
        Integer numValueOf2 = null;
        if (function1 != null) {
            numValueOf = Integer.valueOf((int) function1.invoke(c1608740rxw).floatValue());
        } else {
            numValueOf = null;
        }
        Function1<C1608740rxw, Float> function12 = c1608470rxV.LIZIZ;
        if (function12 != null) {
            numValueOf2 = Integer.valueOf((int) function12.invoke(c1608740rxw).floatValue());
        }
        int iIntValue2 = -2;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -2;
        }
        layoutParams.width = iIntValue;
        if (numValueOf2 != null) {
            iIntValue2 = numValueOf2.intValue();
        }
        layoutParams.height = iIntValue2;
    }

    public void LIZLLL(View view, AvatarComponentView avatarComponentView, C1609000ryM c1609000ryM) {
        InterfaceC1616630sAf interfaceC1616630sAfLIZLLL;
        InterfaceC1249220ic4 interfaceC1249220ic4LJI;
        FrameLayout.LayoutParams layoutParams;
        AbstractC1606980rv6 abstractC1606980rv6LIZ;
        C1609250ryl c1609250ryl;
        C1606970rv5 c1606970rv5;
        InterfaceC1609010ryN interfaceC1609010ryN;
        LJ(view, avatarComponentView, c1609000ryM);
        if (view instanceof C1609170ryd) {
            ViewGroup.LayoutParams layoutParams2 = ((ViewGroup) view).getChildAt(0).getLayoutParams();
            InterfaceC1609020ryO interfaceC1609020ryO = null;
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                if (c1609000ryM != null && (interfaceC1609010ryN = c1609000ryM.LIZJ) != null) {
                    abstractC1606980rv6LIZ = interfaceC1609010ryN.LIZ();
                } else {
                    abstractC1606980rv6LIZ = null;
                }
                if ((abstractC1606980rv6LIZ instanceof C1606970rv5) && (c1606970rv5 = (C1606970rv5) abstractC1606980rv6LIZ) != null) {
                    interfaceC1609020ryO = c1606970rv5.LIZIZ;
                }
                if ((interfaceC1609020ryO instanceof C1609250ryl) && (c1609250ryl = (C1609250ryl) interfaceC1609020ryO) != null) {
                    LJFF(layoutParams, C1609280ryo.LIZ(avatarComponentView), c1609250ryl.LIZIZ);
                }
            }
        }
        C1483380ohk.LIZ.getClass();
        ITabletService iTabletService = C1483380ohk.LIZIZ;
        if (iTabletService != null && (interfaceC1616630sAfLIZLLL = iTabletService.LIZLLL()) != null && (interfaceC1249220ic4LJI = interfaceC1616630sAfLIZLLL.LJI()) != null && interfaceC1249220ic4LJI.LJI()) {
            LJ(view, avatarComponentView, c1609000ryM);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup.LayoutParams LIZJ(X.InterfaceC1609020ryO r15, com.ss.android.ugc.aweme.avatar.AvatarComponentView r16, X.C1608740rxw r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1609160ryc.LIZJ(X.0ryO, com.ss.android.ugc.aweme.avatar.AvatarComponentView, X.0rxw, android.view.View):android.view.ViewGroup$LayoutParams");
    }
}
