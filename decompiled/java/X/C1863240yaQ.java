package X;

import Y.AComparatorS23S0000000_4;
import Y.ARunnableS119S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.skydoves.balloon.Balloon;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.multiconversation.TakoSubConversationDrawerView$conversatioinLayoutManager$1;
import com.ss.android.ugc.aweme.tako.multiconversation.TakoSubModeConversationGroupItemCell;
import com.ss.android.ugc.aweme.tako.multiconversation.TakoSubModeConversationItemCell;
import com.ss.android.ugc.aweme.tako.multiconversation.TakoSubModeConversationLoadingItemCell;
import com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import irm.AkS64S0200000_27;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS10S0220000_27;
import kotlin.jvm.internal.AwS25S0600000_27;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.AwS682S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863240yaQ extends LinearLayout {
    public View LL;
    public View LLILLJJLI;
    public ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public View LLILZ;
    public C1390410mHn LLILZIL;
    public View LLILZLL;
    public TuxSkeletonLayout LLIZ;
    public boolean LLIZLLLIL;
    public final C054G LLJ;
    public C444801oE LLJI;
    public C444801oE LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public long LLJJIJI;
    public final List<ConversationInfo> LLJJIJIIJIL;
    public final List<InterfaceC1891350zJl> LLJJIJIL;
    public String LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public TakoOnboardingViewModel LLJJJJJIL;
    public final TakoSubConversationDrawerView$conversatioinLayoutManager$1 LLJJJJLIIL;
    public final Map<EnumC429110Gs9, Boolean> LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    public final void LIZLLL() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLJILJIL = false;
        if (!C19719612Di.LJJIIJ(this.LLJJIJIL, AFwS278S0000000_32.get$arr$(98), true) || (viewOnAttachStateChangeListenerC20604515jv = this.LLILLL) == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return;
        }
        state.LJIILL(this.LLJJIJIL, null);
    }

    public final void LIZJ() {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (ConversationInfo conversationInfo : (ArrayList) this.LLJJIJIIJIL) {
            if (C1387310mCn.LJII(conversationInfo.latestMessageTime)) {
                if (!z) {
                    String string = getContext().getString(2131822484);
                    EnumC429110Gs9 enumC429110Gs9 = EnumC429110Gs9.TODAY;
                    Boolean bool = (Boolean) ((LinkedHashMap) this.LLJJL).get(enumC429110Gs9);
                    arrayList.add(new C1863460yam(string, enumC429110Gs9, bool != null ? bool.booleanValue() : true, new AwS646S0100000_32(this, 14)));
                    z = true;
                }
                Map<EnumC429110Gs9, Boolean> map = this.LLJJL;
                EnumC429110Gs9 enumC429110Gs92 = EnumC429110Gs9.TODAY;
                if (Intrinsics.LJFF(((LinkedHashMap) map).get(enumC429110Gs92), Boolean.TRUE)) {
                    arrayList.add(new C1863370yad(conversationInfo, enumC429110Gs92, Intrinsics.LJFF(conversationInfo.subConversationId, this.LLJJJ), new AwS612S0100000_33(this, 96), new AwS647S0100000_33(this, 29), new AwS682S0100000_33(this, 6)));
                }
            } else if (C1387310mCn.LJI(conversationInfo.latestMessageTime)) {
                if (!z3) {
                    String string2 = getContext().getString(2131822483);
                    EnumC429110Gs9 enumC429110Gs93 = EnumC429110Gs9.THIS_WEEK;
                    Boolean bool2 = (Boolean) ((LinkedHashMap) this.LLJJL).get(enumC429110Gs93);
                    arrayList.add(new C1863460yam(string2, enumC429110Gs93, bool2 != null ? bool2.booleanValue() : true, new AwS646S0100000_32(this, 15)));
                    z3 = true;
                }
                Map<EnumC429110Gs9, Boolean> map2 = this.LLJJL;
                EnumC429110Gs9 enumC429110Gs94 = EnumC429110Gs9.THIS_WEEK;
                if (Intrinsics.LJFF(((LinkedHashMap) map2).get(enumC429110Gs94), Boolean.TRUE)) {
                    arrayList.add(new C1863370yad(conversationInfo, enumC429110Gs94, Intrinsics.LJFF(conversationInfo.subConversationId, this.LLJJJ), new AwS612S0100000_33(this, 97), new AwS647S0100000_33(this, 30), new AwS682S0100000_33(this, 7)));
                }
            } else {
                if (!z2) {
                    String string3 = getContext().getString(2131822479);
                    EnumC429110Gs9 enumC429110Gs95 = EnumC429110Gs9.HISTORY;
                    Boolean bool3 = (Boolean) ((LinkedHashMap) this.LLJJL).get(enumC429110Gs95);
                    arrayList.add(new C1863460yam(string3, enumC429110Gs95, bool3 != null ? bool3.booleanValue() : true, new AwS646S0100000_32(this, 16)));
                    z2 = true;
                }
                Map<EnumC429110Gs9, Boolean> map3 = this.LLJJL;
                EnumC429110Gs9 enumC429110Gs96 = EnumC429110Gs9.HISTORY;
                if (Intrinsics.LJFF(((LinkedHashMap) map3).get(enumC429110Gs96), Boolean.TRUE)) {
                    arrayList.add(new C1863370yad(conversationInfo, enumC429110Gs96, Intrinsics.LJFF(conversationInfo.subConversationId, this.LLJJJ), new AwS612S0100000_33(this, 95), new AwS647S0100000_33(this, 28), new AwS682S0100000_33(this, 5)));
                }
            }
        }
        ((ArrayList) this.LLJJIJIL).clear();
        ((ArrayList) this.LLJJIJIL).addAll(arrayList);
    }

    public final void LJ() {
        TuxSkeletonLayout tuxSkeletonLayout = this.LLIZ;
        if (tuxSkeletonLayout != null) {
            C0T3V.LIZ(tuxSkeletonLayout, null, false, new AwS571S0100000_27(this, 828), 26);
        }
    }

    public final void LJIIIZ() {
        if (this.LLJJJJ) {
            return;
        }
        try {
            Context context = getContext();
            C1863130yaF.LIZ.getClass();
            LinearLayout.inflate(context, C1863130yaF.LIZ() ? R.layout.fp3 : R.layout.fp2, this);
            LJI();
            LJII();
            LJIIIIZZ();
            LJFF();
            this.LLJJJJ = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLJJJJ = false;
        }
    }

    public final void LJIILL() {
        C20600815jK<InterfaceC1891350zJl> state;
        C444801oE c444801oE = this.LLJIJIL;
        if (c444801oE != null) {
            c444801oE.LIZ();
        }
        LIZLLL();
        ((ArrayList) this.LLJJIJIIJIL).clear();
        ((ArrayList) this.LLJJIJIL).clear();
        this.LLJJJIL = 0;
        this.LLJJ = false;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(C13BV.INSTANCE, null);
        }
        LIZ(!LJIILLIIL());
    }

    public final void LJIIZILJ() {
        C20600815jK<InterfaceC1891350zJl> state;
        if (this.LLJILJIL) {
            List<InterfaceC1891350zJl> list = this.LLJJIJIL;
            if ((list instanceof Collection) && list.isEmpty()) {
                ((ArrayList) this.LLJJIJIL).add(new InterfaceC1891350zJl() { // from class: X.17oV
                    @Override // X.InterfaceC1891350zJl
                    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return null;
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return interfaceC1891350zJl instanceof C21142517oV;
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return interfaceC1891350zJl instanceof C21142517oV;
                    }
                });
            } else {
                Iterator<InterfaceC1891350zJl> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof C21142517oV) {
                        break;
                    }
                }
                ((ArrayList) this.LLJJIJIL).add(new InterfaceC1891350zJl() { // from class: X.17oV
                    @Override // X.InterfaceC1891350zJl
                    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return null;
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return interfaceC1891350zJl instanceof C21142517oV;
                    }

                    @Override // X.InterfaceC1891350zJl
                    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                        return interfaceC1891350zJl instanceof C21142517oV;
                    }
                });
            }
        }
        if (((ArrayList) this.LLJJIJIL).isEmpty()) {
            View view = this.LLILZ;
            if (view != null) {
                C0DSB.LIZJ(view);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                C0DSB.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
                return;
            }
            return;
        }
        LJ();
        View view2 = this.LLILZ;
        if (view2 != null) {
            C0DSB.LIZIZ(view2);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            C0DSB.LIZJ(viewOnAttachStateChangeListenerC20604515jv2);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv3 == null || (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) == null) {
            return;
        }
        state.LJIILL(this.LLJJIJIL, null);
    }

    public final void LJIJ() {
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 827);
        if (isAttachedToWindow()) {
            awS571S0100000_27.invoke();
        } else {
            HandlerHook.viewPost(this, new ARunnableS119S0100000_19((Object) awS571S0100000_27, 93));
        }
    }

    public final void LJIJJ() {
        C444801oE c444801oE = this.LLJI;
        if (c444801oE == null) {
            c444801oE = new C444801oE(this.LLJ);
            this.LLJI = c444801oE;
        }
        long j = C1863680yb8.LIZ().convList.timeoutMs;
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        c444801oE.LIZIZ(j, new AwS572S0100000_28(activityLIZ, 6), new AwS572S0100000_28(this, 7), new AwS579S0100000_35(this, 163));
    }

    public final AbstractC329610Cw3<Boolean> getConversationConfig() {
        return (AbstractC329610Cw3) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public static boolean LJIIJ() {
        ITakoNetworkGate iTakoNetworkGate;
        return C1863680yb8.LIZIZ() && (iTakoNetworkGate = (ITakoNetworkGate) C21140317o9.LIZ.getValue()) != null && iTakoNetworkGate.isOffline();
    }

    public static boolean LJIILLIIL() {
        return C1861560yXi.LIZ(C1863680yb8.LIZIZ());
    }

    public final void LJFF() {
        this.LLILZ = findViewById(R.id.x61);
        this.LLILZIL = (C1390410mHn) findViewById(R.id.x62);
        this.LLILZLL = findViewById(R.id.x65);
        this.LLIZ = (TuxSkeletonLayout) findViewById(R.id.x63);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.x60);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(this.LLJJJJLIIL);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoSubModeConversationItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoSubModeConversationGroupItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoSubModeConversationLoadingItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setTag(R.id.rnd, C1558360qeg.LJ(viewOnAttachStateChangeListenerC20604515jv, null));
        C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
        if (state != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        viewOnAttachStateChangeListenerC20604515jv.setVerticalFadingEdgeEnabled(true);
        viewOnAttachStateChangeListenerC20604515jv.setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
        viewOnAttachStateChangeListenerC20604515jv.LJIIL(getConversationConfig());
        final C422080Ggo c422080Ggo = new C422080Ggo(viewOnAttachStateChangeListenerC20604515jv.getContext(), this.LLJJL, new AwS606S0100000_27(this, 255), new AwS606S0100000_27(this, 256), new AwS646S0100000_32(this, 17));
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(c422080Ggo);
        final GestureDetector gestureDetector = new GestureDetector(viewOnAttachStateChangeListenerC20604515jv.getContext(), new C21648719nx() { // from class: X.0Ggp
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                EnumC429110Gs9 enumC429110Gs9;
                float y = motionEvent.getY();
                C422080Ggo c422080Ggo2 = c422080Ggo;
                if (y <= c422080Ggo2.LLIZLLLIL && (enumC429110Gs9 = c422080Ggo2.LLIZ) != null) {
                    Boolean bool = c422080Ggo2.LLILLJJLI.get(enumC429110Gs9);
                    Function2<EnumC429110Gs9, Boolean, Unit> function2 = c422080Ggo2.LLILZIL;
                    if (function2 != null) {
                        function2.invoke(enumC429110Gs9, Boolean.valueOf(Intrinsics.LJFF(bool, Boolean.FALSE)));
                        return true;
                    }
                    return true;
                }
                return false;
            }
        });
        viewOnAttachStateChangeListenerC20604515jv.addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.0c5z
            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        this.LLILLL = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void LJI() {
        ImageView imageView = (ImageView) findViewById(R.id.x68);
        if (imageView != null) {
            C1863130yaF.LIZ.getClass();
            if (C1863130yaF.LIZ()) {
                C0DSB.LIZJ(imageView);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = iLIZIZ;
                layoutParams.height = iLIZIZ;
                C786410Ut5.W5(imageView, layoutParams);
                C1857690yRT.LJII(imageView, iLIZIZ, iLIZIZ, false);
            } else {
                C0DSB.LIZIZ(imageView);
            }
        }
        TextView textView = (TextView) findViewById(R.id.x69);
        if (textView != null) {
            textView.setText(C1852920yJm.LIZ.botName);
        }
    }

    public final void LJII() {
        View viewFindViewById = findViewById(R.id.x6a);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        C786410Ut5.I7(new AkS64S0200000_27(viewFindViewById, this, 6), viewFindViewById);
        this.LL = viewFindViewById;
    }

    public final void LJIIIIZZ() {
        View viewFindViewById = findViewById(R.id.x6b);
        C1863130yaF.LIZ.getClass();
        if (!C1863130yaF.LIZ()) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        }
        if (C1861570yXj.LIZ()) {
            C0DSB.LIZJ(viewFindViewById);
            C786410Ut5.I7(new AkS64S0200000_27(this, viewFindViewById, 7), viewFindViewById);
        } else {
            C0DSB.LIZIZ(viewFindViewById);
        }
        this.LLILLJJLI = viewFindViewById;
    }

    public final void LJJII() {
        if (C1863680yb8.LIZIZ()) {
            C325080Cok.LIZ.getClass();
            if (C325030Cof.LIZJ) {
                ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoChatPageAbility.class, null);
                if (iTakoChatPageAbility == null || !iTakoChatPageAbility.mt()) {
                    this.LLJJIII = true;
                } else if (!this.LLJJI) {
                    this.LLJJIII = true;
                } else {
                    C325030Cof.LIZJ = false;
                    LJIILL();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJIJJLI(true, true);
        C444801oE c444801oE = this.LLJIJIL;
        if (c444801oE != null) {
            c444801oE.LIZ();
        }
        LIZLLL();
        if (C1863680yb8.LIZIZ()) {
            AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJILLL = null;
            if (this.LLJILJILJ) {
                C325080Cok.LIZ.getClass();
                C325030Cof.LIZIZ = null;
                this.LLJILJILJ = false;
            }
        }
    }

    public final void LIZ(boolean z) {
        boolean z2;
        if (!C1863680yb8.LIZIZ()) {
            LJ();
            C1390410mHn c1390410mHn = this.LLILZIL;
            if (c1390410mHn != null) {
                C0DSB.LIZJ(c1390410mHn);
                c1390410mHn.LIZJ();
            }
            View view = this.LLILZ;
            if (view != null) {
                C0DSB.LIZIZ(view);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                C0DSB.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
            }
            if (z) {
                getConversationConfig().getOperator().refresh();
                return;
            }
            return;
        }
        boolean zLJIILLIIL = LJIILLIIL();
        C444801oE c444801oE = this.LLJI;
        if (c444801oE != null) {
            c444801oE.LIZ();
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C0DSB.LIZIZ(view2);
        }
        boolean z3 = false;
        if (z && !zLJIILLIIL) {
            z2 = true;
            if (C1863680yb8.LIZ().convList.refreshLoading.enable) {
                z3 = true;
            }
        } else {
            z2 = false;
        }
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 826);
        C1863820ybM c1863820ybM = new C1863820ybM(zLJIILLIIL, this, z2);
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.dO1(new C1863270yaT(awS571S0100000_27, this, z3, c1863820ybM));
        } else {
            awS571S0100000_27.invoke();
            c1863820ybM.invoke();
        }
    }

    public final void LIZIZ(Function1<? super C0GWH, Unit> function1) {
        ViewGroup viewGroup;
        TuxSkeletonLayout tuxSkeletonLayout = this.LLIZ;
        if (tuxSkeletonLayout != null && (viewGroup = (ViewGroup) tuxSkeletonLayout.findViewById(R.id.x64)) != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof C0GWH) && childAt != null) {
                    function1.invoke(childAt);
                }
            }
        }
    }

    public final void LJIJI(List<ConversationInfo> list) {
        if (list != null && (!list.isEmpty())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (ConversationInfo conversationInfo : this.LLJJIJIIJIL) {
                String str = conversationInfo.subConversationId;
                if (str != null) {
                    linkedHashMap.put(str, conversationInfo);
                }
            }
            for (ConversationInfo conversationInfo2 : list) {
                String str2 = conversationInfo2.subConversationId;
                if (str2 != null) {
                    linkedHashMap.put(str2, conversationInfo2);
                }
            }
            ArrayList arrayList = new ArrayList(C13LP.LJLLLL(new AComparatorS23S0000000_4(4), linkedHashMap.values()));
            ((ArrayList) this.LLJJIJIIJIL).clear();
            ((ArrayList) this.LLJJIJIIJIL).addAll(arrayList);
        }
    }

    public final void LJJI(ConversationInfo conversationInfo) {
        Map<String, String> commonParams;
        String str = null;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (commonParams = iTakoContextAbility.getCommonParams()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = commonParams.get("enter_from");
            String str3 = commonParams.get("enter_method");
            String str4 = commonParams.get("process_id");
            String str5 = conversationInfo.subConversationId;
            if (str5 == null) {
                str5 = "";
            }
            BaseVideo baseVideo = conversationInfo.relatedVideo;
            if (baseVideo != null) {
                str = baseVideo.vid;
            }
            String str6 = conversationInfo.conversationTitle;
            String strValueOf = String.valueOf(this.LLJJIJI);
            Iterator it2 = ((ArrayList) this.LLJJIJIIJIL).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(((ConversationInfo) it2.next()).subConversationId, conversationInfo.subConversationId)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            String strValueOf2 = String.valueOf(i);
            String str7 = commonParams.get("tako_chat_id");
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            c20235014FoLIZ.LIZ("tikbot_history_conversation_show", C2097608Jq.LJIIJ(new Pair("enter_from", str2), new Pair("enter_method", str3), new Pair("process_id", str4), new Pair("tako_session_id", str5), new Pair("tako_chat_id", str7), new Pair("group_id", str), new Pair("session_topic", str6), new Pair("time", strValueOf), new Pair("rank", strValueOf2)));
        }
    }

    public final void LJJIFFI(String str) {
        Map<String, String> commonParams;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (commonParams = iTakoContextAbility.getCommonParams()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = commonParams.get("enter_from");
            String str3 = commonParams.get("enter_method");
            String str4 = commonParams.get("process_id");
            String str5 = commonParams.get("tako_session_id");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = commonParams.get("tako_chat_id");
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            c20235014FoLIZ.LIZ("tikbot_sidebar_panel_click", C2097608Jq.LJIIJ(new Pair("enter_from", str2), new Pair("enter_method", str3), new Pair("process_id", str4), new Pair("tako_session_id", str5), new Pair("tako_chat_id", str6), new Pair("action_type", str)));
        }
    }

    public final void setOnboardingVM(TakoOnboardingViewModel takoOnboardingViewModel) {
        this.LLJJJJJIL = takoOnboardingViewModel;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.tako.multiconversation.TakoSubConversationDrawerView$conversatioinLayoutManager$1] */
    public C1863240yaQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = true;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJIJIL = new ArrayList();
        C844470XAv.LIZ.getClass();
        final Context contextLIZ = C844470XAv.LIZ();
        this.LLJJJJLIIL = new TakoLinearLayoutManager(contextLIZ) { // from class: com.ss.android.ugc.aweme.tako.multiconversation.TakoSubConversationDrawerView$conversatioinLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return this.LL.LLIZLLLIL;
            }
        };
        EnumC429110Gs9 enumC429110Gs9 = EnumC429110Gs9.TODAY;
        Boolean bool = Boolean.TRUE;
        this.LLJJL = C2097608Jq.LJIIJ(new Pair(enumC429110Gs9, bool), new Pair(EnumC429110Gs9.THIS_WEEK, bool), new Pair(EnumC429110Gs9.HISTORY, bool));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 494));
    }

    public final void LJIIJJI(boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z2;
        long j;
        int i = 0;
        if (!z && C1863680yb8.LIZIZ()) {
            z2 = true;
            if (!this.LLJILJIL) {
                this.LLJILJIL = true;
                LJIIZILJ();
            }
            if (LJIIJ()) {
                C325080Cok.LIZ.getClass();
                C325080Cok.LIZIZ();
                this.LLJJ = true;
                LJIJ();
                C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
                C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
                interfaceC1364105Vn.resumeWith(c316640Cb8LIZIZ);
                return;
            }
            C444801oE c444801oE = this.LLJIJIL;
            if (c444801oE == null) {
                c444801oE = new C444801oE(this.LLJ);
                this.LLJIJIL = c444801oE;
            }
            c444801oE.LIZIZ(C1863680yb8.LIZ().convList.timeoutMs, new AwS572S0100000_28(C1388190mED.LIZ(getContext()), 6), new AwS572S0100000_28(this, 7), new AwS579S0100000_35(this, 375));
        } else {
            z2 = false;
            if (LJIILLIIL()) {
                C325080Cok.LIZ.getClass();
                C325080Cok.LIZIZ();
                this.LLJJ = true;
                C316640Cb8 c316640Cb8LIZIZ2 = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
                C189200o6.m2constructorimpl(c316640Cb8LIZIZ2);
                interfaceC1364105Vn.resumeWith(c316640Cb8LIZIZ2);
                return;
            }
        }
        if (z) {
            j = 0;
        } else {
            int i2 = this.LLJJJIL;
            if (i2 >= 0) {
                i = i2;
            }
            j = i;
        }
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.YV0(j, new AwS10S0220000_27(this, (C1863240yaQ) z2, (boolean) interfaceC1364105Vn, (InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>>) z, true));
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, com.skydoves.balloon.Balloon] */
    public final void LJIIL(View view, ConversationInfo conversationInfo) {
        C21586319dt c21586319dtK6;
        Context context = getContext();
        if (context != null) {
            LJJIFFI("press");
            C259800zU c259800zU = new C259800zU();
            C19404410vq c19404410vq = new C19404410vq(context);
            C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
            ArrayList arrayList = new ArrayList();
            arrayList.add(C1857420yR2.LIZ(new AwS606S0100000_27(new AwS25S0600000_27(c259800zU, (C259800zU<Balloon>) conversationInfo, (ConversationInfo) context, (Context) view, (View) this, (C1863240yaQ) c19404410vq, (C19404410vq) 0), 432)));
            c19404410vq.setVerticalSubMenuActionConfigList(arrayList);
            this.LLIZLLLIL = false;
            ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoChatPageAbility.class, null);
            if (iTakoChatPageAbility != null && (c21586319dtK6 = iTakoChatPageAbility.k6()) != null) {
                c21586319dtK6.setDrawerLockMode(2);
            }
            ?? LIZ = C2247871CyX.LIZ(C2247871CyX.LIZ, context, c19404410vq, true, 0, new AwS571S0100000_27(this, 829), true, null, null, new C0HJB(C418440Gaw.LIZIZ(12), C418440Gaw.LIZIZ(12)), 3292);
            c259800zU.element = LIZ;
            float fLIZIZ = C418440Gaw.LIZIZ(80);
            float fLIZIZ2 = C418440Gaw.LIZIZ(40);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            c19404410vq.measure(0, 0);
            int measuredHeight = (c19404410vq.getMeasuredHeight() + C2247871CyX.LIZIZ) - iArr[1];
            int i = (int) fLIZIZ;
            int measuredWidth = i - (c19404410vq.getMeasuredWidth() / 2);
            C118300cf c118300cf = new C118300cf();
            int i2 = (int) fLIZIZ2;
            c118300cf.element = (-(view.getHeight() - i2)) + 8;
            if (iArr[1] + i2 + c19404410vq.getMeasuredHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) > C418440Gaw.LIZJ(view.getContext())) {
                c118300cf.element = -(c118300cf.element + 8);
                int width = i - (view.getWidth() / 2);
                int i3 = -((iArr[0] + (view.getWidth() / 2)) - (c19404410vq.getMeasuredWidth() / 2));
                if (width < i3) {
                    width = i3;
                }
                int iLIZIZ = width + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                int i4 = c118300cf.element;
                if (i4 >= measuredHeight) {
                    measuredHeight = i4;
                }
                LIZ.LJIILJJIL(iLIZIZ, measuredHeight, view);
                return;
            }
            int i5 = -iArr[0];
            if (measuredWidth < i5) {
                measuredWidth = i5;
            }
            c118300cf.element += 8;
            LIZ.LJIILL(view, measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), c118300cf.element);
        }
    }

    public final void LJIILIIL(Context context, ConversationInfo conversationInfo) {
        String str;
        String str2;
        String str3;
        String str4;
        TakoEnterParams takoEnterParamsEh1;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        String str5;
        String strZi1;
        String str6;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        Map<String, String> commonParams;
        String str7;
        Map<String, String> commonParams2;
        String str8;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        String str9 = "";
        if (iTakoContextAbility != null && (commonParams2 = iTakoContextAbility.getCommonParams()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str10 = commonParams2.get("enter_from");
            String str11 = commonParams2.get("enter_method");
            String str12 = commonParams2.get("process_id");
            String str13 = conversationInfo.subConversationId;
            if (str13 == null) {
                str13 = "";
            }
            BaseVideo baseVideo = conversationInfo.relatedVideo;
            if (baseVideo != null) {
                str8 = baseVideo.vid;
            } else {
                str8 = null;
            }
            String str14 = conversationInfo.conversationTitle;
            String strValueOf = String.valueOf(this.LLJJIJI);
            Iterator it2 = ((ArrayList) this.LLJJIJIIJIL).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(((ConversationInfo) it2.next()).subConversationId, conversationInfo.subConversationId)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            String strValueOf2 = String.valueOf(i);
            String str15 = commonParams2.get("tako_chat_id");
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            c20235014FoLIZ.LIZ("tikbot_history_conversation_click", C2097608Jq.LJIIJ(new Pair("enter_from", str10), new Pair("enter_method", str11), new Pair("process_id", str12), new Pair("tako_session_id", str13), new Pair("tako_chat_id", str15), new Pair("group_id", str8), new Pair("session_topic", str14), new Pair("time", strValueOf), new Pair("rank", strValueOf2)));
        }
        LJJIFFI("click_session");
        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        if (iTakoContextAbility2 != null && (commonParams = iTakoContextAbility2.getCommonParams()) != null && (str7 = commonParams.get("process_id")) != null) {
            HashMap<String, Boolean> map = C1861390yXR.LJI;
            Boolean bool = Boolean.TRUE;
            map.put(str7, bool);
            C1861390yXR.LJFF.put(str7, bool);
        }
        Map<String, String> commonParams3 = null;
        ITakoContextAbility iTakoContextAbility3 = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
        if (iTakoContextAbility3 == null || (commonParams3 = iTakoContextAbility3.getCommonParams()) == null || (str = commonParams3.get("process_id")) == null) {
            str = "";
        }
        if (commonParams3 == null || (str2 = commonParams3.get("tako_session_id")) == null) {
            str2 = "";
        }
        if (commonParams3 == null || (str3 = commonParams3.get("tako_chat_id")) == null) {
            str3 = "";
        }
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            TakoInputViewUIAbility takoInputViewUIAbility = (TakoInputViewUIAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), TakoInputViewUIAbility.class, null);
            if (takoInputViewUIAbility != null) {
                strZi1 = takoInputViewUIAbility.zi1();
            } else {
                strZi1 = null;
            }
            ITakoContextAbility iTakoContextAbility4 = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
            if (iTakoContextAbility4 != null && (c13lcAp02 = iTakoContextAbility4.Ap0()) != null && (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) != null) {
                str6 = c1864200yby2.LLILLJJLI;
            } else {
                str6 = null;
            }
            iMessageAbility.tV0(strZi1, null, str6, str, str2, str3);
        }
        C07QA.LIZ.getClass();
        if (((Number) C07QA.LIZIZ.getValue()).intValue() == 0) {
            str4 = null;
            ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoChatPageAbility.class, null);
            if (iTakoChatPageAbility != null) {
                iTakoChatPageAbility.Hy2();
            }
        } else {
            str4 = null;
        }
        IMessageAbility iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, str4), IMessageAbility.class, str4);
        if (iMessageAbility2 != null) {
            iMessageAbility2.w41();
        }
        C07QG.LIZ.getClass();
        if (C07QG.LIZ()) {
            String string = UUID.randomUUID().toString();
            ITakoContextAbility iTakoContextAbility5 = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
            if (iTakoContextAbility5 != null && (c13lcAp0 = iTakoContextAbility5.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null && (str5 = c1864200yby.LL) != null && str5.length() > 0) {
                C1863550yav.LIZJ(str5);
            }
            String str16 = conversationInfo.subConversationId;
            if (str16 == null) {
                str16 = "";
            }
            String strLIZIZ = C1863550yav.LIZIZ(str16, false);
            String str17 = conversationInfo.subConversationId;
            if (str17 == null) {
                str17 = "";
            }
            C1862700yZY.LIZJ(string, new Pair("tako_session_id", str17), null);
            C1862700yZY.LIZJ(string, new Pair("tako_chat_id", strLIZIZ), null);
            ITakoContextAbility iTakoContextAbility6 = (ITakoContextAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoContextAbility.class, null);
            if (iTakoContextAbility6 != null) {
                String str18 = conversationInfo.subConversationId;
                if (str18 != null) {
                    str9 = str18;
                }
                iTakoContextAbility6.PG0(new C144G(string, str9, strLIZIZ));
            }
            ITakoChatPageAbility iTakoChatPageAbility2 = (ITakoChatPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ITakoChatPageAbility.class, null);
            if (iTakoChatPageAbility2 != null && (takoEnterParamsEh1 = iTakoChatPageAbility2.eh1()) != null) {
                takoEnterParamsEh1.setProcessId(string);
                takoEnterParamsEh1.setTakoChatId(strLIZIZ);
            }
        }
        C1862680yZW.LIZ(C1558360qeg.LJ(this, null), new AwS271S0300000_27(this, conversationInfo, context, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.content.Context r10, com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863240yaQ.LJIILJJIL(android.content.Context, com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo):void");
    }

    public final void LJIJJLI(boolean z, boolean z2) {
        if (z) {
            C444801oE c444801oE = this.LLJI;
            if (c444801oE != null) {
                c444801oE.LIZ();
            }
            View view = this.LLILZLL;
            if (view != null) {
                C0DSB.LIZIZ(view);
            }
        }
        if (z2) {
            LJ();
        }
        C1390410mHn c1390410mHn = this.LLILZIL;
        if (c1390410mHn != null && c1390410mHn.getVisibility() == 0) {
            c1390410mHn.LIZLLL();
            C0DSB.LIZIZ(c1390410mHn);
        }
    }

    public final void LJJ(EnumC429110Gs9 enumC429110Gs9, boolean z) {
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLJJL.put(enumC429110Gs9, Boolean.valueOf(z));
        LIZJ();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(this.LLJJIJIL, null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.invalidateItemDecorations();
        }
    }
}
