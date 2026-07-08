package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06d2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1649406d2 extends C06OD<C06OO> {
    public final SessionInfo LLILLL;
    public final Function0<Unit> LLILZ;
    public final C06ME LLILZIL;

    @Override // X.C06OD
    public final void LIZLLL() {
        C902600Zb0 c902600Zb0LIZIZ;
        StoryFriendAnniversaryService.LIZ.getClass();
        StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
        if (storyFriendAnniversaryServiceLIZ != null && (c902600Zb0LIZIZ = storyFriendAnniversaryServiceLIZ.LIZIZ()) != null) {
            c902600Zb0LIZIZ.LIZ(this.LLILLL);
        }
        this.LLILZIL.LLZLI();
    }

    @Override // X.C06OD
    public final Object LJI(C06OO c06oo) {
        C902600Zb0 c902600Zb0LIZIZ;
        StoryFriendAnniversaryService.LIZ.getClass();
        StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
        if (storyFriendAnniversaryServiceLIZ != null && (c902600Zb0LIZIZ = storyFriendAnniversaryServiceLIZ.LIZIZ()) != null) {
            c902600Zb0LIZIZ.LIZLLL(this.LLILLL, this.LLILZ);
        }
        return this.LLILZIL;
    }

    @Override // X.C06OD
    public final Object LJII(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean z = false;
        if (this.LLILLL.isSingleChat()) {
            StoryFriendAnniversaryService.LIZ.getClass();
            StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
            if (storyFriendAnniversaryServiceLIZ != null && storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ()) != null) {
                new C902320ZaY();
                if (C902320ZaY.LIZ(2, this.LLILLL.getConversationId())) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public C1649406d2(C909290Zln c909290Zln, EnumC1596306Mv enumC1596306Mv, Function0 function0) {
        super(enumC1596306Mv);
        this.LLILLL = c909290Zln;
        this.LLILZ = function0;
        this.LLILZIL = new C06ME();
    }
}
