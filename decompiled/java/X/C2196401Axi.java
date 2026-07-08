package X;

/* JADX INFO: renamed from: X.1Axi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196401Axi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C2196371Axf c2196371Axf) {
        C2196391Axh c2196391Axh;
        C2196441Axm stage = null;
        if (C2197221Az2.LIZ(C2195221Avo.LIZ())) {
            if (c2196371Axf != null) {
                stage = c2196371Axf.getStage(EnumC2196421Axk.MAIN_FRAME_LOAD);
            }
            if ((stage instanceof C2195301Avw) && stage != null) {
                stage.setEndTime(System.currentTimeMillis());
                stage.setSuccess(true);
                if (c2196371Axf != null) {
                    c2196371Axf.recordStage(stage);
                }
            }
        } else {
            if (c2196371Axf != null) {
                stage = c2196371Axf.getStage(EnumC2196421Axk.WEBVIEW_LOAD);
            }
            if ((stage instanceof C2196391Axh) && (c2196391Axh = (C2196391Axh) stage) != null) {
                c2196391Axh.setEndTime(System.currentTimeMillis());
                c2196391Axh.setHasResourceCache(false);
                c2196391Axh.setSuccess(true);
                if (c2196371Axf != null) {
                    c2196371Axf.recordStage(c2196391Axh);
                }
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordEnd, isSuccess:");
        sbLIZ.append(true);
        sbLIZ.append(", loadPerfModel:");
        sbLIZ.append(c2196371Axf);
        sbLIZ.append(", hasResourceCache:");
        sbLIZ.append(false);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(C2196371Axf c2196371Axf, boolean z) {
        C2196391Axh c2196391Axh;
        C2196441Axm stage = null;
        if (C2197221Az2.LIZ(C2195221Avo.LIZ())) {
            if (c2196371Axf != null) {
                stage = c2196371Axf.getStage(EnumC2196421Axk.MAIN_FRAME_LOAD);
            }
            if ((stage instanceof C2195301Avw) && stage != null) {
                stage.setStartTime(System.currentTimeMillis());
                if (c2196371Axf != null) {
                    c2196371Axf.recordStage(stage);
                }
            }
        } else {
            if (c2196371Axf != null) {
                stage = c2196371Axf.getStage(EnumC2196421Axk.WEBVIEW_LOAD);
            }
            if ((stage instanceof C2196391Axh) && (c2196391Axh = (C2196391Axh) stage) != null) {
                c2196391Axh.setHasRedirect(z);
                c2196391Axh.setStartTime(System.currentTimeMillis());
                if (c2196371Axf != null) {
                    c2196371Axf.recordStage(c2196391Axh);
                }
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordStart, loadPerfModel:");
        sbLIZ.append(c2196371Axf);
        sbLIZ.append(", hasRedirect:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(C2196371Axf c2196371Axf, boolean z) {
        C2195301Avw c2195301Avw;
        LIZIZ(c2196371Axf, false);
        C2196441Axm stage = null;
        if (c2196371Axf != null) {
            stage = c2196371Axf.getStage(EnumC2196421Axk.MAIN_FRAME_LOAD);
        }
        if ((stage instanceof C2195301Avw) && (c2195301Avw = (C2195301Avw) stage) != null) {
            c2195301Avw.setHasMainFramePreload(z);
            c2195301Avw.setHasMainFrameSourceCache(false);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordStart, loadPerfModel:");
        sbLIZ.append(c2196371Axf);
        sbLIZ.append(", hasRedirect:");
        sbLIZ.append(false);
        sbLIZ.append(", hasMainFramePreload:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
