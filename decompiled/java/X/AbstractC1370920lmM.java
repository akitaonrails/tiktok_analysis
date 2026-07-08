package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.AwS144S0201000_21;

/* JADX INFO: renamed from: X.0lmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1370920lmM implements InterfaceC1369750lkT {
    public final Context LL;
    public final BaseSharePackage LLILLJJLI;

    public abstract void LIZ(InterfaceC1370310llN interfaceC1370310llN, int i);

    @Override // X.InterfaceC1369750lkT
    public void LJIIIIZZ() {
    }

    public AbstractC1370920lmM(Context context, BaseSharePackage baseSharePackage) {
        this.LL = context;
        this.LLILLJJLI = baseSharePackage;
    }

    @Override // X.InterfaceC1369750lkT, X.InterfaceC1373860lr6
    public final void LIZIZ(InterfaceC1370310llN interfaceC1370310llN, int i) {
        BaseSharePackage baseSharePackage = this.LLILLJJLI;
        if (baseSharePackage != null) {
            baseSharePackage.LJIIL(this.LL, interfaceC1370310llN, new AwS144S0201000_21(this, interfaceC1370310llN, i, 1));
        } else {
            LIZ(interfaceC1370310llN, i);
        }
    }
}
