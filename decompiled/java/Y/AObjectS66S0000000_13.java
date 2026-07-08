package Y;

import X.C06W5;
import X.C0B4B;
import X.C0C78;
import X.C0VWW;
import X.C1474810oTv;
import X.C1602860roS;
import X.C1DG0;
import X.C584470Mw9;
import X.C823050WQl;
import X.C827740WdY;
import X.EnumC584340Mvw;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.lifeguard.ILifeguard;
import com.tts.oecverify.BdTuring;
import java.text.DateFormat;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public class AObjectS66S0000000_13 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS66S0000000_13(int r2) {
        /*
            r1 = this;
            r1.$t = r2
            switch(r2) {
                case 0: goto La;
                case 1: goto La;
                case 2: goto L5;
                case 3: goto La;
                case 4: goto La;
                case 5: goto La;
                case 6: goto La;
                case 7: goto La;
                case 8: goto La;
                case 9: goto La;
                default: goto L5;
            }
        L5:
            r0 = r1
        L6:
            r0.<init>()
            return
        La:
            r0 = r1
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS66S0000000_13.<init>(int):void");
    }

    public static final Object invoke$0(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        String str = PushLoginActivity._pnsPageId;
        return new C06W5(0);
    }

    public static final Object invoke$2(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        C1602860roS c1602860roS = C1602860roS.LIZ;
        AFwS200S0000000_13 aFwS200S0000000_13 = AFwS200S0000000_13.get$arr$(128);
        c1602860roS.getClass();
        return Boolean.valueOf(C1602860roS.LIZ(aFwS200S0000000_13));
    }

    public static final Object invoke$3(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        return Boolean.valueOf(((Boolean) C827740WdY.LIZJ.getValue()).booleanValue());
    }

    public static final Object invoke$4(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        ((ILifeguard) PluggableExtentionKt.pluggableSpi(ILifeguard.class)).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        Map<String, EnumC584340Mvw> map = C584470Mw9.LIZ;
        if (C1DG0.LIZIZ() || C0B4B.LIZ() || C0C78.LIZ()) {
            C0VWW.LIZIZ("diagnosis_top_n_vv");
            return null;
        }
        return null;
    }

    public static final Object invoke$6(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        C823050WQl.LIZLLL().execute(new ARunnableS92S0000000_13(55));
        return null;
    }

    public static final Object invoke$7(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        DateFormat dateInstance = DateFormat.getDateInstance();
        dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateInstance;
    }

    public static final Object invoke$8(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        dateTimeInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateTimeInstance;
    }

    public static final Object invoke$9(AObjectS66S0000000_13 aObjectS66S0000000_13) {
        return Boolean.valueOf(((Boolean) C1474810oTv.LJZ.getValue()).booleanValue());
    }
}
