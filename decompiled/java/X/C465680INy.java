package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0INy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465680INy {
    public static final C20337914i1<Integer> LIZ = new C20337914i1<>("tt_live_sdk_version", Integer.class, 4510);

    public static String LIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        return (iHostAppContext == null || !iHostAppContext.isOffline()) ? String.valueOf(4510) : String.valueOf(LIZ.LIZIZ());
    }
}
