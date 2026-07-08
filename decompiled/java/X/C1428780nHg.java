package X;

import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.cutsame.AuthorInfo;
import com.ss.android.ugc.aweme.cutsame.CutSameVideo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428780nHg implements C0L7P {
    public final Context LIZ;
    public final C573920Mf8 LIZIZ;
    public final TemplateSourceConfig LIZJ;
    public C11JF LIZLLL;
    public C11JF LJ;
    public String LJFF;
    public String LJI;
    public C0L7L LJII;
    public C1428790nHh LJIIIIZZ;

    @Override // X.C0L7P
    public final void cancel() {
        C0L7L c0l7l = this.LJII;
        if (c0l7l != null) {
            c0l7l.LJI(null);
        }
    }

    public static void LIZIZ(NLETemplateModel nLETemplateModel) {
        VecNLEResourceNodeSPtr allResources;
        if (nLETemplateModel != null && (allResources = nLETemplateModel.getAllResources()) != null) {
            for (NLEResourceNode nLEResourceNode : allResources) {
                String resourceFile = nLEResourceNode.getResourceFile();
                if (resourceFile != null && resourceFile.length() != 0) {
                    nLEResourceNode.setResourceFile(u.LJJIFFI(nLEResourceNode.getResourceFile(), "/./", "/", false));
                }
            }
        }
    }

    public static C1428790nHh LIZJ(C1428790nHh c1428790nHh, C1428790nHh c1428790nHh2) {
        int i;
        String str;
        String str2 = c1428790nHh2.LIZ;
        int i2 = c1428790nHh2.LIZIZ;
        NLETemplateModel nLETemplateModel = c1428790nHh2.LIZJ;
        NLEModel nLEModel = c1428790nHh2.LIZLLL;
        long j = c1428790nHh2.LJ;
        String str3 = c1428790nHh2.LJFF;
        String str4 = c1428790nHh2.LJI;
        String str5 = c1428790nHh2.LJII;
        String str6 = c1428790nHh2.LJIIIIZZ;
        String str7 = c1428790nHh2.LJIIIZ;
        int i3 = c1428790nHh.LJIIJ;
        AVMusic aVMusic = c1428790nHh.LJIIJJI;
        String str8 = c1428790nHh.LJIIL;
        Boolean bool = c1428790nHh.LJIILIIL;
        if (c1428790nHh2.LIZ()) {
            i = c1428790nHh2.LJIILJJIL;
        } else {
            i = c1428790nHh.LJIILJJIL;
        }
        if (c1428790nHh2.LIZ()) {
            str = c1428790nHh2.LJIILL;
        } else {
            str = c1428790nHh.LJIILL;
        }
        return new C1428790nHh(str2, i2, nLETemplateModel, nLEModel, j, str3, str4, str5, str6, str7, i3, aVMusic, str8, bool, i, str);
    }

    public C1428780nHg(Context context, C573920Mf8 c573920Mf8, TemplateSourceConfig templateSourceConfig) {
        this.LIZ = context;
        this.LIZIZ = c573920Mf8;
        this.LIZJ = templateSourceConfig;
    }

    public final C19482711Kf LIZLLL(final String str, final CutsameDataItem cutsameDataItem, final C11RK c11rk) {
        if (cutsameDataItem != null) {
            return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0nCC
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<C1428790nHh> c09aj) {
                    long j;
                    String str2;
                    String str3;
                    C1C7U.LIZ("TemplateWithMusicDownloader@9a2f.provideTemplateDownloadObservable$1");
                    String string = null;
                    c11rk.onNext(new C0L7F("stage_fetch_template", 100.0f, null, 12));
                    C0LE8.LIZIZ(this.LIZJ);
                    C1428780nHg c1428780nHg = this;
                    CutsameDataItem cutsameDataItem2 = cutsameDataItem;
                    String str4 = cutsameDataItem2.templateUrl;
                    String str5 = cutsameDataItem2.md5;
                    String str6 = str;
                    if (C1412660mrg.LIZJ(cutsameDataItem2.templateType) == EnumC1412640mre.CUT_SAME) {
                        j = 4;
                    } else {
                        j = 0;
                    }
                    CutsameDataItem cutsameDataItem3 = cutsameDataItem;
                    CutSameVideo cutSameVideo = cutsameDataItem3.video;
                    if (cutSameVideo != null) {
                        str2 = cutSameVideo.coverUrl;
                    } else {
                        str2 = null;
                    }
                    String str7 = cutsameDataItem3.title;
                    AuthorInfo authorInfo = cutsameDataItem3.author;
                    if (authorInfo != null) {
                        str3 = authorInfo.nickname;
                    } else {
                        str3 = null;
                    }
                    Music music = cutsameDataItem3.music;
                    if (music != null) {
                        string = Long.valueOf(music.getId()).toString();
                    }
                    c1428780nHg.LIZ(str4, str5, str6, j, str2, str7, str3, string, c09aj, c11rk);
                    C1C7U.LIZIZ("TemplateWithMusicDownloader@9a2f.provideTemplateDownloadObservable$1");
                }
            });
        }
        if (str != null && str.length() != 0) {
            return C11NZ.LJIJJLI(new C1466900oHA(this, c11rk, str, 0));
        }
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0nHe
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<C1428790nHh> c09aj) {
                C1C7U.LIZ("TemplateWithMusicDownloader@9a2f.provideTemplateDownloadObservable$2");
                c09aj.onNext(new C1428790nHh(str, 3, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (AVMusic) null, (String) null, (Boolean) null, 110, "", 16380));
                c09aj.onComplete();
                C1C7U.LIZIZ("TemplateWithMusicDownloader@9a2f.provideTemplateDownloadObservable$2");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(final String str, final String str2, final String str3, final long j, final String str4, final String str5, final String str6, String str7, final C09AJ<C1428790nHh> c09aj, final C11RK<C0L7F> c11rk) {
        boolean z;
        INLETemplateOfflineService iNLETemplateOfflineService;
        final String str8 = str7;
        boolean zLJI = MethodIDManager.LJI(202447);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && ((str2 != null && str2.length() != 0) || ((iNLETemplateOfflineService = (INLETemplateOfflineService) ServiceManager.get().getService(INLETemplateOfflineService.class)) != null && iNLETemplateOfflineService.LJFF()))) {
            NLETemplateModel nLETemplateModel = null;
            if (this.LIZ == null) {
                C0LCY.LIZ(LogLevel.LEVEL_ERROR, "Request AutoCut template detail failure: invalid activity");
                if (str8 == null) {
                    str8 = null;
                }
                c09aj.onNext(new C1428790nHh(str3, 3, nLETemplateModel, j, str, str4, str5, str6, str8, 0, (AVMusic) (null == true ? 1 : 0), (String) (null == true ? 1 : 0), (Boolean) (null == true ? 1 : 0), 107, (String) (null == true ? 1 : 0), 48140));
                c09aj.onComplete();
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            c11rk.onNext(new C0L7F("stage_fetch_template", 100.0f, null, 12));
            c11rk.onNext(new C0L7F("stage_download_template", 0.0f, null, 12));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start download template info: templateId = ");
            sbLIZ.append(str3);
            sbLIZ.append(", templateUrl = ");
            sbLIZ.append(str);
            sbLIZ.append(", md5 = ");
            sbLIZ.append(str2);
            C0LCY.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
            ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
            Context context = this.LIZ;
            C573920Mf8 c573920Mf8 = this.LIZIZ;
            iTemplateResourceService.LJIIIZ(context, str, new C1428840nHm(str2, (Boolean) null, c573920Mf8.LIZJ, (NLEModelDownloader) null, c573920Mf8.LIZIZ, c573920Mf8.LIZ, false, false, new NLEPrepareListener() { // from class: X.0nHf
                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onPreSuccess(NLETemplateModel nLETemplateModel2) {
                    C0L7L c0l7l = this.LJII;
                    if (c0l7l != null) {
                        c0l7l.onPreSuccess(nLETemplateModel2);
                    }
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onSuccess(NLETemplateModel nLETemplateModel2) {
                    if (nLETemplateModel2 == null) {
                        C09AJ<C1428790nHh> c09aj2 = c09aj;
                        String str9 = str8;
                        if (str9 == null) {
                            str9 = null;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("templateId = ");
                        sbLIZ2.append(str3);
                        sbLIZ2.append(", templateUrl = ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", md5 = ");
                        sbLIZ2.append(str2);
                        c09aj2.onNext(new C1428790nHh(str3, 3, (NLETemplateModel) null, j, str, str4, str5, str6, str9, 0, (AVMusic) null, (String) null, (Boolean) null, 108, C2188811AlT.LIZIZ(sbLIZ2), 15372));
                        c09aj.onComplete();
                        return;
                    }
                    c11rk.onNext(new C0L7F("stage_download_template", 100.0f, nLETemplateModel2, 8));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Download template success: ");
                    sbLIZ3.append(nLETemplateModel2);
                    C0LCY.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
                    C09AJ<C1428790nHh> c09aj3 = c09aj;
                    this.getClass();
                    C1428780nHg.LIZIZ(nLETemplateModel2);
                    String str10 = str8;
                    if (str10 == null) {
                        str10 = null;
                    }
                    c09aj3.onNext(new C1428790nHh(str3, 2, nLETemplateModel2, j, str, str4, str5, str6, str10, 0, (AVMusic) null, (String) null, (Boolean) null, 0, (String) null, 64520));
                    c09aj.onComplete();
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onError(int i, String str9) {
                    c09aj.onNext(new C1428790nHh(str3, 3, (NLETemplateModel) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (AVMusic) null, (String) null, (Boolean) null, i, str9, 16380));
                    c09aj.onComplete();
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onProgress(float f, String str9) {
                    c11rk.onNext(new C0L7F("stage_download_template", f * 100, null, 12));
                }
            }, 410), null, -1);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Request AutoCut template detail failure: invalid data: templateUrl = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", md5 = ");
        sbLIZ2.append(str2);
        C0LCY.LIZ(LogLevel.LEVEL_ERROR, C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("templateId = ");
        sbLIZ3.append(str3);
        sbLIZ3.append(", templateUrl = ");
        sbLIZ3.append(str);
        sbLIZ3.append(", md5 = ");
        sbLIZ3.append(str2);
        c09aj.onNext(new C1428790nHh(str3, 3, (NLETemplateModel) null, j, str, str4, str5, str6, str8, 0, (AVMusic) (null == true ? 1 : 0), (String) (null == true ? 1 : 0), (Boolean) (null == true ? 1 : 0), 106, C2188811AlT.LIZIZ(sbLIZ3), 15372));
        c09aj.onComplete();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
