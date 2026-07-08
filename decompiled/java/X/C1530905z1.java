package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05z1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.analytics.EditShareAnalytics$reportMobEventForHighLight$1", f = "EditShareAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1530905z1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ InterfaceC1493105sv LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530905z1(String str, String str2, String str3, Integer num, String str4, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv, String str5, InterfaceC1364105Vn<? super C1530905z1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = num;
        this.LLILZIL = str4;
        this.LLILZLL = map;
        this.LLIZ = interfaceC1493105sv;
        this.LLIZLLLIL = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1530905z1(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "EditShareAnalytics@8bd4.reportMobEventForHighLight$1"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            X.0Whz r2 = new X.0Whz
            r2.<init>()
            java.lang.String r1 = r6.LL
            if (r1 == 0) goto L19
            java.lang.String r0 = "anchor_id"
            r2.put(r0, r1)
        L19:
            java.lang.String r3 = r6.LLILLJJLI
            if (r3 == 0) goto L50
            java.lang.String r0 = "to_user_id"
            r2.put(r0, r3)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r1 = r0.LJ()
            r0 = 0
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r4 = r1.LJ(r3, r0)
            if (r4 == 0) goto L92
            int r3 = r4.getFollowStatus()
            r1 = 1
            if (r3 == r1) goto L85
            r0 = 2
            if (r3 == r0) goto L88
            r0 = 4
            if (r3 == r0) goto L88
            int r0 = r4.getFollowerStatus()
            if (r0 != r1) goto L82
            java.lang.String r1 = "1"
        L4b:
            java.lang.String r0 = "follow_status"
            r2.put(r0, r1)
        L50:
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = r6.LLILLL
            r2.put(r1, r0)
            java.lang.Integer r0 = r6.LLILZ
            if (r0 == 0) goto L67
            r0.intValue()
            java.lang.String r1 = "gifter_ranking"
            java.lang.String r0 = r0.toString()
            r2.put(r1, r0)
        L67:
            java.lang.String r1 = r6.LLILZIL
            if (r1 == 0) goto L70
            java.lang.String r0 = "fragment_id"
            r2.put(r0, r1)
        L70:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.LLILZLL
            r2.putAll(r0)
            X.05sv r1 = r6.LLIZ
            java.lang.String r0 = r6.LLIZLLLIL
            r1.sendEvent(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L82:
            java.lang.String r1 = "0"
            goto L4b
        L85:
            java.lang.String r1 = "3"
            goto L4b
        L88:
            int r0 = r4.getFollowStatus()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r1 != 0) goto L4b
        L92:
            java.lang.String r1 = "-1"
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1530905z1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
