package X;

import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898730zVf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1898700zVc LL;
    public final /* synthetic */ InputStream LLILLJJLI;
    public final /* synthetic */ InputStream LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ InterfaceC1898930zVz LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1898730zVf(C1898700zVc c1898700zVc, C0VSP c0vsp, C0VSP c0vsp2, String str, InterfaceC1898930zVz interfaceC1898930zVz, String str2) {
        super(0);
        this.LL = c1898700zVc;
        this.LLILLJJLI = c0vsp;
        this.LLILLL = c0vsp2;
        this.LLILZ = str;
        this.LLILZIL = interfaceC1898930zVz;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        final C1302030jzF lottieView = this.LL.getLottieView();
        InputStream inputStream = this.LLILLL;
        String str = this.LLILZ;
        final C1898700zVc c1898700zVc = this.LL;
        final InterfaceC1898930zVz interfaceC1898930zVz = this.LLILZIL;
        C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(inputStream, str);
        c1292030jj7LJ.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0zVe
            @Override // X.InterfaceC1292040jj8
            public final void onResult(Object obj) {
                InterfaceC1898930zVz interfaceC1898930zVz2;
                C1294720jnS c1294720jnS = (C1294720jnS) obj;
                c1898700zVc.LLJLIL = c1294720jnS;
                lottieView.setComposition(c1294720jnS);
                c013c.element = true;
                if (c013c2.element && (interfaceC1898930zVz2 = interfaceC1898930zVz) != null) {
                    interfaceC1898930zVz2.LIZ();
                }
            }
        });
        c1292030jj7LJ.LIZ(new InterfaceC1292040jj8() { // from class: X.0zVh
            @Override // X.InterfaceC1292040jj8
            public final void onResult(Object obj) {
                InterfaceC1898930zVz interfaceC1898930zVz2;
                c013c.element = true;
                if (c013c2.element && (interfaceC1898930zVz2 = interfaceC1898930zVz) != null) {
                    interfaceC1898930zVz2.onFail();
                }
            }
        });
        if (this.LLILLJJLI != null) {
            final C1302030jzF breathLottieView = this.LL.getBreathLottieView();
            InputStream inputStream2 = this.LLILLJJLI;
            String str2 = this.LLILZLL;
            final InterfaceC1898930zVz interfaceC1898930zVz2 = this.LLILZIL;
            C1292030jj7<C1294720jnS> c1292030jj7LJ2 = C1294250jmh.LJ(inputStream2, str2);
            c1292030jj7LJ2.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0zVg
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    InterfaceC1898930zVz interfaceC1898930zVz3;
                    breathLottieView.setComposition((C1294720jnS) obj);
                    c013c2.element = true;
                    if (c013c.element && (interfaceC1898930zVz3 = interfaceC1898930zVz2) != null) {
                        interfaceC1898930zVz3.LIZ();
                    }
                }
            });
            c1292030jj7LJ2.LIZ(new InterfaceC1292040jj8() { // from class: X.0zVi
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    InterfaceC1898930zVz interfaceC1898930zVz3;
                    c013c2.element = true;
                    if (c013c.element && (interfaceC1898930zVz3 = interfaceC1898930zVz2) != null) {
                        interfaceC1898930zVz3.onFail();
                    }
                }
            });
        }
        return Unit.LIZ;
    }
}
