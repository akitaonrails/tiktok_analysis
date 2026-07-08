package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import njp.a;

/* JADX INFO: renamed from: X.0mye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AITemplateAssetDownloader$requestNLEModel$1$1", f = "AITemplateAssetDownloader.kt", l = {417}, m = "invokeSuspend")
public final class C1416980mye extends C09AX implements Function2<C094D<? super Pair<? extends Integer, ? extends NLEModel>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1415940mwy LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416980mye(C1415940mwy c1415940mwy, String str, String str2, InterfaceC1364105Vn<? super C1416980mye> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1415940mwy;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1416980mye c1416980mye = new C1416980mye(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1416980mye.LLILLJJLI = obj;
        return c1416980mye;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeInfo creativeInfoInvoke;
        C1C7U.LIZ("AITemplateAssetDownloader@2497.requestNLEModel$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            VecMeta vecMeta = new VecMeta();
            List<AutoCutMediaModel> listInvoke = this.LLILLL.LIZLLL.invoke();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
            Iterator<T> it2 = listInvoke.iterator();
            while (true) {
                String str = "";
                if (!it2.hasNext()) {
                    break;
                }
                AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) it2.next();
                Meta meta = new Meta();
                if (C2286708xd.LIZJ(autoCutMediaModel.filePath)) {
                    str = autoCutMediaModel.filePath;
                } else {
                    String str2 = autoCutMediaModel.fileUriPath;
                    if (str2 != null) {
                        str = str2;
                    }
                }
                SmartMovieJniJNI.Meta_setPath(meta.LIZ, meta, str);
                SmartMovieJniJNI.Meta_setWidth(meta.LIZ, meta, autoCutMediaModel.width);
                SmartMovieJniJNI.Meta_setHeight(meta.LIZ, meta, autoCutMediaModel.height);
                SmartMovieJniJNI.Meta_setIsVideo(meta.LIZ, meta, autoCutMediaModel.isVideoType);
                SmartMovieJniJNI.Meta_setDuration(meta.LIZ, meta, autoCutMediaModel.duration);
                arrayList.add(meta);
            }
            vecMeta.addAll(arrayList);
            String str3 = this.LLILZ;
            VecStr vecStr = new VecStr();
            Gson gson = C7740030o.LIZ().getGson();
            Function0<CreativeInfo> function0 = this.LLILLL.LJ;
            if (function0 != null) {
                creativeInfoInvoke = function0.invoke();
            } else {
                creativeInfoInvoke = null;
            }
            NLEModelRequestParams nLEModelRequestParams = new NLEModelRequestParams(str3, vecMeta, vecStr, GsonProtectorUtils.toJson(gson, creativeInfoInvoke));
            String str4 = this.LLILZIL;
            SmartMovieJniJNI.NLEModelRequestParams_setUseResourceId(nLEModelRequestParams.LIZ, nLEModelRequestParams, true);
            SmartMovieJniJNI.NLEModelRequestParams_setTemplateJSON(nLEModelRequestParams.LIZ, nLEModelRequestParams, str4);
            SmartMovieJniJNI.NLEModelRequestParams_setIgnoreCompress(nLEModelRequestParams.LIZ, nLEModelRequestParams, SmartMovieJniJNI.NLEModelRequestParams_getIgnoreCompress(nLEModelRequestParams.LIZ, nLEModelRequestParams));
            SmartMovieJniJNI.NLEModelRequestParams_setEnableAsyncRender(nLEModelRequestParams.LIZ, nLEModelRequestParams, SmartMovieJniJNI.NLEModelRequestParams_getEnableAsyncRender(nLEModelRequestParams.LIZ, nLEModelRequestParams));
            SmartMovieJniJNI.NLEModelRequestParams_setEnableBatchFetch(nLEModelRequestParams.LIZ, nLEModelRequestParams, false);
            UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
            unorderedMapStrStr.put("source", "source_auto_cut");
            unorderedMapStrStr.put("autocut_template_type", String.valueOf(EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()));
            unorderedMapStrStr.put("autocut_music_log_id", "not_set");
            unorderedMapStrStr.put("autocut_log_template_url", "not_set");
            unorderedMapStrStr.put("autocut_log_template_url", "not_set");
            unorderedMapStrStr.put("autocut_template_group_id", "");
            SmartMovieJniJNI.NLEModelRequestParams_setExtraParams(nLEModelRequestParams.LIZ, nLEModelRequestParams, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
            C1418540n1A c1418540n1A = C1418540n1A.LIZ;
            final String str5 = this.LLILZ;
            NLEModelRequestProgressCallback nLEModelRequestProgressCallback = new NLEModelRequestProgressCallback() { // from class: X.0myd
                @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                public final void onCompressDone(VecMeta vecMeta2) {
                }

                @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                public final void onCompressProgress(float f) {
                }

                @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                public final void onNeedFetch(VecStr vecStr2) {
                }

                @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                public final void onFetchProgress(float f) {
                    c094d.LJIIIIZZ(new Pair<>(Integer.valueOf((int) (f * 100)), null));
                }

                @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                public final void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr2) {
                    c094d.LJIIIIZZ(new Pair<>(100, nLEModel));
                    c094d.LJIIJJI(null);
                }

                @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                public final void onSuccess(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr2) {
                    c094d.LJIIIIZZ(new Pair<>(100, nLEModel));
                    c094d.LJIIJJI(null);
                }

                @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
                public final void onFailure(String str6, int i2, String str7, UnorderedMapStrStr unorderedMapStrStr2) {
                    C094D<Pair<Integer, ? extends NLEModel>> c094d2 = c094d;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("634524 ");
                    sbLIZ.append(str5);
                    c094d2.LJIIJJI(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                }
            };
            c1418540n1A.getClass();
            C1418540n1A.LIZJ(nLEModelRequestParams, nLEModelRequestProgressCallback);
            AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(484);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS210S0000000_22, this) == objLJFF) {
                C1C7U.LIZIZ("AITemplateAssetDownloader@2497.requestNLEModel$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITemplateAssetDownloader@2497.requestNLEModel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends Integer, ? extends NLEModel>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
