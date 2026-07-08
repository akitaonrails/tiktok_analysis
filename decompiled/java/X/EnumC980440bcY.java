package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.MatchSettingsInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC980440bcY {
    public static final EnumC980440bcY AI_COMMENTARY;
    public static final EnumC980440bcY AI_HISTORY_SHARE;
    public static final EnumC980440bcY ICY_CLASH;
    public static final /* synthetic */ EnumC980440bcY[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public final int LL;
    public final Function2<C980430bcX, Boolean, C980430bcX> LLILLJJLI;
    public final Function2<MatchSettingsInfo, Boolean, Unit> LLILLL;
    public final Function1<C980430bcX, Boolean> LLILZ;

    public static InterfaceC2044707zh<EnumC980440bcY> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC980440bcY enumC980440bcY = new EnumC980440bcY("ICY_CLASH", 0, 4, AFwS299S0000000_15.get$arr$(26), AFwS299S0000000_15.get$arr$(27), AFwS250S0000000_15.get$arr$(173));
        ICY_CLASH = enumC980440bcY;
        EnumC980440bcY enumC980440bcY2 = new EnumC980440bcY("AI_COMMENTARY", 1, 5, AFwS299S0000000_15.get$arr$(28), AFwS299S0000000_15.get$arr$(29), AFwS250S0000000_15.get$arr$(174));
        AI_COMMENTARY = enumC980440bcY2;
        EnumC980440bcY enumC980440bcY3 = new EnumC980440bcY("AI_HISTORY_SHARE", 2, 6, AFwS299S0000000_15.get$arr$(30), AFwS299S0000000_15.get$arr$(31), AFwS250S0000000_15.get$arr$(175));
        AI_HISTORY_SHARE = enumC980440bcY3;
        EnumC980440bcY[] enumC980440bcYArr = {enumC980440bcY, enumC980440bcY2, enumC980440bcY3};
        LLILZIL = enumC980440bcYArr;
        LLILZLL = new C2254308sP(enumC980440bcYArr);
    }

    public static EnumC980440bcY[] values() {
        return (EnumC980440bcY[]) LLILZIL.clone();
    }

    public final Function1<C980430bcX, Boolean> getOriginState() {
        return this.LLILZ;
    }

    public final Function2<MatchSettingsInfo, Boolean, Unit> getRepoUpdater() {
        return this.LLILLL;
    }

    public final int getSwitchType() {
        return this.LL;
    }

    public final Function2<C980430bcX, Boolean, C980430bcX> getUiUpdater() {
        return this.LLILLJJLI;
    }

    public static EnumC980440bcY valueOf(String str) {
        return (EnumC980440bcY) C08FF.LIZ(EnumC980440bcY.class, str);
    }

    public EnumC980440bcY(String str, int i, int i2, Function2 function2, Function2 function22, Function1 function1) {
        this.LL = i2;
        this.LLILLJJLI = function2;
        this.LLILLL = function22;
        this.LLILZ = function1;
    }
}
