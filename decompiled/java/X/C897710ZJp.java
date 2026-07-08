package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0ZJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897710ZJp implements C0ZK0 {
    public static final /* synthetic */ int LJII = 0;
    public boolean LJFF;
    public final Map<String, List<WeakReference<InterfaceC418001ju>>> LIZ = new LinkedHashMap();
    public final ConcurrentHashMap<String, UrlModel> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, UrlModel> LIZJ = new ConcurrentHashMap<>();
    public final HashSet<String> LIZLLL = new HashSet<>();
    public final ConcurrentHashMap<String, Boolean> LJ = new ConcurrentHashMap<>();
    public final C01GW LJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(438));

    public final synchronized void LJI() {
    }

    @Override // X.C0ZK0
    public final UrlModel LIZ(UrlModel urlModel, String str) {
        UrlModel avatarThumb;
        IMUser iMUserLJIJ;
        UrlModel urlModel2 = this.LIZJ.get(str);
        boolean z = false;
        String strLIZIZ = null;
        if (C897770ZJv.LIZLLL(urlModel2, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAvatar: fixed, uid=");
            sbLIZ.append(str);
            sbLIZ.append(", uri=");
            if (urlModel2 != null) {
                strLIZIZ = C897780ZJw.LIZIZ(urlModel2, true);
            }
            sbLIZ.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C897770ZJv.LIZ();
            return urlModel2;
        }
        UrlModel urlModel3 = this.LIZIZ.get(str);
        if (C897770ZJv.LIZLLL(urlModel3, false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getAvatar: checking, uid=");
            sbLIZ2.append(str);
            sbLIZ2.append(", uri=");
            if (urlModel3 != null) {
                strLIZIZ = C897780ZJw.LIZIZ(urlModel3, true);
            }
            sbLIZ2.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C897770ZJv.LIZ();
            return urlModel3;
        }
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        if (contactFeatureLIZ != null && (iMUserLJIJ = contactFeatureLIZ.LJIJ(str)) != null) {
            avatarThumb = iMUserLJIJ.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        if (C897770ZJv.LIZLLL(avatarThumb, false)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getAvatar: cache, uid=");
            sbLIZ3.append(str);
            sbLIZ3.append(", uri=");
            if (avatarThumb != null) {
                strLIZIZ = C897780ZJw.LIZIZ(avatarThumb, true);
            }
            sbLIZ3.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
            C897770ZJv.LIZIZ();
            return avatarThumb;
        }
        if (urlModel != null && C897770ZJv.LIZLLL(urlModel, false)) {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getAvatar: outer, uid=");
            sbLIZ4.append(str);
            sbLIZ4.append(", uri=");
            sbLIZ4.append(C897780ZJw.LIZIZ(urlModel, true));
            C2188811AlT.LIZIZ(sbLIZ4);
            C897770ZJv.LIZIZ();
            this.LIZIZ.put(str, urlModel);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C897720ZJq(str, urlModel, this, null), 3);
            return urlModel;
        }
        if (avatarThumb != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("getAvatar: invalid, cache, uid=");
            sbLIZ5.append(str);
            sbLIZ5.append(", uri=");
            sbLIZ5.append(C897780ZJw.LIZIZ(avatarThumb, true));
            C2188811AlT.LIZIZ(sbLIZ5);
            C897770ZJv.LIZIZ();
            urlModel = avatarThumb;
        } else if (urlModel != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("getAvatar: invalid, outer, uid=");
            sbLIZ6.append(str);
            sbLIZ6.append(", uri=");
            sbLIZ6.append(C897780ZJw.LIZIZ(urlModel, true));
            C2188811AlT.LIZIZ(sbLIZ6);
            C897770ZJv.LIZIZ();
        } else {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("getAvatar: null, uid=");
            sbLIZ7.append(str);
            C2188811AlT.LIZIZ(sbLIZ7);
            C897770ZJv.LIZIZ();
            urlModel = null;
        }
        if (this.LJ.containsKey(str)) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("getAvatar: skip refresh for invalid avatar uid=");
            sbLIZ8.append(str);
            C2188811AlT.LIZIZ(sbLIZ8);
            C897770ZJv.LIZIZ();
            return urlModel;
        }
        if (urlModel != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C592720NMo(this, str, null), 3);
            return urlModel;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C897750ZJt(this, str, null), 3);
        return urlModel;
    }

    @Override // X.C0ZK0
    public final synchronized void LIZIZ(String str, WeakReference<InterfaceC418001ju> weakReference) {
        Integer numValueOf;
        List list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list == null) {
            this.LIZ.put(str, C1697810uHb.LJIILJJIL(weakReference));
        } else {
            C19719612Di.LJJIIJ(list, AFwS248S0000000_14.get$arr$(434), true);
            list.add(weakReference);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerObserver: add observer, uid=");
        sbLIZ.append(str);
        sbLIZ.append(", observer=");
        InterfaceC418001ju interfaceC418001ju = weakReference.get();
        if (interfaceC418001ju != null) {
            numValueOf = Integer.valueOf(interfaceC418001ju.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C897770ZJv.LIZIZ();
        if (this.LIZ.size() > 200) {
            LJI();
        }
    }

    @Override // X.C0ZK0
    public final synchronized void LIZJ(String str, WeakReference<InterfaceC418001ju> weakReference) {
        Integer numValueOf;
        List list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unRegisterObserver: list is null, uid=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C897770ZJv.LIZ();
            return;
        }
        if (list.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unRegisterObserver: list is empty, uid=");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C897770ZJv.LIZ();
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("unRegisterObserver: remove observer, uid=");
        sbLIZ3.append(str);
        sbLIZ3.append(", observer=");
        InterfaceC418001ju interfaceC418001ju = weakReference.get();
        if (interfaceC418001ju != null) {
            numValueOf = Integer.valueOf(interfaceC418001ju.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ3.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ3);
        C897770ZJv.LIZIZ();
        list.remove(weakReference);
        if (list.isEmpty()) {
            this.LIZ.remove(str);
        }
    }

    public final void LJ(UrlModel urlModel, String str) {
        if (urlModel == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyChange: uid=");
        sbLIZ.append(str);
        sbLIZ.append(", avatar=");
        sbLIZ.append(C897780ZJw.LIZIZ(urlModel, true));
        C2188811AlT.LIZIZ(sbLIZ);
        C897770ZJv.LIZIZ();
        synchronized (this) {
            List list = (List) ((LinkedHashMap) this.LIZ).get(str);
            if (list == null) {
                return;
            }
            if (list.isEmpty()) {
                this.LIZ.remove(str);
                return;
            }
            ArrayList arrayList = new ArrayList(list);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C417901jt(arrayList, str, urlModel, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0ZJs] */
    public final void LJFF(final int i, final String str) {
        ContactFeature contactFeatureLIZ;
        synchronized (this) {
            try {
                if (this.LIZLLL.contains(str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("refreshUserInfoFromNet: remainRetry=");
                    sbLIZ.append(i);
                    sbLIZ.append(", uid=");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C897770ZJv.LIZIZ();
                    return;
                }
                this.LIZLLL.add(str);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("refreshUserInfoFromNet: remainRetry=");
                sbLIZ2.append(i);
                sbLIZ2.append(", uid=");
                sbLIZ2.append(str);
                C2188811AlT.LIZIZ(sbLIZ2);
                C897770ZJv.LIZIZ();
                if (str.length() > 0 && (contactFeatureLIZ = ContactFeature.LIZ.LIZ()) != 0) {
                    contactFeatureLIZ.LJII(str, new C1BGQ() { // from class: X.0ZJs
                        @Override // X.C1BGQ
                        public final void LIZ(Throwable th) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("refreshUserInfoFromNet: onQueryError, uid=");
                            sbLIZ3.append(str);
                            sbLIZ3.append(", remainRetry=");
                            sbLIZ3.append(i);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            C897770ZJv.LIZIZ();
                            if ((th instanceof C0XIR) && ((C23112093u) th).getErrorCode() == 4 && i > 0) {
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C592730NMp(this, str, i, null), 3);
                                return;
                            }
                            C897710ZJp c897710ZJp = this;
                            String str2 = str;
                            synchronized (this) {
                                try {
                                    c897710ZJp.LIZLLL.remove(str2);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }

                        @Override // X.C1BGQ
                        public final void LIZIZ(BaseContact baseContact) {
                            String strLIZIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("refreshUserInfoFromNet: onQueryResult, uid=");
                            sbLIZ3.append(str);
                            sbLIZ3.append(", uri=");
                            UrlModel avatarThumb = baseContact.getAvatarThumb();
                            if (avatarThumb != null) {
                                strLIZIZ = C897780ZJw.LIZIZ(avatarThumb, true);
                            } else {
                                strLIZIZ = null;
                            }
                            sbLIZ3.append(strLIZIZ);
                            C2188811AlT.LIZIZ(sbLIZ3);
                            C897770ZJv.LIZIZ();
                            if (C897770ZJv.LJ(baseContact.getUid())) {
                                C897770ZJv.LIZ.add(baseContact.getUid());
                            }
                            C897710ZJp c897710ZJp = this;
                            String str2 = str;
                            synchronized (this) {
                                try {
                                    c897710ZJp.LIZLLL.remove(str2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            C897710ZJp c897710ZJp2 = this;
                            c897710ZJp2.getClass();
                            String uid = baseContact.getUid();
                            if (uid != null) {
                                if (c897710ZJp2.LIZJ.contains(uid) && C897770ZJv.LIZLLL(baseContact.getAvatarThumb(), false)) {
                                    c897710ZJp2.LJ.remove(uid);
                                    c897710ZJp2.LIZLLL(false, uid, baseContact.getAvatarThumb());
                                } else {
                                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C897730ZJr(c897710ZJp2, uid, baseContact, null), 3);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(boolean z, String str, UrlModel urlModel) {
        if (str != null && str.length() != 0 && urlModel != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addToFixedAvatar: uid=");
            sbLIZ.append(str);
            sbLIZ.append(", uri=");
            sbLIZ.append(C897780ZJw.LIZIZ(urlModel, true));
            sbLIZ.append(", needNotify=");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            C897770ZJv.LIZ();
            this.LIZJ.put(str, urlModel);
            if (z) {
                LJ(urlModel, str);
            }
        }
    }
}
