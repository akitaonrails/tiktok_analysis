package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.challenge.data.LocalHashTag;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11Et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19468511Et implements InterfaceC586170Myt {
    public static C19468511Et LLIZ;
    public final int LL = 20;
    public final int LLILLJJLI = 10;
    public final Gson LLILLL = new Gson();
    public final IAccountService LLILZ;
    public List<Pair<String, List<LocalHashTag>>> LLILZIL;
    public List<LocalHashTag> LLILZLL;

    public static C19468511Et LIZJ() {
        if (LLIZ == null) {
            synchronized (C19468511Et.class) {
                try {
                    if (LLIZ == null) {
                        LLIZ = new C19468511Et();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLIZ;
    }

    public final void LIZ() {
        Object obj;
        AccountUserService accountUserServiceLJIIJ = this.LLILZ.LJIIJ();
        String curUserId = accountUserServiceLJIIJ.isLogin() ? accountUserServiceLJIIJ.getCurUserId() : "FAKE_USER";
        Iterator<Pair<String, List<LocalHashTag>>> it2 = this.LLILZIL.iterator();
        this.LLILZLL = new ArrayList();
        while (it2.hasNext()) {
            Pair<String, List<LocalHashTag>> next = it2.next();
            if (next != null && TextUtils.equals((CharSequence) next.first, curUserId) && (obj = next.second) != null && ((List) obj).size() > 0) {
                ((ArrayList) this.LLILZLL).addAll((Collection) next.second);
                it2.remove();
            }
        }
        ListProtector.add(this.LLILZIL, 0, new Pair(curUserId, this.LLILZLL));
        if (this.LLILLJJLI > 0 && this.LLILZIL.size() > this.LLILLJJLI) {
            ListProtector.remove(this.LLILZIL, r1.size() - 1);
        }
        LIZLLL();
    }

    public final void LIZLLL() {
        try {
            C1238740iLA.LIZLLL().LJFF("hash_tag_history", this.LLILLL.LJIILLIIL(this.LLILZIL, new TypeToken<List<Pair<String, List<LocalHashTag>>>>() { // from class: X.11Eu
            }.getType()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C19468511Et() {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        this.LLILZ = iAccountService;
        iAccountService.LJIILL(this);
        this.LLILZIL = LIZIZ();
        LIZ();
    }

    public final List<Pair<String, List<LocalHashTag>>> LIZIZ() {
        try {
            this.LLILZIL = (List) this.LLILLL.LJIIIIZZ(C1238740iLA.LIZLLL().LIZIZ("hash_tag_history", ""), new TypeToken<List<Pair<String, List<LocalHashTag>>>>() { // from class: X.11Ev
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new ArrayList();
        }
        return this.LLILZIL;
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 2) {
            if (i == 1 || i == 3) {
                Iterator<Pair<String, List<LocalHashTag>>> it2 = this.LLILZIL.iterator();
                while (it2.hasNext()) {
                    Pair<String, List<LocalHashTag>> next = it2.next();
                    if (next != null && TextUtils.equals((CharSequence) next.first, "FAKE_USER")) {
                        it2.remove();
                    }
                }
                LIZLLL();
            } else {
                return;
            }
        }
        this.LLILZIL.clear();
        this.LLILZIL = LIZIZ();
        LIZ();
    }
}
