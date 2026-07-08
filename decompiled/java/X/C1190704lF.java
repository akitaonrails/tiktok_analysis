package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.04lF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1190704lF {
    public static final C1190704lF LIZ = new C1190704lF();

    public static final <SERVICE> SERVICE LIZ(Class<? extends SERVICE> cls) {
        return (SERVICE) ServiceManager.get().getService(cls);
    }
}
