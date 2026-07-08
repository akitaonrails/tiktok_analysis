package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.SubPackageErrorAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGJ extends C09AY implements Function2<UIAssem, C514600KGc, Unit> {
    public final /* synthetic */ SubPackageErrorAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KGJ(SubPackageErrorAssem subPackageErrorAssem, View view) {
        super(2);
        this.LL = subPackageErrorAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C514600KGc c514600KGc) {
        C515430KJh c515430KJh;
        Integer numValueOf;
        int i;
        String strLJIJI;
        C514600KGc c514600KGc2 = c514600KGc;
        if (c514600KGc2 != null && (c515430KJh = c514600KGc2.LIZJ) != null && c515430KJh.LIZIZ != 4025009) {
            ViewGroup viewGroup = this.LL.LLJJJ;
            if (viewGroup != null) {
                C500260Jjc.LLFFF(viewGroup);
            }
            final SubPackageErrorAssem subPackageErrorAssem = this.LL;
            final C515430KJh c515430KJh2 = c514600KGc2.LIZJ;
            C16F5 c16f5 = subPackageErrorAssem.LLJJI;
            if (c16f5 != null) {
                if (c515430KJh2 == null || (strLJIJI = c515430KJh2.LIZJ) == null) {
                    strLJIJI = C497740JfY.LJIJI(2131855022);
                }
                c16f5.setText(strLJIJI);
            }
            List<C0KOW> list = C0KNM.LIZ;
            Integer numValueOf2 = null;
            if (c515430KJh2 != null) {
                numValueOf = Integer.valueOf(c515430KJh2.LIZ);
                numValueOf2 = Integer.valueOf(c515430KJh2.LIZIZ);
            } else {
                numValueOf = null;
            }
            if (C0KNM.LIZJ(numValueOf, numValueOf2)) {
                final C16FS c16fs = subPackageErrorAssem.LLJJIII;
                if (c16fs != null) {
                    if (C0KNM.LIZLLL()) {
                        C500260Jjc.LLFFF(c16fs);
                        C197039127h c197039127h = subPackageErrorAssem.LLJJIJI;
                        if (c197039127h != null) {
                            C500260Jjc.LJIILIIL(c197039127h);
                        }
                        c16fs.setText(C497740JfY.LJIJI(2131836588));
                        C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0KGm
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String str;
                                Integer numValueOf3;
                                Integer numValueOf4;
                                C513680KCo c513680KCo;
                                List<C0KOW> list2 = C0KNM.LIZ;
                                C0KNM.LJ(c16fs.getContext());
                                C513700KCq c513700KCqHp = subPackageErrorAssem.hp();
                                Map<String, String> map = null;
                                if (c513700KCqHp != null && (c513680KCo = c513700KCqHp.LLILLJJLI) != null) {
                                    str = c513680KCo.LJI;
                                } else {
                                    str = null;
                                }
                                C515430KJh c515430KJh3 = c515430KJh2;
                                if (c515430KJh3 != null) {
                                    numValueOf3 = Integer.valueOf(c515430KJh3.LIZ);
                                } else {
                                    numValueOf3 = null;
                                }
                                C515430KJh c515430KJh4 = c515430KJh2;
                                if (c515430KJh4 != null) {
                                    numValueOf4 = Integer.valueOf(c515430KJh4.LIZIZ);
                                } else {
                                    numValueOf4 = null;
                                }
                                C513700KCq c513700KCqHp2 = subPackageErrorAssem.hp();
                                if (c513700KCqHp2 != null) {
                                    map = c513700KCqHp2.LLILZIL;
                                }
                                C0KDR.LJI(str, numValueOf3, numValueOf4, "google_page", map);
                            }
                        });
                    } else {
                        C500260Jjc.LJIILIIL(c16fs);
                        C197039127h c197039127h2 = subPackageErrorAssem.LLJJIJI;
                        if (c197039127h2 != null) {
                            C500260Jjc.LLFFF(c197039127h2);
                        }
                    }
                }
                C16FS c16fs2 = subPackageErrorAssem.LLJJIII;
                if (c16fs2 != null) {
                    C500260Jjc.LJIILIIL(c16fs2);
                }
                C197039127h c197039127h3 = subPackageErrorAssem.LLJJIJI;
                if (c197039127h3 != null) {
                    C500260Jjc.LLFFF(c197039127h3);
                }
            }
            C197039127h c197039127h4 = subPackageErrorAssem.LLJJIJI;
            if (c197039127h4 != null) {
                C786410Ut5.U8(c197039127h4, new View.OnClickListener() { // from class: X.0KGI
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EnumC513390KBl enumC513390KBl;
                        String str;
                        Map<String, String> map;
                        C0KCF c0kcfLIZ;
                        String str2;
                        Integer numValueOf3;
                        Integer numValueOf4;
                        C513680KCo c513680KCo;
                        C513680KCo c513680KCo2;
                        C513680KCo c513680KCo3;
                        C513700KCq c513700KCqHp = subPackageErrorAssem.hp();
                        Map<String, String> map2 = null;
                        if (c513700KCqHp != null) {
                            enumC513390KBl = c513700KCqHp.LLJI;
                        } else {
                            enumC513390KBl = null;
                        }
                        if (enumC513390KBl != EnumC513390KBl.UNKNOWN && enumC513390KBl != null) {
                            C513700KCq c513700KCqHp2 = subPackageErrorAssem.hp();
                            if (c513700KCqHp2 != null) {
                                c513700KCqHp2.LLILZ = System.currentTimeMillis();
                            }
                            ViewGroup viewGroup2 = subPackageErrorAssem.LLJJJ;
                            if (viewGroup2 != null) {
                                C500260Jjc.LJIILIIL(viewGroup2);
                            }
                            AssemVMLazy assemVMLazy = subPackageErrorAssem.LLJJIJIIJIL;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SubPackageErrorAssem.LLJJJJ;
                            assemVMLazy.getValue().setState(new C0KHW());
                            C513700KCq c513700KCqHp3 = subPackageErrorAssem.hp();
                            if (c513700KCqHp3 != null && (c513680KCo3 = c513700KCqHp3.LLILLJJLI) != null) {
                                str = c513680KCo3.LJI;
                            } else {
                                str = null;
                            }
                            C513700KCq c513700KCqHp4 = subPackageErrorAssem.hp();
                            if (c513700KCqHp4 != null) {
                                map = c513700KCqHp4.LLILZIL;
                            } else {
                                map = null;
                            }
                            C0KDR.LJII(str, "sub_package_error_assem", "retry", map);
                            SubPackagePageAssemVM subPackagePageAssemVM = (SubPackagePageAssemVM) subPackageErrorAssem.LLJJIJIIJIL.getValue();
                            C513700KCq c513700KCqHp5 = subPackageErrorAssem.hp();
                            if (c513700KCqHp5 != null && (c513680KCo2 = c513700KCqHp5.LLILLJJLI) != null) {
                                c0kcfLIZ = c513680KCo2.LIZ();
                            } else {
                                C513700KCq c513700KCqHp6 = subPackageErrorAssem.hp();
                                if (c513700KCqHp6 != null) {
                                    c0kcfLIZ = c513700KCqHp6.LL;
                                } else {
                                    c0kcfLIZ = null;
                                }
                            }
                            subPackagePageAssemVM.vQ2(C0KCA.LIZJ(c0kcfLIZ, Boolean.FALSE));
                            C513700KCq c513700KCqHp7 = subPackageErrorAssem.hp();
                            if (c513700KCqHp7 != null && (c513680KCo = c513700KCqHp7.LLILLJJLI) != null) {
                                str2 = c513680KCo.LJI;
                            } else {
                                str2 = null;
                            }
                            C515430KJh c515430KJh3 = c515430KJh2;
                            if (c515430KJh3 != null) {
                                numValueOf3 = Integer.valueOf(c515430KJh3.LIZ);
                            } else {
                                numValueOf3 = null;
                            }
                            C515430KJh c515430KJh4 = c515430KJh2;
                            if (c515430KJh4 != null) {
                                numValueOf4 = Integer.valueOf(c515430KJh4.LIZIZ);
                            } else {
                                numValueOf4 = null;
                            }
                            C513700KCq c513700KCqHp8 = subPackageErrorAssem.hp();
                            if (c513700KCqHp8 != null) {
                                map2 = c513700KCqHp8.LLILZIL;
                            }
                            C0KDR.LJI(str2, numValueOf3, numValueOf4, "retry", map2);
                        }
                    }
                });
            }
            ViewGroup viewGroup2 = subPackageErrorAssem.LLJJJ;
            if (viewGroup2 != null) {
                HandlerHook.viewPost(viewGroup2, new Runnable() { // from class: X.0GYE
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        SubPackageErrorAssem subPackageErrorAssem2;
                        ViewGroup viewGroup3;
                        ViewGroup viewGroup4;
                        C1C7U.LIZ("SubPackageErrorAssem@d680.updateErrorViewUi$3");
                        try {
                            ViewGroup viewGroup5 = subPackageErrorAssem.LLJJJ;
                            if (viewGroup5 != null && viewGroup5.getParent() != null && (viewGroup3 = (subPackageErrorAssem2 = subPackageErrorAssem).LLJJJ) != null && (viewGroup4 = subPackageErrorAssem2.LLJJJIL) != null) {
                                ViewGroup.LayoutParams layoutParams = viewGroup4.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                double height = ((double) (viewGroup3.getHeight() - viewGroup4.getHeight())) * 0.4d;
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.setMargins(0, (int) height, 0, 0);
                                }
                                ViewGroup viewGroup6 = subPackageErrorAssem2.LLJJJIL;
                                if (viewGroup6 != null) {
                                    C786410Ut5.X5(marginLayoutParams, viewGroup6);
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SubPackageErrorAssem@d680.updateErrorViewUi$3");
                    }
                });
            }
            if (c515430KJh2 != null && ((i = c515430KJh2.LIZIZ) == -1006 || i == -1007 || i == -1004)) {
                C500260Jjc.LJIILIIL(subPackageErrorAssem.LLJJIJI);
            }
        }
        return Unit.LIZ;
    }
}
