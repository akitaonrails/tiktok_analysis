package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227470i2z extends C1225970i0Z {
    public final EnumC1226540i1U LLILLL;
    public final AbstractC1225770i0F LLILZ;
    public final C1227100i2O LLILZIL;
    public List<? extends AbstractC1223800hx4> LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final AtomicInteger LLJILJILJ;

    @Override // X.C1225970i0Z, X.InterfaceC1224300hxs
    public final void LJIILL(String str) {
    }

    @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
    public final void LJJ(FrameLayout frameLayout, String str) {
    }

    @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
    public final View LJ() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ.LJJJJLL().LIZIZ()), R.layout.de4, null, false);
        C1749280vcc c1749280vcc = (C1749280vcc) viewTd.findViewById(R.id.h3a);
        Pair pair = new Pair(((C1227810i3X) this.LLJIJIL.getValue()).LIZ, ((C1227810i3X) this.LLJIJIL.getValue()).LIZIZ);
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
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
        c1722300uv6.LJI = str;
        c1722300uv6.LJIIIIZZ = str2;
        c1749280vcc.setStatus(c1722300uv6);
        return viewTd;
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224300hxs
    public final void LJJI() {
        this.LLJILJILJ.set(0);
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224300hxs
    public final void LJIJI(String str) {
        LJJJJJL(str);
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJIL(InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1223750hwz(this, null), interfaceC1364105Vn);
    }

    public final void LJJJJJL(String str) {
        String str2;
        if (!this.LLILZIL.LJIILIIL) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.LLIZ = str;
        }
        if (!this.LLIZLLLIL) {
            return;
        }
        try {
            Map<String, String> map = ((GroupInviteListRequest) this.LLJ.getValue()).bizExt;
            if (map != null) {
                str2 = map.get("time_range");
            } else {
                str2 = null;
            }
            String str3 = this.LLIZ;
            if (str3 != null) {
                C1226780i1s c1226780i1s = C1226780i1s.LIZ;
                String strLIZJ = this.LLILZ.LJJJJLL().LJIIIZ().LIZJ();
                C1227100i2O c1227100i2O = this.LLILZIL;
                String str4 = c1227100i2O.LJIIJ;
                List<? extends AbstractC1223800hx4> list = this.LLILZLL;
                if (str2 == null) {
                    str2 = "";
                }
                String str5 = c1227100i2O.LJIIL;
                c1226780i1s.getClass();
                C1226780i1s.LIZ(str3, strLIZJ, str4, str2, str5, list);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJJI(Object obj, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1223740hwy(obj, this, null), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJIZL(int r10, X.InterfaceC1364105Vn<? super kotlin.Pair<com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse, ? extends java.util.List<? extends X.AbstractC1223800hx4>>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1223760hx0
            if (r0 == 0) goto L26
            r5 = r11
            X.0hx0 r5 = (X.C1223760hx0) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r8 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 0
            r3 = 2
            r7 = 1
            if (r0 == 0) goto L34
            if (r0 == r7) goto L61
            if (r0 != r3) goto L2c
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse r2 = r5.LL
            goto L81
        L26:
            X.0hx0 r5 = new X.0hx0
            r5.<init>(r9, r11)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r8)
            if (r10 != 0) goto L3f
            java.util.concurrent.atomic.AtomicInteger r1 = r9.LLJILJILJ     // Catch: java.lang.Exception -> L90
            r0 = 0
            r1.set(r0)     // Catch: java.lang.Exception -> L90
        L3f:
            X.01GW r0 = r9.LLJ     // Catch: java.lang.Exception -> L90
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L90
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest r2 = (com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest) r2     // Catch: java.lang.Exception -> L90
            java.lang.Integer r1 = X.C2286608xc.LJ(r10)     // Catch: java.lang.Exception -> L90
            r0 = 254(0xfe, float:3.56E-43)
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest r1 = com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest.LIZ(r2, r1, r4, r0)     // Catch: java.lang.Exception -> L90
            X.0i6v r0 = X.InterfaceC1229280i5u.LIZ     // Catch: java.lang.Exception -> L90
            r0.getClass()     // Catch: java.lang.Exception -> L90
            X.0i5u r0 = X.C1229910i6v.LIZIZ     // Catch: java.lang.Exception -> L90
            r5.LLILZ = r7     // Catch: java.lang.Exception -> L90
            java.lang.Object r8 = r0.LIZIZ(r1, r5)     // Catch: java.lang.Exception -> L90
            if (r8 != r6) goto L64
            return r6
        L61:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L90
        L64:
            r2 = r8
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse r2 = (com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse) r2     // Catch: java.lang.Exception -> L90
            java.util.List<com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListCell> r1 = r2.cells     // Catch: java.lang.Exception -> L90
            if (r1 == 0) goto L88
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L90
            r0 = r0 ^ 1
            if (r0 == 0) goto L74
            r4 = r1
        L74:
            if (r4 == 0) goto L88
            r5.LL = r2     // Catch: java.lang.Exception -> L90
            r5.LLILZ = r3     // Catch: java.lang.Exception -> L90
            java.lang.Object r8 = r9.LJJJJJ(r4, r5)     // Catch: java.lang.Exception -> L90
            if (r8 != r6) goto L84
            return r6
        L81:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L90
        L84:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L90
            if (r8 != 0) goto L8a
        L88:
            X.13BV r8 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L90
        L8a:
            kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Exception -> L90
            r1.<init>(r2, r8)     // Catch: java.lang.Exception -> L90
            return r1
        L90:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse r2 = new com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse
            r3 = 0
            r7 = 15
            r4 = r3
            r5 = r3
            r6 = r3
            r8 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.13BV r0 = X.C13BV.INSTANCE
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1227470i2z.LJJJJIZL(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJ(java.util.List<com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListCell> r36, X.InterfaceC1364105Vn<? super java.util.List<? extends X.AbstractC1223800hx4>> r37) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1227470i2z.LJJJJJ(java.util.List, X.05Vn):java.lang.Object");
    }

    public C1227470i2z(EnumC1226540i1U enumC1226540i1U, AbstractC1225770i0F abstractC1225770i0F, C1227100i2O c1227100i2O) {
        super(c1227100i2O);
        this.LLILLL = enumC1226540i1U;
        this.LLILZ = abstractC1225770i0F;
        this.LLILZIL = c1227100i2O;
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3331));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3329));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3330));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3332));
        this.LLJILJILJ = new AtomicInteger(0);
    }
}
