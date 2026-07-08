package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.0ZIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897490ZIt {
    public static final void LIZIZ(C0ZE7 c0ze7) {
        if (c0ze7 == null) {
            return;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI().LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
    }

    public static final void LIZLLL(C0ZE7 c0ze7) {
        if (c0ze7 == null) {
            return;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE8.LJIIIZ(c0ze7);
    }

    public static final void LIZ(IMContact iMContact, C0ZE7 c0ze7) {
        boolean z;
        if (c0ze7 == null) {
            return;
        }
        if (iMContact instanceof IMUser) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
            IMUser iMUser = (IMUser) iMContact;
            if (!C1572306Dp.LIZ(iMUser.getUid()) && !iMUser.isActive()) {
                z = false;
            } else {
                z = true;
            }
            c0ze7.LJII = Boolean.valueOf(z);
            c0ze7.LIZJ = iMUser.getUid();
            c0ze7.LJIIIZ = null;
            c0ze8LJIIJJI.LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
            return;
        }
        if (!(iMContact instanceof IMConversation)) {
            return;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C0ZE8 c0ze8LJIIJJI2 = C897370ZIh.LIZ().LJIIJJI();
        IMConversation iMConversation = (IMConversation) iMContact;
        c0ze7.LJII = Boolean.valueOf(iMConversation.isActive());
        c0ze7.LIZJ = null;
        c0ze7.LJIIIZ = iMConversation.getConversationId();
        c0ze8LJIIJJI2.LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
    }

    public static final void LIZJ(RecyclerView.ViewHolder viewHolder, IMContact iMContact, C0ZE7 c0ze7) {
        boolean z;
        if (c0ze7 == null || viewHolder.getBindingAdapterPosition() == -1) {
            return;
        }
        if (iMContact instanceof IMUser) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897370ZIh.LIZ().LJIIJJI();
            IMUser iMUser = (IMUser) iMContact;
            if (!C1572306Dp.LIZ(iMUser.getUid()) && !iMUser.isActive()) {
                z = false;
            } else {
                z = true;
            }
            c0ze7.LJII = Boolean.valueOf(z);
            c0ze7.LIZJ = iMUser.getUid();
            c0ze7.LJIIIZ = null;
            c0ze7.LJI = Integer.valueOf(viewHolder.getBindingAdapterPosition());
            C0ZE8.LJIIIZ(c0ze7);
            return;
        }
        if (!(iMContact instanceof IMConversation)) {
            return;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        IMConversation iMConversation = (IMConversation) iMContact;
        c0ze7.LJII = Boolean.valueOf(iMConversation.isActive());
        c0ze7.LIZJ = null;
        c0ze7.LJIIIZ = iMConversation.getConversationId();
        c0ze7.LJI = Integer.valueOf(viewHolder.getBindingAdapterPosition());
        C0ZE8.LJIIIZ(c0ze7);
    }
}
