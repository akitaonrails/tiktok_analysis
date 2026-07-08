package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.SocialAvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09Xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2388309Xl {
    public static final C2388309Xl LIZ = new C2388309Xl();
    public static String LIZIZ;

    public static Object LIZ(C2388309Xl c2388309Xl, String str, File file, InterfaceC1364105Vn interfaceC1364105Vn) {
        c2388309Xl.getClass();
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        try {
            C2499809qu c2499809qu = new C2499809qu(c23260099m, 7);
            if (file.exists()) {
                file.delete();
            }
            AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
            abstractC2199801B7qWith.LIZJ = file.getName();
            abstractC2199801B7qWith.LJII = 1;
            abstractC2199801B7qWith.LJ = file.getParentFile().getAbsolutePath();
            abstractC2199801B7qWith.LJIIL = c2499809qu;
            abstractC2199801B7qWith.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" downloaded");
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLIZ;
    }

    public static Object LIZIZ(C2388309Xl c2388309Xl, final InterfaceC497601wk interfaceC497601wk, final InterfaceC1635410sex interfaceC1635410sex, final InterfaceC1452170ntP interfaceC1452170ntP, final SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct, InterfaceC1364105Vn interfaceC1364105Vn) {
        final Function0 function0 = null;
        c2388309Xl.getClass();
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final C348460DlM c348460DlM = new C348460DlM(0);
        interfaceC1635410sex.LJJJJI("social_avatar", false, false, new IFetchEffectChannelListener() { // from class: X.09Xm
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC1364105Vn<StickerItemModel> interfaceC1364105Vn2 = c23260099m;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn2.resumeWith(null);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                List<Effect> allCategoryEffects;
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2 != null && (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) != null) {
                    InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                    final InterfaceC497601wk interfaceC497601wk2 = interfaceC497601wk;
                    final InterfaceC1364105Vn<StickerItemModel> interfaceC1364105Vn2 = c23260099m;
                    final C348460DlM c348460DlM2 = c348460DlM;
                    final SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct2 = socialAvatarUpdateInfoStruct;
                    final InterfaceC1452170ntP interfaceC1452170ntP2 = interfaceC1452170ntP;
                    final Function0<Unit> function02 = function0;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(allCategoryEffects, 10));
                    for (final Effect effect : allCategoryEffects) {
                        interfaceC1635410sex2.LJIIL(effect, new IFetchEffectListener() { // from class: X.09Xn
                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onStart(Effect effect2) {
                            }

                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                            public final void onSuccess(Effect effect2) {
                                Effect effect3 = effect2;
                                if (effect3 != null) {
                                    InterfaceC497601wk interfaceC497601wk3 = interfaceC497601wk2;
                                    C23250099c.LIZLLL(interfaceC497601wk3, null, null, new C384210F4p(c348460DlM2, effect3, effect, socialAvatarUpdateInfoStruct2, interfaceC1452170ntP2, function02, interfaceC1364105Vn2, interfaceC497601wk3, null), 3);
                                } else {
                                    InterfaceC1364105Vn<StickerItemModel> interfaceC1364105Vn3 = interfaceC1364105Vn2;
                                    C189200o6.m2constructorimpl(null);
                                    interfaceC1364105Vn3.resumeWith(null);
                                }
                            }

                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                            public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                                String effectId;
                                Unit unit;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("downloadEffect effect: ");
                                if (effect2 != null) {
                                    effectId = effect2.getEffectId();
                                } else {
                                    effectId = null;
                                }
                                sbLIZ.append(effectId);
                                sbLIZ.append(' ');
                                if (exceptionResult.getException() != null) {
                                    unit = Unit.LIZ;
                                } else {
                                    unit = null;
                                }
                                sbLIZ.append(unit);
                                C2188811AlT.LIZIZ(sbLIZ);
                                InterfaceC1364105Vn<StickerItemModel> interfaceC1364105Vn3 = interfaceC1364105Vn2;
                                C189200o6.m2constructorimpl(null);
                                interfaceC1364105Vn3.resumeWith(null);
                            }
                        });
                        arrayList.add(Unit.LIZ);
                    }
                }
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
