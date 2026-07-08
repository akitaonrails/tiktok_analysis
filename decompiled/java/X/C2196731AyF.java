package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniDramaFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;

/* JADX INFO: renamed from: X.1AyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196731AyF {
    public static final C2196871AyT LIZ = new Object() { // from class: X.1AyT
    };
    public static volatile C2196731AyF LIZIZ;

    public static MinisFragment LIZ(C2196731AyF c2196731AyF, SchemaParserData schemaParserData, C2196371Axf c2196371Axf, MinisMetaResp minisMetaResp, Integer num, Integer num2, int i) {
        String str;
        int iIntValue;
        int iIntValue2;
        EnumC2192711Arl enumC2192711Arl = null;
        if ((i & 4) != 0) {
            minisMetaResp = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if (schemaParserData != null) {
            str = schemaParserData.clientKey;
        } else {
            str = null;
        }
        int iIntValue3 = 0;
        if (!C2197221Az2.LIZ(str)) {
            if (schemaParserData != null) {
                enumC2192711Arl = schemaParserData.minisStage;
            }
            if (enumC2192711Arl != EnumC2192711Arl.MINIS_STAGE_NATIVE_DEBUG) {
                MiniDramaFragment miniDramaFragment = new MiniDramaFragment();
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "intent_key_minis_schema_data", schemaParserData);
                C786410Ut5.LJJIZ(bundle, "intent_key_minis_load_perf_data", c2196371Axf);
                C786410Ut5.LJJIJL(bundle, "intent_key_minis_meta_data_from_token_link", minisMetaResp);
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                bundle.putInt("intent_key_minis_status_bar_color_attr", iIntValue2);
                if (num2 != null) {
                    iIntValue3 = num2.intValue();
                }
                bundle.putInt("intent_key_minis_navigation_bar_color_attr", iIntValue3);
                miniDramaFragment.setArguments(bundle);
                return miniDramaFragment;
            }
        }
        MiniGameFragment miniGameFragment = new MiniGameFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIJL(bundle2, "intent_key_minis_schema_data", schemaParserData);
        C786410Ut5.LJJIZ(bundle2, "intent_key_minis_load_perf_data", c2196371Axf);
        C786410Ut5.LJJIJL(bundle2, "intent_key_minis_meta_data_from_token_link", minisMetaResp);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        bundle2.putInt("intent_key_minis_status_bar_color_attr", iIntValue);
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        bundle2.putInt("intent_key_minis_navigation_bar_color_attr", iIntValue3);
        miniGameFragment.setArguments(bundle2);
        return miniGameFragment;
    }
}
