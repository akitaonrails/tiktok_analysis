package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880440YgM implements InterfaceC882190YjB {
    public static final /* synthetic */ int LIZLLL = 0;
    public final String LIZ = "MessageRequestChatLabelDecorator";
    public final String LIZIZ = "chat_label_decorator";
    public final List<AbstractC886530YqB<?, ?>> LIZJ = Collections.singletonList(C886520YqA.LIZ);

    @Override // X.InterfaceC882190YjB
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC882190YjB
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC882190YjB
    public final List<AbstractC886530YqB<?, ?>> LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC882190YjB
    public final InterfaceC1517005wm LIZLLL() {
        return C1491005sa.LIZ;
    }

    @Override // X.InterfaceC882190YjB
    public final String getTag() {
        return this.LIZ;
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
        IMUser iMUser;
        Object obj2;
        boolean zBooleanValue;
        Boolean bool;
        if (!(c879540Yeu.LIZ instanceof C1709506mj)) {
            return null;
        }
        T t = c879540Yeu.LIZJ;
        if (t instanceof C0Y8T) {
            c0y8t = (C0Y8T) t;
        } else {
            c0y8t = null;
        }
        C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1718806oE.LIZ);
        if (c1490405sU != null) {
            obj = c1490405sU.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof IMUser) {
            iMUser = (IMUser) obj;
        } else {
            iMUser = null;
        }
        C1490405sU<?> c1490405sU2 = c879540Yeu.LIZLLL.get(C880450YgN.LIZ);
        if (c1490405sU2 != null) {
            obj2 = c1490405sU2.LIZIZ;
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C886520YqA c886520YqA = C886520YqA.LIZ;
        if (!Intrinsics.LJFF(abstractC886530YqB, c886520YqA)) {
            return null;
        }
        List listLIZ = C880400YgI.LIZ(c0y8t, iMUser, zBooleanValue);
        if (!(!listLIZ.isEmpty())) {
            return null;
        }
        return new C882270YjJ<>(c886520YqA, listLIZ);
    }
}
