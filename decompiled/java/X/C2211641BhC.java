package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.1BhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211641BhC {
    public String LIZ;
    public int LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJII;
    public String LJIIIIZZ;
    public C2211641BhC LJIIIZ;
    public C2211641BhC LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public int LJIILL;
    public C2211641BhC LJIIZILJ;
    public C2211641BhC LJIJ;
    public C2211641BhC LJIJI;
    public C2211641BhC LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public WeakReference<Activity> LJJIFFI;
    public boolean LJJII;
    public WeakReference<Fragment> LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIZ;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJIL;
    public boolean LJJIJLIJ;
    public C1766890w51 LJJIZ;
    public ConcurrentHashMap<String, String> LJJJ;
    public final C13E8<String> LJI = new C13E8<>(10);
    public AnonymousClass1962 LJIILLIIL = AnonymousClass1962.INVISIBLE;
    public C2211641BhC LJIJJ = this;
    public final HashMap<String, HashSet<C2211641BhC>> LJIJJLI = new HashMap<>();
    public boolean LJJIIJZLJL = true;
    public String LJJIIZI = "default";
    public String LJJIJL = EnumC21266118Kd.NORMAL.getValue();
    public boolean LJJIL = true;

    public final String LIZ() {
        String str = this.LIZLLL;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final String LIZIZ() {
        String str = this.LIZJ;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final C807360Vlm LIZJ() {
        C2211641BhC c2211641BhC = this.LJIL;
        if (c2211641BhC != null) {
            c2211641BhC.LIZJ();
        }
        return new C807360Vlm(this.LIZ, LIZ(), this.LJ, this.LJFF, this.LJI, LJ(), this.LJIILJJIL);
    }

    public final Map<String, String> LJ() {
        Pair[] pairArr = new Pair[13];
        pairArr[0] = new Pair("duration", String.valueOf(this.LJJIJIL));
        pairArr[1] = new Pair("is_back", String.valueOf(this.LJIILL));
        String str = this.LJ;
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("btm_pre", str);
        String str2 = this.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[3] = new Pair("btm_ppre", str2);
        String str3 = this.LJIILJJIL;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("btm_last_stay", str3);
        String str4 = this.LJIIJJI;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[5] = new Pair("className", str4);
        String str5 = this.LJIIL;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[6] = new Pair("classNamePre", str5);
        String str6 = this.LJIILIIL;
        if (str6 == null) {
            str6 = "";
        }
        pairArr[7] = new Pair("classNamePPre", str6);
        pairArr[8] = new Pair("btm_chain", new JSONArray((Collection) this.LJI).toString());
        pairArr[9] = new Pair("enter_time", String.valueOf(this.LJJIJIIJIL));
        pairArr[10] = new Pair(Scene.SCENE_SERVICE, this.LJJIJL);
        String str7 = this.LJII;
        if (str7 == null) {
            str7 = "";
        }
        pairArr[11] = new Pair("upath_code", str7);
        String str8 = this.LJIIIIZZ;
        if (str8 == null) {
            str8 = "";
        }
        pairArr[12] = new Pair("upath_pre", str8);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C2211621BhA.LIZ.getClass();
        String str9 = C2211621BhA.LIZIZ;
        if (str9 == null || str9.length() == 0) {
            mapLJIIJ.put("btm", "");
        } else {
            mapLJIIJ.put("btm", LIZ());
        }
        if (this.LJJIJLIJ) {
            mapLJIIJ.put("fromFE", "1");
        } else {
            mapLJIIJ.put("fromFE", CardStruct.IStatusCode.DEFAULT);
        }
        mapLJIIJ.put("isRestore", String.valueOf(this.LJJIJIIJI));
        return mapLJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C2211641BhC r4) {
        /*
            r3 = this;
            r3.LJIJ = r4
            r1 = 0
            if (r4 == 0) goto L57
            X.0w51 r0 = r4.LJJIZ
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.LIZIZ
            r3.LJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L19
            if (r4 == 0) goto L57
        L13:
            java.lang.String r0 = r4.LIZ()
        L17:
            r3.LJ = r0
        L19:
            if (r4 == 0) goto L55
            java.lang.String r0 = r4.LJIIJJI
        L1d:
            r3.LJIIL = r0
            if (r4 == 0) goto L53
            java.lang.String r0 = r4.LJ
        L23:
            r3.LJFF = r0
            if (r4 == 0) goto L51
            java.lang.String r0 = r4.LJIIL
        L29:
            r3.LJIILIIL = r0
            if (r4 == 0) goto L31
            java.lang.String r1 = r4.LIZ()
        L31:
            r3.LJIILJJIL = r1
            if (r4 == 0) goto L94
            X.13E8<java.lang.String> r0 = r3.LJI
            r0.clear()
            X.13E8<java.lang.String> r1 = r4.LJI
            X.13E8<java.lang.String> r0 = r3.LJI
            r0.addAll(r1)
        L41:
            X.13E8<java.lang.String> r0 = r3.LJI
            int r0 = r0.size()
            r2 = 10
            if (r0 <= r2) goto L59
            X.13E8<java.lang.String> r0 = r3.LJI
            r0.removeFirst()
            goto L41
        L51:
            r0 = r1
            goto L29
        L53:
            r0 = r1
            goto L23
        L55:
            r0 = r1
            goto L1d
        L57:
            r0 = r1
            goto L17
        L59:
            java.lang.String r1 = r3.LJ
            if (r1 == 0) goto L62
            X.13E8<java.lang.String> r0 = r3.LJI
            r0.addLast(r1)
        L62:
            X.13E8<java.lang.String> r0 = r3.LJI
            int r0 = r0.size()
            if (r0 <= r2) goto L70
            X.13E8<java.lang.String> r0 = r3.LJI
            r0.removeFirst()
            goto L62
        L70:
            java.lang.String r1 = r4.LJJIJL
            X.18Kd r2 = X.EnumC21266118Kd.VIRTUAL
            java.lang.String r0 = r2.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L90
            java.lang.String r1 = r3.LJJIJL
            java.lang.String r0 = r2.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L90
            r4.LJIIZILJ = r3
        L90:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L99
        L94:
            X.13E8<java.lang.String> r0 = r3.LJI
            r0.clear()
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2211641BhC.LIZLLL(X.1BhC):void");
    }

    public C2211641BhC(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
