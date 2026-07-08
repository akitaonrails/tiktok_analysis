package X;

import Y.ARunnableS4S0202000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.FastGiftClickChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123280fKw extends FrameLayout implements InterfaceC1123150fKj, InterfaceC1133110fan {
    public static final /* synthetic */ int LLJJI = 0;
    public C472240IfW LL;
    public C1126220fPg LLILLJJLI;
    public final C11NJ LLILLL;
    public DataChannel LLILZ;
    public List<? extends Gift> LLILZIL;
    public int LLILZLL;
    public List<Long> LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;
    public final C178600mO LLJIJIL;
    public final boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C1123280fKw LLJILLL;
    public long LLJJ;

    static {
        new C1106270etV();
    }

    @Override // X.InterfaceC1123150fKj
    public final void LIZ(Gift gift, ImageModel imageModel, ImageModel imageModel2) {
    }

    @Override // X.InterfaceC1123150fKj
    public final void LIZIZ() {
        this.LLILZ = null;
    }

    @Override // X.InterfaceC1123150fKj
    public final void LJ() {
    }

    @Override // X.InterfaceC1123150fKj
    public void setBottomColorStyle(EnumC1102980eoC enumC1102980eoC) {
    }

    @Override // X.InterfaceC1123150fKj
    public void setImageDrawable(int i) {
    }

    private final int getIconSizePx() {
        DataChannel dataChannel = this.LLILZ;
        return (int) C497740JfY.LIZIZ((dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) ? 26.0f : 24.0f);
    }

    public final void LJII() {
        C1126220fPg c1126220fPg = this.LLILLJJLI;
        if (c1126220fPg != null) {
            C500260Jjc.LJIILIIL(c1126220fPg);
        }
        C1126220fPg c1126220fPg2 = this.LLILLJJLI;
        if (c1126220fPg2 != null) {
            c1126220fPg2.LJFF();
        }
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.zW(FastGiftClickChannel.class, Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123280fKw.LJIIJ():void");
    }

    @Override // X.InterfaceC1123150fKj
    public final ViewGroup LJFF() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public final void LJI() {
        GiftManager.inst().registerGiftListListener(this);
        this.LLILLL.LIZ(((C0J1N) C784440Upu.LIZ().LJ(C473130Igx.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZJ(this))).LIZJ(new AfS186S0100000_17(this, 93)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        GiftManager.inst().unRegisterGiftListListener(this);
        C472240IfW c472240IfW = this.LL;
        if (c472240IfW != null) {
            c472240IfW.LLLFZ(C13BV.INSTANCE);
        }
        this.LLILZLL = 0;
        this.LLIZ = C13BV.INSTANCE;
        this.LLILLL.LJ();
        this.LLJILJILJ = false;
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC1123150fKj
    public View getCurrentView() {
        return this.LLJILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.00mO] */
    public C1123280fKw(Context context) {
        super(context);
        RecyclerView recyclerView = new RecyclerView(getContext());
        C786410Ut5.p6(recyclerView, new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        this.LLILLL = new C11NJ();
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILZIL = c13bv;
        this.LLIZ = c13bv;
        this.LLJI = 5;
        this.LLJIJIL = new Object() { // from class: X.00mO
        };
        this.LLJILJIL = C500260Jjc.LJJIJIIJIL(InterfaceC1094160eZy.E1.LIZIZ());
        this.LLJILLL = this;
        C472240IfW c472240IfW = new C472240IfW(new AwS631S0100000_17(this, 31));
        this.LL = c472240IfW;
        recyclerView.setAdapter(c472240IfW);
        addView(recyclerView, -1, -1);
        setPadding((int) C497740JfY.LIZIZ(6.0f), 0, (int) C497740JfY.LIZIZ(6.0f), 0);
        C1106270etV.LIZ(this, null, null);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // X.InterfaceC1123150fKj
    public final void LIZJ(DataChannel dataChannel, boolean z) {
        this.LLILZ = dataChannel;
        if (dataChannel == null) {
            return;
        }
        EnumC1102740eno.FAST_GIFT.hide(dataChannel);
        C1102950eo9.LIZIZ(dataChannel);
        LJII();
        LJI();
        setClipChildren(false);
        LJIIIIZZ(null, -1);
    }

    @Override // X.InterfaceC1133110fan
    public final void LIZLLL(GiftListResult giftListResult, int i) {
        if (i == 2 && giftListResult != null && C500260Jjc.LJJLIIIIJ(this.LLILZ) != null) {
            LJIIIIZZ(giftListResult, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0206, code lost:
    
        r11 = X.C13BV.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0208, code lost:
    
        r9 = new java.util.ArrayList(X.C15438062q.LJIJJ(r11, 10));
        r7 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0219, code lost:
    
        if (r7.hasNext() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021b, code lost:
    
        r9.add(java.lang.Long.valueOf(((com.bytedance.android.livesdk.model.Gift) r7.next()).id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x022b, code lost:
    
        r9 = X.C13LP.LLIIJI(r9);
        r0 = r2.gifts;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0231, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0233, code lost:
    
        r0 = X.C13LP.LJJJJLI(r0);
        r12 = new java.util.ArrayList();
        r7 = ((java.util.ArrayList) r0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0246, code lost:
    
        if (r7.hasNext() == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0248, code lost:
    
        r1 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0256, code lost:
    
        if (((java.lang.Boolean) r8.invoke(r1)).booleanValue() != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0258, code lost:
    
        r12.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025c, code lost:
    
        r10 = new java.util.ArrayList();
        r12 = r12.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0269, code lost:
    
        if (r12.hasNext() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x026b, code lost:
    
        r7 = r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027e, code lost:
    
        if ((!r9.contains(java.lang.Long.valueOf(((com.bytedance.android.livesdk.model.Gift) r7).id))) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0280, code lost:
    
        r10.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0284, code lost:
    
        r10 = X.C13BV.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0286, code lost:
    
        r9 = new java.util.ArrayList(r11.size() + r10.size());
        r7 = new java.util.HashSet(r11.size() + r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a6, code lost:
    
        if (r15 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a8, code lost:
    
        r13 = new X.C08QT(X.C09RB.LJIIJJI(X.C09RB.LJIILIIL(X.C13LQ.LJIIJJI(new java.util.List[]{r2.favouriteGifts, r2.frequentlyUsedGifts, r2.gifts}), kotlin.jvm.internal.AFwS254S0000000_17.get$arr$(110))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02d5, code lost:
    
        if (r13.hasNext() == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02d7, code lost:
    
        r2 = r13.next();
        r14 = (com.bytedance.android.livesdk.model.Gift) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02e2, code lost:
    
        if (r14.id != r15) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ee, code lost:
    
        if (((java.lang.Boolean) r8.invoke(r14)).booleanValue() != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02f0, code lost:
    
        if (r2 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02fa, code lost:
    
        if (r7.add(java.lang.Long.valueOf(r15)) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02fc, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ff, code lost:
    
        r8 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0307, code lost:
    
        if (r8.hasNext() == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0309, code lost:
    
        r2 = (com.bytedance.android.livesdk.model.Gift) r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0319, code lost:
    
        if (r7.add(java.lang.Long.valueOf(r2.id)) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x031b, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x031f, code lost:
    
        r8 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0327, code lost:
    
        if (r8.hasNext() == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0329, code lost:
    
        r2 = (com.bytedance.android.livesdk.model.Gift) r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0339, code lost:
    
        if (r7.add(java.lang.Long.valueOf(r2.id)) == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x033b, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x033f, code lost:
    
        r9 = X.C13BV.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0342, code lost:
    
        r9 = X.C13BV.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0344, code lost:
    
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0350, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(X.InterfaceC1093910eZZ.LLLLLLZZ.LIZ(), java.lang.Boolean.TRUE) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0352, code lost:
    
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0358, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.fansclub.LiveReverseFanClubSetting.INSTANCE.getValue() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x035a, code lost:
    
        r11 = new java.util.ArrayList();
        r10 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0367, code lost:
    
        if (r10.hasNext() == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0369, code lost:
    
        r9 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0376, code lost:
    
        if (((com.bytedance.android.livesdk.model.Gift) r9).id == 5655) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0378, code lost:
    
        r11.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x037c, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0383, code lost:
    
        if ((!r9.isEmpty()) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0385, code lost:
    
        r12 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst();
        r0 = r4.getId();
        r7 = X.C13LP.LL(r9, 10);
        r11 = new java.util.ArrayList(X.C15438062q.LJIJJ(r7, 10));
        r10 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03a2, code lost:
    
        if (r10.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03a4, code lost:
    
        r11.add(java.lang.Long.valueOf(((com.bytedance.android.livesdk.model.Gift) r10.next()).id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03b4, code lost:
    
        r12.saveFastGifts(r0, r11);
        r7 = new java.lang.StringBuilder("roomId = ");
        r7.append(r4.getId());
        r7.append(", saved giftId = ");
        r1 = X.C13LP.LL(r9, 10);
        r4 = new java.util.ArrayList(X.C15438062q.LJIJJ(r1, 10));
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03df, code lost:
    
        if (r2.hasNext() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03e1, code lost:
    
        r4.add(java.lang.Long.valueOf(((com.bytedance.android.livesdk.model.Gift) r2.next()).id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03f1, code lost:
    
        r7.append(r4);
        X.C20441214yg.LIZIZ("LiveGiftMultiFastGiftsView", r7.toString());
        r18.LLILZIL = X.C13LP.LL(r9, 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0401, code lost:
    
        r1 = getVisibility();
        setVisibility(0);
        X.C1602160rnK.LIZIZ(r1, 0, r18);
        LJIIJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x040f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (X.C13LP.LJJJLL(r0) != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        r7 = r18.LLJIJIL;
        r9 = r18.LLILZ;
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r8 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r0 = r8.giftPages;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r11 = new java.util.ArrayList();
        r2 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        if (r2.hasNext() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r1.pageType != 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        r11.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        r11 = X.C13BV.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r9 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r9.gg0(com.bytedance.android.livesdk.dataChannel.RoomChannel.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        if (r1 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:
    
        com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst().getFilterManager().LIZ(r1.getId(), r11, X.C1125800fP0.LIZLLL());
        r1 = X.C1124270fMX.LIZIZ(r11, X.C1125800fP0.LIZIZ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (X.C500260Jjc.LJJIJIIJI(r1) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
    
        r2 = (com.bytedance.android.livesdk.gift.model.GiftPage) X.C13LP.LJJJJZI(r1);
        r15 = kotlin.jvm.internal.Intrinsics.LJFF(r9.gg0(X.C0TZM.class), java.lang.Boolean.TRUE);
        r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r9.gg0(com.bytedance.android.livesdk.dataChannel.RoomChannel.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0108, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        r9 = r0.getOwner();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
    
        if (X.C1125800fP0.LIZLLL().isEmpty() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        if (r9 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011a, code lost:
    
        java.util.Collections.singletonList(new X.C1125380fOK(r9, X.EnumC1125400fOM.ANCHOR));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        if (r8 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0127, code lost:
    
        r0 = r8.giftsInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012b, code lost:
    
        r0 = r0.freqLimitGiftInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        r1 = r0.freqLimitGiftOptions;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        if (r1 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:
    
        r10 = new java.util.ArrayList(X.C15438062q.LJIJJ(r1, 10));
        r9 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
    
        if (r9.hasNext() == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0146, code lost:
    
        r10.add(java.lang.Long.valueOf(r9.next().giftId));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        r12 = X.C13LP.LLIIJI(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015c, code lost:
    
        if (r12 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
    
        r12 = X.C08CX.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
    
        X.InterfaceC1133710fbl.LIZ.getClass();
        r13 = ((X.C1133940fc8) X.C1120710fGn.LIZ()).LJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016f, code lost:
    
        if (r8 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0171, code lost:
    
        r0 = r8.giftsInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0173, code lost:
    
        if (r0 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0175, code lost:
    
        r11 = r0.pointsGiftInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0177, code lost:
    
        r9 = X.C158B.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017b, code lost:
    
        if (r11 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0181, code lost:
    
        if (r9 < r11.validStartAt) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0187, code lost:
    
        if (r9 > r11.validEndAt) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0189, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018b, code lost:
    
        r8 = new X.C178400mM(r12, r13, r15, r7, r17);
        X.C1130100fVw.LIZ.getClass();
        r15 = X.C1128970fU7.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        if (X.C500260Jjc.LJJIJIIJI(r2.favouriteGifts) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a4, code lost:
    
        r0 = r2.favouriteGifts;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a6, code lost:
    
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a8, code lost:
    
        r0 = X.C13LP.LJJJJLI(r0);
        r11 = new java.util.ArrayList();
        r7 = ((java.util.ArrayList) r0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bb, code lost:
    
        if (r7.hasNext() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bd, code lost:
    
        r1 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cb, code lost:
    
        if (((java.lang.Boolean) r8.invoke(r1)).booleanValue() != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cd, code lost:
    
        r11.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d4, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d6, code lost:
    
        r0 = r2.frequentlyUsedGifts;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d8, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01da, code lost:
    
        r0 = X.C13LP.LJJJJLI(r0);
        r11 = new java.util.ArrayList();
        r7 = ((java.util.ArrayList) r0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ed, code lost:
    
        if (r7.hasNext() == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ef, code lost:
    
        r1 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fd, code lost:
    
        if (((java.lang.Boolean) r8.invoke(r1)).booleanValue() != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ff, code lost:
    
        r11.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0203, code lost:
    
        r11 = X.C13BV.INSTANCE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v10, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.00m9] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.00mM] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.bytedance.android.livesdk.gift.model.GiftListResult r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1123280fKw.LJIIIIZZ(com.bytedance.android.livesdk.gift.model.GiftListResult, int):void");
    }

    public final void LJIIIZ(int i, int i2, int[] iArr) {
        View view;
        int measuredWidth;
        float fFloatValue;
        if (this.LLILLJJLI == null && getContext() != null && this.LLILLJJLI == null) {
            addView(C0J3Y.LJFF(C0J3Y.LIZ, R.layout.hyd, null, false, getContext(), false, 52));
            C1126220fPg c1126220fPg = (C1126220fPg) findViewById(R.id.hp5);
            c1126220fPg.setAnimationType(EnumC1123370fL5.FAST);
            C500260Jjc.LJIILIIL(c1126220fPg);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126220fPg);
            c1126220fPg.setScaleX(0.55f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126220fPg);
            c1126220fPg.setScaleY(0.55f);
            this.LLILLJJLI = c1126220fPg;
        }
        C1126220fPg c1126220fPg2 = this.LLILLJJLI;
        if (c1126220fPg2 == null) {
            return;
        }
        Object parent = c1126220fPg2.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            if (view.isLaidOut() && !view.isLayoutRequested() && c1126220fPg2.isLaidOut() && !c1126220fPg2.isLayoutRequested() && view.getWidth() != 0 && view.getHeight() != 0 && c1126220fPg2.getWidth() != 0) {
                view.getLocationOnScreen(new int[2]);
                float f = iArr[0] + (i / 2.0f);
                if (c1126220fPg2.getWidth() > 0) {
                    measuredWidth = c1126220fPg2.getWidth();
                } else {
                    measuredWidth = c1126220fPg2.getMeasuredWidth();
                }
                if (measuredWidth <= 0) {
                    if (this.LLIZLLLIL >= this.LLJI) {
                        return;
                    }
                    int[] iArr2 = {iArr[0], iArr[1]};
                    if (!this.LLJ) {
                        this.LLJ = true;
                        HandlerHook.viewPost(c1126220fPg2, new ARunnableS4S0202000_17(this, iArr2, i, i2, 1));
                        return;
                    }
                    return;
                }
                Float fValueOf = Float.valueOf(c1126220fPg2.getScaleX());
                if (fValueOf.floatValue() > 0.0f) {
                    fFloatValue = fValueOf.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                float f2 = measuredWidth;
                float f3 = f - r8[0];
                float f4 = (fFloatValue * f2) / 2.0f;
                float width = view.getWidth() - f4;
                if (width < f4) {
                    width = f4;
                }
                float fLIZIZ = C814420VxA.LIZIZ(C13LZ.LIZLLL(f3, f4, width) - (f2 / 2.0f));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126220fPg2);
                c1126220fPg2.setX(fLIZIZ);
                this.LLIZLLLIL = 0;
                return;
            }
            if (this.LLIZLLLIL >= this.LLJI) {
                return;
            }
            int[] iArr3 = {iArr[0], iArr[1]};
            if (!this.LLJ) {
                this.LLJ = true;
                HandlerHook.viewPost(c1126220fPg2, new ARunnableS4S0202000_17(this, iArr3, i, i2, 0));
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            C1106270etV.LIZ(this, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
