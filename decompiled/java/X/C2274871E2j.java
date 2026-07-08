package X;

import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS46S0001000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1E2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274871E2j extends i<InterfaceC19715212Bq, C436400H9i, C436440H9m, C2274891E2l> {
    public static final int LLJJIJIIJIL = 8;
    public final C19A3 LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final Function0<C436440H9m> LLJJI;
    public final Function0<C2274891E2l> LLJJIII;
    public final InterfaceC19715212Bq LLJJIJI;

    public InterfaceC19715212Bq F4() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJIJI;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C436440H9m> o2() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C2274891E2l> w2() {
        return this.LLJJIII;
    }

    public C2274871E2j(C19A3 c19a3, int i, int i2) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = i;
        this.LLJJ = i2;
        this.LLJJI = new AwS579S0100000_35(this, 162);
        this.LLJJIII = AFwS226S0000000_35.get$arr$(261);
        this.LLJJIJI = new InterfaceC19715212Bq() { // from class: X.1E2k
            @Override // X.InterfaceC19715212Bq
            public void hide() {
                this.LL.i3(AFwS283S0000000_35.get$arr$(90));
            }

            @Override // X.InterfaceC19715212Bq
            public void show() {
                this.LL.i3(AFwS283S0000000_35.get$arr$(91));
            }

            @Override // X.InterfaceC19715212Bq
            public void vI1(int i3) {
                this.LL.i3(new AwS46S0001000_35(i3, 7));
            }
        };
    }
}
