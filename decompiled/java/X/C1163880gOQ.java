package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gOQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163880gOQ implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final List<Aweme> LLILLL;
    public final ArrayList<String> LLILZ;
    public final String LLILZIL;
    public final C291001Au<EnumC442690HXn> LLILZLL;
    public final AbstractC1623806Xk<ManageResponse> LLIZ;
    public final AbstractC1623806Xk<ManageResponse> LLIZLLLIL;
    public final String LLJ;
    public final C291001Au<Object> LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;

    public C1163880gOQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1163880gOQ)) {
            return false;
        }
        C1163880gOQ c1163880gOQ = (C1163880gOQ) obj;
        return Intrinsics.LJFF(this.LL, c1163880gOQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1163880gOQ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1163880gOQ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1163880gOQ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1163880gOQ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1163880gOQ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1163880gOQ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1163880gOQ.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1163880gOQ.LLJ) && Intrinsics.LJFF(this.LLJI, c1163880gOQ.LLJI) && this.LLJIJIL == c1163880gOQ.LLJIJIL && this.LLJILJIL == c1163880gOQ.LLJILJIL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        List<Aweme> list = this.LLILLL;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ArrayList<String> arrayList = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C291001Au<EnumC442690HXn> c291001Au = this.LLILZLL;
        int iHashCode5 = (((((((iHashCode4 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31;
        C291001Au<Object> c291001Au2 = this.LLJI;
        return ((((iHashCode5 + (c291001Au2 != null ? c291001Au2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL);
    }

    public final String toString() {
        return "MixCreateState(enterFrom=" + this.LL + ", enterMethod=" + this.LLILLJJLI + ", mixVideos=" + this.LLILLL + ", addedFeedsID=" + this.LLILZ + ", mixName=" + this.LLILZIL + ", nextFragment=" + this.LLILZLL + ", createRequest=" + this.LLIZ + ", addVideoRequest=" + this.LLIZLLLIL + ", mixId=" + this.LLJ + ", positionChange=" + this.LLJI + ", isCreateFlag=" + this.LLJIJIL + ", isFromReplayList=" + this.LLJILJIL + ')';
    }

    public /* synthetic */ C1163880gOQ(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C491101vh c491101vh = C491101vh.LIZ;
        this("", "", arrayList, arrayList2, null, null, c491101vh, c491101vh, "", null, true, false);
    }

    public static C1163880gOQ LIZ(C1163880gOQ c1163880gOQ, List list, String str, C291001Au c291001Au, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, String str2, boolean z, boolean z2, int i) {
        String str3;
        String str4;
        ArrayList<String> arrayList;
        boolean z3 = z2;
        String str5 = str2;
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk;
        C291001Au c291001Au2 = c291001Au;
        String str6 = str;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk2;
        boolean z4 = z;
        List list2 = list;
        C291001Au<Object> c291001Au3 = null;
        if ((i & 1) != 0) {
            str3 = c1163880gOQ.LL;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = c1163880gOQ.LLILLJJLI;
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            list2 = c1163880gOQ.LLILLL;
        }
        if ((i & 8) != 0) {
            arrayList = c1163880gOQ.LLILZ;
        } else {
            arrayList = null;
        }
        if ((i & 16) != 0) {
            str6 = c1163880gOQ.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au2 = c1163880gOQ.LLILZLL;
        }
        if ((i & 64) != 0) {
            abstractC1623806Xk3 = c1163880gOQ.LLIZ;
        }
        if ((i & 128) != 0) {
            abstractC1623806Xk4 = c1163880gOQ.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            str5 = c1163880gOQ.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au3 = c1163880gOQ.LLJI;
        }
        if ((i & 1024) != 0) {
            z4 = c1163880gOQ.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z3 = c1163880gOQ.LLJILJIL;
        }
        c1163880gOQ.getClass();
        return new C1163880gOQ(str3, str4, list2, arrayList, str6, c291001Au2, abstractC1623806Xk3, abstractC1623806Xk4, str5, c291001Au3, z4, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1163880gOQ(String str, String str2, List<? extends Aweme> list, ArrayList<String> arrayList, String str3, C291001Au<? extends EnumC442690HXn> c291001Au, AbstractC1623806Xk<ManageResponse> abstractC1623806Xk, AbstractC1623806Xk<ManageResponse> abstractC1623806Xk2, String str4, C291001Au<Object> c291001Au2, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = list;
        this.LLILZ = arrayList;
        this.LLILZIL = str3;
        this.LLILZLL = c291001Au;
        this.LLIZ = abstractC1623806Xk;
        this.LLIZLLLIL = abstractC1623806Xk2;
        this.LLJ = str4;
        this.LLJI = c291001Au2;
        this.LLJIJIL = z;
        this.LLJILJIL = z2;
    }
}
