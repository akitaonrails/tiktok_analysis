package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.story.experiment.feed.StoryPublishNativeAnimConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0ryE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608920ryE extends AbstractC1608840ry6<AbstractC1606860ruu, C1606750ruj> {
    public AvatarComponentView LIZIZ;
    public EnumC1606030rtZ LIZJ;
    public C1609220ryi LIZLLL;
    public boolean LJI;
    public AbstractC1606860ruu LJII;
    public EnumC1606080rte LJIIIIZZ;
    public boolean LJIIIZ;
    public C0GZD LJIIJ;
    public final EnumC1607270rvZ LIZ = EnumC1607270rvZ.STORY;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(576));
    public AtomicBoolean LJFF = new AtomicBoolean(false);

    public final void LJI() {
        C0GZD c0gzd;
        if (!((StoryPublishNativeAnimConfig) C0CAE.LIZIZ.getValue()).enable || (c0gzd = this.LJIIJ) == null) {
            C1609220ryi c1609220ryiLJIIIIZZ = LJIIIIZZ();
            if (c1609220ryiLJIIIIZZ != null) {
                c1609220ryiLJIIIIZZ.cancelAnimation();
            }
        } else {
            c0gzd.stop();
            this.LJIIJ = null;
        }
        C1609220ryi c1609220ryiLJIIIIZZ2 = LJIIIIZZ();
        if (c1609220ryiLJIIIIZZ2 != null) {
            c1609220ryiLJIIIIZZ2.setImageDrawable(null);
        }
    }

    public final C1292030jj7<C1294720jnS> LJII() {
        C1608950ryH lottieSource;
        EnumC1606030rtZ enumC1606030rtZ = this.LIZJ;
        if (enumC1606030rtZ == null || (lottieSource = enumC1606030rtZ.getLottieSource()) == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lottieSource.LIZ);
        sbLIZ.append(lottieSource.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1292030jj7<C1294720jnS> c1292030jj7LIZ = (C1292030jj7) ((Map) this.LJ.getValue()).get(strLIZIZ);
        if (c1292030jj7LIZ == null) {
            c1292030jj7LIZ = C19469211Fa.LIZ(lottieSource.LIZ, lottieSource.LIZIZ);
            if (c1292030jj7LIZ == null) {
                return null;
            }
            ((Map) this.LJ.getValue()).put(strLIZIZ, c1292030jj7LIZ);
        }
        return c1292030jj7LIZ;
    }

    public final C1609220ryi LJIIIIZZ() {
        C1609220ryi c1609220ryi = this.LIZLLL;
        if (c1609220ryi == null) {
            View viewLJ = AbstractC1608840ry6.LJ(this, EnumC1608710rxt.RING, this.LIZIZ);
            if (!(viewLJ instanceof C1609220ryi) || (c1609220ryi = (C1609220ryi) viewLJ) == null) {
                return null;
            }
            int color = ColorProtector.parseColor("#E3E3E5");
            c1609220ryi.LLIZ = true;
            c1609220ryi.LLJILLL = color;
            this.LIZLLL = c1609220ryi;
        }
        return c1609220ryi;
    }

    public final boolean LJIIJ() {
        EnumC1606080rte enumC1606080rte = this.LJIIIIZZ;
        if (enumC1606080rte != null && C1256890ioR.LIZ[enumC1606080rte.ordinal()] == 1) {
            return true;
        }
        EnumC1606080rte enumC1606080rte2 = this.LJIIIIZZ;
        if (enumC1606080rte2 == null) {
            return false;
        }
        return C420101kF.LIZ(enumC1606080rte2);
    }

    @Override // X.InterfaceC1608850ry7
    public final EnumC1607270rvZ LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1608850ry7
    public final void LIZLLL(InterfaceC1606880ruw interfaceC1606880ruw) {
        boolean zBooleanValue;
        C1606840rus c1606840rus;
        C1606780rum c1606780rum;
        if (!(interfaceC1606880ruw instanceof AbstractC1606860ruu)) {
            return;
        }
        AbstractC1606860ruu abstractC1606860ruu = (AbstractC1606860ruu) interfaceC1606880ruw;
        this.LJII = abstractC1606860ruu;
        Boolean boolLIZIZ = abstractC1606860ruu.LIZIZ();
        if (boolLIZIZ != null) {
            zBooleanValue = boolLIZIZ.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LJI = zBooleanValue;
        if (zBooleanValue) {
            Float fValueOf = null;
            if ((abstractC1606860ruu instanceof C1606840rus) && (c1606840rus = (C1606840rus) abstractC1606860ruu) != null && (c1606780rum = c1606840rus.LLILZIL) != null) {
                fValueOf = Float.valueOf(c1606780rum.LIZ);
            }
            LJFF(abstractC1606860ruu, fValueOf);
            return;
        }
        if (LJIIJ() && (abstractC1606860ruu instanceof C1606820ruq)) {
            return;
        }
        LJI();
        C1609220ryi c1609220ryiLJIIIIZZ = LJIIIIZZ();
        if (c1609220ryiLJIIIIZZ != null) {
            c1609220ryiLJIIIIZZ.LJI(EnumC1256840ioM.END_ANIMATION);
        }
        LJIIIZ(true);
    }

    public final void LJIIIZ(boolean z) {
        C1609220ryi c1609220ryiLJIIIIZZ = LJIIIIZZ();
        if (c1609220ryiLJIIIIZZ != null && c1609220ryiLJIIIIZZ.getCanDrawRing() != z) {
            c1609220ryiLJIIIIZZ.setCanDrawRing(z);
            c1609220ryiLJIIIIZZ.invalidate();
        }
    }

    @Override // X.InterfaceC1608850ry7
    public final void LIZJ(InterfaceC426680GoE interfaceC426680GoE, AvatarComponentView avatarComponentView) {
        EnumC1606080rte enumC1606080rte;
        C1606750ruj c1606750ruj;
        this.LIZIZ = avatarComponentView;
        EnumC1606030rtZ enumC1606030rtZ = null;
        if ((interfaceC426680GoE instanceof C1606750ruj) && (c1606750ruj = (C1606750ruj) interfaceC426680GoE) != null) {
            enumC1606080rte = c1606750ruj.LIZ;
        } else {
            enumC1606080rte = null;
        }
        this.LJIIIIZZ = enumC1606080rte;
        if (enumC1606080rte != null) {
            InterfaceC1605840rtG interfaceC1605840rtGLJIIIZ = C1607070rvF.LIZIZ.LJI().LJIIIZ(enumC1606080rte);
            if (interfaceC1605840rtGLJIIIZ instanceof EnumC1606030rtZ) {
                enumC1606030rtZ = (EnumC1606030rtZ) interfaceC1605840rtGLJIIIZ;
            }
            this.LIZJ = enumC1606030rtZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.AbstractC1606860ruu r17, java.lang.Float r18) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1608920ryE.LJFF(X.0ruu, java.lang.Float):void");
    }

    @Override // X.InterfaceC1608850ry7
    public final void LIZIZ(InterfaceC1606880ruw interfaceC1606880ruw, EnumC1256840ioM enumC1256840ioM, InterfaceC713050Ry3 interfaceC713050Ry3) {
        C1606780rum c1606780rum;
        C1608950ryH lottieSource;
        C0GZD c0gzd;
        C0GZD c0gzd2;
        if (!(interfaceC1606880ruw instanceof AbstractC1606860ruu)) {
            return;
        }
        int i = C1256890ioR.LIZIZ[enumC1256840ioM.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LJI();
                        return;
                    }
                    throw new C1954807lC();
                }
                if (((StoryPublishNativeAnimConfig) C0CAE.LIZIZ.getValue()).enable && (c0gzd2 = this.LJIIJ) != null) {
                    ValueAnimator valueAnimator = c0gzd2.LLILZLL;
                    if (valueAnimator == null) {
                        return;
                    }
                    valueAnimator.resume();
                    return;
                }
                C1609220ryi c1609220ryiLJIIIIZZ = LJIIIIZZ();
                if (c1609220ryiLJIIIIZZ == null) {
                    return;
                }
                c1609220ryiLJIIIIZZ.resumeAnimation();
                return;
            }
            if (((StoryPublishNativeAnimConfig) C0CAE.LIZIZ.getValue()).enable && (c0gzd = this.LJIIJ) != null) {
                ValueAnimator valueAnimator2 = c0gzd.LLILZLL;
                if (valueAnimator2 == null) {
                    return;
                }
                valueAnimator2.pause();
                return;
            }
            C1609220ryi c1609220ryiLJIIIIZZ2 = LJIIIIZZ();
            if (c1609220ryiLJIIIIZZ2 == null) {
                return;
            }
            c1609220ryiLJIIIIZZ2.pauseAnimation();
            return;
        }
        if (interfaceC713050Ry3 instanceof C1606780rum) {
            c1606780rum = (C1606780rum) interfaceC713050Ry3;
        } else {
            c1606780rum = null;
        }
        if (this.LJI && c1606780rum != null) {
            LJFF(this.LJII, Float.valueOf(c1606780rum.LIZ));
            return;
        }
        C1292030jj7<C1294720jnS> c1292030jj7LJII = LJII();
        EnumC1606030rtZ enumC1606030rtZ = this.LIZJ;
        if (enumC1606030rtZ == null || (lottieSource = enumC1606030rtZ.getLottieSource()) == null || c1292030jj7LJII == null) {
            return;
        }
        c1292030jj7LJII.LIZIZ(new C1608940ryG(c1292030jj7LJII, this, 0, 0.1f, 0.9f, lottieSource));
    }
}
