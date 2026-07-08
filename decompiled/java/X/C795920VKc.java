package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.cache.FriendsFeeRespDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795920VKc implements C0NM9 {
    public final AbstractC796540VMm LIZ;
    public final C0P49 LIZIZ;
    public final C0NMG LIZJ = new Object() { // from class: X.0NMG
    };
    public final C854550Xfh LIZLLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0NMG] */
    public C795920VKc(FriendsFeeRespDatabase friendsFeeRespDatabase) {
        this.LIZ = friendsFeeRespDatabase;
        this.LIZIZ = new C0P49(this, friendsFeeRespDatabase, 1);
        this.LIZLLL = new C854550Xfh(friendsFeeRespDatabase, 33);
    }

    @Override // X.C0NM9
    public final void LIZ(C0NMB c0nmb) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            this.LIZIZ.insert(c0nmb);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.C0NM9
    public final List<C0NMB> LIZIZ(String str) {
        String string;
        String string2;
        Object c098200Yq;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM friends_feed_resp_cache where uid = ?");
        c0vn5LIZLLL.LJIILIIL(1, str);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "uid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "friends_feed_resp");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "created_time_millis");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                Object obj = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    string2 = null;
                } else {
                    string2 = cursorLIZIZ.getString(iLIZIZ2);
                }
                getClass();
                try {
                    c098200Yq = (FriendsFeedResponse) C08JS.LIZ(string2, FriendsFeedResponse.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                    obj = c098200Yq;
                }
                arrayList.add(new C0NMB(string, (FriendsFeedResponse) obj, cursorLIZIZ.getLong(iLIZIZ3)));
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th2;
        }
    }

    @Override // X.C0NM9
    public final void LIZJ(String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZLLL.acquire();
        interfaceC796340VLsAcquire.LJIILIIL(1, str);
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LIZLLL.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LIZLLL.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }
}
