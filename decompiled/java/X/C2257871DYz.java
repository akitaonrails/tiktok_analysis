package X;

import android.content.res.TypedArray;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1DYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257871DYz extends AbstractC2257761DYo {
    public C12KV LIZJ;
    public C12KV LIZLLL;
    public C12KV LJ;
    public String LJFF;
    public String LJI;

    @Override // X.AbstractC2257761DYo
    public final long LJIIIIZZ(long j) {
        return j;
    }

    @Override // X.AbstractC2257761DYo
    public final void LIZ(C12KZ c12kz) {
        String str = null;
        TypedArray typedArrayObtainStyledAttributes = c12kz.getContext().obtainStyledAttributes(null, R$styleable.TuxWheelPicker, R.attr.z9, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_hourPickerContentDescription);
        String str2 = "";
        if (strXd == null) {
            strXd = "";
        }
        this.LJFF = strXd;
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_minutePickerContentDescription);
        if (strXd2 != null) {
            str2 = strXd2;
        }
        this.LJI = str2;
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJJJJLL(c12kz);
        c12kz.LIZIZ();
        C12KV c12kvLIZ = c12kz.LIZ();
        c12kz.LIZIZ();
        C12KV c12kvLIZ2 = c12kz.LIZ();
        c12kz.LIZIZ();
        C12KV c12kvLIZ3 = c12kz.LIZ();
        c12kz.LIZIZ();
        AbstractC2257761DYo.LIZJ(C1697810uHb.LJIIJJI(c12kvLIZ, c12kvLIZ2, c12kvLIZ3), C1697810uHb.LJIILJJIL(new Pair(AFwS283S0000000_35.get$arr$(179), new AwS614S0100000_35(this, 189)), new Pair(AFwS283S0000000_35.get$arr$(180), new AwS614S0100000_35(this, 190)), new Pair(AFwS283S0000000_35.get$arr$(181), new AwS614S0100000_35(this, 191))));
        C12KV c12kv = this.LIZLLL;
        if (c12kv == null) {
            c12kv = null;
        }
        String str3 = this.LJFF;
        if (str3 == null) {
            str3 = null;
        }
        c12kv.setContentDescription(str3);
        C12KV c12kv2 = this.LJ;
        if (c12kv2 == null) {
            c12kv2 = null;
        }
        String str4 = this.LJI;
        if (str4 != null) {
            str = str4;
        }
        c12kv2.setContentDescription(str);
    }

    @Override // X.AbstractC2257761DYo
    public final void LJIIJJI(C2257781DYq c2257781DYq) {
        C12KV c12kv = this.LIZJ;
        C12KV c12kv2 = null;
        if (c12kv == null) {
            c12kv = null;
        }
        c12kv.setLevel(0);
        C12KV c12kv3 = this.LIZJ;
        if (c12kv3 == null) {
            c12kv3 = null;
        }
        c12kv3.setCallback(c2257781DYq);
        C12KV c12kv4 = this.LIZLLL;
        if (c12kv4 == null) {
            c12kv4 = null;
        }
        c12kv4.setLevel(1);
        C12KV c12kv5 = this.LIZLLL;
        if (c12kv5 == null) {
            c12kv5 = null;
        }
        c12kv5.setCallback(c2257781DYq);
        C12KV c12kv6 = this.LJ;
        if (c12kv6 == null) {
            c12kv6 = null;
        }
        c12kv6.setLevel(2);
        C12KV c12kv7 = this.LJ;
        if (c12kv7 != null) {
            c12kv2 = c12kv7;
        }
        c12kv2.setCallback(c2257781DYq);
    }

    @Override // X.AbstractC2257761DYo
    public final long LJIILIIL(int i, long j, Object obj) {
        LJIIIZ().setTimeInMillis(j);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LJIIIZ().set(12, ((Number) obj).intValue());
                }
            } else {
                C1DZ5 c1dz5 = (C1DZ5) obj;
                LJIIJ().setTimeInMillis(c1dz5.LIZIZ);
                LJIIIZ().set(1, LJIIJ().get(1));
                LJIIIZ().set(2, LJIIJ().get(2));
                LJIIIZ().set(5, LJIIJ().get(5));
                LJIIIZ().set(10, c1dz5.LIZ);
            }
        } else {
            LJIIIZ().set(9, ((Number) obj).intValue());
        }
        return LJIIIZ().getTimeInMillis();
    }

    @Override // X.AbstractC2257761DYo
    public final long LJII(int i, long j, long j2, long j3) {
        return AbstractC2257761DYo.LIZLLL(LJIIIZ(), j, j2, j3, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0157 A[LOOP:3: B:29:0x0151->B:31:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0232  */
    @Override // X.AbstractC2257761DYo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r24, int r25, long r26, long r28, long r30) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257871DYz.LIZIZ(int, int, long, long, long):void");
    }
}
