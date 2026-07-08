package X;

import java.util.List;

/* JADX INFO: renamed from: X.04Uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1106304Uj {
    public static final List<String> LIZ;
    public static final List<String> LIZIZ;

    static {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("/cloudpush/update_token/", "/cloudpush/update_sender/", "/cloudpush/app_notice_status/", "/consent/api/record/create/sync/v2", "/consent/api/combine/list/v1");
        LIZ = listLJIIJJI;
        LIZIZ = C13LP.LJLIL(C1697810uHb.LJIIJJI("/plugin/config/", "/hybrid/ab/", "/common", "/tfe/api/request_combine/v1/"), listLJIIJJI);
    }
}
