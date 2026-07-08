package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.dsl.AlsVMContainer;
import com.bytedance.als.dsl.OCAdapterViewModel;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0tQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664590tQ1 {
    /* JADX WARN: Incorrect types in method signature: <T:LX/1DQs<TA;>;:LX/0EuV;A::LX/05YF;>(TT;)Landroid/app/Activity; */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Activity LJII(AbstractC2255721DQs abstractC2255721DQs) {
        return (Activity) ((InterfaceC379610EuV) abstractC2255721DQs).getDiContainer().LJII(Activity.class, null);
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/1DQs<TA;>;:LX/0EuV;A::LX/05YF;>(TT;)Landroid/content/Context; */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Context LJIIIIZZ(AbstractC2255721DQs abstractC2255721DQs) {
        return (Context) ((InterfaceC379610EuV) abstractC2255721DQs).getDiContainer().LJII(Context.class, "applicationContext");
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/1DQs<TA;>;:LX/0EuV;A::LX/05YF;>(TT;)Landroid/content/Context; */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Context LJIIIZ(AbstractC2255721DQs abstractC2255721DQs) {
        return (Context) ((InterfaceC379610EuV) abstractC2255721DQs).getDiContainer().LJII(Context.class, null);
    }

    public static final void LIZIZ(C19GS c19gs, Function1 function1) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19gs);
        sbLIZ.append(" AppCompatActivity data{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        OCAdapterViewModel oCAdapterViewModelLJ = LJ(c19gs, null);
        synchronized (oCAdapterViewModelLJ) {
            if (oCAdapterViewModelLJ.LLILZ != null) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            C1DRF c1drf = oCAdapterViewModelLJ.LLILLL;
            C21308518aB c21308518aBLJ = c1drf.LJ(C19GS.class, null, c19gs);
            c21308518aBLJ.LIZ(C19EG.class);
            c21308518aBLJ.LIZ(Activity.class);
            c1drf.LJ(Context.class, null, c19gs);
            c1drf.LJ(Context.class, "applicationContext", C786410Ut5.O3(c19gs));
            if (C1664630tQ5.LIZIZ && !oCAdapterViewModelLJ.LL.LJFF) {
                c1drf.LIZLLL(new C1153304fD(C19GS.class));
            }
            if (C1664630tQ5.LIZJ) {
                c1drf.LIZLLL(new C1153504fF(AbstractC2255721DQs.class, AFwS264S0000000_24.get$arr$(779)));
            }
            function1.invoke(c1drf);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c19gs);
            sbLIZ2.append(" AppCompatActivity data{} start");
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            oCAdapterViewModelLJ.vQ2();
            return;
        }
        throw new IllegalStateException("Can't invoke data{} because previous ObjectContainer has already created");
    }

    public static final void LIZJ(AbstractC1664710tQD abstractC1664710tQD, Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC1664710tQD);
        sbLIZ.append(" GroupLogicComponent data{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        OCAdapterViewModel oCAdapterViewModelLJFF = LJFF(abstractC1664710tQD, null);
        C1DRF c1drf = oCAdapterViewModelLJFF.LLILLL;
        if (C1664630tQ5.LIZJ) {
            c1drf.LIZLLL(new C1153504fF(AbstractC2255721DQs.class, AFwS264S0000000_24.get$arr$(780)));
        }
        function1.invoke(c1drf);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(abstractC1664710tQD);
        sbLIZ2.append(" GroupLogicComponent data{} end");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        oCAdapterViewModelLJFF.vQ2();
    }

    public static final OCAdapterViewModel LJ(C19EG c19eg, StackTraceElement[] stackTraceElementArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg);
        sbLIZ.append(" FragmentActivity findOCBuilder");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1664610tQ3.LIZ(c19eg, AlsVMContainer.class);
        alsVMContainer.wQ2(c19eg);
        if (alsVMContainer.LLILLL == null) {
            String strLJI = C13LE.LIZ(c19eg.getClass()).LJI();
            if (strLJI == null) {
                strLJI = "";
            }
            alsVMContainer.LLILLL = new OCAdapterViewModel(strLJI, null, alsVMContainer.LL, stackTraceElementArr);
        }
        return alsVMContainer.LLILLL;
    }

    @InterfaceC1294060jmO
    public static final OCAdapterViewModel LJFF(AbstractC1664710tQD<?> abstractC1664710tQD, StackTraceElement[] stackTraceElementArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC1664710tQD);
        sbLIZ.append(" GroupLogicComponent findOCBuilder");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1664620tQ4.LIZ(abstractC1664710tQD).get(AlsVMContainer.class);
        if (alsVMContainer.LLILLL == null) {
            String strLJI = C13LE.LIZ(abstractC1664710tQD.getClass()).LJI();
            if (strLJI == null) {
                strLJI = "";
            }
            alsVMContainer.LLILLL = new OCAdapterViewModel(strLJI, abstractC1664710tQD.LL, alsVMContainer.LL, stackTraceElementArr);
        }
        return alsVMContainer.LLILLL;
    }

    public static final C1DRG LIZ(C19A3 c19a3, String str, boolean z, Function1<? super C1DRF, Unit> function1) {
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19a3);
        sbLIZ.append(" GroupScene data{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        OCAdapterViewModel oCAdapterViewModelLJI = LJI(str, c19a3, z, null, 8);
        synchronized (oCAdapterViewModelLJI) {
            if (oCAdapterViewModelLJI.LLILZ == null) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            C1DRF c1drf = oCAdapterViewModelLJI.LLILLL;
            c1drf.LJ(C19A3.class, null, c19a3);
            if (C1664630tQ5.LIZ && !oCAdapterViewModelLJI.LL.LJ) {
                c1drf.LIZLLL(new C1153304fD(C19A3.class));
            }
            if (C1664630tQ5.LIZJ) {
                c1drf.LIZLLL(new C1153504fF(AbstractC2255721DQs.class, AFwS266S0000000_25.get$arr$(598)));
            }
            function1.invoke(c1drf);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c19a3);
            sbLIZ2.append(" GroupScene data{} end");
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return oCAdapterViewModelLJI.vQ2();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(c19a3);
        sbLIZ3.append(" GroupScene find OCAdapterViewModel ObjectContainer created");
        C1659700tI8.LIZ.e("ALS Framework", C2188811AlT.LIZIZ(sbLIZ3));
        throw new IllegalStateException("Can't invoke data{} because previous ObjectContainer has already created");
    }

    public static C1DRG LIZLLL(C19A3 c19a3, String str, boolean z, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = C1664630tQ5.LJFF;
        }
        return LIZ(c19a3, str, z, function1);
    }

    public static OCAdapterViewModel LJI(String str, Scene scene, boolean z, C1DRG c1drg, int i) {
        String name;
        OCAdapterViewModel oCAdapterViewModel;
        C0LEK c0lekLJI;
        String string;
        C0LEK c0lekLJI2;
        String string2;
        String string3;
        InterfaceC2255791DQz interfaceC2255791DQz;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            c1drg = null;
        }
        synchronized (C1664590tQ1.class) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(scene);
            sbLIZ.append(" Scene findOCBuilder");
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            AlsVMContainer alsVMContainer = (AlsVMContainer) C1659680tI6.LIZ.LIZ(scene, AlsVMContainer.class);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(scene);
            sbLIZ2.append(" Scene findOCBuilder find AlsVMContainer ");
            sbLIZ2.append(alsVMContainer);
            sbLIZ2.append(", vm owner class: ");
            Class<? extends Scene> cls = alsVMContainer.LLILZIL;
            if (cls != null) {
                name = cls.getName();
            } else {
                name = null;
            }
            sbLIZ2.append(name);
            sbLIZ2.append(" instance: ");
            sbLIZ2.append((String) null);
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            alsVMContainer.vQ2(scene);
            if (alsVMContainer.LLILLL == null) {
                if (c1drg == null) {
                    if (z) {
                        Scene scene2 = scene.mParentScene;
                        while (true) {
                            if (scene2 != null) {
                                if ((scene2 instanceof C19A3) && C1664600tQ2.LJIIJJI((C19A3) scene2)) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(scene);
                                    sbLIZ3.append(" Scene findOCBuilder traverseParent targetScene find  ");
                                    sbLIZ3.append(scene2);
                                    sbLIZ3.append(' ');
                                    C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                    c1drg = C1664600tQ2.LJIIIZ((C19A3) scene2);
                                    break;
                                }
                                scene2 = scene2.mParentScene;
                            } else {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(scene);
                                sbLIZ4.append(" Scene findOCBuilder traverseParent targetScene not found, use Activity instead} ");
                                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                                C19GS c19gs = (C19GS) scene.requireActivity();
                                if (C1664600tQ2.LJIIJ(c19gs) && (c0lekLJI2 = C1664600tQ2.LJI(c19gs)) != null) {
                                    c1drg = ((FeatureAlsLogicContainer) c0lekLJI2).LLJJI;
                                }
                            }
                        }
                    } else {
                        Scene scene3 = scene.mParentScene;
                        if (scene3 != null && (scene3 instanceof C19A3)) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(scene);
                            sbLIZ5.append(" Scene findOCBuilder use parentScene directly  ");
                            Scene scene4 = scene.mParentScene;
                            if (scene4 != null) {
                                string = scene4.toString();
                            } else {
                                string = null;
                            }
                            sbLIZ5.append(string);
                            sbLIZ5.append(' ');
                            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                            c1drg = C1664600tQ2.LJIIIZ((C19A3) scene.mParentScene);
                        } else {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(scene);
                            sbLIZ6.append(" Scene findOCBuilder use Activity instead} ");
                            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
                            C19GS c19gs2 = (C19GS) scene.requireActivity();
                            if (C1664600tQ2.LJIIJ(c19gs2) && (c0lekLJI = C1664600tQ2.LJI(c19gs2)) != null) {
                                c1drg = ((FeatureAlsLogicContainer) c0lekLJI).LLJJI;
                            } else {
                                c1drg = null;
                            }
                        }
                    }
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(scene);
                sbLIZ7.append(" Scene findOCBuilder use ObjectContainer  ");
                sbLIZ7.append(c1drg.LIZ);
                sbLIZ7.append(' ');
                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ7));
                Scene scene5 = scene.mParentScene;
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(scene);
                sbLIZ8.append(" Scene findOCBuilder parentScene ");
                if (scene5 == null) {
                    string2 = null;
                } else {
                    string2 = scene5.toString();
                }
                sbLIZ8.append(string2);
                sbLIZ8.append(' ');
                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ8));
                if (scene5 instanceof C19A3) {
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append(scene);
                    sbLIZ9.append(" Scene findOCBuilder parentScene als status ");
                    sbLIZ9.append(C1664600tQ2.LJIIJJI((C19A3) scene5));
                    sbLIZ9.append(' ');
                    C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ9));
                }
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append(scene);
                sbLIZ10.append(" Scene findOCBuilder parentObjectContainer name ");
                if (c1drg == null || (interfaceC2255791DQz = c1drg.LIZ) == null) {
                    string3 = null;
                } else {
                    string3 = interfaceC2255791DQz.toString();
                }
                sbLIZ10.append(string3);
                sbLIZ10.append(' ');
                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ10));
                if (str == null || a0.LJJJIL(str)) {
                    str = C13LE.LIZ(scene.getClass()).LJI();
                }
                if (str == null) {
                    str = "";
                }
                OCAdapterViewModel oCAdapterViewModel2 = new OCAdapterViewModel(str, c1drg, alsVMContainer.LL, null);
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append(scene);
                sbLIZ11.append(" Scene findOCBuilder create OCAdapterViewModel ");
                sbLIZ11.append(oCAdapterViewModel2);
                sbLIZ11.append(" successfully");
                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ11));
                alsVMContainer.LLILLL = oCAdapterViewModel2;
                alsVMContainer.xQ2(scene);
            } else {
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append(scene);
                sbLIZ12.append(" Scene findOCBuilder find previous OCAdapterViewModel ");
                sbLIZ12.append(alsVMContainer.LLILLL);
                sbLIZ12.append(" successfully");
                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ12));
            }
            oCAdapterViewModel = alsVMContainer.LLILLL;
        }
        return oCAdapterViewModel;
    }
}
