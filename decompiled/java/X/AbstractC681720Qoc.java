package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Qoc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC681720Qoc implements InterfaceC586170Myt {
    public int LL = -1;
    public final Gson LLILLJJLI = new Gson();
    public final IAccountService LLILLL;
    public List<Pair<String, List<MusicSearchHistory>>> LLILZ;
    public List<MusicSearchHistory> LLILZIL;
    public List<WeakReference<InterfaceC681920Qow>> LLILZLL;

    public abstract String LIZLLL();

    public abstract List<MusicSearchHistory> LJ();

    public abstract void LJIIJ(String str);

    public final void LIZ() {
        ((ArrayList) this.LLILZIL).clear();
        LJIIJJI();
        LJII();
    }

    public final void LIZJ() {
        AccountUserService accountUserServiceLJIIJ = this.LLILLL.LJIIJ();
        String curUserId = accountUserServiceLJIIJ.isLogin() ? accountUserServiceLJIIJ.getCurUserId() : "FAKE_USER";
        Iterator<Pair<String, List<MusicSearchHistory>>> it2 = this.LLILZ.iterator();
        this.LLILZIL = new ArrayList();
        while (it2.hasNext()) {
            Pair<String, List<MusicSearchHistory>> next = it2.next();
            if (TextUtils.equals((CharSequence) next.first, curUserId)) {
                ((ArrayList) this.LLILZIL).addAll((Collection) next.second);
                it2.remove();
            }
        }
        ListProtector.add(this.LLILZ, 0, new Pair(curUserId, this.LLILZIL));
        if (this.LLILZ.size() > 10) {
            ListProtector.remove(this.LLILZ, r1.size() - 1);
        }
        LJIIJJI();
    }

    public final List<MusicSearchHistory> LJFF() {
        ArrayList arrayList = new ArrayList();
        List<MusicSearchHistory> list = this.LLILZIL;
        if (list != null && list.size() > 0) {
            arrayList.addAll(this.LLILZIL);
        }
        return arrayList;
    }

    public final void LJII() {
        List<MusicSearchHistory> list = this.LLILZIL;
        List<WeakReference<InterfaceC681920Qow>> list2 = this.LLILZLL;
        if (list2 != null) {
            for (Reference reference : (ArrayList) list2) {
                if (reference.get() != null) {
                    ((InterfaceC681920Qow) reference.get()).pc(list);
                }
            }
        }
    }

    public final void LJIIJJI() {
        try {
            LJIIJ(this.LLILLJJLI.LJIILLIIL(this.LLILZ, new TypeToken<List<Pair<String, List<MusicSearchHistory>>>>() { // from class: X.0Qom
            }.getType()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public AbstractC681720Qoc() {
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        this.LLILLL = iAccountService;
        iAccountService.LJIILL(this);
        this.LLILZ = LJI();
        LIZJ();
    }

    public final List<Pair<String, List<MusicSearchHistory>>> LJI() {
        try {
            String strLIZLLL = LIZLLL();
            if (TextUtils.isEmpty(strLIZLLL)) {
                List<MusicSearchHistory> listLJ = LJ();
                if (listLJ == null) {
                    listLJ = new ArrayList<>();
                } else {
                    C681730Qod.LJIIL();
                }
                ArrayList arrayList = new ArrayList();
                this.LLILZ = arrayList;
                arrayList.add(new Pair("FAKE_USER", listLJ));
            } else {
                this.LLILZ = (List) this.LLILLJJLI.LJIIIIZZ(strLIZLLL, new TypeToken<List<Pair<String, List<MusicSearchHistory>>>>() { // from class: X.0Qon
                }.getType());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLILZ == null) {
            this.LLILZ = new ArrayList();
        }
        return this.LLILZ;
    }

    public final void LIZIZ(MusicSearchHistory musicSearchHistory) {
        ((ArrayList) this.LLILZIL).remove(musicSearchHistory);
        LJIIJJI();
        LJII();
    }

    public final void LJIIIIZZ(MusicSearchHistory musicSearchHistory) {
        ((ArrayList) this.LLILZIL).remove(musicSearchHistory);
        ListProtector.add(this.LLILZIL, 0, musicSearchHistory);
        if (this.LL > 0 && ((ArrayList) this.LLILZIL).size() > this.LL) {
            ListProtector.remove(this.LLILZIL, ((ArrayList) r1).size() - 1);
        }
        LJIIJJI();
        LJII();
    }

    public final void LJIIIZ(InterfaceC681920Qow interfaceC681920Qow) {
        List<WeakReference<InterfaceC681920Qow>> list = this.LLILZLL;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                Reference reference = (Reference) it2.next();
                if (reference != null && reference.get() == interfaceC681920Qow) {
                    it2.remove();
                }
            }
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 2) {
            if (i == 1 || i == 3) {
                Iterator<Pair<String, List<MusicSearchHistory>>> it2 = this.LLILZ.iterator();
                while (it2.hasNext()) {
                    if (TextUtils.equals((CharSequence) it2.next().first, "FAKE_USER")) {
                        it2.remove();
                    }
                }
                LJIIJJI();
            } else {
                return;
            }
        }
        this.LLILZ.clear();
        this.LLILZ = LJI();
        LIZJ();
    }
}
