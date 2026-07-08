package X;

import android.app.Activity;
import fi1.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0xuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837520xuw<RESPONSE, FETCH_PARAM_GLOBAL extends fi1.a> extends AbstractC1837630xv7<FETCH_PARAM_GLOBAL> {
    public final Class<FETCH_PARAM_GLOBAL> LLILZ;
    public C1837750xvJ LLILZIL;
    public FETCH_PARAM_GLOBAL LLILZLL;

    public abstract AbstractC1837520xuw<RESPONSE, FETCH_PARAM_GLOBAL>.a LJIIIIZZ(RESPONSE response);

    public abstract void LJIIIZ(RESPONSE response);

    public abstract C470590Icr<RESPONSE> LJIIJ();

    public abstract Object LJIIJJI(InterfaceC1364105Vn<? super C470590Icr<RESPONSE>> interfaceC1364105Vn);

    public abstract void LJIIL(Object obj);

    @Override // X.AbstractC1837630xv7
    public final void LJII() {
        InterfaceC497601wk interfaceC497601wkLIZ;
        WeakReference<Activity> weakReference;
        Activity activity;
        FETCH_PARAM_GLOBAL fetch_param_global = this.LLILZLL;
        if (fetch_param_global == null || (weakReference = fetch_param_global.LIZ) == null || (activity = weakReference.get()) == null || (interfaceC497601wkLIZ = C1064790dob.LIZ(activity, null)) == null) {
            interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        }
        C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C1837510xuv(this, null), 3);
    }

    @Override // X.AbstractC1837630xv7, X.AbstractC1837840xvS
    public final void LJI(C1404610meh c1404610meh) {
        this.LLILZLL = (AbstractC1837700xvE) C1837820xvQ.LIZ(c1404610meh, this.LLILZ);
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1837750xvJ) {
                if (next != null) {
                    this.LLILZIL = (C1837750xvJ) next;
                    super.LJI(c1404610meh);
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.comp.api.pcs.infra.payment.model.IapFetchParamContainer");
    }

    /* JADX INFO: renamed from: X.0xuw$a */
    public final class a {
        public final boolean LIZ;
        public final AbstractC1837220xuS LIZIZ;

        public a(boolean z, AbstractC1837220xuS abstractC1837220xuS) {
            this.LIZ = z;
            this.LIZIZ = abstractC1837220xuS;
        }
    }

    public AbstractC1837520xuw(Class cls, EnumC1837330xud enumC1837330xud) {
        super(enumC1837330xud);
        this.LLILZ = cls;
    }
}
