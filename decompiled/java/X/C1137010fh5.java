package X;

import Y.AAListenerS328S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137010fh5 implements InterfaceC1137410fhj {
    public final /* synthetic */ C1136990fh3 LIZ;

    @Override // X.InterfaceC1137410fhj
    public final void LJFF() {
    }

    @Override // X.InterfaceC1137410fhj
    public final void LIZ() {
        GiftMessage giftMessage;
        ArrayList<InterfaceC1137250fhT> arrayList;
        C1136990fh3 c1136990fh3 = this.LIZ;
        if (c1136990fh3.LLJILLL) {
            return;
        }
        c1136990fh3.LJIJJ(-C497820Jfg.LIZIZ(c1136990fh3.getContext()));
        C1137360fhe sectionMediator = this.LIZ.getSectionMediator();
        if (sectionMediator != null && (arrayList = sectionMediator.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILLIIL().LIZ();
            }
        }
        InterfaceC1137430fhl interfaceC1137430fhl = this.LIZ.LL;
        if (interfaceC1137430fhl != null) {
            interfaceC1137430fhl.LIZJ();
        }
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        C1135810ff9 giftMsg = this.LIZ.getGiftMsg();
        Gift gift = (giftMsg == null || (giftMessage = giftMsg.LIZ) == null) ? null : giftMessage.mGift;
        c1133690fbj.getClass();
        if (C1133690fbj.LJI(gift)) {
            return;
        }
        this.LIZ.LJIJ();
    }

    @Override // X.InterfaceC1137410fhj
    public final void LIZIZ() {
        ArrayList<InterfaceC1137250fhT> arrayList;
        C1136990fh3 c1136990fh3 = this.LIZ;
        if (c1136990fh3.LLJILLL) {
            return;
        }
        InterfaceC1137430fhl interfaceC1137430fhl = c1136990fh3.LL;
        if (interfaceC1137430fhl != null) {
            c1136990fh3.getGiftMsg();
            interfaceC1137430fhl.LIZLLL();
        }
        C1137360fhe sectionMediator = this.LIZ.getSectionMediator();
        if (sectionMediator != null && (arrayList = sectionMediator.LJ) != null) {
            Iterator<InterfaceC1137250fhT> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILLIIL().LIZIZ();
            }
        }
        this.LIZ.LJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    @Override // X.InterfaceC1137410fhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1137010fh5.LIZJ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    @Override // X.InterfaceC1137410fhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1137010fh5.LIZLLL():void");
    }

    @Override // X.InterfaceC1137410fhj
    public final void LJ() {
        if (this.LIZ.LLJILLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("combAnimationEnd ");
        sbLIZ.append(this.LIZ.LLILZLL);
        C1138230fj3.LIZJ("LiveGiftTrayViewV3", C2188811AlT.LIZIZ(sbLIZ));
        C1136990fh3 c1136990fh3 = this.LIZ;
        c1136990fh3.LLILZLL++;
        if (!c1136990fh3.LJIIIIZZ()) {
            C1136990fh3 c1136990fh32 = this.LIZ;
            InterfaceC1137430fhl interfaceC1137430fhl = c1136990fh32.LL;
            if (interfaceC1137430fhl != null) {
                interfaceC1137430fhl.LIZ(c1136990fh32.getGiftMsg());
                return;
            }
            return;
        }
        C1136990fh3 c1136990fh33 = this.LIZ;
        c1136990fh33.getClass();
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(c1136990fh33, 38);
        AwS561S0100000_17 awS561S0100000_172 = new AwS561S0100000_17(c1136990fh33, 39);
        ObjectAnimator duration = ObjectAnimator.ofFloat(c1136990fh33, (Property<C1136990fh3, Float>) View.TRANSLATION_X, c1136990fh33.getX(), c1136990fh33.getX() - (c1136990fh33.getMeasuredWidth() * C1136970fh1.LJFF())).setDuration(200L);
        duration.addListener(new AAListenerS328S0100000_17(awS561S0100000_17, 16));
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(0L);
        duration2.setStartDelay(200L);
        duration2.addListener(new AAListenerS328S0100000_17(awS561S0100000_172, 17));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        c1136990fh33.getGiftTrayAnimationManager().LIZJ = animatorSet;
    }

    public C1137010fh5(C1136990fh3 c1136990fh3) {
        this.LIZ = c1136990fh3;
    }
}
