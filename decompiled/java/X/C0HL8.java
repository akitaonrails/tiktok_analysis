package X;

import android.content.Intent;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0HL8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HL8 {
    public String LIZ;
    public String LIZIZ;
    public final Boolean LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final Long LJI;
    public final String LJII;
    public final C0HKH LJIIIIZZ;
    public final String LJIIIZ;
    public final Intent LJIIJ;
    public final Intent LJIIJJI;
    public Boolean LJIIL;
    public String LJIILIIL;
    public Integer LJIILJJIL;
    public final List<EnumC439310HKn> LJIILL;
    public EnumC439310HKn LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public final int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public boolean LJJI;
    public String LJJIFFI;
    public final C0HZ2 LJJII;
    public final boolean LJJIII;

    public C0HL8(String str, String str2, Boolean bool, Integer num, String str3, Integer num2, Long l, String str4, C0HKH c0hkh, String str5, Intent intent, Intent intent2, C0HZ2 c0hz2, boolean z, int i) {
        ArrayList arrayList;
        EnumC439310HKn enumC439310HKn;
        Integer num3 = num2;
        String str6 = str3;
        Integer num4 = num;
        Boolean bool2 = bool;
        String str7 = str5;
        C0HKH c0hkh2 = c0hkh;
        String str8 = str4;
        Long l2 = l;
        boolean z2 = z;
        C0HZ2 c0hz22 = c0hz2;
        Intent intent3 = intent2;
        Intent intent4 = intent;
        String str9 = (i & 1) != 0 ? "" : str;
        String str10 = (i & 2) == 0 ? str2 : "";
        bool2 = (i & 4) != 0 ? null : bool2;
        num4 = (i & 8) != 0 ? null : num4;
        str6 = (i & 16) != 0 ? null : str6;
        num3 = (i & 32) != 0 ? null : num3;
        l2 = (i & 64) != 0 ? null : l2;
        str8 = (i & 128) != 0 ? null : str8;
        c0hkh2 = (i & 256) != 0 ? C0HKH.NORMAL : c0hkh2;
        str7 = (i & 512) != 0 ? null : str7;
        intent4 = (i & 1024) != 0 ? null : intent4;
        intent3 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : intent3;
        if ((32768 & i) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        if ((65536 & i) != 0) {
            enumC439310HKn = EnumC439310HKn.RETRY;
        } else {
            enumC439310HKn = null;
        }
        c0hz22 = (67108864 & i) != 0 ? null : c0hz22;
        z2 = (i & 134217728) != 0 ? false : z2;
        this.LIZ = str9;
        this.LIZIZ = str10;
        this.LIZJ = bool2;
        this.LIZLLL = num4;
        this.LJ = str6;
        this.LJFF = num3;
        this.LJI = l2;
        this.LJII = str8;
        this.LJIIIIZZ = c0hkh2;
        this.LJIIIZ = str7;
        this.LJIIJ = intent4;
        this.LJIIJJI = intent3;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = arrayList;
        this.LJIILLIIL = enumC439310HKn;
        this.LJIIZILJ = 0;
        this.LJIJ = 0;
        this.LJIJI = 0;
        this.LJIJJ = 0;
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJJ = 0;
        this.LJJI = false;
        this.LJJIFFI = null;
        this.LJJII = c0hz22;
        this.LJJIII = z2;
    }
}
