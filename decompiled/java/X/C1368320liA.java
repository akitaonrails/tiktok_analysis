package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S1010000_2;

/* JADX INFO: renamed from: X.0liA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368320liA {
    public SharePackage LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final BaseContent LIZLLL;
    public final Map<String, String> LJ;
    public final Map<String, String> LJFF;
    public final InterfaceC1368360liE LJI;
    public final InterfaceC1368680lik LJII;
    public final InterfaceC1362600lYw LJIIIIZZ;
    public final C1214170hhX LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;
    public final EnumC626460Ohg LJIILIIL;
    public final C1365460ldY LJIILJJIL;
    public final Set<IMContact> LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;
    public final boolean LJIL;
    public final Function1<? super List<String>, ? extends Map<String, Integer>> LJJ;
    public final Function1<? super List<String>, ? extends Map<String, Integer>> LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public final String LJJIII;
    public final boolean LJJIIJ;
    public final boolean LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final List<C0I1Z> LJJIIZI;

    public C1368320liA() {
        throw null;
    }

    public C1368320liA(SharePackage sharePackage, String str, String str2, C1364890lcd c1364890lcd, InterfaceC1368680lik interfaceC1368680lik, InterfaceC1362600lYw interfaceC1362600lYw, C1214170hhX c1214170hhX, boolean z, C1365460ldY c1365460ldY, Set set, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, AwS0S1010000_2 awS0S1010000_2, AwS0S1010000_2 awS0S1010000_22, boolean z8, String str3, boolean z9, boolean z10, boolean z11, C13BV c13bv, int i, int i2) {
        int i3;
        boolean z12;
        boolean z13;
        boolean z14 = z2;
        Set set2 = set;
        C1365460ldY c1365460ldY2 = c1365460ldY;
        boolean z15 = z;
        C1214170hhX c1214170hhX2 = c1214170hhX;
        InterfaceC1362600lYw interfaceC1362600lYw2 = interfaceC1362600lYw;
        InterfaceC1368680lik interfaceC1368680lik2 = interfaceC1368680lik;
        C1364890lcd c1364890lcd2 = c1364890lcd;
        String str4 = str2;
        boolean z16 = z11;
        C13BV c13bv2 = c13bv;
        boolean z17 = z10;
        boolean z18 = z9;
        String str5 = str3;
        boolean z19 = z8;
        AwS0S1010000_2 awS0S1010000_23 = awS0S1010000_22;
        AwS0S1010000_2 awS0S1010000_24 = awS0S1010000_2;
        boolean z20 = z7;
        boolean z21 = z6;
        boolean z22 = z5;
        boolean z23 = z4;
        boolean z24 = z3;
        String str6 = (i & 2) != 0 ? null : str;
        str4 = (i & 4) != 0 ? null : str4;
        c1364890lcd2 = (i & 64) != 0 ? null : c1364890lcd2;
        interfaceC1368680lik2 = (i & 128) != 0 ? null : interfaceC1368680lik2;
        interfaceC1362600lYw2 = (i & 256) != 0 ? null : interfaceC1362600lYw2;
        c1214170hhX2 = (i & 512) != 0 ? null : c1214170hhX2;
        z15 = (i & 1024) != 0 ? false : z15;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i3 = 15;
        } else {
            i3 = 0;
        }
        c1365460ldY2 = (i & 16384) != 0 ? null : c1365460ldY2;
        set2 = (32768 & i) != 0 ? null : set2;
        z14 = (65536 & i) != 0 ? false : z14;
        if ((131072 & i) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        z24 = (262144 & i) != 0 ? false : z24;
        z23 = (524288 & i) != 0 ? true : z23;
        z22 = (2097152 & i) != 0 ? true : z22;
        z21 = (4194304 & i) != 0 ? false : z21;
        z20 = (8388608 & i) != 0 ? false : z20;
        awS0S1010000_24 = (16777216 & i) != 0 ? null : awS0S1010000_24;
        awS0S1010000_23 = (33554432 & i) != 0 ? null : awS0S1010000_23;
        z19 = (67108864 & i) != 0 ? false : z19;
        if ((134217728 & i) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        str5 = (268435456 & i) != 0 ? null : str5;
        z18 = (536870912 & i) != 0 ? false : z18;
        z17 = (1073741824 & i) != 0 ? false : z17;
        z16 = (i & Integer.MIN_VALUE) != 0 ? false : z16;
        c13bv2 = (i2 & 1) != 0 ? C13BV.INSTANCE : c13bv2;
        this.LIZ = sharePackage;
        this.LIZIZ = str6;
        this.LIZJ = str4;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = c1364890lcd2;
        this.LJII = interfaceC1368680lik2;
        this.LJIIIIZZ = interfaceC1362600lYw2;
        this.LJIIIZ = c1214170hhX2;
        this.LJIIJ = z15;
        this.LJIIJJI = i3;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = c1365460ldY2;
        this.LJIILL = set2;
        this.LJIILLIIL = z14;
        this.LJIIZILJ = z12;
        this.LJIJ = z24;
        this.LJIJI = z23;
        this.LJIJJ = z22;
        this.LJIJJLI = z21;
        this.LJIL = z20;
        this.LJJ = awS0S1010000_24;
        this.LJJI = awS0S1010000_23;
        this.LJJIFFI = z19;
        this.LJJII = z13;
        this.LJJIII = str5;
        this.LJJIIJ = z18;
        this.LJJIIJZLJL = z17;
        this.LJJIIZ = z16;
        this.LJJIIZI = c13bv2;
    }
}
