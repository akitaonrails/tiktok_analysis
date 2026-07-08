package X;

import android.os.Looper;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0tNR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662990tNR extends AbstractC1434490nQt {
    public C1431070nLN LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(385));
    public final C2277008w4 LLIZLLLIL = new C2277008w4();

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.MOBILE_EFFECT_UPLOAD;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", "Task cancelled");
        C2296808zG.LIZLLL((InterfaceC497601wk) this.LLIZ.getValue(), "Task cancelled");
        super.LIZIZ(abstractC1404540mea, interfaceC1434410nQl);
        return false;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        List<UploadableMobileEffect> listLIZIZ;
        this.LLILZLL = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    VideoPublishEditModel videoPublishEditModel = ((C1434960nRe) next).LIZ;
                    String stickerID = videoPublishEditModel.getStickerID();
                    if (stickerID == null) {
                        stickerID = "";
                    }
                    Set setLLIIJI = C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(stickerID, new String[]{","}, 0, 6));
                    List<UploadableMobileEffect2> list = videoPublishEditModel.creativeModel.mobileEffectsModel2.exportedEffects;
                    ArrayList arrayList = new ArrayList();
                    for (UploadableMobileEffect2 uploadableMobileEffect2 : list) {
                        if (setLLIIJI.contains(uploadableMobileEffect2.effectId)) {
                            arrayList.add(uploadableMobileEffect2);
                        }
                    }
                    if (C345050Dfr.LIZ) {
                        ArrayList arrayList2 = new ArrayList();
                        for (UploadableMobileEffect2 uploadableMobileEffect22 : list) {
                            UploadableMobileEffect2 uploadableMobileEffect23 = uploadableMobileEffect22;
                            if (setLLIIJI.contains(uploadableMobileEffect23.effectId) && uploadableMobileEffect23.enableMETSubmission) {
                                arrayList2.add(uploadableMobileEffect22);
                            }
                        }
                        listLIZIZ = C1637680sic.LIZIZ(arrayList2);
                    } else {
                        listLIZIZ = C1637680sic.LIZIZ(arrayList);
                    }
                    List<UploadableDraftEffect> listLIZ = C1637680sic.LIZ(arrayList);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", "effectIdsInVideo=" + setLLIIJI);
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1404770mex) {
                            if (next2 != null) {
                                UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) ((C1404770mex) next2).LIZ;
                                UploadImageConfig uploadImageConfig = uploadAuthKeyConfig.customStickerConfig;
                                UploadImageConfig uploadImageConfig2 = uploadAuthKeyConfig.customStickerImageConfig;
                                C23250099c.LIZLLL((InterfaceC497601wk) this.LLIZ.getValue(), null, null, new C1637720sig(uploadAuthKeyConfig, uploadImageConfig, uploadImageConfig2, this, listLIZ, null), 3);
                                if (uploadImageConfig != null && uploadImageConfig2 != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("isMainThread=");
                                    sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper()));
                                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("zipConfig, name=");
                                    sbLIZ2.append(uploadImageConfig.imageHostName);
                                    sbLIZ2.append(", key = ");
                                    sbLIZ2.append(uploadImageConfig.authorizationV2);
                                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("iconConfig, name=");
                                    sbLIZ3.append(uploadImageConfig2.imageHostName);
                                    sbLIZ3.append(", key = ");
                                    sbLIZ3.append(uploadImageConfig2.authorizationV2);
                                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ3));
                                    C23250099c.LIZLLL((InterfaceC497601wk) this.LLIZ.getValue(), null, null, new C1662940tNM(listLIZIZ, this, uploadImageConfig, uploadImageConfig2, videoPublishEditModel, null), 3);
                                    return;
                                }
                                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", "Task success");
                                C1431070nLN c1431070nLN2 = this.LLILZLL;
                                if (c1431070nLN2 == null) {
                                    c1431070nLN2 = null;
                                }
                                c1431070nLN2.LJ(null, true);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0125  */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect r71, X.InterfaceC1364105Vn<? super X.C1737830vK9> r72) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1662990tNR.LJIILJJIL(com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect, X.05Vn):java.lang.Object");
    }
}
