package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0i54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228760i54 {
    public static final C1228760i54 LIZ = new C1228760i54();

    public static final void LIZ(String str, Pair<String, String>[] pairArr, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        for (Pair<String, String> pair : pairArr) {
            c830490Whz.put(pair.getFirst(), pair.getSecond());
        }
        interfaceC1493105sv.sendEvent(str, c830490Whz);
    }
}
