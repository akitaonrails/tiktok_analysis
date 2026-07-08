package X;

import X.InterfaceC19925612xi;

/* JADX INFO: renamed from: X.12xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19925512xh<ContainingType extends InterfaceC19925612xi, Type> extends AbstractC19925412xg<ContainingType, Type> {
    public final ContainingType LIZ;
    public final Type LIZIZ;
    public final InterfaceC19925612xi LIZJ;
    public final C19926412xq LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C19925512xh(InterfaceC19925612xi interfaceC19925612xi, Object obj, InterfaceC19925612xi interfaceC19925612xi2, C19926412xq c19926412xq) {
        if (interfaceC19925612xi != 0) {
            if (c19926412xq.LLILLL == AnonymousClass1334.MESSAGE && interfaceC19925612xi2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.LIZ = interfaceC19925612xi;
            this.LIZIZ = obj;
            this.LIZJ = interfaceC19925612xi2;
            this.LIZLLL = c19926412xq;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }
}
