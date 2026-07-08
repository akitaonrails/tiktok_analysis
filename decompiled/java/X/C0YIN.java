package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Objects;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0YIN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YIN implements InterfaceC864950XwT, Comparable<C0YIN> {
    public final long LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC864880XwM LLILZ;
    public Object[] LLILZIL;
    public Request LLILZLL;
    public Response LLIZ;
    public AbstractC867440Y1e LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public long LLJJI;
    public final C871040YFa LLJJIII;
    public final C868780Y6i LLJJIJI;

    public final int LJI() {
        Integer num;
        Request request = this.LLILZLL;
        return (request == null || (num = request.cmd) == null) ? C0YMR.IMCMD_NOT_USED.getValue() : num.intValue();
    }

    public final String LJIIIZ() {
        Response response = this.LLIZ;
        return response == null ? "" : response.log_id;
    }

    public final int LJIIJ() {
        C0YIY c0yiyLIZ = C0YHP.LIZ(this.LLJJIII, LJI());
        if (c0yiyLIZ != null) {
            return Math.max(c0yiyLIZ.LIZ, 0);
        }
        int i = this.LLJILLL;
        return i <= 0 ? this.LLJJIII.LIZJ.LIZ : i;
    }

    public final boolean LJIIJJI() {
        Integer num;
        Response response = this.LLIZ;
        if (response == null || (num = response.status_code) == null) {
            return false;
        }
        return num.intValue() == C0YIF.LIZ || this.LLIZ.status_code.intValue() == 200;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestItem[cmd:");
        sbLIZ.append(LJI());
        sbLIZ.append(", seqId:");
        sbLIZ.append(this.LL);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(X.C0YIN r7) {
        /*
            r6 = this;
            X.0YIN r7 = (X.C0YIN) r7
            boolean r0 = r6.equals(r7)
            r5 = 0
            if (r0 != 0) goto L26
            int r1 = r6.LJI()
            int r0 = r7.LJI()
            if (r1 == r0) goto L27
            X.0YMR r2 = X.C0YMR.SEND_MESSAGE
            int r0 = r2.getValue()
            if (r1 == r0) goto L34
            int r1 = r7.LJI()
            int r0 = r2.getValue()
            if (r1 != r0) goto L27
        L25:
            r5 = 1
        L26:
            return r5
        L27:
            long r3 = r6.LL
            long r0 = r7.LL
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L25
            if (r0 >= 0) goto L26
        L34:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YIN.compareTo(java.lang.Object):int");
    }

    public static C0YIN LJFF(C0YEM c0yem, int i) {
        return LIZJ(c0yem.LJIILL(), c0yem.LIZLLL(), i);
    }

    public static Object LJII(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            return null;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public final void LJIIL(int i, String str) {
        if (this.LLILZLL != null) {
            C0YON c0yon = new C0YON();
            Request request = this.LLILZLL;
            c0yon.LIZLLL = request.cmd;
            c0yon.LJII = request.inbox_type;
            c0yon.LJI = str;
            c0yon.LJ = Long.valueOf(this.LL);
            c0yon.LJFF = Integer.valueOf(i);
            this.LLIZ = c0yon.build();
            this.LLJ = i;
        }
    }

    public static C0YIN LIZJ(C871040YFa c871040YFa, C868780Y6i c868780Y6i, int i) {
        C0YIN c0yin = new C0YIN(c871040YFa, c868780Y6i, -1L, null);
        c0yin.LLJ = i;
        c0yin.LLILZ = null;
        return c0yin;
    }

    public C0YIN(C871040YFa c871040YFa, C868780Y6i c868780Y6i, long j, AbstractC867440Y1e abstractC867440Y1e) {
        Objects.requireNonNull(c871040YFa);
        this.LLJJIII = c871040YFa;
        Objects.requireNonNull(c868780Y6i);
        this.LLJJIJI = c868780Y6i;
        this.LL = j;
        this.LLIZLLLIL = abstractC867440Y1e;
        SystemClock.uptimeMillis();
    }
}
