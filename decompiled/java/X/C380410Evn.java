package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResTag;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.o;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Evn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateCombineEffectTaskV0$executeSerial$1$1$1", f = "TemplateCombineEffectTaskV0.kt", l = {}, m = "invokeSuspend")
public final class C380410Evn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C381340ExI LL;
    public final /* synthetic */ C381300ExE LLILLJJLI;
    public final /* synthetic */ C0FQS LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380410Evn(C381340ExI c381340ExI, C381300ExE c381300ExE, C0FQS c0fqs, InterfaceC1364105Vn<? super C380410Evn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c381340ExI;
        this.LLILLJJLI = c381300ExE;
        this.LLILLL = c0fqs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C380410Evn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJJJLZIJ;
        Map map;
        String str;
        NLEResourceAV aVFile;
        C1C7U.LIZ("TemplateCombineEffectTaskV0@393c.executeSerial$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        NLETrackSlot nLETrackSlot = this.LL.LIZ;
        Map<NLETrackSlot, Map<String, String>> map2 = this.LLILLJJLI.LJIIIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILLL.LJJIIJ;
        if (videoPublishEditModel != null && (numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot, "biz_magic_support_type", 0)) != null && numLJJJLZIJ.intValue() == 1 && Intrinsics.LJFF(nLETrackSlot.getExtra("ep_replaced_i2i_magic_by_render_proxy"), "true")) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (true) {
                NLENode nLENodeDeepClone = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((NLENode) next).getUUID(), nLETrackSlot.getUUID())) {
                    if (next != null && (map = (Map) linkedHashMap.get(next)) != null && (str = (String) map.get("path_cache")) != null && str.length() != 0) {
                        C2486309oj c2486309oj = C2486309oj.LIZ;
                        AFwS231S0000000_3 aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(106);
                        c2486309oj.getClass();
                        Pair pairLIZLLL = C2486309oj.LIZLLL(videoPublishEditModel.getCreativeInfo(), nLETrackSlot, aFwS231S0000000_3);
                        if (C123100dR.LIZ((String) pairLIZLLL.getFirst()) && C123100dR.LIZ((String) pairLIZLLL.getSecond())) {
                            pairLIZLLL.getFirst();
                            C558340Lv6 c558340Lv6LIZLLL = C20137613qo.LIZ.LIZLLL(String.valueOf(pairLIZLLL.getSecond()));
                            NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                            NLERenderProxySegment nLERenderProxySegment = new NLERenderProxySegment();
                            if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null) {
                                nLENodeDeepClone = aVFile.deepClone();
                            }
                            NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast(nLENodeDeepClone);
                            if (nLEResourceAVDynamicCast != null) {
                                nLERenderProxySegment.setAVFile(nLEResourceAVDynamicCast);
                                NLEResourceAV aVFile2 = nLERenderProxySegment.getAVFile();
                                if (aVFile2 != null) {
                                    aVFile2.setResourceFile(c558340Lv6LIZLLL.LIZ);
                                }
                                NLEResourceAV aVFile3 = nLERenderProxySegment.getAVFile();
                                if (aVFile3 != null) {
                                    aVFile3.setWidth(c558340Lv6LIZLLL.LIZIZ);
                                }
                                NLEResourceAV aVFile4 = nLERenderProxySegment.getAVFile();
                                if (aVFile4 != null) {
                                    aVFile4.setHeight(c558340Lv6LIZLLL.LIZJ);
                                }
                            }
                            nLETrackSlot2.setMainSegment(nLERenderProxySegment);
                            nLETrackSlot2.setExtra("ep_replaced_i2i_magic_by_render_proxy", "true");
                            nLETrackSlot.setExtra("ep_replaced_i2i_magic_by_render_proxy", "true");
                            nLETrackSlot.setRenderProxy(nLETrackSlot2);
                            VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
                            if (videoEffects != null) {
                                ArrayList arrayList = new ArrayList();
                                for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                                    if (C123100dR.LIZ(nLEVideoEffect.getExtra("ep_magic_resource_id"))) {
                                        arrayList.add(nLEVideoEffect);
                                    }
                                }
                                NLEVideoEffect nLEVideoEffect2 = (NLEVideoEffect) C13LP.LJJJLL(arrayList);
                                if (nLEVideoEffect2 != null) {
                                    NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
                                    if (renderProxy != null) {
                                        renderProxy.setExtra("ep_magic_resource_id", nLEVideoEffect2.getExtra("ep_magic_resource_id"));
                                        renderProxy.setExtra("is_from_ep_magic", nLEVideoEffect2.getExtra("is_from_ep_magic"));
                                    }
                                    nLEVideoEffect2.setEnable(false);
                                    NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(nLEVideoEffect2.getSegment());
                                    if (nLESegmentEffectDynamicCast != null) {
                                        String jsonParam = nLESegmentEffectDynamicCast.getJsonParam();
                                        try {
                                            C1227904rF.LIZ.getClass();
                                            n nVar = (n) C1227904rF.LIZIZ(jsonParam, n.class);
                                            nVar.LJJII(Boolean.FALSE, "editing_effect_can_display");
                                            jsonParam = nVar.toString();
                                        } catch (C564610MCl e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        } catch (o e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                        }
                                        nLESegmentEffectDynamicCast.setJsonParam(jsonParam);
                                        NLEResourceNode effectSDKEffect = nLESegmentEffectDynamicCast.getEffectSDKEffect();
                                        if (effectSDKEffect != null) {
                                            effectSDKEffect.setResourceTag(NLEResTag.AMAZING);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateCombineEffectTaskV0@393c.executeSerial$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
