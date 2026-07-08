package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0M9L, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M9L extends C09AY implements InterfaceC1631630sYr<InterfaceC1691180u6u, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List LL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLJJLI;
    public final /* synthetic */ Function2 LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M9L(List list, SocialMediaPickerViewModel socialMediaPickerViewModel, Function2 function2, float f, float f2) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = socialMediaPickerViewModel;
        this.LLILLL = function2;
        this.LLILZ = f;
        this.LLILZIL = f2;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1691180u6u interfaceC1691180u6u, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int i;
        boolean z;
        int i2;
        int i3;
        int iIntValue = num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1691180u6u)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg2.LJIJI(iIntValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg2.LJIJJLI(i & 1, z)) {
            int i4 = i & 14;
            SocMediaResource socMediaResource = (SocMediaResource) ListProtector.get(this.LL, iIntValue);
            interfaceC1680500tpg2.LJJIIJZLJL(641630720);
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJ(new AwS409S0200000_8(this.LLILLJJLI, socMediaResource, 62));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg2.LJ();
            C1669630tY9 c1669630tY9 = (C1669630tY9) ((C05P1) objLJJ).getValue();
            SocialMediaPickerViewModel socialMediaPickerViewModel = this.LLILLJJLI;
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJII = interfaceC1680500tpg2.LJII(this.LLILLJJLI);
            Object objLJJ2 = interfaceC1680500tpg2.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS622S0100000_8(this.LLILLJJLI, 21);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
            }
            Function2 function2 = (Function2) objLJJ2;
            interfaceC1680500tpg2.LJ();
            Function2 function22 = this.LLILLL;
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJII2 = interfaceC1680500tpg2.LJII(this.LLILLJJLI);
            Object objLJJ3 = interfaceC1680500tpg2.LJJ();
            if (zLJII2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS587S0100000_8(this.LLILLJJLI, 278);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ3);
            }
            Function1 function1 = (Function1) objLJJ3;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJII3 = interfaceC1680500tpg2.LJII(this.LLILLJJLI);
            Object objLJJ4 = interfaceC1680500tpg2.LJJ();
            if (zLJII3 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS622S0100000_8(this.LLILLJJLI, 22);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ4);
            }
            interfaceC1680500tpg2.LJ();
            C1669600tY6.LIZ(socMediaResource, c1669630tY9, socialMediaPickerViewModel, function2, function22, function1, (Function2) objLJJ4, this.LLILZ, this.LLILZIL, interfaceC1680500tpg2, (i4 >> 3) & 14);
            interfaceC1680500tpg2.LJ();
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
