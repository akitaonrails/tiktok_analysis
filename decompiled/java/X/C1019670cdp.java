package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019670cdp {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.161A] */
    public static final Map<String, String> LIZIZ(final Aweme aweme) {
        Object c098200Yq;
        Object obj = null;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C289640BWw.LIZ() && aweme != null) {
                linkedHashMap.putAll(new AnonymousClass1608(aweme) { // from class: X.161A
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
                    public final Map<String, String> LJI() {
                        Pair<C161Q<?>, Function1<Object, Unit>> pair;
                        C161Q<?> first;
                        Aweme aweme2;
                        boolean zLJI;
                        Activity activityLIZIZ;
                        Aweme aweme3;
                        Aweme aweme4;
                        String descLanguage;
                        String desc;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        Aweme aweme5 = this.LIZ;
                        int i = (aweme5 == null || (desc = aweme5.getDesc()) == null || desc.length() <= 0) ? 0 : 1;
                        c2344009Gk.LIZJ(i, "has_title");
                        if (i != 0) {
                            boolean zLIZ = C0SKF.LIZ(this.LIZ);
                            C20703515zt.LIZ.getClass();
                            C161N c161n = C20703515zt.LIZIZ;
                            boolean zLJLJLLL = c161n.LJLJLLL(this.LIZ);
                            c2344009Gk.LIZJ(zLIZ ? 1 : 0, "is_title_translatable");
                            c2344009Gk.LIZJ(zLJLJLLL ? 1 : 0, "is_title_translated");
                            if (c161n.LJL(zLIZ, zLJLJLLL)) {
                                c2344009Gk.LJFF("title_not_translated_reason", c161n.LJJJJJL(this.LIZ));
                            }
                            Aweme aweme6 = this.LIZ;
                            if (aweme6 == null || (descLanguage = aweme6.getDescLanguage()) == null) {
                                descLanguage = "";
                            }
                            c2344009Gk.LJFF("title_source_lang", descLanguage);
                        }
                        LIZIZ(c2344009Gk);
                        Integer numValueOf = null;
                        if (C20702515zj.LIZ(this.LIZ, null) || ((aweme3 = this.LIZ) != null && C13LQ.LJIILLIIL(C0SKF.LIZJ(aweme3), C0SCU.LIZ().LL())) || C161F.LJ(this.LIZ) || ((aweme4 = this.LIZ) != null && C13LQ.LJIILLIIL(C20701315zX.LIZ(aweme4), C0SCU.LIZ().LL()))) {
                            c2344009Gk.LIZJ(1, "is_video_in_dnt");
                        } else {
                            c2344009Gk.LIZJ(0, "is_video_in_dnt");
                        }
                        C20703515zt c20703515zt = C20703515zt.LIZ;
                        Aweme aweme7 = this.LIZ;
                        c20703515zt.getClass();
                        boolean zLJJIJIIJIL = aweme7 == null ? false : C20703515zt.LJJIJIIJIL(aweme7, false);
                        c2344009Gk.LJFF("subtitle_setting_status", zLJJIJIIJIL ? "on" : "off");
                        c2344009Gk.LJFF("captions_show_type", (!zLJJIJIIJIL || C20703515zt.LJIIIIZZ(this.LIZ) == null) ? "hidden" : "captions");
                        LIZLLL(c2344009Gk);
                        LIZJ(c2344009Gk);
                        LJ(c2344009Gk);
                        CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(this.LIZ);
                        String str = captionItemModelLJIIIIZZ != null ? captionItemModelLJIIIIZZ.variant : null;
                        if (C123100dR.LIZ(str)) {
                            c2344009Gk.LJFF("original_caption_variant", str);
                        }
                        C161N c161n2 = C20703515zt.LIZIZ;
                        if (!c161n2.LJIJI(this.LIZ)) {
                            c2344009Gk.LJFF("translation_status", C746760TRa.LIZ().LJLILLLLZI() ? "on" : "off");
                        }
                        c2344009Gk.LJFF("translate_sticker_status", C746760TRa.LIZ().LJJJJI() ? "on" : "off");
                        Aweme aweme8 = this.LIZ;
                        if (aweme8 != null && !AwemeExtKt.isPhotoMode(aweme8)) {
                            c2344009Gk.LJFF("translate_title_status", C746760TRa.LIZ().LJLILLLLZI() ? "on" : "off");
                        }
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                            numValueOf = Integer.valueOf(C0SXF.LJJIII(activityLIZIZ, this.LIZ));
                        }
                        c2344009Gk.LJ(numValueOf, "is_landscape_screen");
                        c20703515zt.getClass();
                        c2344009Gk.LJIIIIZZ("target_lang", c161n2.LLIIZ());
                        c2344009Gk.LJIIIIZZ("app_lang", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
                        if (Intrinsics.LJFF(c2344009Gk.LJIIIZ("is_title_translated"), "1") || Intrinsics.LJFF(c2344009Gk.LJIIIZ("is_photo_title_translated"), "1") || Intrinsics.LJFF(c2344009Gk.LJIIIZ("use_transl"), "1") || Intrinsics.LJFF(c2344009Gk.LJIIIZ("is_text_sticker_translated"), "1")) {
                            c2344009Gk.LIZJ(1, "is_video_translated");
                        } else {
                            c2344009Gk.LIZJ(0, "is_video_translated");
                        }
                        if (Intrinsics.LJFF(c2344009Gk.LJIIIZ("is_title_translatable"), "1") || Intrinsics.LJFF(c2344009Gk.LJIIIZ("is_text_sticker_translatable"), "1") || Intrinsics.LJFF(c2344009Gk.LJIIIZ("is_photo_title_translatable"), "1") || Intrinsics.LJFF(c2344009Gk.LJIIIZ("have_transl"), "1")) {
                            c2344009Gk.LIZJ(1, "is_video_translatable");
                        } else {
                            c2344009Gk.LIZJ(0, "is_video_translatable");
                        }
                        EnumC207101162h enumC207101162h = EnumC207101162h.COMMERCE;
                        if (C305430By9.LIZ && C161C.LIZ.contains(enumC207101162h) && (pair = c161n2.LLFF().get(enumC207101162h)) != null && (first = pair.getFirst()) != null && (aweme2 = this.LIZ) != null && (zLJI = first.LJI(aweme2))) {
                            boolean zLJLJJL = c161n2.LJLJJL(this.LIZ, first);
                            boolean zLJJLL = c161n2.LJJLL(this.LIZ, first);
                            c2344009Gk.LIZJ(zLJI ? 1 : 0, "has_ads_component");
                            c2344009Gk.LIZJ(zLJLJJL ? 1 : 0, "is_ads_component_translatable");
                            c2344009Gk.LIZJ(zLJJLL ? 1 : 0, "is_ads_component_translated");
                            c2344009Gk.LJFF("ads_component_source_lang", C161C.LIZJ(this.LIZ, first));
                            C161N c161n3 = C161N.LIZIZ;
                            if (c161n3.LJJIFFI(zLJLJJL, zLJI)) {
                                c2344009Gk.LJFF("ads_component_not_translatable_reason", c161n2.LJLLLLLL(this.LIZ, first));
                            }
                            if (c161n3.LJL(zLJLJJL, zLJJLL)) {
                                c2344009Gk.LJFF("ads_component_not_translated_reason", c161n2.LJJLIIIJL(this.LIZ, first));
                            }
                        }
                        return c2344009Gk.LIZ;
                    }
                }.LJI());
            }
            LIZ(aweme, linkedHashMap);
            if (!(!linkedHashMap.isEmpty())) {
                linkedHashMap = null;
            }
            if (linkedHashMap == null) {
                c098200Yq = null;
            } else {
                c098200Yq = Collections.unmodifiableMap(linkedHashMap);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Map) obj;
    }

    public static void LIZ(Aweme aweme, Map map) {
        String str;
        if (aweme == null) {
            return;
        }
        C2268371DqV.LIZ.getClass();
        C1002190cBd c1002190cBd = C2268371DqV.LLIL;
        if (map.containsKey(c1002190cBd.LIZ)) {
            return;
        }
        if (C1017070cZd.LJJJJI(aweme)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put(c1002190cBd.LIZ, str);
        map.put(C2268371DqV.LLILII.LIZ, CardStruct.IStatusCode.DEFAULT);
        map.put(C2268371DqV.LLILIL.LIZ, CardStruct.IStatusCode.DEFAULT);
        map.put(C2268371DqV.LLILLIZIL.LIZ, "3");
        String str2 = C2268371DqV.LLILL.LIZ;
        String descLanguage = aweme.getDescLanguage();
        if (descLanguage == null) {
            descLanguage = "";
        }
        map.put(str2, descLanguage);
    }
}
