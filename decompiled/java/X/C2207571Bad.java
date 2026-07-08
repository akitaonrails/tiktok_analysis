package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.1Bad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207571Bad {
    public final LinkedHashMap<String, String> LIZ = new LinkedHashMap<>(64);

    public final void LIZIZ(EnumC2207531BaZ enumC2207531BaZ, List<C2207661Bam> list) {
        String str = enumC2207531BaZ.getName() + "_limit_rule";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            if (i >= ((ArrayList) list).size()) {
                LIZLLL(str, sb.toString());
                return;
            }
            C2207661Bam c2207661Bam = (C2207661Bam) ListProtector.get(list, i);
            sb.append("(0:");
            c2207661Bam.getClass();
            sb.append(c2207661Bam.LIZ);
            sb.append(":");
            sb.append(c2207661Bam.LIZIZ);
            sb.append(",");
            boolean z = c2207661Bam.LIZJ;
            String str2 = CardStruct.IStatusCode.DEFAULT;
            sb.append(z ? "1" : CardStruct.IStatusCode.DEFAULT);
            sb.append(":");
            sb.append(c2207661Bam.LIZLLL);
            sb.append(",");
            if (c2207661Bam.LJ) {
                str2 = "1";
            }
            sb.append(str2);
            sb.append(":");
            sb.append(c2207661Bam.LJFF);
            sb.append(")");
            if (i != r7.size() - 1) {
                sb.append(',');
            }
            i++;
        }
    }

    public final void LIZJ(C2207671Ban c2207671Ban) {
        LIZLLL("task_priority_limit_rule", c2207671Ban.LIZ + "," + c2207671Ban.LIZIZ + ",1");
    }

    public final void LJ(Set<EnumC2207531BaZ> set) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = ((HashSet) set).iterator();
        while (it2.hasNext()) {
            sb.append(((EnumC2207531BaZ) it2.next()).getIndex());
            if (it2.hasNext()) {
                sb.append(",");
            }
        }
        LIZLLL("support_capability_set", sb.toString());
    }

    public final Set<EnumC2207531BaZ> LIZ() {
        String str = this.LIZ.get("support_capability_set");
        if (str != null) {
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
            simpleStringSplitter.setString(str);
            HashSet hashSet = new HashSet();
            Iterator<String> it2 = simpleStringSplitter.iterator();
            while (it2.hasNext()) {
                hashSet.add(EnumC2207531BaZ.valueOf(CastIntegerProtector.parseInt(it2.next())));
            }
            if (hashSet.size() != 0) {
                return hashSet;
            }
        }
        return null;
    }

    public final void LIZLLL(String str, String str2) {
        if (str.indexOf(61) == -1 && str.indexOf(59) == -1 && str.indexOf(0) == -1) {
            if (str2.indexOf(61) == -1 && str2.indexOf(59) == -1 && str2.indexOf(0) == -1) {
                this.LIZ.remove(str);
                this.LIZ.put(str, str2);
                return;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Value \"");
                sbLIZ.append(str2);
                sbLIZ.append("\" contains invalid character (= or ; or \\0)");
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Key \"");
            sbLIZ2.append(str);
            sbLIZ2.append("\" contains invalid character (= or ; or \\0)");
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        C2207231Ba5.LIZ(6);
    }
}
