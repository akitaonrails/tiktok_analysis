package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBarEntrance;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntry;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinChannelAccessControl;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmbeddedPublishContent;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinToolkitModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OKY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OKY implements InterfaceC0148002o {
    public final AbstractC1623806Xk<BulletinBoardInfo> LL;
    public final AbstractC1623806Xk<EnumC617060OIe> LLILLJJLI;
    public final EnumC617010OHz LLILLL;
    public final BulletinShareModel LLILZ;
    public final List<BulletinPublishAction> LLILZIL;
    public final List<BulletinPublishAction> LLILZLL;
    public final long LLIZ;
    public final EnumC617480OJu LLIZLLLIL;
    public final BulletinChannelAccessControl LLJ;
    public final AbstractC1623806Xk<Boolean> LLJI;
    public final AbstractC1623806Xk<Boolean> LLJIJIL;
    public final AbstractC1623806Xk<Boolean> LLJILJIL;
    public final C291001Au<String> LLJILJILJ;
    public final C291001Au<Boolean> LLJILLL;
    public final List<InterfaceC1891350zJl> LLJJ;
    public final C291001Au<Boolean> LLJJI;
    public final AbstractC1623806Xk<String> LLJJIII;
    public final BulletinBarEntrance LLJJIJI;
    public final BulletinBarEntrance LLJJIJIIJIL;
    public final long LLJJIJIL;
    public final List<BulletinBizResourceEntry> LLJJJ;
    public final BulletinEmbeddedPublishContent LLJJJIL;
    public final List<BulletinToolkitModel> LLJJJJ;
    public final AbstractC1623806Xk<BulletinHybridResourceResponse> LLJJJJJIL;
    public final AbstractC1623806Xk<Boolean> LLJJJJLIIL;
    public final AbstractC1623806Xk<Boolean> LLJJL;
    public final C291001Au<Boolean> LLJJLIIIJLLLLLLLZ;
    public final C291001Au<C0OL6> LLJL;
    public final boolean LLJLIL;
    public final AbstractC1623806Xk<Unit> LLJLILLLLZIIL;
    public final C291001Au<Boolean> LLJLL;

    public C0OKY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OKY)) {
            return false;
        }
        C0OKY c0oky = (C0OKY) obj;
        return Intrinsics.LJFF(this.LL, c0oky.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0oky.LLILLJJLI) && this.LLILLL == c0oky.LLILLL && Intrinsics.LJFF(this.LLILZ, c0oky.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0oky.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0oky.LLILZLL) && this.LLIZ == c0oky.LLIZ && this.LLIZLLLIL == c0oky.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0oky.LLJ) && Intrinsics.LJFF(this.LLJI, c0oky.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0oky.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c0oky.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c0oky.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c0oky.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c0oky.LLJJ) && Intrinsics.LJFF(this.LLJJI, c0oky.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c0oky.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c0oky.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c0oky.LLJJIJIIJIL) && this.LLJJIJIL == c0oky.LLJJIJIL && Intrinsics.LJFF(this.LLJJJ, c0oky.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c0oky.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c0oky.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c0oky.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c0oky.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c0oky.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c0oky.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, c0oky.LLJL) && this.LLJLIL == c0oky.LLJLIL && Intrinsics.LJFF(this.LLJLILLLLZIIL, c0oky.LLJLILLLLZIIL) && Intrinsics.LJFF(this.LLJLL, c0oky.LLJLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        BulletinShareModel bulletinShareModel = this.LLILZ;
        int iHashCode2 = (iHashCode + (bulletinShareModel == null ? 0 : bulletinShareModel.hashCode())) * 31;
        List<BulletinPublishAction> list = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BulletinPublishAction> list2 = this.LLILZLL;
        int iHashCode4 = (((((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Y2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        BulletinChannelAccessControl bulletinChannelAccessControl = this.LLJ;
        int iHashCode5 = (((((((((((((((((iHashCode4 + (bulletinChannelAccessControl == null ? 0 : bulletinChannelAccessControl.hashCode())) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII.hashCode()) * 31;
        BulletinBarEntrance bulletinBarEntrance = this.LLJJIJI;
        int iHashCode6 = (iHashCode5 + (bulletinBarEntrance == null ? 0 : bulletinBarEntrance.hashCode())) * 31;
        BulletinBarEntrance bulletinBarEntrance2 = this.LLJJIJIIJIL;
        int iHashCode7 = (((iHashCode6 + (bulletinBarEntrance2 == null ? 0 : bulletinBarEntrance2.hashCode())) * 31) + C786410Ut5.Y2(this.LLJJIJIL)) * 31;
        List<BulletinBizResourceEntry> list3 = this.LLJJJ;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BulletinEmbeddedPublishContent bulletinEmbeddedPublishContent = this.LLJJJIL;
        int iHashCode9 = (iHashCode8 + (bulletinEmbeddedPublishContent == null ? 0 : bulletinEmbeddedPublishContent.hashCode())) * 31;
        List<BulletinToolkitModel> list4 = this.LLJJJJ;
        int iHashCode10 = (((((((iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31) + this.LLJJJJJIL.hashCode()) * 31) + this.LLJJJJLIIL.hashCode()) * 31) + this.LLJJL.hashCode()) * 31;
        C291001Au<Boolean> c291001Au = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode11 = (iHashCode10 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C0OL6> c291001Au2 = this.LLJL;
        return ((((((iHashCode11 + (c291001Au2 != null ? c291001Au2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJLIL)) * 31) + this.LLJLILLLLZIIL.hashCode()) * 31) + this.LLJLL.hashCode();
    }

    public final String toString() {
        return "BulletinProfileState(bulletinInfo=" + this.LL + ", viewerIdentity=" + this.LLILLJJLI + ", subscribeStatus=" + this.LLILLL + ", shareModel=" + this.LLILZ + ", quickPostSetting=" + this.LLILZIL + ", plusPostSetting=" + this.LLILZLL + ", subscribeCount=" + this.LLIZ + ", bulletinChannelType=" + this.LLIZLLLIL + ", channelAccessControl=" + this.LLJ + ", reopenRequest=" + this.LLJI + ", closeRequest=" + this.LLJIJIL + ", deleteRequest=" + this.LLJILJIL + ", requestErrorMessage=" + this.LLJILJILJ + ", quitBulletinEvent=" + this.LLJILLL + ", functionSettingList=" + this.LLJJ + ", refreshEvent=" + this.LLJJI + ", refreshStatus=" + this.LLJJIII + ", barEntranceFromAccount=" + this.LLJJIJI + ", barEntranceFromResource=" + this.LLJJIJIIJIL + ", bulletinQuota=" + this.LLJJIJIL + ", bulletinResourceEntry=" + this.LLJJJ + ", embeddedPublishContent=" + this.LLJJJIL + ", toolKitOrders=" + this.LLJJJJ + ", resourceInfos=" + this.LLJJJJJIL + ", updateCommentValueEvent=" + this.LLJJJJLIIL + ", updateDownloadValueEvent=" + this.LLJJL + ", showCommentToast=" + this.LLJJLIIIJLLLLLLLZ + ", downloadToastResource=" + this.LLJL + ", accountInfoUpdateReady=" + this.LLJLIL + ", downloadStatus=" + this.LLJLILLLLZIIL + ", commentStyleOverrideEvent=" + this.LLJLL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0OKY(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, EnumC617010OHz.INVALID, null, null, null, 0L, EnumC617480OJu.UNINITIALIZED, null, c491101vh, c491101vh, c491101vh, new C291001Au(null), new C291001Au(null), C13BV.INSTANCE, new C291001Au(null), c491101vh, null, null, 0L, null, null, null, c491101vh, c491101vh, c491101vh, null, null, false, c491101vh, new C291001Au(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0OKY(AbstractC1623806Xk<BulletinBoardInfo> abstractC1623806Xk, AbstractC1623806Xk<? extends EnumC617060OIe> abstractC1623806Xk2, EnumC617010OHz enumC617010OHz, BulletinShareModel bulletinShareModel, List<BulletinPublishAction> list, List<BulletinPublishAction> list2, long j, EnumC617480OJu enumC617480OJu, BulletinChannelAccessControl bulletinChannelAccessControl, AbstractC1623806Xk<Boolean> abstractC1623806Xk3, AbstractC1623806Xk<Boolean> abstractC1623806Xk4, AbstractC1623806Xk<Boolean> abstractC1623806Xk5, C291001Au<String> c291001Au, C291001Au<Boolean> c291001Au2, List<? extends InterfaceC1891350zJl> list3, C291001Au<Boolean> c291001Au3, AbstractC1623806Xk<String> abstractC1623806Xk6, BulletinBarEntrance bulletinBarEntrance, BulletinBarEntrance bulletinBarEntrance2, long j2, List<BulletinBizResourceEntry> list4, BulletinEmbeddedPublishContent bulletinEmbeddedPublishContent, List<BulletinToolkitModel> list5, AbstractC1623806Xk<BulletinHybridResourceResponse> abstractC1623806Xk7, AbstractC1623806Xk<Boolean> abstractC1623806Xk8, AbstractC1623806Xk<Boolean> abstractC1623806Xk9, C291001Au<Boolean> c291001Au4, C291001Au<C0OL6> c291001Au5, boolean z, AbstractC1623806Xk<Unit> abstractC1623806Xk10, C291001Au<Boolean> c291001Au6) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = enumC617010OHz;
        this.LLILZ = bulletinShareModel;
        this.LLILZIL = list;
        this.LLILZLL = list2;
        this.LLIZ = j;
        this.LLIZLLLIL = enumC617480OJu;
        this.LLJ = bulletinChannelAccessControl;
        this.LLJI = abstractC1623806Xk3;
        this.LLJIJIL = abstractC1623806Xk4;
        this.LLJILJIL = abstractC1623806Xk5;
        this.LLJILJILJ = c291001Au;
        this.LLJILLL = c291001Au2;
        this.LLJJ = list3;
        this.LLJJI = c291001Au3;
        this.LLJJIII = abstractC1623806Xk6;
        this.LLJJIJI = bulletinBarEntrance;
        this.LLJJIJIIJIL = bulletinBarEntrance2;
        this.LLJJIJIL = j2;
        this.LLJJJ = list4;
        this.LLJJJIL = bulletinEmbeddedPublishContent;
        this.LLJJJJ = list5;
        this.LLJJJJJIL = abstractC1623806Xk7;
        this.LLJJJJLIIL = abstractC1623806Xk8;
        this.LLJJL = abstractC1623806Xk9;
        this.LLJJLIIIJLLLLLLLZ = c291001Au4;
        this.LLJL = c291001Au5;
        this.LLJLIL = z;
        this.LLJLILLLLZIIL = abstractC1623806Xk10;
        this.LLJLL = c291001Au6;
    }

    public static C0OKY LIZ(C0OKY c0oky, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, EnumC617010OHz enumC617010OHz, BulletinShareModel bulletinShareModel, List list, List list2, long j, EnumC617480OJu enumC617480OJu, BulletinChannelAccessControl bulletinChannelAccessControl, AbstractC1623806Xk abstractC1623806Xk3, AbstractC1623806Xk abstractC1623806Xk4, AbstractC1623806Xk abstractC1623806Xk5, C291001Au c291001Au, List list3, C291001Au c291001Au2, AbstractC1623806Xk abstractC1623806Xk6, BulletinBarEntrance bulletinBarEntrance, BulletinBarEntrance bulletinBarEntrance2, long j2, List list4, BulletinEmbeddedPublishContent bulletinEmbeddedPublishContent, List list5, AbstractC1623806Xk abstractC1623806Xk7, C1623606Xi c1623606Xi, C1623606Xi c1623606Xi2, C291001Au c291001Au3, C291001Au c291001Au4, boolean z, AbstractC1623806Xk abstractC1623806Xk8, C291001Au c291001Au5, int i) {
        C291001Au<String> c291001Au6;
        C291001Au c291001Au7 = c291001Au5;
        boolean z2 = z;
        C291001Au c291001Au8 = c291001Au4;
        AbstractC1623806Xk<Boolean> abstractC1623806Xk9 = c1623606Xi2;
        AbstractC1623806Xk<Boolean> abstractC1623806Xk10 = c1623606Xi;
        List list6 = list2;
        List list7 = list5;
        C291001Au c291001Au9 = c291001Au3;
        List list8 = list4;
        long j3 = j2;
        BulletinBarEntrance bulletinBarEntrance3 = bulletinBarEntrance2;
        List list9 = list3;
        C291001Au c291001Au10 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk11 = abstractC1623806Xk5;
        AbstractC1623806Xk abstractC1623806Xk12 = abstractC1623806Xk3;
        AbstractC1623806Xk abstractC1623806Xk13 = abstractC1623806Xk7;
        BulletinChannelAccessControl bulletinChannelAccessControl2 = bulletinChannelAccessControl;
        AbstractC1623806Xk abstractC1623806Xk14 = abstractC1623806Xk8;
        BulletinBarEntrance bulletinBarEntrance4 = bulletinBarEntrance;
        EnumC617480OJu enumC617480OJu2 = enumC617480OJu;
        long j4 = j;
        AbstractC1623806Xk abstractC1623806Xk15 = abstractC1623806Xk6;
        List list10 = list;
        AbstractC1623806Xk abstractC1623806Xk16 = abstractC1623806Xk2;
        BulletinEmbeddedPublishContent bulletinEmbeddedPublishContent2 = bulletinEmbeddedPublishContent;
        BulletinShareModel bulletinShareModel2 = bulletinShareModel;
        EnumC617010OHz enumC617010OHz2 = enumC617010OHz;
        AbstractC1623806Xk abstractC1623806Xk17 = abstractC1623806Xk4;
        C291001Au c291001Au11 = c291001Au2;
        AbstractC1623806Xk abstractC1623806Xk18 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk18 = c0oky.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk16 = c0oky.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC617010OHz2 = c0oky.LLILLL;
        }
        if ((i & 8) != 0) {
            bulletinShareModel2 = c0oky.LLILZ;
        }
        if ((i & 16) != 0) {
            list10 = c0oky.LLILZIL;
        }
        if ((i & 32) != 0) {
            list6 = c0oky.LLILZLL;
        }
        if ((i & 64) != 0) {
            j4 = c0oky.LLIZ;
        }
        if ((i & 128) != 0) {
            enumC617480OJu2 = c0oky.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            bulletinChannelAccessControl2 = c0oky.LLJ;
        }
        if ((i & 512) != 0) {
            abstractC1623806Xk12 = c0oky.LLJI;
        }
        if ((i & 1024) != 0) {
            abstractC1623806Xk17 = c0oky.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            abstractC1623806Xk11 = c0oky.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c291001Au6 = c0oky.LLJILJILJ;
        } else {
            c291001Au6 = null;
        }
        if ((i & 8192) != 0) {
            c291001Au10 = c0oky.LLJILLL;
        }
        if ((i & 16384) != 0) {
            list9 = c0oky.LLJJ;
        }
        if ((32768 & i) != 0) {
            c291001Au11 = c0oky.LLJJI;
        }
        if ((65536 & i) != 0) {
            abstractC1623806Xk15 = c0oky.LLJJIII;
        }
        if ((131072 & i) != 0) {
            bulletinBarEntrance4 = c0oky.LLJJIJI;
        }
        if ((262144 & i) != 0) {
            bulletinBarEntrance3 = c0oky.LLJJIJIIJIL;
        }
        if ((524288 & i) != 0) {
            j3 = c0oky.LLJJIJIL;
        }
        if ((1048576 & i) != 0) {
            list8 = c0oky.LLJJJ;
        }
        if ((2097152 & i) != 0) {
            bulletinEmbeddedPublishContent2 = c0oky.LLJJJIL;
        }
        if ((4194304 & i) != 0) {
            list7 = c0oky.LLJJJJ;
        }
        if ((8388608 & i) != 0) {
            abstractC1623806Xk13 = c0oky.LLJJJJJIL;
        }
        if ((16777216 & i) != 0) {
            abstractC1623806Xk10 = c0oky.LLJJJJLIIL;
        }
        if ((33554432 & i) != 0) {
            abstractC1623806Xk9 = c0oky.LLJJL;
        }
        if ((67108864 & i) != 0) {
            c291001Au9 = c0oky.LLJJLIIIJLLLLLLLZ;
        }
        if ((134217728 & i) != 0) {
            c291001Au8 = c0oky.LLJL;
        }
        if ((268435456 & i) != 0) {
            z2 = c0oky.LLJLIL;
        }
        if ((536870912 & i) != 0) {
            abstractC1623806Xk14 = c0oky.LLJLILLLLZIIL;
        }
        if ((i & 1073741824) != 0) {
            c291001Au7 = c0oky.LLJLL;
        }
        c0oky.getClass();
        C291001Au c291001Au12 = c291001Au7;
        return new C0OKY(abstractC1623806Xk18, abstractC1623806Xk16, enumC617010OHz2, bulletinShareModel2, list10, list6, j4, enumC617480OJu2, bulletinChannelAccessControl2, abstractC1623806Xk12, abstractC1623806Xk17, abstractC1623806Xk11, c291001Au6, c291001Au10, list9, c291001Au11, abstractC1623806Xk15, bulletinBarEntrance4, bulletinBarEntrance3, j3, list8, bulletinEmbeddedPublishContent2, list7, abstractC1623806Xk13, abstractC1623806Xk10, abstractC1623806Xk9, c291001Au9, c291001Au8, z2, abstractC1623806Xk14, c291001Au12);
    }
}
