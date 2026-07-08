package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineContext;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineTags;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.ICacheAccessor;
import com.ss.android.ugc.aweme.music.understanding.PipelineTag;
import com.ss.android.ugc.aweme.music.understanding.api.ContentUnderstandingResponse;
import com.ss.android.ugc.aweme.music.understanding.api.ExtraParams;
import com.ss.android.ugc.aweme.music.understanding.api.RecommendInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.understanding.tasks.RequestTask$run$1", f = "RequestTask.kt", l = {131}, m = "invokeSuspend")
public final class C2251008rs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ContentPipelineContext LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ ContentUnderstandingResult.ZipBundle LLILZIL;
    public final /* synthetic */ InterfaceC1431080nLO LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2251008rs(ContentPipelineContext contentPipelineContext, String str, ContentUnderstandingResult.ZipBundle zipBundle, InterfaceC1431080nLO interfaceC1431080nLO, String str2, InterfaceC1364105Vn<? super C2251008rs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = contentPipelineContext;
        this.LLILZ = str;
        this.LLILZIL = zipBundle;
        this.LLILZLL = interfaceC1431080nLO;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2251008rs c2251008rs = new C2251008rs(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c2251008rs.LLILLJJLI = obj;
        return c2251008rs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        Object c098200Yq;
        ExtraParams extraParams;
        ContentUnderstandingResult.CostInfo costInfo;
        String str3;
        String string;
        String string2;
        String string3;
        Object objLIZ = obj;
        C1C7U.LIZ("RequestTask@c43b.run$1");
        Object objLJFF = C099R.LJFF();
        int i4 = this.LL;
        boolean z = true;
        String str4 = null;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C2257908sz c2257908sz = this.LLILLL.request.mobData;
                if (c2257908sz != null) {
                    i = c2257908sz.LJFF;
                } else {
                    i = 0;
                }
                if (c2257908sz != null) {
                    i2 = c2257908sz.LJII;
                } else {
                    i2 = 0;
                }
                if (c2257908sz == null) {
                    i3 = 0;
                } else {
                    i3 = c2257908sz.LJI;
                }
                int i5 = i - i2;
                if (C2252008s2.LIZ()) {
                    C2257908sz c2257908sz2 = this.LLILLL.request.mobData;
                    if (c2257908sz2 != null) {
                        c2257908sz2.LJIIIZ = C2286608xc.LJ(1);
                    }
                    C23250099c.LIZLLL(interfaceC497601wk, null, null, new C2250908rr(this.LLILZ, this.LLILZIL, this.LLILLL, this.LLIZ, i5, i3, i2, null), 3);
                    ContentUnderstandingResult.RequestResult requestResult = new ContentUnderstandingResult.RequestResult(this.LLILZ, "async", null, C2286608xc.LJ(0), null, null, this.LLILLL.request);
                    ContentPipelineContext contentPipelineContext = this.LLILLL;
                    ICacheAccessor iCacheAccessor = contentPipelineContext.cacheAccessor;
                    PipelineTag pipelineTag = contentPipelineContext.pipelineTag;
                    ContentPipelineTags contentPipelineTags = ContentPipelineTags.INSTANCE;
                    iCacheAccessor.mo14putZMYo8sw(pipelineTag, contentPipelineTags.m276getNODE_REQUESTq0GeycQ(), requestResult);
                    ContentPipelineContext contentPipelineContext2 = this.LLILLL;
                    contentPipelineContext2.cacheAccessor.mo15putCrossRunqawTgY(contentPipelineContext2.pipelineTag, contentPipelineTags.m276getNODE_REQUESTq0GeycQ(), this.LLILZIL.getZipFilePath(), requestResult);
                    this.LLILZLL.LIZJ(requestResult, false);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RequestTask@c43b.run$1");
                    return unit;
                }
                String str5 = this.LLILZ;
                String zipFilePath = this.LLILZIL.getZipFilePath();
                String fileType = this.LLILZIL.getFileType();
                ContentUnderstandingRequest contentUnderstandingRequest = this.LLILLL.request;
                String str6 = contentUnderstandingRequest.contentType;
                String str7 = "";
                if (str6 == null) {
                    str6 = "";
                }
                String str8 = contentUnderstandingRequest.contentSource;
                if (str8 != null) {
                    str7 = str8;
                }
                String str9 = this.LLIZ;
                C2257908sz c2257908sz3 = contentUnderstandingRequest.mobData;
                if (c2257908sz3 != null) {
                    str = c2257908sz3.LIZ;
                } else {
                    str = null;
                }
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                objLIZ = C2251908s1.LIZ(str5, zipFilePath, fileType, str6, str7, str9, null, i5, i3, i2, str, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("RequestTask@c43b.run$1");
                    return objLJFF;
                }
            }
            ContentUnderstandingResponse contentUnderstandingResponse = (ContentUnderstandingResponse) objLIZ;
            if (contentUnderstandingResponse.status_code == 0) {
                RecommendInfo recommendInfo = contentUnderstandingResponse.getRecommendInfo();
                if (recommendInfo != null) {
                    str2 = recommendInfo.models;
                } else {
                    str2 = null;
                }
                String extraParams2 = contentUnderstandingResponse.getExtraParams();
                if (extraParams2 != null && extraParams2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    try {
                        C1227904rF.LIZ.getClass();
                        c098200Yq = (ExtraParams) C1227904rF.LIZIZ(extraParams2, ExtraParams.class);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    extraParams = (ExtraParams) c098200Yq;
                } else {
                    extraParams = null;
                }
                if (extraParams == null) {
                    costInfo = null;
                } else {
                    Long l = extraParams.musicServerCostMs;
                    if (l != null) {
                        string = l.toString();
                    } else {
                        string = null;
                    }
                    Long l2 = extraParams.musicServerCallRecommendCostMs;
                    if (l2 != null) {
                        string2 = l2.toString();
                    } else {
                        string2 = null;
                    }
                    Long l3 = extraParams.recommendUnderstandingCostMs;
                    if (l3 != null) {
                        string3 = l3.toString();
                    } else {
                        string3 = null;
                    }
                    String logid = contentUnderstandingResponse.getLogid();
                    if (logid == null) {
                        BaseResponse.ServerTimeExtra serverTimeExtra = contentUnderstandingResponse.extra;
                        if (serverTimeExtra != null) {
                            logid = serverTimeExtra.logid;
                        } else {
                            logid = null;
                        }
                    }
                    costInfo = new ContentUnderstandingResult.CostInfo(string, string2, string3, logid);
                }
                RecommendInfo recommendInfo2 = contentUnderstandingResponse.getRecommendInfo();
                if (recommendInfo2 != null) {
                    str3 = recommendInfo2.understandingKey;
                } else {
                    str3 = null;
                }
                RecommendInfo recommendInfo3 = contentUnderstandingResponse.getRecommendInfo();
                if (recommendInfo3 != null) {
                    str4 = recommendInfo3.understandingType;
                }
                ContentUnderstandingResult.RequestResult requestResult2 = new ContentUnderstandingResult.RequestResult(str3, str4, str2, C2286608xc.LJ(contentUnderstandingResponse.status_code), contentUnderstandingResponse.status_msg, costInfo, this.LLILLL.request);
                C1673840tew c1673840tew = C1673840tew.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RequestTask get result:");
                sbLIZ.append(requestResult2);
                C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
                ContentPipelineContext contentPipelineContext3 = this.LLILLL;
                ICacheAccessor iCacheAccessor2 = contentPipelineContext3.cacheAccessor;
                PipelineTag pipelineTag2 = contentPipelineContext3.pipelineTag;
                ContentPipelineTags contentPipelineTags2 = ContentPipelineTags.INSTANCE;
                iCacheAccessor2.mo14putZMYo8sw(pipelineTag2, contentPipelineTags2.m276getNODE_REQUESTq0GeycQ(), requestResult2);
                ContentPipelineContext contentPipelineContext4 = this.LLILLL;
                contentPipelineContext4.cacheAccessor.mo15putCrossRunqawTgY(contentPipelineContext4.pipelineTag, contentPipelineTags2.m276getNODE_REQUESTq0GeycQ(), this.LLILZIL.getZipFilePath(), requestResult2);
                this.LLILZLL.LIZJ(requestResult2, false);
            } else {
                InterfaceC1431080nLO interfaceC1431080nLO = this.LLILZLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("API failed with status ");
                sbLIZ2.append(contentUnderstandingResponse.status_code);
                sbLIZ2.append(": ");
                sbLIZ2.append(contentUnderstandingResponse.status_msg);
                interfaceC1431080nLO.LJ(2, new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2)));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZLL.LJ(4, new IllegalStateException("Network error during API call", e));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RequestTask@c43b.run$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
