package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: renamed from: X.0i4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228650i4t {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final C1228700i4y LJFF;
    public final boolean LJI;
    public final C1228710i4z LJII;
    public final InterfaceC1228860i5E LJIIIIZZ;
    public final Map<String, String> LJIIIZ;
    public final boolean LJIIJ;
    public final Float LJIIJJI;
    public final boolean LJIIL;
    public final Float LJIILIIL;
    public final Function2<ViewGroup, Integer, View> LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final boolean LJIJJ;
    public final int LJIJJLI;
    public final int LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public final String LJJIII;
    public final boolean LJJIIJ;
    public final List<Integer> LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final boolean LJJIIZI;
    public final EnumC1228990i5R LJJIJ;

    public C1228650i4t() {
        this(null, null, null, null, 0, null, false, null, null, false, null, false, null, null, null, null, 0, 0, false, null, null, null, -1, 1);
    }

    public final String toString() {
        return "PublicGroupCreationParam(enterFrom=" + this.LIZ + ", enterMethod=" + this.LIZIZ + ", groupCategory=" + this.LIZJ + ", groupType=" + this.LIZLLL + ", businessType=" + this.LJ + ", afterGroupCreationParams=" + this.LJFF + ", fromList=" + this.LJI + ", preCheckParam=" + this.LJII + ", panelCallback=" + this.LJIIIIZZ + ", eventTracking=" + this.LJIIIZ + ", isFullScreen=" + this.LJIIJ + ", panelHeightRatio=" + this.LJIIJJI + ", disableMask=" + this.LJIIL + ", cornerRadiusPx=" + this.LJIILIIL + ", headerViewProvider=" + this.LJIILJJIL + ", title=" + this.LJIILL + ", subTitle=" + this.LJIILLIIL + ", backgroundColor=" + this.LJIIZILJ + ", formEditBgColor=" + this.LJIJ + ", topPaddingForFormInDp=" + this.LJIJI + ", showSeparatorInConfirmWidget=" + this.LJIJJ + ", confirmWidgetButtonMarginTopDp=" + this.LJIJJLI + ", confirmWidgetButtonMarginBottomDp=" + this.LJIL + ", confirmWidgetManagedExternally=" + this.LJJ + ", enableShowQuestion=" + this.LJJI + ", enableShowOnProfile=" + this.LJJIFFI + ", defaultShowOnProfile=" + this.LJJII + ", defaultGroupName=" + this.LJJIII + ", enableRequiredTag=" + this.LJJIIJ + ", accessCriteriaCollectionIds=" + this.LJJIIJZLJL + ", isInUnifiedGroupCreation=" + this.LJJIIZ + ", isGroupFull=" + this.LJJIIZI + ", defaultCategory=" + this.LJJIJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1228650i4t(String str, String str2, String str3, String str4, int i, C1228700i4y c1228700i4y, boolean z, InterfaceC1228860i5E interfaceC1228860i5E, Map map, boolean z2, Float f, boolean z3, Float f2, AwS633S0100000_19 awS633S0100000_19, String str5, String str6, int i2, int i3, boolean z4, String str7, List list, EnumC1228990i5R enumC1228990i5R, int i4, int i5) {
        C1228710i4z c1228710i4z;
        int i6;
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        EnumC1228990i5R enumC1228990i5R2 = enumC1228990i5R;
        boolean z7 = z4;
        String str8 = str5;
        AwS633S0100000_19 awS633S0100000_192 = awS633S0100000_19;
        boolean z8 = z3;
        boolean z9 = z2;
        Map mapLJ = map;
        InterfaceC1228860i5E interfaceC1228860i5E2 = interfaceC1228860i5E;
        List list2 = list;
        int i9 = i3;
        boolean z10 = z;
        Float f3 = f2;
        C1228700i4y c1228700i4y2 = c1228700i4y;
        int i10 = i2;
        String str9 = str4;
        Float f4 = f;
        int value = i;
        String str10 = str3;
        String str11 = str2;
        String str12 = (i4 & 1) != 0 ? "" : str;
        str11 = (i4 & 2) != 0 ? "" : str11;
        str10 = (i4 & 4) != 0 ? "" : str10;
        str9 = (i4 & 8) != 0 ? "" : str9;
        value = (i4 & 16) != 0 ? EnumC1219960hqs.UNKNOWN.getValue() : value;
        if ((i4 & 32) != 0) {
            int i11 = 0;
            c1228700i4y2 = new C1228700i4y(i11, i11, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
        }
        z10 = (i4 & 64) != 0 ? false : z10;
        if ((i4 & 128) != 0) {
            c1228710i4z = new C1228710i4z(null, EnumC1219960hqs.UNKNOWN.getValue(), null, "");
        } else {
            c1228710i4z = null;
        }
        interfaceC1228860i5E2 = (i4 & 256) != 0 ? null : interfaceC1228860i5E2;
        mapLJ = (i4 & 512) != 0 ? C2097608Jq.LJ() : mapLJ;
        z9 = (i4 & 1024) != 0 ? true : z9;
        f4 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : f4;
        z8 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z8;
        f3 = (i4 & 8192) != 0 ? null : f3;
        awS633S0100000_192 = (i4 & 16384) != 0 ? null : awS633S0100000_192;
        str8 = (32768 & i4) != 0 ? null : str8;
        String str13 = (65536 & i4) == 0 ? str6 : null;
        i10 = (131072 & i4) != 0 ? R.attr.zm : i10;
        i9 = (262144 & i4) != 0 ? R.attr.a1e : i9;
        if ((524288 & i4) != 0) {
            i6 = 24;
        } else {
            i6 = 0;
        }
        if ((2097152 & i4) != 0) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        if ((4194304 & i4) != 0) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        if ((16777216 & i4) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        z7 = (67108864 & i4) != 0 ? false : z7;
        String str14 = (134217728 & i4) == 0 ? str7 : "";
        if ((268435456 & i4) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this(str12, str11, str10, str9, value, c1228700i4y2, z10, c1228710i4z, interfaceC1228860i5E2, mapLJ, z9, f4, z8, f3, awS633S0100000_192, str8, str13, i10, i9, i6, false, i7, i8, false, z5, false, z7, str14, z6, (i4 & 536870912) != 0 ? C13BV.INSTANCE : list2, false, false, (i5 & 1) != 0 ? EnumC1228990i5R.PUBLIC_GROUP : enumC1228990i5R2);
    }

    public static C1228650i4t LIZ(C1228650i4t c1228650i4t, String str, String str2, String str3, String str4, int i, C1228700i4y c1228700i4y, boolean z, C1228710i4z c1228710i4z, Map map, boolean z2, Float f, boolean z3, boolean z4, int i2, int i3, boolean z5, boolean z6, boolean z7, String str5, List list, boolean z8, boolean z9, EnumC1228990i5R enumC1228990i5R, int i4, int i5) {
        InterfaceC1228860i5E interfaceC1228860i5E;
        Float f2;
        Function2<ViewGroup, Integer, View> function2;
        String str6;
        int i6;
        int i7;
        int i8;
        boolean z10;
        boolean z11;
        boolean z12 = z9;
        boolean z13 = z7;
        boolean z14 = z5;
        int i9 = i2;
        boolean z15 = z3;
        EnumC1228990i5R enumC1228990i5R2 = enumC1228990i5R;
        boolean z16 = z4;
        C1228710i4z c1228710i4z2 = c1228710i4z;
        boolean z17 = z6;
        boolean z18 = z;
        boolean z19 = z8;
        C1228700i4y c1228700i4y2 = c1228700i4y;
        String str7 = str4;
        List list2 = list;
        Float f3 = f;
        int i10 = i;
        boolean z20 = z2;
        Map map2 = map;
        int i11 = i3;
        String str8 = str3;
        String str9 = str5;
        String str10 = str2;
        String str11 = str;
        if ((i4 & 1) != 0) {
            str11 = c1228650i4t.LIZ;
        }
        if ((i4 & 2) != 0) {
            str10 = c1228650i4t.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            str8 = c1228650i4t.LIZJ;
        }
        if ((i4 & 8) != 0) {
            str7 = c1228650i4t.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            i10 = c1228650i4t.LJ;
        }
        if ((i4 & 32) != 0) {
            c1228700i4y2 = c1228650i4t.LJFF;
        }
        if ((i4 & 64) != 0) {
            z18 = c1228650i4t.LJI;
        }
        if ((i4 & 128) != 0) {
            c1228710i4z2 = c1228650i4t.LJII;
        }
        String str12 = null;
        if ((i4 & 256) != 0) {
            interfaceC1228860i5E = c1228650i4t.LJIIIIZZ;
        } else {
            interfaceC1228860i5E = null;
        }
        if ((i4 & 512) != 0) {
            map2 = c1228650i4t.LJIIIZ;
        }
        if ((i4 & 1024) != 0) {
            z20 = c1228650i4t.LJIIJ;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            f3 = c1228650i4t.LJIIJJI;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z15 = c1228650i4t.LJIIL;
        }
        if ((i4 & 8192) != 0) {
            f2 = c1228650i4t.LJIILIIL;
        } else {
            f2 = null;
        }
        if ((i4 & 16384) != 0) {
            function2 = c1228650i4t.LJIILJJIL;
        } else {
            function2 = null;
        }
        if ((32768 & i4) != 0) {
            str6 = c1228650i4t.LJIILL;
        } else {
            str6 = null;
        }
        if ((65536 & i4) != 0) {
            str12 = c1228650i4t.LJIILLIIL;
        }
        if ((131072 & i4) != 0) {
            i6 = c1228650i4t.LJIIZILJ;
        } else {
            i6 = 0;
        }
        if ((262144 & i4) != 0) {
            i7 = c1228650i4t.LJIJ;
        } else {
            i7 = 0;
        }
        if ((524288 & i4) != 0) {
            i8 = c1228650i4t.LJIJI;
        } else {
            i8 = 0;
        }
        if ((1048576 & i4) != 0) {
            z16 = c1228650i4t.LJIJJ;
        }
        if ((2097152 & i4) != 0) {
            i9 = c1228650i4t.LJIJJLI;
        }
        if ((4194304 & i4) != 0) {
            i11 = c1228650i4t.LJIL;
        }
        if ((8388608 & i4) != 0) {
            z14 = c1228650i4t.LJJ;
        }
        if ((16777216 & i4) != 0) {
            z10 = c1228650i4t.LJJI;
        } else {
            z10 = false;
        }
        if ((33554432 & i4) != 0) {
            z17 = c1228650i4t.LJJIFFI;
        }
        if ((67108864 & i4) != 0) {
            z13 = c1228650i4t.LJJII;
        }
        if ((134217728 & i4) != 0) {
            str9 = c1228650i4t.LJJIII;
        }
        if ((268435456 & i4) != 0) {
            z11 = c1228650i4t.LJJIIJ;
        } else {
            z11 = false;
        }
        if ((536870912 & i4) != 0) {
            list2 = c1228650i4t.LJJIIJZLJL;
        }
        if ((1073741824 & i4) != 0) {
            z19 = c1228650i4t.LJJIIZ;
        }
        if ((i4 & Integer.MIN_VALUE) != 0) {
            z12 = c1228650i4t.LJJIIZI;
        }
        if ((i5 & 1) != 0) {
            enumC1228990i5R2 = c1228650i4t.LJJIJ;
        }
        c1228650i4t.getClass();
        return new C1228650i4t(str11, str10, str8, str7, i10, c1228700i4y2, z18, c1228710i4z2, interfaceC1228860i5E, map2, z20, f3, z15, f2, function2, str6, str12, i6, i7, i8, z16, i9, i11, z14, z10, z17, z13, str9, z11, list2, z19, z12, enumC1228990i5R2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1228650i4t(String str, String str2, String str3, String str4, int i, C1228700i4y c1228700i4y, boolean z, C1228710i4z c1228710i4z, InterfaceC1228860i5E interfaceC1228860i5E, Map<String, String> map, boolean z2, Float f, boolean z3, Float f2, Function2<? super ViewGroup, ? super Integer, ? extends View> function2, String str5, String str6, int i2, int i3, int i4, boolean z4, int i5, int i6, boolean z5, boolean z6, boolean z7, boolean z8, String str7, boolean z9, List<Integer> list, boolean z10, boolean z11, EnumC1228990i5R enumC1228990i5R) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = c1228700i4y;
        this.LJI = z;
        this.LJII = c1228710i4z;
        this.LJIIIIZZ = interfaceC1228860i5E;
        this.LJIIIZ = map;
        this.LJIIJ = z2;
        this.LJIIJJI = f;
        this.LJIIL = z3;
        this.LJIILIIL = f2;
        this.LJIILJJIL = function2;
        this.LJIILL = str5;
        this.LJIILLIIL = str6;
        this.LJIIZILJ = i2;
        this.LJIJ = i3;
        this.LJIJI = i4;
        this.LJIJJ = z4;
        this.LJIJJLI = i5;
        this.LJIL = i6;
        this.LJJ = z5;
        this.LJJI = z6;
        this.LJJIFFI = z7;
        this.LJJII = z8;
        this.LJJIII = str7;
        this.LJJIIJ = z9;
        this.LJJIIJZLJL = list;
        this.LJJIIZ = z10;
        this.LJJIIZI = z11;
        this.LJJIJ = enumC1228990i5R;
    }
}
