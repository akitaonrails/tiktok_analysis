package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct;
import com.ss.android.ugc.aweme.emojisticker.api.model.EmojiSliderReactionResponse;
import com.ss.android.ugc.aweme.emojisticker.api.model.EmojiSliderReactionResult;
import com.ss.android.ugc.aweme.emojisticker.api.model.EmojiSliderResultEntry;
import com.ss.android.ugc.aweme.emojisticker.common.viewerlist.ReactionApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0zKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891900zKe {
    public static final /* synthetic */ int LJI = 0;
    public final C1895007bY LIZ;
    public Aweme LIZIZ;
    public EmojiSliderStickerStruct LIZJ;
    public final MutableLiveData<Boolean> LIZLLL = new MutableLiveData<>(Boolean.FALSE);
    public long LJ;
    public boolean LJFF;

    public C1891900zKe(C1895007bY c1895007bY) {
        this.LIZ = c1895007bY;
    }

    public final void LIZIZ(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs;
        this.LIZIZ = aweme;
        if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 101) {
                    this.LIZJ = interactStickerStruct.getEmojiSliderStickerStruct();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x00d4: CMP_L (r0 I:int) = (r17 I:long), (r10 I:long) (LINE:33554644), block:B:41:0x00d1 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00d8: IGET (r1 I:androidx.lifecycle.MutableLiveData<java.lang.Boolean>) = (r3 I:X.0zKe) (LINE:33554648) X.0zKe.LIZLLL androidx.lifecycle.MutableLiveData, block:B:43:0x00d8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0zKe] */
    public final AbstractC316870CbV LIZ(List list, long j) {
        int i;
        ?? r3;
        String aid;
        Long lValueOf;
        boolean z;
        List<EmojiSliderResultEntry> list2;
        try {
            Aweme aweme = this.LIZIZ;
            if (aweme != null && (aid = aweme.getAid()) != null) {
                EmojiSliderReactionResponse emojiSliderReactionResponse = ReactionApi.LIZIZ.fetchEmojiSliderReactionListDetail(aid, 2, 20L, j, C7740030o.LIZ().getGson().LJIILL(list)).execute().LIZIZ;
                ArrayList arrayList = new ArrayList();
                EmojiSliderReactionResult emojiSliderReactionResult = emojiSliderReactionResponse.emojiSliderReactionResult;
                if (emojiSliderReactionResult != null && (list2 = emojiSliderReactionResult.emojiSliderResultList) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (EmojiSliderResultEntry emojiSliderResultEntry : list2) {
                        arrayList2.add(new C737730Swl(emojiSliderResultEntry.user, this.LIZIZ, emojiSliderResultEntry.voteVal, this.LIZ, "sticker click"));
                    }
                    arrayList.addAll(arrayList2);
                }
                if (j == 0) {
                    MutableLiveData<Boolean> mutableLiveData = this.LIZLLL;
                    if (!arrayList.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mutableLiveData.postValue(Boolean.valueOf(z));
                }
                EmojiSliderReactionResult emojiSliderReactionResult2 = emojiSliderReactionResponse.emojiSliderReactionResult;
                if (emojiSliderReactionResult2 != null && emojiSliderReactionResult2.hasMore) {
                    C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                    if (emojiSliderReactionResult2 != null) {
                        lValueOf = Long.valueOf(emojiSliderReactionResult2.nextCursor);
                    } else {
                        lValueOf = null;
                    }
                    return C317290CcB.LJ(c317290CcB, null, lValueOf, arrayList, 1);
                }
                AbstractC316870CbV.LIZ.getClass();
                return new C316640Cb8(arrayList);
            }
            if (j == 0) {
                this.LIZLLL.postValue(Boolean.FALSE);
            }
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            Exception exc = new Exception("Fetch emoji slider viewer list error: aweme aid is null");
            c317290CcB2.getClass();
            return new C316650Cb9(exc);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (i == 0) {
                r3.LIZLLL.postValue(Boolean.FALSE);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316650Cb9(e);
        }
    }
}
