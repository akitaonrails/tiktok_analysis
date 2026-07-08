package X;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.142k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202008142k {
    public static final IStickerService.FaceSticker LIZIZ(Effect effect) {
        long jLongValue;
        if (effect != null) {
            IStickerService.FaceSticker faceSticker = new IStickerService.FaceSticker();
            faceSticker.id = effect.getId();
            Long lLJIILIIL = C2095008Iq.LJIILIIL(effect.getEffectId());
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = -1;
            }
            faceSticker.stickerId = jLongValue;
            faceSticker.resourceId = effect.getResourceId();
            UrlModel fileUrl = effect.getFileUrl();
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            toolsUrlModel.uri = fileUrl.getUri();
            toolsUrlModel.urlList = fileUrl.getUrlList();
            faceSticker.fileUrl = toolsUrlModel;
            UrlModel iconUrl = effect.getIconUrl();
            ToolsUrlModel toolsUrlModel2 = new ToolsUrlModel();
            toolsUrlModel2.uri = iconUrl.getUri();
            toolsUrlModel2.urlList = iconUrl.getUrlList();
            faceSticker.iconUrl = toolsUrlModel2;
            faceSticker.localPath = effect.getUnzipPath();
            faceSticker.name = effect.getName();
            faceSticker.hint = effect.getHint();
            faceSticker.types = effect.getTypes();
            faceSticker.tags = effect.getTags();
            faceSticker.requirements = effect.getRequirements();
            faceSticker.sdkExtra = effect.getSdkExtra();
            faceSticker.extra = effect.getExtra();
            return faceSticker;
        }
        return null;
    }

    public static final void LIZ(C19EG c19eg, Intent intent, InterfaceC1631620sYq interfaceC1631620sYq) {
        Fragment fragmentFindFragmentByTag = c19eg.getFragmentManager().findFragmentByTag("async_task");
        FragmentC19772012Xm fragmentC19772012Xm = new FragmentC19772012Xm();
        fragmentC19772012Xm.LL = intent;
        Bundle bundle = new Bundle();
        bundle.putInt("extra_request_code", 10002);
        fragmentC19772012Xm.setArguments(bundle);
        fragmentC19772012Xm.LLILLJJLI = interfaceC1631620sYq;
        if (fragmentFindFragmentByTag != null) {
            c19eg.getFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
        c19eg.getFragmentManager().beginTransaction().add(fragmentC19772012Xm, "async_task").commitAllowingStateLoss();
    }
}
