package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.emojisticker.api.model.InteractiveEmojiReactionResponse;
import com.ss.android.ugc.aweme.emojisticker.api.model.InteractiveEmojiReactionResult;
import com.ss.android.ugc.aweme.emojisticker.api.model.InteractiveEmojiResult;
import com.ss.android.ugc.aweme.emojisticker.common.viewerlist.ReactionApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.interactiveemoji.model.InteractiveEmojiStickerStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0zKT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891790zKT {
    public static final /* synthetic */ int LJII = 0;
    public final C1895007bY LIZ;
    public Aweme LIZIZ;
    public InteractiveEmojiStickerStruct LIZJ;
    public long LJ;
    public boolean LJFF;
    public final MutableLiveData<EnumC1891770zKR> LIZLLL = new MutableLiveData<>(EnumC1891770zKR.NULL);
    public final MutableLiveData<Long> LJI = new MutableLiveData<>(null);

    public C1891790zKT(C1895007bY c1895007bY) {
        this.LIZ = c1895007bY;
    }

    public final void LIZJ(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs;
        this.LIZIZ = aweme;
        if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 100) {
                    this.LIZJ = interactStickerStruct.getInteractiveEmojiStickerStruct();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00d0: CMP_L (r0 I:int) = (r18 I:long), (r11 I:long) (LINE:33554640), block:B:45:0x00cd */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00d4: IGET (r1 I:androidx.lifecycle.MutableLiveData<X.0zKR>) = (r3 I:X.0zKT) (LINE:33554644) X.0zKT.LIZLLL androidx.lifecycle.MutableLiveData, block:B:47:0x00d4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0zKT] */
    public final AbstractC316870CbV LIZ(List list, long j) {
        int i;
        ?? r3;
        String aid;
        Long lValueOf;
        EnumC1891770zKR enumC1891770zKR;
        List<InteractiveEmojiResult> list2;
        String emojiContent;
        try {
            Aweme aweme = this.LIZIZ;
            if (aweme != null && (aid = aweme.getAid()) != null) {
                InteractiveEmojiReactionResponse interactiveEmojiReactionResponse = ReactionApi.LIZIZ.fetchReactionListDetail(aid, 1, 20L, j, C7740030o.LIZ().getGson().LJIILL(list)).execute().LIZIZ;
                ArrayList arrayList = new ArrayList();
                InteractiveEmojiReactionResult interactiveEmojiReactionResult = interactiveEmojiReactionResponse.interactiveEmojiReactionResult;
                if (interactiveEmojiReactionResult != null && (list2 = interactiveEmojiReactionResult.interactiveEmojiResultList) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<InteractiveEmojiResult> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        User user = it2.next().user;
                        Aweme aweme2 = this.LIZIZ;
                        InteractiveEmojiStickerStruct interactiveEmojiStickerStruct = this.LIZJ;
                        if (interactiveEmojiStickerStruct != null) {
                            emojiContent = interactiveEmojiStickerStruct.getEmojiContent();
                        } else {
                            emojiContent = null;
                        }
                        arrayList2.add(new C737720Swk(user, aweme2, emojiContent, this.LIZ));
                    }
                    arrayList.addAll(arrayList2);
                }
                if (j == 0) {
                    MutableLiveData<EnumC1891770zKR> mutableLiveData = this.LIZLLL;
                    if (!arrayList.isEmpty()) {
                        enumC1891770zKR = EnumC1891770zKR.HAS_DATA;
                    } else {
                        enumC1891770zKR = EnumC1891770zKR.NO_DATA;
                    }
                    mutableLiveData.postValue(enumC1891770zKR);
                }
                InteractiveEmojiReactionResult interactiveEmojiReactionResult2 = interactiveEmojiReactionResponse.interactiveEmojiReactionResult;
                if (interactiveEmojiReactionResult2 != null && interactiveEmojiReactionResult2.hasMore) {
                    C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                    if (interactiveEmojiReactionResult2 != null) {
                        lValueOf = Long.valueOf(interactiveEmojiReactionResult2.nextCursor);
                    } else {
                        lValueOf = null;
                    }
                    return C317290CcB.LJ(c317290CcB, null, lValueOf, arrayList, 1);
                }
                AbstractC316870CbV.LIZ.getClass();
                return new C316640Cb8(arrayList);
            }
            if (j == 0) {
                this.LIZLLL.postValue(EnumC1891770zKR.NO_DATA);
            }
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            Exception exc = new Exception("Fetch interactive emoji viewer list error: aweme aid is null");
            c317290CcB2.getClass();
            return new C316650Cb9(exc);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (i == 0) {
                r3.LIZLLL.postValue(EnumC1891770zKR.NO_DATA);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316650Cb9(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: Exception -> 0x0133, LOOP:0: B:33:0x008c->B:35:0x0092, LOOP_END, TryCatch #1 {Exception -> 0x0133, blocks: (B:28:0x006e, B:30:0x0079, B:32:0x007d, B:33:0x008c, B:35:0x0092, B:36:0x00b4, B:39:0x00c0, B:41:0x00ca, B:42:0x00cc, B:44:0x00d5, B:45:0x00db, B:52:0x00e9, B:46:0x00de, B:48:0x00e2, B:56:0x00f1, B:58:0x00f5, B:59:0x00fb, B:62:0x0102, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:25:0x005b, B:66:0x0111, B:67:0x0121), top: B:77:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:28:0x006e, B:30:0x0079, B:32:0x007d, B:33:0x008c, B:35:0x0092, B:36:0x00b4, B:39:0x00c0, B:41:0x00ca, B:42:0x00cc, B:44:0x00d5, B:45:0x00db, B:52:0x00e9, B:46:0x00de, B:48:0x00e2, B:56:0x00f1, B:58:0x00f5, B:59:0x00fb, B:62:0x0102, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:25:0x005b, B:66:0x0111, B:67:0x0121), top: B:77:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:28:0x006e, B:30:0x0079, B:32:0x007d, B:33:0x008c, B:35:0x0092, B:36:0x00b4, B:39:0x00c0, B:41:0x00ca, B:42:0x00cc, B:44:0x00d5, B:45:0x00db, B:52:0x00e9, B:46:0x00de, B:48:0x00e2, B:56:0x00f1, B:58:0x00f5, B:59:0x00fb, B:62:0x0102, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:25:0x005b, B:66:0x0111, B:67:0x0121), top: B:77:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:28:0x006e, B:30:0x0079, B:32:0x007d, B:33:0x008c, B:35:0x0092, B:36:0x00b4, B:39:0x00c0, B:41:0x00ca, B:42:0x00cc, B:44:0x00d5, B:45:0x00db, B:52:0x00e9, B:46:0x00de, B:48:0x00e2, B:56:0x00f1, B:58:0x00f5, B:59:0x00fb, B:62:0x0102, B:18:0x0042, B:20:0x0046, B:22:0x004c, B:25:0x005b, B:66:0x0111, B:67:0x0121), top: B:77:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(long r25, long r27, java.util.List<com.ss.android.ugc.aweme.emojisticker.api.model.StickerInteractionDetailsInsertion> r29, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r30) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891790zKT.LIZIZ(long, long, java.util.List, X.05Vn):java.lang.Object");
    }
}
