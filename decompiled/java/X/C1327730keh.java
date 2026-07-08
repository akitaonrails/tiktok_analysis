package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0keh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327730keh implements InterfaceC1327390ke9<C1328480kfu> {
    public final C1326950kdR LIZ;
    public final InterfaceC1325590kbF LIZIZ;
    public final InterfaceC1327440keE LIZJ;
    public final InterfaceC1330410kj1 LIZLLL;
    public final InterfaceC1327390ke9<C1328480kfu> LJ;

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, final InterfaceC1327930kf1 interfaceC1327930kf1) {
        C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
        if (!c1325710kbRLJFF.LJIIZILJ) {
            this.LJ.LIZIZ(interfaceC1328020kfA, interfaceC1327930kf1);
            return;
        }
        interfaceC1327930kf1.LIZ().LJI(interfaceC1327930kf1.getId(), "PartialDiskCacheProducer");
        Uri uriBuild = c1325710kbRLJFF.LIZIZ.buildUpon().appendQueryParameter("fresco_partial", "true").build();
        InterfaceC1325590kbF interfaceC1325590kbF = this.LIZIZ;
        interfaceC1327930kf1.LIZJ();
        final C592490NLr c592490NLrLJ = interfaceC1325590kbF.LJ(uriBuild);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C15O7<C1328480kfu> c15o7LJI = this.LIZ.LJI(c592490NLrLJ, atomicBoolean);
        final String id = interfaceC1327930kf1.getId();
        final InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
        c15o7LJI.LIZLLL(new InterfaceC2385309Wh<C1328480kfu, Void>() { // from class: X.0kel
            @Override // X.InterfaceC2385309Wh
            public final Void then(C15O7<C1328480kfu> c15o7) {
                boolean z;
                boolean z2;
                C1C7U.LIZ("PartialDiskCacheProducer@5fc2.onFinishDiskReads$2");
                boolean z3 = false;
                if (c15o7.LJIILIIL() || (c15o7.LJIILL() && (c15o7.LJIIJJI() instanceof CancellationException))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    interfaceC1325690kbPLIZ.LJIIIIZZ(id, "PartialDiskCacheProducer", null);
                    interfaceC1328020kfA.LIZIZ();
                } else if (c15o7.LJIILL()) {
                    interfaceC1325690kbPLIZ.LIZ(id, c15o7.LJIIJJI(), "PartialDiskCacheProducer", null);
                    this.LJFF.LIZLLL(interfaceC1328020kfA, interfaceC1327930kf1, c592490NLrLJ, null);
                } else {
                    C1328480kfu c1328480kfuLJIIL = c15o7.LJIIL();
                    if (c1328480kfuLJIIL != null) {
                        InterfaceC1325690kbP interfaceC1325690kbP = interfaceC1325690kbPLIZ;
                        String str = id;
                        interfaceC1325690kbP.LIZIZ(str, "PartialDiskCacheProducer", C1327730keh.LIZJ(interfaceC1325690kbP, str, true, c1328480kfuLJIIL.LJIILL()));
                        int iLJIILL = c1328480kfuLJIIL.LJIILL() - 1;
                        if (iLJIILL > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C1322350kW1.LIZIZ(z2);
                        c1328480kfuLJIIL.LLJI = new C1328000kf8(0, iLJIILL);
                        int iLJIILL2 = c1328480kfuLJIIL.LJIILL();
                        C1325710kbR c1325710kbRLJFF2 = interfaceC1327930kf1.LJFF();
                        C1328000kf8 c1328000kf8 = c1325710kbRLJFF2.LJIILJJIL;
                        if (c1328000kf8 != null && c1328000kf8.LIZ >= 0 && iLJIILL >= c1328000kf8.LIZIZ) {
                            interfaceC1325690kbPLIZ.LJIIIZ(id, "PartialDiskCacheProducer", true);
                            interfaceC1328020kfA.LIZJ(9, c1328480kfuLJIIL);
                        } else {
                            interfaceC1328020kfA.LIZJ(8, c1328480kfuLJIIL);
                            C1325700kbQ c1325700kbQLIZIZ = C1325700kbQ.LIZIZ(c1325710kbRLJFF2);
                            int i = iLJIILL2 - 1;
                            if (i >= 0) {
                                z3 = true;
                            }
                            C1322350kW1.LIZIZ(z3);
                            c1325700kbQLIZIZ.LJIJ = new C1328000kf8(i, Integer.MAX_VALUE);
                            this.LJFF.LIZLLL(interfaceC1328020kfA, new C1327900key(c1325700kbQLIZIZ.LIZ(), interfaceC1327930kf1), c592490NLrLJ, c1328480kfuLJIIL);
                        }
                    } else {
                        InterfaceC1325690kbP interfaceC1325690kbP2 = interfaceC1325690kbPLIZ;
                        String str2 = id;
                        interfaceC1325690kbP2.LIZIZ(str2, "PartialDiskCacheProducer", C1327730keh.LIZJ(interfaceC1325690kbP2, str2, false, 0));
                        this.LJFF.LIZLLL(interfaceC1328020kfA, interfaceC1327930kf1, c592490NLrLJ, c1328480kfuLJIIL);
                    }
                }
                C1C7U.LIZIZ("PartialDiskCacheProducer@5fc2.onFinishDiskReads$2");
                return null;
            }
        });
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0kfD
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                atomicBoolean.set(true);
            }
        });
    }

    public static Map<String, String> LIZJ(InterfaceC1325690kbP interfaceC1325690kbP, String str, boolean z, int i) {
        if (!interfaceC1325690kbP.LJIIJ(str)) {
            return null;
        }
        if (z) {
            return C19871212ow.of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return C19871212ow.of("cached_value_found", String.valueOf(z));
    }

    public final void LIZLLL(final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1, final InterfaceC1324680kZm interfaceC1324680kZm, final C1328480kfu c1328480kfu) {
        final C1326950kdR c1326950kdR = this.LIZ;
        final InterfaceC1327440keE interfaceC1327440keE = this.LIZJ;
        final InterfaceC1330410kj1 interfaceC1330410kj1 = this.LIZLLL;
        this.LJ.LIZIZ(new AbstractC1328840kgU<C1328480kfu, C1328480kfu>(interfaceC1328020kfA, c1326950kdR, interfaceC1324680kZm, interfaceC1327440keE, interfaceC1330410kj1, c1328480kfu) { // from class: X.0kei
            public final C1326950kdR LIZJ;
            public final InterfaceC1324680kZm LIZLLL;
            public final InterfaceC1327440keE LJ;
            public final InterfaceC1330410kj1 LJFF;
            public final C1328480kfu LJI;

            public final void LJIILIIL(AbstractC1328940kge abstractC1328940kge) throws Throwable {
                C1323050kX9 c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(((C1328760kgM) abstractC1328940kge).LIZ());
                try {
                    try {
                        C1328480kfu c1328480kfu2 = new C1328480kfu(c1323050kX9LJIJJLI);
                        c1328480kfu2.LJIJJ();
                        this.LIZIZ.LIZJ(1, c1328480kfu2);
                        C1328480kfu.LIZIZ(c1328480kfu2);
                        C1323050kX9.LJII(c1323050kX9LJIJJLI);
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        C1328480kfu.LIZIZ(null);
                        C1323050kX9.LJII(c1323050kX9LJIJJLI);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC1327820keq
            public final void LJII(int i, Object obj) throws Throwable {
                C1328480kfu c1328480kfu2 = (C1328480kfu) obj;
                if (!AbstractC1327820keq.LJ(i)) {
                    C1328480kfu c1328480kfu3 = this.LJI;
                    if (c1328480kfu3 != null && c1328480kfu2.LLJI != null) {
                        try {
                            try {
                                LJIILIIL(LJIIL(c1328480kfu3, c1328480kfu2));
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1328570kg3.LJI("PartialDiskCacheProducer", "Error while merging image data", e);
                                this.LIZIZ.onFailure(e);
                            }
                            c1328480kfu2.close();
                            this.LJI.close();
                            this.LIZJ.LJIIIZ(this.LIZLLL);
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c1328480kfu2.close();
                            this.LJI.close();
                            throw th;
                        }
                    }
                    if (AbstractC1327820keq.LJIIJ(i, 8) && AbstractC1327820keq.LIZLLL(i)) {
                        c1328480kfu2.LJIJJLI();
                        if (c1328480kfu2.LLILLL != C1330000kiM.LIZJ) {
                            this.LIZJ.LJII(this.LIZLLL, c1328480kfu2);
                            this.LIZIZ.LIZJ(i, c1328480kfu2);
                            return;
                        }
                    }
                    this.LIZIZ.LIZJ(i, c1328480kfu2);
                }
            }

            public final AbstractC1328940kge LJIIL(C1328480kfu c1328480kfu2, C1328480kfu c1328480kfu3) throws IOException {
                C1328760kgM c1328760kgMLJ = this.LJ.LJ(c1328480kfu3.LJIILL() + c1328480kfu3.LLJI.LIZ);
                LJIIJJI(c1328480kfu2.LJII(), c1328760kgMLJ, c1328480kfu3.LLJI.LIZ);
                LJIIJJI(c1328480kfu3.LJII(), c1328760kgMLJ, c1328480kfu3.LJIILL());
                return c1328760kgMLJ;
            }

            public final void LJIIJJI(InputStream inputStream, AbstractC1328940kge abstractC1328940kge, int i) throws IOException {
                byte[] bArr = this.LJFF.get(16384);
                int i2 = i;
                while (i2 > 0) {
                    try {
                        int i3 = inputStream.read(bArr, 0, Math.min(16384, i2));
                        if (i3 < 0) {
                            break;
                        } else if (i3 > 0) {
                            abstractC1328940kge.write(bArr, 0, i3);
                            i2 -= i3;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LJFF.LIZ(bArr);
                        throw th;
                    }
                }
                this.LJFF.LIZ(bArr);
                if (i2 <= 0) {
                } else {
                    throw new IOException(C786410Ut5.k4(null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
                }
            }

            {
                this.LIZJ = c1326950kdR;
                this.LIZLLL = interfaceC1324680kZm;
                this.LJ = interfaceC1327440keE;
                this.LJFF = interfaceC1330410kj1;
                this.LJI = c1328480kfu;
            }
        }, interfaceC1327930kf1);
    }

    public C1327730keh(C1326950kdR c1326950kdR, InterfaceC1325590kbF interfaceC1325590kbF, InterfaceC1327440keE interfaceC1327440keE, InterfaceC1330410kj1 interfaceC1330410kj1, InterfaceC1327390ke9<C1328480kfu> interfaceC1327390ke9) {
        this.LIZ = c1326950kdR;
        this.LIZIZ = interfaceC1325590kbF;
        this.LIZJ = interfaceC1327440keE;
        this.LIZLLL = interfaceC1330410kj1;
        this.LJ = interfaceC1327390ke9;
    }
}
