package X;

import android.os.Bundle;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0j8Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269370j8Z {
    public final InterfaceC1268640j7O LIZJ;
    public final C1266350j3h LIZLLL;
    public C1266390j3l LJFF;
    public final C1267500j5Y LJI;
    public final C1269850j9L LJIIJ;
    public C1267750j5x LJIIJJI;
    public final C1273370jF1 LJIIL;
    public final List<C1269610j8x> LIZ = new LinkedList();
    public final C1269410j8d LJ = new C1269410j8d();
    public boolean LJII = false;
    public boolean LJIIIIZZ = false;
    public boolean LJIIIZ = false;
    public final C1269440j8g LIZIZ = new C1269440j8g();

    public final boolean LIZJ() {
        return (this.LIZLLL.LLLFFI("key_effect_node_enable").getBoolean("key_effect_node_enable", true) && this.LIZLLL.LLLFFI("key_effect_resource_validation_query").getBoolean("key_effect_resource_validation_query", true)) ? false : true;
    }

    public final void LIZLLL(VideoFrame videoFrame) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean bool;
        int i2;
        int i3;
        long j;
        List<C1269610j8x> events = videoFrame.getEvents();
        if (events != null && events.size() != 0) {
            ((LinkedList) this.LIZ).addAll(events);
        }
        List<C1269610j8x> list = this.LIZ;
        boolean z4 = true;
        if (list != null && ((LinkedList) list).size() != 0) {
            Iterator<C1269610j8x> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                C1269610j8x next = it2.next();
                int i4 = next.LJFF;
                int i5 = C1269570j8t.LIZJ;
                if ((i4 & i5) != 0 && C1269400j8c.LIZ[next.LIZLLL.ordinal()] == 1 && (next instanceof C1269600j8w)) {
                    C1269600j8w c1269600j8w = (C1269600j8w) next;
                    this.LIZLLL.LLLIIIL(next.LIZLLL(i5));
                    int i6 = c1269600j8w.LJII;
                    int i7 = c1269600j8w.LJIIIIZZ;
                    TEBundle tEBundle = c1269600j8w.LJIIJJI;
                    C1269440j8g c1269440j8g = this.LIZIZ;
                    c1269440j8g.LIZIZ = i7;
                    c1269440j8g.LIZ = i6;
                    if (tEBundle != null) {
                        if (tEBundle.contains("video_fov_small_window_opt")) {
                            bool = tEBundle.getBool("video_fov_small_window_opt");
                        } else {
                            bool = false;
                        }
                        c1269440j8g.LIZJ = bool;
                        C1269440j8g c1269440j8g2 = this.LIZIZ;
                        if (tEBundle.contains("video_fov_crop_aspect_width")) {
                            i2 = tEBundle.getInt("video_fov_crop_aspect_width");
                        } else {
                            i2 = 9;
                        }
                        c1269440j8g2.LIZLLL = i2;
                        C1269440j8g c1269440j8g3 = this.LIZIZ;
                        if (tEBundle.contains("video_fov_crop_aspect_height")) {
                            i3 = tEBundle.getInt("video_fov_crop_aspect_height");
                        } else {
                            i3 = 16;
                        }
                        c1269440j8g3.LJ = i3;
                        C1269440j8g c1269440j8g4 = this.LIZIZ;
                        if (tEBundle.contains("video_fov_opt_max_piexel_size")) {
                            j = tEBundle.getLong("video_fov_opt_max_piexel_size");
                        } else {
                            j = 76800;
                        }
                        c1269440j8g4.LJFF = j;
                    }
                    int i8 = c1269600j8w.LJFF & (~i5);
                    c1269600j8w.LJFF = i8;
                    if (i8 == 0) {
                        it2.remove();
                    }
                }
            }
        }
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        C1269410j8d c1269410j8d = this.LJ;
        C1269440j8g c1269440j8g5 = this.LIZIZ;
        int i9 = c1269440j8g5.LIZ;
        if (i9 != 0 && (i = c1269440j8g5.LIZIZ) != 0) {
            if (c1269440j8g5.LIZJ && c1269440j8g5.LJFF >= i9 * i && c1269440j8g5.LIZLLL > 0 && c1269440j8g5.LJ > 0) {
                int[] iArr = new int[2];
                LIZ(rotatedWidth, rotatedHeight, c1269440j8g5.LIZLLL, c1269440j8g5.LJ, iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                C1269440j8g c1269440j8g6 = this.LIZIZ;
                LIZ(i10, i11, c1269440j8g6.LIZ, c1269440j8g6.LIZIZ, iArr);
                c1269410j8d.LIZJ = iArr[0];
                c1269410j8d.LIZLLL = iArr[1];
            } else {
                int i12 = i9 * rotatedHeight;
                int i13 = i * rotatedWidth;
                if (i12 > i13) {
                    c1269410j8d.LIZJ = rotatedWidth;
                    c1269410j8d.LIZLLL = i13 / i9;
                } else {
                    c1269410j8d.LIZLLL = rotatedHeight;
                    c1269410j8d.LIZJ = i12 / i;
                }
            }
        } else {
            c1269410j8d.LIZJ = rotatedWidth;
            c1269410j8d.LIZLLL = rotatedHeight;
        }
        C1269440j8g c1269440j8g7 = this.LIZIZ;
        int i14 = c1269440j8g7.LIZ;
        if (i14 == 0) {
            i14 = rotatedWidth;
        }
        c1269410j8d.LIZ = i14;
        int i15 = c1269440j8g7.LIZIZ;
        if (i15 == 0) {
            i15 = rotatedHeight;
        }
        c1269410j8d.LIZIZ = i15;
        c1269410j8d.LJ = (rotatedWidth - c1269410j8d.LIZJ) / 2;
        c1269410j8d.LJFF = (rotatedHeight - c1269410j8d.LIZLLL) / 2;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        C1269410j8d c1269410j8d2 = this.LJ;
        buffer.cropAndScaleV2(c1269410j8d2.LJ, c1269410j8d2.LJFF, c1269410j8d2.LIZJ, c1269410j8d2.LIZLLL, c1269410j8d2.LIZ, c1269410j8d2.LIZIZ);
        List<C1269610j8x> list2 = this.LIZ;
        videoFrame.clearSerializedEvents();
        LinkedList linkedList = new LinkedList();
        if (list2 != null && ((LinkedList) list2).size() != 0) {
            Iterator<C1269610j8x> it3 = list2.iterator();
            while (it3.hasNext()) {
                C1269610j8x next2 = it3.next();
                InterfaceC1269480j8k interfaceC1269480j8k = next2.LJI;
                if (interfaceC1269480j8k == null || interfaceC1269480j8k.LIZ()) {
                    linkedList.add(next2);
                    it3.remove();
                    this.LIZLLL.LLLIIIL(next2.LIZIZ(C1269570j8t.LIZJ));
                }
            }
        }
        if (linkedList.size() != 0) {
            videoFrame.appendSerializedEvents(linkedList);
        }
        C1266350j3h c1266350j3h = this.LIZLLL;
        if (c1266350j3h != null && !c1266350j3h.LLJILLL()) {
            boolean zLIZIZ = LIZIZ(videoFrame, this.LJ, false);
            this.LIZJ.LJJIIZI(zLIZIZ);
            if (this.LJII && !this.LIZLLL.I) {
                C1269850j9L c1269850j9L = this.LJIIJ;
                if (c1269850j9L != null) {
                    c1269850j9L.LIZJ(EnumC1269840j9K.DURATION_TYPE_PRE_EFFECT, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                }
                videoFrame.getBuffer().updateEffectServerNtpMs(videoFrame.getBuffer().getCaptureServerNtpMs());
                this.LJFF.LJIIJJI(videoFrame);
                if (this.LJIIL != null && (videoFrame.getBuffer().getBufferType() == 1 || videoFrame.getBuffer().getBufferType() == 2)) {
                    C1273370jF1 c1273370jF1 = this.LJIIL;
                    int textureId = videoFrame.getTextureId();
                    int rotatedWidth2 = videoFrame.getRotatedWidth();
                    int rotatedHeight2 = videoFrame.getRotatedHeight();
                    if (videoFrame.getBuffer().getBufferType() == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c1273370jF1.LIZIZ(textureId, rotatedWidth2, rotatedHeight2, z3, videoFrame, ((InterfaceC1271560jC6) videoFrame.getBuffer()).getTransformMatrix());
                }
                this.LJII = zLIZIZ;
                return;
            }
            this.LJII = zLIZIZ;
        }
        C1266350j3h c1266350j3h2 = this.LIZLLL;
        if (c1266350j3h2 != null) {
            if (c1266350j3h2.LLILZLL.LJLLJ) {
                this.LJIIIZ = c1266350j3h2.p;
            }
            if (c1266350j3h2.LLJILLL()) {
                if (this.LJIIJJI != null) {
                    Bundle bundle = new Bundle();
                    boolean zLIZJ = LIZJ();
                    if (zLIZJ && !this.LJIIIIZZ) {
                        z = false;
                    } else {
                        z = zLIZJ;
                    }
                    this.LJIIIIZZ = zLIZJ;
                    boolean zLIZIZ2 = LIZIZ(videoFrame, this.LJ, z);
                    this.LJII = zLIZIZ2;
                    if (z && !zLIZIZ2 && this.LJIIIZ) {
                        z2 = true;
                    } else {
                        z2 = false;
                        if (z) {
                        }
                        bundle.putBoolean("skip_effect", z);
                        bundle.putBoolean("skip_crop_and_scale", this.LJII);
                        bundle.putBoolean("flip_after_copr_and_scale", z2);
                        bundle.putBoolean("flip_in_crop_and_scale", z4);
                        this.LJIIJJI.onData(videoFrame, bundle);
                        return;
                    }
                    if (!LIZJ() || !this.LJIIIZ) {
                        z4 = false;
                    }
                    bundle.putBoolean("skip_effect", z);
                    bundle.putBoolean("skip_crop_and_scale", this.LJII);
                    bundle.putBoolean("flip_after_copr_and_scale", z2);
                    bundle.putBoolean("flip_in_crop_and_scale", z4);
                    this.LJIIJJI.onData(videoFrame, bundle);
                    return;
                }
                return;
            }
        }
        VideoFrame videoFrameLJJJJZ = this.LIZJ.LJJJJZ(videoFrame);
        if (!this.LJI.LIZ.enableNewVideoBufferPool && videoFrameLJJJJZ != null) {
            videoFrameLJJJJZ.release();
        }
    }

    public C1269370j8Z(InterfaceC1268640j7O interfaceC1268640j7O, C1266350j3h c1266350j3h, C1267500j5Y c1267500j5Y) {
        this.LIZJ = interfaceC1268640j7O;
        this.LIZLLL = c1266350j3h;
        this.LJI = c1267500j5Y;
        this.LJIIJ = (C1269850j9L) c1267500j5Y.LIZJ.getService(C1269850j9L.class);
        this.LJIIL = (C1273370jF1) c1267500j5Y.LIZJ.getService(C1273370jF1.class);
    }

    public final boolean LIZIZ(VideoFrame videoFrame, C1269410j8d c1269410j8d, boolean z) {
        boolean z2;
        videoFrame.getBuffer();
        if (c1269410j8d.LIZJ / c1269410j8d.LIZ <= 2 && c1269410j8d.LIZLLL / c1269410j8d.LIZIZ <= 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1266350j3h c1266350j3h = this.LIZLLL;
        if (c1266350j3h != null && c1266350j3h.LLJILLL()) {
            if (!z || z2 || this.LJIIIZ) {
                return false;
            }
            return true;
        }
        InterfaceC1268640j7O interfaceC1268640j7O = this.LIZJ;
        if (interfaceC1268640j7O == null || interfaceC1268640j7O.LJJJLL() == null) {
            return true;
        }
        if (this.LIZJ.LJJJLL().isExistValidResource() != 0 || z2 || this.LJIIIZ) {
            return false;
        }
        return true;
    }

    public static void LIZ(int i, int i2, int i3, int i4, int[] iArr) {
        if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            int i5 = i3 * i2;
            int i6 = i4 * i;
            if (i5 > i6) {
                i2 = i6 / i3;
            } else {
                i = i5 / i4;
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
    }
}
