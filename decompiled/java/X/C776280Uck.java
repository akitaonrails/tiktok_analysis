package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.model.ByteAudioConfig;

/* JADX INFO: renamed from: X.0Uck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C776280Uck {
    public final Context LIZ;
    public String LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public long LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public Intent LJIJJ;
    public ByteAudioConfig LJJ;
    public InterfaceC775270Ub7 LJJI;
    public String LJJIFFI;
    public float LJJII;
    public int LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIJ;
    public int LJJIJIIJI;
    public boolean LJJIJL;
    public String LJJIJLIJ;
    public InterfaceC780300UjE LJJIL;
    public C0UH0 LJJIZ;
    public String LJJJ;
    public Object LJJJI;
    public boolean LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public String LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJZ;
    public boolean LJJJLIIL;
    public boolean LJJJLL;
    public boolean LJJJZ;
    public boolean LJJL;
    public int LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public C1267200j54 LJJLIIIJLJLI;
    public boolean LJJLIIIJLLLLLLLZ;
    public boolean LJJLIIJ;
    public C1D47 LJJLIL;
    public int LJIJJLI = -1;
    public int LJIL = -1;
    public boolean LJJIIZI = true;
    public String LJJIJIIJIL = "";
    public String LJJIJIL = "";
    public int LJJJJIZL = 2;
    public boolean LJJJJLL = true;
    public int LJJJJZI = -1;
    public String LJJJLZIJ = "";
    public EnumC1276810jKZ LJJLI = EnumC1276810jKZ.VERTICAL;
    public String LJJLIIIIJ = "";
    public String LJJLIIIJ = "";

    public final void LIZIZ() {
        this.LJIL = 5;
    }

    public final void LIZLLL() {
        this.LJIIIZ = 1;
    }

    public final void LJIIIZ() {
        this.LJJJLL = true;
    }

    public final void LJJ() {
        this.LJJJJJL = false;
    }

    public final void LJJIZ() {
        this.LIZJ = 0;
    }

    public final void LJJJJ() {
        this.LJJIIZI = true;
    }

    public final C776310Ucn LIZ() {
        boolean z = LiveAbLabelSetting.INSTANCE.getIntValue("opt_up_sample") == 1;
        int i = this.LJ;
        if (i == 0) {
            i = 500;
        }
        this.LJ = i;
        int i2 = this.LJFF;
        if (i2 == 0) {
            i2 = 200;
        }
        this.LJFF = i2;
        int i3 = this.LJI;
        if (i3 == 0) {
            i3 = 800;
        }
        this.LJI = i3;
        int i4 = this.LJIIJ;
        if (i4 == 0) {
            i4 = z ? 480 : 360;
        }
        this.LJIIJ = i4;
        int i5 = this.LJIIJJI;
        if (i5 == 0) {
            i5 = z ? 864 : 640;
        }
        this.LJIIJJI = i5;
        int i6 = this.LJII;
        if (i6 == 0) {
            i6 = 15;
        }
        this.LJII = i6;
        int i7 = this.LJIILLIIL;
        if (i7 == 0) {
            i7 = 9;
        }
        this.LJIILLIIL = i7;
        long j = this.LJIIZILJ;
        if (j == 0) {
            j = 60000;
        }
        this.LJIIZILJ = j;
        int i8 = this.LJIJ;
        if (i8 == 0) {
            i8 = 44100;
        }
        this.LJIJ = i8;
        this.LJIJI = this.LJIJI != 2 ? 1 : 2;
        this.LIZIZ = TextUtils.isEmpty(this.LIZIZ) ? "" : this.LIZIZ;
        int i9 = this.LJIILL;
        this.LJIILL = i9 == 0 ? 1 : Math.min(i9, 3);
        int i10 = this.LJIJJLI;
        if (i10 == -1) {
            i10 = 4;
        }
        this.LJIJJLI = i10;
        int i11 = this.LJIL;
        if (i11 == -1) {
            i11 = 1;
        }
        this.LJIL = i11;
        this.LJJIFFI = "".equals(this.LJJIFFI) ? "live-stream-sdk" : this.LJJIFFI;
        int i12 = this.LJJIII;
        this.LJJIII = i12 != 0 ? i12 : 1;
        float f = this.LJJII;
        if (f == 0.0f) {
            f = 2.0f;
        }
        this.LJJII = f;
        String str = this.LJJIJ;
        if (str == null) {
            str = "";
        }
        this.LJJIJ = str;
        String str2 = this.LJJIJLIJ;
        if (str2 == null) {
            str2 = "";
        }
        this.LJJIJLIJ = str2;
        String str3 = this.LJJIIZ;
        this.LJJIIZ = str3 != null ? str3 : "";
        return new C776310Ucn(this);
    }

    public C776280Uck(Context context) {
        this.LIZ = context;
    }

    public final void LIZJ(int i) {
        this.LJIJI = i;
    }

    public final void LJ(int i) {
        this.LJ = i;
    }

    public final void LJFF(boolean z) {
        this.LJJJZ = z;
    }

    public final void LJI(boolean z) {
        this.LJJJIL = z;
    }

    public final void LJII(String str) {
        this.LJJJ = str;
    }

    public final void LJIIIIZZ(boolean z) {
        this.LJIIL = z;
    }

    public final void LJIIJ(boolean z) {
        this.LJJJJL = z;
    }

    public final void LJIIJJI(int i) {
        this.LJII = i;
    }

    public final void LJIIL(float f) {
        this.LJJII = f;
    }

    public final void LJIILIIL(String str) {
        this.LJIILIIL = str;
    }

    public final void LJIILJJIL(boolean z) {
        this.LJJIJL = z;
    }

    public final void LJIILL(String str) {
        this.LJJJJJ = str;
    }

    public final void LJIILLIIL(C1276880jKg c1276880jKg) {
        this.LJJIL = c1276880jKg;
    }

    public final void LJIIZILJ(C0UNM c0unm) {
        this.LJJI = c0unm;
    }

    public final void LJIJ(String str) {
        this.LJJJLZIJ = str;
    }

    public final void LJIJI(int i) {
        this.LJI = i;
    }

    public final void LJIJJ(long j) {
        this.LJIIZILJ = j;
    }

    public final void LJIJJLI(int i) {
        this.LJFF = i;
    }

    public final void LJIL(C0UH8 c0uh8) {
        this.LJJIZ = c0uh8;
    }

    public final void LJJI(int i) {
        this.LJJIJIIJI = i;
    }

    public final void LJJIFFI(boolean z) {
        this.LJJJLIIL = z;
    }

    public final void LJJII(int i) {
        this.LJJJJZI = i;
    }

    public final void LJJIIJ(int i) {
        this.LJIILL = i;
    }

    public final void LJJIIJZLJL(String str) {
        this.LJJIFFI = str;
    }

    public final void LJJIIZ(String str) {
        this.LJJIJLIJ = str;
    }

    public final void LJJIIZI(Object obj) {
        this.LJJJI = obj;
    }

    public final void LJJIJ(boolean z) {
        this.LJJIIJ = z;
    }

    public final void LJJIJIIJI(String str) {
        this.LJJIJIL = str;
    }

    public final void LJJIJIIJIL(String str) {
        this.LJJIJIIJIL = str;
    }

    public final void LJJIJIL(String str) {
        this.LJJIJ = str;
    }

    public final void LJJIJL(boolean z) {
        this.LJJLIIIJLLLLLLLZ = z;
    }

    public final void LJJIJLIJ(int i) {
        this.LJIIJJI = i;
    }

    public final void LJJIL(String str) {
        this.LJIILJJIL = str;
    }

    public final void LJJJ(int i) {
        this.LJIIJ = i;
    }

    public final void LJJJIL(boolean z) {
        this.LJJJJLI = z;
    }

    public final void LJJJJI(int i) {
        this.LJIJJLI = i;
    }

    public final void LJJJJIZL(int i) {
        this.LJJIII = i;
    }

    public final void LJJIII(int i, int i2) {
        this.LJJJJ = i;
        this.LJJJJI = i2;
    }

    public final void LJJJI(String str, boolean z) {
        this.LJJIIJZLJL = z;
        this.LJJIIZ = str;
    }
}
