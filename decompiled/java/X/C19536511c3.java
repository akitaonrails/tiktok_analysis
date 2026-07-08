package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11c3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19536511c3 {
    public final int LIZ;
    public final Context LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final C19538011cI LIZLLL;
    public final InterfaceC19547311dn LJ;
    public final C0FF5 LJFF;
    public final LifecycleOwner LJI;
    public C19529711ax LJIILJJIL;
    public C19529711ax LJIJ;
    public C19529711ax LJIJI;
    public C1211030hcT LJIJJ;
    public final ConcurrentHashMap<String, Boolean> LJII = new ConcurrentHashMap<>();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 781));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(309));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 782));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 780));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 779));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(310));
    public final C01GW LJIILL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(311));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(312));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(308));

    public final C19546311dd LIZ() {
        return (C19546311dd) this.LJIIL.getValue();
    }

    public final void LIZLLL(String str) {
        Boolean boolValueOf = null;
        if (C0C1I.LIZ()) {
            C19529711ax c19529711ax = this.LJIJ;
            if (c19529711ax != null) {
                c19529711ax.LJI = true;
            }
        } else if (Intrinsics.LJFF(this.LJII.get(str), Boolean.TRUE) && ((C19536711c5) this.LJIIIIZZ.getValue()).LIZJ != null) {
            C19536911c7 c19536911c7 = ((C19536711c5) this.LJIIIIZZ.getValue()).LIZJ;
            if (c19536911c7 == null) {
                c19536911c7 = null;
            }
            int i = c19536911c7.LIZ.LIZIZ;
            C19532911bT.LIZIZ(-1, "pipeline_state_code");
            C19532911bT.LIZIZ(i, "pipeline_error_stage");
            C19532911bT.LJFF();
            this.LJII.remove(str);
        }
        C19529711ax c19529711ax2 = this.LJIILJJIL;
        if (c19529711ax2 != null) {
            c19529711ax2.LJI = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("data.isStopped() = ");
        C19529711ax c19529711ax3 = this.LJIILJJIL;
        if (c19529711ax3 != null) {
            boolValueOf = Boolean.valueOf(c19529711ax3.LJI);
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(' ');
        sbLIZ.append(this.LJIILJJIL);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int LIZIZ(C19536311c1 c19536311c1, int i) {
        Effect effect = c19536311c1.LIZJ;
        if (C1664460tPo.LJFF(effect)) {
            C19546111db c19546111db = C19546111db.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LIZJ;
            c19546111db.getClass();
            if (i != 1 && C19546111db.LJIIL(c19536311c1, videoPublishEditModel)) {
                return 3;
            }
        }
        if (C1664460tPo.LJFF(effect)) {
            return 1;
        }
        if (!C1664460tPo.LIZLLL(effect)) {
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021c  */
    /* JADX WARN: Type inference failed for: r9v14, types: [X.11di, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(final java.util.List<X.C19536311c1> r25, final X.InterfaceC1219340hps r26) {
        /*
            Method dump skipped, instruction units count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19536511c3.LIZJ(java.util.List, X.0hps):java.lang.String");
    }

    public C19536511c3(int i, Context context, VideoPublishEditModel videoPublishEditModel, C19538011cI c19538011cI, InterfaceC19547311dn interfaceC19547311dn, C0FF5 c0ff5, AbstractC2255721DQs abstractC2255721DQs) {
        this.LIZ = i;
        this.LIZIZ = context;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = c19538011cI;
        this.LJ = interfaceC19547311dn;
        this.LJFF = c0ff5;
        this.LJI = abstractC2255721DQs;
    }
}
