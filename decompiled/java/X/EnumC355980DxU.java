package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import kotlin.ranges.IntRange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC355980DxU {
    public static final EnumC355980DxU ADJUST;
    public static final EnumC355980DxU EFFECT;
    public static final EnumC355980DxU FILTER;
    public static final /* synthetic */ EnumC355980DxU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC355980DxU OVERLAY;
    public static final EnumC355980DxU STICKER;
    public static final EnumC355980DxU TEXT;
    public final IntRange LL;

    public static InterfaceC2044707zh<EnumC355980DxU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC355980DxU enumC355980DxU = new EnumC355980DxU("TEXT", 0, new IntRange(500001, FriendsTabPreloadTTLSetting.DEFAULT));
        TEXT = enumC355980DxU;
        EnumC355980DxU enumC355980DxU2 = new EnumC355980DxU("STICKER", 1, new IntRange(400001, 500000));
        STICKER = enumC355980DxU2;
        EnumC355980DxU enumC355980DxU3 = new EnumC355980DxU("ADJUST", 2, new IntRange(300001, 400000));
        ADJUST = enumC355980DxU3;
        EnumC355980DxU enumC355980DxU4 = new EnumC355980DxU("FILTER", 3, new IntRange(200001, 300000));
        FILTER = enumC355980DxU4;
        EnumC355980DxU enumC355980DxU5 = new EnumC355980DxU("EFFECT", 4, new IntRange(100001, 200000));
        EFFECT = enumC355980DxU5;
        EnumC355980DxU enumC355980DxU6 = new EnumC355980DxU("OVERLAY", 5, new IntRange(1, 100000));
        OVERLAY = enumC355980DxU6;
        EnumC355980DxU[] enumC355980DxUArr = {enumC355980DxU, enumC355980DxU2, enumC355980DxU3, enumC355980DxU4, enumC355980DxU5, enumC355980DxU6};
        LLILLJJLI = enumC355980DxUArr;
        LLILLL = new C2254308sP(enumC355980DxUArr);
    }

    public static EnumC355980DxU[] values() {
        return (EnumC355980DxU[]) LLILLJJLI.clone();
    }

    public final IntRange getLayerRange() {
        return this.LL;
    }

    public static EnumC355980DxU valueOf(String str) {
        return (EnumC355980DxU) C08FF.LIZ(EnumC355980DxU.class, str);
    }

    public EnumC355980DxU(String str, int i, IntRange intRange) {
        this.LL = intRange;
    }
}
