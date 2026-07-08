package X;

import Y.ACallableS23S1000000_8;
import Y.ACallableS427S0100000_22;
import Y.AObjectS295S0200000_22;
import Y.ARunnableS91S0200000_22;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import lth.o;

/* JADX INFO: renamed from: X.0nYD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439030nYD {
    public static final C1439030nYD LIZ = new C1439030nYD();

    public static Bundle LIZJ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        Bundle bundle = new Bundle();
        if (C297790Blp.LIZ()) {
            C1435600nSg.LIZIZ(videoPublishEditModel);
        }
        videoPublishEditModel.mIsFromDraft = true;
        videoPublishEditModel.userClickPublishTime = SystemClock.uptimeMillis();
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            i = 11;
        } else {
            i = 0;
        }
        bundle.putInt("video_type", i);
        C786410Ut5.LJJIZ(bundle, "extra_video_publish_args", videoPublishEditModel);
        C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
        bundle.putInt("publish_permission", videoPublishEditModel.isPrivate);
        String creationId = videoPublishEditModel.getCreationId();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("content_type", "video");
        c0lab.LIZ(1, "retry_publish");
        c0lab.LIZ(i, "video_type");
        c0lab.LIZ(1, "video_upload_type");
        C20684815ws.LJIILLIIL("performance_publish", c0lab.LIZ);
        bundle.putBoolean("publish_retry", true);
        return bundle;
    }

    public static AwemeDraft LJFF(List list) {
        AwemeDraft awemeDraftLJI;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!TextUtils.isEmpty(str) && (awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(str)))) != null) {
                    if (!C1433730nPf.LJIJI(str) && !C1433730nPf.LJIIZILJ(str)) {
                        return awemeDraftLJI;
                    }
                    C0CHQ.LIZ().getPublishService().LJIIL();
                    C1436830nUf.LJIJI(new C572660Md6(awemeDraftLJI));
                }
            }
            return null;
        }
        return null;
    }

    public static Intent LIZ(Activity activity, Bundle bundle) {
        String name;
        InterfaceC376620Epg interfaceC376620Epg = o.LIZJ;
        Class<? extends C19EG> clsLIZJ = C19221910Hx.LIZJ();
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishServiceImpl startPublish containerActivityClass:");
        if (clsLIZJ == null) {
            name = "null";
        } else {
            name = clsLIZJ.getName();
        }
        sbLIZ.append(name);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        Intent intent = new Intent(activity, clsLIZJ);
        intent.addFlags(603979776);
        InterfaceC376620Epg interfaceC376620Epg2 = o.LIZJ;
        boolean zLJI = C19221910Hx.LJI();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PublishServiceImpl startPublish isPublishContainerActivityClassAlive:");
        sbLIZ2.append(zLJI);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ2));
        if (!zLJI) {
            C201955140j.LJIILJJIL(c830690WiJ, "PublishServiceImpl startPublish EXTRA_ENABLE_OPTIMIZE_MAIN_NOT_IN_STACK:");
            intent.putExtra("enable_optimize_main_not_in_stack", true);
        }
        if (bundle.getBoolean("review_video_fast_publish", false)) {
            intent.putExtra("review_video_fast_publish", true);
        }
        if (bundle.getBoolean("is_nows", false)) {
            intent.putExtra("is_nows", true);
        }
        if (bundle.getString("shoot_way") != null) {
            intent.putExtra("shoot_way", bundle.getString("shoot_way"));
        }
        if (bundle.getString("creation_id") != null) {
            intent.putExtra("creation_id", bundle.getString("creation_id"));
        }
        intent.putExtra("publish_bundle", bundle);
        intent.setExtrasClassLoader(clsLIZJ.getClassLoader());
        return intent;
    }

    public static void LIZLLL(String str, IGetPublishDraftCallback iGetPublishDraftCallback) {
        C15O7.LIZIZ(new ACallableS23S1000000_8(str, 4), C741040T5a.LIZ, null).LJ(new C1466870oH7(iGetPublishDraftCallback, 6), C15O7.LJIIIIZZ, null);
    }

    public static String LJI(C19EG c19eg, Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("publish_bundle", bundle);
        String strLIZJ = C1433730nPf.LIZJ(bundle);
        C1433730nPf.LJJII();
        if (strLIZJ == null) {
            C201955140j.LJII(C830690WiJ.LIZIZ, "Already In publish, can not start new");
            return null;
        }
        intent.putExtra("multi_publish_id", strLIZJ);
        o.LJIILJJIL.LJI(c19eg, intent, Boolean.FALSE);
        return strLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0262  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ(X.C19EG r17, android.os.Bundle r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1439030nYD.LJIIIIZZ(X.19EG, android.os.Bundle):java.lang.String");
    }

    public final void LJ(boolean z, IGetPublishDraftCallback iGetPublishDraftCallback) {
        if (((Boolean) C285090BFj.LJLJJLL.getValue()).booleanValue() && !z) {
            C0CN5.LIZIZ(Long.valueOf(((Number) C285090BFj.LJLJJL.getValue()).longValue()), new ARunnableS91S0200000_22(this, iGetPublishDraftCallback, 29));
        } else {
            C15O7.LIZIZ(new ACallableS427S0100000_22(this, 7), C741040T5a.LIZ, null).LJ(new C1466870oH7(iGetPublishDraftCallback, 7), C15O7.LJIIIIZZ, null);
        }
    }

    public static Bundle LIZIZ(AwemeDraft awemeDraft, PublishFailureReason publishFailureReason, boolean z) {
        Bundle bundleLIZJ;
        new C1438570nXT("PublishServiceImpl");
        VideoPublishEditModel videoPublishEditModelLIZJ = C1438570nXT.LIZJ(awemeDraft, false);
        if (awemeDraft.LJIILL()) {
            if (((Boolean) C0ASM.LIZ.getValue()).booleanValue()) {
                C1435600nSg.LIZIZ(videoPublishEditModelLIZJ);
            }
            bundleLIZJ = C1436250nTj.LIZ(videoPublishEditModelLIZJ, true);
            if (z && videoPublishEditModelLIZJ.getTtStoryUploadModel() != null) {
                videoPublishEditModelLIZJ.getTtStoryUploadModel().setStartPublishTime(System.currentTimeMillis());
            }
        } else {
            bundleLIZJ = LIZJ(videoPublishEditModelLIZJ);
        }
        if (publishFailureReason != null) {
            C786410Ut5.LJJIJL(bundleLIZJ, "retry_reason", publishFailureReason);
        }
        return bundleLIZJ;
    }

    public static void LJII(C19EG c19eg, C1439050nYF c1439050nYF, boolean z) {
        String str;
        AwemeDraft awemeDraft = c1439050nYF.LIZ;
        Bundle bundleLIZIZ = LIZIZ(awemeDraft, c1439050nYF.LIZIZ, true);
        if (awemeDraft.LIZ.transientPostPageModel.LJJJJLI) {
            str = "postAutoRetry";
        } else {
            str = "postUserRetry";
        }
        C0CHQ.LIZ().LJI().LIZJ().LIZIZ(awemeDraft, str, "");
        AudioRecorderParam audioRecorderParam = awemeDraft.LJJJJIZL.audioRecorderParam;
        if (audioRecorderParam != null) {
            audioRecorderParam.setAudioRecordIndex(-1);
        }
        Keva keva = C542480LPi.LIZ;
        String strLIZ = awemeDraft.LIZ();
        Keva keva2 = C542480LPi.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        String str2 = C542480LPi.LIZIZ;
        sbLIZ.append(str2);
        int i = keva2.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZ);
        sbLIZ2.append(str2);
        keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i + 1);
        String strLJI = LJI(c19eg, bundleLIZIZ);
        if (z && c19eg != null && strLJI != null) {
            PublishModel publishModel = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getPublishModel(strLJI);
            if (publishModel != null) {
                PublishProgressDialogAddHelper publishProgressDialogAddHelper = PublishProgressDialogAddHelper.LIZ;
                AObjectS295S0200000_22 aObjectS295S0200000_22 = new AObjectS295S0200000_22(c19eg, publishModel, 0);
                publishProgressDialogAddHelper.getClass();
                PublishProgressDialogAddHelper.LIZ(publishProgressDialogAddHelper, c19eg, false, 0, 0, false, aObjectS295S0200000_22, false, false, false, false, 988);
                return;
            }
            PublishProgressDialogAddHelper publishProgressDialogAddHelper2 = PublishProgressDialogAddHelper.LIZ;
            Function0 function0 = new Function0() { // from class: X.0nYG
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.FALSE;
                }
            };
            publishProgressDialogAddHelper2.getClass();
            PublishProgressDialogAddHelper.LIZ(publishProgressDialogAddHelper2, c19eg, false, 0, 0, false, function0, false, false, false, false, 988);
        }
    }
}
