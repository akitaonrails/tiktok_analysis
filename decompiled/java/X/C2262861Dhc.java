package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262861Dhc {
    public final C833003Ng LIZ;
    public final String LIZIZ;
    public final Price LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final ECRichText LJI;
    public final String LJII;
    public final Integer LJIIIIZZ;
    public final Boolean LJIIIZ;
    public final C2262991Dhp LJIIJ;
    public final Boolean LJIIJJI;
    public final Integer LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2262861Dhc)) {
            return false;
        }
        C2262861Dhc c2262861Dhc = (C2262861Dhc) obj;
        return Intrinsics.LJFF(this.LIZ, c2262861Dhc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2262861Dhc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2262861Dhc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2262861Dhc.LIZLLL) && Intrinsics.LJFF(this.LJ, c2262861Dhc.LJ) && Intrinsics.LJFF(this.LJFF, c2262861Dhc.LJFF) && Intrinsics.LJFF(this.LJI, c2262861Dhc.LJI) && Intrinsics.LJFF(this.LJII, c2262861Dhc.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c2262861Dhc.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c2262861Dhc.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c2262861Dhc.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c2262861Dhc.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c2262861Dhc.LJIIL);
    }

    public static C2262861Dhc LIZ(C2262861Dhc c2262861Dhc, String str) {
        C833003Ng c833003Ng = c2262861Dhc.LIZ;
        Price price = c2262861Dhc.LIZJ;
        Integer num = c2262861Dhc.LIZLLL;
        Integer num2 = c2262861Dhc.LJ;
        Integer num3 = c2262861Dhc.LJFF;
        ECRichText eCRichText = c2262861Dhc.LJI;
        String str2 = c2262861Dhc.LJII;
        Integer num4 = c2262861Dhc.LJIIIIZZ;
        Boolean bool = c2262861Dhc.LJIIIZ;
        C2262991Dhp c2262991Dhp = c2262861Dhc.LJIIJ;
        Boolean bool2 = c2262861Dhc.LJIIJJI;
        Integer num5 = c2262861Dhc.LJIIL;
        c2262861Dhc.getClass();
        return new C2262861Dhc(c833003Ng, str, price, num, num2, num3, eCRichText, str2, num4, bool, c2262991Dhp, bool2, num5);
    }

    public /* synthetic */ C2262861Dhc(C833003Ng c833003Ng, String str, Price price, Integer num, Integer num2, Integer num3, ECRichText eCRichText, String str2, Boolean bool, C2262991Dhp c2262991Dhp, Boolean bool2, Integer num4, int i) {
        this(c833003Ng, str, (i & 4) != 0 ? null : price, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : eCRichText, (i & 128) != 0 ? null : str2, (Integer) null, (i & 512) != 0 ? Boolean.FALSE : bool, (i & 1024) != 0 ? null : c2262991Dhp, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? Boolean.FALSE : bool2, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num4);
    }

    public C2262861Dhc(C833003Ng c833003Ng, String str, Price price, Integer num, Integer num2, Integer num3, ECRichText eCRichText, String str2, Integer num4, Boolean bool, C2262991Dhp c2262991Dhp, Boolean bool2, Integer num5) {
        this.LIZ = c833003Ng;
        this.LIZIZ = str;
        this.LIZJ = price;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = num3;
        this.LJI = eCRichText;
        this.LJII = str2;
        this.LJIIIIZZ = num4;
        this.LJIIIZ = bool;
        this.LJIIJ = c2262991Dhp;
        this.LJIIJJI = bool2;
        this.LJIIL = num5;
    }
}
