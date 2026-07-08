package Y;

import X.AbstractC836950WsP;
import X.AnonymousClass0956;
import X.C0PEM;
import X.C0SY5;
import X.C15L7;
import X.C15L8;
import X.C1C7U;
import X.C20432614xI;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC20343914iz;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS0S1510000_31 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public boolean z6;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InterfaceC497601wk interfaceC497601wkLIZ;
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ((Activity) this.l1);
        if (lifecycleOwnerLIZIZ == null || (interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZIZ)) == null) {
            interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wkLIZ, C0PEM.LIZJ, null, new C20432614xI((Activity) this.l1, this.s0, (List) this.l2, (CredentialManagerService) this.l3, this.z6, (Intent) this.l4, (InterfaceC20343914iz) this.l5, null), 2);
        String str = CredentialManagerService.LIZ;
        CredentialManagerService.LJ = anonymousClass0956LIZLLL;
        CredentialManagerService.LJFF.put(Integer.valueOf(((Activity) this.l1).getTaskId()), anonymousClass0956LIZLLL);
    }

    public static final void run$0(ARunnableS0S1510000_31 aRunnableS0S1510000_31) {
        boolean zLIZ;
        C1C7U.LIZ("CredentialManagerService@16d5.getSavedCredentialsForLogin$1");
        try {
            aRunnableS0S1510000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CredentialManagerService@16d5.getSavedCredentialsForLogin$1");
    }

    public static final void run$1(ARunnableS0S1510000_31 aRunnableS0S1510000_31) {
        C15L8 c15l8 = (C15L8) aRunnableS0S1510000_31.l1;
        Activity activity = (Activity) aRunnableS0S1510000_31.l2;
        MusicModel musicModel = (MusicModel) aRunnableS0S1510000_31.l3;
        C15L7 c15l7 = (C15L7) aRunnableS0S1510000_31.l4;
        boolean z = aRunnableS0S1510000_31.z6;
        Boolean bool = (Boolean) aRunnableS0S1510000_31.l5;
        String str = aRunnableS0S1510000_31.s0;
        c15l8.getClass();
        C1C7U.LIZ("MusicRecordService@49d8.startRecord$1$onMusicDownloadStart$1L");
        c15l8.LLJJL.LJ(activity, musicModel, c15l7, z, bool.booleanValue(), str);
        C1C7U.LIZIZ("MusicRecordService@49d8.startRecord$1$onMusicDownloadStart$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS0S1510000_31(Object obj, Activity activity, String str, List<AbstractC836950WsP> list, CredentialManagerService credentialManagerService, boolean z, Intent intent, InterfaceC20343914iz interfaceC20343914iz) {
        this.$t = interfaceC20343914iz;
        this.l1 = obj;
        this.s0 = activity;
        this.l2 = str;
        this.l3 = list;
        this.z6 = credentialManagerService;
        this.l4 = z;
        this.l5 = intent;
    }
}
