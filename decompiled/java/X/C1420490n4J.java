package X;

import Y.ARunnableS33S0101000_22;
import Y.AsS49S0100000_22;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.AutoCutCategory;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.template.TemplateLottieKey;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0n4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420490n4J extends LinearLayout implements InterfaceC497601wk {
    public final C01GW LL;
    public List<AutoCutCategory> LLILLJJLI;
    public List<AutoCutThemeData> LLILLL;
    public RecyclerView LLILZ;
    public Scene LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public InterfaceC1418890n1j LLJI;
    public AutoCutCategory LLJIJIL;
    public AbstractC1420510n4L LLJILJIL;
    public final C1DFK LLJILJILJ;
    public final CoroutineContext LLJILLL;
    public AnonymousClass0956 LLJJ;
    public C0MWA LLJJI;
    public int LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;

    public final void setVideoPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
    }

    private final AsS49S0100000_22 getOnItemSelectedLinkTabLayoutListener() {
        return (AsS49S0100000_22) this.LLJJJ.getValue();
    }

    private final C1420500n4K getOnTabSelectedLinkRecyclerViewListener() {
        return (C1420500n4K) this.LLJJIJIL.getValue();
    }

    public final void LJ() {
        if (this.LLIZ) {
            AnonymousClass0956 anonymousClass0956 = this.LLJJ;
            if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                this.LLJJ = C23250099c.LIZLLL(this, null, null, new C0H0T(this, null), 3);
            }
        }
    }

    public final int getAutoCutEnableTabExperiment() {
        return ((Number) this.LLJJIJIIJIL.getValue()).intValue();
    }

    public final long getDelayTime() {
        return ((Number) this.LLJJIJI.getValue()).longValue();
    }

    public final C1846220y8y getTemplateTabLayout() {
        return (C1846220y8y) this.LL.getValue();
    }

    public final int getPositionOffset() {
        return getLayoutDirection() == 1 ? 4 : 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJILJILJ.LIZIZ(null);
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLJILLL;
    }

    public final int getSelectThemeIndex() {
        return this.LLJJIII;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutThemeData> r13) {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r13.iterator()
        L9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r0 = (com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) r0
            com.ss.android.ugc.aweme.creative.model.AutoCutCategory r0 = r0.category
            if (r0 == 0) goto L9
            r2.add(r0)
            goto L9
        L1d:
            java.util.List r0 = X.C13LP.LJJJJI(r2)
            r9 = r12
            r9.LLILLJJLI = r0
            r9.LLILLL = r13
            X.0y8y r0 = r9.getTemplateTabLayout()
            r0.LJIIJJI()
            java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutCategory> r0 = r9.LLILLJJLI
            java.util.Iterator r5 = r0.iterator()
        L33:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.creative.model.AutoCutCategory r4 = (com.ss.android.ugc.aweme.creative.model.AutoCutCategory) r4
            X.0y8y r0 = r9.getTemplateTabLayout()
            X.0nCt r2 = r0.LJIIIIZZ()
            java.lang.String r0 = r4.extra
            r3 = 0
            if (r0 == 0) goto L5b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L61
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "lottie"
            java.lang.String r1 = r1.optString(r0)     // Catch: java.lang.Throwable -> L61
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L61
            goto L6d
        L5b:
            java.lang.String r0 = r4.categoryName
            r2.LJFF(r0)
            goto Lbb
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L6d:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L74
            r1 = r3
        L74:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L5b
            int r0 = r1.length()
            if (r0 == 0) goto L5b
            java.lang.String r0 = r4.categoryKey
            java.lang.String r7 = ""
            if (r0 != 0) goto L85
            r0 = r7
        L85:
            X.0MWA r1 = r9.LIZIZ(r0)
            X.0MWC r0 = X.C0MWC.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = r4.categoryKey
            if (r0 == 0) goto L96
            r7 = r0
        L96:
            kotlin.jvm.internal.AwS423S0200000_22 r10 = new kotlin.jvm.internal.AwS423S0200000_22
            r0 = 21
            r10.<init>(r2, r4, r0)
            X.0jpS r8 = new X.0jpS
            android.content.Context r0 = r9.getContext()
            r8.<init>(r0)
            X.0LA5 r6 = new X.0LA5
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = 3
            X.C23250099c.LIZLLL(r9, r3, r3, r6, r0)
            X.0GtL r0 = new X.0GtL
            r0.<init>()
            r8.addLottieOnCompositionLoadedListener(r0)
            r2.LIZLLL(r8)
        Lbb:
            X.0y8y r1 = r9.getTemplateTabLayout()
            r0 = 6
            X.C1846220y8y.LIZIZ(r1, r2, r0)
            goto L33
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1420490n4J.LIZ(java.util.List):void");
    }

    public final C0MWA LIZIZ(String str) {
        if (C0CHQ.LIZ().getAccountService().LJIIJJI()) {
            return C0MWC.LIZ;
        }
        TemplateLottieKey templateLottieKey = (TemplateLottieKey) C1420550n4P.LIZ.getValue();
        if (templateLottieKey == null) {
            return C0MWC.LIZ;
        }
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        C0L62 c0l62 = C0L62.LIZ;
        C0L66 c0l66 = C0L66.LIZ;
        c0l62.getClass();
        if (!c2137908Zd.LJFF(C0L62.LJII(c0l66, str))) {
            return C0MWC.LIZ;
        }
        Keva repo = Keva.getRepo("keva_repo_auto_cut_operational_activity");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C538490L9z.LIZIZ(c0l66, str));
        sbLIZ.append("auto_cut_tab_show_time");
        long j = repo.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j == 0 && templateLottieKey.isAutoPlayFirstTime()) {
            return C0MWB.LIZ;
        }
        if (System.currentTimeMillis() - j >= 172800000) {
            List<Long> list = templateLottieKey.timeStamp;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<Long> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (System.currentTimeMillis() - it2.next().longValue() < 172800000) {
                        return C0MWB.LIZ;
                    }
                }
            }
        }
        if (templateLottieKey.isShowEndFrame()) {
            return C0MW9.LIZ;
        }
        return C0MWC.LIZ;
    }

    public final void setSelectThemeIndex(int i) {
        this.LLJJIII = i;
    }

    public C1420490n4J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 279));
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILLJJLI = c13bv;
        this.LLILLL = c13bv;
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLJILJILJ = c1dfkLIZ;
        C1466920oHC c1466920oHC = new C1466920oHC(CoroutineExceptionHandler.LJJLIL, 1);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJILLL = C2107308Nj.LIZ.plus(c1dfkLIZ).plus(c1466920oHC);
        this.LLJJI = C0MWC.LIZ;
        this.LLJJIII = -1;
        this.LLJJIJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(127));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(126));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d9l, this, true);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_cc_template_autocut", true) == 0) {
            getTemplateTabLayout().setLayoutVariant(0);
        } else {
            getTemplateTabLayout().setLayoutVariant(1);
        }
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 278));
        this.LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 277));
    }

    public final void LIZLLL(AutoCutCategory autoCutCategory, boolean z) {
        AbstractC1420510n4L abstractC1420510n4L;
        Iterator<AutoCutCategory> it2 = this.LLILLJJLI.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), autoCutCategory)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (getTemplateTabLayout().getSelectedTabPosition() == i) {
            return;
        }
        this.LLILZLL = true;
        this.LLIZ = z;
        if (!z) {
            abstractC1420510n4L = new AbstractC1420510n4L() { // from class: X.0n4O
                public final String toString() {
                    return "slide";
                }
            };
        } else {
            abstractC1420510n4L = C1420530n4N.LIZ;
        }
        this.LLJILJIL = abstractC1420510n4L;
        HandlerHook.viewPost(this, new ARunnableS33S0101000_22(i, this, 3));
    }

    public final void LIZJ(RecyclerView recyclerView, VideoPublishEditModel videoPublishEditModel, Scene scene, C1418850n1f c1418850n1f) {
        Integer numLIZJ;
        if (recyclerView == null) {
            return;
        }
        this.LLILZ = recyclerView;
        this.LLILZIL = scene;
        this.LLJI = c1418850n1f;
        getTemplateTabLayout().LIZ(getOnTabSelectedLinkRecyclerViewListener());
        if (getAutoCutEnableTabExperiment() != 2) {
            recyclerView.addOnScrollListener(getOnItemSelectedLinkTabLayoutListener());
        }
        if (C1417220mz2.LIZ(videoPublishEditModel) && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, getTemplateTabLayout().getContext())) != null) {
            getTemplateTabLayout().setBackgroundColor(numLIZJ.intValue());
        }
    }
}
