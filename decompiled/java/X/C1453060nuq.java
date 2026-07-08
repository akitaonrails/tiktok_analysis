package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nuq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453060nuq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final InterfaceC1635410sex interfaceC1635410sex) {
        C201955140j.LIZJ(C20020913Vf.LIZIZ, "start preload editingeffect");
        C0LE8.LIZ.getClass();
        C0LE8.LJFF.LIZLLL.remove("editingeffect");
        interfaceC1635410sex.wg("editingeffect", "", 20, new IFetchPanelInfoListener() { // from class: X.0nur
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                Integer numValueOf;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch effect panel info failed,code: ");
                String msg = null;
                if (exceptionResult != null) {
                    numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(" msg: ");
                if (exceptionResult != null) {
                    msg = exceptionResult.getMsg();
                }
                sbLIZ.append(msg);
                C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                PanelInfoModel panelInfoModel2 = panelInfoModel;
                if (panelInfoModel2 == null) {
                    C201955140j.LJIIZILJ("fetch effect panel info success but rsp is null");
                    return;
                }
                List<EffectCategoryModel> categoryList = panelInfoModel2.getCategoryList();
                InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                Iterator<EffectCategoryModel> it2 = categoryList.iterator();
                while (it2.hasNext()) {
                    interfaceC1635410sex2.sg("editingeffect", it2.next().getKey(), 200, 0, 0, null, new IFetchCategoryEffectListener() { // from class: X.0FOq
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            Integer numValueOf;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fetch effect list failed,code: ");
                            String msg = null;
                            if (exceptionResult != null) {
                                numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                            } else {
                                numValueOf = null;
                            }
                            sbLIZ.append(numValueOf);
                            sbLIZ.append(" msg: ");
                            if (exceptionResult != null) {
                                msg = exceptionResult.getMsg();
                            }
                            sbLIZ.append(msg);
                            C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(CategoryPageModel categoryPageModel) {
                            CategoryEffectModel categoryEffects;
                            CategoryPageModel categoryPageModel2 = categoryPageModel;
                            if (categoryPageModel2 != null && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null) {
                                synchronized (Unit.LIZ) {
                                    try {
                                        C0LE8.LIZ.getClass();
                                        C0LE8.LJFF.LIZ("editingeffect", categoryEffects);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                return;
                            }
                            C201955140j.LJIIZILJ("fetch effect list success but rsp is null");
                        }
                    });
                }
            }
        });
    }
}
