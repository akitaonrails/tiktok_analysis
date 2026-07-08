package X;

import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: renamed from: X.0gOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164110gOn extends C09AY implements InterfaceC1631620sYq<List<? extends MixStruct>, Boolean, Long, Unit> {
    public final /* synthetic */ Function1<Exception, Unit> LL;
    public final /* synthetic */ C1165310gQj LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<MixStruct, Boolean, Long, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1164110gOn(AwS597S0100000_18 awS597S0100000_18, C1165310gQj c1165310gQj, AwS667S0100000_18 awS667S0100000_18) {
        super(3);
        this.LL = awS597S0100000_18;
        this.LLILLJJLI = c1165310gQj;
        this.LLILLL = awS667S0100000_18;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    @Override // X.InterfaceC1631620sYq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.util.List<? extends com.ss.android.ugc.aweme.mix.model.MixStruct> r12, java.lang.Boolean r13, java.lang.Long r14) {
        /*
            r11 = this;
            java.util.List r12 = (java.util.List) r12
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r10 = r13.booleanValue()
            java.lang.Number r14 = (java.lang.Number) r14
            long r8 = r14.longValue()
            java.lang.Object r6 = X.C13LP.LJJJLL(r12)
            com.ss.android.ugc.aweme.mix.model.MixStruct r6 = (com.ss.android.ugc.aweme.mix.model.MixStruct) r6
            if (r6 == 0) goto L5a
            kotlin.jvm.functions.Function1<java.lang.Exception, kotlin.Unit> r2 = r11.LL
            X.0gQj r7 = r11.LLILLJJLI
            X.0sYq<com.ss.android.ugc.aweme.mix.model.MixStruct, java.lang.Boolean, java.lang.Long, kotlin.Unit> r4 = r11.LLILLL
            java.lang.String r5 = r6.mixId
            r3 = 0
            if (r5 == 0) goto L4c
            java.util.Set<java.lang.String> r0 = r7.LJIIIIZZ
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L69
            java.util.List<java.lang.String> r1 = r7.LJII
            r0 = 0
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r1, r0, r5)
            int r0 = r7.LIZ
            int r0 = r0 + 1
            r7.LIZ = r0
            int r0 = r7.LJI
            int r0 = r0 + 1
            r7.LJI = r0
            if (r4 == 0) goto L4c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r4.invoke(r6, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L4a:
            if (r0 != 0) goto L66
        L4c:
            if (r2 == 0) goto L5a
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            r2.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L66
        L5a:
            kotlin.jvm.functions.Function1<java.lang.Exception, kotlin.Unit> r1 = r11.LL
            if (r1 == 0) goto L66
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            r1.invoke(r0)
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L69:
            if (r4 == 0) goto L4c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r4.invoke(r3, r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1164110gOn.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
