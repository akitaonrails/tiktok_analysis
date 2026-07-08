package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681030tqX implements InterfaceC1690500u5o {
    public InterfaceC1680840tqE LL = new InterfaceC1680840tqE() { // from class: X.0tqV
        public static final long LLILLJJLI = 9205357640488583168L;
        public static final EnumC1671200tag LLILLL = EnumC1671200tag.Ltr;
        public static final C1516420pZ2 LLILZ = new C1516420pZ2(1.0f, 1.0f);

        @Override // X.InterfaceC1680840tqE
        public final long LIZIZ() {
            return LLILLJJLI;
        }

        @Override // X.InterfaceC1680840tqE
        public final InterfaceC1690500u5o getDensity() {
            return LLILZ;
        }

        @Override // X.InterfaceC1680840tqE
        public final EnumC1671200tag getLayoutDirection() {
            return LLILLL;
        }
    };
    public C1681040tqY LLILLJJLI;
    public InterfaceC1669010tX9 LLILLL;

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJJLIIIJLJLI(long j) {
        return C1682420tsm.LIZLLL(j, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJLI(long j) {
        return C1682420tsm.LIZIZ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ long LJLJLJ(float f) {
        return C1685230txJ.LIZIZ(this, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ int LJLLJ(float f) {
        return C1682420tsm.LIZ(f, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ float LJLLL(long j) {
        return C1682420tsm.LIZJ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ float LLI(long j) {
        return C1685230txJ.LIZ(this, j);
    }

    public final long LIZIZ() {
        return this.LL.LIZIZ();
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LL.getDensity().LJJ();
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LL.getDensity().getDensity();
    }

    public final C1681040tqY LIZLLL(Function1<? super InterfaceC1669010tX9, Unit> function1) {
        C1681040tqY c1681040tqY = new C1681040tqY(function1);
        this.LLILLJJLI = c1681040tqY;
        return c1681040tqY;
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return f / getDensity();
    }
}
