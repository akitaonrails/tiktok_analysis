package X;

import com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipDataProtection;
import com.ss.android.ugc.aweme.plugin.tooltipprotection.TooltipProtectionModel$TooltipsByScene;
import java.util.Collections;

/* JADX INFO: renamed from: X.10Qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19243710Qh {
    public static final TooltipProtectionModel$TooltipDataProtection LIZ;

    public int LIZ(InterfaceC19244510Qp interfaceC19244510Qp) {
        throw null;
    }

    public boolean LIZIZ(InterfaceC19244510Qp interfaceC19244510Qp) {
        throw null;
    }

    static {
        EnumC19243910Qj enumC19243910Qj = EnumC19243910Qj.FEED;
        int value = enumC19243910Qj.getValue();
        Integer[] numArr = {Integer.valueOf(EnumC19243810Qi.FOLLOW_LIVE.getValue()), Integer.valueOf(EnumC19243810Qi.LONG_PRESS_COMMENT.getValue()), Integer.valueOf(EnumC19243810Qi.NOW_GUIDE.getValue()), Integer.valueOf(EnumC19243810Qi.SEARCH_HOT_BUBBLE.getValue()), Integer.valueOf(EnumC19243810Qi.POST_NOW.getValue())};
        EnumC19243910Qj enumC19243910Qj2 = EnumC19243910Qj.MUSIC_DETAIL;
        EnumC19243910Qj enumC19243910Qj3 = EnumC19243910Qj.SHOOT;
        LIZ = new TooltipProtectionModel$TooltipDataProtection(C1697810uHb.LJIIJJI(new TooltipProtectionModel$TooltipsByScene(value, C1697810uHb.LJIIJJI(numArr)), new TooltipProtectionModel$TooltipsByScene(enumC19243910Qj2.getValue(), Collections.singletonList(Integer.valueOf(EnumC1778610wNv.FAVORITE_SOUND.getValue()))), new TooltipProtectionModel$TooltipsByScene(enumC19243910Qj3.getValue(), Collections.singletonList(Integer.valueOf(EnumC1217000hm6.GO_LIVE.getValue())))), null, C1697810uHb.LJIIJJI(Integer.valueOf(enumC19243910Qj.getValue()), Integer.valueOf(enumC19243910Qj2.getValue()), Integer.valueOf(enumC19243910Qj3.getValue())), Boolean.TRUE, 2, null);
    }
}
