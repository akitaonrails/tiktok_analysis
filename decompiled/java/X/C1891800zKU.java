package X;

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
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zKU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emojisticker.interactiveemoji.service.InteractiveEmojiViewerListManager$loadMore$1", f = "InteractiveEmojiViewerListManager.kt", l = {80}, m = "invokeSuspend")
public final class C1891800zKU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1891820zKW LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891800zKU(C1891820zKW c1891820zKW, long j, InterfaceC1364105Vn<? super C1891800zKU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1891820zKW;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891800zKU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        boolean z;
        List list;
        String aid2;
        long j;
        boolean z2;
        List<InteractiveEmojiResult> list2;
        String emojiContent;
        List<InteractStickerStruct> interactStickerStructs;
        C1C7U.LIZ("InteractiveEmojiViewerListManager@4b28.loadMore$1");
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
                    if (it2.next().getType() == 100) {
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                C1891790zKT c1891790zKTLJFF = this.LLILLJJLI.LJFF();
                long j2 = this.LLILLL;
                c1891790zKTLJFF.getClass();
                try {
                    Aweme aweme3 = c1891790zKTLJFF.LIZIZ;
                    if (aweme3 != null && (aid2 = aweme3.getAid()) != null) {
                        InteractiveEmojiReactionResponse interactiveEmojiReactionResponse = ReactionApi.LIZIZ.fetchReactionListDetail(aid2, 1, j2, c1891790zKTLJFF.LJ, "").execute().LIZIZ;
                        ArrayList arrayList = new ArrayList();
                        InteractiveEmojiReactionResult interactiveEmojiReactionResult = interactiveEmojiReactionResponse.interactiveEmojiReactionResult;
                        if (interactiveEmojiReactionResult != null && (list2 = interactiveEmojiReactionResult.interactiveEmojiResultList) != null) {
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            Iterator<InteractiveEmojiResult> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                User user = it3.next().user;
                                Aweme aweme4 = c1891790zKTLJFF.LIZIZ;
                                InteractiveEmojiStickerStruct interactiveEmojiStickerStruct = c1891790zKTLJFF.LIZJ;
                                if (interactiveEmojiStickerStruct != null) {
                                    emojiContent = interactiveEmojiStickerStruct.getEmojiContent();
                                } else {
                                    emojiContent = null;
                                }
                                arrayList2.add(new C737720Swk(user, aweme4, emojiContent, c1891790zKTLJFF.LIZ));
                            }
                            arrayList.addAll(arrayList2);
                        }
                        InteractiveEmojiReactionResult interactiveEmojiReactionResult2 = interactiveEmojiReactionResponse.interactiveEmojiReactionResult;
                        if (interactiveEmojiReactionResult2 != null) {
                            j = interactiveEmojiReactionResult2.nextCursor;
                        } else {
                            j = 0;
                        }
                        c1891790zKTLJFF.LJ = j;
                        if (interactiveEmojiReactionResult2 == null) {
                            z2 = false;
                        } else {
                            z2 = interactiveEmojiReactionResult2.hasMore;
                        }
                        c1891790zKTLJFF.LJFF = z2;
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
            C1891810zKV c1891810zKV = new C1891810zKV(aid, this.LLILLJJLI, list, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1891810zKV) == objLJFF) {
                C1C7U.LIZIZ("InteractiveEmojiViewerListManager@4b28.loadMore$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractiveEmojiViewerListManager@4b28.loadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
