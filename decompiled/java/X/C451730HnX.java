package X;

import android.app.Activity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddAddressBarCell;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451730HnX extends C09AY implements Function0<AddressListAssemViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ AddAddressBarCell LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(AddAddressBarCell.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451730HnX(AddAddressBarCell addAddressBarCell) {
        super(0);
        this.LL = addAddressBarCell;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final AddressListAssemViewModel invoke() {
        AssemVMLazy assemVMLazy;
        AddAddressBarCell addAddressBarCell = this.LL;
        Object obj = addAddressBarCell.getCurrentLifecycleOwner() instanceof Activity ? C01D1.LIZ : C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressListAssemViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 297);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(452);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 1221), c5182020e, AFwS192S0000000_6.get$arr$(479), new AwS550S0100000_6((C03K6) addAddressBarCell, 1173), new AwS550S0100000_6((C03K6) addAddressBarCell, 1175), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) addAddressBarCell, 1177), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) addAddressBarCell, 1180), null, new AwS550S0100000_6((C03K6) addAddressBarCell, 1182));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((C03K6) addAddressBarCell, 1174);
            AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) addAddressBarCell, 1176);
            AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6(c19719912DlLIZ, 1179);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_6, 68));
            AwS550S0100000_6 awS550S0100000_64 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1184);
            AwS550S0100000_6 awS550S0100000_65 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1186);
            AwS550S0100000_6 awS550S0100000_66 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1188);
            AwS550S0100000_6 awS550S0100000_67 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1190);
            AwS550S0100000_6 awS550S0100000_68 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1191);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS550S0100000_63, c5182020e, new C452080Ho6(), awS550S0100000_64, awS550S0100000_65, awS550S0100000_62, aFwS236S0000000_6, awS550S0100000_66, awS550S0100000_67, awS550S0100000_68);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 1193), c5182020e, AFwS192S0000000_6.get$arr$(476), new AwS550S0100000_6((C03K6) addAddressBarCell, 1196), new AwS550S0100000_6((C03K6) addAddressBarCell, 1198), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) addAddressBarCell, 1200), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) addAddressBarCell, 1201), null, new AwS550S0100000_6((C03K6) addAddressBarCell, 1204));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 1207), c5182020e, AFwS192S0000000_6.get$arr$(478), new AwS550S0100000_6((C03K6) addAddressBarCell, 1211), new AwS550S0100000_6((C03K6) addAddressBarCell, 1214), new AwS550S0100000_6((C03K6) addAddressBarCell, 1217), aFwS236S0000000_6, null, null, new AwS550S0100000_6((C03K6) addAddressBarCell, 1219));
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILLJJLI;
        return assemVMLazy.getValue();
    }
}
