package X;

import Y.ACallableS245S0200000_13;
import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.db.SearchDislikeDataBase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJ2 implements C0NMK {
    public final AbstractC796540VMm LIZ;
    public final C0NMM LIZIZ;

    @Override // X.C0NMK
    public final C095D LIZIZ() {
        return C824670WWr.LIZ(this.LIZ, new String[]{"search_dislike_table"}, new ACallableS245S0200000_13(this, C0VN5.LIZLLL(0, "SELECT aid FROM search_dislike_table ORDER BY id DESC"), 21));
    }

    @Override // X.C0NMK
    public final List<C0NML> LIZJ() {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM search_dislike_table ORDER BY id DESC LIMIT 1");
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, FollowStatusChangeMethod.PARAM_UID);
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "aid");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                arrayList.add(new C0NML(cursorLIZIZ.getInt(iLIZIZ), cursorLIZIZ.isNull(iLIZIZ2) ? null : cursorLIZIZ.getString(iLIZIZ2)));
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0NMM] */
    public C0VJ2(final SearchDislikeDataBase searchDislikeDataBase) {
        this.LIZ = searchDislikeDataBase;
        this.LIZIZ = new AbstractC796330VLr<C0NML>(searchDislikeDataBase) { // from class: X.0NMM
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `search_dislike_table` (`id`,`aid`) VALUES (?,?)";
            }

            @Override // X.AbstractC796330VLr
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C0NML c0nml) {
                interfaceC796340VLs.LJIJ(1, r5.LIZ);
                String str = c0nml.LIZIZ;
                if (str == null) {
                    interfaceC796340VLs.LLD(2);
                } else {
                    interfaceC796340VLs.LJIILIIL(2, str);
                }
            }
        };
        new C854550Xfh(searchDislikeDataBase, 30);
    }

    @Override // X.C0NMK
    public final Object LIZ(C0NML c0nml, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, c0nml, 20), interfaceC1364105Vn);
    }
}
