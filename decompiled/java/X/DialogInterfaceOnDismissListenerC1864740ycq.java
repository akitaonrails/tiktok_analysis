package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ycq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class DialogInterfaceOnDismissListenerC1864740ycq implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1864740ycq dialogInterfaceOnDismissListenerC1864740ycq, DialogInterface dialogInterface) {
        ((TakoAnswerBaseAssem) dialogInterfaceOnDismissListenerC1864740ycq.l0).wq().setState(new AwS36S0010000_24(false, 38));
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1864740ycq.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1864740ycq dialogInterfaceOnDismissListenerC1864740ycq, DialogInterface dialogInterface) {
        final boolean z;
        ExploreViewPagerComponent exploreViewPagerComponent = (ExploreViewPagerComponent) dialogInterfaceOnDismissListenerC1864740ycq.l0;
        List list = (List) dialogInterfaceOnDismissListenerC1864740ycq.l1;
        List<ExploreCustomTopicResponse> list2 = exploreViewPagerComponent.LLJJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            arrayList.add(((ExploreCustomTopicResponse) it2.next()).topicId);
        }
        final boolean z2 = false;
        if (list.size() != arrayList.size()) {
            z = true;
        } else {
            z = false;
        }
        ExploreViewPagerComponent exploreViewPagerComponent2 = (ExploreViewPagerComponent) dialogInterfaceOnDismissListenerC1864740ycq.l0;
        List list3 = (List) dialogInterfaceOnDismissListenerC1864740ycq.l1;
        List<ExploreCustomTopicResponse> list4 = exploreViewPagerComponent2.LLJJI;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list4, 10));
        Iterator it3 = ((ArrayList) list4).iterator();
        while (it3.hasNext()) {
            arrayList2.add(((ExploreCustomTopicResponse) it3.next()).topicId);
        }
        Set setLJJL = C13LP.LJJL(list3, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list3) {
            if (setLJJL.contains(obj)) {
                arrayList3.add(obj);
            }
        }
        final boolean z3 = !Intrinsics.LJFF(arrayList3, arrayList2);
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (abstractC343940De4LJIIJJI instanceof C1841980y28) {
            C15TA c15ta = C15TA.LIZ;
            final String str2 = ((C1841980y28) abstractC343940De4LJIIJJI).LIZ;
            c15ta.getClass();
            C15TA.LJIILL(new Runnable() { // from class: X.01Sj
                public final void LIZ() {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                    c2344009Gk.LIZJ(z3 ? 1 : 0, "if_change_order");
                    c2344009Gk.LIZJ(z ? 1 : 0, "if_unpin_topic");
                    c2344009Gk.LJIIIIZZ("action_type", str2);
                    C20684815ws.LJIILLIIL("ttexp_topic_manage_page_exit", c2344009Gk.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ExploreMobUtils@18af.logManagePageExit$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExploreMobUtils@18af.logManagePageExit$1");
                }
            });
            return;
        }
        C15TA.LIZ.getClass();
        final String str3 = "other";
        C15TA.LJIILL(new Runnable() { // from class: X.01Sj
            public final void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                c2344009Gk.LIZJ(z2 ? 1 : 0, "if_change_order");
                c2344009Gk.LIZJ(z ? 1 : 0, "if_unpin_topic");
                c2344009Gk.LJIIIIZZ("action_type", str3);
                C20684815ws.LJIILLIIL("ttexp_topic_manage_page_exit", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExploreMobUtils@18af.logManagePageExit$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExploreMobUtils@18af.logManagePageExit$1");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogInterfaceOnDismissListenerC1864740ycq(Object obj, ExploreViewPagerComponent exploreViewPagerComponent, List<Long> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = exploreViewPagerComponent;
    }
}
