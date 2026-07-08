package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS91S0200000_22;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0nBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425080nBi extends RecyclerView.ViewHolder {
    public final C19EG LL;
    public final Scene LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final View LLILZ;
    public final SmartImageView LLILZIL;
    public final TuxTextView LLILZLL;
    public final FrameLayout LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final View LLJILJIL;
    public final TuxTag LLJILJILJ;
    public C1419590n2r LLJILLL;
    public CutsameDataItem LLJJ;
    public int LLJJI;
    public C1DRG LLJJIII;
    public final C01GW LLJJIJI;
    public C1425160nBq LLJJIJIIJIL;
    public TextureView LLJJIJIL;
    public InterfaceC1425290nC3 LLJJJ;
    public Function1<? super C1419590n2r, Unit> LLJJJIL;
    public Function1<? super Boolean, Unit> LLJJJJ;
    public boolean LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public long LLJLILLLLZIIL;
    public boolean LLJLL;
    public final boolean LLJLLIL;
    public final float LLJLLL;
    public final boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public final C1425170nBr LLL;
    public final C1425110nBl LLLF;

    public final void I5() {
        if (Intrinsics.LJFF(C1610140s0C.LIZ, Boolean.TRUE)) {
            C1425160nBq c1425160nBq = this.LLJJIJIIJIL;
            if (c1425160nBq != null) {
                c1425160nBq.mute();
            }
            InterfaceC1425150nBp interfaceC1425150nBpP5 = P5();
            if (interfaceC1425150nBpP5 != null) {
                interfaceC1425150nBpP5.LIZ(true);
            }
        } else {
            C1425160nBq c1425160nBq2 = this.LLJJIJIIJIL;
            if (c1425160nBq2 != null) {
                c1425160nBq2.unmute();
            }
            InterfaceC1425150nBp interfaceC1425150nBpP52 = P5();
            if (interfaceC1425150nBpP52 != null) {
                interfaceC1425150nBpP52.LIZ(false);
            }
        }
        if (C1610140s0C.LIZ()) {
            C337180DJs.LIZJ(this.LLJILJIL);
            C337180DJs.LIZ(this.LLJIJIL);
        } else {
            C337180DJs.LIZJ(this.LLJIJIL);
            C337180DJs.LIZ(this.LLJILJIL);
        }
    }

    public final C1484970okJ N5() {
        C1419590n2r c1419590n2r;
        CutsameDataItem cutsameDataItem = this.LLJJ;
        if (cutsameDataItem == null || (c1419590n2r = this.LLJILLL) == null) {
            return null;
        }
        String str = cutsameDataItem.templateId;
        Pair pair = new Pair(c1419590n2r.LIZ, cutsameDataItem);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("template_tab");
        sbLIZ.append('/');
        sbLIZ.append(hashCode());
        return new C1484970okJ(str, pair, new C1425280nC2(C2188811AlT.LIZIZ(sbLIZ)), this.LLJJI, cutsameDataItem.LIZJ());
    }

    public final InterfaceC1425150nBp P5() {
        return (InterfaceC1425150nBp) this.LLJJIJI.getValue();
    }

    public final void U5() {
        C1484970okJ c1484970okJN5;
        InterfaceC1425150nBp interfaceC1425150nBpP5;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateItemViewHolder playerResume: ");
        CutsameDataItem cutsameDataItem = this.LLJJ;
        sbLIZ.append(cutsameDataItem != null ? cutsameDataItem.title : null);
        sbLIZ.append(", shouldResume = ");
        sbLIZ.append(this.LLJJJJJIL);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        I5();
        if (C299160Bo2.LIZ()) {
            if (!this.LLJJJJJIL || (c1484970okJN5 = N5()) == null || (interfaceC1425150nBpP5 = P5()) == null) {
                return;
            }
            interfaceC1425150nBpP5.LJIILJJIL(c1484970okJN5, this.LLIZ, this.LLJJJJLIIL, this.LLLF);
            return;
        }
        C1425160nBq c1425160nBq = this.LLJJIJIIJIL;
        if (c1425160nBq == null || c1425160nBq.isPlaying() || !this.LLJJJJJIL) {
            return;
        }
        if (this.LLJL) {
            S5(0.0f, false);
            return;
        }
        CutsameDataItem cutsameDataItem2 = this.LLJJ;
        if (cutsameDataItem2 != null) {
            Video videoLIZ = C1419160n2A.LIZ(cutsameDataItem2);
            X5(this.LLJJ);
            C1425160nBq c1425160nBq2 = this.LLJJIJIIJIL;
            if (c1425160nBq2 != null) {
                c1425160nBq2.tryResume(videoLIZ, C1425240nBy.LIZ(this, 0));
            }
            this.LLJJLIIIJLLLLLLLZ = false;
            this.LLJLIL = false;
            this.LLJLILLLLZIIL = System.currentTimeMillis();
        }
    }

    public final float R5() {
        if (C299160Bo2.LIZ()) {
            InterfaceC1425150nBp interfaceC1425150nBpP5 = P5();
            if (interfaceC1425150nBpP5 != null) {
                return interfaceC1425150nBpP5.LIZIZ();
            }
            return 0.0f;
        }
        C1425160nBq c1425160nBq = this.LLJJIJIIJIL;
        if (c1425160nBq == null) {
            return 0.0f;
        }
        long videoDuration = c1425160nBq.getVideoDuration();
        if (videoDuration != 0) {
            return (c1425160nBq.getCurrentPosition() * 100.0f) / videoDuration;
        }
        return 0.0f;
    }

    public static void L5(SmartImageView smartImageView) {
        if (smartImageView.getVisibility() != 0) {
            C337180DJs.LIZ(smartImageView);
        } else {
            smartImageView.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS102S0100000_2(smartImageView, 79)).start();
        }
    }

    public final void V5(boolean z) {
        String str;
        C1425160nBq c1425160nBq;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateItemViewHolder playerStop: ");
        CutsameDataItem cutsameDataItem = this.LLJJ;
        if (cutsameDataItem != null) {
            str = cutsameDataItem.title;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", isCurCategory = ");
        sbLIZ.append(this.LLILLL.invoke().booleanValue());
        sbLIZ.append(", forceStop = ");
        sbLIZ.append(z);
        C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if ((this.LLILLL.invoke().booleanValue() || z) && (c1425160nBq = this.LLJJIJIIJIL) != null) {
            c1425160nBq.stop();
        }
        C1484970okJ c1484970okJN5 = N5();
        if (c1484970okJN5 != null) {
            InterfaceC1425150nBp interfaceC1425150nBpP5 = P5();
            if (interfaceC1425150nBpP5 != null) {
                interfaceC1425150nBpP5.LJIIJJI(c1484970okJN5);
            }
            InterfaceC1425150nBp interfaceC1425150nBpP52 = P5();
            if (interfaceC1425150nBpP52 != null) {
                interfaceC1425150nBpP52.LJII(c1484970okJN5, this.LLLF);
            }
        }
        C786410Ut5.LJZ(8, this.LLIZ);
        C786410Ut5.LLFF(0, this.LLILZIL);
        this.LLJJJJJIL = false;
        C786410Ut5.LJLLLLLL(8, this.LLJIJIL);
        C786410Ut5.LJLLLLLL(8, this.LLJILJIL);
        this.LLJJLIIIJLLLLLLLZ = false;
        if (!C299160Bo2.LIZ()) {
            W5(2, 0, null, this.LLJJ);
        }
    }

    public final void X5(CutsameDataItem cutsameDataItem) {
        boolean z;
        Integer numValueOf;
        if (cutsameDataItem == null) {
            return;
        }
        C1425160nBq c1425160nBq = this.LLJJIJIIJIL;
        if (c1425160nBq != null && (numValueOf = Integer.valueOf(c1425160nBq.getCacheSize(C1419160n2A.LIZ(cutsameDataItem)))) != null && numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLL = z;
    }

    public final void S5(final float f, final boolean z) {
        String str;
        InterfaceC1425150nBp interfaceC1425150nBpP5;
        CutsameDataItem cutsameDataItem;
        if (C299160Bo2.LIZ()) {
            if (C299160Bo2.LIZ() && (interfaceC1425150nBpP5 = P5()) != null) {
                if ((z && interfaceC1425150nBpP5.isPlaying()) || !this.LLILLL.invoke().booleanValue() || (cutsameDataItem = this.LLJJ) == null || !cutsameDataItem.LIZLLL()) {
                    return;
                }
                if (!this.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    if (z && this.LLJJLIIIJLLLLLLLZ) {
                        return;
                    }
                    this.LLJL = true;
                    return;
                }
                if (z && this.LLJJLIIIJLLLLLLLZ) {
                    C201955140j.LJIILJJIL(C1398350mUb.LIZIZ, "TemplateItemViewHolder playVideo->resume");
                    U5();
                    return;
                }
                if (interfaceC1425150nBpP5.isPlaying() && Intrinsics.LJFF(interfaceC1425150nBpP5.LIZLLL(), N5())) {
                    return;
                }
                boolean z2 = false;
                this.LLJL = false;
                this.LLJJLIIIJLLLLLLLZ = false;
                interfaceC1425150nBpP5.LIZJ();
                this.LLJJL = f;
                I5();
                C1484970okJ c1484970okJN5 = N5();
                if (c1484970okJN5 != null) {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TemplateItemViewHolder playVideoNew: ");
                    sbLIZ.append(cutsameDataItem.title);
                    sbLIZ.append(", position = ");
                    sbLIZ.append(this.LLJJI);
                    sbLIZ.append(", needSeek = ");
                    if (f > 0.0f) {
                        z2 = true;
                    }
                    sbLIZ.append(z2);
                    sbLIZ.append(", progress = ");
                    sbLIZ.append(f);
                    sbLIZ.append(", coverView.visibility = ");
                    sbLIZ.append(this.LLILZIL.getVisibility());
                    C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                    interfaceC1425150nBpP5.LJI(c1484970okJN5, this.LLIZ, f, this.LLLF);
                }
                this.LLJJJJJIL = true;
                return;
            }
            return;
        }
        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TemplateItemViewHolder playVideo: ");
        CutsameDataItem cutsameDataItem2 = this.LLJJ;
        if (cutsameDataItem2 != null) {
            str = cutsameDataItem2.title;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        sbLIZ2.append(", lifecycle = ");
        sbLIZ2.append(this.LLILLJJLI.getLifecycle().getCurrentState());
        C201955140j.LJIILJJIL(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
        TextureView textureView = this.LLJJIJIL;
        if (textureView != null) {
            HandlerHook.viewPost(textureView, new Runnable() { // from class: X.0nBk
                public final void LIZ() {
                    C1425160nBq c1425160nBq;
                    List<String> urlList;
                    TextureView textureView2 = this.LL.LLJJIJIL;
                    String str2 = null;
                    if (textureView2 == null || textureView2.getParent() == null) {
                        return;
                    }
                    C1425080nBi c1425080nBi = this.LL;
                    if (c1425080nBi.LLJJIJIL != null) {
                        float f2 = f;
                        boolean z3 = z;
                        CutsameDataItem cutsameDataItem3 = c1425080nBi.LLJJ;
                        if (cutsameDataItem3 == null || (c1425160nBq = c1425080nBi.LLJJIJIIJIL) == null) {
                            return;
                        }
                        C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("TemplateItemViewHolder playVideo internal: ");
                        CutsameDataItem cutsameDataItem4 = c1425080nBi.LLJJ;
                        sbLIZ3.append(cutsameDataItem4 != null ? cutsameDataItem4.title : null);
                        sbLIZ3.append(", lifecycle = ");
                        sbLIZ3.append(c1425080nBi.LLILLJJLI.getLifecycle().getCurrentState());
                        sbLIZ3.append(", seekProgress: ");
                        sbLIZ3.append(f2);
                        sbLIZ3.append(", getVideoProgress = ");
                        sbLIZ3.append(c1425080nBi.R5());
                        sbLIZ3.append(" continueIfPlaying = ");
                        sbLIZ3.append(z3);
                        sbLIZ3.append(", isPlaying = ");
                        sbLIZ3.append(c1425160nBq.isPlaying());
                        C201955140j.LJIILJJIL(c1398350mUb3, C2188811AlT.LIZIZ(sbLIZ3));
                        if (!(z3 && c1425160nBq.isPlaying()) && c1425080nBi.LLILLL.invoke().booleanValue()) {
                            if (!cutsameDataItem3.LIZLLL()) {
                                C201955140j.LJIILJJIL(c1398350mUb3, "TemplateItemViewHolder playVideo: templateData is invalid");
                                InterfaceC1425290nC3 interfaceC1425290nC3 = c1425080nBi.LLJJJ;
                                if (interfaceC1425290nC3 != null) {
                                    interfaceC1425290nC3.LIZJ(null);
                                    return;
                                }
                                return;
                            }
                            if (!c1425080nBi.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                                if (z3 && c1425080nBi.LLJJLIIIJLLLLLLLZ) {
                                    return;
                                }
                                c1425080nBi.LLJL = true;
                                return;
                            }
                            if (z3 && c1425080nBi.LLJJLIIIJLLLLLLLZ) {
                                C201955140j.LJIILJJIL(c1398350mUb3, "TemplateItemViewHolder playVideo->resume");
                                c1425080nBi.U5();
                                return;
                            }
                            c1425080nBi.LLJL = false;
                            c1425080nBi.LLJJLIIIJLLLLLLLZ = false;
                            c1425080nBi.X5(cutsameDataItem3);
                            boolean z4 = f2 > 0.0f;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("TemplateItemViewHolder playVideo: needSeek = ");
                            sbLIZ4.append(z4);
                            sbLIZ4.append(", progress = ");
                            sbLIZ4.append(f2);
                            sbLIZ4.append(", coverView.visibility = ");
                            sbLIZ4.append(c1425080nBi.LLILZIL.getVisibility());
                            C201955140j.LJIILJJIL(c1398350mUb3, C2188811AlT.LIZIZ(sbLIZ4));
                            C786410Ut5.LJZ(0, c1425080nBi.LLIZ);
                            TextureView textureView3 = c1425080nBi.LLJJIJIL;
                            if (textureView3 != null) {
                                HandlerHook.viewPost(textureView3, new ARunnableS91S0200000_22(cutsameDataItem3, textureView3, 37));
                            }
                            c1425160nBq.setForceNewPlay(true);
                            c1425160nBq.setLoop(false);
                            c1425080nBi.LLJJL = f2;
                            c1425080nBi.I5();
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("TemplateItemViewHolder real play: ");
                            sbLIZ5.append(cutsameDataItem3.title);
                            sbLIZ5.append(", video = ");
                            VideoUrlModel playAddr = C1419160n2A.LIZ(cutsameDataItem3).getPlayAddr();
                            if (playAddr != null && (urlList = playAddr.getUrlList()) != null) {
                                str2 = (String) C13LP.LJJJLL(urlList);
                            }
                            sbLIZ5.append(str2);
                            C201955140j.LJIILJJIL(c1398350mUb3, C2188811AlT.LIZIZ(sbLIZ5));
                            c1425160nBq.tryResume(C1419160n2A.LIZ(cutsameDataItem3), C1425240nBy.LIZ(c1425080nBi, 0));
                            c1425080nBi.LLJLIL = false;
                            c1425080nBi.LLJLILLLLZIIL = System.currentTimeMillis();
                            c1425080nBi.LLJJJJJIL = true;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TemplateItemViewHolder@95ba.playVideo$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TemplateItemViewHolder@95ba.playVideo$1");
                }
            });
        }
    }

    public final void T5(boolean z, boolean z2) {
        String str;
        C1425160nBq c1425160nBq;
        boolean z3;
        InterfaceC1425150nBp interfaceC1425150nBpP5;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateItemViewHolder playerPause: ");
        CutsameDataItem cutsameDataItem = this.LLJJ;
        if (cutsameDataItem != null) {
            str = cutsameDataItem.title;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (C299160Bo2.LIZ()) {
            this.LLJJJJLIIL = R5();
            C1484970okJ c1484970okJN5 = N5();
            if (c1484970okJN5 != null) {
                if (z) {
                    InterfaceC1425150nBp interfaceC1425150nBpP52 = P5();
                    if (interfaceC1425150nBpP52 != null) {
                        interfaceC1425150nBpP52.LJIIIIZZ(c1484970okJN5);
                    }
                } else {
                    InterfaceC1425150nBp interfaceC1425150nBpP53 = P5();
                    if (interfaceC1425150nBpP53 != null) {
                        interfaceC1425150nBpP53.LJ(c1484970okJN5);
                    }
                }
            }
        } else {
            C1425160nBq c1425160nBq2 = this.LLJJIJIIJIL;
            if (c1425160nBq2 != null) {
                c1425160nBq2.pause();
            }
        }
        if (z2) {
            C786410Ut5.LJLLLLLL(8, this.LLJIJIL);
            C786410Ut5.LJLLLLLL(8, this.LLJILJIL);
        }
        if (!C299160Bo2.LIZ() ? !((c1425160nBq = this.LLJJIJIIJIL) == null || !c1425160nBq.isPlaying()) : !((interfaceC1425150nBpP5 = P5()) == null || !interfaceC1425150nBpP5.isPlaying())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z3) {
            this.LLJJLIIIJLLLLLLLZ = true;
        }
        if (!C299160Bo2.LIZ()) {
            W5(2, 0, null, this.LLJJ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [X.0nBr] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.0nBl] */
    public C1425080nBi(C19EG c19eg, Scene scene, Function0<Boolean> function0, final View view) {
        IToolsDebugGpService iToolsDebugGpService;
        super(view);
        this.LL = c19eg;
        this.LLILLJJLI = scene;
        this.LLILLL = function0;
        this.LLILZ = view.findViewById(R.id.eu1);
        this.LLILZIL = (SmartImageView) view.findViewById(R.id.cover);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.xhg);
        this.LLIZ = (FrameLayout) view.findViewById(R.id.video_container);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.xgu);
        this.LLJ = view.findViewById(R.id.f51);
        this.LLJI = view.findViewById(R.id.vya);
        this.LLJIJIL = view.findViewById(R.id.oxl);
        this.LLJILJIL = view.findViewById(R.id.unmute_btn);
        this.LLJILJILJ = (TuxTag) view.findViewById(R.id.xin);
        this.LLJJI = -1;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1018));
        this.LLJJJJJIL = true;
        this.LLJLIL = true;
        this.LLJLILLLLZIIL = -1L;
        this.LLJLLIL = ((Boolean) C0BOK.LIZ.getValue()).booleanValue();
        this.LLJLLL = C11VU.LIZIZ(12.0f, view.getContext());
        if (((Boolean) C0BO1.LIZ.getValue()).booleanValue() && (iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null)) != null) {
            iToolsDebugGpService.isOpen();
        }
        this.LLJZ = false;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1017));
        this.LLL = new InterfaceC362610EJn() { // from class: X.0nBr
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                InterfaceC1425150nBp interfaceC1425150nBpP5;
                if ((i == 24 || i == 25) && C299160Bo2.LIZ() && C299150Bo1.LIZ() && (interfaceC1425150nBpP5 = this.LL.P5()) != null && interfaceC1425150nBpP5.isPlaying() && Intrinsics.LJFF(interfaceC1425150nBpP5.LIZLLL(), this.LL.N5())) {
                    HandlerHook.viewPost(view, new ARunnableS122S0100000_22(this.LL, 115));
                }
                return false;
            }
        };
        if (C299160Bo2.LIZ() && C299150Bo1.LIZ()) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1466610oGh(this, 1));
        }
        this.LLLF = new InterfaceC1485010okN() { // from class: X.0nBl
            @Override // X.InterfaceC1485010okN
            public final void LJJZ() {
            }

            @Override // X.InterfaceC1485010okN
            public final void c8() {
            }

            @Override // X.InterfaceC1485010okN
            public final void LJII() {
                TuxTag tuxTag;
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TemplateItemViewHolder onRenderFirstFrame: ");
                CutsameDataItem cutsameDataItem = this.LIZ.LLJJ;
                sbLIZ.append(cutsameDataItem != null ? cutsameDataItem.title : null);
                sbLIZ.append(", video: ");
                sbLIZ.append(this.LIZ.LLIZ.getVisibility());
                sbLIZ.append(", cover = ");
                sbLIZ.append(this.LIZ.LLILZIL.getVisibility());
                sbLIZ.append(", needSeek = ");
                sbLIZ.append(this.LIZ.LLJJL > 0.0f);
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                C1425080nBi c1425080nBi = this.LIZ;
                boolean z = c1425080nBi.LLJJL > 0.0f;
                InterfaceC1425290nC3 interfaceC1425290nC3 = c1425080nBi.LLJJJ;
                if (interfaceC1425290nC3 != null) {
                    interfaceC1425290nC3.LIZIZ(null);
                }
                InterfaceC1425290nC3 interfaceC1425290nC32 = this.LIZ.LLJJJ;
                if (interfaceC1425290nC32 != null) {
                    interfaceC1425290nC32.LIZ(null, z);
                }
                if (C299140Bo0.LIZ()) {
                    C1425080nBi.L5(this.LIZ.LLILZIL);
                } else {
                    C337180DJs.LIZ(this.LIZ.LLILZIL);
                }
                C337180DJs.LIZJ(this.LIZ.LLIZ);
                this.LIZ.I5();
                if (!this.LIZ.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    this.LIZ.T5(false, false);
                }
                C1425080nBi c1425080nBi2 = this.LIZ;
                if (!c1425080nBi2.LLJZ || (tuxTag = c1425080nBi2.LLJILJILJ) == null) {
                    return;
                }
                String strReplace = new Regex("(\\r\\n|\\n)bitrate:.*").replace(tuxTag.getText().toString(), "");
                InterfaceC1425150nBp interfaceC1425150nBpP5 = c1425080nBi2.P5();
                Integer numValueOf = interfaceC1425150nBpP5 != null ? Integer.valueOf(interfaceC1425150nBpP5.LJIIIZ()) : null;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strReplace);
                sbLIZ2.append("\nbitrate: ");
                sbLIZ2.append(numValueOf);
                sbLIZ2.append(" gear: ");
                InterfaceC1425150nBp interfaceC1425150nBpP52 = c1425080nBi2.P5();
                sbLIZ2.append(interfaceC1425150nBpP52 != null ? interfaceC1425150nBpP52.LJFF() : null);
                tuxTag.setText(C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.InterfaceC1485010okN
            public final void LJJJJJL() {
                C1425080nBi c1425080nBi = this.LIZ;
                InterfaceC1425290nC3 interfaceC1425290nC3 = c1425080nBi.LLJJJ;
                if (interfaceC1425290nC3 != null) {
                    CutsameDataItem cutsameDataItem = c1425080nBi.LLJJ;
                    interfaceC1425290nC3.onResumePlay(cutsameDataItem != null ? cutsameDataItem.templateId : null);
                }
            }

            @Override // X.InterfaceC1485010okN
            public final void LJJLIIIJ() {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TemplateItemViewHolder onPlayCompleted: ");
                CutsameDataItem cutsameDataItem = this.LIZ.LLJJ;
                sbLIZ.append(cutsameDataItem != null ? cutsameDataItem.title : null);
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.V5(false);
                C1425080nBi c1425080nBi = this.LIZ;
                InterfaceC1425290nC3 interfaceC1425290nC3 = c1425080nBi.LLJJJ;
                if (interfaceC1425290nC3 != null) {
                    CutsameDataItem cutsameDataItem2 = c1425080nBi.LLJJ;
                    interfaceC1425290nC3.onPlayCompleted(cutsameDataItem2 != null ? cutsameDataItem2.templateId : null);
                }
            }

            @Override // X.InterfaceC1485010okN
            public final void LJJZZI() {
                C1425080nBi c1425080nBi = this.LIZ;
                InterfaceC1425290nC3 interfaceC1425290nC3 = c1425080nBi.LLJJJ;
                if (interfaceC1425290nC3 != null) {
                    CutsameDataItem cutsameDataItem = c1425080nBi.LLJJ;
                    interfaceC1425290nC3.onPlayPause(cutsameDataItem != null ? cutsameDataItem.templateId : null);
                }
            }

            @Override // X.InterfaceC1485010okN
            public final void Z7() {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TemplateItemViewHolder onPlayFailed: ");
                CutsameDataItem cutsameDataItem = this.LIZ.LLJJ;
                sbLIZ.append(cutsameDataItem != null ? cutsameDataItem.title : null);
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1425290nC3 interfaceC1425290nC3 = this.LIZ.LLJJJ;
                if (interfaceC1425290nC3 != null) {
                    interfaceC1425290nC3.LIZJ(null);
                }
            }

            @Override // X.InterfaceC1485010okN
            public final void b8() {
                C1425080nBi c1425080nBi = this.LIZ;
                InterfaceC1425290nC3 interfaceC1425290nC3 = c1425080nBi.LLJJJ;
                if (interfaceC1425290nC3 != null) {
                    CutsameDataItem cutsameDataItem = c1425080nBi.LLJJ;
                    interfaceC1425290nC3.onPlayStop(cutsameDataItem != null ? cutsameDataItem.templateId : null);
                }
            }

            @Override // X.InterfaceC1485010okN
            public final void d8() {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TemplateItemViewHolder onSeekSuccess: ");
                CutsameDataItem cutsameDataItem = this.LIZ.LLJJ;
                sbLIZ.append(cutsameDataItem != null ? cutsameDataItem.title : null);
                sbLIZ.append(", video: ");
                sbLIZ.append(this.LIZ.LLIZ.getVisibility());
                sbLIZ.append(", cover = ");
                sbLIZ.append(this.LIZ.LLILZIL.getVisibility());
                sbLIZ.append(", progress = ");
                sbLIZ.append(this.LIZ.R5());
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                if (C299140Bo0.LIZ()) {
                    C1425080nBi.L5(this.LIZ.LLILZIL);
                } else {
                    C337180DJs.LIZ(this.LIZ.LLILZIL);
                }
                C337180DJs.LIZJ(this.LIZ.LLIZ);
                this.LIZ.I5();
                if (this.LIZ.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    return;
                }
                this.LIZ.T5(false, false);
            }
        };
    }

    public final void W5(int i, int i2, String str, CutsameDataItem cutsameDataItem) {
        String str2;
        VideoUrlModel playAddr;
        List<String> urlList;
        if (!this.LLJLIL && this.LLJLILLLLZIIL > 0) {
            this.LLJLIL = true;
            if (cutsameDataItem != null && (playAddr = C1419160n2A.LIZ(cutsameDataItem).getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null) {
                str2 = (String) C13LP.LJJJLL(urlList);
            } else {
                str2 = null;
            }
            C1419580n2q.LJI(i, cutsameDataItem, System.currentTimeMillis() - this.LLJLILLLLZIIL, i2, str, str2, 1, this.LLJLL, this.LLJJI);
        }
    }
}
