package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0myK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.AITemplateAssetDownloader$downloadData$2", f = "AITemplateAssetDownloader.kt", l = {}, m = "invokeSuspend")
public final class C1416780myK extends C09AX implements Function2<String, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Pair<? extends Integer, ? extends NLEModel>>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1416480mxq LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416780myK(C1416480mxq c1416480mxq, String str, InterfaceC1364105Vn<? super C1416780myK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1416480mxq;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1416780myK c1416780myK = new C1416780myK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1416780myK.LL = obj;
        return c1416780myK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ;
        C1C7U.LIZ("AITemplateAssetDownloader@2497.downloadData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = (String) this.LL;
        C1416480mxq c1416480mxq = this.LLILLJJLI;
        String str2 = this.LLILLL;
        c1416480mxq.getClass();
        CreativeInfo creativeInfoInvoke = null;
        if (C295320Bhq.LIZ()) {
            ArrayList arrayList = new ArrayList();
            List<AutoCutMediaModel> listInvoke = c1416480mxq.LLILZ.LIZLLL.invoke();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
            Iterator<T> it2 = listInvoke.iterator();
            while (true) {
                String str3 = "";
                if (!it2.hasNext()) {
                    break;
                }
                AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) it2.next();
                MetaExt metaExt = new MetaExt(0, null, null, null, null, 0, 0L, 0L, 0, false, 0L, false, 4095, null);
                if (C2286708xd.LIZJ(autoCutMediaModel.filePath)) {
                    str3 = autoCutMediaModel.filePath;
                } else {
                    String str4 = autoCutMediaModel.fileUriPath;
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                metaExt.setPath(str3);
                metaExt.setWidth(autoCutMediaModel.width);
                metaExt.setHeight(autoCutMediaModel.height);
                metaExt.setVideo(autoCutMediaModel.isVideoType);
                metaExt.setDuration(autoCutMediaModel.duration);
                arrayList2.add(metaExt);
            }
            arrayList.addAll(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Function0<CreativeInfo> function0 = c1416480mxq.LLILZ.LJ;
            if (function0 != null) {
                creativeInfoInvoke = function0.invoke();
            }
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(creativeInfoInvoke);
            if (strLJI == null) {
                strLJI = "";
            }
            C23186096q c23186096q = new C23186096q(null, str2, arrayList, arrayList3, strLJI, true, false, str, false, 50624);
            HashMap map = new HashMap();
            map.put("source", "source_auto_cut");
            map.put("autocut_template_type", String.valueOf(EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()));
            map.put("autocut_music_log_id", "not_set");
            map.put("autocut_log_template_url", "not_set");
            map.put("autocut_log_template_url", "not_set");
            map.put("autocut_template_group_id", "");
            map.put("panel_key", "editing_assets");
            c23186096q.LJIILJJIL = map;
            C23157095n.LIZ.getClass();
            objLJ = new C2501209r8(new C1466840oH4(C23157095n.LIZIZ(c23186096q), 5), 3);
        } else {
            objLJ = C09IC.LJ(new C1416980mye(c1416480mxq.LLILZ, str2, str, null));
        }
        C1C7U.LIZIZ("AITemplateAssetDownloader@2497.downloadData$2");
        return objLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Pair<? extends Integer, ? extends NLEModel>>> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
