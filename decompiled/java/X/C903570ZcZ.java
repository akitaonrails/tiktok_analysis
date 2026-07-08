package X;

import Y.AObjectS389S0100000_14;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageKt;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import java.util.List;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0ZcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903570ZcZ implements InterfaceC904830Zeb {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public volatile C899910ZSb LIZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C903570ZcZ.class, "provider", "getProvider()Lcom/ss/android/ugc/aweme/im/messagelist/impl/ability/IMScrollToBottomAbilityImpl;", 0);
        C13LE.LIZ.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0ZSb, X.0ZSe] */
    @Override // X.InterfaceC904830Zeb
    public final InterfaceC899940ZSe get() {
        C899910ZSb c899910ZSb = this.LIZJ;
        if (c899910ZSb == null) {
            synchronized (this) {
                c899910ZSb = this.LIZJ;
                if (c899910ZSb == null) {
                    final C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 0));
                    final C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AObjectS389S0100000_14(this, 1));
                    ?? r0 = new InterfaceC899940ZSe(c01gwLIZIZ, c01gwLIZIZ2) { // from class: X.0ZSb
                        public final C01GW LIZ;
                        public final C01GW LIZIZ;

                        public final boolean LIZIZ() {
                            return ((LinearLayoutManager) this.LIZ.getValue()).findFirstVisibleItemPosition() <= 0 && ((InterfaceC904700ZeO) this.LIZIZ.getValue()).LIZIZ();
                        }

                        {
                            this.LIZ = c01gwLIZIZ;
                            this.LIZIZ = c01gwLIZIZ2;
                        }

                        @Override // X.InterfaceC899940ZSe
                        public final boolean LIZ(InterfaceC904740ZeS interfaceC904740ZeS, List list, AwS582S0100000_3 awS582S0100000_3, boolean z) {
                            if (interfaceC904740ZeS instanceof C06SA) {
                                C06SA c06sa = (C06SA) interfaceC904740ZeS;
                                if (((Boolean) awS582S0100000_3.invoke(c06sa.LIZJ)).booleanValue() || c06sa.LIZJ.getMsgStatus() == 2 || c06sa.LIZJ.getMsgStatus() == 3) {
                                    return false;
                                }
                            } else {
                                if (interfaceC904740ZeS instanceof C1758306ub) {
                                    return true;
                                }
                                if (interfaceC904740ZeS instanceof C1509705vb) {
                                    if (LIZIZ() || ((C1509705vb) interfaceC904740ZeS).LIZIZ == 16) {
                                        return true;
                                    }
                                    return false;
                                }
                                if (interfaceC904740ZeS instanceof C15626069w) {
                                    C15626069w c15626069w = (C15626069w) interfaceC904740ZeS;
                                    if (c15626069w.LIZ != C0YIF.LIZ) {
                                        return false;
                                    }
                                    C869590Y9l c869590Y9l = c15626069w.LIZIZ;
                                    if (c869590Y9l.getMsgType() == 4058) {
                                        return false;
                                    }
                                    if (!z && (c869590Y9l.getMsgType() == 4000 || c869590Y9l.getMsgType() == 4007 || c869590Y9l.getMsgType() == 4011 || c869590Y9l.getMsgType() == 4008 || c869590Y9l.getMsgType() == 4013 || c869590Y9l.getMsgType() == 4010)) {
                                        return true;
                                    }
                                    if (C0ZDX.LJJJJLL(c869590Y9l)) {
                                        return LIZIZ();
                                    }
                                    if (!FakeMessageKt.isFakeMessage(c869590Y9l) && !C1510305vh.LIZ(c869590Y9l) && !((Boolean) awS582S0100000_3.invoke(c869590Y9l)).booleanValue()) {
                                        return true;
                                    }
                                    C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJJLZIJ(0, list);
                                    if (c869590Y9l2 != null) {
                                        if (C896400ZEo.LJFF(c869590Y9l2) || c869590Y9l2.getMsgType() == 1813) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                if (interfaceC904740ZeS instanceof C06S8) {
                                    C06S8 c06s8 = (C06S8) interfaceC904740ZeS;
                                    if (!c06s8.LIZIZ.isEmpty()) {
                                        if (((C869590Y9l) C13LP.LJJJJZI(c06s8.LIZIZ)).getMsgType() == 4007 || ((C869590Y9l) C13LP.LJJJJZI(c06s8.LIZIZ)).getMsgType() == 4008 || ((C869590Y9l) C13LP.LJJJJZI(c06s8.LIZIZ)).getMsgType() == 4010) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                if (interfaceC904740ZeS instanceof C06P6) {
                                    return ((C06P6) interfaceC904740ZeS).LIZ;
                                }
                                return false;
                            }
                            return true;
                        }
                    };
                    this.LIZJ = r0;
                    return r0;
                }
            }
        }
        return c899910ZSb;
    }

    public C903570ZcZ(C01GW<? extends ChatLinearLayoutManager> c01gw, C01GW<? extends InterfaceC904700ZeO> c01gw2) {
        this.LIZ = c01gw;
        this.LIZIZ = c01gw2;
    }
}
