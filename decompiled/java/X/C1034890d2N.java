package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d2N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1034890d2N implements InterfaceC469360Ias {
    public final ScrollSwitchStateManager LL;
    public EnumC1034900d2O LLILLJJLI = EnumC1034900d2O.LL;
    public boolean LLILLL = true;
    public String LLILZ;
    public C1034880d2M LLILZIL;

    public C1034890d2N(ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LL = scrollSwitchStateManager;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        List<InterfaceC1034910d2P> listZo;
        Context context;
        Aweme awemeLJIIIIZZ;
        List<InterfaceC1034910d2P> listZo2;
        if (i == 0) {
            if (this.LLILLJJLI == EnumC1034900d2O.LLILLJJLI && Intrinsics.LJFF(this.LLILZ, "page_feed")) {
                this.LLILLJJLI = EnumC1034900d2O.LLILZIL;
                C1034880d2M c1034880d2M = this.LLILZIL;
                if (c1034880d2M != null && (context = c1034880d2M.LIZ.getContext()) != null && (((awemeLJIIIIZZ = c1034880d2M.LIZ.LJIIIIZZ()) != null || (awemeLJIIIIZZ = C740740T3w.LJ()) != null) && (listZo2 = c1034880d2M.LIZ.Zo()) != null)) {
                    Iterator<InterfaceC1034910d2P> it2 = listZo2.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(context, awemeLJIIIIZZ);
                    }
                }
            } else if (this.LLILLJJLI == EnumC1034900d2O.LLILZ && Intrinsics.LJFF(this.LLILZ, "page_profile")) {
                this.LLILLJJLI = EnumC1034900d2O.LLILLL;
                C1034880d2M c1034880d2M2 = this.LLILZIL;
                if (c1034880d2M2 != null && c1034880d2M2.LIZ.getContext() != null && ((c1034880d2M2.LIZ.LJIIIIZZ() != null || C740740T3w.LJ() != null) && (listZo = c1034880d2M2.LIZ.Zo()) != null)) {
                    Iterator<InterfaceC1034910d2P> it3 = listZo.iterator();
                    while (it3.hasNext()) {
                        it3.next().LJFF();
                    }
                }
            }
            this.LLILLL = true;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        String strBQ2;
        Context context;
        List<InterfaceC1034910d2P> listZo;
        Context context2;
        List<InterfaceC1034910d2P> listZo2;
        this.LLILLL = false;
        ScrollSwitchStateManager scrollSwitchStateManager = this.LL;
        if (scrollSwitchStateManager != null) {
            strBQ2 = scrollSwitchStateManager.BQ2(i);
        } else {
            strBQ2 = null;
        }
        this.LLILZ = strBQ2;
        if (Intrinsics.LJFF(strBQ2, "page_feed")) {
            EnumC1034900d2O enumC1034900d2O = this.LLILLJJLI;
            EnumC1034900d2O enumC1034900d2O2 = EnumC1034900d2O.LLILZIL;
            if (enumC1034900d2O != enumC1034900d2O2) {
                this.LLILLJJLI = enumC1034900d2O2;
                C1034880d2M c1034880d2M = this.LLILZIL;
                if (c1034880d2M != null && (context2 = c1034880d2M.LIZ.getContext()) != null) {
                    Aweme awemeLJIIIIZZ = c1034880d2M.LIZ.LJIIIIZZ();
                    if ((awemeLJIIIIZZ == null && (awemeLJIIIIZZ = C740740T3w.LJ()) == null) || (listZo2 = c1034880d2M.LIZ.Zo()) == null) {
                        return;
                    }
                    Iterator<InterfaceC1034910d2P> it2 = listZo2.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(context2, awemeLJIIIIZZ);
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this.LLILZ, "page_profile")) {
            EnumC1034900d2O enumC1034900d2O3 = this.LLILLJJLI;
            EnumC1034900d2O enumC1034900d2O4 = EnumC1034900d2O.LLILLL;
            if (enumC1034900d2O3 != enumC1034900d2O4) {
                this.LLILLJJLI = enumC1034900d2O4;
                C1034880d2M c1034880d2M2 = this.LLILZIL;
                if (c1034880d2M2 != null && (context = c1034880d2M2.LIZ.getContext()) != null) {
                    Aweme awemeLJIIIIZZ2 = c1034880d2M2.LIZ.LJIIIIZZ();
                    if ((awemeLJIIIIZZ2 == null && (awemeLJIIIIZZ2 = C740740T3w.LJ()) == null) || (listZo = c1034880d2M2.LIZ.Zo()) == null) {
                        return;
                    }
                    Iterator<InterfaceC1034910d2P> it3 = listZo.iterator();
                    while (it3.hasNext()) {
                        it3.next().LJ(context, awemeLJIIIIZZ2);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        String strBQ2;
        List<InterfaceC1034910d2P> listZo;
        boolean z;
        List<InterfaceC1034910d2P> listZo2;
        if (!this.LLILLL) {
            return;
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LL;
        ArrayList arrayList = null;
        if (scrollSwitchStateManager != null) {
            strBQ2 = scrollSwitchStateManager.BQ2(i);
        } else {
            strBQ2 = null;
        }
        this.LLILZ = strBQ2;
        if (Intrinsics.LJFF(strBQ2, "page_feed")) {
            double d = f;
            if (d > 0.0d && d < 0.5d) {
                EnumC1034900d2O enumC1034900d2O = this.LLILLJJLI;
                if (enumC1034900d2O == EnumC1034900d2O.LL || enumC1034900d2O == EnumC1034900d2O.LLILZIL) {
                    this.LLILLJJLI = EnumC1034900d2O.LLILLJJLI;
                    C1034880d2M c1034880d2M = this.LLILZIL;
                    if (c1034880d2M != null) {
                        StringBuilder sb = new StringBuilder("onScrollFromFeedToProfilePage: context is null -> ");
                        boolean z2 = true;
                        if (c1034880d2M.LIZ.getContext() == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb.append(z);
                        sb.append(",\naweme is null -> ");
                        if (c1034880d2M.LIZ.LJIIIIZZ() != null || C740740T3w.LJ() != null) {
                            z2 = false;
                        }
                        sb.append(z2);
                        sb.append(",\nlistener is null -> ");
                        List<InterfaceC1034910d2P> listZo3 = c1034880d2M.LIZ.Zo();
                        if (listZo3 != null) {
                            arrayList = new ArrayList(C15438062q.LJIJJ(listZo3, 10));
                            Iterator<InterfaceC1034910d2P> it2 = listZo3.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(it2.next());
                            }
                        }
                        sb.append(arrayList);
                        C1022620cia.LIZ("ProfileAdAssem", sb.toString());
                        Context context = c1034880d2M.LIZ.getContext();
                        if (context != null) {
                            Aweme awemeLJIIIIZZ = c1034880d2M.LIZ.LJIIIIZZ();
                            if ((awemeLJIIIIZZ == null && (awemeLJIIIIZZ = C740740T3w.LJ()) == null) || (listZo2 = c1034880d2M.LIZ.Zo()) == null) {
                                return;
                            }
                            Iterator<InterfaceC1034910d2P> it3 = listZo2.iterator();
                            while (it3.hasNext()) {
                                it3.next().LIZLLL(context, awemeLJIIIIZZ);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (Intrinsics.LJFF(this.LLILZ, "page_feed")) {
            double d2 = f;
            if (d2 > 0.5d && d2 < 1.0d && this.LLILLJJLI == EnumC1034900d2O.LLILLL) {
                this.LLILLJJLI = EnumC1034900d2O.LLILZ;
                C1034880d2M c1034880d2M2 = this.LLILZIL;
                if (c1034880d2M2 != null && c1034880d2M2.LIZ.getContext() != null) {
                    if ((c1034880d2M2.LIZ.LJIIIIZZ() != null || C740740T3w.LJ() != null) && (listZo = c1034880d2M2.LIZ.Zo()) != null) {
                        Iterator<InterfaceC1034910d2P> it4 = listZo.iterator();
                        while (it4.hasNext()) {
                            it4.next().LIZJ();
                        }
                    }
                }
            }
        }
    }
}
