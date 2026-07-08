package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS390S0200000_24;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.05qj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1479505qj implements InterfaceC1345705Ol {
    public static final C1479505qj LIZ;
    public static final HashMap<String, List<C05OZ>> LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;

    static {
        C1479505qj c1479505qj = new C1479505qj();
        LIZ = c1479505qj;
        C622680Oba.LIZJ(c1479505qj);
        LIZIZ = new HashMap<>();
        LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1351));
        LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1352));
    }

    @Override // X.InterfaceC1345705Ol
    public final List<IMUser> LJIIL() {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJIJJ();
    }

    @Override // X.InterfaceC1345705Ol
    public final List<IMUser> LJIILL() {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LJIILL();
    }

    @Override // X.InterfaceC1345705Ol
    public final List<IMUser> getAllFriends() {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().getAllFriends();
    }

    @Override // X.InterfaceC1345705Ol
    public final Object LJI() {
        return C2286608xc.LJ(getAllFriends().size());
    }

    @Override // X.InterfaceC1345705Ol
    public final int LIZ(String str) {
        return MufAffinityScoreRepository.LIZJ(MufAffinityScoreRepository.LJIIIIZZ.getValue(), str);
    }

    @Override // X.InterfaceC1345705Ol
    public final Pair LIZIZ(String str) {
        String strLIZJ = C1489350orN.LIZJ(str);
        return new Pair(C1489370orP.LIZ.LIZ(strLIZJ), C1489370orP.LIZ(strLIZJ));
    }

    @Override // X.InterfaceC1345705Ol
    public final String LIZJ(IMContact iMContact) {
        String uid;
        Long lLJIILIIL;
        if (iMContact instanceof IMConversation) {
            return ((IMConversation) iMContact).getConversationId();
        }
        if ((iMContact instanceof IMUser) && (uid = iMContact.getUid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
            return C0YNP.LIZLLL(Long.valueOf(lLJIILIIL.longValue()));
        }
        return null;
    }

    @Override // X.InterfaceC1345705Ol
    public final String LIZLLL(String str) {
        Long lLJIILIIL;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
            if (iAwemeImManager != null) {
                iAwemeImManager.LJ();
            }
            return C0YNP.LIZLLL(Long.valueOf(jLongValue));
        }
        return "";
    }

    @Override // X.InterfaceC1345705Ol
    public final Unit LJIIIIZZ(String str) {
        if (str != null && C123100dR.LIZ(str)) {
            IMContactApi.LIZ.getClass();
            C069P.LIZ().LIZ().LJIIL(str);
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1345705Ol
    public final void LJIILIIL(IMUser iMUser) {
        boolean z;
        if (iMUser != null && iMUser.getUid() != null) {
            if (C1527905yX.LIZIZ(iMUser.getUpdateTime()) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LIZ.getClass();
                IMUser iMUserLJIIL = ((InterfaceC1710106mp) LIZLLL.getValue()).LJIIL(iMUser.getUid(), null, "im_local_db");
                if (iMUserLJIIL != null) {
                    iMUserLJIIL.setAvatarThumb(iMUser.getAvatarThumb());
                    iMUserLJIIL.setAvatarMedium(iMUser.getAvatarMedium());
                    iMUserLJIIL.setNickName(iMUser.getNickName());
                    iMUserLJIIL.setFollowStatus(iMUser.getFollowStatus());
                    iMUserLJIIL.setFollowerStatus(iMUser.getFollowerStatus());
                    iMUserLJIIL.setBlock(iMUser.isBlock());
                    iMUserLJIIL.setBlocked(iMUser.isBlocked());
                    iMUserLJIIL.setBlockStatus(iMUser.getBlockStatus());
                    iMUser = iMUserLJIIL;
                }
            }
            if (iMUser.isBlock()) {
                iMUser.setFollowStatus(0);
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1479205qg(iMUser, iMUser.clone(), null), 2);
        }
    }

    @Override // X.InterfaceC1345705Ol
    public final void LJIILJJIL(IMUser iMUser) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1479405qi(iMUser, null), 2);
    }

    @Override // X.InterfaceC1345705Ol
    public final List LJIILLIIL(int i) {
        return MufAffinityScoreRepository.LJIIIIZZ.getValue().LIZLLL(i, false);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onIMUserUpdated(C1434905jX c1434905jX) {
        List<C05OZ> list;
        List listLLIIII;
        HashMap<String, List<C05OZ>> map = LIZIZ;
        synchronized (map) {
            try {
                list = map.get(c1434905jX.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        List<C05OZ> list2 = list;
        if (list2 != null && (listLLIIII = C13LP.LLIIII(list2)) != null) {
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                ((C05OZ) it2.next()).LIZ(c1434905jX.LIZJ);
            }
        }
    }

    @Override // X.InterfaceC1345705Ol
    public final void LJFF(final C19EG c19eg, final String str) {
        IMContactApi.LIZ.getClass();
        C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt() { // from class: X.05ql
            public final /* synthetic */ String LIZIZ = "chat_list_page";
            public final /* synthetic */ String LIZJ = "report_flow";

            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                LifecycleCoroutineScope lifecycleScope;
                LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(c19eg);
                if (lifecycleOwnerLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) != null) {
                    C23250099c.LIZLLL(lifecycleScope, null, null, new C1479805qm(c19eg, iMUser, this.LIZIZ, this.LIZJ, str, null), 3);
                }
            }
        }, str, null, "on_block_user_success", false);
    }

    @Override // X.InterfaceC1345705Ol
    public final void LJII(Aweme aweme, final AwS390S0200000_24 awS390S0200000_24) {
        String uid;
        String uid2;
        IShareStatusKeva iShareStatusKeva = (IShareStatusKeva) LIZJ.getValue();
        User author = aweme.getAuthor();
        String secUid = null;
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        int iLIZJ = iShareStatusKeva.LIZJ(uid);
        if (iLIZJ > 0) {
            boolean z = true;
            if (iLIZJ != 1) {
                z = false;
            }
            awS390S0200000_24.invoke(Boolean.valueOf(z));
            return;
        }
        InterfaceC1480505qt interfaceC1480505qt = new InterfaceC1480505qt() { // from class: X.05qf
            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
                Function1<Boolean, Unit> function1 = awS390S0200000_24;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                boolean z2 = true;
                if (iMUser.getShareStatus() != 1) {
                    z2 = false;
                }
                Function1<Boolean, Unit> function1 = awS390S0200000_24;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z2));
                }
                String uid3 = iMUser.getUid();
                if (C123100dR.LIZ(uid3) && uid3 != null) {
                    C1479505qj.LIZ.getClass();
                    ((IShareStatusKeva) C1479505qj.LIZJ.getValue()).LIZ(Integer.valueOf(iMUser.getShareStatus()), uid3);
                }
            }
        };
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            uid2 = author2.getUid();
        } else {
            uid2 = null;
        }
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            secUid = author3.getSecUid();
        }
        c1bgsLJ.LJI(interfaceC1480505qt, uid2, secUid, "im_ai_group_shot", true);
    }

    @Override // X.InterfaceC1345705Ol
    public final void LJIIIZ(String str, C05OW c05ow) {
        HashMap<String, List<C05OZ>> map = LIZIZ;
        synchronized (map) {
            try {
                List<C05OZ> arrayList = map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map.put(str, arrayList);
                }
                arrayList.add(c05ow);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1345705Ol
    public final List LJIIJ(String str, List list) {
        IMContactApi.LIZ.getClass();
        return C19719512Dh.LIZIZ(C069P.LIZ().LJ().LJIL(str, false, list));
    }

    @Override // X.InterfaceC1345705Ol
    public final void LJIIJJI(String str, C05OZ c05oz) {
        HashMap<String, List<C05OZ>> map = LIZIZ;
        synchronized (map) {
            try {
                if (str == null) {
                    Iterator<T> it2 = map.values().iterator();
                    while (it2.hasNext()) {
                        ((List) it2.next()).remove(c05oz);
                    }
                } else {
                    List<C05OZ> list = map.get(str);
                    if (list != null) {
                        list.remove(c05oz);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1345705Ol
    public final void LJ(User user, boolean z, Function1<? super Boolean, Unit> function1) {
        if (user == null) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1479005qe(user, z, function1, null), 2);
    }
}
