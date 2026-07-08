package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0ffN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135950ffN {
    public final Function0<List<C1135810ff9>> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public List<C1136310ffx> LJIIJJI;
    public List<C1136310ffx> LJIIL;
    public final SimpleDateFormat LJIILIIL;
    public final C11NJ LJIILJJIL;
    public final C11NJ LJIILL;

    public C1135950ffN(AwS561S0100000_17 awS561S0100000_17) {
        this.LIZ = awS561S0100000_17;
        C13BV c13bv = C13BV.INSTANCE;
        this.LJIIJJI = c13bv;
        this.LJIIL = c13bv;
        this.LJIILJJIL = new C11NJ();
        this.LJIILL = new C11NJ();
        C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "initMonitor");
        try {
            this.LJIILIIL = new SimpleDateFormat("HH:mm:ss.SSS", Locale.ENGLISH);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("LiveGiftTrayBlockMonitor", "SimpleDateFormat init error");
        }
        this.LIZLLL = System.currentTimeMillis();
        this.LJIILL.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(new InterfaceC19562711gH() { // from class: X.0ffl
            @Override // X.InterfaceC19562711gH
            public final void LLF(Context context) {
                C1135950ffN c1135950ffN = this.LL;
                c1135950ffN.LJIIIIZZ = c1135950ffN.LIZJ(Long.valueOf(System.currentTimeMillis()));
                C1135950ffN c1135950ffN2 = this.LL;
                c1135950ffN2.LJIIJ = c1135950ffN2.LIZJ(Long.valueOf(C158B.LIZ()));
                C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "onEnterForeground");
            }

            @Override // X.InterfaceC19562711gH
            public final void LLLLIILLL(Context context) {
                C1135950ffN c1135950ffN = this.LL;
                c1135950ffN.LJII = c1135950ffN.LIZJ(Long.valueOf(System.currentTimeMillis()));
                C1135950ffN c1135950ffN2 = this.LL;
                c1135950ffN2.LJIIIZ = c1135950ffN2.LIZJ(Long.valueOf(C158B.LIZ()));
                C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "onEnterBackground");
                if (this.LL.LIZJ) {
                    C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "onEnterBackground skip current monitor");
                    this.LL.LJIILJJIL.LJ();
                    this.LL.LIZJ = false;
                }
                LinkedList<AbstractC1143340frI> linkedList = C1143330frH.LIZ;
                C1143330frH.LIZ(C1143540frc.LIZ);
            }
        }));
    }

    public static boolean LIZ(List list) {
        boolean z = false;
        try {
            if (!((ArrayList) list).isEmpty()) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C1136310ffx) it2.next()).LJFF) {
                        z = true;
                        break;
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (z) {
            C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "onDetect big gift might in downloading state, skip");
        }
        return z;
    }

    public final String LIZJ(Long l) {
        String str;
        if (l != null && l.longValue() > 0) {
            SimpleDateFormat simpleDateFormat = this.LJIILIIL;
            if (simpleDateFormat == null || (str = simpleDateFormat.format(new Date(l.longValue()))) == null) {
                return l.toString();
            }
            return str;
        }
        return "";
    }

    public static List LIZIZ(int i, List list) {
        int i2;
        int i3;
        Gift gift;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1135810ff9 c1135810ff9 = (C1135810ff9) it2.next();
            if (c1135810ff9 != null && (i2 = c1135810ff9.LJJIJIL) == i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1135810ff9.LJJJJZ);
                sbLIZ.append('-');
                sbLIZ.append(c1135810ff9.LJJLI);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                GiftMessage giftMessage = c1135810ff9.LIZ;
                if (giftMessage != null && (gift = giftMessage.mGift) != null) {
                    i3 = gift.type;
                } else {
                    i3 = 0;
                }
                arrayList.add(new C1136310ffx(c1135810ff9.LJJJJZ, strLIZIZ, i2, i3, c1135810ff9.LJIIJ, c1135810ff9.hashCode(), c1135810ff9.LJJLL));
            }
        }
        return arrayList;
    }
}
