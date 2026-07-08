package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.197o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214882197o implements InterfaceC214889197v {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Function0<Gson> LIZ;
    public final List<InterfaceC1631620sYq<Effect, ExtraParams, Gson, InterfaceC194555119t>> LIZIZ;
    public C197D LIZJ;

    public C214882197o(AFwS223S0000000_32 aFwS223S0000000_32) {
        this.LIZ = aFwS223S0000000_32;
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        arrayList.add(new AwS681S0100000_32(this, 7));
        arrayList.add(new AwS681S0100000_32(this, 9));
    }

    @Override // X.InterfaceC214889197v
    public final InterfaceC194555119t LIZ(Effect effect) {
        boolean z;
        ExtraParams extraParams;
        if (effect == null) {
            return new AnonymousClass1980();
        }
        Gson gsonInvoke = this.LIZ.invoke();
        String extra = effect.getExtra();
        if (extra != null && extra.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                extraParams = (ExtraParams) gsonInvoke.LJII(extra, ExtraParams.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extraParams = null;
            }
        } else {
            extraParams = null;
        }
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            InterfaceC194555119t interfaceC194555119t = (InterfaceC194555119t) ((InterfaceC1631620sYq) it2.next()).invoke(effect, extraParams, gsonInvoke);
            if (interfaceC194555119t != null) {
                return interfaceC194555119t;
            }
        }
        return new C1653740t8W(C1655210tAt.LIZ(effect));
    }

    @Override // X.InterfaceC214889197v
    public final InterfaceC194555119t LIZIZ(Effect effect, C1628630sU1 c1628630sU1, C1628640sU2 c1628640sU2) {
        return new AnonymousClass1980();
    }
}
