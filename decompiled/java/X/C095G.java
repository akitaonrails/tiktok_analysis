package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.095G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C095G {
    public static C1DEK LIZ(final int i, final EnumC2252401DDy enumC2252401DDy, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC2252401DDy = EnumC2252401DDy.SUSPEND;
        }
        final int i3 = 1;
        final Function1 function1 = null;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (enumC2252401DDy == EnumC2252401DDy.SUSPEND) {
                            return new C1DEK(i, null);
                        }
                        return new C1DEK<E>(i, enumC2252401DDy, function1) { // from class: X.1DEH
                            public final EnumC2252401DDy LLJILJILJ;

                            @Override // X.C1DEK
                            public final boolean LJJIII() {
                                return this.LLJILJILJ == EnumC2252401DDy.DROP_OLDEST;
                            }

                            @Override // X.C1DEK, X.AnonymousClass0955
                            public final Object LJIIIIZZ(E e) {
                                return LJJJIL(e, false);
                            }

                            @Override // X.C1DEK, X.AnonymousClass0955
                            public final Object LJIJI(E e, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
                                C2250681D7i c2250681D7iLIZIZ;
                                Object objLJJJIL = LJJJIL(e, true);
                                if (objLJJJIL instanceof C094M) {
                                    C094N.LIZ(objLJJJIL);
                                    Function1<E, Unit> function12 = this.LLILLJJLI;
                                    if (function12 != null && (c2250681D7iLIZIZ = C2250671D7h.LIZIZ(function12, e, null)) != null) {
                                        C13SZ.LIZ(c2250681D7iLIZIZ, LJIL());
                                        throw c2250681D7iLIZIZ;
                                    }
                                    throw LJIL();
                                }
                                return Unit.LIZ;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
                            
                                return kotlin.Unit.LIZ;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object LJJJIL(E r17, boolean r18) {
                                /*
                                    Method dump skipped, instruction units count: 205
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1DEH.LJJJIL(java.lang.Object, boolean):java.lang.Object");
                            }

                            {
                                super(i, function1);
                                this.LLJILJILJ = enumC2252401DDy;
                                if (enumC2252401DDy != EnumC2252401DDy.SUSPEND) {
                                    if (i >= 1) {
                                        return;
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Buffered channel capacity must be at least 1, but ");
                                    sbLIZ.append(i);
                                    sbLIZ.append(" was specified");
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    strLIZIZ.toString();
                                    throw new IllegalArgumentException(strLIZIZ);
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("This implementation does not support suspension for senders, use ");
                                sbLIZ2.append(C13LE.LIZ(C1DEK.class).LJI());
                                sbLIZ2.append(" instead");
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                strLIZIZ2.toString();
                                throw new IllegalArgumentException(strLIZIZ2);
                            }
                        };
                    }
                    return new C1DEK(Integer.MAX_VALUE, null);
                }
                if (enumC2252401DDy == EnumC2252401DDy.SUSPEND) {
                    return new C1DEK(0, null);
                }
                return new C1DEK<E>(i3, enumC2252401DDy, function1) { // from class: X.1DEH
                    public final EnumC2252401DDy LLJILJILJ;

                    @Override // X.C1DEK
                    public final boolean LJJIII() {
                        return this.LLJILJILJ == EnumC2252401DDy.DROP_OLDEST;
                    }

                    @Override // X.C1DEK, X.AnonymousClass0955
                    public final Object LJIIIIZZ(E e) {
                        return LJJJIL(e, false);
                    }

                    @Override // X.C1DEK, X.AnonymousClass0955
                    public final Object LJIJI(E e, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
                        C2250681D7i c2250681D7iLIZIZ;
                        Object objLJJJIL = LJJJIL(e, true);
                        if (objLJJJIL instanceof C094M) {
                            C094N.LIZ(objLJJJIL);
                            Function1<E, Unit> function12 = this.LLILLJJLI;
                            if (function12 != null && (c2250681D7iLIZIZ = C2250671D7h.LIZIZ(function12, e, null)) != null) {
                                C13SZ.LIZ(c2250681D7iLIZIZ, LJIL());
                                throw c2250681D7iLIZIZ;
                            }
                            throw LJIL();
                        }
                        return Unit.LIZ;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
                    
                        return kotlin.Unit.LIZ;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJJJIL(E r17, boolean r18) {
                        /*
                            Method dump skipped, instruction units count: 205
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1DEH.LJJJIL(java.lang.Object, boolean):java.lang.Object");
                    }

                    {
                        super(i3, function1);
                        this.LLJILJILJ = enumC2252401DDy;
                        if (enumC2252401DDy != EnumC2252401DDy.SUSPEND) {
                            if (i3 >= 1) {
                                return;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Buffered channel capacity must be at least 1, but ");
                            sbLIZ.append(i3);
                            sbLIZ.append(" was specified");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            strLIZIZ.toString();
                            throw new IllegalArgumentException(strLIZIZ);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("This implementation does not support suspension for senders, use ");
                        sbLIZ2.append(C13LE.LIZ(C1DEK.class).LJI());
                        sbLIZ2.append(" instead");
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        strLIZIZ2.toString();
                        throw new IllegalArgumentException(strLIZIZ2);
                    }
                };
            }
            if (enumC2252401DDy == EnumC2252401DDy.SUSPEND) {
                final EnumC2252401DDy enumC2252401DDy2 = EnumC2252401DDy.DROP_OLDEST;
                return new C1DEK<E>(i3, enumC2252401DDy2, function1) { // from class: X.1DEH
                    public final EnumC2252401DDy LLJILJILJ;

                    @Override // X.C1DEK
                    public final boolean LJJIII() {
                        return this.LLJILJILJ == EnumC2252401DDy.DROP_OLDEST;
                    }

                    @Override // X.C1DEK, X.AnonymousClass0955
                    public final Object LJIIIIZZ(E e) {
                        return LJJJIL(e, false);
                    }

                    @Override // X.C1DEK, X.AnonymousClass0955
                    public final Object LJIJI(E e, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
                        C2250681D7i c2250681D7iLIZIZ;
                        Object objLJJJIL = LJJJIL(e, true);
                        if (objLJJJIL instanceof C094M) {
                            C094N.LIZ(objLJJJIL);
                            Function1<E, Unit> function12 = this.LLILLJJLI;
                            if (function12 != null && (c2250681D7iLIZIZ = C2250671D7h.LIZIZ(function12, e, null)) != null) {
                                C13SZ.LIZ(c2250681D7iLIZIZ, LJIL());
                                throw c2250681D7iLIZIZ;
                            }
                            throw LJIL();
                        }
                        return Unit.LIZ;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
                    
                        return kotlin.Unit.LIZ;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJJJIL(E r17, boolean r18) {
                        /*
                            Method dump skipped, instruction units count: 205
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1DEH.LJJJIL(java.lang.Object, boolean):java.lang.Object");
                    }

                    {
                        super(i3, function1);
                        this.LLJILJILJ = enumC2252401DDy2;
                        if (enumC2252401DDy2 != EnumC2252401DDy.SUSPEND) {
                            if (i3 >= 1) {
                                return;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Buffered channel capacity must be at least 1, but ");
                            sbLIZ.append(i3);
                            sbLIZ.append(" was specified");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            strLIZIZ.toString();
                            throw new IllegalArgumentException(strLIZIZ);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("This implementation does not support suspension for senders, use ");
                        sbLIZ2.append(C13LE.LIZ(C1DEK.class).LJI());
                        sbLIZ2.append(" instead");
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        strLIZIZ2.toString();
                        throw new IllegalArgumentException(strLIZIZ2);
                    }
                };
            }
            "CONFLATED capacity cannot be used with non-default onBufferOverflow".toString();
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (enumC2252401DDy == EnumC2252401DDy.SUSPEND) {
            C095E.LJLJI.getClass();
            return new C1DEK(C095F.LIZIZ, null);
        }
        return new C1DEK<E>(i3, enumC2252401DDy, function1) { // from class: X.1DEH
            public final EnumC2252401DDy LLJILJILJ;

            @Override // X.C1DEK
            public final boolean LJJIII() {
                return this.LLJILJILJ == EnumC2252401DDy.DROP_OLDEST;
            }

            @Override // X.C1DEK, X.AnonymousClass0955
            public final Object LJIIIIZZ(E e) {
                return LJJJIL(e, false);
            }

            @Override // X.C1DEK, X.AnonymousClass0955
            public final Object LJIJI(E e, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
                C2250681D7i c2250681D7iLIZIZ;
                Object objLJJJIL = LJJJIL(e, true);
                if (objLJJJIL instanceof C094M) {
                    C094N.LIZ(objLJJJIL);
                    Function1<E, Unit> function12 = this.LLILLJJLI;
                    if (function12 != null && (c2250681D7iLIZIZ = C2250671D7h.LIZIZ(function12, e, null)) != null) {
                        C13SZ.LIZ(c2250681D7iLIZIZ, LJIL());
                        throw c2250681D7iLIZIZ;
                    }
                    throw LJIL();
                }
                return Unit.LIZ;
            }

            /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
            
                return kotlin.Unit.LIZ;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJJJIL(E r17, boolean r18) {
                /*
                    Method dump skipped, instruction units count: 205
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1DEH.LJJJIL(java.lang.Object, boolean):java.lang.Object");
            }

            {
                super(i3, function1);
                this.LLJILJILJ = enumC2252401DDy;
                if (enumC2252401DDy != EnumC2252401DDy.SUSPEND) {
                    if (i3 >= 1) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Buffered channel capacity must be at least 1, but ");
                    sbLIZ.append(i3);
                    sbLIZ.append(" was specified");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("This implementation does not support suspension for senders, use ");
                sbLIZ2.append(C13LE.LIZ(C1DEK.class).LJI());
                sbLIZ2.append(" instead");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ2.toString();
                throw new IllegalArgumentException(strLIZIZ2);
            }
        };
    }
}
