package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextFontExtra;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2500309qz implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                break;
            case 1:
                onFail$1(this, exceptionResult);
                break;
            case 2:
                onFail$2(this, exceptionResult);
                break;
            case 3:
                onFail$3(this, exceptionResult);
                break;
            case 4:
                onFail$4(this, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                break;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                break;
            case 2:
                onSuccess$2(this, effectChannelResponse);
                break;
            case 3:
                onSuccess$3(this, effectChannelResponse);
                break;
            case 4:
                onSuccess$4(this, effectChannelResponse);
                break;
        }
    }

    public C2500309qz(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(C2500309qz c2500309qz, ExceptionResult exceptionResult) {
        Exception exception;
        if (!((InterfaceC20236714Gf) c2500309qz.l0).isActive()) {
            return;
        }
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2500309qz.l0;
            C098200Yq c098200Yq = new C098200Yq(exception);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf.resumeWith(c098200Yq);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c2500309qz.l0;
        C098200Yq c098200Yq2 = new C098200Yq(new Exception());
        C189200o6.m2constructorimpl(c098200Yq2);
        interfaceC20236714Gf2.resumeWith(c098200Yq2);
    }

    public static final void onFail$1(C2500309qz c2500309qz, ExceptionResult exceptionResult) {
        Integer numValueOf;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2500309qz.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String msg = null;
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(':');
        if (exceptionResult != null) {
            msg = exceptionResult.getMsg();
        }
        sbLIZ.append(msg);
        C098200Yq c098200Yq = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
    }

    public static final void onFail$2(C2500309qz c2500309qz, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2500309qz.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFail$3(C2500309qz c2500309qz, ExceptionResult exceptionResult) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2500309qz.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFail$4(C2500309qz c2500309qz, ExceptionResult exceptionResult) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2500309qz.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onSuccess$0(C2500309qz c2500309qz, Object obj) {
        ArrayList arrayList;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        if (effectChannelResponse == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                try {
                    EffectTextFontExtra effectTextFontExtra = (EffectTextFontExtra) C123O.LIZ().LJII(effect.getExtra(), EffectTextFontExtra.class);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(effect.getUnzipPath());
                    sbLIZ.append(File.separator);
                    sbLIZ.append(effectTextFontExtra.fileName);
                    effectTextFontExtra.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                    arrayList.add(new C2280608we(effect, effectTextFontExtra));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (((InterfaceC20236714Gf) c2500309qz.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c2500309qz.l0;
            C189200o6.m2constructorimpl(arrayList);
            interfaceC20236714Gf.resumeWith(arrayList);
        }
    }

    public static final void onSuccess$1(C2500309qz c2500309qz, Object obj) {
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        ArrayList arrayList = new ArrayList();
        if (effectChannelResponse != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                try {
                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = (ReadTextEffectSpeakerExtra) C2219091BtD.LIZJ().LJII(effect.getExtra(), ReadTextEffectSpeakerExtra.class);
                    if (readTextEffectSpeakerExtra != null) {
                        readTextEffectSpeakerExtra.speakerName = effect.getName();
                    } else {
                        readTextEffectSpeakerExtra = new ReadTextEffectSpeakerExtra(false, null, null, null, 0, 0, null, null, null, null, false, 0L, 0L, null, 16383, null);
                    }
                    arrayList2.add(new ReadTextEffectBean(effect, readTextEffectSpeakerExtra));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2219091BtD.LIZLLL().LIZIZ(e);
                }
            }
            arrayList.addAll(arrayList2);
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2500309qz.l0;
        C189200o6.m2constructorimpl(arrayList);
        interfaceC1364105Vn.resumeWith(arrayList);
    }

    public static final void onSuccess$2(C2500309qz c2500309qz, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2500309qz.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
    }

    public static final void onSuccess$3(C2500309qz c2500309qz, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c2500309qz.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
    }

    public static final void onSuccess$4(C2500309qz c2500309qz, Object obj) {
        List<EffectCategoryResponse> categoryResponseList;
        EffectCategoryResponse next;
        List<Effect> totalEffects;
        Effect effect;
        String str;
        EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
        if (effectChannelResponse != null && (categoryResponseList = effectChannelResponse.getCategoryResponseList()) != null) {
            Iterator<EffectCategoryResponse> it2 = categoryResponseList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String key = next.getKey();
                    if (C0C64.LJIILLIIL().LJIJ(31744, 1, "music_share_story_music_card_style", true) == 2) {
                        str = "music_card_style_2";
                    } else {
                        str = "music_card_style_1";
                    }
                    if (Intrinsics.LJFF(key, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EffectCategoryResponse effectCategoryResponse = next;
            if (effectCategoryResponse != null && (totalEffects = effectCategoryResponse.getTotalEffects()) != null && (effect = (Effect) C13LP.LJJJLL(totalEffects)) != null) {
                C1634250sd5.LIZ().LJIIL(effect, new C513301zH((InterfaceC20236714Gf) c2500309qz.l0, 3));
                return;
            }
        }
        c2500309qz.onFail(null);
    }
}
