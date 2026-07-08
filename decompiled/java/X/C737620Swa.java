package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerCell;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerHintCell;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Swa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737620Swa extends AbstractC1906720ziY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1431));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1441));
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C737620Swa.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(StoryViewerCell.class, StoryViewerHintCell.class);
        AssemViewModel.selectSubscribe$default(LJJ(), new C2217381BqS() { // from class: X.0Skx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLILZLL;
            }
        }, null, null, null, new AwS581S0100000_2(new AwS625S0100000_11(this, 112), 496), 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C737620Swa() {
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerListViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 1447);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(634);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 1430), awS555S0100000_11, AFwS198S0000000_11.get$arr$(376), new AwS555S0100000_11((C03K6) this, 1432), new AwS555S0100000_11((C03K6) this, 1434), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS555S0100000_11(hasDefaultViewModelProviderFactory3, 1436), aFwS243S0000000_11, new AwS555S0100000_11((C03K6) this, 1438), null, new AwS555S0100000_11((C03K6) this, 1439));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11((C03K6) this, 1433);
            Function0 awS555S0100000_113 = (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS555S0100000_11(hasDefaultViewModelProviderFactory2, 1435);
            AwS555S0100000_11 awS555S0100000_114 = new AwS555S0100000_11(c19719912DlLIZ, 1437);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS412S0200000_11((InterfaceC451590HnJ) obj, awS555S0100000_112, 68));
            AwS555S0100000_11 awS555S0100000_115 = new AwS555S0100000_11(c01gwLIZIZ, 1440);
            AwS555S0100000_11 awS555S0100000_116 = new AwS555S0100000_11(c01gwLIZIZ, 1442);
            AwS555S0100000_11 awS555S0100000_117 = new AwS555S0100000_11(c01gwLIZIZ, 1443);
            AwS555S0100000_11 awS555S0100000_118 = new AwS555S0100000_11(c01gwLIZIZ, 1444);
            AwS555S0100000_11 awS555S0100000_119 = new AwS555S0100000_11(c01gwLIZIZ, 1445);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS555S0100000_114, awS555S0100000_11, new C452080Ho6(), awS555S0100000_115, awS555S0100000_116, awS555S0100000_113, aFwS243S0000000_11, awS555S0100000_117, awS555S0100000_118, awS555S0100000_119);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 1446), awS555S0100000_11, AFwS198S0000000_11.get$arr$(377), new AwS555S0100000_11((C03K6) this, 1448), new AwS555S0100000_11((C03K6) this, 1449), (!(this instanceof HasDefaultViewModelProviderFactory) || (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) == null) ? C1143000fqk.LIZ : new AwS555S0100000_11(hasDefaultViewModelProviderFactory, 1450), aFwS243S0000000_11, new AwS555S0100000_11((C03K6) this, 1451), null, new AwS555S0100000_11((C03K6) this, 1452));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 1453), awS555S0100000_11, AFwS198S0000000_11.get$arr$(378), new AwS555S0100000_11((C03K6) this, 1454), new AwS555S0100000_11((C03K6) this, 1455), new AwS555S0100000_11((C03K6) this, 1456), aFwS243S0000000_11, null, null, new AwS555S0100000_11((C03K6) this, 1457));
        }
        this.LLJI = assemVMLazy;
    }

    public final StoryViewerListViewModel LJJ() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (StoryViewerListViewModel) assemVMLazy.getValue();
    }

    public final View cP() {
        return (View) this.LLIZLLLIL.getValue();
    }

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<?> LJIIJJI() {
        return LJJ().getConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJI(boolean z, Boolean bool) {
        Aweme aweme;
        C728910SiX c728910SiX = ((C730090SkR) LJJ().getState()).LLILLJJLI;
        if (c728910SiX != null && (aweme = c728910SiX.LIZ) != null) {
            String string = null;
            if (bool == null) {
                Pair<Boolean, String> pair = ((C730090SkR) LJJ().getState()).LLILZLL;
                if (pair != null) {
                    bool = pair.getFirst();
                } else {
                    bool = null;
                }
            }
            TextView textView = (TextView) this.LLJ.getValue();
            C330770Cxv.LIZ.getClass();
            if (C330770Cxv.LIZ(aweme) == EnumC330740Cxs.POST_LIKE_LIST) {
                Context context = getContext();
                if (context != null) {
                    string = context.getString(R.string.kz3);
                }
            } else if (!Intrinsics.LJFF(bool, Boolean.TRUE) && !C718060SEq.LIZ(aweme, ((C730090SkR) LJJ().getState()).LLIZ)) {
                Context context2 = getContext();
                if (context2 != null) {
                    string = context2.getString(2131833871);
                }
            } else {
                Context context3 = getContext();
                if (context3 != null) {
                    string = context3.getString(2131833872);
                }
            }
            textView.setText(string);
            if (z) {
                C786410Ut5.LJLLLLLL(0, cP());
                LJII(cP());
            } else {
                C786410Ut5.LJLLLLLL(8, cP());
                LJIJJLI(cP());
            }
        }
    }
}
