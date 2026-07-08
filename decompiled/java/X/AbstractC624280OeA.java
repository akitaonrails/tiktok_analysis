package X;

import X.AbstractC624280OeA;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OeA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC624280OeA<EVENT extends AbstractC624280OeA<EVENT>> {
    public final String LIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(660));
    public volatile AtomicInteger LJFF = new AtomicInteger(EnumC620210OUh.INITIAL_TYPE.getValue());

    public void LIZLLL() {
        String str = this.LIZJ;
        if (str != null) {
            LIZJ("enter_from", str);
        }
        String str2 = this.LJ;
        if (str2 != null) {
            LIZJ("enter_method", str2);
        }
        String str3 = this.LIZLLL;
        if (str3 != null) {
            LIZJ("tab_name", str3);
        }
        LIZJ("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue());
    }

    public final boolean LJ() {
        return this.LJFF.compareAndSet(EnumC620210OUh.RECORDING_TYPE.getValue(), EnumC620210OUh.RECORD_FINISH_TYPE.getValue());
    }

    public final boolean LJFF() {
        return this.LJFF.compareAndSet(EnumC620210OUh.INITIAL_TYPE.getValue(), EnumC620210OUh.RECORDING_TYPE.getValue());
    }

    public final boolean LJI() {
        return this.LJFF.get() == EnumC620210OUh.RECORDING_TYPE.getValue();
    }

    public void LJIIIIZZ() {
        this.LJFF.set(EnumC620210OUh.INITIAL_TYPE.getValue());
    }

    public void LJII() {
        LIZLLL();
        C20684815ws.LJIILLIIL(this.LIZ, (HashMap) this.LIZIZ.getValue());
    }

    public AbstractC624280OeA(String str) {
        this.LIZ = str;
    }

    public final void LIZ(int i, String str) {
        LIZIZ(str, String.valueOf(i));
    }

    public final void LIZIZ(String str, String str2) {
        ((HashMap) this.LIZIZ.getValue()).put(str, InterfaceC1210900hcG.LIZ.LIZ(str2));
    }

    public final void LIZJ(String str, String str2) {
        LIZIZ(str, str2);
    }
}
