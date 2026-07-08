package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0m3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381740m3o extends AbstractC1382080m4M<C1369480lk2, IMUser, IMContact> {
    public final C1369480lk2 LIZ;

    @Override // X.AbstractC1382080m4M
    public final AbstractC2250601D7a LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC1382080m4M
    public final /* bridge */ /* synthetic */ AbstractC2250601D7a LIZIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lk2] */
    public C1381740m3o(final C1368260li4 c1368260li4) {
        this.LIZ = new AbstractC2250601D7a<IMUser, IMContact>(c1368260li4) { // from class: X.0lk2
            public static final /* synthetic */ int LJIIIIZZ = 0;
            public final C1368260li4 LJI;
            public final AFwS259S0000000_21 LJII = AFwS259S0000000_21.get$arr$(13);

            @Override // X.AbstractC2250601D7a
            public final Function1<IMUser, IMContact> LIZJ() {
                return this.LJII;
            }

            {
                this.LJI = c1368260li4;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
            @Override // X.AbstractC2250601D7a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMUser>> r14) {
                /*
                    r13 = this;
                    boolean r0 = r14 instanceof X.C1369490lk3
                    if (r0 == 0) goto L74
                    r12 = r14
                    X.0lk3 r12 = (X.C1369490lk3) r12
                    int r2 = r12.LLILLL
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L74
                    int r2 = r2 - r1
                    r12.LLILLL = r2
                L12:
                    java.lang.Object r2 = r12.LL
                    java.lang.Object r1 = X.C099R.LJFF()
                    int r0 = r12.LLILLL
                    r9 = 1
                    if (r0 == 0) goto L3f
                    if (r0 != r9) goto Lbe
                    X.C155000ia.LIZIZ(r2)
                L22:
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r2 = r2.iterator()
                L2d:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L7a
                    java.lang.Object r1 = r2.next()
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
                    if (r0 == 0) goto L2d
                    r3.add(r1)
                    goto L2d
                L3f:
                    X.C155000ia.LIZIZ(r2)
                    X.0li4 r2 = r13.LJI
                    r2.LJIIL = r9
                    r2.LJIILLIIL = r9
                    r0 = 1000(0x3e8, float:1.401E-42)
                    r2.LJJIFFI = r0
                    r2.LJJII = r9
                    X.0lmR r0 = com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi.LIZ
                    r0.getClass()
                    com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi r0 = X.C1370970lmR.LIZ()
                    X.0lcL r2 = r0.LIZIZ()
                    X.0li4 r0 = r13.LJI
                    int r3 = r0.LIZ
                    boolean r4 = r0.LIZIZ
                    boolean r5 = r0.LJIIL
                    boolean r6 = r0.LJIILLIIL
                    int r7 = r0.LJJIFFI
                    boolean r8 = r0.LJJII
                    r10 = 0
                    r12.LLILLL = r9
                    r11 = 0
                    java.lang.Object r2 = r2.LIZLLL(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    if (r2 != r1) goto L22
                    return r1
                L74:
                    X.0lk3 r12 = new X.0lk3
                    r12.<init>(r13, r14)
                    goto L12
                L7a:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    X.0li4 r2 = r13.LJI
                    boolean r1 = r2.LIZIZ
                    if (r1 == 0) goto Lb0
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Iterator r4 = r3.iterator()
                L8e:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto Lb8
                    java.lang.Object r3 = r4.next()
                    r2 = r3
                    com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r2
                    int r1 = r2.getFollowStatus()
                    r0 = 2
                    if (r1 != r0) goto L8e
                    java.lang.String r0 = r2.getUid()
                    boolean r0 = X.C10EU.LJIIZILJ(r0)
                    if (r0 != 0) goto L8e
                    r5.add(r3)
                    goto L8e
                Lb0:
                    boolean r1 = r2.LJJIJIIJI
                    if (r1 == 0) goto Lbd
                    r0.addAll(r3)
                    return r0
                Lb8:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>(r5)
                Lbd:
                    return r0
                Lbe:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1369480lk2.LJ(X.05Vn):java.lang.Object");
            }

            @Override // X.AbstractC2250601D7a
            public final Object LJI(InterfaceC1364105Vn<? super List<IMUser>> interfaceC1364105Vn) {
                return new ArrayList();
            }
        };
    }
}
