package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.google.gson.s;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F8B, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8B {
    /* JADX WARN: Multi-variable type inference failed */
    public static NLETextRichContent LIZ(String str) {
        try {
            e eVar = new e();
            eVar.LJIIL = false;
            NLETextRichContent nLETextRichContent = (NLETextRichContent) GsonProtectorUtils.fromJson(eVar.LIZ(), str, NLETextRichContent.class);
            if (nLETextRichContent == null) {
                float f = 0.0f;
                nLETextRichContent = new NLETextRichContent(2, "", new C385070F7x(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, false, f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0), 0, 0, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)), true, 0.0f, true, false, C1697810uHb.LJ(Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.0f, 0, 0.04f, 0.15f, 0.0f, 0.0f, 0.0f, -1.0f, C1697810uHb.LJ(Float.valueOf(-1.0f), Float.valueOf(-1.0f)), 1, 254, C1697810uHb.LJ("", "", ""), false, "...", "", false, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), false, 1.0f, C1697810uHb.LJ(Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(0.8f)), true, false);
            }
            float f2 = 0.0f;
            C385070F7x c385070F7x = new C385070F7x(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f2, false, f2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
            c385070F7x.fromLabelStr(nLETextRichContent.richText);
            nLETextRichContent.setRichTextData(c385070F7x);
            return nLETextRichContent;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            float f3 = 0.0f;
            return new NLETextRichContent(2, "", new C385070F7x(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f3, false, f3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0), 0, 0, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)), true, 0.0f, true, false, C1697810uHb.LJ(Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.0f, 0, 0.04f, 0.15f, 0.0f, 0.0f, 0.0f, -1.0f, C1697810uHb.LJ(Float.valueOf(-1.0f), Float.valueOf(-1.0f)), 1, 254, C1697810uHb.LJ("", "", ""), false, "...", "", false, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), false, 1.0f, C1697810uHb.LJ(Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(0.8f)), true, false);
        }
    }

    public static List LIZIZ(String str) {
        String strLIZJ = C388300FKi.LIZJ();
        Map mapLJ = (Map) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), C388300FKi.LIZIZ(), (Type) Map.class);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList();
        Object obj = mapLJ.get(str);
        if (obj == null) {
            obj = "";
        }
        C0VSJ c0vsj = new C0VSJ(strLIZJ);
        List listLJIIJJI = C1697810uHb.LJIIJJI("ttf", "otf", "woff", "woff2", "eot", "fon", "fnt", "pfb", "pfm", "svg");
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (listLJIIJJI.contains(C08QA.LJIJ(file).toLowerCase(Locale.ROOT))) {
                    if (Intrinsics.LJFF(C08QA.LJIJI(file), obj)) {
                        ListProtector.add(arrayList, 0, file.getAbsolutePath());
                    } else {
                        arrayList.add(file.getAbsolutePath());
                    }
                }
            }
        }
        return arrayList;
    }
}
