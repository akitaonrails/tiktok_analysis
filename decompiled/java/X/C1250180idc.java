package X;

import com.ss.android.ugc.profile.business.profile.background.CommitUserBgResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0idc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.background.handler.ImageBackgroundHandler$commitProfileBackground$1$1", f = "ImageBackgroundHandler.kt", l = {}, m = "invokeSuspend")
public final class C1250180idc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommitUserBgResponse LL;
    public final /* synthetic */ C1254890ilD LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1250180idc(CommitUserBgResponse commitUserBgResponse, C1254890ilD c1254890ilD, String str, List<String> list, InterfaceC1364105Vn<? super C1250180idc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commitUserBgResponse;
        this.LLILLJJLI = c1254890ilD;
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1250180idc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "ImageBackgroundHandler@94e8.commitProfileBackground$1$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r14)
            com.ss.android.ugc.profile.business.profile.background.CommitUserBgResponse r2 = r13.LL
            r5 = 1
            r4 = 0
            if (r2 == 0) goto La5
            int r0 = r2.status_code
            if (r0 != 0) goto La2
            r0 = 1
        L16:
            r1 = 0
            if (r0 != 0) goto L1f
            if (r2 == 0) goto La5
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.user
            if (r0 == 0) goto La5
        L1f:
            X.0ilD r8 = r13.LLILLJJLI
            java.lang.String r10 = r13.LLILLL
            java.util.List<java.lang.String> r9 = r13.LLILZ
            androidx.fragment.app.Fragment r0 = r8.LL
            if (r0 == 0) goto Lb3
            X.19EG r11 = r0.getActivity()
            if (r11 == 0) goto Lb3
        L2f:
            X.04ih r0 = new java.lang.Object() { // from class: X.04ih
                static {
                    /*
                        X.04ih r0 = new X.04ih
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.04ih) X.04ih.LIZ X.04ih
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1174904ih.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1174904ih.<init>():void");
                }
            }
            r0.getClass()
            if (r9 == 0) goto L8f
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L8f
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            com.ss.android.ugc.aweme.profile.model.User r3 = r0.getCurUser()
            if (r3 == 0) goto L8f
            r3.setProfileBackgroundMediaType(r5)
            r3.setProfileBackgroundImageUrlList(r9)
            r3.setProfileBackgroundAweme(r1)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            r0.LJIL(r3)
            X.0igJ r2 = X.C1251850igJ.LIZ     // Catch: java.lang.Exception -> L73
            X.0ida r0 = X.C1250160ida.LIZ     // Catch: java.lang.Exception -> L73
            r0.getClass()     // Catch: java.lang.Exception -> L73
            com.ss.android.ugc.profile.platform.base.data.ProfileUser r1 = X.C1250160ida.LIZIZ     // Catch: java.lang.Exception -> L73
            r0 = 711(0x2c7, float:9.96E-43)
            kotlin.jvm.internal.AFwS257S0000000_19 r0 = kotlin.jvm.internal.AFwS257S0000000_19.get$arr$(r0)     // Catch: java.lang.Exception -> L73
            r2.getClass()     // Catch: java.lang.Exception -> L73
            com.ss.android.ugc.profile.platform.base.data.ProfileUser r1 = X.C1251850igJ.LJIILIIL(r3, r1, r5, r0)     // Catch: java.lang.Exception -> L73
            if (r1 == 0) goto L8f
            goto L87
        L73:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0ieQ r1 = X.C1250680ieQ.LIZ
            X.0igJ r0 = X.C1251850igJ.LIZ
            r0.getClass()
            com.google.gson.n r0 = X.C1251850igJ.LIZJ
            r1.getClass()
            X.C1250680ieQ.LJ(r0, r2)
            goto L8f
        L87:
            X.0ida r0 = X.C1250160ida.LIZ
            r0.getClass()
            X.C1250160ida.LIZJ(r1, r4)
        L8f:
            Y.ARunnableS12S1300000_12 r7 = new Y.ARunnableS12S1300000_12
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r11.runOnUiThread(r7)
            X.0ieQ r2 = X.C1250680ieQ.LIZ
            java.lang.String r1 = "photo"
            java.lang.String r0 = "success"
            X.C1250680ieQ.LJIL(r2, r1, r0)
            goto Lb7
        La2:
            r0 = 0
            goto L16
        La5:
            X.0ilD r1 = r13.LLILLJJLI
            if (r2 == 0) goto Lad
            java.lang.String r0 = r2.status_msg
            if (r0 != 0) goto Laf
        Lad:
            java.lang.String r0 = ""
        Laf:
            r1.LJFF(r0)
            goto Lb7
        Lb3:
            android.app.Activity r11 = r8.LLILLJJLI
            if (r11 != 0) goto L2f
        Lb7:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1250180idc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
