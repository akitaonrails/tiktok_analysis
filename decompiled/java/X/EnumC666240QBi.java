package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir1Assem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir2Assem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3Assem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC666240QBi {
    public static final C666250QBj Companion;
    public static final EnumC666240QBi DIR1;
    public static final EnumC666240QBi DIR2;
    public static final EnumC666240QBi DIR3;
    public static final /* synthetic */ EnumC666240QBi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LL;

    public static InterfaceC2044707zh<EnumC666240QBi> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0QBj] */
    static {
        EnumC666240QBi enumC666240QBi = new EnumC666240QBi(0, "DIR1", C13LE.LIZ(SearchKeyframeOptDir1Assem.class));
        DIR1 = enumC666240QBi;
        EnumC666240QBi enumC666240QBi2 = new EnumC666240QBi(1, "DIR2", C13LE.LIZ(SearchKeyframeOptDir2Assem.class));
        DIR2 = enumC666240QBi2;
        EnumC666240QBi enumC666240QBi3 = new EnumC666240QBi(2, "DIR3", C13LE.LIZ(SearchKeyframeOptDir3Assem.class));
        DIR3 = enumC666240QBi3;
        EnumC666240QBi[] enumC666240QBiArr = {enumC666240QBi, enumC666240QBi2, enumC666240QBi3};
        LLILLJJLI = enumC666240QBiArr;
        LLILLL = new C2254308sP(enumC666240QBiArr);
        Companion = new Object() { // from class: X.0QBj
        };
    }

    public static EnumC666240QBi[] values() {
        return (EnumC666240QBi[]) LLILLJJLI.clone();
    }

    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getAssemClass() {
        return this.LL;
    }

    public static EnumC666240QBi valueOf(String str) {
        return (EnumC666240QBi) C08FF.LIZ(EnumC666240QBi.class, str);
    }

    public EnumC666240QBi(int i, String str, C19719912Dl c19719912Dl) {
        this.LL = c19719912Dl;
    }
}
