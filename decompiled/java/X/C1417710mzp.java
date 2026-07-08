package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417710mzp {
    public static final C1417710mzp LIZ = new C1417710mzp();

    public static String LIZJ(List list) {
        if (list != null && !list.isEmpty()) {
            boolean z = list instanceof Collection;
            if (z && list.isEmpty()) {
                return "videos";
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!((AutoCutMediaModel) it2.next()).isVideoType) {
                    if (z && list.isEmpty()) {
                        return "photos";
                    }
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (!(!((AutoCutMediaModel) it3.next()).isVideoType)) {
                            return "mix";
                        }
                    }
                    return "photos";
                }
            }
            return "videos";
        }
        return "empty";
    }

    public static final long LIZLLL(long j) {
        if (j < 0) {
            return -1L;
        }
        return System.currentTimeMillis() - j;
    }

    public static final C443120HZe<Integer, Integer, Integer> LJ(List<AutoCutMediaModel> list) {
        int size;
        int size2 = 0;
        if (list != null) {
            size = list.size();
            ArrayList arrayList = new ArrayList();
            for (AutoCutMediaModel autoCutMediaModel : list) {
                if (autoCutMediaModel.isVideoType) {
                    arrayList.add(autoCutMediaModel);
                }
            }
            size2 = arrayList.size();
        } else {
            size = 0;
        }
        return new C443120HZe<>(Integer.valueOf(size), Integer.valueOf(size - size2), Integer.valueOf(size2));
    }

    public static final C443120HZe<Integer, Integer, Integer> LJFF(List<? extends MediaModel> list) {
        int size;
        int size2 = 0;
        if (list != null) {
            size = list.size();
            ArrayList arrayList = new ArrayList();
            for (MediaModel mediaModel : list) {
                if (mediaModel.LJIILJJIL()) {
                    arrayList.add(mediaModel);
                }
            }
            size2 = arrayList.size();
        } else {
            size = 0;
        }
        return new C443120HZe<>(Integer.valueOf(size), Integer.valueOf(size - size2), Integer.valueOf(size2));
    }

    public static String LJI(MetaExt metaExt) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (metaExt.isVideo()) {
            str = "video";
        } else {
            str = "image";
        }
        sbLIZ.append(str);
        sbLIZ.append(" | ");
        sbLIZ.append(C2286708xd.LJIILL(metaExt.path));
        sbLIZ.append(" | ");
        sbLIZ.append(metaExt.path);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJII(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLEResType resourceType;
        NLEResType resourceType2;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_alog_autocut_nlemodel_detail", true, false)) {
            return "";
        }
        if (nLEModel == null) {
            return "AutoCutNLEModel is null";
        }
        StringBuilder sb = new StringBuilder("AutoCutNLEModel: ");
        NLETrack mainTrack = nLEModel.getMainTrack();
        String strLJJLIIIJ = null;
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                NLESegment mainSegment = it2.next().getMainSegment();
                if (mainSegment != null) {
                    arrayList.add(mainSegment);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                NLESegment nLESegment = (NLESegment) obj;
                NLEResourceNode resource = nLESegment.getResource();
                if (resource != null) {
                    resourceType = resource.getResourceType();
                } else {
                    resourceType = null;
                }
                if (resourceType != NLEResType.VIDEO) {
                    NLEResourceNode resource2 = nLESegment.getResource();
                    if (resource2 != null) {
                        resourceType2 = resource2.getResourceType();
                    } else {
                        resourceType2 = null;
                    }
                    if (resourceType2 == NLEResType.IMAGE) {
                    }
                }
                arrayList2.add(obj);
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, null, null, null, 0, null, AFwS234S0000000_5.get$arr$(414), 31);
        }
        sb.append(strLJJLIIIJ);
        return sb.toString();
    }

    public static final void LIZ(LogLevel logLevel, String str) {
        int i = C23170096a.LIZ[logLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AutoCutProcess ");
                        sbLIZ.append(str);
                        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AutoCutProcess ");
                    sbLIZ2.append(str);
                    C201955140j.LJIJI(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AutoCutProcess ");
                sbLIZ3.append(str);
                C201955140j.LJII(c1398350mUb3, C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            C1398350mUb c1398350mUb4 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("AutoCutProcess ");
            sbLIZ4.append(str);
            C201955140j.LIZJ(c1398350mUb4, C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        C1398350mUb c1398350mUb5 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("AutoCutProcess ");
        sbLIZ5.append(str);
        C201955140j.LJIILJJIL(c1398350mUb5, C2188811AlT.LIZIZ(sbLIZ5));
    }

    public static void LJJIZ(String str, Map map, boolean z) {
        int i;
        C543670LTx c543670LTx = new C543670LTx();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c543670LTx.LIZLLL((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        JSONObject jSONObjectLJ = c543670LTx.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI(str, i, jSONObjectLJ);
    }

    public static void LJIIIIZZ(String str, String str2, String str3, String str4) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("content_source", str3);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str4);
        C20684815ws.LJIILLIIL("tool_performance_aigt_rec_status", c0lab.LIZ);
    }

    public static final void LJIIL(int i, int i2, int i3, long j, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i3, "error_code");
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(i, "image_count");
        c0lab.LIZ(i2, "video_count");
        C20684815ws.LJIILLIIL("tool_performance_autocut_fetch_feature", c0lab.LIZ);
    }

    public static void LJIILIIL(String str, long j, String str2, String str3, String str4) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(0, "error_code");
        c0lab.LJ("error_msg", null);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("music_id", str2);
        c0lab.LJ("shoot_way", str3);
        c0lab.LJ("creation_id", str4);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c0lab.LJ("source", str);
        C20684815ws.LJIILLIIL("tool_performance_autocut_fetch_music", c0lab.LIZ);
    }

    public static void LJIILJJIL(int i, int i2, int i3, String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(i, "material_count");
        c0lab.LIZ(i2, "photo_count");
        c0lab.LIZ(i3, "video_count");
        c0lab.LJ("autocut_media_source", str2);
        c0lab.LJ("autocut_click_from", str3);
        C20684815ws.LJIILLIIL("tool_performance_autocut_media_info_error", c0lab.LIZ);
    }

    public static final void LJIJ(int i, String str, String str2, String str3, Integer num, String str4) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("autocut_click_from", str);
        c0lab.LJ(Scene.SCENE_SERVICE, str2);
        c0lab.LJ("reuse_music_type", str3);
        c0lab.LIZ(i, "autocut_style_order");
        c0lab.LJ("tt_template_id", str4);
        c0lab.LIZLLL(num, "tt_template_type");
        C20684815ws.LJIILLIIL("click_autocut_retry", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIJI(java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, java.lang.Integer r12) {
        /*
            java.lang.String r6 = "panel"
            java.lang.String r5 = "resource_id"
            r3 = 0
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)     // Catch: java.lang.Exception -> L23
            java.lang.String r4 = r1.getHost()     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "effect_platform"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto L1e
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r5)     // Catch: java.lang.Exception -> L20
            java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r6)     // Catch: java.lang.Exception -> L27
            goto L2b
        L1e:
            r1 = r3
            goto L2d
        L20:
            r0 = move-exception
            r2 = r3
            goto L28
        L23:
            r0 = move-exception
            r4 = r3
            r2 = r3
            goto L28
        L27:
            r0 = move-exception
        L28:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2b:
            r1 = r3
            r3 = r2
        L2d:
            X.0LAB r2 = new X.0LAB
            r2.<init>()
            java.lang.String r0 = "source"
            r2.LJ(r0, r7)
            r2.LJ(r5, r3)
            r2.LJ(r6, r1)
            java.lang.String r0 = "host"
            r2.LJ(r0, r4)
            java.lang.String r0 = "urs"
            r2.LJ(r0, r8)
            java.lang.String r0 = "error_code"
            r2.LIZ(r9, r0)
            java.lang.String r0 = "error_msg"
            r2.LJ(r0, r10)
            java.lang.String r0 = "autocut_template_type"
            r2.LIZLLL(r12, r0)
            java.lang.String r1 = "net_quality"
            int r0 = com.bytedance.ttnet.TTNetInit.getEffectiveConnectionType()
            r2.LIZ(r0, r1)
            if (r11 == 0) goto L6e
            java.lang.String r1 = "effect_error_code"
            java.lang.Object r0 = r11.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6e
            r2.LJ(r1, r0)
        L6e:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "tool_performance_autocut_download_effect_fail"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417710mzp.LJIJI(java.lang.String, java.lang.String, int, java.lang.String, java.util.Map, java.lang.Integer):void");
    }

    public static final void LJJI(List<AutoCutMediaModel> list, String str, String str2, String str3, int i, String str4, Function1<? super C0LAB, Unit> function1) {
        String str5;
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        if (i == 0) {
            str5 = "upload";
        } else {
            str5 = "shoot";
        }
        c0lab.LJ("content_source", str5);
        c0lab.LJ("creation_id", str3);
        c0lab.LIZ(iIntValue, "content_cnt");
        LIZ.getClass();
        c0lab.LJ("content_form", LIZJ(list));
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(iIntValue3, "video_cnt");
        function1.invoke(c0lab);
        c0lab.LJ("autocut_click_from", str4);
        C20684815ws.LJIILLIIL("enter_switch_style_page", c0lab.LIZ);
    }

    public static final void LJIIJ(String str, boolean z, int i, String str2, long j, String str3, String str4, String str5) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str2);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("music_id", str3);
        c0lab.LJ("shoot_way", str4);
        c0lab.LJ("creation_id", str5);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c0lab.LJ("source", str);
        C20684815ws.LJIILLIIL("tool_performance_autocut_download_music", c0lab.LIZ);
    }

    public static final void LJJIII(boolean z, int i, String str, long j, List list, String str2, String str3, int i2, boolean z2) {
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(iIntValue, "material_count");
        c0lab.LIZ(iIntValue2, "photo_count");
        c0lab.LIZ(iIntValue3, "video_count");
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("creation_id", str3);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c0lab.LIZ(i2, "autocut_template_type");
        c0lab.LJ("source", "source_auto_cut");
        c0lab.LIZ(z2 ? 1 : 0, "is_template_json");
        if (list != null && list.size() == 1 && ((AutoCutMediaModel) C13LP.LJJJJZI(list)).duration > 15000) {
            c0lab.LIZ(1, "hit_highlight_condition");
        }
        Map<String, String> map = c0lab.LIZ;
        C20684815ws.LJIILLIIL("tool_performance_autocut_music", map);
        LIZ.getClass();
        LJJIZ("tool_performance_autocut_music", map, z);
    }

    public static final void LJIJJLI(String str, String str2, int i, String str3, int i2, String str4, String str5, String str6, int i3, long j) {
        Object objValueOf;
        long j2;
        C0LAB c0lab = new C0LAB();
        if (i2 > 0) {
            objValueOf = Float.valueOf(i / i2);
        } else {
            objValueOf = 1;
        }
        c0lab.LIZLLL(objValueOf, "success_rate");
        if (i2 > 0) {
            j2 = j / ((long) i2);
        } else {
            j2 = 0;
        }
        c0lab.LIZIZ(j2, "average_duration");
        c0lab.LIZ(i, "success_num");
        c0lab.LIZ(i2, "total_num");
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("creation_id", str3);
        c0lab.LJ("music_id", str4);
        c0lab.LIZ(i3, "autocut_template_type");
        c0lab.LJ("autocut_template_id", str5);
        c0lab.LJ("autocut_template_group_id", str6);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c0lab.LJ("source", str);
        C20684815ws.LJIILLIIL("tool_performance_autocut_download_effect_finish", c0lab.LIZ);
    }

    public static final void LJJIIZ(int i, int i2, boolean z, String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        int i3;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, "req_type");
        c0lab.LIZ(5000, "error_code");
        c0lab.LIZ(i2, "error_sub_code");
        if (z) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        c0lab.LIZ(i3, "file_exist");
        c0lab.LJ("exception_msg", str);
        c0lab.LJ("exception_cause_msg", str2);
        c0lab.LJ("ttnet_trace_code", str3);
        c0lab.LIZLLL(num, "ttnet_status_code");
        c0lab.LJ("ttnet_request_log", str4);
        c0lab.LJ("log_id", str5);
        c0lab.LJ("trace_id", str6);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        C20684815ws.LJIILLIIL("tool_performance_autocut_req_nle_or_music_fail", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LJJIJ(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, C1417720mzq c1417720mzq, int i) {
        String str6;
        String str7 = null;
        if ((i & 16) != 0) {
            str5 = null;
        }
        ?? r9 = z;
        if ((i & 32) != 0) {
            r9 = 0;
        }
        ?? r10 = z2;
        if ((i & 64) != 0) {
            r10 = 0;
        }
        ?? r11 = z3;
        if ((i & 128) != 0) {
            r11 = 0;
        }
        if ((i & 256) != 0) {
            c1417720mzq = null;
        }
        ?? c0lab = new C0LAB();
        c0lab.LJ("content_source", str);
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("shoot_way", str3);
        c0lab.LJ("creation_id", str4);
        c0lab.LJ("template_tags", str5);
        c0lab.LIZ(r9, "is_from_multi_photo_content");
        c0lab.LIZ(r10, "is_from_multi_photo_special_page");
        c0lab.LIZ(r11, "is_draft");
        if (c1417720mzq != null) {
            str6 = c1417720mzq.LIZJ;
        } else {
            str6 = null;
        }
        c0lab.LJ("album_from_page", str6);
        if (c1417720mzq != null) {
            str7 = c1417720mzq.LIZLLL;
        }
        c0lab.LJ("album_from_scene", str7);
        C20684815ws.LJIILLIIL("show_autocut", c0lab.LIZ);
    }

    public static final void LJIILL(String str, long j, String str2, String str3, List<AutoCutMediaModel> list, String str4, String str5, String str6, String str7, int i, boolean z, String str8) {
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("stage", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("music_id", str2);
        c0lab.LJ("task_id", str3);
        c0lab.LIZ(iIntValue, "material_count");
        c0lab.LIZ(iIntValue2, "photo_count");
        c0lab.LIZ(iIntValue3, "video_count");
        c0lab.LJ("enter_from", str4);
        c0lab.LJ("shoot_way", str5);
        c0lab.LJ("creation_id", str6);
        c0lab.LJ("reuse_music_type", str7);
        c0lab.LIZ(i, "autocut_template_type");
        c0lab.LIZ(z ? 1 : 0, "is_template_json");
        if (str8 != null && str8.length() != 0) {
            c0lab.LJ("feature_code", str8);
        }
        C20684815ws.LJIILLIIL("tool_performance_autocut_stage", c0lab.LIZ);
    }

    public static final void LJJIJIL(int i, int i2, long j, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2) {
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LIZLLL(num, "error_sub_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(iIntValue, "material_count");
        c0lab.LIZ(iIntValue2, "photo_count");
        c0lab.LIZ(iIntValue3, "video_count");
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("creation_id", str3);
        c0lab.LIZ(i2, "autocut_template_type");
        c0lab.LJ("autocut_template_id", str4);
        c0lab.LJ("autocut_template_group_id", str5);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c0lab.LIZ(z2 ? 1 : 0, "is_template_json");
        c0lab.LJ("music_id", str6);
        C20684815ws.LJIILLIIL("tool_performance_autocut_switch_request_template", c0lab.LIZ);
    }

    public static final void LJJII(boolean z, int i, int i2, String str, long j, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, boolean z2) {
        int size;
        int size2 = 0;
        if (list != null) {
            size = list.size();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((MetaExt) obj).isVideo()) {
                    arrayList.add(obj);
                }
            }
            size2 = arrayList.size();
        } else {
            size = 0;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LIZ(i2, "error_sub_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("rec_config", str2);
        c0lab.LJ("rec_key", str3);
        c0lab.LJ("shoot_way", str4);
        c0lab.LJ("creation_id", str5);
        c0lab.LJ("log_id", str6);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c0lab.LJ("autocut_template_type", str7);
        c0lab.LIZ(size, "material_count");
        c0lab.LIZ(size - size2, "photo_count");
        c0lab.LIZ(size2, "video_count");
        c0lab.LJ("source", str8);
        c0lab.LIZ(z2 ? 1 : 0, "is_preload");
        Map<String, String> map = c0lab.LIZ;
        C20684815ws.LJIILLIIL("tool_performance_autocut_nlemodel_request", map);
        LIZ.getClass();
        LJJIZ("tool_performance_autocut_nlemodel_request", map, z);
    }

    public static void LJJIJIIJIL(int i, int i2, int i3, long j, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2) {
        int i4;
        int i5;
        int iIntValue;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 128) != 0) {
            z2 = false;
        }
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue2 = c443120HZeLJ.getFirst().intValue();
        int iIntValue3 = c443120HZeLJ.getSecond().intValue();
        int iIntValue4 = c443120HZeLJ.getThird().intValue();
        C0LAB c0lab = new C0LAB();
        if (z) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        c0lab.LIZ(i4, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(iIntValue2, "material_count");
        c0lab.LIZ(iIntValue3, "photo_count");
        c0lab.LIZ(iIntValue4, "video_count");
        if (z2) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        c0lab.LIZ(i5, "has_cached");
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("creation_id", str3);
        c0lab.LJ("autocut_template_id", str4);
        c0lab.LJ("autocut_template_group_id", str5);
        c0lab.LIZ(i2, "autocut_template_type");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c0lab.LIZ(iIntValue, "effect_urs_count");
        if (str6 != null && str6.length() != 0) {
            c0lab.LJ("feature_code", str6);
        }
        C20684815ws.LJIILLIIL("tool_performance_autocut_change_template", c0lab.LIZ);
    }

    public static final void LJIIIZ(String str, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<AutoCutMediaModel> list, int i9) {
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(j2, "autocut_duration");
        c0lab.LIZIZ(j3, "loading_duration");
        c0lab.LIZIZ(j4, "download_duration");
        c0lab.LIZ(i, "necessary_download_count");
        c0lab.LIZ(i2, "necessary_total_count");
        c0lab.LIZ(i3, "unnecessary_download_count");
        c0lab.LIZ(i4, "unnecessary_total_count");
        c0lab.LIZ(i5, "cached_count");
        c0lab.LIZ(i6, "fail_count");
        c0lab.LIZ(i7, "success_count");
        c0lab.LIZ(i8, "download_count");
        c0lab.LIZ(iIntValue, "material_count");
        c0lab.LIZ(iIntValue2, "photo_count");
        c0lab.LIZ(iIntValue3, "video_count");
        c0lab.LIZIZ(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "video_duration");
        c0lab.LJ("async_render_status", str);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c0lab.LIZ(i9, "autocut_template_type");
        C20684815ws.LJIILLIIL("tool_performance_autocut_async_render", c0lab.LIZ);
    }

    public static final void LJJIIJ(String str, boolean z, int i, Integer num, String str2, long j, String str3, String str4, List<AutoCutMediaModel> list, String str5, String str6, String str7, String str8, String str9, int i2, boolean z2, String str10, boolean z3) {
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LIZLLL(num, "error_sub_code");
        c0lab.LJ("error_msg", str2);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("music_id", str3);
        c0lab.LJ("task_id", str4);
        c0lab.LIZ(iIntValue, "material_count");
        c0lab.LIZ(iIntValue2, "photo_count");
        c0lab.LIZ(iIntValue3, "video_count");
        c0lab.LJ("enter_from", str5);
        c0lab.LJ("shoot_way", str6);
        c0lab.LJ("creation_id", str7);
        c0lab.LIZ(i2, "autocut_template_type");
        c0lab.LJ("autocut_template_id", str9);
        c0lab.LJ("autocut_template_group_id", str10);
        c0lab.LJ("reuse_music_type", str8);
        c0lab.LJ("source", str);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        c0lab.LIZ(z2 ? 1 : 0, "is_template_json");
        c0lab.LIZ(z3 ? 1 : 0, "is_preload");
        Map<String, String> map = c0lab.LIZ;
        C20684815ws.LJIILLIIL("tool_performance_autocut_nlemodel", map);
        LIZ.getClass();
        LJJIZ("tool_performance_autocut_nlemodel", map, z);
    }

    public static final void LJIL(String str, String str2, int i, int i2, String str3, String str4, boolean z, String str5, String str6, String str7, int i3, String str8, String str9, int i4, int i5, String str10, String str11, EnumC1413160msU enumC1413160msU, EnumC1413160msU enumC1413160msU2) {
        String string;
        String str12;
        if (enumC1413160msU == enumC1413160msU2 && (enumC1413160msU == EnumC1413160msU.NONE || enumC1413160msU == EnumC1413160msU.SLIDESHOW)) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("click_from_initial", str);
        c0lab.LJ("click_from_most_recent", str2);
        c0lab.LIZ(i, "generate_type");
        c0lab.LIZ(i2, "template_type");
        c0lab.LJ("template_id", str3);
        String string2 = null;
        if (enumC1413160msU != null) {
            string = enumC1413160msU.toString();
        } else {
            string = null;
        }
        c0lab.LJ("from_template", string);
        if (enumC1413160msU2 != null) {
            string2 = enumC1413160msU2.toString();
        }
        c0lab.LJ("to_template", string2);
        c0lab.LJ("template_group_id", str4);
        c0lab.LIZ(z ? 1 : 0, "is_reuse_music");
        c0lab.LJ("creation_id", str5);
        c0lab.LJ("shoot_way", str6);
        c0lab.LJ("enter_from", str7);
        if (i3 == 0) {
            str12 = "upload";
        } else {
            str12 = "shoot";
        }
        c0lab.LJ("content_source", str12);
        c0lab.LJ("music_id", str8);
        c0lab.LJ("template_ranks", str9);
        c0lab.LIZ(i4, "pic_cnt");
        c0lab.LIZ(i5, "video_cnt");
        if (str10 != null) {
            c0lab.LJ("tab_name", str10);
        }
        if (str11 != null) {
            c0lab.LJ("category_key", str11);
        }
        C20684815ws.LJIILLIIL("edit_autocut_template", c0lab.LIZ);
    }

    public static final void LJJIJLIJ(List<AutoCutMediaModel> list, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, String str7, int i2, String str8, Integer num, String str9, String str10, String str11, List<AutoCutTitle> list2, AutoCutModel autoCutModel, String str12, String str13, String str14, String str15, String str16, String str17, VideoPublishEditModel videoPublishEditModel, Function1<? super C0LAB, Unit> function1) {
        String str18;
        int i3;
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("creation_id", str3);
        if (i2 == 0) {
            str18 = "upload";
        } else {
            str18 = "shoot";
        }
        c0lab.LJ("content_source", str18);
        c0lab.LIZ(iIntValue, "content_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(iIntValue3, "video_cnt");
        LIZ.getClass();
        c0lab.LJ("content_form", LIZJ(list));
        c0lab.LJ("autocut_style_name", str4);
        c0lab.LIZ(z ? 1 : 0, "is_soundsync");
        if (str5 != null) {
            c0lab.LJ("style_order", str5);
        }
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str6);
        c0lab.LIZ(i, "is_recommend_style");
        c0lab.LJ("reuse_music_type", str7);
        c0lab.LJ("music_id", str8);
        function1.invoke(c0lab);
        if (str17 != null) {
            c0lab.LJ("method", str17);
        }
        int i4 = 1;
        if (autoCutModel.isNone) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c0lab.LIZ(i3 ^ 1, "is_use_template");
        c0lab.LJ("autocut_click_from", str9);
        c0lab.LIZLLL(num, "autocut_template_type");
        c0lab.LJ("autocut_template_id", str10);
        c0lab.LJ("autocut_template_group_id", str12);
        c0lab.LJ("autocut_template_tag", str13);
        c0lab.LJ("music_selected_from", str14);
        c0lab.LJ("task_id", str11);
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel == null || nowsShootModel.type != 0) {
            i4 = 0;
        }
        c0lab.LIZ(i4, "is_nows");
        C1412610mrb.LIZIZ(c0lab, null, list2);
        C1412610mrb.LIZLLL(c0lab, autoCutModel.speedVariationType);
        C1412610mrb.LJ(c0lab, num);
        if (str15 != null) {
            c0lab.LJ("tab_name", str15);
        }
        if (str16 != null) {
            c0lab.LJ("category_key", str16);
        }
        c0lab.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
        C20684815ws.LJIILLIIL("switch_autocut_style_result", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0LAB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public static void LJIIZILJ(List list, String str, String str2, String str3, boolean z, String str4, int i, String str5, String str6, String str7, boolean z2, String str8, String str9, String str10, boolean z3, int i2, boolean z4, String str11, int i3, String str12, int i4, boolean z5, boolean z6, boolean z7, boolean z8, C1417720mzq c1417720mzq, Function1 function1, int i5) {
        int i6;
        int i7;
        String str13;
        String str14;
        String str15;
        Function1 function12 = function1;
        C1417720mzq c1417720mzq2 = c1417720mzq;
        boolean z9 = z7;
        ?? r8 = z6;
        int i8 = i3;
        int i9 = i2;
        String str16 = str9;
        ?? r14 = z5;
        boolean z10 = z8;
        String str17 = str11;
        ?? r12 = z3;
        String str18 = str10;
        String str19 = str8;
        int i10 = i4;
        String str20 = str7;
        String str21 = "";
        if ((i5 & 512) != 0) {
            str20 = "";
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str19 = null;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str16 = "";
        }
        if ((i5 & 8192) != 0) {
            str18 = "";
        }
        if ((i5 & 16384) != 0) {
            r12 = 0;
        }
        if ((32768 & i5) != 0) {
            i9 = -1;
        }
        if ((65536 & i5) != 0) {
            z4 = false;
        }
        if ((131072 & i5) != 0) {
            str17 = null;
        }
        if ((262144 & i5) != 0) {
            i8 = 0;
        }
        if ((524288 & i5) == 0) {
            str21 = str12;
        }
        if ((1048576 & i5) != 0) {
            i10 = 0;
        }
        if ((2097152 & i5) != 0) {
            r14 = 0;
        }
        if ((4194304 & i5) != 0) {
            r8 = 0;
        }
        if ((8388608 & i5) != 0) {
            z9 = false;
        }
        if ((16777216 & i5) != 0) {
            z10 = false;
        }
        if ((33554432 & i5) != 0) {
            c1417720mzq2 = null;
        }
        if ((i5 & 67108864) != 0) {
            function12 = AFwS261S0000000_22.get$arr$(255);
        }
        if (list != null && list.size() > 1) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            i7 = 0;
            while (it2.hasNext()) {
                if (((AutoCutMediaModel) it2.next()).isLiveHighlight && (i7 = i7 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        } else {
            i7 = 0;
        }
        ?? c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        if (i != 0) {
            str13 = "shoot";
        } else {
            str13 = "upload";
        }
        c0lab.LJ("content_source", str13);
        c0lab.LJ("shoot_way", str2);
        c0lab.LIZ(i6, "is_multi_content");
        c0lab.LJ("creation_id", str3);
        c0lab.LIZ(iIntValue, "content_cnt");
        LIZ.getClass();
        c0lab.LJ("content_form", LIZJ(list));
        c0lab.LJ("content_type", str19);
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(iIntValue3, "video_cnt");
        c0lab.LJ("enter_dm", str20);
        c0lab.LJ("shoot_tab_name", str4);
        c0lab.LIZ(z ? 1 : 0, "has_autocut");
        c0lab.LJ("music_id", str5);
        c0lab.LJ("music_selected_from", str6);
        c0lab.LIZ(z2 ? 1 : 0, "is_nows");
        c0lab.LIZ(r12, "is_pic_frame_single_pic_edit");
        c0lab.LJ("enter_method", str21);
        c0lab.LIZ(z9 ? 1 : 0, "is_auto_apply");
        c0lab.LIZ(z10 ? 1 : 0, "is_draft");
        c0lab.LIZ(i7, "highlights_cnt");
        function12.invoke(c0lab);
        if (i10 > 0) {
            c0lab.LIZ(i10, "live_pic_cnt");
        }
        c0lab.LJ("edit_tab_entrance", str16);
        c0lab.LJ("editorpro_click_from", str18);
        if (r12 != 0) {
            c0lab.LIZ(1, "pic_cnt");
            c0lab.LJ("content_type", "multi_photo");
        }
        if (i9 >= 0) {
            c0lab.LIZ(i9, "live_pic_cnt");
        }
        if (z4 && Intrinsics.LJFF(str17, "shoot")) {
            c0lab.LIZ(i8, "pic_cnt");
            c0lab.LJ("shoot_tab_name", str4);
        }
        c0lab.LIZ(r14, "is_from_multi_photo_content");
        c0lab.LIZ(r8, "is_from_multi_photo_special_page");
        if (c1417720mzq2 != null) {
            str14 = c1417720mzq2.LIZJ;
        } else {
            str14 = null;
        }
        c0lab.LJ("album_from_page", str14);
        if (c1417720mzq2 != null) {
            str15 = c1417720mzq2.LIZLLL;
        } else {
            str15 = null;
        }
        c0lab.LJ("album_from_scene", str15);
        Map<String, String> map = c0lab.LIZ;
        C20684815ws.LJIILLIIL("click_autocut", map);
        ITemplateMobService iTemplateMobService = (ITemplateMobService) C523850KgZ.LIZ.getValue();
        if (iTemplateMobService != null) {
            iTemplateMobService.LIZLLL("click_autocut_performance", map);
        }
    }

    public static final void LJJIFFI(boolean z, int i, Integer num, String str, long j, long j2, List<AutoCutMediaModel> list, String str2, String str3, String str4, int i2, String str5, int i3, String str6, String str7, String str8, List<AutoCutTitle> list2, AutoCutModel autoCutModel, int i4, boolean z2, String str9, String str10, Integer num2, String str11, String str12, boolean z3, String str13, Function1<? super C0LAB, Unit> function1) {
        String str14;
        Integer num3;
        int iIntValue;
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue2 = c443120HZeLJ.getFirst().intValue();
        int iIntValue3 = c443120HZeLJ.getSecond().intValue();
        int iIntValue4 = c443120HZeLJ.getThird().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LIZLLL(num, "error_sub_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(iIntValue2, "material_count");
        c0lab.LIZ(iIntValue3, "photo_count");
        c0lab.LIZ(iIntValue4, "video_count");
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("creation_id", str3);
        c0lab.LJ("reuse_music_type", str4);
        if (i2 == 0) {
            str14 = "upload";
        } else {
            str14 = "shoot";
        }
        c0lab.LJ("content_source", str14);
        c0lab.LJ("enter_from", str5);
        c0lab.LJ("autocut_click_from", str6);
        c0lab.LIZ(i3, "autocut_template_type");
        c0lab.LJ("autocut_template_id", str7);
        c0lab.LJ("autocut_template_group_id", str9);
        c0lab.LJ("autocut_template_tag", str11);
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_quality");
        if (autoCutModel != null) {
            num3 = autoCutModel.speedVariationType;
        } else {
            num3 = null;
        }
        C1412610mrb.LIZLLL(c0lab, num3);
        c0lab.LIZ(z2 ? 1 : 0, "is_template_json");
        c0lab.LJ("music_id", str10);
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        c0lab.LIZ(iIntValue, "effect_urs_count");
        c0lab.LIZIZ(j2, "duration_exclude_download_music");
        c0lab.LJ("music_selected_from", str12);
        c0lab.LIZ(z3 ? 1 : 0, "is_preload");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            for (AutoCutMediaModel autoCutMediaModel : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(autoCutMediaModel.width);
                sbLIZ.append('*');
                sbLIZ.append(autoCutMediaModel.height);
                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                arrayList2.add(String.valueOf(autoCutMediaModel.duration));
            }
        }
        c0lab.LJ("autocut_content_size", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), arrayList));
        c0lab.LJ("autocut_content_duration", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), arrayList2));
        c0lab.LJ("task_id", str8);
        C1412610mrb.LIZIZ(c0lab, null, list2);
        if (function1 != null) {
            function1.invoke(c0lab);
        }
        c0lab.LIZ(i4, "text_sticker_duration");
        if (str13 != null && str13.length() != 0) {
            c0lab.LJ("feature_code", str13);
        }
        Map<String, String> map = c0lab.LIZ;
        C20684815ws.LJIILLIIL("tool_performance_generate_autocut", map);
        LIZ.getClass();
        LJJIZ("tool_performance_generate_autocut", map, z);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tool_performance_generate_autocut end, time=");
        sbLIZ2.append(System.currentTimeMillis());
        C201955140j.LIZLLL(c1398350mUb, "msg-log", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0LAB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    public static void LJJIIZI(List list, String str, String str2, String str3, String str4, Integer num, String str5, int i, String str6, String str7, Integer num2, String str8, String str9, List list2, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, VideoPublishEditModel videoPublishEditModel, String str16, Integer num3, Function1 function1, boolean z2, int i2, boolean z3, String str17, int i3) {
        String str18;
        int i4;
        int i5;
        String str19 = str16;
        ?? r6 = z2;
        String str20 = str13;
        String str21 = str17;
        List list3 = list2;
        if ((i3 & 128) != 0) {
            i = 0;
        }
        if ((i3 & 8192) != 0) {
            list3 = null;
        }
        if ((131072 & i3) != 0) {
            str20 = null;
        }
        if ((67108864 & i3) != 0) {
            r6 = 0;
        }
        if ((134217728 & i3) != 0) {
            i2 = 0;
        }
        if ((268435456 & i3) != 0) {
            z3 = false;
        }
        if ((i3 & 536870912) != 0) {
            str21 = null;
        }
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        ?? c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        if (i == 0) {
            str18 = "upload";
        } else {
            str18 = "shoot";
        }
        c0lab.LJ("content_source", str18);
        c0lab.LJ("creation_id", str3);
        c0lab.LIZ(iIntValue, "content_cnt");
        LIZ.getClass();
        c0lab.LJ("content_form", LIZJ(list));
        c0lab.LJ("autocut_style_name", str4);
        c0lab.LIZLLL(num, "autocut_style_order");
        c0lab.LJ("reuse_music_type", str5);
        c0lab.LJ("music_id", str6);
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(iIntValue3, "video_cnt");
        c0lab.LJ("autocut_click_from", str7);
        C1412610mrb.LIZ(c0lab, num2, str8);
        c0lab.LJ("autocut_template_group_id", str10);
        c0lab.LJ("autocut_template_tag", str11);
        c0lab.LJ("template_tags", str11);
        c0lab.LJ("autocut_resource_id", str20);
        c0lab.LIZ(z ? 1 : 0, "is_use_template");
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel != null && nowsShootModel.type == 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c0lab.LIZ(i4, "is_nows");
        c0lab.LJ("music_selected_from", str12);
        c0lab.LJ("task_id", str9);
        c0lab.LIZLLL(num3, "asset_from");
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        C1412610mrb.LIZIZ(c0lab, null, list3);
        C1412610mrb.LJ(c0lab, num2);
        C1412610mrb.LJFF(c0lab, num2, str21);
        function1.invoke(c0lab);
        if (str14 != null) {
            c0lab.LJ("tab_name", str14);
        }
        if (str15 != null) {
            c0lab.LJ("category_key", str15);
        }
        if (str19 == null) {
            str19 = "";
        }
        c0lab.LJ("music_id_used", str19);
        c0lab.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
        c0lab.LIZ(r6, "is_ai_template");
        if (i2 != 0) {
            if (z3) {
                i5 = 2;
            } else {
                i5 = 1;
            }
        } else {
            i5 = 0;
        }
        c0lab.LIZ(i5, "is_from_same_music");
        c0lab.LIZLLL(num2, "autocut_template_type");
        C20684815ws.LJIILLIIL("select_autocut_style", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0LAB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static void LJJIJIIJI(List list, String str, String str2, String str3, int i, String str4, String str5, int i2, int i3, String str6, String str7, List list2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, C1417720mzq c1417720mzq, String str15, Integer num, boolean z, boolean z2, AwS601S0100000_22 awS601S0100000_22, Integer num2, boolean z3, int i4, boolean z4, String str16, int i5) {
        String str17;
        Integer numValueOf;
        int i6;
        List list3 = list2;
        String str18 = str15;
        ?? r4 = z3;
        Function1 function1 = awS601S0100000_22;
        ?? r9 = z2;
        ?? r6 = z;
        C1417720mzq c1417720mzq2 = c1417720mzq;
        Integer num3 = num2;
        String str19 = str16;
        String str20 = str14;
        String str21 = str13;
        if ((i5 & 16) != 0) {
            i = 0;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list3 = null;
        }
        if ((131072 & i5) != 0) {
            str21 = null;
        }
        if ((262144 & i5) != 0) {
            str20 = null;
        }
        if ((524288 & i5) != 0) {
            c1417720mzq2 = null;
        }
        if ((4194304 & i5) != 0) {
            r6 = 0;
        }
        if ((8388608 & i5) != 0) {
            r9 = 0;
        }
        if ((16777216 & i5) != 0) {
            function1 = AFwS261S0000000_22.get$arr$(256);
        }
        if ((33554432 & i5) != 0) {
            num3 = null;
        }
        if ((67108864 & i5) != 0) {
            r4 = 0;
        }
        if ((134217728 & i5) != 0) {
            i4 = 0;
        }
        if ((268435456 & i5) != 0) {
            z4 = false;
        }
        if ((i5 & 536870912) != 0) {
            str19 = null;
        }
        C443120HZe<Integer, Integer, Integer> c443120HZeLJFF = LJFF(list);
        c443120HZeLJFF.getFirst().intValue();
        int iIntValue = c443120HZeLJFF.getSecond().intValue();
        int iIntValue2 = c443120HZeLJFF.getThird().intValue();
        ?? c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        if (i == 0) {
            str17 = "upload";
        } else {
            str17 = "shoot";
        }
        c0lab.LJ("content_source", str17);
        c0lab.LJ("creation_id", str3);
        c0lab.LIZ(i2, "autocut_style_order");
        c0lab.LJ("music_id", str4);
        c0lab.LIZ(iIntValue, "pic_cnt");
        c0lab.LIZ(iIntValue2, "video_cnt");
        c0lab.LJ("autocut_click_from", str5);
        c0lab.LIZ(i3, "autocut_template_type");
        C1412610mrb.LIZ(c0lab, Integer.valueOf(i3), str6);
        c0lab.LJ("autocut_template_group_id", str8);
        c0lab.LIZ(r9, "is_draft");
        c0lab.LJ("autocut_template_tag", str9);
        c0lab.LJ("autocut_resource_id", str21);
        c0lab.LJ("task_id", str7);
        c0lab.LJ("music_selected_from", str10);
        c0lab.LIZLLL(num, "asset_from");
        function1.invoke(c0lab);
        c0lab.LJ("template_tags", str9);
        Integer numValueOf2 = null;
        C1412610mrb.LIZIZ(c0lab, null, list3);
        C1412610mrb.LJ(c0lab, Integer.valueOf(i3));
        C1412610mrb.LJFF(c0lab, Integer.valueOf(i3), str19);
        if (c1417720mzq2 != null) {
            numValueOf = Integer.valueOf(c1417720mzq2.LIZ);
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "original_video_cnt");
        if (c1417720mzq2 != null) {
            numValueOf2 = Integer.valueOf(c1417720mzq2.LIZIZ);
        }
        c0lab.LIZLLL(numValueOf2, "original_pic_cnt");
        if (str11 != null) {
            c0lab.LJ("tab_name", str11);
        }
        if (str12 != null) {
            c0lab.LJ("category_key", str12);
        }
        if (str20 != null) {
            c0lab.LJ("mix_request_id", str20);
        }
        c0lab.LIZLLL(num3, "is_edit_carousel_show");
        if (str18 == null) {
            str18 = "";
        }
        c0lab.LJ("music_id_used", str18);
        c0lab.LIZ(r6, "is_from_multi_photo_special_page");
        c0lab.LIZ(r4, "is_ai_template");
        if (i4 != 0) {
            if (z4) {
                i6 = 2;
            } else {
                i6 = 1;
            }
        } else {
            i6 = 0;
        }
        c0lab.LIZ(i6, "is_from_same_music");
        C20684815ws.LJIILLIIL("show_autocut_template", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0LAB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public static void LJIILLIIL(String str, int i, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, int i3, String str10, int i4, int i5, int i6, String str11, long j, String str12, String str13, String str14, String str15, C1417720mzq c1417720mzq, String str16, Integer num, boolean z, boolean z2, Function1 function1, boolean z3, int i7, boolean z4, String str17, int i8) {
        String str18;
        String str19;
        Integer numValueOf;
        Integer numValueOf2;
        int i9;
        int i10 = i4;
        ?? r4 = z3;
        Function1 function12 = function1;
        ?? r9 = z;
        C1417720mzq c1417720mzq2 = c1417720mzq;
        ?? r8 = z2;
        String str20 = str15;
        String str21 = str12;
        if ((i8 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i3 = 0;
        }
        if ((i8 & 16384) != 0) {
            i10 = -1;
        }
        if ((524288 & i8) != 0) {
            str21 = null;
        }
        if ((4194304 & i8) != 0) {
            str20 = null;
        }
        if ((8388608 & i8) != 0) {
            c1417720mzq2 = null;
        }
        if ((67108864 & i8) != 0) {
            r9 = 0;
        }
        if ((134217728 & i8) != 0) {
            r8 = 0;
        }
        if ((268435456 & i8) != 0) {
            function12 = AFwS261S0000000_22.get$arr$(254);
        }
        if ((536870912 & i8) != 0) {
            r4 = 0;
        }
        if ((1073741824 & i8) != 0) {
            i7 = 0;
        }
        if ((i8 & Integer.MIN_VALUE) != 0) {
            z4 = false;
        }
        ?? c0lab = new C0LAB();
        if (str2 != null && str2.length() != 0) {
            c0lab.LJ("tt_template_type", str2);
        } else {
            C1412610mrb.LJ(c0lab, Integer.valueOf(i2));
        }
        C1412610mrb.LJFF(c0lab, Integer.valueOf(i2), str17);
        c0lab.LJ("autocut_click_from", str);
        c0lab.LIZ(i, "generate_type");
        c0lab.LJ("tt_template_id", str3);
        c0lab.LIZ(i2, "template_type");
        c0lab.LIZ(i2, "autocut_template_type");
        String str22 = "";
        if (i2 == EnumC1412640mre.SOUND_SYNC_TEMPLATE.getValue() || i2 == EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()) {
            str18 = "";
        } else {
            str18 = str4;
        }
        c0lab.LJ("template_id", str18);
        C1412610mrb.LIZ(c0lab, Integer.valueOf(i2), str4);
        c0lab.LJ("template_group_id", str5);
        c0lab.LJ("autocut_template_tag", str6);
        c0lab.LJ("template_tags", str6);
        c0lab.LIZ(0, "is_reuse_music");
        c0lab.LJ("creation_id", str7);
        c0lab.LJ("shoot_way", str8);
        c0lab.LJ("enter_from", str9);
        if (i3 == 0) {
            str19 = "upload";
        } else {
            str19 = "shoot";
        }
        c0lab.LJ("content_source", str19);
        c0lab.LJ("music_id", str10);
        c0lab.LIZ(i10, "autocut_style_order");
        c0lab.LIZ(i5, "pic_cnt");
        c0lab.LIZ(i6, "video_cnt");
        c0lab.LJ("autocut_resource_id", str21);
        c0lab.LJ("music_selected_from", str11);
        c0lab.LIZIZ(j, "duration");
        if (c1417720mzq2 != null) {
            numValueOf = Integer.valueOf(c1417720mzq2.LIZ);
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "original_video_cnt");
        if (c1417720mzq2 != null) {
            numValueOf2 = Integer.valueOf(c1417720mzq2.LIZIZ);
        } else {
            numValueOf2 = null;
        }
        c0lab.LIZLLL(numValueOf2, "original_pic_cnt");
        c0lab.LIZLLL(num, "asset_from");
        function12.invoke(c0lab);
        if (str13 != null) {
            c0lab.LJ("tab_name", str13);
        }
        if (str14 != null) {
            c0lab.LJ("category_key", str14);
        }
        if (str20 != null) {
            c0lab.LJ("mix_request_id", str20);
        }
        if (str16 != null) {
            str22 = str16;
        }
        c0lab.LJ("music_id_used", str22);
        c0lab.LIZ(r8, "is_draft");
        c0lab.LIZ(r9, "is_from_multi_photo_special_page");
        c0lab.LIZ(r4, "is_ai_template");
        if (i7 != 0) {
            if (z4) {
                i9 = 2;
            } else {
                i9 = 1;
            }
        } else {
            i9 = 0;
        }
        c0lab.LIZ(i9, "is_from_same_music");
        C20684815ws.LJIILLIIL("autocut_template_play", c0lab.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0LAB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void LJJIL(String str, int i, int i2, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, int i3, String str8, int i4, int i5, int i6, int i7, String str9, String str10, String str11, String str12, boolean z2, String str13, C1417720mzq c1417720mzq, String str14, Integer num, boolean z3, boolean z4, Function1 function1, Integer num2, boolean z5, int i8, boolean z6, String str15, int i9) {
        String str16;
        String str17;
        Integer numValueOf;
        Integer numValueOf2;
        int i10;
        int i11 = i2;
        int i12 = i4;
        String str18 = str14;
        Function1 function12 = function1;
        ?? r2 = z5;
        ?? r4 = z4;
        ?? r12 = z3;
        String str19 = str13;
        String str20 = str12;
        String str21 = str11;
        C1417720mzq c1417720mzq2 = c1417720mzq;
        String str22 = str10;
        if ((i9 & 4) != 0) {
            i11 = 0;
        }
        if ((i9 & 1024) != 0) {
            i3 = 0;
        }
        if ((i9 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i12 = -1;
        }
        if ((131072 & i9) != 0) {
            str22 = null;
        }
        if ((262144 & i9) != 0) {
            str21 = null;
        }
        if ((524288 & i9) != 0) {
            str20 = null;
        }
        if ((2097152 & i9) != 0) {
            str19 = null;
        }
        if ((4194304 & i9) != 0) {
            c1417720mzq2 = null;
        }
        if ((33554432 & i9) != 0) {
            r12 = 0;
        }
        if ((67108864 & i9) != 0) {
            r4 = 0;
        }
        if ((134217728 & i9) != 0) {
            function12 = AFwS261S0000000_22.get$arr$(257);
        }
        if ((268435456 & i9) != 0) {
            num2 = null;
        }
        if ((536870912 & i9) != 0) {
            r2 = 0;
        }
        if ((1073741824 & i9) != 0) {
            i8 = 0;
        }
        if ((i9 & Integer.MIN_VALUE) != 0) {
            z6 = false;
        }
        ?? c0lab = new C0LAB();
        c0lab.LJ("autocut_click_from", str);
        c0lab.LIZ(i, "generate_type");
        c0lab.LIZ(i11, "template_type");
        c0lab.LIZ(i11, "autocut_template_type");
        if (i11 != EnumC1412640mre.SOUND_SYNC_TEMPLATE.getValue() && i11 != EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()) {
            str16 = str2;
        } else {
            str16 = str8;
        }
        c0lab.LJ("template_id", str16);
        C1412610mrb.LIZ(c0lab, Integer.valueOf(i11), str2);
        c0lab.LJ("template_group_id", str3);
        c0lab.LJ("autocut_template_tag", str4);
        c0lab.LJ("template_tags", str4);
        c0lab.LIZ(z ? 1 : 0, "is_reuse_music");
        c0lab.LJ("creation_id", str5);
        c0lab.LJ("shoot_way", str6);
        c0lab.LJ("enter_from", str7);
        if (i3 == 0) {
            str17 = "upload";
        } else {
            str17 = "shoot";
        }
        c0lab.LJ("content_source", str17);
        c0lab.LJ("music_id", str8);
        c0lab.LIZ(i12, "autocut_style_order");
        c0lab.LIZ(i5, "pic_cnt");
        c0lab.LIZ(i6, "video_cnt");
        c0lab.LIZ(i7, "highlights_cnt");
        c0lab.LJ("music_selected_from", str9);
        c0lab.LJ("autocut_resource_id", str22);
        c0lab.LIZ(z2 ? 1 : 0, "is_nows");
        C1412610mrb.LJ(c0lab, Integer.valueOf(i11));
        C1412610mrb.LJFF(c0lab, Integer.valueOf(i11), str15);
        if (c1417720mzq2 != null) {
            numValueOf = Integer.valueOf(c1417720mzq2.LIZ);
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "original_video_cnt");
        if (c1417720mzq2 != null) {
            numValueOf2 = Integer.valueOf(c1417720mzq2.LIZIZ);
        } else {
            numValueOf2 = null;
        }
        c0lab.LIZLLL(numValueOf2, "original_pic_cnt");
        c0lab.LIZLLL(num, "asset_from");
        function12.invoke(c0lab);
        if (str21 != null) {
            c0lab.LJ("tab_name", str21);
        }
        if (str20 != null) {
            c0lab.LJ("category_key", str20);
        }
        if (str19 != null) {
            c0lab.LJ("mix_request_id", str19);
        }
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "is_edit_carousel_show");
        }
        if (str18 == null) {
            str18 = "";
        }
        c0lab.LJ("music_id_used", str18);
        c0lab.LIZ(r12, "is_from_multi_photo_special_page");
        c0lab.LIZ(r4, "is_draft");
        c0lab.LIZ(r2, "is_ai_template");
        if (i8 != 0) {
            if (z6) {
                i10 = 2;
            } else {
                i10 = 1;
            }
        } else {
            i10 = 0;
        }
        c0lab.LIZ(i10, "is_from_same_music");
        C20684815ws.LJIILLIIL("try_autocut_template", c0lab.LIZ);
    }
}
