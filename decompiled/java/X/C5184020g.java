package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.020g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5184020g extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5184020g(C953610avH c953610avH, int i) {
        super(4);
        this.$t = i;
        this.l0 = c953610avH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5184020g(GuestShowdownAnchorWidget guestShowdownAnchorWidget, int i) {
        super(4);
        this.$t = i;
        this.l0 = guestShowdownAnchorWidget;
    }

    public static final Object invoke$0(C5184020g c5184020g, Object obj, Object obj2, Object obj3, Object obj4) {
        C946050aj5 c946050aj5LIZIZ;
        DataChannel dataChannel;
        C946060aj6 c946060aj6LIZIZ;
        C946050aj5 c946050aj5LIZIZ2;
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        int i = 1;
        if (Intrinsics.LJFF(obj, "GuestShowdownIdleSettingsDialog") && iIntValue != 1 && (dataChannel = ((GuestShowdownAnchorWidget) c5184020g.l0).dataChannel) != null && (c946060aj6LIZIZ = C01Z9.LIZIZ(dataChannel)) != null && (c946050aj5LIZIZ2 = c946060aj6LIZIZ.LIZIZ()) != null) {
            c946050aj5LIZIZ2.LIZJ(-1L);
        }
        C946060aj6 c946060aj6LIZIZ2 = C01Z9.LIZIZ(((GuestShowdownAnchorWidget) c5184020g.l0).dataChannel);
        if (c946060aj6LIZIZ2 != null && (c946050aj5LIZIZ = c946060aj6LIZIZ2.LIZIZ()) != null) {
            if (!zBooleanValue && ((GuestShowdownAnchorWidget) c5184020g.l0).LLJJI.get(obj4) == null) {
                i = 2;
            }
            c946050aj5LIZIZ.LIZIZ(i);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C5184020g c5184020g, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        int iIntValue = ((Number) obj3).intValue();
        long jLongValue2 = ((Number) obj4).longValue();
        if (zBooleanValue && jLongValue > 0 && iIntValue != -1) {
            if (jLongValue2 > 0 && jLongValue2 <= ((C953610avH) c5184020g.l0).LJIIIZ) {
                C20441214yg.LJIIIZ("NoticeboardController", "NoticeboardMessage received version check not pass, source=update_response");
            } else {
                ((C953610avH) c5184020g.l0).LJIIIZ = jLongValue2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateRealImage success, status=");
                sbLIZ.append(iIntValue);
                C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
                C953610avH c953610avH = (C953610avH) c5184020g.l0;
                if (c953610avH.LJIILL()) {
                    c953610avH.LJIILJJIL(Long.valueOf(jLongValue)).trans(iIntValue, c953610avH.LIZ, new C020V(c953610avH, jLongValue, (C953600avG) null, 1), null);
                }
            }
        }
        return Unit.LIZ;
    }
}
