package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0FNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389010FNb extends AbstractC365870EWb {
    public final C554970Lpf LIZ;

    @Override // X.AbstractC365870EWb
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return 1;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return 800;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    public C389010FNb(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean z;
        AwemeDraft awemeDraft = this.LIZ.LJ;
        if (awemeDraft.LJ != null && awemeDraft.LJJJJIZL.recordMode != 1) {
            String str = awemeDraft.LJJIZ;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !z;
            String str2 = this.LIZ.LJ.LJII;
            if (z2 && str2 != null && str2.length() != 0) {
                C0VSJ c0vsj = new C0VSJ(str2);
                boolean zExists = c0vsj.exists();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DraftMusicRestoreHandler");
                sbLIZ.append(" duet music path = [");
                sbLIZ.append(str2);
                sbLIZ.append("], isMusicExist: ");
                sbLIZ.append(zExists);
                C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if ((zExists && c0vsj.length() > 0) || C2486109oh.LIZJ(C0CHQ.LIZ, UriProtector.parse(str2))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C389020FNc
            if (r0 == 0) goto L3b
            r4 = r6
            X.0FNc r4 = (X.C389020FNc) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L5a
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L41
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r1
            java.lang.Object r3 = r5.LIZJ(r4)
            if (r3 != r2) goto L22
            return r2
        L3b:
            X.0FNc r4 = new X.0FNc
            r4.<init>(r5, r6)
            goto L12
        L41:
            X.0Lpf r0 = r5.LIZ
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = r0.LJ
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r0.LJ
            if (r0 == 0) goto L54
            boolean r0 = X.C571350Maz.LIZ(r0)
            if (r0 == 0) goto L54
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L54:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389010FNb.LIZLLL(X.05Vn):java.lang.Object");
    }

    @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
    public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        String str = awemeDraft.LJII;
        if (str != null && str.length() > 0) {
            return C2097908Jt.LIZJ(new Pair(C0FAO.MUSIC, Collections.singletonList(str)));
        }
        return C2097608Jq.LJ();
    }

    @Override // X.AbstractC365870EWb
    public final Object LJII(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C0MYP(this, null));
    }
}
