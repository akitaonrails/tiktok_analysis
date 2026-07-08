package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20525415Tg implements C15W0 {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Long LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20525415Tg)) {
            return false;
        }
        C20525415Tg c20525415Tg = (C20525415Tg) obj;
        return Intrinsics.LJFF(this.LIZ, c20525415Tg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20525415Tg.LIZIZ) && this.LIZJ == c20525415Tg.LIZJ && this.LIZLLL == c20525415Tg.LIZLLL && this.LJ == c20525415Tg.LJ && this.LJFF == c20525415Tg.LJFF && Intrinsics.LJFF(this.LJI, c20525415Tg.LJI) && Intrinsics.LJFF(this.LJII, c20525415Tg.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c20525415Tg.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c20525415Tg.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c20525415Tg.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c20525415Tg.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c20525415Tg.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c20525415Tg.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c20525415Tg.LJIILJJIL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        String str2 = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.LJIIJJI;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.LJIIL;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIILIIL;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIILJJIL;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "EnterExploreET(enterMethod=" + this.LIZ + ", enterFrom=" + this.LIZIZ + ", isColdStartFirstEnter=" + this.LIZJ + ", isTodayFirstEnter=" + this.LIZLLL + ", duration=" + this.LJ + ", isTopTab=" + this.LJFF + ", shootEnterFrom=" + this.LJI + ", exploreTabType=" + this.LJII + ", preloadLogId=" + this.LJIIIIZZ + ", groupId=" + this.LJIIIZ + ", requestId=" + this.LJIIJ + ", interestId=" + this.LJIIJJI + ", interestName=" + this.LJIIL + ", subEnterMethod=" + this.LJIILIIL + ", specialShapedCardTriggerType=" + this.LJIILJJIL + ')';
    }

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("is_coldstart_first_enter", this.LIZJ ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("is_today_first_enter", this.LIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("duration", String.valueOf(this.LJ));
        c2344009Gk.LJIIIIZZ("enter_method", this.LIZ);
        c2344009Gk.LJIIIIZZ("is_top_tab", this.LJFF ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJIIIIZZ("shoot_enter_from", this.LJI);
        c2344009Gk.LJIIIIZZ("preload_logid", this.LJIIIIZZ);
        c2344009Gk.LJIIIIZZ("explore_tab_type", this.LJII);
        C0SAI.LIZ(c2344009Gk, "group_id", this.LJIIIZ);
        c2344009Gk.LJIIIIZZ("request_id", this.LJIIJ);
        c2344009Gk.LJ(this.LJIIJJI, "interest_id");
        c2344009Gk.LJIIIIZZ("interest_name", this.LJIIL);
        c2344009Gk.LJIIIIZZ("sub_enter_method", this.LJIILIIL);
        C0SAI.LIZ(c2344009Gk, "special_shaped_card_trigger_type", this.LJIILJJIL);
        return c2344009Gk.LIZ;
    }

    @Override // X.C15W0
    public final String getEventName() {
        return this.LJIILL;
    }

    public /* synthetic */ C20525415Tg(String str, String str2, boolean z, boolean z2, long j, boolean z3, String str3, String str4, String str5, Long l, String str6, int i) {
        this(str, str2, z, z2, j, z3, str3, str4, str5, null, null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : l, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str6, null, null);
    }

    public C20525415Tg(String str, String str2, boolean z, boolean z2, long j, boolean z3, String str3, String str4, String str5, String str6, String str7, Long l, String str8, String str9, String str10) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = j;
        this.LJFF = z3;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = str7;
        this.LJIIJJI = l;
        this.LJIIL = str8;
        this.LJIILIIL = str9;
        this.LJIILJJIL = str10;
        this.LJIILL = "enter_homepage_explore";
    }
}
