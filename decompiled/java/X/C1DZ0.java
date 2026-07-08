package X;

import android.content.res.TypedArray;
import com.bytedance.bddatefmt.BDDateFormat;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1DZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DZ0 extends AbstractC2257761DYo {
    public C12KV LIZJ;
    public C12KV LIZLLL;
    public C12KV LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;

    public abstract BDDateFormat LJIILJJIL();

    @Override // X.AbstractC2257761DYo
    public final void LIZ(C12KZ c12kz) {
        String str = null;
        TypedArray typedArrayObtainStyledAttributes = c12kz.getContext().obtainStyledAttributes(null, R$styleable.TuxWheelPicker, R.attr.z9, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_wheelPickerTodayString);
        String str2 = "";
        if (strXd == null) {
            strXd = "";
        }
        this.LJFF = strXd;
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_dayPickerContentDescription);
        if (strXd2 == null) {
            strXd2 = "";
        }
        this.LJI = strXd2;
        String strXd3 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_hourPickerContentDescription);
        if (strXd3 == null) {
            strXd3 = "";
        }
        this.LJII = strXd3;
        String strXd4 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_minutePickerContentDescription);
        if (strXd4 != null) {
            str2 = strXd4;
        }
        this.LJIIIIZZ = str2;
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJJJJLL(c12kz);
        c12kz.LIZIZ();
        C12KV c12kvLIZ = c12kz.LIZ();
        c12kz.LIZIZ();
        C12KV c12kvLIZ2 = c12kz.LIZ();
        c12kz.LIZIZ();
        C12KV c12kvLIZ3 = c12kz.LIZ();
        c12kz.LIZIZ();
        AbstractC2257761DYo.LIZJ(C1697810uHb.LJIIJJI(c12kvLIZ, c12kvLIZ2, c12kvLIZ3), C1697810uHb.LJIILJJIL(new Pair(AFwS283S0000000_35.get$arr$(176), new AwS614S0100000_35(this, 186)), new Pair(AFwS283S0000000_35.get$arr$(177), new AwS614S0100000_35(this, 187)), new Pair(AFwS283S0000000_35.get$arr$(178), new AwS614S0100000_35(this, 188))));
        C12KV c12kv = this.LIZJ;
        if (c12kv == null) {
            c12kv = null;
        }
        String str3 = this.LJI;
        if (str3 == null) {
            str3 = null;
        }
        c12kv.setContentDescription(str3);
        C12KV c12kv2 = this.LIZLLL;
        if (c12kv2 == null) {
            c12kv2 = null;
        }
        String str4 = this.LJII;
        if (str4 == null) {
            str4 = null;
        }
        c12kv2.setContentDescription(str4);
        C12KV c12kv3 = this.LJ;
        if (c12kv3 == null) {
            c12kv3 = null;
        }
        String str5 = this.LJIIIIZZ;
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
                    LJIIIZ().set(12, ((Number) obj).intValue());
                }
            } else {
                LJIIIZ().set(11, ((Number) obj).intValue());
            }
        } else {
            int iIntValue = ((Number) obj).intValue();
            int i2 = (iIntValue / 100) % 100;
            C443120HZe c443120HZe = new C443120HZe(Integer.valueOf(iIntValue / 10000), Integer.valueOf(i2), Integer.valueOf(iIntValue % 100));
            int iIntValue2 = ((Number) c443120HZe.getFirst()).intValue();
            int iIntValue3 = ((Number) c443120HZe.getSecond()).intValue();
            int iIntValue4 = ((Number) c443120HZe.getThird()).intValue();
            LJIIIZ().set(1, iIntValue2);
            LJIIIZ().set(2, iIntValue3);
            LJIIIZ().set(5, iIntValue4);
        }
        return LJIIIZ().getTimeInMillis();
    }

    @Override // X.AbstractC2257761DYo
    public final long LJII(int i, long j, long j2, long j3) {
        return AbstractC2257761DYo.LIZLLL(LJIIIZ(), j, j2, j3, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0245 A[LOOP:2: B:61:0x023f->B:63:0x0245, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ee  */
    @Override // X.AbstractC2257761DYo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r28, int r29, long r30, long r32, long r34) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DZ0.LIZIZ(int, int, long, long, long):void");
    }
}
