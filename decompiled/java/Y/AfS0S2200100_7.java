package Y;

import X.C09JN;
import X.C1C7U;
import X.C486390J5p;
import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AfS0S2200100_7 implements C09JN {
    public final int $t;
    public long j4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S2200100_7 afS0S2200100_7, Object obj) {
        C1C7U.LIZ("LiveCheckStateService@a608.preloadSlimRoomInternal$2");
        Function1 function1 = (Function1) afS0S2200100_7.l2;
        if (function1 != null) {
            function1.invoke(null);
        }
        C486390J5p c486390J5p = (C486390J5p) afS0S2200100_7.l3;
        long j = afS0S2200100_7.j4;
        String str = afS0S2200100_7.s0;
        String str2 = afS0S2200100_7.s1;
        c486390J5p.getClass();
        C486390J5p.LJIJJ(2, str, j, str2);
        C1C7U.LIZIZ("LiveCheckStateService@a608.preloadSlimRoomInternal$2");
    }

    public static final void accept$1(AfS0S2200100_7 afS0S2200100_7, Object obj) {
        C1C7U.LIZ("LiveCheckStateService@a608.preloadInternal$2");
        if (obj != null) {
            Function1 function1 = (Function1) afS0S2200100_7.l3;
            C486390J5p c486390J5p = (C486390J5p) afS0S2200100_7.l2;
            long j = afS0S2200100_7.j4;
            String str = afS0S2200100_7.s0;
            String str2 = afS0S2200100_7.s1;
            if (function1 != null) {
                function1.invoke(obj);
            }
            c486390J5p.getClass();
            C486390J5p.LJIJJ(0, str, j, str2);
        } else {
            C486390J5p c486390J5p2 = (C486390J5p) afS0S2200100_7.l2;
            Function1 function12 = (Function1) afS0S2200100_7.l3;
            long j2 = afS0S2200100_7.j4;
            String str3 = afS0S2200100_7.s0;
            String str4 = afS0S2200100_7.s1;
            if (function12 != null) {
                function12.invoke(null);
            }
            c486390J5p2.getClass();
            C486390J5p.LJIJJ(1, str3, j2, str4);
        }
        C1C7U.LIZIZ("LiveCheckStateService@a608.preloadInternal$2");
    }

    public static final void accept$2(AfS0S2200100_7 afS0S2200100_7, Object obj) {
        C1C7U.LIZ("LiveCheckStateService@a608.preloadInternal$3");
        Function1 function1 = (Function1) afS0S2200100_7.l2;
        if (function1 != null) {
            function1.invoke(null);
        }
        C486390J5p c486390J5p = (C486390J5p) afS0S2200100_7.l3;
        long j = afS0S2200100_7.j4;
        String str = afS0S2200100_7.s0;
        String str2 = afS0S2200100_7.s1;
        c486390J5p.getClass();
        C486390J5p.LJIJJ(2, str, j, str2);
        C1C7U.LIZIZ("LiveCheckStateService@a608.preloadInternal$3");
    }

    public static final void accept$3(AfS0S2200100_7 afS0S2200100_7, Object obj) {
        C1C7U.LIZ("LiveCheckStateService@a608.preloadSlimRoomInternal$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            Function1 function1 = (Function1) afS0S2200100_7.l3;
            C486390J5p c486390J5p = (C486390J5p) afS0S2200100_7.l2;
            long j = afS0S2200100_7.j4;
            String str = afS0S2200100_7.s0;
            String str2 = afS0S2200100_7.s1;
            if (function1 != null) {
                function1.invoke(baseResponse.data);
            }
            c486390J5p.getClass();
            C486390J5p.LJIJJ(0, str, j, str2);
        } else {
            C486390J5p c486390J5p2 = (C486390J5p) afS0S2200100_7.l2;
            Function1 function12 = (Function1) afS0S2200100_7.l3;
            long j2 = afS0S2200100_7.j4;
            String str3 = afS0S2200100_7.s0;
            String str4 = afS0S2200100_7.s1;
            if (function12 != null) {
                function12.invoke(null);
            }
            c486390J5p2.getClass();
            C486390J5p.LJIJJ(1, str3, j2, str4);
        }
        C1C7U.LIZIZ("LiveCheckStateService@a608.preloadSlimRoomInternal$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S2200100_7(long r2, X.C486390J5p r4, java.lang.String r5, java.lang.String r6, kotlin.jvm.functions.Function1 r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            switch(r8) {
                case 0: goto L14;
                case 1: goto L5;
                case 2: goto L14;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l2 = r4
            r0.l3 = r7
            r0.j4 = r2
            r0.s0 = r5
            r0.s1 = r6
        L10:
            r0.<init>()
            return
        L14:
            r0 = r1
            r0.l2 = r7
            r0.l3 = r4
            r0.j4 = r2
            r0.s0 = r5
            r0.s1 = r6
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S2200100_7.<init>(long, X.0J5p, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, int):void");
    }
}
