package X;

import android.app.Activity;
import fi1.b;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0xux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837530xux<RESPONSE, DATA_GLOBAL extends b> extends AbstractC1837630xv7<DATA_GLOBAL> {
    public final Class<DATA_GLOBAL> LLILZ;
    public DATA_GLOBAL LLILZIL;

    public abstract AbstractC1837530xux<RESPONSE, DATA_GLOBAL>.a LJIIIIZZ(RESPONSE response);

    public abstract String LJIIIZ(RESPONSE response);

    public abstract String LJIIJ(RESPONSE response);

    public abstract Object LJIIJJI(InterfaceC1364105Vn<? super C470590Icr<RESPONSE>> interfaceC1364105Vn);

    @Override // X.AbstractC1837630xv7
    public final void LJII() {
        InterfaceC497601wk interfaceC497601wkLIZ;
        Activity activity;
        DATA_GLOBAL data_global = this.LLILZIL;
        WeakReference<Activity> weakReference = data_global != null ? data_global.LIZ : null;
        C0W0R.LIZ(weakReference != null ? weakReference.get() : null);
        if (weakReference == null || (activity = weakReference.get()) == null || (interfaceC497601wkLIZ = C1064790dob.LIZ(activity, null)) == null) {
            interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        }
        C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C1837500xuu(this, null), 3);
    }

    @Override // X.AbstractC1837630xv7, X.AbstractC1837840xvS
    public final void LJI(C1404610meh c1404610meh) {
        this.LLILZIL = (AbstractC1837710xvF) C1837820xvQ.LIZ(c1404610meh, this.LLILZ);
        super.LJI(c1404610meh);
    }

    /* JADX INFO: renamed from: X.0xux$a */
    public final class a {
        public final boolean LIZ;
        public final AbstractC1837350xuf LIZIZ;

        public a(boolean z, AbstractC1837350xuf abstractC1837350xuf) {
            this.LIZ = z;
            this.LIZIZ = abstractC1837350xuf;
        }
    }

    public AbstractC1837530xux(Class cls, EnumC1837330xud enumC1837330xud) {
        super(enumC1837330xud);
        this.LLILZ = cls;
    }
}
