package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS113S0100000_13;
import Y.AfS136S0000000_13;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.awemepushlib.interaction.PushSheduler;
import com.ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;

/* JADX INFO: renamed from: X.0Vqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810360Vqc {
    public static volatile int LIZ;

    public static void LIZ(Context context, boolean z) {
        AwemeRedBadgerManager awemeRedBadgerManager = AwemeRedBadgerManager.LLILLL;
        awemeRedBadgerManager.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ProcessLifecycleOwner.get().getLifecycle().addObserver(awemeRedBadgerManager);
            C810340Vqa c810340Vqa = C810340Vqa.LIZ;
            C1906580ziK.LIZJ().LIZ().LJJLJLI(C810350Vqb.LL);
            C622680Oba.LIZJ(c810340Vqa);
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(awemeRedBadgerManager, 157));
        }
        C2214201BlK.LIZIZ().LJJLJLI(new AfS136S0000000_13(2));
        C2214201BlK.LJ.LJJLIIJ().LJJLJLI(new AfS136S0000000_13(3));
        if (z) {
            PushSheduler.LIZ.execute(new ARunnableS103S0100000_3(context, 58));
        } else {
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new C2500809r4(context, 0));
        }
    }
}
