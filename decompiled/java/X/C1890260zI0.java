package X;

import Y.ARunnableS124S0100000_24;
import Y.ARunnableS97S0200000_28;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.tablet.TabletInboxViewModel;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxPageWidgetContainerAbility;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0zI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1890260zI0 extends C2217421BqW implements Function1<AbstractC1889640zH0, Unit> {
    public C1890260zI0(InboxFragmentV2 inboxFragmentV2) {
        super(1, inboxFragmentV2, InboxFragmentV2.class, "refreshPageState", "refreshPageState(Lcom/ss/android/ugc/aweme/inbox/v2/InboxFragmentV2ViewModel$PageStatus;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1889640zH0 abstractC1889640zH0) {
        boolean zVQ2;
        int size;
        List<InterfaceC1891350zJl> listHu2;
        AbstractC1889640zH0 abstractC1889640zH02 = abstractC1889640zH0;
        InboxFragmentV2 inboxFragmentV2 = (InboxFragmentV2) this.receiver;
        if (inboxFragmentV2.RR() != null) {
            if (abstractC1889640zH02 instanceof C1889690zH5) {
                inboxFragmentV2.RR().LJ();
                C786410Ut5.LLLZLZ(inboxFragmentV2.RR(), 0);
            } else if (abstractC1889640zH02 instanceof C1889650zH1) {
                C786410Ut5.LLLZLZ(inboxFragmentV2.RR(), 8);
                C481090Itn c481090ItnPR = inboxFragmentV2.PR();
                if (c481090ItnPR != null) {
                    HandlerHook.viewPost(c481090ItnPR, new ARunnableS124S0100000_24(inboxFragmentV2, 161));
                }
                if (C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI()) {
                    C1890290zI3 c1890290zI3DS = inboxFragmentV2.dS();
                    List<? extends InterfaceC1891350zJl> list = ((C1889650zH1) abstractC1889640zH02).LIZ;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                        TabletInboxViewModel tabletInboxViewModel = inboxFragmentV2.LLJZ;
                        if (tabletInboxViewModel != null) {
                            zVQ2 = tabletInboxViewModel.vQ2(interfaceC1891350zJl);
                        } else {
                            zVQ2 = false;
                        }
                        arrayList.add(new C1890270zI1(interfaceC1891350zJl, zVQ2));
                    }
                    c1890290zI3DS.getClass();
                    c1890290zI3DS.LLLII(arrayList, new ARunnableS97S0200000_28(c1890290zI3DS, arrayList, 30));
                    c1890290zI3DS.LLILLL = false;
                } else {
                    List<? extends InterfaceC1891350zJl> list2 = ((C1889650zH1) abstractC1889640zH02).LIZ;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<? extends InterfaceC1891350zJl> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new C1890270zI1(it2.next(), false));
                    }
                    IMChatListApi.LJJIII.getClass();
                    C0Z31 c0z31LJIIZILJ = C890330YwJ.LIZ().LJIIZILJ();
                    if (c0z31LJIIZILJ != null) {
                        c0z31LJIIZILJ.LIZ(12);
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((C1890270zI1) it3.next()).LIZ);
                        }
                        c0z31LJIIZILJ.LJIILL(arrayList3);
                    }
                    C1890290zI3 c1890290zI3DS2 = inboxFragmentV2.dS();
                    c1890290zI3DS2.getClass();
                    c1890290zI3DS2.LLLII(arrayList2, new ARunnableS97S0200000_28(c1890290zI3DS2, arrayList2, 30));
                    c1890290zI3DS2.LLILLL = false;
                }
                if (C1890720zIk.LIZ().enable) {
                    C1890620zIa c1890620zIa = (C1890620zIa) inboxFragmentV2.LLLJL.getValue();
                    List<? extends InterfaceC1891350zJl> list3 = ((C1889650zH1) abstractC1889640zH02).LIZ;
                    FixedLinearlayoutManager fixedLinearlayoutManager = inboxFragmentV2.LLJLLIL;
                    if (fixedLinearlayoutManager == null) {
                        fixedLinearlayoutManager = null;
                    }
                    Integer numValueOf = Integer.valueOf(fixedLinearlayoutManager.findFirstCompletelyVisibleItemPosition());
                    FixedLinearlayoutManager fixedLinearlayoutManager2 = inboxFragmentV2.LLJLLIL;
                    if (fixedLinearlayoutManager2 == null) {
                        fixedLinearlayoutManager2 = null;
                    }
                    c1890620zIa.LIZLLL(list3, new Pair<>(numValueOf, Integer.valueOf(fixedLinearlayoutManager2.findLastCompletelyVisibleItemPosition())));
                }
                C1508630pMT.LIZ.getClass();
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adapter refresh: -- ");
                sbLIZ.append(SystemClock.uptimeMillis() - C1508630pMT.LIZIZ);
                C1720106oR.LJI("InboxArch_PrefMonitor", C2188811AlT.LIZIZ(sbLIZ));
                AnonymousClass0956 anonymousClass0956 = inboxFragmentV2.LLJLIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C1DFH c1dfh = C0PEM.LIZ;
                inboxFragmentV2.LLJLIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C13013057j(inboxFragmentV2, null), 3);
            } else if (abstractC1889640zH02 instanceof C1889670zH3) {
                C786410Ut5.LLLZLZ(inboxFragmentV2.RR(), 0);
                C1749280vcc c1749280vccRR = inboxFragmentV2.RR();
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_large_wifi_slash;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZIZ = c419910GdJ;
                c1722300uv6.LJI = inboxFragmentV2.getString(2131825222);
                c1722300uv6.LJIIIIZZ = inboxFragmentV2.getString(2131825221);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                c1722300uv6.LIZLLL = iLIZIZ;
                c1722300uv6.LJ = iLIZIZ2;
                c1722300uv6.LJIIIZ = new AwS600S0100000_21(inboxFragmentV2, 376);
                c1749280vccRR.setStatus(c1722300uv6);
                C1890290zI3 c1890290zI3DS3 = inboxFragmentV2.dS();
                C13BV c13bv = C13BV.INSTANCE;
                c1890290zI3DS3.getClass();
                c1890290zI3DS3.LLLII(c13bv, new ARunnableS97S0200000_28(c1890290zI3DS3, c13bv, 30));
                c1890290zI3DS3.LLILLL = false;
            }
            if (inboxFragmentV2.LLLILZLLLI) {
                InboxAbilityCenter$IInboxPageWidgetContainerAbility inboxAbilityCenter$IInboxPageWidgetContainerAbilityHS = inboxFragmentV2.hS();
                if (inboxAbilityCenter$IInboxPageWidgetContainerAbilityHS != null && (listHu2 = inboxAbilityCenter$IInboxPageWidgetContainerAbilityHS.hu2()) != null) {
                    size = listHu2.size();
                } else {
                    size = 0;
                }
                inboxFragmentV2.sS(size, false);
            }
        }
        return Unit.LIZ;
    }
}
