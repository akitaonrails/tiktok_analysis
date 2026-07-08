package Y;

import X.AbstractC1585810rMx;
import X.AnonymousClass0956;
import X.C0E48;
import X.C0E55;
import X.C0ES0;
import X.C0EV3;
import X.C0F5Z;
import X.C0FX2;
import X.C23250099c;
import X.C384320F5a;
import X.C384570F5z;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class AsS15S0110000_5 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    public AsS15S0110000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS15S0110000_5 asS15S0110000_5, RecyclerView recyclerView, int i) {
        C0E55 c0e55LJIIJJI;
        C0E55 c0e55LJIIJJI2;
        if (i != 0) {
            if (i == 1) {
                C0EV3 c0ev3 = (C0EV3) asS15S0110000_5.l0;
                if (!c0ev3.LLJLLL || (c0e55LJIIJJI2 = c0ev3.LLLLLJIL().LJIIJJI()) == null) {
                    return;
                }
                if (c0e55LJIIJJI2.isPlaying()) {
                    asS15S0110000_5.z1 = true;
                    c0e55LJIIJJI2.pause(false);
                }
                C0EV3 c0ev32 = (C0EV3) asS15S0110000_5.l0;
                c0ev32.LLJZ = true;
                AnonymousClass0956 anonymousClass0956 = c0ev32.LLJZIJLIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C0EV3 c0ev33 = (C0EV3) asS15S0110000_5.l0;
                c0ev33.LLJZIJLIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c0ev33), null, null, new C0ES0((C0EV3) asS15S0110000_5.l0, null), 3);
                return;
            }
            return;
        }
        C0EV3 c0ev34 = (C0EV3) asS15S0110000_5.l0;
        C384570F5z c384570F5z = c0ev34.LLJJJJLIIL;
        if (c384570F5z == null || !c0ev34.LLJZ) {
            return;
        }
        c0ev34.LLJZ = false;
        AnonymousClass0956 anonymousClass09562 = c0ev34.LLJZIJLIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        ((C0EV3) asS15S0110000_5.l0).LLLLLJLJLL();
        int iLLLFZ = c384570F5z.LLLFZ();
        ArrayList<CaptionUtterance> arrayList = c384570F5z.LL;
        if (arrayList == null || arrayList.isEmpty() || iLLLFZ < 0 || iLLLFZ >= arrayList.size() || (c0e55LJIIJJI = ((C0EV3) asS15S0110000_5.l0).LLLLLJIL().LJIIJJI()) == null) {
            return;
        }
        c0e55LJIIJJI.LJIJI((((CaptionUtterance) ListProtector.get(arrayList, iLLLFZ)).LIZJ() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + ((long) 30000), new C0FX2(asS15S0110000_5, c0e55LJIIJJI, 3));
    }

    public static final void LJJIIJ$1(AsS15S0110000_5 asS15S0110000_5, RecyclerView recyclerView, int i) {
        C0E48 c0e48;
        C0E55 player;
        C0E55 player2;
        C0E55 player3;
        if (i != 0) {
            if (i == 1) {
                C384320F5a c384320F5a = (C384320F5a) asS15S0110000_5.l0;
                if (c384320F5a.LIZJ) {
                    C0E48 c0e482 = c384320F5a.LIZ.LIZIZ;
                    if (c0e482 != null && (player2 = c0e482.getPlayer()) != null && player2.isPlaying()) {
                        asS15S0110000_5.z1 = true;
                        C0E48 c0e483 = ((C384320F5a) asS15S0110000_5.l0).LIZ.LIZIZ;
                        if (c0e483 != null && (player3 = c0e483.getPlayer()) != null) {
                            player3.pause(false);
                        }
                    }
                    C384320F5a c384320F5a2 = (C384320F5a) asS15S0110000_5.l0;
                    c384320F5a2.LJ = true;
                    AnonymousClass0956 anonymousClass0956 = c384320F5a2.LIZLLL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    C384320F5a c384320F5a3 = (C384320F5a) asS15S0110000_5.l0;
                    c384320F5a3.LIZLLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c384320F5a3.LIZ.LIZ), null, null, new C0F5Z((C384320F5a) asS15S0110000_5.l0, null), 3);
                    return;
                }
                return;
            }
            return;
        }
        C384320F5a c384320F5a4 = (C384320F5a) asS15S0110000_5.l0;
        if (!c384320F5a4.LJ) {
            return;
        }
        c384320F5a4.LJ = false;
        AnonymousClass0956 anonymousClass09562 = c384320F5a4.LIZLLL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        ((C384320F5a) asS15S0110000_5.l0).LIZ.LIZ.uT().LIZIZ();
        C384570F5z c384570F5z = ((C384320F5a) asS15S0110000_5.l0).LIZIZ.LJJIJIIJIL;
        if (c384570F5z == null) {
            return;
        }
        int iLLLFZ = c384570F5z.LLLFZ();
        ArrayList<CaptionUtterance> arrayList = c384570F5z.LL;
        if (arrayList == null || arrayList.isEmpty() || iLLLFZ < 0 || iLLLFZ >= arrayList.size() || (c0e48 = ((C384320F5a) asS15S0110000_5.l0).LIZ.LIZIZ) == null || (player = c0e48.getPlayer()) == null) {
            return;
        }
        player.LJIJI((((CaptionUtterance) ListProtector.get(arrayList, iLLLFZ)).LIZJ() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + ((long) 30000), new C0FX2(asS15S0110000_5, (C384320F5a) asS15S0110000_5.l0, 8));
    }
}
