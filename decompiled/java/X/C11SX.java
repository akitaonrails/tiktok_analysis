package X;

import Y.AkS490S0100000_29;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: renamed from: X.11SX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11SX<K, V> implements InterfaceC19505211Sw<K, V> {
    public final WeakReference<InterfaceC1305030k45<Pair<K, V>>> LIZ;

    @Override // X.InterfaceC19505211Sw
    public final InterfaceC1305030k45<Pair<K, V>> LIZIZ() {
        return this.LIZ.get();
    }

    public C11SX(InterfaceC1305030k45<Pair<K, V>> interfaceC1305030k45) {
        this.LIZ = new WeakReference<>(interfaceC1305030k45);
    }

    public static C11J7 LJII(final C11ON c11on, boolean z) {
        if (z) {
            C11NZ c11nzLJLLLL = new C11RK().LJLLLL();
            final AkS490S0100000_29 akS490S0100000_29 = new AkS490S0100000_29(AFwS256S0000000_18.get$arr$(1008), 30);
            final int i = C11NN.LL;
            C1701890uOB.LIZIZ(i, "bufferSize");
            new C11J7<T, C098L<K, V>>(c11on, akS490S0100000_29, i) { // from class: X.11Qv
                public final InterfaceC1487280oo2<? super T, ? extends K> LLILLJJLI;
                public final InterfaceC1487280oo2<? super T, ? extends V> LLILLL;
                public final int LLILZ;
                public final boolean LLILZIL;

                @Override // X.C11NZ
                public final void LJJZZIII(InterfaceC626120Oh8<? super C098L<K, V>> interfaceC626120Oh8) {
                    this.LL.LIZIZ(new C19499811Qu(interfaceC626120Oh8, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
                }

                {
                    C1076630e7h c1076630e7h = C19487811Me.LIZ;
                    this.LLILLJJLI = akS490S0100000_29;
                    this.LLILLL = c1076630e7h;
                    this.LLILZ = i;
                    this.LLILZIL = false;
                }
            }.LJJJ(new AkS490S0100000_29(AFwS273S0000000_29.get$arr$(469), 31), false).LIZIZ(c11nzLJLLLL);
            return c11nzLJLLLL.LJI(100L, TimeUnit.MILLISECONDS).LJJIL(new C517401zw(AnonymousClass0207.get$arr$(156), 4));
        }
        return c11on.LJJJJZI(new AkS490S0100000_29(AFwS229S0000000_2.get$arr$(882), 32));
    }
}
