package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: X.0pB6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501580pB6 extends AbstractC1501480pAw {
    public static final C1501580pB6 LIZ = new C1501580pB6();

    @Override // X.AbstractC1501480pAw
    public final InterfaceC1501470pAv LIZ(Type type, Annotation[] annotationArr) {
        if (C1502190pC5.LJFF(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type typeLJ = C1502190pC5.LJ(0, (ParameterizedType) type);
            if (C1502190pC5.LJFF(typeLJ) != C1500770p9n.class) {
                return new InterfaceC1501470pAv<R, CompletableFuture<R>>(typeLJ) { // from class: X.0pB8
                    public final Type LIZ;

                    @Override // X.InterfaceC1501470pAv
                    public final Type LIZ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = typeLJ;
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [X.0pBC, java.lang.Object] */
                    @Override // X.InterfaceC1501470pAv
                    public final Object LIZIZ(final C1500200p8s c1500200p8s) throws Throwable {
                        final ?? r1 = new CompletableFuture<Object>() { // from class: X.0pBC
                            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
                            public final boolean cancel(boolean z) {
                                if (z) {
                                    c1500200p8s.cancel();
                                }
                                return super.cancel(z);
                            }
                        };
                        c1500200p8s.LLIIIJ(new InterfaceC1500240p8w<Object>() { // from class: X.0pB9
                            @Override // X.InterfaceC1500240p8w
                            public final void onFailure(InterfaceC1501750pBN<Object> interfaceC1501750pBN, Throwable th) {
                                r1.completeExceptionally(th);
                            }

                            @Override // X.InterfaceC1500240p8w
                            public final void onResponse(InterfaceC1501750pBN<Object> interfaceC1501750pBN, C1500770p9n<Object> c1500770p9n) {
                                if (c1500770p9n.LIZ()) {
                                    r1.complete(c1500770p9n.LIZIZ);
                                } else {
                                    r1.completeExceptionally(new C1500760p9m(c1500770p9n));
                                }
                            }
                        });
                        return r1;
                    }
                };
            }
            if (typeLJ instanceof ParameterizedType) {
                final Type typeLJ2 = C1502190pC5.LJ(0, (ParameterizedType) typeLJ);
                return new InterfaceC1501470pAv<R, CompletableFuture<C1500770p9n<R>>>(typeLJ2) { // from class: X.0pB7
                    public final Type LIZ;

                    @Override // X.InterfaceC1501470pAv
                    public final Type LIZ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = typeLJ2;
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [X.0pBB, java.lang.Object] */
                    @Override // X.InterfaceC1501470pAv
                    public final Object LIZIZ(final C1500200p8s c1500200p8s) throws Throwable {
                        final ?? r1 = new CompletableFuture<C1500770p9n<Object>>() { // from class: X.0pBB
                            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
                            public final boolean cancel(boolean z) {
                                if (z) {
                                    c1500200p8s.cancel();
                                }
                                return super.cancel(z);
                            }
                        };
                        c1500200p8s.LLIIIJ(new InterfaceC1500240p8w<Object>() { // from class: X.0pBA
                            @Override // X.InterfaceC1500240p8w
                            public final void onFailure(InterfaceC1501750pBN<Object> interfaceC1501750pBN, Throwable th) {
                                r1.completeExceptionally(th);
                            }

                            @Override // X.InterfaceC1500240p8w
                            public final void onResponse(InterfaceC1501750pBN<Object> interfaceC1501750pBN, C1500770p9n<Object> c1500770p9n) {
                                r1.complete(c1500770p9n);
                            }
                        });
                        return r1;
                    }
                };
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
