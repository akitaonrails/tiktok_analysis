package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ztk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914220Ztk extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685420txc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914220Ztk(C894460Z7c c894460Z7c, int i) {
        super(5);
        this.$t = i;
        this.l0 = c894460Z7c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914220Ztk(InboxFilterBarWidget inboxFilterBarWidget, int i) {
        super(5);
        this.$t = i;
        this.l0 = inboxFilterBarWidget;
    }

    public static final Object invoke$0(C914220Ztk c914220Ztk, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        InboxWidgetStatus inboxWidgetStatus;
        List list = (List) obj3;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribe filterTabs, filterOptions or selected filter change. new state: ");
        sbLIZ.append(((InboxFilterBarWidget) c914220Ztk.l0).Ho().getState());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!(!((List) obj2).isEmpty()) && !(!list.isEmpty())) {
            inboxWidgetStatus = C1889340zGW.LIZ;
        } else {
            inboxWidgetStatus = C1889360zGY.LIZ;
        }
        ((InboxFilterBarWidget) c914220Ztk.l0).Co(inboxWidgetStatus);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C914220Ztk c914220Ztk, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List<? extends AbstractC885540Yoa<?>> list;
        final boolean z;
        int num;
        C878960Ydy c878960Ydy = (C878960Ydy) obj2;
        List<? extends AbstractC885540Yoa<?>> list2 = (List) obj3;
        List list3 = (List) obj5;
        final C894460Z7c c894460Z7c = (C894460Z7c) c914220Ztk.l0;
        c894460Z7c.getClass();
        if (list2 == null) {
            list = C13BV.INSTANCE;
        } else {
            list = list2;
        }
        ArrayList arrayList = new ArrayList(list);
        if (obj4 == EnumC880850Yh1.MULTI_SELECT && (!list.isEmpty()) && !C885630Yoj.LIZIZ()) {
            z = true;
            ListProtector.add(arrayList, 0, new C0232005u(c894460Z7c.LJJ().DQ2(list)));
        } else {
            z = false;
        }
        if (c878960Ydy != null && C885450YoR.LIZ(c878960Ydy) && C885630Yoj.LIZLLL().prioritySettingState && (list3 == null || (!list3.isEmpty()))) {
            ListProtector.add(arrayList, 0, new C887930YsR(EnumC888150Ysn.REQUESTS));
        }
        final boolean z2 = C13LP.LJJJLL(list) instanceof C881240Yhe;
        final boolean z3 = C13LP.LJJJLZIJ(0, c894460Z7c.LLILZLL.LJII()) instanceof C881240Yhe;
        final boolean z4 = C13LP.LJJJLZIJ(0, c894460Z7c.LLILZLL.LJII()) instanceof C0232005u;
        c894460Z7c.LLILZLL.LJIILL(arrayList, new Runnable() { // from class: X.0YsO
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                RecyclerView.LayoutManager layoutManager;
                C1C7U.LIZ("MessageRequestChunk@e397.updateList$1");
                try {
                    if (((z && !z4) || (z2 && !z3)) && (layoutManager = c894460Z7c.LLIZLLLIL) != null && layoutManager.findViewByPosition(0) != null) {
                        c894460Z7c.LJJ().LJJJJLI();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MessageRequestChunk@e397.updateList$1");
            }
        });
        if (list2 != null) {
            Map<EnumC871430YGn, C886260Ypk> map = C879050Ye7.LJFF;
            EnumC871430YGn enumC871430YGnA1 = c894460Z7c.LJJ().a1();
            int size = list.size();
            Iterator<? extends AbstractC885540Yoa<?>> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                AbstractC884010Ym7 unreadState = it2.next().LIZIZ().getUnreadState();
                if (unreadState != null) {
                    num = unreadState.getNum();
                } else {
                    num = 0;
                }
                i += num;
            }
            map.put(enumC871430YGnA1, new C886260Ypk(size, i));
        }
        return Unit.LIZ;
    }
}
