package X;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.util.List;

/* JADX INFO: renamed from: X.0fsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143920fsE {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public C1322110kVd LIZ;
    public C1143950fsH LJ;
    public int LJIIIIZZ;
    public boolean LJIIJJI;
    public Animatable LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public InterfaceC1330440kj4 LJIILL;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public boolean LJFF = true;
    public int LJI = 1;
    public String LJII = "";
    public long LJIIIZ = -1;
    public long LJIIJ = -1;

    public final void LIZ() {
        Animatable animatable = this.LJIIL;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void LIZIZ() {
        C1322110kVd c1322110kVd = this.LIZ;
        if (c1322110kVd != null) {
            c1322110kVd.setController(null);
        }
        C1322110kVd c1322110kVd2 = this.LIZ;
        if (c1322110kVd2 != null) {
            c1322110kVd2.setImageDrawable(null);
        }
        this.LIZ = null;
    }

    public final boolean LIZJ() {
        Animatable animatable = this.LJIIL;
        if (animatable != null) {
            return animatable.isRunning();
        }
        return false;
    }

    public final void LJ() {
        AnimatedDrawable2 animatedDrawable2;
        Animatable animatable = this.LJIIL;
        if (!(animatable instanceof AnimatedDrawable2)) {
            if (animatable != null) {
                animatable.stop();
            }
        } else {
            if (!(animatable instanceof AnimatedDrawable2) || (animatedDrawable2 = (AnimatedDrawable2) animatable) == null) {
                return;
            }
            animatedDrawable2.LJFF();
        }
    }

    public final void LJFF() {
        Animatable animatable = this.LJIIL;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [REQUEST, X.0kbR] */
    public final void LIZLLL() {
        final long jNanoTime = System.nanoTime();
        if (!TextUtils.isEmpty(this.LIZIZ) && !TextUtils.isEmpty(this.LIZJ)) {
            List<String> listLJIIJJI = C1143780fs0.LJIIJJI(this.LIZIZ, this.LIZJ);
            if (!listLJIIJJI.isEmpty()) {
                this.LIZLLL = (String) ListProtector.get(listLJIIJJI, 0);
            }
        }
        if (TextUtils.isEmpty(this.LIZLLL)) {
            C2222681Bz0.LIZIZ("", jNanoTime, "filePath is null", false);
            return;
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(this.LIZLLL));
        c1325700kbQLIZLLL.LJ = C1324670kZl.LJ;
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        if (LIZ != 0) {
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LIZLLL = LIZ;
            c1320810kTXLIZJ.LJIIJJI = this.LJFF;
            c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0fsG
                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LIZLLL(String str, Throwable th) {
                    C1143950fsH c1143950fsH = this.LIZIZ.LJ;
                    if (c1143950fsH != null) {
                        c1143950fsH.LIZIZ(th);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("GeckoWebpController.onFailure,channel:");
                    sbLIZ.append(this.LIZIZ.LIZIZ);
                    sbLIZ.append(",fileName:");
                    sbLIZ.append(this.LIZIZ.LIZJ);
                    sbLIZ.append(",filePath:");
                    sbLIZ.append(this.LIZIZ.LIZLLL);
                    sbLIZ.append(",throwable:");
                    sbLIZ.append(th);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onFail, extra = ");
                    sbLIZ2.append(strLIZIZ);
                    C20441214yg.LIZIZ("GuideAnim", C2188811AlT.LIZIZ(sbLIZ2));
                    int i = C2222681Bz0.LIZ;
                    C2222681Bz0.LIZIZ(this.LIZIZ.LIZLLL, jNanoTime, strLIZIZ, false);
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str, Object obj, Animatable animatable) {
                    InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
                    C20441214yg.LIZIZ("GuideAnim", "onFinal");
                    if (!(animatable instanceof AnimatedDrawable2)) {
                        C20441214yg.LIZIZ("GuideAnim", "is not Animatable2");
                        return;
                    }
                    C1143920fsE c1143920fsE = this.LIZIZ;
                    c1143920fsE.LJIILL = interfaceC1330440kj4;
                    c1143920fsE.LJIIL = animatable;
                    int i = c1143920fsE.LJI;
                    if (i >= 1) {
                        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                        animatedDrawable2.LJI(new C946370ajb(animatedDrawable2.LLILLL, i));
                    } else if (c1143920fsE.LJIIIZ > 0) {
                        AnimatedDrawable2 animatedDrawable22 = (AnimatedDrawable2) animatable;
                        long jLIZLLL = animatedDrawable22.LIZLLL();
                        C1143920fsE c1143920fsE2 = this.LIZIZ;
                        int i2 = (int) (((c1143920fsE2.LJIIIZ + jLIZLLL) - 1) / jLIZLLL);
                        c1143920fsE2.LJI = i2;
                        animatedDrawable22.LJI(new C946370ajb(animatedDrawable22.LLILLL, i2));
                    }
                    C1143950fsH c1143950fsH = this.LIZIZ.LJ;
                    if (c1143950fsH != null) {
                        c1143950fsH.LIZLLL();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("anim.animationBackend = ");
                    AnimatedDrawable2 animatedDrawable23 = (AnimatedDrawable2) animatable;
                    sbLIZ.append(animatedDrawable23.LLILLL);
                    C20441214yg.LIZIZ("GuideAnim", C2188811AlT.LIZIZ(sbLIZ));
                    if (this.LIZIZ.LJIILIIL) {
                        animatedDrawable23.LJIIIIZZ(new InterfaceC1331030kk1() { // from class: X.0kOy
                            @Override // X.InterfaceC1331030kk1
                            public final InterfaceC1330990kjx LIZ(InterfaceC1330960kju interfaceC1330960kju, Object obj2) {
                                return new C1330040kiQ(interfaceC1330960kju);
                            }
                        });
                    }
                    final C1143920fsE c1143920fsE3 = this.LIZIZ;
                    animatedDrawable23.LJII(new C0I9J() { // from class: X.0fsF
                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                        public final void LIZ(AnimatedDrawable2 animatedDrawable24) {
                            C1143920fsE c1143920fsE4 = c1143920fsE3;
                            c1143920fsE4.LJIIIIZZ = 0;
                            c1143920fsE4.LJIIJ = System.currentTimeMillis();
                            C1143950fsH c1143950fsH2 = c1143920fsE3.LJ;
                            if (c1143950fsH2 != null) {
                                c1143950fsH2.LJ(animatedDrawable24);
                            }
                        }

                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                        public final void LIZIZ(AnimatedDrawable2 animatedDrawable24) {
                            C1143920fsE c1143920fsE4 = c1143920fsE3;
                            int i3 = c1143920fsE4.LJIIIIZZ + 1;
                            c1143920fsE4.LJIIIIZZ = i3;
                            C1143950fsH c1143950fsH2 = c1143920fsE4.LJ;
                            if (c1143950fsH2 != null) {
                                c1143950fsH2.LIZJ(i3);
                            }
                            C1143920fsE c1143920fsE5 = c1143920fsE3;
                            if (c1143920fsE5.LJIIIIZZ >= c1143920fsE5.LJI && animatedDrawable24 != null) {
                                animatedDrawable24.stop();
                            }
                        }

                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                        public final void LIZJ(AnimatedDrawable2 animatedDrawable24) {
                            C1143950fsH c1143950fsH2 = c1143920fsE3.LJ;
                            if (c1143950fsH2 != null) {
                                c1143950fsH2.LJFF(animatedDrawable24);
                            }
                        }

                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                        public final void LIZLLL(AnimatedDrawable2 animatedDrawable24, int i3) {
                            int iLIZJ;
                            C1143950fsH c1143950fsH2 = c1143920fsE3.LJ;
                            if (c1143950fsH2 != null) {
                                if (animatedDrawable24 != null) {
                                    iLIZJ = animatedDrawable24.LIZJ();
                                } else {
                                    iLIZJ = 0;
                                }
                                c1143950fsH2.LIZ(animatedDrawable24, i3, iLIZJ);
                            }
                            if (c1143920fsE3.LJIIIZ > 0) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                C1143920fsE c1143920fsE4 = c1143920fsE3;
                                if (jCurrentTimeMillis - c1143920fsE4.LJIIJ >= c1143920fsE4.LJIIIZ && !c1143920fsE4.LJIIJJI && animatedDrawable24 != null) {
                                    animatedDrawable24.stop();
                                }
                            }
                        }
                    });
                    int i3 = C2222681Bz0.LIZ;
                    C2222681Bz0.LIZIZ(this.LIZIZ.LIZLLL, jNanoTime, "", true);
                }
            };
            AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
            IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
            if (iHostFrescoHelper != null) {
                C1320250kSd c1320250kSd = (C1320250kSd) abstractC1320710kTNLIZ;
                C1322110kVd c1322110kVd = this.LIZ;
                iHostFrescoHelper.V90(c1320250kSd, c1322110kVd != null ? c1322110kVd.getContext() : null, this.LJII, C1143780fs0.LJ(this.LIZIZ, this.LIZJ));
            }
            C1322110kVd c1322110kVd2 = this.LIZ;
            if (c1322110kVd2 != null) {
                c1322110kVd2.setController(abstractC1320710kTNLIZ);
                if (this.LJIILJJIL) {
                    c1322110kVd2.getHierarchy().LJIJI(0);
                }
            }
        }
    }
}
