package X;

import Y.ARunnableS22S0210000_21;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ljc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369220ljc implements InterfaceC1368670lij, InterfaceC328360Cu2<IMContact>, InterfaceC1368140lhs {
    public final C1368320liA LL;
    public final int LLILLJJLI;
    public int LLIZLLLIL;
    public int LLJI;
    public double LLJIJIL;
    public double LLJILJIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 67));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 66));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 68));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(71));
    public final C11NJ LLIZ = new C11NJ();
    public List<? extends IMContact> LLJ = C13BV.INSTANCE;
    public final BPEAHandler LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
    public final MutableLiveData<String> LLJILLL = new MutableLiveData<>();
    public final MutableLiveData<C1368560liY> LLJJ = new MutableLiveData<>();
    public final MutableLiveData<List<IMContact>> LLJJI = new MutableLiveData<>();
    public final MutableLiveData<List<IMContact>> LLJJIII = new MutableLiveData<>();
    public final MutableLiveData<EnumC1368950ljB> LLJJIJI = new MutableLiveData<>(EnumC1368950ljB.INIT);

    @Override // X.InterfaceC1368670lij, X.InterfaceC20688615xU
    public final void LJL() {
    }

    @Override // X.InterfaceC328360Cu2
    public final void tg2(List<IMContact> list, boolean z) {
    }

    @Override // X.InterfaceC328360Cu2
    public final void ug(Throwable th) {
    }

    public final InterfaceC1369300ljk LJI() {
        return (InterfaceC1369300ljk) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1368670lij, X.InterfaceC20688615xU
    public final void onCleared() {
        this.LLIZ.dispose();
        LJI().LJ();
        LJI().LIZJ();
    }

    @Override // X.InterfaceC1368670lij, X.InterfaceC20688615xU
    public final void refresh() {
        this.LLJJIJI.setValue(EnumC1368950ljB.LOADING);
        List<IMContact> listData = LJI().data();
        if (!(!listData.isEmpty())) {
            LJI().LIZLLL();
            return;
        }
        Iterator<IMContact> it2 = listData.iterator();
        while (it2.hasNext()) {
            it2.next().getAllMatchMetaCopy().clear();
        }
        r61(listData, LJI().LJIIJJI());
    }

    @Override // X.InterfaceC20688615xU
    public final MutableLiveData LIZ() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC20688615xU
    public final MutableLiveData LIZJ() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC20688615xU
    public final MutableLiveData LIZLLL() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1368670lij
    public final MutableLiveData<List<IMContact>> LJLI() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1368670lij
    public final MutableLiveData<String> LJLIIIL() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1368670lij
    public final MutableLiveData<List<IMContact>> LJLIL() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1368670lij
    public final MutableLiveData<C1368560liY> LJLILLLLZI() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1368670lij
    public final /* bridge */ /* synthetic */ MutableLiveData getState() {
        return this.LLJJIJI;
    }

    public static int LJIIIZ(IMContact iMContact) {
        if (!(iMContact instanceof MAFIMUser)) {
            if (iMContact instanceof IMUser) {
                IMUser iMUser = (IMUser) iMContact;
                if (iMUser.getFollowStatus() != 2 && !iMUser.isMAF()) {
                    return 2;
                }
            } else {
                if (iMContact instanceof IMConversation) {
                    return 1;
                }
                return 3;
            }
        }
        return 0;
    }

    public static String LJIIJ(IMContact iMContact) {
        String strLIZ;
        if (iMContact instanceof IMUser) {
            strLIZ = iMContact.getUid();
        } else if (iMContact instanceof IMConversation) {
            strLIZ = ((IMConversation) iMContact).getConversationId();
        } else {
            strLIZ = C1055660dZs.LIZ(iMContact);
        }
        if (strLIZ != null && strLIZ.length() > 0) {
            return strLIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iMContact.getClass().getName());
        sbLIZ.append(':');
        String displayName = iMContact.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        sbLIZ.append(displayName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LJFF(IMContact iMContact) {
        String uid;
        ISocialAffinityService iSocialAffinityService;
        Map<String, SocialAffinityItem> mapLIZIZ;
        SocialAffinityItem socialAffinityItem;
        if ((iMContact instanceof IMUser) && iMContact != null && (uid = iMContact.getUid()) != null && (iSocialAffinityService = (ISocialAffinityService) this.LLILZLL.getValue()) != null && (mapLIZIZ = iSocialAffinityService.LIZIZ("share_more")) != null && (socialAffinityItem = mapLIZIZ.get(uid)) != null) {
            return (int) socialAffinityItem.score;
        }
        return 0;
    }

    public final boolean LJII(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            if (this.LL.LJJIFFI && Intrinsics.LJFF(iMContact.getUid(), C461720I8s.LIZIZ())) {
                return false;
            }
            IMUser iMUser = (IMUser) iMContact;
            if (!((C1381900m44) this.LLILZIL.getValue()).LIZ(iMUser) || iMUser.isBlocked()) {
                return false;
            }
            List<Integer> canMessageFollowStatusList = iMUser.getCanMessageFollowStatusList();
            if (canMessageFollowStatusList != null && !canMessageFollowStatusList.isEmpty() && !canMessageFollowStatusList.contains(Integer.valueOf(iMUser.getFollowStatus()))) {
                return false;
            }
        }
        return true;
    }

    public final void LJIIIIZZ(List list) {
        ARunnableS22S0210000_21 aRunnableS22S0210000_21 = new ARunnableS22S0210000_21(list, this, 0);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            aRunnableS22S0210000_21.run();
        } else {
            C786410Ut5.LJJZZIII(this.LLJILJILJ, aRunnableS22S0210000_21);
        }
    }

    @Override // X.InterfaceC1368670lij, X.InterfaceC20688615xU
    public final void LJJZZIII(String str) {
        this.LLJILLL.setValue(str);
        if (str.length() == 0) {
            MutableLiveData<List<IMContact>> mutableLiveData = this.LLJJI;
            C13BV c13bv = C13BV.INSTANCE;
            mutableLiveData.setValue(c13bv);
            if (C296750Bk9.LIZ()) {
                this.LLJJ.setValue(new C1368560liY(c13bv, 0, Boolean.TRUE, Double.valueOf(0.0d), Double.valueOf(0.0d)));
                return;
            }
            return;
        }
        LJI().LJJZZIII(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e8  */
    @Override // X.InterfaceC1368670lij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIL(java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369220ljc.LJLIIL(java.lang.String):void");
    }

    @Override // X.InterfaceC328360Cu2
    public final void WD2(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadError: ");
        sbLIZ.append(th.getMessage());
        C1720006oQ.LJ("ShareMoreContactsRepository", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJI.setValue(EnumC1368950ljB.ERROR);
    }

    @Override // X.InterfaceC1368140lhs
    public final void tm2(Throwable th) {
        this.LLJJIII.postValue(new ArrayList());
        C1720006oQ.LIZJ("ShareMoreContactsRepository", "onSearchError", th);
    }

    public C1369220ljc(C1368320liA c1368320liA, int i) {
        this.LL = c1368320liA;
        this.LLILLJJLI = i;
    }

    public static List LJ(List list, Function1 function1) {
        IMContact iMContact = (IMContact) C13LP.LJJJLL(list);
        if (iMContact == null) {
            return list;
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUserClone = ((IMUser) iMContact).clone();
            function1.invoke(iMUserClone);
            return C13LP.LJLIL(C13LP.LJJJJIZL(list, 1), Collections.singletonList(iMUserClone));
        }
        function1.invoke(iMContact);
        return list;
    }

    @Override // X.InterfaceC20688615xU
    public final void LIZIZ(String str, String str2) {
        this.LLJILLL.setValue(str);
        LJI().LIZIZ(str, str2);
    }

    @Override // X.InterfaceC1368140lhs
    public final void qN2(String str, List list) {
        if (this.LL.LJJIFFI) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                BaseContact baseContact = (BaseContact) obj;
                if ((baseContact instanceof IMUser) && !Intrinsics.LJFF(baseContact.getUid(), C461720I8s.LIZIZ())) {
                    arrayList.add(obj);
                }
            }
            list = new ArrayList(arrayList);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSearchResult: ");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJI.setValue((List<IMContact>) list);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    @Override // X.InterfaceC328360Cu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r61(java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369220ljc.r61(java.util.List, boolean):void");
    }

    public final void LJIIJJI(List<? extends IMContact> list, Integer num, boolean z, Double d, Double d2) {
        if (!C296750Bk9.LIZ()) {
            return;
        }
        C1368560liY c1368560liY = new C1368560liY(list, num, Boolean.valueOf(z), d, d2);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LLJJ.setValue(c1368560liY);
        } else {
            this.LLJJ.postValue(c1368560liY);
        }
    }

    @Override // X.InterfaceC1368140lhs
    public final void bK(List<IMContact> list, String str, Integer num, Double d, Double d2) {
        List<IMContact> arrayList = list;
        if (this.LL.LJJIFFI) {
            ArrayList arrayList2 = new ArrayList();
            for (IMContact iMContact : arrayList) {
                IMContact iMContact2 = iMContact;
                if ((iMContact2 instanceof IMUser) && !Intrinsics.LJFF(iMContact2.getUid(), C461720I8s.LIZIZ())) {
                    arrayList2.add(iMContact);
                }
            }
            arrayList = new ArrayList<>(arrayList2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSearchResult: ");
        sbLIZ.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJI.setValue(arrayList);
        if (C296750Bk9.LIZ()) {
            this.LLJJ.setValue(new C1368560liY(arrayList, num, Boolean.valueOf(Intrinsics.LJFF(str, this.LLJILLL.getValue())), d, d2));
        }
    }
}
