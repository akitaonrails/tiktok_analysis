package X;

import X.C05YF;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2216521Bp4<T extends C05YF, ROOT, LEAF> extends AbstractC2255721DQs<T> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C2216441Bow.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C1456610o0Z.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS578S0100000_34((AbstractC2216521Bp4) this, 14));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC2216521Bp4.class, "creationScope", "getCreationScope()Lcom/bytedance/creationmodel/framework/CreationScope;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC2216521Bp4.class, "scopeTypeValue", "getScopeTypeValue()Lcom/bytedance/creationmodel/core/ScopeTypeValue;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public abstract InterfaceC1555820qaa<LEAF> Z1();

    private final InterfaceC2216511Bp3<?> G2() {
        return (InterfaceC2216511Bp3) this.LLILZ.getValue();
    }

    public final C2216441Bow W1() {
        return (C2216441Bow) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    public final C1456610o0Z w2() {
        return (C1456610o0Z) this.LLILLL.getValue(this, LLILZIL[1]);
    }

    public final LEAF H2() {
        if (Z1() instanceof C1555860qae) {
            LEAF leafX1 = X1();
            if (leafX1 != null) {
                return leafX1;
            }
            throw new IllegalArgumentException("not init");
        }
        if (!(Z1() instanceof C1555850qad)) {
            throw new IllegalArgumentException("impossible");
        }
        LEAF leafX12 = X1();
        if (leafX12 != null) {
            return leafX12;
        }
        throw new IllegalArgumentException("value is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, androidx.lifecycle.MutableLiveData] */
    public final InterfaceC2216401Bos<LEAF, LEAF> T2() {
        C2216431Bov c2216431BovLIZ;
        MutableLiveData<T> mutableLiveData;
        if (!(Z1() instanceof C1555860qae)) {
            if (Z1() instanceof C1555850qad) {
                return W1().LIZIZ((C1555850qad) Z1());
            }
            throw new IllegalArgumentException("impossible");
        }
        C2216441Bow c2216441BowW1 = W1();
        C1555860qae c1555860qae = (C1555860qae) Z1();
        C2216461Boy c2216461Boy = c2216441BowW1.LJIIIZ;
        c2216461Boy.getClass();
        Class<?> cls = c1555860qae.LIZ;
        C259800zU c259800zU = new C259800zU();
        synchronized (c2216461Boy) {
            c2216431BovLIZ = c2216461Boy.LIZ.LIZ(cls);
        }
        if (c2216431BovLIZ == null || (mutableLiveData = c2216431BovLIZ.LIZIZ) == 0 || mutableLiveData.getValue() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(cls);
            sbLIZ.append(" not found");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C2216391Bor c2216391Bor = InterfaceC2216401Bos.LIZ;
        new AwS558S0100000_14(mutableLiveData, 1470);
        AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(mutableLiveData, 161);
        c2216391Bor.getClass();
        c259800zU.element = awS578S0100000_34.invoke();
        for (C2216581BpA c2216581BpA : C13LP.LLIIII(c1555860qae.LIZJ)) {
            LiveData liveData = (LiveData) c259800zU.element;
            final InterfaceC2217241BqE<?, ?> interfaceC2217241BqE = c2216581BpA.LIZIZ;
            c259800zU.element = C2216641BpG.LIZ(liveData, new InterfaceC2287108xh() { // from class: X.1BpO
                @Override // X.InterfaceC2287108xh
                public final Object apply(Object obj) {
                    return interfaceC2217241BqE.invoke(obj);
                }
            });
        }
        C2216391Bor c2216391Bor2 = InterfaceC2216401Bos.LIZ;
        AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(c259800zU, (C259800zU<LiveData<Object>>) 138);
        AwS547S0100000_3 awS547S0100000_32 = new AwS547S0100000_3(c259800zU, (C259800zU<LiveData<Object>>) 139);
        c2216391Bor2.getClass();
        return new C2216491Bp1(awS547S0100000_3, awS547S0100000_32);
    }

    public final LEAF X1() {
        if (Z1() instanceof C1555860qae) {
            return o2().get();
        }
        if (Z1() instanceof C1555850qad) {
            return o2().get();
        }
        throw new IllegalArgumentException("impossible");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, androidx.lifecycle.MutableLiveData] */
    public final InterfaceC2216401Bos<LEAF, LEAF> o2() {
        C2216431Bov c2216431BovLIZIZ;
        if (!(Z1() instanceof C1555860qae)) {
            if (Z1() instanceof C1555850qad) {
                return W1().LIZIZ((C1555850qad) Z1());
            }
            throw new IllegalArgumentException("impossible");
        }
        C2216441Bow c2216441BowW1 = W1();
        C1555860qae c1555860qae = (C1555860qae) Z1();
        C2216461Boy c2216461Boy = c2216441BowW1.LJIIIZ;
        c2216461Boy.getClass();
        Class<?> cls = c1555860qae.LIZ;
        C259800zU c259800zU = new C259800zU();
        synchronized (c2216461Boy) {
            c2216431BovLIZIZ = c2216461Boy.LIZ.LIZIZ(cls);
        }
        MutableLiveData<T> mutableLiveData = c2216431BovLIZIZ.LIZIZ;
        C2216391Bor c2216391Bor = InterfaceC2216401Bos.LIZ;
        new AwS576S0100000_32(mutableLiveData, 702);
        AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(mutableLiveData, 160);
        c2216391Bor.getClass();
        c259800zU.element = awS578S0100000_34.invoke();
        for (C2216581BpA c2216581BpA : C13LP.LLIIII(c1555860qae.LIZJ)) {
            LiveData liveData = (LiveData) c259800zU.element;
            final InterfaceC2217241BqE<?, ?> interfaceC2217241BqE = c2216581BpA.LIZIZ;
            c259800zU.element = C2216641BpG.LIZ(liveData, new InterfaceC2287108xh() { // from class: X.1BpP
                @Override // X.InterfaceC2287108xh
                public final Object apply(Object obj) {
                    return interfaceC2217241BqE.invoke(obj);
                }
            });
        }
        C2216391Bor c2216391Bor2 = InterfaceC2216401Bos.LIZ;
        C5182020e c5182020e = new C5182020e(c259800zU, (C259800zU<JSONObject>) 416);
        AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(c259800zU, (C259800zU<LiveData<Object>>) 136);
        c2216391Bor2.getClass();
        return new C2216491Bp1(c5182020e, awS547S0100000_3);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC2216521Bp4(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W2(Function1<? super LEAF, ? extends LEAF> function1) {
        if (Z1() instanceof C1555860qae) {
            if (W1().LIZ(Z1().getSourceType()) != null) {
                G2().LIZ(function1);
                return;
            }
            throw new IllegalStateException("Value not set");
        }
        if (!(Z1() instanceof C1555850qad) || W1().LIZ(Z1().getSourceType()) == null) {
            return;
        }
        G2().LIZ(new AwS613S0100000_34(function1, 6));
    }
}
