package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Dv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354510Dv7 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ArrayList<EnumC356200Dxq> LJ;
    public final C0E00 LJFF;
    public final HashMap<String, Object> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public NLETrackSlot LJIIJJI;

    public final String toString() {
        return "MagicResourceItem(name=" + this.LIZ + ", resourceId=" + this.LIZIZ + ", effectId=" + this.LIZJ + ", resourcePath=" + this.LIZLLL + ", magicResourceTypeList=" + this.LJ + ", magicType=" + this.LJFF + ", extra=" + this.LJI + ", category=" + this.LJII + ", iconUrl=" + this.LJIIIIZZ + ", seekCount=" + this.LJIIIZ + ", shouldDisableEffectDisplay=" + this.LJIIJ + ", freezeSlot=" + this.LJIIJJI + ')';
    }

    public C354510Dv7(String str, String str2, String str3, String str4, ArrayList arrayList, C0E00 c0e00, HashMap map, String str5, String str6, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        str2 = (i2 & 2) != 0 ? "" : str2;
        str3 = (i2 & 4) != 0 ? "" : str3;
        str4 = (i2 & 8) != 0 ? "" : str4;
        arrayList = (i2 & 16) != 0 ? new ArrayList() : arrayList;
        c0e00 = (i2 & 32) != 0 ? null : c0e00;
        map = (i2 & 64) != 0 ? null : map;
        str5 = (i2 & 128) != 0 ? "" : str5;
        str6 = (i2 & 256) != 0 ? "" : str6;
        i = (i2 & 512) != 0 ? 20 : i;
        z = (i2 & 1024) != 0 ? true : z;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = arrayList;
        this.LJFF = c0e00;
        this.LJI = map;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = i;
        this.LJIIJ = z;
        this.LJIIJJI = null;
    }
}
