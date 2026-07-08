package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WI8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WI8 extends C0WI9 {
    public final AccountManager LIZIZ;
    public final String LIZJ;
    public Account LIZLLL;
    public final ConcurrentHashMap<String, String> LJ = new ConcurrentHashMap<>();
    public final C844770XBz LJFF;

    @Override // X.C0WI9, X.C0XBX
    public final String LIZ(String str) {
        String strLJ = LJ(str);
        String str2 = this.LJ.get(strLJ);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        Account account = this.LIZLLL;
        if (account == null) {
            return null;
        }
        try {
            return C2204961BRm.LJ(this.LIZIZ, account, strLJ, new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8kyiMDaOxZcKzSGbeG2YGUuxyH9Q=", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // X.C0WI9
    public final void LIZLLL(List<String> list) {
        AccountManager accountManager;
        if (list == null) {
            return;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            String strLJ = LJ(it2.next());
            this.LJ.remove(strLJ);
            try {
                Account account = this.LIZLLL;
                if (account != null && (accountManager = this.LIZIZ) != null) {
                    accountManager.setUserData(account, strLJ, null);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        super.LIZLLL(list);
    }

    public final String LJ(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(this.LIZJ);
        if (!this.LJFF.LJJIIZ) {
            stringBuffer.append("_");
            stringBuffer.append(this.LJFF.LIZ());
        }
        return stringBuffer.toString();
    }

    @Override // X.C0WI9, X.C0XBX
    public final void LIZJ(String str, String str2) {
        String strLJ = LJ(str);
        Account account = this.LIZLLL;
        if (account == null) {
            this.LJ.put(strLJ, str2);
        } else {
            if (str2 == null) {
                return;
            }
            try {
                this.LIZIZ.setUserData(account, strLJ, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public C0WI8(Context context, String str, C844770XBz c844770XBz) {
        this.LIZIZ = AccountManager.get(context);
        this.LIZJ = str;
        this.LJFF = c844770XBz;
    }
}
