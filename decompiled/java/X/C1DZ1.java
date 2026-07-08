package X;

import android.content.res.TypedArray;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1DZ1, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DZ1 extends AbstractC2257761DYo {
    public C12KV LIZJ;
    public C12KV LIZLLL;
    public C12KV LJ;
    public String LJFF;
    public String LJI;
    public String LJII;

    @Override // X.AbstractC2257761DYo
    public final long LJII(int i, long j, long j2, long j3) {
        return j3;
    }

    @Override // X.AbstractC2257761DYo
    public final void LIZ(C12KZ c12kz) {
        String str = null;
        TypedArray typedArrayObtainStyledAttributes = c12kz.getContext().obtainStyledAttributes(null, R$styleable.TuxWheelPicker, R.attr.z9, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_yearPickerContentDescription);
        String str2 = "";
        if (strXd == null) {
            strXd = "";
        }
        this.LJFF = strXd;
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_monthPickerContentDescription);
        if (strXd2 == null) {
            strXd2 = "";
        }
        this.LJI = strXd2;
        String strXd3 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_dayPickerContentDescription);
        if (strXd3 != null) {
            str2 = strXd3;
        }
        this.LJII = str2;
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJJJJLL(c12kz);
        c12kz.LIZIZ();
        C12KV c12kvLIZ = c12kz.LIZ();
        c12kz.LIZIZ();
        C12KV c12kvLIZ2 = c12kz.LIZ();
        c12kz.LIZIZ();
        C12KV c12kvLIZ3 = c12kz.LIZ();
        c12kz.LIZIZ();
        AbstractC2257761DYo.LIZJ(C1697810uHb.LJIIJJI(c12kvLIZ, c12kvLIZ2, c12kvLIZ3), C1697810uHb.LJIILJJIL(new Pair(AFwS283S0000000_35.get$arr$(184), new AwS614S0100000_35(this, 194)), new Pair(AFwS283S0000000_35.get$arr$(185), new AwS614S0100000_35(this, 195)), new Pair(AFwS283S0000000_35.get$arr$(186), new AwS614S0100000_35(this, 196))));
        C12KV c12kv = this.LIZJ;
        if (c12kv == null) {
            c12kv = null;
        }
        String str3 = this.LJFF;
        if (str3 == null) {
            str3 = null;
        }
        c12kv.setContentDescription(str3);
        C12KV c12kv2 = this.LIZLLL;
        if (c12kv2 == null) {
            c12kv2 = null;
        }
        String str4 = this.LJI;
        if (str4 == null) {
            str4 = null;
        }
        c12kv2.setContentDescription(str4);
        C12KV c12kv3 = this.LJ;
        if (c12kv3 == null) {
            c12kv3 = null;
        }
        String str5 = this.LJII;
        if (str5 != null) {
            str = str5;
        }
        c12kv3.setContentDescription(str);
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
                    LJIIIZ().set(5, ((Number) obj).intValue());
                }
            } else {
                int i2 = LJIIIZ().get(5);
                LJIIIZ().set(5, 1);
                LJIIIZ().set(2, ((Number) obj).intValue());
                int actualMaximum = LJIIIZ().getActualMaximum(5);
                Calendar calendarLJIIIZ = LJIIIZ();
                if (i2 > actualMaximum) {
                    i2 = actualMaximum;
                }
                calendarLJIIIZ.set(5, i2);
            }
        } else {
            LJIIIZ().set(1, ((Number) obj).intValue());
        }
        return LJIIIZ().getTimeInMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb A[LOOP:2: B:24:0x00e7->B:26:0x00eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    @Override // X.AbstractC2257761DYo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r21, int r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DZ1.LIZIZ(int, int, long, long, long):void");
    }
}
