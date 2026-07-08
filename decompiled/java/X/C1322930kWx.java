package X;

import Y.ARunnableS106S0100000_6;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322930kWx {
    public final Uri LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final WeakReference<ImageView> LIZJ;
    public final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> LIZLLL;
    public final C1322950kWz LJ;
    public C1323050kX9<AbstractC1327750kej> LJFF;

    public final void LIZ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS106S0100000_6((Function0) function0, 338));
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0kWz] */
    public C1322930kWx(Uri uri, C417420GYi c417420GYi) {
        int measuredWidth;
        InterfaceC1320200kSY interfaceC1320200kSYLJI;
        this.LIZ = uri;
        this.LIZJ = new WeakReference<>(c417420GYi);
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        if (c417420GYi.getMeasuredWidth() != 0) {
            measuredWidth = c417420GYi.getMeasuredWidth();
        } else {
            measuredWidth = 100;
        }
        c1325700kbQLIZLLL.LIZJ = new C1324630kZh(measuredWidth, c417420GYi.getMeasuredHeight() != 0 ? c417420GYi.getMeasuredHeight() : 100);
        c1325700kbQLIZLLL.LJ = C1324670kZl.LIZJ;
        C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
        if (C1322200kVm.LIZ().LJIIL(c1325710kbRLIZ)) {
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            c1325540kbALIZ.getClass();
            interfaceC1320200kSYLJI = c1325540kbALIZ.LJII(c1325710kbRLIZ, this, EnumC1320950kTl.BITMAP_MEMORY_CACHE, null);
        } else {
            interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325710kbRLIZ, this);
        }
        this.LIZLLL = interfaceC1320200kSYLJI;
        this.LJ = new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0kWz
            @Override // X.C0HWE, X.InterfaceC589510NAf
            public final void LIZIZ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
            }

            @Override // X.C0HWE, X.InterfaceC589510NAf
            public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
            }

            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                Throwable thLIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailureImpl : ");
                if (interfaceC1320200kSY != null) {
                    thLIZLLL = interfaceC1320200kSY.LIZLLL();
                } else {
                    thLIZLLL = null;
                }
                sbLIZ.append(thLIZLLL);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[PHI: r0
              0x009e: PHI (r0v9 X.0kX9<X.0kej>) = (r0v8 X.0kX9<X.0kej>), (r0v24 X.0kX9<X.0kej>) binds: [B:30:0x009c, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.C0HWE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJFF(X.InterfaceC1320200kSY<X.C1323050kX9<X.AbstractC1327750kej>> r8) {
                /*
                    r7 = this;
                    if (r8 == 0) goto Lbb
                    boolean r0 = r8.LIZ()
                    if (r0 == 0) goto Lbb
                    java.lang.Object r2 = r8.getResult()
                    X.0kX9 r2 = (X.C1323050kX9) r2
                    X.0kWx r0 = r7.LIZ
                    java.lang.ref.WeakReference<android.widget.ImageView> r0 = r0.LIZJ
                    java.lang.Object r5 = r0.get()
                    android.widget.ImageView r5 = (android.widget.ImageView) r5
                    if (r2 == 0) goto Lbb
                    if (r5 == 0) goto Lb8
                    java.lang.Object r6 = r2.get()     // Catch: java.lang.Throwable -> L91
                    X.0kej r6 = (X.AbstractC1327750kej) r6     // Catch: java.lang.Throwable -> L91
                    boolean r0 = r6 instanceof X.AbstractC1325130kaV     // Catch: java.lang.Throwable -> L91
                    if (r0 == 0) goto L32
                    X.0kWx r3 = r7.LIZ     // Catch: java.lang.Throwable -> L91
                    Y.AObjectS294S0200000_20 r1 = new Y.AObjectS294S0200000_20     // Catch: java.lang.Throwable -> L91
                    r0 = 2
                    r1.<init>(r6, r5, r0)     // Catch: java.lang.Throwable -> L91
                    r3.LIZ(r1)     // Catch: java.lang.Throwable -> L91
                    goto L8a
                L32:
                    boolean r0 = r6 instanceof X.C1329380khM     // Catch: java.lang.Throwable -> L91
                    if (r0 == 0) goto L5e
                    java.lang.Class<?> r0 = X.C1322200kVm.LIZ     // Catch: java.lang.Throwable -> L91
                    X.0kfL r0 = X.C1328130kfL.LJIILIIL()     // Catch: java.lang.Throwable -> L91
                    X.0kX0 r1 = r0.LIZJ()     // Catch: java.lang.Throwable -> L91
                    if (r1 == 0) goto L8a
                    android.content.Context r0 = r5.getContext()     // Catch: java.lang.Throwable -> L91
                    X.0kSR r0 = r1.getAnimatedDrawableFactory(r0)     // Catch: java.lang.Throwable -> L91
                    if (r0 == 0) goto L8a
                    X.0kWx r4 = r7.LIZ     // Catch: java.lang.Throwable -> L91
                    android.graphics.drawable.Drawable r3 = r0.LIZJ(r6)     // Catch: java.lang.Throwable -> L91
                    if (r3 == 0) goto L8a
                    Y.AObjectS294S0200000_20 r1 = new Y.AObjectS294S0200000_20     // Catch: java.lang.Throwable -> L91
                    r0 = 3
                    r1.<init>(r3, r5, r0)     // Catch: java.lang.Throwable -> L91
                    r4.LIZ(r1)     // Catch: java.lang.Throwable -> L91
                    goto L8a
                L5e:
                    int r3 = r6.getSizeInBytes()     // Catch: java.lang.Throwable -> L91
                    byte[] r1 = new byte[r3]     // Catch: java.lang.Throwable -> L91
                    r0 = 0
                    android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r1, r0, r3)     // Catch: java.lang.Throwable -> L91
                    if (r4 == 0) goto L77
                    X.0kWx r3 = r7.LIZ     // Catch: java.lang.Throwable -> L91
                    Y.AObjectS294S0200000_20 r1 = new Y.AObjectS294S0200000_20     // Catch: java.lang.Throwable -> L91
                    r0 = 4
                    r1.<init>(r4, r5, r0)     // Catch: java.lang.Throwable -> L91
                    r3.LIZ(r1)     // Catch: java.lang.Throwable -> L91
                    goto L8a
                L77:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L91
                    java.lang.String r0 = "failed (DecodedBitmap) : uri="
                    r1.append(r0)     // Catch: java.lang.Throwable -> L91
                    X.0kWx r0 = r7.LIZ     // Catch: java.lang.Throwable -> L91
                    android.net.Uri r0 = r0.LIZ     // Catch: java.lang.Throwable -> L91
                    r1.append(r0)     // Catch: java.lang.Throwable -> L91
                    X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L91
                L8a:
                    X.0kWx r0 = r7.LIZ
                    X.0kX9<X.0kej> r0 = r0.LJFF
                    if (r0 == 0) goto La1
                    goto L9e
                L91:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La6
                    X.C1323050kX9.LJII(r2)     // Catch: java.lang.Throwable -> La6
                    X.0kWx r0 = r7.LIZ
                    X.0kX9<X.0kej> r0 = r0.LJFF
                    if (r0 == 0) goto La1
                L9e:
                    X.C1323050kX9.LJII(r0)
                La1:
                    X.0kWx r0 = r7.LIZ
                    r0.LJFF = r2
                    return
                La6:
                    r1 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La6
                    X.0kWx r0 = r7.LIZ
                    X.0kX9<X.0kej> r0 = r0.LJFF
                    if (r0 == 0) goto Lb3
                    X.C1323050kX9.LJII(r0)
                Lb3:
                    X.0kWx r0 = r7.LIZ
                    r0.LJFF = r2
                    throw r1
                Lb8:
                    X.C1323050kX9.LJII(r2)
                Lbb:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1322950kWz.LJFF(X.0kSY):void");
            }
        };
    }
}
