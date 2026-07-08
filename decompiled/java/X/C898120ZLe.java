package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898120ZLe extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ LightInteractionCommonResource LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898120ZLe(LightInteractionCommonResource lightInteractionCommonResource, String str, View view, Context context, boolean z, String str2, Map<String, String> map) {
        super(2);
        this.LL = lightInteractionCommonResource;
        this.LLILLJJLI = str;
        this.LLILLL = view;
        this.LLILZ = context;
        this.LLILZIL = z;
        this.LLILZLL = str2;
        this.LLIZ = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r10.booleanValue()
            com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource r0 = r9.LL
            java.lang.String r3 = r0.getToastString()
            if (r3 == 0) goto L75
            int r0 = r3.length()
            r2 = 1
            r7 = 0
            if (r0 <= 0) goto L75
            if (r2 == 0) goto L75
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = r9.LLILLJJLI
            r1[r7] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r8 = X.C786410Ut5.j4(r3, r0)
            if (r8 == 0) goto L75
            android.view.View r1 = r9.LLILLL
            if (r1 == 0) goto L87
            java.lang.String r0 = r9.LLILLJJLI
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = r2 ^ r0
            if (r2 == 0) goto L75
            X.0mGz r3 = new X.0mGz
            r3.<init>(r1)
        L39:
            android.content.Context r5 = r9.LLILZ
            boolean r6 = r9.LLILZIL
            java.lang.String r4 = r9.LLILZLL
            java.util.Map<java.lang.String, java.lang.String> r2 = r9.LLIZ
            int r1 = X.C14KQ.LIZLLL(r5)
            r0 = 2131886953(0x7f120369, float:1.94085E38)
            r3.LJI(r0)
            r3.LJIIJ(r8)
            X.0lWB r0 = r3.LIZ
            r0.LIZIZ = r7
            r0.LIZLLL = r7
            if (r6 == 0) goto L78
            r0 = 70
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
        L64:
            int r0 = r0 + r1
            r3.LIZIZ(r0)
            Y.ACListenerS56S1200000_14 r1 = new Y.ACListenerS56S1200000_14
            r0 = 5
            r1.<init>(r5, r4, r2, r0)
            X.0lWB r0 = r3.LIZ
            r0.LJIIIIZZ = r1
            r3.LJIIJJI()
        L75:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L78:
            r0 = 48
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            goto L64
        L87:
            android.content.Context r0 = r9.LLILZ
            X.19EG r1 = X.C1388190mED.LIZIZ(r0)
            if (r1 == 0) goto L75
            java.lang.String r0 = r9.LLILLJJLI
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = r2 ^ r0
            if (r2 == 0) goto L75
            X.0mGz r3 = new X.0mGz
            r3.<init>(r1)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C898120ZLe.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
