package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341330DZr extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ Function1<Integer, Unit> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C341330DZr(Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, Context context, LifecycleOwner lifecycleOwner, Function1<? super Boolean, Unit> function13, Function0<Unit> function0) {
        super(2);
        this.LL = function1;
        this.LLILLJJLI = function12;
        this.LLILLL = context;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = function13;
        this.LLILZLL = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC1680500tpg r14, java.lang.Integer r15) {
        /*
            r13 = this;
            r9 = r14
            X.0tpg r9 = (X.InterfaceC1680500tpg) r9
            java.lang.Number r15 = (java.lang.Number) r15
            int r0 = r15.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r9.LIZ()
            if (r0 == 0) goto L1a
            r9.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131837433(0x7f1141f9, float:1.930806E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r9)
            r12 = 1
            r0 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
            r9.LJJIIJZLJL(r0)
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r0 = r13.LL
            boolean r1 = r9.LJJIIJ(r0)
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r0 = r13.LLILLJJLI
            boolean r0 = r9.LJJIIJ(r0)
            r1 = r1 | r0
            android.content.Context r0 = r13.LLILLL
            boolean r0 = r9.LJII(r0)
            r1 = r1 | r0
            androidx.lifecycle.LifecycleOwner r0 = r13.LLILZ
            boolean r0 = r9.LJII(r0)
            r1 = r1 | r0
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r0 = r13.LLILZIL
            boolean r0 = r9.LJJIIJ(r0)
            r1 = r1 | r0
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r13.LLILZLL
            boolean r0 = r9.LJJIIJ(r0)
            r1 = r1 | r0
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r3 = r13.LL
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r4 = r13.LLILLJJLI
            android.content.Context r5 = r13.LLILLL
            androidx.lifecycle.LifecycleOwner r6 = r13.LLILZ
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r7 = r13.LLILZIL
            kotlin.jvm.functions.Function0<kotlin.Unit> r8 = r13.LLILZLL
            java.lang.Object r2 = r9.LJJ()
            if (r1 != 0) goto L6c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L74
        L6c:
            X.0dxW r2 = new X.0dxW
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.LJJIJIIJI(r2)
        L74:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r9.LJ()
            r7 = 48
            r8 = 0
            r11 = r2
            X.C1668330tW3.LJIIIIZZ(r7, r8, r9, r10, r11, r12)
            r0 = 2131837432(0x7f1141f8, float:1.9308059E38)
            java.lang.String r10 = X.C0MBB.LIZIZ(r0, r9)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r9.LJJIIJZLJL(r0)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r13.LLILZLL
            boolean r0 = r9.LJJIIJ(r0)
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r13.LLILZLL
            java.lang.Object r11 = r9.LJJ()
            if (r0 != 0) goto La4
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r11 != r0) goto Lae
        La4:
            kotlin.jvm.internal.AwS560S0100000_16 r11 = new kotlin.jvm.internal.AwS560S0100000_16
            r0 = 731(0x2db, float:1.024E-42)
            r11.<init>(r1, r0)
            r9.LJJIJIIJI(r11)
        Lae:
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            r9.LJ()
            r7 = 48
            r8 = 0
            X.C1668330tW3.LJIIIZ(r7, r8, r9, r10, r11, r12)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341330DZr.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
