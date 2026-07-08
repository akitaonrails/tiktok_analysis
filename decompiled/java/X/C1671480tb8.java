package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671480tb8 extends C09AY implements InterfaceC1631630sYr<InterfaceC1691190u6v, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ C1683130ttv LLILLL;
    public final /* synthetic */ PurePreviewMediaEngine LLILZ;
    public final /* synthetic */ C05P1<Integer> LLILZIL;
    public final /* synthetic */ C05P0<EnumC1360305Ub> LLILZLL;
    public final /* synthetic */ C05ZL LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1671480tb8(SocialMediaPickerViewModel socialMediaPickerViewModel, Function1<? super String, Unit> function1, C1683130ttv c1683130ttv, PurePreviewMediaEngine purePreviewMediaEngine, C05P1<Integer> c05p1, C05P0<EnumC1360305Ub> c05p0, C05ZL c05zl) {
        super(4);
        this.LL = socialMediaPickerViewModel;
        this.LLILLJJLI = function1;
        this.LLILLL = c1683130ttv;
        this.LLILZ = purePreviewMediaEngine;
        this.LLILZIL = c05p1;
        this.LLILZLL = c05p0;
        this.LLIZ = c05zl;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(InterfaceC1691190u6v interfaceC1691190u6v, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        boolean z;
        int iIntValue = num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        num2.intValue();
        SocMediaResource socMediaResource = (SocMediaResource) ListProtector.get(this.LL.xQ2().LIZ, iIntValue);
        boolean z2 = true;
        if (socMediaResource.LIZJ()) {
            interfaceC1680500tpg2.LJJIIJZLJL(1087606223);
            if (this.LLILZIL.getValue().intValue() == iIntValue) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            C05P0<EnumC1360305Ub> c05p0 = this.LLILZLL;
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new AwS604S0100000_25((C05P0) c05p0, (C05P0<Boolean>) 247);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJJIIJ = interfaceC1680500tpg2.LJJIIJ(this.LLILLJJLI);
            Function1<String, Unit> function12 = this.LLILLJJLI;
            Object objLJJ2 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS591S0100000_12(function12, (Function1<? super LiveEffect, Unit>) 646);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
            }
            Function1 function13 = (Function1) objLJJ2;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            C05ZL c05zl = this.LLIZ;
            Object objLJJ3 = interfaceC1680500tpg2.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS604S0100000_25(c05zl, 248);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ3);
            }
            interfaceC1680500tpg2.LJ();
            C1671460tb6.LIZJ(socMediaResource, function1, function13, (Function1) objLJJ3, z, this.LLILLL, this.LLILZ, false, interfaceC1680500tpg2, 1575984, 128);
            interfaceC1680500tpg2.LJ();
        } else {
            interfaceC1680500tpg2.LJJIIJZLJL(1088108330);
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            C05P0<EnumC1360305Ub> c05p02 = this.LLILZLL;
            Object objLJJ4 = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi2 = C1680510tph.LIZIZ;
            if (objLJJ4 == c1680520tpi2) {
                objLJJ4 = new AwS604S0100000_25((C05P0) c05p02, (C05P0<Boolean>) 249);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ4);
            }
            Function1 function14 = (Function1) objLJJ4;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJJIIJ2 = interfaceC1680500tpg2.LJJIIJ(this.LLILLJJLI);
            Function1<String, Unit> function15 = this.LLILLJJLI;
            Object objLJJ5 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ2 || objLJJ5 == c1680520tpi2) {
                objLJJ5 = new AwS591S0100000_12(function15, (Function1<? super LiveEffect, Unit>) 647);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ5);
            }
            Function1 function16 = (Function1) objLJJ5;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            C05ZL c05zl2 = this.LLIZ;
            Object objLJJ6 = interfaceC1680500tpg2.LJJ();
            if (objLJJ6 == c1680520tpi2) {
                objLJJ6 = new AwS604S0100000_25(c05zl2, 250);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ6);
            }
            Function1 function17 = (Function1) objLJJ6;
            interfaceC1680500tpg2.LJ();
            C1683130ttv c1683130ttv = this.LLILLL;
            if (this.LLILZIL.getValue().intValue() != iIntValue) {
                z2 = false;
            }
            C1671460tb6.LJII(socMediaResource, function14, function16, function17, c1683130ttv, z2, this.LLILZ, interfaceC1680500tpg2, 1575984);
            interfaceC1680500tpg2.LJ();
        }
        return Unit.LIZ;
    }
}
