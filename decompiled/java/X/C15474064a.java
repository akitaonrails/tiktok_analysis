package X;

import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.064a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.utils.ShareHelper$shortenUrlAsync$2", f = "ShareHelper.kt", l = {745}, m = "invokeSuspend")
public final class C15474064a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ SharePackage LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15474064a(int i, SharePackage sharePackage, String str, InterfaceC1364105Vn<? super C15474064a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = sharePackage;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15474064a(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r9 = "ShareHelper@8fdf.shortenUrlAsync$2"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 != r2) goto La5
            X.C155000ia.LIZIZ(r11)
        L13:
            X.C1C7U.LIZIZ(r9)
            return r11
        L17:
            X.C155000ia.LIZIZ(r11)
            int r1 = r10.LLILLL
            com.ss.android.ugc.aweme.sharer.model.SharePackage r3 = r10.LLILZ
            java.lang.String r4 = r10.LLILZIL
            r10.LL = r4
            r10.LLILLJJLI = r2
            X.1DEt r8 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r10)
            r8.<init>(r2, r0)
            r8.LJIJJ()
            X.01GW r0 = X.C15475064b.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = ""
            if (r0 != 0) goto L59
            X.C189200o6.m2constructorimpl(r2)
            r8.resumeWith(r2)
        L46:
            java.lang.Object r11 = r8.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r11 != r0) goto L53
            X.C099Q.LIZJ(r10)
        L53:
            if (r11 != r7) goto L13
            X.C1C7U.LIZIZ(r9)
            return r7
        L59:
            r0 = 6
            if (r1 != r0) goto L9e
            long r5 = java.lang.System.currentTimeMillis()
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage
            if (r0 == 0) goto L80
            r1 = r3
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage r1 = (com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage) r1
            if (r1 != 0) goto L6f
        L69:
            X.C189200o6.m2constructorimpl(r2)
            r8.resumeWith(r2)
        L6f:
            X.06Rs r0 = X.C1609006Rs.LIZ
            r0.getClass()
            boolean r0 = X.C1609006Rs.LIZJ(r1)
            if (r0 == 0) goto L82
            if (r1 == 0) goto L46
            X.C1609006Rs.LIZIZ(r5, r1, r4, r8)
            goto L46
        L80:
            r1 = 0
            goto L69
        L82:
            java.lang.String r2 = r3.url
            java.lang.String r1 = r3.itemType
            r0 = 0
            java.lang.String r4 = X.C1374720lsU.LIZJ(r2, r1, r4, r0, r3)
            android.os.Bundle r3 = r3.extras
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r5
            java.lang.String r0 = "link_duration"
            r3.putLong(r0, r1)
            X.C189200o6.m2constructorimpl(r4)
            r8.resumeWith(r4)
            goto L46
        L9e:
            X.C189200o6.m2constructorimpl(r2)
            r8.resumeWith(r2)
            goto L46
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15474064a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
