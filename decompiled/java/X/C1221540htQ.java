package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.detailpage.audit.assem.AuditRequestNavAssem;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0htQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221540htQ extends C09AY implements InterfaceC1685430txd<UIAssem, EnumC1217960hne, Integer, Boolean, List<? extends Long>, C627660Ojc<C1218000hni>, Unit> {
    public final /* synthetic */ AuditRequestNavAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221540htQ(AuditRequestNavAssem auditRequestNavAssem) {
        super(6);
        this.LL = auditRequestNavAssem;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    @Override // X.InterfaceC1685430txd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.bytedance.assem.arch.core.UIAssem r14, X.EnumC1217960hne r15, java.lang.Integer r16, java.lang.Boolean r17, java.util.List<? extends java.lang.Long> r18, X.C627660Ojc<X.C1218000hni> r19) {
        /*
            r13 = this;
            r2 = r16
            r0 = r19
            r6 = r18
            r1 = r17
            java.lang.Number r2 = (java.lang.Number) r2
            int r12 = r2.intValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r11 = r1.booleanValue()
            java.util.List r6 = (java.util.List) r6
            X.0Ojc r0 = (X.C627660Ojc) r0
            X.06Xk<X.0OhC> r0 = r0.LL
            boolean r0 = r0 instanceof X.C1623706Xj
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.detailpage.audit.assem.AuditRequestNavAssem r8 = r13.LL
            r8.getClass()
            r10 = 0
            if (r12 != 0) goto Lc4
            r1 = 1
        L2a:
            X.0hne r5 = X.EnumC1217960hne.SINGLE
            if (r15 != r5) goto Lb8
            r0 = 1
        L2f:
            r9 = 1
            if (r0 == 0) goto Lbc
            if (r1 != 0) goto Lbc
            r7 = 1
        L35:
            r3 = 0
        L36:
            com.bytedance.tux.navigation.TuxNavBar r2 = r8.Go()
            kotlin.jvm.internal.AwS33S0010000_19 r1 = new kotlin.jvm.internal.AwS33S0010000_19
            r0 = 27
            r1.<init>(r9, r0)
            java.lang.String r0 = "tag_left_arrow"
            r2.LJJ(r1, r0)
            com.bytedance.tux.navigation.TuxNavBar r2 = r8.Go()
            kotlin.jvm.internal.AwS33S0010000_19 r1 = new kotlin.jvm.internal.AwS33S0010000_19
            r0 = 28
            r1.<init>(r7, r0)
            java.lang.String r0 = "tag_right_option"
            r2.LJJ(r1, r0)
            com.bytedance.tux.navigation.TuxNavBar r2 = r8.Go()
            kotlin.jvm.internal.AwS33S0010000_19 r1 = new kotlin.jvm.internal.AwS33S0010000_19
            r0 = 29
            r1.<init>(r3, r0)
            java.lang.String r0 = "tag_right_cancel"
            r2.LJJ(r1, r0)
            com.ss.android.ugc.aweme.detailpage.audit.assem.AuditRequestNavAssem r3 = r13.LL
            int r1 = r6.size()
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L89
            if (r12 != 0) goto L8c
            r0 = 2131830179(0x7f1125a3, float:1.9293348E38)
            java.lang.String r2 = r2.getString(r0)
        L7b:
            com.bytedance.tux.navigation.TuxNavBar r1 = r3.Go()
            X.0idj r0 = new X.0idj
            r0.<init>()
            r0.LIZJ = r2
            r1.LJIJJ(r0)
        L89:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L8c:
            if (r15 != r5) goto L9e
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r1[r10] = r0
            r0 = 2131830155(0x7f11258b, float:1.92933E38)
            java.lang.String r2 = r2.getString(r0, r1)
            goto L7b
        L9e:
            X.0hne r0 = X.EnumC1217960hne.BATCH
            if (r15 != r0) goto Lb5
            if (r11 != 0) goto La5
            r12 = r1
        La5:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r1[r10] = r0
            r0 = 2131830188(0x7f1125ac, float:1.9293366E38)
            java.lang.String r2 = r2.getString(r0, r1)
            goto L7b
        Lb5:
            java.lang.String r2 = ""
            goto L7b
        Lb8:
            r0 = 0
            if (r1 != 0) goto L2f
            r9 = 0
        Lbc:
            r7 = 0
            if (r0 != 0) goto L35
            if (r1 != 0) goto L35
            r3 = 1
            goto L36
        Lc4:
            r1 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1221540htQ.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
