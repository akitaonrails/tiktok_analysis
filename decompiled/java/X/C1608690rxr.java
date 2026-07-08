package X;

import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608690rxr {
    public static final C1608690rxr LIZ = new C1608690rxr();
    public static final Map<Integer, Map<String, Set<String>>> LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;

    static {
        Integer numValueOf = Integer.valueOf(EnumC992190bvV.DEFAULT.getValue());
        String string = EnumC1608710rxt.RING.getString();
        EnumC1607270rvZ enumC1607270rvZ = EnumC1607270rvZ.LIVE;
        EnumC1607270rvZ enumC1607270rvZ2 = EnumC1607270rvZ.STORY;
        String[] strArr = {enumC1607270rvZ.getString(), enumC1607270rvZ2.getString(), EnumC1607270rvZ.SIMPLE_STORY.getString()};
        String string2 = EnumC1608710rxt.FRAME.getString();
        EnumC1607270rvZ enumC1607270rvZ3 = EnumC1607270rvZ.PERSON;
        LIZIZ = C2097908Jt.LIZJ(new Pair(numValueOf, C2097608Jq.LJIIIIZZ(new Pair(string, C13LQ.LJLIIL(strArr)), new Pair(string2, C13LQ.LJLIIL(new String[]{enumC1607270rvZ.getString(), enumC1607270rvZ3.getString()})), new Pair(EnumC1608710rxt.BADGE.getString(), C13LQ.LJLIIL(new String[]{enumC1607270rvZ.getString(), enumC1607270rvZ2.getString(), EnumC1607270rvZ.STORY_RELATION.getString(), EnumC1607270rvZ.STORY_CELEBRATION.getString(), EnumC1607270rvZ.INTERACTION.getString(), EnumC1607270rvZ.ACTIVE.getString(), EnumC1607270rvZ.FOLLOW.getString()})), new Pair(EnumC1608710rxt.OVERLAY.getString(), C13LQ.LJLIIL(new String[]{enumC1607270rvZ2.getString(), enumC1607270rvZ3.getString()})))));
        LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(530));
        LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(531));
        LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(529));
    }
}
