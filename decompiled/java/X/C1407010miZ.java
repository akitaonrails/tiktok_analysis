package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0miZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.performance.EditorProPerfManager$mobPreviewInBackGround$1", f = "EditorProPerfManager.kt", l = {}, m = "invokeSuspend")
public final class C1407010miZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ C1407020mia LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ Object LLJILLL;
    public final /* synthetic */ int LLJJ;
    public final /* synthetic */ Object LLJJI;
    public final /* synthetic */ int LLJJIII;
    public final /* synthetic */ int LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407010miZ(VideoPublishEditModel videoPublishEditModel, C1407020mia c1407020mia, String str, String str2, float f, int i, String str3, String str4, String str5, String str6, String str7, String str8, int i2, Object obj, int i3, Object obj2, int i4, int i5, InterfaceC1364105Vn<? super C1407010miZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = c1407020mia;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = f;
        this.LLILZLL = i;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = str7;
        this.LLJILJIL = str8;
        this.LLJILJILJ = i2;
        this.LLJILLL = obj;
        this.LLJJ = i3;
        this.LLJJI = obj2;
        this.LLJJIII = i4;
        this.LLJJIJI = i5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407010miZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Map mapLIZ;
        int i;
        int i2;
        int i3;
        NLEModel nLEModelDynamicCast;
        C1C7U.LIZ("EditorProPerfManager@1d17.mobPreviewInBackGround$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        float recordBitrate = AVSettingsWrapper.getRecordBitrate(this.LL);
        int iCom_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality = AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality();
        if (AVSettingsWrapper.enableHardEncodeForRecord()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        String strTranslateNullFilter = VideoPublishEditModel.translateNullFilter(this.LL.getCurFilterIds());
        C0E48 c0e48 = this.LLILLJJLI.LIZ;
        if (c0e48 != null && (nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c0e48).getStage())) != null) {
            mapLIZ = C350140Do4.LIZ(C351220Dpo.LLLLLLL(nLEModelDynamicCast.getDuration()), nLEModelDynamicCast);
        } else {
            mapLIZ = null;
        }
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(this.LL);
        c0labLJIILIIL.LJ("creation_id", this.LLILLL);
        c0labLJIILIIL.LJ("shoot_way", this.LLILZ);
        c0labLJIILIIL.LIZJ(C2286608xc.LIZLLL(this.LLILZIL), "play_fps");
        c0labLJIILIIL.LJ("next_action", "go_edit");
        c0labLJIILIIL.LIZ(this.LLILZLL, "beautify_used");
        c0labLJIILIIL.LIZ(1, "is_composer");
        if (C294160Bfy.LIZ()) {
            c0labLJIILIIL.LJ("beautify_info", C1409940mnI.LJ(C1409940mnI.LIZIZ));
        }
        c0labLJIILIIL.LJ("duration", this.LLIZ);
        c0labLJIILIIL.LJ("filter_id_list", strTranslateNullFilter);
        c0labLJIILIIL.LJ("is_hardcode", str);
        c0labLJIILIIL.LIZ(iCom_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality, "video_quality");
        c0labLJIILIIL.LIZJ(C2286608xc.LIZLLL(recordBitrate), "bitrate");
        c0labLJIILIIL.LJ("resolution", this.LLIZLLLIL);
        c0labLJIILIIL.LJ("content_type", this.LLJ);
        c0labLJIILIIL.LJ("content_source", this.LLJI);
        c0labLJIILIIL.LJ("prop_list", this.LLJIJIL);
        c0labLJIILIIL.LJ("prop_selected_from", this.LLJILJIL);
        c0labLJIILIIL.LIZ(this.LLJILJILJ, "source_duration");
        c0labLJIILIIL.LIZLLL(this.LLJILLL, "preview_fps");
        c0labLJIILIIL.LIZ(this.LLJJ, "preview_lag_count");
        c0labLJIILIIL.LIZLLL(this.LLJJI, "preview_lag_total_duration");
        c0labLJIILIIL.LIZ(this.LLJJIII, "preview_serious_lag_count");
        c0labLJIILIIL.LIZ(this.LLJJIJI, "is_multi_content");
        if (mapLIZ != null) {
            c0labLJIILIIL.LJI(mapLIZ);
        }
        int i4 = 0;
        this.LLILLJJLI.LJ.postValue(new C1403050mcB(0));
        int[] iArrLIZIZ = C1404710mer.LIZIZ(this.LL.videoPath());
        C1407020mia c1407020mia = this.LLILLJJLI;
        if (iArrLIZIZ != null) {
            i = iArrLIZIZ[7];
            i2 = iArrLIZIZ[6];
            i3 = iArrLIZIZ[0];
            i4 = iArrLIZIZ[1];
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        c1407020mia.getClass();
        C1407020mia.LIZJ(c0labLJIILIIL, i, i2, i3, i4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProPerfManager@1d17.mobPreviewInBackGround$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
