package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.104C, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C104C {
    public static final Map<Object, InterfaceC191818102m> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        linkedHashMap.put(C105L.class, new C104D() { // from class: X.104E
            @Override // X.C104D
            public final List<AbstractC191843103l> LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C191852103u) {
                    C191852103u c191852103u = (C191852103u) c104a;
                    return Collections.singletonList(new C191851103t(c191852103u, C104C.LIZ(c191848103q, c191852103u.LJ)));
                }
                if (c104a instanceof C105L) {
                    return Collections.singletonList(new C109C((C105L) c104a, c191848103q));
                }
                if (c104a instanceof C191888105e) {
                    return Collections.singletonList(new C109D((C191888105e) c104a, c191848103q));
                }
                if (c104a instanceof C104Z) {
                    return Collections.singletonList(new C104X((C104Z) c104a, c191848103q));
                }
                if (c104a instanceof C104I) {
                    final C104I c104i = (C104I) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c104i) { // from class: X.104F
                        public final C104I LLILLJJLI;

                        {
                            this.LLILLJJLI = c104i;
                        }

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context context) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new AnonymousClass1042(this.LLILLJJLI.LJIIIIZZ));
                            return arrayList;
                        }
                    });
                }
                if (c104a instanceof C105V) {
                    final C105V c105v = (C105V) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c191848103q, c105v) { // from class: X.105W
                        public final C191848103q LLILLJJLI;
                        public final C105V LLILLL;

                        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
                        /* JADX WARN: Removed duplicated region for block: B:47:0x0095 A[PHI: r5
                          0x0095: PHI (r5v1 java.lang.Integer) = (r5v0 java.lang.Integer), (r5v4 java.lang.Integer) binds: [B:45:0x0092, B:23:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // X.AbstractC191843103l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.util.List<X.AbstractC191840103i> LJ(android.content.Context r13) {
                            /*
                                r12 = this;
                                java.util.ArrayList r1 = new java.util.ArrayList
                                r1.<init>()
                                X.105V r0 = r12.LLILLL
                                X.103N r2 = r0.LIZLLL
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.CharSequence r4 = r2.LIZ(r0)
                                boolean r0 = android.text.TextUtils.isEmpty(r4)
                                if (r0 != 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Boolean> r2 = r0.LJI
                                r7 = 0
                                if (r2 == 0) goto L54
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.Object r2 = r2.invoke(r0)
                            L26:
                                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                                r8 = 1
                                r0 = r0 ^ 1
                                if (r0 == 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                java.util.List<X.1Fj2> r2 = r0.LJFF
                                if (r2 == 0) goto L56
                                java.util.ArrayList r11 = new java.util.ArrayList
                                r0 = 10
                                int r0 = X.C15438062q.LJIJJ(r2, r0)
                                r11.<init>(r0)
                                java.util.Iterator r2 = r2.iterator()
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L57
                                java.lang.Object r0 = r2.next()
                                r0.getClass()
                                throw r7
                            L54:
                                r2 = r7
                                goto L26
                            L56:
                                r11 = r7
                            L57:
                                X.106E r3 = new X.106E
                                X.105V r0 = r12.LLILLL
                                X.105Y r2 = r0.LJ
                                if (r2 == 0) goto L91
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L91
                                java.lang.Integer r5 = r0.LIZ
                            L65:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L95
                                java.lang.Integer r6 = r0.LIZIZ
                            L6b:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L71
                                X.105b r7 = r0.LIZJ
                            L71:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L77
                                int r8 = r0.LIZLLL
                            L77:
                                r10 = 0
                                if (r2 == 0) goto L8d
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L8d
                                int r9 = r0.LIZ
                            L80:
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L86
                                int r10 = r0.LIZIZ
                            L86:
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                                r1.add(r3)
                            L8c:
                                return r1
                            L8d:
                                r9 = 0
                                if (r2 == 0) goto L86
                                goto L80
                            L91:
                                r5 = r7
                                if (r2 == 0) goto L95
                                goto L65
                            L95:
                                r6 = r7
                                if (r2 == 0) goto L77
                                goto L6b
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C105W.LJ(android.content.Context):java.util.List");
                        }

                        {
                            this.LLILLJJLI = c191848103q;
                            this.LLILLL = c105v;
                        }
                    });
                }
                return C13BV.INSTANCE;
            }
        });
        linkedHashMap.put(C191888105e.class, new C104D() { // from class: X.104E
            @Override // X.C104D
            public final List<AbstractC191843103l> LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C191852103u) {
                    C191852103u c191852103u = (C191852103u) c104a;
                    return Collections.singletonList(new C191851103t(c191852103u, C104C.LIZ(c191848103q, c191852103u.LJ)));
                }
                if (c104a instanceof C105L) {
                    return Collections.singletonList(new C109C((C105L) c104a, c191848103q));
                }
                if (c104a instanceof C191888105e) {
                    return Collections.singletonList(new C109D((C191888105e) c104a, c191848103q));
                }
                if (c104a instanceof C104Z) {
                    return Collections.singletonList(new C104X((C104Z) c104a, c191848103q));
                }
                if (c104a instanceof C104I) {
                    final C104I c104i = (C104I) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c104i) { // from class: X.104F
                        public final C104I LLILLJJLI;

                        {
                            this.LLILLJJLI = c104i;
                        }

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context context) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new AnonymousClass1042(this.LLILLJJLI.LJIIIIZZ));
                            return arrayList;
                        }
                    });
                }
                if (c104a instanceof C105V) {
                    final C105V c105v = (C105V) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c191848103q, c105v) { // from class: X.105W
                        public final C191848103q LLILLJJLI;
                        public final C105V LLILLL;

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context v) {
                            /*
                                this = this;
                                java.util.ArrayList r1 = new java.util.ArrayList
                                r1.<init>()
                                X.105V r0 = r12.LLILLL
                                X.103N r2 = r0.LIZLLL
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.CharSequence r4 = r2.LIZ(r0)
                                boolean r0 = android.text.TextUtils.isEmpty(r4)
                                if (r0 != 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Boolean> r2 = r0.LJI
                                r7 = 0
                                if (r2 == 0) goto L54
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.Object r2 = r2.invoke(r0)
                            L26:
                                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                                r8 = 1
                                r0 = r0 ^ 1
                                if (r0 == 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                java.util.List<X.1Fj2> r2 = r0.LJFF
                                if (r2 == 0) goto L56
                                java.util.ArrayList r11 = new java.util.ArrayList
                                r0 = 10
                                int r0 = X.C15438062q.LJIJJ(r2, r0)
                                r11.<init>(r0)
                                java.util.Iterator r2 = r2.iterator()
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L57
                                java.lang.Object r0 = r2.next()
                                r0.getClass()
                                throw r7
                            L54:
                                r2 = r7
                                goto L26
                            L56:
                                r11 = r7
                            L57:
                                X.106E r3 = new X.106E
                                X.105V r0 = r12.LLILLL
                                X.105Y r2 = r0.LJ
                                if (r2 == 0) goto L91
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L91
                                java.lang.Integer r5 = r0.LIZ
                            L65:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L95
                                java.lang.Integer r6 = r0.LIZIZ
                            L6b:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L71
                                X.105b r7 = r0.LIZJ
                            L71:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L77
                                int r8 = r0.LIZLLL
                            L77:
                                r10 = 0
                                if (r2 == 0) goto L8d
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L8d
                                int r9 = r0.LIZ
                            L80:
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L86
                                int r10 = r0.LIZIZ
                            L86:
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                                r1.add(r3)
                            L8c:
                                return r1
                            L8d:
                                r9 = 0
                                if (r2 == 0) goto L86
                                goto L80
                            L91:
                                r5 = r7
                                if (r2 == 0) goto L95
                                goto L65
                            L95:
                                r6 = r7
                                if (r2 == 0) goto L77
                                goto L6b
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C105W.LJ(android.content.Context):java.util.List");
                        }

                        {
                            this.LLILLJJLI = c191848103q;
                            this.LLILLL = c105v;
                        }
                    });
                }
                return C13BV.INSTANCE;
            }
        });
        linkedHashMap.put(C104Z.class, new C104D() { // from class: X.104E
            @Override // X.C104D
            public final List<AbstractC191843103l> LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C191852103u) {
                    C191852103u c191852103u = (C191852103u) c104a;
                    return Collections.singletonList(new C191851103t(c191852103u, C104C.LIZ(c191848103q, c191852103u.LJ)));
                }
                if (c104a instanceof C105L) {
                    return Collections.singletonList(new C109C((C105L) c104a, c191848103q));
                }
                if (c104a instanceof C191888105e) {
                    return Collections.singletonList(new C109D((C191888105e) c104a, c191848103q));
                }
                if (c104a instanceof C104Z) {
                    return Collections.singletonList(new C104X((C104Z) c104a, c191848103q));
                }
                if (c104a instanceof C104I) {
                    final C104I c104i = (C104I) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c104i) { // from class: X.104F
                        public final C104I LLILLJJLI;

                        {
                            this.LLILLJJLI = c104i;
                        }

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context context) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new AnonymousClass1042(this.LLILLJJLI.LJIIIIZZ));
                            return arrayList;
                        }
                    });
                }
                if (c104a instanceof C105V) {
                    final C105V c105v = (C105V) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c191848103q, c105v) { // from class: X.105W
                        public final C191848103q LLILLJJLI;
                        public final C105V LLILLL;

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context v) {
                            /*
                                this = this;
                                java.util.ArrayList r1 = new java.util.ArrayList
                                r1.<init>()
                                X.105V r0 = r12.LLILLL
                                X.103N r2 = r0.LIZLLL
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.CharSequence r4 = r2.LIZ(r0)
                                boolean r0 = android.text.TextUtils.isEmpty(r4)
                                if (r0 != 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Boolean> r2 = r0.LJI
                                r7 = 0
                                if (r2 == 0) goto L54
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.Object r2 = r2.invoke(r0)
                            L26:
                                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                                r8 = 1
                                r0 = r0 ^ 1
                                if (r0 == 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                java.util.List<X.1Fj2> r2 = r0.LJFF
                                if (r2 == 0) goto L56
                                java.util.ArrayList r11 = new java.util.ArrayList
                                r0 = 10
                                int r0 = X.C15438062q.LJIJJ(r2, r0)
                                r11.<init>(r0)
                                java.util.Iterator r2 = r2.iterator()
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L57
                                java.lang.Object r0 = r2.next()
                                r0.getClass()
                                throw r7
                            L54:
                                r2 = r7
                                goto L26
                            L56:
                                r11 = r7
                            L57:
                                X.106E r3 = new X.106E
                                X.105V r0 = r12.LLILLL
                                X.105Y r2 = r0.LJ
                                if (r2 == 0) goto L91
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L91
                                java.lang.Integer r5 = r0.LIZ
                            L65:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L95
                                java.lang.Integer r6 = r0.LIZIZ
                            L6b:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L71
                                X.105b r7 = r0.LIZJ
                            L71:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L77
                                int r8 = r0.LIZLLL
                            L77:
                                r10 = 0
                                if (r2 == 0) goto L8d
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L8d
                                int r9 = r0.LIZ
                            L80:
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L86
                                int r10 = r0.LIZIZ
                            L86:
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                                r1.add(r3)
                            L8c:
                                return r1
                            L8d:
                                r9 = 0
                                if (r2 == 0) goto L86
                                goto L80
                            L91:
                                r5 = r7
                                if (r2 == 0) goto L95
                                goto L65
                            L95:
                                r6 = r7
                                if (r2 == 0) goto L77
                                goto L6b
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C105W.LJ(android.content.Context):java.util.List");
                        }

                        {
                            this.LLILLJJLI = c191848103q;
                            this.LLILLL = c105v;
                        }
                    });
                }
                return C13BV.INSTANCE;
            }
        });
        linkedHashMap.put(C191852103u.class, new C104D() { // from class: X.104E
            @Override // X.C104D
            public final List<AbstractC191843103l> LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C191852103u) {
                    C191852103u c191852103u = (C191852103u) c104a;
                    return Collections.singletonList(new C191851103t(c191852103u, C104C.LIZ(c191848103q, c191852103u.LJ)));
                }
                if (c104a instanceof C105L) {
                    return Collections.singletonList(new C109C((C105L) c104a, c191848103q));
                }
                if (c104a instanceof C191888105e) {
                    return Collections.singletonList(new C109D((C191888105e) c104a, c191848103q));
                }
                if (c104a instanceof C104Z) {
                    return Collections.singletonList(new C104X((C104Z) c104a, c191848103q));
                }
                if (c104a instanceof C104I) {
                    final C104I c104i = (C104I) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c104i) { // from class: X.104F
                        public final C104I LLILLJJLI;

                        {
                            this.LLILLJJLI = c104i;
                        }

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context context) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new AnonymousClass1042(this.LLILLJJLI.LJIIIIZZ));
                            return arrayList;
                        }
                    });
                }
                if (c104a instanceof C105V) {
                    final C105V c105v = (C105V) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c191848103q, c105v) { // from class: X.105W
                        public final C191848103q LLILLJJLI;
                        public final C105V LLILLL;

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context v) {
                            /*
                                this = this;
                                java.util.ArrayList r1 = new java.util.ArrayList
                                r1.<init>()
                                X.105V r0 = r12.LLILLL
                                X.103N r2 = r0.LIZLLL
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.CharSequence r4 = r2.LIZ(r0)
                                boolean r0 = android.text.TextUtils.isEmpty(r4)
                                if (r0 != 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Boolean> r2 = r0.LJI
                                r7 = 0
                                if (r2 == 0) goto L54
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.Object r2 = r2.invoke(r0)
                            L26:
                                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                                r8 = 1
                                r0 = r0 ^ 1
                                if (r0 == 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                java.util.List<X.1Fj2> r2 = r0.LJFF
                                if (r2 == 0) goto L56
                                java.util.ArrayList r11 = new java.util.ArrayList
                                r0 = 10
                                int r0 = X.C15438062q.LJIJJ(r2, r0)
                                r11.<init>(r0)
                                java.util.Iterator r2 = r2.iterator()
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L57
                                java.lang.Object r0 = r2.next()
                                r0.getClass()
                                throw r7
                            L54:
                                r2 = r7
                                goto L26
                            L56:
                                r11 = r7
                            L57:
                                X.106E r3 = new X.106E
                                X.105V r0 = r12.LLILLL
                                X.105Y r2 = r0.LJ
                                if (r2 == 0) goto L91
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L91
                                java.lang.Integer r5 = r0.LIZ
                            L65:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L95
                                java.lang.Integer r6 = r0.LIZIZ
                            L6b:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L71
                                X.105b r7 = r0.LIZJ
                            L71:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L77
                                int r8 = r0.LIZLLL
                            L77:
                                r10 = 0
                                if (r2 == 0) goto L8d
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L8d
                                int r9 = r0.LIZ
                            L80:
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L86
                                int r10 = r0.LIZIZ
                            L86:
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                                r1.add(r3)
                            L8c:
                                return r1
                            L8d:
                                r9 = 0
                                if (r2 == 0) goto L86
                                goto L80
                            L91:
                                r5 = r7
                                if (r2 == 0) goto L95
                                goto L65
                            L95:
                                r6 = r7
                                if (r2 == 0) goto L77
                                goto L6b
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C105W.LJ(android.content.Context):java.util.List");
                        }

                        {
                            this.LLILLJJLI = c191848103q;
                            this.LLILLL = c105v;
                        }
                    });
                }
                return C13BV.INSTANCE;
            }
        });
        linkedHashMap.put(C104I.class, new C104D() { // from class: X.104E
            @Override // X.C104D
            public final List<AbstractC191843103l> LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C191852103u) {
                    C191852103u c191852103u = (C191852103u) c104a;
                    return Collections.singletonList(new C191851103t(c191852103u, C104C.LIZ(c191848103q, c191852103u.LJ)));
                }
                if (c104a instanceof C105L) {
                    return Collections.singletonList(new C109C((C105L) c104a, c191848103q));
                }
                if (c104a instanceof C191888105e) {
                    return Collections.singletonList(new C109D((C191888105e) c104a, c191848103q));
                }
                if (c104a instanceof C104Z) {
                    return Collections.singletonList(new C104X((C104Z) c104a, c191848103q));
                }
                if (c104a instanceof C104I) {
                    final C104I c104i = (C104I) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c104i) { // from class: X.104F
                        public final C104I LLILLJJLI;

                        {
                            this.LLILLJJLI = c104i;
                        }

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context context) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new AnonymousClass1042(this.LLILLJJLI.LJIIIIZZ));
                            return arrayList;
                        }
                    });
                }
                if (c104a instanceof C105V) {
                    final C105V c105v = (C105V) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c191848103q, c105v) { // from class: X.105W
                        public final C191848103q LLILLJJLI;
                        public final C105V LLILLL;

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context v) {
                            /*
                                this = this;
                                java.util.ArrayList r1 = new java.util.ArrayList
                                r1.<init>()
                                X.105V r0 = r12.LLILLL
                                X.103N r2 = r0.LIZLLL
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.CharSequence r4 = r2.LIZ(r0)
                                boolean r0 = android.text.TextUtils.isEmpty(r4)
                                if (r0 != 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Boolean> r2 = r0.LJI
                                r7 = 0
                                if (r2 == 0) goto L54
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.Object r2 = r2.invoke(r0)
                            L26:
                                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                                r8 = 1
                                r0 = r0 ^ 1
                                if (r0 == 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                java.util.List<X.1Fj2> r2 = r0.LJFF
                                if (r2 == 0) goto L56
                                java.util.ArrayList r11 = new java.util.ArrayList
                                r0 = 10
                                int r0 = X.C15438062q.LJIJJ(r2, r0)
                                r11.<init>(r0)
                                java.util.Iterator r2 = r2.iterator()
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L57
                                java.lang.Object r0 = r2.next()
                                r0.getClass()
                                throw r7
                            L54:
                                r2 = r7
                                goto L26
                            L56:
                                r11 = r7
                            L57:
                                X.106E r3 = new X.106E
                                X.105V r0 = r12.LLILLL
                                X.105Y r2 = r0.LJ
                                if (r2 == 0) goto L91
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L91
                                java.lang.Integer r5 = r0.LIZ
                            L65:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L95
                                java.lang.Integer r6 = r0.LIZIZ
                            L6b:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L71
                                X.105b r7 = r0.LIZJ
                            L71:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L77
                                int r8 = r0.LIZLLL
                            L77:
                                r10 = 0
                                if (r2 == 0) goto L8d
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L8d
                                int r9 = r0.LIZ
                            L80:
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L86
                                int r10 = r0.LIZIZ
                            L86:
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                                r1.add(r3)
                            L8c:
                                return r1
                            L8d:
                                r9 = 0
                                if (r2 == 0) goto L86
                                goto L80
                            L91:
                                r5 = r7
                                if (r2 == 0) goto L95
                                goto L65
                            L95:
                                r6 = r7
                                if (r2 == 0) goto L77
                                goto L6b
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C105W.LJ(android.content.Context):java.util.List");
                        }

                        {
                            this.LLILLJJLI = c191848103q;
                            this.LLILLL = c105v;
                        }
                    });
                }
                return C13BV.INSTANCE;
            }
        });
        linkedHashMap.put(C105V.class, new C104D() { // from class: X.104E
            @Override // X.C104D
            public final List<AbstractC191843103l> LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C191852103u) {
                    C191852103u c191852103u = (C191852103u) c104a;
                    return Collections.singletonList(new C191851103t(c191852103u, C104C.LIZ(c191848103q, c191852103u.LJ)));
                }
                if (c104a instanceof C105L) {
                    return Collections.singletonList(new C109C((C105L) c104a, c191848103q));
                }
                if (c104a instanceof C191888105e) {
                    return Collections.singletonList(new C109D((C191888105e) c104a, c191848103q));
                }
                if (c104a instanceof C104Z) {
                    return Collections.singletonList(new C104X((C104Z) c104a, c191848103q));
                }
                if (c104a instanceof C104I) {
                    final C104I c104i = (C104I) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c104i) { // from class: X.104F
                        public final C104I LLILLJJLI;

                        {
                            this.LLILLJJLI = c104i;
                        }

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context context) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new AnonymousClass1042(this.LLILLJJLI.LJIIIIZZ));
                            return arrayList;
                        }
                    });
                }
                if (c104a instanceof C105V) {
                    final C105V c105v = (C105V) c104a;
                    return Collections.singletonList(new AbstractC191843103l(c191848103q, c105v) { // from class: X.105W
                        public final C191848103q LLILLJJLI;
                        public final C105V LLILLL;

                        @Override // X.AbstractC191843103l
                        public final List<AbstractC191840103i> LJ(Context v) {
                            /*
                                this = this;
                                java.util.ArrayList r1 = new java.util.ArrayList
                                r1.<init>()
                                X.105V r0 = r12.LLILLL
                                X.103N r2 = r0.LIZLLL
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.CharSequence r4 = r2.LIZ(r0)
                                boolean r0 = android.text.TextUtils.isEmpty(r4)
                                if (r0 != 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                kotlin.jvm.functions.Function1<? super android.content.Context, java.lang.Boolean> r2 = r0.LJI
                                r7 = 0
                                if (r2 == 0) goto L54
                                X.103q r0 = r12.LLILLJJLI
                                android.content.Context r0 = r0.LIZ
                                java.lang.Object r2 = r2.invoke(r0)
                            L26:
                                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                                r8 = 1
                                r0 = r0 ^ 1
                                if (r0 == 0) goto L8c
                                X.105V r0 = r12.LLILLL
                                java.util.List<X.1Fj2> r2 = r0.LJFF
                                if (r2 == 0) goto L56
                                java.util.ArrayList r11 = new java.util.ArrayList
                                r0 = 10
                                int r0 = X.C15438062q.LJIJJ(r2, r0)
                                r11.<init>(r0)
                                java.util.Iterator r2 = r2.iterator()
                                boolean r0 = r2.hasNext()
                                if (r0 == 0) goto L57
                                java.lang.Object r0 = r2.next()
                                r0.getClass()
                                throw r7
                            L54:
                                r2 = r7
                                goto L26
                            L56:
                                r11 = r7
                            L57:
                                X.106E r3 = new X.106E
                                X.105V r0 = r12.LLILLL
                                X.105Y r2 = r0.LJ
                                if (r2 == 0) goto L91
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L91
                                java.lang.Integer r5 = r0.LIZ
                            L65:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L95
                                java.lang.Integer r6 = r0.LIZIZ
                            L6b:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L71
                                X.105b r7 = r0.LIZJ
                            L71:
                                X.105X r0 = r2.LIZ
                                if (r0 == 0) goto L77
                                int r8 = r0.LIZLLL
                            L77:
                                r10 = 0
                                if (r2 == 0) goto L8d
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L8d
                                int r9 = r0.LIZ
                            L80:
                                X.105Z r0 = r2.LIZIZ
                                if (r0 == 0) goto L86
                                int r10 = r0.LIZIZ
                            L86:
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                                r1.add(r3)
                            L8c:
                                return r1
                            L8d:
                                r9 = 0
                                if (r2 == 0) goto L86
                                goto L80
                            L91:
                                r5 = r7
                                if (r2 == 0) goto L95
                                goto L65
                            L95:
                                r6 = r7
                                if (r2 == 0) goto L77
                                goto L6b
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C105W.LJ(android.content.Context):java.util.List");
                        }

                        {
                            this.LLILLJJLI = c191848103q;
                            this.LLILLL = c105v;
                        }
                    });
                }
                return C13BV.INSTANCE;
            }
        });
    }

    public static List LIZ(C191848103q c191848103q, List list) {
        C104D c104d;
        List<AbstractC191843103l> listLIZ;
        AnonymousClass1031 anonymousClass1031;
        AbstractC191843103l abstractC191843103lLIZ;
        Map<Object, InterfaceC191818102m> map;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C104A c104a = (C104A) it2.next();
            InterfaceC191818102m interfaceC191818102m = c104a.LIZIZ;
            if (interfaceC191818102m == null && ((map = c191848103q.LJFF) == null || (interfaceC191818102m = map.get(c104a.getClass())) == null)) {
                interfaceC191818102m = (InterfaceC191818102m) ((LinkedHashMap) LIZ).get(c104a.getClass());
            }
            if ((interfaceC191818102m instanceof AnonymousClass1031) && (anonymousClass1031 = (AnonymousClass1031) interfaceC191818102m) != null && (abstractC191843103lLIZ = anonymousClass1031.LIZ(c191848103q, c104a)) != null) {
                arrayList.add(abstractC191843103lLIZ);
            }
            if ((interfaceC191818102m instanceof C104D) && (c104d = (C104D) interfaceC191818102m) != null && (listLIZ = c104d.LIZ(c191848103q, c104a)) != null) {
                arrayList.addAll(listLIZ);
            }
        }
        return arrayList;
    }
}
