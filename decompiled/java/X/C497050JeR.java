package X;

import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0JeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497050JeR {
    public static volatile String LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(320));

    static {
        if (LiveCombineRequestExp.INSTANCE.enableForLog()) {
            C0IX5 c0ix5 = C0IX5.LIZ;
            AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(326);
            c0ix5.getClass();
            C0IX5.LJI = aFwS237S0000000_7;
        }
    }

    public static void LIZ(Room room, boolean z, long j, String str, final String str2) {
        int iIntValue;
        C0IX8 c0ix8LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('-');
        sbLIZ.append(str);
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        final C496230Jd7 c496230Jd7 = new C496230Jd7(z, room);
        final Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("room_id", Long.valueOf(room.getId())));
        final C497120JeY<C496230Jd7> c497120JeY = C497120JeY.LJIIZILJ;
        List list = (List) LIZIZ.getValue();
        c497120JeY.LIZJ();
        if (c497120JeY.LJIIIZ.get() >= LiveCombineRequestExp.INSTANCE.maxCombineErrorCount()) {
            C497060JeS.LIZLLL(5, str2, false);
            return;
        }
        c497120JeY.LJIIJJI = str2;
        c497120JeY.LJIILJJIL = new C11NJ();
        if (C497060JeS.LIZ() && (c0ix8LIZIZ = C497060JeS.LIZIZ(str2)) != null) {
            c0ix8LIZIZ.LIZ = System.currentTimeMillis();
            c0ix8LIZIZ.LIZJ = 1;
        }
        c497120JeY.LJ = new ConcurrentHashMap<>();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : list) {
            linkedHashMap.put(((AbstractC497160Jec) obj).LJ(), obj);
        }
        for (AbstractC497160Jec<?, C496230Jd7> abstractC497160Jec : linkedHashMap.values()) {
            if (abstractC497160Jec.LIZ(c496230Jd7)) {
                LiveCombineRequestExp liveCombineRequestExp = LiveCombineRequestExp.INSTANCE;
                if (liveCombineRequestExp.enableForRequest(abstractC497160Jec.LJ())) {
                    Integer num = c497120JeY.LJIIJ.get(abstractC497160Jec.LJ());
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue < liveCombineRequestExp.maxSplitErrorCount()) {
                        ConcurrentHashMap<String, AbstractC497160Jec<?, C496230Jd7>> concurrentHashMap = c497120JeY.LJ;
                        if (concurrentHashMap != null) {
                            concurrentHashMap.put(abstractC497160Jec.LJ(), abstractC497160Jec);
                        }
                    }
                }
            }
            c497120JeY.LIZ(3, abstractC497160Jec.LJ());
        }
        final C11LG c11lgLJIJI = AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0Jeb
            /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
            /* JADX WARN: Type inference failed for: r0v0, types: [INPUT_DATA, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instruction units count: 287
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC497150Jeb.call():java.lang.Object");
            }
        });
        final C11IB c11ibLJLJL = C11NZ.LJLJL(LiveCombineRequestExp.INSTANCE.getCombineRequestDelayTimeMs(), TimeUnit.MILLISECONDS, C11S5.LIZIZ);
        InterfaceC420801kM interfaceC420801kMLJJIIZ = new AbstractC19484711Kz<T>(c11lgLJIJI, c11ibLJLJL) { // from class: X.11J6
            public final InterfaceC19473011Gm<T> LL;
            public final C098D<U> LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                this.LLILLJJLI.LIZIZ(new C11J5(interfaceC19474811He, this.LL));
            }

            {
                this.LL = c11lgLJIJI;
                this.LLILLJJLI = c11ibLJLJL;
            }
        }.LJJIJIIJI(new C19501611Rm(c497120JeY.LIZLLL)).LJJIIZ(new C09JN() { // from class: X.00Kl
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("LiveCombineReqeust@92d7.start$4");
                C1C7U.LIZIZ("LiveCombineReqeust@92d7.start$4");
            }
        }, new C09JN() { // from class: X.00Km
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("LiveCombineReqeust@92d7.start$5");
                C1C7U.LIZIZ("LiveCombineReqeust@92d7.start$5");
            }
        });
        C11NJ c11nj = c497120JeY.LJIILJJIL;
        if (c11nj == null) {
            return;
        }
        c11nj.LIZ(interfaceC420801kMLJJIIZ);
    }
}
