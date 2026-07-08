package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19540511ch extends AbstractC1219760hqY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final String LJIIIZ = "MuteCheck";
    public final C19523211Zu LJIIJ = new C19523211Zu(this, "CheckAudioFile");

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19540511ch.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPCheckAudioFileAbility;", 0);
        C13LE.LIZ.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC19524311a5
    public final String LJIILLIIL() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC1219760hqY
    public final Object LJJIJL(List list) {
        boolean z;
        Boolean bool;
        Iterator it2 = list.iterator();
        loop0: while (true) {
            z = true;
            while (it2.hasNext()) {
                InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) it2.next();
                if (!z || (bool = (Boolean) LJJIII(interfaceC19526611aS, "MUTE_CHECK_RESULT")) == null || !bool.booleanValue()) {
                    z = false;
                }
            }
        }
        if (z) {
            return "_CONNECT_ID_DEFAULT";
        }
        return "_CONNECT_ID_IGNORE_ERROR";
    }

    @Override // X.AbstractC19526011aM
    public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        Boolean bool;
        if (c11zu == null) {
            return false;
        }
        String strLJJ = interfaceC19526611aS.LJJ();
        long jUptimeMillis = SystemClock.uptimeMillis();
        C11ZT<?> c11zt = c11zu.LIZ.get(strLJJ);
        Object obj = null;
        if (c11zt != null) {
            Integer num = c11zt.LIZIZ;
            if (num == null) {
                Object obj2 = c11zt.LIZ;
                if (obj2 instanceof Boolean) {
                    obj = obj2;
                }
                bool = (Boolean) obj;
            } else if (jUptimeMillis - c11zt.LIZJ < ((long) num.intValue()) * 1000) {
                Object obj3 = c11zt.LIZ;
                if (obj3 instanceof Boolean) {
                    obj = obj3;
                }
                bool = (Boolean) obj;
            }
            if (bool != null) {
                bool.booleanValue();
                LJJIJIIJI(interfaceC19526611aS, "MUTE_CHECK_RESULT", bool);
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC19526011aM
    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        Boolean bool;
        if (c11zu != null && (bool = (Boolean) LJJIII(interfaceC19526611aS, "MUTE_CHECK_RESULT")) != null) {
            c11zu.LIZ(null, interfaceC19526611aS.LJJ(), Boolean.valueOf(bool.booleanValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // X.AbstractC1219760hqY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIL(X.InterfaceC19526511aR r8, X.InterfaceC19526611aS r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C19541411cq
            if (r0 == 0) goto L5f
            r6 = r10
            X.11cq r6 = (X.C19541411cq) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 != r3) goto L65
            X.11aS r9 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L25:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L2d
            boolean r4 = r1.booleanValue()
        L2d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "MUTE_CHECK_RESULT"
            r7.LJJIJIIJI(r9, r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L39:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "ORIGINAL_FILE_PATH"
            java.lang.Object r2 = r7.LJJIII(r9, r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2d
            X.11Zu r1 = r7.LJIIJ
            X.1Bqa<java.lang.Object>[] r0 = X.C19540511ch.LJIIJJI
            r0 = r0[r4]
            java.lang.Object r0 = r1.getValue(r7, r0)
            X.11dF r0 = (X.InterfaceC19543911dF) r0
            if (r0 == 0) goto L2d
            r6.LL = r9
            r6.LLILZ = r3
            java.lang.Object r1 = r0.LJIILJJIL(r2)
            if (r1 != r5) goto L25
            return r5
        L5f:
            X.11cq r6 = new X.11cq
            r6.<init>(r7, r10)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19540511ch.LJJIJIL(X.11aR, X.11aS, X.05Vn):java.lang.Object");
    }
}
