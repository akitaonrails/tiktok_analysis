package X;

import Y.ARunnableS107S0100000_7;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.UpdateGiftListEvent;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0KdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521990KdZ implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Object> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C521990KdZ c521990KdZ, C09AJ c09aj) {
        C1C7U.LIZ("TryModeBroadcastFragment@9777.mSyncGiftListCallback$2$1$onSyncGiftPageListFinish$1");
        ((TryModeBroadcastFragment) c521990KdZ.l0).getDataChannel().LC0(UpdateGiftListEvent.class, (List) c521990KdZ.l1);
        C1C7U.LIZIZ("TryModeBroadcastFragment@9777.mSyncGiftListCallback$2$1$onSyncGiftPageListFinish$1");
    }

    public static final void subscribe$1(C521990KdZ c521990KdZ, C09AJ c09aj) {
        C1C7U.LIZ("SwitchResolutionHelper@8ec9.switchNormal$1");
        String str = ((C0IIJ) c521990KdZ.l0).LIZ;
        if (str != null && str.length() != 0 && !C2093608Ic.LIZJ(((C0IIJ) c521990KdZ.l0).LIZ, "ao")) {
            C20441214yg.LIZIZ("SwitchResolutionHelper", "switchNormal:start");
            C0IEB c0ieb = (C0IEB) c521990KdZ.l1;
            final C0IIJ c0iij = (C0IIJ) c521990KdZ.l0;
            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
            c0ieb.switchResolution(c0iij.LIZ, new InterfaceC1699420uKC() { // from class: X.0IIh
                @Override // X.InterfaceC1699420uKC
                public final void LIZ(boolean z) {
                    C20441214yg.LIZIZ("SwitchResolutionHelper:switchNormal:end", String.valueOf(z));
                    if (z) {
                        c19482611Ke.onNext(Boolean.valueOf(z));
                    } else {
                        c0iij.LIZ(2);
                        c19482611Ke.tryOnError(new Exception("switch error") { // from class: X.0IIK
                        });
                    }
                }
            });
        } else {
            c09aj.tryOnError(new Exception("current is ao"));
        }
        C1C7U.LIZIZ("SwitchResolutionHelper@8ec9.switchNormal$1");
    }

    public static final void subscribe$2(C521990KdZ c521990KdZ, C09AJ c09aj) {
        C465920IOw c465920IOw = (C465920IOw) c521990KdZ.l0;
        List list = (List) c521990KdZ.l1;
        c465920IOw.getClass();
        C1C7U.LIZ("AbsAudienceInteractionFragment@61ad.<field>$1$onSyncGiftPageListFinish$1L");
        if (list != null && list.size() > 0) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List<Gift> list2 = ((GiftPage) it2.next()).gifts;
                if (list2 != null && list2.size() > 0) {
                    Iterator<Gift> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ImageModel imageModel = it3.next().image;
                        if (imageModel != null) {
                            C1324570kZb.LJIIIIZZ(imageModel);
                        }
                    }
                    if (c465920IOw.LIZ.getView() != null) {
                        HandlerHook.viewPost(c465920IOw.LIZ.getView(), new ARunnableS107S0100000_7(c465920IOw, 52));
                    }
                }
            }
        }
        C1C7U.LIZIZ("AbsAudienceInteractionFragment@61ad.<field>$1$onSyncGiftPageListFinish$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C521990KdZ(Object obj, TryModeBroadcastFragment tryModeBroadcastFragment, List<GiftPage> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = tryModeBroadcastFragment;
    }
}
