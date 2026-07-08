package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseAvatarActionAssem;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0hsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221180hsq extends C09AY implements InterfaceC1685430txd<UIAssem, C291001Au<? extends EnumC1221420htE>, C291001Au<? extends C1221030hsb>, C291001Au<? extends Set<? extends C1221030hsb>>, C291001Au<? extends C1221230hsv>, C291001Au<? extends EnumC1221250hsx>, Unit> {
    public final /* synthetic */ ProfileAigcChooseAvatarActionAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221180hsq(ProfileAigcChooseAvatarActionAssem profileAigcChooseAvatarActionAssem, View view) {
        super(6);
        this.LL = profileAigcChooseAvatarActionAssem;
        this.LLILLJJLI = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // X.InterfaceC1685430txd
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends EnumC1221420htE> c291001Au, C291001Au<? extends C1221030hsb> c291001Au2, C291001Au<? extends Set<? extends C1221030hsb>> c291001Au3, C291001Au<? extends C1221230hsv> c291001Au4, C291001Au<? extends EnumC1221250hsx> c291001Au5) {
        TuxTextView tuxTextView;
        String string;
        TuxSpinner tuxSpinner;
        TuxSpinner tuxSpinner2;
        C291001Au<? extends C1221030hsb> c291001Au6 = c291001Au2;
        C291001Au<? extends Set<? extends C1221030hsb>> c291001Au7 = c291001Au3;
        C291001Au<? extends C1221230hsv> c291001Au8 = c291001Au4;
        C291001Au<? extends EnumC1221250hsx> c291001Au9 = c291001Au5;
        int i = 8;
        boolean z = true;
        TuxSpinner tuxSpinner3 = null;
        TuxTextView tuxTextView2 = null;
        TuxSpinner tuxSpinner4 = null;
        if (c291001Au.LIZ == EnumC1221420htE.AVATAR_CHANGE) {
            int i2 = C1221210hst.LIZ[((EnumC1221200hss) this.LL.LLJJIJI.getValue()).ordinal()];
            int i3 = 4;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        View view = this.LL.LLJILJILJ;
                        if (view != null) {
                            C786410Ut5.LJLLLLLL(0, view);
                        }
                        View view2 = this.LL.LLJI;
                        if (view2 == null) {
                            view2 = null;
                        }
                        C786410Ut5.LJLLLLLL(4, view2);
                        View view3 = this.LL.LLJILJILJ;
                        if (view3 != null && (tuxSpinner2 = (TuxSpinner) view3.findViewById(R.id.a28)) != null) {
                            if (c291001Au9.LIZ == EnumC1221250hsx.SHOW) {
                                i = 0;
                            }
                            C786410Ut5.LLZILL(tuxSpinner2, i);
                        }
                        this.LL.Jo();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    View view4 = this.LL.LLJILJILJ;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(0, view4);
                    }
                    View view5 = this.LL.LLJI;
                    if (view5 == null) {
                        view5 = null;
                    }
                    C786410Ut5.LJLLLLLL(4, view5);
                    View view6 = this.LL.LLJILJILJ;
                    if (view6 != null && (tuxSpinner = (TuxSpinner) view6.findViewById(R.id.a28)) != null) {
                        if (c291001Au9.LIZ == EnumC1221250hsx.SHOW) {
                            i = 0;
                        }
                        C786410Ut5.LLZILL(tuxSpinner, i);
                    }
                    this.LL.Jo();
                }
            } else {
                View view7 = this.LL.LLJILJILJ;
                if (view7 != null) {
                    C786410Ut5.LJLLLLLL(8, view7);
                }
                TuxTextView tuxTextView3 = this.LL.LLJILJIL;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                tuxTextView3.setText(this.LLILLJJLI.getResources().getString(2131820609));
                TuxSpinner tuxSpinner5 = this.LL.LLJIJIL;
                if (tuxSpinner5 == null) {
                    tuxSpinner5 = null;
                }
                if (c291001Au9.LIZ == EnumC1221250hsx.SHOW) {
                    i3 = 0;
                }
                C786410Ut5.LLZILL(tuxSpinner5, i3);
                ProfileAigcChooseAvatarActionAssem profileAigcChooseAvatarActionAssem = this.LL;
                View view8 = profileAigcChooseAvatarActionAssem.LLJI;
                if (view8 == null) {
                    view8 = null;
                }
                TuxTextView tuxTextView4 = profileAigcChooseAvatarActionAssem.LLJILJIL;
                if (tuxTextView4 != null) {
                    tuxTextView2 = tuxTextView4;
                }
                if (c291001Au6.LIZ == 0) {
                    z = false;
                }
                profileAigcChooseAvatarActionAssem.Ho(view8, tuxTextView2, z);
            }
        } else {
            View view9 = this.LL.LLJI;
            if (view9 == null) {
                view9 = null;
            }
            C786410Ut5.LJLLLLLL(0, view9);
            View view10 = this.LL.LLJILJILJ;
            if (view10 != null) {
                C786410Ut5.LJLLLLLL(8, view10);
            }
            C1221230hsv c1221230hsv = (C1221230hsv) c291001Au8.LIZ;
            EnumC1221220hsu enumC1221220hsu = c1221230hsv.LIZ;
            int i4 = c1221230hsv.LIZIZ;
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("state: ");
            sbLIZ.append(enumC1221220hsu);
            sbLIZ.append(", count: ");
            sbLIZ.append(i4);
            C2188811AlT.LIZIZ(sbLIZ);
            int i6 = C1221210hst.LIZIZ[enumC1221220hsu.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    ProfileAigcChooseAvatarActionAssem profileAigcChooseAvatarActionAssem2 = this.LL;
                    TuxTextView tuxTextView5 = profileAigcChooseAvatarActionAssem2.LLJILJIL;
                    if (tuxTextView5 == null) {
                        tuxTextView5 = null;
                    }
                    int size = ((Set) c291001Au7.LIZ).size();
                    if (size == 0) {
                        string = tuxTextView5.getResources().getString(2131820605);
                    } else {
                        string = tuxTextView5.getResources().getString(2131820595, Integer.valueOf(size));
                    }
                    tuxTextView5.setText(string);
                    View view11 = profileAigcChooseAvatarActionAssem2.LLJI;
                    if (view11 == null) {
                        view11 = null;
                    }
                    TuxTextView tuxTextView6 = profileAigcChooseAvatarActionAssem2.LLJILJIL;
                    if (tuxTextView6 == null) {
                        tuxTextView6 = null;
                    }
                    if (size <= 0) {
                        z = false;
                    }
                    profileAigcChooseAvatarActionAssem2.Ho(view11, tuxTextView6, z);
                    TuxSpinner tuxSpinner6 = this.LL.LLJIJIL;
                    if (tuxSpinner6 != null) {
                        tuxSpinner4 = tuxSpinner6;
                    }
                    C786410Ut5.LLZILL(tuxSpinner4, 8);
                } else {
                    throw new C1954807lC();
                }
            } else {
                TuxTextView tuxTextView7 = this.LL.LLJILJIL;
                if (tuxTextView7 == null) {
                    tuxTextView = null;
                    tuxTextView7 = null;
                } else {
                    tuxTextView = tuxTextView7;
                }
                tuxTextView.setText(tuxTextView7.getResources().getString(2131820596, Integer.valueOf(i4), Integer.valueOf(((C1221150hsn) this.LL.Go().getState()).LLILLJJLI.LIZ.size())));
                TuxSpinner tuxSpinner7 = this.LL.LLJIJIL;
                if (tuxSpinner7 != null) {
                    tuxSpinner3 = tuxSpinner7;
                }
                C786410Ut5.LLZILL(tuxSpinner3, 0);
            }
        }
        return Unit.LIZ;
    }
}
