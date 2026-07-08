package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995370c0d {
    public static final EnumC995370c0d DEFAULT;
    public static final EnumC995370c0d FAIL;
    public static final /* synthetic */ EnumC995370c0d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995370c0d RENDERING;
    public static final EnumC995370c0d RENDER_SUCCESS;

    public static InterfaceC2044707zh<EnumC995370c0d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995370c0d enumC995370c0d = new EnumC995370c0d("FAIL", 0);
        FAIL = enumC995370c0d;
        EnumC995370c0d enumC995370c0d2 = new EnumC995370c0d("RENDERING", 1);
        RENDERING = enumC995370c0d2;
        EnumC995370c0d enumC995370c0d3 = new EnumC995370c0d("RENDER_SUCCESS", 2);
        RENDER_SUCCESS = enumC995370c0d3;
        EnumC995370c0d enumC995370c0d4 = new EnumC995370c0d(LivePreviewCTASmartDisplayManager.DEFAULT, 3);
        DEFAULT = enumC995370c0d4;
        EnumC995370c0d[] enumC995370c0dArr = {enumC995370c0d, enumC995370c0d2, enumC995370c0d3, enumC995370c0d4};
        LL = enumC995370c0dArr;
        LLILLJJLI = new C2254308sP(enumC995370c0dArr);
    }

    public static EnumC995370c0d[] values() {
        return (EnumC995370c0d[]) LL.clone();
    }

    public static EnumC995370c0d valueOf(String str) {
        return (EnumC995370c0d) C08FF.LIZ(EnumC995370c0d.class, str);
    }

    public EnumC995370c0d(String str, int i) {
    }
}
