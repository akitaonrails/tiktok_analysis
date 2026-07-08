package X;

import Y.ACListenerS128S0200000_26;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.pipo.stellar.base.adapter.internal.GuideDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0usi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720820usi extends AbstractC1720840usk<GuideDO> implements InterfaceC1720830usj {
    public Function1<? super View, Unit> LLILZ;

    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adr;
    }

    @Override // X.InterfaceC1720830usj
    public final void LIZ(Function1<? super View, Unit> function1) {
        this.LLILZ = function1;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, GuideDO guideDO, EnumC1720670usT enumC1720670usT) {
        InterfaceC1720050urT interfaceC1720050urT;
        InterfaceC1720050urT interfaceC1720050urT2;
        Integer numValueOf;
        Integer numValueOf2;
        Float fLJIIIIZZ;
        Float fLJIIIIZZ2;
        InterfaceC1720050urT interfaceC1720050urT3;
        Float fLJIIIIZZ3;
        Float fLJIIIIZZ4;
        GuideDO guideDO2 = guideDO;
        super.LJFF(view, guideDO2, enumC1720670usT);
        ImageView imageView = (ImageView) view.findViewById(R.id.vym);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.h4q);
        ImageDO imageDO = guideDO2.startIcon;
        Integer numValueOf3 = null;
        if (imageDO == null) {
            C786410Ut5.LJZI(8, imageView);
        } else {
            C786410Ut5.LJZI(0, imageView);
            C1721300utU c1721300utU = C1721300utU.LIZ;
            C1720760usc c1720760usc = this.LL;
            if (c1720760usc != null) {
                interfaceC1720050urT = c1720760usc.LIZIZ;
            } else {
                interfaceC1720050urT = null;
            }
            c1721300utU.getClass();
            C1721300utU.LJIJI(imageView, imageDO, interfaceC1720050urT);
        }
        ImageDO imageDO2 = guideDO2.endIcon;
        if (imageDO2 == null) {
            C786410Ut5.LJZI(8, imageView2);
        } else {
            C786410Ut5.LJZI(0, imageView2);
            C1721300utU c1721300utU2 = C1721300utU.LIZ;
            C1720760usc c1720760usc2 = this.LL;
            if (c1720760usc2 != null) {
                interfaceC1720050urT2 = c1720760usc2.LIZIZ;
            } else {
                interfaceC1720050urT2 = null;
            }
            c1721300utU2.getClass();
            C1721300utU.LJIJI(imageView2, imageDO2, interfaceC1720050urT2);
        }
        String str = guideDO2.startPadding;
        if (str != null && (fLJIIIIZZ4 = C2327809Ae.LJIIIIZZ(str)) != null) {
            numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLJIIIIZZ4)));
        } else {
            numValueOf = null;
        }
        Integer numValueOf4 = null;
        C426750GoL.LJIIL(imageView, null, null, numValueOf, null, 27);
        String str2 = guideDO2.endPadding;
        if (str2 != null && (fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(str2)) != null) {
            numValueOf4 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLJIIIIZZ3)));
        }
        C426750GoL.LJIIL(imageView2, numValueOf4, null, null, null, 30);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.eu1);
        TextDO textDO = guideDO2.text;
        if (textDO != null) {
            C1721300utU c1721300utU3 = C1721300utU.LIZ;
            C1720760usc c1720760usc3 = this.LL;
            if (c1720760usc3 != null) {
                interfaceC1720050urT3 = c1720760usc3.LIZIZ;
            } else {
                interfaceC1720050urT3 = null;
            }
            c1721300utU3.getClass();
            C1721300utU.LJIL(interfaceC1720050urT3, textDO, tuxTextView);
        }
        String str3 = guideDO2.startPadding;
        if (str3 != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(str3)) != null) {
            numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLJIIIIZZ2)));
        } else {
            numValueOf2 = null;
        }
        String str4 = guideDO2.endPadding;
        if (str4 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str4)) != null) {
            numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLJIIIIZZ)));
        }
        C426750GoL.LJIIL(tuxTextView, numValueOf2, null, numValueOf3, null, 26);
        C786410Ut5.Q7(imageView2, new ACListenerS128S0200000_26(this, view, 22));
    }
}
