package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322460CkW {
    public static final /* synthetic */ int LJIILL = 0;
    public final CKEDraftInfo LIZ;
    public final String LIZIZ;
    public final AbstractC322270CkD LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final int LJI;
    public final float LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final int LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C322460CkW)) {
            return false;
        }
        C322460CkW c322460CkW = (C322460CkW) obj;
        return Intrinsics.LJFF(this.LIZ, c322460CkW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c322460CkW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c322460CkW.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c322460CkW.LIZLLL) && Intrinsics.LJFF(this.LJ, c322460CkW.LJ) && this.LJFF == c322460CkW.LJFF && this.LJI == c322460CkW.LJI && Float.compare(this.LJII, c322460CkW.LJII) == 0 && Intrinsics.LJFF(this.LJIIIIZZ, c322460CkW.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c322460CkW.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c322460CkW.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c322460CkW.LJIIJJI) && this.LJIIL == c322460CkW.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c322460CkW.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c322460CkW.LJIILJJIL);
    }

    public final String toString() {
        return "EffectDraftDetailCardData(originalDraft=" + this.LIZ + ", name=" + this.LIZIZ + ", uiStatus=" + this.LIZJ + ", draftId=" + this.LIZLLL + ", effectId=" + this.LJ + ", isAIEffect=" + this.LJFF + ", aiTaskStatus=" + this.LJI + ", aiTaskProgress=" + this.LJII + ", aiTaskResultPath=" + this.LJIIIIZZ + ", iconPath=" + this.LJIIIZ + ", draftPath=" + this.LJIIJ + ", updateTime=" + this.LJIIJJI + ", moderationStatus=" + this.LJIIL + ", ameTemplateId=" + this.LJIILIIL + ", templateResourceId=" + this.LJIILJJIL + ')';
    }

    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("prop_id", this.LJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this.LJIIL);
        linkedHashMap.put("effect_status", C2188811AlT.LIZIZ(sbLIZ));
        linkedHashMap.put("ame_template_id", this.LJIILIIL);
        linkedHashMap.put("template_resource_id", this.LJIILJJIL);
        return linkedHashMap;
    }

    public static C322460CkW LIZIZ(C322460CkW c322460CkW, AbstractC322270CkD abstractC322270CkD, int i, float f, String str, int i2) {
        CKEDraftInfo cKEDraftInfo;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        int i3;
        String str8;
        String str9 = str;
        int i4 = i;
        float f2 = f;
        AbstractC322270CkD abstractC322270CkD2 = abstractC322270CkD;
        String str10 = null;
        if ((i2 & 1) != 0) {
            cKEDraftInfo = c322460CkW.LIZ;
        } else {
            cKEDraftInfo = null;
        }
        if ((i2 & 2) != 0) {
            str2 = c322460CkW.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            abstractC322270CkD2 = c322460CkW.LIZJ;
        }
        if ((i2 & 8) != 0) {
            str3 = c322460CkW.LIZLLL;
        } else {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            str4 = c322460CkW.LJ;
        } else {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            z = c322460CkW.LJFF;
        } else {
            z = false;
        }
        if ((i2 & 64) != 0) {
            i4 = c322460CkW.LJI;
        }
        if ((i2 & 128) != 0) {
            f2 = c322460CkW.LJII;
        }
        if ((i2 & 256) != 0) {
            str9 = c322460CkW.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            str5 = c322460CkW.LJIIIZ;
        } else {
            str5 = null;
        }
        if ((i2 & 1024) != 0) {
            str6 = c322460CkW.LJIIJ;
        } else {
            str6 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str7 = c322460CkW.LJIIJJI;
        } else {
            str7 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i3 = c322460CkW.LJIIL;
        } else {
            i3 = 0;
        }
        if ((i2 & 8192) != 0) {
            str8 = c322460CkW.LJIILIIL;
        } else {
            str8 = null;
        }
        if ((i2 & 16384) != 0) {
            str10 = c322460CkW.LJIILJJIL;
        }
        c322460CkW.getClass();
        return new C322460CkW(cKEDraftInfo, str2, abstractC322270CkD2, str3, str4, z, i4, f2, str9, str5, str6, str7, i3, str8, str10);
    }

    public C322460CkW(CKEDraftInfo cKEDraftInfo, String str, AbstractC322270CkD abstractC322270CkD, String str2, String str3, boolean z, int i, float f, String str4, String str5, String str6, String str7, int i2, String str8, String str9) {
        this.LIZ = cKEDraftInfo;
        this.LIZIZ = str;
        this.LIZJ = abstractC322270CkD;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = i;
        this.LJII = f;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = str5;
        this.LJIIJ = str6;
        this.LJIIJJI = str7;
        this.LJIIL = i2;
        this.LJIILIIL = str8;
        this.LJIILJJIL = str9;
    }
}
