package X;

import Y.ARunnableS116S0100000_16;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AdBottomContainerInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDefaultContainerInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdFoldButtonInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdTopContainerInfoStruct;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0c54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC998120c54 implements InterfaceC988860bq8, View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final InterfaceC990590bsv LL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(535));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS560S0100000_16((InterfaceC1010530cP5) this, 795));
    public final AdDescriptiveCTAStruct LLILZ;
    public final C997400c3u LLILZIL;
    public final C998060c4y LLILZLL;
    public final C997890c4h LLIZ;
    public final C997830c4b LLIZLLLIL;
    public final C997790c4X LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C998210c5D LLJILJIL;
    public final C1000590c93 LLJILJILJ;
    public C998110c53 LLJILLL;
    public InterfaceC998200c5C<? extends InterfaceC998220c5E> LLJJ;
    public final C330230Cx3 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ViewOnClickListenerC998120c54.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC987490bnv
    public final void LJL() {
        AdDescriptiveCTAStruct adDescriptiveCTAStruct;
        this.LLJIJIL = false;
        InterfaceC998200c5C<? extends InterfaceC998220c5E> interfaceC998200c5C = this.LLJJ;
        if (interfaceC998200c5C != null) {
            interfaceC998200c5C.LJLJL();
        }
        C998110c53 c998110c53 = this.LLJILLL;
        if (c998110c53 != null) {
            Animator animator = c998110c53.LJIIL;
            if (animator != null) {
                C998110c53.LIZ(animator);
            }
            Animator animator2 = c998110c53.LJIILIIL;
            if (animator2 != null) {
                C998110c53.LIZ(animator2);
            }
            Animator animator3 = c998110c53.LJIILJJIL;
            if (animator3 != null) {
                C998110c53.LIZ(animator3);
            }
            Animator animator4 = c998110c53.LJIILL;
            if (animator4 != null) {
                C998110c53.LIZ(animator4);
            }
            Animator animator5 = c998110c53.LJIILLIIL;
            if (animator5 != null) {
                C998110c53.LIZ(animator5);
            }
            Animator animator6 = c998110c53.LJIIZILJ;
            if (animator6 != null) {
                C998110c53.LIZ(animator6);
            }
            Animator animator7 = c998110c53.LJIJ;
            if (animator7 != null) {
                C998110c53.LIZ(animator7);
            }
            Animator animator8 = c998110c53.LJIJI;
            if (animator8 != null) {
                C998110c53.LIZ(animator8);
            }
            Animator animator9 = c998110c53.LJIJJ;
            if (animator9 != null) {
                C998110c53.LIZ(animator9);
            }
            Animator animator10 = c998110c53.LJIJJLI;
            if (animator10 != null) {
                C998110c53.LIZ(animator10);
            }
            Animator animator11 = c998110c53.LJIL;
            if (animator11 != null) {
                C998110c53.LIZ(animator11);
            }
            Animator animator12 = c998110c53.LJJ;
            if (animator12 != null) {
                C998110c53.LIZ(animator12);
            }
            AbstractC997340c3o abstractC997340c3o = c998110c53.LIZJ;
            if (abstractC997340c3o != null) {
                abstractC997340c3o.LJFF("change_stage_event", new Pair<>("stageName", "reset"));
            }
            AbstractC997340c3o abstractC997340c3o2 = c998110c53.LIZLLL;
            if (abstractC997340c3o2 != null) {
                abstractC997340c3o2.LJFF("change_stage_event", new Pair<>("stageName", "reset"));
            }
        }
        if (this.LLJILJIL.LJ) {
            this.LL.LJJIFFI().LIZ(1.0f);
            this.LL.LJJIFFI().LIZIZ(0);
            C997830c4b c997830c4b = this.LLIZLLLIL;
            if (c997830c4b != null) {
                C997370c3r.LIZJ(c997830c4b, 8);
            }
        }
        if (this.LLJILJIL.LIZLLL && ((adDescriptiveCTAStruct = this.LLILZ) == null || !adDescriptiveCTAStruct.getHideMusicDisc())) {
            C998390c5V c998390c5VLJIIL = this.LL.LJIIL();
            c998390c5VLJIIL.LIZJ(c998390c5VLJIIL.LIZLLL());
            c998390c5VLJIIL.LIZIZ(1.0f);
            c998390c5VLJIIL.LJFF(0);
        }
        if (this.LLJILJIL.LJFF) {
            C998390c5V c998390c5VLJIIL2 = this.LL.LJIIL();
            AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 304);
            c998390c5VLJIIL2.LIZ(1.0f, awS595S0100000_16);
            c998390c5VLJIIL2.LJ(0, awS595S0100000_16);
        }
        C997790c4X c997790c4X = this.LLJ;
        if (c997790c4X != null) {
            C997370c3r.LIZJ(c997790c4X, 8);
        }
        C998060c4y c998060c4y = this.LLILZLL;
        if (c998060c4y != null) {
            C997370c3r.LIZJ(c998060c4y, 8);
        }
        C997890c4h c997890c4h = this.LLIZ;
        if (c997890c4h != null) {
            c997890c4h.m61(0.0f);
        }
        C998060c4y c998060c4y2 = this.LLILZLL;
        if (c998060c4y2 != null) {
            c998060c4y2.setBackgroundColor(654311423);
        }
        C998210c5D c998210c5D = this.LLJILJIL;
        c998210c5D.getClass();
        c998210c5D.LIZ = new C997010c3H(0);
        c998210c5D.LIZIZ = true;
        c998210c5D.LIZJ = false;
        c998210c5D.LIZLLL = false;
        c998210c5D.LJ = false;
        c998210c5D.LJFF = false;
        c998210c5D.LJI = false;
        c998210c5D.LJII = false;
        this.LLJI = false;
        LIZIZ();
    }

    public final Aweme LIZ() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (Aweme) c997320c3m.LIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r4 = this;
            X.0c4b r0 = r4.LLIZLLLIL
            r3 = 0
            if (r0 == 0) goto L5d
            X.0c3F r2 = r0.LIZ()
        L9:
            X.0c4X r0 = r4.LLJ
            if (r0 == 0) goto L11
            X.0c3F r3 = r0.LIZ()
        L11:
            X.0c5D r1 = r4.LLJILJIL
            boolean r0 = r2 instanceof X.C997010c3H
            if (r0 != 0) goto L20
            boolean r0 = r2 instanceof X.C997000c3G
            if (r0 == 0) goto L4c
            boolean r0 = r3 instanceof X.C997010c3H
            if (r0 == 0) goto L20
        L1f:
            r2 = r3
        L20:
            r1.LIZ = r2
            X.0c3I r0 = X.C997020c3I.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r2 = 1
            r0 = r0 ^ 1
            r1.LIZIZ = r0
            X.0c5D r0 = r4.LLJILJIL
            boolean r0 = r0.LIZIZ
            if (r0 != 0) goto L4b
            com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct r0 = r4.LLILZ
            r1 = 0
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.commercialize.model.AdFoldButtonInfoStruct r0 = r0.getFoldButton()
            if (r0 == 0) goto L4b
            boolean r0 = r0.getShouldShow()
            if (r0 != r2) goto L4b
            X.0c4h r0 = r4.LLIZ
            if (r0 == 0) goto L4b
            X.C997370c3r.LIZJ(r0, r1)
        L4b:
            return
        L4c:
            boolean r0 = r2 instanceof X.C997020c3I
            if (r0 == 0) goto L53
            if (r3 != 0) goto L1f
            goto L20
        L53:
            if (r3 != 0) goto L1f
            X.0c3H r2 = new X.0c3H
            java.lang.String r0 = ""
            r2.<init>(r0)
            goto L20
        L5d:
            r2 = r3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC998120c54.LIZIZ():void");
    }

    @Override // X.InterfaceC987490bnv
    public final void LJJLJLI() {
        AdDescriptiveCTAStruct adDescriptiveCTAStruct;
        AdFoldButtonInfoStruct foldButton;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct2 = this.LLILZ;
        if (adDescriptiveCTAStruct2 != null && adDescriptiveCTAStruct2.getHideMusicDisc()) {
            this.LL.LJIIL().LJFF(8);
        }
        this.LLJIJIL = true;
        if (this.LLJILJIL.LIZIZ || (adDescriptiveCTAStruct = this.LLILZ) == null || (foldButton = adDescriptiveCTAStruct.getFoldButton()) == null || !foldButton.getShouldShow()) {
            return;
        }
        C1000590c93 c1000590c93 = this.LLJILJILJ;
        C1000560c90.LIZ.getClass();
        c1000590c93.logAd(C1000560c90.LJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0c5A] */
    @Override // X.InterfaceC1037910d7F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initialize() {
        /*
            r6 = this;
            X.01GW r0 = r6.LLILLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ad.feed.FeedBehaviourViewModel r0 = (com.ss.android.ugc.aweme.ad.feed.FeedBehaviourViewModel) r0
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r3 = r0.LL
            X.0bsv r0 = r6.LL
            androidx.lifecycle.LifecycleOwner r2 = r0.getLifecycleOwner()
            Y.AObserverS220S0100000_16 r1 = new Y.AObserverS220S0100000_16
            r0 = 31
            r1.<init>(r6, r0)
            r3.observe(r2, r1)
            X.01GW r0 = r6.LLILLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ad.feed.FeedBehaviourViewModel r0 = (com.ss.android.ugc.aweme.ad.feed.FeedBehaviourViewModel) r0
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r3 = r0.LLILLJJLI
            X.0bsv r0 = r6.LL
            androidx.lifecycle.LifecycleOwner r2 = r0.getLifecycleOwner()
            Y.AObserverS220S0100000_16 r1 = new Y.AObserverS220S0100000_16
            r0 = 32
            r1.<init>(r6, r0)
            r3.observe(r2, r1)
            X.0c4y r3 = r6.LLILZLL
            X.0c4h r2 = r6.LLIZ
            r5 = 0
            if (r3 == 0) goto Lb4
            if (r2 == 0) goto Lb4
            X.0c53 r1 = new X.0c53
            X.0c51 r0 = new X.0c51
            r0.<init>(r6, r3, r2)
            r1.<init>(r0)
        L47:
            r6.LLJILLL = r1
            com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct r0 = r6.LLILZ
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.commercialize.model.AdBottomContainerInfoStruct r0 = r0.getBottomContainer()
            if (r0 == 0) goto Lb2
            int r4 = r0.getShowSeconds()
        L57:
            com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct r0 = r6.LLILZ
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.commercialize.model.AdTopContainerInfoStruct r0 = r0.getLeftContainer()
            if (r0 == 0) goto Lb0
            int r0 = r0.getShowSeconds()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L69:
            com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct r0 = r6.LLILZ
            if (r0 == 0) goto Lae
            com.ss.android.ugc.aweme.commercialize.model.AdBottomContainerInfoStruct r0 = r0.getBottomContainer()
            if (r0 == 0) goto Lae
            com.ss.android.ugc.aweme.commercialize.model.AnimationInfoStruct r0 = r0.getAnimationInfo()
            if (r0 == 0) goto Lae
            int r0 = r0.getAnimationSeconds()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L81:
            X.0c53 r1 = r6.LLJILLL
            if (r1 == 0) goto L93
            if (r3 != 0) goto L96
            if (r2 != 0) goto La3
            X.0c57 r5 = new X.0c57
            X.0c5A r0 = new X.0c5A
            r0.<init>(r4, r1, r6)
            r5.<init>(r0)
        L93:
            r6.LLJJ = r5
            return
        L96:
            if (r2 == 0) goto La3
            X.0c55 r5 = new X.0c55
            X.0c59 r0 = new X.0c59
            r0.<init>(r3, r2, r1, r6)
            r5.<init>(r0)
            goto L93
        La3:
            X.0c56 r5 = new X.0c56
            X.0c58 r0 = new X.0c58
            r0.<init>(r3, r4, r1, r6)
            r5.<init>(r0)
            goto L93
        Lae:
            r2 = r5
            goto L81
        Lb0:
            r3 = r5
            goto L69
        Lb2:
            r4 = 0
            goto L57
        Lb4:
            r1 = r5
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC998120c54.initialize():void");
    }

    @Override // X.InterfaceC987490bnv
    public final void onBind() {
        LIZIZ();
        if (this.LLJILJIL.LIZIZ) {
            C330230Cx3 c330230Cx3 = this.LLJJI;
            InterfaceC330240Cx4 interfaceC330240Cx4 = new InterfaceC330240Cx4() { // from class: X.0c5F
                public int LIZ;

                @Override // X.InterfaceC330240Cx4
                public final boolean getCancelable() {
                    return this.LIZ == 6 || this.LIZIZ.LLJIJIL;
                }

                @Override // X.InterfaceC330240Cx4
                public final void run() {
                    this.LIZ++;
                    this.LIZIZ.LIZIZ();
                    if (this.LIZIZ.LLJILJIL.LIZIZ) {
                        return;
                    }
                    this.LIZ = 6;
                }
            };
            ((ArrayList) c330230Cx3.LIZ).add(interfaceC330240Cx4);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.plus(C23118094a.LIZ())), null, null, new C330220Cx2(interfaceC330240Cx4, c330230Cx3, null), 3);
        }
    }

    @Override // X.InterfaceC987490bnv
    public final void onUnbind() {
        LJL();
        C997890c4h c997890c4h = this.LLIZ;
        if (c997890c4h != null) {
            C997370c3r.LIZJ(c997890c4h, 8);
        }
        C998110c53 c998110c53 = this.LLJILLL;
        if (c998110c53 != null) {
            Animator animator = c998110c53.LJIIL;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = c998110c53.LJIILIIL;
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator animator3 = c998110c53.LJIILJJIL;
            if (animator3 != null) {
                animator3.cancel();
            }
            Animator animator4 = c998110c53.LJIILL;
            if (animator4 != null) {
                animator4.cancel();
            }
            Animator animator5 = c998110c53.LJIILLIIL;
            if (animator5 != null) {
                animator5.cancel();
            }
            Animator animator6 = c998110c53.LJIIZILJ;
            if (animator6 != null) {
                animator6.cancel();
            }
            Animator animator7 = c998110c53.LJIJ;
            if (animator7 != null) {
                animator7.cancel();
            }
            Animator animator8 = c998110c53.LJIJI;
            if (animator8 != null) {
                animator8.cancel();
            }
            Animator animator9 = c998110c53.LJIJJ;
            if (animator9 != null) {
                animator9.cancel();
            }
            Animator animator10 = c998110c53.LJIJJLI;
            if (animator10 != null) {
                animator10.cancel();
            }
            Animator animator11 = c998110c53.LJIL;
            if (animator11 != null) {
                animator11.cancel();
            }
            Animator animator12 = c998110c53.LJJ;
            if (animator12 != null) {
                animator12.cancel();
            }
        }
        C997400c3u c997400c3u = this.LLILZIL;
        c997400c3u.getClass();
        EventBus.LIZLLL().LJJI(c997400c3u);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0c4Y] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0c4c] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0c3o, X.0c4X] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0c93] */
    public ViewOnClickListenerC998120c54(C735630StN c735630StN) {
        AdDescriptiveCTAStruct adDescriptiveCTA;
        final String buttonText;
        C998060c4y c998060c4y;
        C997890c4h c997890c4h;
        AdTopContainerInfoStruct leftContainer;
        C997830c4b c997830c4b;
        AdBottomContainerInfoStruct bottomContainer;
        AwemeRawAd awemeRawAd;
        AdDescriptiveCTAStruct adDescriptiveCTA2;
        AwemeRawAd awemeRawAd2;
        AdDescriptiveCTAStruct adDescriptiveCTA3;
        AdDefaultContainerInfoStruct defaultContainer;
        this.LL = c735630StN;
        AwemeRawAd awemeRawAd3 = LIZ().getAwemeRawAd();
        C997790c4X c997790c4X = 0;
        c997790c4X = 0;
        c997790c4X = 0;
        if (awemeRawAd3 != null) {
            adDescriptiveCTA = awemeRawAd3.getAdDescriptiveCTA();
        } else {
            adDescriptiveCTA = null;
        }
        this.LLILZ = adDescriptiveCTA;
        C997400c3u c997400c3u = new C997400c3u();
        this.LLILZIL = c997400c3u;
        C998210c5D c998210c5D = new C998210c5D(0);
        this.LLJILJIL = c998210c5D;
        this.LLJILJILJ = new AbstractC1023470cjx(LIZ(), c998210c5D) { // from class: X.0c93
            public final C1023630ckD<?>[] LIZ;

            @Override // X.AbstractC1023380cjo, X.C1023640ckE
            public final C1023630ckD<?>[] getInternalLogics() {
                return this.LIZ;
            }

            {
                super(Arrays.copyOf(objArr, objArr.length));
                this.LIZ = new C1023630ckD[0];
            }
        };
        this.LLJJI = new C330230Cx3();
        c997400c3u.LIZIZ();
        final ViewGroup viewGroup = c735630StN.LJFF;
        if (adDescriptiveCTA != null && (defaultContainer = adDescriptiveCTA.getDefaultContainer()) != null) {
            buttonText = defaultContainer.getButtonText();
        } else {
            buttonText = null;
        }
        if (viewGroup != null && buttonText != null) {
            C786410Ut5.K7(viewGroup, this);
            c998060c4y = new C998060c4y(new InterfaceC998070c4z(this, buttonText, viewGroup) { // from class: X.0c5G
                public final String LIZ;
                public final String LIZIZ;
                public final ViewGroup LIZJ;

                @Override // X.InterfaceC998070c4z
                public final String LIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC997360c3q
                public final ViewGroup LJIJI() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC998070c4z
                public final String getButtonText() {
                    return this.LIZIZ;
                }

                {
                    String buttonIconUrl;
                    AdDefaultContainerInfoStruct defaultContainer2;
                    AdDescriptiveCTAStruct adDescriptiveCTAStruct = this.LLILZ;
                    if (adDescriptiveCTAStruct != null && (defaultContainer2 = adDescriptiveCTAStruct.getDefaultContainer()) != null) {
                        buttonIconUrl = defaultContainer2.getButtonIconUrl();
                    } else {
                        buttonIconUrl = null;
                    }
                    this.LIZ = buttonIconUrl;
                    this.LIZIZ = buttonText;
                    this.LIZJ = viewGroup;
                }
            });
            c998060c4y.initialize();
            c998060c4y.setBackgroundColor(654311423);
            C997370c3r.LIZ(c998060c4y, -40);
        } else {
            c998060c4y = null;
        }
        this.LLILZLL = c998060c4y;
        ViewGroup viewGroup2 = c735630StN.LJI;
        if (viewGroup2 != null) {
            C786410Ut5.K7(viewGroup2, this);
            c997890c4h = new C997890c4h(new C997900c4i(viewGroup2));
        } else {
            c997890c4h = null;
        }
        this.LLIZ = c997890c4h;
        final ViewGroup viewGroup3 = c735630StN.LIZLLL;
        final Aweme awemeLIZ = LIZ();
        Aweme awemeLIZ2 = LIZ();
        if (awemeLIZ2 != null && (awemeRawAd2 = awemeLIZ2.getAwemeRawAd()) != null && (adDescriptiveCTA3 = awemeRawAd2.getAdDescriptiveCTA()) != null) {
            leftContainer = adDescriptiveCTA3.getLeftContainer();
        } else {
            leftContainer = null;
        }
        if (viewGroup3 != null && awemeLIZ != null && leftContainer != null) {
            final ?? r0 = new InterfaceC997350c3p(viewGroup3, awemeLIZ) { // from class: X.0c4c
                public final ViewGroup LIZ;
                public final Aweme LIZIZ;

                @Override // X.InterfaceC997360c3q
                public final ViewGroup LJIJI() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC997350c3p
                public final Aweme getAweme() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = viewGroup3;
                    this.LIZIZ = awemeLIZ;
                }
            };
            AbstractC997340c3o abstractC997340c3o = new AbstractC997340c3o(r0) { // from class: X.0c4b
                public final InterfaceC997350c3p LLIZLLLIL;

                @Override // X.AbstractC997340c3o
                public final String LJ() {
                    return "feed_descriptive_cta_top";
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
                    return C1000510c8v.LIZJ(context, aweme);
                }

                @Override // X.AbstractC997340c3o
                public final C1051290dSp LIZJ(Context context, Aweme aweme) {
                    return C1000510c8v.LIZIZ(context, aweme);
                }
            };
            abstractC997340c3o.initialize();
            c997830c4b = abstractC997340c3o;
        } else {
            c997830c4b = 0;
        }
        this.LLIZLLLIL = c997830c4b;
        final ViewGroup viewGroup4 = c735630StN.LJ;
        final Aweme awemeLIZ3 = LIZ();
        Aweme awemeLIZ4 = LIZ();
        if (awemeLIZ4 != null && (awemeRawAd = awemeLIZ4.getAwemeRawAd()) != null && (adDescriptiveCTA2 = awemeRawAd.getAdDescriptiveCTA()) != null) {
            bottomContainer = adDescriptiveCTA2.getBottomContainer();
        } else {
            bottomContainer = null;
        }
        if (viewGroup4 != null && awemeLIZ3 != null && bottomContainer != null) {
            final ?? r02 = new InterfaceC997350c3p(viewGroup4, awemeLIZ3) { // from class: X.0c4Y
                public final ViewGroup LIZ;
                public final Aweme LIZIZ;

                @Override // X.InterfaceC997360c3q
                public final ViewGroup LJIJI() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC997350c3p
                public final Aweme getAweme() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = viewGroup4;
                    this.LIZIZ = awemeLIZ3;
                }
            };
            c997790c4X = new AbstractC997340c3o(r02) { // from class: X.0c4X
                public final InterfaceC997350c3p LLIZLLLIL;

                @Override // X.AbstractC997340c3o
                public final String LJ() {
                    return "feed_descriptive_cta_bottom";
                }

                @Override // X.InterfaceC1010530cP5
                public final /* bridge */ /* synthetic */ Object Mh() {
                    return this.LLIZLLLIL;
                }

                {
                    this.LLIZLLLIL = r02;
                }

                @Override // X.AbstractC997340c3o
                public final C1028380crs LIZIZ(Context context, Aweme aweme) {
                    return C1000480c8s.LIZJ(context, aweme);
                }

                @Override // X.AbstractC997340c3o
                public final C1051290dSp LIZJ(Context context, Aweme aweme) {
                    return C1000480c8s.LIZIZ(context, aweme);
                }
            };
            c997790c4X.initialize();
        }
        this.LLJ = c997790c4X;
    }

    @Override // X.InterfaceC987500bnw
    public final void ME1(long j) {
        int changeColorSeconds;
        AdBottomContainerInfoStruct bottomContainer;
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        InterfaceC998200c5C<? extends InterfaceC998220c5E> interfaceC998200c5C = this.LLJJ;
        if (interfaceC998200c5C != null) {
            interfaceC998200c5C.wv2(j);
        }
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 178);
        IVideoPlayTaskManager iVideoPlayTaskManagerLIZ = this.LL.LIZ();
        C988300bpE c988300bpE = new C988300bpE("COMMERCE_REVAMP_COLOR_CHANGE_TASK_NAME");
        c988300bpE.LIZIZ(j);
        AdDescriptiveCTAStruct adDescriptiveCTAStruct = this.LLILZ;
        if (adDescriptiveCTAStruct != null && (bottomContainer = adDescriptiveCTAStruct.getBottomContainer()) != null) {
            changeColorSeconds = bottomContainer.getChangeColorSeconds();
        } else {
            changeColorSeconds = 0;
        }
        c988300bpE.LIZJ = changeColorSeconds * LSPassThroughRecordSizeConfig.DEFAULT;
        c988300bpE.LIZLLL = aRunnableS116S0100000_16;
        c988300bpE.LJ = false;
        iVideoPlayTaskManagerLIZ.LLIFFJFJJ(c988300bpE.LIZ());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        AwemeRawAd awemeRawAd;
        if (Intrinsics.LJFF(view, this.LL.LIZIZ())) {
            this.LLJILJIL.LIZJ = true;
            C1000590c93 c1000590c93 = this.LLJILJILJ;
            C1000560c90.LIZ.getClass();
            c1000590c93.logAd(C1000560c90.LJII);
            C998210c5D c998210c5D = this.LLJILJIL;
            if (!c998210c5D.LJ && !c998210c5D.LJFF) {
                InterfaceC998200c5C<? extends InterfaceC998220c5E> interfaceC998200c5C = this.LLJJ;
                if (interfaceC998200c5C != null) {
                    interfaceC998200c5C.l1();
                    return;
                }
                return;
            }
            InterfaceC998200c5C<? extends InterfaceC998220c5E> interfaceC998200c5C2 = this.LLJJ;
            if (interfaceC998200c5C2 == null) {
                return;
            }
            interfaceC998200c5C2.rk();
            return;
        }
        if (!Intrinsics.LJFF(view, this.LL.LJIIZILJ())) {
            return;
        }
        C1029590ctp.LIZIZ();
        ViewGroup viewGroupLJIIZILJ = this.LL.LJIIZILJ();
        if (viewGroupLJIIZILJ != null) {
            context = viewGroupLJIIZILJ.getContext();
        } else {
            context = null;
        }
        C0SQ9.LIZ(context, LIZ(), 60, new InterfaceC1021920chS() { // from class: X.0bq5
            @Override // X.InterfaceC1021920chS
            public final void LIZ() {
            }
        });
        C1000590c93 c1000590c932 = this.LLJILJILJ;
        C1000560c90.LIZ.getClass();
        c1000590c932.logAd(C1000560c90.LJIIIZ);
        Aweme awemeLIZ = LIZ();
        if (awemeLIZ == null || (awemeRawAd = awemeLIZ.getAwemeRawAd()) == null) {
            return;
        }
        UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
        Long creativeId = awemeRawAd.getCreativeId();
        String logExtra = awemeRawAd.getLogExtra();
        new AwS630S0100000_16(awemeRawAd, 76);
        C2201691BEx.LIZ("click", clickTrackUrlList, creativeId, logExtra);
    }
}
