package X;

import com.bytedance.ies.nle.editor_jni.EpResourceCallback;
import com.bytedance.ies.nle.editor_jni.EpResourceDelegate;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389350FOj extends EpResourceDelegate {
    public final C389400FOo LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(12));

    public C389350FOj(C389400FOo c389400FOo) {
        this.LIZ = c389400FOo;
    }

    @Override // com.bytedance.ies.nle.editor_jni.EpResourceDelegate
    public final boolean request(final String str, final EpResourceCallback epResourceCallback) {
        if (str == null || str.length() == 0) {
            return false;
        }
        ((InterfaceC1635410sex) this.LIZIZ.getValue()).LIZIZ(str, null, new IFetchEffectListener() { // from class: X.0FOk
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                Effect effect2 = effect;
                if (effect2 == null) {
                    C0L9D c0l9d = C0L9D.HANDLE_TEMPLATE;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EpResourceFetcher fetchEffect: onFail EFFECT_NULL. effectId=");
                    sbLIZ.append(str);
                    C533100KvU.LIZ(c0l9d, C2188811AlT.LIZIZ(sbLIZ));
                    EpResourceCallback epResourceCallback2 = epResourceCallback;
                    if (epResourceCallback2 != null) {
                        epResourceCallback2.onFailure(10003, "");
                        return;
                    }
                    return;
                }
                this.LIZ.LIZJ(effect2, effect2.getPanel(), effect2.getResource_id());
                C389400FOo c389400FOo = this.LIZ;
                String str2 = str;
                c389400FOo.getClass();
                if (str2 != null && !a0.LJJJIL(str2)) {
                    c389400FOo.LIZIZ.put(str2, effect2);
                }
                EpResourceCallback epResourceCallback3 = epResourceCallback;
                if (epResourceCallback3 == null) {
                    return;
                }
                epResourceCallback3.onSuccess(effect2.getUnzipPath());
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C0L9D c0l9d = C0L9D.HANDLE_TEMPLATE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EpResourceFetcher fetchEffect: onFail effectId=");
                sbLIZ.append(str);
                sbLIZ.append(". ExceptionResult=");
                sbLIZ.append(exceptionResult);
                sbLIZ.append(", failedEffect=");
                sbLIZ.append(effect);
                C533100KvU.LIZ(c0l9d, C2188811AlT.LIZIZ(sbLIZ));
                EpResourceCallback epResourceCallback2 = epResourceCallback;
                if (epResourceCallback2 != null) {
                    epResourceCallback2.onFailure(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                }
            }
        });
        return true;
    }

    @Override // com.bytedance.ies.nle.editor_jni.EpResourceDelegate
    public final boolean request(final String str, final String str2, final EpResourceCallback epResourceCallback) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(((INLETemplateOfflineService) ServiceManager.get().getService(INLETemplateOfflineService.class)).LIZIZ());
            mapLJIIJ.put("panel", str2);
            ((InterfaceC1635410sex) this.LIZIZ.getValue()).Cg(C1697810uHb.LJ(str), mapLJIIJ, new IFetchEffectListByIdsListener() { // from class: X.0FOl
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C0L9D c0l9d = C0L9D.HANDLE_TEMPLATE;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EpResourceFetcher fetchEffectList: onFail resourceId=");
                    sbLIZ.append(str);
                    sbLIZ.append(", panel=");
                    sbLIZ.append(str2);
                    sbLIZ.append(". ExceptionResult=");
                    sbLIZ.append(exceptionResult);
                    C533100KvU.LIZ(c0l9d, C2188811AlT.LIZIZ(sbLIZ));
                    EpResourceCallback epResourceCallback2 = epResourceCallback;
                    if (epResourceCallback2 != null) {
                        epResourceCallback2.onFailure(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectListResponse effectListResponse) {
                    List<Effect> data;
                    final Effect effect;
                    List<Effect> data2;
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = (Effect) C13LP.LJJJLZIJ(0, data)) != null) {
                        if (((InterfaceC1635410sex) this.LIZIZ.getValue()).LJIIIIZZ(effect)) {
                            this.LIZ.LIZJ(effect, str2, str);
                            if (effectListResponse2 != null && (data2 = effectListResponse2.getData()) != null) {
                                C389350FOj c389350FOj = this;
                                String str3 = str2;
                                CategoryEffectModel categoryEffectModel = new CategoryEffectModel("", "", false, 0, 0, new ArrayList(), new ArrayList(), new ArrayList(), 0);
                                categoryEffectModel.setEffects(data2);
                                c389350FOj.LIZ.LIZ(str3, categoryEffectModel);
                            }
                            EpResourceCallback epResourceCallback2 = epResourceCallback;
                            if (epResourceCallback2 != null) {
                                epResourceCallback2.onSuccess(effect.getUnzipPath());
                                return;
                            }
                            return;
                        }
                        InterfaceC1635410sex interfaceC1635410sex = (InterfaceC1635410sex) this.LIZIZ.getValue();
                        final C389350FOj c389350FOj2 = this;
                        final String str4 = str2;
                        final String str5 = str;
                        final EpResourceCallback epResourceCallback3 = epResourceCallback;
                        interfaceC1635410sex.LIZJ(effect, new IFetchEffectListener() { // from class: X.0FOm
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onStart(Effect effect2) {
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(Effect effect2) {
                                c389350FOj2.LIZ.LIZJ(effect, str4, str5);
                                EpResourceCallback epResourceCallback4 = epResourceCallback3;
                                if (epResourceCallback4 != null) {
                                    epResourceCallback4.onSuccess(effect.getUnzipPath());
                                }
                            }

                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                                C0L9D c0l9d = C0L9D.HANDLE_TEMPLATE;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("EpResourceFetcher fetchEffect: onFail resourceId=");
                                sbLIZ.append(str5);
                                sbLIZ.append(", panel=");
                                sbLIZ.append(str4);
                                sbLIZ.append(". ExceptionResult=");
                                sbLIZ.append(exceptionResult);
                                sbLIZ.append(", failedEffect=");
                                sbLIZ.append(effect2);
                                C533100KvU.LIZ(c0l9d, C2188811AlT.LIZIZ(sbLIZ));
                                EpResourceCallback epResourceCallback4 = epResourceCallback3;
                                if (epResourceCallback4 != null) {
                                    epResourceCallback4.onFailure(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                                }
                            }
                        });
                        return;
                    }
                    C0L9D c0l9d = C0L9D.HANDLE_TEMPLATE;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EpResourceFetcher fetchEffect: onFail EFFECT_NULL. resourceId=");
                    sbLIZ.append(str);
                    sbLIZ.append(", panel=");
                    sbLIZ.append(str2);
                    sbLIZ.append('.');
                    C533100KvU.LIZ(c0l9d, C2188811AlT.LIZIZ(sbLIZ));
                    EpResourceCallback epResourceCallback4 = epResourceCallback;
                    if (epResourceCallback4 == null) {
                        return;
                    }
                    epResourceCallback4.onFailure(10003, "");
                }
            });
            return true;
        }
        C0L9D c0l9d = C0L9D.HANDLE_TEMPLATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EpResourceFetcher request: resourceId=");
        sbLIZ.append(str);
        sbLIZ.append(", panel=");
        sbLIZ.append(str2);
        C533100KvU.LIZ(c0l9d, C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }
}
