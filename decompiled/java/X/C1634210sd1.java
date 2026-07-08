package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1634210sd1 extends AbstractC1634180scy<Effect, C1634230sd3> implements InterfaceC1633020sb6 {
    public final Function0<String> LIZIZ;
    public final Function0<String> LIZJ;
    public final Function0<InterfaceC1635390sev> LIZLLL;
    public final Function0<AbstractC1634180scy<Effect, C1634230sd3>> LJ;

    @Override // X.AbstractC1634180scy
    public final Effect LJI(Effect effect, Effect effect2) {
        return effect2 != null ? effect2 : effect;
    }

    @Override // X.AbstractC1634180scy
    public final Exception LIZLLL(ExceptionResult exceptionResult) {
        return exceptionResult.getException();
    }

    @Override // X.AbstractC1634180scy, X.InterfaceC1632640saU
    public /* bridge */ /* synthetic */ void LIZIZ(Effect effect, InterfaceC1632620saS<Effect, Effect, C1634230sd3> interfaceC1632620saS) {
        LIZIZ(effect, interfaceC1632620saS);
    }

    @Override // X.AbstractC1634180scy
    /* JADX INFO: renamed from: LIZJ */
    public void LIZIZ(final Effect effect, final InterfaceC1632620saS<Effect, Effect, C1634230sd3> interfaceC1632620saS) {
        InterfaceC1635410sex interfaceC1635410sex;
        Function0<String> function0;
        InterfaceC1635390sev interfaceC1635390sevInvoke = this.LIZLLL.invoke();
        if ((interfaceC1635390sevInvoke instanceof InterfaceC1635410sex) && (interfaceC1635410sex = (InterfaceC1635410sex) interfaceC1635390sevInvoke) != null) {
            List<String> listSingletonList = Collections.singletonList(effect.getResourceId());
            if (C1635160seY.LIZJ(effect)) {
                function0 = this.LIZJ;
            } else {
                function0 = this.LIZIZ;
            }
            interfaceC1635410sex.Cg(listSingletonList, C2097908Jt.LIZJ(new Pair("panel", function0.invoke())), new IFetchEffectListByIdsListener() { // from class: X.13KJ
                public final long LIZ = System.currentTimeMillis();

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    if (exceptionResult == null) {
                        return;
                    }
                    InterfaceC1632620saS<Effect, Effect, C1634230sd3> interfaceC1632620saS2 = interfaceC1632620saS;
                    Effect effect2 = effect;
                    this.getClass();
                    Exception exception = exceptionResult.getException();
                    this.getClass();
                    interfaceC1632620saS2.LIZIZ(effect2, exception, new C1634230sd3(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg()), System.currentTimeMillis() - this.LIZ);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    List<Effect> data;
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                        Effect effect2 = effect;
                        InterfaceC1632620saS<Effect, Effect, C1634230sd3> interfaceC1632620saS2 = interfaceC1632620saS;
                        C1634210sd1 c1634210sd1 = this;
                        for (Effect effect3 : data) {
                            String effectId = effect3.getEffectId();
                            if (effectId != null && effectId.length() != 0) {
                                effect2.setName(effect3.getName());
                                effect2.setRequirements(effect3.getRequirements());
                                effect2.setRequirements_sec(effect3.getRequirements_sec());
                                effect2.setHint(effect3.getHint());
                                effect2.setId(effect3.getId());
                                effect2.setEffectId(effect3.getEffectId());
                                effect2.setFileUrl(effect3.getFileUrl());
                                effect2.setIconUrl(effect3.getIconUrl());
                                effect2.setHintIcon(effect3.getHintIcon());
                                effect2.setHintFile(effect3.getHintFile());
                                effect2.setHintFileFormat(effect3.getHintFileFormat());
                                effect2.setTypes(effect3.getTypes());
                                effect2.setTypes_sec(effect3.getTypes_sec());
                                effect2.setTags(effect3.getTags());
                                effect2.setTagsUpdatedAt(effect3.getTags_updated_at());
                                effect2.setChildren(effect3.getChildren());
                                effect2.setChildEffects(effect3.getChildEffects());
                                effect2.setParent(effect3.getParent());
                                effect2.setEffectType(effect3.getEffect_type());
                                effect2.setSource(effect3.getSource());
                                effect2.setFrom_source(effect3.getFrom_source());
                                effect2.setDesignerId(effect3.getDesigner_id());
                                effect2.setDesigner_encrypted_id(effect3.getDesigner_encrypted_id());
                                effect2.setDevicePlatform(effect3.getDevice_platform());
                                effect2.setSchema(effect3.getSchema());
                                effect2.setMusic(effect3.getMusic());
                                effect2.setExtra(effect3.getExtra());
                                effect2.setSdkExtra(effect3.getSdkExtra());
                                effect2.setAdRawData(effect3.getAd_raw_data());
                                effect2.setComposerParams(effect3.getComposer_params());
                                effect2.setBusiness(effect3.isBusiness());
                                effect2.setIopId(effect3.getIop_id());
                                effect2.setResourceId(effect3.getResourceId());
                                effect2.setBind_ids(effect3.getBind_ids());
                                effect2.setPtime(effect3.getPtime());
                                effect2.setGrade_key(effect3.getGrade_key());
                                effect2.setChallenge(effect3.getChallenge());
                                effect2.setUse_number(effect3.getUse_number());
                                effect2.setEffect_source_id(effect3.getEffect_source_id());
                                effect2.setComposerPath(effect3.getComposerPath());
                                effect2.setZipPath(effect3.getZipPath());
                                effect2.setUnzipPath(effect3.getUnzipPath());
                                effect2.setTransResPath(effect3.getTransResPath());
                                effect2.setDownloaded(effect3.isDownloaded());
                                effect2.setPanel(effect3.getPanel());
                                effect2.setSearchType(effect3.getSearchType());
                                effect2.setRecId(effect3.getRecId());
                                effect2.setModel_names(effect3.getModelNames());
                                effect2.setModel_names_sec(effect3.getModel_names_sec());
                                effect2.setOriginal_effect_id(effect3.getOriginal_effect_id());
                                effect2.setTrans_file_url(effect3.getTrans_file_url());
                                effect2.setTemplate_effect_id(effect3.getTemplate_effect_id());
                                effect2.setDoc_id(effect3.getDoc_id());
                                effect2.setRec_tag(effect3.getRec_tag());
                                effect2.setTemplate_effect_extra(effect3.getTemplate_effect_extra());
                                effect2.setServer_extra(effect3.getServer_extra());
                                effect2.setFile_diff(effect3.getFile_diff());
                                effect2.setProvider(effect3.getProvider());
                                effect2.setPackage_size(effect3.getPackage_size());
                                if (new C0VSJ(effect2.getUnzipPath()).exists()) {
                                    c1634210sd1.getClass();
                                    interfaceC1632620saS2.LIZ(effect2, effect3, new C1634230sd3(null, null), System.currentTimeMillis() - this.LIZ);
                                } else {
                                    AbstractC1634180scy<Effect, C1634230sd3> abstractC1634180scyInvoke = c1634210sd1.LJ.invoke();
                                    if (abstractC1634180scyInvoke != null) {
                                        abstractC1634180scyInvoke.LIZIZ(effect3, interfaceC1632620saS2);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // X.AbstractC1634180scy
    public final C1634230sd3 LJFF(Effect effect, Effect effect2) {
        return new C1634230sd3(null, null);
    }

    @Override // X.AbstractC1634180scy
    public final C1634230sd3 LJ(Effect effect, Effect effect2, ExceptionResult exceptionResult) {
        return new C1634230sd3(Integer.valueOf(exceptionResult.getErrorCode()), exceptionResult.getMsg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1634210sd1(Function0<String> function0, Function0<String> function02, Function0<? extends InterfaceC1635390sev> function03, Function0<? extends AbstractC1634180scy<Effect, C1634230sd3>> function04) {
        super(function03);
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
        this.LJ = function04;
    }
}
