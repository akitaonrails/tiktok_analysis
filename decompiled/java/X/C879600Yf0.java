package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879600Yf0 implements InterfaceC882190YjB {
    public final C1491005sa LIZ = C1491005sa.LIZ;
    public final String LIZIZ = "MessageRequestChatStatusDecorator";
    public final String LIZJ = "chat_status_decorator";
    public final List<AbstractC886530YqB<?, ?>> LIZLLL = Collections.singletonList(C886550YqD.LIZ);

    @Override // X.InterfaceC882190YjB
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC882190YjB
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC882190YjB
    public final List<AbstractC886530YqB<?, ?>> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC882190YjB
    public final InterfaceC1517005wm LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC882190YjB
    public final String getTag() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC882190YjB
    public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC882190YjB
    public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
        C0Y8T c0y8t;
        Object obj;
        boolean z;
        IMUser iMUser = null;
        if (!(c879540Yeu.LIZ instanceof C1709506mj)) {
            return null;
        }
        C886550YqD c886550YqD = C886550YqD.LIZ;
        if (!Intrinsics.LJFF(abstractC886530YqB, c886550YqD)) {
            return null;
        }
        T t = c879540Yeu.LIZJ;
        if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
            return null;
        }
        C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1718806oE.LIZ);
        if (c1490405sU != null) {
            obj = c1490405sU.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof IMUser) {
            iMUser = (IMUser) obj;
        }
        boolean z2 = true;
        if (iMUser != null && iMUser.isBlock()) {
            z = true;
        } else {
            z = false;
        }
        boolean zIsMute = c0y8t.isMute();
        if (C0YU8.LIZ(c0y8t) <= 0) {
            z2 = false;
        }
        return new C882270YjJ<>(c886550YqD, new C886440Yq2(z, zIsMute, z2));
    }
}
