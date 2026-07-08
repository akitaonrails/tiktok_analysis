package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.197n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214881197n implements InterfaceC214889197v {
    public static final /* synthetic */ int LJII = 0;
    public final Function0<Gson> LIZ;
    public final C1DRG LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final List<InterfaceC1631620sYq<Effect, ExtraParams, Gson, InterfaceC194555119t>> LJ;
    public final List<InterfaceC1631620sYq<Effect, ExtraParams, Gson, InterfaceC194555119t>> LJFF;
    public C197C LJI;

    @Override // X.InterfaceC214889197v
    public final InterfaceC194555119t LIZ(Effect effect) {
        boolean z;
        ExtraParams extraParams;
        List<InterfaceC1631620sYq<Effect, ExtraParams, Gson, InterfaceC194555119t>> list;
        if (effect == null) {
            return new AnonymousClass1980();
        }
        Gson gsonInvoke = this.LIZ.invoke();
        String extra = effect.getExtra();
        boolean zLIZIZ = false;
        if (extra != null && extra.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        InterfaceC194555119t interfaceC194555119t = null;
        if (!z) {
            try {
                extraParams = (ExtraParams) gsonInvoke.LJII(extra, ExtraParams.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extraParams = null;
            }
            if (extraParams == null || true != extraParams.enableNewPrompt()) {
                list = this.LJ;
            } else {
                list = this.LJFF;
            }
        } else {
            extraParams = null;
            list = this.LJ;
        }
        Iterator<InterfaceC1631620sYq<Effect, ExtraParams, Gson, InterfaceC194555119t>> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC194555119t interfaceC194555119tInvoke = it2.next().invoke(effect, extraParams, gsonInvoke);
            if (interfaceC194555119tInvoke != null) {
                interfaceC194555119t = interfaceC194555119tInvoke;
                break;
            }
        }
        if (C291020Bau.LIZ()) {
            if (C291020Bau.LIZ()) {
                C1446130njf.LIZ.getClass();
                zLIZIZ = C1446130njf.LIZIZ(effect, "is_hint_present", false);
            }
            if (interfaceC194555119t == null) {
                return new C1653740t8W(C1655210tAt.LIZ(effect), Boolean.valueOf(zLIZIZ));
            }
            return interfaceC194555119t;
        }
        if (interfaceC194555119t == null) {
            return new C1653740t8W(C1655210tAt.LIZ(effect));
        }
        return interfaceC194555119t;
    }

    @Override // X.InterfaceC214889197v
    public final InterfaceC194555119t LIZIZ(Effect effect, C1628630sU1 c1628630sU1, C1628640sU2 c1628640sU2) {
        return new AnonymousClass1980();
    }

    public C214881197n(AFwS219S0000000_30 aFwS219S0000000_30, C1DRG c1drg, View view, View view2) {
        this.LIZ = aFwS219S0000000_30;
        this.LIZIZ = c1drg;
        this.LIZJ = view;
        this.LIZLLL = view2;
        ArrayList arrayList = new ArrayList();
        this.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJFF = arrayList2;
        arrayList.add(new AwS681S0100000_32(this, 19));
        arrayList.add(new AwS681S0100000_32(this, 20));
        arrayList2.add(new AwS681S0100000_32(this, 21));
        arrayList2.add(new AwS681S0100000_32(this, 22));
    }
}
