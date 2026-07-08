package X;

import Y.ACallableS427S0100000_22;
import android.util.Base64;
import com.bytedance.ies.nle.editor_jni.INLEHTTPClientDelegateWrapper;
import com.bytedance.ies.nle.editor_jni.NLEBase64ResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEMediaCloudEdit;
import com.bytedance.ies.nle.editor_jni.NLEMediaRemoteCacheStrategy;
import com.bytedance.ies.nle.editor_jni.NLEMediaRemoteConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper;
import com.bytedance.ies.nle.editor_jni.NLEModelExporterListenerParamBody;
import com.bytedance.ies.nle.editor_jni.NLENetworkClientDelegateWrapper;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVidResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.publish.model.CloudEditUploadAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440960nbK extends AbstractC1434490nQt {
    public C1431070nLN LLILZLL;
    public C1434960nRe LLIZ;
    public C1440980nbM LLIZLLLIL;
    public C918190a09 LLJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0nbO] */
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
    static {
        C1440970nbL c1440970nbL = C1440970nbL.LIZ;
        synchronized (c1440970nbL) {
            if (!C1440970nbL.LIZIZ) {
                NLE.INSTANCE.getLibraryLoader().onLoadNativeLibs(C1697810uHb.LJ("NLEMediaRemoteJni"));
                INLEHTTPClientDelegateWrapper iNLEHTTPClientDelegateWrapper = C1440970nbL.LIZJ;
                if (iNLEHTTPClientDelegateWrapper != null) {
                    NLENetworkClientDelegateWrapper.setHttpClientWrapper(iNLEHTTPClientDelegateWrapper);
                }
                C1440970nbL.LIZIZ = true;
            }
        }
        c1440970nbL.LIZ(new AbstractC1441010nbP() { // from class: X.0nbO
            {
                new ConcurrentHashMap();
            }
        });
    }

    public final void LJIILJJIL() {
        InterfaceC1452170ntP interfaceC1452170ntP;
        C1440980nbM c1440980nbM = this.LLIZLLLIL;
        if (c1440980nbM != null && (interfaceC1452170ntP = c1440980nbM.LIZIZ) != null) {
            C15O7.LIZJ(new ACallableS427S0100000_22(interfaceC1452170ntP, 15));
        }
        C918190a09 c918190a09 = this.LLJ;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
        this.LLJ = null;
        C1441020nbQ.LIZ = null;
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.CLOUD_MERGE;
    }

    public final void LJIILL(AbstractC1405090mfT abstractC1405090mfT) {
        C1431070nLN c1431070nLN = this.LLILZLL;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LJ(abstractC1405090mfT, false);
        LJIILJJIL();
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        C1440990nbN c1440990nbN;
        super.LIZIZ(abstractC1404540mea, interfaceC1434410nQl);
        C1440980nbM c1440980nbM = this.LLIZLLLIL;
        if (c1440980nbM != null && (c1440990nbN = c1440980nbM.LIZJ) != null) {
            c1440990nbN.cancelExport();
        }
        LJIILJJIL();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0nbN, com.bytedance.ies.nle.editor_jni.NLEMediaCloudEdit] */
    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        boolean z;
        List<StickerItemModel> list;
        StickerItemModel next;
        String str;
        String str2;
        List<CanvasFilterParam> transformList;
        CanvasFilterParam canvasFilterParam;
        String effectId;
        List<CanvasFilterParam> transformList2;
        CanvasFilterParam canvasFilterParam2;
        String sourceVID;
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        ForwardVideo forwardVideo;
        this.LLILZLL = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof C1434960nRe) {
                if (next2 != null) {
                    this.LLIZ = (C1434960nRe) next2;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next3 = it3.next();
                        if (next3 instanceof C1404770mex) {
                            if (next3 != null) {
                                CloudEditUploadAuthConfig cloudEditUploadAuthConfig = ((UploadAuthKeyConfig) ((C1404770mex) next3).LIZ).cloudEditUploadAuthConfig;
                                if (cloudEditUploadAuthConfig == null) {
                                    LJIILL(new C1405080mfS(new IllegalStateException("get authKey failed")));
                                    return;
                                }
                                C1434960nRe c1434960nRe = this.LLIZ;
                                if (c1434960nRe == null) {
                                    c1434960nRe = null;
                                }
                                VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
                                C1436160nTa c1436160nTa = new C1436160nTa(this);
                                C1440980nbM c1440980nbM = new C1440980nbM(c1436160nTa, videoPublishEditModel, cloudEditUploadAuthConfig);
                                final AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 847);
                                final AwS601S0100000_22 awS601S0100000_222 = new AwS601S0100000_22(this, 848);
                                final NLEMediaRemoteConfig nLEMediaRemoteConfig = new NLEMediaRemoteConfig();
                                nLEMediaRemoteConfig.setAccessKey(cloudEditUploadAuthConfig.accessKeyId);
                                nLEMediaRemoteConfig.setSecretAccessKey(cloudEditUploadAuthConfig.secretAccessKey);
                                nLEMediaRemoteConfig.setSessionToken(cloudEditUploadAuthConfig.sessionToken);
                                nLEMediaRemoteConfig.setApplication(cloudEditUploadAuthConfig.application);
                                nLEMediaRemoteConfig.setHost(C1375500ltk.LIZJ(cloudEditUploadAuthConfig.host));
                                nLEMediaRemoteConfig.setUser(cloudEditUploadAuthConfig.user);
                                nLEMediaRemoteConfig.setUploader(cloudEditUploadAuthConfig.uploader);
                                nLEMediaRemoteConfig.setScene("D_forward_to_daily");
                                nLEMediaRemoteConfig.setCacheStrategy(NLEMediaRemoteCacheStrategy.MEMORY);
                                nLEMediaRemoteConfig.setGetProgressTaskInternalMs(500);
                                nLEMediaRemoteConfig.setRequestTimeOutSecond(60);
                                ?? r6 = new NLEMediaCloudEdit(nLEMediaRemoteConfig) { // from class: X.0nbN
                                    @Override // com.bytedance.ies.nle.editor_jni.NLEMediaCloudEdit
                                    public final NLEError setCompileListener(NLEModelExportListenerWrapper nLEModelExportListenerWrapper) {
                                        NLEError compileListener = super.setCompileListener(nLEModelExportListenerWrapper);
                                        if (nLEModelExportListenerWrapper != null) {
                                            nLEModelExportListenerWrapper.delete();
                                        }
                                        return compileListener;
                                    }
                                };
                                r6.setCompileListener(new NLEModelExportListenerWrapper() { // from class: X.0mqN
                                    @Override // com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper
                                    public final void onCompileDone(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody) {
                                        String strParam;
                                        super.onCompileDone(nLEModelExporterListenerParamBody);
                                        if (nLEModelExporterListenerParamBody != null && (strParam = nLEModelExporterListenerParamBody.getStrParam()) != null && strParam.length() > 0) {
                                            awS601S0100000_222.invoke(new C1411830mqL(strParam));
                                        } else {
                                            awS601S0100000_222.invoke(new C1411820mqK(0, 15));
                                        }
                                    }

                                    @Override // com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper
                                    public final void onCompileProgress(float f) {
                                        super.onCompileProgress(f);
                                        awS601S0100000_22.invoke(Float.valueOf(f / 100.0f));
                                    }

                                    @Override // com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper
                                    public final void onCompileStart(NLEModelExporterListenerParamBody nLEModelExporterListenerParamBody) {
                                        super.onCompileStart(nLEModelExporterListenerParamBody);
                                    }

                                    @Override // com.bytedance.ies.nle.editor_jni.NLEModelExportListenerWrapper
                                    public final void onCompileError(int i, int i2, float f, String str3) {
                                        super.onCompileError(i, i2, f, str3);
                                        awS601S0100000_222.invoke(new C1411820mqK(i, i2, f, str3));
                                    }
                                });
                                InterfaceC1452170ntP interfaceC1452170ntP = (InterfaceC1452170ntP) c1436160nTa.invoke();
                                c1440980nbM.LIZIZ = interfaceC1452170ntP;
                                if (!(interfaceC1452170ntP instanceof C1463670oBx)) {
                                    awS601S0100000_222.invoke(new C1411820mqK(-3, 14));
                                } else {
                                    NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(((C1463670oBx) interfaceC1452170ntP).LIZJ().deepClone());
                                    NLEModel nLEModel = C1441020nbQ.LIZ;
                                    int nickNameStyle = 1;
                                    if ((nLEModel == null || nLEModelDynamicCast.unorderEquals(nLEModel)) && !C1428520nHG.LJJJJI(videoPublishEditModel)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    C1441020nbQ.LIZ = null;
                                    if (z) {
                                        awS601S0100000_222.invoke(new C1411820mqK(-2, 14));
                                    } else {
                                        Iterator<NLETrack> it4 = nLEModelDynamicCast.getTracks().iterator();
                                        while (true) {
                                            String str3 = "";
                                            if (it4.hasNext()) {
                                                NLETrack next4 = it4.next();
                                                if (next4.getEnable() && next4.getMainTrack()) {
                                                    VecNLETrackSlotSPtr sortedSlots = next4.getSortedSlots();
                                                    if (sortedSlots.size() != 1) {
                                                        break;
                                                    }
                                                    NLETrackSlot nLETrackSlot = sortedSlots.get(0);
                                                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                                                    if (nLESegmentVideoDynamicCast != null) {
                                                        NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                                                        if (resource != null) {
                                                            CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
                                                            if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null || (forwardVideo = forwardCanvasExtra.video) == null || (sourceVID = forwardVideo.getSourceVID()) == null) {
                                                                sourceVID = "";
                                                            }
                                                            resource.setResourceId(new NLEVidResourceProtocol(sourceVID).toResourceId());
                                                        }
                                                        NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
                                                        if (resource2 != null) {
                                                            resource2.setResourceFile("");
                                                        }
                                                    }
                                                    VecNLEVideoAnimationSPtr videoAnims = nLETrackSlot.getVideoAnims();
                                                    if (videoAnims.size() != 1) {
                                                        break;
                                                    }
                                                    NLESegmentVideoAnimation segment = videoAnims.get(0).getSegment();
                                                    if (segment != null) {
                                                        NLEResourceNode resource3 = segment.getResource();
                                                        if (resource3 != null) {
                                                            CanvasVideoData canvasVideoData2 = videoPublishEditModel.getCanvasVideoData();
                                                            if (canvasVideoData2 == null || (transformList2 = canvasVideoData2.getTransformList()) == null || (canvasFilterParam2 = (CanvasFilterParam) C13LP.LJJJLL(transformList2)) == null || (effectId = canvasFilterParam2.getEffectId()) == null) {
                                                                effectId = "";
                                                            }
                                                            resource3.setResourceId(new NLELokiResourceProtocol(effectId).toResourceId());
                                                        }
                                                        NLEResourceNode resource4 = segment.getResource();
                                                        if (resource4 != null) {
                                                            resource4.setResourceFile("");
                                                        }
                                                    }
                                                } else if (next4.getEnable()) {
                                                    Iterator<NLETrackSlot> it5 = next4.getSortedSlots().iterator();
                                                    while (it5.hasNext()) {
                                                        NLEResourceNode resource5 = it5.next().getMainSegment().getResource();
                                                        if (resource5.getResourceType() == NLEResType.IMAGE_STICKER) {
                                                            C0VSJ c0vsj = new C0VSJ(resource5.getResourceFile());
                                                            if (c0vsj.exists()) {
                                                                resource5.setResourceId(new NLEBase64ResourceProtocol(Base64.encodeToString(C2106208My.LIZIZ(new C0VSP(c0vsj)), 2)).toResourceId());
                                                                resource5.setResourceFile("");
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
                                                if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                                                    Iterator<StickerItemModel> it6 = list.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next = it6.next();
                                                            if (next.type == 1000) {
                                                                break;
                                                            }
                                                        } else {
                                                            next = null;
                                                            break;
                                                        }
                                                    }
                                                    StickerItemModel stickerItemModel = next;
                                                    if (stickerItemModel != null) {
                                                        try {
                                                            TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, TextStickerData.class);
                                                            if (textStickerData != null) {
                                                                CanvasVideoData canvasVideoData3 = videoPublishEditModel.getCanvasVideoData();
                                                                if (canvasVideoData3 != null && (transformList = canvasVideoData3.getTransformList()) != null && (canvasFilterParam = (CanvasFilterParam) C13LP.LJJJLL(transformList)) != null) {
                                                                    nickNameStyle = canvasFilterParam.getNickNameStyle();
                                                                }
                                                                String textStr = textStickerData.getTextStr();
                                                                if (textStr != null) {
                                                                    str3 = textStr;
                                                                }
                                                                if (nickNameStyle == 0) {
                                                                    str = "inside";
                                                                } else {
                                                                    str = "outside";
                                                                }
                                                                if (C19630711rF.LIZ(str3)) {
                                                                    str2 = "right";
                                                                } else {
                                                                    str2 = "left";
                                                                }
                                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                sbLIZ.append(str3);
                                                                sbLIZ.append('+');
                                                                sbLIZ.append(str);
                                                                sbLIZ.append('+');
                                                                sbLIZ.append(str2);
                                                                nLEModelDynamicCast.setExtra("forward_to_daily_extra_hash_info", C08F1.LIZIZ(C2188811AlT.LIZIZ(sbLIZ)));
                                                            }
                                                        } catch (s e) {
                                                            TryCatchGuardChecker.doCheck(e);
                                                        }
                                                    }
                                                }
                                                nLEModelDynamicCast.setExtra("platform", "android");
                                                NLEVideoEncodeSettings nLEVideoEncodeSettings = new NLEVideoEncodeSettings();
                                                nLEVideoEncodeSettings.setOutputSize(new PairIntInt(1080, 1920));
                                                nLEVideoEncodeSettings.setSwCRF(21);
                                                nLEVideoEncodeSettings.setFps(30);
                                                r6.exportNLEModel(nLEModelDynamicCast, nLEVideoEncodeSettings, false);
                                            }
                                        }
                                        awS601S0100000_222.invoke(new C1411820mqK(-4, 14));
                                        c1440980nbM.LIZJ = r6;
                                    }
                                }
                                this.LLIZLLLIL = c1440980nbM;
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
