package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.10mk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19348010mk implements InterfaceC19348110ml {
    public final Context LIZ;
    public final BPEAHandler LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC19348110ml
    public final void LIZ(C19349110mv c19349110mv) {
        if (c19349110mv.LJFF != 0) {
            ARunnableS98S0200000_29 aRunnableS98S0200000_29 = new ARunnableS98S0200000_29(c19349110mv, this, 47);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                aRunnableS98S0200000_29.run();
            } else {
                C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS103S0100000_3((Object) aRunnableS98S0200000_29, 78));
            }
        }
    }

    public C19348010mk(Context context, String str) {
        this.LIZ = context;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[UGCloud ");
        sbLIZ.append(str);
        sbLIZ.append(e3.f);
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = new BPEAHandler(Looper.getMainLooper());
    }
}
