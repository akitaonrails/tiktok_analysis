package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439800HMk extends C09AY implements InterfaceC1631620sYq<Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ AIGCPictureHandler LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Function1<List<String>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439800HMk(AIGCPictureHandler aIGCPictureHandler, Activity activity, List list, Function1 function1) {
        super(3);
        this.LL = activity;
        this.LLILLJJLI = aIGCPictureHandler;
        this.LLILLL = list;
        this.LLILZ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // X.InterfaceC1631620sYq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.lang.Integer r23, X.InterfaceC1680500tpg r24, java.lang.Integer r25) {
        /*
            r22 = this;
            r0 = r25
            r3 = r24
            r1 = r23
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            X.0tpg r3 = (X.InterfaceC1680500tpg) r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r4 = 4
            if (r0 != 0) goto L21
            boolean r0 = r3.LJIJI(r2)
            if (r0 == 0) goto Lac
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L33
            r3.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r3.LJJIIJZLJL(r0)
            r0 = r5 & 14
            r6 = 0
            r1 = 1
            if (r0 != r4) goto Laa
            r0 = 1
        L40:
            java.lang.Object r7 = r3.LJJ()
            if (r0 != 0) goto L4f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L58
        L4f:
            kotlin.jvm.internal.AwS51S0001000_6 r7 = new kotlin.jvm.internal.AwS51S0001000_6
            r0 = 0
            r7.<init>(r2, r0)
            r3.LJJIJIIJI(r7)
        L58:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            r3.LJ()
            X.0tW1 r9 = X.EnumC1668310tW1.Normal
            r5 = r22
            android.app.Activity r0 = r5.LL
            android.content.res.Resources r4 = r0.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r6] = r0
            r0 = 2131755013(0x7f100005, float:1.9140893E38)
            java.lang.String r13 = r4.getQuantityString(r0, r1, r2)
            r11 = 0
            kotlin.jvm.internal.AwS90S0500000_6 r14 = new kotlin.jvm.internal.AwS90S0500000_6
            android.app.Activity r15 = r5.LL
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler r2 = r5.LLILLJJLI
            java.util.List<java.lang.String> r1 = r5.LLILLL
            kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, kotlin.Unit> r0 = r5.LLILZ
            r20 = 1
            r18 = r7
            r19 = r0
            r16 = r2
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0 = -2008274109(0xffffffff884c2b43, float:-6.143987E-34)
            X.12De r16 = X.C13Z4.LIZJ(r0, r14, r3)
            r8 = 0
            r19 = 805309872(0x30000db0, float:4.658558E-10)
            r21 = 1456(0x5b0, float:2.04E-42)
            r10 = r8
            r12 = r11
            r14 = r11
            r15 = r11
            r17 = r11
            r18 = r3
            r20 = r8
            X.C1668330tW3.LJI(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L30
        Laa:
            r0 = 0
            goto L40
        Lac:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439800HMk.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
