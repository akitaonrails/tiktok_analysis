package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.06jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1692106jv extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final Set<C067L> LLIZLLLIL;

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZLL.getValue();
    }

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return (!C902250ZaR.LIZ() || this.LLILZ.LJII || this.LLILZIL.getValue() == null) ? false : true;
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZLLLIL;
    }

    public C1692106jv(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1058));
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1059));
        this.LLIZ = Collections.singleton(EnumC1596306Mv.MEDIA_NUDE_FILTER);
        this.LLIZLLLIL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS});
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        TuxSheet tuxSheet;
        C1692206jw c1692206jw = (C1692206jw) this.LLILZIL.getValue();
        if (c1692206jw != null && (tuxSheet = c1692206jw.LLILZIL) != null && !tuxSheet.isStateSaved()) {
            TuxSheet tuxSheet2 = c1692206jw.LLILZIL;
            if (tuxSheet2 != null) {
                tuxSheet2.dismiss();
            }
            c1692206jw.LLILZIL = null;
            c1692206jw.LLZLI();
        }
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        if (!this.LLILZ.LJI.isSingleChat()) {
            return new C06OH("Not single chat");
        }
        IChatRequestRepository.LIZ.getClass();
        IChatRequestRepository iChatRequestRepositoryLIZ = C15596068s.LIZ();
        if (iChatRequestRepositoryLIZ != null) {
            if (((AnonymousClass0693) iChatRequestRepositoryLIZ).LJII(this.LLILZ.LJI.getConversationId())) {
                return new C06OH("Is chat request");
            }
        }
        if (c06oo.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        C1692206jw c1692206jw = (C1692206jw) this.LLILZIL.getValue();
        if (c1692206jw != null && c1692206jw.LIZ()) {
            return C06OI.LIZ;
        }
        return new C06OH("Failed condition check");
    }

    @Override // X.C06O6
    public final Object LJIIJ(C06OO c06oo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        FragmentManager fragmentManagerLJ;
        C1692206jw c1692206jw = (C1692206jw) this.LLILZIL.getValue();
        if (c1692206jw != null && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (fragmentManagerLJ = abstractC1387200mCcLIZIZ.LJ()) != null && c1692206jw.LIZ()) {
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.xm;
            c770750ULh.LIZ = c0hti.LIZ(c1692206jw.LLILLJJLI);
            c770750ULh.LJ = c1692206jw.LLILLJJLI.getString(2131831708);
            c770750ULh.LIZLLL = 1;
            c770750ULh.LJ(new C1667580tUq(R.raw.icon_shield_tick, c1692206jw.LLILLJJLI.getString(2131831709), c1692206jw.LLILLJJLI.getString(2131831710), null, 8), new C1667580tUq(R.raw.icon_video, c1692206jw.LLILLJJLI.getString(2131831711), c1692206jw.LLILLJJLI.getString(2131831712), null, 8), new C1667580tUq(R.raw.icon_eye_slash, c1692206jw.LLILLJJLI.getString(2131831713), c1692206jw.LLILLJJLI.getString(2131831714), null, 8), new C1667580tUq(R.raw.icon_gear, c1692206jw.LLILLJJLI.getString(2131831715), c1692206jw.LLILLJJLI.getString(2131831716), null, 8));
            c770750ULh.LJIILLIIL = true;
            c770750ULh.LJI(c1692206jw.LLILLJJLI.getString(2131831707), new AwS581S0100000_2(c1692206jw, 479));
            c770750ULh.LJII(c1692206jw.LLILLJJLI.getString(2131831706), AFwS229S0000000_2.get$arr$(690));
            C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
            DialogInterfaceOnCancelListenerC1767706w7 dialogInterfaceOnCancelListenerC1767706w7 = new DialogInterfaceOnCancelListenerC1767706w7(c1692206jw, 0);
            TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
            tuxSheet.LL = dialogInterfaceOnCancelListenerC1767706w7;
            tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1767806w8(c1692206jw, 7);
            c1692206jw.LLILZIL = tuxSheet;
            tuxSheet.show(fragmentManagerLJ, "DMMediaNudeFilterPopupSheet");
            ((Keva) c1692206jw.LLILZ.getValue()).storeBoolean(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), true);
            C912070ZqH.LIZIZ.LJIJJ().LIZJ().LIZLLL("chat");
        }
        return Unit.LIZ;
    }
}
