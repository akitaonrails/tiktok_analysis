package X;

import Y.ARunnableS114S0100000_14;
import android.app.Application;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerFragment;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896300ZEe extends C09AY implements InterfaceC1685430txd<UIAssem, List<? extends C0HIA>, Set<? extends String>, C0ZEZ, C0ZEM, C0ZEP, Unit> {
    public final /* synthetic */ BotSharePostPickerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C896300ZEe(BotSharePostPickerAssem botSharePostPickerAssem) {
        super(6);
        this.LL = botSharePostPickerAssem;
    }

    @Override // X.InterfaceC1685430txd
    public final Unit invoke(UIAssem uIAssem, List<? extends C0HIA> list, Set<? extends String> set, C0ZEZ c0zez, C0ZEM c0zem, C0ZEP c0zep) {
        Fragment fragmentLJI;
        ViewOnAttachStateChangeListenerC20604515jv powerList;
        BotSharePostPickerFragment botSharePostPickerFragment;
        C20600815jK<InterfaceC1891350zJl> state;
        List<? extends C0HIA> listLJLILLLLZI = list;
        Set<? extends String> set2 = set;
        C0ZEM c0zem2 = c0zem;
        C0ZEP c0zep2 = c0zep;
        BotSharePostPickerAssem botSharePostPickerAssem = this.LL;
        ViewOnAttachStateChangeListenerC20604515jv powerList2 = botSharePostPickerAssem.getPowerList();
        if (powerList2 != null && (state = powerList2.getState()) != null) {
            if (c0zep2.LIZ && c0zep2.LIZIZ) {
                listLJLILLLLZI = C13LP.LJLILLLLZI(C06XM.LL, listLJLILLLLZI);
            }
            state.LJIILL(listLJLILLLLZI, null);
        }
        if (Intrinsics.LJFF(c0zem2, C0ZEN.LIZ)) {
            TuxSkeletonLayout tuxSkeletonLayoutHo = botSharePostPickerAssem.Ho();
            if (tuxSkeletonLayoutHo != null) {
                botSharePostPickerAssem.So(tuxSkeletonLayoutHo, true);
            }
            ViewOnAttachStateChangeListenerC20604515jv powerList3 = botSharePostPickerAssem.getPowerList();
            if (powerList3 != null) {
                C786410Ut5.LJLLLLLL(8, powerList3);
            }
            botSharePostPickerAssem.No();
        } else if (Intrinsics.LJFF(c0zem2, C896290ZEd.LIZ)) {
            TuxSkeletonLayout tuxSkeletonLayoutHo2 = botSharePostPickerAssem.Ho();
            if (tuxSkeletonLayoutHo2 != null) {
                botSharePostPickerAssem.So(tuxSkeletonLayoutHo2, false);
            }
            botSharePostPickerAssem.No();
            ViewOnAttachStateChangeListenerC20604515jv powerList4 = botSharePostPickerAssem.getPowerList();
            if (powerList4 != null) {
                C786410Ut5.LJLLLLLL(0, powerList4);
            }
            ViewOnAttachStateChangeListenerC20604515jv powerList5 = botSharePostPickerAssem.getPowerList();
            if (powerList5 != null) {
                powerList5.bringToFront();
            }
        } else if (Intrinsics.LJFF(c0zem2, C0ZEO.LIZ)) {
            TuxSkeletonLayout tuxSkeletonLayoutHo3 = botSharePostPickerAssem.Ho();
            if (tuxSkeletonLayoutHo3 != null) {
                botSharePostPickerAssem.So(tuxSkeletonLayoutHo3, false);
            }
            ViewOnAttachStateChangeListenerC20604515jv powerList6 = botSharePostPickerAssem.getPowerList();
            if (powerList6 != null) {
                C786410Ut5.LJLLLLLL(8, powerList6);
            }
            C1749280vcc c1749280vccJo = botSharePostPickerAssem.Jo();
            if (c1749280vccJo != null) {
                C786410Ut5.LJLLLLLL(0, c1749280vccJo);
            }
            botSharePostPickerAssem.Go();
            C1749280vcc c1749280vccJo2 = botSharePostPickerAssem.Jo();
            if (c1749280vccJo2 != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                c1722300uv6.LJI = botSharePostPickerAssem.LJJIJL().getContext().getString(2131824655);
                c1722300uv6.LJIIIIZZ = botSharePostPickerAssem.LJJIJL().getContext().getString(2131824657);
                c1749280vccJo2.setStatus(c1722300uv6);
            }
        } else if (c0zem2 instanceof C0ZER) {
            TuxSkeletonLayout tuxSkeletonLayoutHo4 = botSharePostPickerAssem.Ho();
            if (tuxSkeletonLayoutHo4 != null) {
                botSharePostPickerAssem.So(tuxSkeletonLayoutHo4, false);
            }
            ViewOnAttachStateChangeListenerC20604515jv powerList7 = botSharePostPickerAssem.getPowerList();
            if (powerList7 != null) {
                C786410Ut5.LJLLLLLL(8, powerList7);
            }
            C1749280vcc c1749280vccJo3 = botSharePostPickerAssem.Jo();
            if (c1749280vccJo3 != null) {
                C786410Ut5.LJLLLLLL(0, c1749280vccJo3);
            }
            botSharePostPickerAssem.Go();
            C1749280vcc c1749280vccJo4 = botSharePostPickerAssem.Jo();
            if (c1749280vccJo4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("show network error status, error=");
                C0ZER c0zer = (C0ZER) c0zem2;
                sbLIZ.append(c0zer.LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1264160j0A.LIZIZ(c1749280vccJo4, "bot_share_post_picker", c0zer.LIZ, new C896260ZEa(botSharePostPickerAssem));
                C1519805xE c1519805xE = InterfaceC1519705xD.LIZ;
                Application applicationLIZ = C1BWL.LIZ();
                c1519805xE.getClass();
                if (!C0XF1.LIZLLL(applicationLIZ) && C0XF1.LIZIZ(C1BWL.LIZ()) && (fragmentLJI = C724240Sb0.LJI(botSharePostPickerAssem)) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
                    c1389890mGx.LJIIIZ(2131829441);
                    c1389890mGx.LJIIJJI();
                }
            }
        } else {
            throw new C1954807lC();
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(botSharePostPickerAssem);
        if ((fragmentLJI2 instanceof BotSharePostPickerFragment) && (botSharePostPickerFragment = (BotSharePostPickerFragment) fragmentLJI2) != null) {
            int size = set2.size();
            boolean zLJFF = Intrinsics.LJFF(c0zez, C896280ZEc.LIZ);
            botSharePostPickerFragment.LLIZLLLIL = size;
            botSharePostPickerFragment.LLJ = zLJFF;
            botSharePostPickerFragment.SR(size, zLJFF);
        }
        if (Intrinsics.LJFF(c0zem2, C896290ZEd.LIZ) && (powerList = botSharePostPickerAssem.getPowerList()) != null) {
            HandlerHook.viewPost(powerList, new ARunnableS114S0100000_14(botSharePostPickerAssem, 43));
        }
        return Unit.LIZ;
    }
}
