package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Event;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.multiconversation.TakoSubConversationItemAssem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class ViewOnLongClickListenerC20306714cz implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC20306714cz viewOnLongClickListenerC20306714cz, View view) {
        TakoSubConversationItemAssem takoSubConversationItemAssem = (TakoSubConversationItemAssem) viewOnLongClickListenerC20306714cz.l0;
        C1863370yad c1863370yad = takoSubConversationItemAssem.LLJJLIIIJLLLLLLLZ;
        if (c1863370yad != null) {
            View view2 = (View) viewOnLongClickListenerC20306714cz.l1;
            InterfaceC1631620sYq<Context, View, ConversationInfo, Unit> interfaceC1631620sYq = c1863370yad.LLIZ;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(view2.getContext(), takoSubConversationItemAssem.LLJL, c1863370yad.LL);
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC20306714cz viewOnLongClickListenerC20306714cz, View view) {
        Object obj;
        C14NJ next;
        List<Event> list = (List) viewOnLongClickListenerC20306714cz.l0;
        C14NX c14nx = (C14NX) viewOnLongClickListenerC20306714cz.l1;
        for (Event event : list) {
            Iterator<C14NJ> it2 = c14nx.LIZIZ().LLILLL.LIZJ.iterator();
            while (true) {
                obj = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getName(), event.eventName)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C14NJ c14nj = next;
            if (c14nj != null) {
                String str = event.condition;
                if (str != null) {
                    if (str.length() > 0) {
                        Object objLJIIZILJ = c14nx.LJIIZILJ(event.condition);
                        if (objLJIIZILJ instanceof Boolean) {
                            obj = objLJIIZILJ;
                        }
                        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                        }
                    }
                }
                c14nj.LIZ(event.params, c14nx, c14nx.LIZJ(), c14nx.LJIIIIZZ());
            }
        }
        return true;
    }

    public ViewOnLongClickListenerC20306714cz(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
