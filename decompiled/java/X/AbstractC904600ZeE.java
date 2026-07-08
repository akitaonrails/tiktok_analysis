package X;

import java.lang.Enum;
import java.util.List;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0ZeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC904600ZeE<ENUM extends Enum<ENUM>, T, H> implements InterfaceC904590ZeD<ENUM, H> {
    public final C898790ZNt LL = new C898790ZNt(new int[]{4081, 2002}, new AwS593S0100000_14((AbstractC904600ZeE) this, 255));

    public abstract boolean LIZ(C869590Y9l c869590Y9l);

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<H> getPowerItemClazz() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC904590ZeD
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        return list;
    }

    @Override // X.InterfaceC904610ZeF
    public final InterfaceC904620ZeG<ENUM> convert() {
        return new C904580ZeC(this);
    }

    @Override // X.InterfaceC904590ZeD
    public final InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LL;
    }
}
