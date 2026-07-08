package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248360iag extends C09AY implements Function1<Map<String, ? extends String>, Unit> {
    public final /* synthetic */ ProfileComponents LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248360iag(ProfileComponents profileComponents, String str, boolean z, boolean z2) {
        super(1);
        this.LL = profileComponents;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends String> map) {
        String str;
        String str2;
        EnumC1248370iah enumC1248370iah;
        String str3;
        String strLIZIZ;
        Map<String, ? extends String> map2 = map;
        C1248840ibS c1248840ibS = C1248840ibS.LIZ;
        String str4 = null;
        if (map2 != null) {
            str = map2.get("component_field");
        } else {
            str = null;
        }
        ProfileComponents profileComponents = this.LL;
        if (profileComponents != null) {
            str2 = profileComponents.componentId;
        } else {
            str2 = null;
        }
        c1248840ibS.getClass();
        if (str != null && str2 != null) {
            enumC1248370iah = (EnumC1248370iah) new LinkedHashMap().get(str);
            if (enumC1248370iah == null) {
                EnumC1248370iah enumC1248370iah2 = EnumC1248370iah.TAB;
                EnumC1248370iah enumC1248370iah3 = EnumC1248370iah.INFO;
                enumC1248370iah = (EnumC1248370iah) ((LinkedHashMap) C2097608Jq.LJIIJ(new Pair("top_tips_base_item", EnumC1248370iah.ACCOUNT_STATUS), new Pair("nav_bar_base_item", EnumC1248370iah.NAV), new Pair("profile_tab_base_item", enumC1248370iah2), new Pair("advanced_feature_base_item", EnumC1248370iah.INTERACTION), new Pair("profile_tab_base_item", enumC1248370iah2), new Pair("user_account_base_item", enumC1248370iah3), new Pair("user_info_base_item", enumC1248370iah3), new Pair("relation_info_base_item", enumC1248370iah3), new Pair("user_account_name_info_base_item", enumC1248370iah3), new Pair("user_info_manage_base_item", enumC1248370iah3), new Pair("bio_structural_info_base_item", EnumC1248370iah.BIO), new Pair("profile_background", EnumC1248370iah.BACKGROUND))).get(str2);
            }
        } else {
            enumC1248370iah = null;
        }
        if (map2 != null) {
            str3 = map2.get(Scene.SCENE_SERVICE);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("has_");
            ProfileComponents profileComponents2 = this.LL;
            if (profileComponents2 != null) {
                str4 = profileComponents2.componentName;
            }
            sbLIZ.append(str4);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("has_");
            sbLIZ2.append(map2.get(Scene.SCENE_SERVICE));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (enumC1248370iah != null) {
            C1245340iVo c1245340iVo = C1245340iVo.LIZ;
            boolean z = this.LLILLJJLI;
            String lowerCase = strLIZIZ.toLowerCase(Locale.ROOT);
            boolean z2 = this.LLILLL;
            String str5 = this.LLILZ;
            c1245340iVo.getClass();
            C1245340iVo.LJIIJJI(z, enumC1248370iah, lowerCase, z2, str5);
        }
        return Unit.LIZ;
    }
}
