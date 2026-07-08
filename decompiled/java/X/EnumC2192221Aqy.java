package X;

/* JADX INFO: renamed from: X.1Aqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2192221Aqy {
    monitor_default,
    event,
    event_v3,
    log_data,
    item_impression,
    launch,
    terminate,
    real_event,
    pack,
    database,
    register,
    active,
    config,
    ab_config,
    engine,
    log_send,
    migrate_old,
    f_cache_event,
    filtered_event,
    f_db_insert_event,
    f_to_pack_event,
    sampling_event,
    f_to_bytes_event,
    f_to_bytes_encrypt_event,
    large_event,
    f_expire_event,
    f_oom_event;

    public static EnumC2192221Aqy valueOf(String str) {
        return (EnumC2192221Aqy) C08FF.LIZ(EnumC2192221Aqy.class, str);
    }
}
