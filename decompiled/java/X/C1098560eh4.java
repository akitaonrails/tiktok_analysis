package X;

import com.bytedance.android.livesdk.model.BannerInRoom;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.banner.view.NativeBannerViewImpl$startExpandJob$1", f = "NativeBannerViewImpl.kt", l = {481}, m = "invokeSuspend")
public final class C1098560eh4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1098550eh3 LLILLL;
    public final /* synthetic */ BannerInRoom LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098560eh4(long j, C1098550eh3 c1098550eh3, BannerInRoom bannerInRoom, int i, InterfaceC1364105Vn<? super C1098560eh4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1098550eh3;
        this.LLILZ = bannerInRoom;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1098560eh4(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "NativeBannerViewImpl@d53e.startExpandJob$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LL
            r2 = 1
            if (r0 == 0) goto La2
            if (r0 != r2) goto Lb3
            X.C155000ia.LIZIZ(r7)
        L13:
            X.0eh3 r1 = r6.LLILLL
            com.bytedance.android.livesdk.model.BannerInRoom r0 = r6.LLILZ
            r1.getClass()
            r1 = 0
            X.0egd r3 = X.C1098550eh3.LJJ(r0, r1)
            X.0eh3 r0 = r6.LLILLL
            X.0ehI r2 = r0.LLJILJILJ
            boolean r0 = r2 instanceof X.C1098700ehI
            if (r0 == 0) goto L92
            if (r2 == 0) goto L93
            int r1 = r6.LLILZIL
            androidx.recyclerview.widget.RecyclerView r0 = r2.LLILZIL
            if (r0 == 0) goto L90
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.findViewHolderForAdapterPosition(r1)
            boolean r0 = r1 instanceof X.AbstractC1098620ehA
            if (r0 == 0) goto L90
            X.0ehA r1 = (X.AbstractC1098620ehA) r1
            if (r1 == 0) goto L90
            int r4 = r1.L5()
        L3f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "startExpandJob: "
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "NativeBannerViewImpl"
            X.C20441214yg.LIZIZ(r0, r1)
            if (r2 == 0) goto L69
            int r1 = r6.LLILZIL
            androidx.recyclerview.widget.RecyclerView r0 = r2.LLILZIL
            if (r0 == 0) goto L69
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.findViewHolderForAdapterPosition(r1)
            boolean r0 = r1 instanceof X.AbstractC1098620ehA
            if (r0 == 0) goto L69
            X.0ehA r1 = (X.AbstractC1098620ehA) r1
            if (r1 == 0) goto L69
            r1.I5()
        L69:
            X.0eh3 r0 = r6.LLILLL
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r0.LLJL
            com.bytedance.android.livesdk.model.BannerInRoom r0 = r6.LLILZ
            int r0 = r0.hashCode()
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            java.lang.String r0 = r3.LIZ
            r2.put(r1, r0)
            X.0eh3 r2 = r6.LLILLL
            com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget r1 = r2.LLILZLL
            if (r1 == 0) goto L8a
            X.0eh9 r0 = new X.0eh9
            r0.<init>()
            r1.S1(r4, r3, r0)
        L8a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L90:
            r4 = -1
            goto L3f
        L92:
            r2 = r1
        L93:
            r0 = 56
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r4 = X.C814420VxA.LIZIZ(r0)
            goto L3f
        La2:
            X.C155000ia.LIZIZ(r7)
            long r0 = r6.LLILLJJLI
            r6.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r5)
            return r3
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1098560eh4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
