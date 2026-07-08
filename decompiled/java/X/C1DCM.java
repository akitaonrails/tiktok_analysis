package X;

import Y.ARunnableS127S0100000_27;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.1DCM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCM implements InterfaceC591550NIb {
    public static final int LJ = C2252021DCm.LIZJ;
    public static final C01GW<HashSet<Integer>> LJFF = C452501pT.LIZIZ(new C1940907ix());
    public final ConcurrentHashMap<String, C2092508Hr<String, SessionFeatureItem>> LIZ = new ConcurrentHashMap<>();
    public final C2251911DCb<C204535151p> LIZIZ;
    public final C01GW LIZJ;
    public Future<?> LIZLLL;

    public C1DCM() {
        C2251911DCb<C204535151p> c2251911DCbLIZ = new C2251911DCb(new InterfaceC2251961DCg() { // from class: X.1DCe
            @Override // X.InterfaceC2251961DCg
            public final void LIZIZ(C204535151p c204535151p) {
            }
        }).LIZ(C1DCZ.LIZ).LIZ(C1DCZ.LIZIZ).LIZ(C1DCZ.LIZLLL).LIZ(C2183861AdU.LIZ).LIZ(C1DCZ.LJ).LIZ(C1DCZ.LJFF).LIZ(C1DCZ.LJI);
        this.LIZIZ = c2251911DCbLIZ;
        if (((Number) C283800BAk.LIZ.getValue()).intValue() > 0) {
            this.LIZIZ = c2251911DCbLIZ.LIZ(new C204532151m());
        }
        if (C0BPK.LIZ()) {
            this.LIZIZ = this.LIZIZ.LIZ(C1DCZ.LIZJ);
        }
        this.LIZJ = C452501pT.LIZIZ(new C2216121BoQ());
    }

    public final C2092508Hr<String, SessionFeatureItem> LIZJ() {
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        C2092508Hr<String, SessionFeatureItem> c2092508Hr = this.LIZ.get(curUserId);
        if (c2092508Hr != null) {
            return c2092508Hr;
        }
        C2092508Hr<String, SessionFeatureItem> c2092508Hr2 = new C2092508Hr<>(LJ);
        this.LIZ.put(curUserId, c2092508Hr2);
        return c2092508Hr2;
    }

    @Override // X.InterfaceC591550NIb
    public final void LIZ(InterfaceC582850MtX interfaceC582850MtX) {
        String value;
        if (interfaceC582850MtX instanceof C603460Nlg) {
            C603460Nlg c603460Nlg = (C603460Nlg) interfaceC582850MtX;
            InterfaceC603400Nla interfaceC603400Nla = c603460Nlg.LIZIZ;
            if (interfaceC603400Nla.LIZIZ()) {
                value = interfaceC603400Nla.getValue("enter_from");
            } else {
                value = interfaceC603400Nla.getValue("enter_from_merge");
            }
            if (value != null && TextUtils.equals(value, "homepage_hot")) {
                String value2 = interfaceC603400Nla.getValue("group_id");
                if (TextUtils.isEmpty(value2)) {
                    value2 = interfaceC603400Nla.getValue("aweme_id");
                }
                if (TextUtils.isEmpty(value2)) {
                    value2 = interfaceC603400Nla.getValue("object_id");
                }
                if (TextUtils.isEmpty(value2)) {
                    value2 = interfaceC603400Nla.getValue("room_id");
                }
                if (value2 != null) {
                    LJ(LIZLLL(value2), c603460Nlg);
                    return;
                }
                return;
            }
            return;
        }
        if (interfaceC582850MtX instanceof C2183911AdZ) {
            C2183911AdZ c2183911AdZ = (C2183911AdZ) interfaceC582850MtX;
            if (!TextUtils.equals(c2183911AdZ.LIZJ, "homepage_hot")) {
                return;
            }
            LJ(LIZLLL(c2183911AdZ.LIZ), c2183911AdZ);
            return;
        }
        if (interfaceC582850MtX instanceof C582300Mse) {
            C582300Mse c582300Mse = (C582300Mse) interfaceC582850MtX;
            if (!TextUtils.equals(c582300Mse.LIZIZ, "homepage_hot")) {
                return;
            }
            LJ(LIZLLL(c582300Mse.LIZ.getAid()), c582300Mse);
            return;
        }
        String str = "";
        if (interfaceC582850MtX instanceof C583460MuW) {
            C583460MuW c583460MuW = (C583460MuW) interfaceC582850MtX;
            if (!TextUtils.equals(c583460MuW.LIZIZ, "homepage_hot")) {
                return;
            }
            String aid = c583460MuW.LIZ.getAid();
            if (aid != null) {
                str = aid;
            }
            LJ(LIZLLL(str), interfaceC582850MtX);
            return;
        }
        if (interfaceC582850MtX instanceof C583510Mub) {
            C583510Mub c583510Mub = (C583510Mub) interfaceC582850MtX;
            if (!TextUtils.equals(c583510Mub.LIZIZ, "homepage_hot")) {
                return;
            }
            String aid2 = c583510Mub.LIZ.getAid();
            if (aid2 != null) {
                str = aid2;
            }
            LJ(LIZLLL(str), interfaceC582850MtX);
            return;
        }
        if (interfaceC582850MtX instanceof C1022650cid) {
            C1022650cid c1022650cid = (C1022650cid) interfaceC582850MtX;
            if (!TextUtils.equals(c1022650cid.LIZJ, "homepage_hot")) {
                return;
            }
            LJ(LIZLLL(c1022650cid.LIZ), interfaceC582850MtX);
            return;
        }
        if (interfaceC582850MtX instanceof C2183781AdM) {
            C2183781AdM c2183781AdM = (C2183781AdM) interfaceC582850MtX;
            if (!TextUtils.equals(c2183781AdM.LIZIZ, "homepage_hot")) {
                return;
            }
            String aid3 = c2183781AdM.LIZ.getAid();
            if (aid3 != null) {
                str = aid3;
            }
            LJ(LIZLLL(str), interfaceC582850MtX);
            return;
        }
        if (!(interfaceC582850MtX instanceof C1589470rSr) || !C0BPM.LIZ()) {
            return;
        }
        Future<?> future = this.LIZLLL;
        if (future != null && !future.isDone()) {
            return;
        }
        this.LIZLLL = C823050WQl.LIZLLL().submit(new ARunnableS127S0100000_27(this, 0));
    }

    public final void LIZIZ(Collection<SessionFeatureItem> collection) {
        ArrayList arrayList;
        C2092508Hr<String, SessionFeatureItem> c2092508HrLIZJ = LIZJ();
        synchronized (c2092508HrLIZJ.LIZ) {
            try {
                arrayList = new ArrayList(c2092508HrLIZJ.LIZ.values());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ((ArrayList) collection).addAll(arrayList);
    }

    public final SessionFeatureItem LIZLLL(String str) {
        SessionFeatureItem sessionFeatureItem = LIZJ().LIZ.get(str);
        if (sessionFeatureItem == null) {
            return new SessionFeatureItem(str);
        }
        return sessionFeatureItem;
    }

    public final void LJ(SessionFeatureItem sessionFeatureItem, InterfaceC582850MtX interfaceC582850MtX) {
        this.LIZIZ.LIZIZ(new C204535151p(sessionFeatureItem, interfaceC582850MtX));
        if (!C0BPM.LIZ() && !C300580BqK.LIZ()) {
            if (!C13LP.LJJJJ(sessionFeatureItem.awemeType, LJFF.getValue())) {
                return;
            }
        }
        C2092508Hr<String, SessionFeatureItem> c2092508HrLIZJ = LIZJ();
        c2092508HrLIZJ.LIZ.put(sessionFeatureItem.awemeId, sessionFeatureItem);
    }
}
