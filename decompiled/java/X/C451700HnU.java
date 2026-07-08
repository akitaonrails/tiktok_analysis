package X;

import android.app.Activity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451700HnU extends C09AY implements Function0<AddressListAssemViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ AddressCell LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(AddressCell.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451700HnU(AddressCell addressCell) {
        super(0);
        this.LL = addressCell;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final AddressListAssemViewModel invoke() {
        AssemVMLazy assemVMLazy;
        AddressCell addressCell = this.LL;
        Object obj = addressCell.getCurrentLifecycleOwner() instanceof Activity ? C01D1.LIZ : C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddressListAssemViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 296);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(451);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 1199), c5182020e, AFwS192S0000000_6.get$arr$(477), new AwS550S0100000_6((C03K6) addressCell, 1203), new AwS550S0100000_6((C03K6) addressCell, 1206), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) addressCell, 1209), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) addressCell, 1210), null, new AwS550S0100000_6((C03K6) addressCell, 1213));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6((C03K6) addressCell, 1202);
            AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6((HasDefaultViewModelProviderFactory) addressCell, 1205);
            AwS550S0100000_6 awS550S0100000_63 = new AwS550S0100000_6(c19719912DlLIZ, 1208);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS407S0200000_6((InterfaceC451590HnJ) obj, awS550S0100000_6, 69));
            AwS550S0100000_6 awS550S0100000_64 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1212);
            AwS550S0100000_6 awS550S0100000_65 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1215);
            AwS550S0100000_6 awS550S0100000_66 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1216);
            AwS550S0100000_6 awS550S0100000_67 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1218);
            AwS550S0100000_6 awS550S0100000_68 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1220);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS550S0100000_63, c5182020e, new C452080Ho6(), awS550S0100000_64, awS550S0100000_65, awS550S0100000_62, aFwS236S0000000_6, awS550S0100000_66, awS550S0100000_67, awS550S0100000_68);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 1222), c5182020e, AFwS192S0000000_6.get$arr$(474), new AwS550S0100000_6((C03K6) addressCell, 1178), new AwS550S0100000_6((C03K6) addressCell, 1181), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) addressCell, 1183), aFwS236S0000000_6, new AwS550S0100000_6((C03K6) addressCell, 1185), null, new AwS550S0100000_6((C03K6) addressCell, 1187));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS550S0100000_6(c19719912DlLIZ, 1189), c5182020e, AFwS192S0000000_6.get$arr$(475), new AwS550S0100000_6((C03K6) addressCell, 1192), new AwS550S0100000_6((C03K6) addressCell, 1194), new AwS550S0100000_6((C03K6) addressCell, 1195), aFwS236S0000000_6, null, null, new AwS550S0100000_6((C03K6) addressCell, 1197));
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILLJJLI;
        return assemVMLazy.getValue();
    }
}
