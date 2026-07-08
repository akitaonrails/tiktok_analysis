package X;

import Y.AsS53S0100000_27;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.skydoves.balloon.Balloon;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yVD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860010yVD {
    public final InterfaceC1860040yVG LIZ;
    public final RecyclerView LIZIZ;
    public final AbstractC1585810rMx LIZJ;
    public final List<C1857450yR5> LIZLLL;
    public final LinearLayout LJ;
    public C1859940yV6 LJFF;
    public final ITakoChatPageAbility LJI;
    public final AwS571S0100000_27 LJII;
    public final Balloon LJIIIIZZ;
    public final C1860270yVd LJIIIZ;
    public final int LJIIJ;

    public final void LIZJ() {
        int i;
        int i2;
        InterfaceC1860040yVG interfaceC1860040yVG = this.LIZ;
        if (interfaceC1860040yVG == null) {
            return;
        }
        View rootView = interfaceC1860040yVG.LJJZZI().getRootView();
        int[] iArr = new int[3];
        InterfaceC1859950yV7 textSelector = this.LIZ.getTextSelector();
        if (textSelector != null) {
            textSelector.LJIILJJIL(iArr);
        }
        this.LJ.measure(0, 0);
        int i3 = iArr[1];
        int height = rootView.getHeight();
        C2247871CyX.LIZ.getClass();
        int i4 = C2247871CyX.LIZJ;
        if (i3 > height - i4 || (i = iArr[2]) < (i2 = C2247871CyX.LIZIZ)) {
            return;
        }
        if (i < ((rootView.getHeight() - this.LJIIJ) - this.LJ.getMeasuredHeight()) - i4 && iArr[2] > i2) {
            this.LJIIIIZZ.LJIILIIL(iArr[0], iArr[2] + this.LJIIJ + this.LJ.getMeasuredHeight(), rootView);
        } else if (iArr[1] <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)) + this.LJ.getMeasuredHeight() + this.LJIIJ || iArr[1] >= rootView.getHeight() - i4) {
            Balloon.LJIILLIIL(this.LJIIIIZZ, rootView);
        } else {
            this.LJIIIIZZ.LJIILIIL(iArr[0], iArr[1] - this.LJIIJ, rootView);
        }
    }

    public final void LIZIZ(View view) {
        char c;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        this.LJ.measure(0, 0);
        if (i <= ((this.LJ.getMeasuredHeight() + ScreenUtils.getStatusBarHeight(view.getContext())) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))) {
            c = 1;
        } else {
            c = 3;
        }
        if (c != 1) {
            if (c == 3) {
                this.LJIIIIZZ.LJIILJJIL(((this.LJ.getMeasuredWidth() / 2) - (view.getMeasuredWidth() / 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), view);
                return;
            }
            return;
        }
        this.LJIIIIZZ.LJIILIIL(((this.LJ.getMeasuredWidth() / 2) - (view.getMeasuredWidth() / 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-12)), view);
    }

    public final void LIZ(float f, float f2, View view) {
        C2247871CyX c2247871CyX = C2247871CyX.LIZ;
        Balloon balloon = this.LJIIIIZZ;
        LinearLayout linearLayout = this.LJ;
        int i = C2247871CyX.LIZLLL;
        c2247871CyX.getClass();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        linearLayout.measure(0, 0);
        int measuredHeight = (linearLayout.getMeasuredHeight() + C2247871CyX.LIZIZ) - iArr[1];
        int i2 = (int) f;
        int measuredWidth = i2 - (linearLayout.getMeasuredWidth() / 2);
        C118300cf c118300cf = new C118300cf();
        int i3 = (int) f2;
        c118300cf.element = (-(view.getHeight() - i3)) + i;
        if (iArr[1] + i3 + linearLayout.getMeasuredHeight() + C2247871CyX.LIZJ > C418440Gaw.LIZJ(view.getContext())) {
            c118300cf.element = i3 - i;
            int width = i2 - (view.getWidth() / 2);
            int i4 = -((iArr[0] + (view.getWidth() / 2)) - (linearLayout.getMeasuredWidth() / 2));
            if (width < i4) {
                width = i4;
            }
            int i5 = c118300cf.element;
            if (i5 >= measuredHeight) {
                measuredHeight = i5;
            }
            balloon.LJIILJJIL(width, measuredHeight, view);
            return;
        }
        int i6 = -iArr[0];
        if (measuredWidth < i6) {
            measuredWidth = i6;
        }
        balloon.LJIILL(view, measuredWidth, c118300cf.element + i);
    }

    public C1860010yVD(Context context, InterfaceC1860040yVG interfaceC1860040yVG, Message message, RecyclerView recyclerView, boolean z, List list, Function0 function0, AsS53S0100000_27 asS53S0100000_27, boolean z2, boolean z3, Integer num, int i) {
        LinearLayout linearLayout;
        Object c098200Yq;
        View viewLJJZZI;
        int i2;
        InterfaceC1859950yV7 textSelector;
        MessageSender messageSender;
        Integer num2 = num;
        boolean z4 = z3;
        boolean z5 = z2;
        AsS53S0100000_27 asS53S0100000_272 = asS53S0100000_27;
        Message message2 = message;
        Function0 function02 = function0;
        InterfaceC1860040yVG interfaceC1860040yVG2 = (i & 2) != 0 ? null : interfaceC1860040yVG;
        message2 = (i & 4) != 0 ? null : message2;
        function02 = (i & 64) != 0 ? null : function02;
        asS53S0100000_272 = (i & 128) != 0 ? null : asS53S0100000_272;
        z5 = (i & 256) != 0 ? true : z5;
        z4 = (i & 512) != 0 ? false : z4;
        num2 = (i & 1024) != 0 ? null : num2;
        this.LIZ = interfaceC1860040yVG2;
        this.LIZIZ = recyclerView;
        this.LIZJ = asS53S0100000_272;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        List<C1857450yR5> listLJIIZILJ = C1857420yR2.LJIIZILJ(list);
        this.LIZLLL = listLJIIZILJ;
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL()) {
            C19404610vs c19404610vs = new C19404610vs(context);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJIIZILJ) {
                if (((C1857450yR5) obj).LIZ) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C1857450yR5) it2.next()).LIZIZ);
            }
            c19404610vs.setHorizontalSubMenuActionConfigList(arrayList2);
            List<C1857450yR5> list2 = this.LIZLLL;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : (ArrayList) list2) {
                if (!((C1857450yR5) obj2).LIZ) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((C1857450yR5) it3.next()).LIZIZ);
            }
            c19404610vs.setVerticalSubMenuActionConfigList(arrayList4);
            c19404610vs.setItemClick(new AwS606S0100000_27(this, 523));
            c19404610vs.setHasShadow(z4);
            linearLayout = c19404610vs;
        } else {
            C19404510vr c19404510vr = new C19404510vr(context);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : (ArrayList) listLJIIZILJ) {
                if (((C1857450yR5) obj3).LIZ) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(((C1857450yR5) it4.next()).LIZIZ);
            }
            c19404510vr.setHorizontalSubMenuActionConfigList(arrayList6);
            List<C1857450yR5> list3 = this.LIZLLL;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj4 : (ArrayList) list3) {
                if (!((C1857450yR5) obj4).LIZ) {
                    arrayList7.add(obj4);
                }
            }
            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(arrayList7, 10));
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                arrayList8.add(((C1857450yR5) it5.next()).LIZIZ);
            }
            c19404510vr.setVerticalSubMenuActionConfigList(arrayList8);
            c19404510vr.setItemClick(new AwS606S0100000_27(this, 524));
            linearLayout = c19404510vr;
        }
        this.LJ = linearLayout;
        try {
            c098200Yq = (ITakoChatPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.LIZIZ, null), ITakoChatPageAbility.class, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.LJI = iTakoChatPageAbility;
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 1297);
        this.LJII = awS571S0100000_27;
        this.LJIIIIZZ = C2247871CyX.LIZ(C2247871CyX.LIZ, context, this.LJ, z, 0, new AwS428S0200000_27(this, (C1860010yVD) function02, (Function0<Unit>) 96), z5, null, num2, null, 5340);
        InterfaceC1860040yVG interfaceC1860040yVG3 = this.LIZ;
        if (interfaceC1860040yVG3 != null) {
            viewLJJZZI = interfaceC1860040yVG3.LJJZZI();
        } else {
            viewLJJZZI = null;
        }
        C1860320yVi c1860320yVi = new C1860320yVi();
        if (message2 != null && (messageSender = message2.sender) != null && messageSender.isSelf) {
            i2 = R.attr.zw;
        } else {
            i2 = R.attr.a1t;
        }
        this.LJIIIZ = new C1860270yVd(viewLJJZZI, C1860320yVi.LIZ(c1860320yVi, i2));
        InterfaceC2248331CzH interfaceC2248331CzH = new InterfaceC2248331CzH() { // from class: X.0yVC
            @Override // X.InterfaceC2248331CzH
            public final void LIZ(int i3, int i4, int i5, boolean z6) {
                C1859940yV6 c1859940yV6 = this.LIZ.LJFF;
                if (c1859940yV6 != null) {
                    c1859940yV6.LIZ(i3, i4, i5, z6);
                }
                if (z6) {
                    this.LIZ.LJIIIIZZ.dismiss();
                    C1860270yVd c1860270yVd = this.LIZ.LJIIIZ;
                    if (c1860270yVd != null) {
                        C1860280yVe c1860280yVe = new C1860280yVe(c1860270yVd, i3, i4);
                        if (Build.VERSION.SDK_INT >= 29) {
                            C13MK.LIZLLL(new AwS571S0100000_27(c1860280yVe, (Function0<Unit>) 1110));
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1860010yVD c1860010yVD = this.LIZ;
                if (c1860010yVD.LIZ != null) {
                    c1860010yVD.LIZJ();
                }
                C1860270yVd c1860270yVd2 = this.LIZ.LJIIIZ;
                if (c1860270yVd2 == null) {
                    return;
                }
                C1860260yVc c1860260yVc = new C1860260yVc(c1860270yVd2);
                if (Build.VERSION.SDK_INT < 29) {
                    return;
                }
                C13MK.LIZLLL(new AwS571S0100000_27(c1860260yVc, (Function0<Unit>) 1110));
            }
        };
        InterfaceC2247911Cyb interfaceC2247911Cyb = new InterfaceC2247911Cyb() { // from class: X.0yVE
            @Override // X.InterfaceC2247911Cyb
            public final void onShow() {
                this.LIZ.LIZJ();
                C1860270yVd c1860270yVd = this.LIZ.LJIIIZ;
                if (c1860270yVd != null) {
                    C1860260yVc c1860260yVc = new C1860260yVc(c1860270yVd);
                    if (Build.VERSION.SDK_INT >= 29) {
                        C13MK.LIZLLL(new AwS571S0100000_27(c1860260yVc, (Function0<Unit>) 1110));
                    }
                }
            }

            @Override // X.InterfaceC2247911Cyb
            public final void LIZIZ(boolean z6) {
                InterfaceC1859950yV7 textSelector2;
                this.LIZ.LJIIIIZZ.dismiss();
                if (z6) {
                    InterfaceC1860040yVG interfaceC1860040yVG4 = this.LIZ.LIZ;
                    if (interfaceC1860040yVG4 != null) {
                        interfaceC1860040yVG4.LJIILLIIL();
                    }
                    C1860010yVD c1860010yVD = this.LIZ;
                    AbstractC1585810rMx abstractC1585810rMx = c1860010yVD.LIZJ;
                    if (abstractC1585810rMx != null) {
                        c1860010yVD.LIZIZ.removeOnScrollListener(abstractC1585810rMx);
                    }
                    InterfaceC1860040yVG interfaceC1860040yVG5 = this.LIZ.LIZ;
                    if (interfaceC1860040yVG5 != null && (textSelector2 = interfaceC1860040yVG5.getTextSelector()) != null) {
                        textSelector2.LJ(null);
                    }
                }
            }
        };
        InterfaceC1860040yVG interfaceC1860040yVG4 = this.LIZ;
        if (interfaceC1860040yVG4 != null) {
            interfaceC1860040yVG4.LJIILLIIL();
        }
        InterfaceC1860040yVG interfaceC1860040yVG5 = this.LIZ;
        if (interfaceC1860040yVG5 != null) {
            interfaceC1860040yVG5.LJ(interfaceC2248331CzH);
        }
        InterfaceC1860040yVG interfaceC1860040yVG6 = this.LIZ;
        if (interfaceC1860040yVG6 != null && (textSelector = interfaceC1860040yVG6.getTextSelector()) != null) {
            textSelector.LJ(interfaceC2247911Cyb);
        }
        AbstractC1585810rMx abstractC1585810rMx = this.LIZJ;
        if (abstractC1585810rMx != null) {
            this.LIZIZ.addOnScrollListener(abstractC1585810rMx);
        }
        if (iTakoChatPageAbility != null) {
            iTakoChatPageAbility.kk1(0, awS571S0100000_27);
        }
        this.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
    }
}
