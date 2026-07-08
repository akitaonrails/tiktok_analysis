package X;

import Y.ARunnableS122S0100000_22;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0oH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466890oH9 implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrolled$0(C1466890oH9 c1466890oH9, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1466890oH9 c1466890oH9, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(C1466890oH9 c1466890oH9, int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
        }
    }

    public C1466890oH9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C1466890oH9 c1466890oH9, int i) {
        if (i != 0) {
            if (i == 1) {
                C21597919fl c21597919fl = ((C1423960n9u) c1466890oH9.l0).LLJJJJLIIL;
                if (c21597919fl != null) {
                    ((C1423960n9u) c1466890oH9.l0).LLLF = c21597919fl.getCurrentItem();
                }
                ((C1423960n9u) c1466890oH9.l0).LLLFF = true;
            }
        } else {
            C1423960n9u c1423960n9u = (C1423960n9u) c1466890oH9.l0;
            c1423960n9u.LLLFF = false;
            if (c1423960n9u.LLLFFI) {
                C21597919fl c21597919fl2 = c1423960n9u.LLJJJJLIIL;
                if (c21597919fl2 != null && c21597919fl2.getCurrentItem() == ((C1423960n9u) c1466890oH9.l0).LLLLLJLJLL().getCount() - 1) {
                    ((C1423960n9u) c1466890oH9.l0).LLLLLLLLL(true, false);
                } else {
                    ((C1423960n9u) c1466890oH9.l0).LLLLLLLLL(false, false);
                }
            }
        }
        ((C1423960n9u) c1466890oH9.l0).LLLLLLJ();
    }

    public static final void onPageScrollStateChanged$1(C1466890oH9 c1466890oH9, int i) {
        if (i != 0) {
            if (i == 1) {
                C1452080ntG c1452080ntG = (C1452080ntG) c1466890oH9.l0;
                if (!c1452080ntG.LLLZLZ.LLLIZZ) {
                    c1452080ntG.cb().pause(true);
                    ((C1452080ntG) c1466890oH9.l0).C = true;
                }
                C1452080ntG c1452080ntG2 = (C1452080ntG) c1466890oH9.l0;
                Runnable runnable = c1452080ntG2.T;
                if (runnable != null) {
                    HandlerHook.viewRemoveCallbacks(c1452080ntG2.LLLZLZ, runnable);
                    System.out.println((Object) "Cancelled pending stopDrag because a new drag started.");
                }
                C1452080ntG c1452080ntG3 = (C1452080ntG) c1466890oH9.l0;
                c1452080ntG3.T = null;
                if (!c1452080ntG3.S) {
                    c1452080ntG3.S = true;
                    InterfaceC1450920nrO interfaceC1450920nrO = (InterfaceC1450920nrO) c1452080ntG3.getDiContainer().LJIIL(null, InterfaceC1450920nrO.class);
                    if (interfaceC1450920nrO != null) {
                        interfaceC1450920nrO.v8();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C1452080ntG c1452080ntG4 = (C1452080ntG) c1466890oH9.l0;
        c1452080ntG4.C = false;
        if (!c1452080ntG4.S) {
            return;
        }
        c1452080ntG4.S = false;
        Runnable runnable2 = c1452080ntG4.T;
        if (runnable2 != null) {
            HandlerHook.viewRemoveCallbacks(c1452080ntG4.LLLZLZ, runnable2);
        }
        C1452080ntG c1452080ntG5 = (C1452080ntG) c1466890oH9.l0;
        c1452080ntG5.T = null;
        InterfaceC1450920nrO interfaceC1450920nrO2 = (InterfaceC1450920nrO) c1452080ntG5.getDiContainer().LJIIL(null, InterfaceC1450920nrO.class);
        if (interfaceC1450920nrO2 == null) {
            return;
        }
        interfaceC1450920nrO2.Bi();
    }

    public static final void onPageScrollStateChanged$2(C1466890oH9 c1466890oH9, int i) {
        if (i != 0) {
            if (i == 1) {
                ((C1424590nAv) c1466890oH9.l0).LLLIIIIL = true;
                return;
            }
            return;
        }
        ((C1424590nAv) c1466890oH9.l0).LLLIIIIL = false;
    }

    public static final void onPageSelected$0(C1466890oH9 c1466890oH9, int i) {
        C1423960n9u c1423960n9u = (C1423960n9u) c1466890oH9.l0;
        if (c1423960n9u.LLLF != i) {
            C1425090nBj c1425090nBjLJJIJIL = c1423960n9u.LLLLLJLJLL().LJJIJIL(((C1423960n9u) c1466890oH9.l0).LLLF);
            if (c1425090nBjLJJIJIL != null) {
                c1425090nBjLJJIJIL.LJII(false);
            }
            C1419590n2r c1419590n2r = (C1419590n2r) C13LP.LJJJLZIJ(i, ((C1423960n9u) c1466890oH9.l0).LLLLLJLJLL().LLILZIL);
            if (c1419590n2r != null) {
                C1423960n9u c1423960n9u2 = (C1423960n9u) c1466890oH9.l0;
                if (c1423960n9u2.LLLFF) {
                    c1423960n9u2.LLLILZ.LIZ.LLLLIL().LJIIIIZZ.invoke(Integer.valueOf(i), c1419590n2r);
                }
                c1423960n9u2.LLLLIL().LIZ.invoke(c1419590n2r);
                C1425090nBj c1425090nBjLJJIJIL2 = c1423960n9u2.LLLLLJLJLL().LJJIJIL(i);
                if (c1425090nBjLJJIJIL2 != null) {
                    c1425090nBjLJJIJIL2.LJ(0.0f);
                }
                C1425090nBj c1425090nBjLJJIJIL3 = c1423960n9u2.LLLLLJLJLL().LJJIJIL(i - 1);
                if (c1425090nBjLJJIJIL3 != null) {
                    c1425090nBjLJJIJIL3.LJIIIIZZ();
                }
                C1425090nBj c1425090nBjLJJIJIL4 = c1423960n9u2.LLLLLJLJLL().LJJIJIL(i + 1);
                if (c1425090nBjLJJIJIL4 != null) {
                    c1425090nBjLJJIJIL4.LJIIIIZZ();
                }
                c1423960n9u2.LLLLLJIL(c1419590n2r);
            }
        }
    }

    public static final void onPageSelected$1(C1466890oH9 c1466890oH9, int i) {
        C1450990nrV c1450990nrV;
        C1450990nrV c1450990nrV2;
        C1450990nrV c1450990nrV3;
        C1450990nrV c1450990nrV4;
        if (C297370Bl9.LIZ()) {
            C1452080ntG c1452080ntG = (C1452080ntG) c1466890oH9.l0;
            if (i != c1452080ntG.B) {
                c1452080ntG.tU0();
                C1452080ntG c1452080ntG2 = (C1452080ntG) c1466890oH9.l0;
                C1451420nsC c1451420nsC = c1452080ntG2.y;
                if (c1451420nsC == null) {
                    c1451420nsC = null;
                }
                C19A3 c19a3LJJIJL = c1451420nsC.LJJIJL(c1452080ntG2.B);
                if ((c19a3LJJIJL instanceof C1450990nrV) && (c1450990nrV4 = (C1450990nrV) c19a3LJJIJL) != null && ((C1452080ntG) c1466890oH9.l0).L) {
                    c1450990nrV4.LLLLZIL();
                }
                C1451420nsC c1451420nsC2 = ((C1452080ntG) c1466890oH9.l0).y;
                if (c1451420nsC2 == null) {
                    c1451420nsC2 = null;
                }
                C19A3 c19a3LJJIJL2 = c1451420nsC2.LJJIJL(i);
                if ((c19a3LJJIJL2 instanceof C1450990nrV) && (c1450990nrV3 = (C1450990nrV) c19a3LJJIJL2) != null) {
                    c1450990nrV3.LLLLLZL();
                }
            }
            ((C1452080ntG) c1466890oH9.l0).B = i;
        } else if (i != ((C1452080ntG) c1466890oH9.l0).T9()) {
            ((C1452080ntG) c1466890oH9.l0).tU0();
            C1452080ntG c1452080ntG3 = (C1452080ntG) c1466890oH9.l0;
            C1451420nsC c1451420nsC3 = c1452080ntG3.y;
            if (c1451420nsC3 == null) {
                c1451420nsC3 = null;
            }
            C19A3 c19a3LJJIJL3 = c1451420nsC3.LJJIJL(c1452080ntG3.T9());
            if ((c19a3LJJIJL3 instanceof C1450990nrV) && (c1450990nrV2 = (C1450990nrV) c19a3LJJIJL3) != null && ((C1452080ntG) c1466890oH9.l0).L) {
                c1450990nrV2.LLLLZIL();
            }
            C1451420nsC c1451420nsC4 = ((C1452080ntG) c1466890oH9.l0).y;
            if (c1451420nsC4 == null) {
                c1451420nsC4 = null;
            }
            C19A3 c19a3LJJIJL4 = c1451420nsC4.LJJIJL(i);
            if ((c19a3LJJIJL4 instanceof C1450990nrV) && (c1450990nrV = (C1450990nrV) c19a3LJJIJL4) != null) {
                c1450990nrV.LLLLLZL();
            }
        }
        C1452080ntG c1452080ntG4 = (C1452080ntG) c1466890oH9.l0;
        if (c1452080ntG4.C) {
            c1452080ntG4.cb().kM1(i, 0.0f);
        }
        C1452080ntG c1452080ntG5 = (C1452080ntG) c1466890oH9.l0;
        c1452080ntG5.A = i;
        c1452080ntG5.b0.setValue(Integer.valueOf(i));
        ImageAlbumData imageAlbumData = ((C1452080ntG) c1466890oH9.l0).xb().getImageAlbumData();
        if (imageAlbumData != null) {
            imageAlbumData.setCurrentPreviewIndex(((C1452080ntG) c1466890oH9.l0).T9());
        }
        InterfaceC1441090nbX interfaceC1441090nbXOa = ((C1452080ntG) c1466890oH9.l0).Oa();
        if (interfaceC1441090nbXOa != null) {
            interfaceC1441090nbXOa.gP0(i);
        }
        ((C1452080ntG) c1466890oH9.l0).tc();
        C1452080ntG c1452080ntG6 = (C1452080ntG) c1466890oH9.l0;
        if (c1452080ntG6.S) {
            c1452080ntG6.S = false;
            c1452080ntG6.T = new ARunnableS122S0100000_22(c1452080ntG6, 24);
            HandlerHook.viewPostDelay(c1452080ntG6.LLLZLZ, c1452080ntG6.T, 200L);
        }
    }

    public static final void onPageSelected$2(C1466890oH9 c1466890oH9, int i) {
        String str;
        C1424590nAv c1424590nAv = (C1424590nAv) c1466890oH9.l0;
        if (c1424590nAv.LLLIIIL) {
            c1424590nAv.LLLLLJLJLL().LJJIZ(true);
            return;
        }
        Function2<TemplateCategoryData, String, Unit> function2 = c1424590nAv.LLLLIL().LIZ;
        TemplateCategoryData templateCategoryDataLJJIJIL = ((C1424590nAv) c1466890oH9.l0).LLLLLJLJLL().LJJIJIL(i);
        if (((C1424590nAv) c1466890oH9.l0).LLLIIIIL) {
            str = "slide";
        } else {
            str = "click";
        }
        function2.invoke(templateCategoryDataLJJIJIL, str);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C1424590nAv) c1466890oH9.l0), null, null, new C1424600nAw((C1424590nAv) c1466890oH9.l0, i, null), 3);
        ((C1424590nAv) c1466890oH9.l0).LLLLLJLJLL().LJJIZ(true);
        C1424770nBD.LJJIL(((C1424590nAv) c1466890oH9.l0).LLLLLJLJLL(), i, null, 0.0f, false, 14);
    }
}
