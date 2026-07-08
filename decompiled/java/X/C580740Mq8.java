package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdkapi.pcs.model.PcsVideoModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.PcsCourseVideoModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.pcs.course.PcsCourseActivity;
import com.ss.android.ugc.aweme.pcs.course.PcsVideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Mq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580740Mq8 extends BroadcastReceiver {
    public final int $t;
    public Object l0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        switch (this.$t) {
            case 0:
                onReceive$0(this, context, intent);
                break;
            case 1:
                onReceive$1(this, context, intent);
                break;
            case 2:
                onReceive$2(this, context, intent);
                break;
            default:
                super.onReceive(context, intent);
                break;
        }
    }

    public final void LIZ$0(Intent intent) throws Throwable {
        ArrayList arrayList;
        Long l;
        Long l2;
        long jLongValue;
        File fileLJFF;
        String path;
        PcsCourseActivity pcsCourseActivity = (PcsCourseActivity) this.l0;
        pcsCourseActivity.getClass();
        if (intent == null || (arrayList = intent.getParcelableArrayListExtra("pcs_choose_video_extra_identifier")) == null) {
            arrayList = new ArrayList();
        }
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        PcsVideoModel pcsVideoModel = (PcsVideoModel) C13LP.LJJJLZIJ(0, arrayList);
        if (pcsVideoModel != null) {
            C1443310nf7 c1443310nf7 = C1443310nf7.LIZIZ;
            C0JHC c0jhcLLLLZLL = pcsCourseActivity.LLLLZLL();
            CreativeInitialModel creativeInitialModel = null;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            boolean z29 = false;
            boolean z30 = false;
            boolean z31 = false;
            boolean z32 = false;
            boolean z33 = false;
            boolean z34 = false;
            boolean z35 = false;
            boolean z36 = false;
            boolean z37 = false;
            boolean z38 = false;
            boolean z39 = false;
            boolean z40 = false;
            boolean z41 = false;
            boolean z42 = false;
            boolean z43 = false;
            boolean z44 = false;
            boolean z45 = false;
            boolean z46 = false;
            boolean z47 = false;
            boolean z48 = false;
            boolean z49 = false;
            boolean z50 = false;
            boolean z51 = false;
            boolean z52 = false;
            boolean z53 = false;
            boolean z54 = false;
            boolean z55 = false;
            boolean z56 = false;
            boolean z57 = false;
            boolean z58 = false;
            boolean z59 = false;
            boolean z60 = false;
            boolean z61 = false;
            boolean z62 = false;
            boolean z63 = false;
            boolean z64 = false;
            boolean z65 = false;
            boolean z66 = false;
            boolean z67 = false;
            boolean z68 = false;
            boolean z69 = false;
            boolean z70 = false;
            boolean z71 = false;
            boolean z72 = false;
            boolean z73 = false;
            boolean z74 = false;
            boolean z75 = false;
            boolean z77 = false;
            boolean z78 = false;
            boolean z79 = false;
            boolean z80 = false;
            boolean z81 = false;
            boolean z82 = false;
            boolean z83 = false;
            boolean z84 = false;
            boolean z85 = false;
            boolean z86 = false;
            boolean z87 = false;
            boolean z88 = false;
            boolean z89 = false;
            boolean z90 = false;
            boolean z91 = false;
            boolean z92 = false;
            boolean z93 = false;
            boolean z94 = false;
            boolean z95 = false;
            boolean z96 = false;
            boolean z97 = false;
            boolean z98 = false;
            boolean z99 = false;
            boolean z100 = false;
            boolean z101 = false;
            boolean z102 = false;
            boolean z103 = false;
            boolean z104 = false;
            boolean z105 = false;
            boolean z106 = false;
            boolean z107 = false;
            boolean z108 = false;
            boolean z109 = false;
            boolean z110 = false;
            boolean z111 = false;
            boolean z112 = false;
            boolean z113 = false;
            boolean z114 = false;
            boolean z115 = false;
            boolean z116 = false;
            boolean z117 = false;
            boolean z118 = false;
            boolean z119 = false;
            boolean z120 = false;
            boolean z121 = false;
            boolean z122 = false;
            boolean z123 = false;
            boolean z124 = false;
            boolean z125 = false;
            boolean z126 = false;
            boolean z127 = false;
            boolean z128 = false;
            boolean z129 = false;
            boolean z130 = false;
            boolean z131 = false;
            boolean z132 = false;
            boolean z133 = false;
            boolean z134 = false;
            boolean z135 = false;
            boolean z136 = false;
            boolean z137 = false;
            boolean z138 = false;
            boolean z139 = false;
            boolean z140 = false;
            boolean z141 = false;
            boolean z142 = false;
            boolean z143 = false;
            boolean z144 = false;
            boolean z145 = false;
            boolean z146 = false;
            boolean z147 = false;
            boolean z148 = false;
            boolean z149 = false;
            boolean z150 = false;
            boolean z151 = false;
            boolean z152 = false;
            boolean z153 = false;
            boolean z154 = false;
            boolean z155 = false;
            boolean z156 = false;
            boolean z157 = false;
            boolean z158 = false;
            boolean z159 = false;
            boolean z160 = false;
            boolean z161 = false;
            boolean z162 = false;
            boolean z163 = false;
            boolean z164 = false;
            boolean z165 = false;
            boolean z166 = false;
            boolean z167 = false;
            boolean z168 = false;
            boolean z169 = false;
            boolean z170 = false;
            boolean z171 = false;
            boolean z172 = false;
            boolean z173 = false;
            boolean z174 = false;
            boolean z175 = false;
            boolean z176 = false;
            boolean z177 = false;
            boolean z178 = false;
            boolean z179 = false;
            boolean z180 = false;
            boolean z181 = false;
            boolean z182 = false;
            boolean z183 = false;
            boolean z184 = false;
            boolean z185 = false;
            boolean z186 = false;
            boolean z187 = false;
            boolean z188 = false;
            boolean z189 = false;
            boolean z190 = false;
            boolean z191 = false;
            boolean z192 = false;
            boolean z193 = false;
            boolean z194 = false;
            boolean z195 = false;
            boolean z196 = false;
            boolean z197 = false;
            boolean z198 = false;
            boolean z199 = false;
            boolean z200 = false;
            boolean z201 = false;
            boolean z202 = false;
            boolean z203 = false;
            boolean z204 = false;
            boolean z205 = false;
            boolean z206 = false;
            boolean z207 = false;
            boolean z208 = false;
            boolean z209 = false;
            boolean z210 = false;
            boolean z211 = false;
            boolean z212 = false;
            boolean z213 = false;
            if (c0jhcLLLLZLL != null) {
                l = c0jhcLLLLZLL.LLILLJJLI;
            } else {
                l = null;
            }
            C0JHC c0jhcLLLLZLL2 = pcsCourseActivity.LLLLZLL();
            if (c0jhcLLLLZLL2 != null) {
                l2 = c0jhcLLLLZLL2.LL;
            } else {
                l2 = null;
            }
            c1443310nf7.getClass();
            VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
            int i2 = -1;
            CreativeModel creativeModel = new CreativeModel(creativeInitialModel, z213 ? 1 : 0, z212 ? 1 : 0, z211 ? 1 : 0, z210 ? 1 : 0, z209 ? 1 : 0, z208 ? 1 : 0, z207 ? 1 : 0, z206 ? 1 : 0, z205 ? 1 : 0, z204 ? 1 : 0, z203 ? 1 : 0, z202 ? 1 : 0, z201 ? 1 : 0, z200 ? 1 : 0, z199 ? 1 : 0, z198 ? 1 : 0, z197 ? 1 : 0, z196 ? 1 : 0, z195 ? 1 : 0, z194 ? 1 : 0, z193 ? 1 : 0, z192 ? 1 : 0, z191 ? 1 : 0, z190 ? 1 : 0, z189 ? 1 : 0, z188 ? 1 : 0, z187 ? 1 : 0, z186 ? 1 : 0, z185 ? 1 : 0, z184 ? 1 : 0, z183 ? 1 : 0, z182 ? 1 : 0, z181 ? 1 : 0, z180 ? 1 : 0, z179 ? 1 : 0, z178 ? 1 : 0, z177 ? 1 : 0, z176 ? 1 : 0, z175 ? 1 : 0, i, z174 ? 1 : 0, z173 ? 1 : 0, z172 ? 1 : 0, z171 ? 1 : 0, z170 ? 1 : 0, z169 ? 1 : 0, z168 ? 1 : 0, z167 ? 1 : 0, z166 ? 1 : 0, z165 ? 1 : 0, z164 ? 1 : 0, z163 ? 1 : 0, z162 ? 1 : 0, z161 ? 1 : 0, z5 ? 1 : 0, z160 ? 1 : 0, z159 ? 1 : 0, z158 ? 1 : 0, z157 ? 1 : 0, z156 ? 1 : 0, z155 ? 1 : 0, z154 ? 1 : 0, z153 ? 1 : 0, z152 ? 1 : 0, z151 ? 1 : 0, z150 ? 1 : 0, z149 ? 1 : 0, z148 ? 1 : 0, z147 ? 1 : 0, z146 ? 1 : 0, z145 ? 1 : 0, z144 ? 1 : 0, z143 ? 1 : 0, z142 ? 1 : 0, z141 ? 1 : 0, z140 ? 1 : 0, z139 ? 1 : 0, z138 ? 1 : 0, z137 ? 1 : 0, z136 ? 1 : 0, z135 ? 1 : 0, z134 ? 1 : 0, z133 ? 1 : 0, z132 ? 1 : 0, z131 ? 1 : 0, z130 ? 1 : 0, z129 ? 1 : 0, z128 ? 1 : 0, z127 ? 1 : 0, z126 ? 1 : 0, z125 ? 1 : 0, z4 ? 1 : 0, z124 ? 1 : 0, z123 ? 1 : 0, z122 ? 1 : 0, z121 ? 1 : 0, z120 ? 1 : 0, z119 ? 1 : 0, z118 ? 1 : 0, z117 ? 1 : 0, z116 ? 1 : 0, z115 ? 1 : 0, z114 ? 1 : 0, z113 ? 1 : 0, z112 ? 1 : 0, z111 ? 1 : 0, z110 ? 1 : 0, z109 ? 1 : 0, z108 ? 1 : 0, z107 ? 1 : 0, z106 ? 1 : 0, z105 ? 1 : 0, z104 ? 1 : 0, z103 ? 1 : 0, z102 ? 1 : 0, z101 ? 1 : 0, z100 ? 1 : 0, z99 ? 1 : 0, z98 ? 1 : 0, z97 ? 1 : 0, z96 ? 1 : 0, z95 ? 1 : 0, z94 ? 1 : 0, z93 ? 1 : 0, z92 ? 1 : 0, z91 ? 1 : 0, z90 ? 1 : 0, z89 ? 1 : 0, z88 ? 1 : 0, z87 ? 1 : 0, z86 ? 1 : 0, z85 ? 1 : 0, z84 ? 1 : 0, z83 ? 1 : 0, z82 ? 1 : 0, z81 ? 1 : 0, z80 ? 1 : 0, z79 ? 1 : 0, z78 ? 1 : 0, z77 ? 1 : 0, z75 ? 1 : 0, z74 ? 1 : 0, z73 ? 1 : 0, z72 ? 1 : 0, z71 ? 1 : 0, z70 ? 1 : 0, z69 ? 1 : 0, z68 ? 1 : 0, z67 ? 1 : 0, z66 ? 1 : 0, z65 ? 1 : 0, z64 ? 1 : 0, z63 ? 1 : 0, z62 ? 1 : 0, z61 ? 1 : 0, z60 ? 1 : 0, z59 ? 1 : 0, z58 ? 1 : 0, z57 ? 1 : 0, z56 ? 1 : 0, z55 ? 1 : 0, z54 ? 1 : 0, z53 ? 1 : 0, z52 ? 1 : 0, z51 ? 1 : 0, z50 ? 1 : 0, z49 ? 1 : 0, z48 ? 1 : 0, z47 ? 1 : 0, z46 ? 1 : 0, z45 ? 1 : 0, z44 ? 1 : 0, z43 ? 1 : 0, z42 ? 1 : 0, z41 ? 1 : 0, z40 ? 1 : 0, z39 ? 1 : 0, z38 ? 1 : 0, z37 ? 1 : 0, z36 ? 1 : 0, z35 ? 1 : 0, z34 ? 1 : 0, z33 ? 1 : 0, z32 ? 1 : 0, z31 ? 1 : 0, z3 ? 1 : 0, z2 ? 1 : 0, z30 ? 1 : 0, z ? 1 : 0, z29 ? 1 : 0, z28 ? 1 : 0, z27 ? 1 : 0, z26 ? 1 : 0, z25 ? 1 : 0, z24 ? 1 : 0, z23 ? 1 : 0, z22 ? 1 : 0, z21 ? 1 : 0, z20 ? 1 : 0, z19 ? 1 : 0, z18 ? 1 : 0, z17 ? 1 : 0, z16 ? 1 : 0, z15 ? 1 : 0, z14 ? 1 : 0, z13 ? 1 : 0, z12 ? 1 : 0, z11 ? 1 : 0, z10 ? 1 : 0, z9 ? 1 : 0, z8 ? 1 : 0, z7 ? 1 : 0, i2, i2, i2, i2, i2, i2, 2097151, z6 ? 1 : 0);
            long jLongValue2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            PcsCourseVideoModel pcsCourseVideoModel = new PcsCourseVideoModel(jLongValue, jLongValue2);
            String fileLocalUriPath = pcsVideoModel.getFileLocalUriPath();
            String str = "";
            if (fileLocalUriPath == null) {
                fileLocalUriPath = "";
            }
            pcsCourseVideoModel.localFilePath = fileLocalUriPath;
            creativeModel.pcsPaidVideoMediaModel = pcsCourseVideoModel;
            creativeModel.editPostModel = new EditPostModel(false, null, null, null, null, null, null, null, null, null, 0L, null, null, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
            videoPublishEditModel.creativeModel = creativeModel;
            String fileLocalUriPath2 = pcsVideoModel.getFileLocalUriPath();
            if (fileLocalUriPath2 == null) {
                fileLocalUriPath2 = "";
            }
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(fileLocalUriPath2);
            if (videoFileInfo != null) {
                C538310L9h c538310L9h = new C538310L9h(C0CHQ.LIZ().LJJIIZ().getVideoWidth(), C0CHQ.LIZ().LJJIIZ().getVideoHeight(), 28);
                String fileLocalUriPath3 = pcsVideoModel.getFileLocalUriPath();
                if (fileLocalUriPath3 == null) {
                    fileLocalUriPath3 = "";
                }
                videoPublishEditModel.setEditPreviewInfo(c538310L9h.LIZ(Collections.singletonList(new EditVideoSegment(fileLocalUriPath3, null, new VideoFileInfo(pcsVideoModel.getWidth(), pcsVideoModel.getHeight(), pcsVideoModel.getDuration(), videoFileInfo.fps, videoFileInfo.bitrate, videoFileInfo.codec, videoFileInfo.keyFrameCount, 0, 0.0f, 384, null)))));
                videoPublishEditModel.refreshOldFieldIfNeeded();
                videoPublishEditModel.setCreativeInfo(new CreativeInfo(null, 0, null, 7, null));
                videoPublishEditModel.setOrigin(0);
                videoPublishEditModel.mShootWay = "pcs_paid_video";
                videoPublishEditModel.setFastImport(true);
                videoPublishEditModel.setVoiceVolume(1.0f);
                videoPublishEditModel.setMultiEditVideoRecordData(new MultiEditVideoStatusRecordData());
                videoPublishEditModel.setWorkspace(C14D2.LIZ(videoPublishEditModel.getCreativeInfo()));
                Workspace workspace = videoPublishEditModel.getWorkspace();
                if (workspace != null && (fileLJFF = workspace.LJFF()) != null && (path = fileLJFF.getPath()) != null) {
                    str = path;
                }
                videoPublishEditModel.setOutputFile(str);
                pcsCourseActivity.LLILZLL.getValue().setState(new AwS586S0100000_7(videoPublishEditModel, 570));
                Intent intent2 = new Intent(pcsCourseActivity, (Class<?>) PcsVideoPublishActivity.class);
                intent2.putExtra("video_publish_scene_key", EnumC489360JHa.CHOOSE_FROM_ALBUM);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(pcsCourseActivity, intent2, "Context_startActivity_1");
                C1701330uNH.LIZ(intent2, pcsCourseActivity);
                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqrcNHN0ye78R3qH054XPv5bkRqRpo8fsjTvWA=", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {intent2};
                C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/pcs/course/PcsCourseActivity", "startActivity", pcsCourseActivity, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11098, "com/ss/android/ugc/aweme/pcs/course/PcsCourseActivity", "startActivity", null, objArr, pcsCourseActivity, c0wzw, false);
                    return;
                }
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                Activity activity = pcsCourseActivity;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    Activity activity2 = pcsCourseActivity;
                    if (obj != null) {
                        activity2 = (Activity) obj;
                    }
                    Object obj2 = objArr2[1];
                    activity = activity2;
                    if (obj2 != null) {
                        intent2 = (Intent) obj2;
                        activity = activity2;
                    }
                }
                activity.startActivity(intent2);
                c0wst.LIZ(11098, "com/ss/android/ugc/aweme/pcs/course/PcsCourseActivity", "startActivity", null, objArr, activity, c0wzw, true);
            }
        }
    }

    public final void LIZ$1(Intent intent) {
        ArrayList<String> stringArrayListExtra;
        if (intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("key-auto-test-select-media")) != null) {
            C529740Kq4 c529740Kq4 = ((C528320Knm) this.l0).LLJJJ;
            c529740Kq4.getClass();
            if (C298320Bmg.LIZ()) {
                ((LinkedList) c529740Kq4.LLLLJ).addAll(stringArrayListExtra);
                for (String str : c529740Kq4.LLLLJ) {
                    int i = 0;
                    while (true) {
                        if (i < c529740Kq4.LLJLIL.size()) {
                            TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(c529740Kq4.LLJLIL, i);
                            if (C2471909mP.LJIJ(tikTokMediaModel).endsWith(str)) {
                                c529740Kq4.LLLJIL(tikTokMediaModel, -1, C0L90.ALBUM);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    public final void LIZ$2(Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            ((VEEditorAutoStartStopArbiter) this.l0).getClass();
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = (VEEditorAutoStartStopArbiter) this.l0;
            if (!vEEditorAutoStartStopArbiter.LLILZIL) {
                vEEditorAutoStartStopArbiter.LLJILJILJ = vEEditorAutoStartStopArbiter.LLILLL.getState();
                ((VEEditorAutoStartStopArbiter) this.l0).LIZIZ();
            }
        }
    }

    public C580740Mq8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(C580740Mq8 c580740Mq8, Context context, Intent intent) throws Throwable {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c580740Mq8.LIZ$0(intent);
        } else {
            C2408409cA.LIZ();
            c580740Mq8.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(C580740Mq8 c580740Mq8, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c580740Mq8.LIZ$1(intent);
        } else {
            C2408409cA.LIZ();
            c580740Mq8.LIZ$1(intent);
        }
    }

    public static final void onReceive$2(C580740Mq8 c580740Mq8, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c580740Mq8.LIZ$2(intent);
        } else {
            C2408409cA.LIZ();
            c580740Mq8.LIZ$2(intent);
        }
    }
}
