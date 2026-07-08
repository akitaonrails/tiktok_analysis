package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0D27, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D27<T> {
    public final InterfaceC497601wk LIZ;
    public final Function1<InterfaceC1364105Vn<? super C189200o6<? extends T>>, Object> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function1<T, Unit> LIZLLL;
    public final Function1<String, Unit> LJ;
    public final int LJFF;
    public final long LJI;
    public final String LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final boolean LJIIJJI;
    public String LJIIL;
    public AnonymousClass0956 LJIILIIL;
    public AnonymousClass0956 LJIILJJIL;

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJIILIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LJIILJJIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
    }

    public final void LIZLLL() {
        AnonymousClass0956 anonymousClass0956 = this.LJIILJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIILJJIL = C23250099c.LIZLLL(this.LIZ, C0PEM.LIZJ, null, new C0D25(this, this.LJIIL, null), 2);
    }

    public final void LIZIZ(boolean z) {
        AnonymousClass0956 anonymousClass0956 = this.LJIILJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LJIILIIL;
        if (anonymousClass09562 != null && anonymousClass09562.isActive()) {
            if (z) {
                this.LIZJ.invoke();
            }
        } else {
            String string = UUID.randomUUID().toString();
            this.LJIIL = string;
            this.LJIILIIL = C23250099c.LIZLLL(this.LIZ, C0PEM.LIZJ, null, new C0D29(z, this, string, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007e -> B:12:0x002b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008e -> B:12:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C189200o6<? extends T>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C0D2E
            if (r0 == 0) goto L91
            r6 = r11
            X.0D2E r6 = (X.C0D2E) r6
            int r2 = r6.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r6.LLIZ = r2
        L12:
            java.lang.Object r0 = r6.LLILZIL
            java.lang.Object r7 = X.C099R.LJFF()
            int r1 = r6.LLIZ
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L3a
            if (r1 == r4) goto L5d
            if (r1 != r5) goto La8
            int r8 = r6.LLILLL
            int r3 = r6.LLILLJJLI
            X.00zU r2 = r6.LL
            X.C155000ia.LIZIZ(r0)
        L2b:
            int r9 = r8 + 1
            if (r9 < r3) goto L48
            T r0 = r2.element
            X.00o6 r0 = (X.C189200o6) r0
            if (r0 == 0) goto L98
            java.lang.Object r0 = r0.m10unboximpl()
            return r0
        L3a:
            X.C155000ia.LIZIZ(r0)
            X.00zU r2 = new X.00zU
            r2.<init>()
            int r3 = r10.LJFF
            if (r3 >= r4) goto L47
            r3 = 1
        L47:
            r9 = 0
        L48:
            kotlin.jvm.functions.Function1<X.05Vn<? super X.00o6<? extends T>>, java.lang.Object> r0 = r10.LIZIZ
            r6.LL = r2
            r6.LLILLJJLI = r3
            r6.LLILLL = r9
            r6.LLILZ = r9
            r6.LLIZ = r4
            java.lang.Object r0 = r0.invoke(r6)
            if (r0 != r7) goto L5b
            return r7
        L5b:
            r8 = r9
            goto L68
        L5d:
            int r9 = r6.LLILZ
            int r8 = r6.LLILLL
            int r3 = r6.LLILLJJLI
            X.00zU r2 = r6.LL
            X.C155000ia.LIZIZ(r0)
        L68:
            X.00o6 r0 = (X.C189200o6) r0
            java.lang.Object r1 = r0.m10unboximpl()
            boolean r0 = X.C189200o6.m8isSuccessimpl(r1)
            if (r0 == 0) goto L75
            return r1
        L75:
            X.00o6 r0 = X.C189200o6.m1boximpl(r1)
            r2.element = r0
            int r0 = r10.LJFF
            int r0 = r0 - r4
            if (r9 >= r0) goto L2b
            long r0 = r10.LJI
            r6.LL = r2
            r6.LLILLJJLI = r3
            r6.LLILLL = r8
            r6.LLIZ = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r7) goto L2b
            return r7
        L91:
            X.0D2E r6 = new X.0D2E
            r6.<init>(r10, r11)
            goto L12
        L98:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r0 = "Fetch failed before producing a result"
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D27.LIZJ(X.05Vn):java.lang.Object");
    }

    public C0D27(InterfaceC497601wk interfaceC497601wk, Function1 function1, Function0 function0, Function1 function12, Function1 function13, int i, String str, Function0 function02, long j, long j2, boolean z, int i2) {
        long j3;
        Function0 function03 = function02;
        String str2 = str;
        long j4 = j;
        long j5 = j2;
        boolean z2 = z;
        int i3 = (i2 & 32) != 0 ? 3 : i;
        if ((i2 & 64) != 0) {
            j3 = 1000;
        } else {
            j3 = 0;
        }
        str2 = (i2 & 128) != 0 ? "UcpAsyncFetcher" : str2;
        function03 = (i2 & 256) != 0 ? null : function03;
        j4 = (i2 & 512) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j4;
        j5 = (i2 & 1024) != 0 ? Long.MAX_VALUE : j5;
        z2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2;
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = function1;
        this.LIZJ = function0;
        this.LIZLLL = function12;
        this.LJ = function13;
        this.LJFF = i3;
        this.LJI = j3;
        this.LJII = str2;
        this.LJIIIIZZ = function03;
        this.LJIIIZ = j4;
        this.LJIIJ = j5;
        this.LJIIJJI = z2;
        this.LJIIL = "";
    }
}
