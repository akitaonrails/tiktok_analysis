package X;

import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.06ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1659906ej {
    public final Map<EnumC1660606eq, Boolean> LIZ;

    public C1659906ej(ChatFeatureListConf chatFeatureListConf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC1660606eq enumC1660606eq = EnumC1660606eq.SOCIAL_AVATAR;
        String strRep = enumC1660606eq.getStrRep();
        EnumC1660606eq enumC1660606eq2 = EnumC1660606eq.CREATE_AI_AVATAR_ENTRANCE;
        if (!chatFeatureListConf.specificSubComponentEnable(strRep, enumC1660606eq2.getStrRep())) {
            linkedHashMap.put(enumC1660606eq2, Boolean.FALSE);
        }
        String strRep2 = enumC1660606eq.getStrRep();
        EnumC1660606eq enumC1660606eq3 = EnumC1660606eq.AI_AVATAR_INLINE_MESSAGE;
        if (!chatFeatureListConf.specificSubComponentEnable(strRep2, enumC1660606eq3.getStrRep())) {
            linkedHashMap.put(enumC1660606eq3, Boolean.FALSE);
        }
        EnumC1660606eq enumC1660606eq4 = EnumC1660606eq.SUGGEST_REPLY_NOTICE;
        if (!chatFeatureListConf.componentEnable(enumC1660606eq4.getStrRep())) {
            linkedHashMap.put(enumC1660606eq4, Boolean.FALSE);
        }
        EnumC1660606eq enumC1660606eq5 = EnumC1660606eq.REPLY_TO_STICKER;
        if (!chatFeatureListConf.componentEnable(enumC1660606eq5.getStrRep())) {
            linkedHashMap.put(enumC1660606eq5, Boolean.FALSE);
        }
        EnumC1660606eq enumC1660606eq6 = EnumC1660606eq.PRE_SHOWN_STICKER;
        if (!chatFeatureListConf.componentEnable(enumC1660606eq6.getStrRep())) {
            linkedHashMap.put(enumC1660606eq6, Boolean.FALSE);
        }
        EnumC1660606eq enumC1660606eq7 = EnumC1660606eq.TYPING_INDICATOR;
        if (!chatFeatureListConf.componentEnable(enumC1660606eq7.getStrRep())) {
            linkedHashMap.put(enumC1660606eq7, Boolean.FALSE);
        }
        EnumC1660606eq enumC1660606eq8 = EnumC1660606eq.CHAT_NOTICE;
        if (!chatFeatureListConf.componentEnable(enumC1660606eq8.getStrRep())) {
            linkedHashMap.put(enumC1660606eq8, Boolean.FALSE);
        }
        this.LIZ = linkedHashMap;
    }
}
