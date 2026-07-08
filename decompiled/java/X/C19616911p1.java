package X;

import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11p1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.view.LiveEventStickerView$handleStickerButtonClick$1", f = "LiveEventStickerView.kt", l = {260, 263, 272}, m = "invokeSuspend")
public final class C19616911p1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C19663611wY LLILLL;
    public final /* synthetic */ ILiveEventService LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C19662711wP LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19616911p1(boolean z, C19663611wY c19663611wY, ILiveEventService iLiveEventService, String str, C19662711wP c19662711wP, InterfaceC1364105Vn<? super C19616911p1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c19663611wY;
        this.LLILZ = iLiveEventService;
        this.LLILZIL = str;
        this.LLILZLL = c19662711wP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19616911p1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        if (r1 == false) goto L33;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "LiveEventStickerView@a7.handleStickerButtonClick$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L47
            if (r0 == r3) goto L72
            if (r0 != r6) goto Lb4
            X.C155000ia.LIZIZ(r9)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r9)
            boolean r0 = r8.LLILLJJLI
            if (r0 == 0) goto L51
            X.11wY r1 = r8.LLILLL
            java.lang.String r0 = "livesdk_live_event_register_cancel"
            X.0IjA r0 = X.C0IJT.LIZ(r0)
            X.C19662511wN.LIZIZ(r0, r1)
            X.C19662511wN.LIZ(r0, r1)
            r0.LIZ()
            com.bytedance.android.livesdk.comp.api.event.ILiveEventService r1 = r8.LLILZ
            java.lang.String r0 = r8.LLILZIL
            r8.LL = r2
            java.lang.Object r9 = r1.NH2(r0, r8)
            if (r9 != r5) goto L4a
            X.C1C7U.LIZIZ(r7)
            return r5
        L47:
            X.C155000ia.LIZIZ(r9)
        L4a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r1 = r9.booleanValue()
            goto L7b
        L51:
            X.11wY r1 = r8.LLILLL
            java.lang.String r0 = "livesdk_live_event_register"
            X.0IjA r0 = X.C0IJT.LIZ(r0)
            X.C19662511wN.LIZIZ(r0, r1)
            X.C19662511wN.LIZ(r0, r1)
            r0.LIZ()
            com.bytedance.android.livesdk.comp.api.event.ILiveEventService r1 = r8.LLILZ
            java.lang.String r0 = r8.LLILZIL
            r8.LL = r3
            java.lang.Object r9 = r1.ZC2(r0, r8)
            if (r9 != r5) goto L75
            X.C1C7U.LIZIZ(r7)
            return r5
        L72:
            X.C155000ia.LIZIZ(r9)
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r1 = r9.booleanValue()
        L7b:
            boolean r0 = r8.LLILLJJLI
            if (r0 != 0) goto Lac
            if (r1 == 0) goto Lae
            X.11wY r1 = r8.LLILLL
            java.lang.String r0 = "livesdk_live_event_register_success"
            X.0IjA r0 = X.C0IJT.LIZ(r0)
            X.C19662511wN.LIZIZ(r0, r1)
            X.C19662511wN.LIZ(r0, r1)
            r0.LIZ()
        L92:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r4 = X.C2107308Nj.LIZ
            X.11p2 r3 = new X.11p2
            X.11wY r2 = r8.LLILLL
            X.11wP r1 = r8.LLILZLL
            r0 = 0
            r3.<init>(r2, r1, r0)
            r8.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r8, r4, r3)
            if (r0 != r5) goto L19
            X.C1C7U.LIZIZ(r7)
            return r5
        Lac:
            if (r1 != 0) goto L92
        Lae:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19616911p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
