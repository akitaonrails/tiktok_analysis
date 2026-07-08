package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS28S0101000_17;
import android.animation.AnimatorSet;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fQ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1126460fQ4 extends AbstractC1126590fQH {
    public C16F5 LLJJJ;
    public ImageView LLJJJIL;
    public C1324720kZq LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public C520690KbT LLJJJJLIIL;
    public LinearLayout LLJJL;
    public C16F5 LLJJLIIIJLLLLLLLZ;
    public AnimatorSet LLJL;
    public C1143100fqu LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public AnimatorSet LLJLL;

    @Override // X.AbstractC1126590fQH
    public final boolean R5() {
        AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
        if (!((abstractC1126600fQI != null ? abstractC1126600fQI.LIZIZ : null) instanceof Gift)) {
            return false;
        }
        ImageModel imageModel = ((Gift) (abstractC1126600fQI != null ? abstractC1126600fQI.LIZIZ : null)).previewImage;
        return (imageModel == null || C842240X2g.LIZ(imageModel) == null || C842240X2g.LIZ(imageModel).size() <= 0) ? false : true;
    }

    public final C1324720kZq e6() {
        C1324720kZq c1324720kZq = this.LLJJJJ;
        if (c1324720kZq != null) {
            return c1324720kZq;
        }
        return null;
    }

    public final C16F5 f6() {
        C16F5 c16f5 = this.LLJJJ;
        if (c16f5 != null) {
            return c16f5;
        }
        return null;
    }

    @Override // X.AbstractC1126590fQH
    public final void V5() {
        super.V5();
        C500260Jjc.LLFFF(e6());
        R5();
        C1324720kZq c1324720kZq = this.LLILZIL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        f6().setTextColor(C497740JfY.LJFF(R.color.f569bc));
        LinearLayout linearLayout = this.LLJJJJJIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C500260Jjc.LJIILIIL(linearLayout);
        C520690KbT c520690KbT = this.LLJJJJLIIL;
        if (c520690KbT == null) {
            c520690KbT = null;
        }
        C500260Jjc.LJIILIIL(c520690KbT);
        AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
        if (C1127580fRs.LIZLLL(abstractC1126600fQI != null ? Long.valueOf(abstractC1126600fQI.LJFF()) : null)) {
            AnimatorSet animatorSet = this.LLJLL;
            if (animatorSet == null) {
                this.LLJLL = C1127580fRs.LIZ(this.LLJJL, this.LLJJLIIIJLLLLLLLZ);
            } else {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.LLJLL;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1126590fQH
    public final void W5() {
        AbstractC1126600fQI<?> abstractC1126600fQI;
        super.W5();
        C1324720kZq c1324720kZq = this.LLILZIL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
        }
        C500260Jjc.LJIILIIL(e6());
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        f6().setTextColor(C497740JfY.LJFF(R.color.be));
        LinearLayout linearLayout = this.LLJJJJJIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C500260Jjc.LLFFF(linearLayout);
        AbstractC1126600fQI<?> abstractC1126600fQI2 = this.LLIZLLLIL;
        if (abstractC1126600fQI2 != null && !abstractC1126600fQI2.LJIJJ() && (abstractC1126600fQI = this.LLIZLLLIL) != null && abstractC1126600fQI.LJJ()) {
            C520690KbT c520690KbT = this.LLJJJJLIIL;
            if (c520690KbT == null) {
                c520690KbT = null;
            }
            C500260Jjc.LLFFF(c520690KbT);
        }
        AbstractC1126600fQI<?> abstractC1126600fQI3 = this.LLIZLLLIL;
        if (abstractC1126600fQI3 != null) {
            h6(abstractC1126600fQI3);
        }
        AnimatorSet animatorSet = this.LLJLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJLL = null;
    }

    public C1126460fQ4(View view) {
        super(view);
        this.LLJJJJ = (C1324720kZq) this.LL.findViewById(R.id.iwx);
        this.LLJJL = (LinearLayout) this.LL.findViewById(R.id.iwg);
        this.LLJJJ = (C16F5) this.LL.findViewById(R.id.p6n);
        this.LLJJJIL = (ImageView) this.LL.findViewById(R.id.e3l);
        this.LLJJJJJIL = (LinearLayout) this.LL.findViewById(R.id.iyk);
        this.LLJJLIIIJLLLLLLLZ = (C16F5) this.LL.findViewById(R.id.iwi);
        this.LLJJJJLIIL = (C520690KbT) this.LL.findViewById(R.id.xw8);
        f6().setTypeface(C1119920fFW.LIZJ(f6().getTextSize(), 500, this.LL.getContext()));
        C16F5 c16f5 = this.LLJJLIIIJLLLLLLLZ;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(f6().getTextSize(), 500, this.LL.getContext()));
        }
        this.LLJLIL = (C1143100fqu) this.LL.findViewById(R.id.o24);
        this.LLJLILLLLZIIL = (C16F5) this.LL.findViewById(R.id.z47);
    }

    @Override // X.AbstractC1126590fQH
    public final void P5(int i) {
        Long lValueOf;
        AbstractC1126600fQI<?> abstractC1126600fQI;
        C1324720kZq c1324720kZq;
        C1125920fPC c1125920fPCLIZ;
        this.LLJJIJIIJIL = true;
        C1125860fP6 c1125860fP6 = C1125820fP2.LJFF().LIZ;
        Long lValueOf2 = null;
        if (c1125860fP6 != null && (c1125920fPCLIZ = c1125860fP6.LIZ()) != null) {
            lValueOf = Long.valueOf(c1125920fPCLIZ.LIZ);
        } else {
            lValueOf = null;
        }
        AbstractC1126600fQI<?> abstractC1126600fQI2 = this.LLIZLLLIL;
        if (abstractC1126600fQI2 != null) {
            lValueOf2 = Long.valueOf(abstractC1126600fQI2.LJI());
        }
        boolean zLJFF = Intrinsics.LJFF(lValueOf, lValueOf2);
        if (this.LLJJIJIIJIL && (abstractC1126600fQI = this.LLIZLLLIL) != null && !abstractC1126600fQI.LIZJ && zLJFF && (c1324720kZq = this.LLILZIL) != null) {
            HandlerHook.viewPost(c1324720kZq, new ARunnableS28S0101000_17(i, this, 14));
        }
    }

    @Override // X.AbstractC1126590fQH
    public final void S5(int i) {
        Gift gift;
        AbstractC1126600fQI<?> abstractC1126600fQI = this.LLIZLLLIL;
        Object obj = null;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        }
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null) {
            ImageModel imageModel = gift.previewImage;
            if (R5() && imageModel != null) {
                final long j = gift.id;
                C1325710kbR[] c1325710kbRArrLIZ = C1121670fIL.LIZ(imageModel);
                if (c1325710kbRArrLIZ != null && c1325710kbRArrLIZ.length != 0) {
                    C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                    c1320810kTXLIZJ.LJFF(c1325710kbRArrLIZ, true);
                    c1320810kTXLIZJ.LJIIJJI = true;
                    c1320810kTXLIZJ.LJIILJJIL = e6().getController();
                    c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0fQT
                        @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                        public final void LIZLLL(String str, Throwable th) {
                            String message;
                            if (th == null || (message = th.getMessage()) == null) {
                                message = "Download Error";
                            }
                            C1126720fQU c1126720fQU = C1126810fQd.LIZ;
                            long j2 = j;
                            c1126720fQU.getClass();
                            C1126720fQU.LIZIZ(j2, message);
                        }

                        @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                        public final void LJFF(Object obj2, String str) {
                            C1126810fQd.LIZ.LIZ(j);
                        }

                        @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                        public final void LJ(String str, Object obj2, Animatable animatable) {
                            AbstractC1126600fQI<?> abstractC1126600fQILJIIIIZZ;
                            AbstractC1327750kej abstractC1327750kej;
                            C1324720kZq c1324720kZq;
                            InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj2;
                            C1126460fQ4 c1126460fQ4 = this;
                            c1126460fQ4.getClass();
                            InterfaceC1126640fQM interfaceC1126640fQM = c1126460fQ4.LLJ;
                            Boolean boolValueOf = null;
                            if (interfaceC1126640fQM != null) {
                                abstractC1126600fQILJIIIIZZ = interfaceC1126640fQM.LJIIIIZZ();
                            } else {
                                abstractC1126600fQILJIIIIZZ = null;
                            }
                            C1126460fQ4 c1126460fQ42 = this;
                            if (abstractC1126600fQILJIIIIZZ == c1126460fQ42.LLIZLLLIL && (c1324720kZq = c1126460fQ42.LLILZIL) != null) {
                                C786410Ut5.LLJJIII(c1324720kZq, 8);
                            }
                            if ((interfaceC1330440kj4 instanceof AbstractC1327750kej) && (abstractC1327750kej = (AbstractC1327750kej) interfaceC1330440kj4) != null) {
                                boolValueOf = Boolean.valueOf(abstractC1327750kej.isHitEncodeMemoryCache);
                            }
                            C1126810fQd.LIZ.LIZJ(j, boolValueOf);
                        }
                    };
                    e6().setController(c1320810kTXLIZJ.LIZ());
                }
            } else {
                C0JSS.LIZLLL(e6(), gift.image);
            }
        }
        super.S5(i);
    }

    public final void h6(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        boolean z;
        boolean z2 = true;
        if (Long.valueOf(abstractC1126600fQI.LJ()) != null) {
            z = true;
        } else {
            z = false;
        }
        C520690KbT c520690KbT = null;
        if (z && abstractC1126600fQI.LJ() > 0) {
            if (abstractC1126600fQI.LJIJJ() || Long.valueOf(abstractC1126600fQI.LJ()) == null || abstractC1126600fQI.LJ() <= 0) {
                z2 = false;
            }
            long jLJ = abstractC1126600fQI.LJ();
            boolean z3 = abstractC1126600fQI.LIZJ;
            C520690KbT c520690KbT2 = this.LLJJJJLIIL;
            if (c520690KbT2 != null) {
                c520690KbT = c520690KbT2;
            }
            if (z2 && !z3) {
                c520690KbT.LIZ(jLJ);
                C500260Jjc.LLFFF(c520690KbT);
                return;
            } else {
                C500260Jjc.LJIILIIL(c520690KbT);
                return;
            }
        }
        if (abstractC1126600fQI.LJIJJ() || !abstractC1126600fQI.LJJ() || abstractC1126600fQI.LIZJ) {
            z2 = false;
        }
        long j = abstractC1126600fQI.LJIIL;
        boolean z4 = abstractC1126600fQI.LIZJ;
        C520690KbT c520690KbT3 = this.LLJJJJLIIL;
        if (c520690KbT3 != null) {
            c520690KbT = c520690KbT3;
        }
        if (z2 && !z4) {
            c520690KbT.LIZ(j);
            C500260Jjc.LLFFF(c520690KbT);
        } else {
            C500260Jjc.LJIILIIL(c520690KbT);
        }
    }

    @Override // X.AbstractC1126590fQH
    public void L5(AbstractC1126600fQI<?> abstractC1126600fQI, DataChannel dataChannel, int i, int i2) {
        AbstractC1126600fQI<?> abstractC1126600fQILJIIIIZZ;
        AbstractC1126600fQI<?> abstractC1126600fQILJIIIIZZ2;
        AbstractC293401Bs abstractC293401Bs;
        Integer numValueOf;
        AbstractC293401Bs abstractC293401Bs2;
        C1324720kZq c1324720kZq;
        AnimatorSet animatorSet = this.LLJL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        super.L5(abstractC1126600fQI, dataChannel, i, i2);
        C500260Jjc.LJIILIIL(e6());
        InterfaceC1126640fQM interfaceC1126640fQM = this.LLJ;
        Long lValueOf = null;
        if (interfaceC1126640fQM != null) {
            abstractC1126600fQILJIIIIZZ = interfaceC1126640fQM.LJIIIIZZ();
        } else {
            abstractC1126600fQILJIIIIZZ = null;
        }
        if (abstractC1126600fQILJIIIIZZ == abstractC1126600fQI) {
            C1324720kZq c1324720kZq2 = this.LLILZIL;
            if (c1324720kZq2 != null) {
                C786410Ut5.LLJJIII(c1324720kZq2, 8);
            }
            C500260Jjc.LLFFF(e6());
        }
        InterfaceC1126640fQM interfaceC1126640fQM2 = this.LLJ;
        if (interfaceC1126640fQM2 != null && interfaceC1126640fQM2.LLLFFI(abstractC1126600fQI.LJI()) && !R5() && (c1324720kZq = this.LLILZIL) != null) {
            HandlerHook.viewPostDelay(c1324720kZq, new ARunnableS117S0100000_17(this, 288), 50L);
        }
        if (this.LLILZ != null) {
            LinearLayout linearLayout = this.LLJJJJJIL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C500260Jjc.LLFFF(linearLayout);
        }
        InterfaceC1126640fQM interfaceC1126640fQM3 = this.LLJ;
        if (interfaceC1126640fQM3 != null) {
            abstractC1126600fQILJIIIIZZ2 = interfaceC1126640fQM3.LJIIIIZZ();
        } else {
            abstractC1126600fQILJIIIIZZ2 = null;
        }
        if (abstractC1126600fQILJIIIIZZ2 == abstractC1126600fQI && this.LLILZ != null) {
            LinearLayout linearLayout2 = this.LLJJJJJIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C500260Jjc.LJIILIIL(linearLayout2);
        }
        AbstractC1126600fQI<?> abstractC1126600fQI2 = this.LLIZLLLIL;
        if (abstractC1126600fQI2 instanceof C1126040fPO) {
            abstractC293401Bs = (AbstractC293401Bs) abstractC1126600fQI2;
        } else {
            abstractC293401Bs = null;
        }
        ImageView imageView = this.LLJJJIL;
        if (imageView == null) {
            imageView = null;
        }
        C500260Jjc.LLFFF(imageView);
        C16F5 c16f5F6 = f6();
        Object[] objArr = new Object[1];
        if (abstractC293401Bs != null) {
            numValueOf = Integer.valueOf(abstractC293401Bs.LJJIIJZLJL());
        } else {
            numValueOf = null;
        }
        objArr[0] = String.valueOf(numValueOf);
        c16f5F6.setText(C497740JfY.LJIJJ(2131853450, objArr));
        if (C1127580fRs.LIZLLL(Long.valueOf(abstractC1126600fQI.LJFF()))) {
            AbstractC1126600fQI<?> abstractC1126600fQI3 = this.LLIZLLLIL;
            if (abstractC1126600fQI3 != null) {
                lValueOf = Long.valueOf(abstractC1126600fQI3.LJFF());
            }
            if (C1127580fRs.LIZLLL(lValueOf)) {
                AbstractC1126600fQI<?> abstractC1126600fQI4 = this.LLIZLLLIL;
                if ((abstractC1126600fQI4 instanceof C1126040fPO) && (abstractC293401Bs2 = (AbstractC293401Bs) abstractC1126600fQI4) != null) {
                    C1127580fRs.LIZJ(abstractC293401Bs2.LJJIIJZLJL(), new AwS596S0100000_17(this, 684));
                }
            }
        }
        h6(abstractC1126600fQI);
        C500260Jjc.LJIILIIL(this.LLJLILLLLZIIL);
        C1126650fQN.LIZ(e6());
    }
}
