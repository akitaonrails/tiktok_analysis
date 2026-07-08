package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.HintsConfig;
import com.ss.android.ugc.aweme.component.aiagent.banner.CapsuleCell;
import com.ss.android.ugc.aweme.model.AnoleAiAgentData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.AwS225S0300000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1021240cgM extends FrameLayout implements InterfaceC1021180cgG, View.OnClickListener {
    public TuxTextView LL;
    public View LLILLJJLI;
    public C424560Gko LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public long LLILZIL;
    public InterfaceC1021210cgJ<? extends InterfaceC1021290cgR> LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public float LLJ;
    public final int LLJI;

    public final Map<String, String> getBasicClickParams() {
        C20600815jK<InterfaceC1891350zJl> state;
        C06LQ c06lq;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(AbstractC1021310cgT.LIZIZ, String.valueOf(System.currentTimeMillis() - this.LLILZIL));
        String str = AbstractC1021310cgT.LIZJ;
        ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
        String strLJJLIIIJ = null;
        if (powerList != null && (state = powerList.getState()) != null) {
            List<InterfaceC1891350zJl> listLJII = state.LJII();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) listLJII) {
                arrayList.add((!(interfaceC1891350zJl instanceof C06LQ) || (c06lq = (C06LQ) interfaceC1891350zJl) == null) ? null : c06lq.LL);
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63);
        }
        pairArr[1] = new Pair(str, strLJJLIIIJ);
        pairArr[2] = new Pair(AbstractC1021310cgT.LJFF, "capsule");
        return C2097608Jq.LJIIJ(pairArr);
    }

    private final View getAvatarContainerFromXml() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.bi2);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    private final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sl9);
            this.LLILZ = (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) callbackFindViewById;
    }

    private final TuxTextView getTitleIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3j);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C424560Gko getAvatarIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.biz);
            this.LLILLL = (C424560Gko) callbackFindViewById;
        }
        return (C424560Gko) callbackFindViewById;
    }

    public ViewOnClickListenerC1021240cgM(Context context) {
        super(context, null, 0);
        this.LLILZIL = System.currentTimeMillis();
        this.LLJI = ViewConfiguration.get(context).getScaledTouchSlop();
        C786410Ut5.Sd(R.layout.pa, C786410Ut5.ne(context), this);
        ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
        if (powerList != null) {
            powerList.LJIILJJIL(CapsuleCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv powerList2 = getPowerList();
        if (powerList2 != null) {
            powerList2.setLayoutManager(new LinearLayoutManager(context, 0, false));
        }
        ViewOnAttachStateChangeListenerC20604515jv powerList3 = getPowerList();
        if (powerList3 != null) {
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            powerList3.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0cgQ
                public final int LL;

                {
                    this.LL = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    if (recyclerView.getChildAdapterPosition(view) < c21673919s1.LIZIZ() - 1) {
                        if (!C444960Hcc.LIZIZ()) {
                            rect.right = this.LL;
                            return;
                        } else {
                            rect.left = this.LL;
                            return;
                        }
                    }
                    rect.right = 0;
                    rect.left = 0;
                }
            });
        }
    }

    private final void setAvatar(String str) {
        int i;
        View avatarContainerFromXml = getAvatarContainerFromXml();
        if (avatarContainerFromXml != null) {
            if (C123100dR.LIZ(str)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, avatarContainerFromXml);
        }
        if (str == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06ZD(str, this, null), 3);
    }

    private final void setReminder(String str) {
        TuxTextView titleIvFromXml = getTitleIvFromXml();
        if (titleIvFromXml != null) {
            titleIvFromXml.setText(str);
        }
    }

    @Override // X.InterfaceC1021180cgG
    public final void LIZ(HintsConfig hintsConfig) {
        List<String> shortHints;
        if (this.LLIZLLLIL) {
            C1022620cia.LIZ("ai_agent_banner", "skip due to dragging");
            return;
        }
        this.LLIZ = false;
        if (hintsConfig == null || (shortHints = hintsConfig.getShortHints()) == null) {
            shortHints = C13BV.INSTANCE;
        }
        LJ(shortHints, new AwS595S0100000_16(this, 81));
    }

    public final boolean LIZLLL(int i) {
        RecyclerView.LayoutManager layoutManager;
        View childAt;
        ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
        if (powerList == null || (layoutManager = powerList.getLayoutManager()) == null || (childAt = layoutManager.getChildAt(i)) == null) {
            return false;
        }
        Rect rect = new Rect();
        powerList.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        childAt.getGlobalVisibleRect(rect2);
        if (rect2.intersect(rect) && rect2.width() < childAt.getWidth()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r3 != 3) goto L12;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r4 = super.dispatchTouchEvent(r6)
            if (r6 == 0) goto L16
            int r3 = r6.getActionMasked()
            r1 = 0
            if (r3 == 0) goto L35
            r2 = 1
            if (r3 == r2) goto L32
            r0 = 2
            if (r3 == r0) goto L17
            r0 = 3
            if (r3 == r0) goto L32
        L16:
            return r4
        L17:
            if (r4 == 0) goto L16
            boolean r0 = r5.LLIZLLLIL
            if (r0 != 0) goto L16
            float r1 = r6.getX()
            float r0 = r5.LLJ
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r5.LLJI
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L16
            r5.LLIZLLLIL = r2
            return r4
        L32:
            r5.LLIZLLLIL = r1
            return r4
        L35:
            float r0 = r6.getX()
            r5.LLJ = r0
            r5.LLIZLLLIL = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1021240cgM.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1021310cgT c1021350cgX;
        if (C0OBG.LIZIZ(this)) {
            return;
        }
        final Map<String, String> basicClickParams = getBasicClickParams();
        if (Intrinsics.LJFF(view, getTitleIvFromXml())) {
            c1021350cgX = new AbstractC1021310cgT(basicClickParams) { // from class: X.0cgZ
            };
        } else if (!Intrinsics.LJFF(view, getAvatarIvFromXml())) {
            return;
        } else {
            c1021350cgX = new C1021350cgX(basicClickParams);
        }
        InterfaceC1021210cgJ<? extends InterfaceC1021290cgR> interfaceC1021210cgJ = this.LLILZLL;
        if (interfaceC1021210cgJ != null) {
            interfaceC1021210cgJ.RO1(c1021350cgX);
        }
    }

    @Override // X.InterfaceC1021180cgG
    public final void LIZIZ(final C1014660cVk c1014660cVk, final Function1 function1) {
        List<InterfaceC1891350zJl> listLJII;
        C20600815jK<InterfaceC1891350zJl> state;
        if (this.LLIZLLLIL) {
            C1022620cia.LIZ("ai_agent_banner", "skip due to dragging");
            return;
        }
        this.LLILZIL = System.currentTimeMillis();
        if (this.LLIZ) {
            ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
            if (powerList != null && (state = powerList.getState()) != null) {
                listLJII = state.LJII();
            } else {
                listLJII = C13BV.INSTANCE;
            }
            c1014660cVk.logAd(C1021270cgP.LIZ, new AwS382S0200000_16((List) listLJII, (List<? extends InterfaceC1891350zJl>) this, (ViewOnClickListenerC1021240cgM) 22));
            return;
        }
        final ViewOnAttachStateChangeListenerC20604515jv powerList2 = getPowerList();
        if (powerList2 != null) {
            powerList2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0cgN
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int iFindLastVisibleItemPosition;
                    LinearLayoutManager linearLayoutManager;
                    this.LL.LLIZ = true;
                    if (powerList2.getChildCount() > 0) {
                        RecyclerView.LayoutManager layoutManager = powerList2.getLayoutManager();
                        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                        } else {
                            iFindLastVisibleItemPosition = -1;
                        }
                        List listSubList = ((ArrayList) powerList2.getState().LJII()).subList(0, iFindLastVisibleItemPosition + 1);
                        powerList2.getState().LJIILL(listSubList, null);
                        c1014660cVk.logAd(C1021270cgP.LIZ, new AwS225S0300000_16(listSubList, (List<? extends InterfaceC1891350zJl>) this.LL, (ViewOnClickListenerC1021240cgM) function1, (Function1<? super C1023640ckE, Unit>) 5));
                    }
                    powerList2.removeOnLayoutChangeListener(this);
                }
            });
        }
    }

    public final void LIZJ(AnoleAiAgentData anoleAiAgentData, InterfaceC1021210cgJ<? extends InterfaceC1021290cgR> interfaceC1021210cgJ) {
        String str;
        List<String> list;
        this.LLIZ = false;
        this.LLILZLL = interfaceC1021210cgJ;
        String str2 = null;
        if (anoleAiAgentData != null) {
            str = anoleAiAgentData.title;
        } else {
            str = null;
        }
        setReminder(str);
        if (anoleAiAgentData != null) {
            str2 = anoleAiAgentData.icon;
        }
        setAvatar(str2);
        if (anoleAiAgentData == null || (list = anoleAiAgentData.shortHints) == null) {
            list = C13BV.INSTANCE;
        }
        LJ(list, new AwS382S0200000_16(this, (ViewOnClickListenerC1021240cgM) interfaceC1021210cgJ, (InterfaceC1021210cgJ<? extends InterfaceC1021290cgR>) 21));
        TuxTextView titleIvFromXml = getTitleIvFromXml();
        if (titleIvFromXml != null) {
            C786410Ut5.h9(titleIvFromXml, this);
        }
        C2271391DvN.LIZ(getTitleIvFromXml(), (C1A5L) C2271381DvM.o.getValue());
        C424560Gko avatarIvFromXml = getAvatarIvFromXml();
        if (avatarIvFromXml != null) {
            C786410Ut5.H9(avatarIvFromXml, this);
        }
        C2271391DvN.LIZ(getAvatarIvFromXml(), (C1A5L) C2271381DvM.p.getValue());
    }

    public final void LJ(List<String> list, Function1<? super String, Unit> function1) {
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
        if (powerList != null && (state = powerList.getState()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : list) {
                arrayList.add(new C06LQ(str, new AwS165S1100000_16(str, function1, 18)));
            }
            state.LJIILL(arrayList, null);
        }
    }
}
