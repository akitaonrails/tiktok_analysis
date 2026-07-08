package X;

import Y.ALAdapterS9S0100000_12;
import Y.AObserverS125S0300000_12;
import Y.AObserverS177S0200000_12;
import Y.AObserverS216S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.slot.BottomLeftSlotSceneChannel;
import com.bytedance.android.live.slot.BottomLeftSlotVisibilityChannel;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.LiveShopAddPermissionBusinessSetting;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.dataChannel.StartClearScreenEvent;
import com.bytedance.android.livesdk.ecommerce.datachannel.EcLiveBarrageEnable;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Uqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785060Uqu implements InterfaceC1102810env, InterfaceC1123890fLv, InterfaceC484670IzZ, InterfaceC1102940eo8 {
    public Context LL;
    public LifecycleOwner LLILLJJLI;
    public DataChannel LLILLL;
    public InterfaceC785120Ur0 LLILZ;
    public boolean LLIZ;
    public FrameLayout LLIZLLLIL;
    public ImageView LLJ;
    public C1295960jpS LLJI;
    public C16F5 LLJIJIL;
    public View LLJILJIL;
    public ImageView LLJILJILJ;
    public TextView LLJILLL;
    public InterfaceC1124060fMC<?, ?, ?> LLJJ;
    public InterfaceC770540UKm LLJJI;
    public IIconSlot.SlotViewModel LLJJIII;
    public EnumC785140Ur2 LLJJIJIL;
    public C447180HgC LLJJJ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 82));
    public long LLILZLL = -1;
    public final Queue<C1123980fM4> LLJJIJI = new PriorityBlockingQueue(3, new Comparator() { // from class: X.0Uqx
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C1123980fM4) obj).LIZ - ((C1123980fM4) obj2).LIZ;
        }
    });
    public final Map<C1123980fM4, IIconSlot.SlotViewModel> LLJJIJIIJIL = new LinkedHashMap();
    public final List<C785050Uqt> LLJJJIL = C1697810uHb.LJIIJJI(new C785050Uqt((int) C497740JfY.LIZIZ(30.0f), (int) C497740JfY.LIZIZ(30.0f), 0, 255), new C785050Uqt((int) C497740JfY.LIZIZ(28.0f), (int) C497740JfY.LIZIZ(28.0f), (int) C497740JfY.LIZIZ(6.0f), 204), new C785050Uqt((int) C497740JfY.LIZIZ(26.0f), (int) C497740JfY.LIZIZ(26.0f), (int) C497740JfY.LIZIZ(12.0f), 102));
    public final ALAdapterS9S0100000_12 LLJJJJ = new ALAdapterS9S0100000_12(this, 11);

    @Override // X.InterfaceC1102810env
    public final Integer LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final Integer LJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final boolean f1() {
        return true;
    }

    @Override // X.InterfaceC1102810env
    public final long g0() {
        return 500L;
    }

    @Override // X.InterfaceC1102810env
    public final boolean x0(View view) {
        return false;
    }

    public final void LJFF() {
        View view = this.LLJILJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ImageView imageView = this.LLJILJILJ;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        TextView textView = this.LLJILLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
    }

    @Override // X.InterfaceC1123890fLv
    public final View LJLLI() {
        InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLILZ;
        if (interfaceC785120Ur0 != null) {
            return interfaceC785120Ur0.LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final void LLILLJJLI() {
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC = this.LLJJ;
        if (interfaceC1124060fMC != null) {
            interfaceC1124060fMC.LLILLJJLI();
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LLILZ() {
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC = this.LLJJ;
        if (interfaceC1124060fMC != null) {
            interfaceC1124060fMC.LLILZ();
        }
    }

    @Override // X.InterfaceC1102940eo8
    public final String LLILZIL() {
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC = this.LLJJ;
        if (interfaceC1124060fMC != null) {
            return interfaceC1124060fMC.LLILZIL();
        }
        return null;
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        InterfaceC484670IzZ interfaceC484670IzZ;
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC = this.LLJJ;
        if (!(interfaceC1124060fMC instanceof InterfaceC484670IzZ) || (interfaceC484670IzZ = (InterfaceC484670IzZ) interfaceC1124060fMC) == null) {
            return null;
        }
        return interfaceC484670IzZ.getComponentType();
    }

    @Override // X.InterfaceC1102810env
    public final void J() {
        LLILLJJLI();
    }

    @Override // X.InterfaceC1102810env
    public final C0KX7 LIZ() {
        return C0KX7.FIXED;
    }

    @Override // X.InterfaceC1123890fLv
    public final void LJJL(IIconSlot.SlotViewModel slotViewModel) {
        if (slotViewModel != null) {
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            if (lifecycleOwner == null) {
                lifecycleOwner = null;
            }
            slotViewModel.xQ2(lifecycleOwner);
        }
    }

    @Override // X.InterfaceC1123890fLv
    public final void P0(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.zW(BottomLeftSlotVisibilityChannel.class, Boolean.valueOf(zBooleanValue));
        }
    }

    @Override // X.InterfaceC1123890fLv
    public final void g(EnumC785140Ur2 enumC785140Ur2) {
        this.LLJJIJIL = enumC785140Ur2;
    }

    @Override // X.InterfaceC1102810env
    public final void onClick(View view) {
        Object objLLILZLL;
        IIconSlot iIconSlot;
        InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC = this.LLJJ;
        View viewLJ = null;
        if (interfaceC1124060fMC != null) {
            objLLILZLL = interfaceC1124060fMC.LLILZLL();
        } else {
            objLLILZLL = null;
        }
        if ((objLLILZLL instanceof IIconSlot) && (iIconSlot = (IIconSlot) objLLILZLL) != null) {
            InterfaceC752610Tff interfaceC752610TffLIZJ = iIconSlot.LIZJ();
            if (interfaceC752610TffLIZJ != null) {
                InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLILZ;
                if (interfaceC785120Ur0 != null) {
                    viewLJ = interfaceC785120Ur0.LJ();
                }
                interfaceC752610TffLIZJ.LIZ(viewLJ, "during_live");
            } else {
                iIconSlot.getScheme();
                if (!TextUtils.isEmpty(null)) {
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                    Context context = this.LL;
                    iIconSlot.getScheme();
                    iActionHandlerService.handleWithoutHost(context, UriProtector.parse(null).toString());
                }
            }
            C770580UKq.LIZJ(this.LLJJ);
        }
    }

    @Override // X.InterfaceC1102810env
    public final void LIZIZ(C1099960ejK c1099960ejK, C945840aik c945840aik) {
        EnumC785140Ur2 enumC785140Ur2;
        this.LL = c1099960ejK.LIZ;
        this.LLILLJJLI = c1099960ejK.LIZIZ;
        this.LLILLL = c1099960ejK.LIZJ;
        this.LLILZ = c945840aik;
        this.LLILZLL = SystemClock.uptimeMillis();
        this.LLIZLLLIL = (FrameLayout) c945840aik.findViewById(R.id.y7k);
        this.LLJ = (ImageView) c945840aik.findViewById(R.id.y7j);
        this.LLJI = (C1295960jpS) c945840aik.findViewById(R.id.y79);
        this.LLJIJIL = (C16F5) c945840aik.findViewById(R.id.y7s);
        this.LLJILJIL = c945840aik.findViewById(R.id.y7e);
        this.LLJILJILJ = (ImageView) c945840aik.findViewById(R.id.y76);
        this.LLJILLL = (TextView) c945840aik.findViewById(R.id.y78);
        LJFF();
        ImageView imageView = this.LLJILJILJ;
        LifecycleOwner lifecycleOwner = null;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        TextView textView = this.LLJILLL;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        ImageView imageView2 = this.LLJ;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            c16f5.setText((CharSequence) null);
        }
        C1295960jpS c1295960jpS = this.LLJI;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        EnumC785080Uqw enumC785080Uqw = EnumC785080Uqw.DEFAULT;
        if (LiveShopAddPermissionBusinessSetting.INSTANCE.isEnabled()) {
            DataChannel dataChannel = this.LLILLL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            EnumC785080Uqw enumC785080Uqw2 = (EnumC785080Uqw) dataChannel.gg0(BottomLeftSlotSceneChannel.class);
            if (enumC785080Uqw2 != null) {
                enumC785080Uqw = enumC785080Uqw2;
            }
        }
        int i = C785070Uqv.LIZ[enumC785080Uqw.ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC785140Ur2 = EnumC785140Ur2.PRIORITY;
            } else {
                throw new C1954807lC();
            }
        } else {
            enumC785140Ur2 = EnumC785140Ur2.AGGREGATE;
        }
        EnumC756810TmR enumC756810TmR = EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
        Context contextLJJIIZI = C520010KaN.LJJIIZI(this.LL, false);
        if (contextLJJIIZI != null) {
            this.LLJJI = ((ISlotService) C1161920gLG.LIZJ(ISlotService.class)).createIconSlotController(contextLJJIIZI, this, enumC756810TmR, enumC785140Ur2, null);
        }
        InterfaceC770540UKm interfaceC770540UKm = this.LLJJI;
        if (interfaceC770540UKm != null) {
            DataChannel dataChannel2 = this.LLILLL;
            if (dataChannel2 == null) {
                dataChannel2 = null;
            }
            interfaceC770540UKm.setDataChannel(dataChannel2);
            interfaceC770540UKm.load(enumC756810TmR);
            LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
            if (lifecycleOwner2 == null) {
                lifecycleOwner2 = null;
            }
            lifecycleOwner2.getLifecycle().addObserver(interfaceC770540UKm);
        }
        DataChannel dataChannel3 = this.LLILLL;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        LifecycleOwner lifecycleOwner3 = this.LLILLJJLI;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        dataChannel3.BQ2(lifecycleOwner3, PublicScreenNewMessageVisible.class, new AwS591S0100000_12(this, 138));
        DataChannel dataChannel4 = this.LLILLL;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        LifecycleOwner lifecycleOwner4 = this.LLILLJJLI;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        dataChannel4.EQ2(lifecycleOwner4, StartClearScreenEvent.class, new AwS591S0100000_12(this, 134));
        DataChannel dataChannel5 = this.LLILLL;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        LifecycleOwner lifecycleOwner5 = this.LLILLJJLI;
        if (lifecycleOwner5 != null) {
            lifecycleOwner = lifecycleOwner5;
        }
        dataChannel5.EQ2(lifecycleOwner, KeyboardStatusChannel.class, new AwS591S0100000_12(this, 135));
    }

    @Override // X.InterfaceC1102810env
    public final void LIZLLL(C1099960ejK c1099960ejK, InterfaceC785120Ur0 interfaceC785120Ur0) {
        AnonymousClass0956 anonymousClass0956;
        IIconSlot.SlotViewModel slotViewModel = this.LLJJIII;
        DataChannel dataChannel = null;
        if (slotViewModel != null) {
            LifecycleOwner lifecycleOwner = this.LLILLJJLI;
            if (lifecycleOwner == null) {
                lifecycleOwner = null;
            }
            slotViewModel.vQ2(lifecycleOwner);
        }
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        dataChannel2.zW(EcLiveBarrageEnable.class, Boolean.TRUE);
        ((PriorityBlockingQueue) this.LLJJIJI).clear();
        for (IIconSlot.SlotViewModel slotViewModel2 : ((LinkedHashMap) this.LLJJIJIIJIL).values()) {
            LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
            if (lifecycleOwner2 == null) {
                lifecycleOwner2 = null;
            }
            slotViewModel2.vQ2(lifecycleOwner2);
        }
        ((LinkedHashMap) this.LLJJIJIIJIL).clear();
        C447180HgC c447180HgC = this.LLJJJ;
        if (c447180HgC != null && (anonymousClass0956 = c447180HgC.LIZIZ) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC770540UKm interfaceC770540UKm = this.LLJJI;
        if (interfaceC770540UKm != null) {
            interfaceC770540UKm.onDestroy();
            LifecycleOwner lifecycleOwner3 = this.LLILLJJLI;
            if (lifecycleOwner3 == null) {
                lifecycleOwner3 = null;
            }
            lifecycleOwner3.getLifecycle().removeObserver(interfaceC770540UKm);
        }
        DataChannel dataChannel3 = this.LLILLL;
        if (dataChannel3 != null) {
            dataChannel = dataChannel3;
        }
        dataChannel.zW(HighPriorityTooltipVisibilityChannel.class, Boolean.FALSE);
    }

    public final void LJI(InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC, boolean z) {
        Map<String, Object> dataContainer;
        DataChannel dataChannel = null;
        if (z) {
            EnumC1102740eno enumC1102740eno = EnumC1102740eno.ICON_SLOT;
            DataChannel dataChannel2 = this.LLILLL;
            if (dataChannel2 != null) {
                dataChannel = dataChannel2;
            }
            enumC1102740eno.show(dataChannel, interfaceC1124060fMC.LLILZIL());
            HashMap map = new HashMap();
            if (!this.LLIZ) {
                InterfaceC770540UKm interfaceC770540UKm = this.LLJJI;
                if (interfaceC770540UKm != null && (dataContainer = interfaceC770540UKm.getDataContainer()) != null) {
                    C783190Unt.LIZ(this.LLILZLL, map, dataContainer);
                }
                C770580UKq.LIZLLL(interfaceC1124060fMC, map);
            }
            this.LLIZ = true;
            return;
        }
        EnumC1102740eno enumC1102740eno2 = EnumC1102740eno.ICON_SLOT;
        DataChannel dataChannel3 = this.LLILLL;
        if (dataChannel3 != null) {
            dataChannel = dataChannel3;
        }
        enumC1102740eno2.hide(dataChannel);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJII(InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        this.LLJJ = interfaceC1124060fMC;
        MutableLiveData<Boolean> mutableLiveData = slotViewModel.LLIZ;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        LifecycleOwner lifecycleOwner2 = null;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        mutableLiveData.observe(lifecycleOwner, new AObserverS177S0200000_12(slotViewModel, this, 7));
        MutableLiveData<Drawable> mutableLiveData2 = slotViewModel.LLJILJIL;
        LifecycleOwner lifecycleOwner3 = this.LLILLJJLI;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        mutableLiveData2.observe(lifecycleOwner3, new AObserverS177S0200000_12(slotViewModel, this, 8));
        MutableLiveData<String> mutableLiveData3 = slotViewModel.LLILZLL;
        LifecycleOwner lifecycleOwner4 = this.LLILLJJLI;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        mutableLiveData3.observe(lifecycleOwner4, new AObserverS177S0200000_12(slotViewModel, this, 9));
        MutableLiveData<Drawable> mutableLiveData4 = slotViewModel.LLJ;
        LifecycleOwner lifecycleOwner5 = this.LLILLJJLI;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        mutableLiveData4.observe(lifecycleOwner5, new AObserverS177S0200000_12(slotViewModel, this, 10));
        MutableLiveData<Drawable> mutableLiveData5 = slotViewModel.LLJI;
        LifecycleOwner lifecycleOwner6 = this.LLILLJJLI;
        if (lifecycleOwner6 == null) {
            lifecycleOwner6 = null;
        }
        mutableLiveData5.observe(lifecycleOwner6, new AObserverS177S0200000_12(slotViewModel, this, 11));
        MutableLiveData<Boolean> mutableLiveData6 = slotViewModel.LLJJIJI;
        LifecycleOwner lifecycleOwner7 = this.LLILLJJLI;
        if (lifecycleOwner7 == null) {
            lifecycleOwner7 = null;
        }
        mutableLiveData6.observe(lifecycleOwner7, new AObserverS125S0300000_12(slotViewModel, (IIconSlot.SlotViewModel) interfaceC1124060fMC, (InterfaceC1124060fMC<?, ?, ?>) this, (C785060Uqu) 10));
        if (((Boolean) this.LLILZIL.getValue()).booleanValue()) {
            MutableLiveData<String> mutableLiveData7 = slotViewModel.LLJILJILJ;
            LifecycleOwner lifecycleOwner8 = this.LLILLJJLI;
            if (lifecycleOwner8 == null) {
                lifecycleOwner8 = null;
            }
            mutableLiveData7.observe(lifecycleOwner8, new AObserverS177S0200000_12(slotViewModel, this, 12));
        }
        MutableLiveData<C785100Uqy> mutableLiveData8 = slotViewModel.LLJJI;
        LifecycleOwner lifecycleOwner9 = this.LLILLJJLI;
        if (lifecycleOwner9 == null) {
            lifecycleOwner9 = null;
        }
        mutableLiveData8.observe(lifecycleOwner9, new AObserverS177S0200000_12(slotViewModel, this, 13));
        MutableLiveData<C785040Uqs> mutableLiveData9 = slotViewModel.LLJJIII;
        LifecycleOwner lifecycleOwner10 = this.LLILLJJLI;
        if (lifecycleOwner10 == null) {
            lifecycleOwner10 = null;
        }
        mutableLiveData9.observe(lifecycleOwner10, new AObserverS177S0200000_12(slotViewModel, this, 14));
        MutableLiveData<Boolean> mutableLiveData10 = slotViewModel.LLJJJJLIIL;
        LifecycleOwner lifecycleOwner11 = this.LLILLJJLI;
        if (lifecycleOwner11 == null) {
            lifecycleOwner11 = null;
        }
        mutableLiveData10.observe(lifecycleOwner11, new AObserverS216S0100000_12(this, 15));
        MutableLiveData<Boolean> mutableLiveData11 = slotViewModel.LLJJJJ;
        LifecycleOwner lifecycleOwner12 = this.LLILLJJLI;
        if (lifecycleOwner12 == null) {
            lifecycleOwner12 = null;
        }
        mutableLiveData11.observe(lifecycleOwner12, new AObserverS216S0100000_12(this, 16));
        MutableLiveData<Pair<Boolean, Integer>> mutableLiveData12 = slotViewModel.LLJJL;
        LifecycleOwner lifecycleOwner13 = this.LLILLJJLI;
        if (lifecycleOwner13 == null) {
            lifecycleOwner13 = null;
        }
        mutableLiveData12.observe(lifecycleOwner13, new AObserverS216S0100000_12(this, 17));
        MutableLiveData<Float> mutableLiveData13 = slotViewModel.LLJL;
        LifecycleOwner lifecycleOwner14 = this.LLILLJJLI;
        if (lifecycleOwner14 == null) {
            lifecycleOwner14 = null;
        }
        mutableLiveData13.observe(lifecycleOwner14, new AObserverS216S0100000_12(this, 18));
        LiveData liveData = slotViewModel.LLJJJJJIL;
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        Object objGg0 = dataChannel.gg0(C754010Thv.class);
        if (objGg0 == null) {
            objGg0 = Boolean.FALSE;
        }
        liveData.setValue(objGg0);
        MutableLiveData<Boolean> mutableLiveData14 = slotViewModel.LLJJJJJIL;
        LifecycleOwner lifecycleOwner15 = this.LLILLJJLI;
        if (lifecycleOwner15 != null) {
            lifecycleOwner2 = lifecycleOwner15;
        }
        mutableLiveData14.observe(lifecycleOwner2, new AObserverS216S0100000_12(this, 19));
    }

    @Override // X.InterfaceC1123890fLv
    public final void t1(InterfaceC1124060fMC<?, ?, ?> interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        this.LLJJIII = slotViewModel;
        if (slotViewModel == null) {
            return;
        }
        slotViewModel.LL.setValue(Boolean.TRUE);
        MutableLiveData<Boolean> mutableLiveData = slotViewModel.LLILZ;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (lifecycleOwner == null) {
            lifecycleOwner = null;
        }
        mutableLiveData.observe(lifecycleOwner, new AObserverS125S0300000_12(slotViewModel, (IIconSlot.SlotViewModel) interfaceC1124060fMC, (InterfaceC1124060fMC<?, ?, ?>) this, (C785060Uqu) 5));
        if (interfaceC1124060fMC != null) {
            LJII(interfaceC1124060fMC, slotViewModel);
        }
    }

    @Override // X.InterfaceC1123890fLv
    public final void v1(C1123980fM4 c1123980fM4, IIconSlot.SlotViewModel slotViewModel) {
        if (c1123980fM4 == null || slotViewModel == null) {
            return;
        }
        ((PriorityBlockingQueue) this.LLJJIJI).add(c1123980fM4);
        this.LLJJIJIIJIL.put(c1123980fM4, slotViewModel);
        EnumC785140Ur2 enumC785140Ur2 = this.LLJJIJIL;
        LifecycleOwner lifecycleOwner = null;
        if (enumC785140Ur2 == EnumC785140Ur2.FIRST) {
            MutableLiveData<Boolean> mutableLiveData = slotViewModel.LLILZ;
            LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
            if (lifecycleOwner2 != null) {
                lifecycleOwner = lifecycleOwner2;
            }
            mutableLiveData.observe(lifecycleOwner, new AObserverS125S0300000_12(c1123980fM4, this, slotViewModel, 6));
            return;
        }
        if (enumC785140Ur2 == EnumC785140Ur2.LAST) {
            MutableLiveData<Boolean> mutableLiveData2 = slotViewModel.LLILZ;
            LifecycleOwner lifecycleOwner3 = this.LLILLJJLI;
            if (lifecycleOwner3 != null) {
                lifecycleOwner = lifecycleOwner3;
            }
            mutableLiveData2.observe(lifecycleOwner, new AObserverS125S0300000_12(c1123980fM4, this, slotViewModel, 7));
            return;
        }
        if (enumC785140Ur2 == EnumC785140Ur2.PRIORITY) {
            MutableLiveData<Boolean> mutableLiveData3 = slotViewModel.LLILZ;
            LifecycleOwner lifecycleOwner4 = this.LLILLJJLI;
            if (lifecycleOwner4 != null) {
                lifecycleOwner = lifecycleOwner4;
            }
            mutableLiveData3.observe(lifecycleOwner, new AObserverS125S0300000_12(c1123980fM4, this, slotViewModel, 8));
            return;
        }
        if (enumC785140Ur2 != EnumC785140Ur2.AGGREGATE) {
            return;
        }
        MutableLiveData<Boolean> mutableLiveData4 = slotViewModel.LLILZ;
        LifecycleOwner lifecycleOwner5 = this.LLILLJJLI;
        if (lifecycleOwner5 != null) {
            lifecycleOwner = lifecycleOwner5;
        }
        mutableLiveData4.observe(lifecycleOwner, new AObserverS125S0300000_12(c1123980fM4, this, slotViewModel, 9));
    }
}
