package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107600eve {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(SparkContext sparkContext) {
        String strLJIJI;
        if (sparkContext != null && (strLJIJI = sparkContext.LJIJI()) != null) {
            return C1107580evc.LIZ(UriProtector.parse(strLJIJI));
        }
        return null;
    }

    public static boolean LIZIZ(SparkContext sparkContext) {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkPopup sparkPopup;
        Boolean boolValueOf = null;
        if (sparkContext != null) {
            interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
        } else {
            interfaceC1059280dfiLJJIJLIJ = null;
        }
        if (interfaceC1059280dfiLJJIJLIJ instanceof SparkPopup) {
            sparkPopup = (SparkPopup) interfaceC1059280dfiLJJIJLIJ;
        } else {
            sparkPopup = null;
        }
        boolean z = false;
        if (sparkPopup == null) {
            return false;
        }
        SparkPopupSchemaParam sparkPopupSchemaParam = sparkPopup.LLJI;
        if (sparkPopupSchemaParam != null) {
            if (sparkPopupSchemaParam.getEnablePullDownClose() || sparkPopupSchemaParam.getDragByGesture() || Intrinsics.LJFF(sparkPopupSchemaParam.getRealGravity(sparkPopup.getContext()), "bottom")) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.InterfaceC1541990qEH r12) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1107600eve.LIZJ(X.0qEH):void");
    }

    public static void LIZLLL(InterfaceC1541990qEH interfaceC1541990qEH) {
        Room room;
        final String description = null;
        if (!C500260Jjc.LJJIJLIJ() && (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null) {
            EnumC1083220eIK enumC1083220eIK = (EnumC1083220eIK) DataChannelGlobal.LLILZ.gg0(C1148280fzG.class);
            C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
            final long id = room.getId();
            if (enumC1083220eIK != null) {
                description = enumC1083220eIK.getDescription();
            }
            hybridContext.LJJ(InterfaceC520720KbW.class, new InterfaceC520720KbW(id, description) { // from class: X.0evh
                public final long LIZ;
                public final String LIZIZ;

                @Override // X.InterfaceC520720KbW
                public final String LIZ() {
                    String str = this.LIZIZ;
                    return str == null ? "unknown" : str;
                }

                @Override // X.InterfaceC520720KbW
                public final long getRoomId() {
                    return this.LIZ;
                }

                {
                    this.LIZ = id;
                    this.LIZIZ = description;
                }
            });
        }
        C1107610evf.LIZIZ++;
        C1107610evf.LIZ();
        C1075770e6J c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
        if (c1075770e6J != null) {
            c1075770e6J.LJIIZILJ(new AbstractC1544140qHk() { // from class: X.0evi
                public static final String LIZIZ = "webcast_bridge_client";

                @Override // X.AbstractC1544140qHk
                public final String LIZ() {
                    return LIZIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
                @Override // X.AbstractC1544140qHk
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJIIIIZZ(X.C1543190qGD r13, X.C1543910qHN r14) {
                    /*
                        Method dump skipped, instruction units count: 299
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1107640evi.LJIIIIZZ(X.0qGD, X.0qHN):void");
                }
            });
        }
    }
}
