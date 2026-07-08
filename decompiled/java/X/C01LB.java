package X;

import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01LB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class C01LB {
    public static final C01LG Companion;
    public static final C01LB FANS_CLUB_JOIN_GIFT;
    public static final C01LB FIRST_GIFT_TIPS;
    public static final /* synthetic */ C01LB[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C01LB RANDOM_FIREWORKS;
    public static final C01LB SEND_SAME_GIFT;
    public static final Map<Integer, C01LB> enumMap;
    public final int LL;
    public final EnumC1120860fH2 LLILLJJLI;

    public C01LB() {
        throw null;
    }

    public static InterfaceC2044707zh<C01LB> getEntries() {
        return LLILZ;
    }

    public void markShown() {
    }

    public abstract boolean shouldShow();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.01LG] */
    static {
        C01LB c01lb = new C01LB() { // from class: X.01LC
            public final C20337914i1<Integer> LLILZIL;

            {
                EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.RANDOM_FIREWORKS;
                this.LLILZIL = InterfaceC1094160eZy.h1;
            }

            @Override // X.C01LB
            public final void markShown() {
                this.LLILZIL.LJFF(1);
            }

            @Override // X.C01LB
            public final boolean shouldShow() {
                Integer numLIZIZ = this.LLILZIL.LIZIZ();
                return numLIZIZ == null || numLIZIZ.intValue() != 1;
            }
        };
        RANDOM_FIREWORKS = c01lb;
        C01LB c01lb2 = new C01LB() { // from class: X.01LD
            @Override // X.C01LB
            public final boolean shouldShow() {
                return true;
            }
        };
        FIRST_GIFT_TIPS = c01lb2;
        C01LB c01lb3 = new C01LB() { // from class: X.01LI
            public final C0JT6<Boolean> LLILZIL;

            {
                EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.FANS_START_GIFT;
                this.LLILZIL = InterfaceC1093910eZZ.LLLLLLJ;
            }

            @Override // X.C01LB
            public final void markShown() {
                this.LLILZIL.LIZJ(Boolean.FALSE);
            }

            @Override // X.C01LB
            public final boolean shouldShow() {
                RoomAuthStatus roomAuthStatus;
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                return !Intrinsics.LJFF(this.LLILZIL.LIZ(), Boolean.FALSE) && ((room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null) ? true : roomAuthStatus.enableGift);
            }
        };
        FANS_CLUB_JOIN_GIFT = c01lb3;
        C01LB c01lb4 = new C01LB() { // from class: X.01LE
            @Override // X.C01LB
            public final boolean shouldShow() {
                return true;
            }
        };
        SEND_SAME_GIFT = c01lb4;
        C01LB[] c01lbArr = {c01lb, c01lb2, c01lb3, c01lb4};
        LLILLL = c01lbArr;
        LLILZ = new C2254308sP(c01lbArr);
        Companion = new Object() { // from class: X.01LG
        };
        C01LB[] c01lbArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(c01lbArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (C01LB c01lb5 : c01lbArrValues) {
            linkedHashMap.put(Integer.valueOf(c01lb5.LL), c01lb5);
        }
        enumMap = linkedHashMap;
    }

    public static C01LB[] values() {
        return (C01LB[]) LLILLL.clone();
    }

    public final int getHintId() {
        return this.LL;
    }

    public final EnumC1120860fH2 getTooltipType() {
        return this.LLILLJJLI;
    }

    public static C01LB valueOf(String str) {
        return (C01LB) C08FF.LIZ(C01LB.class, str);
    }

    public C01LB(String str, int i, int i2, EnumC1120860fH2 enumC1120860fH2, DefaultConstructorMarker defaultConstructorMarker) {
        this.LL = i2;
        this.LLILLJJLI = enumC1120860fH2;
    }
}
