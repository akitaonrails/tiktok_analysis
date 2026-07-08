package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0dXF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054030dXF extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ EnterRoomConfig LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ LiveHostWatch LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1054030dXF(Context context, EnterRoomConfig enterRoomConfig, Function0<Unit> function0, LiveHostWatch liveHostWatch) {
        super(2);
        this.LL = context;
        this.LLILLJJLI = enterRoomConfig;
        this.LLILLL = function0;
        this.LLILZ = liveHostWatch;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC1680500tpg r12, java.lang.Integer r13) {
        /*
            r11 = this;
            r7 = r12
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r13 = (java.lang.Number) r13
            int r0 = r13.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L1a
            r7.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131829417(0x7f1122a9, float:1.9291803E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r7)
            r10 = 1
            r4 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r7.LJJIIJZLJL(r4)
            android.content.Context r0 = r11.LL
            boolean r5 = r7.LJII(r0)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r11.LLILLJJLI
            boolean r0 = r7.LJII(r0)
            r5 = r5 | r0
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r11.LLILLL
            boolean r0 = r7.LJJIIJ(r0)
            r5 = r5 | r0
            android.content.Context r3 = r11.LL
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r2 = r11.LLILLJJLI
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r11.LLILLL
            java.lang.Object r9 = r7.LJJ()
            if (r5 != 0) goto L51
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto L5a
        L51:
            kotlin.jvm.internal.AwS251S0300000_7 r9 = new kotlin.jvm.internal.AwS251S0300000_7
            r0 = 7
            r9.<init>(r3, r2, r1, r0)
            r7.LJJIJIIJI(r9)
        L5a:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 48
            r6 = 0
            X.C1668330tW3.LJIIIIZZ(r5, r6, r7, r8, r9, r10)
            r0 = 2131828338(0x7f111e72, float:1.9289614E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r7)
            r7.LJJIIJZLJL(r4)
            com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch r0 = r11.LLILZ
            boolean r4 = r7.LJII(r0)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r11.LLILLJJLI
            boolean r0 = r7.LJII(r0)
            r4 = r4 | r0
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r11.LLILLL
            boolean r0 = r7.LJJIIJ(r0)
            r4 = r4 | r0
            com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch r3 = r11.LLILZ
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r2 = r11.LLILLJJLI
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r11.LLILLL
            java.lang.Object r9 = r7.LJJ()
            if (r4 != 0) goto L98
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto La2
        L98:
            kotlin.jvm.internal.AwS251S0300000_7 r9 = new kotlin.jvm.internal.AwS251S0300000_7
            r0 = 8
            r9.<init>(r3, r2, r1, r0)
            r7.LJJIJIIJI(r9)
        La2:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 48
            r6 = 0
            X.C1668330tW3.LJIIIZ(r5, r6, r7, r8, r9, r10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054030dXF.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
