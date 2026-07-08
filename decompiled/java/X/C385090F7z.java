package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy.NLETextRichContent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.google.gson.s;

/* JADX INFO: renamed from: X.0F7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385090F7z {
    public static NLETextRichContent LIZ(String str) {
        try {
            e eVar = new e();
            eVar.LJIIL = false;
            NLETextRichContent nLETextRichContent = (NLETextRichContent) GsonProtectorUtils.fromJson(eVar.LIZ(), str, NLETextRichContent.class);
            if (nLETextRichContent == null) {
                nLETextRichContent = new NLETextRichContent(2, "", new C385080F7y("", null, null, 48.0f, false, 0.0f, null, null, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.2f), 0, 0, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)), true, 0.0f, true, false, C1697810uHb.LJ(Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.0f, 0, 0.04f, 0.15f, 0.0f, 0.0f, 0.0f, -1.0f, C1697810uHb.LJ(Float.valueOf(-1.0f), Float.valueOf(-1.0f)), 0, 254, C1697810uHb.LJ("", "", ""), false, "...", "", false, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), false, 1.0f, C1697810uHb.LJ(Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(0.8f)), true);
            }
            C385080F7y c385080F7y = new C385080F7y("", null, null, 48.0f, false, 0.0f, null, null, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.2f);
            c385080F7y.fromLabelStr(nLETextRichContent.richText);
            nLETextRichContent.setRichTextData(c385080F7y);
            return nLETextRichContent;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return new NLETextRichContent(2, "", new C385080F7y("", null, null, 48.0f, false, 0.0f, null, null, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.2f), 0, 0, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)), true, 0.0f, true, false, C1697810uHb.LJ(Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.0f, 0, 0.04f, 0.15f, 0.0f, 0.0f, 0.0f, -1.0f, C1697810uHb.LJ(Float.valueOf(-1.0f), Float.valueOf(-1.0f)), 0, 254, C1697810uHb.LJ("", "", ""), false, "...", "", false, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), false, 1.0f, C1697810uHb.LJ(Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(0.8f)), true);
        }
    }
}
