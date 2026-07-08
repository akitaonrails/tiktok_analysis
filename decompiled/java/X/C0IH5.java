package X;

import android.graphics.Bitmap;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IH5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IH5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IH5(boolean z, int i) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0IOH c0ioh;
        LivePlayFragment livePlayFragment;
        if (!this.LL || this.LLILLJJLI <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchToMultiGuestFeed onFinish: no room inserted (success=");
            sbLIZ.append(this.LL);
            sbLIZ.append(", roomCount=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append("), keep OLD_next end card");
            C20441214yg.LJ("LiveEndMgFeedInjector", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("switchToMultiGuestFeed onFinish: success, insertedRoom=");
            sbLIZ2.append(this.LLILLJJLI);
            sbLIZ2.append(", rebind next page");
            C20441214yg.LJIIIZ("LiveEndMgFeedInjector", C2188811AlT.LIZIZ(sbLIZ2));
            C21601619gM c21601619gM = C0IH6.LJIIIIZZ;
            C464740IKi c464740IKi = C0IH6.LIZ;
            if (c21601619gM == null || c464740IKi == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("rebindNextPageAfterListChange: abort, viewPager=");
                sbLIZ3.append(c21601619gM);
                sbLIZ3.append(", endLiveCardInfo=");
                sbLIZ3.append(c464740IKi);
                C20441214yg.LJ("LiveFinishSmallCardManager", C2188811AlT.LIZIZ(sbLIZ3));
            } else {
                PagerAdapter adapter = c21601619gM.getAdapter();
                if (!(adapter instanceof C0IOH) || (c0ioh = (C0IOH) adapter) == null) {
                    C20441214yg.LJ("LiveFinishSmallCardManager", "rebindNextPageAfterListChange: abort, adapter is not LiveDetailPagerAdapter");
                } else {
                    int i = C0IH6.LIZLLL + 1;
                    InterfaceC466370IQp interfaceC466370IQpLJJIJIL = c0ioh.LJJIJIL(i);
                    if (!(interfaceC466370IQpLJJIJIL instanceof LivePlayFragment) || (livePlayFragment = (LivePlayFragment) interfaceC466370IQpLJJIJIL) == null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("rebindNextPageAfterListChange: abort, no LivePlayFragment at pos=");
                        sbLIZ4.append(i);
                        C20441214yg.LJ("LiveFinishSmallCardManager", C2188811AlT.LIZIZ(sbLIZ4));
                    } else {
                        LivePlayFragment livePlayFragment2 = C0IH6.LJII;
                        if (livePlayFragment == livePlayFragment2) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("rebindNextPageAfterListChange: nextPage unchanged at pos=");
                            sbLIZ5.append(i);
                            sbLIZ5.append(", no rebind needed");
                            C20441214yg.LJIIIZ("LiveFinishSmallCardManager", C2188811AlT.LIZIZ(sbLIZ5));
                        } else {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("rebindNextPageAfterListChange: swap nextPage at pos=");
                            sbLIZ6.append(i);
                            sbLIZ6.append(", move end card OLD_next -> NEW_next");
                            C20441214yg.LJIIIZ("LiveFinishSmallCardManager", C2188811AlT.LIZIZ(sbLIZ6));
                            if (livePlayFragment2 != null) {
                                livePlayFragment2.iS();
                            }
                            C0IH6.LJII = livePlayFragment;
                            C0IH6.LJIIJ = false;
                            C0IH6.LJIIL = false;
                            C0IH6.LJIILIIL = false;
                            livePlayFragment.KV(false, c464740IKi);
                            Bitmap bitmap = C0IH6.LJIIZILJ;
                            if (bitmap != null && !bitmap.isRecycled()) {
                                C20441214yg.LJIIIZ("LiveFinishSmallCardManager", "rebindNextPageAfterListChange: sync cached blur bitmap to NEW_next");
                                livePlayFragment.oV(bitmap);
                            }
                        }
                    }
                }
            }
        }
        C463850IGx.LIZ("loadMoreFinish");
        return Unit.LIZ;
    }
}
