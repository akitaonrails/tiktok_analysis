package X;

import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.SecretRepliesStickerResponsesCell;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Swc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737640Swc extends AbstractC1906720ziY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C730280Skk LLJILJIL;
    public Integer LLJILJILJ;
    public Aweme LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C737640Swc.class, "viewListVM", "getViewListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(SecretRepliesStickerResponsesCell.class);
        ((TextView) this.LLJI.getValue()).setText(((View) this.LLJI.getValue()).getContext().getString(2131847242));
        TuxTextView tuxTextView = (TuxTextView) this.LLJIJIL.getValue();
        tuxTextView.setText(tuxTextView.getContext().getString(2131847209));
        C786410Ut5.h9(tuxTextView, new ACListenerS146S0100000_11(this, 50));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C737640Swc() {
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerListViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 1416);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(631);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 1427), awS555S0100000_11, AFwS198S0000000_11.get$arr$(373), new AwS555S0100000_11((C03K6) this, 1400), new AwS555S0100000_11((C03K6) this, 1402), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS555S0100000_11(hasDefaultViewModelProviderFactory3, 1404), aFwS243S0000000_11, new AwS555S0100000_11((C03K6) this, 1406), null, new AwS555S0100000_11((C03K6) this, 1407));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11((C03K6) this, 1401);
            Function0 awS555S0100000_113 = (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS555S0100000_11(hasDefaultViewModelProviderFactory2, 1403);
            AwS555S0100000_11 awS555S0100000_114 = new AwS555S0100000_11(c19719912DlLIZ, 1405);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS412S0200000_11((InterfaceC451590HnJ) obj, awS555S0100000_112, 67));
            AwS555S0100000_11 awS555S0100000_115 = new AwS555S0100000_11(c01gwLIZIZ, 1408);
            AwS555S0100000_11 awS555S0100000_116 = new AwS555S0100000_11(c01gwLIZIZ, 1410);
            AwS555S0100000_11 awS555S0100000_117 = new AwS555S0100000_11(c01gwLIZIZ, 1412);
            AwS555S0100000_11 awS555S0100000_118 = new AwS555S0100000_11(c01gwLIZIZ, 1413);
            AwS555S0100000_11 awS555S0100000_119 = new AwS555S0100000_11(c01gwLIZIZ, 1414);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS555S0100000_114, awS555S0100000_11, new C452080Ho6(), awS555S0100000_115, awS555S0100000_116, awS555S0100000_113, aFwS243S0000000_11, awS555S0100000_117, awS555S0100000_118, awS555S0100000_119);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 1415), awS555S0100000_11, AFwS198S0000000_11.get$arr$(374), new AwS555S0100000_11((C03K6) this, 1417), new AwS555S0100000_11((C03K6) this, 1418), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS555S0100000_11(hasDefaultViewModelProviderFactory, 1419), aFwS243S0000000_11, new AwS555S0100000_11((C03K6) this, 1420), null, new AwS555S0100000_11((C03K6) this, 1421));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 1422), awS555S0100000_11, AFwS198S0000000_11.get$arr$(375), new AwS555S0100000_11((C03K6) this, 1423), new AwS555S0100000_11((C03K6) this, 1424), new AwS555S0100000_11((C03K6) this, 1425), aFwS243S0000000_11, null, null, new AwS555S0100000_11((C03K6) this, 1426));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1399));
        this.LLJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1409));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1411));
    }

    public final View cP() {
        return (View) this.LLJ.getValue();
    }
}
