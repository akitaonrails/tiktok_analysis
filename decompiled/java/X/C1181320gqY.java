package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.Node;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0gqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181320gqY extends AbstractC1181640gr4 implements InterfaceC1181380gqe, InterfaceC1174010gel {
    public final Set<String> LLILLJJLI = new LinkedHashSet();
    public final Set<String> LLILLL = new LinkedHashSet();

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJFF(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJI(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJII(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJIIJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJJ(InterfaceC1173990gej<?> interfaceC1173990gej, View view) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    public final void LJJIFFI(List<C1181330gqZ> list) {
        InterfaceC1181010gq3 interfaceC1181010gq3;
        Fragment fragmentS8;
        Context context;
        for (C1181330gqZ c1181330gqZ : list) {
            int iIntValue = 0;
            if (C123100dR.LIZ(c1181330gqZ.LIZ) || c1181330gqZ.LIZIZ != null) {
                if (C08A4.LIZ(c1181330gqZ.LIZJ)) {
                    Fragment fragmentS82 = null;
                    if (1 != 0 && (interfaceC1181010gq3 = this.LL) != null && (fragmentS8 = interfaceC1181010gq3.S8()) != null && (context = fragmentS8.getContext()) != null) {
                        Integer num = c1181330gqZ.LIZIZ;
                        String str = c1181330gqZ.LIZ;
                        Integer num2 = c1181330gqZ.LIZJ;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        }
                        int i = c1181330gqZ.LIZLLL;
                        InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
                        if (interfaceC1181010gq32 != null) {
                            fragmentS82 = interfaceC1181010gq32.S8();
                        }
                        C1181430gqj.LIZJ(context, num, str, iIntValue, i, null, fragmentS82, 32);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
        List listLIZJ;
        if (str == null) {
            Iterator<T> it2 = C1180170goh.LIZIZ.values().iterator();
            while (it2.hasNext()) {
                InterfaceC1181340gqa interfaceC1181340gqaLJII = ((InterfaceC1180970gpz) it2.next()).LJII();
                if (interfaceC1181340gqaLJII != null && (listLIZJ = interfaceC1181340gqaLJII.LIZJ(this.LL)) != null) {
                    LJJIFFI(listLIZJ);
                }
            }
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
        SlashPage slashPage;
        Map<String, Node> nodes;
        Collection<Node> collectionValues;
        InterfaceC1181340gqa interfaceC1181340gqaLJII;
        if (slashApiResponse != null && (slashPage = slashApiResponse.page) != null && (nodes = slashPage.getNodes()) != null && (collectionValues = nodes.values()) != null) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                String str2 = ((Node) it2.next()).subType;
                if (str2 != null && !this.LLILLJJLI.contains(str2)) {
                    this.LLILLJJLI.add(str2);
                    InterfaceC1180970gpz interfaceC1180970gpz = C1180170goh.LIZIZ.get(C1180100goa.LIZ(str2));
                    if (interfaceC1180970gpz != null && (interfaceC1181340gqaLJII = interfaceC1180970gpz.LJII()) != null) {
                        interfaceC1181340gqaLJII.LIZIZ();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
        List<C1180920gpu> listLJIILIIL;
        InterfaceC1181340gqa interfaceC1181340gqaLJII;
        List listLIZ;
        Map<String, C1181200gqM> map;
        C1181200gqM c1181200gqM;
        if (c1180620gpQ != null && (listLJIILIIL = c1180620gpQ.LJIILIIL()) != null) {
            ArrayList<C1180920gpu> arrayList = new ArrayList();
            for (C1180920gpu c1180920gpu : listLJIILIIL) {
                C1180920gpu c1180920gpu2 = c1180920gpu;
                C1181190gqL c1181190gqL = c1180620gpQ.LL;
                if (c1181190gqL != null && (map = c1181190gqL.LIZ) != null && (c1181200gqM = map.get(c1180920gpu2.LIZ)) != null && c1181200gqM.LIZIZ()) {
                    arrayList.add(c1180920gpu);
                }
            }
            for (C1180920gpu c1180920gpu3 : arrayList) {
                if (!this.LLILLL.contains(c1180920gpu3.LIZIZ.LIZ) && c1180920gpu3.LIZLLL != null) {
                    this.LLILLL.add(c1180920gpu3.LIZIZ.LIZ);
                    InterfaceC1180970gpz interfaceC1180970gpz = C1180170goh.LIZIZ.get(C1180100goa.LIZ(c1180920gpu3.LIZIZ.LIZ));
                    if (interfaceC1180970gpz != null && (interfaceC1181340gqaLJII = interfaceC1180970gpz.LJII()) != null && (listLIZ = interfaceC1181340gqaLJII.LIZ(c1180920gpu3.LIZLLL)) != null) {
                        LJJIFFI(listLIZ);
                    }
                }
            }
        }
    }
}
