package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.api.component.mask.AdMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0c3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997110c3R implements InterfaceC1010530cP5 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final InterfaceC997170c3X LL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(669));
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(670));
    public FrameLayout LLILZ;
    public C997130c3T LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C997110c3R.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C997110c3R.class, "container", "getContainer()Landroid/view/View;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final Aweme LIZ() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (Aweme) c997320c3m.LIZ(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0c3S] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0c3T, X.0c3o] */
    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        ViewGroup viewGroup;
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        FrameLayout frameLayout = (FrameLayout) ((View) c997320c3m.LIZ(this)).findViewWithTag("ad_mask_container_tag");
        if (frameLayout == null) {
            frameLayout = new FrameLayout(((View) this.LLILLL.LIZ(this)).getContext());
            frameLayout.setTag("ad_mask_container_tag");
            View view = (View) this.LLILLL.LIZ(this);
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            }
            C786410Ut5.LJZ(8, frameLayout);
        }
        this.LLILZ = frameLayout;
        final ?? r0 = new InterfaceC997350c3p() { // from class: X.0c3S
            @Override // X.InterfaceC997360c3q
            public final ViewGroup LJIJI() {
                FrameLayout frameLayout2 = this.LIZ.LLILZ;
                if (frameLayout2 == null) {
                    return null;
                }
                return frameLayout2;
            }

            @Override // X.InterfaceC997350c3p
            public final Aweme getAweme() {
                return this.LIZ.LIZ();
            }
        };
        ?? r1 = new AbstractC997340c3o(r0) { // from class: X.0c3T
            public final InterfaceC997350c3p LLIZLLLIL;

            @Override // X.AbstractC997340c3o
            public final String LJ() {
                return "defaultStatusKey";
            }

            @Override // X.InterfaceC1010530cP5
            public final /* bridge */ /* synthetic */ Object Mh() {
                return this.LLIZLLLIL;
            }

            {
                this.LLIZLLLIL = r0;
            }

            @Override // X.AbstractC997340c3o
            public final C1028380crs LIZIZ(Context context, Aweme aweme) {
                return C1000500c8u.LIZ(context, aweme);
            }

            @Override // X.AbstractC997340c3o
            public final C1051290dSp LIZJ(Context context, Aweme aweme) {
                return C1000500c8u.LIZIZ(context, aweme);
            }
        };
        r1.initialize();
        this.LLILZIL = r1;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C997110c3R(C997100c3Q c997100c3Q) {
        this.LL = c997100c3Q;
    }

    public final void LIZIZ(AbstractC997230c3d abstractC997230c3d) {
        C997130c3T c997130c3T = null;
        if (Intrinsics.LJFF(abstractC997230c3d, C997240c3e.LIZ)) {
            C997130c3T c997130c3T2 = this.LLILZIL;
            if (c997130c3T2 != null) {
                c997130c3T = c997130c3T2;
            }
            c997130c3T.LJFF("viewDisappeared", new Pair[0]);
            return;
        }
        if (Intrinsics.LJFF(abstractC997230c3d, C997250c3f.LIZ)) {
            C997130c3T c997130c3T3 = this.LLILZIL;
            if (c997130c3T3 != null) {
                c997130c3T = c997130c3T3;
            }
            c997130c3T.LJFF("viewAppeared", new Pair[0]);
            return;
        }
        throw new C1954807lC();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardGetCodeButtonClickedEvent(C997280c3i c997280c3i) {
        C997130c3T c997130c3T = this.LLILZIL;
        if (c997130c3T == null) {
            c997130c3T = null;
        }
        c997130c3T.LJFF("gameCodeClicked", new Pair[0]);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onHideMaskLayoutEvent(C997530c47 c997530c47) {
        AbstractC997150c3V c997070c3N;
        int i = AdMaskAssem.LLJLLL;
        Function1<AbstractC997150c3V, Unit> function1LIZ = this.LL.LIZ();
        if (C1003680cE2.LIZJ(LIZ())) {
            c997070c3N = new C997070c3N(true, null, 2);
        } else {
            c997070c3N = C997200c3a.LIZ;
        }
        function1LIZ.invoke(c997070c3N);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLynxConvert(C997880c4g c997880c4g) {
        int i = C2187451AjH.LIZ;
        C583160Mu2.LJ = true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onStoryMaskClickEvent(C997160c3W c997160c3W) {
        int i = AdMaskAssem.LLJLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStoryMaskClickEvent: clickIndex: ");
        sbLIZ.append(c997160c3W.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.LIZ().invoke(new C997090c3P(c997160c3W.LIZ));
    }
}
