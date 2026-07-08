package X;

import Y.AComparatorS43S0000000_24;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1623220sLI implements InterfaceC1623390sLZ {
    public final LifecycleOwner LL;
    public final InterfaceC1463990oCT LLILLJJLI;
    public volatile boolean LLILLL;
    public InterfaceC1623190sLF LLJI;
    public final C11PQ<AbstractC1557360qd4> LLJILJIL;
    public final C19475711Hn LLJILJILJ;
    public final C11PQ<EnumC1159860gHw> LLJILLL;
    public final C19475711Hn LLJJ;
    public final List<InterfaceC1622080sJS> LLILZ = Collections.synchronizedList(new ArrayList());
    public final List<InterfaceC1159800gHq> LLILZIL = new ArrayList();
    public final List<InterfaceC1635880sfi> LLILZLL = new ArrayList();
    public final CopyOnWriteArrayList<InterfaceC1623110sL7> LLIZ = new CopyOnWriteArrayList<>();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 762));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 761));
    public final SafeHandler LLJIJIL = new SafeHandler(getLifecycleOwner());

    public C1628610sTz LIZLLL() {
        return null;
    }

    public abstract C0LH1 vS0();

    public final C1623230sLJ LIZJ() {
        return (C1623230sLJ) this.LLJ.getValue();
    }

    public final void qf() {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseStickerModule#observerStickerSelectedStateChange1:isStickerHandlerLoaded:");
        sbLIZ.append(this.LLILLL);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        InterfaceC1625520sP0 interfaceC1625520sP0 = new InterfaceC1625520sP0() { // from class: X.0sLK
            @Override // X.InterfaceC1625520sP0
            public final void LIZ(C1627360sRy c1627360sRy) {
                String effectId;
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BaseStickerModule#onStickerCancel:listener:");
                sbLIZ2.append(this);
                sbLIZ2.append(";effectId:");
                Effect effect = c1627360sRy.LIZ;
                if (effect != null) {
                    effectId = effect.getEffectId();
                } else {
                    effectId = null;
                }
                sbLIZ2.append(effectId);
                interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LIZIZ(c1627360sRy);
            }

            @Override // X.InterfaceC1625520sP0
            public final void LIZIZ(C1627370sRz c1627370sRz) {
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BaseStickerModule#onStickerChosen:listener:");
                sbLIZ2.append(this);
                sbLIZ2.append(";effectId:");
                sbLIZ2.append(c1627370sRz.LIZ.getEffectId());
                interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
                this.LL.LIZIZ(c1627370sRz);
            }
        };
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BaseStickerModule#observerStickerSelectedStateChange2:listener:");
        sbLIZ2.append(interfaceC1625520sP0);
        interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
        w4().LJFF(interfaceC1625520sP0);
    }

    @Override // X.InterfaceC1623390sLZ
    public final InterfaceC1623190sLF U() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1623390sLZ
    public final SafeHandler b1() {
        return this.LLJIJIL;
    }

    public LifecycleOwner getLifecycleOwner() {
        return this.LL;
    }

    @Override // X.InterfaceC1622570sKF
    public final InterfaceC1622080sJS I2(Function1<? super InterfaceC1622080sJS, Boolean> function1) {
        InterfaceC1622080sJS next;
        Iterator<InterfaceC1622080sJS> it2 = this.LLILZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (function1.invoke(next).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1622080sJS interfaceC1622080sJSI2 = next;
        if (interfaceC1622080sJSI2 == null && (interfaceC1622080sJSI2 = LIZJ().I2(function1)) == null) {
            C1628610sTz c1628610sTzLIZLLL = LIZLLL();
            if (c1628610sTzLIZLLL == null || !function1.invoke(c1628610sTzLIZLLL).booleanValue()) {
                return null;
            }
            return c1628610sTzLIZLLL;
        }
        return interfaceC1622080sJSI2;
    }

    public final void LIZIZ(AbstractC1627380sS0 abstractC1627380sS0) {
        ArrayList arrayList = new ArrayList();
        C1628610sTz c1628610sTzLIZLLL = LIZLLL();
        if (c1628610sTzLIZLLL != null) {
            arrayList.add(c1628610sTzLIZLLL);
        }
        arrayList.add(LIZJ());
        arrayList.addAll(this.LLILZ);
        arrayList.add(this.LLIZLLLIL.getValue());
        new C1622500sK8(C13LP.LJLLLL(new AComparatorS43S0000000_24(7), arrayList), 0, this.LLILLJJLI).LIZ(abstractC1627380sS0);
    }

    public final void rf(InterfaceC1623190sLF interfaceC1623190sLF) {
        this.LLJI = interfaceC1623190sLF;
        interfaceC1623190sLF.k2().LIZIZ(this.LLJILJIL);
        interfaceC1623190sLF.li().LIZIZ(this.LLJILLL);
        interfaceC1623190sLF.Bo(new InterfaceC1159800gHq() { // from class: X.0gIT
            @Override // X.InterfaceC1159800gHq
            public final void LJI() {
                Iterator<InterfaceC1159800gHq> it2 = this.LL.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LJI();
                }
            }

            @Override // X.InterfaceC1159800gHq
            public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
                Iterator<InterfaceC1159800gHq> it2 = this.LL.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL(enumC1155090gAF);
                }
            }

            @Override // X.InterfaceC1159800gHq
            public final void LJIIIZ(View view) {
                Iterator<InterfaceC1159800gHq> it2 = this.LL.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIIIZ(view);
                }
            }

            @Override // X.InterfaceC1159800gHq
            public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
                Iterator<InterfaceC1159800gHq> it2 = this.LL.LLILZIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIIZILJ(enumC1155090gAF);
                }
            }
        });
    }

    public AbstractC1623220sLI(LifecycleOwner lifecycleOwner, InterfaceC1463990oCT interfaceC1463990oCT) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC1463990oCT;
        C11PQ<AbstractC1557360qd4> c11pq = new C11PQ<>();
        this.LLJILJIL = c11pq;
        this.LLJILJILJ = new C19475711Hn(c11pq);
        C11PQ<EnumC1159860gHw> c11pq2 = new C11PQ<>();
        this.LLJILLL = c11pq2;
        this.LLJJ = new C19475711Hn(c11pq2);
    }

    public final void LIZ(InterfaceC1622080sJS interfaceC1622080sJS, boolean z) {
        if (z) {
            if (!this.LLILZ.contains(interfaceC1622080sJS)) {
                this.LLILZ.add(interfaceC1622080sJS);
            }
        } else {
            C1623230sLJ c1623230sLJLIZJ = LIZJ();
            if (!c1623230sLJLIZJ.LL.contains(interfaceC1622080sJS)) {
                c1623230sLJLIZJ.LL.add(interfaceC1622080sJS);
            }
        }
        if ((interfaceC1622080sJS instanceof InterfaceC1159800gHq) && !((ArrayList) this.LLILZIL).contains(interfaceC1622080sJS)) {
            ((ArrayList) this.LLILZIL).add(interfaceC1622080sJS);
        }
        if ((interfaceC1622080sJS instanceof InterfaceC1635880sfi) && !((ArrayList) this.LLILZLL).contains(interfaceC1622080sJS)) {
            ((ArrayList) this.LLILZLL).add(interfaceC1622080sJS);
        }
        if ((interfaceC1622080sJS instanceof InterfaceC1623110sL7) && !this.LLIZ.contains(interfaceC1622080sJS)) {
            this.LLIZ.add(interfaceC1622080sJS);
        }
    }
}
