package X;

import Y.ACallableS32S0301000_29;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.119M, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119M implements InterfaceC19351810nM {
    public final /* synthetic */ C119J LL;

    public C119M(C119J c119j) {
        this.LL = c119j;
    }

    @Override // X.InterfaceC19351810nM
    public final void LIZ(final int i, View view) {
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        final Effect effect;
        String shootWay;
        String creationId;
        String contentSource;
        String storyShootEntrance;
        String contentType;
        AVETParameter avetParameter;
        AVETParameter avetParameter2;
        AVETParameter avetParameter3;
        AVETParameter avetParameter4;
        if (-1 == i) {
            return;
        }
        C119J c119j = this.LL;
        c119j.LLILZLL = true;
        if (i == 0) {
            c119j.LLLII(i);
            c119j.LLILZIL.tH1(C364410EQl.LIZIZ());
            C1446160nji.LIZLLL(c119j.LLILLL);
            return;
        }
        final C119J c119j2 = this.LL;
        if (i > 0) {
            CategoryPageModel categoryPageModel = c119j2.LLIZLLLIL;
            if (categoryPageModel == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null || (effect = (Effect) ListProtector.get(effects, i - 1)) == null) {
                return;
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("effect_name", effect.getName());
            c0lab.LJ("effect_id", effect.getEffectId());
            VideoPublishEditModel videoPublishEditModel = c119j2.LLILLL;
            String str = "";
            if (videoPublishEditModel == null || (avetParameter4 = videoPublishEditModel.getAvetParameter()) == null || (shootWay = avetParameter4.getShootWay()) == null) {
                shootWay = "";
            }
            c0lab.LJ("shoot_way", shootWay);
            VideoPublishEditModel videoPublishEditModel2 = c119j2.LLILLL;
            if (videoPublishEditModel2 == null || (creationId = videoPublishEditModel2.getCreationId()) == null) {
                creationId = "";
            }
            c0lab.LJ("creation_id", creationId);
            VideoPublishEditModel videoPublishEditModel3 = c119j2.LLILLL;
            if (videoPublishEditModel3 == null || (avetParameter3 = videoPublishEditModel3.getAvetParameter()) == null || (contentSource = avetParameter3.getContentSource()) == null) {
                contentSource = "";
            }
            c0lab.LJ("content_source", contentSource);
            VideoPublishEditModel videoPublishEditModel4 = c119j2.LLILLL;
            if (videoPublishEditModel4 == null || (avetParameter2 = videoPublishEditModel4.getAvetParameter()) == null || (storyShootEntrance = avetParameter2.getStoryShootEntrance()) == null) {
                storyShootEntrance = "";
            }
            c0lab.LJ("shoot_entrance", storyShootEntrance);
            VideoPublishEditModel videoPublishEditModel5 = c119j2.LLILLL;
            if (videoPublishEditModel5 == null || (avetParameter = videoPublishEditModel5.getAvetParameter()) == null || (contentType = avetParameter.getContentType()) == null) {
                contentType = "";
            }
            c0lab.LJ("content_type", contentType);
            c0lab.LIZIZ(System.currentTimeMillis(), "local_time_ms");
            C20684815ws.LJIILLIIL("select_voice_effect", c0lab.LIZ);
            String unzipPath = effect.getUnzipPath();
            if (unzipPath == null) {
                unzipPath = "";
            }
            C2296208zA.LIZ().getClass();
            if (C2299808zk.LIZ(effect)) {
                String effectId = effect.getEffectId();
                if (effectId != null) {
                    str = effectId;
                }
                c119j2.LLLFZ(effect, str, C352370Drf.LIZ(effect), unzipPath);
                c119j2.LLLII(i);
                C119Y c119y = c119j2.LLJILJIL;
                if (c119y == null) {
                    return;
                }
                c119y.LLLIIIIL(effect);
                return;
            }
            c119j2.LLLI(i, 2);
            C2299808zk c2299808zkLIZ = C2296208zA.LIZ();
            C119U c119u = new C119U() { // from class: X.119O
                @Override // X.C119U
                public final void LIZ(Effect effect2) {
                    String effectId2;
                    if (effect2 != null) {
                        effectId2 = effect2.getEffectId();
                    } else {
                        effectId2 = null;
                    }
                    if (TextUtils.equals(effectId2, effect.getEffectId())) {
                        final C119J c119j3 = c119j2;
                        final int i2 = i;
                        C15O7.LIZIZ(new Callable() { // from class: X.0o1s
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C1C7U.LIZ("AudioItemAdapter@308.onClickAudioEffect$1$onFail$1");
                                C1390390mHl c1390390mHl = C1390390mHl.LIZ;
                                Activity activityRequireActivity = c119j3.LL.requireActivity();
                                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                creativeToastBuilder.messageRes(2131826992);
                                ((C1390360mHi) c1390390mHl.createToast(activityRequireActivity, 1001, creativeToastBuilder)).show();
                                c119j3.LLLI(i2, 3);
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("AudioItemAdapter@308.onClickAudioEffect$1$onFail$1");
                                return unit;
                            }
                        }, C15O7.LJIIIIZZ, null);
                    }
                }

                @Override // X.C119U
                public final void onSuccess(Effect effect2) {
                    String effectId2;
                    String strLIZ;
                    String unzipPath2 = null;
                    if (effect2 != null) {
                        effectId2 = effect2.getEffectId();
                    } else {
                        effectId2 = null;
                    }
                    if (TextUtils.equals(effectId2, effect.getEffectId())) {
                        C15O7.LIZIZ(new ACallableS32S0301000_29(effect2, c119j2, i, effect, 1), C15O7.LJIIIIZZ, null);
                        C119J c119j3 = c119j2;
                        c119j3.getClass();
                        String str2 = "";
                        if (effect2 == null) {
                            strLIZ = null;
                        } else {
                            String effectId3 = effect2.getEffectId();
                            if (effectId3 != null) {
                                str2 = effectId3;
                            }
                            strLIZ = C352370Drf.LIZ(effect2);
                            unzipPath2 = effect2.getUnzipPath();
                        }
                        c119j3.LLLFZ(effect2, str2, strLIZ, unzipPath2);
                    }
                }
            };
            c2299808zkLIZ.getClass();
            InterfaceC1635410sex interfaceC1635410sexLIZIZ = C2296208zA.LIZIZ();
            if (interfaceC1635410sexLIZIZ == null) {
                return;
            }
            interfaceC1635410sexLIZIZ.LIZJ(effect, new C1634530sdX(new C1634550sdZ("effect", new C19773712Yd(c119u, 1), false, null)));
            return;
        }
        c119j2.getClass();
    }
}
