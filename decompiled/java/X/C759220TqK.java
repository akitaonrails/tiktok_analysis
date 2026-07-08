package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.android.livesdk.chatroom.model.ChatBatchApproveRequest;
import com.bytedance.android.livesdk.function.RoomFunctionApi;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment$onViewCreated$7$1", f = "CommunityFlaggedManageSheetFragment.kt", l = {239}, m = "invokeSuspend")
public final class C759220TqK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommunityFlaggedManageSheetFragment LLILLJJLI;
    public final /* synthetic */ C759310TqT LLILLL;
    public final /* synthetic */ ChatBatchApproveRequest LLILZ;
    public final /* synthetic */ List<AbstractC1110520f0M<? extends AbstractC1136060ffY>> LLILZIL;
    public final /* synthetic */ Room LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C759220TqK(CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment, C759310TqT c759310TqT, ChatBatchApproveRequest chatBatchApproveRequest, List<? extends AbstractC1110520f0M<? extends AbstractC1136060ffY>> list, Room room, InterfaceC1364105Vn<? super C759220TqK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = communityFlaggedManageSheetFragment;
        this.LLILLL = c759310TqT;
        this.LLILZ = chatBatchApproveRequest;
        this.LLILZIL = list;
        this.LLILZLL = room;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C759220TqK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C16FS c16fsWS;
        C16FS c16fsWS2;
        ChatMessage chatMessage;
        C1C7U.LIZ("CommunityFlaggedManageSheetFragment@2faa.onViewCreated$7$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C16FS c16fsWS3 = this.LLILLJJLI.wS();
                if (c16fsWS3 != null) {
                    c16fsWS3.setEnabled(false);
                }
                this.LLILLL.LLLII(false);
                C480460Ism.LIZ().getClass();
                RoomFunctionApi roomFunctionApi = (RoomFunctionApi) C480460Ism.LIZLLL(RoomFunctionApi.class);
                ChatBatchApproveRequest chatBatchApproveRequest = this.LLILZ;
                this.LL = 1;
                obj = roomFunctionApi.batchApproveFilteredComments(chatBatchApproveRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CommunityFlaggedManageSheetFragment@2faa.onViewCreated$7$1");
                    return objLJFF;
                }
            }
            if (((C470590Icr) obj).statusCode == 0) {
                this.LLILLL.LLLFZ(this.LLILZIL);
            } else {
                C766270U4b.LIZLLL(2131854910);
            }
            List<AbstractC1110520f0M<? extends AbstractC1136060ffY>> list = this.LLILZIL;
            Room room = this.LLILZLL;
            for (AbstractC1110520f0M<? extends AbstractC1136060ffY> abstractC1110520f0M : list) {
                MESSAGE message = abstractC1110520f0M.LJIL;
                if (message instanceof ChatMessage) {
                    chatMessage = (ChatMessage) message;
                } else {
                    chatMessage = null;
                }
                if (chatMessage != null) {
                    abstractC1110520f0M.LJIIZILJ.LIZ = true;
                    chatMessage.communityflaggedStatus = 2;
                    ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Gn1(room.getId(), abstractC1110520f0M.LIZ, abstractC1110520f0M);
                }
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                if (th instanceof C501470JlZ) {
                    C766270U4b.LJIIJJI(th.getPrompt());
                } else {
                    C766270U4b.LIZLLL(2131854910);
                }
                if (this.LLILLL.LLLI() > 0 && (c16fsWS2 = this.LLILLJJLI.wS()) != null) {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (this.LLILLL.LLLI() > 0 && (c16fsWS = this.LLILLJJLI.wS()) != null) {
                    c16fsWS.setEnabled(true);
                }
                this.LLILLL.LLLII(true);
                throw th2;
            }
        }
        if (this.LLILLL.LLLI() > 0 && (c16fsWS2 = this.LLILLJJLI.wS()) != null) {
            c16fsWS2.setEnabled(true);
        }
        this.LLILLL.LLLII(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommunityFlaggedManageSheetFragment@2faa.onViewCreated$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
