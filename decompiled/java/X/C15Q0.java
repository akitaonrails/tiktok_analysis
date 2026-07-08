package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.15Q0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15Q0 implements InterfaceC19576611iW {
    public final /* synthetic */ InterfaceC1389750mGj LIZ;

    public C15Q0(InterfaceC1389750mGj interfaceC1389750mGj) {
        this.LIZ = interfaceC1389750mGj;
    }

    @Override // X.InterfaceC19576611iW
    public final void LIZ(int i, Effect effect) {
        boolean z;
        InterfaceC1389750mGj interfaceC1389750mGj = this.LIZ;
        if (i == 2006) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1389750mGj.doAfterDownLoad(i, Boolean.valueOf(z));
    }
}
