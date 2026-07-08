package Y;

import X.C0IUA;
import X.C0IVV;
import X.C0IVW;
import X.C472480Ifu;
import X.C472490Ifv;
import X.InterfaceC472640IgA;
import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomInformationDoubleViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomInformationSingleViewHolder;
import com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder;
import com.bytedance.android.livesdk.model.FeedItem;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS4S1301000_7 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$0(Y.ACListenerS4S1301000_7 r6, android.view.View r7) {
        /*
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder) r0
            boolean r0 = r0.T5()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder) r0
            X.0IgA r0 = r0.LLJJJIL
            if (r0 == 0) goto L16
            r0.LIZLLL()
            return
        L16:
            java.lang.String r0 = "live_cover"
            X.C0IUA.LJJIFFI = r0
            int r0 = r6.i4
            X.C0IUA.LJJII = r0
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder) r0
            X.0Ifs r0 = r0.LLIZ
            boolean r0 = r0 instanceof X.C472480Ifu
            if (r0 == 0) goto L35
            java.lang.Object r0 = r6.l2
            com.bytedance.android.live.base.model.feed.FeedExtra r0 = (com.bytedance.android.live.base.model.feed.FeedExtra) r0
            if (r0 == 0) goto L35
            java.lang.String r1 = r6.s0
            java.lang.String r0 = r0.unreadExtra
            X.C0IUA.LJ(r0, r1)
        L35:
            X.0IVW r4 = new X.0IVW
            android.content.Context r1 = r7.getContext()
            java.lang.Object r0 = r6.l3
            com.bytedance.android.livesdk.model.FeedItem r0 = (com.bytedance.android.livesdk.model.FeedItem) r0
            r4.<init>(r1, r0)
            int r0 = r6.i4
            r4.LJI = r0
            r4.LJII = r0
            java.lang.String r0 = r6.s0
            r4.LJIIIIZZ = r0
            java.lang.Object r1 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder r1 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder) r1
            com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder$LogExtraData r0 = r1.LLJILJIL
            r4.LJIIJ = r0
            com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder$LogExtraData r0 = r1.LLJILJILJ
            r4.LJIIJJI = r0
            boolean r0 = r1.X5()
            r3 = 1
            r5 = 0
            if (r0 != 0) goto L6a
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder) r0
            X.0Ien r1 = r0.LLIZLLLIL
            X.0Ien r0 = X.EnumC471790Ien.NEARBY
            if (r1 != r0) goto Lb4
        L6a:
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LLJ
            if (r0 == 0) goto Lb2
            com.bytedance.android.livesdkapi.depend.model.live.NearbyInfo r0 = r0.nearbyInfo
            if (r0 == 0) goto Lb2
            java.lang.String r0 = r0.label
        L78:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb4
            r0 = 1
        L7f:
            r4.LJIIL = r0
            java.lang.Object r2 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder r2 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomDoubleViewHolder) r2
            com.bytedance.android.livesdk.model.FeedItem r0 = r2.LLJI
            if (r0 == 0) goto L90
            int r1 = r0.type
            r0 = 20
            if (r1 != r0) goto L90
            r5 = 1
        L90:
            r4.LJIILIIL = r5
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r2.LLJ
            r4.LJ = r0
            X.0Ifs r0 = r2.LLIZ
            boolean r0 = r0 instanceof X.C472490Ifv
            if (r0 == 0) goto Lab
            X.0Ien r1 = r2.LLIZLLLIL
            X.0Ien r0 = X.EnumC471790Ien.NEARBY
            if (r1 != r0) goto Laf
            java.lang.String r0 = "nearby_tab_toplive_live_cover"
        La4:
            r4.LIZLLL = r0
            r4.LJIILLIIL = r3
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder.W5(r4)
        Lab:
            X.C0IVV.LIZIZ(r4)
            return
        Laf:
            java.lang.String r0 = "toplive_live_cover"
            goto La4
        Lb2:
            r0 = 0
            goto L78
        Lb4:
            r0 = 0
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS4S1301000_7.onClick$0(Y.ACListenerS4S1301000_7, android.view.View):void");
    }

    public static final void onClick$1(ACListenerS4S1301000_7 aCListenerS4S1301000_7, View view) {
        FeedExtra feedExtra;
        InterfaceC472640IgA interfaceC472640IgA;
        if (((LiveRoomInformationDoubleViewHolder) aCListenerS4S1301000_7.l1).T5() && (interfaceC472640IgA = ((LiveRoomInformationDoubleViewHolder) aCListenerS4S1301000_7.l1).LLJJJIL) != null) {
            interfaceC472640IgA.LIZLLL();
            return;
        }
        C0IUA.LJJIFFI = "live_cover";
        C0IUA.LJJII = aCListenerS4S1301000_7.i4;
        if ((((LiveRoomInformationDoubleViewHolder) aCListenerS4S1301000_7.l1).LLIZ instanceof C472480Ifu) && (feedExtra = (FeedExtra) aCListenerS4S1301000_7.l2) != null) {
            C0IUA.LJ(feedExtra.unreadExtra, aCListenerS4S1301000_7.s0);
        }
        C0IVW c0ivw = new C0IVW(view.getContext(), (FeedItem) aCListenerS4S1301000_7.l3);
        int i = aCListenerS4S1301000_7.i4;
        c0ivw.LJI = i;
        c0ivw.LJII = i;
        c0ivw.LJIIIIZZ = aCListenerS4S1301000_7.s0;
        LiveRoomInformationDoubleViewHolder liveRoomInformationDoubleViewHolder = (LiveRoomInformationDoubleViewHolder) aCListenerS4S1301000_7.l1;
        c0ivw.LJIIJ = liveRoomInformationDoubleViewHolder.LLJILJIL;
        c0ivw.LJIIJJI = liveRoomInformationDoubleViewHolder.LLJILJILJ;
        if (liveRoomInformationDoubleViewHolder.LLIZ instanceof C472490Ifv) {
            c0ivw.LIZLLL = "toplive_live_cover";
            c0ivw.LJIILLIIL = true;
            LiveRoomViewHolder.W5(c0ivw);
        }
        C0IVV.LIZIZ(c0ivw);
    }

    public static final void onClick$2(ACListenerS4S1301000_7 aCListenerS4S1301000_7, View view) {
        FeedExtra feedExtra;
        InterfaceC472640IgA interfaceC472640IgA;
        if (((LiveRoomInformationSingleViewHolder) aCListenerS4S1301000_7.l1).T5() && (interfaceC472640IgA = ((LiveRoomInformationSingleViewHolder) aCListenerS4S1301000_7.l1).LLJJJIL) != null) {
            interfaceC472640IgA.LIZLLL();
            return;
        }
        C0IUA.LJJIFFI = "live_cover";
        C0IUA.LJJII = aCListenerS4S1301000_7.i4;
        if ((((LiveRoomInformationSingleViewHolder) aCListenerS4S1301000_7.l1).LLIZ instanceof C472480Ifu) && (feedExtra = (FeedExtra) aCListenerS4S1301000_7.l2) != null) {
            C0IUA.LJ(feedExtra.unreadExtra, aCListenerS4S1301000_7.s0);
        }
        C0IVW c0ivw = new C0IVW(view.getContext(), (FeedItem) aCListenerS4S1301000_7.l3);
        int i = aCListenerS4S1301000_7.i4;
        c0ivw.LJI = i;
        c0ivw.LJII = i;
        c0ivw.LJIIIIZZ = aCListenerS4S1301000_7.s0;
        LiveRoomInformationSingleViewHolder liveRoomInformationSingleViewHolder = (LiveRoomInformationSingleViewHolder) aCListenerS4S1301000_7.l1;
        c0ivw.LJIIJ = liveRoomInformationSingleViewHolder.LLJILJIL;
        c0ivw.LJIIJJI = liveRoomInformationSingleViewHolder.LLJILJILJ;
        c0ivw.LJ = liveRoomInformationSingleViewHolder.LLJ;
        if (liveRoomInformationSingleViewHolder.LLIZ instanceof C472490Ifv) {
            c0ivw.LIZLLL = "toplive_live_cover";
            c0ivw.LJIILLIIL = true;
            LiveRoomViewHolder.W5(c0ivw);
        }
        C0IVV.LIZIZ(c0ivw);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$3(Y.ACListenerS4S1301000_7 r6, android.view.View r7) {
        /*
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder) r0
            boolean r0 = r0.T5()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder) r0
            X.0IgA r0 = r0.LLJJJIL
            if (r0 == 0) goto L16
            r0.LIZLLL()
            return
        L16:
            java.lang.String r0 = "live_cover"
            X.C0IUA.LJJIFFI = r0
            int r0 = r6.i4
            X.C0IUA.LJJII = r0
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder) r0
            X.0Ifs r0 = r0.LLIZ
            boolean r0 = r0 instanceof X.C472480Ifu
            if (r0 == 0) goto L35
            java.lang.Object r0 = r6.l2
            com.bytedance.android.live.base.model.feed.FeedExtra r0 = (com.bytedance.android.live.base.model.feed.FeedExtra) r0
            if (r0 == 0) goto L35
            java.lang.String r1 = r6.s0
            java.lang.String r0 = r0.unreadExtra
            X.C0IUA.LJ(r0, r1)
        L35:
            X.0IVW r4 = new X.0IVW
            android.content.Context r1 = r7.getContext()
            java.lang.Object r0 = r6.l3
            com.bytedance.android.livesdk.model.FeedItem r0 = (com.bytedance.android.livesdk.model.FeedItem) r0
            r4.<init>(r1, r0)
            int r0 = r6.i4
            r4.LJI = r0
            r4.LJII = r0
            java.lang.String r0 = r6.s0
            r4.LJIIIIZZ = r0
            java.lang.Object r1 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder r1 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder) r1
            com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder$LogExtraData r0 = r1.LLJILJIL
            r4.LJIIJ = r0
            com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder$LogExtraData r0 = r1.LLJILJILJ
            r4.LJIIJJI = r0
            boolean r0 = r1.X5()
            r3 = 1
            r5 = 0
            if (r0 != 0) goto L6a
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder) r0
            X.0Ien r1 = r0.LLIZLLLIL
            X.0Ien r0 = X.EnumC471790Ien.NEARBY
            if (r1 != r0) goto Lb0
        L6a:
            java.lang.Object r0 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder r0 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LLJ
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdkapi.depend.model.live.NearbyInfo r0 = r0.nearbyInfo
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.label
        L78:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb0
            r0 = 1
        L7f:
            r4.LJIIL = r0
            java.lang.Object r2 = r6.l1
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder r2 = (com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomSingleViewHolder) r2
            com.bytedance.android.livesdk.model.FeedItem r0 = r2.LLJI
            if (r0 == 0) goto L90
            int r1 = r0.type
            r0 = 20
            if (r1 != r0) goto L90
            r5 = 1
        L90:
            r4.LJIILIIL = r5
            X.0Ifs r0 = r2.LLIZ
            boolean r0 = r0 instanceof X.C472490Ifv
            if (r0 == 0) goto La7
            X.0Ien r1 = r2.LLIZLLLIL
            X.0Ien r0 = X.EnumC471790Ien.NEARBY
            if (r1 != r0) goto Lab
            java.lang.String r0 = "nearby_tab_toplive_live_cover"
        La0:
            r4.LIZLLL = r0
            r4.LJIILLIIL = r3
            com.bytedance.android.livesdk.feed.adapter.viewholder.LiveRoomViewHolder.W5(r4)
        La7:
            X.C0IVV.LIZIZ(r4)
            return
        Lab:
            java.lang.String r0 = "toplive_live_cover"
            goto La0
        Lae:
            r0 = 0
            goto L78
        Lb0:
            r0 = 0
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS4S1301000_7.onClick$3(Y.ACListenerS4S1301000_7, android.view.View):void");
    }

    public ACListenerS4S1301000_7(Object obj, int i, Object obj2, Object obj3, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i4 = i;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }
}
