package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.StickerShortcutPanelChannel;
import com.bytedance.android.live.effect.api.StickerPanelHideEvent;
import com.bytedance.android.live.effect.api.StickerPanelShowEvent;
import com.bytedance.android.livesdk.model.LastUsedStickerCacheModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UCH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCH implements InterfaceC768930UEh {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final WeakReference<DataChannel> LIZ;
    public final WeakReference<Fragment> LIZIZ;
    public final C0UCY LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public String LJI = C0UD4.LIZIZ;
    public LiveEffect LJII;
    public WeakReference<ViewGroup> LJIIIIZZ;
    public Function2<? super String, ? super String, Integer> LJIIIZ;
    public C0UCU LJIIJ;
    public C0UCI LJIIJJI;
    public C0UCL LJIIL;

    public final C0UCU LJIIJJI() {
        WeakReference<Fragment> weakReference;
        Fragment fragment;
        DataChannel dataChannel;
        C0UCY c0ucy;
        if (this.LJIIJ == null && (weakReference = this.LIZIZ) != null && (fragment = weakReference.get()) != null && (dataChannel = this.LIZ.get()) != null && (c0ucy = this.LIZJ) != null) {
            this.LJIIJ = new C0UCU(dataChannel, fragment, c0ucy);
        }
        return this.LJIIJ;
    }

    public final C0UCI LJIILIIL() {
        WeakReference<Fragment> weakReference;
        Fragment fragment;
        Context context;
        if (this.LJIIJJI == null && (weakReference = this.LIZIZ) != null && (fragment = weakReference.get()) != null && (context = fragment.getContext()) != null) {
            C0UCI c0uci = new C0UCI(context);
            c0uci.setComposerManager(C0UA1.LIZ());
            c0uci.LLILLJJLI.LLILLJJLI = this.LIZ;
            this.LJIIJJI = c0uci;
        }
        return this.LJIIJJI;
    }

    public final C0UCL LJIILJJIL() {
        WeakReference<Fragment> weakReference;
        Fragment fragment;
        Context context;
        if (this.LJIIL == null && (weakReference = this.LIZIZ) != null && (fragment = weakReference.get()) != null && (context = fragment.getContext()) != null) {
            this.LJIIL = new C0UCL(context);
        }
        return this.LJIIL;
    }

    public final void LIZ() {
        ViewGroup viewGroup;
        if (LJIILIIL() == null) {
            return;
        }
        try {
            C0UCI c0uciLJIILIIL = LJIILIIL();
            C786410Ut5.LJJJLZIJ(LJIILIIL(), (ViewGroup) (c0uciLJIILIIL != null ? c0uciLJIILIIL.getParent() : null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        WeakReference<ViewGroup> weakReference = this.LJIIIIZZ;
        if (weakReference == null || (viewGroup = weakReference.get()) == null) {
            return;
        }
        C0UCI c0uciLJIILIIL2 = LJIILIIL();
        C19ME c19me = new C19ME(-1, (int) C497740JfY.LIZIZ(66.0f));
        c19me.bottomToBottom = viewGroup.getId();
        viewGroup.addView(c0uciLJIILIIL2, c19me);
    }

    @Override // X.InterfaceC768930UEh
    public final void LIZJ() {
        C0UCU c0ucuLJIIJJI = LJIIJJI();
        if (c0ucuLJIIJJI != null) {
            c0ucuLJIIJJI.LIZJ();
        }
        C0UCL c0uclLJIILJJIL = LJIILJJIL();
        if (c0uclLJIILJJIL != null) {
            c0uclLJIILJJIL.LLIZLLLIL = null;
            C473220Ih6 c473220Ih6 = c0uclLJIILJJIL.LLILZLL;
            c473220Ih6.LLILLL = null;
            C0UCT c0uctLIZLLL = C0UF5.LIZLLL();
            if (c0uctLIZLLL != null) {
                c0uctLIZLLL.LIZ = "";
            }
            c473220Ih6.LLLFZ("");
            C500260Jjc.LJIILIIL(c0uclLJIILJJIL);
        }
        C0UCI c0uciLJIILIIL = LJIILIIL();
        if (c0uciLJIILIIL != null) {
            c0uciLJIILIIL.LIZ();
        }
    }

    public final void LJIIJ() {
        ViewGroup viewGroup;
        if (LJIILJJIL() == null) {
            return;
        }
        if (this.LJFF && Intrinsics.LJFF(this.LJI, "livebackground") && this.LJ) {
            return;
        }
        try {
            C0UCL c0uclLJIILJJIL = LJIILJJIL();
            C786410Ut5.LJJJLZIJ(LJIILJJIL(), (ViewGroup) (c0uclLJIILJJIL != null ? c0uclLJIILJJIL.getParent() : null));
            if (Intrinsics.LJFF(this.LJI, "livebackground")) {
                this.LJ = false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        WeakReference<ViewGroup> weakReference = this.LJIIIIZZ;
        if (weakReference == null || (viewGroup = weakReference.get()) == null) {
            return;
        }
        C0UCL c0uclLJIILJJIL2 = LJIILJJIL();
        C19ME c19me = new C19ME(-1, (int) C497740JfY.LIZIZ(66.0f));
        c19me.bottomToBottom = viewGroup.getId();
        viewGroup.addView(c0uclLJIILJJIL2, c19me);
        if (Intrinsics.LJFF(this.LJI, "livebackground")) {
            this.LJ = true;
        }
    }

    @Override // X.InterfaceC768930UEh
    public final void onDestroy() {
        LJIIJJI();
        C0UCI c0uciLJIILIIL = LJIILIIL();
        if (c0uciLJIILIIL != null) {
            C500260Jjc.LJIILIIL(c0uciLJIILIIL);
            C0UCJ c0ucj = c0uciLJIILIIL.LLILLJJLI;
            c0ucj.LLILZ = null;
            c0ucj.LLILZIL = null;
        }
        C0UCL c0uclLJIILJJIL = LJIILJJIL();
        if (c0uclLJIILJJIL != null) {
            boolean zLJIL = C500260Jjc.LJIL();
            if (C500260Jjc.LJJIJLIJ()) {
                C0UA1.LIZ().yr(C473220Ih6.LLILZ);
            }
            c0uclLJIILJJIL.LLILZLL.getClass();
            if (zLJIL) {
                C473220Ih6.LLILZ = null;
            }
            c0uclLJIILJJIL.LLILZ.BJ0(c0uclLJIILJJIL.LLJILLL);
            c0uclLJIILJJIL.LLJI = null;
        }
    }

    public static final C0UCN LJIIL(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return C0UCN.NORMAL;
        }
        if (liveEffect.LJJJJLL()) {
            return C0UCN.GREEN_SCREEN;
        }
        if (!C767250U7v.LIZLLL(liveEffect) && !C767250U7v.LJ(liveEffect)) {
            if (C0U7C.LJIILLIIL(liveEffect)) {
                return C0UCN.AVATAR;
            }
            return C0UCN.NORMAL;
        }
        return C0UCN.ALBUM;
    }

    @Override // X.InterfaceC768930UEh
    public final void LIZIZ(String str) {
        this.LIZLLL = str;
    }

    @Override // X.InterfaceC768930UEh
    public final void LJ(String str) {
        this.LJFF = false;
        if (Intrinsics.LJFF(str, "livebackground")) {
            this.LJ = false;
        }
        C0UCL c0uclLJIILJJIL = LJIILJJIL();
        if (c0uclLJIILJJIL != null) {
            c0uclLJIILJJIL.LLILZ.BJ0(c0uclLJIILJJIL.LLJILLL);
        }
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
    @Override // X.InterfaceC768930UEh
    public final void LJFF(LiveEffect liveEffect) {
        C0UCW c0ucwLJIIJ;
        String str;
        List<LiveEffect> listQr;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C0UCU c0ucuLJIIJJI = LJIIJJI();
        LiveEffect liveEffect2 = null;
        ViewGroup viewGroup3 = null;
        liveEffect2 = null;
        if (c0ucuLJIIJJI != null) {
            c0ucwLJIIJ = c0ucuLJIIJJI.LJIIJ();
        } else {
            c0ucwLJIIJ = null;
        }
        C500260Jjc.LJIILIIL(c0ucwLJIIJ);
        WeakReference<ViewGroup> weakReference = this.LJIIIIZZ;
        if (weakReference != null && (viewGroup2 = weakReference.get()) != null) {
            C500260Jjc.LJIILIIL(viewGroup2);
        }
        C500260Jjc.LJIILIIL(LJIILIIL());
        C500260Jjc.LJIILIIL(LJIILJJIL());
        int i = C0UCO.LIZ[LJIIL(liveEffect).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LJIIJ();
                    if (liveEffect != null) {
                        WeakReference<ViewGroup> weakReference2 = this.LJIIIIZZ;
                        if (weakReference2 != null) {
                            viewGroup3 = weakReference2.get();
                        }
                        C500260Jjc.LLFFF(viewGroup3);
                        C500260Jjc.LLFFF(LJIILJJIL());
                    }
                    C0UCU c0ucuLJIIJJI2 = LJIIJJI();
                    if (c0ucuLJIIJJI2 != null) {
                        c0ucuLJIIJJI2.LIZJ();
                    }
                    C0UCI c0uciLJIILIIL = LJIILIIL();
                    if (c0uciLJIILIIL != null) {
                        c0uciLJIILIIL.LIZ();
                    }
                    C0UCL c0uclLJIILJJIL = LJIILJJIL();
                    if (c0uclLJIILJJIL != null) {
                        c0uclLJIILJJIL.LIZJ(liveEffect, true);
                        return;
                    }
                    return;
                }
                return;
            }
            LIZ();
            if (liveEffect != null) {
                WeakReference<ViewGroup> weakReference3 = this.LJIIIIZZ;
                if (weakReference3 != null) {
                    viewGroup = weakReference3.get();
                } else {
                    viewGroup = null;
                }
                C500260Jjc.LLFFF(viewGroup);
                C500260Jjc.LLFFF(LJIILIIL());
            }
            C0UCU c0ucuLJIIJJI3 = LJIIJJI();
            if (c0ucuLJIIJJI3 != null) {
                c0ucuLJIIJJI3.LIZJ();
            }
            C0UCL c0uclLJIILJJIL2 = LJIILJJIL();
            if (c0uclLJIILJJIL2 != null) {
                c0uclLJIILJJIL2.LLIZLLLIL = null;
                C473220Ih6 c473220Ih6 = c0uclLJIILJJIL2.LLILZLL;
                c473220Ih6.LLILLL = null;
                C0UCT c0uctLIZLLL = C0UF5.LIZLLL();
                if (c0uctLIZLLL != null) {
                    c0uctLIZLLL.LIZ = "";
                }
                c473220Ih6.LLLFZ("");
                C500260Jjc.LJIILIIL(c0uclLJIILJJIL2);
            }
            C0UCI c0uciLJIILIIL2 = LJIILIIL();
            if (c0uciLJIILIIL2 == null || !C767250U7v.LIZLLL(liveEffect) || liveEffect == null) {
                return;
            }
            String resourceId = liveEffect.getResourceId();
            LastUsedStickerCacheModel lastUsedStickerCacheModelLIZIZ = InterfaceC766480U4w.LJJJJIZL.LIZIZ();
            LastUsedStickerCacheModel lastUsedStickerCacheModel = lastUsedStickerCacheModelLIZIZ;
            if (!Intrinsics.LJFF(lastUsedStickerCacheModel.resourceId, resourceId) || lastUsedStickerCacheModel.stickerType != EnumC767810U9z.ALBUM) {
                lastUsedStickerCacheModelLIZIZ = null;
            }
            LastUsedStickerCacheModel lastUsedStickerCacheModel2 = lastUsedStickerCacheModelLIZIZ;
            if (lastUsedStickerCacheModel2 != null) {
                str = lastUsedStickerCacheModel2.subResourceId;
            } else {
                str = null;
                if (liveEffect == null) {
                    return;
                }
            }
            List<LiveEffect> listLL = liveEffect.LL();
            if (listLL == null) {
                return;
            }
            int i2 = 0;
            int i3 = 0;
            for (LiveEffect liveEffect3 : listLL) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    LiveEffect liveEffect4 = liveEffect3;
                    liveEffect4.LJZ(Integer.valueOf(i3));
                    liveEffect4.LJJLI(liveEffect.LJJIJL());
                    liveEffect4.LJLLI(liveEffect.LJZI());
                    liveEffect4.LJFF(liveEffect.getSearchId());
                    if (str != null && Intrinsics.LJFF(liveEffect4.getResourceId(), str)) {
                        i2 = i3;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C931050aKt.class, liveEffect);
            dataChannelGlobal.JQ2(C931060aKu.class, "1");
            C0UCJ c0ucj = c0uciLJIILIIL2.LLILLJJLI;
            ((ArrayList) c0ucj.LLILZLL).clear();
            ((ArrayList) c0ucj.LLILZLL).addAll(listLL);
            c0ucj.notifyDataSetChanged();
            C0UCJ c0ucj2 = c0uciLJIILIIL2.LLILLJJLI;
            LiveEffect liveEffect5 = (LiveEffect) ListProtector.get(c0ucj2.LLILZLL, i2);
            c0ucj2.LLLFZ(liveEffect5);
            String str2 = c0ucj2.LL;
            String str3 = C0UD4.LJ;
            if (Intrinsics.LJFF(str2, str3)) {
                LiveEffect liveEffect6 = (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(str3));
                InterfaceC769000UEo interfaceC769000UEo = c0ucj2.LLILLL;
                if (interfaceC769000UEo != null) {
                    interfaceC769000UEo.Gr(c0ucj2.LL, liveEffect6, liveEffect5);
                }
                c0ucj2.LLLI(liveEffect5);
                c0ucj2.LLILZ = liveEffect5;
                c0ucj2.notifyDataSetChanged();
            } else {
                InterfaceC769000UEo interfaceC769000UEo2 = c0ucj2.LLILLL;
                if (interfaceC769000UEo2 != null && (listQr = interfaceC769000UEo2.qr(C0UD4.LIZIZ)) != null) {
                    liveEffect2 = (LiveEffect) C13LP.LJJJLL(listQr);
                }
                InterfaceC769000UEo interfaceC769000UEo3 = c0ucj2.LLILLL;
                if (interfaceC769000UEo3 != null) {
                    interfaceC769000UEo3.Gr(c0ucj2.LL, liveEffect2, liveEffect5);
                }
                c0ucj2.LLLI(liveEffect5);
                c0ucj2.LLILZ = liveEffect5;
                c0ucj2.notifyDataSetChanged();
            }
            RecyclerView recyclerView = c0uciLJIILIIL2.LLILLL;
            if (recyclerView == null) {
                return;
            }
            recyclerView.scrollToPosition(i2);
            return;
        }
        C0UCI c0uciLJIILIIL3 = LJIILIIL();
        if (c0uciLJIILIIL3 != null) {
            c0uciLJIILIIL3.LIZ();
        }
        C0UCL c0uclLJIILJJIL3 = LJIILJJIL();
        if (c0uclLJIILJJIL3 != null) {
            c0uclLJIILJJIL3.LLIZLLLIL = null;
            C473220Ih6 c473220Ih62 = c0uclLJIILJJIL3.LLILZLL;
            c473220Ih62.LLILLL = null;
            C0UCT c0uctLIZLLL2 = C0UF5.LIZLLL();
            if (c0uctLIZLLL2 != null) {
                c0uctLIZLLL2.LIZ = "";
            }
            c473220Ih62.LLLFZ("");
            C500260Jjc.LJIILIIL(c0uclLJIILJJIL3);
        }
        C0UCU c0ucuLJIIJJI4 = LJIIJJI();
        if (c0ucuLJIIJJI4 == null) {
            return;
        }
        c0ucuLJIIJJI4.LJFF(liveEffect);
    }

    @Override // X.InterfaceC768930UEh
    public final void LJII(Function2<? super String, ? super String, Integer> function2) {
        this.LJIIIZ = function2;
    }

    @Override // X.InterfaceC768930UEh
    public final boolean LJIIIIZZ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        if (!liveEffect.LJJJJLL() && !C767250U7v.LIZLLL(liveEffect) && !C767250U7v.LJ(liveEffect) && !C0U7C.LJIILLIIL(liveEffect)) {
            return false;
        }
        return true;
    }

    public final void LJIILL(String str) {
        this.LJI = str;
        C0UCI c0uciLJIILIIL = LJIILIIL();
        if (c0uciLJIILIIL != null) {
            WeakReference<DataChannel> weakReference = this.LIZ;
            c0uciLJIILIIL.LL = str;
            C0UCJ c0ucj = c0uciLJIILIIL.LLILLJJLI;
            c0ucj.LL = str;
            c0ucj.LLILLJJLI = weakReference;
        }
        C0UCL c0uclLJIILJJIL = LJIILJJIL();
        if (c0uclLJIILJJIL != null) {
            WeakReference<DataChannel> weakReference2 = this.LIZ;
            Function2<? super String, ? super String, Integer> function2 = this.LJIIIZ;
            c0uclLJIILJJIL.LLILZIL = str;
            c0uclLJIILJJIL.LLILZLL.getClass();
            c0uclLJIILJJIL.LLIZ = weakReference2;
            c0uclLJIILJJIL.LLJI = function2;
        }
        String str2 = C0UD4.LJ;
        if (Intrinsics.LJFF(str, str2)) {
            this.LJII = this.LJII;
        } else {
            this.LJII = C767770U9v.LIZJ(this.LJI);
        }
        C0UCU c0ucuLJIIJJI = LJIIJJI();
        if (c0ucuLJIIJJI != null) {
            c0ucuLJIIJJI.LJIIJ();
        }
        C0UCI c0uciLJIILIIL2 = LJIILIIL();
        if (c0uciLJIILIIL2 != null) {
            LiveEffect liveEffect = this.LJII;
            if (!Intrinsics.LJFF(c0uciLJIILIIL2.LL, "livebackground")) {
                if (Intrinsics.LJFF(c0uciLJIILIIL2.LL, str2)) {
                    c0uciLJIILIIL2.LIZIZ(liveEffect);
                } else {
                    c0uciLJIILIIL2.LIZIZ((LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ)));
                }
            }
        }
        C0UCL c0uclLJIILJJIL2 = LJIILJJIL();
        if (c0uclLJIILJJIL2 != null) {
            LiveEffect liveEffect2 = this.LJII;
            C19EG c19egLJ = C500260Jjc.LJ(c0uclLJIILJJIL2.getContext());
            if (c19egLJ != null) {
                c0uclLJIILJJIL2.LLILZ.Aq1(c19egLJ, c0uclLJIILJJIL2.LLJILLL);
                c0uclLJIILJJIL2.LIZJ(liveEffect2, false);
            }
        }
        if (Intrinsics.LJFF(str, C0UD4.LIZIZ) && this.LIZLLL != null) {
            C0UCL c0uclLJIILJJIL3 = LJIILJJIL();
            if (c0uclLJIILJJIL3 != null) {
                String str3 = this.LIZLLL;
                LiveEffect liveEffect3 = this.LJII;
                c0uclLJIILJJIL3.LLILZLL.getClass();
                C473220Ih6.LLILZ = str3;
                c0uclLJIILJJIL3.LLILZLL.LLILLL = liveEffect3;
            }
            this.LIZLLL = null;
        }
    }

    @Override // X.InterfaceC768930UEh
    public final void LIZLLL(String str, ViewGroup viewGroup) {
        this.LJIIIIZZ = new WeakReference<>(viewGroup);
        C0UCU c0ucuLJIIJJI = LJIIJJI();
        if (c0ucuLJIIJJI != null) {
            c0ucuLJIIJJI.LIZJ = viewGroup;
        }
        LJIILL(str);
    }

    @Override // X.InterfaceC768930UEh
    public final void LJI(LiveEffect liveEffect, String str) {
        this.LJII = liveEffect;
        this.LJFF = true;
        LJIILL(str);
    }

    @Override // X.InterfaceC768930UEh
    public final void LJIIIZ(ViewGroup viewGroup, boolean z) {
        LiveEffect liveEffectLIZJ;
        this.LJIIIIZZ = new WeakReference<>(viewGroup);
        C0UCU c0ucuLJIIJJI = LJIIJJI();
        if (c0ucuLJIIJJI != null) {
            c0ucuLJIIJJI.LIZJ = viewGroup;
        }
        if (Intrinsics.LJFF(this.LJI, C0UD4.LJ)) {
            liveEffectLIZJ = this.LJII;
        } else {
            liveEffectLIZJ = C767770U9v.LIZJ(this.LJI);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("panel: ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", effect: ");
        sbLIZ.append(liveEffectLIZJ);
        sbLIZ.append(", isGoLive: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("EffectMonitor#guest-pallet", C2188811AlT.LIZIZ(sbLIZ));
        if (liveEffectLIZJ == null) {
            return;
        }
        if (Intrinsics.LJFF(liveEffectLIZJ.LLILL(), "favorite") && Intrinsics.LJFF(this.LJI, "livebackground")) {
            return;
        }
        int i = C0UCO.LIZ[LJIIL(liveEffectLIZJ).ordinal()];
        if (i != 1) {
            ViewGroup viewGroup2 = null;
            if (i != 2) {
                if (i == 3) {
                    LJIIJ();
                    WeakReference<ViewGroup> weakReference = this.LJIIIIZZ;
                    if (weakReference != null) {
                        viewGroup2 = weakReference.get();
                    }
                    C500260Jjc.LLFFF(viewGroup2);
                    C500260Jjc.LLFFF(LJIILJJIL());
                    return;
                }
                return;
            }
            LIZ();
            WeakReference<ViewGroup> weakReference2 = this.LJIIIIZZ;
            if (weakReference2 != null) {
                viewGroup2 = weakReference2.get();
            }
            C500260Jjc.LLFFF(viewGroup2);
            C500260Jjc.LLFFF(LJIILIIL());
            return;
        }
        C0UCU c0ucuLJIIJJI2 = LJIIJJI();
        if (c0ucuLJIIJJI2 == null) {
            return;
        }
        c0ucuLJIIJJI2.LJIIIZ(viewGroup, z);
    }

    public C0UCH(WeakReference weakReference, WeakReference weakReference2, C0UCY c0ucy) {
        Fragment fragment;
        Fragment fragment2;
        this.LIZ = weakReference;
        this.LIZIZ = weakReference2;
        this.LIZJ = c0ucy;
        DataChannel dataChannel = (DataChannel) weakReference.get();
        if (dataChannel != null) {
            if (weakReference2 != null) {
                fragment = (Fragment) weakReference2.get();
            } else {
                fragment = null;
            }
            dataChannel.EQ2(fragment, StickerPanelShowEvent.class, new AwS591S0100000_12(this, 60));
            if (weakReference2 != null) {
                fragment2 = (Fragment) weakReference2.get();
            } else {
                fragment2 = null;
            }
            dataChannel.EQ2(fragment2, StickerPanelHideEvent.class, new AwS591S0100000_12(this, 61));
            dataChannel.EQ2(weakReference2 != null ? (Fragment) weakReference2.get() : null, StickerShortcutPanelChannel.class, new AwS591S0100000_12(this, 62));
        }
    }
}
