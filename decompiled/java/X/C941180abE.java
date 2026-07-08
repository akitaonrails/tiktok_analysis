package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEnableFromCreateChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0abE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941180abE {
    public final Context LIZ;
    public final C2252321DDq LIZIZ;
    public final AnonymousClass0951 LIZJ;
    public final C2252331DDr LIZLLL;
    public final AnonymousClass0950 LJ;
    public final C941190abF LJFF;
    public DataChannel LJI;
    public final C11NJ LJII;
    public final C054G LJIIIIZZ;
    public long LJIIIZ;
    public final long LJIIJ;

    public C941180abE(Context context) {
        this.LIZ = context;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C941230abJ(0));
        this.LIZIZ = c2252321DDqLIZ;
        this.LIZJ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LIZLLL = c2252331DDrLIZIZ;
        this.LJ = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LJFF = new C941190abF();
        this.LJII = new C11NJ();
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJIIIIZZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        this.LJIIJ = 500L;
    }

    public final void LIZIZ(AbstractC937680aVa abstractC937680aVa) {
        boolean z;
        DataChannel dataChannel;
        boolean z2;
        boolean z3;
        boolean zLJIILLIIL;
        boolean z4;
        if (abstractC937680aVa instanceof C937260aUu) {
            C941190abF c941190abF = this.LJFF;
            ((ArrayList) c941190abF.LIZIZ).clear();
            for (String str : c941190abF.LIZJ) {
                C941240abK c941240abK = (C941240abK) ((LinkedHashMap) c941190abF.LIZLLL).get(str);
                if (c941240abK != null) {
                    EnumC936960aUQ enumC936960aUQ = c941240abK.LIZ;
                    int[] iArr = C936980aUS.LIZ;
                    switch (iArr[enumC936960aUQ.ordinal()]) {
                        case 1:
                            c941240abK.LIZLLL = C986270blx.LIZ();
                            break;
                        case 2:
                            c941240abK.LIZLLL = C924220a9s.LIZIZ();
                            break;
                        case 3:
                            c941240abK.LIZLLL = true;
                            break;
                        case 4:
                            if (C942160aco.LIZ() && (dataChannel = c941190abF.LIZ) != null && Intrinsics.LJFF(dataChannel.gg0(MultiLetsDanceEnableFromCreateChannel.class), Boolean.TRUE)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c941240abK.LIZLLL = z;
                            break;
                        case 5:
                            c941240abK.LIZLLL = !C924230a9t.LIZ(2);
                            break;
                        case 6:
                            if (!C986270blx.LIZ() && C936270aTJ.LIZJ(true)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c941240abK.LIZLLL = z2;
                            break;
                        case 7:
                            c941240abK.LIZLLL = C356501Zz.LIZ(c941190abF.LIZ);
                            break;
                        default:
                            c941240abK.LIZLLL = true;
                            break;
                    }
                    EnumC936960aUQ enumC936960aUQ2 = c941240abK.LIZ;
                    LinkMicAbilityManager.LJIIIZ.getClass();
                    InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
                    if (interfaceC941720ac6LIZIZ != null && interfaceC941720ac6LIZIZ.LJIIJ(enumC936960aUQ2.getToolName()) && !C500260Jjc.LJJIL()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c941240abK.LJFF = z3;
                    if (iArr[c941240abK.LIZ.ordinal()] == 3) {
                        c941240abK.LJ = true;
                    } else {
                        c941240abK.LJ = !C500260Jjc.LJJIL();
                    }
                    int i = iArr[c941240abK.LIZ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    c941240abK.LJI = false;
                                } else {
                                    c941240abK.LJI = RedDotExtensionKt.LJIILLIIL(C0UX6.GUEST_COUNT_DOWN_ENTRANCE);
                                }
                            } else {
                                if (C931810aM7.LIZJ(C930540aK4.LIZJ()) && RedDotExtensionKt.LJIILLIIL(C0UX6.MULTI_GUEST_TEXT_BANNER_RED_DOT)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c941240abK.LJI = z4;
                            }
                        } else {
                            c941240abK.LJI = RedDotExtensionKt.LJIILLIIL(C0UX6.GUEST_COUNT_DOWN_ENTRANCE);
                        }
                    } else {
                        if (C01ZC.LIZIZ()) {
                            zLJIILLIIL = RedDotExtensionKt.LJIILLIIL(C0UX6.GUEST_SHOWDOWN_ENTRANCE);
                        } else {
                            zLJIILLIIL = false;
                        }
                        c941240abK.LJI = zLJIILLIIL;
                    }
                    if (c941240abK.LIZLLL) {
                        ((ArrayList) c941190abF.LIZIZ).add(c941240abK);
                    }
                }
            }
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            List<C941240abK> list = c941190abF.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(((C941240abK) it2.next()).LIZ);
            }
            C978360bZC.LJIIJJI(arrayList);
            this.LJII.LIZ(AbstractC19484711Kz.LJIJJLI(c941190abF.LIZIZ).LJJIIJZLJL(new C09JN() { // from class: X.0abH
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Object value;
                    C1C7U.LIZ("PlayToolListViewModel@402.initPlayToolList$1");
                    List list2 = (List) obj;
                    C2252321DDq c2252321DDq = this.LL.LIZIZ;
                    do {
                        value = c2252321DDq.getValue();
                        value.getClass();
                    } while (!c2252321DDq.compareAndSet(value, new C941230abJ((List<C941240abK>) list2)));
                    C1C7U.LIZIZ("PlayToolListViewModel@402.initPlayToolList$1");
                }
            }));
            return;
        }
        if (abstractC937680aVa instanceof C937710aVd) {
            C937710aVd c937710aVd = (C937710aVd) abstractC937680aVa;
            C941240abK c941240abK2 = c937710aVd.LIZ;
            int i2 = c937710aVd.LIZIZ;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - this.LJIIIZ < this.LJIIJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fast click ignored: ");
                sbLIZ.append(c941240abK2.LIZ);
                C20441214yg.LIZIZ("PlayToolListViewModel", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            this.LJIIIZ = jElapsedRealtime;
            C932160aMg.LJFF(c941240abK2.LIZ, "click", EnumC937290aUx.MULTI_TOOL, !c941240abK2.LJ, c941240abK2.LJI ? 1 : 0);
            if (!c941240abK2.LJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("currently this play tool is disabled, type name: ");
                sbLIZ2.append(c941240abK2.LIZ);
                C20441214yg.LJ("PlayToolListViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            if (c941240abK2.LJI) {
                C941190abF c941190abF2 = this.LJFF;
                ((C941240abK) ListProtector.get(c941190abF2.LIZIZ, i2)).LJI = false;
                int i3 = C936980aUS.LIZ[((C941240abK) ListProtector.get(c941190abF2.LIZIZ, i2)).LIZ.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("current play tool haven't register red dot, type: ");
                                sbLIZ3.append(((C941240abK) ListProtector.get(c941190abF2.LIZIZ, i2)).LIZ);
                                C20441214yg.LIZIZ("PlayToolListViewRepository", C2188811AlT.LIZIZ(sbLIZ3));
                            } else {
                                RedDotExtensionKt.LIZ(C0UX6.LETS_DANCE_ENTRANCE);
                            }
                        } else if (C931810aM7.LIZJ(C930540aK4.LIZJ())) {
                            RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_TEXT_BANNER_RED_DOT);
                        }
                    } else {
                        RedDotExtensionKt.LIZ(C0UX6.GUEST_COUNT_DOWN_ENTRANCE);
                    }
                } else if (C01ZC.LIZIZ()) {
                    RedDotExtensionKt.LIZ(C0UX6.GUEST_SHOWDOWN_ENTRANCE);
                }
                this.LJII.LIZ(AbstractC19484711Kz.LJIJJLI(c941190abF2.LIZIZ).LJJIIJZLJL(new C09JN() { // from class: X.0abG
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        Object value;
                        C1C7U.LIZ("PlayToolListViewModel@402.handelClick$1");
                        List list2 = (List) obj;
                        C2252321DDq c2252321DDq = this.LL.LIZIZ;
                        do {
                            value = c2252321DDq.getValue();
                            value.getClass();
                        } while (!c2252321DDq.compareAndSet(value, new C941230abJ((List<C941240abK>) list2)));
                        C1C7U.LIZIZ("PlayToolListViewModel@402.handelClick$1");
                    }
                }));
            }
            C01KE.LIZIZ(this.LJIIIIZZ, new C936790aU9(c941240abK2, this, null));
            return;
        }
        if (abstractC937680aVa instanceof C937660aVY) {
            C937660aVY c937660aVY = (C937660aVY) abstractC937680aVa;
            String str2 = c937660aVY.LIZ;
            boolean z5 = c937660aVY.LIZIZ;
            C941190abF c941190abF3 = this.LJFF;
            c941190abF3.getClass();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("receive ToolsTypeStateUpdateEvent value: ");
            sbLIZ4.append(str2);
            C20441214yg.LIZIZ("PlayToolListViewRepository", C2188811AlT.LIZIZ(sbLIZ4));
            List<C941240abK> list2 = c941190abF3.LIZIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C941240abK c941240abK3 : (ArrayList) list2) {
                if (Intrinsics.LJFF(c941240abK3.LIZ.getToolName(), str2)) {
                    c941240abK3.LJFF = z5;
                }
                arrayList2.add(Unit.LIZ);
            }
            this.LJII.LIZ(AbstractC19484711Kz.LJIJJLI(c941190abF3.LIZIZ).LJJIIJZLJL(new C09JN() { // from class: X.0abI
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Object value;
                    C1C7U.LIZ("PlayToolListViewModel@402.updatePlayToolRunningState$1");
                    List list3 = (List) obj;
                    C2252321DDq c2252321DDq = this.LL.LIZIZ;
                    do {
                        value = c2252321DDq.getValue();
                        value.getClass();
                    } while (!c2252321DDq.compareAndSet(value, new C941230abJ((List<C941240abK>) list3)));
                    C1C7U.LIZIZ("PlayToolListViewModel@402.updatePlayToolRunningState$1");
                }
            }));
            return;
        }
        throw new C1954807lC();
    }

    public static void LIZ(String str, Function0 function0) {
        if (C500260Jjc.LJJIL()) {
            function0.invoke();
            return;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        Boolean boolValueOf = null;
        if (interfaceC941720ac6LIZIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC941720ac6LIZIZ.LIZJ(str, new C941250abL(function0), null));
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive ShowPlaybookPlayToolPage ");
            sbLIZ.append(str);
            sbLIZ.append(" return as can't start");
            C20441214yg.LIZIZ("PlaybookPolymerizationHeaderTopViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
