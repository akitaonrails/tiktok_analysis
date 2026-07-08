package X;

import android.content.Context;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.publicgroup.data.GroupInvitation;
import com.ss.android.ugc.aweme.publicgroup.data.GroupJoinCheckItemResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0i7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230360i7e {
    public static final C1885507a1 LIZ(Context context, GroupInvitationVM groupInvitationVM, GroupInvitation groupInvitation) {
        boolean z;
        boolean z2;
        boolean z3 = groupInvitationVM.getState().LL.LJIIIIZZ;
        List<GroupJoinCheckItemResult> list = groupInvitationVM.getState().LLILLL.LIZIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<GroupJoinCheckItemResult> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().meetCriteria) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
        int i = groupInvitationVM.getState().LLILLJJLI;
        c1229970i71.getClass();
        EnumC1229960i70 enumC1229960i70LIZ = C1229970i71.LIZ(i);
        if (!z3 || (groupInvitation != null && groupInvitation.inviteChannel == EnumC992570bw7.GROUP_INVITE_CHANNEL_INVITE_PEOPLE.getValue() && (groupInvitation.inviterRole == C0Z9N.ADMIN.getValue() || groupInvitation.inviterRole == C0Z9N.OWNER.getValue()))) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = C1230580i80.LIZ[enumC1229960i70LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    int i3 = 2131831406;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return new C1885507a1(context.getString(2131831403), z);
                        }
                        if (z2) {
                            i3 = 2131831403;
                        }
                        return new C1885507a1(context.getString(i3), z);
                    }
                    if (z2) {
                        i3 = 2131831403;
                    }
                    return new C1885507a1(context.getString(i3), false);
                }
                return new C1885507a1(context.getString(2131831402), false);
            }
            return new C1885507a1(context.getString(2131831407), false);
        }
        return new C1885507a1(context.getString(2131832186), true);
    }
}
