package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.c3;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0psx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528770psx {
    public static final C1528770psx LIZ = new C1528770psx();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(129));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(132));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(130));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(131));

    public static C1528820pt2 LIZ() {
        return (C1528820pt2) LIZLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(C1528770psx c1528770psx, String str, String str2) {
        Object key;
        c1528770psx.getClass();
        entry = null;
        for (Map.Entry entry : LIZ().entrySet()) {
        }
        if (entry != null) {
            key = entry.getKey();
        } else {
            key = null;
        }
        if (Intrinsics.LJFF(key, str) && Intrinsics.LJFF(entry.getValue(), str2)) {
            return;
        }
        LinkedHashSet<Pair> linkedHashSet = new LinkedHashSet();
        synchronized (LIZJ.getValue()) {
            try {
                C1528770psx c1528770psx2 = LIZ;
                c1528770psx2.getClass();
                String str3 = (String) LIZ().get(str);
                if (str3 != null && str3.length() != 0 && !Intrinsics.LJFF(str3, str2)) {
                    LIZ().remove(str);
                    linkedHashSet.add(new Pair(str, str3));
                }
                LIZ().put(str, str2);
                LIZ().drainEvictions(new C5185020h(linkedHashSet, (Set<Pair<String, String>>) 16));
                c1528770psx2.getClass();
                C1528820pt2 c1528820pt2LIZ = LIZ();
                ArrayList arrayList = new ArrayList(c1528820pt2LIZ.size());
                for (Map.Entry entry2 : c1528820pt2LIZ.entrySet()) {
                    arrayList.add(((String) entry2.getKey()) + '/' + ((String) entry2.getValue()));
                }
                String strLIZIZ = C309390CAv.LIZIZ(C13LP.LLIIII(arrayList));
                LIZ.getClass();
                ((Keva) LJ.getValue()).storeString("h5_folder_lru_manifest", strLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (Pair pair : linkedHashSet) {
            LIZ.getClass();
            C1528790psz c1528790psz = (C1528790psz) LIZIZ.getValue();
            String str4 = (String) pair.getFirst();
            String str5 = (String) pair.getSecond();
            c3 c3Var = (c3) c1528790psz.LIZJ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str4);
            sbLIZ.append('/');
            sbLIZ.append(str5);
            c3Var.LIZ(1, C2188811AlT.LIZIZ(sbLIZ), new C2129508Vx(str4, str5, null));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x008c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void LIZJ(com.bytedance.retrofit2.mime.TypedInput r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1528770psx.LIZJ(com.bytedance.retrofit2.mime.TypedInput, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
