package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0VQO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQO {
    public static String LIZIZ(boolean z) {
        if (z) {
            String str = IMContactDatabase.LLILZ;
            if (str == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("db_im_contact-");
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                sbLIZ.append(curUserId);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                IMContactDatabase.LLILZ = strLIZIZ;
                return strLIZIZ;
            }
            return str;
        }
        return "db_im_contact";
    }

    public static IMContactDatabase LIZ(Context context, boolean z) {
        C796500VMi c796500VMiLIZ = C0OGG.LIZ(C786410Ut5.N3(context), IMContactDatabase.class, LIZIZ(z));
        c796500VMiLIZ.LJII = true;
        c796500VMiLIZ.LIZJ();
        AbstractC796510VMj[] abstractC796510VMjArr = (AbstractC796510VMj[]) IMContactDatabase.LLILZLL.toArray(new AbstractC796510VMj[0]);
        c796500VMiLIZ.LIZ((AbstractC796510VMj[]) Arrays.copyOf(abstractC796510VMjArr, abstractC796510VMjArr.length));
        IMContactDatabase iMContactDatabase = (IMContactDatabase) c796500VMiLIZ.LIZIZ();
        if (z) {
            IMContactDatabase.LLILLL = iMContactDatabase;
            return iMContactDatabase;
        }
        IMContactDatabase.LLILLJJLI = iMContactDatabase;
        return iMContactDatabase;
    }

    public static IMContactDatabase LIZJ(Context context, boolean z) {
        IMContactDatabase iMContactDatabase;
        int readHoldCount;
        IMContactDatabase iMContactDatabaseLIZ;
        ReentrantReadWriteLock reentrantReadWriteLock = IMContactDatabase.LLILZIL;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            if (z) {
                iMContactDatabase = IMContactDatabase.LLILLL;
            } else {
                iMContactDatabase = IMContactDatabase.LLILLJJLI;
            }
            if (iMContactDatabase != null) {
                lock.unlock();
                return iMContactDatabase;
            }
            lock.unlock();
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock2.unlock();
                }
            } else {
                readHoldCount = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                if (z) {
                    iMContactDatabaseLIZ = IMContactDatabase.LLILLL;
                } else {
                    iMContactDatabaseLIZ = IMContactDatabase.LLILLJJLI;
                }
                if (iMContactDatabaseLIZ == null) {
                    IMContactDatabase.LL.getClass();
                    iMContactDatabaseLIZ = LIZ(context, z);
                }
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return iMContactDatabaseLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            lock.unlock();
            throw th2;
        }
    }
}
