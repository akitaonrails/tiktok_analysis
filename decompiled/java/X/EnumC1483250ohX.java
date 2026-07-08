package X;

import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ttkvideoplayer.adapt.AdaptiveRule;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ohX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1483250ohX {
    public static final EnumC1483250ohX INS;
    public static final /* synthetic */ EnumC1483250ohX[] LLILLL;
    public volatile k LL;
    public volatile Map<String, AdaptiveRule> LLILLJJLI;

    static {
        EnumC1483250ohX enumC1483250ohX = new EnumC1483250ohX();
        INS = enumC1483250ohX;
        LLILLL = new EnumC1483250ohX[]{enumC1483250ohX};
    }

    public static EnumC1483250ohX[] values() {
        return (EnumC1483250ohX[]) LLILLL.clone();
    }

    public Map<String, AdaptiveRule> getAdaptiveRules() {
        if (this.LLILLJJLI != null) {
            return this.LLILLJJLI;
        }
        this.LL = C1479110oar.LIZ.LIZ.getAdaptiveRuleConfig().LIZJ;
        this.LLILLJJLI = (Map) AnonymousClass0518.LIZ(this.LL, new TypeToken<Map<String, AdaptiveRule>>() { // from class: X.0ohY
        }.getType());
        return this.LLILLJJLI;
    }

    public static EnumC1483250ohX valueOf(String str) {
        return (EnumC1483250ohX) C08FF.LIZ(EnumC1483250ohX.class, str);
    }
}
