package X;

import Y.AfS173S0100000_4;
import Y.AkS468S0100000_3;
import Y.AkS469S0100000_4;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionSearchCell;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionRecommendViewModel;
import com.ss.android.ugc.aweme.mixsearch.IMixSearchService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20610115kp extends AbstractC20610315kr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C20610115kp.class, "recommendVm", "getRecommendVm()Lcom/ss/android/ugc/aweme/mention/viewmodel/VideoCaptionMentionRecommendViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20610115kp() {
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCaptionMentionRecommendViewModel.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 25);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(7);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 51), awS548S0100000_4, AFwS221S0000000_31.get$arr$(46), new AwS575S0100000_31(this, 52), new AwS575S0100000_31(this, 54), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS575S0100000_31(hasDefaultViewModelProviderFactory3, 56), aFwS276S0000000_31, new AwS575S0100000_31(this, 58), null, new AwS575S0100000_31(this, 59));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 53);
            Function0 awS575S0100000_312 = (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS575S0100000_31(hasDefaultViewModelProviderFactory2, 55);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31(c19719912DlLIZ, 57);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_31, 24));
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c01gwLIZIZ, 60);
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 61);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 62);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 63);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 64);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_313, awS548S0100000_4, new C452080Ho6(), awS575S0100000_314, awS575S0100000_315, awS575S0100000_312, aFwS276S0000000_31, awS575S0100000_316, awS575S0100000_317, awS575S0100000_318);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 65), awS548S0100000_4, AFwS221S0000000_31.get$arr$(47), new AwS575S0100000_31(this, 66), new AwS575S0100000_31(this, 67), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS575S0100000_31(hasDefaultViewModelProviderFactory, 68), aFwS276S0000000_31, new AwS575S0100000_31(this, 69), null, new AwS575S0100000_31(this, 70));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 71), awS548S0100000_4, AFwS221S0000000_31.get$arr$(48), new AwS575S0100000_31(this, 72), new AwS575S0100000_31(this, 73), new AwS575S0100000_31(this, 74), aFwS276S0000000_31, null, null, new AwS575S0100000_31(this, 50));
        }
        this.LLJILJILJ = assemVMLazy;
        this.LLJILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(635));
        this.LLJJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(636));
    }

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<?> LJIIJJI() {
        return (AbstractC329610Cw3) this.LLJJ.getValue();
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        this.LLJ.LIZ(this.LLJIJIL.LJJIFFI().LJIL(50L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZIZ).LJJJJZI(new AkS469S0100000_4(this, 0)).LJLIIIL(new AkS468S0100000_3(this, 2)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS173S0100000_4(this, 0), new AfS173S0100000_4(this, 1)));
        IMixSearchService iMixSearchService = (IMixSearchService) this.LLJILLL.getValue();
        if (iMixSearchService != null) {
            iMixSearchService.LIZ();
        }
        LJIILIIL(VideoCaptionMentionSearchCell.class);
    }

    @Override // X.AbstractC20610315kr, X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        IMixSearchService iMixSearchService = (IMixSearchService) this.LLJILLL.getValue();
        if (iMixSearchService != null) {
            iMixSearchService.LIZIZ();
        }
    }
}
