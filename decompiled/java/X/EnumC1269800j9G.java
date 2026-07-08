package X;

/* JADX INFO: renamed from: X.0j9G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1269800j9G {
    message,
    adm,
    avo_cache_info,
    transport_layer_status,
    video_filter,
    url,
    video_frame_elapse,
    camera,
    rms,
    adm_status,
    adm_pts_info,
    transport_send_stall,
    push_stream_stall_status,
    roi;

    public static EnumC1269800j9G valueOf(String str) {
        return (EnumC1269800j9G) C08FF.LIZ(EnumC1269800j9G.class, str);
    }

    public static boolean CheckMask(int i, EnumC1269800j9G enumC1269800j9G) {
        if ((i & (1 << enumC1269800j9G.ordinal())) != 0) {
            return true;
        }
        return false;
    }
}
