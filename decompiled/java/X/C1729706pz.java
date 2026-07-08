package X;

import com.bytedance.ies.im.core.api.experiment.GroupFakeWriteExperimentData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.core.chatlist.api.ability.actor.IChatListMultiThreadActor;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS593S0100000_14;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.06pz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1729706pz implements InterfaceC884990Ynh, InterfaceC908170Zjz {
    public C11JF LL;
    public final C909370Zlv LLILLJJLI = new C909370Zlv();
    public final C888600YtW LLILLL = new C888600YtW();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(762));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(766));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(765));
    public final C0ZB6 LLIZ = new C06AS() { // from class: X.0ZB6
        @Override // X.C06AS
        public final void clear() {
        }

        @Override // X.C06AS
        public final Unit LIZ() {
            return Unit.LIZ;
        }

        @Override // X.C06AS
        public final Unit LIZIZ() {
            return Unit.LIZ;
        }

        @Override // X.C06AS
        public final Unit LIZLLL() {
            return Unit.LIZ;
        }

        @Override // X.C06AS
        public final Unit init() {
            return Unit.LIZ;
        }

        @Override // X.C06AS
        public final Unit LIZJ(C885880Yp8 c885880Yp8) {
            if (C1229040i5W.LLIZ) {
                C1229040i5W.LLIZ = false;
                C1228920i5K.LIZIZ(EnumC1229060i5Y.ENTER_INBOX);
            }
            return Unit.LIZ;
        }

        @Override // X.C06AS
        public final Object LJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return Unit.LIZ;
        }

        @Override // X.C06AS
        public final Unit LJFF(C1619080sEc c1619080sEc) {
            return Unit.LIZ;
        }
    };
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(764));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(763));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(761));

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C06AS> LIZIZ() {
        List<C06AS> listLJIILJJIL = C1697810uHb.LJIILJJIL(this.LLILLJJLI, this.LLILLL, this.LLIZ);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_effect_camera_entrance_on_action_bar", true) == 2 && C1865360ydq.LIZ()) {
            listLJIILJJIL.add(this.LLILZ.getValue());
        }
        if (C299810Bp5.LIZ()) {
            listLJIILJJIL.add(this.LLILZIL.getValue());
        }
        if (((Number) C103900aL.LIZ.getValue()).intValue() == 1) {
            listLJIILJJIL.add(this.LLILZLL.getValue());
        }
        listLJIILJJIL.add(this.LLJ.getValue());
        if (((GroupFakeWriteExperimentData) C893380Z2y.LIZIZ.getValue()).enableFakeWrite) {
            listLJIILJJIL.add(this.LLIZLLLIL.getValue());
        }
        listLJIILJJIL.add(this.LLJI.getValue());
        return listLJIILJJIL;
    }

    @Override // X.InterfaceC884990Ynh
    public final void LJ() {
    }

    @Override // X.InterfaceC884990Ynh
    public final void LIZJ() {
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZ(this);
        EventBus.LIZLLL().LJJI(this);
        C11JF c11jf = this.LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LL = null;
        if (!C1563306Ad.LIZ()) {
            C1729806q0.LIZIZ(new AwS546S0100000_2(this, 908), true);
            return;
        }
        Iterator<C06AS> it2 = LIZIZ().iterator();
        while (it2.hasNext()) {
            C1729806q0.LIZIZ(new AwS546S0100000_2(it2.next(), 907), true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0ZB6] */
    public C1729706pz() {
        C11PQ<C885880Yp8> c11pqLJIILLIIL;
        C19501611Rm c19501611Rm;
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(this);
        EventBus.LIZLLL().LJIJJ(this);
        C11JF c11jfLJ = null;
        if (C1563306Ad.LIZ()) {
            for (C06AS c06as : LIZIZ()) {
                AbstractC883730Ylf.LJIIIIZZ.getClass();
                C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C06AR(c06as, null));
            }
        } else {
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C06AZ(this, null));
        }
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null && (c11pqLJIILLIIL = abstractC883730YlfLJ.LJIILLIIL()) != null) {
            C19488511Ml c19488511MlLJJIFFI = c11pqLJIILLIIL.LJJIFFI();
            C878950Ydx c878950YdxLIZLLL = C881500Yi4.LIZLLL();
            if (C880900Yh6.LIZ()) {
                IChatListMultiThreadActor iChatListMultiThreadActor = (IChatListMultiThreadActor) C1729806q0.LIZ.getValue();
                if (iChatListMultiThreadActor == null || (c19501611Rm = iChatListMultiThreadActor.LIZJ(c878950YdxLIZLLL)) == null) {
                    Executor executor = (Executor) C1729806q0.LIZIZ.getValue();
                    C11RO c11ro = C11S5.LIZ;
                    c19501611Rm = new C19501611Rm(executor);
                }
            } else {
                Executor executor2 = (Executor) C1729806q0.LIZIZ.getValue();
                C11RO c11ro2 = C11S5.LIZ;
                c19501611Rm = new C19501611Rm(executor2);
            }
            c11jfLJ = C1239300iM4.LJ(c19488511MlLJJIFFI.LJJJLZIJ(c19501611Rm), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new AwS593S0100000_14(this, 188));
        }
        this.LL = c11jfLJ;
    }

    @Override // X.InterfaceC884990Ynh
    public final void LIZLLL() {
        if (C1563306Ad.LIZ()) {
            for (C06AS c06as : LIZIZ()) {
                AbstractC883730Ylf.LJIIIIZZ.getClass();
                C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C06AP(c06as, null));
            }
        } else {
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C1563006Aa(this, null));
        }
        if (C296660Bk0.LIZ() && C296660Bk0.LIZ()) {
            IMUserPortraitApi.LIZ.getClass();
            InterfaceC909580ZmG interfaceC909580ZmGLJ = C1730606q8.LIZ().LJ();
            long jLIZIZ = ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            interfaceC909580ZmGLJ.LJJI(jLIZIZ, curUserId);
        }
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onUnreadCountUpdate(C1619080sEc c1619080sEc) {
        if (!C1563306Ad.LIZ()) {
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C06AW(this, c1619080sEc, null));
            return;
        }
        for (C06AS c06as : LIZIZ()) {
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C06AU(c06as, c1619080sEc, null));
        }
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (C1563306Ad.LIZ()) {
            for (C06AS c06as : LIZIZ()) {
                AbstractC883730Ylf.LJIIIIZZ.getClass();
                C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C06AV(c06as, i, z, 0, user, null));
            }
            return;
        }
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C06AY(this, i, z, 0, user, null));
    }
}
