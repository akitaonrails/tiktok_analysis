package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226810i1v extends C1225970i0Z {
    public final EnumC1226540i1U LLILLL;
    public final AbstractC1225770i0F LLILZ;
    public final C1225500hzo LLILZIL;
    public C099F LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C1226830i1x LLJIJIL;

    @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
    public final View LJ() {
        if (!((Boolean) this.LLJI.getValue()).booleanValue()) {
            return null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ.LJJJJLL().LIZIZ()), R.layout.cj_, null, false);
        Pair pair = new Pair(2131828492, 2131828491);
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        C1749280vcc c1749280vcc = (C1749280vcc) viewTd.findViewById(R.id.h3a);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.my;
        Drawable drawableLIZ = c0hti.LIZ(viewTd.getContext());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1722300uv6.LJFF = Integer.valueOf(iIntValue);
        c1722300uv6.LJII = Integer.valueOf(iIntValue2);
        c1749280vcc.setStatus(c1722300uv6);
        return viewTd;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIL(X.InterfaceC1364105Vn<? super X.AbstractC1223670hwr> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1226820i1w
            if (r0 == 0) goto L22
            r5 = r8
            X.0i1w r5 = (X.C1226820i1w) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            X.0i1v r0 = r5.LL
            goto L7a
        L22:
            X.0i1w r5 = new X.0i1w
            r5.<init>(r7, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.099F r2 = r7.LLILZLL
            if (r2 == 0) goto L47
            boolean r0 = r2.isActive()
            if (r0 == 0) goto L47
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "refresh restart"
            r1.<init>(r0)
            r2.LIZIZ(r1)
        L47:
            X.099F r3 = X.C090F.LIZIZ()
            r7.LLILZLL = r3
            X.01GW r0 = r7.LLIZ
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L5f
            X.05nk r1 = X.C1461005nk.LIZ
            X.0i1x r0 = r7.LLJIJIL
            X.C1658206eS.LIZ(r1, r2, r0)
            goto L6d
        L5f:
            X.099F r2 = r7.LLILZLL
            if (r2 == 0) goto L6d
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "empty convId"
            r1.<init>(r0)
            r2.LJJJJJ(r1)
        L6d:
            r5.LL = r7     // Catch: java.lang.Exception -> L89
            r5.LLILZ = r4     // Catch: java.lang.Exception -> L89
            java.lang.Object r1 = r3.LJLIIIL(r5)     // Catch: java.lang.Exception -> L89
            if (r1 != r6) goto L78
            return r6
        L78:
            r0 = r7
            goto L7d
        L7a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L89
        L7d:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L89
            java.util.List r0 = r0.LJJJJIZL(r1)     // Catch: java.lang.Exception -> L89
            X.0hwq r1 = new X.0hwq     // Catch: java.lang.Exception -> L89
            r1.<init>(r0)     // Catch: java.lang.Exception -> L89
            return r1
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0hws r1 = new X.0hws
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226810i1v.LJJIL(X.05Vn):java.lang.Object");
    }

    public final List<AbstractC1223800hx4> LJJJJIZL(List<C1462005nu> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (C1462005nu c1462005nu : list) {
            String uid = c1462005nu.getUid();
            IMUser iMUserLIZ = C05QS.LIZ(c1462005nu);
            if (uid != null && iMUserLIZ != null) {
                C1461005nk c1461005nk = C1461005nk.LIZ;
                int iLJFF = c1461005nk.LJFF(Long.valueOf(C866950Xzh.LIZLLL(uid)), (String) this.LLIZ.getValue());
                EnumC1224830hyj enumC1224830hyj = EnumC1224830hyj.NORMAL;
                String uniqueId = iMUserLIZ.getUniqueId();
                C0Z9N c0z9n = C0Z9N.OWNER;
                if (iLJFF == c0z9n.getValue()) {
                    uniqueId = this.LLILZ.LJJJJLL().LIZIZ().getString(2131828483);
                    enumC1224830hyj = EnumC1224830hyj.NORMAL_WITH_GRAY_DESC;
                } else if (iLJFF == C0Z9N.ADMIN.getValue()) {
                    uniqueId = this.LLILZ.LJJJJLL().LIZIZ().getString(2131830147);
                    enumC1224830hyj = EnumC1224830hyj.NORMAL_WITH_GRAY_DESC;
                }
                if (Intrinsics.LJFF(uid, C461720I8s.LIZIZ())) {
                    z = false;
                } else {
                    int iLJFF2 = c1461005nk.LJFF(Long.valueOf(C461720I8s.LIZJ()), (String) this.LLIZ.getValue());
                    int iLJFF3 = c1461005nk.LJFF(Long.valueOf(C866950Xzh.LIZLLL(uid)), (String) this.LLIZ.getValue());
                    if (iLJFF2 == c0z9n.getValue() || (iLJFF2 == C0Z9N.ADMIN.getValue() && iLJFF3 == C0Z9N.ORDINARY.getValue())) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                arrayList.add(new C1224840hyk(new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, this.LLILLL.getValue()), enumC1224830hyj, "private", uid, iMUserLIZ.getDisplayAvatar(), C1226140i0q.LIZ(iMUserLIZ), uniqueId, z, z, C2097608Jq.LJIIIIZZ(new Pair("contact", iMUserLIZ), new Pair("template_key", this.LLILZ.LJJJJLL().LJIIJ()), new Pair("ext_enter_from", this.LLILZ.LJJJJLL().LJIIIZ().LIZJ()), new Pair("ext_enter_method", this.LLILZ.LJJJJLL().LJIIIZ().LIZLLL())), ((List) this.LLJ.getValue()).contains(uid), ((List) this.LLJ.getValue()).contains(uid), ((List) this.LLJ.getValue()).contains(uid), !z, C1908030zkf.LJ(iMUserLIZ.getCustomVerify(), iMUserLIZ.getEnterpriseVerifyReason()), 1024));
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0i1x] */
    public C1226810i1v(AbstractC1225770i0F abstractC1225770i0F, C1225500hzo c1225500hzo) {
        super(c1225500hzo);
        EnumC1226540i1U enumC1226540i1U = EnumC1226540i1U.TAB_KEY_GROUP_MEMBER;
        this.LLILLL = enumC1226540i1U;
        this.LLILZ = abstractC1225770i0F;
        this.LLILZIL = c1225500hzo;
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3100));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3101));
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3099));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3102));
        this.LLJIJIL = new C05QR() { // from class: X.0i1x
            @Override // X.C05QR
            public final void WB2(String str) {
            }

            @Override // X.C05QR
            public final void Ys1(C05QT c05qt, String str, List list) {
                C1226810i1v c1226810i1v = this.LL;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    BaseContact baseContact = (BaseContact) it2.next();
                    if (((Boolean) c1226810i1v.LLIZLLLIL.getValue()).booleanValue() || !C461720I8s.LJI(baseContact.getUid())) {
                        if (baseContact != null) {
                            arrayList.add(baseContact);
                        }
                    }
                }
                C099F c099f = this.LL.LLILZLL;
                if (c099f != null) {
                    c099f.LJJLIIIJILLIZJL(arrayList);
                }
                this.LL.LLILZLL = null;
            }
        };
    }
}
