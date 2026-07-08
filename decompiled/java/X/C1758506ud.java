package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMessageModelFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.06ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1758506ud {
    public static final C1758506ud LIZ = new C1758506ud();
    public static final ConcurrentHashMap<String, InterfaceC1755906uD> LIZIZ = new ConcurrentHashMap<>();

    public static InterfaceC1755906uD LIZ(String str, String str2) {
        final C1755606uA c1755606uALIZ;
        ConcurrentHashMap<String, InterfaceC1755906uD> concurrentHashMap = LIZIZ;
        InterfaceC1755906uD interfaceC1755906uD = concurrentHashMap.get(str);
        if (interfaceC1755906uD == null) {
            C872690YLj c872690YLjLIZ = C0YNQ.LIZ(InterfaceC1755906uD.LIZ, str, false, false, 24);
            c872690YLjLIZ.LJIIJJI(20);
            c872690YLjLIZ.refresh();
            FakeMessageModelFactory fakeMessageModelFactory = (FakeMessageModelFactory) PluggableExtentionKt.pluggableSpi$default(FakeMessageModelFactory.class, false, false, false, 14, null);
            if (fakeMessageModelFactory != null && (c1755606uALIZ = fakeMessageModelFactory.LIZ(c872690YLjLIZ, str2)) != null) {
                interfaceC1755906uD = new InterfaceC1755906uD(c1755606uALIZ) { // from class: X.06uC
                    public final InterfaceC1755906uD LIZIZ;
                    public final ArrayList<C1DW6> LIZJ = new ArrayList<>();

                    @Override // X.InterfaceC1755906uD
                    public final Object LIZIZ(C912530Zr1 c912530Zr1) {
                        return this.LIZIZ.LIZIZ(c912530Zr1);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LIZJ(long j) {
                        this.LIZIZ.LIZJ(j);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final List<C869590Y9l> LIZLLL() {
                        return this.LIZIZ.LIZLLL();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJ() {
                        this.LIZIZ.LJ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJFF(C1DW6 c1dw6) {
                    }

                    @Override // X.InterfaceC1755906uD
                    public final boolean LJI() {
                        return this.LIZIZ.LJI();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
                        return this.LIZIZ.LJII(interfaceC1364105Vn);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final C869590Y9l LJIIIIZZ() {
                        return this.LIZIZ.LJIIIIZZ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final boolean LJIIIZ() {
                        return this.LIZIZ.LJIIIZ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJIIJ() {
                        this.LIZIZ.LJIIJ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJIIJJI(int i) {
                        this.LIZIZ.LJIIJJI(i);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJIIL() {
                        this.LIZIZ.LJIIL();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final C869590Y9l LJIILJJIL() {
                        return this.LIZIZ.LJIILJJIL();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final boolean LJIJ() {
                        return this.LIZIZ.LJIJ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final boolean LJJJJI() {
                        return this.LIZIZ.LJJJJI();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final int LJJJJIZL() {
                        return this.LIZIZ.LJJJJIZL();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final String getConversationId() {
                        return this.LIZIZ.getConversationId();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void refresh() {
                        this.LIZIZ.refresh();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void resume() {
                        this.LIZIZ.resume();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void stop() {
                        this.LIZIZ.stop();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJJIZ() {
                        if (this.LIZJ.size() > 1) {
                            for (int iLJIIJ = C1697810uHb.LJIIJ(this.LIZJ); iLJIIJ > 0; iLJIIJ--) {
                                this.LIZIZ.LJFF((C1DW6) ListProtector.remove(this.LIZJ, iLJIIJ));
                            }
                        }
                    }

                    {
                        this.LIZIZ = c1755606uALIZ;
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LIZ(C1DW6 c1dw6) {
                        this.LIZJ.add(c1dw6);
                        this.LIZIZ.LIZ(c1dw6);
                    }
                };
                InterfaceC1755906uD interfaceC1755906uDPutIfAbsent = concurrentHashMap.putIfAbsent(str, interfaceC1755906uD);
                if (interfaceC1755906uDPutIfAbsent != null) {
                    interfaceC1755906uD = interfaceC1755906uDPutIfAbsent;
                }
            } else {
                throw new RuntimeException();
            }
        }
        return interfaceC1755906uD;
    }
}
