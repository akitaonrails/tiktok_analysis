package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.emojisticker.api.model.EmojiSliderReactionResponse;
import com.ss.android.ugc.aweme.emojisticker.api.model.EmojiSliderReactionResult;
import com.ss.android.ugc.aweme.emojisticker.api.model.EmojiSliderResultEntry;
import com.ss.android.ugc.aweme.emojisticker.common.viewerlist.ReactionApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emojisticker.emojislider.service.EmojiSliderViewerListManager$loadMore$1", f = "EmojiSliderViewerListManager.kt", l = {85}, m = "invokeSuspend")
public final class C1891890zKd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1891870zKb LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891890zKd(C1891870zKb c1891870zKb, long j, InterfaceC1364105Vn<? super C1891890zKd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1891870zKb;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891890zKd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        boolean z;
        List list;
        String aid2;
        long j;
        boolean z2;
        List<EmojiSliderResultEntry> list2;
        List<InteractStickerStruct> interactStickerStructs;
        C1C7U.LIZ("EmojiSliderViewerListManager@d74f.loadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Aweme aweme = this.LLILLJJLI.LJFF().LIZIZ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme aweme2 = this.LLILLJJLI.LJFF().LIZIZ;
            if (aweme2 != null && (interactStickerStructs = aweme2.getInteractStickerStructs()) != null) {
                Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                z = false;
                while (it2.hasNext()) {
                    if (it2.next().getType() == 101) {
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                C1891900zKe c1891900zKeLJFF = this.LLILLJJLI.LJFF();
                long j2 = this.LLILLL;
                c1891900zKeLJFF.getClass();
                try {
                    Aweme aweme3 = c1891900zKeLJFF.LIZIZ;
                    if (aweme3 != null && (aid2 = aweme3.getAid()) != null) {
                        EmojiSliderReactionResponse emojiSliderReactionResponse = ReactionApi.LIZIZ.fetchEmojiSliderReactionListDetail(aid2, 2, j2, c1891900zKeLJFF.LJ, "").execute().LIZIZ;
                        ArrayList arrayList = new ArrayList();
                        EmojiSliderReactionResult emojiSliderReactionResult = emojiSliderReactionResponse.emojiSliderReactionResult;
                        if (emojiSliderReactionResult != null && (list2 = emojiSliderReactionResult.emojiSliderResultList) != null) {
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            for (EmojiSliderResultEntry emojiSliderResultEntry : list2) {
                                arrayList2.add(new C737730Swl(emojiSliderResultEntry.user, c1891900zKeLJFF.LIZIZ, emojiSliderResultEntry.voteVal, c1891900zKeLJFF.LIZ, "story viewer list"));
                            }
                            arrayList.addAll(arrayList2);
                        }
                        EmojiSliderReactionResult emojiSliderReactionResult2 = emojiSliderReactionResponse.emojiSliderReactionResult;
                        if (emojiSliderReactionResult2 != null) {
                            j = emojiSliderReactionResult2.nextCursor;
                        } else {
                            j = 0;
                        }
                        c1891900zKeLJFF.LJ = j;
                        if (emojiSliderReactionResult2 == null) {
                            z2 = false;
                        } else {
                            z2 = emojiSliderReactionResult2.hasMore;
                        }
                        c1891900zKeLJFF.LJFF = z2;
                        list = arrayList;
                    } else {
                        list = C13BV.INSTANCE;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    list = C13BV.INSTANCE;
                }
            } else {
                list = C13BV.INSTANCE;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1891880zKc c1891880zKc = new C1891880zKc(aid, this.LLILLJJLI, list, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1891880zKc) == objLJFF) {
                C1C7U.LIZIZ("EmojiSliderViewerListManager@d74f.loadMore$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmojiSliderViewerListManager@d74f.loadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
