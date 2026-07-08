package X;

import Y.ARunnableS117S0100000_17;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS561S0100000_17;
import u4.q0;

/* JADX INFO: renamed from: X.0fPE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125940fPE extends AbstractC1126560fQE {
    public final View LLLILZ;
    public final String LLLILZJ;
    public final C1143100fqu LLLILZLLLI;
    public final C16F5 LLLIZZ;
    public AnimatorSet LLLJ;
    public final String LLLJIL;

    @Override // X.AbstractC1126560fQE
    public final void U5(int i) {
    }

    @Override // X.AbstractC1126560fQE
    public final void u6() {
    }

    public final void C6() {
        Gift gift;
        Gift gift2;
        LinkedList<Integer> linkedListLIZ;
        InterfaceC1126580fQG interfaceC1126580fQG;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI != null && (interfaceC1126580fQG = this.LLJL) != null) {
            interfaceC1126580fQG.LJJIII(abstractC1126600fQI);
        }
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        Object obj = abstractC1126600fQI2 != null ? abstractC1126600fQI2.LIZIZ : null;
        if ((obj instanceof Gift) && (gift2 = (Gift) obj) != null && ((gift2.LJIIIIZZ() || gift2.LJII()) && (linkedListLIZ = InterfaceC1094160eZy.Z1.LIZ()) != null && !linkedListLIZ.isEmpty())) {
            LinkedList<Integer> linkedListLIZ2 = InterfaceC1094160eZy.a2.LIZ();
            if (linkedListLIZ2 == null) {
                linkedListLIZ2 = new LinkedList<>();
            }
            Iterator<Integer> it2 = linkedListLIZ.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                if (!linkedListLIZ2.contains(Integer.valueOf(iIntValue))) {
                    linkedListLIZ2.add(Integer.valueOf(iIntValue));
                }
            }
            InterfaceC1094160eZy.a2.LIZJ(linkedListLIZ2);
            InterfaceC1094160eZy.Z1.LIZJ(new LinkedList<>());
        }
        C293001Bo c293001BoZ6 = z6(this.LLJJLIIIJLLLLLLLZ);
        if (c293001BoZ6 == null || (gift = (Gift) c293001BoZ6.LIZIZ) == null) {
            return;
        }
        C784440Upu.LIZ().LIZIZ(new C1125930fPD(gift));
    }

    @Override // X.AbstractC1126560fQE
    public final void h6() {
        q0.LJIJ(this.LLLILZ, new C1151960g5C(this, 6));
    }

    @Override // X.AbstractC1126560fQE
    public final void i6() {
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            c16f5.setImportantForAccessibility(1);
        }
        C1324720kZq c1324720kZq = this.LLJILLL;
        if (c1324720kZq != null) {
            c1324720kZq.setImportantForAccessibility(2);
        }
        C16F5 c16f52 = this.LLLIZZ;
        if (c16f52 != null) {
            c16f52.setContentDescription(c16f52.getText());
        }
        C16F5 c16f53 = this.LLLIZZ;
        if (c16f53 != null) {
            c16f53.setImportantForAccessibility(1);
        }
        ImageView imageView = this.LLILZ;
        if (imageView != null) {
            imageView.setImportantForAccessibility(2);
        }
    }

    @Override // X.AbstractC1126560fQE
    public final void e6() {
        super.e6();
        AnimatorSet animatorSet = this.LLLJ;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.LLLJ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        if (this.LLLJ != null) {
            C1143100fqu c1143100fqu = this.LLLILZLLLI;
            if (c1143100fqu != null) {
                c1143100fqu.LJFF();
            }
            C1143100fqu c1143100fqu2 = this.LLLILZLLLI;
            if (c1143100fqu2 != null) {
                C500260Jjc.LJIILIIL(c1143100fqu2);
            }
        }
    }

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLILZJ;
    }

    public C1125940fPE(View view) {
        super(view);
        this.LLLILZ = view;
        this.LLLILZJ = "LiveGiftSchemeEntranceViewHolder";
        this.LLLJIL = C497740JfY.LJIJI(2131840820);
        new AwS561S0100000_17(this, 334);
        new AwS561S0100000_17(this, 335);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.p6q);
        this.LLLIZZ = (C16F5) view.findViewById(R.id.j08);
        this.LLILZ = (ImageView) view.findViewById(R.id.mk_);
        this.LLLILZLLLI = (C1143100fqu) view.findViewById(R.id.o24);
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            C1119920fFW.LIZJ(c16f5.getTextSize(), 500, view.getContext());
        }
    }

    public static C293001Bo z6(AbstractC1126600fQI abstractC1126600fQI) {
        if (abstractC1126600fQI instanceof C293001Bo) {
            return (C293001Bo) abstractC1126600fQI;
        }
        return null;
    }

    @Override // X.AbstractC1126560fQE
    public final void S5(int i) {
        Boolean boolValueOf;
        View view;
        this.LLLFFI = true;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI != null) {
            boolValueOf = Boolean.valueOf(abstractC1126600fQI.LJIJJLI);
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf) && (view = this.itemView) != null) {
            HandlerHook.viewPost(view, new ARunnableS117S0100000_17(this, 160));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    @Override // X.AbstractC1126560fQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(final X.AbstractC1126600fQI<? extends X.AnonymousClass0054> r9, com.bytedance.ies.sdk.datachannel.DataChannel r10, final int r11) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125940fPE.N5(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }
}
