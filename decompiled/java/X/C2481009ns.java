package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2481009ns implements C0OT0 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final InterfaceC497601wk LIZ;
    public final String LIZIZ;
    public final View LIZJ;
    public final C1295960jpS LIZLLL;
    public final ImageView LJ;
    public EnumC2480809nq LJFF;
    public boolean LJI;
    public final C2480909nr LJII;
    public BulletinGeckoResourceModel LJIIIIZZ;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final void LJFF() {
        C1295960jpS c1295960jpS = this.LIZLLL;
        if (c1295960jpS != null) {
            c1295960jpS.removeAnimatorListener(this.LJII);
        }
        LJIIL();
    }

    public final void LJIIL() {
        LJIILL();
        this.LJFF = EnumC2480809nq.LL;
        this.LJIIIIZZ = null;
        this.LJI = false;
        C1295960jpS c1295960jpS = this.LIZLLL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        ImageView imageView = this.LJ;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
    }

    public final void LJIILJJIL() {
        if (!C0OS8.LJI()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("-BulletinLottieImageWidget: startAnimation, state:");
            sbLIZ.append(this.LJFF);
            sbLIZ.append(" playWhenLoaded: ");
            sbLIZ.append(this.LJI);
            sbLIZ.append(' ');
            C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
        }
        int iOrdinal = this.LJFF.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                if (!this.LIZJ.isShown()) {
                    this.LJI = true;
                    return;
                }
                ImageView imageView = this.LJ;
                if (imageView != null) {
                    C786410Ut5.LJZI(8, imageView);
                }
                C1295960jpS c1295960jpS = this.LIZLLL;
                if (c1295960jpS != null) {
                    C786410Ut5.LLD(0, c1295960jpS);
                    if (!C0OS8.LJI()) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(this.LIZIZ);
                        sbLIZ2.append("-BulletinLottieImageWidget: startAnimation, playAnimation");
                        C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    c1295960jpS.playAnimation();
                }
                this.LJFF = EnumC2480809nq.LLILZ;
                return;
            }
            if (iOrdinal != 4) {
                return;
            }
        }
        this.LJI = true;
    }

    public final void LJIILL() {
        if (!C0OS8.LJI()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("-BulletinLottieImageWidget: stopAnimation, state:");
            sbLIZ.append(this.LJFF);
            sbLIZ.append(" playWhenLoaded: ");
            sbLIZ.append(this.LJI);
            sbLIZ.append(' ');
            C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
        }
        int iOrdinal = this.LJFF.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                C1295960jpS c1295960jpS = this.LIZLLL;
                if (c1295960jpS != null) {
                    c1295960jpS.cancelAnimation();
                    C786410Ut5.LLD(8, c1295960jpS);
                }
                ImageView imageView = this.LJ;
                if (imageView != null) {
                    C786410Ut5.LJZI(0, imageView);
                }
                this.LJFF = EnumC2480809nq.LLILLL;
                return;
            }
            if (iOrdinal != 4) {
                return;
            }
        }
        this.LJI = false;
    }

    public final void LJIIJ(boolean z) {
        if (!C0OS8.LJI()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("-BulletinLottieImageWidget: notifyGlobalLoadState, isAllSuccess: ");
            sbLIZ.append(z);
            sbLIZ.append(", state:");
            sbLIZ.append(this.LJFF);
            sbLIZ.append(" playWhenLoaded: ");
            sbLIZ.append(this.LJI);
            sbLIZ.append(' ');
            C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (z) {
            if (this.LJFF == EnumC2480809nq.LLILZIL) {
                this.LJFF = EnumC2480809nq.LLILLL;
                if (this.LJI) {
                    LJIILJJIL();
                    return;
                }
                return;
            }
            return;
        }
        EnumC2480809nq enumC2480809nq = this.LJFF;
        EnumC2480809nq enumC2480809nq2 = EnumC2480809nq.LLIZ;
        if (enumC2480809nq == enumC2480809nq2 || enumC2480809nq == EnumC2480809nq.LLILZLL || enumC2480809nq == EnumC2480809nq.LL) {
            return;
        }
        this.LJFF = enumC2480809nq2;
        BulletinGeckoResourceModel bulletinGeckoResourceModel = this.LJIIIIZZ;
        EnumC368901bz enumC368901bz = EnumC368901bz.IMAGE;
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C2480609no(this, bulletinGeckoResourceModel, enumC368901bz, null), 2);
    }

    public final void LJI(BulletinGeckoResourceModel bulletinGeckoResourceModel, Function0<Unit> function0) {
        EnumC2480809nq enumC2480809nq;
        if (!C0OS8.LJI()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("-BulletinLottieImageWidget: fallbackToStaticImage, playWhenLoaded: ");
            sbLIZ.append(this.LJI);
            sbLIZ.append(' ');
            C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (function0 != null) {
            enumC2480809nq = EnumC2480809nq.LLIZ;
        } else {
            enumC2480809nq = EnumC2480809nq.LL;
        }
        this.LJFF = enumC2480809nq;
        EnumC368901bz enumC368901bz = EnumC368901bz.IMAGE;
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C2480609no(this, bulletinGeckoResourceModel, enumC368901bz, null), 2);
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.09nr] */
    public C2481009ns(ViewStub viewStub, InterfaceC497601wk interfaceC497601wk, String str) {
        View viewLJLLLL;
        ViewGroup viewGroup;
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = str;
        if (C0OS8.LJI()) {
            ViewParent parent = viewStub.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                C786410Ut5.LJJLJLI(viewStub, viewGroup);
                Context context = viewStub.getContext();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                layoutParams.width = iLIZIZ;
                layoutParams.height = iLIZIZ;
                FrameLayout frameLayout = new FrameLayout(context);
                C786410Ut5.a6(frameLayout, layoutParams);
                C1295960jpS c1295960jpS = new C1295960jpS(context);
                c1295960jpS.setId(R.id.nre);
                C786410Ut5.s6(c1295960jpS, new FrameLayout.LayoutParams(-1, -1));
                c1295960jpS.setLayoutDirection(3);
                C786410Ut5.LLD(8, c1295960jpS);
                frameLayout.addView(c1295960jpS);
                ImageView imageView = new ImageView(context);
                imageView.setId(R.id.kbr);
                C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(-1, -1));
                C786410Ut5.LJZI(8, imageView);
                frameLayout.addView(imageView);
                viewGroup.addView(frameLayout, iIndexOfChild);
                viewLJLLLL = frameLayout;
            } else {
                viewStub.setLayoutResource(R.layout.a7h);
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            }
        } else {
            viewStub.setLayoutResource(R.layout.a7h);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        }
        this.LIZJ = viewLJLLLL;
        this.LIZLLL = (C1295960jpS) viewLJLLLL.findViewById(R.id.nre);
        this.LJ = (ImageView) viewLJLLLL.findViewById(R.id.kbr);
        this.LJFF = EnumC2480809nq.LL;
        this.LJII = new AnimatorListenerAdapter() { // from class: X.09nr
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C2481009ns c2481009ns = this.LL;
                if (!C0OS8.LJI()) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c2481009ns.LIZIZ);
                    sbLIZ.append("-BulletinLottieImageWidget: onAnimationEnd: success");
                    C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
                }
                C2481009ns c2481009ns2 = this.LL;
                if (c2481009ns2.LJFF != EnumC2480809nq.LLILZ) {
                    return;
                }
                c2481009ns2.LJI = false;
                C1295960jpS c1295960jpS2 = c2481009ns2.LIZLLL;
                if (c1295960jpS2 != null) {
                    c1295960jpS2.removeAnimatorListener(this);
                }
                this.LL.LJFF = EnumC2480809nq.LLILZLL;
            }
        };
    }

    public final void LIZLLL(BulletinGeckoResourceModel bulletinGeckoResourceModel, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        float f;
        C786410Ut5.LJLLLLLL(0, this.LIZJ);
        C1295960jpS c1295960jpS = this.LIZLLL;
        if (c1295960jpS != null) {
            if (C426750GoL.LIZLLL(this.LIZJ.getContext())) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.Wb(c1295960jpS, f);
        }
        if (!C0OS8.LJI()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("-BulletinLottieImageWidget: bindResourceModel: needAnimation:");
            sbLIZ.append(z);
            sbLIZ.append(' ');
            C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
        }
        LJIIL();
        this.LJIIIIZZ = bulletinGeckoResourceModel;
        String str = bulletinGeckoResourceModel.packageChannelId;
        if (str != null && C123100dR.LIZ(str)) {
            if (z && C617100OIi.LIZJ(bulletinGeckoResourceModel)) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_gameplay_lottie_setting", true, true)) {
                    if (!C0OS8.LJI()) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(this.LIZIZ);
                        sbLIZ2.append("-BulletinLottieImageWidget: showToInitStaticImage, playWhenLoaded: ");
                        sbLIZ2.append(this.LJI);
                        sbLIZ2.append(' ');
                        C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    this.LJFF = EnumC2480809nq.LL;
                    EnumC368901bz enumC368901bz = EnumC368901bz.INIT_IMAGE;
                    InterfaceC497601wk interfaceC497601wk = this.LIZ;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C2480609no(this, bulletinGeckoResourceModel, enumC368901bz, null), 2);
                }
                if (!C0OS8.LJI()) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(this.LIZIZ);
                    sbLIZ3.append("-BulletinLottieImageWidget: LoadLottieImage: ");
                    C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ3));
                }
                this.LJFF = EnumC2480809nq.LLILLJJLI;
                C363301b5.LIZ(bulletinGeckoResourceModel, this.LIZ, Collections.singletonList(EnumC368901bz.LOTTIE), C0PEM.LIZJ, new C2480409nm(this, function0, bulletinGeckoResourceModel, function02, null));
                return;
            }
            LJI(bulletinGeckoResourceModel, null);
        }
    }
}
