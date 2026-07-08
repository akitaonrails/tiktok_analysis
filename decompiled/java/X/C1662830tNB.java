package X;

import Y.ACListenerS159S0100000_25;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.h0;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenAnimationUrlSettings;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS602S0100000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662830tNB extends C1662450tMZ {
    public static final Keva LLLZLZ = Keva.getRepo("simplify_permission_video_intro_repo");
    public final ShortVideoContext LLLLLLJ;
    public FrameLayout LLLLLLL;
    public InterfaceC1484830ok5 LLLLLLLLL;
    public C1488740oqO LLLLLLLLLL;
    public C1488730oqN LLLLLLLZIL;
    public C1295960jpS LLLLLLZ;
    public TuxTextView LLLLLLZZ;
    public TuxTextView LLLLLZ;
    public volatile boolean LLLLLZIL;
    public C21647019ng LLLLLZL;
    public C21647019ng LLLLZ;
    public int LLLLZI;
    public final h0<Integer> LLLLZIL;
    public C21647019ng LLLLZLL;
    public C21647019ng LLLLZLLIL;
    public final C01GW LLLLZLLLI;
    public AnonymousClass0956 LLLZ;
    public final C01GW LLLZI;
    public AnonymousClass0956 LLLZIIL;
    public C1292030jj7<C1294720jnS> LLLZIL;
    public final C1698330uIR LLLZL;
    public final C1662560tMk LLLZLL;

    @Override // X.C1662450tMZ
    public final boolean LLLLLZ() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0ogN, X.0oqN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LLLLZ() {
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
        this.LLLLLLLLL = interfaceC1484830ok5LIZJ;
        C1488740oqO c1488740oqO = new C1488740oqO(this);
        if (interfaceC1484830ok5LIZJ != null) {
            interfaceC1484830ok5LIZJ.LIZJ(c1488740oqO);
        }
        this.LLLLLLLLLL = c1488740oqO;
        C1482560ogQ c1482560ogQLIZ = C1488120opO.LIZ(Mp4ScreenAnimationUrlSettings.getValue().videoUrl);
        ?? r1 = new InterfaceC1482530ogN() { // from class: X.0oqN
            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Au(Surface surface) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void VK() {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void W1(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLoopPlay(String str, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompleted(String str, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPause(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
            public final /* synthetic */ void onPreRenderReady(String str) {
                C490850JMt.LIZ(this, str);
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str, int i, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onStopPlay(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                this.LL.LLLLZLLIL(false);
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                Integer numValueOf;
                this.LL.LLLLZLLIL(false);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Permission intro video load failed, cause=");
                if (c1481290oeN != null) {
                    numValueOf = Integer.valueOf(c1481290oeN.LJ);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
            @Override // X.InterfaceC1482530ogN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onVideoSizeChanged(java.lang.String r7, int r8, int r9) {
                /*
                    r6 = this;
                    X.0tNB r2 = r6.LL
                    r2.getClass()
                    int r1 = com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoAspectRatio.getValue()
                    r0 = 1
                    if (r1 == 0) goto L57
                    if (r1 == r0) goto L17
                    r5 = 2
                    if (r1 == r5) goto L18
                    r5 = 3
                    if (r1 == r5) goto L18
                    r5 = 4
                    if (r1 == r5) goto L18
                L17:
                    r5 = 1
                L18:
                    X.0oqO r0 = r2.LLLLLLLLLL
                    if (r0 == 0) goto L53
                    X.0tNB r0 = r0.LL
                    android.widget.FrameLayout r4 = r0.LLLLLLL
                    if (r4 == 0) goto L53
                    int r0 = r4.getChildCount()
                    r3 = 0
                    if (r0 == 0) goto L53
                    int r1 = r4.getChildCount()
                L2d:
                    if (r3 >= r1) goto L53
                    android.view.View r2 = r4.getChildAt(r3)
                    boolean r0 = r2 instanceof android.view.TextureView
                    if (r0 == 0) goto L54
                    android.content.Context r0 = r4.getContext()
                    X.C425050Glb.LJ(r0, r2, r8, r9, r5)
                    android.view.TextureView r2 = (android.view.TextureView) r2
                    android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
                    boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
                    if (r0 == 0) goto L53
                    android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
                    if (r1 == 0) goto L53
                    r0 = 17
                    r1.gravity = r0
                    X.C786410Ut5.V5(r2, r1)
                L53:
                    return
                L54:
                    int r3 = r3 + 1
                    goto L2d
                L57:
                    r5 = 5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1488730oqN.onVideoSizeChanged(java.lang.String, int, int):void");
            }
        };
        this.LLLLLLLZIL = r1;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLLLLLLLL;
        if (interfaceC1484830ok5 != 0) {
            interfaceC1484830ok5.LJIIZILJ(r1);
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLLLLLLLL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.setLoop(true);
        }
        InterfaceC1484830ok5 interfaceC1484830ok53 = this.LLLLLLLLL;
        if (interfaceC1484830ok53 != null) {
            interfaceC1484830ok53.LJ(c1482560ogQLIZ);
        }
    }

    public final void LLLLZLL() {
        AnonymousClass0956 anonymousClass0956 = this.LLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLZ = C23250099c.LIZLLL((InterfaceC497601wk) this.LLLLZLLLI.getValue(), null, null, new C2217408mS(this, null), 3);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        super.onDestroyView();
        this.LLLLLZIL = false;
        C1292030jj7<C1294720jnS> c1292030jj7 = this.LLLZIL;
        if (c1292030jj7 != null) {
            c1292030jj7.LJII(this.LLLZL);
        }
        this.LLLZIL = null;
        C1295960jpS c1295960jpS = this.LLLLLLZ;
        if (c1295960jpS != null) {
            c1295960jpS.setFailureListener(null);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLLZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLLZIIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C21647019ng c21647019ng = this.LLLLZLL;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        C21647019ng c21647019ng2 = this.LLLLZLLIL;
        if (c21647019ng2 != null) {
            c21647019ng2.LIZ();
        }
        C21647019ng c21647019ng3 = this.LLLLLZL;
        if (c21647019ng3 != null) {
            c21647019ng3.LIZ();
        }
        C21647019ng c21647019ng4 = this.LLLLZ;
        if (c21647019ng4 != null) {
            c21647019ng4.LIZ();
        }
        C1488740oqO c1488740oqO = this.LLLLLLLLLL;
        if (c1488740oqO != null && (interfaceC1484830ok5 = this.LLLLLLLLL) != null) {
            interfaceC1484830ok5.LJIIJJI(c1488740oqO);
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLLLLLLLL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.LJJIIZ(this.LLLLLLLZIL);
        }
        InterfaceC1484830ok5 interfaceC1484830ok53 = this.LLLLLLLLL;
        if (interfaceC1484830ok53 != null) {
            interfaceC1484830ok53.release();
        }
        this.LLLLLLLLL = null;
        this.LLLLLLLLLL = null;
        this.LLLLLLLZIL = null;
    }

    public final void LLLLLZL(TuxTextView tuxTextView) {
        if (tuxTextView == null) {
            return;
        }
        C19746412Nq c19746412Nq = new C19746412Nq("title_label_translation_animator_tag", new C0HV5(0.0f, C418440Gaw.LIZIZ(-30)));
        Context context = tuxTextView.getContext();
        EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.BEZIER;
        C21647019ng c21647019ng = new C21647019ng(context, tuxTextView, new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(0.14f), new C1342130l1v(1.0f), new C1342130l1v(0.34f), new C1342130l1v(1.0f), 1000L), Collections.singletonList(c19746412Nq)), false);
        this.LLLLZLLIL = c21647019ng;
        c21647019ng.LJI(true);
        C21647019ng c21647019ng2 = new C21647019ng(tuxTextView.getContext(), tuxTextView, new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(0.48f), new C1342130l1v(0.0f), new C1342130l1v(0.52f), new C1342130l1v(1.0f), 500L), Collections.singletonList(new C19746412Nq("title_label_alpha_animator_tag", new C0HUY(0.0f, 1.0f)))), false);
        this.LLLLZLL = c21647019ng2;
        c21647019ng2.LJI(true);
    }

    public final void LLLLZLLIL(boolean z) {
        if (this.LLLLLZIL) {
            return;
        }
        this.LLLLLZIL = true;
        if (z) {
            LLLLZIL(300L, new AwS569S0100000_25(this, 342));
            LLLLZIL(450L, new AwS569S0100000_25(this, 343));
        } else {
            LLLLZIL(200L, new AwS569S0100000_25(this, 344));
            LLLLZIL(200L, new AwS569S0100000_25(this, 345));
        }
    }

    @Override // X.C1662440tMY, X.C1662320tMM, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662500tMe) obj).LJIILIIL);
            }
        }, Lifecycle.State.STARTED, new AwS602S0100000_23(this, 31));
    }

    public final void LLLLZIL(long j, Function0<Unit> function0) {
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLLLZLLLI.getValue();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C2230708ob(j, this, function0, null), 2);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        super.onViewCreated(this.mView, bundle);
        if (LLLZLZ.getBoolean("simplify_permission_video_intro_should_hide_key", false)) {
            ViewGroup viewGroup2 = this.LLLLJ;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
            LLLLIL().LJIIIIZZ.invoke(Boolean.FALSE);
            if (!EffectFullWidthHorizontalCarouselAB.isEnabled() && (viewGroup = this.LLLLJI) != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
        } else {
            ViewGroup viewGroup3 = this.LLLLJ;
            if (viewGroup3 != null) {
                C786410Ut5.LJLZ(0, viewGroup3);
            }
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLLLZLLLI.getValue(), C0PEM.LIZJ, null, new C2301208zy(this, null), 2);
    }

    @Override // X.C1662450tMZ, X.C1662440tMY, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        ViewGroup viewGroupOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup3 = this.LLLLJ;
        if (viewGroup3 != null) {
            C786410Ut5.LJLZ(0, viewGroup3);
        }
        this.LLLLLLZ = (C1295960jpS) viewGroupOnCreateView.findViewById(R.id.ivg);
        this.LLLLLZ = (TuxTextView) viewGroupOnCreateView.findViewById(R.id.ivh);
        this.LLLLLLL = (FrameLayout) viewGroupOnCreateView.findViewById(R.id.video_container);
        TuxTextView tuxTextView = (TuxTextView) viewGroupOnCreateView.findViewById(R.id.ivo);
        this.LLLLLLZZ = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.ee);
            tuxTextView.setTuxFont(123);
            tuxTextView.setTypeface(C1697580uHE.LIZIZ(0.0f, 900, 0.0f, 1.0f, null, 0.0f, 0, null, 245));
            tuxTextView.setMaxLines(3);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        LLLLIL().LJIIIIZZ.invoke(Boolean.TRUE);
        if (!EffectFullWidthHorizontalCarouselAB.isEnabled() && (viewGroup2 = this.LLLLJI) != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        C1295960jpS c1295960jpS = this.LLLLLLZ;
        if (c1295960jpS != null) {
            C786410Ut5.c8(c1295960jpS, new ACListenerS159S0100000_25(this, 22));
        }
        return viewGroupOnCreateView;
    }

    public C1662830tNB(C1664690tQB<C1662500tMe> c1664690tQB, C1662570tMl c1662570tMl, C385670FAf<Boolean> c385670FAf, C385670FAf<Boolean> c385670FAf2, ShortVideoContext shortVideoContext) {
        super(c1664690tQB, c1662570tMl, c385670FAf, c385670FAf2, shortVideoContext);
        this.LLLLLLJ = shortVideoContext;
        this.LLLLZIL = new h0<>(-1);
        this.LLLLZLLLI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(173));
        this.LLLZI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(174));
        this.LLLZL = new C1698330uIR(this, 0);
        this.LLLZLL = C1662560tMk.LL;
    }
}
