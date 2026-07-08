package X;

/* JADX INFO: renamed from: X.0j9F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1269790j9F {
    /* JADX INFO: Fake field, exist only in values array */
    message,
    adm,
    /* JADX INFO: Fake field, exist only in values array */
    avo_cache_info,
    /* JADX INFO: Fake field, exist only in values array */
    transport_layer_status,
    video_filter,
    url,
    /* JADX INFO: Fake field, exist only in values array */
    video_frame_elapse,
    camera,
    rms,
    adm_status,
    adm_pts_info,
    /* JADX INFO: Fake field, exist only in values array */
    transport_send_stall,
    /* JADX INFO: Fake field, exist only in values array */
    push_stream_stall_status,
    /* JADX INFO: Fake field, exist only in values array */
    roi;

    public static EnumC1269790j9F valueOf(String str) {
        return (EnumC1269790j9F) C08FF.LIZ(EnumC1269790j9F.class, str);
    }

    public static boolean LIZJ(int i, EnumC1269790j9F enumC1269790j9F) {
        if ((i & (1 << enumC1269790j9F.ordinal())) != 0) {
            return true;
        }
        return false;
    }
}
