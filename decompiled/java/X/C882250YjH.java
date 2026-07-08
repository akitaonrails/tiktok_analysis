package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882250YjH implements InterfaceC882190YjB {
    public final C1491005sa LIZ = C1491005sa.LIZ;
    public final String LIZIZ = "ChatListThoughtBubbleDecorator";
    public final String LIZJ = "thought_bubble_decorator";
    public final boolean LIZLLL = true;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(615));

    @Override // X.InterfaceC882190YjB
    public final List<AbstractC886530YqB<?, ?>> LIZJ() {
        return (List) this.LJ.getValue();
    }

    @Override // X.InterfaceC882190YjB
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC882190YjB
    public final InterfaceC1517005wm LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC882190YjB
    public final boolean LJFF() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC882190YjB
    public final String getTag() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC882190YjB
    public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo, java.lang.Object] */
    @Override // X.InterfaceC882190YjB
    public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
        Object obj;
        IMUser iMUser;
        Object obj2;
        ?? r5;
        Long l;
        if (!C343820Dds.LIZ()) {
            return null;
        }
        C887080Yr4 c887080Yr4 = C887080Yr4.LIZ;
        if (!Intrinsics.LJFF(abstractC886530YqB, c887080Yr4) || !(c879540Yeu.LIZ instanceof C882110Yj3)) {
            return null;
        }
        C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
        if (c1490405sU != null) {
            obj = c1490405sU.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof IMUser) || (iMUser = (IMUser) obj) == null || iMUser.getFollowStatus() != 2) {
            return null;
        }
        C1490405sU<?> c1490405sU2 = c879540Yeu.LIZLLL.get(C1491405se.LIZ);
        if (c1490405sU2 != null) {
            obj2 = c1490405sU2.LIZIZ;
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof ThoughtInfo) || (r5 = (ThoughtInfo) obj2) == 0 || (l = r5.createTimeMs) == null || l.longValue() <= 0) {
            return null;
        }
        if (c882270YjJ == null) {
            return new C882270YjJ<>(c887080Yr4, r5);
        }
        c882270YjJ.LIZIZ = r5;
        return c882270YjJ;
    }
}
