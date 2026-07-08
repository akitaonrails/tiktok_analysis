package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0KpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529330KpP {
    public final List<InterfaceC529320KpO<InterfaceC529290KpL>> LIZ = new ArrayList();
    public final List<InterfaceC529320KpO<InterfaceC529290KpL>> LIZIZ = new ArrayList();

    public final void LIZ(InterfaceC529320KpO<?> interfaceC529320KpO) {
        if (interfaceC529320KpO.LIZIZ() && ((ArrayList) this.LIZIZ).isEmpty()) {
            ((ArrayList) this.LIZ).add(interfaceC529320KpO);
        } else {
            ((ArrayList) this.LIZIZ).add(interfaceC529320KpO);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005c -> B:21:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<? extends X.InterfaceC529320KpO<X.InterfaceC529290KpL>> r13, android.content.Context r14, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r15, X.C0L90 r16, X.InterfaceC1364105Vn<? super java.lang.Boolean> r17) {
        /*
            r12 = this;
            r3 = r17
            r8 = r14
            r9 = r15
            r10 = r16
            boolean r0 = r3 instanceof X.C529340KpQ
            if (r0 == 0) goto L97
            r4 = r3
            X.0KpQ r4 = (X.C529340KpQ) r4
            int r2 = r4.LLIZLLLIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r4.LLIZLLLIL = r2
        L18:
            java.lang.Object r7 = r4.LLILZLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLIZLLLIL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 == r1) goto L5f
            if (r0 != r2) goto L9e
            X.C155000ia.LIZIZ(r7)
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L30:
            X.C155000ia.LIZIZ(r7)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r5 = r13.iterator()
        L39:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r6 = r5.next()
            X.0KpO r6 = (X.InterfaceC529320KpO) r6
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            X.C23118094a.LJI(r0)
            r4.LL = r8
            r4.LLILLJJLI = r9
            r4.LLILLL = r10
            r4.LLILZ = r5
            r4.LLILZIL = r6
            r4.LLIZLLLIL = r1
            java.lang.Object r7 = r6.LIZJ(r9, r10, r4)
            if (r7 != r3) goto L70
            return r3
        L5f:
            X.0KpO r6 = r4.LLILZIL
            java.lang.Object r5 = r4.LLILZ
            java.util.Iterator r5 = (java.util.Iterator) r5
            X.0L90 r10 = r4.LLILLL
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r9 = r4.LLILLJJLI
            java.lang.Object r8 = r4.LL
            android.content.Context r8 = (android.content.Context) r8
            X.C155000ia.LIZIZ(r7)
        L70:
            X.0KpJ r7 = (X.InterfaceC529270KpJ) r7
            boolean r0 = r7 instanceof X.InterfaceC529290KpL
            if (r0 == 0) goto L39
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r0 = r0.LLIILII()
            X.0KpN r5 = new X.0KpN
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.LL = r11
            r4.LLILLJJLI = r11
            r4.LLILLL = r11
            r4.LLILZ = r11
            r4.LLILZIL = r11
            r4.LLIZLLLIL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r5)
            if (r0 != r3) goto L2b
            return r3
        L97:
            X.0KpQ r4 = new X.0KpQ
            r4.<init>(r12, r3)
            goto L18
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La6:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C529330KpP.LIZIZ(java.util.List, android.content.Context, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, X.0L90, X.05Vn):java.lang.Object");
    }
}
