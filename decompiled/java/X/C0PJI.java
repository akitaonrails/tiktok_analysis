package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0PJI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C0PJI extends C2217421BqW implements InterfaceC1631620sYq<List<Aweme>, Integer, List<Aweme>, Boolean> {
    public C0PJI(Object obj) {
        super(3, obj, C0PJH.class, "onItemInserted", "onItemInserted(Ljava/util/List;ILjava/util/List;)Z", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Boolean invoke(List<Aweme> list, Integer num, List<Aweme> list2) {
        InterfaceC1255940imu interfaceC1255940imu;
        IBaseListFragmentPanel iBaseListFragmentPanel;
        List<Aweme> list3 = list;
        int iIntValue = num.intValue();
        C0PJH c0pjh = (C0PJH) this.receiver;
        c0pjh.getClass();
        boolean z = true;
        C0PN1 c0pn1 = new C0PN1(iIntValue, list3.size(), true, list3);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list2);
        arrayList.addAll(C13LP.LJLJJLL(list3));
        boolean z2 = false;
        if (iIntValue >= 0 && iIntValue <= arrayList.size() && !list3.isEmpty()) {
            C0PN0 c0pn0 = new C0PN0(c0pn1, arrayList);
            C0PIF c0pif = C0PIF.LIZ;
            List<Aweme> awemeList = c0pjh.getAwemeList();
            String str = c0pjh.LLJJJ.LIZIZ;
            int i = c0pjh.LLLFFI;
            boolean zLJFF = c0pjh.LLJJJJ.LJFF();
            c0pif.getClass();
            C0PIF.LJI(i, str, awemeList, zLJFF);
            List<InterfaceC1526205yG> list4 = c0pjh.mNotifyListeners;
            if (list4 != null && list4.size() != 0) {
                Iterator<InterfaceC1526205yG> it2 = c0pjh.mNotifyListeners.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC1526205yG next = it2.next();
                    if (next instanceof C643590PMf) {
                        C642250PHb c642250PHb = c0pjh.LLJLILLLLZIIL;
                        String strZc = null;
                        if (c642250PHb != null) {
                            K k = ((C1260870iur) next).LLILLJJLI;
                            if ((k instanceof IBaseListFragmentPanel) && (iBaseListFragmentPanel = (IBaseListFragmentPanel) k) != null) {
                                strZc = iBaseListFragmentPanel.Zc();
                            }
                            c642250PHb.LJIIJ = strZc;
                        }
                        if (!(next instanceof InterfaceC1255940imu) || (interfaceC1255940imu = (InterfaceC1255940imu) next) == null || !interfaceC1255940imu.B1(c0pn0)) {
                            z = false;
                        }
                        z2 = z;
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
