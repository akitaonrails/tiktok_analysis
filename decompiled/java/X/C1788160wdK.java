package X;

import android.app.Application;

/* JADX INFO: renamed from: X.0wdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788160wdK implements InterfaceC560980LzM<C1787830wcn, C1787830wcn> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1788520wdu LIZIZ;
    public final InterfaceC1787890wct LIZJ;
    public final C1788170wdL LIZLLL = new C1788170wdL(this);

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "listen_to_activity_update";
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) {
        C1787830wcn c1787830wcn2 = c1787830wcn;
        Application application = c1787830wcn2.LIZ.getActivity().getApplication();
        C1788170wdL c1788170wdL = this.LIZLLL;
        c1788170wdL.LL = c1787830wcn2;
        application.unregisterActivityLifecycleCallbacks(c1788170wdL);
        application.registerActivityLifecycleCallbacks(c1788170wdL);
        C23250099c.LIZLLL(C352701Yn.LIZ, null, null, new C1411460mpk(application, c1788170wdL, this, c1787830wcn2, null), 3);
        return c1787830wcn2;
    }

    public C1788160wdK(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788520wdu interfaceC1788520wdu, InterfaceC1787890wct interfaceC1787890wct) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1788520wdu;
        this.LIZJ = interfaceC1787890wct;
    }
}
