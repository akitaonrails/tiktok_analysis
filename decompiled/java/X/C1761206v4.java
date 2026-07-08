package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06v4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1761206v4 extends AbstractC1704206ls implements C1DW6 {
    public final InterfaceC1755906uD LLILLJJLI;
    public final InterfaceC626120Oh8<? super InterfaceC904740ZeS> LLILLL;

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    @Override // X.AbstractC1704206ls
    public final void LIZ() {
        this.LLILLJJLI.LJJIZ();
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null) {
            this.LLILLL.onNext(new C1761506v7(c869590Y9l));
        } else {
            "onRecallMessage(): message is null".toString();
            throw new IllegalStateException("onRecallMessage(): message is null");
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null) {
            this.LLILLL.onNext(new C1761406v6(c869590Y9l));
        } else {
            "onDelMessage(): message is null".toString();
            throw new IllegalStateException("onDelMessage(): message is null");
        }
    }

    public C1761206v4(InterfaceC1755906uD interfaceC1755906uD, InterfaceC626120Oh8<? super InterfaceC904740ZeS> interfaceC626120Oh8) {
        this.LLILLJJLI = interfaceC1755906uD;
        this.LLILLL = interfaceC626120Oh8;
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
        if (c869590Y9l != null) {
            IIMSendMsgUxAnalytics iIMSendMsgUxAnalytics = (IIMSendMsgUxAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMSendMsgUxAnalytics.class);
            if (iIMSendMsgUxAnalytics != null) {
                iIMSendMsgUxAnalytics.LJFF(SystemClock.uptimeMillis(), C901060ZWm.LIZ(c869590Y9l));
            }
            this.LLILLL.onNext(new C15626069w(c869590Y9l, i));
            return;
        }
        "onAddMessage(): message is null".toString();
        throw new IllegalStateException("onAddMessage(): message is null");
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
        EnumC1762106vD enumC1762106vD;
        InterfaceC626120Oh8<? super InterfaceC904740ZeS> interfaceC626120Oh8 = this.LLILLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        int i = C872580YKy.LIZ[enumC872590YKz.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        enumC1762106vD = EnumC1762106vD.SKIPPED;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    enumC1762106vD = EnumC1762106vD.DB_ERROR;
                }
            } else {
                enumC1762106vD = EnumC1762106vD.NETWORK_ERROR;
            }
        } else {
            enumC1762106vD = EnumC1762106vD.SUCCESS;
        }
        interfaceC626120Oh8.onNext(new C1762006vC(list, enumC1762106vD));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
        this.LLILLL.onNext(new C1746006sc(list2));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(final C869590Y9l c869590Y9l, final boolean z) {
        if (c869590Y9l != null) {
            this.LLILLL.onNext(new InterfaceC904740ZeS(c869590Y9l, z) { // from class: X.069x
                public final C869590Y9l LIZ;
                public final boolean LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C15627069x)) {
                        return false;
                    }
                    C15627069x c15627069x = (C15627069x) obj;
                    return Intrinsics.LJFF(this.LIZ, c15627069x.LIZ) && this.LIZIZ == c15627069x.LIZIZ;
                }

                @Override // X.InterfaceC904740ZeS
                public final String getName() {
                    return "OnSendMessageAsyncRespEvent";
                }

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OnSendMessageAsyncRespEvent(message=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", hasChanged=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = c869590Y9l;
                    this.LIZIZ = z;
                }
            });
        } else {
            "onSendMessageAsyncResp(): message is null".toString();
            throw new IllegalStateException("onSendMessageAsyncResp(): message is null");
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
        InterfaceC626120Oh8<? super InterfaceC904740ZeS> interfaceC626120Oh8 = this.LLILLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC626120Oh8.onNext(new C1761906vB(list, z));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
        C0Y3I c0y3i;
        if (c869590Y9l != null) {
            if (Intrinsics.LJFF(C1762406vG.LJ, Boolean.TRUE)) {
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1761706v9(c869590Y9l, null), 3);
            }
            IIMSendMsgUxAnalytics iIMSendMsgUxAnalytics = (IIMSendMsgUxAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMSendMsgUxAnalytics.class);
            if (iIMSendMsgUxAnalytics != null) {
                iIMSendMsgUxAnalytics.LJFF(SystemClock.uptimeMillis(), C901060ZWm.LIZ(c869590Y9l));
            }
            InterfaceC626120Oh8<? super InterfaceC904740ZeS> interfaceC626120Oh8 = this.LLILLL;
            if (c0yc9 == null || (c0y3i = c0yc9.LJJIJIIJIL) == null) {
                c0y3i = new C0Y3I("MessageModelObservable- tracer in send metrics was null");
            }
            interfaceC626120Oh8.onNext(new C06SA(c0y3i, i, c869590Y9l, c0yc9));
            return;
        }
        "onSendMessage(): message is null".toString();
        throw new IllegalStateException("onSendMessage(): message is null");
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        InterfaceC626120Oh8<? super InterfaceC904740ZeS> interfaceC626120Oh8 = this.LLILLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC626120Oh8.onNext(new C1509705vb(list, i, c0y7p));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
        if (c0ya6 != null) {
            this.LLILLL.onNext(new C06SC(c0y3i, i, c0ya6));
        } else {
            "onSendModifyPropertyMsg(): modifyMsgPropertyMsg is null".toString();
            throw new IllegalStateException("onSendModifyPropertyMsg(): modifyMsgPropertyMsg is null");
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
        InterfaceC626120Oh8<? super InterfaceC904740ZeS> interfaceC626120Oh8 = this.LLILLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC626120Oh8.onNext(new C1758306ub(i, str, list, l));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        InterfaceC626120Oh8<? super InterfaceC904740ZeS> interfaceC626120Oh8 = this.LLILLL;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        interfaceC626120Oh8.onNext(new C06S8(c0y3i, list, map));
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
        if (c869590Y9l != null) {
            InterfaceC626120Oh8<? super InterfaceC904740ZeS> interfaceC626120Oh8 = this.LLILLL;
            if (map == null) {
                map = C2097608Jq.LJ();
            }
            if (map2 == null) {
                map2 = C2097608Jq.LJ();
            }
            interfaceC626120Oh8.onNext(new C06SB(c0y3i, c869590Y9l, map, map2));
            return;
        }
        "onGetModifyPropertyMsg(): msg is null".toString();
        throw new IllegalStateException("onGetModifyPropertyMsg(): msg is null");
    }
}
