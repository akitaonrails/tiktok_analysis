package X;

import X.InterfaceC1112050f2p;
import Y.AObjectS392S0100000_17;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LivePublicScreenVisibleLogSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: X.0f2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1112030f2n<T extends InterfaceC1112050f2p> extends AbstractC945390ai1<T> implements InterfaceC1110630f0X {
    public final C1112010f2l LL = new C1112010f2l();
    public PinMessageViewModel LLILLJJLI;
    public C1113050f4R LLILLL;

    public abstract void LJJJJLL();

    @Override // X.InterfaceC1111820f2S
    public final void LIZJ() {
        C1112010f2l c1112010f2l = this.LL;
        if (c1112010f2l.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) c1112010f2l.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJJJJI();
        }
    }

    @Override // X.InterfaceC1110630f0X
    public final long LJJJIL() {
        return this.LL.LIZJ;
    }

    public AbstractC1112030f2n() {
        LJJJJLL();
    }

    @Override // X.InterfaceC1111820f2S
    public final void LIZIZ(InterfaceC1112060f2q interfaceC1112060f2q) {
        C1112010f2l c1112010f2l = this.LL;
        if (!c1112010f2l.LJII) {
            Iterator it2 = ((ArrayList) c1112010f2l.LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1112020f2m) it2.next()).LJIIZILJ(interfaceC1112060f2q);
            }
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJIIIIZZ(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LJIJI(abstractC1111810f2R);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJIJ(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LJJII(abstractC1111810f2R);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJIJJLI(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LJJJIL(abstractC1111810f2R);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJJI(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LJJIZ(abstractC1111810f2R);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJJIFFI(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LJJ(abstractC1111810f2R);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJJIIZI(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LIZ(abstractC1111810f2R);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJJIJ(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LJJIFFI(abstractC1111810f2R);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJJIJLIJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        C1112010f2l c1112010f2l = this.LL;
        if (!c1112010f2l.LJII) {
            Iterator it2 = ((ArrayList) c1112010f2l.LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1112020f2m) it2.next()).LJ(interfaceC1112060f2q);
            }
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJJJ(AbstractC1111020f1A<? extends InterfaceC1112060f2q> abstractC1111020f1A) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LJIIL(abstractC1111020f1A);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJJJJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        C1112010f2l c1112010f2l = this.LL;
        if (!c1112010f2l.LJII) {
            Iterator it2 = ((ArrayList) c1112010f2l.LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1112020f2m) it2.next()).LJJIIZ();
            }
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJJJJIZL(AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LJJIJ(abstractC1111810f2R);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJJJJL(InterfaceC1112060f2q interfaceC1112060f2q) {
        C1112010f2l c1112010f2l = this.LL;
        if (!c1112010f2l.LJII) {
            Iterator it2 = ((ArrayList) c1112010f2l.LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1112020f2m) it2.next()).LJJIL(c1112010f2l.LIZIZ, interfaceC1112060f2q);
            }
            c1112010f2l.LIZIZ++;
        }
    }

    @Override // X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    public void attachView(T t) {
        super.attachView(t);
        if (LivePublicScreenVisibleLogSetting.INSTANCE.getValue()) {
            C1113050f4R c1113050f4R = this.LLILLL;
            Objects.requireNonNull(t);
            c1113050f4R.LLFFF = new AObjectS392S0100000_17(t, 22);
        }
    }

    @Override // X.InterfaceC1111820f2S
    public final void LJIIL(AbstractC1111020f1A<? extends InterfaceC1112060f2q> abstractC1111020f1A, AbstractC1111810f2R<? extends InterfaceC1112060f2q, ? extends AbstractC1111020f1A<? extends InterfaceC1112060f2q>> abstractC1111810f2R) {
        Iterator it2 = ((ArrayList) this.LL.LJFF).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112100f2u) it2.next()).LJI(abstractC1111020f1A, abstractC1111810f2R);
        }
    }
}
