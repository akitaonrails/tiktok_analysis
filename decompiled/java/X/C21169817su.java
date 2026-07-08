package X;

import X.AbstractC21169117sn;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.17su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21169817su<CONTEXT extends AbstractC21169117sn> {
    public static SoftReference<InterfaceC21170217sy<?>> LJII;
    public final AbstractC21169117sn LIZ;
    public final InterfaceC21168617si LIZIZ;
    public int LIZJ;
    public final List<InterfaceC21170217sy<CONTEXT>> LIZLLL = new ArrayList();
    public final Map<String, Integer> LJ = new HashMap();
    public C19358110oN LJFF = new C19358110oN(false, false);
    public final String LJI;

    public static final void LIZJ(InterfaceC21170217sy<CONTEXT> interfaceC21170217sy) {
        SoftReference<InterfaceC21170217sy<?>> softReference;
        InterfaceC21170217sy<?> interfaceC21170217sy2;
        String strLIZIZ = null;
        if (interfaceC21170217sy != null) {
            softReference = new SoftReference<>(interfaceC21170217sy);
        } else {
            softReference = null;
        }
        LJII = softReference;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Current Ability is ");
        SoftReference<InterfaceC21170217sy<?>> softReference2 = LJII;
        if (softReference2 != null && (interfaceC21170217sy2 = softReference2.get()) != null) {
            strLIZIZ = interfaceC21170217sy2.LIZIZ();
        }
        sbLIZ.append(strLIZIZ);
        C1371690lnb.LIZ("DownloadAbilityChain", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ(AbstractC21169717st abstractC21169717st) {
        ((ArrayList) this.LIZLLL).add(abstractC21169717st);
        ((HashMap) this.LJ).put(abstractC21169717st.LIZIZ(), Integer.valueOf(((ArrayList) this.LIZLLL).size() - 1));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add ability: ");
        sbLIZ.append(abstractC21169717st.LIZIZ());
        C1371690lnb.LIZJ("DownloadAbilityChain", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C21169817su(AbstractC21169117sn abstractC21169117sn, InterfaceC21168617si interfaceC21168617si) {
        this.LIZ = abstractC21169117sn;
        this.LIZIZ = interfaceC21168617si;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC21169117sn.LIZIZ());
        sbLIZ.append(abstractC21169117sn.LJ);
        sbLIZ.append(abstractC21169117sn.LIZIZ);
        this.LJI = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(String str, C21170817t4 c21170817t4, InterfaceC21168617si interfaceC21168617si, DownloadMobProtocol<CONTEXT> downloadMobProtocol, C21169817su<CONTEXT> c21169817su) {
        if (this.LIZJ >= ((ArrayList) this.LIZLLL).size()) {
            if (c21170817t4.LIZ || c21170817t4.LIZIZ) {
                LIZJ(null);
                return;
            }
            return;
        }
        InterfaceC21170217sy interfaceC21170217sy = (InterfaceC21170217sy) ListProtector.get(this.LIZLLL, this.LIZJ);
        LIZJ(interfaceC21170217sy);
        this.LIZJ++;
        interfaceC21170217sy.LIZ(str, c21170817t4, interfaceC21168617si, this.LJFF, downloadMobProtocol, c21169817su);
    }

    public final void LIZLLL(String str, C21170817t4 c21170817t4, InterfaceC21168617si interfaceC21168617si, DownloadMobProtocol<CONTEXT> downloadMobProtocol, C21169817su<CONTEXT> c21169817su) {
        if (this.LIZJ >= ((ArrayList) this.LIZLLL).size()) {
            if (c21170817t4.LIZ || c21170817t4.LIZIZ) {
                LIZJ(null);
                return;
            }
            return;
        }
        Integer num = (Integer) ((HashMap) this.LJ).get("HandleOutPutAbility");
        if (num != null) {
            int iIntValue = num.intValue();
            this.LIZJ = iIntValue;
            LIZJ((InterfaceC21170217sy) ListProtector.get(this.LIZLLL, iIntValue));
            this.LIZJ++;
            ((InterfaceC21170217sy) ListProtector.get(this.LIZLLL, iIntValue)).LIZ(str, c21170817t4, interfaceC21168617si, this.LJFF, downloadMobProtocol, c21169817su);
        }
    }
}
