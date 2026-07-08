package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Cha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C320640Cha {
    public static Message LJIJ;
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final C320830Cht LJFF;
    public boolean LJI;
    public final C2252331DDr LJII;
    public final C2252331DDr LJIIIIZZ;
    public final InterfaceC497601wk LJIIIZ;
    public static final C320610ChX LJIIJ = new C320610ChX();
    public static volatile ConcurrentHashMap<String, C05YC<C321110CiL>> LJIIJJI = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, C05YC<C321120CiM>> LJIIL = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, InterfaceC332260D0u<Boolean>> LJIILIIL = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, InterfaceC332260D0u<Boolean>> LJIILJJIL = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, Boolean> LJIILL = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, C321110CiL> LJIILLIIL = new ConcurrentHashMap<>();
    public static volatile ConcurrentHashMap<String, C320810Chr> LJIIZILJ = new ConcurrentHashMap<>();
    public static final List<String> LJIJI = new ArrayList();

    public final Object LIZ(Message message, List<Message> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        List<Message> listSingletonList = list;
        C320830Cht c320830Cht = this.LJFF;
        if (listSingletonList.isEmpty()) {
            listSingletonList = Collections.singletonList(message);
        }
        Object objLIZIZ = c320830Cht.LIZIZ(new C321020CiC(2, message, 0, null, this, null, null, listSingletonList, null, null, false, 4191996), interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    public C320640Cha(String str, long j, int i, Lifecycle lifecycle) {
        InterfaceC497601wk interfaceC497601wkAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
        String string = UUID.randomUUID().toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = str;
        this.LIZIZ = string;
        this.LIZJ = jCurrentTimeMillis;
        this.LIZLLL = j;
        this.LJ = i;
        C320830Cht c320830Cht = new C320830Cht(i, j);
        this.LJFF = c320830Cht;
        this.LJI = true;
        C320870Chx.LIZ(AFwS190S0000000_4.get$arr$(3020), false);
        this.LJII = C09IR.LIZIZ(20, 20, null, 4);
        this.LJIIIIZZ = c320830Cht.LJ;
        this.LJIIIZ = (lifecycle == null || (interfaceC497601wkAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle)) == null) ? C817503Hh.LL : interfaceC497601wkAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r9, X.InterfaceC1364105Vn r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C320470ChJ
            if (r0 == 0) goto L68
            r5 = r10
            X.0ChJ r5 = (X.C320470ChJ) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r7 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L3a
            if (r0 != r6) goto L6e
            X.C155000ia.LIZIZ(r7)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r7)
            X.0Cht r0 = r8.LJFF
            r5.LL = r9
            r5.LLILLJJLI = r11
            r5.LLILZIL = r1
            java.lang.Object r7 = r0.LJIILLIIL(r5)
            if (r7 != r4) goto L41
            return r4
        L3a:
            boolean r11 = r5.LLILLJJLI
            int r9 = r5.LL
            X.C155000ia.LIZIZ(r7)
        L41:
            X.0Chr r7 = (X.C320810Chr) r7
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Chr> r3 = X.C320640Cha.LJIIZILJ
            long r1 = r7.LJ
            int r0 = r7.LJFF
            java.lang.String r0 = X.C320610ChX.LJ(r0, r1)
            r3.put(r0, r7)
            if (r11 == 0) goto L76
            X.0Cht r2 = r8.LJFF
            r0 = 169(0xa9, float:2.37E-43)
            kotlin.jvm.internal.AFwS232S0000000_4 r1 = kotlin.jvm.internal.AFwS232S0000000_4.get$arr$(r0)
            r0 = 0
            X.0CiC r0 = X.C320910Ci1.LIZ(r9, r8, r0, r1)
            r5.LLILZIL = r6
            java.lang.Object r0 = r2.LIZIZ(r0, r5)
            if (r0 != r4) goto L25
            return r4
        L68:
            X.0ChJ r5 = new X.0ChJ
            r5.<init>(r8, r10)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320640Cha.LIZIZ(int, X.05Vn, boolean, boolean):java.lang.Object");
    }
}
