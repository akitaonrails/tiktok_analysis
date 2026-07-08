package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0tIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660030tIf extends AbstractC2255721DQs<InterfaceC1658490tGB> implements InterfaceC379610EuV, InterfaceC1658490tGB {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final C1660030tIf LLILLJJLI = this;
    public final C1660010tId LLILLL;
    public final InterfaceC332260D0u<Set<InterfaceC1660190tIv>> LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final InterfaceC346201Wa<Effect> LLILZLL;
    public volatile Effect LLIZ;
    public final C05YD<C1660100tIm<InterfaceC1659860tIO>> LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1660030tIf.class, "stickerComponent", "getStickerComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = 8;
    }

    public static /* synthetic */ void Z1() {
    }

    private final q yq() {
        return (q) this.LLILZIL.getValue(this, LLJ[0]);
    }

    public C1660030tIf X1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1658490tGB
    public /* bridge */ /* synthetic */ InterfaceC346201Wa getState() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1658490tGB
    public C05YD<C1660100tIm<InterfaceC1659860tIO>> getState() {
        return this.LLIZLLLIL;
    }

    public C1660030tIf(C1DRG c1drg) {
        InterfaceC346201Wa<Effect> c516501zn;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        C095D c095dLJJ;
        this.LL = c1drg;
        C1660010tId c1660010tId = new C1660010tId(getDiContainer());
        this.LLILLL = c1660010tId;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C08CX.INSTANCE);
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        q qVarYq = yq();
        if (qVarYq != null && (interfaceC1624480sNKC0 = qVarYq.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (c095dLJJ = interfaceC1625470sOvLJII.LJJ()) != null) {
            c516501zn = new C2325381G0q(c095dLJJ, new C1331205Iw(null), 2);
        } else {
            c516501zn = new C516501zn(null, 1);
        }
        this.LLILZLL = c516501zn;
        C1698260uIK c1698260uIK = new C1698260uIK(C09IC.LJJIZ(C09IC.LJIIIIZZ(c1660010tId.LLILZ, c2252321DDqLIZ, c516501zn, new C1660040tIg(null, this)), new C1660140tIq(null, this)), this, 7);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ);
        C05YW.LIZ.getClass();
        this.LLIZLLLIL = C09IC.LJJIJIL(c1698260uIK, c054gLIZ, C1370905Yd.LIZIZ, new C1660100tIm(new ArrayList(), EnumC1083770eJD.TOP, new C1660070tIj(this)));
    }

    private final void o2(InterfaceC1660190tIv interfaceC1660190tIv) {
        Object next;
        if (w2(interfaceC1660190tIv, this.LLIZ)) {
            return;
        }
        C1660010tId c1660010tId = this.LLILLL;
        Class<?> cls = interfaceC1660190tIv.getClass();
        C443120HZe c443120HZe = (C443120HZe) ((C1657360tEM) c1660010tId.LLILLJJLI.getValue(c1660010tId, C1660010tId.LLILZIL[0])).LLILZ.getValue();
        List list = (List) ((LinkedHashMap) c1660010tId.LLILLL).get(new Pair(Integer.valueOf(((Number) c443120HZe.getFirst()).intValue()), Integer.valueOf(((Number) c443120HZe.getSecond()).intValue())));
        InterfaceC1660130tIp interfaceC1660130tIp = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (cls.isInstance(((C443120HZe) next).getFirst())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C443120HZe c443120HZe2 = (C443120HZe) next;
            if (c443120HZe2 != null) {
                interfaceC1660130tIp = (InterfaceC1660130tIp) c443120HZe2.getThird();
            }
        }
        if ((interfaceC1660130tIp instanceof InterfaceC1660130tIp) && interfaceC1660130tIp != null) {
            interfaceC1660130tIp.LIZIZ();
        }
    }

    public final void W1(InterfaceC1660190tIv interfaceC1660190tIv, InterfaceC1660090tIl interfaceC1660090tIl) {
        if (interfaceC1660090tIl instanceof C1660220tIy) {
            o2(interfaceC1660190tIv);
        } else if ((interfaceC1660090tIl instanceof C1661410tKt) || (interfaceC1660090tIl instanceof C1460150o6H)) {
        } else {
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1658490tGB
    public void WF1(InterfaceC1660190tIv interfaceC1660190tIv, boolean z) {
        if (!z) {
            InterfaceC332260D0u<Set<InterfaceC1660190tIv>> interfaceC332260D0u = this.LLILZ;
            interfaceC332260D0u.setValue(C15442062u.LJIIIIZZ(interfaceC1660190tIv, interfaceC332260D0u.getValue()));
        } else {
            InterfaceC332260D0u<Set<InterfaceC1660190tIv>> interfaceC332260D0u2 = this.LLILZ;
            interfaceC332260D0u2.setValue(C15442062u.LJI(interfaceC1660190tIv, interfaceC332260D0u2.getValue()));
        }
    }

    public final boolean w2(InterfaceC1660190tIv interfaceC1660190tIv, Effect effect) {
        if (effect == null || !Intrinsics.LJFF(interfaceC1660190tIv, C1659940tIW.LIZ)) {
            return false;
        }
        return C1624570sNT.LJIJ(effect);
    }
}
