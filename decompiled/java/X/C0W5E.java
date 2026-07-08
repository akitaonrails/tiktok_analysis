package X;

import Y.AComparatorS32S0000000_13;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.DraftOperationCode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.DraftOperationLog;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.LocalDraftLog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.service.IMPerformanceService;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.wallpaper.IWallpaperServiceApi;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0W5E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W5E implements IRuntimeBehaviorService {
    public static final C0W5E LIZ = C0W5H.LIZ;
    public static final List<C0W5G> LIZIZ = C1697810uHb.LJIIJJI(new C0W5G() { // from class: X.0VXt
        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_download";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL();
            C0W5E.LIZ.getClass();
            List listLJ = C0W5E.LJ(jCurrentTimeMillis, "download_start");
            List listLJ2 = C0W5E.LJ(jCurrentTimeMillis, "download_cancel");
            List listLJ3 = C0W5E.LJ(jCurrentTimeMillis, "download_success");
            List<C0VLB> listLJ4 = C0W5E.LJ(jCurrentTimeMillis, "download_error");
            List listLJ5 = C0W5E.LJ(jCurrentTimeMillis, "water_mark_start");
            List listLJ6 = C0W5E.LJ(jCurrentTimeMillis, "water_mark_cancel");
            List listLJ7 = C0W5E.LJ(jCurrentTimeMillis, "water_mark_success");
            List listLJ8 = C0W5E.LJ(jCurrentTimeMillis, "water_mark_error");
            StringBuilder sb = new StringBuilder();
            if (!listLJ.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DownloadTimes: ");
                sbLIZ.append(listLJ.size());
                sbLIZ.append(';');
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!listLJ2.isEmpty()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DownloadCancel: ");
                sbLIZ2.append(listLJ2.size());
                sbLIZ2.append(';');
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (!listLJ3.isEmpty()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("DownloadSuccess: ");
                sbLIZ3.append(listLJ3.size());
                sbLIZ3.append(';');
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (!listLJ4.isEmpty()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("DownloadError: ");
                sbLIZ4.append(listLJ4.size());
                sbLIZ4.append("(ECode:");
                sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                boolean z = true;
                for (C0VLB c0vlb : listLJ4) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(c0vlb.LIZLLL);
                    z = false;
                }
                sb.append(");");
            }
            if (!listLJ5.isEmpty()) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("WatermarkTimes: ");
                sbLIZ5.append(listLJ5.size());
                sbLIZ5.append(';');
                sb.append(C2188811AlT.LIZIZ(sbLIZ5));
            }
            if (!listLJ6.isEmpty()) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("WatermarkCancel: ");
                sbLIZ6.append(listLJ6.size());
                sbLIZ6.append(';');
                sb.append(C2188811AlT.LIZIZ(sbLIZ6));
            }
            if (!listLJ7.isEmpty()) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("WatermarkSuccess: ");
                sbLIZ7.append(listLJ7.size());
                sbLIZ7.append(';');
                sb.append(C2188811AlT.LIZIZ(sbLIZ7));
            }
            if (!listLJ8.isEmpty()) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("WatermarkError: ");
                sbLIZ8.append(listLJ8.size());
                sbLIZ8.append(';');
                sb.append(C2188811AlT.LIZIZ(sbLIZ8));
            }
            return sb.toString();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            switch (str.hashCode()) {
                case -1826452220:
                    if (!str.equals("water_mark_cancel")) {
                        return false;
                    }
                    return true;
                case -210589876:
                    if (!str.equals("download_success")) {
                        return false;
                    }
                    return true;
                case 71186961:
                    if (!str.equals("download_cancel")) {
                        return false;
                    }
                    return true;
                case 974485393:
                    if (!str.equals("download_error")) {
                        return false;
                    }
                    return true;
                case 987458027:
                    if (!str.equals("download_start")) {
                        return false;
                    }
                    return true;
                case 1051818558:
                    if (!str.equals("water_mark_error")) {
                        return false;
                    }
                    return true;
                case 1064791192:
                    if (!str.equals("water_mark_start")) {
                        return false;
                    }
                    return true;
                case 1092137657:
                    if (!str.equals("water_mark_success")) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }
    }, new C0W5R() { // from class: X.0W5N
        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_record";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            return GsonProtectorUtils.toJson(((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson(), LJ());
        }
    }, new C0W5R() { // from class: X.0W5Q
        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_read_record";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            String strLIZIZ;
            List<AwemeToolFeedbackInfo> listLJ = LJ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
            for (AwemeToolFeedbackInfo awemeToolFeedbackInfo : (ArrayList) listLJ) {
                String string = "";
                if (!awemeToolFeedbackInfo.eCode.isEmpty()) {
                    StringBuilder sb = new StringBuilder(e3.h);
                    List<AwemeToolFeedbackECode> list = awemeToolFeedbackInfo.eCode;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (AwemeToolFeedbackECode awemeToolFeedbackECode : list) {
                        String str = awemeToolFeedbackECode.stage;
                        if (str == null || str.length() == 0) {
                            strLIZIZ = "";
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(awemeToolFeedbackECode.stage);
                            sbLIZ.append(':');
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(awemeToolFeedbackECode.code);
                        arrayList2.add(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    Iterator it2 = arrayList2.iterator();
                    if (!it2.hasNext()) {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append((String) next);
                        sbLIZ3.append(';');
                        sbLIZ3.append(str2);
                        next = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    sb.append((String) next);
                    sb.append(')');
                    string = sb.toString();
                }
                arrayList.add(e3.e + awemeToolFeedbackInfo.name + ':' + awemeToolFeedbackInfo.count + ' ' + awemeToolFeedbackInfo.successCount + "Success|" + awemeToolFeedbackInfo.cancelCount + "Cancel|" + awemeToolFeedbackInfo.eCode.size() + "Failed" + string + ']');
            }
            Iterator it3 = arrayList.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it3.next();
            while (it3.hasNext()) {
                String str3 = (String) it3.next();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append((String) next2);
                sbLIZ4.append(str3);
                next2 = C2188811AlT.LIZIZ(sbLIZ4);
            }
            return (String) next2;
        }
    }, new C0W5G() { // from class: X.0W5O
        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_im";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            String strLJ;
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL();
            C0W5E.LIZ.getClass();
            List listLJ = C0W5E.LJ(jCurrentTimeMillis, "message_send_fail");
            List listLJ2 = C0W5E.LJ(jCurrentTimeMillis, "message_self_visiable");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(listLJ);
            arrayList.addAll(listLJ2);
            if (arrayList.isEmpty()) {
                IMPerformanceService performanceService = C1336205Ku.LIZ(false).getPerformanceService();
                return (performanceService == null || (strLJ = performanceService.LJ()) == null) ? "" : strLJ;
            }
            StringBuilder sb = new StringBuilder(e3.e);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append(((C0VLB) ListProtector.get(arrayList, i)).LIZLLL);
                if (i != arrayList.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append(e3.f);
            return sb.toString();
        }

        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            if (!Intrinsics.LJFF(str, "message_send_fail") && !Intrinsics.LJFF(str, "message_self_visiable")) {
                return false;
            }
            return true;
        }
    }, new C0W5G() { // from class: X.0VXj
        public final String LIZ = "follow_user";
        public final String LIZIZ = "unfollow_user";

        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_follow";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL();
            C0W5E c0w5e = C0W5E.LIZ;
            String str = this.LIZ;
            c0w5e.getClass();
            List<C0VLB> listLJ = C0W5E.LJ(jCurrentTimeMillis, str);
            List<C0VLB> listLJ2 = C0W5E.LJ(jCurrentTimeMillis, this.LIZIZ);
            StringBuilder sb = new StringBuilder();
            if (!listLJ.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FollowError: ");
                sbLIZ.append(listLJ.size());
                sbLIZ.append("(ECode:");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                for (C0VLB c0vlb : listLJ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c0vlb.LIZLLL);
                    sbLIZ2.append(',');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append(");");
            }
            if (!listLJ2.isEmpty()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("UnFollowError: ");
                sbLIZ3.append(listLJ2.size());
                sbLIZ3.append("(ECode:");
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                for (C0VLB c0vlb2 : listLJ2) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(c0vlb2.LIZLLL);
                    sbLIZ4.append(',');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append(");");
            }
            return sb.toString();
        }

        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            if (!Intrinsics.LJFF(str, this.LIZ) && !Intrinsics.LJFF(str, this.LIZIZ)) {
                return false;
            }
            return true;
        }
    }, new C0W5G() { // from class: X.0VXk
        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_player";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() throws JSONException {
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL();
            C0W5E.LIZ.getClass();
            List listLJ = C0W5E.LJ(jCurrentTimeMillis, "block");
            List<C0VLB> listLJ2 = C0W5E.LJ(jCurrentTimeMillis, "error");
            JSONObject jSONObject = new JSONObject();
            if (!listLJ.isEmpty()) {
                jSONObject.put("block_count", listLJ.size());
            }
            if (!listLJ2.isEmpty()) {
                jSONObject.put("error_count", listLJ2.size());
                JSONArray jSONArray = new JSONArray();
                for (C0VLB c0vlb : listLJ2) {
                    if (c0vlb != null) {
                        jSONArray.put(new JSONObject(c0vlb.LIZLLL));
                    }
                }
                jSONObject.put("error_code_msg", jSONArray);
            }
            return C786410Ut5.J3(jSONObject);
        }

        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            if (!Intrinsics.LJFF(str, "block") && !Intrinsics.LJFF(str, "error")) {
                return false;
            }
            return true;
        }
    }, new AbstractC830550Wi5() { // from class: X.0Wi7
        public int LIZ = -1;

        @Override // X.C0W5G
        public final String LIZJ() {
            return "publish_log";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            List arrayList;
            String strLIZIZ;
            String strLIZIZ2;
            if (this.LIZ <= 0) {
                SettingsManager.LIZLLL().getClass();
                this.LIZ = SettingsManager.LJ("publish_log_max_length", 500);
            }
            if (this.LIZ <= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Null maxTextLength:");
                sbLIZ.append(this.LIZ);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            C830560Wi6 c830560Wi6LJI = LJI();
            List<C830610WiB> list = c830560Wi6LJI.LIZ;
            List listLLD = C13LP.LLD(4, C13LP.LJLIL(c830560Wi6LJI.LIZLLL, c830560Wi6LJI.LIZJ));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLLD, 10));
            int i = 0;
            for (Object obj : listLLD) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C830610WiB c830610WiB = (C830610WiB) obj;
                Iterator<PublishBehaviorModel> it2 = c830610WiB.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().idIndex = i;
                }
                arrayList2.add(c830610WiB);
                i = i2;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(((C830610WiB) it3.next()).LIZ, arrayList3);
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            if (this.LIZ > 500) {
                arrayList = new ArrayList();
                Iterator<C830610WiB> it4 = list.iterator();
                while (it4.hasNext()) {
                    C19719612Di.LJJI(it4.next().LIZ, arrayList);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            arrayList4.addAll(arrayList);
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS32S0000000_13(33), arrayList4);
            ArrayList<String> arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
            Iterator it5 = listLJLLLL.iterator();
            while (true) {
                strLIZIZ = "";
                if (!it5.hasNext()) {
                    break;
                }
                PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) it5.next();
                if (a0.LJJJIL(publishBehaviorModel.code)) {
                    strLIZIZ2 = "";
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(' ');
                    sbLIZ2.append(publishBehaviorModel.code);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (!a0.LJJJIL(publishBehaviorModel.info)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(' ');
                    sbLIZ3.append(publishBehaviorModel.info);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(publishBehaviorModel.getSimpleTime());
                sbLIZ4.append(' ');
                sbLIZ4.append(publishBehaviorModel.idIndex);
                sbLIZ4.append(' ');
                sbLIZ4.append(publishBehaviorModel.stage);
                sbLIZ4.append(' ');
                sbLIZ4.append(publishBehaviorModel.type.getSimpleName());
                sbLIZ4.append(strLIZIZ2);
                sbLIZ4.append(strLIZIZ);
                arrayList5.add(C2188811AlT.LIZIZ(sbLIZ4));
            }
            for (String str : arrayList5) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ);
                sbLIZ5.append('|');
                sbLIZ5.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            }
            return C13LN.LJZL(this.LIZ, strLIZIZ);
        }
    }, new AbstractC830550Wi5() { // from class: X.0Wi9
        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_publish";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            IAVPublishService iAVPublishServicePublishService;
            String str;
            String strLIZIZ;
            List<C830610WiB> listLJLLLL = C13LP.LJLLLL(new AComparatorS32S0000000_13(34), LJFF());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = null;
            for (C830610WiB c830610WiB : listLJLLLL) {
                AbstractC830620WiC abstractC830620WiC = c830610WiB.LJI;
                if (arrayList2 != null) {
                    C830610WiB c830610WiB2 = (C830610WiB) C13LP.LJJJLL(arrayList2);
                    if (c830610WiB2 != null) {
                        AbstractC830620WiC abstractC830620WiC2 = c830610WiB2.LJI;
                        if (abstractC830620WiC2 == null || !(Intrinsics.LJFF(abstractC830620WiC, abstractC830620WiC2) || Intrinsics.LJFF(abstractC830620WiC.LIZ, abstractC830620WiC2.LIZ))) {
                            if (arrayList2 != null) {
                            }
                        } else if (arrayList2 != null) {
                            arrayList2.add(c830610WiB);
                        }
                    }
                    arrayList.add(arrayList2);
                }
                arrayList2 = new ArrayList();
                arrayList2.add(c830610WiB);
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
            ArrayList<String> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (true) {
                String strLIZIZ2 = "";
                if (!it2.hasNext()) {
                    for (String str2 : arrayList3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ2);
                        sbLIZ.append('|');
                        sbLIZ.append(str2);
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                    if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null && iAVPublishServicePublishService.isPublishing()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("|1Failed(DF:LOST)|");
                        sbLIZ2.append(strLIZIZ2);
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    return strLIZIZ2.length() != 0 ? "null" : strLIZIZ2;
                }
                List<C830610WiB> list = (List) it2.next();
                if (((C830610WiB) ListProtector.get(list, 0)).LJI instanceof AbstractC830630WiD) {
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (C830610WiB c830610WiB3 : list) {
                        AbstractC830620WiC abstractC830620WiC3 = c830610WiB3.LJI;
                        if (abstractC830620WiC3 instanceof C830640WiE) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(((C830640WiE) c830610WiB3.LJI).LIZJ);
                            sbLIZ3.append(':');
                            sbLIZ3.append(((C830640WiE) c830610WiB3.LJI).LIZIZ);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        } else if (abstractC830620WiC3 instanceof C830660WiG) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(((C830660WiG) c830610WiB3.LJI).LIZIZ);
                            sbLIZ4.append(":Lost");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                        } else {
                            strLIZIZ = abstractC830620WiC3 instanceof C830650WiF ? ((C830650WiF) abstractC830620WiC3).LIZIZ : "";
                        }
                        arrayList4.add(strLIZIZ);
                    }
                    Iterator it3 = arrayList4.iterator();
                    if (!it3.hasNext()) {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                    Object next = it3.next();
                    while (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append((String) next);
                        sbLIZ5.append(';');
                        sbLIZ5.append(str3);
                        next = C2188811AlT.LIZIZ(sbLIZ5);
                    }
                    str = (String) next;
                } else {
                    str = "";
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(list.size());
                sbLIZ6.append(((C830610WiB) ListProtector.get(list, 0)).LJI.LIZ);
                if (str.length() > 0) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append('(');
                    sbLIZ7.append(str);
                    sbLIZ7.append(')');
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                }
                sbLIZ6.append(strLIZIZ2);
                arrayList3.add(C2188811AlT.LIZIZ(sbLIZ6));
            }
        }
    }, new AbstractC830550Wi5() { // from class: X.0WiA
        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_upload";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            AwemeToolFeedbackECode awemeToolFeedbackECode;
            ArrayList arrayList = (ArrayList) LJFF();
            if (arrayList.isEmpty()) {
                return "";
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (Intrinsics.LJFF(((C830610WiB) obj).LJI, C830670WiH.LIZIZ)) {
                    arrayList2.add(obj);
                }
            }
            int size2 = arrayList2.size();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.LJFF(((C830610WiB) obj2).LJI, C830680WiI.LIZIZ)) {
                    arrayList3.add(obj2);
                }
            }
            int size3 = arrayList3.size();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((C830610WiB) obj3).LJI instanceof AbstractC830630WiD) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                AbstractC830630WiD abstractC830630WiD = (AbstractC830630WiD) ((C830610WiB) it2.next()).LJI;
                if (abstractC830630WiD instanceof C830640WiE) {
                    C830640WiE c830640WiE = (C830640WiE) abstractC830630WiD;
                    awemeToolFeedbackECode = new AwemeToolFeedbackECode(c830640WiE.LIZIZ, c830640WiE.LIZJ);
                } else if (abstractC830630WiD instanceof C830660WiG) {
                    awemeToolFeedbackECode = new AwemeToolFeedbackECode("LO", ((C830660WiG) abstractC830630WiD).LIZIZ);
                } else {
                    if (!(abstractC830630WiD instanceof C830650WiF)) {
                        throw new C1954807lC();
                    }
                    awemeToolFeedbackECode = new AwemeToolFeedbackECode(((C830650WiF) abstractC830630WiD).LIZIZ, "EX");
                }
                arrayList5.add(awemeToolFeedbackECode);
            }
            return C08JS.LIZLLL(Collections.singletonList(new AwemeToolFeedbackInfo("Publish", size, size2, size3, arrayList5)));
        }
    }, new C0W5G() { // from class: X.0W5d
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "published_vids";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            return C13LP.LJJLIIIJ(((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getLastPublishedVids(), ",", e3.e, e3.f, 0, null, null, 56);
        }
    }, new C0W5G() { // from class: X.0W5e
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "publisher_event";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getPublisherEventAsJSON();
        }
    }, new C0W5G() { // from class: X.0VXm
        @Override // X.C0W5G
        public final String LIZJ() {
            return "abor_draft_operation";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL();
            C0W5E.LIZ.getClass();
            List listLJ = C0W5E.LJ(jCurrentTimeMillis, "draft_load_success");
            List listLJ2 = C0W5E.LJ(jCurrentTimeMillis, "draft_load_error");
            List listLJ3 = C0W5E.LJ(jCurrentTimeMillis, "draft_save_success");
            List listLJ4 = C0W5E.LJ(jCurrentTimeMillis, "draft_save_error");
            List listLJ5 = C0W5E.LJ(jCurrentTimeMillis, "draft_delete_success");
            List listLJ6 = C0W5E.LJ(jCurrentTimeMillis, "draft_delete_error");
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = listLJ2.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(new DraftOperationCode(((C0VLB) it2.next()).LIZLLL));
            }
            arrayList.add(new DraftOperationLog("draft_load", linkedHashSet.size() + listLJ.size(), C13LP.LLIIII(linkedHashSet), listLJ.size()));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = listLJ4.iterator();
            while (it3.hasNext()) {
                linkedHashSet2.add(new DraftOperationCode(((C0VLB) it3.next()).LIZLLL));
            }
            arrayList.add(new DraftOperationLog("draft_save", listLJ3.size() + linkedHashSet2.size(), C13LP.LLIIII(linkedHashSet2), listLJ3.size()));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            Iterator it4 = listLJ6.iterator();
            while (it4.hasNext()) {
                linkedHashSet3.add(new DraftOperationCode(((C0VLB) it4.next()).LIZLLL));
            }
            arrayList.add(new DraftOperationLog("draft_delete", listLJ5.size() + linkedHashSet3.size(), C13LP.LLIIII(linkedHashSet3), listLJ5.size()));
            return GsonProtectorUtils.toJson(((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson(), arrayList);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            switch (str.hashCode()) {
                case -2112523571:
                    if (!str.equals("draft_load_error")) {
                        return false;
                    }
                    return true;
                case -1144329134:
                    if (!str.equals("draft_delete_error")) {
                        return false;
                    }
                    return true;
                case -826777052:
                    if (!str.equals("draft_save_error")) {
                        return false;
                    }
                    return true;
                case -576852019:
                    if (!str.equals("draft_delete_success")) {
                        return false;
                    }
                    return true;
                case -351979233:
                    if (!str.equals("draft_save_success")) {
                        return false;
                    }
                    return true;
                case 996197256:
                    if (!str.equals("draft_load_success")) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }
    }, new C0W5G() { // from class: X.0Whm
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "abor_draft_local_info";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            IAVDraftService iAVDraftServiceDraftService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService();
            int i = iAVDraftServiceDraftService.queryDraftsInfo(new C0M4M(true, true, (EnumC562220M3g) null, (C562260M3k) null, 28)).LIZ;
            List<Integer> listQueryUserDraftCounts = iAVDraftServiceDraftService.getFeedbackService().queryUserDraftCounts(false);
            int iLJZI = C13LP.LJZI(listQueryUserDraftCounts) + i;
            C0VSJ c0vsj = new C0VSJ(iAVDraftServiceDraftService.getFeedbackService().getReadableDBPath());
            String strLJ = (c0vsj.exists() && c0vsj.isFile()) ? LJ(c0vsj.lastModified()) : LJ(-1L);
            String dBCreationTime = iAVDraftServiceDraftService.getFeedbackService().getDBCreationTime();
            String string = "Unknown";
            if (dBCreationTime == null || dBCreationTime.length() == 0) {
                if (c0vsj.exists() && c0vsj.isFile()) {
                    dBCreationTime = LJ(Build.VERSION.SDK_INT >= 26 ? Files.readAttributes(c0vsj.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis() : -1L);
                } else {
                    dBCreationTime = "Unknown";
                }
            }
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            String str = null;
            long jLLFF = C2204961BRm.LLFF(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpvM3TF7yTP0mxrqGt0HLJSD7Fx5v0icKXi5USntUh8IH9e8R7q3lreH1opDMI/kSM4wWrXNhg==", null)) * C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpvM3TF7yTP0mxrqGt0HLJSD7Fx5v0icKXi5USntUh8IH9e8R7q3lreH1opDMI/kSM4wWrXNhg==", null));
            if (jLLFF >= 0) {
                if (jLLFF >= 1024) {
                    long j = 1024;
                    jLLFF /= j;
                    if (jLLFF >= 1024) {
                        jLLFF /= j;
                        str = "MB";
                    } else {
                        str = "KB";
                    }
                }
                StringBuilder sb = new StringBuilder(String.valueOf(jLLFF));
                int length = sb.length();
                while (true) {
                    length -= 3;
                    if (length <= 0) {
                        break;
                    }
                    sb.insert(length, ',');
                }
                if (str != null) {
                    sb.append(str);
                }
                string = sb.toString();
            }
            return GsonProtectorUtils.toJson(((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson(), new LocalDraftLog("draft_count", dBCreationTime, strLJ, i, iLJZI, listQueryUserDraftCounts, string));
        }

        public static String LJ(long j) {
            if (j <= 0) {
                return "Unknown";
            }
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTimeInMillis(j);
            return DateFormat.format("yyyy-MM-dd hh:mm:ss a", calendar).toString();
        }
    }, new C0W5G() { // from class: X.0Wdr
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "draft_db_event";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().getFeedbackService().getDBEventAsJSON();
        }
    }, new C0W5G() { // from class: X.0VXg
        @Override // X.C0W5G
        public final String LIZJ() {
            return "recharge";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL();
            C0W5E.LIZ.getClass();
            List listLJ = C0W5E.LJ(jCurrentTimeMillis, "recharge_fail");
            List listSubList = C13LP.LJLLLL(new AComparatorS32S0000000_13(30), new ArrayList(listLJ)).subList(0, Math.min(listLJ.size(), 10));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recharge_fail_list: [");
            sbLIZ.append(C13LP.LJJLIIIJ(listSubList, null, null, null, 0, null, AFwS247S0000000_13.get$arr$(58), 31));
            sbLIZ.append(']');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return Intrinsics.LJFF(str, "recharge_fail");
        }
    }, new C0W5G() { // from class: X.0VXh
        @Override // X.C0W5G
        public final String LIZJ() {
            return "iap_recharge";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            Object next;
            String str;
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL();
            C0W5E.LIZ.getClass();
            Iterator it2 = new ArrayList(C0W5E.LJ(jCurrentTimeMillis, "iap_recharge")).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long j = ((C0VLB) next).LIZJ;
                    do {
                        Object next2 = it2.next();
                        long j2 = ((C0VLB) next2).LIZJ;
                        if (j < j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            C0VLB c0vlb = (C0VLB) next;
            return (c0vlb == null || (str = c0vlb.LIZLLL) == null) ? "" : str;
        }

        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return Intrinsics.LJFF(str, "iap_recharge");
        }
    }, new C0W5G() { // from class: X.0W5Y
        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_wallpaper";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            C2413209cw.LIZ.getClass();
            IWallpaperServiceApi iWallpaperServiceApiLIZ = C2413209cw.LIZ();
            return (iWallpaperServiceApiLIZ == null || !iWallpaperServiceApiLIZ.LIZIZ()) ? C786410Ut5.J3(new JSONObject().put("is_wallpaper_block_device", 1)) : "";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            if (!Intrinsics.LJFF(str, "wallpaper_set_error") && !Intrinsics.LJFF(str, "wallpaper_set_success")) {
                return false;
            }
            return true;
        }
    }, new C0W5G() { // from class: X.0W5f
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "screen_size";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            int iLJ = C1389340mG4.LJ();
            int iLIZLLL = C1389340mG4.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iLJ);
            sbLIZ.append('*');
            sbLIZ.append(iLIZLLL);
            sbLIZ.append("(dp)");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }, new C0W5G() { // from class: X.0Wdi
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "tablet_info";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            return C19252910Tv.LIZIZ.LIZLLL().LJIIJ().LIZIZ();
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0X4V
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "abnor_traffic";
        }

        @Override // X.C0W5G
        public final String LIZIZ() throws JSONException {
            if (!((Boolean) C308260C6m.LJ.getValue()).booleanValue()) {
                return "";
            }
            long jLongValue = C0X4T.LIZIZ.getFirst().longValue();
            long jLongValue2 = C0X4T.LIZIZ.getSecond().longValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total_bytes", (C0X4T.LIZJ - jLongValue) - jLongValue2);
            jSONObject.put("mobile_bytes", C0X4T.LJ - jLongValue2);
            jSONObject.put("foreground_bytes", C0X4T.LJI);
            jSONObject.put("background_bytes", C0X4T.LJIIIIZZ);
            jSONObject.put("history_total_bytes", C0X4T.LIZJ);
            jSONObject.put("history_mobile_bytes", C0X4T.LJ);
            jSONObject.put("ttnet_bytes", C0X4T.LJIILJJIL);
            jSONObject.put("okhttp_bytes", C0X4T.LJIILLIIL);
            jSONObject.put("url_connection_bytes", C0X4T.LJIJ);
            jSONObject.put("ttnet_image_bytes", C0X4T.LJIL);
            jSONObject.put("ttnet_stream_bytes", C0X4T.LJJI);
            jSONObject.put("web_socket_bytes", C0X4T.LJJII);
            jSONObject.put("video_play_bytes", C0X4T.LJJIIJ);
            jSONObject.put("video_preload_bytes", C0X4T.LJJIIZ);
            jSONObject.put("live_bytes", C0X4T.LJJIJ);
            jSONObject.put("gecko_bytes", C0X4T.LJJIJIIJIL);
            return C786410Ut5.J3(jSONObject);
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0Vgb
        public final String LIZ = "used_abmock";

        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return true;
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            return GsonProtectorUtils.toJson(C08JS.LIZIZ(), C308170C6d.LIZ());
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return this.LIZ;
        }
    }, new C0W5G() { // from class: X.0Why
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "photomode_extra_info";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            return C1EE2.LIZIZ.LJJIL().LIZJ();
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0WAB
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "launch_on_mute";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            try {
                IOpenOnMuteSpi iOpenOnMuteSpiLJIJI = OpenOnMuteImpl.LJIJI();
                return "[setting_state=" + iOpenOnMuteSpiLJIJI.LJIILLIIL() + ",temp_state=" + iOpenOnMuteSpiLJIJI.LJIIJJI() + ",openOnMuteByBusinessState=" + iOpenOnMuteSpiLJIJI.LJFF() + e3.f;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0W5T
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "fyp_auto_scroll";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            try {
                FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
                return "[isOpen=" + fypAutoScrollService.LJIILL() + ",state=" + fypAutoScrollService.LJI() + ",login=" + C0XQ7.LJFF().isLogin() + e3.f;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0W5P
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return true;
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            String strLIZJ;
            IMPerformanceService performanceService = C1336205Ku.LIZ(false).getPerformanceService();
            return (performanceService == null || (strLIZJ = performanceService.LIZJ()) == null) ? "" : strLIZJ;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "im_related_info";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0W5l
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "offline_mode";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            try {
                C1EE1 c1ee1 = C1EE1.LIZIZ;
                boolean zLJJIZ = c1ee1.LJJIZ();
                int iLJJIJIIJIL = c1ee1.LJJIJIIJIL();
                int iLJIL = c1ee1.LJIL();
                return "[showEntrance=" + zLJJIZ + ",offlineKeySettingsValue=" + c1ee1.getSettingsValue() + ",isPlayerV3Enable=" + (C0C64.LJIILLIIL().LJIJ(31744, 1, "player_preload_v3", true) == 1) + ",storageSpace=" + C0WYJ.LJI() + ",downloadState=" + iLJIL + ",endDownReason=" + iLJJIJIIJIL + ",login=" + C0XQ7.LJFF().isLogin() + e3.f;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0W5F
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return true;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "inbox_count_info";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            return C19212010Ec.LIZJ.LL();
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0Wqe
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return true;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "streak_feedback_info";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            IStreakService.LJJIIZ.getClass();
            return C06LY.LIZ().A();
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0SrV
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "clean_mode_manager";
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
            Boolean boolValueOf = c1576740r8KLIZ != null ? Boolean.valueOf(c1576740r8KLIZ.LIZ) : null;
            C1576740r8K c1576740r8KLIZ2 = C690440R6k.LIZ();
            Boolean boolValueOf2 = c1576740r8KLIZ2 != null ? Boolean.valueOf(c1576740r8KLIZ2.LIZIZ) : null;
            C1576740r8K c1576740r8KLIZ3 = C690440R6k.LIZ();
            Boolean boolValueOf3 = c1576740r8KLIZ3 != null ? Boolean.valueOf(c1576740r8KLIZ3.LIZJ) : null;
            C1576740r8K c1576740r8KLIZ4 = C690440R6k.LIZ();
            return "[isEnable=" + boolValueOf + ",isFollowEnable=" + boolValueOf2 + ",isFriendsEnable=" + boolValueOf3 + ",isRecommendEnable=" + (c1576740r8KLIZ4 != null ? Boolean.valueOf(c1576740r8KLIZ4.LIZLLL) : null) + e3.f;
        }
    }, new C0W5G() { // from class: X.0SrT
        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return true;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "feed_digg_info";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            JSONObject jSONObject;
            C734440SrS.LIZ.getClass();
            if (!C283810BAl.LIZ() || (jSONObject = C734440SrS.LIZLLL) == null) {
                return "";
            }
            String strValueOf = String.valueOf(jSONObject);
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) C734440SrS.LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getErrorInfo: ");
            sbLIZ.append(strValueOf);
            abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return strValueOf;
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    }, new C0W5G() { // from class: X.0W5X
        public final C01GW LIZ = C452501pT.LIZIZ(new C0W5W());

        @Override // X.C0W5G
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.C0W5G
        public final String LIZJ() {
            return "background_play";
        }

        @Override // X.C0W5G
        public final String LIZIZ() {
            try {
                return "[isKevaOpen=" + ((Keva) this.LIZ.getValue()).getBoolean("long_term_bg_play_enable", false) + ",isExpEnable=" + C2281231EQv.LIZIZ.LJIILL() + e3.f;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }

        @Override // X.C0W5G
        public final long LIZLLL() {
            return TimeUnit.HOURS.toMillis(2L);
        }
    });

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final Map<String, String> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C0W5G c0w5g : LIZIZ) {
            String strLIZIZ = c0w5g.LIZIZ();
            if (!TextUtils.isEmpty(strLIZIZ)) {
                linkedHashMap.put(c0w5g.LIZJ(), strLIZIZ);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RuntimeBehaviorManager loadResultSize:");
        sbLIZ.append(linkedHashMap.size());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final boolean LIZLLL() {
        try {
            return C0CLW.LIZIZ.LIZ.getFeedbackRecordEnable().booleanValue();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void LIZ(String str) {
        event(str, "");
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void LIZJ(C19EG c19eg) {
        boolean zLJI = MethodIDManager.LJI(202486);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_inapp_push", true, false)) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            PopupManager.LJIJI(new C1893750zNd(c19eg), true);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public static List LJ(long j, String str) {
        return C799440VXq.LIZIZ.LIZ.LIZ().LIZJ(j, str);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void event(final String str, final String str2) {
        if (!LIZLLL()) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        for (final C0W5G c0w5g : LIZIZ) {
            if (c0w5g.LIZ(str)) {
                C15O7.LIZIZ(new Callable() { // from class: X.0VXo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("RuntimeBehaviorManager@ad6d.event$1");
                        C0W5E c0w5e = this.LL;
                        String str3 = str;
                        String str4 = str2;
                        long j = jCurrentTimeMillis;
                        c0w5e.getClass();
                        C0VLB c0vlb = new C0VLB(str3, j, str4);
                        C799440VXq c799440VXq = C799440VXq.LIZIZ;
                        c799440VXq.LIZ.LIZ().LIZIZ(c0vlb);
                        C0W5E c0w5e2 = this.LL;
                        String str5 = str;
                        long jLIZLLL = jCurrentTimeMillis - c0w5g.LIZLLL();
                        c0w5e2.getClass();
                        c799440VXq.LIZ.LIZ().LIZ(jLIZLLL, str5);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("RuntimeBehaviorManager@ad6d.event$1");
                        return unit;
                    }
                }, C15O7.LJI, null);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" is not support type,please check your code or call zhaoxuan.li");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
