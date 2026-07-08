package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19731512Hx {
    public static final C19731712Hz LIZ(String str, BeautyFilterConfig beautyFilterConfig, C12HT c12ht, Function0<? extends InterfaceC1635390sev> function0, Function1<? super Boolean, Unit> function1) {
        String str2;
        C12I0 c12i0 = new C12I0();
        c12i0.LIZIZ = str;
        c12i0.LIZJ = beautyFilterConfig;
        c12i0.LIZ = c12ht;
        c12i0.LJ = function0;
        c12i0.LIZLLL = (Gson) C2346609Hk.LIZ.getValue();
        c12i0.LJI = function1;
        beautyFilterConfig.dataConfig.getClass();
        BeautyFilterConfig beautyFilterConfig2 = c12i0.LIZJ;
        if (beautyFilterConfig2 != null) {
            C12HT c19731412Hw = c12i0.LIZ;
            if (c19731412Hw == null) {
                if (Intrinsics.LJFF(c12i0.LIZIZ, "record")) {
                    str2 = "";
                } else {
                    str2 = c12i0.LIZIZ;
                }
                c19731412Hw = new C19731412Hw(str2);
                c12i0.LIZ = c19731412Hw;
            }
            Gson gson = c12i0.LIZLLL;
            if (gson != null) {
                Function0<? extends InterfaceC1635390sev> function02 = c12i0.LJ;
                if (function02 != null) {
                    C12HN c12hn = new C12HN(c19731412Hw, beautyFilterConfig2, gson, function02, c12i0.LJI);
                    c12hn.LJIJJ = c12i0.LJFF;
                    return new C19731712Hz(c12i0.LIZIZ, c12hn, c19731412Hw);
                }
                "effectPlatformProvider must be set".toString();
                throw new IllegalStateException("effectPlatformProvider must be set");
            }
            "gson must be set".toString();
            throw new IllegalStateException("gson must be set");
        }
        "beautyFilterConfig must be set".toString();
        throw new IllegalStateException("beautyFilterConfig must be set");
    }
}
