package X;

import Y.AsS53S0100000_27;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.skydoves.balloon.Balloon;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859960yV8 {
    public final InterfaceC1860040yVG LIZ;
    public final Message LIZIZ;
    public final RecyclerView LIZJ;
    public final AbstractC1585810rMx LIZLLL;
    public final List<C1857450yR5> LJ;
    public final C421250GfT LJFF;
    public C1859940yV6 LJI;
    public final Balloon LJII;
    public final C1860270yVd LJIIIIZZ;
    public final int LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1859960yV8.LIZ():void");
    }

    public C1859960yV8(Context context, InterfaceC1860040yVG interfaceC1860040yVG, Message message, RecyclerView recyclerView, List list, AwS571S0100000_27 awS571S0100000_27, AsS53S0100000_27 asS53S0100000_27) {
        View viewLJJZZI;
        int i;
        InterfaceC1859950yV7 textSelector;
        MessageSender messageSender;
        this.LIZ = interfaceC1860040yVG;
        this.LIZIZ = message;
        this.LIZJ = recyclerView;
        this.LIZLLL = asS53S0100000_27;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        List<C1857450yR5> listLJIIZILJ = C1857420yR2.LJIIZILJ(list);
        this.LJ = listLJIIZILJ;
        C421250GfT c421250GfT = new C421250GfT(context);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIZILJ, 10));
        Iterator it2 = ((ArrayList) listLJIIZILJ).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1857450yR5) it2.next()).LIZIZ);
        }
        c421250GfT.setSubMenuActionConfig(arrayList);
        c421250GfT.setItemClick(new AwS606S0100000_27(this, 525));
        this.LJFF = c421250GfT;
        this.LJII = C2247871CyX.LIZ(C2247871CyX.LIZ, context, c421250GfT, false, 0, new AwS571S0100000_27(awS571S0100000_27, 1298), false, null, Integer.valueOf(R.style.agm), null, 5340);
        InterfaceC1860040yVG interfaceC1860040yVG2 = this.LIZ;
        if (interfaceC1860040yVG2 != null) {
            viewLJJZZI = interfaceC1860040yVG2.LJJZZI();
        } else {
            viewLJJZZI = null;
        }
        C1860320yVi c1860320yVi = new C1860320yVi();
        Message message2 = this.LIZIZ;
        if (message2 != null && (messageSender = message2.sender) != null && messageSender.isSelf) {
            i = R.attr.zw;
        } else {
            i = R.attr.a1t;
        }
        this.LJIIIIZZ = new C1860270yVd(viewLJJZZI, C1860320yVi.LIZ(c1860320yVi, i));
        InterfaceC2248331CzH interfaceC2248331CzH = new InterfaceC2248331CzH() { // from class: X.0yVB
            @Override // X.InterfaceC2248331CzH
            public final void LIZ(int i2, int i3, int i4, boolean z) {
                C1859940yV6 c1859940yV6 = this.LIZ.LJI;
                if (c1859940yV6 != null) {
                    c1859940yV6.LIZ(i2, i3, i4, z);
                }
                if (z) {
                    this.LIZ.LJII.dismiss();
                    C1860270yVd c1860270yVd = this.LIZ.LJIIIIZZ;
                    if (c1860270yVd != null) {
                        C1860280yVe c1860280yVe = new C1860280yVe(c1860270yVd, i2, i3);
                        if (Build.VERSION.SDK_INT >= 29) {
                            C13MK.LIZLLL(new AwS571S0100000_27(c1860280yVe, (Function0<Unit>) 1110));
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1859960yV8 c1859960yV8 = this.LIZ;
                if (c1859960yV8.LIZ != null) {
                    c1859960yV8.LIZ();
                }
                C1860270yVd c1860270yVd2 = this.LIZ.LJIIIIZZ;
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
        InterfaceC2247911Cyb interfaceC2247911Cyb = new InterfaceC2247911Cyb() { // from class: X.0yVA
            @Override // X.InterfaceC2247911Cyb
            public final void onShow() {
                this.LIZ.LIZ();
                C1860270yVd c1860270yVd = this.LIZ.LJIIIIZZ;
                if (c1860270yVd != null) {
                    C1860260yVc c1860260yVc = new C1860260yVc(c1860270yVd);
                    if (Build.VERSION.SDK_INT >= 29) {
                        C13MK.LIZLLL(new AwS571S0100000_27(c1860260yVc, (Function0<Unit>) 1110));
                    }
                }
            }

            @Override // X.InterfaceC2247911Cyb
            public final void LIZIZ(boolean z) {
                InterfaceC1859950yV7 textSelector2;
                this.LIZ.LJII.dismiss();
                if (z) {
                    InterfaceC1860040yVG interfaceC1860040yVG3 = this.LIZ.LIZ;
                    if (interfaceC1860040yVG3 != null) {
                        interfaceC1860040yVG3.LJIILLIIL();
                    }
                    C1859960yV8 c1859960yV8 = this.LIZ;
                    AbstractC1585810rMx abstractC1585810rMx = c1859960yV8.LIZLLL;
                    if (abstractC1585810rMx != null) {
                        c1859960yV8.LIZJ.removeOnScrollListener(abstractC1585810rMx);
                    }
                    InterfaceC1860040yVG interfaceC1860040yVG4 = this.LIZ.LIZ;
                    if (interfaceC1860040yVG4 != null && (textSelector2 = interfaceC1860040yVG4.getTextSelector()) != null) {
                        textSelector2.LJ(null);
                    }
                }
            }
        };
        InterfaceC1860040yVG interfaceC1860040yVG3 = this.LIZ;
        if (interfaceC1860040yVG3 != null) {
            interfaceC1860040yVG3.LJIILLIIL();
        }
        InterfaceC1860040yVG interfaceC1860040yVG4 = this.LIZ;
        if (interfaceC1860040yVG4 != null) {
            interfaceC1860040yVG4.LJ(interfaceC2248331CzH);
        }
        InterfaceC1860040yVG interfaceC1860040yVG5 = this.LIZ;
        if (interfaceC1860040yVG5 != null && (textSelector = interfaceC1860040yVG5.getTextSelector()) != null) {
            textSelector.LJ(interfaceC2247911Cyb);
        }
        AbstractC1585810rMx abstractC1585810rMx = this.LIZLLL;
        if (abstractC1585810rMx != null) {
            this.LIZJ.addOnScrollListener(abstractC1585810rMx);
        }
        this.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4));
    }
}
