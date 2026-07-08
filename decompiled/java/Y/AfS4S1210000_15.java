package Y;

import X.C01HE;
import X.C09JN;
import X.C1143300frE;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C919870a2r;
import X.C919990a33;
import X.C920010a35;
import X.C923330a8R;
import X.C930480aJy;
import X.InterfaceC920110a3F;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSameAsIosZoomSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AfS4S1210000_15 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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
        }
    }

    public static final void accept$0(AfS4S1210000_15 afS4S1210000_15, Object obj) {
        C1C7U.LIZ("ZoomAnchorPresent@8a17.zoomAnchorToMax$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C930480aJy.LIZ.getClass();
        int i = baseResponse.statusCode;
        if (i == 0) {
            C919870a2r.LIZIZ(afS4S1210000_15.z3 ? 1 : 0, "enlarge");
            InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS4S1210000_15.l1;
            if (interfaceC920110a3F != null) {
                interfaceC920110a3F.LIZJ(afS4S1210000_15.s0);
            }
        } else {
            ((C919990a33) afS4S1210000_15.l2).LJJIFFI(i, (InterfaceC920110a3F) afS4S1210000_15.l1, afS4S1210000_15.s0, baseResponse.LJ.message, null);
        }
        C1C7U.LIZIZ("ZoomAnchorPresent@8a17.zoomAnchorToMax$2");
    }

    public static final void accept$1(AfS4S1210000_15 afS4S1210000_15, Object obj) {
        String str;
        C1C7U.LIZ("ZoomAnchorPresent@8a17.zoomAnchorToMin$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C930480aJy.LIZ.getClass();
        int i = baseResponse.statusCode;
        if (i == 0) {
            InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS4S1210000_15.l1;
            if (interfaceC920110a3F != null) {
                interfaceC920110a3F.LIZJ(afS4S1210000_15.s0);
            }
            C919870a2r.LIZIZ(2, "cancel_enlarge");
            if (afS4S1210000_15.z3 && MultiGuestSameAsIosZoomSetting.INSTANCE.isEnable()) {
                Layout layoutLIZLLL = ((C919990a33) afS4S1210000_15.l2).LIZ.LIZLLL();
                if (layoutLIZLLL != null) {
                    str = layoutLIZLLL.layoutId;
                } else {
                    str = null;
                }
                C919990a33.LJJIIJZLJL(str);
            }
        } else {
            ((C919990a33) afS4S1210000_15.l2).LJJIFFI(i, (InterfaceC920110a3F) afS4S1210000_15.l1, afS4S1210000_15.s0, baseResponse.LJ.message, null);
        }
        C1C7U.LIZIZ("ZoomAnchorPresent@8a17.zoomAnchorToMin$2");
    }

    public static final void accept$2(AfS4S1210000_15 afS4S1210000_15, Object obj) {
        boolean z;
        C1C7U.LIZ("ZoomGuestPresent@c8ea.tryZoomToMin$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C930480aJy.LIZ.getClass();
        if (baseResponse.statusCode == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C20441214yg.LJIIIIZZ("zoom to min success");
            InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS4S1210000_15.l1;
            if (interfaceC920110a3F != null) {
                interfaceC920110a3F.LIZJ(afS4S1210000_15.s0);
            }
            ((C920010a35) afS4S1210000_15.l2).LIZ.LJI.put(afS4S1210000_15.s0, Boolean.valueOf(afS4S1210000_15.z3));
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (C923330a8R.LJIIIZ() && Intrinsics.LJFF(afS4S1210000_15.s0, C01HE.LIZLLL(UserService.getInstance().user().getCurrentUserId()))) {
                C919870a2r.LIZJ(3, String.valueOf(C01HE.LJI(afS4S1210000_15.s0)), "cancel_enlarge");
            }
        } else {
            C1143300frE.LJIIJJI().LJII(((C920010a35) afS4S1210000_15.l2).LIZJ, C2097608Jq.LJIIJ(new Pair("action", "tryZoomToMin"), new Pair("linkMicId", afS4S1210000_15.s0), new Pair("httpresult", "failed")));
            InterfaceC920110a3F interfaceC920110a3F2 = (InterfaceC920110a3F) afS4S1210000_15.l1;
            if (interfaceC920110a3F2 != null) {
                interfaceC920110a3F2.LIZ(baseResponse.statusCode, afS4S1210000_15.s0, baseResponse.LJ.message, null);
            }
        }
        C1C7U.LIZIZ("ZoomGuestPresent@c8ea.tryZoomToMin$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS4S1210000_15(X.C919990a33 r2, X.InterfaceC920110a3F r3, java.lang.String r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l1 = r3
            r0.s0 = r4
            r0.z3 = r5
            r0.l2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.z3 = r5
            r0.l1 = r3
            r0.s0 = r4
            r0.l2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS4S1210000_15.<init>(X.0a33, X.0a3F, java.lang.String, boolean, int):void");
    }

    public AfS4S1210000_15(InterfaceC920110a3F interfaceC920110a3F, String str, C920010a35 c920010a35, boolean z, int i) {
        this.$t = i;
        this.l1 = interfaceC920110a3F;
        this.s0 = str;
        this.l2 = c920010a35;
        this.z3 = z;
    }
}
