package X;

import com.bytedance.android.livesdk.chatroom.api.PriceTier;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: renamed from: X.0JDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488550JDx implements InterfaceC0148002o {
    public final AbstractC489130JGd LL;
    public final GetSMBCourseDetailResponse.Data LLILLJJLI;
    public final C291001Au<List<InterfaceC489200JGk>> LLILLL;
    public final List<Long> LLILZ;
    public PriceTier LLILZIL;
    public List<Long> LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final C488470JDp LLJ;
    public final C0JDO LLJI;
    public final AbstractC489130JGd LLJIJIL;
    public final int LLJILJIL;

    public C488550JDx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C488550JDx)) {
            return false;
        }
        C488550JDx c488550JDx = (C488550JDx) obj;
        return Intrinsics.LJFF(this.LL, c488550JDx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c488550JDx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c488550JDx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c488550JDx.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c488550JDx.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c488550JDx.LLILZLL) && this.LLIZ == c488550JDx.LLIZ && this.LLIZLLLIL == c488550JDx.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c488550JDx.LLJ) && Intrinsics.LJFF(this.LLJI, c488550JDx.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c488550JDx.LLJIJIL) && this.LLJILJIL == c488550JDx.LLJILJIL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        GetSMBCourseDetailResponse.Data data = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (data == null ? 0 : data.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        PriceTier priceTier = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (priceTier == null ? 0 : priceTier.hashCode())) * 31;
        List<Long> list = this.LLILZLL;
        int iHashCode4 = (((((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        C488470JDp c488470JDp = this.LLJ;
        return ((((((iHashCode4 + (c488470JDp != null ? c488470JDp.hashCode() : 0)) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL;
    }

    public final String toString() {
        return "CourseManageVMState(courseLoadStatus=" + this.LL + ", courseDetail=" + this.LLILLJJLI + ", videoList=" + this.LLILLL + ", deletedVideoIds=" + this.LLILZ + ", selectedPriceTier=" + this.LLILZIL + ", videoOrder=" + this.LLILZLL + ", isEditedNameEmpty=" + this.LLIZ + ", isEdited=" + this.LLIZLLLIL + ", editedDetailV2=" + this.LLJ + ", pinNoticeText=" + this.LLJI + ", courseSubmitStatus=" + this.LLJIJIL + ", forceRefresh=" + this.LLJILJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C488550JDx(int i) {
        C488560JDy c488560JDy = C488560JDy.LIZ;
        this(c488560JDy, null, new C291001Au(new ArrayList()), new ArrayList(), null, null, true, false, null, new C0JDO(0), c488560JDy, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C488550JDx(AbstractC489130JGd abstractC489130JGd, GetSMBCourseDetailResponse.Data data, C291001Au<? extends List<InterfaceC489200JGk>> c291001Au, List<Long> list, PriceTier priceTier, List<Long> list2, boolean z, boolean z2, C488470JDp c488470JDp, C0JDO c0jdo, AbstractC489130JGd abstractC489130JGd2, int i) {
        this.LL = abstractC489130JGd;
        this.LLILLJJLI = data;
        this.LLILLL = c291001Au;
        this.LLILZ = list;
        this.LLILZIL = priceTier;
        this.LLILZLL = list2;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = c488470JDp;
        this.LLJI = c0jdo;
        this.LLJIJIL = abstractC489130JGd2;
        this.LLJILJIL = i;
    }

    public static C488550JDx LIZ(C488550JDx c488550JDx, AbstractC489130JGd abstractC489130JGd, GetSMBCourseDetailResponse.Data data, C291001Au c291001Au, List list, PriceTier priceTier, List list2, boolean z, boolean z2, C488470JDp c488470JDp, C0JDO c0jdo, AbstractC489130JGd abstractC489130JGd2, int i, int i2) {
        int i3 = i;
        AbstractC489130JGd abstractC489130JGd3 = abstractC489130JGd2;
        C0JDO c0jdo2 = c0jdo;
        C488470JDp c488470JDp2 = c488470JDp;
        boolean z3 = z2;
        boolean z4 = z;
        List list3 = list2;
        PriceTier priceTier2 = priceTier;
        List list4 = list;
        C291001Au c291001Au2 = c291001Au;
        GetSMBCourseDetailResponse.Data data2 = data;
        AbstractC489130JGd abstractC489130JGd4 = abstractC489130JGd;
        if ((i2 & 1) != 0) {
            abstractC489130JGd4 = c488550JDx.LL;
        }
        if ((i2 & 2) != 0) {
            data2 = c488550JDx.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            c291001Au2 = c488550JDx.LLILLL;
        }
        if ((i2 & 8) != 0) {
            list4 = c488550JDx.LLILZ;
        }
        if ((i2 & 16) != 0) {
            priceTier2 = c488550JDx.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            list3 = c488550JDx.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            z4 = c488550JDx.LLIZ;
        }
        if ((i2 & 128) != 0) {
            z3 = c488550JDx.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            c488470JDp2 = c488550JDx.LLJ;
        }
        if ((i2 & 512) != 0) {
            c0jdo2 = c488550JDx.LLJI;
        }
        if ((i2 & 1024) != 0) {
            abstractC489130JGd3 = c488550JDx.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i3 = c488550JDx.LLJILJIL;
        }
        c488550JDx.getClass();
        return new C488550JDx(abstractC489130JGd4, data2, c291001Au2, list4, priceTier2, list3, z4, z3, c488470JDp2, c0jdo2, abstractC489130JGd3, i3);
    }
}
