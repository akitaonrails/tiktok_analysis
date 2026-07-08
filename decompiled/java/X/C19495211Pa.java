package X;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11Pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19495211Pa<T, R> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM, C0V0G<R> {
    public static final long serialVersionUID = 8080567949447303262L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final EnumC19492211Nw LLILZIL;
    public final C19487711Md LLILZLL = new C19487711Md();
    public final ArrayDeque<C19495311Pb<R>> LLIZ = new ArrayDeque<>();
    public InterfaceC19494911Ox<T> LLIZLLLIL;
    public InterfaceC420801kM LLJ;
    public volatile boolean LLJI;
    public int LLJIJIL;
    public volatile boolean LLJILJIL;
    public C19495311Pb<R> LLJILJILJ;
    public int LLJILLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLJILJIL = true;
        if (getAndIncrement() == 0) {
            this.LLIZLLLIL.clear();
            LIZ();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        this.LLJI = true;
        LIZIZ();
    }

    public final void LIZ() {
        C19495311Pb<R> c19495311Pb = this.LLJILJILJ;
        if (c19495311Pb != null) {
            c19495311Pb.dispose();
        }
        while (true) {
            C19495311Pb<R> c19495311PbPoll = this.LLIZ.poll();
            if (c19495311PbPoll == null) {
                return;
            } else {
                c19495311PbPoll.dispose();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9 A[PHI: r10
      0x00d9: PHI (r10v1 X.11Pb<R>) = (r10v0 X.11Pb<R>), (r10v3 X.11Pb<R>) binds: [B:34:0x008c, B:53:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19495211Pa.LIZIZ():void");
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        if (this.LLILZLL.addThrowable(th)) {
            this.LLJI = true;
            LIZIZ();
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        if (this.LLJIJIL == 0) {
            this.LLIZLLLIL.offer(t);
        }
        LIZIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLJ, interfaceC420801kM)) {
            this.LLJ = interfaceC420801kM;
            if (interfaceC420801kM instanceof InterfaceC19495611Pe) {
                InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) interfaceC420801kM;
                int iRequestFusion = interfaceC19495111Oz.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.LLJIJIL = iRequestFusion;
                    this.LLIZLLLIL = interfaceC19495111Oz;
                    this.LLJI = true;
                    this.LL.onSubscribe(this);
                    LIZIZ();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.LLJIJIL = iRequestFusion;
                    this.LLIZLLLIL = interfaceC19495111Oz;
                    this.LL.onSubscribe(this);
                    return;
                }
            }
            this.LLIZLLLIL = new C19500111Qx(this.LLILZ);
            this.LL.onSubscribe(this);
        }
    }

    public C19495211Pa(InterfaceC626120Oh8<? super R> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2, int i, int i2, EnumC19492211Nw enumC19492211Nw) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = enumC19492211Nw;
    }
}
