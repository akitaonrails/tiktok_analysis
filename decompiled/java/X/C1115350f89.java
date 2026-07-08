package X;

import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.dataChannel.GameGuessEmoteUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.model.GameEmoteConfig;
import com.bytedance.android.livesdk.game.model.GameEmotesTab;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0f89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115350f89 extends ConstraintLayout implements InterfaceC1115480f8M<EmoteModel>, InterfaceC1115630f8b, InterfaceC1115640f8c {
    public RecyclerView LL;
    public RecyclerView LLILLJJLI;
    public RelativeLayout LLILLL;
    public C16F5 LLILZ;
    public final C1117360fBO LLILZIL;
    public final C1117360fBO LLILZLL;
    public final C1115570f8V LLIZ;
    public InterfaceC1114330f6V LLIZLLLIL;
    public InterfaceC1115330f87 LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public final C01GW LLJILJIL;
    public DataChannel LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public final ArrayList<EmoteModel> LLJJI;
    public final ArrayList<EmoteModel> LLJJIII;

    private final EmotePerformanceTrackerViewModel getEmotePerformanceTracker() {
        return (EmotePerformanceTrackerViewModel) this.LLJILJIL.getValue();
    }

    public final void e0() {
        Room room;
        GameEmoteConfig gameEmoteConfig;
        C16F5 c16f5;
        EmoteListResult emoteListResult;
        List<EmoteModel> emoteList;
        DataChannel dataChannel = this.LLJILJILJ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            GameEmotesTab gameEmotesTab = room.gameEmotesTab;
            if (gameEmotesTab != null && (emoteListResult = gameEmotesTab.usableGuessingEmotes) != null && (emoteList = emoteListResult.getEmoteList()) != null) {
                this.LLJJI.clear();
                this.LLJJI.addAll(emoteList);
            }
            RelativeLayout relativeLayout = this.LLILLL;
            if (relativeLayout != null) {
                C786410Ut5.LLIIL(relativeLayout, 0);
            }
            GameEmotesTab gameEmotesTab2 = room.gameEmotesTab;
            if (gameEmotesTab2 != null && (gameEmoteConfig = gameEmotesTab2.gameEmoteConfig) != null && (c16f5 = this.LLILZ) != null) {
                c16f5.setText(C297401Dg.LIZ(gameEmoteConfig.emotesCanNotBeUsedHint));
            }
        }
        if (!this.LLJJI.isEmpty()) {
            RecyclerView recyclerView = this.LL;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 0);
            }
            C1117360fBO c1117360fBO = this.LLILZIL;
            c1117360fBO.LL = this.LLJJI;
            c1117360fBO.notifyDataSetChanged();
        }
        if (!this.LLJJIII.isEmpty()) {
            RecyclerView recyclerView2 = this.LLILLJJLI;
            if (recyclerView2 != null) {
                C786410Ut5.LLIZLLLIL(recyclerView2, 0);
            }
            C1117360fBO c1117360fBO2 = this.LLILZLL;
            c1117360fBO2.LL = this.LLJJIII;
            c1117360fBO2.notifyDataSetChanged();
        }
        InterfaceC1115330f87 interfaceC1115330f87 = this.LLJ;
        if (interfaceC1115330f87 != null) {
            interfaceC1115330f87.LIZIZ(!this.LLJJI.isEmpty());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    public final DataChannel getDataChannel() {
        return this.LLJILJILJ;
    }

    public final int getOneLineCount() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1115480f8M
    public final void LLLLJI(C1115500f8O c1115500f8O) {
        InterfaceC1114330f6V interfaceC1114330f6V;
        EmoteModel emoteModel = (EmoteModel) c1115500f8O;
        if (emoteModel != null && (interfaceC1114330f6V = this.LLIZLLLIL) != null) {
            interfaceC1114330f6V.LIZLLL(emoteModel);
            ArrayList arrayList = new ArrayList();
            String str = emoteModel.emoteId;
            str.toString();
            arrayList.add(str);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_emoji_click");
            c474500IjALIZ.LJIJJLI(this.LLJILJILJ);
            c474500IjALIZ.LJJII("comment_panel", "method");
            c474500IjALIZ.LJJII(arrayList, "emotes_label");
            c474500IjALIZ.LIZ();
        }
    }

    public final void h0(boolean z) {
        int i;
        SystemClock.elapsedRealtime();
        this.LLJI = z;
        if (z) {
            i = 5;
        } else {
            i = 10;
        }
        this.LLJIJIL = i;
        this.LL = (RecyclerView) findViewById(R.id.txm);
        this.LLILLJJLI = (RecyclerView) findViewById(R.id.txl);
        this.LLILLL = (RelativeLayout) findViewById(R.id.to6);
        this.LLILZ = (C16F5) findViewById(R.id.zhz);
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            HandlerHook.viewPost(c16f5, new ARunnableS75S0200000_6(c16f5, this, 115));
        }
        RecyclerView recyclerView = this.LL;
        if (recyclerView != null) {
            recyclerView.setClipToPadding(false);
        }
        RecyclerView recyclerView2 = this.LLILLJJLI;
        if (recyclerView2 != null) {
            recyclerView2.setClipToPadding(false);
        }
        this.LLJJ = (C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(18.0f))) / this.LLJIJIL;
        EmotePerformanceTrackerViewModel emotePerformanceTracker = getEmotePerformanceTracker();
        if (emotePerformanceTracker != null) {
            emotePerformanceTracker.init();
        }
        RecyclerView recyclerView3 = this.LL;
        final boolean z2 = true;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.LLILZIL);
            recyclerView3.setLayoutManager(new SSGridLayoutManager(recyclerView3.getContext(), this.LLJIJIL));
            recyclerView3.setHasFixedSize(true);
            recyclerView3.setItemViewCacheSize(36);
            C1117360fBO c1117360fBO = this.LLILZIL;
            final int i2 = this.LLJJ;
            c1117360fBO.LLLI(EmoteModel.class, new AbstractC1115610f8Z<EmoteModel, C1115590f8X>(i2, this, this, this, z2) { // from class: X.0f8G
                public final int LIZIZ;
                public final InterfaceC1115480f8M<EmoteModel> LIZJ;
                public final InterfaceC1115630f8b LIZLLL;
                public final String LJ = "live_room_game_guess_emote_input_page";
                public final boolean LJFF;

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    C1115590f8X c1115590f8X = new C1115590f8X(C786410Ut5.Td(layoutInflater, R.layout.gt7, viewGroup, false), this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
                    ViewGroup.LayoutParams layoutParams = c1115590f8X.itemView.getLayoutParams();
                    int i3 = this.LIZIZ;
                    layoutParams.height = i3;
                    layoutParams.width = i3;
                    C786410Ut5.W5(c1115590f8X.itemView, layoutParams);
                    return c1115590f8X;
                }

                {
                    this.LIZIZ = i2;
                    this.LIZJ = this;
                    this.LIZLLL = this;
                    this.LJFF = z2;
                }
            });
        }
        RecyclerView recyclerView4 = this.LLILLJJLI;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.LLILZLL);
            recyclerView4.setLayoutManager(new SSGridLayoutManager(recyclerView4.getContext(), this.LLJIJIL));
            recyclerView4.setHasFixedSize(true);
            recyclerView4.setItemViewCacheSize(36);
            C1117360fBO c1117360fBO2 = this.LLILZLL;
            final int i3 = this.LLJJ;
            final boolean z3 = false;
            c1117360fBO2.LLLI(EmoteModel.class, new AbstractC1115610f8Z<EmoteModel, C1115590f8X>(i3, this, this, this, z3) { // from class: X.0f8G
                public final int LIZIZ;
                public final InterfaceC1115480f8M<EmoteModel> LIZJ;
                public final InterfaceC1115630f8b LIZLLL;
                public final String LJ = "live_room_game_guess_emote_input_page";
                public final boolean LJFF;

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    C1115590f8X c1115590f8X = new C1115590f8X(C786410Ut5.Td(layoutInflater, R.layout.gt7, viewGroup, false), this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
                    ViewGroup.LayoutParams layoutParams = c1115590f8X.itemView.getLayoutParams();
                    int i32 = this.LIZIZ;
                    layoutParams.height = i32;
                    layoutParams.width = i32;
                    C786410Ut5.W5(c1115590f8X.itemView, layoutParams);
                    return c1115590f8X;
                }

                {
                    this.LIZIZ = i3;
                    this.LIZJ = this;
                    this.LIZLLL = this;
                    this.LJFF = z3;
                }
            });
        }
        DataChannelGlobal.LLILZ.CQ2(GameGuessEmoteUpdateChannel.class, this, new AwS596S0100000_17(this, 587));
        e0();
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJILJILJ = dataChannel;
    }

    public final void setEmoteSelectPanelCallback(InterfaceC1115330f87 interfaceC1115330f87) {
        this.LLJ = interfaceC1115330f87;
    }

    public final void setOnEmojiSelectListener(InterfaceC1114330f6V interfaceC1114330f6V) {
        this.LLIZLLLIL = interfaceC1114330f6V;
    }

    public C1115350f89(Context context, DataChannel dataChannel) {
        super(context);
        this.LLILZIL = new C1117360fBO();
        this.LLILZLL = new C1117360fBO();
        this.LLIZ = new C1115570f8V();
        this.LLJIJIL = 5;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 564));
        this.LLJJ = (int) C497740JfY.LIZIZ(58.0f);
        this.LLJJI = new ArrayList<>();
        this.LLJJIII = new ArrayList<>();
        this.LLJILJILJ = dataChannel;
        C786410Ut5.Sd(R.layout.hrr, C786410Ut5.ne(context), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // X.InterfaceC1115630f8b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLJILJILJ(android.view.View r15, android.view.MotionEvent r16, int r17, com.bytedance.android.live.base.model.emoji.EmoteModel r18) {
        /*
            r14 = this;
            X.0f8V r9 = r14.LLIZ
            boolean r0 = r14.LLJI
            r9.getClass()
            if (r0 == 0) goto L9c
            r0 = 5
        La:
            r9.LJIIJ = r0
            int r5 = r16.getAction()
            r6 = 0
            r7 = 0
            r0 = 0
            r2 = 500(0x1f4, double:2.47E-321)
            r8 = 1
            r12 = r18
            r10 = r17
            r11 = r15
            if (r5 == 0) goto L6e
            if (r5 == r8) goto L34
            r4 = 2
            if (r5 == r4) goto L2e
            r4 = 3
            if (r5 == r4) goto L34
        L26:
            long r4 = r9.LIZIZ
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L2d
            r6 = 1
        L2d:
            return r6
        L2e:
            float r0 = r9.LJIIIIZZ
            r9.LIZ(r0, r11, r10, r12)
            goto L26
        L34:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r4 = r9.LJII
            r4.removeCallbacksAndMessages(r7)
            X.0f8a r4 = r9.LJIIIZ
            if (r4 == 0) goto L48
            boolean r4 = r4.isShowing()
            if (r4 == 0) goto L48
            X.0f8a r4 = r9.LJIIIZ
            r4.dismiss()
        L48:
            int r4 = r9.LJFF
            if (r4 < 0) goto L5d
            r4 = 2131377632(0x7f0a3de0, float:1.8375474E38)
            android.view.View r5 = r11.findViewById(r4)
            if (r5 == 0) goto L5d
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r4.<init>(r6)
            r5.setBackground(r4)
        L5d:
            r4 = -1
            r9.LJFF = r4
            r9.LIZLLL = r8
            r9.LJ = r0
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r9.LIZJ
            long r4 = r4 - r0
            r9.LIZIZ = r4
            goto L26
        L6e:
            long r4 = java.lang.System.currentTimeMillis()
            r9.LIZJ = r4
            r9.LIZIZ = r0
            long r0 = java.lang.System.currentTimeMillis()
            r9.LJ = r0
            float r0 = r16.getX()
            r9.LIZ = r0
            float r0 = r16.getX()
            r9.LJIIIIZZ = r0
            r16.getY()
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r9.LJII
            r0.removeCallbacksAndMessages(r7)
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r9.LJII
            Y.ARunnableS11S0301000_17 r8 = new Y.ARunnableS11S0301000_17
            r13 = 1
            r8.<init>(r9, r10, r11, r12, r13)
            X.C786410Ut5.LJLIIL(r2, r0, r8)
            goto L26
        L9c:
            r0 = 10
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1115350f89.LLJILJILJ(android.view.View, android.view.MotionEvent, int, com.bytedance.android.live.base.model.emoji.EmoteModel):boolean");
    }
}
