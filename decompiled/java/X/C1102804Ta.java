package X;

import com.ss.android.ugc.musicprovider.IMusicProviderConfig;
import com.ss.android.ugc.musicprovider.MusicProviderConfigProxy;

/* JADX INFO: renamed from: X.04Ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1102804Ta implements IMusicProviderConfig {
    public static final C1102804Ta LIZIZ = new C1102804Ta();
    public final /* synthetic */ IMusicProviderConfig LIZ;

    @Override // com.ss.android.ugc.musicprovider.IMusicProviderConfig
    public final String getDownloadDir() {
        return this.LIZ.getDownloadDir();
    }

    public C1102804Ta() {
        IMusicProviderConfig iMusicProviderConfig;
        Object objLIZ = C04TD.LIZ(IMusicProviderConfig.class, false);
        if (objLIZ != null) {
            iMusicProviderConfig = (IMusicProviderConfig) objLIZ;
        } else {
            if (C04TD.B6 == null) {
                synchronized (IMusicProviderConfig.class) {
                    if (C04TD.B6 == null) {
                        C04TD.B6 = new MusicProviderConfigProxy();
                    }
                }
            }
            iMusicProviderConfig = C04TD.B6;
        }
        this.LIZ = iMusicProviderConfig;
    }
}
