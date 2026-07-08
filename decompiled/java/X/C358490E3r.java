package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358490E3r {
    public final C0E48 LIZ;

    public final void LIZ() {
        C0E55 player;
        C0E48 c0e48 = this.LIZ;
        if (c0e48 == null || (player = c0e48.getPlayer()) == null || !player.isPlaying()) {
            return;
        }
        player.pause(false);
    }

    public C358490E3r(C0E48 c0e48) {
        this.LIZ = c0e48;
    }

    public final void LIZIZ(long j, INLEListenerSeek iNLEListenerSeek, boolean z, boolean z2) {
        C0E55 player;
        C0E55 player2;
        C358920E5i c358920E5i = new C358920E5i(iNLEListenerSeek, z2);
        if (z) {
            C0E48 c0e48 = this.LIZ;
            if (c0e48 != null && (player2 = c0e48.getPlayer()) != null) {
                player2.LJJII(j, c358920E5i);
            }
        } else {
            C0E48 c0e482 = this.LIZ;
            if (c0e482 != null && (player = c0e482.getPlayer()) != null) {
                player.ba(C351220Dpo.LLLLLLL(j), c358920E5i);
            }
        }
        C354270Duj.LIZ(4000L, new AwS549S0100000_5(c358920E5i, 702));
    }
}
