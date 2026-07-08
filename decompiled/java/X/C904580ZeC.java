package X;

import com.bytedance.ies.powerlist.PowerCell;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0ZeC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904580ZeC implements InterfaceC904620ZeG<Enum<Object>> {
    public final Enum<Object> LIZ;
    public final InterfaceC903660Zci LIZIZ;
    public final List<Class<? extends PowerCell<?>>> LIZJ;
    public final List<InterfaceC607860Nsm<?>> LIZLLL;
    public final List<InterfaceC902790ZbJ<InterfaceC1891350zJl>> LJ;
    public final /* synthetic */ InterfaceC904590ZeD<Enum<Object>, InterfaceC1891350zJl> LJFF;

    @Override // X.InterfaceC904620ZeG
    public final List<InterfaceC902790ZbJ<InterfaceC1891350zJl>> LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC904620ZeG
    public final List<InterfaceC607860Nsm<?>> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC904620ZeG
    public final List<Class<? extends PowerCell<?>>> LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC904620ZeG
    public final Enum<Object> getInterceptOrdering() {
        return this.LIZ;
    }

    @Override // X.InterfaceC904620ZeG
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LIZIZ;
    }

    public C904580ZeC(InterfaceC904590ZeD<Enum<Object>, InterfaceC1891350zJl> interfaceC904590ZeD) {
        this.LJFF = interfaceC904590ZeD;
        this.LIZ = interfaceC904590ZeD.getInterceptOrdering();
        this.LIZIZ = interfaceC904590ZeD.getMsgHandlerCheck();
        this.LIZJ = Collections.singletonList(interfaceC904590ZeD.getWithCell());
        this.LIZLLL = Collections.singletonList(interfaceC904590ZeD.LLLLIILLL());
        this.LJ = Collections.singletonList(interfaceC904590ZeD);
    }

    @Override // X.InterfaceC904620ZeG
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return this.LJFF.intercept(list);
    }
}
