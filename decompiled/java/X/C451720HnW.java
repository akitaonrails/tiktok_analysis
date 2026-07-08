package X;

import android.app.Activity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addressitem.UsAddressItemCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451720HnW extends C09AY implements Function0<AddressListAssemViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ UsAddressItemCell LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(UsAddressItemCell.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451720HnW(UsAddressItemCell usAddressItemCell) {
        super(0);
        this.LL = usAddressItemCell;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final AddressListAssemViewModel invoke() {
        AssemVMLazy assemVMLazy;
        UsAddressItemCell usAddressItemCell = this.LL;
        Object obj = usAddressItemCell.getCurrentLifecycleOwner() instanceof Activity ? C01D1.LIZ : C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressListAssemViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 616);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(539);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 1570), c5182020e, AFwS192S0000000_6.get$arr$(585), new AwS550S0100000_6((C03K6) usAddressItemCell, 1546), new AwS550S0100000_6((C03K6) usAddressItemCell, 1548), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) usAddressItemCell, 1550), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) usAddressItemCell, 1552), null, new AwS550S0100000_6((C03K6) usAddressItemCell, 1553));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((C03K6) usAddressItemCell, 1547);
            AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) usAddressItemCell, 1549);
            AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6(c19719912DlLIZ, 1551);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_6, 110));
            AwS550S0100000_6 awS550S0100000_64 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1554);
            AwS550S0100000_6 awS550S0100000_65 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1555);
            AwS550S0100000_6 awS550S0100000_66 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1556);
            AwS550S0100000_6 awS550S0100000_67 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1557);
            AwS550S0100000_6 awS550S0100000_68 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1558);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS550S0100000_63, c5182020e, new C452080Ho6(), awS550S0100000_64, awS550S0100000_65, awS550S0100000_62, aFwS236S0000000_6, awS550S0100000_66, awS550S0100000_67, awS550S0100000_68);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 1559), c5182020e, AFwS192S0000000_6.get$arr$(583), new AwS550S0100000_6((C03K6) usAddressItemCell, 1560), new AwS550S0100000_6((C03K6) usAddressItemCell, 1561), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) usAddressItemCell, 1562), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) usAddressItemCell, 1563), null, new AwS550S0100000_6((C03K6) usAddressItemCell, 1564));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 1565), c5182020e, AFwS192S0000000_6.get$arr$(584), new AwS550S0100000_6((C03K6) usAddressItemCell, 1566), new AwS550S0100000_6((C03K6) usAddressItemCell, 1567), new AwS550S0100000_6((C03K6) usAddressItemCell, 1568), aFwS236S0000000_6, null, null, new AwS550S0100000_6((C03K6) usAddressItemCell, 1569));
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILLJJLI;
        return assemVMLazy.getValue();
    }
}
