package X;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VERecordData;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13x5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20176513x5 {
    public static final C20176513x5 LIZ = new C20176513x5();
    public static final AtomicLong LIZIZ = new AtomicLong(0);

    public static String LIZJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        try {
            String strVideoPath = videoPublishEditModel.videoPath();
            if (strVideoPath.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (new C0VSJ(strVideoPath).exists()) {
                    return strVideoPath;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Map LIZIZ(String str, int i, Bitmap.CompressFormat compressFormat, long j, long j2) {
        String str2;
        boolean z;
        C13DA c13da = new C13DA();
        if (str == null) {
            str2 = "null";
        } else {
            str2 = str;
        }
        c13da.put("save_path", str2);
        c13da.put("save_quality", Integer.valueOf(i));
        c13da.put("save_format", compressFormat.name());
        c13da.put("file_size_bytes", Long.valueOf(j));
        c13da.put("file_size_kb", Double.valueOf(j / 1024.0d));
        c13da.put("save_duration_ms", Long.valueOf(j2));
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        c13da.put("save_success", Boolean.valueOf(z));
        if (str != null) {
            try {
                C0VSJ c0vsj = new C0VSJ(str);
                c13da.put("file_exists", Boolean.valueOf(c0vsj.exists()));
                c13da.put("file_absolute_path", c0vsj.getAbsolutePath());
                c13da.put("file_parent", c0vsj.getParent());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c13da.put("file_info_error", e.getMessage());
            }
        }
        return c13da.build();
    }

    public static Map LIZ(InterfaceC20175613ww interfaceC20175613ww, C1457070o1J c1457070o1J, long j, long j2, Throwable th, EnumC19364310pN enumC19364310pN) {
        boolean z;
        long jIntValue;
        boolean z2;
        String str;
        VERecordData vERecordDataLIZJ;
        boolean z3;
        int iIntValue;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        MultiEditVideoRecordData curMultiEditVideoRecordData;
        Pair<Integer, Integer> playInOutTime;
        Integer num;
        C13DA c13da = new C13DA();
        c13da.put("strategy", interfaceC20175613ww.getStrategyName());
        c13da.put("duration", Long.valueOf(j));
        c13da.put("timeout", Long.valueOf(interfaceC20175613ww.getTimeout()));
        boolean z8 = true;
        if (th == null) {
            z = true;
        } else {
            z = false;
        }
        c13da.put("success", Boolean.valueOf(z));
        C20176513x5 c20176513x5 = LIZ;
        VideoPublishEditModel videoPublishEditModel = c1457070o1J.LIZ;
        c20176513x5.getClass();
        String strLIZJ = LIZJ(videoPublishEditModel);
        String str2 = "unknown";
        if (strLIZJ == null) {
            strLIZJ = "unknown";
        }
        c13da.put("video_path", strLIZJ);
        String strLJII = C0MH8.LIZ.LJII(c1457070o1J.LIZ, -1);
        if (strLJII != null) {
            str2 = strLJII;
        }
        c13da.put("cover_path", str2);
        c13da.put("time_stamp", Integer.valueOf(c1457070o1J.LJ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1457070o1J.LJFF);
        sbLIZ.append('x');
        sbLIZ.append(c1457070o1J.LJI);
        c13da.put("resolution", C2188811AlT.LIZIZ(sbLIZ));
        c13da.put("request_id", "REQ_" + System.currentTimeMillis() + "_" + C786410Ut5.j4("%04d", Arrays.copyOf(new Object[]{Long.valueOf(LIZIZ.incrementAndGet())}, 1)) + "_" + a0.LJJJJJL('0', 4, String.valueOf(c1457070o1J.LIZ.getCreationId().hashCode() & 65535)));
        c13da.put("queue_time_ms", Long.valueOf(System.currentTimeMillis() - j2));
        if (th != null) {
            c13da.put("error_type", th.getClass().getSimpleName());
            c13da.put("error_message", th.getMessage());
            if (th instanceof C20176113x1) {
                c13da.put("error_code", "COVER_EXTRACTION_ERROR");
            }
        }
        if (enumC19364310pN == EnumC19364310pN.DETAILED || enumC19364310pN == EnumC19364310pN.DEBUG) {
            String strLIZJ2 = LIZJ(c1457070o1J.LIZ);
            if (strLIZJ2 != null) {
                try {
                    C0VSJ c0vsj = new C0VSJ(strLIZJ2);
                    if (c0vsj.exists()) {
                        c13da.put("video_size_mb", Double.valueOf(c0vsj.length() / 1048576.0d));
                        c13da.put("video_last_modified", Long.valueOf(c0vsj.lastModified()));
                        c13da.put("video_file_exists", Boolean.TRUE);
                    } else {
                        c13da.put("video_file_exists", Boolean.FALSE);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c13da.put("video_size_error", e.getMessage());
                    c13da.put("video_file_exists", Boolean.FALSE);
                }
            } else {
                c13da.put("video_file_exists", Boolean.FALSE);
                c13da.put("video_path_error", "Unable to get video file path");
            }
            try {
                curMultiEditVideoRecordData = c1457070o1J.LIZ.getCurMultiEditVideoRecordData();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (curMultiEditVideoRecordData != null && (playInOutTime = curMultiEditVideoRecordData.getPlayInOutTime()) != null && (num = (Integer) playInOutTime.second) != null) {
                jIntValue = ((long) num.intValue()) * 1000;
            } else {
                jIntValue = 0;
            }
            if (jIntValue > 0) {
                c13da.put("video_duration_ms", Long.valueOf(jIntValue));
                c13da.put("frame_position_ratio", Double.valueOf(((double) c1457070o1J.LJ) / jIntValue));
            }
            if (interfaceC20175613ww instanceof C20177213xC) {
                c13da.put("image_file_mode", Boolean.TRUE);
                c13da.put("is_image_mode", Boolean.valueOf(C1428470nHB.LJJZZI(c1457070o1J.LIZ)));
                c13da.put("is_photo_canvas", Boolean.valueOf(C1428470nHB.LJLJLJ(c1457070o1J.LIZ)));
                if (c1457070o1J.LJIILJJIL == null && c1457070o1J.LJIIZILJ == null) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                c13da.put("image_processing_required", Boolean.valueOf(z7));
            } else if (interfaceC20175613ww instanceof C20179313xX) {
                c13da.put("smart_cover_enabled", Boolean.TRUE);
                Integer num2 = c1457070o1J.LJIIL;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 7;
                }
                c13da.put("smart_cover_count", Integer.valueOf(iIntValue));
            } else if (interfaceC20175613ww instanceof C20176713x7) {
                c13da.put("mv_cover_mode", Boolean.TRUE);
                c13da.put("get_cover_without_seek", Boolean.valueOf(c1457070o1J.LJIILIIL));
                if (c1457070o1J.LIZIZ != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c13da.put("ve_editor_available", Boolean.valueOf(z3));
            } else if (interfaceC20175613ww instanceof C20176213x2) {
                c13da.put("veutils_combined_mode", Boolean.TRUE);
                c13da.put("about_effect", Boolean.valueOf(c1457070o1J.LJIILL));
                if (!c1457070o1J.LJIILL && c1457070o1J.LIZ.getCurMultiEditVideoRecordData() != null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    str = "video_file";
                } else {
                    str = "record_data";
                }
                c13da.put("veutils_submode", str);
                MultiEditVideoRecordData curMultiEditVideoRecordData2 = c1457070o1J.LIZ.getCurMultiEditVideoRecordData();
                if (curMultiEditVideoRecordData2 != null) {
                    vERecordDataLIZJ = C574800MgY.LIZJ(curMultiEditVideoRecordData2);
                } else {
                    vERecordDataLIZJ = null;
                }
                if (vERecordDataLIZJ != null && (!vERecordDataLIZJ.getSegmentData().isEmpty())) {
                    try {
                        c13da.put("is_image_mode", Boolean.valueOf(C2471909mP.LJJIII(((VERecordData.VERecordSegmentData) ListProtector.get(vERecordDataLIZJ.getSegmentData(), 0)).mVideo, true, 4)));
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        c13da.put("image_type_check_error", e3.getMessage());
                    }
                }
            }
            if (c1457070o1J.LJIILJJIL != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            c13da.put("has_converter", Boolean.valueOf(z4));
            if (c1457070o1J.LJIIZILJ != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            c13da.put("has_effect_text", Boolean.valueOf(z5));
            String str3 = c1457070o1J.LIZLLL;
            if (str3 != null && str3.length() != 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            c13da.put("save_to_file", Boolean.valueOf(!z6));
            c13da.put("from_draft_list", Boolean.valueOf(c1457070o1J.LJIILLIIL));
        }
        if (enumC19364310pN == EnumC19364310pN.DEBUG) {
            LIZ.getClass();
            Thread threadU3 = C786410Ut5.u3();
            c13da.put("thread_name", threadU3.getName());
            c13da.put("thread_id", Long.valueOf(threadU3.getId()));
            c13da.put("thread_priority", Integer.valueOf(threadU3.getPriority()));
            c13da.put("is_daemon", Boolean.valueOf(threadU3.isDaemon()));
            Runtime runtime = Runtime.getRuntime();
            long j3 = runtime.totalMemory();
            long jFreeMemory = runtime.freeMemory();
            long jMaxMemory = runtime.maxMemory();
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            memoryInfo.totalMem = j3;
            long j4 = jFreeMemory + (jMaxMemory - j3);
            memoryInfo.availMem = j4;
            long j5 = (long) (jMaxMemory * 0.1d);
            memoryInfo.threshold = j5;
            if (j4 >= j5) {
                z8 = false;
            }
            memoryInfo.lowMemory = z8;
            c13da.put("memory_available_mb", Double.valueOf(j4 / 1048576.0d));
            c13da.put("memory_total_mb", Double.valueOf(memoryInfo.totalMem / 1048576.0d));
            c13da.put("memory_threshold_mb", Double.valueOf(memoryInfo.threshold / 1048576.0d));
            c13da.put("memory_low_memory", Boolean.valueOf(memoryInfo.lowMemory));
            c13da.put("process_pid", Integer.valueOf(Process.myPid()));
            c13da.put("process_uid", Integer.valueOf(Process.myUid()));
            c13da.put("system_time_ms", Long.valueOf(System.currentTimeMillis()));
            c13da.put("uptime_ms", Long.valueOf(SystemClock.uptimeMillis()));
            c13da.put("elapsed_realtime_ms", Long.valueOf(SystemClock.elapsedRealtime()));
            String str4 = "Default";
            if (!a0.LJJIIZI(threadU3.getName(), "Default", false)) {
                str4 = "IO";
                if (!a0.LJJIIZI(threadU3.getName(), "IO", false)) {
                    str4 = "Main";
                    if (!a0.LJJIIZI(threadU3.getName(), "Main", false)) {
                        str4 = "Unknown";
                    }
                }
            }
            c13da.put("current_dispatcher", str4);
        }
        return c13da.build();
    }
}
