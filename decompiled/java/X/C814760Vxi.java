package X;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0Vxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814760Vxi {
    public final CharSequence LIZ;
    public final long LIZIZ;
    public final C815260VyW LIZJ;
    public final Bundle LIZLLL = new Bundle();
    public String LJ;
    public Uri LJFF;

    public final Notification.MessagingStyle.Message LIZIZ() {
        Notification.MessagingStyle.Message messageLIZ;
        C815260VyW c815260VyW = this.LIZJ;
        if (Build.VERSION.SDK_INT >= 28) {
            messageLIZ = C814800Vxm.LIZIZ(this.LIZ, this.LIZIZ, c815260VyW != null ? C815250VyV.LIZIZ(c815260VyW) : null);
        } else {
            messageLIZ = C814810Vxn.LIZ(this.LIZ, this.LIZIZ, c815260VyW != null ? c815260VyW.LIZ : null);
        }
        String str = this.LJ;
        if (str != null) {
            C814810Vxn.LIZIZ(messageLIZ, str, this.LJFF);
        }
        return messageLIZ;
    }

    public static Bundle[] LIZ(List<C814760Vxi> list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C814760Vxi c814760Vxi = (C814760Vxi) ListProtector.get(list, i);
            c814760Vxi.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = c814760Vxi.LIZ;
            if (charSequence != null) {
                C786410Ut5.LJJIJIIJI(bundle, "text", charSequence);
            }
            bundle.putLong("time", c814760Vxi.LIZIZ);
            C815260VyW c815260VyW = c814760Vxi.LIZJ;
            if (c815260VyW != null) {
                C786410Ut5.LJJIJIIJI(bundle, "sender", c815260VyW.LIZ);
                if (Build.VERSION.SDK_INT >= 28) {
                    C815260VyW c815260VyW2 = c814760Vxi.LIZJ;
                    c815260VyW2.getClass();
                    Person personLIZIZ = C815250VyV.LIZIZ(c815260VyW2);
                    C814800Vxm.LIZ(personLIZIZ);
                    C786410Ut5.LJJIJL(bundle, "sender_person", personLIZIZ);
                } else {
                    C786410Ut5.LJJIIZI(bundle, c814760Vxi.LIZJ.LIZ(), "person");
                }
            }
            String str = c814760Vxi.LJ;
            if (str != null) {
                C786410Ut5.LJJJI("type", str, bundle);
            }
            Uri uri = c814760Vxi.LJFF;
            if (uri != null) {
                C786410Ut5.LJJIJL(bundle, "uri", uri);
            }
            Bundle bundle2 = c814760Vxi.LIZLLL;
            if (bundle2 != null) {
                C786410Ut5.LJJIIZI(bundle, bundle2, "extras");
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public C814760Vxi(CharSequence charSequence, long j, C815260VyW c815260VyW) {
        this.LIZ = charSequence;
        this.LIZIZ = j;
        this.LIZJ = c815260VyW;
    }
}
