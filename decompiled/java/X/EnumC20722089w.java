package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.089w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20722089w implements Serializable {
    public static final EnumC20722089w DEFAULT;
    public static final /* synthetic */ EnumC20722089w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20722089w VISIBLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20722089w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20722089w enumC20722089w = new EnumC20722089w(LivePreviewCTASmartDisplayManager.DEFAULT, 0, CardStruct.IStatusCode.DEFAULT);
        DEFAULT = enumC20722089w;
        EnumC20722089w enumC20722089w2 = new EnumC20722089w("VISIBLE", 1, "1");
        VISIBLE = enumC20722089w2;
        EnumC20722089w[] enumC20722089wArr = {enumC20722089w, enumC20722089w2};
        LLILLJJLI = enumC20722089wArr;
        LLILLL = new C2254308sP(enumC20722089wArr);
    }

    public static EnumC20722089w[] values() {
        return (EnumC20722089w[]) LLILLJJLI.clone();
    }

    public final String getRawValue() {
        return this.LL;
    }

    public static EnumC20722089w valueOf(String str) {
        return (EnumC20722089w) C08FF.LIZ(EnumC20722089w.class, str);
    }

    public EnumC20722089w(String str, int i, String str2) {
        this.LL = str2;
    }
}
