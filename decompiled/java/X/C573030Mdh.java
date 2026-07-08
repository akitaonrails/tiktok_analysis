package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mvtheme.MVTransitionParam;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573030Mdh implements InterfaceC573470MeP {
    public final /* synthetic */ List<String> LIZ;
    public final /* synthetic */ CreativeModel LIZIZ;
    public final /* synthetic */ Function1<Effect, Unit> LIZJ;
    public final /* synthetic */ Function0<Unit> LIZLLL;

    @Override // X.InterfaceC573470MeP
    public final void onFailed() {
        C564000MAc.LIZJ("PhotoModule downloadMvAndMusicRes failed 2");
        C0L16.LIZ(-1, "downloadMvAndMusicRes", "download failed");
        Function0<Unit> function0 = this.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C573030Mdh(List<String> list, CreativeModel creativeModel, Function1<? super Effect, Unit> function1, Function0<Unit> function0) {
        this.LIZ = list;
        this.LIZIZ = creativeModel;
        this.LIZJ = function1;
        this.LIZLLL = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    @Override // X.InterfaceC573470MeP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final com.ss.android.ugc.templatecore.templatedata.MvThemeData r10, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C573030Mdh.LIZ(com.ss.android.ugc.templatecore.templatedata.MvThemeData, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, boolean, boolean):void");
    }

    public static final void LIZIZ(MvThemeData mvThemeData, CreativeModel creativeModel, MvCreateVideoData mvCreateVideoData, Pair<Integer, Integer> pair, Function1<? super Effect, Unit> function1, String str) {
        Pair<Boolean, Double> pair2;
        if (!TextUtils.isEmpty(mvThemeData.LJ())) {
            AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
            aVUploadMiscInfoStruct.mvThemeId = mvThemeData.LJ();
            MvModel mvModel = new MvModel();
            mvModel.setMvId(mvThemeData.LJ());
            mvModel.setName(mvThemeData.effect.getName());
            mvModel.setMvAnchor(mvThemeData.isMvAnchor);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(mvThemeData.effect.getIconUrl().getUrlList());
            mvModel.setIconUrl(urlModel);
            aVUploadMiscInfoStruct.mvInfo = mvModel;
            aVUploadMiscInfoStruct.sourceId = mvThemeData.sourceId;
            creativeModel.uploadMiscInfoStruct = aVUploadMiscInfoStruct;
            mvCreateVideoData.mvResUnzipPath = mvThemeData.LIZJ();
            mvCreateVideoData.mvType = mvThemeData.mvType;
            mvCreateVideoData.mvAutoSaveToast = mvThemeData.mvAutoSaveToast;
            if (C296010Bix.LIZ() || C295930Bip.LIZ()) {
                Effect effect = mvThemeData.effect;
                if (effect != null) {
                    pair2 = C385400F9e.LIZ(effect);
                } else {
                    pair2 = new Pair<>(Boolean.FALSE, Double.valueOf(0.5d));
                }
                boolean zBooleanValue = pair2.getFirst().booleanValue();
                double dDoubleValue = pair2.getSecond().doubleValue();
                if (str == null) {
                    str = "";
                }
                mvCreateVideoData.mvTransitionParam = new MVTransitionParam(str, Long.valueOf((long) (dDoubleValue * ((double) 1000000))), Boolean.valueOf(zBooleanValue), mvThemeData.effect.getEffectId());
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C570490MZb.LIZJ(C0MPK.LIZ(creativeModel.creativeInfo)));
        sbLIZ.append(C0MPK.LIZJ(".mp4"));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C570490MZb.LJI(new C0VSJ(strLIZIZ));
        mvCreateVideoData.contactVideoPath = strLIZIZ;
        creativeModel.mvModel.mvCreateVideoData = mvCreateVideoData;
        creativeModel.editModel.editPreviewInfo = new C0MOM(pair.getFirst().intValue(), pair.getSecond().intValue()).LIZ(mvCreateVideoData);
        com.ss.android.ugc.aweme.creative.model.template.MvModel mvModel2 = creativeModel.mvModel;
        mvModel2.isPhotoMvMode = true;
        mvModel2.isPhotoMvMode1080p = C573200Mdy.LIZ();
        mvModel2.isPhotoMvMusic = true;
        function1.invoke(null);
    }
}
