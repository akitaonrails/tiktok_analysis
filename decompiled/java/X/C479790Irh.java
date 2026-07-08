package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.root.tab.room.LiveRoomPageFragment;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;
import com.ss.android.ugc.aweme.live.root.tab.wrapper.TabWrapperFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.LiveTab;

/* JADX INFO: renamed from: X.0Irh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479790Irh implements InterfaceC479770Irf {
    public final InterfaceC479780Irg<?> LL;
    public final List<InterfaceC475320IkU> LLILLJJLI;
    public final InterfaceC475300IkS LLILLL;
    public final List<? extends InterfaceC475320IkU> LLILZ;
    public C20632315oP LLILZIL;
    public C480320IsY LLILZLL;
    public boolean LLIZ;
    public C21546719Ub LLIZLLLIL;
    public boolean LLJ;

    @Override // X.InterfaceC479770Irf
    public final boolean M2() {
        return true;
    }

    @Override // X.InterfaceC479770Irf
    public final List<LiveTab> L2() {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends InterfaceC475320IkU> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getTab());
        }
        return arrayList;
    }

    public final Fragment LIZIZ() {
        TabWrapperFragment tabWrapperFragmentLLLIL;
        InterfaceC479810Irj interfaceC479810Irj;
        C480320IsY c480320IsY = this.LLILZLL;
        if (c480320IsY != null) {
            C20632315oP c20632315oP = this.LLILZIL;
            tabWrapperFragmentLLLIL = c480320IsY.LLLIL(c20632315oP != null ? Integer.valueOf(c20632315oP.getCurrentItem()) : null);
        } else {
            tabWrapperFragmentLLLIL = null;
        }
        if (!(tabWrapperFragmentLLLIL instanceof TabWrapperFragment) || tabWrapperFragmentLLLIL == null || (interfaceC479810Irj = tabWrapperFragmentLLLIL.LLILZIL) == null) {
            return null;
        }
        return interfaceC479810Irj.LLLIILIL();
    }

    public final void LIZJ() {
        C20632315oP c20632315oP;
        C21546719Ub c21546719Ub;
        if (this.LLJ || (c20632315oP = this.LLILZIL) == null || (c21546719Ub = this.LLIZLLLIL) == null) {
            return;
        }
        c20632315oP.LIZIZ(new C480170IsJ(new WeakReference(c21546719Ub)));
        this.LLJ = true;
    }

    @Override // X.InterfaceC479770Irf
    public final Map<String, String> Z() {
        TabWrapperFragment tabWrapperFragment;
        InterfaceC479810Irj interfaceC479810Irj;
        Map<String, String> mapZ;
        C480320IsY c480320IsY = this.LLILZLL;
        if (c480320IsY == null) {
            return C2097608Jq.LJ();
        }
        int i = c480320IsY.LLJILLL;
        if (i < 0 || i >= c480320IsY.LLJI.size()) {
            return C2097608Jq.LJ();
        }
        Reference reference = (Reference) ((LinkedHashMap) c480320IsY.LLJILJILJ).get(Integer.valueOf(c480320IsY.LLJILLL));
        return (reference == null || (tabWrapperFragment = (TabWrapperFragment) reference.get()) == null || (interfaceC479810Irj = tabWrapperFragment.LLILZIL) == null || (mapZ = interfaceC479810Irj.Z()) == null) ? C2097608Jq.LJ() : mapZ;
    }

    @Override // X.InterfaceC479770Irf
    public final int getLayoutId() {
        C20441214yg.LIZIZ("MultiPageManager", "setContentView with toptab");
        return R.layout.db3;
    }

    @Override // X.InterfaceC479770Irf
    public final void onDestroy() {
        C479800Iri c479800Iri;
        C20632315oP c20632315oP;
        DataChannelGlobal.LLILZ.zQ2(this);
        C480320IsY c480320IsY = this.LLILZLL;
        if (c480320IsY != null && (c479800Iri = c480320IsY.LLJJIJIIJIL) != null && (c20632315oP = this.LLILZIL) != null) {
            c20632315oP.LJI(c479800Iri);
        }
        this.LLILZLL = null;
        this.LLILZIL = null;
        this.LLIZLLLIL = null;
    }

    @Override // X.InterfaceC479770Irf
    public final Fragment getCurrentFragment() {
        return LIZIZ();
    }

    @Override // X.InterfaceC479770Irf
    public final Float rs() {
        LiveRoomPageFragment liveRoomPageFragment;
        C475310IkT c475310IkT;
        SkylightController skylightController;
        C476830Imv c476830Imv;
        Fragment fragmentLIZIZ = LIZIZ();
        if (!(fragmentLIZIZ instanceof LiveRoomPageFragment) || (liveRoomPageFragment = (LiveRoomPageFragment) fragmentLIZIZ) == null || (c475310IkT = liveRoomPageFragment.LLILLJJLI) == null || (skylightController = c475310IkT.LJFF) == null || (c476830Imv = skylightController.LL) == null) {
            return null;
        }
        return Float.valueOf(c476830Imv.LJFF());
    }

    @Override // X.InterfaceC479770Irf
    public final void F2(boolean z) {
        if (this.LLIZ) {
            LIZLLL(!z);
        }
    }

    @Override // X.InterfaceC479770Irf
    public final int G2(int i) {
        C480320IsY c480320IsY = this.LLILZLL;
        if (c480320IsY != null) {
            return c480320IsY.getItemViewType(i);
        }
        return 1;
    }

    @Override // X.InterfaceC479770Irf
    public final String H2(int i) {
        List<? extends InterfaceC475320IkU> list;
        InterfaceC475320IkU interfaceC475320IkU;
        String strName;
        if (i >= this.LLILZ.size() || i < 0 || (list = this.LLILZ) == null || (interfaceC475320IkU = (InterfaceC475320IkU) ListProtector.get(list, i)) == null || (strName = interfaceC475320IkU.name()) == null) {
            return "";
        }
        return strName;
    }

    @Override // X.InterfaceC479770Irf
    public final void I2(C21546719Ub c21546719Ub) {
        this.LLIZLLLIL = c21546719Ub;
        LIZJ();
    }

    @Override // X.InterfaceC479770Irf
    public final void J2(int i) {
        TabWrapperFragment tabWrapperFragmentLLLIL;
        InterfaceC479810Irj interfaceC479810Irj;
        Fragment fragmentLLLIILIL;
        View view;
        Fragment fragmentLLLIILIL2;
        View view2;
        TabWrapperFragment tabWrapperFragmentLLLIL2;
        String strName;
        InterfaceC479810Irj interfaceC479810Irj2;
        InterfaceC479810Irj interfaceC479810Irj3;
        Fragment fragmentLLLIILIL3;
        View view3;
        Fragment fragmentLLLIILIL4;
        View view4;
        C20632315oP c20632315oP = this.LLILZIL;
        if (c20632315oP != null && c20632315oP.getCurrentItem() != i) {
            c20632315oP.LJ(i, false);
        }
        C480320IsY c480320IsY = this.LLILZLL;
        if (c480320IsY != null) {
            c480320IsY.LLJILLL = i;
            int i2 = c480320IsY.LLJJ;
            if (i2 != i) {
                if (i2 != -1 && (tabWrapperFragmentLLLIL2 = c480320IsY.LLLIL(Integer.valueOf(i2))) != null && tabWrapperFragmentLLLIL2.isAdded() && !tabWrapperFragmentLLLIL2.getChildFragmentManager().LJLJJI() && tabWrapperFragmentLLLIL2.LLIZLLLIL) {
                    tabWrapperFragmentLLLIL2.LLIZLLLIL = false;
                    if (tabWrapperFragmentLLLIL2.LLIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onUnSelected ");
                        sbLIZ.append(i);
                        C20441214yg.LJIIIZ("TabWrapperFragment", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC479810Irj interfaceC479810Irj4 = tabWrapperFragmentLLLIL2.LLILZIL;
                        if (interfaceC479810Irj4 != null) {
                            interfaceC479810Irj4.py(i);
                        }
                        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.getValue().alignOnline) {
                            InterfaceC475320IkU interfaceC475320IkU = tabWrapperFragmentLLLIL2.LL;
                            if (interfaceC475320IkU != null) {
                                strName = interfaceC475320IkU.name();
                            } else {
                                strName = null;
                            }
                            if (Intrinsics.LJFF(strName, "hangout") && (((interfaceC479810Irj2 = tabWrapperFragmentLLLIL2.LLILZIL) == null || (fragmentLLLIILIL4 = interfaceC479810Irj2.LLLIILIL()) == null || (view4 = fragmentLLLIILIL4.getView()) == null || view4.getVisibility() != 8) && (interfaceC479810Irj3 = tabWrapperFragmentLLLIL2.LLILZIL) != null && (fragmentLLLIILIL3 = interfaceC479810Irj3.LLLIILIL()) != null && (view3 = fragmentLLLIILIL3.getView()) != null)) {
                                C786410Ut5.LJLLLLLL(8, view3);
                            }
                        }
                    }
                }
                int i3 = c480320IsY.LLJILLL;
                if (i3 != -1 && (tabWrapperFragmentLLLIL = c480320IsY.LLLIL(Integer.valueOf(i3))) != null && tabWrapperFragmentLLLIL.isAdded() && !tabWrapperFragmentLLLIL.getChildFragmentManager().LJLJJI() && !tabWrapperFragmentLLLIL.LLIZLLLIL) {
                    tabWrapperFragmentLLLIL.LLIZLLLIL = true;
                    if (tabWrapperFragmentLLLIL.LLIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onTabSelected ");
                        sbLIZ2.append(i);
                        C20441214yg.LJIIIZ("TabWrapperFragment", C2188811AlT.LIZIZ(sbLIZ2));
                        InterfaceC479810Irj interfaceC479810Irj5 = tabWrapperFragmentLLLIL.LLILZIL;
                        if (interfaceC479810Irj5 != null) {
                            interfaceC479810Irj5.IR(i);
                        }
                        InterfaceC479810Irj interfaceC479810Irj6 = tabWrapperFragmentLLLIL.LLILZIL;
                        if ((interfaceC479810Irj6 == null || (fragmentLLLIILIL2 = interfaceC479810Irj6.LLLIILIL()) == null || (view2 = fragmentLLLIILIL2.getView()) == null || view2.getVisibility() != 0) && (interfaceC479810Irj = tabWrapperFragmentLLLIL.LLILZIL) != null && (fragmentLLLIILIL = interfaceC479810Irj.LLLIILIL()) != null && (view = fragmentLLLIILIL.getView()) != null) {
                            C786410Ut5.LJLLLLLL(0, view);
                        }
                    }
                }
                c480320IsY.LLJJ = c480320IsY.LLJILLL;
            }
        }
    }

    @Override // X.InterfaceC479770Irf
    public final int LIZ(EnterRoomConfig enterRoomConfig) {
        if (ListProtector.get(this.LLILZ, 1) instanceof C475200IkI) {
            return new C477580Io8().LIZ(enterRoomConfig);
        }
        return 0;
    }

    public final void LIZLLL(boolean z) {
        C20632315oP c20632315oP;
        C20632315oP c20632315oP2;
        if (!z && (((c20632315oP = this.LLILZIL) == null || c20632315oP.getScrollState() != 0) && (c20632315oP2 = this.LLILZIL) != null)) {
            c20632315oP2.LJ(c20632315oP2.getCurrentItem(), false);
        }
        C20632315oP c20632315oP3 = this.LLILZIL;
        if (c20632315oP3 != null) {
            c20632315oP3.setUserInputEnabled(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Irx] */
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
    @Override // X.InterfaceC479770Irf
    public final void K2(EnterRoomConfig enterRoomConfig, C19EH c19eh) {
        C479800Iri c479800Iri;
        C20632315oP c20632315oP;
        if (this.LLILZIL == null) {
            C20632315oP c20632315oP2 = (C20632315oP) this.LL.U6().findViewById(R.id.view_pager);
            C480320IsY c480320IsY = new C480320IsY(this.LLILZ, this.LL.U6(), this.LL, this.LLILLL);
            this.LLILZLL = c480320IsY;
            c20632315oP2.setAdapter(c480320IsY);
            c20632315oP2.setOffscreenPageLimit(1);
            c20632315oP2.setSaveEnabled(false);
            this.LLILZIL = c20632315oP2;
            this.LLIZ = false;
            LIZLLL(false);
            this.LLILLL.LJ(new InterfaceC477120InO() { // from class: X.0Irx
                @Override // X.InterfaceC477120InO
                public final void LIZ(int i) {
                    boolean z;
                    C479790Irh c479790Irh = this.LIZ;
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c479790Irh.LLIZ = z;
                    c479790Irh.LIZLLL(z);
                }
            });
            DataChannelGlobal.LLILZ.BQ2(this, this.LL.U6(), ViewPagerScrollInterceptionGlobalEvent.class, new AwS586S0100000_7(this, 242));
            LIZJ();
            C480320IsY c480320IsY2 = this.LLILZLL;
            if (c480320IsY2 != null && (c479800Iri = c480320IsY2.LLJJIJIIJIL) != null && (c20632315oP = this.LLILZIL) != null) {
                c20632315oP.LIZIZ(c479800Iri);
            }
        }
        C20632315oP c20632315oP3 = this.LLILZIL;
        if (c20632315oP3 != null) {
            c20632315oP3.LJ(LIZ(enterRoomConfig), false);
        }
    }

    public C479790Irh(InterfaceC479780Irg interfaceC479780Irg, List list, InterfaceC475300IkS interfaceC475300IkS) {
        this.LL = interfaceC479780Irg;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC475300IkS;
        this.LLILZ = list;
    }

    @Override // X.InterfaceC479770Irf
    public final <T> void E2(EnterRoomConfig enterRoomConfig, InterfaceC479830Irl<T> interfaceC479830Irl, C19EH c19eh) {
        InterfaceC479810Irj interfaceC479810Irj;
        C480320IsY c480320IsY = this.LLILZLL;
        if (c480320IsY != null) {
            Iterator it2 = ((LinkedHashMap) c480320IsY.LLJILJILJ).entrySet().iterator();
            while (it2.hasNext()) {
                TabWrapperFragment tabWrapperFragment = (TabWrapperFragment) ((Reference) ((Map.Entry) it2.next()).getValue()).get();
                if (tabWrapperFragment != null && tabWrapperFragment.LLIZ && (interfaceC479810Irj = tabWrapperFragment.LLILZIL) != null) {
                    interfaceC479810Irj.E2(enterRoomConfig, interfaceC479830Irl, c19eh);
                }
            }
        }
    }
}
