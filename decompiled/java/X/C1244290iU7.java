package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import jkp.j;
import kotlin.jvm.internal.AwS48S0102000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: renamed from: X.0iU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244290iU7 {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem r7, X.InterfaceC1680500tpg r8, int r9) {
        /*
            r0 = 1598268649(0x5f43a4e9, float:1.4097649E19)
            X.13ZC r4 = r8.LJIIJ(r0)
            r0 = r9 & 6
            r1 = 2
            if (r0 != 0) goto L85
            boolean r0 = r4.LJII(r7)
            if (r0 == 0) goto L83
            r0 = 4
        L13:
            r0 = r0 | r9
        L14:
            r0 = r0 & 3
            if (r0 != r1) goto L30
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L30
            r4.LIZJ()
        L21:
            X.13Ys r2 = r4.LJJJJZI()
            if (r2 == 0) goto L2f
            kotlin.jvm.internal.AwS179S0101000_19 r1 = new kotlin.jvm.internal.AwS179S0101000_19
            r0 = 5
            r1.<init>(r7, r9, r0)
            r2.LIZLLL = r1
        L2f:
            return
        L30:
            X.13DR r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.LIZIZ
            java.lang.Object r5 = r4.LJJIL(r0)
            android.content.Context r5 = (android.content.Context) r5
            java.util.List<com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem> r0 = r7.alertToneValueItems
            r6 = 0
            if (r0 == 0) goto L61
            java.util.Iterator r3 = r0.iterator()
        L41:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem r0 = (com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem) r0
            java.lang.String r1 = r0.alertToneValue
            java.lang.String r0 = r7.selectedValue
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L41
            r6 = r2
        L59:
            com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem r6 = (com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem) r6
            if (r6 == 0) goto L61
            java.lang.String r3 = r6.alertToneValueTitle
            if (r3 != 0) goto L68
        L61:
            r0 = 2131827532(0x7f111b4c, float:1.928798E38)
            java.lang.String r3 = r5.getString(r0)
        L68:
            X.13DR r1 = X.C1689320u3u.LIZ
            X.0u4J r0 = X.C1689570u4J.LIZ
            X.13DO r2 = r1.LIZJ(r0)
            kotlin.jvm.internal.AwS156S1200000_19 r1 = new kotlin.jvm.internal.AwS156S1200000_19
            r0 = 1
            r1.<init>(r7, r5, r3, r0)
            r0 = -28604375(0xfffffffffe4b8829, float:-6.7635067E37)
            X.12De r1 = X.C13Z4.LIZJ(r0, r1, r4)
            r0 = 56
            X.C13ZT.LIZ(r2, r1, r4, r0)
            goto L21
        L83:
            r0 = 2
            goto L13
        L85:
            r0 = r9
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1244290iU7.LIZJ(com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem, X.0tpg, int):void");
    }

    public static final void LIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1665500tRU interfaceC1665500tRU) {
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1270171173);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1665500tRU)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i5 != 0) {
                interfaceC1665500tRU = j.LLILLL;
            }
            C1689210u3j.LJIIIIZZ(6, 0, c13zcLJIIJ, C13Z4.LIZJ(-1294820434, new AwS633S0100000_19(interfaceC1665500tRU, (InterfaceC1665500tRU<AlertToneItem>) 47), c13zcLJIIJ));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS48S0102000_19(interfaceC1665500tRU, (InterfaceC1665500tRU<AlertToneItem>) i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.AlertToneViewModel r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, X.InterfaceC1680500tpg r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1244290iU7.LIZIZ(com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.AlertToneViewModel, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }
}
