package X;

/* JADX INFO: renamed from: X.0YGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871410YGl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0YEM c0yem, EnumC871420YGm enumC871420YGm, int i, int i2, boolean z) {
        if (c0yem.LJIIZILJ().LJFF().getEventTracker().LIZJ(c0yem.LJIIIZ().LJJLIIIIJ.LJJI.retryBufferActivitySampleRate)) {
            C0YJ9 c0yj9 = new C0YJ9(c0yem);
            c0yj9.LIZJ("im_sdk_retry_buffer_activity");
            c0yj9.LIZ(enumC871420YGm.getTitle(), "activity_type");
            c0yj9.LIZ(Boolean.valueOf(z), "is_ws");
            c0yj9.LIZ(Integer.valueOf(i), "retry_buffer_size");
            c0yj9.LIZ(Integer.valueOf(i2), "buffer_queue_size");
            c0yj9.LIZLLL();
        }
    }
}
