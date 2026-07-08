package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.database.IMDatabase;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0VQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797560VQk {
    public static IMDatabase LIZ(Context context) {
        boolean zBooleanValue = ((Boolean) IMDatabase.LL.invoke()).booleanValue();
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("has_user_id", String.valueOf(zBooleanValue));
        C20684815ws.LJIILLIIL("im_db_check_user_id_creation", c830490Whz);
        C796500VMi c796500VMiLIZ = C0OGG.LIZ(C786410Ut5.N3(context), IMDatabase.class, "db_im_xx");
        c796500VMiLIZ.LJII = true;
        c796500VMiLIZ.LIZJ();
        AbstractC796510VMj[] abstractC796510VMjArr = (AbstractC796510VMj[]) IMDatabase.LLILZIL.toArray(new AbstractC796510VMj[0]);
        c796500VMiLIZ.LIZ((AbstractC796510VMj[]) Arrays.copyOf(abstractC796510VMjArr, abstractC796510VMjArr.length));
        return (IMDatabase) c796500VMiLIZ.LIZIZ();
    }

    public static IMDatabase LIZIZ(Context context) {
        IMDatabase iMDatabaseLIZ = IMDatabase.LLILLJJLI;
        if (iMDatabaseLIZ == null) {
            synchronized (IMDatabase.LLILLL) {
                try {
                    iMDatabaseLIZ = IMDatabase.LLILLJJLI;
                    if (iMDatabaseLIZ == null) {
                        iMDatabaseLIZ = LIZ(context);
                        IMDatabase.LLILLJJLI = iMDatabaseLIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return iMDatabaseLIZ;
    }
}
