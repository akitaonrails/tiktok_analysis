package Y;

import X.C09JN;
import X.C1067990dtl;
import X.C1068190du5;
import X.C1068210du7;
import X.C1C7U;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS3S1111000_16;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public class AfS0S1111000_16 implements C09JN {
    public final int $t;
    public int i3;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S1111000_16 afS0S1111000_16, Object obj) throws JSONException {
        C1C7U.LIZ("AdAutofillManagerV2@4585.updateAutofillSwitch$updateSwitchService$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        boolean z = true;
        if (baseResponse.status_code == 0) {
            int i = afS0S1111000_16.i3;
            if (i != 0) {
                if (i == 1) {
                    C1067990dtl.LJJIJLIJ(null, "other", afS0S1111000_16.z2);
                }
            } else {
                C1067990dtl.LJJIJIL("other", afS0S1111000_16.z2, true);
            }
        }
        C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
        C1068210du7.LIZ.getClass();
        c1068190du5.log(C1068210du7.LIZJ, new AwS3S1111000_16(afS0S1111000_16.i3, afS0S1111000_16.s0, afS0S1111000_16.z2, baseResponse, 0));
        Function1 function1 = (Function1) afS0S1111000_16.l1;
        if (function1 != null) {
            if (baseResponse.status_code != 0) {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
        }
        C1C7U.LIZIZ("AdAutofillManagerV2@4585.updateAutofillSwitch$updateSwitchService$2");
    }

    public static final void accept$1(AfS0S1111000_16 afS0S1111000_16, Object obj) {
        C1C7U.LIZ("AdAutofillManagerV2@4585.updateAutofillSwitch$updateSwitchService$3");
        Throwable th = (Throwable) obj;
        Function1 function1 = (Function1) afS0S1111000_16.l1;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1068190du5 c1068190du5 = new C1068190du5(new Object[0]);
        C1068210du7.LIZ.getClass();
        c1068190du5.log(C1068210du7.LIZJ, new AwS3S1111000_16(th, afS0S1111000_16.z2, afS0S1111000_16.i3, afS0S1111000_16.s0, 1));
        C1C7U.LIZIZ("AdAutofillManagerV2@4585.updateAutofillSwitch$updateSwitchService$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S1111000_16(int r2, java.lang.String r3, kotlin.jvm.functions.Function1 r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l1 = r4
            r0.i3 = r2
            r0.s0 = r3
            r0.z2 = r5
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.i3 = r2
            r0.z2 = r5
            r0.l1 = r4
            r0.s0 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S1111000_16.<init>(int, java.lang.String, kotlin.jvm.functions.Function1, boolean, int):void");
    }
}
