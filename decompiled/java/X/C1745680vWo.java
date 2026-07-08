package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressEditConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0vWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745680vWo {
    public InputItemDTO LIZ;
    public Object LIZIZ;
    public C1745340vWG LIZJ;
    public final boolean LIZLLL;
    public final EnumC1745080vVq LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public boolean LJII;
    public final Integer LJIIIIZZ;
    public String LJIIIZ;
    public Integer LJIIJ;
    public final Integer LJIIJJI;
    public Integer LJIIL;
    public int LJIILIIL;

    public final String LIZIZ() {
        Map<String, String> map = this.LIZ.extraParams;
        String str = map != null ? map.get("zipcode_input_checkbox_hint") : null;
        if (str instanceof String) {
            return str;
        }
        return null;
    }

    public final boolean LIZJ() {
        return ((AddressEditConfig) C1745750vWv.LIZIZ.getValue()).enableRequiredMark && this.LJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1745680vWo(InputItemDTO inputItemDTO, Object obj, EnumC1745080vVq enumC1745080vVq, boolean z, boolean z2, Integer num, Integer num2, int i) {
        boolean z3;
        Integer num3 = num2;
        Integer num4 = num;
        boolean z4 = z2;
        boolean z5 = z;
        EnumC1745080vVq enumC1745080vVq2 = enumC1745080vVq;
        Object obj2 = (i & 2) != 0 ? null : obj;
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(inputItemDTO, obj2, null, z3, (i & 16) != 0 ? null : enumC1745080vVq2, (i & 32) != 0 ? true : z5, (i & 64) != 0 ? false : z4, false, (i & 256) != 0 ? null : num4, null, null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num3, null, 0);
    }

    public static C1745680vWo LIZ(C1745680vWo c1745680vWo, Object obj, C1745340vWG c1745340vWG, boolean z, EnumC1745080vVq enumC1745080vVq, String str, Integer num, int i) {
        InputItemDTO inputItemDTO;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer num2;
        Integer num3;
        int i2;
        Integer num4 = num;
        String str2 = str;
        EnumC1745080vVq enumC1745080vVq2 = enumC1745080vVq;
        boolean z5 = z;
        C1745340vWG c1745340vWG2 = c1745340vWG;
        Object obj2 = obj;
        Integer num5 = null;
        if ((i & 1) != 0) {
            inputItemDTO = c1745680vWo.LIZ;
        } else {
            inputItemDTO = null;
        }
        if ((i & 2) != 0) {
            obj2 = c1745680vWo.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1745340vWG2 = c1745680vWo.LIZJ;
        }
        if ((i & 8) != 0) {
            z5 = c1745680vWo.LIZLLL;
        }
        if ((i & 16) != 0) {
            enumC1745080vVq2 = c1745680vWo.LJ;
        }
        if ((i & 32) != 0) {
            z2 = c1745680vWo.LJFF;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            z3 = c1745680vWo.LJI;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            z4 = c1745680vWo.LJII;
        } else {
            z4 = false;
        }
        if ((i & 256) != 0) {
            num2 = c1745680vWo.LJIIIIZZ;
        } else {
            num2 = null;
        }
        if ((i & 512) != 0) {
            str2 = c1745680vWo.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            num4 = c1745680vWo.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num3 = c1745680vWo.LJIIJJI;
        } else {
            num3 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num5 = c1745680vWo.LJIIL;
        }
        if ((i & 8192) != 0) {
            i2 = c1745680vWo.LJIILIIL;
        } else {
            i2 = 0;
        }
        c1745680vWo.getClass();
        return new C1745680vWo(inputItemDTO, obj2, c1745340vWG2, z5, enumC1745080vVq2, z2, z3, z4, num2, str2, num4, num3, num5, i2);
    }

    public C1745680vWo(InputItemDTO inputItemDTO, Object obj, C1745340vWG c1745340vWG, boolean z, EnumC1745080vVq enumC1745080vVq, boolean z2, boolean z3, boolean z4, Integer num, String str, Integer num2, Integer num3, Integer num4, int i) {
        this.LIZ = inputItemDTO;
        this.LIZIZ = obj;
        this.LIZJ = c1745340vWG;
        this.LIZLLL = z;
        this.LJ = enumC1745080vVq;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = num;
        this.LJIIIZ = str;
        this.LJIIJ = num2;
        this.LJIIJJI = num3;
        this.LJIIL = num4;
        this.LJIILIIL = i;
    }
}
