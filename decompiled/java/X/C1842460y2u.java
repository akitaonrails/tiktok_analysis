package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0y2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842460y2u {
    public static final C1842610y39 LIZLLL = new C1842610y39();
    public static volatile C1842460y2u LJ;
    public final DataChannel LIZ;
    public final InterfaceC1842660y3E LIZIZ;
    public final HashMap<EnumC1842500y2y, Object> LIZJ;

    public final InterfaceC1842870y3Z LIZ() {
        return (InterfaceC1842870y3Z) LIZIZ(EnumC1842500y2y.CAPSULE);
    }

    public C1842460y2u(DataChannel dataChannel) {
        InterfaceC1842660y3E interfaceC1842660y3E = new InterfaceC1842660y3E() { // from class: X.0y37
            @Override // X.InterfaceC1842660y3E
            public final boolean LIZIZ(EnumC1842500y2y enumC1842500y2y) {
                int i = C1842580y36.LIZ[enumC1842500y2y.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1842660y3E
            public final <T> T LIZ(EnumC1842500y2y enumC1842500y2y, DataChannel dataChannel2) {
                int i = C1842580y36.LIZ[enumC1842500y2y.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return (T) new InterfaceC1842780y3Q() { // from class: X.0uPu
                            public final HashMap<C0N5A, InterfaceC1702970uPv> LIZ = new HashMap<>();
                            public AnonymousClass0956 LIZIZ;

                            @Override // X.InterfaceC1842780y3Q
                            public final void release() {
                                AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
                                if (anonymousClass0956 != null) {
                                    anonymousClass0956.LIZIZ(null);
                                }
                                int size = this.LIZ.size();
                                this.LIZ.clear();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Released ");
                                sbLIZ.append(size);
                                sbLIZ.append(" strategies");
                                C20441214yg.LIZIZ("MockAnimationServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                            }

                            @Override // X.InterfaceC1842780y3Q
                            public final void LIZIZ(InterfaceC1702970uPv interfaceC1702970uPv) {
                                C0N5A c0n5aScenario = interfaceC1702970uPv.scenario();
                                this.LIZ.put(c0n5aScenario, interfaceC1702970uPv);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Registered strategy for scenario: ");
                                sbLIZ.append(c0n5aScenario.name());
                                sbLIZ.append(", animation type: ");
                                sbLIZ.append(interfaceC1702970uPv.LIZJ());
                                C20441214yg.LIZIZ("MockAnimationServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                            }

                            @Override // X.InterfaceC1842780y3Q
                            public final void LIZ(C1842380y2m c1842380y2m, C0N5A c0n5a, RankEntranceWidget rankEntranceWidget) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Triggering mock animation with delay for scenario: ");
                                sbLIZ.append(c0n5a.name());
                                C20441214yg.LIZIZ("MockAnimationServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                                InterfaceC1702970uPv interfaceC1702970uPv = this.LIZ.get(c0n5a);
                                if (interfaceC1702970uPv != null && interfaceC1702970uPv.LIZIZ(c1842380y2m)) {
                                    C1DFH c1dfh = C0PEM.LIZ;
                                    this.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1702940uPs(interfaceC1702970uPv, c1842380y2m, c0n5a, rankEntranceWidget, null), 3);
                                } else {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("No strategy available or cannot trigger for scenario: ");
                                    sbLIZ2.append(c0n5a.name());
                                    C20441214yg.LIZIZ("MockAnimationServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                        };
                    }
                    return (T) new C1118620fDQ(dataChannel2);
                }
                return (T) new InterfaceC1842820y3U(dataChannel2) { // from class: X.0f9K
                    public final DataChannel LIZ;
                    public final List<InterfaceC1116090f9L> LIZIZ;
                    public InterfaceC1114220f6K LIZJ;

                    @Override // X.InterfaceC1842820y3U
                    public final void release() {
                        this.LIZJ = null;
                        Iterator<InterfaceC1116090f9L> it2 = this.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().release();
                        }
                        ((ArrayList) this.LIZIZ).clear();
                        C20441214yg.LIZIZ("RankingDowngradeServiceImpl", "DowngradeService released");
                    }

                    {
                        this.LIZ = dataChannel2;
                        ArrayList arrayList = new ArrayList();
                        this.LIZIZ = arrayList;
                        arrayList.add(new C1116050f9H());
                        arrayList.add(new C1116060f9I());
                        arrayList.add(new C1116070f9J(dataChannel2));
                        StringBuilder sb = new StringBuilder("Active downgrade strategies: ");
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (((InterfaceC1116090f9L) obj).isEnabled()) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((InterfaceC1116090f9L) it2.next()).getType());
                        }
                        sb.append(arrayList3);
                        C20441214yg.LIZIZ("RankingDowngradeServiceImpl", sb.toString());
                    }

                    @Override // X.InterfaceC1842820y3U
                    public final void LIZ(C1842750y3N c1842750y3N) {
                        InterfaceC1114220f6K interfaceC1114220f6K;
                        this.LIZJ = c1842750y3N;
                        for (InterfaceC1116090f9L interfaceC1116090f9L : (ArrayList) this.LIZIZ) {
                            if (interfaceC1116090f9L.isEnabled() && (interfaceC1114220f6K = this.LIZJ) != null) {
                                interfaceC1116090f9L.LIZ(interfaceC1114220f6K, this.LIZ);
                            }
                        }
                    }

                    @Override // X.InterfaceC1842820y3U
                    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
                        Object next;
                        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (((InterfaceC1116090f9L) next).getType() == EnumC2007607ti.HIGH_TRAFFIC_STREAM) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        InterfaceC1116090f9L interfaceC1116090f9L = (InterfaceC1116090f9L) next;
                        if (interfaceC1116090f9L instanceof C1116070f9J) {
                            C1116070f9J c1116070f9J = (C1116070f9J) interfaceC1116090f9L;
                            if (c1116070f9J.isEnabled() && c1116070f9J.LIZJ && c1116070f9J.isEnabled()) {
                                try {
                                    c1116070f9J.LIZ.EQ2(lifecycleOwner, LowDevicePerfScalableChannel.class, new AwS596S0100000_17(c1116070f9J, 441));
                                    C20441214yg.LIZIZ("HighTrafficStreamDowngradeStrategy", "Performance level change observer registered");
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C20441214yg.LJFF("HighTrafficStreamDowngradeStrategy", "Failed to register performance level observer", e);
                                }
                            }
                        }
                    }
                };
            }
        };
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC1842660y3E;
        this.LIZJ = new HashMap<>();
    }

    public final <T> T LIZIZ(EnumC1842500y2y enumC1842500y2y) {
        T t = (T) this.LIZJ.get(enumC1842500y2y);
        if (t != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Get service with type ");
            sbLIZ.append(enumC1842500y2y);
            sbLIZ.append(" from cache");
            C20441214yg.LJIIL("RankingServiceRegistryImpl", C2188811AlT.LIZIZ(sbLIZ));
            return t;
        }
        if (!this.LIZIZ.LIZIZ(enumC1842500y2y)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Service type ");
            sbLIZ2.append(enumC1842500y2y);
            sbLIZ2.append(" is not supported");
            C20441214yg.LJIIL("RankingServiceRegistryImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        T t2 = (T) this.LIZIZ.LIZ(enumC1842500y2y, this.LIZ);
        if (t2 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(enumC1842500y2y.name());
            sbLIZ3.append(" created (");
            sbLIZ3.append(enumC1842500y2y.getServiceClass().getSimpleName());
            sbLIZ3.append(')');
            C20441214yg.LIZIZ("RankingServiceRegistryImpl", C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZJ.put(enumC1842500y2y, t2);
            return t2;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Factory returned null for ");
        sbLIZ4.append(enumC1842500y2y.name());
        C20441214yg.LJIIL("RankingServiceRegistryImpl", C2188811AlT.LIZIZ(sbLIZ4));
        return t2;
    }
}
