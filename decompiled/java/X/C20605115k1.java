package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15k1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20605115k1 implements InterfaceC1891350zJl, InterfaceC20605815k8 {
    public InterfaceC1361890lXn<?> LL;
    public C20606915kJ LLILLJJLI;
    public C20606915kJ LLILLL;

    public C20605115k1() {
        this(null);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public C20605115k1(Object obj) {
        this.LL = null;
        this.LLILLL = new C20606915kJ();
    }

    @Override // X.InterfaceC20605815k8
    public final void LIZ(C20607615kQ c20607615kQ) {
        C20606915kJ c20606915kJ = c20607615kQ.LIZIZ;
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = c20606915kJ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        AbstractC20607715kR abstractC20607715kR;
        C20605115k1 c20605115k1;
        C20606915kJ c20606915kJ;
        C20606915kJ c20606915kJ2 = this.LLILLJJLI;
        AbstractC20607715kR abstractC20607715kR2 = null;
        if (c20606915kJ2 != null) {
            abstractC20607715kR = c20606915kJ2.LIZIZ;
        } else {
            abstractC20607715kR = null;
        }
        if ((interfaceC1891350zJl instanceof C20605115k1) && (c20605115k1 = (C20605115k1) interfaceC1891350zJl) != null && (c20606915kJ = c20605115k1.LLILLL) != null) {
            abstractC20607715kR2 = c20606915kJ.LIZIZ;
        }
        return Intrinsics.LJFF(abstractC20607715kR, abstractC20607715kR2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
