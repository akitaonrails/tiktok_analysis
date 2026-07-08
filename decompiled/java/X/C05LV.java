package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.logicunit.updater.MessageRequestIMUserUpdater$produceAccessory$1$1", f = "MessageRequestIMUserUpdater.kt", l = {179}, m = "invokeSuspend")
public final class C05LV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public final /* synthetic */ IMUser LLILLJJLI;
    public final /* synthetic */ C1718506oB LLILLL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LV(IMUser iMUser, C1718506oB c1718506oB, InterfaceC879010Ye3 interfaceC879010Ye3, String str, InterfaceC1364105Vn<? super C05LV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMUser;
        this.LLILLL = c1718506oB;
        this.LLILZ = interfaceC879010Ye3;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MessageRequestIMUserUpdater@3d52.produceAccessory$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 1
            if (r0 == 0) goto L79
            if (r0 != r5) goto L97
            X.C155000ia.LIZIZ(r8)
        L13:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo r0 = r0.getImUserBizInfo()
            r1 = 0
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo r0 = r0.getUserB2CAccountInfo()
            if (r0 == 0) goto L45
            long r3 = r0.lastUpdateTime
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L45
            X.06oB r0 = r7.LLILLL
            java.util.concurrent.ConcurrentHashMap<X.0Ye3, java.util.Map<java.lang.String, java.lang.Long>> r1 = r0.LLIZLLLIL
            X.0Ye3 r0 = r7.LLILZ
            java.lang.Object r2 = r1.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L77
            java.lang.String r1 = r7.LLILZIL
            java.lang.Long r0 = X.C2286608xc.LJFF(r3)
            java.lang.Object r0 = r2.put(r1, r0)
        L41:
            X.C1C7U.LIZIZ(r6)
            return r0
        L45:
            X.06oB r0 = r7.LLILLL
            java.util.concurrent.ConcurrentHashMap<X.0Ye3, java.util.Map<java.lang.String, java.lang.Boolean>> r1 = r0.LLIZ
            X.0Ye3 r0 = r7.LLILZ
            java.lang.Object r1 = r1.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L5e
            java.lang.String r0 = r7.LLILZIL
            boolean r0 = r1.containsKey(r0)
            if (r0 != r5) goto L5e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L41
        L5e:
            X.06oB r0 = r7.LLILLL
            java.util.concurrent.ConcurrentHashMap<X.0Ye3, java.util.Map<java.lang.String, java.lang.Boolean>> r1 = r0.LLIZ
            X.0Ye3 r0 = r7.LLILZ
            java.lang.Object r2 = r1.get(r0)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L77
            java.lang.String r1 = r7.LLILZIL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r0 = r2.put(r1, r0)
            goto L41
        L77:
            r0 = 0
            goto L41
        L79:
            X.C155000ia.LIZIZ(r8)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r1 = r0.LJ()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = r7.LLILLJJLI
            r7.LL = r5
            java.lang.Object r0 = r1.LJIILJJIL(r0, r7)
            if (r0 != r2) goto L13
            X.C1C7U.LIZIZ(r6)
            return r2
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05LV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
