package X;

import Y.ARunnableS115S0100000_15;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixVoiceChatAvatarSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS259S0300000_15;

/* JADX INFO: renamed from: X.0aZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940400aZy extends AbstractC940410aZz {
    public final String LLILZIL;
    public C940450aa3 LLILZLL;
    public int LLIZ = -1;
    public C941290abP LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;

    @Override // X.AbstractC940410aZz
    public final int LIZIZ() {
        return R.layout.hwj;
    }

    @Override // X.AbstractC940410aZz
    public final void LJI() {
        C941290abP c941290abP;
        super.LJI();
        if (!this.LLJ || (c941290abP = this.LLIZLLLIL) == null) {
            return;
        }
        c941290abP.LIZLLL = true;
    }

    @Override // X.AbstractC940410aZz
    public final String LIZ() {
        return this.LLILZIL;
    }

    public C940400aZy(String str) {
        this.LLILZIL = str;
    }

    @Override // X.AbstractC940410aZz
    public final void LIZJ(ViewGroup viewGroup) {
        if (viewGroup != null && C497740JfY.LJJ()) {
            viewGroup.setLayoutDirection(1);
            viewGroup.setTextDirection(4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v4, types: [REQUEST, X.0kbR] */
    public final void LJIIIIZZ(ImageModel imageModel) {
        C1322090kVb c1322090kVb;
        List urls;
        View viewFindViewById;
        C1291820jim c1291820jim = new C1291820jim(5);
        ViewGroup viewGroup = this.LL;
        String str = null;
        if (viewGroup != null) {
            c1322090kVb = (C1322090kVb) viewGroup.findViewById(R.id.qt3);
        } else {
            c1322090kVb = null;
        }
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null && (viewFindViewById = viewGroup2.findViewById(R.id.bxf)) != null) {
            C12ES.LJIILL(0, viewFindViewById);
        }
        if (C1819620xS4.LIZLLL(imageModel)) {
            if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                str = (String) C13LP.LJJJLL(urls);
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJIILIIL = c1291820jim;
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            if (c1322090kVb != null) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LIZLLL = LIZ;
                c1320810kTXLIZJ.LJIILJJIL = c1322090kVb.getController();
                c1322090kVb.setController(c1320810kTXLIZJ.LIZ());
                return;
            }
            return;
        }
        C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.el_);
        c1325700kbQLIZJ.LJIILIIL = c1291820jim;
        ?? LIZ2 = c1325700kbQLIZJ.LIZ();
        if (c1322090kVb == null) {
            return;
        }
        C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
        c1320810kTXLIZJ2.LIZLLL = LIZ2;
        c1320810kTXLIZJ2.LJIILJJIL = c1322090kVb.getController();
        c1322090kVb.setController(c1320810kTXLIZJ2.LIZ());
    }

    public final void LJIIIZ(ImageModel imageModel) {
        C1324720kZq c1324720kZq;
        View viewFindViewById;
        if (imageModel == null) {
            return;
        }
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.bxf)) != null) {
            C439101nJ.LJI(viewFindViewById);
        }
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null && (c1324720kZq = (C1324720kZq) viewGroup2.findViewById(R.id.qt3)) != null) {
            AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(imageModel, c1324720kZq, this, 51);
            if (BugFixVoiceChatAvatarSetting.INSTANCE.enable()) {
                if (c1324720kZq.isLaidOut() && !c1324720kZq.isLayoutRequested()) {
                    awS259S0300000_15.invoke();
                    return;
                } else {
                    c1324720kZq.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986920bn0(awS259S0300000_15, 9));
                    return;
                }
            }
            C930540aK4.LJJJ(c1324720kZq, new ARunnableS115S0100000_15(awS259S0300000_15, 190));
        }
    }

    public final void LJIIJJI(int i) {
        EnumC940090aZT enumC940090aZT;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        View viewFindViewById7;
        View viewFindViewById8;
        View viewFindViewById9;
        View viewFindViewById10;
        C940450aa3 c940450aa3 = this.LLILZLL;
        ImageModel imageModel = null;
        if (c940450aa3 != null) {
            enumC940090aZT = c940450aa3.LIZ;
        } else {
            enumC940090aZT = null;
        }
        if (enumC940090aZT == EnumC940090aZT.FEED) {
            if (i != -1 && i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ViewGroup viewGroup = this.LL;
                            if (viewGroup != null && (viewFindViewById10 = viewGroup.findViewById(R.id.pn3)) != null) {
                                C12ES.LJIILL(0, viewFindViewById10);
                            }
                            ViewGroup viewGroup2 = this.LL;
                            if (viewGroup2 != null && (viewFindViewById9 = viewGroup2.findViewById(R.id.q3s)) != null) {
                                C12ES.LJIILL(0, viewFindViewById9);
                            }
                            C941290abP c941290abP = this.LLIZLLLIL;
                            if (c941290abP != null) {
                                c941290abP.LIZLLL = true;
                            }
                            Integer numValueOf = Integer.valueOf(this.LLIZ);
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != 2 && iIntValue != 3) {
                                numValueOf.intValue();
                                C940450aa3 c940450aa32 = this.LLILZLL;
                                if (c940450aa32 != null) {
                                    imageModel = c940450aa32.LIZLLL;
                                }
                                LJIIIIZZ(imageModel);
                            }
                        }
                    } else {
                        ViewGroup viewGroup3 = this.LL;
                        if (viewGroup3 != null && (viewFindViewById8 = viewGroup3.findViewById(R.id.pn3)) != null) {
                            C439101nJ.LJI(viewFindViewById8);
                        }
                        ViewGroup viewGroup4 = this.LL;
                        if (viewGroup4 != null && (viewFindViewById7 = viewGroup4.findViewById(R.id.q3s)) != null) {
                            C12ES.LJIILL(0, viewFindViewById7);
                        }
                        C941290abP c941290abP2 = this.LLIZLLLIL;
                        if (c941290abP2 != null) {
                            c941290abP2.LIZLLL = true;
                        }
                        Integer numValueOf2 = Integer.valueOf(this.LLIZ);
                        int iIntValue2 = numValueOf2.intValue();
                        if (iIntValue2 != 2 && iIntValue2 != 3) {
                            numValueOf2.intValue();
                            C940450aa3 c940450aa33 = this.LLILZLL;
                            if (c940450aa33 != null) {
                                imageModel = c940450aa33.LIZLLL;
                            }
                            LJIIIIZZ(imageModel);
                        }
                    }
                } else {
                    ViewGroup viewGroup5 = this.LL;
                    if (viewGroup5 != null && (viewFindViewById6 = viewGroup5.findViewById(R.id.pn3)) != null) {
                        C12ES.LJIILL(0, viewFindViewById6);
                    }
                    ViewGroup viewGroup6 = this.LL;
                    if (viewGroup6 != null && (viewFindViewById5 = viewGroup6.findViewById(R.id.q3s)) != null) {
                        C439101nJ.LJI(viewFindViewById5);
                    }
                    C941290abP c941290abP3 = this.LLIZLLLIL;
                    if (c941290abP3 != null) {
                        c941290abP3.LIZLLL = true;
                    }
                    ViewGroup viewGroup7 = this.LL;
                    if (viewGroup7 != null && (viewFindViewById4 = viewGroup7.findViewById(R.id.pnc)) != null) {
                        C12ES.LJIILL(4, viewFindViewById4);
                    }
                    Integer numValueOf3 = Integer.valueOf(this.LLIZ);
                    int iIntValue3 = numValueOf3.intValue();
                    if (iIntValue3 != 0 && iIntValue3 != 1) {
                        numValueOf3.intValue();
                        C940450aa3 c940450aa34 = this.LLILZLL;
                        if (c940450aa34 != null) {
                            imageModel = c940450aa34.LIZLLL;
                        }
                        LJIIIZ(imageModel);
                    }
                }
            } else {
                ViewGroup viewGroup8 = this.LL;
                if (viewGroup8 != null && (viewFindViewById3 = viewGroup8.findViewById(R.id.pn3)) != null) {
                    C439101nJ.LJI(viewFindViewById3);
                }
                ViewGroup viewGroup9 = this.LL;
                if (viewGroup9 != null && (viewFindViewById2 = viewGroup9.findViewById(R.id.q3s)) != null) {
                    C439101nJ.LJI(viewFindViewById2);
                }
                ViewGroup viewGroup10 = this.LL;
                if (viewGroup10 != null && (viewFindViewById = viewGroup10.findViewById(R.id.pnc)) != null) {
                    C12ES.LJIILL(0, viewFindViewById);
                }
                Integer numValueOf4 = Integer.valueOf(this.LLIZ);
                int iIntValue4 = numValueOf4.intValue();
                if (iIntValue4 != 0 && iIntValue4 != 1) {
                    numValueOf4.intValue();
                    C940450aa3 c940450aa35 = this.LLILZLL;
                    if (c940450aa35 != null) {
                        imageModel = c940450aa35.LIZLLL;
                    }
                    LJIIIZ(imageModel);
                }
            }
        }
        this.LLIZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(int r6) {
        /*
            r5 = this;
            int r0 = r5.LLIZ
            r2 = 0
            if (r0 != 0) goto L44
            X.0abP r0 = r5.LLIZLLLIL
            if (r0 == 0) goto Ld
            boolean r2 = r0.LIZLLL(r6)
        Ld:
            r5.LLJ = r2
            if (r2 == 0) goto L3a
            java.lang.String r0 = "viewer"
            X.0aQh r4 = X.C934640aQg.LIZ(r0)
            X.0aa3 r3 = r5.LLILZLL
            if (r3 == 0) goto L3e
            X.0aYo r0 = r3.LJ
            if (r0 == 0) goto L3e
            long r1 = r0.LIZ
        L21:
            boolean r0 = r3.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L27:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L3b
            java.lang.String r0 = "anchor"
        L2f:
            r4.LIZLLL = r1
            r4.LJ = r0
            java.lang.String r0 = "feed_card"
            r4.LJFF = r0
            X.C934640aQg.LIZIZ(r4)
        L3a:
            return
        L3b:
            java.lang.String r0 = "guest"
            goto L2f
        L3e:
            r1 = 0
            if (r3 != 0) goto L21
            r0 = 0
            goto L27
        L44:
            X.0abP r1 = r5.LLIZLLLIL
            if (r1 == 0) goto L4b
            r0 = 1
            r1.LIZLLL = r0
        L4b:
            r5.LLJ = r2
            android.view.ViewGroup r1 = r5.LL
            if (r1 == 0) goto L3a
            r0 = 2131383388(0x7f0a545c, float:1.8387148E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L3a
            r0 = 4
            X.C12ES.LJIILL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940400aZy.LJIIL(int):void");
    }

    public final void LJIIJ(int i, ViewGroup viewGroup) {
        C1324720kZq c1324720kZq;
        ViewGroup viewGroup2;
        View viewFindViewById;
        ViewGroup viewGroup3 = this.LL;
        if (viewGroup3 != null && (viewFindViewById = viewGroup3.findViewById(R.id.qt3)) != null) {
            C933980aPc.LJIIZILJ(i, i, viewFindViewById);
        }
        ViewGroup viewGroup4 = this.LL;
        if (viewGroup4 != null && (viewGroup2 = (ViewGroup) viewGroup4.findViewById(R.id.gvn)) != null) {
            viewGroup2.setClipChildren(false);
        }
        ViewGroup viewGroup5 = this.LL;
        if (viewGroup5 != null && (c1324720kZq = (C1324720kZq) viewGroup5.findViewById(R.id.pnc)) != null) {
            C933980aPc.LJIILLIIL(c1324720kZq, viewGroup, i);
        }
    }
}
