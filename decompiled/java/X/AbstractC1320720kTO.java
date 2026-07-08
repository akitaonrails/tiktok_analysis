package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import zn6.b;

/* JADX INFO: renamed from: X.0kTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1320720kTO<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> {
    public static final C1099600eik LJIILLIIL = new C1320700kTM<Object>() { // from class: X.0eik
        @Override // X.C1320700kTM, X.InterfaceC1320650kTH
        public final void LJ(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }

        @Override // X.C1320700kTM
        public final void LJIIIZ(String str, Object obj, Animatable animatable) {
            if (animatable != null && !animatable.isRunning()) {
                animatable.start();
            }
        }
    };
    public static final NullPointerException LJIIZILJ = new NullPointerException("No image request was specified!");
    public static final AtomicLong LJIJ = new AtomicLong();
    public final Context LIZ;
    public final Set<InterfaceC1320650kTH> LIZIZ;
    public Object LIZJ;
    public REQUEST LIZLLL;
    public REQUEST LJ;
    public REQUEST[] LJFF;
    public boolean LJI;
    public InterfaceC1320070kSL<InterfaceC1320200kSY<IMAGE>> LJII;
    public InterfaceC1320650kTH<? super INFO> LJIIIIZZ;
    public Set<InterfaceC1320650kTH> LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public InterfaceC1320850kTb LJIILJJIL;
    public boolean LJIILL = true;

    /* JADX INFO: renamed from: X.0kTO$c */
    public abstract class c<D> implements InterfaceC1320070kSL<InterfaceC1320200kSY<IMAGE>> {
        public abstract REQUEST LIZ();
    }

    public abstract AbstractC1321260kUG LIZIZ(InterfaceC1320850kTb interfaceC1320850kTb, Object obj, Object obj2, EnumC1320790kTV enumC1320790kTV);

    public final void LIZJ() {
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = true;
        this.LJIIIIZZ = null;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIILJJIL = null;
    }

    public abstract C1320250kSd LIZLLL();

    public final AbstractC1320710kTN LIZ() {
        REQUEST request;
        boolean z = false;
        C1322350kW1.LJ("Cannot specify both ImageRequest and FirstAvailableImageRequests!", this.LJFF == null || this.LIZLLL == null);
        if (this.LJII == null || (this.LJFF == null && this.LIZLLL == null && this.LJ == null)) {
            z = true;
        }
        C1322350kW1.LJ("Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.", z);
        if (this.LIZLLL == null && this.LJFF == null && (request = this.LJ) != null) {
            this.LIZLLL = request;
            this.LJ = null;
        }
        C1336010ks3.LIZIZ();
        C1320250kSd c1320250kSdLIZLLL = LIZLLL();
        c1320250kSdLIZLLL.LJIILJJIL = this.LJIIL;
        c1320250kSdLIZLLL.LJIILLIIL = null;
        boolean z2 = this.LJIIJ;
        if (z2) {
            if (c1320250kSdLIZLLL.LJ == null) {
                c1320250kSdLIZLLL.LJ = new C1320900kTg();
            }
            c1320250kSdLIZLLL.LJ.LIZ = z2;
            if (c1320250kSdLIZLLL.LJFF == null) {
                C1320780kTU c1320780kTU = new C1320780kTU(this.LIZ);
                c1320250kSdLIZLLL.LJFF = c1320780kTU;
                c1320780kTU.LIZ = c1320250kSdLIZLLL;
            }
        }
        Set<InterfaceC1320650kTH> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC1320650kTH> it2 = set.iterator();
            while (it2.hasNext()) {
                c1320250kSdLIZLLL.LJ(it2.next());
            }
        }
        InterfaceC1320650kTH<? super INFO> interfaceC1320650kTH = this.LJIIIIZZ;
        if (interfaceC1320650kTH != null) {
            c1320250kSdLIZLLL.LJ(interfaceC1320650kTH);
        }
        Set<InterfaceC1320650kTH> set2 = this.LJIIIZ;
        if (set2 != null && set2.size() != 0) {
            Iterator<InterfaceC1320650kTH> it3 = this.LJIIIZ.iterator();
            while (it3.hasNext()) {
                c1320250kSdLIZLLL.LJ(it3.next());
            }
        }
        if (this.LJIIJJI) {
            c1320250kSdLIZLLL.LJ(LJIILLIIL);
        }
        C1336010ks3.LIZIZ();
        c1320250kSdLIZLLL.LIZ = this.LJIILL;
        return c1320250kSdLIZLLL;
    }

    public AbstractC1320720kTO(Context context, Set<InterfaceC1320650kTH> set) {
        this.LIZ = context;
        this.LIZIZ = set;
        LIZJ();
    }

    public final InterfaceC1320070kSL LJ(final C1320250kSd c1320250kSd, final String str) {
        InterfaceC1320070kSL c1320750kTR;
        InterfaceC1320070kSL<InterfaceC1320200kSY<IMAGE>> interfaceC1320070kSL = this.LJII;
        if (interfaceC1320070kSL != null) {
            return interfaceC1320070kSL;
        }
        final REQUEST request = this.LIZLLL;
        if (request != null) {
            final EnumC1320790kTV enumC1320790kTV = EnumC1320790kTV.FULL_FETCH;
            final Object obj = this.LIZJ;
            c1320750kTR = new AbstractC1320720kTO<AbstractC1320720kTO<Object, Object, Object, Object>, Object, Object, Object>.c<InterfaceC1320200kSY<Object>>(request, c1320250kSd, str, obj, enumC1320790kTV) { // from class: X.0kTQ
                public final /* synthetic */ Object LIZ;
                public final /* synthetic */ InterfaceC1320850kTb LIZIZ;
                public final /* synthetic */ Object LIZJ;
                public final /* synthetic */ EnumC1320790kTV LIZLLL;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1320070kSL
                public final Object get() {
                    InterfaceC1320650kTH interfaceC1320650kTHLJII;
                    Object[] objArr;
                    InterfaceC1320850kTb interfaceC1320850kTb = this.LIZIZ;
                    if ((interfaceC1320850kTb instanceof AbstractC1320710kTN) && (interfaceC1320650kTHLJII = ((AbstractC1320710kTN) interfaceC1320850kTb).LJII()) != null && (interfaceC1320650kTHLJII instanceof C1320700kTM)) {
                        AbstractC1320720kTO abstractC1320720kTO = this.LJ;
                        REQUEST request2 = abstractC1320720kTO.LIZLLL;
                        if (request2 != 0 || (objArr = abstractC1320720kTO.LJFF) == null || objArr.length <= 0) {
                            ((C1320700kTM) interfaceC1320650kTHLJII).LJI((C1325710kbR) request2, System.currentTimeMillis());
                        } else {
                            ((C1320700kTM) interfaceC1320650kTHLJII).LJI((C1325710kbR) objArr[0], System.currentTimeMillis());
                        }
                    }
                    return this.LJ.LIZIZ(this.LIZIZ, this.LIZ, this.LIZJ, this.LIZLLL);
                }

                public final String toString() {
                    C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
                    c1320100kSOLIZIZ.LIZIZ(this.LIZ.toString(), "request");
                    return c1320100kSOLIZIZ.toString();
                }

                @Override // X.AbstractC1320720kTO.c
                public final Object LIZ() {
                    return this.LIZ;
                }

                {
                    this.LIZJ = obj;
                    this.LIZLLL = enumC1320790kTV;
                }
            };
        } else {
            REQUEST[] requestArr = this.LJFF;
            if (requestArr != null) {
                boolean z = this.LJI;
                ArrayList arrayList = new ArrayList(requestArr.length * 2);
                if (z) {
                    for (final REQUEST request2 : requestArr) {
                        final EnumC1320790kTV enumC1320790kTV2 = EnumC1320790kTV.BITMAP_MEMORY_CACHE;
                        final Object obj2 = this.LIZJ;
                        arrayList.add(new AbstractC1320720kTO<AbstractC1320720kTO<Object, Object, Object, Object>, Object, Object, Object>.c<InterfaceC1320200kSY<Object>>(request2, c1320250kSd, str, obj2, enumC1320790kTV2) { // from class: X.0kTQ
                            public final /* synthetic */ Object LIZ;
                            public final /* synthetic */ InterfaceC1320850kTb LIZIZ;
                            public final /* synthetic */ Object LIZJ;
                            public final /* synthetic */ EnumC1320790kTV LIZLLL;

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.InterfaceC1320070kSL
                            public final Object get() {
                                InterfaceC1320650kTH interfaceC1320650kTHLJII;
                                Object[] objArr;
                                InterfaceC1320850kTb interfaceC1320850kTb = this.LIZIZ;
                                if ((interfaceC1320850kTb instanceof AbstractC1320710kTN) && (interfaceC1320650kTHLJII = ((AbstractC1320710kTN) interfaceC1320850kTb).LJII()) != null && (interfaceC1320650kTHLJII instanceof C1320700kTM)) {
                                    AbstractC1320720kTO abstractC1320720kTO = this.LJ;
                                    REQUEST request22 = abstractC1320720kTO.LIZLLL;
                                    if (request22 != 0 || (objArr = abstractC1320720kTO.LJFF) == null || objArr.length <= 0) {
                                        ((C1320700kTM) interfaceC1320650kTHLJII).LJI((C1325710kbR) request22, System.currentTimeMillis());
                                    } else {
                                        ((C1320700kTM) interfaceC1320650kTHLJII).LJI((C1325710kbR) objArr[0], System.currentTimeMillis());
                                    }
                                }
                                return this.LJ.LIZIZ(this.LIZIZ, this.LIZ, this.LIZJ, this.LIZLLL);
                            }

                            public final String toString() {
                                C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
                                c1320100kSOLIZIZ.LIZIZ(this.LIZ.toString(), "request");
                                return c1320100kSOLIZIZ.toString();
                            }

                            @Override // X.AbstractC1320720kTO.c
                            public final Object LIZ() {
                                return this.LIZ;
                            }

                            {
                                this.LIZJ = obj2;
                                this.LIZLLL = enumC1320790kTV2;
                            }
                        });
                    }
                }
                for (final REQUEST request3 : requestArr) {
                    final EnumC1320790kTV enumC1320790kTV3 = EnumC1320790kTV.FULL_FETCH;
                    final Object obj3 = this.LIZJ;
                    arrayList.add(new AbstractC1320720kTO<AbstractC1320720kTO<Object, Object, Object, Object>, Object, Object, Object>.c<InterfaceC1320200kSY<Object>>(request3, c1320250kSd, str, obj3, enumC1320790kTV3) { // from class: X.0kTQ
                        public final /* synthetic */ Object LIZ;
                        public final /* synthetic */ InterfaceC1320850kTb LIZIZ;
                        public final /* synthetic */ Object LIZJ;
                        public final /* synthetic */ EnumC1320790kTV LIZLLL;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC1320070kSL
                        public final Object get() {
                            InterfaceC1320650kTH interfaceC1320650kTHLJII;
                            Object[] objArr;
                            InterfaceC1320850kTb interfaceC1320850kTb = this.LIZIZ;
                            if ((interfaceC1320850kTb instanceof AbstractC1320710kTN) && (interfaceC1320650kTHLJII = ((AbstractC1320710kTN) interfaceC1320850kTb).LJII()) != null && (interfaceC1320650kTHLJII instanceof C1320700kTM)) {
                                AbstractC1320720kTO abstractC1320720kTO = this.LJ;
                                REQUEST request22 = abstractC1320720kTO.LIZLLL;
                                if (request22 != 0 || (objArr = abstractC1320720kTO.LJFF) == null || objArr.length <= 0) {
                                    ((C1320700kTM) interfaceC1320650kTHLJII).LJI((C1325710kbR) request22, System.currentTimeMillis());
                                } else {
                                    ((C1320700kTM) interfaceC1320650kTHLJII).LJI((C1325710kbR) objArr[0], System.currentTimeMillis());
                                }
                            }
                            return this.LJ.LIZIZ(this.LIZIZ, this.LIZ, this.LIZJ, this.LIZLLL);
                        }

                        public final String toString() {
                            C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
                            c1320100kSOLIZIZ.LIZIZ(this.LIZ.toString(), "request");
                            return c1320100kSOLIZIZ.toString();
                        }

                        @Override // X.AbstractC1320720kTO.c
                        public final Object LIZ() {
                            return this.LIZ;
                        }

                        {
                            this.LIZJ = obj3;
                            this.LIZLLL = enumC1320790kTV3;
                        }
                    });
                }
                c1320750kTR = new C1320750kTR(arrayList);
            } else {
                return new C1321190kU9(LJIIZILJ);
            }
        }
        if (this.LJ != null) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(c1320750kTR);
            final REQUEST request4 = this.LJ;
            final EnumC1320790kTV enumC1320790kTV4 = EnumC1320790kTV.FULL_FETCH;
            final Object obj4 = this.LIZJ;
            arrayList2.add(new AbstractC1320720kTO<AbstractC1320720kTO<Object, Object, Object, Object>, Object, Object, Object>.c<InterfaceC1320200kSY<Object>>(request4, c1320250kSd, str, obj4, enumC1320790kTV4) { // from class: X.0kTQ
                public final /* synthetic */ Object LIZ;
                public final /* synthetic */ InterfaceC1320850kTb LIZIZ;
                public final /* synthetic */ Object LIZJ;
                public final /* synthetic */ EnumC1320790kTV LIZLLL;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1320070kSL
                public final Object get() {
                    InterfaceC1320650kTH interfaceC1320650kTHLJII;
                    Object[] objArr;
                    InterfaceC1320850kTb interfaceC1320850kTb = this.LIZIZ;
                    if ((interfaceC1320850kTb instanceof AbstractC1320710kTN) && (interfaceC1320650kTHLJII = ((AbstractC1320710kTN) interfaceC1320850kTb).LJII()) != null && (interfaceC1320650kTHLJII instanceof C1320700kTM)) {
                        AbstractC1320720kTO abstractC1320720kTO = this.LJ;
                        REQUEST request22 = abstractC1320720kTO.LIZLLL;
                        if (request22 != 0 || (objArr = abstractC1320720kTO.LJFF) == null || objArr.length <= 0) {
                            ((C1320700kTM) interfaceC1320650kTHLJII).LJI((C1325710kbR) request22, System.currentTimeMillis());
                        } else {
                            ((C1320700kTM) interfaceC1320650kTHLJII).LJI((C1325710kbR) objArr[0], System.currentTimeMillis());
                        }
                    }
                    return this.LJ.LIZIZ(this.LIZIZ, this.LIZ, this.LIZJ, this.LIZLLL);
                }

                public final String toString() {
                    C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
                    c1320100kSOLIZIZ.LIZIZ(this.LIZ.toString(), "request");
                    return c1320100kSOLIZIZ.toString();
                }

                @Override // X.AbstractC1320720kTO.c
                public final Object LIZ() {
                    return this.LIZ;
                }

                {
                    this.LIZJ = obj4;
                    this.LIZLLL = enumC1320790kTV4;
                }
            });
            return new C1320170kSV(arrayList2);
        }
        return c1320750kTR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(Object[] objArr, boolean z) {
        boolean z2;
        if (objArr != 0 && objArr.length <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1322350kW1.LIZ("No requests specified!", z2);
        this.LJFF = objArr;
        this.LJI = z;
    }
}
