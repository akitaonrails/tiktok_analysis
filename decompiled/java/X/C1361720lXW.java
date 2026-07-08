package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lXW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361720lXW {
    public final InterfaceC665370Q7z LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1200));
    public final Map<Class<?>, InterfaceC1361740lXY<?>> LIZJ = new LinkedHashMap();

    public C1361720lXW(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = interfaceC665370Q7z;
    }

    public final IContactListProtocol<? extends InterfaceC1361730lXX> LIZJ(IMContact iMContact) {
        Object next;
        Iterator it2 = ((List) this.LIZIZ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                IContactListProtocol iContactListProtocol = (IContactListProtocol) next;
                if (iContactListProtocol.enable() && iContactListProtocol.Hl1(iMContact)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (IContactListProtocol) next;
    }

    public final InterfaceC1361730lXX LIZIZ(int i, IMContact iMContact) {
        IContactListProtocol<? extends InterfaceC1361730lXX> iContactListProtocolLIZJ = LIZJ(iMContact);
        if (iContactListProtocolLIZJ != null) {
            return iContactListProtocolLIZJ.xS(i, iMContact);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No protocol found for contact: ");
        sbLIZ.append(iMContact.getClass().getSimpleName());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final InterfaceC1361730lXX LIZ(InterfaceC1361730lXX interfaceC1361730lXX, C1362170lYF c1362170lYF, IMContact iMContact) {
        IContactListProtocol<? extends InterfaceC1361730lXX> iContactListProtocolLIZJ = null;
        if (iMContact != null) {
            iContactListProtocolLIZJ = LIZJ(iMContact);
        } else {
            IMContact iMContactLJLJJI = interfaceC1361730lXX.LJLJJI();
            if (iMContactLJLJJI != null) {
                iContactListProtocolLIZJ = LIZJ(iMContactLJLJJI);
            }
        }
        if ((iContactListProtocolLIZJ instanceof IContactListProtocol) && iContactListProtocolLIZJ != null) {
            return iContactListProtocolLIZJ.ag0(interfaceC1361730lXX, c1362170lYF);
        }
        return interfaceC1361730lXX;
    }
}
