package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeAccompanySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeVocalSetting;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0U1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765700U1w {
    public static boolean LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(385));

    public static float LIZ(int i) {
        LiveKaraokeAccompanySetting liveKaraokeAccompanySetting = LiveKaraokeAccompanySetting.INSTANCE;
        float fMax = liveKaraokeAccompanySetting.max();
        float fMin = liveKaraokeAccompanySetting.min();
        if (fMin >= fMax) {
            fMin = 0.0f;
            fMax = 1.0f;
        }
        return i * ((fMax - fMin) / 100);
    }

    public static float LIZIZ(int i) {
        LiveKaraokeVocalSetting liveKaraokeVocalSetting = LiveKaraokeVocalSetting.INSTANCE;
        float fMax = liveKaraokeVocalSetting.max();
        float fMin = liveKaraokeVocalSetting.min();
        if (fMin >= fMax) {
            fMin = 0.0f;
            fMax = 1.0f;
        }
        return i * ((fMax - fMin) / 100);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[PHI: r5 r7
      0x003c: PHI (r5v2 long) = (r5v1 long), (r5v4 long), (r5v4 long) binds: [B:28:0x0052, B:20:0x0034, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r7v1 long) = (r7v0 long), (r7v3 long), (r7v3 long) binds: [B:28:0x0052, B:20:0x0034, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel LIZJ(final com.bytedance.ies.sdk.datachannel.DataChannel r10) {
        /*
            r3 = 0
            if (r10 == 0) goto L59
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r2 = r10.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
        Lb:
            boolean r0 = X.C500260Jjc.LJIIZILJ(r10)
            if (r0 == 0) goto L57
            r4 = 1
        L12:
            if (r10 == 0) goto L55
            androidx.lifecycle.LifecycleOwner r1 = r10.LLILZ
        L16:
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L5b
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L5b
            X.0U1x r3 = new X.0U1x
            if (r2 == 0) goto L4e
            long r5 = r2.getId()
            com.bytedance.android.live.base.model.user.User r0 = r2.getOwner()
            if (r0 == 0) goto L50
            long r7 = r0.getId()
        L30:
            com.bytedance.android.live.base.model.user.User r0 = r2.getOwner()
            if (r0 == 0) goto L3c
            java.lang.String r9 = r0.getSecUid()
            if (r9 != 0) goto L3e
        L3c:
            java.lang.String r9 = ""
        L3e:
            r3.<init>(r4, r5, r7, r9, r10)
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r3)
            java.lang.Class<com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel> r0 = com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = (com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel) r0
            return r0
        L4e:
            r5 = 0
        L50:
            r7 = -1
            if (r2 == 0) goto L3c
            goto L30
        L55:
            r1 = r3
            goto L16
        L57:
            r4 = 2
            goto L12
        L59:
            r2 = r3
            goto Lb
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C765700U1w.LIZJ(com.bytedance.ies.sdk.datachannel.DataChannel):com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel");
    }

    public static int LIZLLL(Integer num) {
        if (C763810Txj.LIZ(num)) {
            C20337914i1<Integer> c20337914i1 = InterfaceC766480U4w.LJJLIIIJILLIZJL;
            Integer numLIZIZ = c20337914i1.LIZIZ();
            if (numLIZIZ != null && numLIZIZ.intValue() == -1) {
                c20337914i1.LJFF(Integer.valueOf(LiveKaraokeAccompanySetting.INSTANCE.uiDefault()));
            }
            return c20337914i1.LIZIZ().intValue();
        }
        C20337914i1<Integer> c20337914i12 = InterfaceC766480U4w.LJJLIIIJLLLLLLLZ;
        Integer numLIZIZ2 = c20337914i12.LIZIZ();
        if (numLIZIZ2 != null && numLIZIZ2.intValue() == -1) {
            c20337914i12.LJFF(Integer.valueOf(LiveKaraokeAccompanySetting.INSTANCE.uiDefault()));
        }
        return c20337914i12.LIZIZ().intValue();
    }

    public static int LJ(Integer num) {
        if (C763810Txj.LIZ(num)) {
            C20337914i1<Integer> c20337914i1 = InterfaceC766480U4w.LJJLIIIJ;
            Integer numLIZIZ = c20337914i1.LIZIZ();
            if (numLIZIZ != null && numLIZIZ.intValue() == -1) {
                c20337914i1.LJFF(Integer.valueOf(LiveKaraokeVocalSetting.INSTANCE.uiDefault()));
            }
            return c20337914i1.LIZIZ().intValue();
        }
        C20337914i1<Integer> c20337914i12 = InterfaceC766480U4w.LJJLIIIJLJLI;
        Integer numLIZIZ2 = c20337914i12.LIZIZ();
        if (numLIZIZ2 != null && numLIZIZ2.intValue() == -1) {
            c20337914i12.LJFF(Integer.valueOf(LiveKaraokeVocalSetting.INSTANCE.uiDefault()));
        }
        return c20337914i12.LIZIZ().intValue();
    }
}
