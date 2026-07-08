package X;

import Y.ARunnableS122S0100000_22;
import Y.ARunnableS72S0200000_3;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0nkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446630nkT {
    public static final ExecutorService LIZ;

    static {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZIZ = "EffectVideoCover";
        c2123408ToLIZ.LIZJ = 3;
        LIZ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static boolean LIZ(IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
        if (creativeToolsPluginService != null && !creativeToolsPluginService.LJI(null)) {
            LIZLLL(onVideoCoverCallback);
            return false;
        }
        try {
            C0CHQ.LIZ().LJJIZ();
            return true;
        } catch (LinkageError e) {
            TryCatchGuardChecker.doCheck(e);
            LIZLLL(onVideoCoverCallback);
            return false;
        }
    }

    public static void LIZLLL(IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        if (onVideoCoverCallback != null) {
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
        }
    }

    public static void LIZIZ(final int i, boolean z, EditPreviewInfo editPreviewInfo, final String str, final IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        VEUtils.VEVideoFileInfo videoFileInfo;
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_effect_video_cover_native_guard", true, true);
        if (zLJIIIZ) {
            if (!LIZ(onVideoCoverCallback)) {
                return;
            }
        } else {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
            if (creativeToolsPluginService != null && !creativeToolsPluginService.LJI(null)) {
                LIZLLL(onVideoCoverCallback);
                return;
            }
        }
        C443120HZe<EditVideoSegment, Long, long[]> c443120HZeLJIIIZ = C571500MbE.LJIIIZ(editPreviewInfo, z, i);
        if (c443120HZeLJIIIZ == null) {
            LIZLLL(onVideoCoverCallback);
            return;
        }
        EditVideoSegment first = c443120HZeLJIIIZ.getFirst();
        String videoPath = first.getVideoPath();
        CreativeToolsPluginService creativeToolsPluginService2 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
        if (creativeToolsPluginService2 != null && creativeToolsPluginService2.LJI(null) && !TextUtils.isEmpty(videoPath)) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_effect_video_cover_native_guard", true, true)) {
                try {
                    videoFileInfo = VEUtils.getVideoFileInfo(videoPath);
                } catch (LinkageError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                videoFileInfo = VEUtils.getVideoFileInfo(videoPath);
            }
            if (videoFileInfo != null && videoFileInfo.bHDR) {
                final String videoPath2 = first.getVideoPath();
                C15O7.LIZIZ(new Callable() { // from class: X.0nkU
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int videoFrames2;
                        final IEffectService.OnVideoCoverCallback onVideoCoverCallback2 = onVideoCoverCallback;
                        String str2 = videoPath2;
                        final String str3 = str;
                        int i2 = i;
                        C1C7U.LIZ("EffectVideoCoverPresenter@1daf.getHDRVideoCover$1L");
                        boolean zLJIIIZ2 = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_effect_video_cover_native_guard", true, true);
                        if (!zLJIIIZ2) {
                            CreativeToolsPluginService creativeToolsPluginService3 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
                            if (creativeToolsPluginService3 == null || !creativeToolsPluginService3.LJI(null)) {
                                C2474509mp.LIZ(new ARunnableS122S0100000_22(onVideoCoverCallback2, 99));
                                C1C7U.LIZIZ("EffectVideoCoverPresenter@1daf.getHDRVideoCover$1L");
                                return null;
                            }
                        } else if (!C1446630nkT.LIZ(null)) {
                            C2474509mp.LIZ(new ARunnableS122S0100000_22(onVideoCoverCallback2, 98));
                            C1C7U.LIZIZ("EffectVideoCoverPresenter@1daf.getHDRVideoCover$1L");
                            return null;
                        }
                        if (zLJIIIZ2) {
                            try {
                                videoFrames2 = VEUtils.getVideoFrames2(str2, new int[]{i2}, 256, -1, false, new InterfaceC1286300jZs() { // from class: X.09mt
                                    @Override // X.InterfaceC1286300jZs
                                    public final boolean processFrame(ByteBuffer byteBuffer, int i3, int i4, int i5) {
                                        String str4 = str3;
                                        IEffectService.OnVideoCoverCallback onVideoCoverCallback3 = onVideoCoverCallback2;
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                                        if (!TextUtils.isEmpty(str4)) {
                                            C2475009mu.LJFF(60, Bitmap.CompressFormat.PNG, bitmapCreateBitmap, new C0VSJ(str4));
                                        }
                                        C2474509mp.LIZ(new ARunnableS72S0200000_3(onVideoCoverCallback3, bitmapCreateBitmap, 30));
                                        return true;
                                    }
                                });
                            } catch (LinkageError e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C2474509mp.LIZ(new ARunnableS122S0100000_22(onVideoCoverCallback2, 100));
                                C1C7U.LIZIZ("EffectVideoCoverPresenter@1daf.getHDRVideoCover$1L");
                                return null;
                            }
                        } else {
                            videoFrames2 = VEUtils.getVideoFrames2(str2, new int[]{i2}, 256, -1, false, new InterfaceC1286300jZs() { // from class: X.09mt
                                @Override // X.InterfaceC1286300jZs
                                public final boolean processFrame(ByteBuffer byteBuffer, int i3, int i4, int i5) {
                                    String str4 = str3;
                                    IEffectService.OnVideoCoverCallback onVideoCoverCallback3 = onVideoCoverCallback2;
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                                    if (!TextUtils.isEmpty(str4)) {
                                        C2475009mu.LJFF(60, Bitmap.CompressFormat.PNG, bitmapCreateBitmap, new C0VSJ(str4));
                                    }
                                    C2474509mp.LIZ(new ARunnableS72S0200000_3(onVideoCoverCallback3, bitmapCreateBitmap, 30));
                                    return true;
                                }
                            });
                        }
                        if (videoFrames2 != 0) {
                            C2474509mp.LIZ(new ARunnableS122S0100000_22(onVideoCoverCallback2, 101));
                        }
                        C1C7U.LIZIZ("EffectVideoCoverPresenter@1daf.getHDRVideoCover$1L");
                        return null;
                    }
                }, LIZ, null);
                return;
            }
        }
        int width = first.getVideoFileInfo().getWidth();
        int height = first.getVideoFileInfo().getHeight();
        if (width < height) {
            if (width <= 0 || width >= 256) {
                width = 256;
            }
            height = 0;
        } else {
            if (height <= 0 || height >= 256) {
                height = 256;
            }
            width = 0;
        }
        if (zLJIIIZ) {
            try {
                LIZJ(first, c443120HZeLJIIIZ.getSecond().intValue(), width, height, z, str, onVideoCoverCallback, true);
                return;
            } catch (LinkageError e2) {
                TryCatchGuardChecker.doCheck(e2);
                LIZLLL(onVideoCoverCallback);
                return;
            }
        }
        LIZJ(first, c443120HZeLJIIIZ.getSecond().intValue(), width, height, z, str, onVideoCoverCallback, false);
    }

    public static void LIZJ(final EditVideoSegment editVideoSegment, int i, int i2, int i3, final boolean z, final String str, final IEffectService.OnVideoCoverCallback onVideoCoverCallback, final boolean z2) {
        VEUtils.getVideoFrames(editVideoSegment.getVideoPath(), new int[]{i}, i2, i3, false, new InterfaceC1286300jZs() { // from class: X.0LD2
            /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
            @Override // X.InterfaceC1286300jZs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean processFrame(java.nio.ByteBuffer r13, int r14, int r15, int r16) {
                /*
                    r12 = this;
                    boolean r5 = r1
                    boolean r2 = r2
                    com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r4 = r3
                    java.lang.String r1 = r4
                    com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback r3 = r5
                    boolean r0 = X.C256050A1r.LIZ()
                    r6 = 0
                    if (r0 != 0) goto L44
                    if (r5 != 0) goto L44
                    if (r2 == 0) goto L22
                    java.lang.String r0 = r4.getVideoPath()
                    com.ss.android.vesdk.VEUtils$VEVideoFileInfo r0 = com.ss.android.vesdk.VEUtils.getVideoFileInfo(r0)     // Catch: java.lang.LinkageError -> L3e
                    if (r0 == 0) goto L42
                    int r2 = r0.rotation     // Catch: java.lang.LinkageError -> L3e
                    goto L2e
                L22:
                    java.lang.String r0 = r4.getVideoPath()
                    com.ss.android.vesdk.VEUtils$VEVideoFileInfo r0 = com.ss.android.vesdk.VEUtils.getVideoFileInfo(r0)
                    if (r0 == 0) goto L42
                    int r2 = r0.rotation
                L2e:
                    com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r0 = r4.getVideoCutInfo()
                    if (r0 == 0) goto L45
                    com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r0 = r4.getVideoCutInfo()
                    int r0 = r0.getRotate()
                    int r2 = r2 + r0
                    goto L45
                L3e:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L42:
                    r2 = 0
                    goto L2e
                L44:
                    r2 = 0
                L45:
                    android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                    android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r14, r15, r0)
                    java.nio.Buffer r0 = r13.position(r6)
                    r5.copyPixelsFromBuffer(r0)
                    boolean r0 = X.C256050A1r.LIZ()
                    if (r0 != 0) goto L71
                    if (r2 <= 0) goto L71
                    android.graphics.Matrix r10 = new android.graphics.Matrix
                    r10.<init>()
                    float r0 = (float) r2
                    r10.postRotate(r0)
                    int r8 = r5.getWidth()
                    int r9 = r5.getHeight()
                    r11 = 1
                    r7 = r6
                    android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
                L71:
                    boolean r0 = android.text.TextUtils.isEmpty(r1)
                    if (r0 != 0) goto L85
                    if (r5 == 0) goto L85
                    X.0VSJ r2 = new X.0VSJ
                    r2.<init>(r1)
                    r1 = 60
                    android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
                    X.C2475009mu.LJFF(r1, r0, r5, r2)
                L85:
                    Y.ARunnableS72S0200000_3 r1 = new Y.ARunnableS72S0200000_3
                    r0 = 29
                    r1.<init>(r3, r5, r0)
                    X.C2474509mp.LIZ(r1)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0LD2.processFrame(java.nio.ByteBuffer, int, int, int):boolean");
            }
        });
    }
}
