package Y;

import X.C1364170lbT;
import X.C2296808zG;
import X.C786410Ut5;
import X.EnumC1364050lbH;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public class AgS207S0200000_21 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS207S0200000_21(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS207S0200000_21 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1364250lbb
            if (r0 == 0) goto L51
            r6 = r9
            X.0lbb r6 = (X.C1364250lbb) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L57
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.lang.Object r0 = r7.l1
            X.0lbT r0 = (X.C1364170lbT) r0
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r0.LL
            java.util.Set r0 = r0.LJIILL()
            boolean r0 = r0.contains(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r2.booleanValue()
            java.lang.Object r0 = r7.l1
            X.0lbT r0 = (X.C1364170lbT) r0
            r0.LLJIJIL = r1
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L22
            return r5
        L51:
            X.0lbb r6 = new X.0lbb
            r6.<init>(r7, r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS207S0200000_21.emit$0(Y.AgS207S0200000_21, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS207S0200000_21 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1364230lbZ
            if (r0 == 0) goto L43
            r4 = r7
            X.0lbZ r4 = (X.C1364230lbZ) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L49
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Object r0 = r5.l1
            X.0lbT r0 = (X.C1364170lbT) r0
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r0.LL
            boolean r0 = r0.LLJJJ
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L43:
            X.0lbZ r4 = new X.0lbZ
            r4.<init>(r5, r7)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS207S0200000_21.emit$1(Y.AgS207S0200000_21, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS207S0200000_21 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1364140lbQ
            if (r0 == 0) goto L51
            r6 = r9
            X.0lbQ r6 = (X.C1364140lbQ) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L57
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.lang.Object r0 = r7.l1
            X.0lb7 r0 = (X.C1363950lb7) r0
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r0.LL
            java.util.Set r0 = r0.LJIILL()
            boolean r0 = r0.contains(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r2.booleanValue()
            java.lang.Object r0 = r7.l1
            X.0lb7 r0 = (X.C1363950lb7) r0
            r0.LLJJIJI = r1
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L22
            return r5
        L51:
            X.0lbQ r6 = new X.0lbQ
            r6.<init>(r7, r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS207S0200000_21.emit$2(Y.AgS207S0200000_21, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.AgS207S0200000_21 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1364150lbR
            if (r0 == 0) goto L45
            r4 = r7
            X.0lbR r4 = (X.C1364150lbR) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L4b
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r6 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMContact) r6
            java.lang.Object r0 = r5.l1
            X.0lb7 r0 = (X.C1363950lb7) r0
            boolean r0 = r0.L5(r6)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L45:
            X.0lbR r4 = new X.0lbR
            r4.<init>(r5, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS207S0200000_21.emit$3(Y.AgS207S0200000_21, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$4(AgS207S0200000_21 agS207S0200000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        float f;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C2296808zG.LJI((InterfaceC497601wk) agS207S0200000_21.l0)) {
            C1364170lbT c1364170lbT = (C1364170lbT) agS207S0200000_21.l1;
            SmartAvatarImageView smartAvatarImageView = c1364170lbT.LLILZIL;
            if (zBooleanValue && c1364170lbT.LLILLL == EnumC1364050lbH.MASK_WITH_CHECK_MARK) {
                f = 0.34f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.J5(smartAvatarImageView, f);
        }
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS207S0200000_21 agS207S0200000_21, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C2296808zG.LJI((InterfaceC497601wk) agS207S0200000_21.l0)) {
            ((C1364170lbT) agS207S0200000_21.l1).LLJILJIL = !zBooleanValue;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$6(Y.AgS207S0200000_21 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1364160lbS
            if (r0 == 0) goto L51
            r6 = r9
            X.0lbS r6 = (X.C1364160lbS) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L57
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.lang.Object r0 = r7.l1
            X.0lb9 r0 = (X.C1363970lb9) r0
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r0.LL
            java.util.Set r0 = r0.LJIILL()
            boolean r0 = r0.contains(r8)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r2.booleanValue()
            java.lang.Object r0 = r7.l1
            X.0lb9 r0 = (X.C1363970lb9) r0
            r0.LLIZ = r1
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L22
            return r5
        L51:
            X.0lbS r6 = new X.0lbS
            r6.<init>(r7, r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS207S0200000_21.emit$6(Y.AgS207S0200000_21, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
