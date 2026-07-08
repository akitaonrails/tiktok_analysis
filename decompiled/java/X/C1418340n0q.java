package X;

import com.bytedance.ies.smartmovie.jni.MusicRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;

/* JADX INFO: renamed from: X.0n0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418340n0q extends MusicRequestCallback {
    public final MusicRequestCallback LIZ;
    public final C1418510n17 LIZIZ = new C1418510n17();
    public final long LIZJ;

    public C1418340n0q(MusicRequestCallback musicRequestCallback, Object... objArr) {
        this.LIZ = musicRequestCallback;
        this.LIZJ = C1418510n17.LIZIZ(objArr, musicRequestCallback, this);
    }

    @Override // com.bytedance.ies.smartmovie.jni.MusicRequestCallback
    public final void onInfoCallBack(MusicRequestCallbackInfoType musicRequestCallbackInfoType, float f, int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        this.LIZ.onInfoCallBack(musicRequestCallbackInfoType, f, i, str, unorderedMapStrStr);
        if (musicRequestCallbackInfoType != null) {
            int i2 = C1418370n0t.LIZ[musicRequestCallbackInfoType.ordinal()];
            if (i2 != 1 && i2 != 2) {
                return;
            }
            C1418510n17 c1418510n17 = this.LIZIZ;
            long j = this.LIZJ;
            c1418510n17.getClass();
            C1418510n17.LIZ(j);
        }
    }
}
