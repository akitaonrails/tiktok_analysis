package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class EnumC355940DxQ {
    public static final EnumC355940DxQ BEATS_ALG_BEAT_TRACKER;
    public static final EnumC355940DxQ BEATS_ALG_MERGE_BEAT;
    public static final EnumC355940DxQ BEATS_ALG_ONSET;
    public static final EnumC355940DxQ BEATS_OFFLINE_BEAT_TRACKING;
    public static final /* synthetic */ EnumC355940DxQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final Function1<AVMusic, String> LL;

    public static InterfaceC2044707zh<EnumC355940DxQ> getEntries() {
        return LLILLL;
    }

    @Override // java.lang.Enum
    public abstract String toString();

    static {
        EnumC355940DxQ enumC355940DxQ = new EnumC355940DxQ() { // from class: X.0Dxx
            @Override // X.EnumC355940DxQ, java.lang.Enum
            public final String toString() {
                return "beats_tracker";
            }

            {
                AFwS234S0000000_5.get$arr$(558);
            }
        };
        BEATS_ALG_BEAT_TRACKER = enumC355940DxQ;
        EnumC355940DxQ enumC355940DxQ2 = new EnumC355940DxQ() { // from class: X.0DxO
            @Override // X.EnumC355940DxQ, java.lang.Enum
            public final String toString() {
                return "merged_beats";
            }

            {
                AFwS234S0000000_5.get$arr$(559);
            }
        };
        BEATS_ALG_MERGE_BEAT = enumC355940DxQ2;
        EnumC355940DxQ enumC355940DxQ3 = new EnumC355940DxQ() { // from class: X.0DxP
            @Override // X.EnumC355940DxQ, java.lang.Enum
            public final String toString() {
                return "onset";
            }

            {
                AFwS234S0000000_5.get$arr$(560);
            }
        };
        BEATS_ALG_ONSET = enumC355940DxQ3;
        EnumC355940DxQ enumC355940DxQ4 = new EnumC355940DxQ() { // from class: X.0DwP
            @Override // X.EnumC355940DxQ, java.lang.Enum
            public final String toString() {
                return "NLE_beats_tracking";
            }

            {
                AFwS234S0000000_5.get$arr$(561);
            }
        };
        BEATS_OFFLINE_BEAT_TRACKING = enumC355940DxQ4;
        EnumC355940DxQ[] enumC355940DxQArr = {enumC355940DxQ, enumC355940DxQ2, enumC355940DxQ3, enumC355940DxQ4};
        LLILLJJLI = enumC355940DxQArr;
        LLILLL = new C2254308sP(enumC355940DxQArr);
    }

    public static EnumC355940DxQ[] values() {
        return (EnumC355940DxQ[]) LLILLJJLI.clone();
    }

    public final Function1<AVMusic, String> getPath() {
        return this.LL;
    }

    public static EnumC355940DxQ valueOf(String str) {
        return (EnumC355940DxQ) C08FF.LIZ(EnumC355940DxQ.class, str);
    }

    public EnumC355940DxQ(String str, int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this.LL = function1;
    }
}
