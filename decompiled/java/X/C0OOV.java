package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinEmojiItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardKV;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardUIInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OOV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OOV extends BulletinBaseItem implements C14NM {
    public int LLILZLL;
    public final boolean LLIZ;
    public final long LLIZLLLIL;
    public final Long LLJ;
    public final Long LLJI;
    public final int LLJIJIL;
    public final Map<String, String> LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final int LLJJI;
    public final int LLJJIII;
    public final User LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public List<BulletinEmojiItem> LLJJIJIL;
    public int LLJJJ;
    public List<InterfaceC1891350zJl> LLJJJIL;
    public final int LLJJJJ;
    public final BulletinItemBottomStruct LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final BulletinCardInfo LLJJL;
    public final BaseShortVideoContext LLJJLIIIJLLLLLLLZ;
    public final String LLJL;
    public String LLJLIL;
    public BulletinCommentUIOverview LLJLILLLLZIIL;
    public transient C679540Ql6 LLJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OOV)) {
            return false;
        }
        C0OOV c0oov = (C0OOV) obj;
        return this.LLILZLL == c0oov.LLILZLL && this.LLIZ == c0oov.LLIZ && this.LLIZLLLIL == c0oov.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0oov.LLJ) && Intrinsics.LJFF(this.LLJI, c0oov.LLJI) && this.LLJIJIL == c0oov.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c0oov.LLJILJIL) && this.LLJILJILJ == c0oov.LLJILJILJ && this.LLJILLL == c0oov.LLJILLL && this.LLJJ == c0oov.LLJJ && this.LLJJI == c0oov.LLJJI && this.LLJJIII == c0oov.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c0oov.LLJJIJI) && this.LLJJIJIIJIL == c0oov.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c0oov.LLJJIJIL) && this.LLJJJ == c0oov.LLJJJ && Intrinsics.LJFF(this.LLJJJIL, c0oov.LLJJJIL) && this.LLJJJJ == c0oov.LLJJJJ && Intrinsics.LJFF(this.LLJJJJJIL, c0oov.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c0oov.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c0oov.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c0oov.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, c0oov.LLJL) && Intrinsics.LJFF(this.LLJLIL, c0oov.LLJLIL) && Intrinsics.LJFF(this.LLJLILLLLZIIL, c0oov.LLJLILLLLZIIL) && Intrinsics.LJFF(this.LLJLL, c0oov.LLJLL);
    }

    public final int hashCode() {
        int iZ2 = ((((this.LLILZLL * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Y2(this.LLIZLLLIL)) * 31;
        Long l = this.LLJ;
        int iHashCode = (iZ2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LLJI;
        int iHashCode2 = (((((((((((((((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + this.LLJJI) * 31) + this.LLJJIII) * 31;
        User user = this.LLJJIJI;
        int iHashCode3 = (((((((((((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31) + this.LLJJIJIL.hashCode()) * 31) + this.LLJJJ) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ) * 31;
        BulletinItemBottomStruct bulletinItemBottomStruct = this.LLJJJJJIL;
        int iHashCode4 = (iHashCode3 + (bulletinItemBottomStruct == null ? 0 : bulletinItemBottomStruct.hashCode())) * 31;
        String str = this.LLJJJJLIIL;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        BulletinCardInfo bulletinCardInfo = this.LLJJL;
        int iHashCode6 = (iHashCode5 + (bulletinCardInfo == null ? 0 : bulletinCardInfo.hashCode())) * 31;
        BaseShortVideoContext baseShortVideoContext = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode7 = (iHashCode6 + (baseShortVideoContext == null ? 0 : baseShortVideoContext.hashCode())) * 31;
        String str2 = this.LLJL;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJLIL;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BulletinCommentUIOverview bulletinCommentUIOverview = this.LLJLILLLLZIIL;
        int iHashCode10 = (iHashCode9 + (bulletinCommentUIOverview == null ? 0 : bulletinCommentUIOverview.hashCode())) * 31;
        C679540Ql6 c679540Ql6 = this.LLJLL;
        return iHashCode10 + (c679540Ql6 != null ? c679540Ql6.hashCode() : 0);
    }

    public final String toString() {
        return "BulletinHybridMessageCardItem(viewCount=" + this.LLILZLL + ", hasSend=" + this.LLIZ + ", creatorTime=" + this.LLIZLLLIL + ", updateTime=" + this.LLJ + ", id=" + this.LLJI + ", status=" + this.LLJIJIL + ", eventMap=" + this.LLJILJIL + ", isFirstInSequence=" + this.LLJILJILJ + ", isLastInSequence=" + this.LLJILLL + ", needShowViewCount=" + this.LLJJ + ", groupMaxViewCount=" + this.LLJJI + ", paddingBottom=" + this.LLJJIII + ", publishUser=" + this.LLJJIJI + ", hasRead=" + this.LLJJIJIIJIL + ", emojiList=" + this.LLJJIJIL + ", emojiOrderNum=" + this.LLJJJ + ", emojiSnapshot=" + this.LLJJJIL + ", contentType=" + this.LLJJJJ + ", bottomStruct=" + this.LLJJJJJIL + ", publishExtra=" + this.LLJJJJLIIL + ", hybridCard=" + this.LLJJL + ", editModel=" + this.LLJJLIIIJLLLLLLLZ + ", publishFrom=" + this.LLJL + ", inspirationCardUniqueKey=" + this.LLJLIL + ", commentUIOverView=" + this.LLJLILLLLZIIL + ", cachedSMMConfig=" + this.LLJLL + ')';
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJI() {
        BulletinCardInfo bulletinCardInfo = this.LLJJL;
        if (bulletinCardInfo != null) {
            return Long.valueOf(bulletinCardInfo.cardType);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJIIIIZZ() {
        List<BulletinCardKV> list;
        Object obj;
        String str;
        BulletinCardInfo bulletinCardInfo = this.LLJJL;
        if (bulletinCardInfo != null && (list = bulletinCardInfo.eventParams) != null) {
            Iterator<BulletinCardKV> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BulletinCardKV next = it2.next();
                BulletinCardKV bulletinCardKV = next;
                if (Intrinsics.LJFF(bulletinCardKV != null ? bulletinCardKV.key : null, "content_type")) {
                    obj = next;
                    break;
                }
            }
            BulletinCardKV bulletinCardKV2 = (BulletinCardKV) obj;
            if (bulletinCardKV2 != null && (str = bulletinCardKV2.value) != null) {
                return str;
            }
        }
        return "";
    }

    public final C679540Ql6 LLIIJI() {
        Integer num;
        Integer num2;
        C679540Ql6 c679540Ql6 = this.LLJLL;
        if (c679540Ql6 != null) {
            return c679540Ql6;
        }
        BulletinCardInfo bulletinCardInfo = this.LLJJL;
        Integer numValueOf = null;
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct = bulletinCardInfo != null ? bulletinCardInfo.hybridConfigInfo : null;
        C1227904rF c1227904rF = C1227904rF.LIZ;
        BulletinCardUIInfo bulletinCardUIInfo = bulletinCardInfo != null ? bulletinCardInfo.hybridCardUIInfo : null;
        c1227904rF.getClass();
        String strLJI = C1227904rF.LJI(bulletinCardUIInfo);
        if (strLJI == null) {
            strLJI = "";
        }
        String strValueOf = String.valueOf(this.LLJI);
        String strValueOf2 = String.valueOf(this.LLJJJJ);
        String str = bulletinHybridCardConfigStruct != null ? bulletinHybridCardConfigStruct.schema : null;
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(strLJI);
        int iLIZIZ = -2;
        Integer numValueOf2 = Integer.valueOf((bulletinHybridCardConfigStruct == null || ((num2 = bulletinHybridCardConfigStruct.dynamicWidth) == null && (num2 = bulletinHybridCardConfigStruct.defaultWidth) == null)) ? -2 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num2)));
        if (bulletinHybridCardConfigStruct != null && ((num = bulletinHybridCardConfigStruct.dynamicHeight) != null || (num = bulletinHybridCardConfigStruct.defaultHeight) != null)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num));
        }
        C1162570gMJ c1162570gMJ = new C1162570gMJ(numValueOf2, Integer.valueOf(iLIZIZ));
        if (bulletinHybridCardConfigStruct != null) {
            Integer num3 = bulletinHybridCardConfigStruct.dynamicHeight;
            if (num3 != null) {
                numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num3)));
            } else {
                Integer num4 = bulletinHybridCardConfigStruct.defaultHeight;
                if (num4 != null) {
                    numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num4)));
                }
            }
        }
        C679540Ql6 c679540Ql62 = new C679540Ql6(strValueOf, templateDataLJIIIIZZ, Boolean.TRUE, null, numValueOf, c1162570gMJ, null, strValueOf2, str, null, 31060);
        this.LLJLL = c679540Ql62;
        return c679540Ql62;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinItemBottomStruct LIZIZ() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinCommentUIOverview LJIILIIL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<BulletinEmojiItem> LJIJJLI() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJIL() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<InterfaceC1891350zJl> LJJ() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Map<String, String> LJJIFFI() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJIJL() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIJLIJ() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIL() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJJ() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJIL() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJJJ() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJJLI() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final User LJJJJZI() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLIIL() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJLIIIIJ() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJLIIIJ() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJZZIII() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLIIIL() {
        return this.LLJILLL;
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJLJ(BulletinBaseItem bulletinBaseItem) {
        if (bulletinBaseItem instanceof C0OOV) {
            return !Intrinsics.LJFF(this.LLJJL, ((C0OOV) bulletinBaseItem).LLJJL);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZ(BulletinCommentUIOverview bulletinCommentUIOverview) {
        this.LLJLILLLLZIIL = bulletinCommentUIOverview;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZL(List<BulletinEmojiItem> list) {
        this.LLJJIJIL = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LL(int i) {
        this.LLJJJ = i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLFFF(List<InterfaceC1891350zJl> list) {
        this.LLJJJIL = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLFII(String str) {
        this.LLJLIL = str;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLIIIJ(int i) {
        this.LLILZLL = i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0OOV)) {
            return false;
        }
        C0OOV c0oov = (C0OOV) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLJI, c0oov.LLJI)) {
            Long l = this.LLJI;
            Long l2 = c0oov.LLJI;
            if (l == null) {
                return false;
            }
            l.longValue();
            if (l2 == null) {
                return false;
            }
            l2.longValue();
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_hybrid_item_diff_setting", true, true) || l.longValue() >= 0 || l2.longValue() <= 0) {
                return false;
            }
        }
        if (LIZLLL() != c0oov.LIZLLL() || this.itemType != c0oov.itemType || this.LLJJJJ != c0oov.LLJJJJ) {
            return false;
        }
        return true;
    }

    public static C0OOV LLIIIL(C0OOV c0oov, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, List list, int i3, BulletinCardInfo bulletinCardInfo, String str, BulletinCommentUIOverview bulletinCommentUIOverview, int i4) {
        int i5;
        long j;
        Long l;
        Long l2;
        int i6;
        Map<String, String> map;
        User user;
        boolean z5;
        List<InterfaceC1891350zJl> list2;
        BulletinItemBottomStruct bulletinItemBottomStruct;
        String str2;
        BaseShortVideoContext baseShortVideoContext;
        String str3;
        BulletinCommentUIOverview bulletinCommentUIOverview2 = bulletinCommentUIOverview;
        String str4 = str;
        BulletinCardInfo bulletinCardInfo2 = bulletinCardInfo;
        List list3 = list;
        int i7 = i2;
        int i8 = i3;
        int i9 = i;
        boolean z6 = z;
        boolean z7 = z3;
        boolean z8 = z2;
        boolean z9 = z4;
        int i10 = 0;
        if ((i4 & 1) != 0) {
            i5 = c0oov.LLILZLL;
        } else {
            i5 = 0;
        }
        if ((i4 & 2) != 0) {
            z6 = c0oov.LLIZ;
        }
        if ((i4 & 4) != 0) {
            j = c0oov.LLIZLLLIL;
        } else {
            j = 0;
        }
        C679540Ql6 c679540Ql6 = null;
        if ((i4 & 8) != 0) {
            l = c0oov.LLJ;
        } else {
            l = null;
        }
        if ((i4 & 16) != 0) {
            l2 = c0oov.LLJI;
        } else {
            l2 = null;
        }
        if ((i4 & 32) != 0) {
            i6 = c0oov.LLJIJIL;
        } else {
            i6 = 0;
        }
        if ((i4 & 64) != 0) {
            map = c0oov.LLJILJIL;
        } else {
            map = null;
        }
        if ((i4 & 128) != 0) {
            z8 = c0oov.LLJILJILJ;
        }
        if ((i4 & 256) != 0) {
            z7 = c0oov.LLJILLL;
        }
        if ((i4 & 512) != 0) {
            z9 = c0oov.LLJJ;
        }
        if ((i4 & 1024) != 0) {
            i9 = c0oov.LLJJI;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i7 = c0oov.LLJJIII;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            user = c0oov.LLJJIJI;
        } else {
            user = null;
        }
        if ((i4 & 8192) != 0) {
            z5 = c0oov.LLJJIJIIJIL;
        } else {
            z5 = false;
        }
        if ((i4 & 16384) != 0) {
            list3 = c0oov.LLJJIJIL;
        }
        if ((32768 & i4) != 0) {
            i10 = c0oov.LLJJJ;
        }
        if ((65536 & i4) != 0) {
            list2 = c0oov.LLJJJIL;
        } else {
            list2 = null;
        }
        if ((131072 & i4) != 0) {
            i8 = c0oov.LLJJJJ;
        }
        if ((262144 & i4) != 0) {
            bulletinItemBottomStruct = c0oov.LLJJJJJIL;
        } else {
            bulletinItemBottomStruct = null;
        }
        if ((524288 & i4) != 0) {
            str2 = c0oov.LLJJJJLIIL;
        } else {
            str2 = null;
        }
        if ((1048576 & i4) != 0) {
            bulletinCardInfo2 = c0oov.LLJJL;
        }
        if ((2097152 & i4) != 0) {
            baseShortVideoContext = c0oov.LLJJLIIIJLLLLLLLZ;
        } else {
            baseShortVideoContext = null;
        }
        if ((4194304 & i4) != 0) {
            str4 = c0oov.LLJL;
        }
        if ((8388608 & i4) != 0) {
            str3 = c0oov.LLJLIL;
        } else {
            str3 = null;
        }
        if ((16777216 & i4) != 0) {
            bulletinCommentUIOverview2 = c0oov.LLJLILLLLZIIL;
        }
        if ((i4 & 33554432) != 0) {
            c679540Ql6 = c0oov.LLJLL;
        }
        c0oov.getClass();
        return new C0OOV(i5, z6, j, l, l2, i6, map, z8, z7, z9, i9, i7, user, z5, list3, i10, list2, i8, bulletinItemBottomStruct, str2, bulletinCardInfo2, baseShortVideoContext, str4, str3, bulletinCommentUIOverview2, c679540Ql6);
    }

    public /* synthetic */ C0OOV(int i, long j, Long l, Long l2, int i2, Map map, User user, boolean z, List list, int i3, List list2, int i4, BulletinItemBottomStruct bulletinItemBottomStruct, String str, BulletinCardInfo bulletinCardInfo, BaseShortVideoContext baseShortVideoContext, String str2, String str3, BulletinCommentUIOverview bulletinCommentUIOverview, int i5) {
        this(i, true, j, l, (i5 & 16) != 0 ? null : l2, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? C2097608Jq.LJ() : map, false, false, false, 0, 0, user, (i5 & 8192) != 0 ? false : z, (i5 & 16384) != 0 ? new ArrayList() : list, (32768 & i5) != 0 ? 0 : i3, (65536 & i5) != 0 ? new ArrayList() : list2, i4, (262144 & i5) != 0 ? null : bulletinItemBottomStruct, (524288 & i5) != 0 ? null : str, bulletinCardInfo, (2097152 & i5) != 0 ? null : baseShortVideoContext, (4194304 & i5) != 0 ? null : str2, (8388608 & i5) != 0 ? null : str3, (i5 & 16777216) == 0 ? bulletinCommentUIOverview : null, null);
    }

    public C0OOV(int i, boolean z, long j, Long l, Long l2, int i2, Map<String, String> map, boolean z2, boolean z3, boolean z4, int i3, int i4, User user, boolean z5, List<BulletinEmojiItem> list, int i5, List<InterfaceC1891350zJl> list2, int i6, BulletinItemBottomStruct bulletinItemBottomStruct, String str, BulletinCardInfo bulletinCardInfo, BaseShortVideoContext baseShortVideoContext, String str2, String str3, BulletinCommentUIOverview bulletinCommentUIOverview, C679540Ql6 c679540Ql6) {
        super(EnumC618810OOx.LYNX_CARD, C0OK6.CONTENT, i, z, j, l, l2, null, null, i2, map, z2, z3, false, 0, i4, user, z5, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, str2, 0, null, str3, null);
        this.LLILZLL = i;
        this.LLIZ = z;
        this.LLIZLLLIL = j;
        this.LLJ = l;
        this.LLJI = l2;
        this.LLJIJIL = i2;
        this.LLJILJIL = map;
        this.LLJILJILJ = z2;
        this.LLJILLL = z3;
        this.LLJJ = z4;
        this.LLJJI = i3;
        this.LLJJIII = i4;
        this.LLJJIJI = user;
        this.LLJJIJIIJIL = z5;
        this.LLJJIJIL = list;
        this.LLJJJ = i5;
        this.LLJJJIL = list2;
        this.LLJJJJ = i6;
        this.LLJJJJJIL = bulletinItemBottomStruct;
        this.LLJJJJLIIL = str;
        this.LLJJL = bulletinCardInfo;
        this.LLJJLIIIJLLLLLLLZ = baseShortVideoContext;
        this.LLJL = str2;
        this.LLJLIL = str3;
        this.LLJLILLLLZIIL = bulletinCommentUIOverview;
        this.LLJLL = c679540Ql6;
    }
}
